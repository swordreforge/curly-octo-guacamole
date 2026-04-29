package com.google.common.reflect;

import com.google.common.base.AbstractC4265n;
import com.google.common.base.a9;
import com.google.common.base.d3;
import com.google.common.base.jk;
import com.google.common.base.oc;
import com.google.common.collect.AbstractC4308a;
import com.google.common.collect.ab;
import com.google.common.collect.g0ad;
import com.google.common.collect.gcp;
import com.google.common.collect.se;
import com.google.common.collect.vep5;
import com.google.common.collect.vy;
import com.google.common.collect.wt;
import com.google.common.collect.zkd;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: ClassPath.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class toq {

    /* JADX INFO: renamed from: n */
    private static final String f27353n = ".class";

    /* JADX INFO: renamed from: k */
    private final vep5<C4781q> f27355k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Logger f68607toq = Logger.getLogger(toq.class.getName());

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final a9<C8015toq> f68608zy = new C4779k();

    /* JADX INFO: renamed from: q */
    private static final d3 f27354q = d3.ld6(" ").f7l8();

    /* JADX INFO: renamed from: com.google.common.reflect.toq$k */
    /* JADX INFO: compiled from: ClassPath.java */
    static class C4779k implements a9<C8015toq> {
        C4779k() {
        }

        @Override // com.google.common.base.a9
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean apply(C8015toq c8015toq) {
            return c8015toq.f68610zy.indexOf(36) == -1;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.toq$n */
    /* JADX INFO: compiled from: ClassPath.java */
    static abstract class AbstractC4780n {

        /* JADX INFO: renamed from: k */
        private final Set<File> f27356k = g0ad.fn3e();

        AbstractC4780n() {
        }

        /* JADX INFO: renamed from: k */
        private static se<URL> m16831k(ClassLoader classLoader) {
            return classLoader instanceof URLClassLoader ? se.copyOf(((URLClassLoader) classLoader).getURLs()) : classLoader.equals(ClassLoader.getSystemClassLoader()) ? m16832n() : se.of();
        }

        @InterfaceC7732q
        /* JADX INFO: renamed from: n */
        static se<URL> m16832n() {
            se.C4520k c4520kBuilder = se.builder();
            for (String str : d3.ld6(oc.PATH_SEPARATOR.value()).n7h(oc.JAVA_CLASS_PATH.value())) {
                try {
                    try {
                        c4520kBuilder.mo15569k(new File(str).toURI().toURL());
                    } catch (SecurityException unused) {
                        c4520kBuilder.mo15569k(new URL("file", (String) null, new File(str).getAbsolutePath()));
                    }
                } catch (MalformedURLException e2) {
                    toq.f68607toq.log(Level.WARNING, "malformed classpath entry: " + str, (Throwable) e2);
                }
            }
            return c4520kBuilder.mo15570n();
        }

        /* JADX INFO: renamed from: p */
        private void m16833p(File file, ClassLoader classLoader) throws IOException {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    ab<File> it = m16834q(file, jarFile.getManifest()).iterator();
                    while (it.hasNext()) {
                        m16836g(it.next(), classLoader);
                    }
                    ld6(classLoader, jarFile);
                } finally {
                    try {
                        jarFile.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException unused2) {
            }
        }

        @InterfaceC7732q
        /* JADX INFO: renamed from: q */
        static vep5<File> m16834q(File file, @NullableDecl Manifest manifest) {
            if (manifest == null) {
                return vep5.of();
            }
            vep5.C4532k c4532kBuilder = vep5.builder();
            String value = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH.toString());
            if (value != null) {
                for (String str : toq.f27354q.n7h(value)) {
                    try {
                        URL urlZy = zy(file, str);
                        if (urlZy.getProtocol().equals("file")) {
                            c4532kBuilder.f7l8(toq.m16825p(urlZy));
                        }
                    } catch (MalformedURLException unused) {
                        toq.f68607toq.warning("Invalid Class-Path entry: " + str);
                    }
                }
            }
            return c4532kBuilder.mo15570n();
        }

        /* JADX INFO: renamed from: s */
        private void m16835s(File file, ClassLoader classLoader) throws IOException {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        mo16837y(classLoader, file);
                    } else {
                        m16833p(file, classLoader);
                    }
                }
            } catch (SecurityException e2) {
                toq.f68607toq.warning("Cannot access " + file + ": " + e2);
            }
        }

        @InterfaceC7732q
        static zkd<File, ClassLoader> toq(ClassLoader classLoader) {
            LinkedHashMap linkedHashMapM16017j = vy.m16017j();
            ClassLoader parent = classLoader.getParent();
            if (parent != null) {
                linkedHashMapM16017j.putAll(toq(parent));
            }
            ab<URL> it = m16831k(classLoader).iterator();
            while (it.hasNext()) {
                URL next = it.next();
                if (next.getProtocol().equals("file")) {
                    File fileM16825p = toq.m16825p(next);
                    if (!linkedHashMapM16017j.containsKey(fileM16825p)) {
                        linkedHashMapM16017j.put(fileM16825p, classLoader);
                    }
                }
            }
            return zkd.copyOf((Map) linkedHashMapM16017j);
        }

        @InterfaceC7732q
        static URL zy(File file, String str) throws MalformedURLException {
            return new URL(file.toURI().toURL(), str);
        }

        public final void f7l8(ClassLoader classLoader) throws IOException {
            ab<Map.Entry<File, ClassLoader>> it = toq(classLoader).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<File, ClassLoader> next = it.next();
                m16836g(next.getKey(), next.getValue());
            }
        }

        @InterfaceC7732q
        /* JADX INFO: renamed from: g */
        final void m16836g(File file, ClassLoader classLoader) throws IOException {
            if (this.f27356k.add(file.getCanonicalFile())) {
                m16835s(file, classLoader);
            }
        }

        protected abstract void ld6(ClassLoader classLoader, JarFile jarFile) throws IOException;

        /* JADX INFO: renamed from: y */
        protected abstract void mo16837y(ClassLoader classLoader, File file) throws IOException;
    }

    /* JADX INFO: renamed from: com.google.common.reflect.toq$q */
    /* JADX INFO: compiled from: ClassPath.java */
    @InterfaceC7731k
    public static class C4781q {

        /* JADX INFO: renamed from: k */
        private final String f27357k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final ClassLoader f68609toq;

        C4781q(String str, ClassLoader classLoader) {
            this.f27357k = (String) jk.a9(str);
            this.f68609toq = (ClassLoader) jk.a9(classLoader);
        }

        /* JADX INFO: renamed from: q */
        static C4781q m16838q(String str, ClassLoader classLoader) {
            return str.endsWith(toq.f27353n) ? new C8015toq(str, classLoader) : new C4781q(str, classLoader);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4781q)) {
                return false;
            }
            C4781q c4781q = (C4781q) obj;
            return this.f27357k.equals(c4781q.f27357k) && this.f68609toq == c4781q.f68609toq;
        }

        public int hashCode() {
            return this.f27357k.hashCode();
        }

        /* JADX INFO: renamed from: k */
        public final com.google.common.io.f7l8 m16839k() {
            return com.google.common.io.jk.m16403k(m16840n());
        }

        /* JADX INFO: renamed from: n */
        public final URL m16840n() {
            URL resource = this.f68609toq.getResource(this.f27357k);
            if (resource != null) {
                return resource;
            }
            throw new NoSuchElementException(this.f27357k);
        }

        public String toString() {
            return this.f27357k;
        }

        public final com.google.common.io.ld6 toq(Charset charset) {
            return com.google.common.io.jk.toq(m16840n(), charset);
        }

        public final String zy() {
            return this.f27357k;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClassPath.java */
    @InterfaceC7731k
    public static final class C8015toq extends C4781q {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final String f68610zy;

        C8015toq(String str, ClassLoader classLoader) {
            super(str, classLoader);
            this.f68610zy = toq.m16824n(str);
        }

        public String f7l8() {
            return this.f68610zy;
        }

        /* JADX INFO: renamed from: p */
        public Class<?> m16842p() {
            try {
                return this.f68609toq.loadClass(this.f68610zy);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException(e2);
            }
        }

        /* JADX INFO: renamed from: s */
        public String m16843s() {
            int iLastIndexOf = this.f68610zy.lastIndexOf(36);
            if (iLastIndexOf != -1) {
                return AbstractC4265n.m15419p().mo15422c(this.f68610zy.substring(iLastIndexOf + 1));
            }
            String strM16844y = m16844y();
            return strM16844y.isEmpty() ? this.f68610zy : this.f68610zy.substring(strM16844y.length() + 1);
        }

        @Override // com.google.common.reflect.toq.C4781q
        public String toString() {
            return this.f68610zy;
        }

        /* JADX INFO: renamed from: y */
        public String m16844y() {
            return C4782y.toq(this.f68610zy);
        }
    }

    /* JADX INFO: compiled from: ClassPath.java */
    @InterfaceC7732q
    static final class zy extends AbstractC4780n {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final wt<ClassLoader, String> f68611toq = gcp.m15722q().f7l8().mo15725k();

        zy() {
        }

        private void qrj(File file, ClassLoader classLoader, String str, Set<File> set) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                toq.f68607toq.warning("Cannot read directory " + file);
                return;
            }
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                if (file2.isDirectory()) {
                    File canonicalFile = file2.getCanonicalFile();
                    if (set.add(canonicalFile)) {
                        qrj(canonicalFile, classLoader, str + name + "/", set);
                        set.remove(canonicalFile);
                    }
                } else {
                    String str2 = str + name;
                    if (!str2.equals("META-INF/MANIFEST.MF")) {
                        this.f68611toq.get(classLoader).add(str2);
                    }
                }
            }
        }

        @Override // com.google.common.reflect.toq.AbstractC4780n
        protected void ld6(ClassLoader classLoader, JarFile jarFile) {
            Enumeration<JarEntry> enumerationEntries = jarFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                if (!jarEntryNextElement.isDirectory() && !jarEntryNextElement.getName().equals("META-INF/MANIFEST.MF")) {
                    this.f68611toq.get(classLoader).add(jarEntryNextElement.getName());
                }
            }
        }

        vep5<C4781q> x2() {
            vep5.C4532k c4532kBuilder = vep5.builder();
            for (Map.Entry<ClassLoader, String> entry : this.f68611toq.entries()) {
                c4532kBuilder.f7l8(C4781q.m16838q(entry.getValue(), entry.getKey()));
            }
            return c4532kBuilder.mo15570n();
        }

        @Override // com.google.common.reflect.toq.AbstractC4780n
        /* JADX INFO: renamed from: y */
        protected void mo16837y(ClassLoader classLoader, File file) throws IOException {
            HashSet hashSet = new HashSet();
            hashSet.add(file.getCanonicalFile());
            qrj(file, classLoader, "", hashSet);
        }
    }

    private toq(vep5<C4781q> vep5Var) {
        this.f27355k = vep5Var;
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: n */
    static String m16824n(String str) {
        return str.substring(0, str.length() - 6).replace('/', '.');
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: p */
    static File m16825p(URL url) {
        jk.m15383q(url.getProtocol().equals("file"));
        try {
            return new File(url.toURI());
        } catch (URISyntaxException unused) {
            return new File(url.getPath());
        }
    }

    public static toq zy(ClassLoader classLoader) throws IOException {
        zy zyVar = new zy();
        zyVar.f7l8(classLoader);
        return new toq(zyVar.x2());
    }

    public vep5<C8015toq> f7l8() {
        return AbstractC4308a.t8r(this.f27355k).kja0(C8015toq.class).n7h(f68608zy).jp0y();
    }

    /* JADX INFO: renamed from: g */
    public vep5<C4781q> m16826g() {
        return this.f27355k;
    }

    /* JADX INFO: renamed from: q */
    public vep5<C8015toq> m16827q() {
        return AbstractC4308a.t8r(this.f27355k).kja0(C8015toq.class).jp0y();
    }

    /* JADX INFO: renamed from: s */
    public vep5<C8015toq> m16828s(String str) {
        jk.a9(str);
        String str2 = str + '.';
        vep5.C4532k c4532kBuilder = vep5.builder();
        ab<C8015toq> it = f7l8().iterator();
        while (it.hasNext()) {
            C8015toq next = it.next();
            if (next.f7l8().startsWith(str2)) {
                c4532kBuilder.f7l8(next);
            }
        }
        return c4532kBuilder.mo15570n();
    }

    /* JADX INFO: renamed from: y */
    public vep5<C8015toq> m16829y(String str) {
        jk.a9(str);
        vep5.C4532k c4532kBuilder = vep5.builder();
        ab<C8015toq> it = f7l8().iterator();
        while (it.hasNext()) {
            C8015toq next = it.next();
            if (next.m16844y().equals(str)) {
                c4532kBuilder.f7l8(next);
            }
        }
        return c4532kBuilder.mo15570n();
    }
}

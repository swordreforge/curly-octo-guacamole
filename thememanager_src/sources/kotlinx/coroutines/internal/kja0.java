package kotlinx.coroutines.internal;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.C6231h;
import kotlin.collections.C6163t;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J!\u0010\u0007\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0082\bJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J3\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J.\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0014*\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u0016H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010!¨\u0006%"}, d2 = {"Lkotlinx/coroutines/internal/kja0;", "", "Ljava/lang/Class;", "Lkotlinx/coroutines/internal/jk;", "baseClass", "", "serviceClass", "k", "S", androidx.core.app.x9kr.f50157ikck, "Ljava/lang/ClassLoader;", "loader", "", "zy", "name", "toq", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", C7704k.y.toq.f95579toq, "R", "Ljava/util/jar/JarFile;", "Lkotlin/Function1;", "block", AnimatedProperty.PROPERTY_NAME_Y, "(Ljava/util/jar/JarFile;Lcyoe/x2;)Ljava/lang/Object;", "Ljava/io/BufferedReader;", "r", "f7l8", "q", "()Ljava/util/List;", "n", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/lang/String;", "PREFIX", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class kja0 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final kja0 f37223k = new kja0();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f82017toq = "META-INF/services/";

    private kja0() {
    }

    private final List<String> f7l8(BufferedReader bufferedReader) throws IOException {
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return kotlin.collections.a9.wr(linkedHashSet);
            }
            String string = kotlin.text.fti.l92(kotlin.text.fti.ma8k(line, "#", null, 2, null)).toString();
            int i2 = 0;
            while (true) {
                if (i2 >= string.length()) {
                    z2 = true;
                    break;
                }
                char cCharAt = string.charAt(i2);
                i2++;
                if (!(cCharAt == '.' || Character.isJavaIdentifierPart(cCharAt))) {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                throw new IllegalArgumentException(kotlin.jvm.internal.d2ok.mcp("Illegal service provider class name: ", string).toString());
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private final List<String> m24358g(URL url) {
        BufferedReader bufferedReader;
        String string = url.toString();
        if (!kotlin.text.a9.r6ty(string, "jar", false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> listF7l8 = f37223k.f7l8(bufferedReader);
                kotlin.io.zy.m23032k(bufferedReader, null);
                return listF7l8;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        String strA7zh = kotlin.text.fti.a7zh(kotlin.text.fti.jre(string, "jar:file:", null, 2, null), '!', null, 2, null);
        String strJre = kotlin.text.fti.jre(string, "!/", null, 2, null);
        JarFile jarFile = new JarFile(strA7zh, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strJre)), "UTF-8"));
            try {
                List<String> listF7l82 = f37223k.f7l8(bufferedReader);
                kotlin.io.zy.m23032k(bufferedReader, null);
                jarFile.close();
                return listF7l82;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    C6231h.m22845k(th2, th4);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private final jk m24359k(Class<jk> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S toq(String str, ClassLoader classLoader, Class<S> cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* JADX INFO: renamed from: y */
    private final <R> R m24360y(JarFile jarFile, cyoe.x2<? super JarFile, ? extends R> x2Var) {
        try {
            R rInvoke = x2Var.invoke(jarFile);
            kotlin.jvm.internal.d3.m23090q(1);
            jarFile.close();
            kotlin.jvm.internal.d3.zy(1);
            return rInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.d3.m23090q(1);
                try {
                    jarFile.close();
                    kotlin.jvm.internal.d3.zy(1);
                    throw th2;
                } catch (Throwable th3) {
                    C6231h.m22845k(th, th3);
                    throw th;
                }
            }
        }
    }

    private final <S> List<S> zy(Class<S> cls, ClassLoader classLoader) {
        try {
            return m24361n(cls, classLoader);
        } catch (Throwable unused) {
            return kotlin.collections.a9.wr(ServiceLoader.load(cls, classLoader));
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final <S> List<S> m24361n(@InterfaceC7396q Class<S> cls, @InterfaceC7396q ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources(kotlin.jvm.internal.d2ok.mcp(f82017toq, cls.getName())));
        kotlin.jvm.internal.d2ok.kja0(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6163t.zp(arrayList, f37223k.m24358g((URL) it.next()));
        }
        Set setYvs = kotlin.collections.a9.yvs(arrayList);
        if (!(!setYvs.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.fu4.vyq(setYvs, 10));
        Iterator it2 = setYvs.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f37223k.toq((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final List<jk> m24362q() {
        jk jkVar;
        if (!C6674h.m24346k()) {
            return zy(jk.class, jk.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            jk jkVar2 = null;
            try {
                jkVar = (jk) jk.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, jk.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                jkVar = null;
            }
            if (jkVar != null) {
                arrayList.add(jkVar);
            }
            try {
                jkVar2 = (jk) jk.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, jk.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (jkVar2 == null) {
                return arrayList;
            }
            arrayList.add(jkVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return zy(jk.class, jk.class.getClassLoader());
        }
    }
}

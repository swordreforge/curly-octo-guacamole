package okio.internal;

import cyoe.InterfaceC5981k;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C6227f;
import kotlin.collections.C6163t;
import kotlin.collections.fu4;
import kotlin.jk;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.nmn5;
import kotlin.text.a9;
import kotlin.text.fti;
import miuix.miuixbasewidget.widget.AlphabetIndexer;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.AbstractC7549i;
import okio.fn3e;
import okio.ncyb;
import okio.nn86;
import okio.vyq;
import okio.zurt;

/* JADX INFO: renamed from: okio.internal.p */
/* JADX INFO: compiled from: ResourceFileSystem.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n766#2:211\n857#2,2:212\n1549#2:214\n1620#2,3:215\n766#2:218\n857#2,2:219\n1549#2:221\n1620#2,3:222\n1603#2,9:225\n1855#2:234\n1856#2:236\n1612#2:237\n1603#2,9:238\n1855#2:247\n1856#2:249\n1612#2:250\n1#3:235\n1#3:248\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n*L\n74#1:211\n74#1:212,2\n75#1:214\n75#1:215,3\n90#1:218\n90#1:219,2\n91#1:221\n91#1:222,3\n173#1:225,9\n173#1:234\n173#1:236\n173#1:237\n174#1:238,9\n174#1:247\n174#1:249\n174#1:250\n173#1:235\n174#1:248\n*E\n"})
public final class C7553p extends zurt {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private final jk f94278f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final zurt f43753g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final ClassLoader f43754n;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private static final k f43752y = new k(null);

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final ncyb f43751s = ncyb.C7569k.m27824y(ncyb.f43814q, "/", false, 1, null);

    /* JADX INFO: renamed from: okio.internal.p$k */
    /* JADX INFO: compiled from: ResourceFileSystem.kt */
    private static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean zy(ncyb ncybVar) {
            return !a9.wlev(ncybVar.cdj(), ".class", true);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final ncyb m27716q(@InterfaceC7396q ncyb ncybVar, @InterfaceC7396q ncyb base) {
            d2ok.m23075h(ncybVar, "<this>");
            d2ok.m23075h(base, "base");
            return toq().ni7(a9.nnh(fti.jyr(ncybVar.toString(), base.toString()), '\\', '/', false, 4, null));
        }

        @InterfaceC7396q
        public final ncyb toq() {
            return C7553p.f43751s;
        }
    }

    /* JADX INFO: renamed from: okio.internal.p$toq */
    /* JADX INFO: compiled from: ResourceFileSystem.kt */
    static final class toq extends AbstractC6308r implements InterfaceC5981k<List<? extends C6227f<? extends zurt, ? extends ncyb>>> {
        toq() {
            super(0);
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final List<? extends C6227f<? extends zurt, ? extends ncyb>> invoke() {
            C7553p c7553p = C7553p.this;
            return c7553p.hyr(c7553p.f43754n);
        }
    }

    /* JADX INFO: renamed from: okio.internal.p$zy */
    /* JADX INFO: compiled from: ResourceFileSystem.kt */
    static final class zy extends AbstractC6308r implements cyoe.x2<ld6, Boolean> {
        public static final zy INSTANCE = new zy();

        zy() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(@InterfaceC7396q ld6 entry) {
            d2ok.m23075h(entry, "entry");
            return Boolean.valueOf(C7553p.f43752y.zy(entry.m27695k()));
        }
    }

    public /* synthetic */ C7553p(ClassLoader classLoader, boolean z2, zurt zurtVar, int i2, ni7 ni7Var) {
        this(classLoader, z2, (i2 & 4) != 0 ? zurt.f94308toq : zurtVar);
    }

    /* JADX INFO: renamed from: c */
    private final C6227f<zurt, ncyb> m27711c(URL url) {
        int iZ8;
        String string = url.toString();
        d2ok.kja0(string, "toString(...)");
        if (!a9.r6ty(string, "jar:file:", false, 2, null) || (iZ8 = fti.z8(string, AlphabetIndexer.ad, 0, false, 6, null)) == -1) {
            return null;
        }
        ncyb.C7569k c7569k = ncyb.f43814q;
        String strSubstring = string.substring(4, iZ8);
        d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return nmn5.m23230k(x2.m27746q(ncyb.C7569k.f7l8(c7569k, new File(URI.create(strSubstring)), false, 1, null), this.f43753g, zy.INSTANCE), f43751s);
    }

    /* JADX INFO: renamed from: f */
    private final C6227f<zurt, ncyb> m27712f(URL url) {
        if (d2ok.f7l8(url.getProtocol(), "file")) {
            return nmn5.m23230k(this.f43753g, ncyb.C7569k.f7l8(ncyb.f43814q, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<C6227f<zurt, ncyb>> hyr(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        d2ok.kja0(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        d2ok.kja0(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            d2ok.qrj(url);
            C6227f<zurt, ncyb> c6227fM27712f = m27712f(url);
            if (c6227fM27712f != null) {
                arrayList.add(c6227fM27712f);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        d2ok.kja0(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        d2ok.kja0(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            d2ok.qrj(url2);
            C6227f<zurt, ncyb> c6227fM27711c = m27711c(url2);
            if (c6227fM27711c != null) {
                arrayList2.add(c6227fM27711c);
            }
        }
        return kotlin.collections.a9.l7o(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: l */
    private final ncyb m27713l(ncyb ncybVar) {
        return f43751s.m27821t(ncybVar, true);
    }

    private final String lrht(ncyb ncybVar) {
        return m27713l(ncybVar).zurt(f43751s).toString();
    }

    private final List<C6227f<zurt, ncyb>> n5r1() {
        return (List) this.f94278f7l8.getValue();
    }

    @Override // okio.zurt
    @InterfaceC7395n
    public fn3e a9(@InterfaceC7396q ncyb path) throws IOException {
        d2ok.m23075h(path, "path");
        if (!f43752y.zy(path)) {
            return null;
        }
        String strLrht = lrht(path);
        for (C6227f<zurt, ncyb> c6227f : n5r1()) {
            fn3e fn3eVarA9 = c6227f.component1().a9(c6227f.component2().ni7(strLrht));
            if (fn3eVarA9 != null) {
                return fn3eVarA9;
            }
        }
        return null;
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public vyq eqxt(@InterfaceC7396q ncyb file, boolean z2) throws IOException {
        d2ok.m23075h(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.zurt
    public void f7l8(@InterfaceC7396q ncyb source, @InterfaceC7396q ncyb target) throws IOException {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public AbstractC7549i fti(@InterfaceC7396q ncyb file) throws FileNotFoundException {
        d2ok.m23075h(file, "file");
        if (!f43752y.zy(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strLrht = lrht(file);
        for (C6227f<zurt, ncyb> c6227f : n5r1()) {
            try {
                return c6227f.component1().fti(c6227f.component2().ni7(strLrht));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public AbstractC7549i gvn7(@InterfaceC7396q ncyb file, boolean z2, boolean z3) throws IOException {
        d2ok.m23075h(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // okio.zurt
    /* JADX INFO: renamed from: h */
    public void mo27608h(@InterfaceC7396q ncyb source, @InterfaceC7396q ncyb target) throws IOException {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.zurt
    public void ki(@InterfaceC7396q ncyb path, boolean z2) throws IOException {
        d2ok.m23075h(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public nn86 lvui(@InterfaceC7396q ncyb file) throws FileNotFoundException {
        nn86 nn86VarFn3e;
        d2ok.m23075h(file, "file");
        if (!f43752y.zy(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        ncyb ncybVar = f43751s;
        InputStream resourceAsStream = this.f43754n.getResourceAsStream(ncyb.a9(ncybVar, file, false, 2, null).zurt(ncybVar).toString());
        if (resourceAsStream != null && (nn86VarFn3e = okio.d2ok.fn3e(resourceAsStream)) != null) {
            return nn86VarFn3e;
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public vyq mo27625n(@InterfaceC7396q ncyb file, boolean z2) throws IOException {
        d2ok.m23075h(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.zurt
    public void n7h(@InterfaceC7396q ncyb dir, boolean z2) throws IOException {
        d2ok.m23075h(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.zurt
    @InterfaceC7395n
    public List<ncyb> o1t(@InterfaceC7396q ncyb dir) {
        d2ok.m23075h(dir, "dir");
        String strLrht = lrht(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<C6227f<zurt, ncyb>> it = n5r1().iterator();
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            C6227f<zurt, ncyb> next = it.next();
            zurt zurtVarComponent1 = next.component1();
            ncyb ncybVarComponent2 = next.component2();
            List<ncyb> listO1t = zurtVarComponent1.o1t(ncybVarComponent2.ni7(strLrht));
            if (listO1t != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listO1t) {
                    if (f43752y.zy((ncyb) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(fu4.vyq(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(f43752y.m27716q((ncyb) it2.next(), ncybVarComponent2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                C6163t.zp(linkedHashSet, arrayList);
                z2 = true;
            }
        }
        if (z2) {
            return kotlin.collections.a9.wr(linkedHashSet);
        }
        return null;
    }

    @Override // okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public ncyb mo27626y(@InterfaceC7396q ncyb path) {
        d2ok.m23075h(path, "path");
        return m27713l(path);
    }

    @Override // okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public List<ncyb> mo27627z(@InterfaceC7396q ncyb dir) throws FileNotFoundException {
        d2ok.m23075h(dir, "dir");
        String strLrht = lrht(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z2 = false;
        for (C6227f<zurt, ncyb> c6227f : n5r1()) {
            zurt zurtVarComponent1 = c6227f.component1();
            ncyb ncybVarComponent2 = c6227f.component2();
            try {
                List<ncyb> listMo27627z = zurtVarComponent1.mo27627z(ncybVarComponent2.ni7(strLrht));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listMo27627z) {
                    if (f43752y.zy((ncyb) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(fu4.vyq(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f43752y.m27716q((ncyb) it.next(), ncybVarComponent2));
                }
                C6163t.zp(linkedHashSet, arrayList2);
                z2 = true;
            } catch (IOException unused) {
            }
        }
        if (z2) {
            return kotlin.collections.a9.wr(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    public C7553p(@InterfaceC7396q ClassLoader classLoader, boolean z2, @InterfaceC7396q zurt systemFileSystem) {
        d2ok.m23075h(classLoader, "classLoader");
        d2ok.m23075h(systemFileSystem, "systemFileSystem");
        this.f43754n = classLoader;
        this.f43753g = systemFileSystem;
        this.f94278f7l8 = kotlin.fti.m22825k(new toq());
        if (z2) {
            n5r1().size();
        }
    }
}

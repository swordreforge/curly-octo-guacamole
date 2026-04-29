package okio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.List;
import kotlin.C6231h;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6765n;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.internal.C7553p;
import okio.ncyb;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,165:1\n52#2,21:166\n52#2,21:187\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n67#1:166,21\n81#1:187,21\n*E\n"})
public abstract class zurt {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C7580k f43860k = new C7580k(null);

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final zurt f43861q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final zurt f94308toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final ncyb f94309zy;

    /* JADX INFO: renamed from: okio.zurt$k */
    /* JADX INFO: compiled from: FileSystem.kt */
    public static final class C7580k {
        private C7580k() {
        }

        public /* synthetic */ C7580k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @InterfaceC6769y(name = "get")
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final zurt m27886k(@InterfaceC7396q FileSystem fileSystem) {
            kotlin.jvm.internal.d2ok.m23075h(fileSystem, "<this>");
            return new oc(fileSystem);
        }
    }

    static {
        zurt gvn7Var;
        try {
            Class.forName("java.nio.file.Files");
            gvn7Var = new eqxt();
        } catch (ClassNotFoundException unused) {
            gvn7Var = new gvn7();
        }
        f94308toq = gvn7Var;
        ncyb.C7569k c7569k = ncyb.f43814q;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.d2ok.kja0(property, "getProperty(...)");
        f94309zy = ncyb.C7569k.m27824y(c7569k, property, false, 1, null);
        ClassLoader classLoader = C7553p.class.getClassLoader();
        kotlin.jvm.internal.d2ok.kja0(classLoader, "getClassLoader(...)");
        f43861q = new C7553p(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ vyq d2ok(zurt zurtVar, ncyb ncybVar, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return zurtVar.eqxt(ncybVar, z2);
    }

    public static /* synthetic */ AbstractC7549i d3(zurt zurtVar, ncyb ncybVar, boolean z2, boolean z3, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        return zurtVar.gvn7(ncybVar, z2, z3);
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "get")
    @l05.qrj
    public static final zurt fu4(@InterfaceC7396q FileSystem fileSystem) {
        return f43860k.m27886k(fileSystem);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ vyq m27880g(zurt zurtVar, ncyb ncybVar, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return zurtVar.mo27625n(ncybVar, z2);
    }

    public static /* synthetic */ void kja0(zurt zurtVar, ncyb ncybVar, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        zurtVar.n7h(ncybVar, z2);
    }

    public static /* synthetic */ kotlin.sequences.qrj mcp(zurt zurtVar, ncyb ncybVar, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return zurtVar.mo27830t(ncybVar, z2);
    }

    public static /* synthetic */ void t8r(zurt zurtVar, ncyb ncybVar, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        zurtVar.ki(ncybVar, z2);
    }

    public static /* synthetic */ void x2(zurt zurtVar, ncyb ncybVar, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        zurtVar.ld6(ncybVar, z2);
    }

    public static /* synthetic */ void zurt(zurt zurtVar, ncyb ncybVar, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        zurtVar.fn3e(ncybVar, z2);
    }

    public static /* synthetic */ Object zy(zurt zurtVar, ncyb file, boolean z2, cyoe.x2 writerAction, int i2, Object obj) throws Throwable {
        Object objInvoke;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        kotlin.jvm.internal.d2ok.m23075h(writerAction, "writerAction");
        qrj qrjVarM27594q = d2ok.m27594q(zurtVar.eqxt(file, z2));
        Throwable th = null;
        try {
            objInvoke = writerAction.invoke(qrjVarM27594q);
            kotlin.jvm.internal.d3.m23090q(1);
            if (qrjVarM27594q != null) {
                try {
                    qrjVarM27594q.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.d3.zy(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.d3.m23090q(1);
            if (qrjVarM27594q != null) {
                try {
                    qrjVarM27594q.close();
                } catch (Throwable th4) {
                    C6231h.m22845k(th3, th4);
                }
            }
            kotlin.jvm.internal.d3.zy(1);
            objInvoke = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.d2ok.qrj(objInvoke);
        return objInvoke;
    }

    @InterfaceC7395n
    public abstract fn3e a9(@InterfaceC7396q ncyb ncybVar) throws IOException;

    public final void cdj(@InterfaceC7396q ncyb path) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        ki(path, false);
    }

    @InterfaceC7396q
    public abstract vyq eqxt(@InterfaceC7396q ncyb ncybVar, boolean z2) throws IOException;

    public abstract void f7l8(@InterfaceC7396q ncyb ncybVar, @InterfaceC7396q ncyb ncybVar2) throws IOException;

    public void fn3e(@InterfaceC7396q ncyb fileOrDirectory, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(fileOrDirectory, "fileOrDirectory");
        okio.internal.zy.m27753q(this, fileOrDirectory, z2);
    }

    @InterfaceC7396q
    public abstract AbstractC7549i fti(@InterfaceC7396q ncyb ncybVar) throws IOException;

    @InterfaceC7396q
    public abstract AbstractC7549i gvn7(@InterfaceC7396q ncyb ncybVar, boolean z2, boolean z3) throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo27608h(@InterfaceC7396q ncyb ncybVar, @InterfaceC7396q ncyb ncybVar2) throws IOException;

    /* JADX INFO: renamed from: i */
    public final void m27881i(@InterfaceC7396q ncyb fileOrDirectory) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(fileOrDirectory, "fileOrDirectory");
        fn3e(fileOrDirectory, false);
    }

    @InterfaceC7396q
    public final fn3e jk(@InterfaceC7396q ncyb path) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        return okio.internal.zy.f7l8(this, path);
    }

    @InterfaceC7396q
    public final AbstractC7549i jp0y(@InterfaceC7396q ncyb file) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        return gvn7(file, false, false);
    }

    @InterfaceC6769y(name = "-read")
    /* JADX INFO: renamed from: k */
    public final <T> T m27882k(@InterfaceC7396q ncyb file, @InterfaceC7396q cyoe.x2<? super n7h, ? extends T> readerAction) throws Throwable {
        T tInvoke;
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        kotlin.jvm.internal.d2ok.m23075h(readerAction, "readerAction");
        n7h n7hVarM27592n = d2ok.m27592n(lvui(file));
        Throwable th = null;
        try {
            tInvoke = readerAction.invoke(n7hVarM27592n);
            kotlin.jvm.internal.d3.m23090q(1);
            if (n7hVarM27592n != null) {
                try {
                    n7hVarM27592n.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.d3.zy(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.d3.m23090q(1);
            if (n7hVarM27592n != null) {
                try {
                    n7hVarM27592n.close();
                } catch (Throwable th4) {
                    C6231h.m22845k(th3, th4);
                }
            }
            kotlin.jvm.internal.d3.zy(1);
            th = th3;
            tInvoke = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.d2ok.qrj(tInvoke);
        return tInvoke;
    }

    public abstract void ki(@InterfaceC7396q ncyb ncybVar, boolean z2) throws IOException;

    public final void ld6(@InterfaceC7396q ncyb dir, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        okio.internal.zy.zy(this, dir, z2);
    }

    @InterfaceC7396q
    public abstract nn86 lvui(@InterfaceC7396q ncyb ncybVar) throws IOException;

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public abstract vyq mo27625n(@InterfaceC7396q ncyb ncybVar, boolean z2) throws IOException;

    public abstract void n7h(@InterfaceC7396q ncyb ncybVar, boolean z2) throws IOException;

    public final boolean ni7(@InterfaceC7396q ncyb path) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        return okio.internal.zy.m27752n(this, path);
    }

    @InterfaceC7395n
    public abstract List<ncyb> o1t(@InterfaceC7396q ncyb ncybVar);

    @InterfaceC7396q
    public final vyq oc(@InterfaceC7396q ncyb file) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        return eqxt(file, false);
    }

    /* JADX INFO: renamed from: p */
    public final void m27883p(@InterfaceC7396q ncyb dir) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        ld6(dir, false);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final vyq m27884q(@InterfaceC7396q ncyb file) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        return mo27625n(file, false);
    }

    public final void qrj(@InterfaceC7396q ncyb dir) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        n7h(dir, false);
    }

    /* JADX INFO: renamed from: s */
    public void m27885s(@InterfaceC7396q ncyb source, @InterfaceC7396q ncyb target) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(target, "target");
        okio.internal.zy.toq(this, source, target);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: t */
    public kotlin.sequences.qrj<ncyb> mo27830t(@InterfaceC7396q ncyb dir, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        return okio.internal.zy.m27750g(this, dir, z2);
    }

    @InterfaceC6769y(name = "-write")
    public final <T> T toq(@InterfaceC7396q ncyb file, boolean z2, @InterfaceC7396q cyoe.x2<? super qrj, ? extends T> writerAction) throws Throwable {
        T tInvoke;
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        kotlin.jvm.internal.d2ok.m23075h(writerAction, "writerAction");
        qrj qrjVarM27594q = d2ok.m27594q(eqxt(file, z2));
        Throwable th = null;
        try {
            tInvoke = writerAction.invoke(qrjVarM27594q);
            kotlin.jvm.internal.d3.m23090q(1);
            if (qrjVarM27594q != null) {
                try {
                    qrjVarM27594q.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.d3.zy(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.d3.m23090q(1);
            if (qrjVarM27594q != null) {
                try {
                    qrjVarM27594q.close();
                } catch (Throwable th4) {
                    C6231h.m22845k(th3, th4);
                }
            }
            kotlin.jvm.internal.d3.zy(1);
            tInvoke = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.d2ok.qrj(tInvoke);
        return tInvoke;
    }

    @InterfaceC7396q
    public final kotlin.sequences.qrj<ncyb> wvg(@InterfaceC7396q ncyb dir) {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        return mo27830t(dir, false);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public abstract ncyb mo27626y(@InterfaceC7396q ncyb ncybVar) throws IOException;

    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public abstract List<ncyb> mo27627z(@InterfaceC7396q ncyb ncybVar) throws IOException;
}

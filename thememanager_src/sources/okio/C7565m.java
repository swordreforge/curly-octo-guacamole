package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.C6231h;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.internal.C7555s;
import okio.ncyb;

/* JADX INFO: renamed from: okio.m */
/* JADX INFO: compiled from: ZipFileSystem.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,175:1\n52#2,5:176\n52#2,21:181\n60#2,10:202\n57#2,2:212\n71#2,2:214\n52#2,21:216\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n102#1:176,5\n103#1:181,21\n102#1:202,10\n102#1:212,2\n102#1:214,2\n132#1:216,21\n*E\n"})
public final class C7565m extends zurt {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private final Map<ncyb, okio.internal.ld6> f94293f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final zurt f43795g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final ncyb f43796n;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private final String f43797y;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final k f43794s = new k(null);

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private static final ncyb f43793p = ncyb.C7569k.m27824y(ncyb.f43814q, "/", false, 1, null);

    /* JADX INFO: renamed from: okio.m$k */
    /* JADX INFO: compiled from: ZipFileSystem.kt */
    private static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final ncyb m27797k() {
            return C7565m.f43793p;
        }
    }

    public C7565m(@InterfaceC7396q ncyb zipPath, @InterfaceC7396q zurt fileSystem, @InterfaceC7396q Map<ncyb, okio.internal.ld6> entries, @InterfaceC7395n String str) {
        kotlin.jvm.internal.d2ok.m23075h(zipPath, "zipPath");
        kotlin.jvm.internal.d2ok.m23075h(fileSystem, "fileSystem");
        kotlin.jvm.internal.d2ok.m23075h(entries, "entries");
        this.f43796n = zipPath;
        this.f43795g = fileSystem;
        this.f94293f7l8 = entries;
        this.f43797y = str;
    }

    private final ncyb dd(ncyb ncybVar) {
        return f43793p.m27821t(ncybVar, true);
    }

    private final List<ncyb> x9kr(ncyb ncybVar, boolean z2) throws IOException {
        okio.internal.ld6 ld6Var = this.f94293f7l8.get(dd(ncybVar));
        if (ld6Var != null) {
            return kotlin.collections.a9.wr(ld6Var.toq());
        }
        if (!z2) {
            return null;
        }
        throw new IOException("not a directory: " + ncybVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #3 {all -> 0x0089, blocks: (B:13:0x0054, B:29:0x007d, B:35:0x0088, B:26:0x0076, B:23:0x0071, B:14:0x0060), top: B:53:0x0054, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088 A[Catch: all -> 0x0089, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0089, blocks: (B:13:0x0054, B:29:0x007d, B:35:0x0088, B:26:0x0076, B:23:0x0071, B:14:0x0060), top: B:53:0x0054, inners: #1, #5 }] */
    @Override // okio.zurt
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okio.fn3e a9(@mub.InterfaceC7396q okio.ncyb r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.d2ok.m23075h(r14, r0)
            okio.ncyb r14 = r13.dd(r14)
            java.util.Map<okio.ncyb, okio.internal.ld6> r0 = r13.f94293f7l8
            java.lang.Object r14 = r0.get(r14)
            okio.internal.ld6 r14 = (okio.internal.ld6) r14
            r0 = 0
            if (r14 != 0) goto L15
            return r0
        L15:
            okio.fn3e r12 = new okio.fn3e
            boolean r1 = r14.m27697p()
            r2 = r1 ^ 1
            boolean r3 = r14.m27697p()
            r4 = 0
            boolean r1 = r14.m27697p()
            if (r1 == 0) goto L2a
            r5 = r0
            goto L33
        L2a:
            long r5 = r14.m27699s()
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r5 = r1
        L33:
            r6 = 0
            java.lang.Long r7 = r14.f7l8()
            r8 = 0
            r9 = 0
            r10 = 128(0x80, float:1.8E-43)
            r11 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            long r1 = r14.m27700y()
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L4c
            return r12
        L4c:
            okio.zurt r1 = r13.f43795g
            okio.ncyb r2 = r13.f43796n
            okio.i r1 = r1.fti(r2)
            long r2 = r14.m27700y()     // Catch: java.lang.Throwable -> L89
            okio.nn86 r14 = r1.ltg8(r2)     // Catch: java.lang.Throwable -> L89
            okio.n7h r14 = okio.d2ok.m27592n(r14)     // Catch: java.lang.Throwable -> L89
            okio.fn3e r2 = okio.internal.x2.m27747s(r14, r12)     // Catch: java.lang.Throwable -> L6e
            if (r14 == 0) goto L6c
            r14.close()     // Catch: java.lang.Throwable -> L6a
            goto L6c
        L6a:
            r14 = move-exception
            goto L7b
        L6c:
            r14 = r0
            goto L7b
        L6e:
            r2 = move-exception
            if (r14 == 0) goto L79
            r14.close()     // Catch: java.lang.Throwable -> L75
            goto L79
        L75:
            r14 = move-exception
            kotlin.kja0.m23173k(r2, r14)     // Catch: java.lang.Throwable -> L89
        L79:
            r14 = r2
            r2 = r0
        L7b:
            if (r14 != 0) goto L88
            kotlin.jvm.internal.d2ok.qrj(r2)     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L96
            r1.close()     // Catch: java.lang.Throwable -> L86
            goto L96
        L86:
            r0 = move-exception
            goto L96
        L88:
            throw r14     // Catch: java.lang.Throwable -> L89
        L89:
            r14 = move-exception
            if (r1 == 0) goto L94
            r1.close()     // Catch: java.lang.Throwable -> L90
            goto L94
        L90:
            r1 = move-exception
            kotlin.kja0.m23173k(r14, r1)
        L94:
            r2 = r0
            r0 = r14
        L96:
            if (r0 != 0) goto L9c
            kotlin.jvm.internal.d2ok.qrj(r2)
            return r2
        L9c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C7565m.a9(okio.ncyb):okio.fn3e");
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public vyq eqxt(@InterfaceC7396q ncyb file, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.zurt
    public void f7l8(@InterfaceC7396q ncyb source, @InterfaceC7396q ncyb target) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public AbstractC7549i fti(@InterfaceC7396q ncyb file) {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public AbstractC7549i gvn7(@InterfaceC7396q ncyb file, boolean z2, boolean z3) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // okio.zurt
    /* JADX INFO: renamed from: h */
    public void mo27608h(@InterfaceC7396q ncyb source, @InterfaceC7396q ncyb target) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        kotlin.jvm.internal.d2ok.m23075h(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.zurt
    public void ki(@InterfaceC7396q ncyb path, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.zurt
    @InterfaceC7396q
    public nn86 lvui(@InterfaceC7396q ncyb file) throws Throwable {
        n7h n7hVarM27592n;
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        okio.internal.ld6 ld6Var = this.f94293f7l8.get(dd(file));
        if (ld6Var == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        AbstractC7549i abstractC7549iFti = this.f43795g.fti(this.f43796n);
        Throwable th = null;
        try {
            n7hVarM27592n = d2ok.m27592n(abstractC7549iFti.ltg8(ld6Var.m27700y()));
            if (abstractC7549iFti != null) {
                try {
                    abstractC7549iFti.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (abstractC7549iFti != null) {
                try {
                    abstractC7549iFti.close();
                } catch (Throwable th4) {
                    C6231h.m22845k(th3, th4);
                }
            }
            n7hVarM27592n = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.d2ok.qrj(n7hVarM27592n);
        okio.internal.x2.x2(n7hVarM27592n);
        return ld6Var.m27696n() == 0 ? new C7555s(n7hVarM27592n, ld6Var.m27699s(), true) : new C7555s(new a9(new C7555s(n7hVarM27592n, ld6Var.m27698q(), true), new Inflater(true)), ld6Var.m27699s(), false);
    }

    @Override // okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public vyq mo27625n(@InterfaceC7396q ncyb file, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.zurt
    public void n7h(@InterfaceC7396q ncyb dir, boolean z2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.zurt
    @InterfaceC7395n
    public List<ncyb> o1t(@InterfaceC7396q ncyb dir) {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        return x9kr(dir, false);
    }

    @Override // okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public ncyb mo27626y(@InterfaceC7396q ncyb path) throws FileNotFoundException {
        kotlin.jvm.internal.d2ok.m23075h(path, "path");
        ncyb ncybVarDd = dd(path);
        if (this.f94293f7l8.containsKey(ncybVarDd)) {
            return ncybVarDd;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // okio.zurt
    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public List<ncyb> mo27627z(@InterfaceC7396q ncyb dir) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(dir, "dir");
        List<ncyb> listX9kr = x9kr(dir, true);
        kotlin.jvm.internal.d2ok.qrj(listX9kr);
        return listX9kr;
    }
}

package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C3771c;
import com.google.android.exoplayer2.upstream.C3796h;
import com.google.android.exoplayer2.upstream.a9;
import com.google.android.exoplayer2.upstream.cache.InterfaceC3775k;
import com.google.android.exoplayer2.upstream.cache.toq;
import com.google.android.exoplayer2.upstream.jk;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.upstream.lvui;
import com.google.android.exoplayer2.upstream.n7h;
import com.google.android.exoplayer2.upstream.uv6;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.oc;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import zy.dd;

/* JADX INFO: compiled from: CacheDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy implements com.google.android.exoplayer2.upstream.kja0 {

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f66806fu4 = 2;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final long f66807mcp = 102400;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f66808ni7 = 1;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f66809o1t = -1;

    /* JADX INFO: renamed from: t */
    public static final int f22967t = 1;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f66810wvg = 0;

    /* JADX INFO: renamed from: z */
    public static final int f22968z = 4;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private long f66811cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd
    private final InterfaceC7967zy f66812f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private long f66813fn3e;

    /* JADX INFO: renamed from: g */
    private final InterfaceC3783y f22969g;

    /* JADX INFO: renamed from: h */
    private long f22970h;

    /* JADX INFO: renamed from: i */
    private boolean f22971i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @dd
    private C3780s f66814ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private long f66815kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @dd
    private Uri f66816ld6;

    /* JADX INFO: renamed from: n */
    private final com.google.android.exoplayer2.upstream.kja0 f22972n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @dd
    private com.google.android.exoplayer2.upstream.kja0 f66817n7h;

    /* JADX INFO: renamed from: p */
    private final boolean f22973p;

    /* JADX INFO: renamed from: q */
    @dd
    private final com.google.android.exoplayer2.upstream.kja0 f22974q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    private com.google.android.exoplayer2.upstream.t8r f66818qrj;

    /* JADX INFO: renamed from: s */
    private final boolean f22975s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private boolean f66819t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC3775k f66820toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dd
    private com.google.android.exoplayer2.upstream.t8r f66821x2;

    /* JADX INFO: renamed from: y */
    private final boolean f22976y;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private long f66822zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.kja0 f66823zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.zy$n */
    /* JADX INFO: compiled from: CacheDataSource.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3785n {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.zy$q */
    /* JADX INFO: compiled from: CacheDataSource.java */
    public static final class C3786q implements kja0.InterfaceC3804k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @dd
        private oc f66824f7l8;

        /* JADX INFO: renamed from: g */
        @dd
        private kja0.InterfaceC3804k f22977g;

        /* JADX INFO: renamed from: k */
        private InterfaceC3775k f22978k;

        /* JADX INFO: renamed from: n */
        private boolean f22979n;

        /* JADX INFO: renamed from: p */
        @dd
        private InterfaceC7967zy f22980p;

        /* JADX INFO: renamed from: s */
        private int f22982s;

        /* JADX INFO: renamed from: y */
        private int f22983y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @dd
        private n7h.InterfaceC3809k f66826zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private kja0.InterfaceC3804k f66825toq = new a9.toq();

        /* JADX INFO: renamed from: q */
        private InterfaceC3783y f22981q = InterfaceC3783y.f22966k;

        /* JADX INFO: renamed from: g */
        private zy m13440g(@dd com.google.android.exoplayer2.upstream.kja0 kja0Var, int i2, int i3) {
            com.google.android.exoplayer2.upstream.n7h n7hVarMo13417k;
            InterfaceC3775k interfaceC3775k = (InterfaceC3775k) C3844k.f7l8(this.f22978k);
            if (this.f22979n || kja0Var == null) {
                n7hVarMo13417k = null;
            } else {
                n7h.InterfaceC3809k interfaceC3809k = this.f66826zy;
                n7hVarMo13417k = interfaceC3809k != null ? interfaceC3809k.mo13417k() : new toq.C7966toq().zy(interfaceC3775k).mo13417k();
            }
            return new zy(interfaceC3775k, kja0Var, this.f66825toq.mo7265k(), n7hVarMo13417k, this.f22981q, i2, this.f66824f7l8, i3, this.f22980p);
        }

        public C3786q cdj(int i2) {
            this.f22983y = i2;
            return this;
        }

        @dd
        public InterfaceC3775k f7l8() {
            return this.f22978k;
        }

        /* JADX INFO: renamed from: h */
        public C3786q m13441h(@dd kja0.InterfaceC3804k interfaceC3804k) {
            this.f22977g = interfaceC3804k;
            return this;
        }

        public C3786q ki(@dd oc ocVar) {
            this.f66824f7l8 = ocVar;
            return this;
        }

        public C3786q kja0(int i2) {
            this.f22982s = i2;
            return this;
        }

        public C3786q ld6(InterfaceC3783y interfaceC3783y) {
            this.f22981q = interfaceC3783y;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public zy m13442n() {
            return m13440g(null, this.f22982s | 1, -1000);
        }

        public C3786q n7h(@dd InterfaceC7967zy interfaceC7967zy) {
            this.f22980p = interfaceC7967zy;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C3786q m13443p(InterfaceC3775k interfaceC3775k) {
            this.f22978k = interfaceC3775k;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public zy m13444q() {
            kja0.InterfaceC3804k interfaceC3804k = this.f22977g;
            return m13440g(interfaceC3804k != null ? interfaceC3804k.mo7265k() : null, this.f22982s | 1, -1000);
        }

        public C3786q qrj(@dd n7h.InterfaceC3809k interfaceC3809k) {
            this.f66826zy = interfaceC3809k;
            this.f22979n = interfaceC3809k == null;
            return this;
        }

        @dd
        /* JADX INFO: renamed from: s */
        public oc m13445s() {
            return this.f66824f7l8;
        }

        public C3786q x2(kja0.InterfaceC3804k interfaceC3804k) {
            this.f66825toq = interfaceC3804k;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public InterfaceC3783y m13446y() {
            return this.f22981q;
        }

        @Override // com.google.android.exoplayer2.upstream.kja0.InterfaceC3804k
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public zy mo7265k() {
            kja0.InterfaceC3804k interfaceC3804k = this.f22977g;
            return m13440g(interfaceC3804k != null ? interfaceC3804k.mo7265k() : null, this.f22982s, this.f22983y);
        }
    }

    /* JADX INFO: compiled from: CacheDataSource.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheDataSource.java */
    public interface InterfaceC7967zy {
        /* JADX INFO: renamed from: k */
        void m13447k(int i2);

        void toq(long j2, long j3);
    }

    private void a9() {
        InterfaceC7967zy interfaceC7967zy = this.f66812f7l8;
        if (interfaceC7967zy == null || this.f66813fn3e <= 0) {
            return;
        }
        interfaceC7967zy.toq(this.f66820toq.mo13387s(), this.f66813fn3e);
        this.f66813fn3e = 0L;
    }

    private int d3(com.google.android.exoplayer2.upstream.t8r t8rVar) {
        if (this.f22975s && this.f66819t8r) {
            return 0;
        }
        return (this.f22973p && t8rVar.f23108y == -1) ? 1 : -1;
    }

    private void fti(int i2) {
        InterfaceC7967zy interfaceC7967zy = this.f66812f7l8;
        if (interfaceC7967zy != null) {
            interfaceC7967zy.m13447k(i2);
        }
    }

    private void gvn7(String str) throws IOException {
        this.f66811cdj = 0L;
        if (jk()) {
            n7h n7hVar = new n7h();
            n7h.m13405y(n7hVar, this.f22970h);
            this.f66820toq.mo13386q(str, n7hVar);
        }
    }

    private boolean jk() {
        return this.f66817n7h == this.f22974q;
    }

    private void jp0y(com.google.android.exoplayer2.upstream.t8r t8rVar, boolean z2) throws IOException {
        C3780s c3780sX2;
        long jMin;
        com.google.android.exoplayer2.upstream.t8r t8rVarM13519k;
        com.google.android.exoplayer2.upstream.kja0 kja0Var;
        String str = (String) lrht.ld6(t8rVar.f23107s);
        if (this.f22971i) {
            c3780sX2 = null;
        } else if (this.f22976y) {
            try {
                c3780sX2 = this.f66820toq.x2(str, this.f22970h, this.f66811cdj);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            c3780sX2 = this.f66820toq.mo13381g(str, this.f22970h, this.f66811cdj);
        }
        if (c3780sX2 == null) {
            kja0Var = this.f22972n;
            t8rVarM13519k = t8rVar.m13513k().m13523s(this.f22970h).m13524y(this.f66811cdj).m13519k();
        } else if (c3780sX2.f22932g) {
            Uri uriFromFile = Uri.fromFile((File) lrht.ld6(c3780sX2.f22937y));
            long j2 = c3780sX2.f22935q;
            long j3 = this.f22970h - j2;
            long jMin2 = c3780sX2.f22934n - j3;
            long j4 = this.f66811cdj;
            if (j4 != -1) {
                jMin2 = Math.min(jMin2, j4);
            }
            t8rVarM13519k = t8rVar.m13513k().m13521p(uriFromFile).x2(j2).m13523s(j3).m13524y(jMin2).m13519k();
            kja0Var = this.f66823zy;
        } else {
            if (c3780sX2.m13414q()) {
                jMin = this.f66811cdj;
            } else {
                jMin = c3780sX2.f22934n;
                long j5 = this.f66811cdj;
                if (j5 != -1) {
                    jMin = Math.min(jMin, j5);
                }
            }
            t8rVarM13519k = t8rVar.m13513k().m13523s(this.f22970h).m13524y(jMin).m13519k();
            kja0Var = this.f22974q;
            if (kja0Var == null) {
                kja0Var = this.f22972n;
                this.f66820toq.mo13385p(c3780sX2);
                c3780sX2 = null;
            }
        }
        this.f66822zurt = (this.f22971i || kja0Var != this.f22972n) ? Long.MAX_VALUE : this.f22970h + f66807mcp;
        if (z2) {
            C3844k.m13633s(wvg());
            if (kja0Var == this.f22972n) {
                return;
            }
            try {
                zurt();
            } finally {
            }
        }
        if (c3780sX2 != null && c3780sX2.zy()) {
            this.f66814ki = c3780sX2;
        }
        this.f66817n7h = kja0Var;
        this.f66818qrj = t8rVarM13519k;
        this.f66815kja0 = 0L;
        long jMo7270k = kja0Var.mo7270k(t8rVarM13519k);
        n7h n7hVar = new n7h();
        if (t8rVarM13519k.f23108y == -1 && jMo7270k != -1) {
            this.f66811cdj = jMo7270k;
            n7h.m13405y(n7hVar, this.f22970h + jMo7270k);
        }
        if (mcp()) {
            Uri uri = kja0Var.getUri();
            this.f66816ld6 = uri;
            n7h.m13404s(n7hVar, t8rVar.f23103k.equals(uri) ^ true ? this.f66816ld6 : null);
        }
        if (jk()) {
            this.f66820toq.mo13386q(str, n7hVar);
        }
    }

    private boolean mcp() {
        return !m13438t();
    }

    private void o1t(Throwable th) {
        if (m13438t() || (th instanceof InterfaceC3775k.k)) {
            this.f66819t8r = true;
        }
    }

    /* JADX INFO: renamed from: t */
    private boolean m13438t() {
        return this.f66817n7h == this.f66823zy;
    }

    private boolean wvg() {
        return this.f66817n7h == this.f22972n;
    }

    /* JADX INFO: renamed from: z */
    private static Uri m13439z(InterfaceC3775k interfaceC3775k, String str, Uri uri) {
        Uri uriZy = qrj.zy(interfaceC3775k.zy(str));
        return uriZy != null ? uriZy : uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zurt() throws IOException {
        com.google.android.exoplayer2.upstream.kja0 kja0Var = this.f66817n7h;
        if (kja0Var == null) {
            return;
        }
        try {
            kja0Var.close();
        } finally {
            this.f66818qrj = null;
            this.f66817n7h = null;
            C3780s c3780s = this.f66814ki;
            if (c3780s != null) {
                this.f66820toq.mo13385p(c3780s);
                this.f66814ki = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() throws IOException {
        this.f66821x2 = null;
        this.f66816ld6 = null;
        this.f22970h = 0L;
        a9();
        try {
            zurt();
        } catch (Throwable th) {
            o1t(th);
            throw th;
        }
    }

    public InterfaceC3783y fu4() {
        return this.f22969g;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @dd
    public Uri getUri() {
        return this.f66816ld6;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(com.google.android.exoplayer2.upstream.t8r t8rVar) throws IOException {
        try {
            String strMo13368k = this.f22969g.mo13368k(t8rVar);
            com.google.android.exoplayer2.upstream.t8r t8rVarM13519k = t8rVar.m13513k().f7l8(strMo13368k).m13519k();
            this.f66821x2 = t8rVarM13519k;
            this.f66816ld6 = m13439z(this.f66820toq, strMo13368k, t8rVarM13519k.f23103k);
            this.f22970h = t8rVar.f66911f7l8;
            int iD3 = d3(t8rVar);
            boolean z2 = iD3 != -1;
            this.f22971i = z2;
            if (z2) {
                fti(iD3);
            }
            if (this.f22971i) {
                this.f66811cdj = -1L;
            } else {
                long jM13413n = qrj.m13413n(this.f66820toq.zy(strMo13368k));
                this.f66811cdj = jM13413n;
                if (jM13413n != -1) {
                    long j2 = jM13413n - t8rVar.f66911f7l8;
                    this.f66811cdj = j2;
                    if (j2 < 0) {
                        throw new C3796h(2008);
                    }
                }
            }
            long jMin = t8rVar.f23108y;
            if (jMin != -1) {
                long j3 = this.f66811cdj;
                if (j3 != -1) {
                    jMin = Math.min(j3, jMin);
                }
                this.f66811cdj = jMin;
            }
            long j4 = this.f66811cdj;
            if (j4 > 0 || j4 == -1) {
                jp0y(t8rVarM13519k, false);
            }
            long j5 = t8rVar.f23108y;
            return j5 != -1 ? j5 : this.f66811cdj;
        } catch (Throwable th) {
            o1t(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: n */
    public void mo7271n(uv6 uv6Var) {
        C3844k.f7l8(uv6Var);
        this.f66823zy.mo7271n(uv6Var);
        this.f22972n.mo7271n(uv6Var);
    }

    public InterfaceC3775k ni7() {
        return this.f66820toq;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:9:0x0021, B:11:0x0029, B:12:0x002d, B:14:0x0041, B:16:0x0047, B:17:0x004d, B:19:0x005e, B:20:0x0062, B:22:0x0068, B:24:0x006e, B:26:0x0074, B:27:0x0080, B:33:0x008e), top: B:38:0x0021 }] */
    @Override // com.google.android.exoplayer2.upstream.x2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r16, int r17, int r18) throws java.io.IOException {
        /*
            r15 = this;
            r1 = r15
            r0 = r18
            r2 = 0
            if (r0 != 0) goto L7
            return r2
        L7:
            long r3 = r1.f66811cdj
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = -1
            if (r3 != 0) goto L11
            return r4
        L11:
            com.google.android.exoplayer2.upstream.t8r r3 = r1.f66821x2
            java.lang.Object r3 = com.google.android.exoplayer2.util.C3844k.f7l8(r3)
            com.google.android.exoplayer2.upstream.t8r r3 = (com.google.android.exoplayer2.upstream.t8r) r3
            com.google.android.exoplayer2.upstream.t8r r7 = r1.f66818qrj
            java.lang.Object r7 = com.google.android.exoplayer2.util.C3844k.f7l8(r7)
            com.google.android.exoplayer2.upstream.t8r r7 = (com.google.android.exoplayer2.upstream.t8r) r7
            long r8 = r1.f22970h     // Catch: java.lang.Throwable -> L99
            long r10 = r1.f66822zurt     // Catch: java.lang.Throwable -> L99
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L2d
            r8 = 1
            r15.jp0y(r3, r8)     // Catch: java.lang.Throwable -> L99
        L2d:
            com.google.android.exoplayer2.upstream.kja0 r8 = r1.f66817n7h     // Catch: java.lang.Throwable -> L99
            java.lang.Object r8 = com.google.android.exoplayer2.util.C3844k.f7l8(r8)     // Catch: java.lang.Throwable -> L99
            com.google.android.exoplayer2.upstream.kja0 r8 = (com.google.android.exoplayer2.upstream.kja0) r8     // Catch: java.lang.Throwable -> L99
            r9 = r16
            r10 = r17
            int r8 = r8.read(r9, r10, r0)     // Catch: java.lang.Throwable -> L99
            r11 = -1
            if (r8 == r4) goto L62
            boolean r0 = r15.m13438t()     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L4d
            long r2 = r1.f66813fn3e     // Catch: java.lang.Throwable -> L99
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L99
            long r2 = r2 + r4
            r1.f66813fn3e = r2     // Catch: java.lang.Throwable -> L99
        L4d:
            long r2 = r1.f22970h     // Catch: java.lang.Throwable -> L99
            long r4 = (long) r8     // Catch: java.lang.Throwable -> L99
            long r2 = r2 + r4
            r1.f22970h = r2     // Catch: java.lang.Throwable -> L99
            long r2 = r1.f66815kja0     // Catch: java.lang.Throwable -> L99
            long r2 = r2 + r4
            r1.f66815kja0 = r2     // Catch: java.lang.Throwable -> L99
            long r2 = r1.f66811cdj     // Catch: java.lang.Throwable -> L99
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L8d
            long r2 = r2 - r4
            r1.f66811cdj = r2     // Catch: java.lang.Throwable -> L99
            goto L8d
        L62:
            boolean r4 = r15.mcp()     // Catch: java.lang.Throwable -> L99
            if (r4 == 0) goto L80
            long r13 = r7.f23108y     // Catch: java.lang.Throwable -> L99
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L74
            long r11 = r1.f66815kja0     // Catch: java.lang.Throwable -> L99
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 >= 0) goto L80
        L74:
            java.lang.String r0 = r3.f23107s     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = com.google.android.exoplayer2.util.lrht.ld6(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L99
            r15.gvn7(r0)     // Catch: java.lang.Throwable -> L99
            goto L8d
        L80:
            long r11 = r1.f66811cdj     // Catch: java.lang.Throwable -> L99
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 > 0) goto L8e
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 != 0) goto L8d
            goto L8e
        L8d:
            return r8
        L8e:
            r15.zurt()     // Catch: java.lang.Throwable -> L99
            r15.jp0y(r3, r2)     // Catch: java.lang.Throwable -> L99
            int r0 = r15.read(r16, r17, r18)     // Catch: java.lang.Throwable -> L99
            return r0
        L99:
            r0 = move-exception
            r15.o1t(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.zy.read(byte[], int, int):int");
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public Map<String, List<String>> toq() {
        return mcp() ? this.f22972n.toq() : Collections.emptyMap();
    }

    public zy(InterfaceC3775k interfaceC3775k, @dd com.google.android.exoplayer2.upstream.kja0 kja0Var) {
        this(interfaceC3775k, kja0Var, 0);
    }

    public zy(InterfaceC3775k interfaceC3775k, @dd com.google.android.exoplayer2.upstream.kja0 kja0Var, int i2) {
        this(interfaceC3775k, kja0Var, new a9(), new com.google.android.exoplayer2.upstream.cache.toq(interfaceC3775k, com.google.android.exoplayer2.upstream.cache.toq.f66783ld6), i2, null);
    }

    public zy(InterfaceC3775k interfaceC3775k, @dd com.google.android.exoplayer2.upstream.kja0 kja0Var, com.google.android.exoplayer2.upstream.kja0 kja0Var2, @dd com.google.android.exoplayer2.upstream.n7h n7hVar, int i2, @dd InterfaceC7967zy interfaceC7967zy) {
        this(interfaceC3775k, kja0Var, kja0Var2, n7hVar, i2, interfaceC7967zy, null);
    }

    public zy(InterfaceC3775k interfaceC3775k, @dd com.google.android.exoplayer2.upstream.kja0 kja0Var, com.google.android.exoplayer2.upstream.kja0 kja0Var2, @dd com.google.android.exoplayer2.upstream.n7h n7hVar, int i2, @dd InterfaceC7967zy interfaceC7967zy, @dd InterfaceC3783y interfaceC3783y) {
        this(interfaceC3775k, kja0Var, kja0Var2, n7hVar, interfaceC3783y, i2, null, 0, interfaceC7967zy);
    }

    private zy(InterfaceC3775k interfaceC3775k, @dd com.google.android.exoplayer2.upstream.kja0 kja0Var, com.google.android.exoplayer2.upstream.kja0 kja0Var2, @dd com.google.android.exoplayer2.upstream.n7h n7hVar, @dd InterfaceC3783y interfaceC3783y, int i2, @dd oc ocVar, int i3, @dd InterfaceC7967zy interfaceC7967zy) {
        this.f66820toq = interfaceC3775k;
        this.f66823zy = kja0Var2;
        this.f22969g = interfaceC3783y == null ? InterfaceC3783y.f22966k : interfaceC3783y;
        this.f22976y = (i2 & 1) != 0;
        this.f22975s = (i2 & 2) != 0;
        this.f22973p = (i2 & 4) != 0;
        if (kja0Var != null) {
            kja0Var = ocVar != null ? new lvui(kja0Var, ocVar, i3) : kja0Var;
            this.f22972n = kja0Var;
            this.f22974q = n7hVar != null ? new C3771c(kja0Var, n7hVar) : null;
        } else {
            this.f22972n = jk.f66862toq;
            this.f22974q = null;
        }
        this.f66812f7l8 = interfaceC7967zy;
    }
}

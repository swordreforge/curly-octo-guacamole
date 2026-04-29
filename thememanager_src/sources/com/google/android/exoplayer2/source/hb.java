package com.google.android.exoplayer2.source;

import android.os.Looper;
import com.google.android.exoplayer2.C3865v;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.drm.fn3e;
import com.google.android.exoplayer2.drm.qrj;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.source.hb;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.InterfaceC3855s;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import zy.InterfaceC7842s;

/* JADX INFO: compiled from: SampleQueue.java */
/* JADX INFO: loaded from: classes2.dex */
public class hb implements InterfaceC3401t {

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    @zy.yz
    static final int f65384d2ok = 1000;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final String f65385lvui = "SampleQueue";

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    @zy.dd
    private xwq3 f65386a9;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private boolean f65388d3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private boolean f65389eqxt;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @zy.dd
    private final com.google.android.exoplayer2.drm.fn3e f65390f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private int f65391fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    @zy.dd
    private xwq3 f65392fti;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private boolean f65394gvn7;

    /* JADX INFO: renamed from: i */
    private int f21541i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private boolean f65395jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private int f65396jp0y;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @zy.dd
    private xwq3 f65399ld6;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f65402ni7;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private long f65404oc;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private InterfaceC3601q f21543p;

    /* JADX INFO: renamed from: q */
    private final C3591e f21544q;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private final Looper f21545s;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private boolean f65407wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @zy.dd
    private com.google.android.exoplayer2.drm.qrj f65408x2;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private final InterfaceC3312i.k f21547y;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f65409zurt;

    /* JADX INFO: renamed from: n */
    private final toq f21542n = new toq();

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f65405qrj = 1000;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int[] f65401n7h = new int[1000];

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private long[] f65398kja0 = new long[1000];

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private long[] f65397ki = new long[1000];

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int[] f65387cdj = new int[1000];

    /* JADX INFO: renamed from: h */
    private int[] f21540h = new int[1000];

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private InterfaceC3401t.k[] f65406t8r = new InterfaceC3401t.k[1000];

    /* JADX INFO: renamed from: g */
    private final i1<zy> f21539g = new i1<>(new InterfaceC3855s() { // from class: com.google.android.exoplayer2.source.nn86
        @Override // com.google.android.exoplayer2.util.InterfaceC3855s
        public final void accept(Object obj) {
            hb.lvui((hb.zy) obj);
        }
    });

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private long f65393fu4 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: z */
    private long f21548z = Long.MIN_VALUE;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private long f65403o1t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private boolean f65400mcp = true;

    /* JADX INFO: renamed from: t */
    private boolean f21546t = true;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hb$q */
    /* JADX INFO: compiled from: SampleQueue.java */
    public interface InterfaceC3601q {
        /* JADX INFO: renamed from: s */
        void mo12704s(xwq3 xwq3Var);
    }

    /* JADX INFO: compiled from: SampleQueue.java */
    static final class toq {

        /* JADX INFO: renamed from: k */
        public int f21549k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public long f65410toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        public InterfaceC3401t.k f65411zy;

        toq() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SampleQueue.java */
    static final class zy {

        /* JADX INFO: renamed from: k */
        public final xwq3 f21550k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final fn3e.toq f65412toq;

        private zy(xwq3 xwq3Var, fn3e.toq toqVar) {
            this.f21550k = xwq3Var;
            this.f65412toq = toqVar;
        }
    }

    protected hb(com.google.android.exoplayer2.upstream.toq toqVar, @zy.dd Looper looper, @zy.dd com.google.android.exoplayer2.drm.fn3e fn3eVar, @zy.dd InterfaceC3312i.k kVar) {
        this.f21545s = looper;
        this.f65390f7l8 = fn3eVar;
        this.f21547y = kVar;
        this.f21544q = new C3591e(toqVar);
    }

    private int a9(int i2) {
        int i3 = this.f65409zurt + i2;
        int i4 = this.f65405qrj;
        return i3 < i4 ? i3 : i3 - i4;
    }

    /* JADX INFO: renamed from: c */
    private void m12720c() {
        com.google.android.exoplayer2.drm.qrj qrjVar = this.f65408x2;
        if (qrjVar != null) {
            qrjVar.toq(this.f21547y);
            this.f65408x2 = null;
            this.f65399ld6 = null;
        }
    }

    private boolean d3() {
        return this.f65402ni7 != this.f21541i;
    }

    private long fn3e(int i2) {
        int iGvn7 = gvn7() - i2;
        boolean z2 = false;
        C3844k.m13629k(iGvn7 >= 0 && iGvn7 <= this.f21541i - this.f65402ni7);
        int i3 = this.f21541i - iGvn7;
        this.f21541i = i3;
        this.f65403o1t = Math.max(this.f21548z, mcp(i3));
        if (iGvn7 == 0 && this.f65407wvg) {
            z2 = true;
        }
        this.f65407wvg = z2;
        this.f21539g.m12739q(i2);
        int i4 = this.f21541i;
        if (i4 == 0) {
            return 0L;
        }
        int iA9 = a9(i4 - 1);
        return this.f65398kja0[iA9] + ((long) this.f21540h[iA9]);
    }

    @zy.o1t("this")
    /* JADX INFO: renamed from: h */
    private long m12721h(int i2) {
        this.f21548z = Math.max(this.f21548z, mcp(i2));
        this.f21541i -= i2;
        int i3 = this.f65391fn3e + i2;
        this.f65391fn3e = i3;
        int i4 = this.f65409zurt + i2;
        this.f65409zurt = i4;
        int i5 = this.f65405qrj;
        if (i4 >= i5) {
            this.f65409zurt = i4 - i5;
        }
        int i6 = this.f65402ni7 - i2;
        this.f65402ni7 = i6;
        if (i6 < 0) {
            this.f65402ni7 = 0;
        }
        this.f21539g.m12738n(i3);
        if (this.f21541i != 0) {
            return this.f65398kja0[this.f65409zurt];
        }
        int i7 = this.f65409zurt;
        if (i7 == 0) {
            i7 = this.f65405qrj;
        }
        int i8 = i7 - 1;
        return this.f65398kja0[i8] + ((long) this.f21540h[i8]);
    }

    public static hb ld6(com.google.android.exoplayer2.upstream.toq toqVar, Looper looper, com.google.android.exoplayer2.drm.fn3e fn3eVar, InterfaceC3312i.k kVar) {
        return new hb(toqVar, (Looper) C3844k.f7l8(looper), (com.google.android.exoplayer2.drm.fn3e) C3844k.f7l8(fn3eVar), (InterfaceC3312i.k) C3844k.f7l8(kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lvui(zy zyVar) {
        zyVar.f65412toq.release();
    }

    private long mcp(int i2) {
        long jMax = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int iA9 = a9(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            jMax = Math.max(jMax, this.f65397ki[iA9]);
            if ((this.f65387cdj[iA9] & 1) != 0) {
                break;
            }
            iA9--;
            if (iA9 == -1) {
                iA9 = this.f65405qrj - 1;
            }
        }
        return jMax;
    }

    private synchronized long n7h() {
        int i2 = this.f21541i;
        if (i2 == 0) {
            return -1L;
        }
        return m12721h(i2);
    }

    private synchronized int ncyb(C3865v c3865v, C3297s c3297s, boolean z2, boolean z3, toq toqVar) {
        c3297s.f19619y = false;
        if (!d3()) {
            if (!z3 && !this.f65407wvg) {
                xwq3 xwq3Var = this.f65392fti;
                if (xwq3Var == null || (!z2 && xwq3Var == this.f65399ld6)) {
                    return -3;
                }
                x9kr((xwq3) C3844k.f7l8(xwq3Var), c3865v);
                return -5;
            }
            c3297s.m11565h(4);
            return -4;
        }
        xwq3 xwq3Var2 = this.f21539g.m12737g(jk()).f21550k;
        if (!z2 && xwq3Var2 == this.f65399ld6) {
            int iA9 = a9(this.f65402ni7);
            if (!m12724r(iA9)) {
                c3297s.f19619y = true;
                return -3;
            }
            c3297s.m11565h(this.f65387cdj[iA9]);
            long j2 = this.f65397ki[iA9];
            c3297s.f19618s = j2;
            if (j2 < this.f65393fu4) {
                c3297s.f7l8(Integer.MIN_VALUE);
            }
            toqVar.f21549k = this.f21540h[iA9];
            toqVar.f65410toq = this.f65398kja0[iA9];
            toqVar.f65411zy = this.f65406t8r[iA9];
            return -4;
        }
        x9kr(xwq3Var2, c3865v);
        return -5;
    }

    private int ni7(int i2, int i3, long j2, boolean z2) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = this.f65397ki[i2];
            if (j3 > j2) {
                return i4;
            }
            if (!z2 || (this.f65387cdj[i2] & 1) != 0) {
                if (j3 == j2) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.f65405qrj) {
                i2 = 0;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: o */
    private synchronized boolean m12722o(xwq3 xwq3Var) {
        this.f65400mcp = false;
        if (com.google.android.exoplayer2.util.lrht.zy(xwq3Var, this.f65392fti)) {
            return false;
        }
        if (this.f21539g.m12740y() || !this.f21539g.f7l8().f21550k.equals(xwq3Var)) {
            this.f65392fti = xwq3Var;
        } else {
            this.f65392fti = this.f21539g.f7l8().f21550k;
        }
        xwq3 xwq3Var2 = this.f65392fti;
        this.f65394gvn7 = com.google.android.exoplayer2.util.wvg.m13746k(xwq3Var2.f23682r, xwq3Var2.f23673i);
        this.f65388d3 = false;
        return true;
    }

    /* JADX INFO: renamed from: p */
    private int m12723p(long j2) {
        int i2 = this.f21541i;
        int iA9 = a9(i2 - 1);
        while (i2 > this.f65402ni7 && this.f65397ki[iA9] >= j2) {
            i2--;
            iA9--;
            if (iA9 == -1) {
                iA9 = this.f65405qrj - 1;
            }
        }
        return i2;
    }

    private synchronized long qrj(long j2, boolean z2, boolean z3) {
        int i2;
        int i3 = this.f21541i;
        if (i3 != 0) {
            long[] jArr = this.f65397ki;
            int i4 = this.f65409zurt;
            if (j2 >= jArr[i4]) {
                if (z3 && (i2 = this.f65402ni7) != i3) {
                    i3 = i2 + 1;
                }
                int iNi7 = ni7(i4, i3, j2, z2);
                if (iNi7 == -1) {
                    return -1L;
                }
                return m12721h(iNi7);
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: r */
    private boolean m12724r(int i2) {
        com.google.android.exoplayer2.drm.qrj qrjVar = this.f65408x2;
        return qrjVar == null || qrjVar.getState() == 4 || ((this.f65387cdj[i2] & 1073741824) == 0 && this.f65408x2.mo11614q());
    }

    /* JADX INFO: renamed from: s */
    private synchronized void m12725s(long j2, int i2, long j3, int i3, @zy.dd InterfaceC3401t.k kVar) {
        int i4 = this.f21541i;
        if (i4 > 0) {
            int iA9 = a9(i4 - 1);
            C3844k.m13629k(this.f65398kja0[iA9] + ((long) this.f21540h[iA9]) <= j3);
        }
        this.f65407wvg = (536870912 & i2) != 0;
        this.f65403o1t = Math.max(this.f65403o1t, j2);
        int iA92 = a9(this.f21541i);
        this.f65397ki[iA92] = j2;
        this.f65398kja0[iA92] = j3;
        this.f21540h[iA92] = i3;
        this.f65387cdj[iA92] = i2;
        this.f65406t8r[iA92] = kVar;
        this.f65401n7h[iA92] = this.f65396jp0y;
        if (this.f21539g.m12740y() || !this.f21539g.f7l8().f21550k.equals(this.f65392fti)) {
            com.google.android.exoplayer2.drm.fn3e fn3eVar = this.f65390f7l8;
            this.f21539g.toq(gvn7(), new zy((xwq3) C3844k.f7l8(this.f65392fti), fn3eVar != null ? fn3eVar.mo11621q((Looper) C3844k.f7l8(this.f21545s), this.f21547y, this.f65392fti) : fn3e.toq.f19655k));
        }
        int i5 = this.f21541i + 1;
        this.f21541i = i5;
        int i6 = this.f65405qrj;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            InterfaceC3401t.k[] kVarArr = new InterfaceC3401t.k[i7];
            int i8 = this.f65409zurt;
            int i9 = i6 - i8;
            System.arraycopy(this.f65398kja0, i8, jArr, 0, i9);
            System.arraycopy(this.f65397ki, this.f65409zurt, jArr2, 0, i9);
            System.arraycopy(this.f65387cdj, this.f65409zurt, iArr2, 0, i9);
            System.arraycopy(this.f21540h, this.f65409zurt, iArr3, 0, i9);
            System.arraycopy(this.f65406t8r, this.f65409zurt, kVarArr, 0, i9);
            System.arraycopy(this.f65401n7h, this.f65409zurt, iArr, 0, i9);
            int i10 = this.f65409zurt;
            System.arraycopy(this.f65398kja0, 0, jArr, i9, i10);
            System.arraycopy(this.f65397ki, 0, jArr2, i9, i10);
            System.arraycopy(this.f65387cdj, 0, iArr2, i9, i10);
            System.arraycopy(this.f21540h, 0, iArr3, i9, i10);
            System.arraycopy(this.f65406t8r, 0, kVarArr, i9, i10);
            System.arraycopy(this.f65401n7h, 0, iArr, i9, i10);
            this.f65398kja0 = jArr;
            this.f65397ki = jArr2;
            this.f65387cdj = iArr2;
            this.f21540h = iArr3;
            this.f65406t8r = kVarArr;
            this.f65401n7h = iArr;
            this.f65409zurt = 0;
            this.f65405qrj = i7;
        }
    }

    private synchronized void vyq() {
        this.f65402ni7 = 0;
        this.f21544q.kja0();
    }

    public static hb x2(com.google.android.exoplayer2.upstream.toq toqVar) {
        return new hb(toqVar, null, null, null);
    }

    private void x9kr(xwq3 xwq3Var, C3865v c3865v) {
        xwq3 xwq3Var2 = this.f65399ld6;
        boolean z2 = xwq3Var2 == null;
        DrmInitData drmInitData = z2 ? null : xwq3Var2.f23667c;
        this.f65399ld6 = xwq3Var;
        DrmInitData drmInitData2 = xwq3Var.f23667c;
        com.google.android.exoplayer2.drm.fn3e fn3eVar = this.f65390f7l8;
        c3865v.f67166toq = fn3eVar != null ? xwq3Var.m13925q(fn3eVar.toq(xwq3Var)) : xwq3Var;
        c3865v.f23348k = this.f65408x2;
        if (this.f65390f7l8 == null) {
            return;
        }
        if (z2 || !com.google.android.exoplayer2.util.lrht.zy(drmInitData, drmInitData2)) {
            com.google.android.exoplayer2.drm.qrj qrjVar = this.f65408x2;
            com.google.android.exoplayer2.drm.qrj qrjVarMo11620k = this.f65390f7l8.mo11620k((Looper) C3844k.f7l8(this.f21545s), this.f21547y, xwq3Var);
            this.f65408x2 = qrjVarMo11620k;
            c3865v.f23348k = qrjVarMo11620k;
            if (qrjVar != null) {
                qrjVar.toq(this.f21547y);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private synchronized boolean m12726y(long j2) {
        if (this.f21541i == 0) {
            return j2 > this.f21548z;
        }
        if (m12733t() >= j2) {
            return false;
        }
        fn3e(this.f65391fn3e + m12723p(j2));
        return true;
    }

    public final void cdj(long j2, boolean z2, boolean z3) {
        this.f21544q.toq(qrj(j2, z2, z3));
    }

    @InterfaceC7842s
    public synchronized boolean d2ok(boolean z2) {
        xwq3 xwq3Var;
        boolean z3 = true;
        if (d3()) {
            if (this.f21539g.m12737g(jk()).f21550k != this.f65399ld6) {
                return true;
            }
            return m12724r(a9(this.f65402ni7));
        }
        if (!z2 && !this.f65407wvg && ((xwq3Var = this.f65392fti) == null || xwq3Var == this.f65399ld6)) {
            z3 = false;
        }
        return z3;
    }

    @InterfaceC7842s
    public void dd() throws IOException {
        com.google.android.exoplayer2.drm.qrj qrjVar = this.f65408x2;
        if (qrjVar != null && qrjVar.getState() == 1) {
            throw ((qrj.C3318k) C3844k.f7l8(this.f65408x2.mo11610g()));
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m12727e(int i2) {
        vyq();
        int i3 = this.f65391fn3e;
        if (i2 >= i3 && i2 <= this.f21541i + i3) {
            this.f65393fu4 = Long.MIN_VALUE;
            this.f65402ni7 = i2 - i3;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void ek5k(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f65402ni7     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f21541i     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            com.google.android.exoplayer2.util.C3844k.m13629k(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f65402ni7     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f65402ni7 = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hb.ek5k(int):void");
    }

    public final synchronized boolean eqxt() {
        return this.f65407wvg;
    }

    @InterfaceC7842s
    /* JADX INFO: renamed from: f */
    public void m12728f() {
        uv6(true);
        m12720c();
    }

    public final synchronized int fti(long j2, boolean z2) {
        int iA9 = a9(this.f65402ni7);
        if (d3() && j2 >= this.f65397ki[iA9]) {
            if (j2 > this.f65403o1t && z2) {
                return this.f21541i - this.f65402ni7;
            }
            int iNi7 = ni7(iA9, this.f21541i - this.f65402ni7, j2, true);
            if (iNi7 == -1) {
                return 0;
            }
            return iNi7;
        }
        return 0;
    }

    @InterfaceC7842s
    protected xwq3 fu4(xwq3 xwq3Var) {
        return (this.f65404oc == 0 || xwq3Var.f23669e == Long.MAX_VALUE) ? xwq3Var : xwq3Var.toq().m13939b(xwq3Var.f23669e + this.f65404oc).a9();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3401t
    /* JADX INFO: renamed from: g */
    public final void mo11928g(com.google.android.exoplayer2.util.gvn7 gvn7Var, int i2, int i3) {
        this.f21544q.cdj(gvn7Var, i2);
    }

    public final int gvn7() {
        return this.f65391fn3e + this.f21541i;
    }

    public final void hb(long j2) {
        if (this.f65404oc != j2) {
            this.f65404oc = j2;
            oc();
        }
    }

    @InterfaceC7842s
    public int hyr(C3865v c3865v, C3297s c3297s, int i2, boolean z2) {
        int iNcyb = ncyb(c3865v, c3297s, (i2 & 2) != 0, z2, this.f21542n);
        if (iNcyb == -4 && !c3297s.n7h()) {
            boolean z3 = (i2 & 1) != 0;
            if ((i2 & 4) == 0) {
                if (z3) {
                    this.f21544q.m12687g(c3297s, this.f21542n);
                } else {
                    this.f21544q.qrj(c3297s, this.f21542n);
                }
            }
            if (!z3) {
                this.f65402ni7++;
            }
        }
        return iNcyb;
    }

    /* JADX INFO: renamed from: i */
    public final void m12729i(long j2) {
        if (this.f21541i == 0) {
            return;
        }
        C3844k.m13629k(j2 > m12733t());
        zurt(this.f65391fn3e + m12723p(j2));
    }

    /* JADX INFO: renamed from: j */
    public final void m12730j(long j2) {
        this.f65393fu4 = j2;
    }

    public final int jk() {
        return this.f65391fn3e + this.f65402ni7;
    }

    @zy.dd
    public final synchronized xwq3 jp0y() {
        return this.f65400mcp ? null : this.f65392fti;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3401t
    /* JADX INFO: renamed from: k */
    public final int mo11929k(com.google.android.exoplayer2.upstream.x2 x2Var, int i2, boolean z2, int i3) throws IOException {
        return this.f21544q.m12688h(x2Var, i2, z2);
    }

    public final void ki() {
        this.f21544q.toq(n7h());
    }

    public synchronized long kja0() {
        int i2 = this.f65402ni7;
        if (i2 == 0) {
            return -1L;
        }
        return m12721h(i2);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized int m12731l() {
        return d3() ? this.f65401n7h[a9(this.f65402ni7)] : this.f65396jp0y;
    }

    public final void lrht() {
        uv6(false);
    }

    /* JADX INFO: renamed from: m */
    public final void m12732m(@zy.dd InterfaceC3601q interfaceC3601q) {
        this.f21543p = interfaceC3601q;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    @Override // com.google.android.exoplayer2.extractor.InterfaceC3401t
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo11930n(long r12, int r14, int r15, int r16, @zy.dd com.google.android.exoplayer2.extractor.InterfaceC3401t.k r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f65395jk
            if (r0 == 0) goto L10
            com.google.android.exoplayer2.xwq3 r0 = r8.f65386a9
            java.lang.Object r0 = com.google.android.exoplayer2.util.C3844k.ld6(r0)
            com.google.android.exoplayer2.xwq3 r0 = (com.google.android.exoplayer2.xwq3) r0
            r11.mo11931q(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f21546t
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f21546t = r1
        L22:
            long r4 = r8.f65404oc
            long r4 = r4 + r12
            boolean r6 = r8.f65394gvn7
            if (r6 == 0) goto L5e
            long r6 = r8.f65393fu4
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L5e
            boolean r0 = r8.f65388d3
            if (r0 != 0) goto L5a
            com.google.android.exoplayer2.xwq3 r0 = r8.f65392fti
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            int r6 = r6 + 50
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r7.append(r6)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r6 = "SampleQueue"
            com.google.android.exoplayer2.util.ni7.qrj(r6, r0)
            r8.f65388d3 = r2
        L5a:
            r0 = r14 | 1
            r6 = r0
            goto L5f
        L5e:
            r6 = r14
        L5f:
            boolean r0 = r8.f65389eqxt
            if (r0 == 0) goto L70
            if (r3 == 0) goto L6f
            boolean r0 = r11.m12726y(r4)
            if (r0 != 0) goto L6c
            goto L6f
        L6c:
            r8.f65389eqxt = r1
            goto L70
        L6f:
            return
        L70:
            com.google.android.exoplayer2.source.e r0 = r8.f21544q
            long r0 = r0.m12689n()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.m12725s(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hb.mo11930n(long, int, int, int, com.google.android.exoplayer2.extractor.t$k):void");
    }

    @InterfaceC7842s
    public void n5r1() {
        ki();
        m12720c();
    }

    public final synchronized boolean nn86(long j2, boolean z2) {
        vyq();
        int iA9 = a9(this.f65402ni7);
        if (d3() && j2 >= this.f65397ki[iA9] && (j2 <= this.f65403o1t || z2)) {
            int iNi7 = ni7(iA9, this.f21541i - this.f65402ni7, j2, true);
            if (iNi7 == -1) {
                return false;
            }
            this.f65393fu4 = j2;
            this.f65402ni7 += iNi7;
            return true;
        }
        return false;
    }

    public final synchronized long o1t() {
        return this.f21541i == 0 ? Long.MIN_VALUE : this.f65397ki[this.f65409zurt];
    }

    protected final void oc() {
        this.f65395jk = true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3401t
    /* JADX INFO: renamed from: q */
    public final void mo11931q(xwq3 xwq3Var) {
        xwq3 xwq3VarFu4 = fu4(xwq3Var);
        this.f65395jk = false;
        this.f65386a9 = xwq3Var;
        boolean zM12722o = m12722o(xwq3VarFu4);
        InterfaceC3601q interfaceC3601q = this.f21543p;
        if (interfaceC3601q == null || !zM12722o) {
            return;
        }
        interfaceC3601q.mo12704s(xwq3VarFu4);
    }

    /* JADX INFO: renamed from: t */
    public final synchronized long m12733t() {
        return Math.max(this.f21548z, mcp(this.f65402ni7));
    }

    public final void t8r() {
        this.f21544q.toq(kja0());
    }

    @InterfaceC7842s
    public void uv6(boolean z2) {
        this.f21544q.n7h();
        this.f21541i = 0;
        this.f65391fn3e = 0;
        this.f65409zurt = 0;
        this.f65402ni7 = 0;
        this.f21546t = true;
        this.f65393fu4 = Long.MIN_VALUE;
        this.f21548z = Long.MIN_VALUE;
        this.f65403o1t = Long.MIN_VALUE;
        this.f65407wvg = false;
        this.f21539g.zy();
        if (z2) {
            this.f65386a9 = null;
            this.f65392fti = null;
            this.f65400mcp = true;
        }
    }

    public final synchronized long wvg() {
        return this.f65403o1t;
    }

    public final void y9n() {
        this.f65389eqxt = true;
    }

    public final void yz(int i2) {
        this.f65396jp0y = i2;
    }

    /* JADX INFO: renamed from: z */
    public final int m12734z() {
        return this.f65391fn3e;
    }

    public final void zurt(int i2) {
        this.f21544q.zy(fn3e(i2));
    }
}

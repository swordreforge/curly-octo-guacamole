package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.C3629x;
import com.google.android.exoplayer2.trackselection.InterfaceC3715s;
import com.google.android.exoplayer2.upstream.C3798i;
import com.google.android.exoplayer2.util.C3844k;

/* JADX INFO: compiled from: DefaultLoadControl.java */
/* JADX INFO: loaded from: classes2.dex */
public class x2 implements fnq8 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final boolean f67253cdj = false;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f67254fn3e = 13107200;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f67255fu4 = 131072;

    /* JADX INFO: renamed from: h */
    public static final int f23647h = -1;

    /* JADX INFO: renamed from: i */
    public static final int f23648i = 131072000;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f67256ki = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f67257kja0 = 5000;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f67258n7h = 2500;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f67259ni7 = 131072;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f67260o1t = 144310272;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f67261qrj = 50000;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final boolean f67262t8r = false;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f67263wvg = 13107200;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f67264x2 = 50000;

    /* JADX INFO: renamed from: z */
    public static final int f23649z = 131072;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f67265zurt = 131072;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final boolean f67266f7l8;

    /* JADX INFO: renamed from: g */
    private final int f23650g;

    /* JADX INFO: renamed from: k */
    private final C3798i f23651k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f67267ld6;

    /* JADX INFO: renamed from: n */
    private final long f23652n;

    /* JADX INFO: renamed from: p */
    private int f23653p;

    /* JADX INFO: renamed from: q */
    private final long f23654q;

    /* JADX INFO: renamed from: s */
    private final boolean f23655s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final long f67268toq;

    /* JADX INFO: renamed from: y */
    private final long f23656y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f67269zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.x2$k */
    /* JADX INFO: compiled from: DefaultLoadControl.java */
    public static final class C3899k {

        /* JADX INFO: renamed from: k */
        @zy.dd
        private C3798i f23658k;

        /* JADX INFO: renamed from: p */
        private boolean f23660p;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f67271toq = 50000;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f67272zy = 50000;

        /* JADX INFO: renamed from: q */
        private int f23661q = x2.f67258n7h;

        /* JADX INFO: renamed from: n */
        private int f23659n = 5000;

        /* JADX INFO: renamed from: g */
        private int f23657g = -1;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f67270f7l8 = false;

        /* JADX INFO: renamed from: y */
        private int f23663y = 0;

        /* JADX INFO: renamed from: s */
        private boolean f23662s = false;

        public C3899k f7l8(int i2) {
            C3844k.m13633s(!this.f23660p);
            this.f23657g = i2;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C3899k m13914g(boolean z2) {
            C3844k.m13633s(!this.f23660p);
            this.f67270f7l8 = z2;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public x2 m13915k() {
            C3844k.m13633s(!this.f23660p);
            this.f23660p = true;
            if (this.f23658k == null) {
                this.f23658k = new C3798i(true, 65536);
            }
            return new x2(this.f23658k, this.f67271toq, this.f67272zy, this.f23661q, this.f23659n, this.f23657g, this.f67270f7l8, this.f23663y, this.f23662s);
        }

        /* JADX INFO: renamed from: n */
        public C3899k m13916n(int i2, int i3, int i4, int i5) {
            C3844k.m13633s(!this.f23660p);
            x2.ld6(i4, 0, "bufferForPlaybackMs", "0");
            x2.ld6(i5, 0, "bufferForPlaybackAfterRebufferMs", "0");
            x2.ld6(i2, i4, "minBufferMs", "bufferForPlaybackMs");
            x2.ld6(i2, i5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            x2.ld6(i3, i2, "maxBufferMs", "minBufferMs");
            this.f67271toq = i2;
            this.f67272zy = i3;
            this.f23661q = i4;
            this.f23659n = i5;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C3899k m13917q(int i2, boolean z2) {
            C3844k.m13633s(!this.f23660p);
            x2.ld6(i2, 0, "backBufferDurationMs", "0");
            this.f23663y = i2;
            this.f23662s = z2;
            return this;
        }

        @Deprecated
        public x2 toq() {
            return m13915k();
        }

        public C3899k zy(C3798i c3798i) {
            C3844k.m13633s(!this.f23660p);
            this.f23658k = c3798i;
            return this;
        }
    }

    public x2() {
        this(new C3798i(true, 65536), 50000, 50000, f67258n7h, 5000, -1, false, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ld6(int i2, int i3, String str, String str2) {
        boolean z2 = i2 >= i3;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        C3844k.toq(z2, sb.toString());
    }

    private void n7h(boolean z2) {
        int i2 = this.f23650g;
        if (i2 == -1) {
            i2 = 13107200;
        }
        this.f23653p = i2;
        this.f67267ld6 = false;
        if (z2) {
            this.f23651k.f7l8();
        }
    }

    private static int qrj(int i2) {
        switch (i2) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return f67260o1t;
            case 1:
                return 13107200;
            case 2:
                return f23648i;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // com.google.android.exoplayer2.fnq8
    public void f7l8() {
        n7h(true);
    }

    @Override // com.google.android.exoplayer2.fnq8
    /* JADX INFO: renamed from: g */
    public com.google.android.exoplayer2.upstream.toq mo12060g() {
        return this.f23651k;
    }

    @Override // com.google.android.exoplayer2.fnq8
    /* JADX INFO: renamed from: k */
    public boolean mo12061k() {
        return this.f23655s;
    }

    @Override // com.google.android.exoplayer2.fnq8
    /* JADX INFO: renamed from: n */
    public boolean mo12062n(long j2, float f2, boolean z2, long j3) {
        long jCh = com.google.android.exoplayer2.util.lrht.ch(j2, f2);
        long jMin = z2 ? this.f23652n : this.f23654q;
        if (j3 != C3548p.f65257toq) {
            jMin = Math.min(j3 / 2, jMin);
        }
        return jMin <= 0 || jCh >= jMin || (!this.f67266f7l8 && this.f23651k.toq() >= this.f23653p);
    }

    @Override // com.google.android.exoplayer2.fnq8
    /* JADX INFO: renamed from: q */
    public void mo12063q(bek6[] bek6VarArr, C3629x c3629x, InterfaceC3715s[] interfaceC3715sArr) {
        int iX2 = this.f23650g;
        if (iX2 == -1) {
            iX2 = x2(bek6VarArr, interfaceC3715sArr);
        }
        this.f23653p = iX2;
        this.f23651k.m13475y(iX2);
    }

    @Override // com.google.android.exoplayer2.fnq8
    /* JADX INFO: renamed from: s */
    public boolean mo12064s(long j2, long j3, float f2) {
        boolean z2 = true;
        boolean z3 = this.f23651k.toq() >= this.f23653p;
        long jMin = this.f67268toq;
        if (f2 > 1.0f) {
            jMin = Math.min(com.google.android.exoplayer2.util.lrht.i1(jMin, f2), this.f67269zy);
        }
        if (j3 < Math.max(jMin, 500000L)) {
            if (!this.f67266f7l8 && z3) {
                z2 = false;
            }
            this.f67267ld6 = z2;
            if (!z2 && j3 < 500000) {
                com.google.android.exoplayer2.util.ni7.qrj("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= this.f67269zy || z3) {
            this.f67267ld6 = false;
        }
        return this.f67267ld6;
    }

    @Override // com.google.android.exoplayer2.fnq8
    public long toq() {
        return this.f23656y;
    }

    protected int x2(bek6[] bek6VarArr, InterfaceC3715s[] interfaceC3715sArr) {
        int iQrj = 0;
        for (int i2 = 0; i2 < bek6VarArr.length; i2++) {
            if (interfaceC3715sArr[i2] != null) {
                iQrj += qrj(bek6VarArr[i2].mo11551n());
            }
        }
        return Math.max(13107200, iQrj);
    }

    @Override // com.google.android.exoplayer2.fnq8
    /* JADX INFO: renamed from: y */
    public void mo12065y() {
        n7h(true);
    }

    @Override // com.google.android.exoplayer2.fnq8
    public void zy() {
        n7h(false);
    }

    protected x2(C3798i c3798i, int i2, int i3, int i4, int i5, int i6, boolean z2, int i7, boolean z3) {
        ld6(i4, 0, "bufferForPlaybackMs", "0");
        ld6(i5, 0, "bufferForPlaybackAfterRebufferMs", "0");
        ld6(i2, i4, "minBufferMs", "bufferForPlaybackMs");
        ld6(i2, i5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        ld6(i3, i2, "maxBufferMs", "minBufferMs");
        ld6(i7, 0, "backBufferDurationMs", "0");
        this.f23651k = c3798i;
        this.f67268toq = com.google.android.exoplayer2.util.lrht.v0af(i2);
        this.f67269zy = com.google.android.exoplayer2.util.lrht.v0af(i3);
        this.f23654q = com.google.android.exoplayer2.util.lrht.v0af(i4);
        this.f23652n = com.google.android.exoplayer2.util.lrht.v0af(i5);
        this.f23650g = i6;
        this.f23653p = i6 == -1 ? 13107200 : i6;
        this.f67266f7l8 = z2;
        this.f23656y = com.google.android.exoplayer2.util.lrht.v0af(i7);
        this.f23655s = z3;
    }
}

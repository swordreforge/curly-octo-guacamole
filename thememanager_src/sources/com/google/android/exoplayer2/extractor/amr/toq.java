package com.google.android.exoplayer2.extractor.amr;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.audio.n5r1;
import com.google.android.exoplayer2.extractor.C3387n;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.extractor.kja0;
import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.x2;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: AmrExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq implements InterfaceC3397p {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f63674fn3e = 2;

    /* JADX INFO: renamed from: i */
    public static final int f19749i = 1;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f63676jk = 20000;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f63677mcp = 8000;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int[] f63678ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f63679o1t;

    /* JADX INFO: renamed from: t */
    private static final int f19750t = 16000;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f63681wvg = 20;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private o1t f63683cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f63684f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f19752g;

    /* JADX INFO: renamed from: h */
    private InterfaceC3401t f19753h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f63685ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private x2 f63686kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private long f63687ld6;

    /* JADX INFO: renamed from: n */
    private final int f19754n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private long f63688n7h;

    /* JADX INFO: renamed from: p */
    private boolean f19755p;

    /* JADX INFO: renamed from: q */
    private final byte[] f19756q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f63689qrj;

    /* JADX INFO: renamed from: s */
    private int f19757s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f63690x2;

    /* JADX INFO: renamed from: y */
    private int f19758y;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final kja0 f63680t8r = new kja0() { // from class: com.google.android.exoplayer2.extractor.amr.k
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return toq.cdj();
        }
    };

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int[] f63682zurt = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final byte[] f63675fu4 = lrht.dr("#!AMR\n");

    /* JADX INFO: renamed from: z */
    private static final byte[] f19751z = lrht.dr("#!AMR-WB\n");

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.amr.toq$k */
    /* JADX INFO: compiled from: AmrExtractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3335k {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f63678ni7 = iArr;
        f63679o1t = iArr[8];
    }

    public toq() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3397p[] cdj() {
        return new InterfaceC3397p[]{new toq()};
    }

    static byte[] f7l8() {
        byte[] bArr = f19751z;
        return Arrays.copyOf(bArr, bArr.length);
    }

    private int fn3e(ld6 ld6Var) throws IOException {
        ld6Var.mo11730y();
        ld6Var.fn3e(this.f19756q, 0, 1);
        byte b2 = this.f19756q[0];
        if ((b2 & 131) <= 0) {
            return qrj((b2 >> 3) & 15);
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append("Invalid padding bits for frame header ");
        sb.append((int) b2);
        throw sok.createForMalformedContainer(sb.toString(), null);
    }

    /* JADX INFO: renamed from: g */
    static byte[] m11681g() {
        byte[] bArr = f63675fu4;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: h */
    private boolean m11682h(int i2) {
        return this.f19752g && (i2 < 10 || i2 > 13);
    }

    /* JADX INFO: renamed from: i */
    private static boolean m11683i(ld6 ld6Var, byte[] bArr) throws IOException {
        ld6Var.mo11730y();
        byte[] bArr2 = new byte[bArr.length];
        ld6Var.fn3e(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @RequiresNonNull({"trackOutput"})
    private void ki() {
        if (this.f63685ki) {
            return;
        }
        this.f63685ki = true;
        boolean z2 = this.f19752g;
        this.f19753h.mo11931q(new xwq3.toq().m13945m(z2 ? wvg.f67140vyq : wvg.f67138uv6).lrht(f63679o1t).gvn7(1).ek5k(z2 ? 16000 : 8000).a9());
    }

    private boolean kja0(int i2) {
        return i2 >= 0 && i2 <= 15 && (m11682h(i2) || n7h(i2));
    }

    private static int ld6(int i2, long j2) {
        return (int) ((((long) (i2 * 8)) * 1000000) / j2);
    }

    private boolean n7h(int i2) {
        return !this.f19752g && (i2 < 12 || i2 > 14);
    }

    @RequiresNonNull({"trackOutput"})
    private int ni7(ld6 ld6Var) throws IOException {
        if (this.f19757s == 0) {
            try {
                int iFn3e = fn3e(ld6Var);
                this.f19758y = iFn3e;
                this.f19757s = iFn3e;
                if (this.f63690x2 == -1) {
                    this.f63687ld6 = ld6Var.getPosition();
                    this.f63690x2 = this.f19758y;
                }
                if (this.f63690x2 == this.f19758y) {
                    this.f63689qrj++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int qVar = this.f19753h.toq(ld6Var, this.f19757s, true);
        if (qVar == -1) {
            return -1;
        }
        int i2 = this.f19757s - qVar;
        this.f19757s = i2;
        if (i2 > 0) {
            return 0;
        }
        this.f19753h.mo11930n(this.f63688n7h + this.f63684f7l8, 1, this.f19758y, 0, null);
        this.f63684f7l8 += n5r1.f63474zurt;
        return 0;
    }

    /* JADX INFO: renamed from: p */
    static int m11685p(int i2) {
        return f63678ni7[i2];
    }

    private int qrj(int i2) throws sok {
        if (kja0(i2)) {
            return this.f19752g ? f63678ni7[i2] : f63682zurt[i2];
        }
        String str = this.f19752g ? "WB" : "NB";
        StringBuilder sb = new StringBuilder(str.length() + 35);
        sb.append("Illegal AMR ");
        sb.append(str);
        sb.append(" frame type ");
        sb.append(i2);
        throw sok.createForMalformedContainer(sb.toString(), null);
    }

    /* JADX INFO: renamed from: s */
    static int m11686s(int i2) {
        return f63682zurt[i2];
    }

    @RequiresNonNull({"extractorOutput"})
    private void t8r(long j2, int i2) {
        int i3;
        if (this.f19755p) {
            return;
        }
        int i4 = this.f19754n;
        if ((i4 & 1) == 0 || j2 == -1 || !((i3 = this.f63690x2) == -1 || i3 == this.f19758y)) {
            o1t.toq toqVar = new o1t.toq(C3548p.f65257toq);
            this.f63683cdj = toqVar;
            this.f63686kja0.cdj(toqVar);
            this.f19755p = true;
            return;
        }
        if (this.f63689qrj >= 20 || i2 == -1) {
            o1t o1tVarX2 = x2(j2, (i4 & 2) != 0);
            this.f63683cdj = o1tVarX2;
            this.f63686kja0.cdj(o1tVarX2);
            this.f19755p = true;
        }
    }

    private o1t x2(long j2, boolean z2) {
        return new C3387n(j2, this.f63687ld6, ld6(this.f63690x2, n5r1.f63474zurt), this.f63690x2, z2);
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* JADX INFO: renamed from: y */
    private void m11687y() {
        C3844k.ld6(this.f19753h);
        lrht.ld6(this.f63686kja0);
    }

    private boolean zurt(ld6 ld6Var) throws IOException {
        byte[] bArr = f63675fu4;
        if (m11683i(ld6Var, bArr)) {
            this.f19752g = false;
            ld6Var.cdj(bArr.length);
            return true;
        }
        byte[] bArr2 = f19751z;
        if (!m11683i(ld6Var, bArr2)) {
            return false;
        }
        this.f19752g = true;
        ld6Var.cdj(bArr2.length);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        this.f63684f7l8 = 0L;
        this.f19758y = 0;
        this.f19757s = 0;
        if (j2 != 0) {
            o1t o1tVar = this.f63683cdj;
            if (o1tVar instanceof C3387n) {
                this.f63688n7h = ((C3387n) o1tVar).toq(j2);
                return;
            }
        }
        this.f63688n7h = 0L;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(x2 x2Var) {
        this.f63686kja0 = x2Var;
        this.f19753h = x2Var.toq(0, 1);
        x2Var.mo11753i();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(ld6 ld6Var) throws IOException {
        return zurt(ld6Var);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(ld6 ld6Var, fu4 fu4Var) throws IOException {
        m11687y();
        if (ld6Var.getPosition() == 0 && !zurt(ld6Var)) {
            throw sok.createForMalformedContainer("Could not find AMR header.", null);
        }
        ki();
        int iNi7 = ni7(ld6Var);
        t8r(ld6Var.getLength(), iNi7);
        return iNi7;
    }

    public toq(int i2) {
        this.f19754n = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.f19756q = new byte[1];
        this.f63690x2 = -1;
    }
}

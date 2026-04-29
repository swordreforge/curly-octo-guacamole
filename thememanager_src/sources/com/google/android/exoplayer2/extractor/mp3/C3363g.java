package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.audio.x9kr;
import com.google.android.exoplayer2.extractor.C3400s;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.fn3e;
import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.extractor.kja0;
import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.extractor.mp3.f7l8;
import com.google.android.exoplayer2.extractor.x2;
import com.google.android.exoplayer2.extractor.zurt;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.toq;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp3.g */
/* JADX INFO: compiled from: Mp3Extractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3363g implements InterfaceC3397p {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f64041a9 = 32768;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f64042d3 = 1231971951;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final int f64043eqxt = 0;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f64044fti = 10;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f64046gvn7 = 1483304551;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f64047jk = 131072;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f64048jp0y = -128000;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f64050o1t = 2;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final int f64051oc = 1447187017;

    /* JADX INFO: renamed from: t */
    public static final int f19932t = 8;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f64052wvg = 4;

    /* JADX INFO: renamed from: z */
    public static final int f19933z = 1;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private long f64053cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final x9kr.C3269k f64054f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private boolean f64055fn3e;

    /* JADX INFO: renamed from: g */
    private final gvn7 f19934g;

    /* JADX INFO: renamed from: h */
    private long f19935h;

    /* JADX INFO: renamed from: i */
    private f7l8 f19936i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private long f64056ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @dd
    private Metadata f64057kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private x2 f64058ld6;

    /* JADX INFO: renamed from: n */
    private final long f19937n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f64059n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private long f64060ni7;

    /* JADX INFO: renamed from: p */
    private final InterfaceC3401t f19938p;

    /* JADX INFO: renamed from: q */
    private final int f19939q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private InterfaceC3401t f64061qrj;

    /* JADX INFO: renamed from: s */
    private final zurt f19940s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f64062t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private InterfaceC3401t f64063x2;

    /* JADX INFO: renamed from: y */
    private final fn3e f19941y;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private boolean f64064zurt;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final kja0 f64045fu4 = new kja0() { // from class: com.google.android.exoplayer2.extractor.mp3.q
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return C3363g.kja0();
        }
    };

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final toq.InterfaceC3499k f64049mcp = new toq.InterfaceC3499k() { // from class: com.google.android.exoplayer2.extractor.mp3.n
        @Override // com.google.android.exoplayer2.metadata.id3.toq.InterfaceC3499k
        /* JADX INFO: renamed from: k */
        public final boolean mo11822k(int i2, int i3, int i4, int i5, int i6) {
            return C3363g.m11816h(i2, i3, i4, i5, i6);
        }
    };

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp3.g$k */
    /* JADX INFO: compiled from: Mp3Extractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    public C3363g() {
        this(0);
    }

    @dd
    private static zy cdj(@dd Metadata metadata, long j2) {
        if (metadata == null) {
            return null;
        }
        int iM12282g = metadata.m12282g();
        for (int i2 = 0; i2 < iM12282g; i2++) {
            Metadata.Entry entryZy = metadata.zy(i2);
            if (entryZy instanceof MlltFrame) {
                return zy.m11826k(j2, (MlltFrame) entryZy, x2(metadata));
            }
        }
        return null;
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    private void f7l8() {
        C3844k.ld6(this.f64063x2);
        lrht.ld6(this.f64058ld6);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    private int fn3e(ld6 ld6Var) throws IOException {
        if (this.f64062t8r == 0) {
            ld6Var.mo11730y();
            if (t8r(ld6Var)) {
                return -1;
            }
            this.f19934g.n5r1(0);
            int iKja0 = this.f19934g.kja0();
            if (!n7h(iKja0, this.f64059n7h) || x9kr.m11531p(iKja0) == -1) {
                ld6Var.cdj(1);
                this.f64059n7h = 0;
                return 0;
            }
            this.f64054f7l8.m11535k(iKja0);
            if (this.f19935h == C3548p.f65257toq) {
                this.f19935h = this.f19936i.mo11814y(ld6Var.getPosition());
                if (this.f19937n != C3548p.f65257toq) {
                    this.f19935h += this.f19937n - this.f19936i.mo11814y(0L);
                }
            }
            x9kr.C3269k c3269k = this.f64054f7l8;
            this.f64062t8r = c3269k.f63529zy;
            f7l8 f7l8Var = this.f19936i;
            if (f7l8Var instanceof toq) {
                toq toqVar = (toq) f7l8Var;
                toqVar.toq(m11819s(this.f64053cdj + ((long) c3269k.f63527f7l8)), ld6Var.getPosition() + ((long) this.f64054f7l8.f63529zy));
                if (this.f64064zurt && toqVar.m11824k(this.f64060ni7)) {
                    this.f64064zurt = false;
                    this.f64061qrj = this.f64063x2;
                }
            }
        }
        int qVar = this.f64061qrj.toq(ld6Var, this.f64062t8r, true);
        if (qVar == -1) {
            return -1;
        }
        int i2 = this.f64062t8r - qVar;
        this.f64062t8r = i2;
        if (i2 > 0) {
            return 0;
        }
        this.f64061qrj.mo11930n(m11819s(this.f64053cdj), 1, this.f64054f7l8.f63529zy, 0, null);
        this.f64053cdj += (long) this.f64054f7l8.f63527f7l8;
        this.f64062t8r = 0;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ boolean m11816h(int i2, int i3, int i4, int i5, int i6) {
        return (i3 == 67 && i4 == 79 && i5 == 77 && (i6 == 77 || i2 == 2)) || (i3 == 77 && i4 == 76 && i5 == 76 && (i6 == 84 || i2 == 2));
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* JADX INFO: renamed from: i */
    private int m11817i(ld6 ld6Var) throws IOException {
        if (this.f64059n7h == 0) {
            try {
                zurt(ld6Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f19936i == null) {
            f7l8 f7l8VarM11820y = m11820y(ld6Var);
            this.f19936i = f7l8VarM11820y;
            this.f64058ld6.cdj(f7l8VarM11820y);
            this.f64061qrj.mo11931q(new xwq3.toq().m13945m(this.f64054f7l8.f63528toq).lrht(4096).gvn7(this.f64054f7l8.f19507n).ek5k(this.f64054f7l8.f19508q).m13947r(this.f19941y.f19817k).dd(this.f19941y.f63758toq).uv6((this.f19939q & 8) != 0 ? null : this.f64057kja0).a9());
            this.f64056ki = ld6Var.getPosition();
        } else if (this.f64056ki != 0) {
            long position = ld6Var.getPosition();
            long j2 = this.f64056ki;
            if (position < j2) {
                ld6Var.cdj((int) (j2 - position));
            }
        }
        return fn3e(ld6Var);
    }

    @dd
    private f7l8 ki(ld6 ld6Var) throws IOException {
        gvn7 gvn7Var = new gvn7(this.f64054f7l8.f63529zy);
        ld6Var.fn3e(gvn7Var.m13598q(), 0, this.f64054f7l8.f63529zy);
        x9kr.C3269k c3269k = this.f64054f7l8;
        int i2 = 21;
        if ((c3269k.f19506k & 1) != 0) {
            if (c3269k.f19507n != 1) {
                i2 = 36;
            }
        } else if (c3269k.f19507n == 1) {
            i2 = 13;
        }
        int i3 = i2;
        int iQrj = qrj(gvn7Var, i3);
        if (iQrj != f64046gvn7 && iQrj != f64042d3) {
            if (iQrj != f64051oc) {
                ld6Var.mo11730y();
                return null;
            }
            C3369y c3369yM11825k = C3369y.m11825k(ld6Var.getLength(), ld6Var.getPosition(), this.f64054f7l8, gvn7Var);
            ld6Var.cdj(this.f64054f7l8.f63529zy);
            return c3369yM11825k;
        }
        C3368s c3368sM11823k = C3368s.m11823k(ld6Var.getLength(), ld6Var.getPosition(), this.f64054f7l8, gvn7Var);
        if (c3368sM11823k != null && !this.f19941y.m11724k()) {
            ld6Var.mo11730y();
            ld6Var.qrj(i3 + 141);
            ld6Var.fn3e(this.f19934g.m13598q(), 0, 3);
            this.f19934g.n5r1(0);
            this.f19941y.m11725q(this.f19934g.oc());
        }
        ld6Var.cdj(this.f64054f7l8.f63529zy);
        return (c3368sM11823k == null || c3368sM11823k.f7l8() || iQrj != f64042d3) ? c3368sM11823k : ld6(ld6Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3397p[] kja0() {
        return new InterfaceC3397p[]{new C3363g()};
    }

    private f7l8 ld6(ld6 ld6Var, boolean z2) throws IOException {
        ld6Var.fn3e(this.f19934g.m13598q(), 0, 4);
        this.f19934g.n5r1(0);
        this.f64054f7l8.m11535k(this.f19934g.kja0());
        return new C3364k(ld6Var.getLength(), ld6Var.getPosition(), this.f64054f7l8, z2);
    }

    private static boolean n7h(int i2, long j2) {
        return ((long) (i2 & f64048jp0y)) == (j2 & (-128000));
    }

    private static int qrj(gvn7 gvn7Var, int i2) {
        if (gvn7Var.m13591g() >= i2 + 4) {
            gvn7Var.n5r1(i2);
            int iKja0 = gvn7Var.kja0();
            if (iKja0 == f64046gvn7 || iKja0 == f64042d3) {
                return iKja0;
            }
        }
        if (gvn7Var.m13591g() < 40) {
            return 0;
        }
        gvn7Var.n5r1(36);
        if (gvn7Var.kja0() == f64051oc) {
            return f64051oc;
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    private long m11819s(long j2) {
        return this.f19935h + ((j2 * 1000000) / ((long) this.f64054f7l8.f19508q));
    }

    private boolean t8r(ld6 ld6Var) throws IOException {
        f7l8 f7l8Var = this.f19936i;
        if (f7l8Var != null) {
            long jMo11813g = f7l8Var.mo11813g();
            if (jMo11813g != -1 && ld6Var.x2() > jMo11813g - 4) {
                return true;
            }
        }
        try {
            return !ld6Var.f7l8(this.f19934g.m13598q(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private static long x2(@dd Metadata metadata) {
        if (metadata == null) {
            return C3548p.f65257toq;
        }
        int iM12282g = metadata.m12282g();
        for (int i2 = 0; i2 < iM12282g; i2++) {
            Metadata.Entry entryZy = metadata.zy(i2);
            if (entryZy instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entryZy;
                if (textInformationFrame.f20804k.equals("TLEN")) {
                    return lrht.v0af(Long.parseLong(textInformationFrame.f20818n));
                }
            }
        }
        return C3548p.f65257toq;
    }

    /* JADX INFO: renamed from: y */
    private f7l8 m11820y(ld6 ld6Var) throws IOException {
        long jX2;
        long j2;
        long jMo11755s;
        long jMo11813g;
        f7l8 f7l8VarKi = ki(ld6Var);
        zy zyVarCdj = cdj(this.f64057kja0, ld6Var.getPosition());
        if (this.f64055fn3e) {
            return new f7l8.C3362k();
        }
        if ((this.f19939q & 4) != 0) {
            if (zyVarCdj != null) {
                jMo11755s = zyVarCdj.mo11755s();
                jMo11813g = zyVarCdj.mo11813g();
            } else if (f7l8VarKi != null) {
                jMo11755s = f7l8VarKi.mo11755s();
                jMo11813g = f7l8VarKi.mo11813g();
            } else {
                jX2 = x2(this.f64057kja0);
                j2 = -1;
                f7l8VarKi = new toq(jX2, ld6Var.getPosition(), j2);
            }
            j2 = jMo11813g;
            jX2 = jMo11755s;
            f7l8VarKi = new toq(jX2, ld6Var.getPosition(), j2);
        } else if (zyVarCdj != null) {
            f7l8VarKi = zyVarCdj;
        } else if (f7l8VarKi == null) {
            f7l8VarKi = null;
        }
        if (f7l8VarKi == null || !(f7l8VarKi.f7l8() || (this.f19939q & 1) == 0)) {
            return ld6(ld6Var, (this.f19939q & 2) != 0);
        }
        return f7l8VarKi;
    }

    private boolean zurt(ld6 ld6Var, boolean z2) throws IOException {
        int iX2;
        int i2;
        int iM11531p;
        int i3 = z2 ? 32768 : 131072;
        ld6Var.mo11730y();
        if (ld6Var.getPosition() == 0) {
            Metadata metadataM12057k = this.f19940s.m12057k(ld6Var, (this.f19939q & 8) == 0 ? null : f64049mcp);
            this.f64057kja0 = metadataM12057k;
            if (metadataM12057k != null) {
                this.f19941y.zy(metadataM12057k);
            }
            iX2 = (int) ld6Var.x2();
            if (!z2) {
                ld6Var.cdj(iX2);
            }
            i2 = 0;
        } else {
            iX2 = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!t8r(ld6Var)) {
                this.f19934g.n5r1(0);
                int iKja0 = this.f19934g.kja0();
                if ((i2 == 0 || n7h(iKja0, i2)) && (iM11531p = x9kr.m11531p(iKja0)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f64054f7l8.m11535k(iKja0);
                        i2 = iKja0;
                    }
                    ld6Var.qrj(iM11531p - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z2) {
                            return false;
                        }
                        throw sok.createForMalformedContainer("Searched too many bytes.", null);
                    }
                    if (z2) {
                        ld6Var.mo11730y();
                        ld6Var.qrj(iX2 + i6);
                    } else {
                        ld6Var.cdj(1);
                    }
                    i4 = 0;
                    i5 = i6;
                    i2 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z2) {
            ld6Var.cdj(iX2 + i5);
        } else {
            ld6Var.mo11730y();
        }
        this.f64059n7h = i2;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        this.f64059n7h = 0;
        this.f19935h = C3548p.f65257toq;
        this.f64053cdj = 0L;
        this.f64062t8r = 0;
        this.f64060ni7 = j3;
        f7l8 f7l8Var = this.f19936i;
        if (!(f7l8Var instanceof toq) || ((toq) f7l8Var).m11824k(j3)) {
            return;
        }
        this.f64064zurt = true;
        this.f64061qrj = this.f19938p;
    }

    /* JADX INFO: renamed from: p */
    public void m11821p() {
        this.f64055fn3e = true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(x2 x2Var) {
        this.f64058ld6 = x2Var;
        InterfaceC3401t qVar = x2Var.toq(0, 1);
        this.f64063x2 = qVar;
        this.f64061qrj = qVar;
        this.f64058ld6.mo11753i();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(ld6 ld6Var) throws IOException {
        return zurt(ld6Var, true);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(ld6 ld6Var, fu4 fu4Var) throws IOException {
        f7l8();
        int iM11817i = m11817i(ld6Var);
        if (iM11817i == -1 && (this.f19936i instanceof toq)) {
            long jM11819s = m11819s(this.f64053cdj);
            if (this.f19936i.mo11755s() != jM11819s) {
                ((toq) this.f19936i).zy(jM11819s);
                this.f64058ld6.cdj(this.f19936i);
            }
        }
        return iM11817i;
    }

    public C3363g(int i2) {
        this(i2, C3548p.f65257toq);
    }

    public C3363g(int i2, long j2) {
        this.f19939q = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.f19937n = j2;
        this.f19934g = new gvn7(10);
        this.f64054f7l8 = new x9kr.C3269k();
        this.f19941y = new fn3e();
        this.f19935h = C3548p.f65257toq;
        this.f19940s = new zurt();
        C3400s c3400s = new C3400s();
        this.f19938p = c3400s;
        this.f64061qrj = c3400s;
    }
}

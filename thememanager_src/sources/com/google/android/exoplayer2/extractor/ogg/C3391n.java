package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.qrj;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.n */
/* JADX INFO: compiled from: OggPacket.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3391n {

    /* JADX INFO: renamed from: n */
    private boolean f20129n;

    /* JADX INFO: renamed from: q */
    private int f20130q;

    /* JADX INFO: renamed from: k */
    private final C3389g f20128k = new C3389g();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final gvn7 f64352toq = new gvn7(new byte[C3389g.f64334n7h], 0);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f64353zy = -1;

    C3391n() {
    }

    /* JADX INFO: renamed from: k */
    private int m11905k(int i2) {
        int i3;
        int i4 = 0;
        this.f20130q = 0;
        do {
            int i5 = this.f20130q;
            int i6 = i2 + i5;
            C3389g c3389g = this.f20128k;
            if (i6 >= c3389g.f64337f7l8) {
                break;
            }
            int[] iArr = c3389g.f20114p;
            this.f20130q = i5 + 1;
            i3 = iArr[i5 + i2];
            i4 += i3;
        } while (i3 == 255);
        return i4;
    }

    /* JADX INFO: renamed from: g */
    public void m11906g() {
        if (this.f64352toq.m13598q().length == 65025) {
            return;
        }
        gvn7 gvn7Var = this.f64352toq;
        gvn7Var.ncyb(Arrays.copyOf(gvn7Var.m13598q(), Math.max(C3389g.f64334n7h, this.f64352toq.m13591g())), this.f64352toq.m13591g());
    }

    /* JADX INFO: renamed from: n */
    public void m11907n() {
        this.f20128k.toq();
        this.f64352toq.dd(0);
        this.f64353zy = -1;
        this.f20129n = false;
    }

    /* JADX INFO: renamed from: q */
    public boolean m11908q(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        int i2;
        C3844k.m13633s(ld6Var != null);
        if (this.f20129n) {
            this.f20129n = false;
            this.f64352toq.dd(0);
        }
        while (!this.f20129n) {
            if (this.f64353zy < 0) {
                if (!this.f20128k.zy(ld6Var) || !this.f20128k.m11897k(ld6Var, true)) {
                    return false;
                }
                C3389g c3389g = this.f20128k;
                int iM11905k = c3389g.f20117y;
                if ((c3389g.f64339toq & 1) == 1 && this.f64352toq.m13591g() == 0) {
                    iM11905k += m11905k(0);
                    i2 = this.f20130q + 0;
                } else {
                    i2 = 0;
                }
                if (!qrj.m11924n(ld6Var, iM11905k)) {
                    return false;
                }
                this.f64353zy = i2;
            }
            int iM11905k2 = m11905k(this.f64353zy);
            int i3 = this.f64353zy + this.f20130q;
            if (iM11905k2 > 0) {
                gvn7 gvn7Var = this.f64352toq;
                gvn7Var.zy(gvn7Var.m13591g() + iM11905k2);
                if (!qrj.m11925q(ld6Var, this.f64352toq.m13598q(), this.f64352toq.m13591g(), iM11905k2)) {
                    return false;
                }
                gvn7 gvn7Var2 = this.f64352toq;
                gvn7Var2.m13595l(gvn7Var2.m13591g() + iM11905k2);
                this.f20129n = this.f20128k.f20114p[i3 + (-1)] != 255;
            }
            if (i3 == this.f20128k.f64337f7l8) {
                i3 = -1;
            }
            this.f64353zy = i3;
        }
        return true;
    }

    public C3389g toq() {
        return this.f20128k;
    }

    public gvn7 zy() {
        return this.f64352toq;
    }
}

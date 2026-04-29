package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.audio.ncyb;
import com.google.android.exoplayer2.extractor.ogg.AbstractC3394s;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.x2;
import com.google.android.exoplayer2.xwq3;
import java.util.Arrays;
import okio.C7571o;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.y */
/* JADX INFO: compiled from: OpusReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3396y extends AbstractC3394s {

    /* JADX INFO: renamed from: i */
    private static final byte[] f20151i = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f64376t8r = 1332770163;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f64377ki;

    C3396y() {
    }

    public static boolean kja0(gvn7 gvn7Var) {
        int iM13594k = gvn7Var.m13594k();
        byte[] bArr = f20151i;
        if (iM13594k < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        gvn7Var.ld6(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private long n7h(byte[] bArr) {
        int i2 = bArr[0] & 255;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = bArr[1] & C7571o.f43818k;
        }
        int i5 = i2 >> 3;
        int i6 = i5 & 3;
        return ((long) i4) * ((long) (i5 >= 16 ? x2.f67258n7h << i6 : i5 >= 12 ? 10000 << (i6 & 1) : i6 == 3 ? 60000 : 10000 << i6));
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC3394s
    /* JADX INFO: renamed from: g */
    protected long mo11910g(gvn7 gvn7Var) {
        return zy(n7h(gvn7Var.m13598q()));
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC3394s
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: s */
    protected boolean mo11912s(gvn7 gvn7Var, long j2, AbstractC3394s.toq toqVar) {
        if (this.f64377ki) {
            C3844k.f7l8(toqVar.f20147k);
            boolean z2 = gvn7Var.kja0() == 1332770163;
            gvn7Var.n5r1(0);
            return z2;
        }
        byte[] bArrCopyOf = Arrays.copyOf(gvn7Var.m13598q(), gvn7Var.m13591g());
        toqVar.f20147k = new xwq3.toq().m13945m(wvg.f23297c).gvn7(ncyb.zy(bArrCopyOf)).ek5k(ncyb.f19427k).hyr(ncyb.m11495k(bArrCopyOf)).a9();
        this.f64377ki = true;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC3394s
    protected void x2(boolean z2) {
        super.x2(z2);
        if (z2) {
            this.f64377ki = false;
        }
    }
}

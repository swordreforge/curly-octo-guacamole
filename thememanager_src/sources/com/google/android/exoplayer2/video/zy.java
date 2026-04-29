package com.google.android.exoplayer2.video;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
import zy.dd;

/* JADX INFO: compiled from: ColorInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy implements InterfaceC3555s {

    /* JADX INFO: renamed from: h */
    private static final int f23585h = 2;

    /* JADX INFO: renamed from: i */
    private static final int f23586i = 3;

    /* JADX INFO: renamed from: p */
    private static final int f23587p = 1;

    /* JADX INFO: renamed from: s */
    private static final int f23588s = 0;

    /* JADX INFO: renamed from: z */
    public static final InterfaceC3555s.k<zy> f23589z = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.video.toq
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return zy.m13876n(bundle);
        }
    };

    /* JADX INFO: renamed from: g */
    @dd
    public final byte[] f23590g;

    /* JADX INFO: renamed from: k */
    public final int f23591k;

    /* JADX INFO: renamed from: n */
    public final int f23592n;

    /* JADX INFO: renamed from: q */
    public final int f23593q;

    /* JADX INFO: renamed from: y */
    private int f23594y;

    public zy(int i2, int i3, int i4, @dd byte[] bArr) {
        this.f23591k = i2;
        this.f23593q = i3;
        this.f23592n = i4;
        this.f23590g = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ zy m13876n(Bundle bundle) {
        return new zy(bundle.getInt(m13877q(0), -1), bundle.getInt(m13877q(1), -1), bundle.getInt(m13877q(2), -1), bundle.getByteArray(m13877q(3)));
    }

    /* JADX INFO: renamed from: q */
    private static String m13877q(int i2) {
        return Integer.toString(i2, 36);
    }

    @Pure
    public static int toq(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int zy(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zy.class != obj.getClass()) {
            return false;
        }
        zy zyVar = (zy) obj;
        return this.f23591k == zyVar.f23591k && this.f23593q == zyVar.f23593q && this.f23592n == zyVar.f23592n && Arrays.equals(this.f23590g, zyVar.f23590g);
    }

    public int hashCode() {
        if (this.f23594y == 0) {
            this.f23594y = ((((((527 + this.f23591k) * 31) + this.f23593q) * 31) + this.f23592n) * 31) + Arrays.hashCode(this.f23590g);
        }
        return this.f23594y;
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m13877q(0), this.f23591k);
        bundle.putInt(m13877q(1), this.f23593q);
        bundle.putInt(m13877q(2), this.f23592n);
        bundle.putByteArray(m13877q(3), this.f23590g);
        return bundle;
    }

    public String toString() {
        int i2 = this.f23591k;
        int i3 = this.f23593q;
        int i4 = this.f23592n;
        boolean z2 = this.f23590g != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}

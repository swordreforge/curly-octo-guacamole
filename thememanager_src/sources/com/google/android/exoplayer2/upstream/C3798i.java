package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.C3844k;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.i */
/* JADX INFO: compiled from: DefaultAllocator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3798i implements toq {

    /* JADX INFO: renamed from: s */
    private static final int f23022s = 100;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f66859f7l8;

    /* JADX INFO: renamed from: g */
    private int f23023g;

    /* JADX INFO: renamed from: k */
    private final boolean f23024k;

    /* JADX INFO: renamed from: n */
    private int f23025n;

    /* JADX INFO: renamed from: q */
    private final C3803k[] f23026q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f66860toq;

    /* JADX INFO: renamed from: y */
    private C3803k[] f23027y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    private final byte[] f66861zy;

    public C3798i(boolean z2, int i2) {
        this(z2, i2, 0);
    }

    public synchronized void f7l8() {
        if (this.f23024k) {
            m13475y(0);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.toq
    /* JADX INFO: renamed from: g */
    public int mo13471g() {
        return this.f66860toq;
    }

    @Override // com.google.android.exoplayer2.upstream.toq
    /* JADX INFO: renamed from: k */
    public synchronized C3803k mo13472k() {
        C3803k c3803k;
        this.f23023g++;
        int i2 = this.f66859f7l8;
        if (i2 > 0) {
            C3803k[] c3803kArr = this.f23027y;
            int i3 = i2 - 1;
            this.f66859f7l8 = i3;
            c3803k = (C3803k) C3844k.f7l8(c3803kArr[i3]);
            this.f23027y[this.f66859f7l8] = null;
        } else {
            c3803k = new C3803k(new byte[this.f66860toq], 0);
        }
        return c3803k;
    }

    @Override // com.google.android.exoplayer2.upstream.toq
    /* JADX INFO: renamed from: n */
    public synchronized void mo13473n() {
        int i2 = 0;
        int iMax = Math.max(0, com.google.android.exoplayer2.util.lrht.qrj(this.f23025n, this.f66860toq) - this.f23023g);
        int i3 = this.f66859f7l8;
        if (iMax >= i3) {
            return;
        }
        if (this.f66861zy != null) {
            int i4 = i3 - 1;
            while (i2 <= i4) {
                C3803k c3803k = (C3803k) C3844k.f7l8(this.f23027y[i2]);
                if (c3803k.f23031k == this.f66861zy) {
                    i2++;
                } else {
                    C3803k c3803k2 = (C3803k) C3844k.f7l8(this.f23027y[i4]);
                    if (c3803k2.f23031k != this.f66861zy) {
                        i4--;
                    } else {
                        C3803k[] c3803kArr = this.f23027y;
                        c3803kArr[i2] = c3803k2;
                        c3803kArr[i4] = c3803k;
                        i4--;
                        i2++;
                    }
                }
            }
            iMax = Math.max(iMax, i2);
            if (iMax >= this.f66859f7l8) {
                return;
            }
        }
        Arrays.fill(this.f23027y, iMax, this.f66859f7l8, (Object) null);
        this.f66859f7l8 = iMax;
    }

    @Override // com.google.android.exoplayer2.upstream.toq
    /* JADX INFO: renamed from: q */
    public synchronized void mo13474q(C3803k c3803k) {
        C3803k[] c3803kArr = this.f23026q;
        c3803kArr[0] = c3803k;
        zy(c3803kArr);
    }

    @Override // com.google.android.exoplayer2.upstream.toq
    public synchronized int toq() {
        return this.f23023g * this.f66860toq;
    }

    /* JADX INFO: renamed from: y */
    public synchronized void m13475y(int i2) {
        boolean z2 = i2 < this.f23025n;
        this.f23025n = i2;
        if (z2) {
            mo13473n();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.toq
    public synchronized void zy(C3803k[] c3803kArr) {
        int i2 = this.f66859f7l8;
        int length = c3803kArr.length + i2;
        C3803k[] c3803kArr2 = this.f23027y;
        if (length >= c3803kArr2.length) {
            this.f23027y = (C3803k[]) Arrays.copyOf(c3803kArr2, Math.max(c3803kArr2.length * 2, i2 + c3803kArr.length));
        }
        for (C3803k c3803k : c3803kArr) {
            C3803k[] c3803kArr3 = this.f23027y;
            int i3 = this.f66859f7l8;
            this.f66859f7l8 = i3 + 1;
            c3803kArr3[i3] = c3803k;
        }
        this.f23023g -= c3803kArr.length;
        notifyAll();
    }

    public C3798i(boolean z2, int i2, int i3) {
        C3844k.m13629k(i2 > 0);
        C3844k.m13629k(i3 >= 0);
        this.f23024k = z2;
        this.f66860toq = i2;
        this.f66859f7l8 = i3;
        this.f23027y = new C3803k[i3 + 100];
        if (i3 > 0) {
            this.f66861zy = new byte[i3 * i2];
            for (int i4 = 0; i4 < i3; i4++) {
                this.f23027y[i4] = new C3803k(this.f66861zy, i4 * i2);
            }
        } else {
            this.f66861zy = null;
        }
        this.f23026q = new C3803k[1];
    }
}

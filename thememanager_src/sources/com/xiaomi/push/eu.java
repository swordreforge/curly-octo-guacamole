package com.xiaomi.push;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class eu extends alcv {

    /* JADX INFO: renamed from: k */
    private vddr f32886k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f73320toq;

    public eu(int i2) {
        this.f32886k = new vddr(i2);
    }

    @Override // com.xiaomi.push.alcv
    /* JADX INFO: renamed from: q */
    public void mo20581q(byte[] bArr, int i2, int i3) throws IOException {
        this.f32886k.write(bArr, i2, i3);
    }

    @Override // com.xiaomi.push.alcv
    public int toq(byte[] bArr, int i2, int i3) {
        byte[] bArrZy = this.f32886k.zy();
        if (i3 > this.f32886k.m21898k() - this.f73320toq) {
            i3 = this.f32886k.m21898k() - this.f73320toq;
        }
        if (i3 > 0) {
            System.arraycopy(bArrZy, this.f73320toq, bArr, i2, i3);
            this.f73320toq += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: y */
    public int m20818y() {
        return this.f32886k.size();
    }
}

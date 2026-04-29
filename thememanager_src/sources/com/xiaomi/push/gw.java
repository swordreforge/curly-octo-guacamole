package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
public final class gw extends alcv {

    /* JADX INFO: renamed from: k */
    private byte[] f32994k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f73346toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f73347zy;

    @Override // com.xiaomi.push.alcv
    /* JADX INFO: renamed from: g */
    public int mo20578g() {
        return this.f73347zy - this.f73346toq;
    }

    @Override // com.xiaomi.push.alcv
    /* JADX INFO: renamed from: k */
    public int mo20579k() {
        return this.f73346toq;
    }

    @Override // com.xiaomi.push.alcv
    /* JADX INFO: renamed from: n */
    public byte[] mo20580n() {
        return this.f32994k;
    }

    @Override // com.xiaomi.push.alcv
    /* JADX INFO: renamed from: q */
    public void mo20581q(byte[] bArr, int i2, int i3) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    /* JADX INFO: renamed from: s */
    public void m20943s(byte[] bArr, int i2, int i3) {
        this.f32994k = bArr;
        this.f73346toq = i2;
        this.f73347zy = i2 + i3;
    }

    @Override // com.xiaomi.push.alcv
    public int toq(byte[] bArr, int i2, int i3) {
        int iMo20578g = mo20578g();
        if (i3 > iMo20578g) {
            i3 = iMo20578g;
        }
        if (i3 > 0) {
            System.arraycopy(this.f32994k, this.f73346toq, bArr, i2, i3);
            zy(i3);
        }
        return i3;
    }

    /* JADX INFO: renamed from: y */
    public void m20944y(byte[] bArr) {
        m20943s(bArr, 0, bArr.length);
    }

    @Override // com.xiaomi.push.alcv
    public void zy(int i2) {
        this.f73346toq += i2;
    }
}

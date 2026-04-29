package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
public final class zy {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final zy f73779zy = new zy(new byte[0]);

    /* JADX INFO: renamed from: k */
    private final byte[] f34343k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private volatile int f73780toq = 0;

    private zy(byte[] bArr) {
        this.f34343k = bArr;
    }

    public static zy toq(byte[] bArr) {
        return zy(bArr, 0, bArr.length);
    }

    public static zy zy(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zy(bArr2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zy)) {
            return false;
        }
        byte[] bArr = this.f34343k;
        int length = bArr.length;
        byte[] bArr2 = ((zy) obj).f34343k;
        if (length != bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.f73780toq;
        if (i2 == 0) {
            byte[] bArr = this.f34343k;
            int length = bArr.length;
            for (byte b2 : bArr) {
                length = (length * 31) + b2;
            }
            i2 = length == 0 ? 1 : length;
            this.f73780toq = i2;
        }
        return i2;
    }

    /* JADX INFO: renamed from: k */
    public int m22193k() {
        return this.f34343k.length;
    }

    /* JADX INFO: renamed from: q */
    public byte[] m22194q() {
        byte[] bArr = this.f34343k;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}

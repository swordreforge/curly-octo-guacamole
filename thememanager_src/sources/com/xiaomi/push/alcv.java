package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
public abstract class alcv {
    public int f7l8(byte[] bArr, int i2, int i3) throws z1r {
        int i4 = 0;
        while (i4 < i3) {
            int qVar = toq(bArr, i2 + i4, i3 - i4);
            if (qVar <= 0) {
                throw new z1r("Cannot read. Remote side has closed. Tried to read " + i3 + " bytes, but only got " + i4 + " bytes.");
            }
            i4 += qVar;
        }
        return i4;
    }

    /* JADX INFO: renamed from: g */
    public int mo20578g() {
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public int mo20579k() {
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public byte[] mo20580n() {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo20581q(byte[] bArr, int i2, int i3);

    public abstract int toq(byte[] bArr, int i2, int i3);

    public void zy(int i2) {
    }
}

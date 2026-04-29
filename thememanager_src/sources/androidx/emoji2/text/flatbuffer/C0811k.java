package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.k */
/* JADX INFO: compiled from: ArrayReadWriteBuf.java */
/* JADX INFO: loaded from: classes.dex */
public class C0811k implements ki {

    /* JADX INFO: renamed from: k */
    private byte[] f4445k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f51090toq;

    public C0811k() {
        this(10);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void cdj(byte b2) {
        n7h(this.f51090toq, b2);
        this.f51090toq++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ki, androidx.emoji2.text.flatbuffer.cdj
    public int f7l8() {
        return this.f51090toq;
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void fn3e(int i2, long j2) {
        qrj(i2 + 8);
        int i3 = (int) j2;
        byte[] bArr = this.f4445k;
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i3 >> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i3 >> 16) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i3 >> 24) & 255);
        int i8 = (int) (j2 >> 32);
        int i9 = i7 + 1;
        bArr[i7] = (byte) (i8 & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((i8 >> 8) & 255);
        bArr[i10] = (byte) ((i8 >> 16) & 255);
        bArr[i10 + 1] = (byte) ((i8 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: g */
    public void mo3888g(long j2) {
        fn3e(this.f51090toq, j2);
        this.f51090toq += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public byte get(int i2) {
        return this.f4445k[i2];
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public double getDouble(int i2) {
        return Double.longBitsToDouble(getLong(i2));
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public float getFloat(int i2) {
        return Float.intBitsToFloat(getInt(i2));
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public int getInt(int i2) {
        byte[] bArr = this.f4445k;
        return (bArr[i2] & 255) | (bArr[i2 + 3] << com.google.common.base.zy.f25759t) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public long getLong(int i2) {
        byte[] bArr = this.f4445k;
        int i3 = i2 + 1;
        long j2 = ((long) bArr[i2]) & 255;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8) | ((((long) bArr[i4]) & 255) << 16);
        int i6 = i5 + 1;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i6 + 1;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 32);
        int i8 = i7 + 1;
        return j5 | ((((long) bArr[i7]) & 255) << 40) | ((255 & ((long) bArr[i8])) << 48) | (((long) bArr[i8 + 1]) << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public short getShort(int i2) {
        byte[] bArr = this.f4445k;
        return (short) ((bArr[i2] & 255) | (bArr[i2 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: h */
    public void mo3889h(int i2, boolean z2) {
        n7h(i2, z2 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: i */
    public void mo3890i(int i2, short s2) {
        qrj(i2 + 2);
        byte[] bArr = this.f4445k;
        bArr[i2] = (byte) (s2 & 255);
        bArr[i2 + 1] = (byte) ((s2 >> 8) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: k */
    public void mo3891k(double d2) {
        ki(this.f51090toq, d2);
        this.f51090toq += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void ki(int i2, double d2) {
        qrj(i2 + 8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2);
        int i3 = (int) jDoubleToRawLongBits;
        byte[] bArr = this.f4445k;
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i3 >> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i3 >> 16) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i3 >> 24) & 255);
        int i8 = (int) (jDoubleToRawLongBits >> 32);
        int i9 = i7 + 1;
        bArr[i7] = (byte) (i8 & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((i8 >> 8) & 255);
        bArr[i10] = (byte) ((i8 >> 16) & 255);
        bArr[i10 + 1] = (byte) ((i8 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public int kja0() {
        return this.f51090toq;
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public byte[] ld6() {
        return this.f4445k;
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: n */
    public void mo3892n(int i2) {
        mo3895s(this.f51090toq, i2);
        this.f51090toq += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void n7h(int i2, byte b2) {
        qrj(i2 + 1);
        this.f4445k[i2] = b2;
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: p */
    public void mo3893p(int i2, float f2) {
        qrj(i2 + 4);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        byte[] bArr = this.f4445k;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (iFloatToRawIntBits & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((iFloatToRawIntBits >> 8) & 255);
        bArr[i4] = (byte) ((iFloatToRawIntBits >> 16) & 255);
        bArr[i4 + 1] = (byte) ((iFloatToRawIntBits >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: q */
    public void mo3894q(boolean z2) {
        mo3889h(this.f51090toq, z2);
        this.f51090toq++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public boolean qrj(int i2) {
        byte[] bArr = this.f4445k;
        if (bArr.length > i2) {
            return true;
        }
        int length = bArr.length;
        this.f4445k = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: s */
    public void mo3895s(int i2, int i3) {
        qrj(i2 + 4);
        byte[] bArr = this.f4445k;
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i3 >> 8) & 255);
        bArr[i5] = (byte) ((i3 >> 16) & 255);
        bArr[i5 + 1] = (byte) ((i3 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public boolean t8r(int i2) {
        return this.f4445k[i2] != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void toq(float f2) {
        mo3893p(this.f51090toq, f2);
        this.f51090toq += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public String x2(int i2, int i3) {
        return wvg.f7l8(this.f4445k, i2, i3);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: y */
    public void mo3896y(int i2, byte[] bArr, int i3, int i4) {
        qrj((i4 - i3) + i2);
        System.arraycopy(bArr, i3, this.f4445k, i2, i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void zurt(byte[] bArr, int i2, int i3) {
        mo3896y(this.f51090toq, bArr, i2, i3);
        this.f51090toq += i3;
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void zy(short s2) {
        mo3890i(this.f51090toq, s2);
        this.f51090toq += 2;
    }

    public C0811k(int i2) {
        this(new byte[i2]);
    }

    public C0811k(byte[] bArr) {
        this.f4445k = bArr;
        this.f51090toq = 0;
    }

    public C0811k(byte[] bArr, int i2) {
        this.f4445k = bArr;
        this.f51090toq = i2;
    }
}

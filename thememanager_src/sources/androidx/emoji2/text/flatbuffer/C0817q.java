package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.q */
/* JADX INFO: compiled from: ByteBufferReadWriteBuf.java */
/* JADX INFO: loaded from: classes.dex */
public class C0817q implements ki {

    /* JADX INFO: renamed from: k */
    private final ByteBuffer f4485k;

    public C0817q(ByteBuffer byteBuffer) {
        this.f4485k = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void cdj(byte b2) {
        this.f4485k.put(b2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki, androidx.emoji2.text.flatbuffer.cdj
    public int f7l8() {
        return this.f4485k.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void fn3e(int i2, long j2) {
        qrj(i2 + 8);
        this.f4485k.putLong(i2, j2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: g */
    public void mo3888g(long j2) {
        this.f4485k.putLong(j2);
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public byte get(int i2) {
        return this.f4485k.get(i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public double getDouble(int i2) {
        return this.f4485k.getDouble(i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public float getFloat(int i2) {
        return this.f4485k.getFloat(i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public int getInt(int i2) {
        return this.f4485k.getInt(i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public long getLong(int i2) {
        return this.f4485k.getLong(i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public short getShort(int i2) {
        return this.f4485k.getShort(i2);
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
        this.f4485k.putShort(i2, s2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: k */
    public void mo3891k(double d2) {
        this.f4485k.putDouble(d2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void ki(int i2, double d2) {
        qrj(i2 + 8);
        this.f4485k.putDouble(i2, d2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public int kja0() {
        return this.f4485k.position();
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public byte[] ld6() {
        return this.f4485k.array();
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: n */
    public void mo3892n(int i2) {
        this.f4485k.putInt(i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void n7h(int i2, byte b2) {
        qrj(i2 + 1);
        this.f4485k.put(i2, b2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: p */
    public void mo3893p(int i2, float f2) {
        qrj(i2 + 4);
        this.f4485k.putFloat(i2, f2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: q */
    public void mo3894q(boolean z2) {
        this.f4485k.put(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public boolean qrj(int i2) {
        return i2 <= this.f4485k.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: s */
    public void mo3895s(int i2, int i3) {
        qrj(i2 + 4);
        this.f4485k.putInt(i2, i3);
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public boolean t8r(int i2) {
        return get(i2) != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void toq(float f2) {
        this.f4485k.putFloat(f2);
    }

    @Override // androidx.emoji2.text.flatbuffer.cdj
    public String x2(int i2, int i3) {
        return wvg.m3993y(this.f4485k, i2, i3);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    /* JADX INFO: renamed from: y */
    public void mo3896y(int i2, byte[] bArr, int i3, int i4) {
        qrj((i4 - i3) + i2);
        int iPosition = this.f4485k.position();
        this.f4485k.position(i2);
        this.f4485k.put(bArr, i3, i4);
        this.f4485k.position(iPosition);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void zurt(byte[] bArr, int i2, int i3) {
        this.f4485k.put(bArr, i2, i3);
    }

    @Override // androidx.emoji2.text.flatbuffer.ki
    public void zy(short s2) {
        this.f4485k.putShort(s2);
    }
}

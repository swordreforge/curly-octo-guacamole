package com.google.common.io;

import com.google.common.primitives.C4743p;
import com.google.common.primitives.C4746s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: LittleEndianDataInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class fu4 extends FilterInputStream implements DataInput {
    public fu4(InputStream inputStream) {
        super((InputStream) com.google.common.base.jk.a9(inputStream));
    }

    /* JADX INFO: renamed from: q */
    private byte m16396q() throws IOException {
        int i2 = ((FilterInputStream) this).in.read();
        if (-1 != i2) {
            return (byte) i2;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public boolean readBoolean() throws IOException {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public byte readByte() throws IOException {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public char readChar() throws IOException {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        C4717y.m16482h(this, bArr);
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public int readInt() throws IOException {
        byte bM16396q = m16396q();
        byte bM16396q2 = m16396q();
        return C4746s.ld6(m16396q(), m16396q(), bM16396q2, bM16396q);
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public long readLong() throws IOException {
        byte bM16396q = m16396q();
        byte bM16396q2 = m16396q();
        byte bM16396q3 = m16396q();
        byte bM16396q4 = m16396q();
        byte bM16396q5 = m16396q();
        byte bM16396q6 = m16396q();
        return C4743p.m16684p(m16396q(), m16396q(), bM16396q6, bM16396q5, bM16396q4, bM16396q3, bM16396q2, bM16396q);
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public String readUTF() throws IOException {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public int readUnsignedByte() throws IOException {
        int i2 = ((FilterInputStream) this).in.read();
        if (i2 >= 0) {
            return i2;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    public int readUnsignedShort() throws IOException {
        return C4746s.ld6((byte) 0, (byte) 0, m16396q(), m16396q());
    }

    @Override // java.io.DataInput
    public int skipBytes(int i2) throws IOException {
        return (int) ((FilterInputStream) this).in.skip(i2);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i2, int i3) throws IOException {
        C4717y.cdj(this, bArr, i2, i3);
    }
}

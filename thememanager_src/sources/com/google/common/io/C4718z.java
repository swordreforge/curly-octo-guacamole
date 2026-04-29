package com.google.common.io;

import com.google.common.primitives.C4743p;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.io.z */
/* JADX INFO: compiled from: LittleEndianDataOutputStream.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class C4718z extends FilterOutputStream implements DataOutput {
    public C4718z(OutputStream outputStream) {
        super(new DataOutputStream((OutputStream) com.google.common.base.jk.a9(outputStream)));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i2, i3);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z2) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBoolean(z2);
    }

    @Override // java.io.DataOutput
    public void writeByte(int i2) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeByte(i2);
    }

    @Override // java.io.DataOutput
    @Deprecated
    public void writeBytes(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeBytes(str);
    }

    @Override // java.io.DataOutput
    public void writeChar(int i2) throws IOException {
        writeShort(i2);
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) throws IOException {
        for (int i2 = 0; i2 < str.length(); i2++) {
            writeChar(str.charAt(i2));
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d2) throws IOException {
        writeLong(Double.doubleToLongBits(d2));
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f2) throws IOException {
        writeInt(Float.floatToIntBits(f2));
    }

    @Override // java.io.DataOutput
    public void writeInt(int i2) throws IOException {
        ((FilterOutputStream) this).out.write(i2 & 255);
        ((FilterOutputStream) this).out.write((i2 >> 8) & 255);
        ((FilterOutputStream) this).out.write((i2 >> 16) & 255);
        ((FilterOutputStream) this).out.write((i2 >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public void writeLong(long j2) throws IOException {
        byte[] bArrWvg = C4743p.wvg(Long.reverseBytes(j2));
        write(bArrWvg, 0, bArrWvg.length);
    }

    @Override // java.io.DataOutput
    public void writeShort(int i2) throws IOException {
        ((FilterOutputStream) this).out.write(i2 & 255);
        ((FilterOutputStream) this).out.write((i2 >> 8) & 255);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        ((DataOutputStream) ((FilterOutputStream) this).out).writeUTF(str);
    }
}

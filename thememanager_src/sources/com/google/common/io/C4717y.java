package com.google.common.io;

import com.google.common.math.C4723q;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.io.y */
/* JADX INFO: compiled from: ByteStreams.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public final class C4717y {

    /* JADX INFO: renamed from: k */
    private static final int f27148k = 8192;

    /* JADX INFO: renamed from: n */
    private static final OutputStream f27149n = new k();

    /* JADX INFO: renamed from: q */
    private static final int f27150q = 20;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f68351toq = 524288;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f68352zy = 2147483639;

    /* JADX INFO: renamed from: com.google.common.io.y$k */
    /* JADX INFO: compiled from: ByteStreams.java */
    static class k extends OutputStream {
        k() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            com.google.common.base.jk.a9(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            com.google.common.base.jk.a9(bArr);
        }
    }

    private C4717y() {
    }

    @InterfaceC7731k
    public static void cdj(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
        int iN7h = n7h(inputStream, bArr, i2, i3);
        if (iN7h == i3) {
            return;
        }
        throw new EOFException("reached end of stream after reading " + iN7h + " bytes; " + i3 + " bytes expected");
    }

    @InterfaceC7731k
    public static com.google.common.io.zy f7l8(ByteArrayInputStream byteArrayInputStream) {
        return new toq((ByteArrayInputStream) com.google.common.base.jk.a9(byteArrayInputStream));
    }

    public static byte[] fn3e(InputStream inputStream) throws IOException {
        com.google.common.base.jk.a9(inputStream);
        return ni7(inputStream, new ArrayDeque(20), 0);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: g */
    public static InputStream m16481g(InputStream inputStream, long j2) {
        return new q(inputStream, j2);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: h */
    public static void m16482h(InputStream inputStream, byte[] bArr) throws IOException {
        cdj(inputStream, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: i */
    static long m16483i(InputStream inputStream, long j2) throws IOException {
        byte[] bArrM16487q = m16487q();
        long j3 = 0;
        while (j3 < j2) {
            long j4 = j2 - j3;
            long jT8r = t8r(inputStream, j4);
            if (jT8r == 0) {
                jT8r = inputStream.read(bArrM16487q, 0, (int) Math.min(j4, bArrM16487q.length));
                if (jT8r == -1) {
                    break;
                }
            }
            j3 += jT8r;
        }
        return j3;
    }

    /* JADX INFO: renamed from: k */
    private static byte[] m16484k(Deque<byte[]> deque, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = i2;
        while (i3 > 0) {
            byte[] bArrRemoveFirst = deque.removeFirst();
            int iMin = Math.min(i3, bArrRemoveFirst.length);
            System.arraycopy(bArrRemoveFirst, 0, bArr, i2 - i3, iMin);
            i3 -= iMin;
        }
        return bArr;
    }

    @InterfaceC7731k
    public static void ki(InputStream inputStream, long j2) throws IOException {
        long jM16483i = m16483i(inputStream, j2);
        if (jM16483i >= j2) {
            return;
        }
        throw new EOFException("reached end of stream after skipping " + jM16483i + " bytes; " + j2 + " bytes expected");
    }

    @CanIgnoreReturnValue
    @InterfaceC7731k
    public static <T> T kja0(InputStream inputStream, InterfaceC4697n<T> interfaceC4697n) throws IOException {
        int i2;
        com.google.common.base.jk.a9(inputStream);
        com.google.common.base.jk.a9(interfaceC4697n);
        byte[] bArrM16487q = m16487q();
        do {
            i2 = inputStream.read(bArrM16487q);
            if (i2 == -1) {
                break;
            }
        } while (interfaceC4697n.m16424k(bArrM16487q, 0, i2));
        return interfaceC4697n.getResult();
    }

    @InterfaceC7731k
    public static InterfaceC4701q ld6(int i2) {
        if (i2 >= 0) {
            return x2(new ByteArrayOutputStream(i2));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(i2)));
    }

    @CanIgnoreReturnValue
    @InterfaceC7731k
    /* JADX INFO: renamed from: n */
    public static long m16485n(InputStream inputStream) throws IOException {
        byte[] bArrM16487q = m16487q();
        long j2 = 0;
        while (true) {
            long j3 = inputStream.read(bArrM16487q);
            if (j3 == -1) {
                return j2;
            }
            j2 += j3;
        }
    }

    @CanIgnoreReturnValue
    @InterfaceC7731k
    public static int n7h(InputStream inputStream, byte[] bArr, int i2, int i3) throws IOException {
        com.google.common.base.jk.a9(inputStream);
        com.google.common.base.jk.a9(bArr);
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = inputStream.read(bArr, i2 + i4, i3 - i4);
            if (i5 == -1) {
                break;
            }
            i4 += i5;
        }
        return i4;
    }

    private static byte[] ni7(InputStream inputStream, Deque<byte[]> deque, int i2) throws IOException {
        int iFn3e = 8192;
        while (i2 < f68352zy) {
            int iMin = Math.min(iFn3e, f68352zy - i2);
            byte[] bArr = new byte[iMin];
            deque.add(bArr);
            int i3 = 0;
            while (i3 < iMin) {
                int i4 = inputStream.read(bArr, i3, iMin - i3);
                if (i4 == -1) {
                    return m16484k(deque, i2);
                }
                i3 += i4;
                i2 += i4;
            }
            iFn3e = C4723q.fn3e(iFn3e, 2);
        }
        if (inputStream.read() == -1) {
            return m16484k(deque, f68352zy);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: p */
    public static InterfaceC4701q m16486p() {
        return x2(new ByteArrayOutputStream());
    }

    /* JADX INFO: renamed from: q */
    static byte[] m16487q() {
        return new byte[8192];
    }

    @InterfaceC7731k
    public static OutputStream qrj() {
        return f27149n;
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: s */
    public static com.google.common.io.zy m16488s(byte[] bArr, int i2) {
        com.google.common.base.jk.m15381o(i2, bArr.length);
        return f7l8(new ByteArrayInputStream(bArr, i2, bArr.length - i2));
    }

    private static long t8r(InputStream inputStream, long j2) throws IOException {
        int iAvailable = inputStream.available();
        if (iAvailable == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(iAvailable, j2));
    }

    @CanIgnoreReturnValue
    public static long toq(InputStream inputStream, OutputStream outputStream) throws IOException {
        com.google.common.base.jk.a9(inputStream);
        com.google.common.base.jk.a9(outputStream);
        byte[] bArrM16487q = m16487q();
        long j2 = 0;
        while (true) {
            int i2 = inputStream.read(bArrM16487q);
            if (i2 == -1) {
                return j2;
            }
            outputStream.write(bArrM16487q, 0, i2);
            j2 += (long) i2;
        }
    }

    @InterfaceC7731k
    public static InterfaceC4701q x2(ByteArrayOutputStream byteArrayOutputStream) {
        return new zy((ByteArrayOutputStream) com.google.common.base.jk.a9(byteArrayOutputStream));
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: y */
    public static com.google.common.io.zy m16489y(byte[] bArr) {
        return f7l8(new ByteArrayInputStream(bArr));
    }

    static byte[] zurt(InputStream inputStream, long j2) throws IOException {
        com.google.common.base.jk.m15374h(j2 >= 0, "expectedSize (%s) must be non-negative", j2);
        if (j2 > 2147483639) {
            throw new OutOfMemoryError(j2 + " bytes is too large to fit in a byte array");
        }
        int i2 = (int) j2;
        byte[] bArr = new byte[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = i2 - i3;
            int i5 = inputStream.read(bArr, i4, i3);
            if (i5 == -1) {
                return Arrays.copyOf(bArr, i4);
            }
            i3 -= i5;
        }
        int i6 = inputStream.read();
        if (i6 == -1) {
            return bArr;
        }
        ArrayDeque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) i6});
        return ni7(inputStream, arrayDeque, i2 + 1);
    }

    @CanIgnoreReturnValue
    public static long zy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        com.google.common.base.jk.a9(readableByteChannel);
        com.google.common.base.jk.a9(writableByteChannel);
        long jWrite = 0;
        if (!(readableByteChannel instanceof FileChannel)) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(m16487q());
            while (readableByteChannel.read(byteBufferWrap) != -1) {
                byteBufferWrap.flip();
                while (byteBufferWrap.hasRemaining()) {
                    jWrite += (long) writableByteChannel.write(byteBufferWrap);
                }
                byteBufferWrap.clear();
            }
            return jWrite;
        }
        FileChannel fileChannel = (FileChannel) readableByteChannel;
        long jPosition = fileChannel.position();
        long j2 = jPosition;
        while (true) {
            long jTransferTo = fileChannel.transferTo(j2, 524288L, writableByteChannel);
            j2 += jTransferTo;
            fileChannel.position(j2);
            if (jTransferTo <= 0 && j2 >= fileChannel.size()) {
                return j2 - jPosition;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.y$toq */
    /* JADX INFO: compiled from: ByteStreams.java */
    private static class toq implements com.google.common.io.zy {

        /* JADX INFO: renamed from: k */
        final DataInput f27153k;

        toq(ByteArrayInputStream byteArrayInputStream) {
            this.f27153k = new DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.f27153k.readBoolean();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public byte readByte() {
            try {
                return this.f27153k.readByte();
            } catch (EOFException e2) {
                throw new IllegalStateException(e2);
            } catch (IOException e3) {
                throw new AssertionError(e3);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public char readChar() {
            try {
                return this.f27153k.readChar();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public double readDouble() {
            try {
                return this.f27153k.readDouble();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public float readFloat() {
            try {
                return this.f27153k.readFloat();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public void readFully(byte[] bArr) {
            try {
                this.f27153k.readFully(bArr);
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public int readInt() {
            try {
                return this.f27153k.readInt();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public String readLine() {
            try {
                return this.f27153k.readLine();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public long readLong() {
            try {
                return this.f27153k.readLong();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public short readShort() {
            try {
                return this.f27153k.readShort();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public String readUTF() {
            try {
                return this.f27153k.readUTF();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.f27153k.readUnsignedByte();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.f27153k.readUnsignedShort();
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public int skipBytes(int i2) {
            try {
                return this.f27153k.skipBytes(i2);
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }

        @Override // com.google.common.io.zy, java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) {
            try {
                this.f27153k.readFully(bArr, i2, i3);
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.y$zy */
    /* JADX INFO: compiled from: ByteStreams.java */
    private static class zy implements InterfaceC4701q {

        /* JADX INFO: renamed from: k */
        final DataOutput f27154k;

        /* JADX INFO: renamed from: q */
        final ByteArrayOutputStream f27155q;

        zy(ByteArrayOutputStream byteArrayOutputStream) {
            this.f27155q = byteArrayOutputStream;
            this.f27154k = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.io.InterfaceC4701q
        /* JADX INFO: renamed from: k */
        public byte[] mo16436k() {
            return this.f27155q.toByteArray();
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void write(int i2) {
            try {
                this.f27154k.write(i2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void writeBoolean(boolean z2) {
            try {
                this.f27154k.writeBoolean(z2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void writeByte(int i2) {
            try {
                this.f27154k.writeByte(i2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void writeBytes(String str) {
            try {
                this.f27154k.writeBytes(str);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void writeChar(int i2) {
            try {
                this.f27154k.writeChar(i2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void writeChars(String str) {
            try {
                this.f27154k.writeChars(str);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void writeDouble(double d2) {
            try {
                this.f27154k.writeDouble(d2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void writeFloat(float f2) {
            try {
                this.f27154k.writeFloat(f2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void writeInt(int i2) {
            try {
                this.f27154k.writeInt(i2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void writeLong(long j2) {
            try {
                this.f27154k.writeLong(j2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void writeShort(int i2) {
            try {
                this.f27154k.writeShort(i2);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void writeUTF(String str) {
            try {
                this.f27154k.writeUTF(str);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void write(byte[] bArr) {
            try {
                this.f27154k.write(bArr);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.io.InterfaceC4701q, java.io.DataOutput
        public void write(byte[] bArr, int i2, int i3) {
            try {
                this.f27154k.write(bArr, i2, i3);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.y$q */
    /* JADX INFO: compiled from: ByteStreams.java */
    private static final class q extends FilterInputStream {

        /* JADX INFO: renamed from: k */
        private long f27151k;

        /* JADX INFO: renamed from: q */
        private long f27152q;

        q(InputStream inputStream, long j2) {
            super(inputStream);
            this.f27152q = -1L;
            com.google.common.base.jk.a9(inputStream);
            com.google.common.base.jk.m15380n(j2 >= 0, "limit must be non-negative");
            this.f27151k = j2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f27151k);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i2) {
            ((FilterInputStream) this).in.mark(i2);
            this.f27152q = this.f27151k;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f27151k == 0) {
                return -1;
            }
            int i2 = ((FilterInputStream) this).in.read();
            if (i2 != -1) {
                this.f27151k--;
            }
            return i2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f27152q == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f27151k = this.f27152q;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j2) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j2, this.f27151k));
            this.f27151k -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            long j2 = this.f27151k;
            if (j2 == 0) {
                return -1;
            }
            int i4 = ((FilterInputStream) this).in.read(bArr, i2, (int) Math.min(i3, j2));
            if (i4 != -1) {
                this.f27151k -= (long) i4;
            }
            return i4;
        }
    }
}

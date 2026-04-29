package com.bumptech.glide.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.util.k */
/* JADX INFO: compiled from: ByteBufferUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3201k {

    /* JADX INFO: renamed from: k */
    private static final int f19072k = 16384;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final AtomicReference<byte[]> f63072toq = new AtomicReference<>();

    /* JADX INFO: renamed from: com.bumptech.glide.util.k$toq */
    /* JADX INFO: compiled from: ByteBufferUtil.java */
    static final class toq {

        /* JADX INFO: renamed from: k */
        final int f19076k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f63073toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final byte[] f63074zy;

        toq(@lvui byte[] bArr, int i2, int i3) {
            this.f63074zy = bArr;
            this.f19076k = i2;
            this.f63073toq = i3;
        }
    }

    private C3201k() {
    }

    @lvui
    public static InputStream f7l8(@lvui ByteBuffer byteBuffer) {
        return new k(byteBuffer);
    }

    /* JADX INFO: renamed from: g */
    public static void m11220g(@lvui ByteBuffer byteBuffer, @lvui File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        m11223q(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static ByteBuffer m11221k(@lvui File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public static byte[] m11222n(@lvui ByteBuffer byteBuffer) {
        toq toqVarZy = zy(byteBuffer);
        if (toqVarZy != null && toqVarZy.f19076k == 0 && toqVarZy.f63073toq == toqVarZy.f63074zy.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        m11223q(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: q */
    public static ByteBuffer m11223q(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    @lvui
    public static ByteBuffer toq(@lvui InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f63072toq.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i2 = inputStream.read(andSet);
            if (i2 < 0) {
                f63072toq.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m11223q(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, i2);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m11224y(@lvui ByteBuffer byteBuffer, @lvui OutputStream outputStream) throws IOException {
        toq toqVarZy = zy(byteBuffer);
        if (toqVarZy != null) {
            byte[] bArr = toqVarZy.f63074zy;
            int i2 = toqVarZy.f19076k;
            outputStream.write(bArr, i2, toqVarZy.f63073toq + i2);
            return;
        }
        byte[] andSet = f63072toq.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (byteBuffer.remaining() > 0) {
            int iMin = Math.min(byteBuffer.remaining(), andSet.length);
            byteBuffer.get(andSet, 0, iMin);
            outputStream.write(andSet, 0, iMin);
        }
        f63072toq.set(andSet);
    }

    @dd
    private static toq zy(@lvui ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new toq(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.k$k */
    /* JADX INFO: compiled from: ByteBufferUtil.java */
    private static class k extends InputStream {

        /* JADX INFO: renamed from: n */
        private static final int f19073n = -1;

        /* JADX INFO: renamed from: k */
        @lvui
        private final ByteBuffer f19074k;

        /* JADX INFO: renamed from: q */
        private int f19075q = -1;

        k(@lvui ByteBuffer byteBuffer) {
            this.f19074k = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f19074k.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i2) {
            this.f19075q = this.f19074k.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f19074k.hasRemaining()) {
                return this.f19074k.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i2 = this.f19075q;
            if (i2 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f19074k.position(i2);
        }

        @Override // java.io.InputStream
        public long skip(long j2) {
            if (!this.f19074k.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j2, available());
            ByteBuffer byteBuffer = this.f19074k;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(@lvui byte[] bArr, int i2, int i3) {
            if (!this.f19074k.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i3, available());
            this.f19074k.get(bArr, i2, iMin);
            return iMin;
        }
    }
}

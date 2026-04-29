package com.bumptech.glide.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: StrictLineReader.java */
/* JADX INFO: loaded from: classes2.dex */
class toq implements Closeable {

    /* JADX INFO: renamed from: p */
    private static final byte f17902p = 10;

    /* JADX INFO: renamed from: s */
    private static final byte f17903s = 13;

    /* JADX INFO: renamed from: g */
    private int f17904g;

    /* JADX INFO: renamed from: k */
    private final InputStream f17905k;

    /* JADX INFO: renamed from: n */
    private byte[] f17906n;

    /* JADX INFO: renamed from: q */
    private final Charset f17907q;

    /* JADX INFO: renamed from: y */
    private int f17908y;

    /* JADX INFO: renamed from: com.bumptech.glide.disklrucache.toq$k */
    /* JADX INFO: compiled from: StrictLineReader.java */
    class C2969k extends ByteArrayOutputStream {
        C2969k(int i2) {
            super(i2);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i2 = ((ByteArrayOutputStream) this).count;
            if (i2 > 0 && ((ByteArrayOutputStream) this).buf[i2 - 1] == 13) {
                i2--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i2, toq.this.f17907q.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public toq(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void zy() throws IOException {
        InputStream inputStream = this.f17905k;
        byte[] bArr = this.f17906n;
        int i2 = inputStream.read(bArr, 0, bArr.length);
        if (i2 == -1) {
            throw new EOFException();
        }
        this.f17904g = 0;
        this.f17908y = i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f17905k) {
            if (this.f17906n != null) {
                this.f17906n = null;
                this.f17905k.close();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m10571q() {
        return this.f17908y == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m10572y() throws java.io.IOException {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f17905k
            monitor-enter(r0)
            byte[] r1 = r7.f17906n     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L7f
            int r1 = r7.f17904g     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f17908y     // Catch: java.lang.Throwable -> L87
            if (r1 < r2) goto L10
            r7.zy()     // Catch: java.lang.Throwable -> L87
        L10:
            int r1 = r7.f17904g     // Catch: java.lang.Throwable -> L87
        L12:
            int r2 = r7.f17908y     // Catch: java.lang.Throwable -> L87
            r3 = 10
            if (r1 == r2) goto L41
            byte[] r2 = r7.f17906n     // Catch: java.lang.Throwable -> L87
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L87
            if (r4 != r3) goto L3e
            int r3 = r7.f17904g     // Catch: java.lang.Throwable -> L87
            if (r1 == r3) goto L2b
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L87
            r6 = 13
            if (r5 != r6) goto L2b
            goto L2c
        L2b:
            r4 = r1
        L2c:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L87
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.f17907q     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L87
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L87
            int r1 = r1 + 1
            r7.f17904g = r1     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return r5
        L3e:
            int r1 = r1 + 1
            goto L12
        L41:
            com.bumptech.glide.disklrucache.toq$k r1 = new com.bumptech.glide.disklrucache.toq$k     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f17908y     // Catch: java.lang.Throwable -> L87
            int r4 = r7.f17904g     // Catch: java.lang.Throwable -> L87
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L87
        L4d:
            byte[] r2 = r7.f17906n     // Catch: java.lang.Throwable -> L87
            int r4 = r7.f17904g     // Catch: java.lang.Throwable -> L87
            int r5 = r7.f17908y     // Catch: java.lang.Throwable -> L87
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L87
            r2 = -1
            r7.f17908y = r2     // Catch: java.lang.Throwable -> L87
            r7.zy()     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f17904g     // Catch: java.lang.Throwable -> L87
        L5f:
            int r4 = r7.f17908y     // Catch: java.lang.Throwable -> L87
            if (r2 == r4) goto L4d
            byte[] r4 = r7.f17906n     // Catch: java.lang.Throwable -> L87
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L87
            if (r5 != r3) goto L7c
            int r3 = r7.f17904g     // Catch: java.lang.Throwable -> L87
            if (r2 == r3) goto L72
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L87
        L72:
            int r2 = r2 + 1
            r7.f17904g = r2     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return r1
        L7c:
            int r2 = r2 + 1
            goto L5f
        L7f:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L87
            throw r1     // Catch: java.lang.Throwable -> L87
        L87:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.disklrucache.toq.m10572y():java.lang.String");
    }

    public toq(InputStream inputStream, int i2, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(zy.f17910k)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f17905k = inputStream;
        this.f17907q = charset;
        this.f17906n = new byte[i2];
    }
}

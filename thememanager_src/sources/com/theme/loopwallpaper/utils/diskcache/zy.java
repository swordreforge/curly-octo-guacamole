package com.theme.loopwallpaper.utils.diskcache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: StrictLineReader.java */
/* JADX INFO: loaded from: classes3.dex */
class zy implements Closeable {

    /* JADX INFO: renamed from: p */
    private static final byte f30390p = 10;

    /* JADX INFO: renamed from: s */
    private static final byte f30391s = 13;

    /* JADX INFO: renamed from: g */
    private int f30392g;

    /* JADX INFO: renamed from: k */
    private final InputStream f30393k;

    /* JADX INFO: renamed from: n */
    private byte[] f30394n;

    /* JADX INFO: renamed from: q */
    private final Charset f30395q;

    /* JADX INFO: renamed from: y */
    private int f30396y;

    /* JADX INFO: renamed from: com.theme.loopwallpaper.utils.diskcache.zy$k */
    /* JADX INFO: compiled from: StrictLineReader.java */
    class C5444k extends ByteArrayOutputStream {
        C5444k(int size) {
            super(size);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i2 = ((ByteArrayOutputStream) this).count;
            if (i2 > 0 && ((ByteArrayOutputStream) this).buf[i2 - 1] == 13) {
                i2--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i2, zy.this.f30395q.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public zy(InputStream in, Charset charset) {
        this(in, 8192, charset);
    }

    private void zy() throws IOException {
        InputStream inputStream = this.f30393k;
        byte[] bArr = this.f30394n;
        int i2 = inputStream.read(bArr, 0, bArr.length);
        if (i2 == -1) {
            throw new EOFException();
        }
        this.f30392g = 0;
        this.f30396y = i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f30393k) {
            if (this.f30394n != null) {
                this.f30394n = null;
                this.f30393k.close();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m18555q() {
        return this.f30396y == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m18556y() throws java.io.IOException {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f30393k
            monitor-enter(r0)
            byte[] r1 = r7.f30394n     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L7f
            int r1 = r7.f30392g     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f30396y     // Catch: java.lang.Throwable -> L87
            if (r1 < r2) goto L10
            r7.zy()     // Catch: java.lang.Throwable -> L87
        L10:
            int r1 = r7.f30392g     // Catch: java.lang.Throwable -> L87
        L12:
            int r2 = r7.f30396y     // Catch: java.lang.Throwable -> L87
            r3 = 10
            if (r1 == r2) goto L41
            byte[] r2 = r7.f30394n     // Catch: java.lang.Throwable -> L87
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L87
            if (r4 != r3) goto L3e
            int r3 = r7.f30392g     // Catch: java.lang.Throwable -> L87
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
            java.nio.charset.Charset r6 = r7.f30395q     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L87
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L87
            int r1 = r1 + 1
            r7.f30392g = r1     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            return r5
        L3e:
            int r1 = r1 + 1
            goto L12
        L41:
            com.theme.loopwallpaper.utils.diskcache.zy$k r1 = new com.theme.loopwallpaper.utils.diskcache.zy$k     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f30396y     // Catch: java.lang.Throwable -> L87
            int r4 = r7.f30392g     // Catch: java.lang.Throwable -> L87
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L87
        L4d:
            byte[] r2 = r7.f30394n     // Catch: java.lang.Throwable -> L87
            int r4 = r7.f30392g     // Catch: java.lang.Throwable -> L87
            int r5 = r7.f30396y     // Catch: java.lang.Throwable -> L87
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L87
            r2 = -1
            r7.f30396y = r2     // Catch: java.lang.Throwable -> L87
            r7.zy()     // Catch: java.lang.Throwable -> L87
            int r2 = r7.f30392g     // Catch: java.lang.Throwable -> L87
        L5f:
            int r4 = r7.f30396y     // Catch: java.lang.Throwable -> L87
            if (r2 == r4) goto L4d
            byte[] r4 = r7.f30394n     // Catch: java.lang.Throwable -> L87
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L87
            if (r5 != r3) goto L7c
            int r3 = r7.f30392g     // Catch: java.lang.Throwable -> L87
            if (r2 == r3) goto L72
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L87
        L72:
            int r2 = r2 + 1
            r7.f30392g = r2     // Catch: java.lang.Throwable -> L87
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
        throw new UnsupportedOperationException("Method not decompiled: com.theme.loopwallpaper.utils.diskcache.zy.m18556y():java.lang.String");
    }

    public zy(InputStream in, int capacity, Charset charset) {
        if (in == null || charset == null) {
            throw null;
        }
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(C5443q.f30386k)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f30393k = in;
        this.f30395q = charset;
        this.f30394n = new byte[capacity];
    }
}

package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: compiled from: ReaderInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
final class mcp extends InputStream {

    /* JADX INFO: renamed from: g */
    private CharBuffer f27079g;

    /* JADX INFO: renamed from: h */
    private boolean f27080h;

    /* JADX INFO: renamed from: k */
    private final Reader f27081k;

    /* JADX INFO: renamed from: n */
    private final byte[] f27082n;

    /* JADX INFO: renamed from: p */
    private boolean f27083p;

    /* JADX INFO: renamed from: q */
    private final CharsetEncoder f27084q;

    /* JADX INFO: renamed from: s */
    private boolean f27085s;

    /* JADX INFO: renamed from: y */
    private ByteBuffer f27086y;

    mcp(Reader reader, Charset charset, int i2) {
        this(reader, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), i2);
    }

    /* JADX INFO: renamed from: k */
    private static int m16420k(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    /* JADX INFO: renamed from: p */
    private void m16421p(boolean z2) {
        this.f27086y.flip();
        if (z2 && this.f27086y.remaining() == 0) {
            this.f27086y = ByteBuffer.allocate(this.f27086y.capacity() * 2);
        } else {
            this.f27083p = true;
        }
    }

    /* JADX INFO: renamed from: q */
    private static CharBuffer m16422q(CharBuffer charBuffer) {
        CharBuffer charBufferWrap = CharBuffer.wrap(Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        charBufferWrap.position(charBuffer.position());
        charBufferWrap.limit(charBuffer.limit());
        return charBufferWrap;
    }

    /* JADX INFO: renamed from: y */
    private void m16423y() throws IOException {
        if (m16420k(this.f27079g) == 0) {
            if (this.f27079g.position() > 0) {
                this.f27079g.compact().flip();
            } else {
                this.f27079g = m16422q(this.f27079g);
            }
        }
        int iLimit = this.f27079g.limit();
        int i2 = this.f27081k.read(this.f27079g.array(), iLimit, m16420k(this.f27079g));
        if (i2 == -1) {
            this.f27085s = true;
        } else {
            this.f27079g.limit(iLimit + i2);
        }
    }

    private int zy(byte[] bArr, int i2, int i3) {
        int iMin = Math.min(i3, this.f27086y.remaining());
        this.f27086y.get(bArr, i2, iMin);
        return iMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27081k.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f27082n) == 1) {
            return com.google.common.primitives.kja0.m16653h(this.f27082n[0]);
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r2 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return r2;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r9 + r10
            int r1 = r8.length
            com.google.common.base.jk.ek5k(r9, r0, r1)
            r0 = 0
            if (r10 != 0) goto La
            return r0
        La:
            boolean r1 = r7.f27085s
            r2 = r0
        Ld:
            boolean r3 = r7.f27083p
            if (r3 == 0) goto L2e
            int r3 = r9 + r2
            int r4 = r10 - r2
            int r3 = r7.zy(r8, r3, r4)
            int r2 = r2 + r3
            if (r2 == r10) goto L29
            boolean r3 = r7.f27080h
            if (r3 == 0) goto L21
            goto L29
        L21:
            r7.f27083p = r0
            java.nio.ByteBuffer r3 = r7.f27086y
            r3.clear()
            goto L2e
        L29:
            if (r2 <= 0) goto L2c
            goto L2d
        L2c:
            r2 = -1
        L2d:
            return r2
        L2e:
            boolean r3 = r7.f27080h
            if (r3 == 0) goto L35
            java.nio.charset.CoderResult r3 = java.nio.charset.CoderResult.UNDERFLOW
            goto L4c
        L35:
            if (r1 == 0) goto L40
            java.nio.charset.CharsetEncoder r3 = r7.f27084q
            java.nio.ByteBuffer r4 = r7.f27086y
            java.nio.charset.CoderResult r3 = r3.flush(r4)
            goto L4c
        L40:
            java.nio.charset.CharsetEncoder r3 = r7.f27084q
            java.nio.CharBuffer r4 = r7.f27079g
            java.nio.ByteBuffer r5 = r7.f27086y
            boolean r6 = r7.f27085s
            java.nio.charset.CoderResult r3 = r3.encode(r4, r5, r6)
        L4c:
            boolean r4 = r3.isOverflow()
            r5 = 1
            if (r4 == 0) goto L57
            r7.m16421p(r5)
            goto Ld
        L57:
            boolean r4 = r3.isUnderflow()
            if (r4 == 0) goto L6f
            if (r1 == 0) goto L65
            r7.f27080h = r5
            r7.m16421p(r0)
            goto Ld
        L65:
            boolean r3 = r7.f27085s
            if (r3 == 0) goto L6b
            r1 = r5
            goto L2e
        L6b:
            r7.m16423y()
            goto L2e
        L6f:
            boolean r4 = r3.isError()
            if (r4 == 0) goto L2e
            r3.throwException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.mcp.read(byte[], int, int):int");
    }

    mcp(Reader reader, CharsetEncoder charsetEncoder, int i2) {
        this.f27082n = new byte[1];
        this.f27081k = (Reader) com.google.common.base.jk.a9(reader);
        this.f27084q = (CharsetEncoder) com.google.common.base.jk.a9(charsetEncoder);
        com.google.common.base.jk.ld6(i2 > 0, "bufferSize must be positive: %s", i2);
        charsetEncoder.reset();
        CharBuffer charBufferAllocate = CharBuffer.allocate(i2);
        this.f27079g = charBufferAllocate;
        charBufferAllocate.flip();
        this.f27086y = ByteBuffer.allocate(i2);
    }
}

package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.common.hash.n */
/* JADX INFO: compiled from: AbstractNonStreamingHashFunction.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
abstract class AbstractC4667n extends zy {

    /* JADX INFO: renamed from: com.google.common.hash.n$k */
    /* JADX INFO: compiled from: AbstractNonStreamingHashFunction.java */
    private final class k extends AbstractC4672q {

        /* JADX INFO: renamed from: k */
        final toq f27017k;

        k(int i2) {
            this.f27017k = new toq(i2);
        }

        @Override // com.google.common.hash.InterfaceC4663h
        public n7h kja0() {
            return AbstractC4667n.this.hashBytes(this.f27017k.m16354k(), 0, this.f27017k.zy());
        }

        @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
        public InterfaceC4663h ld6(byte[] bArr, int i2, int i3) throws IOException {
            this.f27017k.write(bArr, i2, i3);
            return this;
        }

        @Override // com.google.common.hash.mcp
        /* JADX INFO: renamed from: s */
        public InterfaceC4663h mo16341s(byte b2) throws IOException {
            this.f27017k.write(b2);
            return this;
        }

        @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
        public InterfaceC4663h x2(ByteBuffer byteBuffer) {
            this.f27017k.m16355q(byteBuffer);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.common.hash.n$toq */
    /* JADX INFO: compiled from: AbstractNonStreamingHashFunction.java */
    private static final class toq extends ByteArrayOutputStream {
        toq(int i2) {
            super(i2);
        }

        /* JADX INFO: renamed from: k */
        byte[] m16354k() {
            return ((ByteArrayOutputStream) this).buf;
        }

        /* JADX INFO: renamed from: q */
        void m16355q(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            int i2 = ((ByteArrayOutputStream) this).count;
            int i3 = i2 + iRemaining;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (i3 > bArr.length) {
                ((ByteArrayOutputStream) this).buf = Arrays.copyOf(bArr, i2 + iRemaining);
            }
            byteBuffer.get(((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, iRemaining);
            ((ByteArrayOutputStream) this).count += iRemaining;
        }

        int zy() {
            return ((ByteArrayOutputStream) this).count;
        }
    }

    AbstractC4667n() {
    }

    @Override // com.google.common.hash.zy, com.google.common.hash.kja0
    public n7h hashBytes(ByteBuffer byteBuffer) {
        return newHasher(byteBuffer.remaining()).x2(byteBuffer).kja0();
    }

    @Override // com.google.common.hash.zy, com.google.common.hash.kja0
    public abstract n7h hashBytes(byte[] bArr, int i2, int i3);

    @Override // com.google.common.hash.zy, com.google.common.hash.kja0
    public n7h hashInt(int i2) {
        return hashBytes(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
    }

    @Override // com.google.common.hash.zy, com.google.common.hash.kja0
    public n7h hashLong(long j2) {
        return hashBytes(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j2).array());
    }

    @Override // com.google.common.hash.zy, com.google.common.hash.kja0
    public n7h hashString(CharSequence charSequence, Charset charset) {
        return hashBytes(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.zy, com.google.common.hash.kja0
    public n7h hashUnencodedChars(CharSequence charSequence) {
        int length = charSequence.length();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length * 2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i2 = 0; i2 < length; i2++) {
            byteBufferOrder.putChar(charSequence.charAt(i2));
        }
        return hashBytes(byteBufferOrder.array());
    }

    @Override // com.google.common.hash.kja0
    public InterfaceC4663h newHasher() {
        return newHasher(32);
    }

    @Override // com.google.common.hash.zy, com.google.common.hash.kja0
    public InterfaceC4663h newHasher(int i2) {
        com.google.common.base.jk.m15383q(i2 >= 0);
        return new k(i2);
    }
}

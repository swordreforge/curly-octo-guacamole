package com.google.common.hash;

import com.google.common.base.C4258g;
import com.google.common.primitives.C4746s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import z4j7.C7797k;

/* JADX INFO: renamed from: com.google.common.hash.t */
/* JADX INFO: compiled from: Murmur3_32HashFunction.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
final class C4678t extends zy implements Serializable {

    /* JADX INFO: renamed from: k */
    private static final int f27027k = 4;

    /* JADX INFO: renamed from: n */
    private static final int f27028n = 461845907;

    /* JADX INFO: renamed from: q */
    private static final int f27029q = -862048943;
    private static final long serialVersionUID = 0;
    private final int seed;
    static final kja0 MURMUR3_32 = new C4678t(0);
    static final kja0 GOOD_FAST_HASH_32 = new C4678t(cdj.f26989k);

    /* JADX INFO: renamed from: com.google.common.hash.t$k */
    /* JADX INFO: compiled from: Murmur3_32HashFunction.java */
    @CanIgnoreReturnValue
    private static final class k extends AbstractC4672q {

        /* JADX INFO: renamed from: k */
        private int f27030k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private long f68317toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f68318zy;

        /* JADX INFO: renamed from: q */
        private int f27032q = 0;

        /* JADX INFO: renamed from: n */
        private boolean f27031n = false;

        k(int i2) {
            this.f27030k = i2;
        }

        /* JADX INFO: renamed from: h */
        private void m16369h(int i2, long j2) {
            long j3 = this.f68317toq;
            int i3 = this.f68318zy;
            long j4 = ((j2 & 4294967295L) << i3) | j3;
            this.f68317toq = j4;
            int i4 = i3 + (i2 * 8);
            this.f68318zy = i4;
            this.f27032q += i2;
            if (i4 >= 32) {
                this.f27030k = C4678t.m16365g(this.f27030k, C4678t.f7l8((int) j4));
                this.f68317toq >>>= 32;
                this.f68318zy -= 32;
            }
        }

        @Override // com.google.common.hash.InterfaceC4663h
        public n7h kja0() {
            com.google.common.base.jk.yz(!this.f27031n);
            this.f27031n = true;
            int iF7l8 = this.f27030k ^ C4678t.f7l8((int) this.f68317toq);
            this.f27030k = iF7l8;
            return C4678t.m16368q(iF7l8, this.f27032q);
        }

        @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
        /* JADX INFO: renamed from: g */
        public InterfaceC4663h mo16337g(long j2) {
            m16369h(4, (int) j2);
            m16369h(4, j2 >>> 32);
            return this;
        }

        @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
        public InterfaceC4663h ld6(byte[] bArr, int i2, int i3) {
            com.google.common.base.jk.ek5k(i2, i2 + i3, bArr.length);
            int i4 = 0;
            while (true) {
                int i5 = i4 + 4;
                if (i5 > i3) {
                    break;
                }
                m16369h(4, C4678t.m16367n(bArr, i4 + i2));
                i4 = i5;
            }
            while (i4 < i3) {
                mo16341s(bArr[i2 + i4]);
                i4++;
            }
            return this;
        }

        @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
        /* JADX INFO: renamed from: n */
        public InterfaceC4663h mo16340n(int i2) {
            m16369h(4, i2);
            return this;
        }

        @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
        public InterfaceC4663h qrj(CharSequence charSequence, Charset charset) {
            if (!C4258g.f68103zy.equals(charset)) {
                return super.qrj(charSequence, charset);
            }
            int length = charSequence.length();
            int i2 = 0;
            while (true) {
                int i3 = i2 + 4;
                if (i3 > length) {
                    break;
                }
                char cCharAt = charSequence.charAt(i2);
                char cCharAt2 = charSequence.charAt(i2 + 1);
                char cCharAt3 = charSequence.charAt(i2 + 2);
                char cCharAt4 = charSequence.charAt(i2 + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                m16369h(4, (cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24));
                i2 = i3;
            }
            while (i2 < length) {
                char cCharAt5 = charSequence.charAt(i2);
                if (cCharAt5 < 128) {
                    m16369h(1, cCharAt5);
                } else if (cCharAt5 < 2048) {
                    m16369h(2, C4678t.toq(cCharAt5));
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    m16369h(3, C4678t.m16366k(cCharAt5));
                } else {
                    int iCodePointAt = Character.codePointAt(charSequence, i2);
                    if (iCodePointAt == cCharAt5) {
                        f7l8(charSequence.subSequence(i2, length).toString().getBytes(charset));
                        return this;
                    }
                    i2++;
                    m16369h(4, C4678t.zy(iCodePointAt));
                }
                i2++;
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        /* JADX INFO: renamed from: s */
        public InterfaceC4663h mo16341s(byte b2) {
            m16369h(1, b2 & 255);
            return this;
        }

        @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
        public InterfaceC4663h x2(ByteBuffer byteBuffer) {
            ByteOrder byteOrderOrder = byteBuffer.order();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBuffer.remaining() >= 4) {
                mo16340n(byteBuffer.getInt());
            }
            while (byteBuffer.hasRemaining()) {
                mo16341s(byteBuffer.get());
            }
            byteBuffer.order(byteOrderOrder);
            return this;
        }

        @Override // com.google.common.hash.AbstractC4672q, com.google.common.hash.mcp
        /* JADX INFO: renamed from: y */
        public InterfaceC4663h mo16342y(char c2) {
            m16369h(2, c2);
            return this;
        }
    }

    C4678t(int i2) {
        this.seed = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f7l8(int i2) {
        return Integer.rotateLeft(i2 * f27029q, 15) * f27028n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static int m16365g(int i2, int i3) {
        return (Integer.rotateLeft(i2 ^ i3, 13) * 5) - 430675100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static long m16366k(char c2) {
        return (((c2 & '?') | 128) << 16) | (((c2 >>> '\f') | 480) & 255) | ((((c2 >>> 6) & 63) | 128) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static int m16367n(byte[] bArr, int i2) {
        return C4746s.ld6(bArr[i2 + 3], bArr[i2 + 2], bArr[i2 + 1], bArr[i2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static n7h m16368q(int i2, int i3) {
        int i4 = i2 ^ i3;
        int i5 = (i4 ^ (i4 >>> 16)) * (-2048144789);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477387);
        return n7h.fromInt(i6 ^ (i6 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long toq(char c2) {
        return (((c2 & '?') | 128) << 8) | (((c2 >>> 6) | C7797k.f100634zy) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long zy(int i2) {
        return ((((long) (i2 >>> 18)) | 240) & 255) | ((((long) ((i2 >>> 12) & 63)) | 128) << 8) | ((((long) ((i2 >>> 6) & 63)) | 128) << 16) | ((((long) (i2 & 63)) | 128) << 24);
    }

    @Override // com.google.common.hash.kja0
    public int bits() {
        return 32;
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof C4678t) && this.seed == ((C4678t) obj).seed;
    }

    @Override // com.google.common.hash.zy, com.google.common.hash.kja0
    public n7h hashBytes(byte[] bArr, int i2, int i3) {
        com.google.common.base.jk.ek5k(i2, i2 + i3, bArr.length);
        int iM16365g = this.seed;
        int iM16653h = 0;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 4;
            if (i5 > i3) {
                break;
            }
            iM16365g = m16365g(iM16365g, f7l8(m16367n(bArr, i4 + i2)));
            i4 = i5;
        }
        int i6 = i4;
        int i7 = 0;
        while (i6 < i3) {
            iM16653h ^= com.google.common.primitives.kja0.m16653h(bArr[i2 + i6]) << i7;
            i6++;
            i7 += 8;
        }
        return m16368q(f7l8(iM16653h) ^ iM16365g, i3);
    }

    public int hashCode() {
        return C4678t.class.hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.zy, com.google.common.hash.kja0
    public n7h hashInt(int i2) {
        return m16368q(m16365g(this.seed, f7l8(i2)), 4);
    }

    @Override // com.google.common.hash.zy, com.google.common.hash.kja0
    public n7h hashLong(long j2) {
        return m16368q(m16365g(m16365g(this.seed, f7l8((int) j2)), f7l8((int) (j2 >>> 32))), 8);
    }

    @Override // com.google.common.hash.zy, com.google.common.hash.kja0
    public n7h hashString(CharSequence charSequence, Charset charset) {
        if (!C4258g.f68103zy.equals(charset)) {
            return hashBytes(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int iM16365g = this.seed;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i3 + 4;
            if (i5 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i3);
            char cCharAt2 = charSequence.charAt(i3 + 1);
            char cCharAt3 = charSequence.charAt(i3 + 2);
            char cCharAt4 = charSequence.charAt(i3 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            iM16365g = m16365g(iM16365g, f7l8((cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24)));
            i4 += 4;
            i3 = i5;
        }
        long jM16366k = 0;
        while (i3 < length) {
            char cCharAt5 = charSequence.charAt(i3);
            if (cCharAt5 < 128) {
                jM16366k |= ((long) cCharAt5) << i2;
                i2 += 8;
                i4++;
            } else if (cCharAt5 < 2048) {
                jM16366k |= toq(cCharAt5) << i2;
                i2 += 16;
                i4 += 2;
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                jM16366k |= m16366k(cCharAt5) << i2;
                i2 += 24;
                i4 += 3;
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i3);
                if (iCodePointAt == cCharAt5) {
                    return hashBytes(charSequence.toString().getBytes(charset));
                }
                i3++;
                jM16366k |= zy(iCodePointAt) << i2;
                i4 += 4;
            }
            if (i2 >= 32) {
                iM16365g = m16365g(iM16365g, f7l8((int) jM16366k));
                jM16366k >>>= 32;
                i2 -= 32;
            }
            i3++;
        }
        return m16368q(f7l8((int) jM16366k) ^ iM16365g, i4);
    }

    @Override // com.google.common.hash.zy, com.google.common.hash.kja0
    public n7h hashUnencodedChars(CharSequence charSequence) {
        int iF7l8 = this.seed;
        for (int i2 = 1; i2 < charSequence.length(); i2 += 2) {
            iF7l8 = m16365g(iF7l8, f7l8(charSequence.charAt(i2 - 1) | (charSequence.charAt(i2) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            iF7l8 ^= f7l8(charSequence.charAt(charSequence.length() - 1));
        }
        return m16368q(iF7l8, charSequence.length() * 2);
    }

    @Override // com.google.common.hash.kja0
    public InterfaceC4663h newHasher() {
        return new k(this.seed);
    }

    public String toString() {
        return "Hashing.murmur3_32(" + this.seed + ")";
    }
}

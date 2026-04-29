package com.google.android.exoplayer2.upstream.crypto;

import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import zy.dd;

/* JADX INFO: compiled from: AesFlushingCipher.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    private final Cipher f22993k;

    /* JADX INFO: renamed from: n */
    private int f22994n;

    /* JADX INFO: renamed from: q */
    private final byte[] f22995q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f66831toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final byte[] f66832zy;

    public zy(int i2, byte[] bArr, @dd String str, long j2) {
        this(i2, bArr, m13450k(str), j2);
    }

    /* JADX INFO: renamed from: k */
    private static long m13450k(@dd String str) {
        long j2 = 0;
        if (str == null) {
            return 0L;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            long jCharAt = j2 ^ ((long) str.charAt(i2));
            j2 = jCharAt + (jCharAt << 1) + (jCharAt << 4) + (jCharAt << 5) + (jCharAt << 7) + (jCharAt << 8) + (jCharAt << 40);
        }
        return j2;
    }

    private byte[] toq(long j2, long j3) {
        return ByteBuffer.allocate(16).putLong(j2).putLong(j3).array();
    }

    private int zy(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        try {
            return this.f22993k.update(bArr, i2, i3, bArr2, i4);
        } catch (ShortBufferException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m13451n(byte[] bArr, int i2, int i3) {
        m13452q(bArr, i2, i3, bArr, i2);
    }

    /* JADX INFO: renamed from: q */
    public void m13452q(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        int i5 = i2;
        do {
            int i6 = this.f22994n;
            if (i6 <= 0) {
                int iZy = zy(bArr, i5, i3, bArr2, i4);
                if (i3 == iZy) {
                    return;
                }
                int i7 = i3 - iZy;
                int i8 = 0;
                C3844k.m13633s(i7 < this.f66831toq);
                int i9 = i4 + iZy;
                int i10 = this.f66831toq - i7;
                this.f22994n = i10;
                C3844k.m13633s(zy(this.f66832zy, 0, i10, this.f22995q, 0) == this.f66831toq);
                while (i8 < i7) {
                    bArr2[i9] = this.f22995q[i8];
                    i8++;
                    i9++;
                }
                return;
            }
            bArr2[i4] = (byte) (bArr[i5] ^ this.f22995q[this.f66831toq - i6]);
            i4++;
            i5++;
            this.f22994n = i6 - 1;
            i3--;
        } while (i3 != 0);
    }

    public zy(int i2, byte[] bArr, long j2, long j3) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.f22993k = cipher;
            int blockSize = cipher.getBlockSize();
            this.f66831toq = blockSize;
            this.f66832zy = new byte[blockSize];
            this.f22995q = new byte[blockSize];
            long j4 = j3 / ((long) blockSize);
            int i3 = (int) (j3 % ((long) blockSize));
            cipher.init(i2, new SecretKeySpec(bArr, lrht.jbh(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(toq(j2, j4)));
            if (i3 != 0) {
                m13451n(new byte[i3], 0, i3);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }
}

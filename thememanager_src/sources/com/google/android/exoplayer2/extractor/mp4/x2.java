package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.ni7;
import java.nio.ByteBuffer;
import java.util.UUID;
import zy.dd;

/* JADX INFO: compiled from: PsshAtomUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x2 {

    /* JADX INFO: renamed from: k */
    private static final String f20083k = "PsshAtomUtil";

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.x2$k */
    /* JADX INFO: compiled from: PsshAtomUtil.java */
    private static class C3385k {

        /* JADX INFO: renamed from: k */
        private final UUID f20084k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f64302toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final byte[] f64303zy;

        public C3385k(UUID uuid, int i2, byte[] bArr) {
            this.f20084k = uuid;
            this.f64302toq = i2;
            this.f64303zy = bArr;
        }
    }

    private x2() {
    }

    public static int f7l8(byte[] bArr) {
        C3385k c3385kM11886q = m11886q(bArr);
        if (c3385kM11886q == null) {
            return -1;
        }
        return c3385kM11886q.f64302toq;
    }

    @dd
    /* JADX INFO: renamed from: g */
    public static UUID m11883g(byte[] bArr) {
        C3385k c3385kM11886q = m11886q(bArr);
        if (c3385kM11886q == null) {
            return null;
        }
        return c3385kM11886q.f20084k;
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m11884k(UUID uuid, @dd byte[] bArr) {
        return toq(uuid, null, bArr);
    }

    @dd
    /* JADX INFO: renamed from: n */
    public static byte[] m11885n(byte[] bArr, UUID uuid) {
        C3385k c3385kM11886q = m11886q(bArr);
        if (c3385kM11886q == null) {
            return null;
        }
        if (uuid.equals(c3385kM11886q.f20084k)) {
            return c3385kM11886q.f64303zy;
        }
        String strValueOf = String.valueOf(uuid);
        String strValueOf2 = String.valueOf(c3385kM11886q.f20084k);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 33 + strValueOf2.length());
        sb.append("UUID mismatch. Expected: ");
        sb.append(strValueOf);
        sb.append(", got: ");
        sb.append(strValueOf2);
        sb.append(".");
        ni7.qrj(f20083k, sb.toString());
        return null;
    }

    @dd
    /* JADX INFO: renamed from: q */
    private static C3385k m11886q(byte[] bArr) {
        gvn7 gvn7Var = new gvn7(bArr);
        if (gvn7Var.m13591g() < 32) {
            return null;
        }
        gvn7Var.n5r1(0);
        if (gvn7Var.kja0() != gvn7Var.m13594k() + 4 || gvn7Var.kja0() != 1886614376) {
            return null;
        }
        int iZy = AbstractC3373k.zy(gvn7Var.kja0());
        if (iZy > 1) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unsupported pssh version: ");
            sb.append(iZy);
            ni7.qrj(f20083k, sb.toString());
            return null;
        }
        UUID uuid = new UUID(gvn7Var.o1t(), gvn7Var.o1t());
        if (iZy == 1) {
            gvn7Var.hyr(gvn7Var.eqxt() * 16);
        }
        int iEqxt = gvn7Var.eqxt();
        if (iEqxt != gvn7Var.m13594k()) {
            return null;
        }
        byte[] bArr2 = new byte[iEqxt];
        gvn7Var.ld6(bArr2, 0, iEqxt);
        return new C3385k(uuid, iZy, bArr2);
    }

    public static byte[] toq(UUID uuid, @dd UUID[] uuidArr, @dd byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(AbstractC3373k.f64152gyi);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean zy(byte[] bArr) {
        return m11886q(bArr) != null;
    }
}

package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class cyoe {

    /* JADX INFO: renamed from: n */
    public static final byte[] f32785n = {80, 85, 83, 72};

    /* JADX INFO: renamed from: k */
    private short f32786k;

    /* JADX INFO: renamed from: q */
    private byte[] f32787q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private byte f73298toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f73299zy;

    /* JADX INFO: renamed from: com.xiaomi.push.cyoe$k */
    public static class C5855k {

        /* JADX INFO: renamed from: k */
        public static final zy f32788k = new zy();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final C5856q f73300toq = new C5856q();

        /* JADX INFO: renamed from: k */
        public static byte[] m20708k(byte[] bArr) {
            return toq(bArr, f73300toq);
        }

        public static byte[] toq(byte[] bArr, toq toqVar) {
            if (!cyoe.m20703g(bArr)) {
                return bArr;
            }
            cyoe cyoeVarM20705n = cyoe.m20705n(bArr);
            return (cyoeVarM20705n.f73298toq == 0 || cyoeVarM20705n.f73298toq != toqVar.mo20709a()) ? cyoeVarM20705n.f32787q : toqVar.mo20710k(cyoeVarM20705n.f32787q, cyoeVarM20705n.f73299zy);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.cyoe$q */
    public static final class C5856q implements toq {
        @Override // com.xiaomi.push.cyoe.toq
        /* JADX INFO: renamed from: a */
        public byte mo20709a() {
            return (byte) 2;
        }

        @Override // com.xiaomi.push.cyoe.toq
        /* JADX INFO: renamed from: k */
        public byte[] mo20710k(byte[] bArr, int i2) throws Throwable {
            GZIPInputStream gZIPInputStream = null;
            try {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(new ByteArrayInputStream(bArr), i2);
                try {
                    byte[] bArr2 = new byte[i2];
                    gZIPInputStream2.read(bArr2);
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return bArr2;
                } catch (IOException unused2) {
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return bArr;
                } catch (Throwable th) {
                    th = th;
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: a */
        byte mo20709a();

        /* JADX INFO: renamed from: k */
        byte[] mo20710k(byte[] bArr, int i2);
    }

    public static final class zy {
    }

    protected cyoe(byte b2, int i2, byte[] bArr) {
        this((short) 1, b2, i2, bArr);
    }

    public static boolean f7l8(byte[] bArr, byte[] bArr2, int i2) {
        if (bArr.length < i2 || bArr2.length < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (bArr[i3] != bArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m20703g(byte[] bArr) {
        byte[] bArr2 = f32785n;
        return f7l8(bArr2, bArr, bArr2.length);
    }

    /* JADX INFO: renamed from: n */
    public static cyoe m20705n(byte[] bArr) {
        if (!m20703g(bArr)) {
            return zy((byte) 0, bArr.length, bArr);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.getInt();
        short s2 = byteBufferOrder.getShort();
        byte b2 = byteBufferOrder.get();
        int i2 = byteBufferOrder.getInt();
        byte[] bArr2 = new byte[byteBufferOrder.getInt()];
        byteBufferOrder.get(bArr2);
        return m20706q(s2, b2, i2, bArr2);
    }

    /* JADX INFO: renamed from: q */
    public static cyoe m20706q(short s2, byte b2, int i2, byte[] bArr) {
        return new cyoe(s2, b2, i2, bArr);
    }

    public static cyoe zy(byte b2, int i2, byte[] bArr) {
        return new cyoe(b2, i2, bArr);
    }

    protected cyoe(short s2, byte b2, int i2, byte[] bArr) {
        this.f32786k = s2;
        this.f73298toq = b2;
        this.f73299zy = i2;
        this.f32787q = bArr;
    }
}

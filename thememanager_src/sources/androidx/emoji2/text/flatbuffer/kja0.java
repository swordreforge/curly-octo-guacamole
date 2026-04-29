package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: MetadataItem.java */
/* JADX INFO: loaded from: classes.dex */
public final class kja0 extends zurt {

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.kja0$k */
    /* JADX INFO: compiled from: MetadataItem.java */
    public static final class C0812k extends toq {
        public kja0 f7l8(int i2) {
            return m3904y(new kja0(), i2);
        }

        /* JADX INFO: renamed from: g */
        public C0812k m3903g(int i2, int i3, ByteBuffer byteBuffer) {
            toq(i2, i3, byteBuffer);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public kja0 m3904y(kja0 kja0Var, int i2) {
            return kja0Var.zurt(zurt.zy(m3987k(i2), this.f4496q), this.f4496q);
        }
    }

    public static void a9(C0818s c0818s, short s2) {
        c0818s.m3970h(4, s2, 0);
    }

    /* JADX INFO: renamed from: c */
    public static void m3897c(C0818s c0818s, int i2) {
        c0818s.y9n(4, i2, 4);
    }

    public static void fn3e() {
        f7l8.m3867k();
    }

    public static void jk(C0818s c0818s, short s2) {
        c0818s.m3970h(2, s2, 0);
    }

    /* JADX INFO: renamed from: l */
    public static kja0 m3898l(ByteBuffer byteBuffer, kja0 kja0Var) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return kja0Var.zurt(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void lrht(C0818s c0818s) {
        c0818s.yz(7);
    }

    public static int lvui(C0818s c0818s, int[] iArr) {
        c0818s.y9n(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            c0818s.m3978p(iArr[length]);
        }
        return c0818s.a9();
    }

    public static void mcp(C0818s c0818s, int i2) {
        c0818s.ld6(0, i2, 0);
    }

    public static kja0 ncyb(ByteBuffer byteBuffer) {
        return m3898l(byteBuffer, new kja0());
    }

    public static void o1t(C0818s c0818s, short s2) {
        c0818s.m3970h(3, s2, 0);
    }

    /* JADX INFO: renamed from: r */
    public static int m3899r(C0818s c0818s, int i2, boolean z2, short s2, short s3, short s4, short s5, int i3) {
        c0818s.yz(7);
        m3901z(c0818s, i3);
        mcp(c0818s, i2);
        m3900t(c0818s, s5);
        a9(c0818s, s4);
        o1t(c0818s, s3);
        jk(c0818s, s2);
        wvg(c0818s, z2);
        return x9kr(c0818s);
    }

    /* JADX INFO: renamed from: t */
    public static void m3900t(C0818s c0818s, short s2) {
        c0818s.m3970h(5, s2, 0);
    }

    public static void wvg(C0818s c0818s, boolean z2) {
        c0818s.toq(1, z2, false);
    }

    public static int x9kr(C0818s c0818s) {
        return c0818s.jk();
    }

    /* JADX INFO: renamed from: z */
    public static void m3901z(C0818s c0818s, int i2) {
        c0818s.kja0(6, i2, 0);
    }

    public short d2ok() {
        int iM4003q = m4003q(10);
        if (iM4003q != 0) {
            return this.f51140toq.getShort(iM4003q + this.f4497k);
        }
        return (short) 0;
    }

    public int d3() {
        int iM4003q = m4003q(16);
        if (iM4003q != 0) {
            return kja0(iM4003q);
        }
        return 0;
    }

    public boolean dd() {
        int iM4003q = m4003q(6);
        return (iM4003q == 0 || this.f51140toq.get(iM4003q + this.f4497k) == 0) ? false : true;
    }

    public qrj eqxt(qrj qrjVar) {
        int iM4003q = m4003q(16);
        if (iM4003q != 0) {
            return qrjVar.m3963g(x2(iM4003q), this.f51140toq);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public short m3902f() {
        int iM4003q = m4003q(8);
        if (iM4003q != 0) {
            return this.f51140toq.getShort(iM4003q + this.f4497k);
        }
        return (short) 0;
    }

    public int fti(int i2) {
        int iM4003q = m4003q(16);
        if (iM4003q != 0) {
            return this.f51140toq.getInt(x2(iM4003q) + (i2 * 4));
        }
        return 0;
    }

    public ByteBuffer gvn7(ByteBuffer byteBuffer) {
        return n7h(byteBuffer, 16, 4);
    }

    public int hyr() {
        int iM4003q = m4003q(4);
        if (iM4003q != 0) {
            return this.f51140toq.getInt(iM4003q + this.f4497k);
        }
        return 0;
    }

    public ByteBuffer jp0y() {
        return qrj(16, 4);
    }

    public short n5r1() {
        int iM4003q = m4003q(14);
        if (iM4003q != 0) {
            return this.f51140toq.getShort(iM4003q + this.f4497k);
        }
        return (short) 0;
    }

    public void ni7(int i2, ByteBuffer byteBuffer) {
        f7l8(i2, byteBuffer);
    }

    public qrj oc() {
        return eqxt(new qrj());
    }

    public short uv6() {
        int iM4003q = m4003q(12);
        if (iM4003q != 0) {
            return this.f51140toq.getShort(iM4003q + this.f4497k);
        }
        return (short) 0;
    }

    public kja0 zurt(int i2, ByteBuffer byteBuffer) {
        ni7(i2, byteBuffer);
        return this;
    }
}

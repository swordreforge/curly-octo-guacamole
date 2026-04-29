package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.kja0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.h */
/* JADX INFO: compiled from: MetadataList.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0809h extends zurt {

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.h$k */
    /* JADX INFO: compiled from: MetadataList.java */
    public static final class k extends toq {
        public C0809h f7l8(int i2) {
            return m3886y(new C0809h(), i2);
        }

        /* JADX INFO: renamed from: g */
        public k m3885g(int i2, int i3, ByteBuffer byteBuffer) {
            toq(i2, i3, byteBuffer);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C0809h m3886y(C0809h c0809h, int i2) {
            return c0809h.zurt(zurt.zy(m3987k(i2), this.f4496q), this.f4496q);
        }
    }

    public static void a9(C0818s c0818s, int i2) {
        c0818s.fti(i2);
    }

    public static void fn3e() {
        f7l8.m3867k();
    }

    public static void fti(C0818s c0818s, int i2) {
        c0818s.oc(i2);
    }

    public static C0809h gvn7(ByteBuffer byteBuffer, C0809h c0809h) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c0809h.zurt(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int jk(C0818s c0818s) {
        return c0818s.jk();
    }

    public static C0809h jp0y(ByteBuffer byteBuffer) {
        return gvn7(byteBuffer, new C0809h());
    }

    /* JADX INFO: renamed from: l */
    public static void m3881l(C0818s c0818s) {
        c0818s.yz(3);
    }

    public static int mcp(C0818s c0818s, int i2, int i3, int i4) {
        c0818s.yz(3);
        o1t(c0818s, i4);
        m3883z(c0818s, i3);
        wvg(c0818s, i2);
        return jk(c0818s);
    }

    public static void ncyb(C0818s c0818s, int i2) {
        c0818s.y9n(4, i2, 4);
    }

    public static void o1t(C0818s c0818s, int i2) {
        c0818s.kja0(2, i2, 0);
    }

    /* JADX INFO: renamed from: t */
    public static int m3882t(C0818s c0818s, int[] iArr) {
        c0818s.y9n(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            c0818s.n7h(iArr[length]);
        }
        return c0818s.a9();
    }

    public static void wvg(C0818s c0818s, int i2) {
        c0818s.ld6(0, i2, 0);
    }

    /* JADX INFO: renamed from: z */
    public static void m3883z(C0818s c0818s, int i2) {
        c0818s.kja0(1, i2, 0);
    }

    public kja0.C0812k d2ok() {
        return lvui(new kja0.C0812k());
    }

    public kja0 d3(int i2) {
        return oc(new kja0(), i2);
    }

    public ByteBuffer dd() {
        return qrj(8, 1);
    }

    public int eqxt() {
        int iM4003q = m4003q(6);
        if (iM4003q != 0) {
            return kja0(iM4003q);
        }
        return 0;
    }

    public kja0.C0812k lvui(kja0.C0812k c0812k) {
        int iM4003q = m4003q(6);
        if (iM4003q != 0) {
            return c0812k.m3903g(x2(iM4003q), 4, this.f51140toq);
        }
        return null;
    }

    public int n5r1() {
        int iM4003q = m4003q(4);
        if (iM4003q != 0) {
            return this.f51140toq.getInt(iM4003q + this.f4497k);
        }
        return 0;
    }

    public void ni7(int i2, ByteBuffer byteBuffer) {
        f7l8(i2, byteBuffer);
    }

    public kja0 oc(kja0 kja0Var, int i2) {
        int iM4003q = m4003q(6);
        if (iM4003q != 0) {
            return kja0Var.zurt(toq(x2(iM4003q) + (i2 * 4)), this.f51140toq);
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public String m3884r() {
        int iM4003q = m4003q(8);
        if (iM4003q != 0) {
            return m4004y(iM4003q + this.f4497k);
        }
        return null;
    }

    public ByteBuffer x9kr(ByteBuffer byteBuffer) {
        return n7h(byteBuffer, 8, 1);
    }

    public C0809h zurt(int i2, ByteBuffer byteBuffer) {
        ni7(i2, byteBuffer);
        return this;
    }
}

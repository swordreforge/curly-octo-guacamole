package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.C0816p;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: compiled from: FlexBuffersBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f51091cdj = 3;

    /* JADX INFO: renamed from: h */
    private static final int f4446h = 2;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    static final /* synthetic */ boolean f51092ki = false;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f51093kja0 = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f51094ld6 = 3;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f51095n7h = 0;

    /* JADX INFO: renamed from: p */
    public static final int f4447p = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f51096qrj = 7;

    /* JADX INFO: renamed from: s */
    public static final int f4448s = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f51097x2 = 4;

    /* JADX INFO: renamed from: y */
    public static final int f4449y = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Comparator<toq> f51098f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f4450g;

    /* JADX INFO: renamed from: k */
    private final ki f4451k;

    /* JADX INFO: renamed from: n */
    private final int f4452n;

    /* JADX INFO: renamed from: q */
    private final HashMap<String, Integer> f4453q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ArrayList<toq> f51099toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final HashMap<String, Integer> f51100zy;

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.ld6$k */
    /* JADX INFO: compiled from: FlexBuffersBuilder.java */
    class C0813k implements Comparator<toq> {
        C0813k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(toq toqVar, toq toqVar2) {
            byte b2;
            byte b3;
            int i2 = toqVar.f4457n;
            int i3 = toqVar2.f4457n;
            do {
                b2 = ld6.this.f4451k.get(i2);
                b3 = ld6.this.f4451k.get(i3);
                if (b2 == 0) {
                    return b2 - b3;
                }
                i2++;
                i3++;
            } while (b2 == b3);
            return b2 - b3;
        }
    }

    public ld6(int i2) {
        this(new C0811k(i2), 1);
    }

    static int a9(long j2) {
        if (j2 <= C0816p.p.m3958k((byte) -1)) {
            return 0;
        }
        if (j2 <= C0816p.p.zy((short) -1)) {
            return 1;
        }
        return j2 <= C0816p.p.toq(-1) ? 2 : 3;
    }

    private void d3(long j2, int i2) {
        if (i2 == 1) {
            this.f4451k.cdj((byte) j2);
            return;
        }
        if (i2 == 2) {
            this.f4451k.zy((short) j2);
        } else if (i2 == 4) {
            this.f4451k.mo3892n((int) j2);
        } else {
            if (i2 != 8) {
                return;
            }
            this.f4451k.mo3888g(j2);
        }
    }

    private toq eqxt(int i2, String str) {
        return jp0y(i2, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    private int fn3e(String str) {
        if (str == null) {
            return -1;
        }
        int iKja0 = this.f4451k.kja0();
        if ((this.f4452n & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f4451k.zurt(bytes, 0, bytes.length);
            this.f4451k.cdj((byte) 0);
            this.f51100zy.put(str, Integer.valueOf(iKja0));
            return iKja0;
        }
        Integer num = this.f51100zy.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f4451k.zurt(bytes2, 0, bytes2.length);
        this.f4451k.cdj((byte) 0);
        this.f51100zy.put(str, Integer.valueOf(iKja0));
        return iKja0;
    }

    private void fti(toq toqVar, int i2) {
        int i3 = toqVar.f4456k;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            if (i3 == 3) {
                gvn7(toqVar.f51102zy, i2);
                return;
            } else if (i3 != 26) {
                oc(toqVar.f4458q, i2);
                return;
            }
        }
        d3(toqVar.f4458q, i2);
    }

    private void gvn7(double d2, int i2) {
        if (i2 == 4) {
            this.f4451k.toq((float) d2);
        } else if (i2 == 8) {
            this.f4451k.mo3891k(d2);
        }
    }

    private toq jp0y(int i2, byte[] bArr, int i3, boolean z2) {
        int iA9 = a9(bArr.length);
        d3(bArr.length, toq(iA9));
        int iKja0 = this.f4451k.kja0();
        this.f4451k.zurt(bArr, 0, bArr.length);
        if (z2) {
            this.f4451k.cdj((byte) 0);
        }
        return toq.m3917g(i2, iKja0, i3, iA9);
    }

    private void o1t(String str, long j2) {
        int iFn3e = fn3e(str);
        int iA9 = a9(j2);
        this.f51099toq.add(iA9 == 0 ? toq.fu4(iFn3e, (int) j2) : iA9 == 1 ? toq.fn3e(iFn3e, (int) j2) : iA9 == 2 ? toq.zurt(iFn3e, (int) j2) : toq.ni7(iFn3e, j2));
    }

    private void oc(long j2, int i2) {
        d3((int) (((long) this.f4451k.kja0()) - j2), i2);
    }

    /* JADX INFO: renamed from: q */
    private toq m3906q(int i2, int i3, int i4, boolean z2, boolean z3, toq toqVar) {
        int i5;
        int iCdj;
        int i6 = i4;
        long j2 = i6;
        int iMax = Math.max(0, a9(j2));
        if (toqVar != null) {
            iMax = Math.max(iMax, toqVar.m3925y(this.f4451k.kja0(), 0));
            i5 = 3;
        } else {
            i5 = 1;
        }
        int i7 = 4;
        int iMax2 = iMax;
        for (int i8 = i3; i8 < this.f51099toq.size(); i8++) {
            iMax2 = Math.max(iMax2, this.f51099toq.get(i8).m3925y(this.f4451k.kja0(), i8 + i5));
            if (z2 && i8 == i3) {
                i7 = this.f51099toq.get(i8).f4456k;
                if (!C0816p.x2(i7)) {
                    throw new C0816p.toq("TypedVector does not support this element type");
                }
            }
        }
        int i9 = i3;
        int qVar = toq(iMax2);
        if (toqVar != null) {
            oc(toqVar.f4458q, qVar);
            d3(1 << toqVar.f51101toq, qVar);
        }
        if (!z3) {
            d3(j2, qVar);
        }
        int iKja0 = this.f4451k.kja0();
        for (int i10 = i9; i10 < this.f51099toq.size(); i10++) {
            fti(this.f51099toq.get(i10), qVar);
        }
        if (!z2) {
            while (i9 < this.f51099toq.size()) {
                this.f4451k.cdj(this.f51099toq.get(i9).t8r(iMax2));
                i9++;
            }
        }
        if (toqVar != null) {
            iCdj = 9;
        } else if (z2) {
            if (!z3) {
                i6 = 0;
            }
            iCdj = C0816p.cdj(i7, i6);
        } else {
            iCdj = 10;
        }
        return new toq(i2, iCdj, iMax2, iKja0);
    }

    private int toq(int i2) {
        int i3 = 1 << i2;
        int iCdj = toq.cdj(this.f4451k.kja0(), i3);
        while (true) {
            int i4 = iCdj - 1;
            if (iCdj == 0) {
                return i3;
            }
            this.f4451k.cdj((byte) 0);
            iCdj = i4;
        }
    }

    private void wvg(String str, long j2) {
        this.f51099toq.add(toq.ni7(fn3e(str), j2));
    }

    private toq zy(int i2, int i3) {
        long j2 = i3;
        int iMax = Math.max(0, a9(j2));
        int i4 = i2;
        while (i4 < this.f51099toq.size()) {
            i4++;
            iMax = Math.max(iMax, toq.m3924s(4, 0, this.f51099toq.get(i4).f4457n, this.f4451k.kja0(), i4));
        }
        int qVar = toq(iMax);
        d3(j2, qVar);
        int iKja0 = this.f4451k.kja0();
        while (i2 < this.f51099toq.size()) {
            int i5 = this.f51099toq.get(i2).f4457n;
            oc(this.f51099toq.get(i2).f4457n, qVar);
            i2++;
        }
        return new toq(-1, C0816p.cdj(4, 0), iMax, iKja0);
    }

    public void cdj(int i2) {
        t8r(null, i2);
    }

    public ByteBuffer f7l8() {
        int qVar = toq(this.f51099toq.get(0).m3925y(this.f4451k.kja0(), 0));
        fti(this.f51099toq.get(0), qVar);
        this.f4451k.cdj(this.f51099toq.get(0).ki());
        this.f4451k.cdj((byte) qVar);
        this.f4450g = true;
        return ByteBuffer.wrap(this.f4451k.ld6(), 0, this.f4451k.kja0());
    }

    public void fu4(int i2) {
        o1t(null, i2);
    }

    /* JADX INFO: renamed from: g */
    public int m3907g(String str, int i2, boolean z2, boolean z3) {
        toq toqVarM3906q = m3906q(fn3e(str), i2, this.f51099toq.size() - i2, z2, z3, null);
        while (this.f51099toq.size() > i2) {
            this.f51099toq.remove(r10.size() - 1);
        }
        this.f51099toq.add(toqVarM3906q);
        return (int) toqVarM3906q.f4458q;
    }

    /* JADX INFO: renamed from: h */
    public void m3908h(String str, float f2) {
        this.f51099toq.add(toq.m3922p(fn3e(str), f2));
    }

    /* JADX INFO: renamed from: i */
    public void m3909i(String str, long j2) {
        int iFn3e = fn3e(str);
        if (-128 <= j2 && j2 <= 127) {
            this.f51099toq.add(toq.kja0(iFn3e, (int) j2));
            return;
        }
        if (-32768 <= j2 && j2 <= 32767) {
            this.f51099toq.add(toq.x2(iFn3e, (int) j2));
        } else if (-2147483648L > j2 || j2 > 2147483647L) {
            this.f51099toq.add(toq.n7h(iFn3e, j2));
        } else {
            this.f51099toq.add(toq.qrj(iFn3e, (int) j2));
        }
    }

    public int jk() {
        return this.f51099toq.size();
    }

    public void ki(long j2) {
        m3909i(null, j2);
    }

    public void kja0(String str, double d2) {
        this.f51099toq.add(toq.ld6(fn3e(str), d2));
    }

    public void ld6(String str, boolean z2) {
        this.f51099toq.add(toq.f7l8(fn3e(str), z2));
    }

    public int mcp() {
        return this.f51099toq.size();
    }

    /* JADX INFO: renamed from: n */
    public int m3910n(String str, int i2) {
        int iFn3e = fn3e(str);
        ArrayList<toq> arrayList = this.f51099toq;
        Collections.sort(arrayList.subList(i2, arrayList.size()), this.f51098f7l8);
        toq toqVarM3906q = m3906q(iFn3e, i2, this.f51099toq.size() - i2, false, false, zy(i2, this.f51099toq.size() - i2));
        while (this.f51099toq.size() > i2) {
            this.f51099toq.remove(r0.size() - 1);
        }
        this.f51099toq.add(toqVarM3906q);
        return (int) toqVarM3906q.f4458q;
    }

    public void n7h(float f2) {
        m3908h(null, f2);
    }

    public int ni7(String str, String str2) {
        int iFn3e = fn3e(str);
        if ((this.f4452n & 2) == 0) {
            toq toqVarEqxt = eqxt(iFn3e, str2);
            this.f51099toq.add(toqVarEqxt);
            return (int) toqVarEqxt.f4458q;
        }
        Integer num = this.f4453q.get(str2);
        if (num != null) {
            this.f51099toq.add(toq.m3917g(iFn3e, num.intValue(), 5, a9(str2.length())));
            return num.intValue();
        }
        toq toqVarEqxt2 = eqxt(iFn3e, str2);
        this.f4453q.put(str2, Integer.valueOf((int) toqVarEqxt2.f4458q));
        this.f51099toq.add(toqVarEqxt2);
        return (int) toqVarEqxt2.f4458q;
    }

    /* JADX INFO: renamed from: p */
    public int m3911p(byte[] bArr) {
        return m3912s(null, bArr);
    }

    public void qrj(double d2) {
        kja0(null, d2);
    }

    /* JADX INFO: renamed from: s */
    public int m3912s(String str, byte[] bArr) {
        toq toqVarJp0y = jp0y(fn3e(str), bArr, 25, false);
        this.f51099toq.add(toqVarJp0y);
        return (int) toqVarJp0y.f4458q;
    }

    /* JADX INFO: renamed from: t */
    public void m3913t(BigInteger bigInteger) {
        wvg(null, bigInteger.longValue());
    }

    public void t8r(String str, int i2) {
        m3909i(str, i2);
    }

    public void x2(boolean z2) {
        ld6(null, z2);
    }

    /* JADX INFO: renamed from: y */
    public ki m3914y() {
        return this.f4451k;
    }

    /* JADX INFO: renamed from: z */
    public void m3915z(long j2) {
        o1t(null, j2);
    }

    public int zurt(String str) {
        return ni7(null, str);
    }

    public ld6() {
        this(256);
    }

    @Deprecated
    public ld6(ByteBuffer byteBuffer, int i2) {
        this(new C0811k(byteBuffer.array()), i2);
    }

    public ld6(ki kiVar, int i2) {
        this.f51099toq = new ArrayList<>();
        this.f51100zy = new HashMap<>();
        this.f4453q = new HashMap<>();
        this.f4450g = false;
        this.f51098f7l8 = new C0813k();
        this.f4451k = kiVar;
        this.f4452n = i2;
    }

    /* JADX INFO: compiled from: FlexBuffersBuilder.java */
    private static class toq {

        /* JADX INFO: renamed from: g */
        static final /* synthetic */ boolean f4455g = false;

        /* JADX INFO: renamed from: k */
        final int f4456k;

        /* JADX INFO: renamed from: n */
        int f4457n;

        /* JADX INFO: renamed from: q */
        long f4458q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f51101toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final double f51102zy;

        toq(int i2, int i3, int i4, long j2) {
            this.f4457n = i2;
            this.f4456k = i3;
            this.f51101toq = i4;
            this.f4458q = j2;
            this.f51102zy = Double.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int cdj(int i2, int i3) {
            return ((~i2) + 1) & (i3 - 1);
        }

        static toq f7l8(int i2, boolean z2) {
            return new toq(i2, 26, 0, z2 ? 1L : 0L);
        }

        static toq fn3e(int i2, int i3) {
            return new toq(i2, 2, 1, i3);
        }

        static toq fu4(int i2, int i3) {
            return new toq(i2, 2, 0, i3);
        }

        /* JADX INFO: renamed from: g */
        static toq m3917g(int i2, int i3, int i4, int i5) {
            return new toq(i2, i4, i5, i3);
        }

        /* JADX INFO: renamed from: h */
        private static byte m3918h(int i2, int i3) {
            return (byte) (i2 | (i3 << 2));
        }

        /* JADX INFO: renamed from: i */
        private int m3919i(int i2) {
            return C0816p.m3934p(this.f4456k) ? Math.max(this.f51101toq, i2) : this.f51101toq;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte ki() {
            return t8r(0);
        }

        static toq kja0(int i2, int i3) {
            return new toq(i2, 1, 0, i3);
        }

        static toq ld6(int i2, double d2) {
            return new toq(i2, 3, 3, d2);
        }

        static toq n7h(int i2, long j2) {
            return new toq(i2, 1, 3, j2);
        }

        static toq ni7(int i2, long j2) {
            return new toq(i2, 2, 3, j2);
        }

        /* JADX INFO: renamed from: p */
        static toq m3922p(int i2, float f2) {
            return new toq(i2, 3, 2, f2);
        }

        static toq qrj(int i2, int i3) {
            return new toq(i2, 1, 2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public static int m3924s(int i2, int i3, long j2, int i4, int i5) {
            if (C0816p.m3934p(i2)) {
                return i3;
            }
            for (int i6 = 1; i6 <= 32; i6 *= 2) {
                int iA9 = ld6.a9((int) (((long) ((cdj(i4, i6) + i4) + (i5 * i6))) - j2));
                if ((1 << iA9) == i6) {
                    return iA9;
                }
            }
            return 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte t8r(int i2) {
            return m3918h(m3919i(i2), this.f4456k);
        }

        static toq x2(int i2, int i3) {
            return new toq(i2, 1, 1, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public int m3925y(int i2, int i3) {
            return m3924s(this.f4456k, this.f51101toq, this.f4458q, i2, i3);
        }

        static toq zurt(int i2, int i3) {
            return new toq(i2, 2, 2, i3);
        }

        toq(int i2, int i3, int i4, double d2) {
            this.f4457n = i2;
            this.f4456k = i3;
            this.f51101toq = i4;
            this.f51102zy = d2;
            this.f4458q = Long.MIN_VALUE;
        }
    }

    public ld6(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}

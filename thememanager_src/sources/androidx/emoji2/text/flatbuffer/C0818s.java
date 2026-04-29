package androidx.emoji2.text.flatbuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.s */
/* JADX INFO: compiled from: FlatBufferBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class C0818s {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    static final /* synthetic */ boolean f51130kja0 = false;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    boolean f51131f7l8;

    /* JADX INFO: renamed from: g */
    boolean f4486g;

    /* JADX INFO: renamed from: k */
    ByteBuffer f4487k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    int f51132ld6;

    /* JADX INFO: renamed from: n */
    int f4488n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    final fu4 f51133n7h;

    /* JADX INFO: renamed from: p */
    int f4489p;

    /* JADX INFO: renamed from: q */
    int[] f4490q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    toq f51134qrj;

    /* JADX INFO: renamed from: s */
    int[] f4491s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    int f51135toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    boolean f51136x2;

    /* JADX INFO: renamed from: y */
    int f4492y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f51137zy;

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.s$k */
    /* JADX INFO: compiled from: FlatBufferBuilder.java */
    static class k extends InputStream {

        /* JADX INFO: renamed from: k */
        ByteBuffer f4493k;

        public k(ByteBuffer byteBuffer) {
            this.f4493k = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.f4493k.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.s$toq */
    /* JADX INFO: compiled from: FlatBufferBuilder.java */
    public static abstract class toq {
        /* JADX INFO: renamed from: k */
        public abstract ByteBuffer mo3984k(int i2);

        public void toq(ByteBuffer byteBuffer) {
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.s$zy */
    /* JADX INFO: compiled from: FlatBufferBuilder.java */
    public static final class zy extends toq {

        /* JADX INFO: renamed from: k */
        public static final zy f4494k = new zy();

        @Override // androidx.emoji2.text.flatbuffer.C0818s.toq
        /* JADX INFO: renamed from: k */
        public ByteBuffer mo3984k(int i2) {
            return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public C0818s(int i2, toq toqVar) {
        this(i2, toqVar, null, fu4.m3870q());
    }

    @Deprecated
    private int mcp() {
        d2ok();
        return this.f51135toq;
    }

    /* JADX INFO: renamed from: r */
    static ByteBuffer m3965r(ByteBuffer byteBuffer, toq toqVar) {
        int iCapacity = byteBuffer.capacity();
        if (((-1073741824) & iCapacity) != 0) {
            throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
        }
        int i2 = iCapacity == 0 ? 1 : iCapacity << 1;
        byteBuffer.position(0);
        ByteBuffer byteBufferMo3984k = toqVar.mo3984k(i2);
        byteBufferMo3984k.position(byteBufferMo3984k.clear().capacity() - iCapacity);
        byteBufferMo3984k.put(byteBuffer);
        return byteBufferMo3984k;
    }

    public static boolean x9kr(zurt zurtVar, int i2) {
        return zurtVar.m4003q(i2) != 0;
    }

    public int a9() {
        if (!this.f4486g) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f4486g = false;
        vyq(this.f51132ld6);
        return m3974l();
    }

    /* JADX INFO: renamed from: c */
    public void m3966c(byte b2) {
        ByteBuffer byteBuffer = this.f4487k;
        int i2 = this.f51135toq - 1;
        this.f51135toq = i2;
        byteBuffer.put(i2, b2);
    }

    public void cdj(short s2) {
        hyr(2, 0);
        nn86(s2);
    }

    public void d2ok() {
        if (!this.f51131f7l8) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    protected void d3(int i2, boolean z2) {
        hyr(this.f51137zy, (z2 ? 4 : 0) + 4);
        n7h(i2);
        if (z2) {
            m3978p(this.f4487k.capacity() - this.f51135toq);
        }
        this.f4487k.position(this.f51135toq);
        this.f51131f7l8 = true;
    }

    public C0818s dd(ByteBuffer byteBuffer, toq toqVar) {
        this.f51134qrj = toqVar;
        this.f4487k = byteBuffer;
        byteBuffer.clear();
        this.f4487k.order(ByteOrder.LITTLE_ENDIAN);
        this.f51137zy = 1;
        this.f51135toq = this.f4487k.capacity();
        this.f4488n = 0;
        this.f4486g = false;
        this.f51131f7l8 = false;
        this.f4492y = 0;
        this.f4489p = 0;
        this.f51132ld6 = 0;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m3967e(long j2) {
        ByteBuffer byteBuffer = this.f4487k;
        int i2 = this.f51135toq - 8;
        this.f51135toq = i2;
        byteBuffer.putLong(i2, j2);
    }

    public void ek5k(int i2) {
        this.f4490q[i2] = m3974l();
    }

    public void eqxt(int i2, String str) {
        gvn7(i2, str, true);
    }

    /* JADX INFO: renamed from: f */
    public void m3968f(boolean z2) {
        ByteBuffer byteBuffer = this.f4487k;
        int i2 = this.f51135toq - 1;
        this.f51135toq = i2;
        byteBuffer.put(i2, z2 ? (byte) 1 : (byte) 0);
    }

    public void f7l8(int i2, double d2, double d4) {
        if (this.f51136x2 || d2 != d4) {
            m3969g(d2);
            ek5k(i2);
        }
    }

    public int fn3e(byte[] bArr) {
        int length = bArr.length;
        y9n(1, length, 1);
        ByteBuffer byteBuffer = this.f4487k;
        int i2 = this.f51135toq - length;
        this.f51135toq = i2;
        byteBuffer.position(i2);
        this.f4487k.put(bArr);
        return a9();
    }

    public void fti(int i2) {
        d3(i2, false);
    }

    public int fu4(CharSequence charSequence) {
        int iZy = this.f51133n7h.zy(charSequence);
        m3979q((byte) 0);
        y9n(1, iZy, 1);
        ByteBuffer byteBuffer = this.f4487k;
        int i2 = this.f51135toq - iZy;
        this.f51135toq = i2;
        byteBuffer.position(i2);
        this.f51133n7h.toq(charSequence, this.f4487k);
        return a9();
    }

    /* JADX INFO: renamed from: g */
    public void m3969g(double d2) {
        hyr(8, 0);
        lrht(d2);
    }

    protected void gvn7(int i2, String str, boolean z2) {
        hyr(this.f51137zy, (z2 ? 4 : 0) + 8);
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i3 = 3; i3 >= 0; i3--) {
            m3979q((byte) str.charAt(i3));
        }
        d3(i2, z2);
    }

    /* JADX INFO: renamed from: h */
    public void m3970h(int i2, short s2, int i3) {
        if (this.f51136x2 || s2 != i3) {
            cdj(s2);
            ek5k(i2);
        }
    }

    public void hb(int i2, int i3) {
        int iCapacity = this.f4487k.capacity() - i2;
        if (this.f4487k.getShort((iCapacity - this.f4487k.getInt(iCapacity)) + i3) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i3 + " must be set");
    }

    public void hyr(int i2, int i3) {
        if (i2 > this.f51137zy) {
            this.f51137zy = i2;
        }
        int i4 = ((~((this.f4487k.capacity() - this.f51135toq) + i3)) + 1) & (i2 - 1);
        while (this.f51135toq < i4 + i2 + i3) {
            int iCapacity = this.f4487k.capacity();
            ByteBuffer byteBuffer = this.f4487k;
            ByteBuffer byteBufferM3965r = m3965r(byteBuffer, this.f51134qrj);
            this.f4487k = byteBufferM3965r;
            if (byteBuffer != byteBufferM3965r) {
                this.f51134qrj.toq(byteBuffer);
            }
            this.f51135toq += this.f4487k.capacity() - iCapacity;
        }
        n5r1(i4);
    }

    /* JADX INFO: renamed from: i */
    public int m3971i(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        y9n(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f4487k;
        int i2 = this.f51135toq - iRemaining;
        this.f51135toq = i2;
        byteBuffer2.position(i2);
        this.f4487k.put(byteBuffer);
        return a9();
    }

    /* JADX INFO: renamed from: j */
    public byte[] m3972j() {
        return m3977o(this.f51135toq, this.f4487k.capacity() - this.f51135toq);
    }

    public int jk() {
        int i2;
        if (this.f4490q == null || !this.f4486g) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        m3978p(0);
        int iM3974l = m3974l();
        int i3 = this.f4488n - 1;
        while (i3 >= 0 && this.f4490q[i3] == 0) {
            i3--;
        }
        int i4 = i3 + 1;
        while (i3 >= 0) {
            int i5 = this.f4490q[i3];
            cdj((short) (i5 != 0 ? iM3974l - i5 : 0));
            i3--;
        }
        cdj((short) (iM3974l - this.f4492y));
        cdj((short) ((i4 + 2) * 2));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.f4489p) {
                i2 = 0;
                break;
            }
            int iCapacity = this.f4487k.capacity() - this.f4491s[i6];
            int i7 = this.f51135toq;
            short s2 = this.f4487k.getShort(iCapacity);
            if (s2 == this.f4487k.getShort(i7)) {
                for (int i8 = 2; i8 < s2; i8 += 2) {
                    if (this.f4487k.getShort(iCapacity + i8) != this.f4487k.getShort(i7 + i8)) {
                        break;
                    }
                }
                i2 = this.f4491s[i6];
                break loop2;
            }
            i6++;
        }
        if (i2 != 0) {
            int iCapacity2 = this.f4487k.capacity() - iM3974l;
            this.f51135toq = iCapacity2;
            this.f4487k.putInt(iCapacity2, i2 - iM3974l);
        } else {
            int i9 = this.f4489p;
            int[] iArr = this.f4491s;
            if (i9 == iArr.length) {
                this.f4491s = Arrays.copyOf(iArr, i9 * 2);
            }
            int[] iArr2 = this.f4491s;
            int i10 = this.f4489p;
            this.f4489p = i10 + 1;
            iArr2[i10] = m3974l();
            ByteBuffer byteBuffer = this.f4487k;
            byteBuffer.putInt(byteBuffer.capacity() - iM3974l, m3974l() - iM3974l);
        }
        this.f4486g = false;
        return iM3974l;
    }

    public void jp0y(int i2, String str) {
        gvn7(i2, str, false);
    }

    /* JADX INFO: renamed from: k */
    public void m3973k(int i2) {
        if (i2 != m3974l()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void ki(int i2, int i3, int i4) {
        if (i3 != i4) {
            m3973k(i3);
            ek5k(i2);
        }
    }

    public void kja0(int i2, int i3, int i4) {
        if (this.f51136x2 || i3 != i4) {
            n7h(i3);
            ek5k(i2);
        }
    }

    /* JADX INFO: renamed from: l */
    public int m3974l() {
        return this.f4487k.capacity() - this.f51135toq;
    }

    public void ld6(int i2, int i3, int i4) {
        if (this.f51136x2 || i3 != i4) {
            m3978p(i3);
            ek5k(i2);
        }
    }

    public void lrht(double d2) {
        ByteBuffer byteBuffer = this.f4487k;
        int i2 = this.f51135toq - 8;
        this.f51135toq = i2;
        byteBuffer.putDouble(i2, d2);
    }

    public C0818s lvui(boolean z2) {
        this.f51136x2 = z2;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public InputStream m3975m() {
        d2ok();
        ByteBuffer byteBufferDuplicate = this.f4487k.duplicate();
        byteBufferDuplicate.position(this.f51135toq);
        byteBufferDuplicate.limit(this.f4487k.capacity());
        return new k(byteBufferDuplicate);
    }

    /* JADX INFO: renamed from: n */
    public void m3976n(int i2, byte b2, int i3) {
        if (this.f51136x2 || b2 != i3) {
            m3979q(b2);
            ek5k(i2);
        }
    }

    public void n5r1(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBuffer = this.f4487k;
            int i4 = this.f51135toq - 1;
            this.f51135toq = i4;
            byteBuffer.put(i4, (byte) 0);
        }
    }

    public void n7h(int i2) {
        hyr(4, 0);
        vyq((m3974l() - i2) + 4);
    }

    public void ncyb() {
        if (this.f4486g) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public <T extends zurt> int ni7(T t2, int[] iArr) {
        t2.m4001i(iArr, this.f4487k);
        return wvg(iArr);
    }

    public void nn86(short s2) {
        ByteBuffer byteBuffer = this.f4487k;
        int i2 = this.f51135toq - 2;
        this.f51135toq = i2;
        byteBuffer.putShort(i2, s2);
    }

    /* JADX INFO: renamed from: o */
    public byte[] m3977o(int i2, int i3) {
        d2ok();
        byte[] bArr = new byte[i3];
        this.f4487k.position(i2);
        this.f4487k.get(bArr);
        return bArr;
    }

    public ByteBuffer o1t(int i2, int i3, int i4) {
        int i5 = i2 * i3;
        y9n(i2, i3, i4);
        ByteBuffer byteBuffer = this.f4487k;
        int i6 = this.f51135toq - i5;
        this.f51135toq = i6;
        byteBuffer.position(i6);
        ByteBuffer byteBufferOrder = this.f4487k.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.limit(i5);
        return byteBufferOrder;
    }

    public void oc(int i2) {
        d3(i2, true);
    }

    /* JADX INFO: renamed from: p */
    public void m3978p(int i2) {
        hyr(4, 0);
        vyq(i2);
    }

    /* JADX INFO: renamed from: q */
    public void m3979q(byte b2) {
        hyr(1, 0);
        m3966c(b2);
    }

    public void qrj(long j2) {
        hyr(8, 0);
        m3967e(j2);
    }

    /* JADX INFO: renamed from: s */
    public void m3980s(int i2, float f2, double d2) {
        if (this.f51136x2 || f2 != d2) {
            m3982y(f2);
            ek5k(i2);
        }
    }

    /* JADX INFO: renamed from: t */
    public ByteBuffer m3981t() {
        d2ok();
        return this.f4487k;
    }

    public void t8r() {
        this.f51135toq = this.f4487k.capacity();
        this.f4487k.clear();
        this.f51137zy = 1;
        while (true) {
            int i2 = this.f4488n;
            if (i2 <= 0) {
                this.f4488n = 0;
                this.f4486g = false;
                this.f51131f7l8 = false;
                this.f4492y = 0;
                this.f4489p = 0;
                this.f51132ld6 = 0;
                return;
            }
            int[] iArr = this.f4490q;
            int i3 = i2 - 1;
            this.f4488n = i3;
            iArr[i3] = 0;
        }
    }

    public void toq(int i2, boolean z2, boolean z3) {
        if (this.f51136x2 || z2 != z3) {
            zy(z2);
            ek5k(i2);
        }
    }

    public void uv6(float f2) {
        ByteBuffer byteBuffer = this.f4487k;
        int i2 = this.f51135toq - 4;
        this.f51135toq = i2;
        byteBuffer.putFloat(i2, f2);
    }

    public void vyq(int i2) {
        ByteBuffer byteBuffer = this.f4487k;
        int i3 = this.f51135toq - 4;
        this.f51135toq = i3;
        byteBuffer.putInt(i3, i2);
    }

    public int wvg(int[] iArr) {
        ncyb();
        y9n(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            n7h(iArr[length]);
        }
        return a9();
    }

    public void x2(int i2, long j2, long j3) {
        if (this.f51136x2 || j2 != j3) {
            qrj(j2);
            ek5k(i2);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m3982y(float f2) {
        hyr(4, 0);
        uv6(f2);
    }

    public void y9n(int i2, int i3, int i4) {
        ncyb();
        this.f51132ld6 = i3;
        int i5 = i2 * i3;
        hyr(4, i5);
        hyr(i4, i5);
        this.f4486g = true;
    }

    public void yz(int i2) {
        ncyb();
        int[] iArr = this.f4490q;
        if (iArr == null || iArr.length < i2) {
            this.f4490q = new int[i2];
        }
        this.f4488n = i2;
        Arrays.fill(this.f4490q, 0, i2, 0);
        this.f4486g = true;
        this.f4492y = m3974l();
    }

    /* JADX INFO: renamed from: z */
    public int m3983z(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        m3979q((byte) 0);
        y9n(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f4487k;
        int i2 = this.f51135toq - iRemaining;
        this.f51135toq = i2;
        byteBuffer2.position(i2);
        this.f4487k.put(byteBuffer);
        return a9();
    }

    public int zurt(byte[] bArr, int i2, int i3) {
        y9n(1, i3, 1);
        ByteBuffer byteBuffer = this.f4487k;
        int i4 = this.f51135toq - i3;
        this.f51135toq = i4;
        byteBuffer.position(i4);
        this.f4487k.put(bArr, i2, i3);
        return a9();
    }

    public void zy(boolean z2) {
        hyr(1, 0);
        m3968f(z2);
    }

    public C0818s(int i2, toq toqVar, ByteBuffer byteBuffer, fu4 fu4Var) {
        this.f51137zy = 1;
        this.f4490q = null;
        this.f4488n = 0;
        this.f4486g = false;
        this.f51131f7l8 = false;
        this.f4491s = new int[16];
        this.f4489p = 0;
        this.f51132ld6 = 0;
        this.f51136x2 = false;
        i2 = i2 <= 0 ? 1 : i2;
        this.f51134qrj = toqVar;
        if (byteBuffer != null) {
            this.f4487k = byteBuffer;
            byteBuffer.clear();
            this.f4487k.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f4487k = toqVar.mo3984k(i2);
        }
        this.f51133n7h = fu4Var;
        this.f51135toq = this.f4487k.capacity();
    }

    public C0818s(int i2) {
        this(i2, zy.f4494k, null, fu4.m3870q());
    }

    public C0818s() {
        this(1024);
    }

    public C0818s(ByteBuffer byteBuffer, toq toqVar) {
        this(byteBuffer.capacity(), toqVar, byteBuffer, fu4.m3870q());
    }

    public C0818s(ByteBuffer byteBuffer) {
        this(byteBuffer, new zy());
    }
}

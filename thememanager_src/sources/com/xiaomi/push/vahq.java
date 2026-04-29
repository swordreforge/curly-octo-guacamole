package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class vahq extends ip {

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final s31 f73696n7h = new s31();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private byte[] f73697f7l8;

    /* JADX INFO: renamed from: g */
    private byte[] f34014g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private byte[] f73698ld6;

    /* JADX INFO: renamed from: n */
    protected boolean f34015n;

    /* JADX INFO: renamed from: p */
    private byte[] f34016p;

    /* JADX INFO: renamed from: q */
    protected int f34017q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private byte[] f73699qrj;

    /* JADX INFO: renamed from: s */
    private byte[] f34018s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected boolean f73700toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private byte[] f73701x2;

    /* JADX INFO: renamed from: y */
    private byte[] f34019y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected boolean f73702zy;

    /* JADX INFO: renamed from: com.xiaomi.push.vahq$k */
    public static class C5952k implements es7 {

        /* JADX INFO: renamed from: a */
        protected int f34020a;

        /* JADX INFO: renamed from: a */
        protected boolean f34021a;

        /* JADX INFO: renamed from: b */
        protected boolean f34022b;

        public C5952k() {
            this(false, true);
        }

        @Override // com.xiaomi.push.es7
        /* JADX INFO: renamed from: a */
        public ip mo20817a(alcv alcvVar) {
            vahq vahqVar = new vahq(alcvVar, this.f34021a, this.f34022b);
            int i2 = this.f34020a;
            if (i2 != 0) {
                vahqVar.d2ok(i2);
            }
            return vahqVar;
        }

        public C5952k(boolean z2, boolean z3) {
            this(z2, z3, 0);
        }

        public C5952k(boolean z2, boolean z3, int i2) {
            this.f34021a = z2;
            this.f34022b = z3;
            this.f34020a = i2;
        }
    }

    public vahq(alcv alcvVar, boolean z2, boolean z3) {
        super(alcvVar);
        this.f34015n = false;
        this.f34014g = new byte[1];
        this.f73697f7l8 = new byte[2];
        this.f34019y = new byte[4];
        this.f34018s = new byte[8];
        this.f34016p = new byte[1];
        this.f73698ld6 = new byte[2];
        this.f73701x2 = new byte[4];
        this.f73699qrj = new byte[8];
        this.f73700toq = z2;
        this.f73702zy = z3;
    }

    private int oc(byte[] bArr, int i2, int i3) throws sb {
        lvui(i3);
        return this.f33033k.f7l8(bArr, i2, i3);
    }

    @Override // com.xiaomi.push.ip
    public void a9() {
    }

    @Override // com.xiaomi.push.ip
    public void cdj(vc vcVar) {
        n7h(vcVar.f73703toq);
        ni7(vcVar.f73704zy);
    }

    public void d2ok(int i2) {
        this.f34017q = i2;
        this.f34015n = true;
    }

    public String eqxt(int i2) throws sb {
        try {
            lvui(i2);
            byte[] bArr = new byte[i2];
            this.f33033k.f7l8(bArr, 0, i2);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new sb("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.ip
    public ap23 f7l8() {
        return new ap23(mo20993k(), mo20993k(), zy());
    }

    @Override // com.xiaomi.push.ip
    public void fn3e(String str) throws sb {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            kja0(bytes.length);
            this.f33033k.mo20581q(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new sb("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.ip
    public void fti() {
    }

    @Override // com.xiaomi.push.ip
    public void fu4(boolean z2) {
        n7h(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.xiaomi.push.ip
    /* JADX INFO: renamed from: g */
    public izu mo20990g() {
        return new izu(mo20993k(), zy());
    }

    @Override // com.xiaomi.push.ip
    public void gvn7() {
    }

    @Override // com.xiaomi.push.ip
    /* JADX INFO: renamed from: h */
    public void mo20991h(long j2) {
        byte[] bArr = this.f34018s;
        bArr[0] = (byte) ((j2 >> 56) & 255);
        bArr[1] = (byte) ((j2 >> 48) & 255);
        bArr[2] = (byte) ((j2 >> 40) & 255);
        bArr[3] = (byte) ((j2 >> 32) & 255);
        bArr[4] = (byte) ((j2 >> 24) & 255);
        bArr[5] = (byte) ((j2 >> 16) & 255);
        bArr[6] = (byte) ((j2 >> 8) & 255);
        bArr[7] = (byte) (j2 & 255);
        this.f33033k.mo20581q(bArr, 0, 8);
    }

    @Override // com.xiaomi.push.ip
    /* JADX INFO: renamed from: i */
    public void mo20992i(s31 s31Var) {
    }

    @Override // com.xiaomi.push.ip
    public void jk() {
    }

    @Override // com.xiaomi.push.ip
    public void jp0y() {
    }

    @Override // com.xiaomi.push.ip
    /* JADX INFO: renamed from: k */
    public byte mo20993k() throws sb {
        if (this.f33033k.mo20578g() < 1) {
            oc(this.f34016p, 0, 1);
            return this.f34016p[0];
        }
        byte b2 = this.f33033k.mo20580n()[this.f33033k.mo20579k()];
        this.f33033k.zy(1);
        return b2;
    }

    @Override // com.xiaomi.push.ip
    public void ki(izu izuVar) {
        n7h(izuVar.f33060k);
        kja0(izuVar.f73378toq);
    }

    @Override // com.xiaomi.push.ip
    public void kja0(int i2) {
        byte[] bArr = this.f34019y;
        bArr[0] = (byte) ((i2 >> 24) & 255);
        bArr[1] = (byte) ((i2 >> 16) & 255);
        bArr[2] = (byte) ((i2 >> 8) & 255);
        bArr[3] = (byte) (i2 & 255);
        this.f33033k.mo20581q(bArr, 0, 4);
    }

    @Override // com.xiaomi.push.ip
    public ByteBuffer ld6() throws sb {
        int iZy = zy();
        lvui(iZy);
        if (this.f33033k.mo20578g() >= iZy) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f33033k.mo20580n(), this.f33033k.mo20579k(), iZy);
            this.f33033k.zy(iZy);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iZy];
        this.f33033k.f7l8(bArr, 0, iZy);
        return ByteBuffer.wrap(bArr);
    }

    protected void lvui(int i2) throws sb {
        if (i2 < 0) {
            throw new sb("Negative length: " + i2);
        }
        if (this.f34015n) {
            int i3 = this.f34017q - i2;
            this.f34017q = i3;
            if (i3 >= 0) {
                return;
            }
            throw new sb("Message length exceeded: " + i2);
        }
    }

    @Override // com.xiaomi.push.ip
    public void mcp() {
    }

    @Override // com.xiaomi.push.ip
    /* JADX INFO: renamed from: n */
    public vc mo20994n() throws sb {
        byte bMo20993k = mo20993k();
        return new vc("", bMo20993k, bMo20993k == 0 ? (short) 0 : x2());
    }

    @Override // com.xiaomi.push.ip
    public void n7h(byte b2) {
        byte[] bArr = this.f34014g;
        bArr[0] = b2;
        this.f33033k.mo20581q(bArr, 0, 1);
    }

    @Override // com.xiaomi.push.ip
    public void ni7(short s2) {
        byte[] bArr = this.f73697f7l8;
        bArr[0] = (byte) ((s2 >> 8) & 255);
        bArr[1] = (byte) (s2 & 255);
        this.f33033k.mo20581q(bArr, 0, 2);
    }

    @Override // com.xiaomi.push.ip
    public void o1t() {
    }

    @Override // com.xiaomi.push.ip
    /* JADX INFO: renamed from: p */
    public String mo20995p() throws sb {
        int iZy = zy();
        if (this.f33033k.mo20578g() < iZy) {
            return eqxt(iZy);
        }
        try {
            String str = new String(this.f33033k.mo20580n(), this.f33033k.mo20579k(), iZy, "UTF-8");
            this.f33033k.zy(iZy);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new sb("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.ip
    /* JADX INFO: renamed from: q */
    public long mo20996q() throws sb {
        byte[] bArrMo20580n = this.f73699qrj;
        int iMo20579k = 0;
        if (this.f33033k.mo20578g() >= 8) {
            bArrMo20580n = this.f33033k.mo20580n();
            iMo20579k = this.f33033k.mo20579k();
            this.f33033k.zy(8);
        } else {
            oc(this.f73699qrj, 0, 8);
        }
        return ((long) (bArrMo20580n[iMo20579k + 7] & 255)) | (((long) (bArrMo20580n[iMo20579k] & 255)) << 56) | (((long) (bArrMo20580n[iMo20579k + 1] & 255)) << 48) | (((long) (bArrMo20580n[iMo20579k + 2] & 255)) << 40) | (((long) (bArrMo20580n[iMo20579k + 3] & 255)) << 32) | (((long) (bArrMo20580n[iMo20579k + 4] & 255)) << 24) | (((long) (bArrMo20580n[iMo20579k + 5] & 255)) << 16) | (((long) (bArrMo20580n[iMo20579k + 6] & 255)) << 8);
    }

    @Override // com.xiaomi.push.ip
    public void qrj() {
    }

    @Override // com.xiaomi.push.ip
    /* JADX INFO: renamed from: s */
    public s31 mo20997s() {
        return f73696n7h;
    }

    @Override // com.xiaomi.push.ip
    /* JADX INFO: renamed from: t */
    public void mo20998t() {
    }

    @Override // com.xiaomi.push.ip
    public void t8r(ap23 ap23Var) {
        n7h(ap23Var.f32695k);
        n7h(ap23Var.f73264toq);
        kja0(ap23Var.f73265zy);
    }

    @Override // com.xiaomi.push.ip
    public double toq() {
        return Double.longBitsToDouble(mo20996q());
    }

    @Override // com.xiaomi.push.ip
    public void wvg() {
        n7h((byte) 0);
    }

    @Override // com.xiaomi.push.ip
    public short x2() throws sb {
        byte[] bArrMo20580n = this.f73698ld6;
        int iMo20579k = 0;
        if (this.f33033k.mo20578g() >= 2) {
            bArrMo20580n = this.f33033k.mo20580n();
            iMo20579k = this.f33033k.mo20579k();
            this.f33033k.zy(2);
        } else {
            oc(this.f73698ld6, 0, 2);
        }
        return (short) ((bArrMo20580n[iMo20579k + 1] & 255) | ((bArrMo20580n[iMo20579k] & 255) << 8));
    }

    @Override // com.xiaomi.push.ip
    /* JADX INFO: renamed from: y */
    public oei mo20999y() {
        return new oei(mo20993k(), zy());
    }

    @Override // com.xiaomi.push.ip
    /* JADX INFO: renamed from: z */
    public boolean mo21000z() {
        return mo20993k() == 1;
    }

    @Override // com.xiaomi.push.ip
    public void zurt(ByteBuffer byteBuffer) {
        int iLimit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        kja0(iLimit);
        this.f33033k.mo20581q(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iLimit);
    }

    @Override // com.xiaomi.push.ip
    public int zy() throws sb {
        byte[] bArrMo20580n = this.f73701x2;
        int iMo20579k = 0;
        if (this.f33033k.mo20578g() >= 4) {
            bArrMo20580n = this.f33033k.mo20580n();
            iMo20579k = this.f33033k.mo20579k();
            this.f33033k.zy(4);
        } else {
            oc(this.f73701x2, 0, 4);
        }
        return (bArrMo20580n[iMo20579k + 3] & 255) | ((bArrMo20580n[iMo20579k] & 255) << 24) | ((bArrMo20580n[iMo20579k + 1] & 255) << 16) | ((bArrMo20580n[iMo20579k + 2] & 255) << 8);
    }
}

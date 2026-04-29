package com.xiaomi.push;

import com.xiaomi.push.vahq;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class owi extends vahq {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static int f73521cdj = 10000;

    /* JADX INFO: renamed from: h */
    private static int f33555h = 10000;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static int f73522ki = 10485760;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static int f73523kja0 = 10000;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static int f73524t8r = 104857600;

    /* JADX INFO: renamed from: com.xiaomi.push.owi$k */
    public static class C5888k extends vahq.C5952k {
        public C5888k() {
            super(false, true);
        }

        @Override // com.xiaomi.push.vahq.C5952k, com.xiaomi.push.es7
        /* JADX INFO: renamed from: a */
        public ip mo20817a(alcv alcvVar) {
            owi owiVar = new owi(alcvVar, ((vahq.C5952k) this).f34021a, this.f34022b);
            int i2 = ((vahq.C5952k) this).f34020a;
            if (i2 != 0) {
                owiVar.d2ok(i2);
            }
            return owiVar;
        }

        public C5888k(boolean z2, boolean z3, int i2) {
            super(z2, z3, i2);
        }
    }

    public owi(alcv alcvVar, boolean z2, boolean z3) {
        super(alcvVar, z2, z3);
    }

    @Override // com.xiaomi.push.vahq, com.xiaomi.push.ip
    public ap23 f7l8() throws sb {
        byte bMo20993k = mo20993k();
        byte bMo20993k2 = mo20993k();
        int iZy = zy();
        if (iZy <= f73523kja0) {
            return new ap23(bMo20993k, bMo20993k2, iZy);
        }
        throw new dbf(3, "Thrift map size " + iZy + " out of range!");
    }

    @Override // com.xiaomi.push.vahq, com.xiaomi.push.ip
    /* JADX INFO: renamed from: g */
    public izu mo20990g() throws sb {
        byte bMo20993k = mo20993k();
        int iZy = zy();
        if (iZy <= f33555h) {
            return new izu(bMo20993k, iZy);
        }
        throw new dbf(3, "Thrift list size " + iZy + " out of range!");
    }

    @Override // com.xiaomi.push.vahq, com.xiaomi.push.ip
    public ByteBuffer ld6() throws sb {
        int iZy = zy();
        if (iZy > f73524t8r) {
            throw new dbf(3, "Thrift binary size " + iZy + " out of range!");
        }
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

    @Override // com.xiaomi.push.vahq, com.xiaomi.push.ip
    /* JADX INFO: renamed from: p */
    public String mo20995p() throws sb {
        int iZy = zy();
        if (iZy > f73522ki) {
            throw new dbf(3, "Thrift string size " + iZy + " out of range!");
        }
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

    @Override // com.xiaomi.push.vahq, com.xiaomi.push.ip
    /* JADX INFO: renamed from: y */
    public oei mo20999y() throws sb {
        byte bMo20993k = mo20993k();
        int iZy = zy();
        if (iZy <= f73521cdj) {
            return new oei(bMo20993k, iZy);
        }
        throw new dbf(3, "Thrift set size " + iZy + " out of range!");
    }
}

package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C5658n;
import com.xiaomi.push.lh;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class o5 {

    /* JADX INFO: renamed from: g */
    private final long f33488g;

    /* JADX INFO: renamed from: k */
    private lh.C5876k f33489k;

    /* JADX INFO: renamed from: n */
    int f33490n;

    /* JADX INFO: renamed from: q */
    String f33491q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private short f73511toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private byte[] f73512zy;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static String f73510f7l8 = i3x9.m20969k(5) + C5658n.f73185t8r;

    /* JADX INFO: renamed from: y */
    private static long f33487y = 0;

    /* JADX INFO: renamed from: s */
    private static final byte[] f33486s = new byte[0];

    public o5() {
        this.f73511toq = (short) 2;
        this.f73512zy = f33486s;
        this.f33491q = null;
        this.f33488g = System.currentTimeMillis();
        this.f33489k = new lh.C5876k();
        this.f33490n = 1;
    }

    public static synchronized String mcp() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(f73510f7l8);
        long j2 = f33487y;
        f33487y = 1 + j2;
        sb.append(Long.toString(j2));
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    static o5 m21344q(ByteBuffer byteBuffer) throws IOException {
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            short s2 = byteBufferSlice.getShort(0);
            short s3 = byteBufferSlice.getShort(2);
            int i2 = byteBufferSlice.getInt(4);
            lh.C5876k c5876k = new lh.C5876k();
            c5876k.m20672q(byteBufferSlice.array(), byteBufferSlice.arrayOffset() + 8, s3);
            byte[] bArr = new byte[i2];
            byteBufferSlice.position(s3 + 8);
            byteBufferSlice.get(bArr, 0, i2);
            return new o5(c5876k, s2, bArr);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("read Blob err :" + e2.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    @Deprecated
    public static o5 zy(xtb7 xtb7Var, String str) {
        int i2;
        o5 o5Var = new o5();
        try {
            i2 = Integer.parseInt(xtb7Var.qrj());
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Blob parse chid err " + e2.getMessage());
            i2 = 1;
        }
        o5Var.m21353y(i2);
        o5Var.ld6(xtb7Var.x2());
        o5Var.m21352t(xtb7Var.cdj());
        o5Var.zurt(xtb7Var.t8r());
        o5Var.x2("XMLMSG", null);
        try {
            o5Var.n7h(xtb7Var.mo21382g().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                o5Var.qrj((short) 3);
            } else {
                o5Var.qrj((short) 2);
                o5Var.x2("SECMSG", null);
            }
        } catch (UnsupportedEncodingException e3) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Blob setPayload err： " + e3.getMessage());
        }
        return o5Var;
    }

    public String a9() {
        return this.f33491q;
    }

    public byte[] cdj(String str) {
        if (this.f33489k.oc() == 1) {
            return yw.m22063k(this, com.xiaomi.push.service.n5r1.m21697s(com.xiaomi.push.service.n5r1.f7l8(str, jk()), this.f73512zy));
        }
        if (this.f33489k.oc() == 0) {
            return yw.m22063k(this, this.f73512zy);
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("unknow cipher = " + this.f33489k.oc());
        return yw.m22063k(this, this.f73512zy);
    }

    public short f7l8() {
        return this.f73511toq;
    }

    public void fn3e(long j2) {
        this.f33489k.m21165i(j2);
    }

    public String fti() {
        if (!this.f33489k.ni7()) {
            return null;
        }
        return Long.toString(this.f33489k.m21167p()) + "@" + this.f33489k.m21164h() + "/" + this.f33489k.zurt();
    }

    public int fu4() {
        return this.f33489k.mo20673s() + 8 + this.f73512zy.length;
    }

    /* JADX INFO: renamed from: g */
    ByteBuffer mo21345g(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(fu4());
        }
        byteBuffer.putShort(this.f73511toq);
        byteBuffer.putShort((short) this.f33489k.mo20670k());
        byteBuffer.putInt(this.f73512zy.length);
        int iPosition = byteBuffer.position();
        this.f33489k.m20669g(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, this.f33489k.mo20670k());
        byteBuffer.position(iPosition + this.f33489k.mo20670k());
        byteBuffer.put(this.f73512zy);
        return byteBuffer;
    }

    /* JADX INFO: renamed from: h */
    public byte[] m21346h() {
        return yw.m22063k(this, this.f73512zy);
    }

    /* JADX INFO: renamed from: i */
    public String m21347i() {
        return this.f33489k.gvn7();
    }

    public String jk() {
        String strD2ok = this.f33489k.d2ok();
        if ("ID_NOT_AVAILABLE".equals(strD2ok)) {
            return null;
        }
        if (this.f33489k.m21166l()) {
            return strD2ok;
        }
        String strMcp = mcp();
        this.f33489k.eqxt(strMcp);
        return strMcp;
    }

    /* JADX INFO: renamed from: k */
    public int m21348k() {
        return this.f33489k.fu4();
    }

    public int ki() {
        return this.f33489k.m21168r();
    }

    public boolean kja0() {
        return this.f33489k.m21163f();
    }

    public void ld6(String str) {
        this.f33489k.eqxt(str);
    }

    /* JADX INFO: renamed from: n */
    public String m21349n() {
        return this.f33489k.mcp();
    }

    public void n7h(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            this.f33489k.o1t(0);
            this.f73512zy = bArr;
        } else {
            this.f33489k.o1t(1);
            this.f73512zy = com.xiaomi.push.service.n5r1.m21697s(com.xiaomi.push.service.n5r1.f7l8(str, jk()), bArr);
        }
    }

    public boolean ni7() {
        return this.f33489k.lrht();
    }

    public String o1t() {
        return this.f33489k.x9kr();
    }

    /* JADX INFO: renamed from: p */
    public void m21350p(long j2, String str, String str2) {
        if (j2 != 0) {
            this.f33489k.qrj(j2);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f33489k.kja0(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f33489k.fn3e(str2);
    }

    public void qrj(short s2) {
        this.f73511toq = s2;
    }

    /* JADX INFO: renamed from: s */
    public void m21351s(long j2) {
        this.f33489k.qrj(j2);
    }

    /* JADX INFO: renamed from: t */
    public void m21352t(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iIndexOf = str.indexOf("@");
        try {
            long j2 = Long.parseLong(str.substring(0, iIndexOf));
            int iIndexOf2 = str.indexOf("/", iIndexOf);
            String strSubstring = str.substring(iIndexOf + 1, iIndexOf2);
            String strSubstring2 = str.substring(iIndexOf2 + 1);
            this.f33489k.qrj(j2);
            this.f33489k.kja0(strSubstring);
            this.f33489k.fn3e(strSubstring2);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Blob parse user err " + e2.getMessage());
        }
    }

    public long t8r() {
        return this.f33489k.ki();
    }

    public String toString() {
        return "Blob [chid=" + m21348k() + "; Id=" + com.xiaomi.push.service.gvn7.toq(jk()) + "; cmd=" + m21349n() + "; type=" + ((int) f7l8()) + "; from=" + fti() + " ]";
    }

    public long toq() {
        return this.f33488g;
    }

    public void wvg(long j2) {
        this.f33489k.wvg(j2);
    }

    public void x2(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command should not be empty");
        }
        this.f33489k.m21169t(str);
        this.f33489k.ld6();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f33489k.jp0y(str2);
    }

    /* JADX INFO: renamed from: y */
    public void m21353y(int i2) {
        this.f33489k.x2(i2);
    }

    /* JADX INFO: renamed from: z */
    public long m21354z() {
        return this.f33489k.m21167p();
    }

    public void zurt(String str) {
        this.f33491q = str;
    }

    o5(lh.C5876k c5876k, short s2, byte[] bArr) {
        this.f73511toq = (short) 2;
        this.f73512zy = f33486s;
        this.f33491q = null;
        this.f33488g = System.currentTimeMillis();
        this.f33489k = c5876k;
        this.f73511toq = s2;
        this.f73512zy = bArr;
        this.f33490n = 2;
    }
}

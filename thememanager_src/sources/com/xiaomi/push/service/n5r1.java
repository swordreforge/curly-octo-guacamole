package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes3.dex */
public class n5r1 {

    /* JADX INFO: renamed from: n */
    private static int f33857n = 8;

    /* JADX INFO: renamed from: q */
    private int f33859q = -666;

    /* JADX INFO: renamed from: k */
    private byte[] f33858k = new byte[256];

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f73644zy = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f73643toq = 0;

    public static byte[] f7l8(String str, String str2) {
        byte[] qVar = com.xiaomi.push.x9kr.toq(str);
        byte[] bytes = str2.getBytes();
        byte[] bArr = new byte[qVar.length + 1 + bytes.length];
        for (int i2 = 0; i2 < qVar.length; i2++) {
            bArr[i2] = qVar[i2];
        }
        bArr[qVar.length] = 95;
        for (int i3 = 0; i3 < bytes.length; i3++) {
            bArr[qVar.length + 1 + i3] = bytes[i3];
        }
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    private static void m21693g(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2];
        bArr[i2] = bArr[i3];
        bArr[i3] = b2;
    }

    /* JADX INFO: renamed from: n */
    private void m21694n(byte[] bArr) {
        m21696q(256, bArr, false);
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m21695p(byte[] bArr, byte[] bArr2, boolean z2, int i2, int i3) {
        byte[] bArr3;
        int i4;
        if (i2 < 0 || i2 > bArr2.length || i2 + i3 > bArr2.length) {
            throw new IllegalArgumentException("start = " + i2 + " len = " + i3);
        }
        if (z2) {
            bArr3 = bArr2;
            i4 = i2;
        } else {
            bArr3 = new byte[i3];
            i4 = 0;
        }
        n5r1 n5r1Var = new n5r1();
        n5r1Var.m21694n(bArr);
        n5r1Var.zy();
        for (int i5 = 0; i5 < i3; i5++) {
            bArr3[i4 + i5] = (byte) (bArr2[i2 + i5] ^ n5r1Var.m21699k());
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: q */
    private void m21696q(int i2, byte[] bArr, boolean z2) {
        int length = bArr.length;
        for (int i3 = 0; i3 < 256; i3++) {
            this.f33858k[i3] = (byte) i3;
        }
        this.f73644zy = 0;
        this.f73643toq = 0;
        while (true) {
            int i4 = this.f73643toq;
            if (i4 >= i2) {
                break;
            }
            int qVar = ((this.f73644zy + toq(this.f33858k[i4])) + toq(bArr[this.f73643toq % length])) % 256;
            this.f73644zy = qVar;
            m21693g(this.f33858k, this.f73643toq, qVar);
            this.f73643toq++;
        }
        if (i2 != 256) {
            this.f33859q = ((this.f73644zy + toq(this.f33858k[i2])) + toq(bArr[i2 % length])) % 256;
        }
        if (z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("S_");
            int i5 = i2 - 1;
            sb.append(i5);
            sb.append(":");
            for (int i6 = 0; i6 <= i2; i6++) {
                sb.append(" ");
                sb.append(toq(this.f33858k[i6]));
            }
            sb.append("   j_");
            sb.append(i5);
            sb.append("=");
            sb.append(this.f73644zy);
            sb.append("   j_");
            sb.append(i2);
            sb.append("=");
            sb.append(this.f33859q);
            sb.append("   S_");
            sb.append(i5);
            sb.append("[j_");
            sb.append(i5);
            sb.append("]=");
            sb.append(toq(this.f33858k[this.f73644zy]));
            sb.append("   S_");
            sb.append(i5);
            sb.append("[j_");
            sb.append(i2);
            sb.append("]=");
            sb.append(toq(this.f33858k[this.f33859q]));
            if (this.f33858k[1] != 0) {
                sb.append("   S[1]!=0");
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0(sb.toString());
        }
    }

    /* JADX INFO: renamed from: s */
    public static byte[] m21697s(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        n5r1 n5r1Var = new n5r1();
        n5r1Var.m21694n(bArr);
        n5r1Var.zy();
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr3[i2] = (byte) (bArr2[i2] ^ n5r1Var.m21699k());
        }
        return bArr3;
    }

    public static int toq(byte b2) {
        return b2 >= 0 ? b2 : b2 + 256;
    }

    /* JADX INFO: renamed from: y */
    public static byte[] m21698y(byte[] bArr, String str) {
        return m21697s(bArr, com.xiaomi.push.x9kr.toq(str));
    }

    private void zy() {
        this.f73644zy = 0;
        this.f73643toq = 0;
    }

    /* JADX INFO: renamed from: k */
    byte m21699k() {
        int i2 = (this.f73643toq + 1) % 256;
        this.f73643toq = i2;
        int qVar = (this.f73644zy + toq(this.f33858k[i2])) % 256;
        this.f73644zy = qVar;
        m21693g(this.f33858k, this.f73643toq, qVar);
        byte[] bArr = this.f33858k;
        return bArr[(toq(bArr[this.f73643toq]) + toq(this.f33858k[this.f73644zy])) % 256];
    }
}

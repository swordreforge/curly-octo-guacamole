package com.xiaomi.push.service;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.io.encoding.C6247k;

/* JADX INFO: loaded from: classes3.dex */
public class uv6 {

    /* JADX INFO: renamed from: k */
    private static final byte[] f33915k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static RSAPublicKey f73670toq;

    static {
        byte[] bArr = {48, -127, -97, 48, com.google.common.base.zy.f68124kja0, 6, 9, 42, -122, 72, -122, -9, com.google.common.base.zy.f68124kja0, 1, 1, 1, 5, 0, 3, -127, -115, 0, 48, -127, -119, 2, -127, -127, 0, -109, -38, -114, com.google.common.base.zy.f68121jk, -72, 78, 16, 70, -90, 113, -30, 36, 85, -3, -43, 123, C6247k.f36300y, -98, 4, -16, 67, 19, -90, -73, -5, -89, 36, 44, -27, 59, -123, 72, -73, -48, 49, com.google.common.base.zy.f68124kja0, 16, 50, -27, -82, 18, -28, 84, 0, -41, 16, 69, -39, 7, 82, 56, 79, -37, 40, 85, 107, 98, 33, 123, -34, -49, 111, -11, 49, com.google.common.base.zy.f68118fti, 117, -74, 114, -122, -29, -84, 82, com.google.common.base.zy.f68130o1t, -122, 42, -40, -79, 18, -116, -42, 101, -70, 44, com.google.common.base.zy.f68132qrj, 62, -49, -3, -22, -2, 66, 90, -116, -75, -99, 34, 121, 69, 10, -81, -57, 89, -23, -36, -60, -81, 67, -114, 10, 79, 100, com.google.common.base.zy.f68122jp0y, 47, -24, 110, -66, -7, 87, 16, -125, -91, -43, -103, 67, -20, 41, 117, -37, -11, 2, 3, 1, 0, 1};
        f33915k = bArr;
        try {
            f73670toq = (RSAPublicKey) KeyFactory.getInstance(miuix.hybrid.internal.n7h.f40280k).generatePublic(new X509EncodedKeySpec(bArr));
        } catch (Throwable unused) {
            com.xiaomi.channel.commonutils.logger.zy.jk("rsa key pair init failure!!!");
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m21768k(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance(miuix.hybrid.internal.n7h.f87719toq);
            cipher.init(1, f73670toq);
            return Base64.encodeToString(toq(cipher, 1, str.getBytes("UTF-8"), f73670toq.getModulus().bitLength()), 2);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static byte[] toq(Cipher cipher, int i2, byte[] bArr, int i3) {
        if (cipher == null || bArr == null) {
            return null;
        }
        int i4 = i2 == 2 ? i3 / 8 : (i3 / 8) - 11;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i5 = 0;
            int i6 = 0;
            while (bArr.length > i5) {
                byte[] bArrDoFinal = bArr.length - i5 > i4 ? cipher.doFinal(bArr, i5, i4) : cipher.doFinal(bArr, i5, bArr.length - i5);
                byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
                i6++;
                i5 = i6 * i4;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}

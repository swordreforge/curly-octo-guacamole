package com.xiaomi.push;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class cn02 {

    /* JADX INFO: renamed from: k */
    private static final byte[] f32776k = {100, com.google.common.base.zy.f68135wvg, 84, 114, 72, 0, 4, 97, 73, 97, 2, 52, 84, 102, 18, 32};

    /* JADX INFO: renamed from: k */
    private static Cipher m20694k(byte[] bArr, int i2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f32776k);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i2, secretKeySpec, ivParameterSpec);
        return cipher;
    }

    public static byte[] toq(byte[] bArr, byte[] bArr2) {
        return m20694k(bArr, 2).doFinal(bArr2);
    }

    public static byte[] zy(byte[] bArr, byte[] bArr2) {
        return m20694k(bArr, 1).doFinal(bArr2);
    }
}

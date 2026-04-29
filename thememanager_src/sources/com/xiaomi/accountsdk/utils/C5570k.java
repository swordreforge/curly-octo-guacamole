package com.xiaomi.accountsdk.utils;

import android.util.Base64;
import com.xiaomi.accountsdk.request.C5545n;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.k */
/* JADX INFO: compiled from: AESCoder.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5570k implements InterfaceC5575p {

    /* JADX INFO: renamed from: q */
    private static final String f31035q = "UTF-8";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f72970toq = "AESCoder";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f72971zy = "AES/CBC/PKCS5Padding";

    /* JADX INFO: renamed from: k */
    private SecretKeySpec f31036k;

    public C5570k(byte[] bArr) {
        if (bArr == null) {
            throw new SecurityException("aes key is null");
        }
        if (bArr.length != 16) {
            AbstractC5574n.zy(f72970toq, "aesKey is invalid");
        }
        this.f31036k = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.xiaomi.accountsdk.utils.InterfaceC5575p
    /* JADX INFO: renamed from: k */
    public String mo19092k(String str) throws C5545n {
        try {
            return Base64.encodeToString(m19094q(str.getBytes("UTF-8")), 2);
        } catch (Exception e2) {
            throw new C5545n("fail to encrypt by aescoder", e2);
        }
    }

    /* JADX INFO: renamed from: n */
    protected byte[] mo19093n() {
        return "0102030405060708".getBytes();
    }

    /* JADX INFO: renamed from: q */
    public byte[] m19094q(byte[] bArr) throws C5545n {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, this.f31036k, new IvParameterSpec(mo19093n()));
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            throw new C5545n("fail to encrypt by aescoder", e2);
        }
    }

    @Override // com.xiaomi.accountsdk.utils.InterfaceC5575p
    public String toq(String str) throws C5545n {
        if (str == null) {
            AbstractC5574n.zy(f72970toq, "decrypt failed for empty data");
            return null;
        }
        try {
            return new String(zy(Base64.decode(str, 2)), "UTF-8");
        } catch (Exception e2) {
            throw new C5545n("fail to decrypt by aescoder", e2);
        }
    }

    public byte[] zy(byte[] bArr) throws C5545n {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, this.f31036k, new IvParameterSpec(mo19093n()));
            if (bArr != null) {
                return cipher.doFinal(bArr);
            }
            throw new IllegalBlockSizeException("no block data");
        } catch (Exception e2) {
            throw new C5545n("fail to decrypt by aescoder", e2);
        }
    }

    public C5570k(String str) {
        this(str == null ? null : Base64.decode(str, 2));
    }
}

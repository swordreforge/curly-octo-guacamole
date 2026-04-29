package com.android.thememanager.util;

import android.text.TextUtils;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import miuix.security.C7323k;
import t8iq.C7672k;

/* JADX INFO: compiled from: Coder.java */
/* JADX INFO: loaded from: classes2.dex */
public class o1t {

    /* JADX INFO: renamed from: k */
    public static final String f16688k = "AES/CBC/PKCS5Padding";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String[] f61389toq = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", C7672k.f94880zy, "e", "f"};

    public static final String f7l8(String data, String key) {
        byte[] bArrM9935g;
        if (!TextUtils.isEmpty(data) && !TextUtils.isEmpty(key) && (bArrM9935g = m9935g(key)) != null && bArrM9935g.length == 16) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM9935g, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, new IvParameterSpec("0102030405060708".getBytes()));
                return m9941s(cipher.doFinal(data.getBytes()));
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final byte[] m9935g(String string) {
        return Base64.decode(string, 0);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m9936h(String md5) {
        return !TextUtils.isEmpty(md5) && md5.matches("^[a-fA-F0-9]{32}$");
    }

    /* JADX INFO: renamed from: k */
    private static String m9937k(byte[] b2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b3 : b2) {
            stringBuffer.append(toq(b3));
        }
        return stringBuffer.toString();
    }

    public static byte[] kja0(String hexStr) {
        if (hexStr == null) {
            return null;
        }
        int length = hexStr.length();
        if (length % 2 == 1) {
            return null;
        }
        byte[] bArr = new byte[length / 2];
        for (int i2 = 0; i2 != length / 2; i2++) {
            try {
                int i3 = i2 * 2;
                bArr[i2] = (byte) Integer.parseInt(hexStr.substring(i3, i3 + 2), 16);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    public static final String ld6(File file) {
        FileInputStream fileInputStream;
        byte[] bArr = new byte[1024];
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 > 0) {
                            messageDigest.update(bArr, 0, i2);
                        } else {
                            try {
                                break;
                            } catch (IOException e2) {
                            }
                        }
                    }
                    return m9937k(messageDigest.digest());
                } catch (IOException e3) {
                    e3.printStackTrace();
                    try {
                        fileInputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    return null;
                } catch (NoSuchAlgorithmException e6) {
                    e6.printStackTrace();
                    try {
                        fileInputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    return null;
                }
            } catch (FileNotFoundException e8) {
                e8.printStackTrace();
                return null;
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e22) {
                e22.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static final String m9938n(String data, String key) {
        byte[] bArrM9935g;
        if (!TextUtils.isEmpty(data) && !TextUtils.isEmpty(key) && (bArrM9935g = m9935g(key)) != null && bArrM9935g.length == 16) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM9935g, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec("0102030405060708".getBytes()));
                byte[] bArrM9935g2 = m9935g(data);
                if (bArrM9935g2 == null) {
                    return null;
                }
                return new String(cipher.doFinal(bArrM9935g2));
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            }
        }
        return null;
    }

    public static final byte[] n7h(String string) {
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(string.getBytes());
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static final byte[] m9939p(String string) {
        return Base64.encode(string.getBytes(), 2);
    }

    /* JADX INFO: renamed from: q */
    public static final String m9940q(String string) {
        return new String(Base64.decode(string, 0));
    }

    public static final String qrj(String string) {
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(string.getBytes());
            return m9937k(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static final String m9941s(byte[] bytes) {
        return Base64.encodeToString(bytes, 2);
    }

    private static String toq(byte b2) {
        int i2 = b2;
        if (b2 < 0) {
            i2 = b2 + 256;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr = f61389toq;
        sb.append(strArr[i2 / 16]);
        sb.append(strArr[i2 % 16]);
        return sb.toString();
    }

    public static final String x2(String string) {
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
            messageDigest.update(string.getBytes());
            return m9937k(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static final String m9942y(String string) {
        return Base64.encodeToString(string.getBytes(), 2);
    }

    public static final String zy(String data, String key) {
        byte[] bytes;
        if (!TextUtils.isEmpty(data) && !TextUtils.isEmpty(key) && (bytes = key.getBytes()) != null && bytes.length == 16) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec);
                byte[] bArrKja0 = kja0(data);
                if (bArrKja0 == null) {
                    return null;
                }
                return new String(cipher.doFinal(bArrKja0));
            } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            }
        }
        return null;
    }
}

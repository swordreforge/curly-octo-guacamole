package miuix.security;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: miuix.security.k */
/* JADX INFO: compiled from: DigestUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7323k {

    /* JADX INFO: renamed from: k */
    private static final int f41609k = 4096;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f90061toq = "MD5";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f90062zy = "SHA-1";

    protected C7323k() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate utility class");
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m26552k(InputStream inputStream, String str) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            byte[] bArr = new byte[4096];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 <= 0) {
                    return messageDigest.digest();
                }
                messageDigest.update(bArr, 0, i2);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("NoSuchAlgorithmException", e2);
        }
    }

    public static byte[] toq(CharSequence charSequence, String str) {
        return zy(charSequence.toString().getBytes(), str);
    }

    public static byte[] zy(byte[] bArr, String str) {
        try {
            return m26552k(new ByteArrayInputStream(bArr), str);
        } catch (IOException e2) {
            throw new RuntimeException("IO exception happend in ByteArrayInputStream", e2);
        }
    }
}

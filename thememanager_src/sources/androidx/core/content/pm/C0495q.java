package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.vyq;

/* JADX INFO: renamed from: androidx.core.content.pm.q */
/* JADX INFO: compiled from: PackageInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0495q {

    /* JADX INFO: renamed from: androidx.core.content.pm.q$k */
    /* JADX INFO: compiled from: PackageInfoCompat.java */
    @hyr(28)
    private static class k {
        private k() {
        }

        @InterfaceC7830i
        @dd
        /* JADX INFO: renamed from: k */
        static Signature[] m2240k(@lvui SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static boolean m2241n(@lvui PackageManager packageManager, @lvui String str, @lvui byte[] bArr, int i2) {
            return packageManager.hasSigningCertificate(str, bArr, i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static boolean m2242q(@lvui SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        @InterfaceC7830i
        static long toq(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        @InterfaceC7830i
        @dd
        static Signature[] zy(@lvui SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }
    }

    private C0495q() {
    }

    /* JADX INFO: renamed from: k */
    private static boolean m2237k(@lvui byte[][] bArr, @lvui byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m2238n(@lvui PackageManager packageManager, @lvui String str, @vyq(min = 1) @lvui Map<byte[], Integer> map, boolean z2) throws PackageManager.NameNotFoundException {
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> setKeySet = map.keySet();
        for (byte[] bArr : setKeySet) {
            if (bArr == null) {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
            Integer num = map.get(bArr);
            if (num == null) {
                throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
            }
            int iIntValue = num.intValue();
            if (iIntValue != 0 && iIntValue != 1) {
                throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
            }
        }
        List<Signature> listM2239q = m2239q(packageManager, str);
        if (!z2 && Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr2 : setKeySet) {
                if (!k.m2241n(packageManager, str, bArr2, map.get(bArr2).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (listM2239q.size() != 0 && map.size() <= listM2239q.size() && (!z2 || map.size() == listM2239q.size())) {
            byte[][] bArr3 = null;
            if (map.containsValue(1)) {
                bArr3 = new byte[listM2239q.size()][];
                for (int i2 = 0; i2 < listM2239q.size(); i2++) {
                    bArr3[i2] = toq(listM2239q.get(i2).toByteArray());
                }
            }
            Iterator<byte[]> it = setKeySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                Integer num2 = map.get(next);
                int iIntValue2 = num2.intValue();
                if (iIntValue2 != 0) {
                    if (iIntValue2 != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num2);
                    }
                    if (!m2237k(bArr3, next)) {
                        return false;
                    }
                } else if (!listM2239q.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static List<Signature> m2239q(@lvui PackageManager packageManager, @lvui String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArrM2240k;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            signatureArrM2240k = k.m2242q(signingInfo) ? k.m2240k(signingInfo) : k.zy(signingInfo);
        } else {
            signatureArrM2240k = packageManager.getPackageInfo(str, 64).signatures;
        }
        return signatureArrM2240k == null ? Collections.emptyList() : Arrays.asList(signatureArrM2240k);
    }

    private static byte[] toq(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e2);
        }
    }

    public static long zy(@lvui PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? k.toq(packageInfo) : packageInfo.versionCode;
    }
}

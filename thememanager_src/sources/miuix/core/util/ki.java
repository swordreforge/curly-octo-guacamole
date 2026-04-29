package miuix.core.util;

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Utf8TextUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class ki {

    /* JADX INFO: renamed from: k */
    private static final String f39866k = "Utf8TextUtils";

    /* JADX INFO: renamed from: q */
    private static final int f39867q = 6;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f87346toq = "UTF-8";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f87347zy = 1;

    private ki() {
    }

    public static String f7l8(String str, int i2) {
        try {
            byte[] bytes = str.getBytes();
            List<C7082k> listM25566q = m25566q(bytes);
            if (listM25566q.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                while (sb.toString().getBytes().length < i2) {
                    sb.append(str.charAt(sb.length()));
                }
                if (sb.toString().getBytes().length > i2) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                return sb.toString();
            }
            int length = bytes.length;
            int size = listM25566q.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C7082k c7082k = listM25566q.get(size);
                if (c7082k.f39868k >= i2) {
                    size--;
                } else {
                    length = c7082k.m25567k();
                    if (length > i2) {
                        length = c7082k.f39868k;
                    }
                }
            }
            if (length >= bytes.length) {
                return str;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(bytes, 0, bArr, 0, length);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            Log.w(f39866k, "failed to get bytes of UTF-8 from " + str + ", " + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m25563g(String str, int i2, int i3) {
        if (!TextUtils.isEmpty(str) && i3 > i2) {
            byte[] bytes = str.getBytes();
            List<C7082k> listM25566q = m25566q(bytes);
            if (listM25566q.isEmpty()) {
                return str.substring(i2, i3);
            }
            if (i2 >= 0 && i2 < listM25566q.size()) {
                int size = listM25566q.size();
                int i4 = listM25566q.get(i2).f39868k;
                int length = (i3 >= size ? bytes.length : listM25566q.get(i3).f39868k) - i4;
                byte[] bArr = new byte[length];
                System.arraycopy(bytes, i4, bArr, 0, length);
                try {
                    return new String(bArr, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: k */
    private static C7082k m25564k(byte[] bArr, int i2, int i3) {
        C7082k c7082k = new C7082k();
        if (m25565n(bArr, i2, i3)) {
            c7082k.f39868k = i2;
            c7082k.f87348toq = i3;
        }
        return c7082k;
    }

    /* JADX INFO: renamed from: n */
    private static boolean m25565n(byte[] bArr, int i2, int i3) {
        if (i3 <= 1 || i3 > 6) {
            return false;
        }
        for (int i4 = 1; i4 < i3; i4++) {
            if (toq(bArr[i2 + i4]) != 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    private static List<C7082k> m25566q(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            if (i2 >= bArr.length) {
                break;
            }
            C7082k c7082kZy = zy(bArr, i2);
            if (!c7082kZy.toq()) {
                arrayList.clear();
                break;
            }
            arrayList.add(c7082kZy);
            i2 += c7082kZy.f87348toq;
        }
        return arrayList;
    }

    private static int toq(byte b2) {
        int i2 = 0;
        for (int i3 = 7; i3 >= 1 && (1 & ((byte) (b2 >> i3))) != 0; i3--) {
            i2++;
        }
        return i2;
    }

    private static C7082k zy(byte[] bArr, int i2) {
        int qVar = toq(bArr[i2]);
        return qVar == 0 ? new C7082k(i2, 1) : m25564k(bArr, i2, qVar);
    }

    /* JADX INFO: renamed from: miuix.core.util.ki$k */
    /* JADX INFO: compiled from: Utf8TextUtils.java */
    private static class C7082k {

        /* JADX INFO: renamed from: k */
        int f39868k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f87348toq;

        C7082k() {
            this.f39868k = -1;
            this.f87348toq = -1;
        }

        /* JADX INFO: renamed from: k */
        int m25567k() {
            return this.f39868k + this.f87348toq;
        }

        boolean toq() {
            return this.f39868k >= 0 && this.f87348toq > 0;
        }

        C7082k(int i2, int i3) {
            this.f39868k = i2;
            this.f87348toq = i3;
        }
    }
}

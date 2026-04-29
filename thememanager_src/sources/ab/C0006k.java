package ab;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import miuix.core.util.qrj;

/* JADX INFO: renamed from: ab.k */
/* JADX INFO: compiled from: SimpleNumberFormatter.java */
/* JADX INFO: loaded from: classes3.dex */
public class C0006k {

    /* JADX INFO: renamed from: k */
    private static Locale f3k = Locale.getDefault();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static char f46337toq = new DecimalFormatSymbols(f3k).getZeroDigit();

    /* JADX INFO: renamed from: k */
    private static String m2k(int i2, int i3) {
        StringBuilder sbMo25617k = qrj.m25613n().mo25617k();
        if (i3 < 0) {
            i3 = -i3;
            i2--;
            sbMo25617k.append('-');
        }
        if (i3 >= 10000) {
            String string = Integer.toString(i3);
            for (int length = string.length(); length < i2; length++) {
                sbMo25617k.append('0');
            }
            sbMo25617k.append(string);
        } else {
            for (int i4 = i3 >= 1000 ? 4 : i3 >= 100 ? 3 : i3 >= 10 ? 2 : 1; i4 < i2; i4++) {
                sbMo25617k.append('0');
            }
            sbMo25617k.append(i3);
        }
        String string2 = sbMo25617k.toString();
        qrj.m25613n().toq(sbMo25617k);
        return string2;
    }

    /* JADX INFO: renamed from: n */
    private static String m3n(char c2, String str) {
        int length = str.length();
        int i2 = c2 - '0';
        StringBuilder sbMo25617k = qrj.m25613n().mo25617k();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt >= '0' && cCharAt <= '9') {
                cCharAt = (char) (cCharAt + i2);
            }
            sbMo25617k.append(cCharAt);
        }
        String string = sbMo25617k.toString();
        qrj.m25613n().toq(sbMo25617k);
        return string;
    }

    /* JADX INFO: renamed from: q */
    private static char m4q(Locale locale) {
        if (locale == null) {
            throw new NullPointerException("locale == null");
        }
        if (!locale.equals(f3k)) {
            f46337toq = new DecimalFormatSymbols(locale).getZeroDigit();
            f3k = locale;
        }
        return f46337toq;
    }

    public static String toq(int i2) {
        return zy(-1, i2);
    }

    public static String zy(int i2, int i3) {
        char cM4q = m4q(Locale.getDefault());
        String strM2k = m2k(i2, i3);
        return cM4q != '0' ? m3n(cM4q, strM2k) : strM2k;
    }
}

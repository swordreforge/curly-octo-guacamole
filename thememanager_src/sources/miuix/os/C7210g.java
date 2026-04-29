package miuix.os;

import android.util.Log;
import java.io.IOException;
import java.util.Locale;
import miuix.core.util.C7083n;

/* JADX INFO: renamed from: miuix.os.g */
/* JADX INFO: compiled from: ProcessUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7210g {

    /* JADX INFO: renamed from: k */
    private static final String f40699k = "ProcessUtils";

    protected C7210g() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate utility class");
    }

    /* JADX INFO: renamed from: k */
    public static String m26162k(int i2) {
        String str = String.format(Locale.US, "/proc/%d/cmdline", Integer.valueOf(i2));
        try {
            String strQrj = C7083n.qrj(str);
            if (strQrj == null) {
                return null;
            }
            int iIndexOf = strQrj.indexOf(0);
            return iIndexOf >= 0 ? strQrj.substring(0, iIndexOf) : strQrj;
        } catch (IOException e2) {
            Log.e(f40699k, "Fail to read cmdline: " + str, e2);
            return null;
        }
    }
}

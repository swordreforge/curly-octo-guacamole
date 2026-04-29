package gyi;

import com.android.thememanager.basemodule.utils.C1821p;
import java.io.File;
import miui.os.UserHandle;
import p029m.zy;

/* JADX INFO: compiled from: IncallShowUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final String f35065k = "/data/system/theme_magic/users/";

    /* JADX INFO: renamed from: k */
    private static void m22358k() {
        String str = f35065k + UserHandle.myUserId() + "/incallshow";
        File file = new File(str);
        if (file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
            C1821p.zy(f35065k, 511);
            C1821p.zy(f35065k + UserHandle.myUserId(), 511);
            C1821p.zy(str, 511);
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    file2.delete();
                }
            }
        }
    }

    private static String toq(String path) {
        return f35065k + UserHandle.myUserId() + "/incallshow/" + C1821p.ld6(path);
    }

    public static String zy(String path) {
        if (zy.toq(path)) {
            return null;
        }
        File file = new File(path);
        if (!file.exists()) {
            return null;
        }
        m22358k();
        String qVar = toq(path);
        C1821p.m7183g(file, new File(qVar));
        C1821p.zy(qVar, 438);
        return qVar;
    }
}

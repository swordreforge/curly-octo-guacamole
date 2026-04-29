package miuix.module.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: miuix.module.core.k */
/* JADX INFO: compiled from: ContextHelper.java */
/* JADX INFO: loaded from: classes3.dex */
class C7200k {
    C7200k() {
    }

    /* JADX INFO: renamed from: k */
    static ClassLoader m26113k(Context context, ClassLoader classLoader) {
        return new PathClassLoader(toq(context), classLoader);
    }

    private static String toq(Context context) {
        ArrayList arrayList = new ArrayList();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if ((applicationInfo.flags & 4) != 0) {
            arrayList.add(applicationInfo.sourceDir);
        }
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(arrayList, strArr);
        }
        return arrayList.size() == 1 ? (String) arrayList.get(0) : TextUtils.join(File.pathSeparator, arrayList);
    }
}

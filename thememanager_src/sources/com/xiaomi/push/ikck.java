package com.xiaomi.push;

import android.system.Os;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class ikck {
    /* JADX INFO: renamed from: k */
    public static long m20979k(String str) {
        try {
            if (new File(str).exists()) {
                return Os.stat(str).st_size;
            }
            return 0L;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            return 0L;
        }
    }
}

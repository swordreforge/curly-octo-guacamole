package com.xiaomi.push;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class bek6 {

    /* JADX INFO: renamed from: k */
    private static b3e f32726k;

    /* JADX INFO: renamed from: k */
    public static File m20642k(Context context) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.zy.jk("ERROR: Context cannot be null.");
            return null;
        }
        b3e b3eVar = f32726k;
        if (b3eVar != null) {
            return b3eVar.m20634k(context);
        }
        com.xiaomi.channel.commonutils.logger.zy.jk("ERROR: XMSF not configure the instance of LogAgent.");
        return null;
    }
}

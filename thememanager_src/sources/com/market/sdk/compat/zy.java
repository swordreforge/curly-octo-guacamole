package com.market.sdk.compat;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.market.sdk.utils.n7h;

/* JADX INFO: compiled from: SettingsCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    public static final String f28036k = "sys_storage_threshold_max_bytes";

    /* JADX INFO: renamed from: k */
    public static int m17302k(Context context, String str, int i2, int i3) {
        Class cls = Integer.TYPE;
        Integer num = (Integer) n7h.m17459s(Settings.Secure.class, Settings.Secure.class, "getIntForUser", n7h.f7l8(cls, ContentResolver.class, String.class, cls, cls), context.getContentResolver(), str, Integer.valueOf(i2), Integer.valueOf(i3));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}

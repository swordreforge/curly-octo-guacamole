package com.android.thememanager.database;

import androidx.room.InterfaceC1139r;

/* JADX INFO: renamed from: com.android.thememanager.database.q */
/* JADX INFO: compiled from: LargeIconStringArrayConverter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1961q {
    @InterfaceC1139r
    /* JADX INFO: renamed from: k */
    public static String m7699k(String[] arrays) {
        if (arrays == null || arrays.length == 0) {
            return null;
        }
        return String.join(";", arrays);
    }

    @InterfaceC1139r
    public static String[] toq(String originalString) {
        if (p029m.zy.toq(originalString)) {
            return null;
        }
        try {
            return originalString.split(";");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}

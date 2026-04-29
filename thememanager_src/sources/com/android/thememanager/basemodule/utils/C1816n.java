package com.android.thememanager.basemodule.utils;

import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.n */
/* JADX INFO: compiled from: DateTimeUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C1816n {
    /* JADX INFO: renamed from: k */
    public static String m7142k(long millis) {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(Long.valueOf(millis));
    }
}

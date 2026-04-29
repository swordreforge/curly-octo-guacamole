package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;
import zy.uv6;

/* JADX INFO: compiled from: ManufacturerUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final String f24544k = "lge";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f67642toq = "samsung";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f67643zy = "meizu";

    private f7l8() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m14538k() {
        return toq() || m14539q();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m14539q() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f67642toq);
    }

    public static boolean toq() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f24544k);
    }

    public static boolean zy() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f67643zy);
    }
}

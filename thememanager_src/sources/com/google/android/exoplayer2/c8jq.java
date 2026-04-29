package com.google.android.exoplayer2;

import java.util.HashSet;

/* JADX INFO: compiled from: ExoPlayerLibraryInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c8jq {

    /* JADX INFO: renamed from: g */
    public static final boolean f19536g = true;

    /* JADX INFO: renamed from: k */
    public static final String f19537k = "ExoPlayerLib";

    /* JADX INFO: renamed from: n */
    public static final boolean f19538n = true;

    /* JADX INFO: renamed from: q */
    public static final int f19539q = 2016001;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f63543toq = "2.16.1";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f63544zy = "ExoPlayerLib/2.16.1";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final HashSet<String> f63542f7l8 = new HashSet<>();

    /* JADX INFO: renamed from: y */
    private static String f19540y = "goog.exo.core";

    private c8jq() {
    }

    /* JADX INFO: renamed from: k */
    public static synchronized void m11556k(String str) {
        if (f63542f7l8.add(str)) {
            String str2 = f19540y;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
            sb.append(str2);
            sb.append(", ");
            sb.append(str);
            f19540y = sb.toString();
        }
    }

    public static synchronized String toq() {
        return f19540y;
    }
}

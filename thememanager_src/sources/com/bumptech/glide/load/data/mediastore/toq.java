package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;

/* JADX INFO: compiled from: MediaStoreUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    private static final int f18220k = 512;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f62700toq = 384;

    private toq() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m10642k(Uri uri) {
        return toq(uri) && !m10643n(uri);
    }

    /* JADX INFO: renamed from: n */
    private static boolean m10643n(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    /* JADX INFO: renamed from: q */
    public static boolean m10644q(int i2, int i3) {
        return i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && i2 <= 512 && i3 <= f62700toq;
    }

    public static boolean toq(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean zy(Uri uri) {
        return toq(uri) && m10643n(uri);
    }
}

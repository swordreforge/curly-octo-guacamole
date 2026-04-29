package com.bumptech.glide.util;

import android.text.TextUtils;
import java.util.Collection;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes2.dex */
public final class qrj {
    private qrj() {
    }

    /* JADX INFO: renamed from: k */
    public static void m11260k(boolean z2, @lvui String str) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public static <T> T m11261n(@dd T t2, @lvui String str) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(str);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static <T> T m11262q(@dd T t2) {
        return (T) m11261n(t2, "Argument must not be null");
    }

    @lvui
    public static String toq(@dd String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    @lvui
    public static <T extends Collection<Y>, Y> T zy(@lvui T t2) {
        if (t2.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t2;
    }
}

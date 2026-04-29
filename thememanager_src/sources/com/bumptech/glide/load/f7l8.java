package com.bumptech.glide.load;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: Key.java */
/* JADX INFO: loaded from: classes2.dex */
public interface f7l8 {

    /* JADX INFO: renamed from: k */
    public static final String f18542k = "UTF-8";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final Charset f62824toq = Charset.forName("UTF-8");

    boolean equals(Object obj);

    int hashCode();

    void toq(@lvui MessageDigest messageDigest);
}

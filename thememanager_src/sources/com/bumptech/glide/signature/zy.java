package com.bumptech.glide.signature;

import com.bumptech.glide.load.f7l8;
import java.security.MessageDigest;
import zy.lvui;

/* JADX INFO: compiled from: EmptySignature.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy implements f7l8 {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final zy f63069zy = new zy();

    private zy() {
    }

    @lvui
    public static zy zy() {
        return f63069zy;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
    }
}

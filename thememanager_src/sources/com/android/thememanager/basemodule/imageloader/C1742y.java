package com.android.thememanager.basemodule.imageloader;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC0891q;
import com.bumptech.glide.C3164q;
import java.io.File;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.imageloader.y */
/* JADX INFO: compiled from: GlideApp.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1742y {
    private C1742y() {
    }

    @SuppressLint({"VisibleForTests"})
    @yz
    public static void f7l8() {
        com.bumptech.glide.zy.m11285z();
    }

    @SuppressLint({"VisibleForTests"})
    @Deprecated
    @yz
    /* JADX INFO: renamed from: g */
    public static void m6806g(com.bumptech.glide.zy glide) {
        com.bumptech.glide.zy.ki(glide);
    }

    @SuppressLint({"VisibleForTests"})
    @yz
    /* JADX INFO: renamed from: k */
    public static void m6807k() {
        com.bumptech.glide.zy.m11284q();
    }

    @lvui
    public static ld6 ld6(@lvui View view) {
        return (ld6) com.bumptech.glide.zy.fti(view);
    }

    @SuppressLint({"VisibleForTests"})
    @yz
    /* JADX INFO: renamed from: n */
    public static void m6808n(@lvui Context context, @lvui C3164q builder) {
        com.bumptech.glide.zy.cdj(context, builder);
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public static ld6 m6809p(@lvui Context context) {
        return (ld6) com.bumptech.glide.zy.a9(context);
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static File m6810q(@lvui Context context, @lvui String string) {
        return com.bumptech.glide.zy.qrj(context, string);
    }

    @lvui
    public static ld6 qrj(@lvui ActivityC0891q activity) {
        return (ld6) com.bumptech.glide.zy.gvn7(activity);
    }

    @lvui
    @Deprecated
    /* JADX INFO: renamed from: s */
    public static ld6 m6811s(@lvui Fragment fragment) {
        return (ld6) com.bumptech.glide.zy.jk(fragment);
    }

    @lvui
    public static com.bumptech.glide.zy toq(@lvui Context context) {
        return com.bumptech.glide.zy.m11283n(context);
    }

    @lvui
    public static ld6 x2(@lvui androidx.fragment.app.Fragment fragment) {
        return (ld6) com.bumptech.glide.zy.jp0y(fragment);
    }

    @lvui
    @Deprecated
    /* JADX INFO: renamed from: y */
    public static ld6 m6812y(@lvui Activity activity) {
        return (ld6) com.bumptech.glide.zy.mcp(activity);
    }

    @dd
    public static File zy(@lvui Context context) {
        return com.bumptech.glide.zy.x2(context);
    }
}

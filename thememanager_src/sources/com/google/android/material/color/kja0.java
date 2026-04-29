package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0541p;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.a9;
import zy.lvui;
import zy.zurt;

/* JADX INFO: compiled from: MaterialColors.java */
/* JADX INFO: loaded from: classes2.dex */
public class kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f67493f7l8 = 100;

    /* JADX INFO: renamed from: g */
    private static final int f24184g = 40;

    /* JADX INFO: renamed from: k */
    public static final float f24185k = 1.0f;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f67494ld6 = 20;

    /* JADX INFO: renamed from: n */
    public static final float f24186n = 0.12f;

    /* JADX INFO: renamed from: p */
    private static final int f24187p = 80;

    /* JADX INFO: renamed from: q */
    public static final float f24188q = 0.32f;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f67495qrj = 90;

    /* JADX INFO: renamed from: s */
    private static final int f24189s = 10;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final float f67496toq = 0.54f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f67497x2 = 30;

    /* JADX INFO: renamed from: y */
    private static final int f24190y = 90;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final float f67498zy = 0.38f;

    private kja0() {
    }

    @lvui
    public static C3981g f7l8(@zy.x2 int i2, boolean z2) {
        return z2 ? new C3981g(m14281g(i2, 40), m14281g(i2, 100), m14281g(i2, 90), m14281g(i2, 10)) : new C3981g(m14281g(i2, 80), m14281g(i2, 20), m14281g(i2, 30), m14281g(i2, 90));
    }

    @zy.x2
    /* JADX INFO: renamed from: g */
    private static int m14281g(@zy.x2 int i2, @a9(from = 0, to = 100) int i3) {
        n7h n7hVarZy = n7h.zy(i2);
        n7hVarZy.x2(i3);
        return n7hVarZy.qrj();
    }

    @zy.x2
    /* JADX INFO: renamed from: k */
    public static int m14282k(@zy.x2 int i2, @a9(from = 0, to = 255) int i3) {
        return C0541p.m2542t(i2, (Color.alpha(i2) * i3) / 255);
    }

    @zy.x2
    public static int kja0(@lvui View view, @InterfaceC7828g int i2, @InterfaceC7828g int i3, @zurt(from = 0.0d, to = 1.0d) float f2) {
        return qrj(m14285q(view, i2), m14285q(view, i3), f2);
    }

    public static boolean ld6(@zy.x2 int i2) {
        return i2 != 0 && C0541p.qrj(i2) > 0.5d;
    }

    @zy.x2
    /* JADX INFO: renamed from: n */
    public static int m14283n(@lvui View view, @InterfaceC7828g int i2, @zy.x2 int i3) {
        return toq(view.getContext(), i2, i3);
    }

    @zy.x2
    public static int n7h(@lvui View view, @InterfaceC7828g int i2, @InterfaceC7828g int i3) {
        return kja0(view, i2, i3, 1.0f);
    }

    @zy.x2
    /* JADX INFO: renamed from: p */
    public static int m14284p(@lvui Context context, @zy.x2 int i2) {
        return m14286s(i2, zy(context, C6095k.zy.f80219kz28, kja0.class.getCanonicalName()));
    }

    @zy.x2
    /* JADX INFO: renamed from: q */
    public static int m14285q(@lvui View view, @InterfaceC7828g int i2) {
        return com.google.android.material.resources.toq.m14750y(view, i2);
    }

    @zy.x2
    public static int qrj(@zy.x2 int i2, @zy.x2 int i3, @zurt(from = 0.0d, to = 1.0d) float f2) {
        return x2(i2, C0541p.m2542t(i3, Math.round(Color.alpha(i3) * f2)));
    }

    @zy.x2
    /* JADX INFO: renamed from: s */
    public static int m14286s(@zy.x2 int i2, @zy.x2 int i3) {
        return C3983k.zy(i2, i3);
    }

    @zy.x2
    public static int toq(@lvui Context context, @InterfaceC7828g int i2, @zy.x2 int i3) {
        TypedValue typedValueM14747k = com.google.android.material.resources.toq.m14747k(context, i2);
        return typedValueM14747k != null ? typedValueM14747k.data : i3;
    }

    @zy.x2
    public static int x2(@zy.x2 int i2, @zy.x2 int i3) {
        return C0541p.m2536i(i3, i2);
    }

    @lvui
    /* JADX INFO: renamed from: y */
    public static C3981g m14287y(@lvui Context context, @zy.x2 int i2) {
        return f7l8(i2, com.google.android.material.resources.toq.toq(context, C6095k.zy.r8k, true));
    }

    @zy.x2
    public static int zy(Context context, @InterfaceC7828g int i2, String str) {
        return com.google.android.material.resources.toq.f7l8(context, i2, str);
    }
}

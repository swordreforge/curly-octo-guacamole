package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C4058z;
import zy.lvui;

/* JADX INFO: compiled from: MaterialShapeUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 {
    private ld6() {
    }

    /* JADX INFO: renamed from: g */
    public static void m14841g(@lvui View view, @lvui C4108p c4108p) {
        if (c4108p.hb()) {
            c4108p.t8iq(C4058z.m14625p(view));
        }
    }

    @lvui
    /* JADX INFO: renamed from: k */
    static C4107n m14842k(int i2) {
        return i2 != 0 ? i2 != 1 ? toq() : new C4102g() : new n7h();
    }

    /* JADX INFO: renamed from: n */
    public static void m14843n(@lvui View view) {
        Drawable background = view.getBackground();
        if (background instanceof C4108p) {
            m14841g(view, (C4108p) background);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m14844q(@lvui View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof C4108p) {
            ((C4108p) background).zp(f2);
        }
    }

    @lvui
    static C4107n toq() {
        return new n7h();
    }

    @lvui
    static f7l8 zy() {
        return new f7l8();
    }
}

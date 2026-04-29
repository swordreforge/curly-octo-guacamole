package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import ki.C6116k;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.resources.y */
/* JADX INFO: compiled from: TypefaceUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C4093y {
    private C4093y() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static Typeface m14751k(@lvui Context context, @lvui Typeface typeface) {
        return toq(context.getResources().getConfiguration(), typeface);
    }

    @dd
    public static Typeface toq(@lvui Configuration configuration, @lvui Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (i2 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i2 == 0) {
            return null;
        }
        return Typeface.create(typeface, C6116k.m22394n(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}

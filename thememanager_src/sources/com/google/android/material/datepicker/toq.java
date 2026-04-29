package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import ij.C6095k;
import zy.lvui;

/* JADX INFO: compiled from: CalendarStyle.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @lvui
    final C4008k f67572f7l8;

    /* JADX INFO: renamed from: g */
    @lvui
    final C4008k f24366g;

    /* JADX INFO: renamed from: k */
    @lvui
    final C4008k f24367k;

    /* JADX INFO: renamed from: n */
    @lvui
    final C4008k f24368n;

    /* JADX INFO: renamed from: q */
    @lvui
    final C4008k f24369q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    final C4008k f67573toq;

    /* JADX INFO: renamed from: y */
    @lvui
    final Paint f24370y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @lvui
    final C4008k f67574zy;

    toq(@lvui Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.toq.f7l8(context, C6095k.zy.mle, C4006g.class.getCanonicalName()), C6095k.kja0.op7r);
        this.f24367k = C4008k.m14421k(context, typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.lww6, 0));
        this.f67572f7l8 = C4008k.m14421k(context, typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.q8e, 0));
        this.f67573toq = C4008k.m14421k(context, typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.qpih, 0));
        this.f67574zy = C4008k.m14421k(context, typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.aqx, 0));
        ColorStateList colorStateListM14753k = com.google.android.material.resources.zy.m14753k(context, typedArrayObtainStyledAttributes, C6095k.kja0.yad);
        this.f24369q = C4008k.m14421k(context, typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.gm, 0));
        this.f24368n = C4008k.m14421k(context, typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.u7l5, 0));
        this.f24366g = C4008k.m14421k(context, typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.y9h3, 0));
        Paint paint = new Paint();
        this.f24370y = paint;
        paint.setColor(colorStateListM14753k.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}

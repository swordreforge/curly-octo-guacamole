package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.animation.n */
/* JADX INFO: compiled from: DrawableAlphaProperty.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3911n extends Property<Drawable, Integer> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final Property<Drawable, Integer> f67314toq = new C3911n();

    /* JADX INFO: renamed from: k */
    private final WeakHashMap<Drawable, Integer> f23774k;

    private C3911n() {
        super(Integer.class, "drawableAlphaCompat");
        this.f23774k = new WeakHashMap<>();
    }

    @Override // android.util.Property
    @dd
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer get(@lvui Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public void set(@lvui Drawable drawable, @lvui Integer num) {
        drawable.setAlpha(num.intValue());
    }
}

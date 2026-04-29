package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import ij.C6095k;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.animation.q */
/* JADX INFO: compiled from: ChildrenAlphaProperty.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3913q extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: k */
    public static final Property<ViewGroup, Float> f23776k = new C3913q("childrenAlpha");

    private C3913q(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @lvui
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Float get(@lvui ViewGroup viewGroup) {
        Float f2 = (Float) viewGroup.getTag(C6095k.y.f80011kl7m);
        return f2 != null ? f2 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public void set(@lvui ViewGroup viewGroup, @lvui Float f2) {
        float fFloatValue = f2.floatValue();
        viewGroup.setTag(C6095k.y.f80011kl7m, Float.valueOf(fFloatValue));
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            viewGroup.getChildAt(i2).setAlpha(fFloatValue);
        }
    }
}

package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import zy.lvui;

/* JADX INFO: compiled from: ArgbEvaluatorCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy implements TypeEvaluator<Integer> {

    /* JADX INFO: renamed from: k */
    private static final zy f23781k = new zy();

    @lvui
    public static zy toq() {
        return f23781k;
    }

    @Override // android.animation.TypeEvaluator
    @lvui
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer evaluate(float f2, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f3 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f4 = f3 + (((((iIntValue2 >> 24) & 255) / 255.0f) - f3) * f2);
        float fPow5 = fPow2 + ((((float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f2);
        float fPow6 = fPow3 + (f2 * (((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3));
        return Integer.valueOf((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f2), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f4 * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}

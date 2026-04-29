package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.C1225l;
import androidx.transition.oc;
import java.util.Map;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: TextScale.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class kja0 extends oc {
    private static final String bs = "android:textscale:scale";

    /* JADX INFO: renamed from: com.google.android.material.internal.kja0$k */
    /* JADX INFO: compiled from: TextScale.java */
    class C4048k implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ TextView f24551k;

        C4048k(TextView textView) {
            this.f24551k = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f24551k.setScaleX(fFloatValue);
            this.f24551k.setScaleY(fFloatValue);
        }
    }

    private void fnq8(@lvui C1225l c1225l) {
        View view = c1225l.f53502toq;
        if (view instanceof TextView) {
            c1225l.f6686k.put(bs, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.oc
    public void cdj(@lvui C1225l c1225l) {
        fnq8(c1225l);
    }

    @Override // androidx.transition.oc
    public Animator fu4(@lvui ViewGroup viewGroup, @dd C1225l c1225l, @dd C1225l c1225l2) {
        if (c1225l == null || c1225l2 == null || !(c1225l.f53502toq instanceof TextView)) {
            return null;
        }
        View view = c1225l2.f53502toq;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = c1225l.f6686k;
        Map<String, Object> map2 = c1225l2.f6686k;
        float fFloatValue = map.get(bs) != null ? ((Float) map.get(bs)).floatValue() : 1.0f;
        float fFloatValue2 = map2.get(bs) != null ? ((Float) map2.get(bs)).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new C4048k(textView));
        return valueAnimatorOfFloat;
    }

    @Override // androidx.transition.oc
    /* JADX INFO: renamed from: i */
    public void mo5315i(@lvui C1225l c1225l) {
        fnq8(c1225l);
    }
}

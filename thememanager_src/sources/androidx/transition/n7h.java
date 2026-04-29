package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0683f;

/* JADX INFO: compiled from: Fade.java */
/* JADX INFO: loaded from: classes.dex */
public class n7h extends t8iq {
    private static final String tgs = "Fade";
    private static final String w97r = "android:fade:transitionAlpha";
    public static final int yl25 = 1;
    public static final int zmmu = 2;

    /* JADX INFO: renamed from: androidx.transition.n7h$k */
    /* JADX INFO: compiled from: Fade.java */
    class C1233k extends d2ok {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f6721k;

        C1233k(View view) {
            this.f6721k = view;
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: q */
        public void mo5311q(@zy.lvui oc ocVar) {
            C1231m.m5394y(this.f6721k, 1.0f);
            C1231m.m5389k(this.f6721k);
            ocVar.mo5320x(this);
        }
    }

    /* JADX INFO: compiled from: Fade.java */
    private static class toq extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        private final View f6723k;

        /* JADX INFO: renamed from: q */
        private boolean f6724q = false;

        toq(View view) {
            this.f6723k = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1231m.m5394y(this.f6723k, 1.0f);
            if (this.f6724q) {
                this.f6723k.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C0683f.g1(this.f6723k) && this.f6723k.getLayerType() == 0) {
                this.f6724q = true;
                this.f6723k.setLayerType(2, null);
            }
        }
    }

    public n7h(int i2) {
        zsr0(i2);
    }

    private static float i9jn(C1225l c1225l, float f2) {
        Float f3;
        return (c1225l == null || (f3 = (Float) c1225l.f6686k.get(w97r)) == null) ? f2 : f3.floatValue();
    }

    private Animator py(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        C1231m.m5394y(view, f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C1231m.f53515zy, f3);
        objectAnimatorOfFloat.addListener(new toq(view));
        mo5316k(new C1233k(view));
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.t8iq
    @zy.dd
    public Animator d8wk(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        float fI9jn = i9jn(c1225l, 0.0f);
        return py(view, fI9jn != 1.0f ? fI9jn : 0.0f, 1.0f);
    }

    @Override // androidx.transition.t8iq, androidx.transition.oc
    /* JADX INFO: renamed from: i */
    public void mo5315i(@zy.lvui C1225l c1225l) {
        super.mo5315i(c1225l);
        c1225l.f6686k.put(w97r, Float.valueOf(C1231m.zy(c1225l.f53502toq)));
    }

    @Override // androidx.transition.t8iq
    @zy.dd
    public Animator was(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        C1231m.m5390n(view);
        return py(view, i9jn(c1225l, 1.0f), 0.0f);
    }

    public n7h() {
    }

    @SuppressLint({"RestrictedApi"})
    public n7h(@zy.lvui Context context, @zy.lvui AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d3.f6375g);
        zsr0(androidx.core.content.res.kja0.ld6(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, qo()));
        typedArrayObtainStyledAttributes.recycle();
    }
}

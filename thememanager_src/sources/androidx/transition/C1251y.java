package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0683f;

/* JADX INFO: renamed from: androidx.transition.y */
/* JADX INFO: compiled from: ChangeClipBounds.java */
/* JADX INFO: loaded from: classes.dex */
public class C1251y extends oc {
    private static final String k0 = "android:clipBounds:bounds";
    private static final String bs = "android:clipBounds:clip";
    private static final String[] ar = {bs};

    /* JADX INFO: renamed from: androidx.transition.y$k */
    /* JADX INFO: compiled from: ChangeClipBounds.java */
    class k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f6801k;

        k(View view) {
            this.f6801k = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0683f.vy(this.f6801k, null);
        }
    }

    public C1251y() {
    }

    private void fnq8(C1225l c1225l) {
        View view = c1225l.f53502toq;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect rectX9kr = C0683f.x9kr(view);
        c1225l.f6686k.put(bs, rectX9kr);
        if (rectX9kr == null) {
            c1225l.f6686k.put(k0, new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.oc
    public void cdj(@zy.lvui C1225l c1225l) {
        fnq8(c1225l);
    }

    @Override // androidx.transition.oc
    @zy.dd
    public Animator fu4(@zy.lvui ViewGroup viewGroup, @zy.dd C1225l c1225l, @zy.dd C1225l c1225l2) {
        ObjectAnimator objectAnimatorOfObject = null;
        if (c1225l != null && c1225l2 != null && c1225l.f6686k.containsKey(bs) && c1225l2.f6686k.containsKey(bs)) {
            Rect rect = (Rect) c1225l.f6686k.get(bs);
            Rect rect2 = (Rect) c1225l2.f6686k.get(bs);
            boolean z2 = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) c1225l.f6686k.get(k0);
            } else if (rect2 == null) {
                rect2 = (Rect) c1225l2.f6686k.get(k0);
            }
            if (rect.equals(rect2)) {
                return null;
            }
            C0683f.vy(c1225l2.f53502toq, rect);
            objectAnimatorOfObject = ObjectAnimator.ofObject(c1225l2.f53502toq, (Property<View, V>) C1231m.f6718q, (TypeEvaluator) new a9(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z2) {
                objectAnimatorOfObject.addListener(new k(c1225l2.f53502toq));
            }
        }
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.oc
    /* JADX INFO: renamed from: i */
    public void mo5315i(@zy.lvui C1225l c1225l) {
        fnq8(c1225l);
    }

    @Override // androidx.transition.oc
    @zy.lvui
    public String[] nn86() {
        return ar;
    }

    public C1251y(@zy.lvui Context context, @zy.lvui AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

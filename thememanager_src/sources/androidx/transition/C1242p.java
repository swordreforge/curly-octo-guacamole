package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.p */
/* JADX INFO: compiled from: ChangeScroll.java */
/* JADX INFO: loaded from: classes.dex */
public class C1242p extends oc {
    private static final String bs = "android:changeScroll:x";
    private static final String k0 = "android:changeScroll:y";
    private static final String[] ar = {bs, k0};

    public C1242p() {
    }

    private void fnq8(C1225l c1225l) {
        c1225l.f6686k.put(bs, Integer.valueOf(c1225l.f53502toq.getScrollX()));
        c1225l.f6686k.put(k0, Integer.valueOf(c1225l.f53502toq.getScrollY()));
    }

    @Override // androidx.transition.oc
    public void cdj(@zy.lvui C1225l c1225l) {
        fnq8(c1225l);
    }

    @Override // androidx.transition.oc
    @zy.dd
    public Animator fu4(@zy.lvui ViewGroup viewGroup, @zy.dd C1225l c1225l, @zy.dd C1225l c1225l2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (c1225l == null || c1225l2 == null) {
            return null;
        }
        View view = c1225l2.f53502toq;
        int iIntValue = ((Integer) c1225l.f6686k.get(bs)).intValue();
        int iIntValue2 = ((Integer) c1225l2.f6686k.get(bs)).intValue();
        int iIntValue3 = ((Integer) c1225l.f6686k.get(k0)).intValue();
        int iIntValue4 = ((Integer) c1225l2.f6686k.get(k0)).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        return ncyb.zy(objectAnimatorOfInt, objectAnimatorOfInt2);
    }

    @Override // androidx.transition.oc
    /* JADX INFO: renamed from: i */
    public void mo5315i(@zy.lvui C1225l c1225l) {
        fnq8(c1225l);
    }

    @Override // androidx.transition.oc
    @zy.dd
    public String[] nn86() {
        return ar;
    }

    public C1242p(@zy.lvui Context context, @zy.lvui AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

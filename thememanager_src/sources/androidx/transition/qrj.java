package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.jk;

/* JADX INFO: compiled from: Explode.java */
/* JADX INFO: loaded from: classes.dex */
public class qrj extends t8iq {
    private static final TimeInterpolator tgs = new DecelerateInterpolator();
    private static final TimeInterpolator yl25 = new AccelerateInterpolator();
    private static final String zmmu = "android:explode:screenBounds";
    private int[] w97r;

    public qrj() {
        this.w97r = new int[2];
        mo5313d(new x2());
    }

    private void fnq8(C1225l c1225l) {
        View view = c1225l.f53502toq;
        view.getLocationOnScreen(this.w97r);
        int[] iArr = this.w97r;
        int i2 = iArr[0];
        int i3 = iArr[1];
        c1225l.f6686k.put(zmmu, new Rect(i2, i3, view.getWidth() + i2, view.getHeight() + i3));
    }

    private static float i9jn(View view, int i2, int i3) {
        return py(Math.max(i2, view.getWidth() - i2), Math.max(i3, view.getHeight() - i3));
    }

    private void ltg8(View view, Rect rect, int[] iArr) {
        int iCenterY;
        int width;
        view.getLocationOnScreen(this.w97r);
        int[] iArr2 = this.w97r;
        int i2 = iArr2[0];
        int i3 = iArr2[1];
        Rect rectM5413r = m5413r();
        if (rectM5413r == null) {
            width = (view.getWidth() / 2) + i2 + Math.round(view.getTranslationX());
            iCenterY = (view.getHeight() / 2) + i3 + Math.round(view.getTranslationY());
        } else {
            int iCenterX = rectM5413r.centerX();
            iCenterY = rectM5413r.centerY();
            width = iCenterX;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fPy = py(fCenterX, fCenterY);
        float fI9jn = i9jn(view, width - i2, iCenterY - i3);
        iArr[0] = Math.round((fCenterX / fPy) * fI9jn);
        iArr[1] = Math.round(fI9jn * (fCenterY / fPy));
    }

    private static float py(float f2, float f3) {
        return (float) Math.sqrt((f2 * f2) + (f3 * f3));
    }

    @Override // androidx.transition.t8iq, androidx.transition.oc
    public void cdj(@zy.lvui C1225l c1225l) {
        super.cdj(c1225l);
        fnq8(c1225l);
    }

    @Override // androidx.transition.t8iq
    @zy.dd
    public Animator d8wk(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        if (c1225l2 == null) {
            return null;
        }
        Rect rect = (Rect) c1225l2.f6686k.get(zmmu);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        ltg8(viewGroup, rect, this.w97r);
        int[] iArr = this.w97r;
        return hyr.m5356k(view, c1225l2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, tgs, this);
    }

    @Override // androidx.transition.t8iq, androidx.transition.oc
    /* JADX INFO: renamed from: i */
    public void mo5315i(@zy.lvui C1225l c1225l) {
        super.mo5315i(c1225l);
        fnq8(c1225l);
    }

    @Override // androidx.transition.t8iq
    @zy.dd
    public Animator was(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        float f2;
        float f3;
        if (c1225l == null) {
            return null;
        }
        Rect rect = (Rect) c1225l.f6686k.get(zmmu);
        int i2 = rect.left;
        int i3 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) c1225l.f53502toq.getTag(jk.f7l8.f52516cnbm);
        if (iArr != null) {
            f2 = (r7 - rect.left) + translationX;
            f3 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f2 = translationX;
            f3 = translationY;
        }
        ltg8(viewGroup, rect, this.w97r);
        int[] iArr2 = this.w97r;
        return hyr.m5356k(view, c1225l, i2, i3, translationX, translationY, f2 + iArr2[0], f3 + iArr2[1], yl25, this);
    }

    public qrj(@zy.lvui Context context, @zy.lvui AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w97r = new int[2];
        mo5313d(new x2());
    }
}

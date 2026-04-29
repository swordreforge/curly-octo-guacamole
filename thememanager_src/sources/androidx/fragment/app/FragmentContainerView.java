package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C0683f;
import androidx.core.view.tfm;
import com.xiaomi.onetrack.api.C5693g;
import java.util.ArrayList;
import o1t.C7422k;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private boolean f4681g;

    /* JADX INFO: renamed from: k */
    private ArrayList<View> f4682k;

    /* JADX INFO: renamed from: n */
    private View.OnApplyWindowInsetsListener f4683n;

    /* JADX INFO: renamed from: q */
    private ArrayList<View> f4684q;

    public FragmentContainerView(@lvui Context context) {
        super(context);
        this.f4681g = true;
    }

    /* JADX INFO: renamed from: k */
    private void m4182k(@lvui View view) {
        ArrayList<View> arrayList = this.f4684q;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f4682k == null) {
            this.f4682k = new ArrayList<>();
        }
        this.f4682k.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(@lvui View view, int i2, @dd ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.gbni(view) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(@lvui View view, int i2, @dd ViewGroup.LayoutParams layoutParams, boolean z2) {
        if (FragmentManager.gbni(view) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z2);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    @hyr(20)
    @lvui
    public WindowInsets dispatchApplyWindowInsets(@lvui WindowInsets windowInsets) {
        tfm tfmVarEqxt = tfm.eqxt(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4683n;
        tfm tfmVarEqxt2 = onApplyWindowInsetsListener != null ? tfm.eqxt(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : C0683f.bz2(this, tfmVarEqxt);
        if (!tfmVarEqxt2.wvg()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                C0683f.m3162h(getChildAt(i2), tfmVarEqxt2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@lvui Canvas canvas) {
        if (this.f4681g && this.f4682k != null) {
            for (int i2 = 0; i2 < this.f4682k.size(); i2++) {
                super.drawChild(canvas, this.f4682k.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@lvui Canvas canvas, @lvui View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f4681g || (arrayList = this.f4682k) == null || arrayList.size() <= 0 || !this.f4682k.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@lvui View view) {
        ArrayList<View> arrayList = this.f4684q;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f4682k;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f4681g = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    @hyr(20)
    @lvui
    public WindowInsets onApplyWindowInsets(@lvui WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m4182k(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(@lvui View view, boolean z2) {
        if (z2) {
            m4182k(view);
        }
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@lvui View view) {
        m4182k(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        m4182k(getChildAt(i2));
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@lvui View view) {
        m4182k(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            m4182k(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            m4182k(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    void setDrawDisappearingViewsLast(boolean z2) {
        this.f4681g = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@dd LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@lvui View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f4683n = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@lvui View view) {
        if (view.getParent() == this) {
            if (this.f4684q == null) {
                this.f4684q = new ArrayList<>();
            }
            this.f4684q.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        String str;
        super(context, attributeSet, i2);
        this.f4681g = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7422k.x2.f93784jk);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(C7422k.x2.f93772a9);
                str = "android:name";
            } else {
                str = C5693g.f31802r;
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    FragmentContainerView(@lvui Context context, @lvui AttributeSet attributeSet, @lvui FragmentManager fragmentManager) {
        String str;
        super(context, attributeSet);
        this.f4681g = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7422k.x2.f93784jk);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(C7422k.x2.f93772a9) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(C7422k.x2.f93780fti);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentCh = fragmentManager.ch(id);
        if (classAttribute != null && fragmentCh == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentMo4213k = fragmentManager.vq().mo4213k(context.getClassLoader(), classAttribute);
            fragmentMo4213k.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.ki().lvui(true).m4309g(this, fragmentMo4213k, string).mo4296h();
        }
        fragmentManager.jz5(this);
    }
}

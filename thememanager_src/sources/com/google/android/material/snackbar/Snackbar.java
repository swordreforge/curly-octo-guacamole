package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import ij.C6095k;
import zy.cdj;
import zy.dd;
import zy.lvui;
import zy.nn86;
import zy.uv6;
import zy.x2;

/* JADX INFO: loaded from: classes2.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final int[] f67897lvui;

    /* JADX INFO: renamed from: r */
    private static final int[] f25108r;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    @dd
    private BaseTransientBottomBar.t8r<Snackbar> f67898d2ok;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private boolean f67899eqxt;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    @dd
    private final AccessibilityManager f67900oc;

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@dd Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@dd Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@dd ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@dd PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@dd View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.Snackbar$k */
    class ViewOnClickListenerC4133k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View.OnClickListener f25109k;

        ViewOnClickListenerC4133k(View.OnClickListener onClickListener) {
            this.f25109k = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f25109k.onClick(view);
            Snackbar.this.fn3e(1);
        }
    }

    public static class toq extends BaseTransientBottomBar.t8r<Snackbar> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f67901f7l8 = 1;

        /* JADX INFO: renamed from: g */
        public static final int f25111g = 0;

        /* JADX INFO: renamed from: p */
        public static final int f25112p = 4;

        /* JADX INFO: renamed from: s */
        public static final int f25113s = 3;

        /* JADX INFO: renamed from: y */
        public static final int f25114y = 2;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t8r
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void toq(Snackbar snackbar) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t8r
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void mo14939k(Snackbar snackbar, int i2) {
        }
    }

    static {
        int i2 = C6095k.zy.tb;
        f67897lvui = new int[]{i2};
        f25108r = new int[]{i2, C6095k.zy.h5bu};
    }

    private Snackbar(@lvui Context context, @lvui ViewGroup viewGroup, @lvui View view, @lvui InterfaceC4134k interfaceC4134k) {
        super(context, viewGroup, view, interfaceC4134k);
        this.f67900oc = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @lvui
    public static Snackbar bo(@lvui Context context, @lvui View view, @lvui CharSequence charSequence, int i2) {
        return gyi(context, view, charSequence, i2);
    }

    @lvui
    public static Snackbar c8jq(@lvui View view, @lvui CharSequence charSequence, int i2) {
        return gyi(null, view, charSequence, i2);
    }

    private Button ch() {
        return nmn5().getActionView();
    }

    @lvui
    private static Snackbar gyi(@dd Context context, @lvui View view, @lvui CharSequence charSequence, int i2) {
        ViewGroup viewGroupM14943x = m14943x(view);
        if (viewGroupM14943x == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupM14943x.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(m14942u(context) ? C6095k.ld6.f35598d : C6095k.ld6.f79312jp0y, viewGroupM14943x, false);
        Snackbar snackbar = new Snackbar(context, viewGroupM14943x, snackbarContentLayout, snackbarContentLayout);
        snackbar.tfm(charSequence);
        snackbar.hb(i2);
        return snackbar;
    }

    private TextView lv5() {
        return nmn5().getMessageView();
    }

    private SnackbarContentLayout nmn5() {
        return (SnackbarContentLayout) this.f67894zy.getChildAt(0);
    }

    @Deprecated
    protected static boolean t8iq(@lvui Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f67897lvui);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    /* JADX INFO: renamed from: u */
    private static boolean m14942u(@lvui Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f25108r);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    @dd
    /* JADX INFO: renamed from: x */
    private static ViewGroup m14943x(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    @lvui
    public static Snackbar y2(@lvui View view, @nn86 int i2, int i3) {
        return c8jq(view, view.getResources().getText(i2), i3);
    }

    @lvui
    /* JADX INFO: renamed from: d */
    public Snackbar m14944d(@x2 int i2) {
        return mu(ColorStateList.valueOf(i2));
    }

    @lvui
    public Snackbar d8wk(ColorStateList colorStateList) {
        lv5().setTextColor(colorStateList);
        return this;
    }

    @lvui
    public Snackbar dr(@nn86 int i2, View.OnClickListener onClickListener) {
        return xwq3(o1t().getText(i2), onClickListener);
    }

    @lvui
    public Snackbar fnq8(@cdj int i2) {
        nmn5().setMaxInlineActionWidth(i2);
        return this;
    }

    @lvui
    public Snackbar g1(int i2) {
        lv5().setMaxLines(i2);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* JADX INFO: renamed from: i */
    public void mo14924i() {
        super.mo14924i();
    }

    @lvui
    public Snackbar ikck(ColorStateList colorStateList) {
        ch().setTextColor(colorStateList);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean lvui() {
        return super.lvui();
    }

    @lvui
    public Snackbar mu(@dd ColorStateList colorStateList) {
        this.f67894zy.setBackgroundTintList(colorStateList);
        return this;
    }

    @lvui
    @Deprecated
    public Snackbar qkj8(@dd toq toqVar) {
        BaseTransientBottomBar.t8r<Snackbar> t8rVar = this.f67898d2ok;
        if (t8rVar != null) {
            m14921c(t8rVar);
        }
        if (toqVar != null) {
            m14923h(toqVar);
        }
        this.f67898d2ok = toqVar;
        return this;
    }

    @lvui
    public Snackbar qo(@nn86 int i2) {
        return tfm(o1t().getText(i2));
    }

    @lvui
    public Snackbar tfm(@lvui CharSequence charSequence) {
        lv5().setText(charSequence);
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: v */
    public Snackbar m14945v(@x2 int i2) {
        ch().setTextColor(i2);
        return this;
    }

    @lvui
    public Snackbar vq(@dd PorterDuff.Mode mode) {
        this.f67894zy.setBackgroundTintMode(mode);
        return this;
    }

    @lvui
    public Snackbar wo(@x2 int i2) {
        lv5().setTextColor(i2);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int wvg() {
        int iWvg = super.wvg();
        if (iWvg == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f67900oc.getRecommendedTimeoutMillis(iWvg, (this.f67899eqxt ? 4 : 0) | 1 | 2);
        }
        if (this.f67899eqxt && this.f67900oc.isTouchExplorationEnabled()) {
            return -2;
        }
        return iWvg;
    }

    @lvui
    public Snackbar xwq3(@dd CharSequence charSequence, @dd View.OnClickListener onClickListener) {
        Button buttonCh = ch();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            buttonCh.setVisibility(8);
            buttonCh.setOnClickListener(null);
            this.f67899eqxt = false;
        } else {
            this.f67899eqxt = true;
            buttonCh.setVisibility(0);
            buttonCh.setText(charSequence);
            buttonCh.setOnClickListener(new ViewOnClickListenerC4133k(onClickListener));
        }
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void yz() {
        super.yz();
    }
}

package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.core.view.eqxt;
import androidx.core.view.tfm;
import com.google.android.material.animation.C3910k;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C4058z;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.zy;
import h4b.C6070k;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import zy.InterfaceC7843t;
import zy.a9;
import zy.dd;
import zy.gvn7;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    static final int f67871a9 = 0;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f67873fn3e = 1;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    static final int f67874fti = 1;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f67875fu4 = 0;

    /* JADX INFO: renamed from: i */
    public static final int f25059i = 0;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final float f67879mcp = 0.8f;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f67880ni7 = -1;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    static final int f67881o1t = 180;

    /* JADX INFO: renamed from: t */
    private static final int f25060t = 75;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f67882wvg = 150;

    /* JADX INFO: renamed from: z */
    static final int f25061z = 250;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f67883zurt = -2;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private Behavior f67884cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd
    private cdj f67885f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f25062g;

    /* JADX INFO: renamed from: h */
    private List<t8r<B>> f25063h;

    /* JADX INFO: renamed from: k */
    @lvui
    private final ViewGroup f25064k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @dd
    private final AccessibilityManager f67886ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f67887kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f67888ld6;

    /* JADX INFO: renamed from: n */
    private int f25065n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f67889n7h;

    /* JADX INFO: renamed from: p */
    private int f25066p;

    /* JADX INFO: renamed from: q */
    @lvui
    private final InterfaceC4134k f25067q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f67890qrj;

    /* JADX INFO: renamed from: s */
    @hyr(29)
    private final Runnable f25068s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @lvui
    zy.toq f67891t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Context f67892toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f67893x2;

    /* JADX INFO: renamed from: y */
    private boolean f25069y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @lvui
    protected final SnackbarBaseLayout f67894zy;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final boolean f67878jp0y = false;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int[] f67876gvn7 = {C6095k.zy.vtz9};

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final String f67872d3 = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    @lvui
    static final Handler f67877jk = new Handler(Looper.getMainLooper(), new C4132y());

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: i */
        @lvui
        private final C4125i f25070i = new C4125i(this);

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public void m14931c(@lvui BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f25070i.zy(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean jp0y(View view) {
            return this.f25070i.m14938k(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        public boolean x2(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, @lvui MotionEvent motionEvent) {
            this.f25070i.toq(coordinatorLayout, view, motionEvent);
            return super.x2(coordinatorLayout, view, motionEvent);
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected static class SnackbarBaseLayout extends FrameLayout {

        /* JADX INFO: renamed from: t */
        private static final View.OnTouchListener f25071t = new ViewOnTouchListenerC4122k();

        /* JADX INFO: renamed from: g */
        private final float f25072g;

        /* JADX INFO: renamed from: h */
        private PorterDuff.Mode f25073h;

        /* JADX INFO: renamed from: i */
        @dd
        private Rect f25074i;

        /* JADX INFO: renamed from: k */
        @dd
        private BaseTransientBottomBar<?> f25075k;

        /* JADX INFO: renamed from: n */
        private final float f25076n;

        /* JADX INFO: renamed from: p */
        private ColorStateList f25077p;

        /* JADX INFO: renamed from: q */
        private int f25078q;

        /* JADX INFO: renamed from: s */
        private final int f25079s;

        /* JADX INFO: renamed from: y */
        private final int f25080y;

        /* JADX INFO: renamed from: z */
        private boolean f25081z;

        /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$k */
        class ViewOnTouchListenerC4122k implements View.OnTouchListener {
            ViewOnTouchListenerC4122k() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected SnackbarBaseLayout(@lvui Context context) {
            this(context, null);
        }

        /* JADX INFO: renamed from: n */
        private void m14934n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f25074i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        @lvui
        /* JADX INFO: renamed from: q */
        private Drawable m14935q() {
            float dimension = getResources().getDimension(C6095k.g.n9);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(com.google.android.material.color.kja0.kja0(this, C6095k.zy.f80274sc, C6095k.zy.f80280tjz5, getBackgroundOverlayColorAlpha()));
            if (this.f25077p == null) {
                return androidx.core.graphics.drawable.zy.ki(gradientDrawable);
            }
            Drawable drawableKi = androidx.core.graphics.drawable.zy.ki(gradientDrawable);
            androidx.core.graphics.drawable.zy.kja0(drawableKi, this.f25077p);
            return drawableKi;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f25075k = baseTransientBottomBar;
        }

        float getActionTextColorAlpha() {
            return this.f25072g;
        }

        int getAnimationMode() {
            return this.f25078q;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f25076n;
        }

        int getMaxInlineActionWidth() {
            return this.f25079s;
        }

        int getMaxWidth() {
            return this.f25080y;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f25075k;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.x9kr();
            }
            C0683f.m28243do(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f25075k;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.ncyb();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
            super.onLayout(z2, i2, i3, i4, i5);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f25075k;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m14926l();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (this.f25080y > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = this.f25080y;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
                }
            }
        }

        void setAnimationMode(int i2) {
            this.f25078q = i2;
        }

        @Override // android.view.View
        public void setBackground(@dd Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@dd Drawable drawable) {
            if (drawable != null && this.f25077p != null) {
                drawable = androidx.core.graphics.drawable.zy.ki(drawable.mutate());
                androidx.core.graphics.drawable.zy.kja0(drawable, this.f25077p);
                androidx.core.graphics.drawable.zy.m2442h(drawable, this.f25073h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@dd ColorStateList colorStateList) {
            this.f25077p = colorStateList;
            if (getBackground() != null) {
                Drawable drawableKi = androidx.core.graphics.drawable.zy.ki(getBackground().mutate());
                androidx.core.graphics.drawable.zy.kja0(drawableKi, colorStateList);
                androidx.core.graphics.drawable.zy.m2442h(drawableKi, this.f25073h);
                if (drawableKi != getBackground()) {
                    super.setBackgroundDrawable(drawableKi);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@dd PorterDuff.Mode mode) {
            this.f25073h = mode;
            if (getBackground() != null) {
                Drawable drawableKi = androidx.core.graphics.drawable.zy.ki(getBackground().mutate());
                androidx.core.graphics.drawable.zy.m2442h(drawableKi, mode);
                if (drawableKi != getBackground()) {
                    super.setBackgroundDrawable(drawableKi);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f25081z || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            m14934n((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f25075k;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.zp();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@dd View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f25071t);
            super.setOnClickListener(onClickListener);
        }

        void zy(ViewGroup viewGroup) {
            this.f25081z = true;
            viewGroup.addView(this);
            this.f25081z = false;
        }

        protected SnackbarBaseLayout(@lvui Context context, AttributeSet attributeSet) {
            super(C6070k.zy(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C6095k.kja0.hohe);
            if (typedArrayObtainStyledAttributes.hasValue(C6095k.kja0.ivg)) {
                C0683f.a5id(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(r1, 0));
            }
            this.f25078q = typedArrayObtainStyledAttributes.getInt(C6095k.kja0.or1, 0);
            this.f25076n = typedArrayObtainStyledAttributes.getFloat(C6095k.kja0.s7, 1.0f);
            setBackgroundTintList(com.google.android.material.resources.zy.m14753k(context2, typedArrayObtainStyledAttributes, C6095k.kja0.p4g));
            setBackgroundTintMode(C4058z.x2(typedArrayObtainStyledAttributes.getInt(C6095k.kja0.a0w, -1), PorterDuff.Mode.SRC_IN));
            this.f25072g = typedArrayObtainStyledAttributes.getFloat(C6095k.kja0.yzs4, 1.0f);
            this.f25080y = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.loce, -1);
            this.f25079s = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.k5dw, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f25071t);
            setFocusable(true);
            if (getBackground() == null) {
                C0683f.wlev(this, m14935q());
            }
        }
    }

    static class cdj implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: k */
        @lvui
        private final WeakReference<BaseTransientBottomBar> f25082k;

        /* JADX INFO: renamed from: q */
        @lvui
        private final WeakReference<View> f25083q;

        private cdj(@lvui BaseTransientBottomBar baseTransientBottomBar, @lvui View view) {
            this.f25082k = new WeakReference<>(baseTransientBottomBar);
            this.f25083q = new WeakReference<>(view);
        }

        /* JADX INFO: renamed from: k */
        static cdj m14936k(@lvui BaseTransientBottomBar baseTransientBottomBar, @lvui View view) {
            cdj cdjVar = new cdj(baseTransientBottomBar, view);
            if (C0683f.zsr0(view)) {
                C4058z.m14623k(view, cdjVar);
            }
            view.addOnAttachStateChangeListener(cdjVar);
            return cdjVar;
        }

        /* JADX INFO: renamed from: q */
        private boolean m14937q() {
            if (this.f25082k.get() != null) {
                return false;
            }
            zy();
            return true;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (m14937q() || !this.f25082k.get().f25069y) {
                return;
            }
            this.f25082k.get().m14912f();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (m14937q()) {
                return;
            }
            C4058z.m14623k(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (m14937q()) {
                return;
            }
            C4058z.qrj(view, this);
        }

        @dd
        View toq() {
            return this.f25083q.get();
        }

        void zy() {
            if (this.f25083q.get() != null) {
                this.f25083q.get().removeOnAttachStateChangeListener(this);
                C4058z.qrj(this.f25083q.get(), this);
            }
            this.f25083q.clear();
            this.f25082k.clear();
        }
    }

    class f7l8 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        private int f25084k = 0;

        f7l8() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f67878jp0y) {
                C0683f.zkd(BaseTransientBottomBar.this.f67894zy, iIntValue - this.f25084k);
            } else {
                BaseTransientBottomBar.this.f67894zy.setTranslationY(iIntValue);
            }
            this.f25084k = iIntValue;
        }
    }

    @Deprecated
    public interface fn3e extends InterfaceC4134k {
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    class C4123g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f25086k;

        C4123g(int i2) {
            this.f25086k = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.n5r1(this.f25086k);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f25067q.toq(0, BaseTransientBottomBar.f67881o1t);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    class C4124h extends AnimatorListenerAdapter {
        C4124h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.hyr();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public static class C4125i {

        /* JADX INFO: renamed from: k */
        private zy.toq f25089k;

        public C4125i(@lvui SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.m14109l(0.1f);
            swipeDismissBehavior.dd(0.6f);
            swipeDismissBehavior.n5r1(0);
        }

        /* JADX INFO: renamed from: k */
        public boolean m14938k(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public void toq(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, @lvui MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.jp0y(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.zy.zy().ld6(this.f25089k);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.zy.zy().x2(this.f25089k);
            }
        }

        public void zy(@lvui BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f25089k = baseTransientBottomBar.f67891t8r;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    class C4126k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f25090k;

        C4126k(int i2) {
            this.f25090k = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.n5r1(this.f25090k);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface ki {
    }

    class kja0 implements Runnable {
        kja0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f67894zy;
            if (snackbarBaseLayout == null) {
                return;
            }
            if (snackbarBaseLayout.getParent() != null) {
                BaseTransientBottomBar.this.f67894zy.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f67894zy.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.bf2();
            } else {
                BaseTransientBottomBar.this.a98o();
            }
        }
    }

    class ld6 extends C0701k {
        ld6() {
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, @lvui androidx.core.view.accessibility.ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.m3052k(1048576);
            kiVar.se(true);
        }

        @Override // androidx.core.view.C0701k
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            if (i2 != 1048576) {
                return super.performAccessibilityAction(view, i2, bundle);
            }
            BaseTransientBottomBar.this.mo14924i();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    class C4127n implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        private int f25094k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f25096q;

        C4127n(int i2) {
            this.f25096q = i2;
            this.f25094k = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f67878jp0y) {
                C0683f.zkd(BaseTransientBottomBar.this.f67894zy, iIntValue - this.f25094k);
            } else {
                BaseTransientBottomBar.this.f67894zy.setTranslationY(iIntValue);
            }
            this.f25094k = iIntValue;
        }
    }

    class n7h implements SwipeDismissBehavior.zy {
        n7h() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.zy
        /* JADX INFO: renamed from: k */
        public void mo14111k(@lvui View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.fn3e(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.zy
        public void toq(int i2) {
            if (i2 == 0) {
                com.google.android.material.snackbar.zy.zy().x2(BaseTransientBottomBar.this.f67891t8r);
            } else if (i2 == 1 || i2 == 2) {
                com.google.android.material.snackbar.zy.zy().ld6(BaseTransientBottomBar.this.f67891t8r);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    class C4128p implements eqxt {
        C4128p() {
        }

        @Override // androidx.core.view.eqxt
        @lvui
        /* JADX INFO: renamed from: k */
        public tfm mo151k(View view, @lvui tfm tfmVar) {
            BaseTransientBottomBar.this.f25066p = tfmVar.kja0();
            BaseTransientBottomBar.this.f67888ld6 = tfmVar.m3467h();
            BaseTransientBottomBar.this.f67893x2 = tfmVar.cdj();
            BaseTransientBottomBar.this.zp();
            return tfmVar;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    class C4129q extends AnimatorListenerAdapter {
        C4129q() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.hyr();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f25067q.mo14949k(70, BaseTransientBottomBar.f67881o1t);
        }
    }

    class qrj implements Runnable {
        qrj() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.n5r1(3);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    class RunnableC4130s implements Runnable {
        RunnableC4130s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int iJk;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f67894zy == null || baseTransientBottomBar.f67892toq == null || (iJk = (BaseTransientBottomBar.this.jk() - BaseTransientBottomBar.this.gvn7()) + ((int) BaseTransientBottomBar.this.f67894zy.getTranslationY())) >= BaseTransientBottomBar.this.f67890qrj) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f67894zy.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f67872d3, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f67890qrj - iJk;
            BaseTransientBottomBar.this.f67894zy.requestLayout();
        }
    }

    public static abstract class t8r<B> {

        /* JADX INFO: renamed from: k */
        public static final int f25102k = 0;

        /* JADX INFO: renamed from: n */
        public static final int f25103n = 4;

        /* JADX INFO: renamed from: q */
        public static final int f25104q = 3;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f67895toq = 1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f67896zy = 2;

        /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t8r$k */
        @Retention(RetentionPolicy.SOURCE)
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
        public @interface InterfaceC4131k {
        }

        /* JADX INFO: renamed from: k */
        public void mo14939k(B b2, int i2) {
        }

        public void toq(B b2) {
        }
    }

    class toq implements ValueAnimator.AnimatorUpdateListener {
        toq() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f67894zy.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class x2 implements zy.toq {
        x2() {
        }

        @Override // com.google.android.material.snackbar.zy.toq
        /* JADX INFO: renamed from: g */
        public void mo14940g() {
            Handler handler = BaseTransientBottomBar.f67877jk;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.zy.toq
        /* JADX INFO: renamed from: k */
        public void mo14941k(int i2) {
            Handler handler = BaseTransientBottomBar.f67877jk;
            handler.sendMessage(handler.obtainMessage(1, i2, 0, BaseTransientBottomBar.this));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$y */
    class C4132y implements Handler.Callback {
        C4132y() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@lvui Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                ((BaseTransientBottomBar) message.obj).y9n();
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).oc(message.arg1);
            return true;
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    @a9(from = kotlinx.coroutines.scheduling.ki.f37369n)
    public @interface zurt {
    }

    class zy implements ValueAnimator.AnimatorUpdateListener {
        zy() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f67894zy.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f67894zy.setScaleY(fFloatValue);
        }
    }

    protected BaseTransientBottomBar(@lvui ViewGroup viewGroup, @lvui View view, @lvui InterfaceC4134k interfaceC4134k) {
        this(viewGroup.getContext(), viewGroup, view, interfaceC4134k);
    }

    /* JADX INFO: renamed from: a */
    private void m14910a(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, fti());
        valueAnimator.setInterpolator(C3910k.f67312toq);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C4123g(i2));
        valueAnimator.addUpdateListener(new f7l8());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a98o() {
        int iFti = fti();
        if (f67878jp0y) {
            C0683f.zkd(this.f67894zy, iFti);
        } else {
            this.f67894zy.setTranslationY(iFti);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iFti, 0);
        valueAnimator.setInterpolator(C3910k.f67312toq);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C4129q());
        valueAnimator.addUpdateListener(new C4127n(iFti));
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: b */
    private void m14911b() {
        if (m14927m()) {
            cdj();
            return;
        }
        if (this.f67894zy.getParent() != null) {
            this.f67894zy.setVisibility(0);
        }
        hyr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bf2() {
        ValueAnimator valueAnimatorZurt = zurt(0.0f, 1.0f);
        ValueAnimator valueAnimatorMcp = mcp(f67879mcp, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorZurt, valueAnimatorMcp);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new C4124h());
        animatorSet.start();
    }

    private boolean dd() {
        ViewGroup.LayoutParams layoutParams = this.f67894zy.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f7l8) && (((CoordinatorLayout.f7l8) layoutParams).m1740g() instanceof SwipeDismissBehavior);
    }

    private boolean ek5k() {
        return this.f67890qrj > 0 && !this.f25062g && dd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m14912f() {
        this.f67889n7h = t8r();
        zp();
    }

    private int fti() {
        int height = this.f67894zy.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f67894zy.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int gvn7() {
        int[] iArr = new int[2];
        this.f67894zy.getLocationOnScreen(iArr);
        return iArr[1] + this.f67894zy.getHeight();
    }

    private void i1(int i2) {
        ValueAnimator valueAnimatorZurt = zurt(1.0f, 0.0f);
        valueAnimatorZurt.setDuration(75L);
        valueAnimatorZurt.addListener(new C4126k(i2));
        valueAnimatorZurt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hyr(17)
    public int jk() {
        WindowManager windowManager = (WindowManager) this.f67892toq.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private void ki(int i2) {
        if (this.f67894zy.getAnimationMode() == 1) {
            i1(i2);
        } else {
            m14910a(i2);
        }
    }

    private ValueAnimator mcp(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(C3910k.f23773q);
        valueAnimatorOfFloat.addUpdateListener(new zy());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: o */
    private void m14916o(CoordinatorLayout.f7l8 f7l8Var) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorM14929t = this.f67884cdj;
        if (swipeDismissBehaviorM14929t == null) {
            swipeDismissBehaviorM14929t = m14929t();
        }
        if (swipeDismissBehaviorM14929t instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorM14929t).m14931c(this);
        }
        swipeDismissBehaviorM14929t.x9kr(new n7h());
        f7l8Var.cdj(swipeDismissBehaviorM14929t);
        if (ni7() == null) {
            f7l8Var.f50020f7l8 = 80;
        }
    }

    private int t8r() {
        if (ni7() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        ni7().getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.f25064k.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f25064k.getHeight()) - i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp() {
        ViewGroup.LayoutParams layoutParams = this.f67894zy.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.f67894zy.f25074i == null) {
            Log.w(f67872d3, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f67894zy.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = this.f67894zy.f25074i.bottom + (ni7() != null ? this.f67889n7h : this.f25066p);
        marginLayoutParams.leftMargin = this.f67894zy.f25074i.left + this.f67888ld6;
        marginLayoutParams.rightMargin = this.f67894zy.f25074i.right + this.f67893x2;
        marginLayoutParams.topMargin = this.f67894zy.f25074i.top;
        this.f67894zy.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || !ek5k()) {
            return;
        }
        this.f67894zy.removeCallbacks(this.f25068s);
        this.f67894zy.post(this.f25068s);
    }

    private ValueAnimator zurt(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(C3910k.f23771k);
        valueAnimatorOfFloat.addUpdateListener(new toq());
        return valueAnimatorOfFloat;
    }

    @gvn7
    protected int a9() {
        return d3() ? C6095k.ld6.f79310ikck : C6095k.ld6.f79298fti;
    }

    @lvui
    /* JADX INFO: renamed from: c */
    public B m14921c(@dd t8r<B> t8rVar) {
        List<t8r<B>> list;
        if (t8rVar == null || (list = this.f25063h) == null) {
            return this;
        }
        list.remove(t8rVar);
        return this;
    }

    void cdj() {
        this.f67894zy.post(new kja0());
    }

    public boolean d2ok() {
        return this.f25062g;
    }

    protected boolean d3() {
        TypedArray typedArrayObtainStyledAttributes = this.f67892toq.obtainStyledAttributes(f67876gvn7);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    @lvui
    /* JADX INFO: renamed from: e */
    public B m14922e(int i2) {
        this.f67894zy.setAnimationMode(i2);
        return this;
    }

    public boolean eqxt() {
        return this.f25069y;
    }

    protected void fn3e(int i2) {
        com.google.android.material.snackbar.zy.zy().toq(this.f67891t8r, i2);
    }

    public int fu4() {
        return this.f67894zy.getAnimationMode();
    }

    @lvui
    /* JADX INFO: renamed from: h */
    public B m14923h(@dd t8r<B> t8rVar) {
        if (t8rVar == null) {
            return this;
        }
        if (this.f25063h == null) {
            this.f25063h = new ArrayList();
        }
        this.f25063h.add(t8rVar);
        return this;
    }

    @lvui
    public B hb(int i2) {
        this.f25065n = i2;
        return this;
    }

    void hyr() {
        com.google.android.material.snackbar.zy.zy().m14955p(this.f67891t8r);
        List<t8r<B>> list = this.f25063h;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f25063h.get(size).toq(this);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo14924i() {
        fn3e(3);
    }

    @lvui
    /* JADX INFO: renamed from: j */
    public B m14925j(boolean z2) {
        this.f25062g = z2;
        return this;
    }

    @lvui
    public View jp0y() {
        return this.f67894zy;
    }

    /* JADX INFO: renamed from: l */
    void m14926l() {
        if (this.f67887kja0) {
            m14911b();
            this.f67887kja0 = false;
        }
    }

    @lvui
    public B lrht(@InterfaceC7843t int i2) {
        View viewFindViewById = this.f25064k.findViewById(i2);
        if (viewFindViewById != null) {
            return (B) uv6(viewFindViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i2);
    }

    public boolean lvui() {
        return com.google.android.material.snackbar.zy.zy().m14954n(this.f67891t8r);
    }

    /* JADX INFO: renamed from: m */
    boolean m14927m() {
        AccessibilityManager accessibilityManager = this.f67886ki;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    void n5r1(int i2) {
        com.google.android.material.snackbar.zy.zy().m14957s(this.f67891t8r);
        List<t8r<B>> list = this.f25063h;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f25063h.get(size).mo14939k(this, i2);
            }
        }
        ViewParent parent = this.f67894zy.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f67894zy);
        }
    }

    void ncyb() {
        if (m14928r()) {
            f67877jk.post(new qrj());
        }
    }

    @dd
    public View ni7() {
        cdj cdjVar = this.f67885f7l8;
        if (cdjVar == null) {
            return null;
        }
        return cdjVar.toq();
    }

    @lvui
    public B nn86(Behavior behavior) {
        this.f67884cdj = behavior;
        return this;
    }

    @lvui
    public Context o1t() {
        return this.f67892toq;
    }

    final void oc(int i2) {
        if (m14927m() && this.f67894zy.getVisibility() == 0) {
            ki(i2);
        } else {
            n5r1(i2);
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m14928r() {
        return com.google.android.material.snackbar.zy.zy().m14953g(this.f67891t8r);
    }

    @lvui
    /* JADX INFO: renamed from: t */
    protected SwipeDismissBehavior<? extends View> m14929t() {
        return new Behavior();
    }

    @lvui
    public B uv6(@dd View view) {
        cdj cdjVar = this.f67885f7l8;
        if (cdjVar != null) {
            cdjVar.zy();
        }
        this.f67885f7l8 = view == null ? null : cdj.m14936k(this, view);
        return this;
    }

    public void vyq(boolean z2) {
        this.f25069y = z2;
    }

    public int wvg() {
        return this.f25065n;
    }

    void x9kr() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f67894zy.getRootWindowInsets()) == null) {
            return;
        }
        this.f67890qrj = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        zp();
    }

    final void y9n() {
        if (this.f67894zy.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f67894zy.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f7l8) {
                m14916o((CoordinatorLayout.f7l8) layoutParams);
            }
            this.f67894zy.zy(this.f25064k);
            m14912f();
            this.f67894zy.setVisibility(4);
        }
        if (C0683f.v0af(this.f67894zy)) {
            m14911b();
        } else {
            this.f67887kja0 = true;
        }
    }

    public void yz() {
        com.google.android.material.snackbar.zy.zy().n7h(wvg(), this.f67891t8r);
    }

    /* JADX INFO: renamed from: z */
    public Behavior m14930z() {
        return this.f67884cdj;
    }

    protected BaseTransientBottomBar(@lvui Context context, @lvui ViewGroup viewGroup, @lvui View view, @lvui InterfaceC4134k interfaceC4134k) {
        this.f25069y = false;
        this.f25068s = new RunnableC4130s();
        this.f67891t8r = new x2();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (interfaceC4134k == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f25064k = viewGroup;
        this.f25067q = interfaceC4134k;
        this.f67892toq = context;
        com.google.android.material.internal.cdj.m14532k(context);
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(a9(), viewGroup, false);
        this.f67894zy = snackbarBaseLayout;
        snackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.zy(snackbarBaseLayout.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
        }
        snackbarBaseLayout.addView(view);
        C0683f.pjz9(snackbarBaseLayout, 1);
        C0683f.o05(snackbarBaseLayout, 1);
        C0683f.lw(snackbarBaseLayout, true);
        C0683f.kx3(snackbarBaseLayout, new C4128p());
        C0683f.zwy(snackbarBaseLayout, new ld6());
        this.f67886ki = (AccessibilityManager) context.getSystemService("accessibility");
    }
}

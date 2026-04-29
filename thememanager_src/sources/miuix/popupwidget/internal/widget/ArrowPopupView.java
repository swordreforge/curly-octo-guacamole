package miuix.popupwidget.internal.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import c25.toq;
import miuix.internal.util.C7162g;
import miuix.internal.util.n7h;
import miuix.popupwidget.widget.C7264k;
import miuix.view.C7380g;

/* JADX INFO: loaded from: classes3.dex */
public class ArrowPopupView extends FrameLayout implements View.OnTouchListener {
    public static final byte aj = 0;
    public static final byte ar = 10;
    public static final byte bc = 16;
    public static final byte bd = 18;
    private static final String be = "ArrowPopupView";
    public static final byte bs = 8;
    public static final byte bu = 17;
    private static final int dy = 4;
    public static final byte k0 = 9;
    private static final int sk1t = 1;
    public static final int tgs = 0;
    public static final byte tlhn = 32;
    private static final int vb6 = 8;
    public static final byte w97r = 64;
    public static final int yl25 = 1;
    public static final int zmmu = 2;

    /* JADX INFO: renamed from: a */
    private Drawable f40979a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private Rect f88009ab;
    private int ac;
    private Animation.AnimationListener ad;
    private Animation.AnimationListener am;
    private boolean an;
    private int as;
    private boolean ax;
    private int ay;
    private int az;

    /* JADX INFO: renamed from: b */
    private Drawable f40980b;
    private int ba;
    private RectF bb;
    private int bg;
    private int bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private Drawable f88010bo;
    private AnimatorSet bp;
    private int bq;
    private AnimationSet bv;

    /* JADX INFO: renamed from: c */
    private Drawable f40981c;

    /* JADX INFO: renamed from: d */
    private C7264k f40982d;

    /* JADX INFO: renamed from: e */
    private Drawable f40983e;

    /* JADX INFO: renamed from: f */
    private Drawable f40984f;

    /* JADX INFO: renamed from: g */
    private LinearLayout f40985g;

    /* JADX INFO: renamed from: h */
    private AppCompatButton f40986h;

    /* JADX INFO: renamed from: i */
    private ViewOnClickListenerC7257s f40987i;
    private boolean id;
    private int in;

    /* JADX INFO: renamed from: j */
    private Drawable f40988j;

    /* JADX INFO: renamed from: k */
    private View f40989k;

    /* JADX INFO: renamed from: l */
    private Drawable f40990l;

    /* JADX INFO: renamed from: m */
    private Drawable f40991m;

    /* JADX INFO: renamed from: n */
    private FrameLayout f40992n;

    /* JADX INFO: renamed from: o */
    private Drawable f40993o;

    /* JADX INFO: renamed from: p */
    private AppCompatButton f40994p;

    /* JADX INFO: renamed from: q */
    private AppCompatImageView f40995q;

    /* JADX INFO: renamed from: r */
    private int f40996r;

    /* JADX INFO: renamed from: s */
    private AppCompatTextView f40997s;

    /* JADX INFO: renamed from: t */
    private int f40998t;

    /* JADX INFO: renamed from: u */
    private Drawable f40999u;

    /* JADX INFO: renamed from: v */
    private Drawable f41000v;

    /* JADX INFO: renamed from: w */
    private View.OnTouchListener f41001w;

    /* JADX INFO: renamed from: x */
    private Drawable f41002x;

    /* JADX INFO: renamed from: y */
    private LinearLayout f41003y;

    /* JADX INFO: renamed from: z */
    private ViewOnClickListenerC7257s f41004z;

    class f7l8 extends AnimatorListenerAdapter {
        f7l8() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrowPopupView.this.f40982d.dismiss();
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.internal.widget.ArrowPopupView$g */
    class ViewTreeObserverOnPreDrawListenerC7253g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC7253g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ArrowPopupView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ArrowPopupView.this.bp != null) {
                ArrowPopupView.this.bp.cancel();
            }
            if (ArrowPopupView.this.bv != null) {
                ArrowPopupView.this.bv.cancel();
            }
            ArrowPopupView.this.bv = new AnimationSet(true);
            float[] fArr = new float[2];
            ArrowPopupView.this.wvg(fArr);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.6f, 1.0f, 0.6f, 1.0f, 0, fArr[0], 0, fArr[1]);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            if (C7162g.m25943k()) {
                alphaAnimation.setDuration(100L);
                scaleAnimation.setDuration(280L);
            } else {
                ArrowPopupView.this.bv.setDuration(0L);
            }
            ArrowPopupView.this.bv.addAnimation(scaleAnimation);
            ArrowPopupView.this.bv.addAnimation(alphaAnimation);
            ArrowPopupView.this.bv.setAnimationListener(ArrowPopupView.this.ad);
            ArrowPopupView.this.bv.setInterpolator(new DecelerateInterpolator(1.5f));
            ArrowPopupView arrowPopupView = ArrowPopupView.this;
            arrowPopupView.startAnimation(arrowPopupView.bv);
            return true;
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.internal.widget.ArrowPopupView$k */
    class AnimationAnimationListenerC7254k implements Animation.AnimationListener {
        AnimationAnimationListenerC7254k() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ArrowPopupView.this.bv = null;
            if (ArrowPopupView.this.ax) {
                ArrowPopupView.this.t8r();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.internal.widget.ArrowPopupView$n */
    class RunnableC7255n implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f41008k;

        RunnableC7255n(View view) {
            this.f41008k = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f41008k.requestLayout();
            this.f41008k.invalidate();
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.internal.widget.ArrowPopupView$q */
    class C7256q extends ViewOutlineProvider {
        C7256q() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view.getWidth() == 0 || view.getHeight() == 0) {
                return;
            }
            Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
            rect.bottom -= view.getPaddingBottom();
            rect.top += view.getPaddingTop();
            rect.right -= view.getPaddingRight();
            rect.left += view.getPaddingLeft();
            outline.setRoundRect(rect, ArrowPopupView.this.getContext().getResources().getDimensionPixelOffset(toq.C1385g.f54413jz5));
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.internal.widget.ArrowPopupView$s */
    class ViewOnClickListenerC7257s implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        public View.OnClickListener f41011k;

        ViewOnClickListenerC7257s() {
        }

        /* JADX INFO: renamed from: k */
        public void m26398k(View.OnClickListener onClickListener) {
            this.f41011k = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            View.OnClickListener onClickListener = this.f41011k;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            ArrowPopupView.this.f40982d.m26416k(true);
        }
    }

    class toq implements Animation.AnimationListener {
        toq() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            ArrowPopupView.this.an = false;
            ArrowPopupView.this.bv = null;
            ArrowPopupView.this.f40982d.dismiss();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.internal.widget.ArrowPopupView$y */
    class C7258y implements ValueAnimator.AnimatorUpdateListener {
        C7258y() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ArrowPopupView.this.bq = ((Float) valueAnimator.getAnimatedValue()).intValue();
            int iAbs = Math.abs(ArrowPopupView.this.bq);
            ArrowPopupView arrowPopupView = ArrowPopupView.this;
            arrowPopupView.invalidate(arrowPopupView.f40985g.getLeft() - iAbs, ArrowPopupView.this.f40985g.getTop() - iAbs, ArrowPopupView.this.f40985g.getRight() + iAbs, ArrowPopupView.this.f40985g.getBottom() + iAbs);
        }
    }

    class zy extends ViewOutlineProvider {
        zy() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view.getWidth() == 0 || view.getHeight() == 0) {
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            boolean z2 = false;
            Rect rect = new Rect(0, 0, width, height);
            if (width > height) {
                int i2 = (width - height) / 2;
                rect.left += i2;
                rect.right -= i2;
            } else {
                int i3 = (height - width) / 2;
                rect.top += i3;
                rect.bottom -= i3;
            }
            Path path = new Path();
            int i4 = ArrowPopupView.this.ay;
            if (i4 != 32 && i4 != 64) {
                switch (i4) {
                    case 8:
                        int i5 = rect.right;
                        path.moveTo(rect.left, rect.bottom);
                        path.quadTo((i5 + r2) / 2.0f, -rect.height(), rect.right, rect.bottom);
                        path.close();
                        break;
                    case 9:
                    case 10:
                        if ((ArrowPopupView.this.in != 1 && ArrowPopupView.this.ay == 9) || (ArrowPopupView.this.in == 1 && ArrowPopupView.this.ay == 10)) {
                            z2 = true;
                        }
                        path.moveTo(0.0f, ArrowPopupView.this.f40988j.getIntrinsicHeight());
                        if (z2) {
                            path.quadTo(0.0f, (-ArrowPopupView.this.f40988j.getIntrinsicHeight()) * 0.7f, rect.right, ArrowPopupView.this.f40988j.getIntrinsicHeight());
                        } else {
                            path.quadTo(rect.right, (-ArrowPopupView.this.f40988j.getIntrinsicHeight()) * 0.7f, rect.right, ArrowPopupView.this.f40988j.getIntrinsicHeight());
                        }
                        path.close();
                        break;
                }
            } else {
                if ((ArrowPopupView.this.in != 1 && ArrowPopupView.this.ay == 32) || (ArrowPopupView.this.in == 1 && ArrowPopupView.this.ay == 64)) {
                    z2 = true;
                }
                int i6 = rect.bottom;
                int i7 = rect.top;
                float f2 = (i6 + i7) / 2.0f;
                if (z2) {
                    path.moveTo(rect.right, i7);
                    path.quadTo(-rect.width(), f2, rect.right, rect.bottom);
                } else {
                    path.moveTo(rect.left, i7);
                    path.quadTo(rect.right + rect.width(), f2, rect.left, rect.bottom);
                }
                path.close();
            }
            if (path.isConvex()) {
                outline.setConvexPath(path);
            } else {
                Log.d(ArrowPopupView.be, "outline path is not convex");
                outline.setOval(rect);
            }
        }
    }

    public ArrowPopupView(Context context) {
        this(context, null);
    }

    private boolean a9() {
        return jk(32);
    }

    private void cdj(View view, ViewOutlineProvider viewOutlineProvider) {
        view.setOutlineProvider(viewOutlineProvider);
        view.setElevation(this.ac);
    }

    private boolean d3() {
        return gvn7() || mcp();
    }

    private boolean fti() {
        return jk(64);
    }

    private void fu4(int i2) {
        int paddingTop;
        int width = this.f40989k.getWidth();
        int height = this.f40989k.getHeight();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(this.f40985g.getMeasuredWidth(), this.f40985g.getMinimumWidth());
        int iMax2 = Math.max(this.f40985g.getMeasuredHeight(), this.f40985g.getMinimumHeight());
        int arrowWidth = getArrowWidth();
        int arrowHeight = getArrowHeight();
        int[] iArr = new int[2];
        this.f40989k.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        getLocationOnScreen(iArr);
        int i5 = iArr[0];
        int i6 = ((width / 2) + i3) - i5;
        this.as = i6;
        int i7 = width2 - i6;
        this.az = (i3 + ((width - arrowWidth) / 2)) - i5;
        this.bg = getTop() + this.f40996r;
        if (mcp()) {
            this.bg += ((i4 - iArr[1]) - iMax2) + (this.f40985g.getPaddingBottom() - arrowHeight);
            paddingTop = (((i4 - iArr[1]) - arrowHeight) + this.f40996r) - 1;
        } else if (gvn7()) {
            int paddingTop2 = this.bg + (((i4 + height) - iArr[1]) - this.f40985g.getPaddingTop()) + arrowHeight;
            this.bg = paddingTop2;
            paddingTop = paddingTop2 + (this.f40985g.getPaddingTop() - arrowHeight) + 1;
        } else {
            paddingTop = 0;
        }
        int i8 = iMax / 2;
        int i9 = iMax - i8;
        int i10 = this.as;
        if (i10 >= i8 && i7 >= i9) {
            this.as = i10 - i8;
        } else if (i7 < i9) {
            this.as = width2 - iMax;
        } else if (i10 < i8) {
            this.as = 0;
        }
        int i11 = this.as + i2;
        this.as = i11;
        int i12 = this.az + i2;
        this.az = i12;
        if (i12 < 0) {
            this.az = 0;
        } else if (i12 + arrowWidth > width2) {
            this.az = i12 - ((i12 + arrowWidth) - width2);
        }
        this.f40985g.layout(Math.max(i11, 0), Math.max(this.bg, 0), Math.min(this.as + iMax, width2), Math.min(this.bg + iMax2, height2));
        o1t(arrowWidth, arrowHeight, paddingTop);
    }

    private int getArrowHeight() {
        int i2 = this.ay;
        if (i2 == 9 || i2 == 10) {
            return this.f40988j.getIntrinsicHeight();
        }
        if (i2 == 17 || i2 == 18) {
            return this.f40991m.getIntrinsicHeight();
        }
        int measuredHeight = this.f40995q.getMeasuredHeight();
        return measuredHeight == 0 ? this.f40995q.getDrawable().getIntrinsicHeight() : measuredHeight;
    }

    private int getArrowWidth() {
        int measuredWidth = this.f40995q.getMeasuredWidth();
        return measuredWidth == 0 ? this.f40995q.getDrawable().getIntrinsicWidth() : measuredWidth;
    }

    private boolean gvn7() {
        return jk(8);
    }

    private boolean jk(int i2) {
        return (this.ay & i2) == i2;
    }

    private void ki() {
        int[] iArr = new int[2];
        this.f40989k.getLocationInWindow(iArr);
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = this.f40985g.getMeasuredWidth();
        int measuredHeight = this.f40985g.getMeasuredHeight();
        int height2 = this.f40989k.getHeight();
        int width2 = this.f40989k.getWidth();
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        int i2 = 16;
        sparseIntArray.put(16, iArr[1] - measuredHeight);
        sparseIntArray.put(8, ((height - iArr[1]) - height2) - measuredHeight);
        int i3 = 0;
        sparseIntArray.put(64, iArr[0] - measuredWidth);
        sparseIntArray.put(32, ((width - iArr[0]) - width2) - measuredWidth);
        int i4 = Integer.MIN_VALUE;
        while (true) {
            if (i3 >= sparseIntArray.size()) {
                break;
            }
            int iKeyAt = sparseIntArray.keyAt(i3);
            if (sparseIntArray.get(iKeyAt) >= this.bl) {
                i2 = iKeyAt;
                break;
            }
            if (sparseIntArray.get(iKeyAt) > i4) {
                i4 = sparseIntArray.get(iKeyAt);
                i2 = iKeyAt;
            }
            i3++;
        }
        setArrowMode(i2);
    }

    private boolean mcp() {
        return jk(16);
    }

    private void ni7() {
        int i2 = this.in;
        boolean z2 = true;
        if (i2 != 1 && (i2 != 2 || !n7h.x2(this))) {
            z2 = false;
        }
        int i3 = this.f40998t;
        if (z2) {
            i3 = -i3;
        }
        if (d3()) {
            fu4(i3);
        } else {
            zurt(i3);
        }
        View contentView = getContentView();
        if (contentView != null) {
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            if (contentView.getMeasuredHeight() > this.f40985g.getHeight() - this.f41003y.getHeight()) {
                layoutParams.height = this.f40985g.getHeight() - this.f41003y.getHeight();
                contentView.setLayoutParams(layoutParams);
            } else if (contentView.getMeasuredWidth() > this.f40985g.getWidth()) {
                layoutParams.width = this.f40985g.getWidth();
                contentView.setLayoutParams(layoutParams);
            }
            if (layoutParams.height <= 0 || layoutParams.width <= 0) {
                Log.w(be, "Invalid LayoutPrams of content view, please check the anchor view");
            }
        }
    }

    private void o1t(int i2, int i3, int i4) {
        int i5;
        int right;
        int bottom;
        int measuredHeight;
        int i6 = this.in;
        boolean z2 = false;
        boolean z3 = i6 == 1 || (i6 == 2 && n7h.x2(this));
        int i7 = this.ay;
        if (i7 == 9 || i7 == 10) {
            if ((!z3 && i7 == 9) || (z3 && i7 == 10)) {
                z2 = true;
            }
            int left = z2 ? (this.f40985g.getLeft() + this.f40985g.getPaddingStart()) - 1 : ((this.f40985g.getRight() - this.f40985g.getPaddingStart()) - i2) + 1;
            i4 = (i4 + this.f40985g.getPaddingTop()) - i3;
            AppCompatImageView appCompatImageView = this.f40995q;
            appCompatImageView.layout(left, i4, left + i2, appCompatImageView.getMeasuredHeight() + i4);
            i5 = left;
        } else if (i7 == 17 || i7 == 18) {
            if ((!z3 && i7 == 18) || (z3 && i7 == 17)) {
                z2 = true;
            }
            if (z2) {
                right = this.f40985g.getLeft() + this.f40985g.getPaddingStart();
                bottom = this.f40985g.getBottom() - this.f40985g.getPaddingBottom();
                measuredHeight = this.f40995q.getMeasuredHeight();
            } else {
                right = (this.f40985g.getRight() - this.f40985g.getPaddingEnd()) - i2;
                bottom = this.f40985g.getBottom() - this.f40985g.getPaddingBottom();
                measuredHeight = this.f40995q.getMeasuredHeight();
            }
            int i8 = bottom - (measuredHeight - i3);
            i5 = right;
            if (this.ay == 18) {
                AppCompatImageView appCompatImageView2 = this.f40995q;
                appCompatImageView2.layout(i5, i8, i5 + i2, appCompatImageView2.getMeasuredHeight() + i8);
            }
            i4 = i8 - 5;
        } else {
            i5 = this.az;
        }
        AppCompatImageView appCompatImageView3 = this.f40995q;
        appCompatImageView3.layout(i5, i4, i2 + i5, appCompatImageView3.getDrawable().getIntrinsicHeight() + i4);
    }

    private void oc(int i2) {
        int i3 = this.in;
        boolean z2 = true;
        if (i3 != 1 && (i3 != 2 || !n7h.x2(this))) {
            z2 = false;
        }
        if (i2 == 32) {
            this.f40995q.setImageDrawable(z2 ? this.f40980b : this.f40979a);
        }
        if (i2 == 64) {
            this.f40995q.setImageDrawable(z2 ? this.f40979a : this.f40980b);
            return;
        }
        switch (i2) {
            case 8:
                this.f40995q.setImageDrawable(this.f41003y.getVisibility() == 0 ? this.f40993o : this.f40988j);
                break;
            case 9:
                this.f40995q.setImageDrawable(z2 ? this.f40999u : this.f41002x);
                break;
            case 10:
                this.f40995q.setImageDrawable(z2 ? this.f41002x : this.f40999u);
                break;
            default:
                switch (i2) {
                    case 16:
                        this.f40995q.setImageDrawable(this.f40991m);
                        break;
                    case 17:
                        this.f40995q.setImageDrawable(z2 ? this.f88010bo : this.f41000v);
                        break;
                    case 18:
                        this.f40995q.setImageDrawable(z2 ? this.f41000v : this.f88010bo);
                        break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t8r() {
        if (C7162g.m25943k()) {
            AnimationSet animationSet = this.bv;
            if (animationSet != null) {
                animationSet.cancel();
            }
            AnimatorSet animatorSet = this.bp;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.bp = animatorSet2;
            animatorSet2.addListener(new f7l8());
            float f2 = getContext().getResources().getDisplayMetrics().density * 4.0f;
            Property property = View.TRANSLATION_Y;
            int i2 = this.in;
            boolean z2 = i2 == 1 || (i2 == 2 && n7h.x2(this));
            int i3 = this.ay;
            if (i3 == 16) {
                f2 = -f2;
            } else if (i3 == 32) {
                if (z2) {
                    f2 = -f2;
                }
                property = View.TRANSLATION_X;
            } else if (i3 == 64) {
                if (!z2) {
                    f2 = -f2;
                }
                property = View.TRANSLATION_X;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f40985g, (Property<LinearLayout, Float>) property, 0.0f, f2, 0.0f);
            objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat.setDuration(1200L);
            if (this.id) {
                objectAnimatorOfFloat.setRepeatCount(8);
            } else {
                objectAnimatorOfFloat.setRepeatCount(-1);
            }
            objectAnimatorOfFloat.addUpdateListener(new C7258y());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f40995q, (Property<AppCompatImageView, Float>) property, 0.0f, f2, 0.0f);
            objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfFloat2.setDuration(1200L);
            if (this.id) {
                objectAnimatorOfFloat2.setRepeatCount(8);
            } else {
                objectAnimatorOfFloat2.setRepeatCount(-1);
            }
            this.bp.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            this.bp.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0035. Please report as an issue. */
    public void wvg(float[] fArr) {
        float f2;
        float f3;
        float f4;
        float f5;
        int top = this.f40995q.getTop();
        int bottom = this.f40995q.getBottom();
        int left = this.f40995q.getLeft();
        int right = this.f40995q.getRight();
        int i2 = this.in;
        boolean z2 = i2 == 1 || (i2 == 2 && n7h.x2(this));
        int i3 = this.ay;
        if (i3 == 32) {
            f2 = z2 ? right : left;
            bottom = (bottom + top) / 2;
        } else {
            if (i3 != 64) {
                switch (i3) {
                    case 8:
                        f2 = (right + left) / 2;
                        f3 = top;
                        break;
                    case 9:
                        f4 = z2 ? right : left;
                        f2 = f4;
                        f3 = top;
                        break;
                    case 10:
                        f4 = z2 ? left : right;
                        f2 = f4;
                        f3 = top;
                        break;
                    default:
                        switch (i3) {
                            case 16:
                                f2 = (right + left) / 2;
                                break;
                            case 17:
                                f5 = z2 ? left : right;
                                f2 = f5;
                                break;
                            case 18:
                                f5 = z2 ? right : left;
                                f2 = f5;
                                break;
                            default:
                                f2 = (right + left) / 2;
                                bottom = (bottom + top) / 2;
                                break;
                        }
                        break;
                }
                fArr[0] = f2;
                fArr[1] = f3;
            }
            f2 = z2 ? left : right;
            bottom = (bottom + top) / 2;
        }
        f3 = bottom;
        fArr[0] = f2;
        fArr[1] = f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void zurt(int r18) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.popupwidget.internal.widget.ArrowPopupView.zurt(int):void");
    }

    public void fn3e() {
        invalidate();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC7253g());
    }

    public int getArrowMode() {
        return this.ay;
    }

    public int getContentFrameWrapperBottomPadding() {
        return this.f40985g.getPaddingBottom();
    }

    public int getContentFrameWrapperTopPadding() {
        return this.f40985g.getPaddingTop();
    }

    public View getContentView() {
        if (this.f40992n.getChildCount() > 0) {
            return this.f40992n.getChildAt(0);
        }
        return null;
    }

    public AppCompatButton getNegativeButton() {
        return this.f40986h;
    }

    public AppCompatButton getPositiveButton() {
        return this.f40994p;
    }

    @Deprecated
    public float getRollingPercent() {
        return 1.0f;
    }

    public int getTitleHeight() {
        if (this.f41003y.getVisibility() != 8) {
            return this.f41003y.getMeasuredHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public void m26394h() {
        cdj(this.f40995q, new zy());
        cdj(this.f40985g, new C7256q());
    }

    /* JADX INFO: renamed from: i */
    public void m26395i() {
        if (this.an) {
            return;
        }
        AnimatorSet animatorSet = this.bp;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimationSet animationSet = this.bv;
        if (animationSet != null) {
            animationSet.cancel();
        }
        this.bv = new AnimationSet(true);
        float[] fArr = new float[2];
        wvg(fArr);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.6f, 1.0f, 0.6f, 0, fArr[0], 0, fArr[1]);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        if (C7162g.m25943k()) {
            scaleAnimation.setDuration(150L);
            alphaAnimation.setDuration(150L);
        } else {
            this.bv.setDuration(0L);
        }
        this.bv.addAnimation(scaleAnimation);
        this.bv.addAnimation(alphaAnimation);
        this.bv.setAnimationListener(this.am);
        this.bv.setInterpolator(new AccelerateInterpolator(2.0f));
        startAnimation(this.bv);
    }

    public boolean jp0y() {
        return TextUtils.isEmpty(this.f40997s.getText());
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View contentView = getContentView();
        if (contentView != null) {
            contentView.post(new RunnableC7255n(contentView));
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int right;
        int right2;
        float f2;
        int measuredWidth;
        int i2;
        if (this.f40990l != null) {
            return;
        }
        int width = this.as + (this.f40985g.getWidth() / 2);
        int height = this.bg + (this.f40985g.getHeight() / 2);
        int i3 = this.ay;
        if (i3 != 8) {
            if (i3 == 16) {
                f2 = 180.0f;
                measuredWidth = this.az + (this.f40995q.getMeasuredWidth() / 2);
                right = this.f40985g.getRight() - measuredWidth;
                i2 = this.as;
            } else if (i3 == 32) {
                f2 = -90.0f;
                measuredWidth = this.ba + (this.f40995q.getMeasuredHeight() / 2);
                right = this.f40985g.getBottom() - measuredWidth;
                i2 = this.bg;
            } else if (i3 != 64) {
                f2 = 0.0f;
                right = 0;
                right2 = 0;
            } else {
                f2 = 90.0f;
                int measuredHeight = this.ba + (this.f40995q.getMeasuredHeight() / 2);
                right = measuredHeight - this.bg;
                right2 = this.f40985g.getBottom() - measuredHeight;
            }
            right2 = measuredWidth - i2;
        } else {
            int measuredWidth2 = this.az + (this.f40995q.getMeasuredWidth() / 2);
            right = measuredWidth2 - this.as;
            right2 = this.f40985g.getRight() - measuredWidth2;
            f2 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.rotate(f2, width, height);
        int i4 = this.ay;
        if (i4 == 8 || i4 == 16) {
            canvas.translate(this.as, this.bg);
            this.f40984f.setBounds(0, 0, right, this.f40985g.getHeight());
            canvas.translate(0.0f, gvn7() ? this.bq : -this.bq);
            this.f40984f.draw(canvas);
            canvas.translate(right, 0.0f);
            this.f40981c.setBounds(0, 0, right2, this.f40985g.getHeight());
            this.f40981c.draw(canvas);
        } else if (i4 == 32 || i4 == 64) {
            canvas.translate(width - (this.f40985g.getHeight() / 2), height - (this.f40985g.getWidth() / 2));
            this.f40984f.setBounds(0, 0, right, this.f40985g.getWidth());
            canvas.translate(0.0f, a9() ? this.bq : -this.bq);
            this.f40984f.draw(canvas);
            canvas.translate(right, 0.0f);
            this.f40981c.setBounds(0, 0, right2, this.f40985g.getWidth());
            this.f40981c.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f40995q = (AppCompatImageView) findViewById(toq.C1390s.f55247ktq);
        this.f40992n = (FrameLayout) findViewById(R.id.content);
        LinearLayout linearLayout = (LinearLayout) findViewById(toq.C1390s.f55186a98o);
        this.f40985g = linearLayout;
        linearLayout.setBackground(this.f40990l);
        this.f40985g.setMinimumHeight(getContext().getResources().getDimensionPixelOffset(toq.C1385g.f54469se));
        if (this.f40984f != null && this.f40981c != null) {
            Rect rect = new Rect();
            this.f40984f.getPadding(rect);
            LinearLayout linearLayout2 = this.f40985g;
            int i2 = rect.top;
            linearLayout2.setPadding(i2, i2, i2, i2);
        }
        LinearLayout linearLayout3 = (LinearLayout) findViewById(toq.C1390s.f55326z4t);
        this.f41003y = linearLayout3;
        linearLayout3.setBackground(this.f40983e);
        this.f40997s = (AppCompatTextView) findViewById(R.id.title);
        this.f40994p = (AppCompatButton) findViewById(16908314);
        this.f40986h = (AppCompatButton) findViewById(16908313);
        this.f40987i = new ViewOnClickListenerC7257s();
        this.f41004z = new ViewOnClickListenerC7257s();
        this.f40994p.setOnClickListener(this.f40987i);
        this.f40986h.setOnClickListener(this.f41004z);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (!this.f40989k.isAttachedToWindow()) {
            if (this.f40982d.isShowing()) {
                this.f40982d.dismiss();
            }
        } else {
            if (this.ay == 0) {
                ki();
            }
            oc(this.ay);
            ni7();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        Rect rect = this.f88009ab;
        this.f40985g.getHitRect(rect);
        if (motionEvent.getAction() != 0 || rect.contains(x3, y3)) {
            View.OnTouchListener onTouchListener = this.f41001w;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
        this.f40982d.m26416k(true);
        return true;
    }

    public void setAnchor(View view) {
        this.f40989k = view;
    }

    public void setArrowMode(int i2) {
        this.ay = i2;
        oc(i2);
    }

    public void setArrowPopupWindow(C7264k c7264k) {
        this.f40982d = c7264k;
    }

    public void setAutoDismiss(boolean z2) {
        this.id = z2;
    }

    public void setContentView(View view) {
        setContentView(view, new ViewGroup.LayoutParams(-2, -2));
    }

    public void setLayoutRtlMode(int i2) {
        if (i2 > 2 || i2 < 0) {
            this.in = 2;
        } else {
            this.in = i2;
        }
    }

    public void setNegativeButton(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.f40986h.setText(charSequence);
        this.f40986h.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.f41004z.m26398k(onClickListener);
    }

    public void setOffset(int i2, int i3) {
        this.f40998t = i2;
        this.f40996r = i3;
    }

    public void setPositiveButton(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.f40994p.setText(charSequence);
        this.f40994p.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.f40987i.m26398k(onClickListener);
    }

    @Deprecated
    public void setRollingPercent(float f2) {
    }

    public void setTitle(CharSequence charSequence) {
        this.f41003y.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.f40997s.setText(charSequence);
    }

    public void setTouchInterceptor(View.OnTouchListener onTouchListener) {
        this.f41001w = onTouchListener;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: t */
    public int[] m26396t(int i2) {
        int[] iArr = new int[2];
        if (i2 == 32) {
            iArr[0] = this.f40979a.getIntrinsicHeight();
            iArr[1] = this.f40979a.getIntrinsicWidth();
        } else if (i2 != 64) {
            switch (i2) {
                case 8:
                    iArr[0] = this.f40988j.getIntrinsicHeight();
                    iArr[1] = this.f40988j.getIntrinsicWidth();
                    break;
                case 9:
                    iArr[0] = this.f41002x.getIntrinsicHeight();
                    iArr[1] = this.f41002x.getIntrinsicWidth();
                    break;
                case 10:
                    iArr[0] = this.f40999u.getIntrinsicHeight();
                    iArr[1] = this.f40999u.getIntrinsicWidth();
                    break;
                default:
                    switch (i2) {
                        case 16:
                            iArr[0] = this.f40991m.getIntrinsicHeight();
                            iArr[1] = this.f40991m.getIntrinsicWidth();
                            break;
                        case 17:
                            iArr[0] = this.f41000v.getIntrinsicHeight();
                            iArr[1] = this.f41000v.getIntrinsicWidth();
                            break;
                        case 18:
                            iArr[0] = this.f88010bo.getIntrinsicHeight();
                            iArr[1] = this.f88010bo.getIntrinsicWidth();
                            break;
                    }
                    break;
            }
        } else {
            iArr[0] = this.f40980b.getIntrinsicHeight();
            iArr[1] = this.f40980b.getIntrinsicWidth();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: z */
    public void m26397z(boolean z2) {
        this.ax = z2;
    }

    public ArrowPopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, toq.zy.f55536vyq);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.f40992n.removeAllViews();
        if (view != null) {
            this.f40992n.addView(view, layoutParams);
        }
    }

    public ArrowPopupView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f88009ab = new Rect();
        this.bb = new RectF();
        this.id = true;
        this.in = 2;
        this.ax = false;
        this.ad = new AnimationAnimationListenerC7254k();
        this.am = new toq();
        this.ay = 0;
        C7380g.toq(this, false);
        this.id = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.kja0.wu, i2, toq.n7h.jp);
        this.f40990l = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.qppo);
        this.f40984f = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.d6od);
        this.f40981c = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.lg4k);
        this.f40983e = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.x3b);
        this.f40988j = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.zt);
        this.f40993o = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.b6);
        this.f40991m = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.a3dw);
        this.f40980b = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.jb9);
        this.f40979a = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.xouc);
        this.f41002x = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.ln);
        this.f40999u = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.qexj);
        this.f41000v = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.f26p);
        this.f88010bo = typedArrayObtainStyledAttributes.getDrawable(toq.kja0.ydj3);
        this.ac = typedArrayObtainStyledAttributes.getDimensionPixelOffset(toq.kja0.y3, getResources().getDimensionPixelSize(toq.C1385g.f54420ktq));
        typedArrayObtainStyledAttributes.recycle();
        this.bl = context.getResources().getDimensionPixelOffset(toq.C1385g.f54352bek6);
    }

    public void setContentView(int i2) {
        setContentView(LayoutInflater.from(getContext()).inflate(i2, (ViewGroup) null));
    }
}

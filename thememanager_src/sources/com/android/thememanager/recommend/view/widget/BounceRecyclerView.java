package com.android.thememanager.recommend.view.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.fn3e;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class BounceRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: b */
    private static final int f14462b = 2;

    /* JADX INFO: renamed from: c */
    private static final int f14463c = 10;

    /* JADX INFO: renamed from: e */
    private static final int f14464e = 5;

    /* JADX INFO: renamed from: f */
    private static final int f14465f = 1;

    /* JADX INFO: renamed from: j */
    private static final int f14466j = 6;

    /* JADX INFO: renamed from: l */
    private static final int f14467l = 0;

    /* JADX INFO: renamed from: m */
    private static final int f14468m = 8;

    /* JADX INFO: renamed from: o */
    private static final int f14469o = 7;

    /* JADX INFO: renamed from: g */
    private float f14470g;

    /* JADX INFO: renamed from: h */
    private int f14471h;

    /* JADX INFO: renamed from: i */
    private int f14472i;

    /* JADX INFO: renamed from: k */
    private boolean f14473k;

    /* JADX INFO: renamed from: n */
    private int f14474n;

    /* JADX INFO: renamed from: p */
    private int f14475p;

    /* JADX INFO: renamed from: q */
    private float f14476q;

    /* JADX INFO: renamed from: r */
    private Interpolator f14477r;

    /* JADX INFO: renamed from: s */
    private int f14478s;

    /* JADX INFO: renamed from: t */
    private ValueAnimator f14479t;

    /* JADX INFO: renamed from: y */
    private float f14480y;

    /* JADX INFO: renamed from: z */
    private int f14481z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.widget.BounceRecyclerView$k */
    class C2453k implements ValueAnimator.AnimatorUpdateListener {
        C2453k() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            float fFloatValue = ((Float) animation.getAnimatedValue()).floatValue();
            if (BounceRecyclerView.this.f14478s == 5) {
                BounceRecyclerView bounceRecyclerView = BounceRecyclerView.this;
                bounceRecyclerView.setPadding(bounceRecyclerView.f14472i, BounceRecyclerView.this.getPaddingTop(), (int) fFloatValue, BounceRecyclerView.this.getPaddingBottom());
            } else if (BounceRecyclerView.this.f14478s == 6) {
                BounceRecyclerView bounceRecyclerView2 = BounceRecyclerView.this;
                bounceRecyclerView2.setPadding((int) fFloatValue, bounceRecyclerView2.getPaddingTop(), BounceRecyclerView.this.f14481z, BounceRecyclerView.this.getPaddingBottom());
            }
        }
    }

    public BounceRecyclerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: n */
    private void m8816n(float paddingStart, float transtion) {
        ValueAnimator valueAnimator = this.f14479t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(transtion + paddingStart, paddingStart);
        this.f14479t = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(this.f14477r);
        this.f14479t.addUpdateListener(new C2453k());
        this.f14479t.setDuration(500L);
        this.f14479t.start();
    }

    public int getOritation() {
        return this.f14474n;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0188  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.recommend.view.widget.BounceRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOritation(int oritation) {
        if (oritation != 0 && oritation != 1) {
            oritation = 0;
        }
        this.f14474n = oritation;
    }

    public BounceRecyclerView(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BounceRecyclerView(Context context, @dd AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f14473k = true;
        this.f14475p = getPaddingTop();
        this.f14471h = getPaddingBottom();
        this.f14472i = getPaddingLeft();
        this.f14481z = getPaddingRight();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.g8, defStyle, 0);
        this.f14474n = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f14477r = new PathInterpolator(0.2f, 0.2f, 0.6f, 1.0f);
    }
}

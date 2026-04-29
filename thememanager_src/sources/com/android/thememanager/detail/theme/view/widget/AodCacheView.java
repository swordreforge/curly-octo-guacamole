package com.android.thememanager.detail.theme.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.thememanager.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class AodCacheView extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public static final int f11196g = 1;

    /* JADX INFO: renamed from: n */
    public static final int f11197n = 0;

    /* JADX INFO: renamed from: k */
    private ImageView f11198k;

    /* JADX INFO: renamed from: q */
    private toq f11199q;

    private static class toq extends View {

        /* JADX INFO: renamed from: g */
        private static final int f11200g = 3;

        /* JADX INFO: renamed from: h */
        private static final int f11201h = 4;

        /* JADX INFO: renamed from: i */
        private static Map<Integer, Integer> f11202i = null;

        /* JADX INFO: renamed from: n */
        private static final int f11203n = 200;

        /* JADX INFO: renamed from: y */
        private static final int f11206y = 14;

        /* JADX INFO: renamed from: k */
        private Paint f11207k;

        /* JADX INFO: renamed from: q */
        private int f11208q;

        /* JADX INFO: renamed from: s */
        private static final float[] f11205s = {4.5f, 3.5f, 3.5f};

        /* JADX INFO: renamed from: p */
        private static final int[] f11204p = {Color.parseColor("#99FFFFFF"), Color.parseColor("#4CFFFFFF"), Color.parseColor("#19FFFFFF")};

        /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.AodCacheView$toq$k */
        class AnimationAnimationListenerC1979k implements Animation.AnimationListener {
            AnimationAnimationListenerC1979k() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                toq toqVar = toq.this;
                toqVar.f11208q = toq.toq(toqVar) % 4;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.AodCacheView$toq$toq, reason: collision with other inner class name */
        private class C7917toq extends Animation {
            private C7917toq() {
            }

            @Override // android.view.animation.Animation
            protected void applyTransformation(float interpolatedTime, Transformation t2) {
                super.applyTransformation(interpolatedTime, t2);
                toq.this.invalidate();
            }
        }

        static {
            HashMap map = new HashMap();
            f11202i = map;
            map.put(0, 0);
            f11202i.put(1, 1);
            f11202i.put(2, 2);
            f11202i.put(3, 1);
        }

        public toq(Context context) {
            super(context);
            this.f11207k = new Paint();
            this.f11208q = 0;
        }

        /* JADX INFO: renamed from: q */
        private void m7754q() {
            C7917toq c7917toq = new C7917toq();
            c7917toq.setDuration(200L);
            c7917toq.setRepeatCount(-1);
            c7917toq.setInterpolator(new LinearInterpolator());
            c7917toq.setAnimationListener(new AnimationAnimationListenerC1979k());
            startAnimation(c7917toq);
        }

        static /* synthetic */ int toq(toq toqVar) {
            int i2 = toqVar.f11208q + 1;
            toqVar.f11208q = i2;
            return i2;
        }

        private void zy(Canvas canvas) {
            int iIntValue = f11202i.get(Integer.valueOf(this.f11208q)).intValue();
            for (int i2 = 0; i2 < 3; i2++) {
                int iAbs = Math.abs(i2 - iIntValue);
                this.f11207k.setColor(f11204p[iAbs]);
                canvas.drawCircle((i2 * 14) + 4.5f, 4.5f, f11205s[iAbs], this.f11207k);
            }
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            m7754q();
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            clearAnimation();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            zy(canvas);
        }

        @Override // android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            setMeasuredDimension(36, 9);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface zy {
    }

    public AodCacheView(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m7752k() {
        setBackgroundResource(R.drawable.de_aod_cache_view_ring);
        ImageView imageView = new ImageView(getContext());
        this.f11198k = imageView;
        imageView.setImageResource(R.drawable.de_aod_cache_view_triangle);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.de_aod_cache_view_triangle_width), getResources().getDimensionPixelSize(R.dimen.de_aod_cache_view_triangle_height), 17);
        layoutParams.setMarginStart(getResources().getDimensionPixelSize(R.dimen.de_aod_cache_view_ring_thickness));
        addView(this.f11198k, layoutParams);
        this.f11199q = new toq(getContext());
        addView(this.f11199q, new FrameLayout.LayoutParams(-2, -2, 17));
        setState(0);
    }

    public void setState(int state) {
        this.f11198k.setVisibility(state == 0 ? 0 : 8);
        this.f11199q.setVisibility(state != 1 ? 8 : 0);
    }

    public AodCacheView(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AodCacheView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m7752k();
    }
}

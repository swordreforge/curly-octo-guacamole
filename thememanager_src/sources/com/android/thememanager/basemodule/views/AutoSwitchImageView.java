package com.android.thememanager.basemodule.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.android.thememanager.basemodule.utils.y9n;

/* JADX INFO: loaded from: classes.dex */
public class AutoSwitchImageView extends ImageView {

    /* JADX INFO: renamed from: g */
    private BitmapDrawable f10484g;

    /* JADX INFO: renamed from: h */
    private ValueAnimator f10485h;

    /* JADX INFO: renamed from: i */
    private ValueAnimator f10486i;

    /* JADX INFO: renamed from: k */
    private final int f10487k;

    /* JADX INFO: renamed from: n */
    private BitmapDrawable f10488n;

    /* JADX INFO: renamed from: p */
    private ValueAnimator f10489p;

    /* JADX INFO: renamed from: q */
    private final int f10490q;

    /* JADX INFO: renamed from: s */
    private Drawable[] f10491s;

    /* JADX INFO: renamed from: t */
    private boolean f10492t;

    /* JADX INFO: renamed from: y */
    private LayerDrawable f10493y;

    /* JADX INFO: renamed from: z */
    private boolean f10494z;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.AutoSwitchImageView$k */
    class C1840k implements ValueAnimator.AnimatorUpdateListener {
        C1840k() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            float fFloatValue = ((Float) animation.getAnimatedValue()).floatValue();
            if (AutoSwitchImageView.this.f10488n != null) {
                AutoSwitchImageView.this.f10488n.setAlpha((int) (fFloatValue * 255.0f));
            }
            if (AutoSwitchImageView.this.f10484g != null) {
                AutoSwitchImageView.this.f10484g.setAlpha((int) ((1.0f - fFloatValue) * 255.0f));
            }
            AutoSwitchImageView.this.invalidate();
        }
    }

    class toq implements ValueAnimator.AnimatorUpdateListener {
        toq() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            float fFloatValue = ((Float) animation.getAnimatedValue()).floatValue();
            if (AutoSwitchImageView.this.f10488n != null) {
                AutoSwitchImageView.this.f10488n.setAlpha((int) (fFloatValue * 255.0f));
            }
            AutoSwitchImageView.this.invalidate();
        }
    }

    public AutoSwitchImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f10487k = 300;
        this.f10490q = 255;
        this.f10494z = false;
        this.f10492t = true;
        C1840k c1840k = new C1840k();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10485h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.f10485h.addUpdateListener(c1840k);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f10489p = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.setDuration(300L);
        this.f10489p.addUpdateListener(c1840k);
        toq toqVar = new toq();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10486i = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(300L);
        this.f10486i.addUpdateListener(toqVar);
    }

    /* JADX INFO: renamed from: n */
    public boolean m7288n(boolean switchTop) {
        if (!this.f10494z || zy() || this.f10492t == switchTop) {
            return false;
        }
        this.f10492t = switchTop;
        if (switchTop) {
            this.f10485h.start();
            return true;
        }
        this.f10489p.start();
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    /* JADX INFO: renamed from: q */
    public void m7289q(Bitmap topBitmap, Bitmap bottomBitmap) {
        int alpha;
        int alpha2;
        if (this.f10494z) {
            alpha = this.f10488n.getAlpha();
            alpha2 = this.f10484g.getAlpha();
        } else {
            alpha = 0;
            alpha2 = 0;
        }
        int i2 = y9n.fn3e().x;
        int i3 = y9n.fn3e().y;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), topBitmap);
        this.f10488n = bitmapDrawable;
        bitmapDrawable.setAlpha(alpha);
        this.f10488n.setBounds(0, 0, i2, i3);
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(getResources(), bottomBitmap);
        this.f10484g = bitmapDrawable2;
        bitmapDrawable2.setAlpha(alpha2);
        this.f10484g.setBounds(0, 0, i2, i3);
        this.f10491s = new Drawable[]{this.f10488n, this.f10484g};
        LayerDrawable layerDrawable = new LayerDrawable(this.f10491s);
        this.f10493y = layerDrawable;
        setImageDrawable(layerDrawable);
        if (!this.f10494z) {
            this.f10486i.start();
        }
        this.f10494z = true;
    }

    public boolean zy() {
        return this.f10485h.isRunning() || this.f10489p.isRunning() || this.f10486i.isRunning();
    }
}

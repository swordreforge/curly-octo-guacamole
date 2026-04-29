package com.android.thememanager.detail.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RewardGuide extends FrameLayout {

    /* JADX INFO: renamed from: i */
    private static final int f11587i = 400;

    /* JADX INFO: renamed from: t */
    private static final int f11588t = 20;

    /* JADX INFO: renamed from: z */
    private static final int f11589z = 1000;

    /* JADX INFO: renamed from: g */
    private Paint f11590g;

    /* JADX INFO: renamed from: h */
    private int f11591h;

    /* JADX INFO: renamed from: k */
    private View f11592k;

    /* JADX INFO: renamed from: n */
    private TextView f11593n;

    /* JADX INFO: renamed from: p */
    private int f11594p;

    /* JADX INFO: renamed from: q */
    private View f11595q;

    /* JADX INFO: renamed from: s */
    private int[] f11596s;

    /* JADX INFO: renamed from: y */
    private PorterDuffXfermode f11597y;

    /* JADX INFO: renamed from: com.android.thememanager.detail.widget.RewardGuide$k */
    class ViewOnClickListenerC2033k implements View.OnClickListener {
        ViewOnClickListenerC2033k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ((ViewGroup) RewardGuide.this.getParent()).removeView(RewardGuide.this);
        }
    }

    class toq implements ViewTreeObserver.OnGlobalLayoutListener {
        toq() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RewardGuide.this.f11593n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) RewardGuide.this.f11593n.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.topMargin = RewardGuide.this.f11596s[1] + RewardGuide.this.getResources().getDimensionPixelOffset(R.dimen.de_detail_reward_guide_margin_bottom);
            RewardGuide.this.f11593n.setLayoutParams(layoutParams);
        }
    }

    public RewardGuide(@lvui Context context, View rewardView) {
        this(context, null, rewardView);
    }

    /* JADX INFO: renamed from: g */
    private void m7890g(View rewardView) {
        rewardView.getLocationOnScreen(this.f11596s);
        this.f11593n.getViewTreeObserver().addOnGlobalLayoutListener(new toq());
        int iJk = C1819o.jk(getContext());
        int i2 = this.f11596s[0] + (this.f11591h / 2);
        int i3 = iJk / 5;
        int i4 = R.drawable.de_reward_start_indicator;
        if (i2 < i3) {
            this.f11593n.setBackgroundResource(R.drawable.de_reward_start_indicator);
        } else {
            int i5 = (iJk * 2) / 5;
            if (i2 >= i5 || i2 < i3) {
                int i6 = (iJk * 3) / 5;
                i4 = (i2 >= i6 || i2 < i5) ? (i2 >= (iJk * 4) / 5 || i2 < i6) ? R.drawable.de_reward_end_indicator : R.drawable.de_reward_end_middle : R.drawable.de_reward_middle_indicator;
            } else {
                i4 = R.drawable.de_reward_start_middle;
            }
        }
        this.f11593n.setBackgroundResource(i4);
    }

    /* JADX INFO: renamed from: n */
    private void m7892n(View rewardView) {
        this.f11595q = rewardView;
        this.f11591h = rewardView.getWidth();
        Paint paint = new Paint();
        this.f11590g = paint;
        paint.setColor(-1);
        this.f11590g.setStyle(Paint.Style.FILL);
        this.f11590g.setAntiAlias(true);
        this.f11594p = getResources().getDimensionPixelOffset(R.dimen.de_detail_reward_guide_padding);
        this.f11597y = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        setWillNotDraw(false);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.de_reward_alert_layout, (ViewGroup) this, true);
        this.f11592k = viewInflate;
        this.f11593n = (TextView) viewInflate.findViewById(R.id.tv);
        setOnClickListener(new ViewOnClickListenerC2033k());
        m7890g(rewardView);
        zy();
    }

    /* JADX INFO: renamed from: q */
    private void m7893q(Canvas canvas) {
        int[] iArr = this.f11596s;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = this.f11594p;
        canvas.drawRoundRect(new RectF(i2 - i4, i3 - i4, i2 + this.f11595q.getWidth() + this.f11594p, i3 + this.f11595q.getHeight() + this.f11594p), 50.0f, 50.0f, this.f11590g);
    }

    private void zy() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f11593n, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f11593n, "translationY", 0.0f, -20.0f, 20.0f, -20.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(1000L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat2);
        animatorSet.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.saveLayer(null, null, 31);
        canvas.drawColor(Color.argb(100, 0, 0, 0));
        m7893q(canvas);
        this.f11590g.setXfermode(this.f11597y);
        m7893q(canvas);
    }

    public RewardGuide(@lvui Context context, @dd AttributeSet attrs, View rewardView) {
        super(context, attrs);
        this.f11596s = new int[2];
        m7892n(rewardView);
    }
}

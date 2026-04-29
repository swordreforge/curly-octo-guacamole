package com.android.thememanager.detail.theme.view.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.fn3e;
import i1.C6077k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.dd;
import zy.lvui;
import zy.nn86;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeOperationButton extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final int f11342c = -1;

    /* JADX INFO: renamed from: e */
    private static final int f11343e = 0;

    /* JADX INFO: renamed from: j */
    private static final int f11344j = 1;

    /* JADX INFO: renamed from: m */
    private static final int f11345m = 3;

    /* JADX INFO: renamed from: o */
    private static final int f11346o = 2;

    /* JADX INFO: renamed from: f */
    private int f11347f;

    /* JADX INFO: renamed from: g */
    private LayerDrawable f11348g;

    /* JADX INFO: renamed from: h */
    private int f11349h;

    /* JADX INFO: renamed from: i */
    private boolean f11350i;

    /* JADX INFO: renamed from: k */
    private TextView f11351k;

    /* JADX INFO: renamed from: l */
    private CountDownTimer f11352l;

    /* JADX INFO: renamed from: n */
    private StateListDrawable f11353n;

    /* JADX INFO: renamed from: p */
    private int f11354p;

    /* JADX INFO: renamed from: q */
    private ImageView f11355q;

    /* JADX INFO: renamed from: r */
    private float f11356r;

    /* JADX INFO: renamed from: s */
    private int f11357s;

    /* JADX INFO: renamed from: t */
    private boolean f11358t;

    /* JADX INFO: renamed from: y */
    private ObjectAnimator f11359y;

    /* JADX INFO: renamed from: z */
    private boolean f11360z;

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.ThemeOperationButton$k */
    class CountDownTimerC1994k extends CountDownTimer {
        CountDownTimerC1994k(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            ThemeOperationButton.this.f11351k.setText(ThemeOperationButton.m7807q((int) ((millisUntilFinished % 3600000) / 60000)) + ":" + ThemeOperationButton.m7807q((int) ((millisUntilFinished % 60000) / 1000)));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface toq {
    }

    public ThemeOperationButton(@lvui Context context) {
        this(context, null);
    }

    private void f7l8() {
        if (this.f11360z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(this.f11356r);
            gradientDrawable.setColor(this.f11354p);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(this.f11356r);
            gradientDrawable2.setColor(this.f11357s);
            ClipDrawable clipDrawable = new ClipDrawable(gradientDrawable2, androidx.core.view.qrj.f50865toq, 1);
            clipDrawable.setLevel(0);
            this.f11348g = new LayerDrawable(new Drawable[]{gradientDrawable, clipDrawable});
        }
    }

    /* JADX INFO: renamed from: g */
    private void m7803g() {
        if (this.f11360z) {
            this.f11353n = new StateListDrawable();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(this.f11356r);
            if (this.f11358t) {
                gradientDrawable.setColor(this.f11357s);
                C6077k.m22369i(this);
            } else {
                gradientDrawable.setStroke(C1819o.qrj(1.0f), this.f11357s);
                C6077k.f7l8(this);
            }
            this.f11353n.addState(FrameLayout.ENABLED_STATE_SET, gradientDrawable);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(this.f11356r);
            if (this.f11358t) {
                gradientDrawable2.setColor(this.f11354p);
            } else {
                gradientDrawable2.setStroke(C1819o.qrj(1.0f), this.f11354p);
            }
            this.f11353n.addState(FrameLayout.EMPTY_STATE_SET, gradientDrawable2);
        }
    }

    private void ld6() {
        this.f11347f = 0;
        if (this.f11360z) {
            setBackground(this.f11353n);
        }
        this.f11355q.setVisibility(8);
        m7808s(false);
        this.f11351k.setVisibility(0);
    }

    /* JADX INFO: renamed from: n */
    private void m7805n() {
        Resources resources;
        int i2;
        this.f11351k = new TextView(getContext());
        if (this.f11350i) {
            if (C1807g.m7081r()) {
                this.f11351k.setTextSize(0, getResources().getDimension(R.dimen.pad_detail_operation_btn_text_size));
            } else {
                TextView textView = this.f11351k;
                if (o1t.fn3e()) {
                    resources = getResources();
                    i2 = R.dimen.elder_mode_text_size;
                } else {
                    resources = getResources();
                    i2 = R.dimen.de_detail_operation_btn_text_size;
                }
                textView.setTextSize(0, resources.getDimension(i2));
            }
        }
        this.f11351k.setSingleLine(true);
        this.f11351k.setTypeface(Typeface.create("sans-serif-medium", 0));
        addView(this.f11351k, new FrameLayout.LayoutParams(-2, -2, 17));
        ImageView imageView = new ImageView(getContext());
        this.f11355q = imageView;
        imageView.setImageResource(R.drawable.de_theme_operation_btn_loading);
        addView(this.f11355q, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f11355q.setVisibility(8);
        m7803g();
        f7l8();
        setState(0);
    }

    /* JADX INFO: renamed from: p */
    private void m7806p() {
        this.f11347f = 3;
        setBackground(this.f11353n);
        if (this.f11360z) {
            this.f11355q.setVisibility(8);
        }
        m7808s(false);
        this.f11351k.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static String m7807q(int t2) {
        if (t2 < 10) {
            return "0" + t2;
        }
        return "" + t2;
    }

    private void qrj() {
        this.f11347f = 2;
        if (this.f11360z) {
            setBackground(this.f11348g);
        }
        this.f11355q.setVisibility(8);
        m7808s(false);
        this.f11351k.setVisibility(0);
    }

    /* JADX INFO: renamed from: s */
    private void m7808s(boolean enable) {
        if (!enable) {
            ObjectAnimator objectAnimator = this.f11359y;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                return;
            }
            return;
        }
        if (this.f11359y == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f11355q, "rotation", 0.0f, 360.0f);
            this.f11359y = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(600L);
            this.f11359y.setRepeatCount(-1);
            this.f11359y.setInterpolator(new LinearInterpolator());
        }
        this.f11359y.start();
    }

    private void setState(int state) {
        CountDownTimer countDownTimer;
        boolean z2 = true;
        if (this.f11347f != state) {
            if (state == 0) {
                ld6();
            } else if (state == 1) {
                x2();
            } else if (state == 2) {
                qrj();
            } else if (state == 3) {
                m7806p();
            }
        }
        int i2 = this.f11347f;
        if (i2 != 0 && i2 != 2) {
            z2 = false;
        }
        setEnabled(z2);
        if (this.f11347f == 3 || (countDownTimer = this.f11352l) == null) {
            return;
        }
        countDownTimer.cancel();
    }

    private void x2() {
        this.f11347f = 1;
        if (this.f11360z) {
            setBackground(this.f11353n);
        }
        this.f11355q.setVisibility(0);
        m7808s(true);
        this.f11351k.setVisibility(8);
    }

    public CharSequence getText() {
        return this.f11351k.getText();
    }

    public void setCountDown(long millisInFuture) {
        setState(3);
        CountDownTimer countDownTimer = this.f11352l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimerC1994k countDownTimerC1994k = new CountDownTimerC1994k(millisInFuture, 1000L);
        this.f11352l = countDownTimerC1994k;
        countDownTimerC1994k.start();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (this.f11351k.getVisibility() == 0) {
            if (this.f11358t || this.f11347f == 2) {
                this.f11351k.setTextColor(this.f11349h);
            } else if (enabled) {
                this.f11351k.setTextColor(this.f11357s);
            } else {
                this.f11351k.setTextColor(this.f11354p);
            }
        }
        if (this.f11355q.getVisibility() == 0) {
            if (this.f11358t) {
                this.f11355q.setColorFilter(-1);
            } else {
                this.f11355q.setColorFilter(this.f11354p);
            }
        }
    }

    public void setLoading(boolean loading) {
        if (loading) {
            setState(1);
        } else {
            setState(0);
        }
    }

    public void setPauseProgress(int progress) {
        this.f11351k.setText(getContext().getString(R.string.resource_continue));
        this.f11348g.getDrawable(1).setLevel(progress * 100);
        qrj();
    }

    public void setProgress(int progress) {
        setState(2);
        if (progress == -1) {
            this.f11351k.setText(getContext().getString(R.string.resource_continue));
            return;
        }
        this.f11351k.setText(progress + "%");
        this.f11348g.getDrawable(1).setLevel(progress * 100);
    }

    public void setSolid(boolean solid) {
        this.f11358t = solid;
        m7803g();
        if (this.f11347f == 2 || !this.f11360z) {
            return;
        }
        setBackground(this.f11353n);
    }

    public void setText(@nn86 int resId) {
        setText(getContext().getResources().getString(resId));
    }

    public void setTextSize(float textSize) {
        TextView textView = this.f11351k;
        if (textView != null) {
            textView.setTextSize(0, textSize);
        }
    }

    public void setTypeface(Typeface typeface) {
        TextView textView = this.f11351k;
        if (textView == null || typeface == null) {
            return;
        }
        textView.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: y */
    public boolean m7809y() {
        return this.f11358t;
    }

    public void zy() {
        CountDownTimer countDownTimer = this.f11352l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        ObjectAnimator objectAnimator = this.f11359y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public ThemeOperationButton(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, R.attr.themeOperationButton);
    }

    public void setText(CharSequence text) {
        setState(0);
        this.f11351k.setText(text);
    }

    public ThemeOperationButton(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f11347f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, fn3e.C2036i.hlnk, defStyleAttr, 0);
        this.f11358t = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f11357s = typedArrayObtainStyledAttributes.getColor(3, context.getResources().getColor(R.color.de_color_100_fcbb50));
        this.f11354p = typedArrayObtainStyledAttributes.getColor(2, context.getResources().getColor(R.color.de_color_100_dbdbdb));
        this.f11349h = typedArrayObtainStyledAttributes.getColor(6, context.getResources().getColor(R.color.de_operation_btn_text_color));
        this.f11356r = typedArrayObtainStyledAttributes.getDimension(1, context.getResources().getDimension(R.dimen.de_detail_operation_btn_radius));
        this.f11350i = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.f11360z = typedArrayObtainStyledAttributes.getBoolean(4, false);
        typedArrayObtainStyledAttributes.recycle();
        m7805n();
    }
}

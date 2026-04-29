package com.android.thememanager.settings.superwallpaper.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.activity.ShadowLayout;
import com.android.thememanager.fn3e;
import zy.dd;
import zy.lvui;
import zy.x2;

/* JADX INFO: loaded from: classes2.dex */
public class FindMoreButton extends ShadowLayout {
    private static final int as = 300;
    private Interpolator an;
    private TextView bl;
    private Animator bv;
    private String id;

    @x2
    private int in;

    public FindMoreButton(@lvui Context context) {
        this(context, null);
    }

    private void cdj(@dd Animator animator) {
        if (animator == null) {
            return;
        }
        Animator animator2 = this.bv;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.bv = animator;
        animator.start();
    }

    /* JADX INFO: renamed from: h */
    private void m9358h() {
        TextView textView = new TextView(getContext());
        this.bl = textView;
        textView.setTextColor(this.in);
        this.bl.setTextSize(0, getResources().getDimension(R.dimen.wallpaper_setting_find_more_button_text_size));
        if (com.android.thememanager.settings.superwallpaper.utils.zy.m9314p()) {
            this.bl.setTypeface(Typeface.create(com.android.thememanager.util.dd.f16402k, 0));
        } else {
            this.bl.setTypeface(null, 1);
        }
        addView(this.bl, new FrameLayout.LayoutParams(-2, -2, 17));
        if (TextUtils.isEmpty(this.id)) {
            return;
        }
        this.bl.setText(this.id);
    }

    private void kja0(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, fn3e.C2036i.ehmg, R.attr.findMoreButton, 0);
        this.id = typedArrayObtainStyledAttributes.getString(0);
        this.in = typedArrayObtainStyledAttributes.getColor(1, getContext().getResources().getColor(R.color.setting_find_more_text));
        typedArrayObtainStyledAttributes.recycle();
        m9358h();
    }

    public int getHeightWithShadow() {
        int height = getHeight();
        if (height <= 0) {
            height = getMeasuredHeight();
        }
        if (height <= 0) {
            height = getLayoutParams().height;
        }
        return height + getVerticalSkew();
    }

    @dd
    Animator getOutAnimator() {
        if (getTranslationY() >= 0.0f) {
            return null;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), getVerticalSkew() + 0).setDuration((int) (((-getTranslationY()) / getHeight()) * 300.0f));
        duration.setInterpolator(this.an);
        return duration;
    }

    public void ki() {
        t8r(0);
    }

    public void n7h() {
        cdj(getOutAnimator());
    }

    public int qrj(int extraPadding) {
        int i2 = -getHeight();
        if (extraPadding <= 0) {
            extraPadding = getContext().getResources().getDimensionPixelSize(R.dimen.find_more_button_padding_to_navigation);
        }
        return (i2 + getVerticalSkew()) - extraPadding;
    }

    public void setFindMoreText(String findMoreText) {
        this.id = findMoreText;
        this.bl.setText(findMoreText);
    }

    public void t8r(int extraPadding) {
        cdj(x2(extraPadding));
    }

    @dd
    Animator x2(int extraPadding) {
        if (Math.abs(getTranslationY()) >= getHeight()) {
            return null;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), qrj(extraPadding)).setDuration((int) (((getHeight() - getTranslationY()) / getHeight()) * 300.0f));
        duration.setInterpolator(this.an);
        return duration;
    }

    public FindMoreButton(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        this.an = new DecelerateInterpolator();
        kja0(attrs);
    }

    public FindMoreButton(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.an = new DecelerateInterpolator();
        kja0(attrs);
    }

    public FindMoreButton(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.an = new DecelerateInterpolator();
        kja0(attrs);
    }
}

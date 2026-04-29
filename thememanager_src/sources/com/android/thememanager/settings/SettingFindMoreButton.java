package com.android.thememanager.settings;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import com.android.thememanager.fn3e;
import com.android.thememanager.util.g1;
import i1.C6077k;

/* JADX INFO: loaded from: classes2.dex */
public class SettingFindMoreButton extends FrameLayout {

    /* JADX INFO: renamed from: y */
    private static final int f14930y = 300;

    /* JADX INFO: renamed from: g */
    private Button f14931g;

    /* JADX INFO: renamed from: k */
    private Animator f14932k;

    /* JADX INFO: renamed from: n */
    private View.OnClickListener f14933n;

    /* JADX INFO: renamed from: q */
    private Interpolator f14934q;

    /* JADX INFO: renamed from: com.android.thememanager.settings.SettingFindMoreButton$k */
    class ViewOnClickListenerC2506k implements View.OnClickListener {
        ViewOnClickListenerC2506k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (SettingFindMoreButton.this.f14933n != null) {
                SettingFindMoreButton.this.f14933n.onClick(v2);
            }
        }
    }

    public SettingFindMoreButton(@zy.lvui Context context) {
        this(context, null);
    }

    private void zy(@zy.dd Animator animator) {
        if (animator == null) {
            return;
        }
        Animator animator2 = this.f14932k;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.f14932k = animator;
        animator.start();
    }

    @zy.dd
    Animator getInAnimator() {
        if (Math.abs(getTranslationY()) >= getHeight()) {
            return null;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), -getHeight()).setDuration((int) (((getHeight() - getTranslationY()) / getHeight()) * 300.0f));
        duration.setInterpolator(this.f14934q);
        return duration;
    }

    @zy.dd
    Animator getOutAnimator() {
        if (getTranslationY() >= 0.0f) {
            return null;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), 0.0f).setDuration((int) (((-getTranslationY()) / getHeight()) * 300.0f));
        duration.setInterpolator(this.f14934q);
        return duration;
    }

    /* JADX INFO: renamed from: q */
    public void m8982q() {
        zy(getInAnimator());
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener clickListener) {
        this.f14933n = clickListener;
    }

    public void toq() {
        zy(getOutAnimator());
    }

    public SettingFindMoreButton(@zy.lvui Context context, @zy.dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SettingFindMoreButton(@zy.lvui Context context, @zy.dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f14934q = new DecelerateInterpolator();
        LayoutInflater.from(context).inflate(R.layout.wallpaper_more_btn, (ViewGroup) this, true);
        Button button = (Button) findViewById(R.id.button);
        this.f14931g = button;
        button.setTextColor(getResources().getColor(R.color.setting_find_more_text));
        this.f14931g.setTextSize(0, getResources().getDimension(R.dimen.setting_find_more_text_size));
        if (com.android.thememanager.basemodule.utils.o1t.n7h() && g1.m9746j()) {
            this.f14931g.setTypeface(Typeface.create(com.android.thememanager.util.dd.f16402k, 0));
        } else {
            this.f14931g.setTypeface(null, 1);
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, fn3e.C2036i.ehmg);
        String string = typedArrayObtainStyledAttributes.getString(0);
        typedArrayObtainStyledAttributes.recycle();
        if (!TextUtils.isEmpty(string)) {
            this.f14931g.setText(string);
        }
        this.f14931g.setOnClickListener(new ViewOnClickListenerC2506k());
        C6077k.m22369i(this.f14931g);
    }
}

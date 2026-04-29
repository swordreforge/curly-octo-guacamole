package com.android.thememanager.detail.video.view.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.core.content.C0498q;
import androidx.core.view.qrj;
import androidx.core.widget.t8r;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.o1t;
import i1.C6077k;
import zy.dd;
import zy.lvui;
import zy.nn86;

/* JADX INFO: loaded from: classes2.dex */
public class VideoApplyButton extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private int f11565g;

    /* JADX INFO: renamed from: k */
    private final TextView f11566k;

    /* JADX INFO: renamed from: n */
    private ValueAnimator f11567n;

    /* JADX INFO: renamed from: q */
    private final LayerDrawable f11568q;

    public VideoApplyButton(@lvui Context context) {
        this(context, null);
    }

    private int getTextColorbyDevices() {
        return C0498q.m2252g(getContext(), R.color.black);
    }

    /* JADX INFO: renamed from: k */
    private void m7882k(int progress) {
        if (progress == 0 || (progress == 100 && this.f11565g == 0)) {
            setProgress(progress);
            return;
        }
        ValueAnimator valueAnimator = this.f11567n;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f11567n.end();
        }
        int i2 = this.f11565g;
        if (i2 > progress) {
            setProgress(progress);
            return;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "Progress", i2, progress);
        this.f11567n = objectAnimatorOfInt;
        objectAnimatorOfInt.start();
    }

    public LayerDrawable getBackgroundByDevice() {
        float dimension = getResources().getDimension(com.android.thememanager.R.dimen.miuix_appcompat_button_bg_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(C0498q.m2252g(getContext(), com.android.thememanager.R.color.de_color_80_dadbdc));
        ClipDrawable clipDrawable = new ClipDrawable(gradientDrawable, qrj.f50866zy, 1);
        clipDrawable.setLevel(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(dimension);
        gradientDrawable2.setColor(C0498q.m2252g(getContext(), com.android.thememanager.R.color.de_color_90_ffffff));
        ClipDrawable clipDrawable2 = new ClipDrawable(gradientDrawable2, qrj.f50865toq, 1);
        clipDrawable2.setLevel(10000);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{clipDrawable, clipDrawable2});
        C6077k.m22369i(this);
        return layerDrawable;
    }

    @Keep
    public int getProgress() {
        return this.f11565g;
    }

    /* JADX INFO: renamed from: q */
    public void m7883q(@dd String text, int progress) {
        if (progress >= 0 && progress <= 100) {
            m7882k(progress);
            if (text == null) {
                text = progress + "%";
            }
        }
        this.f11566k.setText(text);
    }

    @Keep
    public void setProgress(int p2) {
        if (this.f11565g != p2) {
            this.f11565g = p2;
            this.f11568q.getDrawable(0).setLevel((100 - p2) * 100);
            this.f11568q.getDrawable(1).setLevel(p2 * 100);
        }
    }

    public void toq(@nn86 int stringId) {
        m7883q(getResources().getString(stringId), -1);
    }

    public void zy(@nn86 int stringId, int progress) {
        m7883q(getResources().getString(stringId), progress);
    }

    public VideoApplyButton(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public VideoApplyButton(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f11567n = null;
        this.f11565g = 0;
        TextView textView = new TextView(getContext());
        this.f11566k = textView;
        C1819o.m7161o(textView, true);
        textView.setTextColor(getTextColorbyDevices());
        textView.setMaxLines(1);
        if (!o1t.fn3e()) {
            if (C1807g.zurt()) {
                textView.setTextSize(0, getResources().getDimensionPixelSize(com.android.thememanager.R.dimen.de_wallpaper_apply_button_text_size_fold));
            } else {
                t8r.ki(textView, 4, 16, 2, 2);
            }
        } else {
            textView.setTextSize(0, getResources().getDimension(com.android.thememanager.R.dimen.elder_mode_text_size));
        }
        addView(textView, new FrameLayout.LayoutParams(-1, -1));
        textView.setGravity(17);
        LayerDrawable backgroundByDevice = getBackgroundByDevice();
        this.f11568q = backgroundByDevice;
        setBackground(backgroundByDevice);
        C6077k.m22369i(this);
    }
}

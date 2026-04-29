package com.android.thememanager.detail.theme.view.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.o1t;
import com.market.sdk.utils.C5016s;
import java.util.Locale;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class FollowButton extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private boolean f11235g;

    /* JADX INFO: renamed from: k */
    private TextView f11236k;

    /* JADX INFO: renamed from: n */
    private GradientDrawable f11237n;

    /* JADX INFO: renamed from: q */
    private ImageView f11238q;

    public FollowButton(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m7766k() {
        this.f11236k = new TextView(getContext());
        String string = Locale.getDefault().toString();
        if (string.startsWith("zh") || string.startsWith(C5016s.f28231k)) {
            this.f11236k.setTextSize(0, getResources().getDimension(R.dimen.de_detail_follow_text_size));
        } else {
            this.f11236k.setTextSize(0, 36.0f);
        }
        addView(getMoreInfoView(), new FrameLayout.LayoutParams(-2, -2, 17));
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f11237n = gradientDrawable;
        gradientDrawable.setCornerRadius(getResources().getDimension(R.dimen.de_detail_follow_btn_radius));
        setBackground(this.f11237n);
        setFollow(false);
    }

    public View getMoreInfoView() {
        if (!o1t.fn3e()) {
            return this.f11236k;
        }
        ImageView imageView = new ImageView(getContext());
        this.f11238q = imageView;
        imageView.setImageResource(R.drawable.ic_union);
        return this.f11238q;
    }

    public void setFollow(boolean follow) {
        this.f11235g = follow;
        if (follow) {
            this.f11236k.setText(getResources().getString(R.string.de_author_following));
            this.f11236k.setTextColor(getResources().getColor(R.color.de_follow_text_color));
            this.f11237n.setColor(getResources().getColor(R.color.de_color_12_000000));
            this.f11237n.setStroke(C1819o.qrj(1.0f), 0);
            return;
        }
        this.f11236k.setText(getResources().getString(R.string.de_author_follow));
        this.f11236k.setTextColor(getResources().getColor(R.color.de_color_100_fcbb50));
        this.f11237n.setColor(0);
        this.f11237n.setStroke(C1819o.qrj(1.0f), getResources().getColor(R.color.de_color_100_fcbb50));
    }

    public boolean toq() {
        return this.f11235g;
    }

    public FollowButton(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FollowButton(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m7766k();
    }
}

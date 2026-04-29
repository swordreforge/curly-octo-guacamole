package com.android.thememanager.detail.video.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0498q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.x2;
import i1.C6077k;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class VideoLikeButton extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private ImageView f11569k;

    /* JADX INFO: renamed from: q */
    private TextView f11570q;

    public VideoLikeButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m7884k() {
        setOrientation(1);
        ImageView imageView = new ImageView(getContext());
        this.f11569k = imageView;
        imageView.setImageResource(R.drawable.de_icon_video_detail_like);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        addView(this.f11569k, layoutParams);
        TextView textView = new TextView(getContext());
        this.f11570q = textView;
        textView.setTextColor(C0498q.m2252g(getContext(), android.R.color.white));
        this.f11570q.setTextSize(0, getResources().getDimension(R.dimen.de_video_operation_text_size));
        this.f11570q.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = getResources().getDimensionPixelSize(R.dimen.de_video_like_text_margin_top);
        layoutParams2.gravity = 1;
        addView(this.f11570q, layoutParams2);
        C6077k.f7l8(this);
    }

    public boolean toq() {
        return this.f11569k.isSelected();
    }

    public void zy(boolean liked, int count) {
        this.f11569k.setSelected(liked);
        this.f11570q.setText(x2.zy(count));
    }

    public VideoLikeButton(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public VideoLikeButton(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m7884k();
    }
}

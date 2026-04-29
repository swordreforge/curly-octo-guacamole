package com.android.thememanager.detail.video.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0498q;
import com.android.thememanager.R;
import i1.C6077k;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class VideoPreviewButton extends LinearLayout {

    /* JADX INFO: renamed from: k */
    private ImageView f11571k;

    public VideoPreviewButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m7885k() {
        setOrientation(1);
        setGravity(1);
        ImageView imageView = new ImageView(getContext());
        this.f11571k = imageView;
        imageView.setImageResource(R.drawable.de_icon_video_detail_preview);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        addView(this.f11571k, layoutParams);
        TextView textView = new TextView(getContext());
        textView.setTextColor(C0498q.m2252g(getContext(), android.R.color.white));
        textView.setTextSize(0, getResources().getDimension(R.dimen.de_video_operation_text_size));
        textView.setSingleLine(true);
        textView.setText(R.string.de_preview);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = getResources().getDimensionPixelSize(R.dimen.de_video_preview_text_margin_top);
        layoutParams.gravity = 1;
        addView(textView, layoutParams2);
        C6077k.f7l8(this);
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f11571k.isSelected();
    }

    public void toq(boolean selected) {
        this.f11571k.setSelected(selected);
    }

    public VideoPreviewButton(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public VideoPreviewButton(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m7885k();
    }
}

package com.android.thememanager.detail.video.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.thememanager.R;
import i1.C6077k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class IncallShowPreviewButton extends FrameLayout {

    /* JADX INFO: renamed from: k */
    private ImageView f11515k;

    public IncallShowPreviewButton(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m7859k() {
        this.f11515k = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.de_video_detail_incall_show_preview_button, (ViewGroup) this, true).findViewById(R.id.icon);
        setPreviewState(false);
        C6077k.f7l8(this);
    }

    public void setPreviewState(boolean enabled) {
        this.f11515k.setImageResource(enabled ? R.drawable.de_icon_video_detail_incall_show_preview_enable : R.drawable.de_icon_video_detail_incall_show_preview_disable);
    }

    public IncallShowPreviewButton(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public IncallShowPreviewButton(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m7859k();
    }
}

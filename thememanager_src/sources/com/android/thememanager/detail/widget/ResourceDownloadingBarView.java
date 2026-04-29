package com.android.thememanager.detail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.thememanager.R;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceDownloadingBarView extends FrameLayout {

    /* JADX INFO: renamed from: k */
    protected ProgressBar f11585k;

    /* JADX INFO: renamed from: q */
    protected TextView f11586q;

    public ResourceDownloadingBarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mo7889k();
    }

    /* JADX INFO: renamed from: k */
    protected void mo7889k() {
        View.inflate(getContext(), R.layout.de_resource_operation_downloading_bar, this);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.downloadingProgressBar);
        this.f11585k = progressBar;
        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.progress_btn_active));
        this.f11586q = (TextView) findViewById(R.id.downloadingProgressTitle);
    }

    public void setDownloadingBarTitle(String title) {
        this.f11586q.setText(title);
    }

    public void setDownloadingProgress(int progress) {
        if (progress >= 0) {
            this.f11585k.setProgress(progress);
        }
    }

    public ResourceDownloadingBarView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ResourceDownloadingBarView(Context context) {
        this(context, null);
    }
}

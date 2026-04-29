package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.detail.widget.ResourceDownloadingBarView;

/* JADX INFO: loaded from: classes2.dex */
public class V2ResourceDownloadingBarView extends ResourceDownloadingBarView {
    public V2ResourceDownloadingBarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override // com.android.thememanager.detail.widget.ResourceDownloadingBarView
    /* JADX INFO: renamed from: k */
    protected void mo7889k() {
        View.inflate(getContext(), R.layout.resource_operation_downloading_bar_v2, this);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.downloadingProgressBar);
        this.f11585k = progressBar;
        progressBar.setProgressDrawable(getResources().getDrawable(R.drawable.resource_progress_button_bg));
        this.f11586q = (TextView) findViewById(R.id.downloadingProgressTitle);
    }

    public V2ResourceDownloadingBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public V2ResourceDownloadingBarView(Context context) {
        super(context);
    }
}

package com.android.thememanager.view;

import android.view.View;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;

/* JADX INFO: compiled from: DynamicMessage.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 {

    /* JADX INFO: renamed from: k */
    private View f17535k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private NinePatchImageView f61508toq;

    public f7l8(View view) {
        this.f17535k = view;
        this.f61508toq = (NinePatchImageView) view.findViewById(R.id.thumbnail);
    }

    /* JADX INFO: renamed from: k */
    public NinePatchImageView m10355k() {
        return this.f61508toq;
    }
}

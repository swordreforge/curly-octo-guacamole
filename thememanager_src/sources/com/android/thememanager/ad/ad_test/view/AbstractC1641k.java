package com.android.thememanager.ad.ad_test.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.android.thememanager.R;
import zy.gvn7;
import zy.x2;

/* JADX INFO: renamed from: com.android.thememanager.ad.ad_test.view.k */
/* JADX INFO: compiled from: AbsElementAdBannerView.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1641k {

    /* JADX INFO: renamed from: k */
    protected String f9493k;

    @gvn7
    /* JADX INFO: renamed from: k */
    public abstract int mo6502k();

    /* JADX INFO: renamed from: q */
    public void mo6503q(Context context, View downloadBtn) {
    }

    public GradientDrawable toq(Context context, GradientDrawable gradientDrawable, int bgColor, int radius, int borderWidth, @x2 int borderColor) {
        if (gradientDrawable == null) {
            gradientDrawable = (GradientDrawable) context.getDrawable(R.drawable.de_ad_download_background_test);
        }
        gradientDrawable.mutate();
        gradientDrawable.setColor(bgColor);
        if (radius > 0) {
            gradientDrawable.setCornerRadius(radius);
        }
        if (borderWidth > 0) {
            gradientDrawable.setStroke(borderWidth, borderColor);
        }
        return gradientDrawable;
    }

    public void zy(Activity activity, View parentView, String url) {
    }
}

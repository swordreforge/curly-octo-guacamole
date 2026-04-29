package com.android.thememanager.ad.ad_test.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;

/* JADX INFO: renamed from: com.android.thememanager.ad.ad_test.view.n */
/* JADX INFO: compiled from: ElementAdBannerViewTestTwoForButtonInThumbnail.java */
/* JADX INFO: loaded from: classes.dex */
public class C1642n extends AbstractC1641k {
    public C1642n(String type) {
        this.f9493k = type;
    }

    @Override // com.android.thememanager.ad.ad_test.view.AbstractC1641k
    /* JADX INFO: renamed from: k */
    public int mo6502k() {
        return R.layout.f8670xfce2a9a6;
    }

    @Override // com.android.thememanager.ad.ad_test.view.AbstractC1641k
    /* JADX INFO: renamed from: q */
    public void mo6503q(Context context, View downloadBtn) {
        super.mo6503q(context, downloadBtn);
        if (downloadBtn.getBackground() instanceof GradientDrawable) {
            downloadBtn.setBackground(toq(context, (GradientDrawable) downloadBtn.getBackground(), context.getResources().getColor(R.color.de_element_ad_banner_test_two_download_btn_background_color), context.getResources().getDimensionPixelSize(R.dimen.element_ad_banner_test_two_download_button_background_radius), 0, -1));
        }
    }

    @Override // com.android.thememanager.ad.ad_test.view.AbstractC1641k
    public void zy(Activity activity, View parent, String url) {
        super.zy(activity, parent, url);
        ImageView imageView = (ImageView) parent.findViewById(R.id.avatar);
        if (imageView != null) {
            x2.m6782y(activity, url, imageView, x2.fn3e().m6793r(x2.ki(x2.x2(), 0.0f)).a9(false));
        }
    }
}

package com.android.thememanager.ad.ad_test.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.android.thememanager.R;

/* JADX INFO: compiled from: ElementAdBannerViewTestOneForBlueButton.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends AbstractC1641k {
    public zy(String type) {
        this.f9493k = type;
    }

    @Override // com.android.thememanager.ad.ad_test.view.AbstractC1641k
    /* JADX INFO: renamed from: k */
    public int mo6502k() {
        return R.layout.de_element_ad_banner_test_one_for_blue_button_view_layout;
    }

    @Override // com.android.thememanager.ad.ad_test.view.AbstractC1641k
    /* JADX INFO: renamed from: q */
    public void mo6503q(Context context, View downloadBtn) {
        super.mo6503q(context, downloadBtn);
        if (downloadBtn.getBackground() instanceof GradientDrawable) {
            downloadBtn.setBackground(toq(context, (GradientDrawable) downloadBtn.getBackground(), context.getResources().getColor(R.color.de_element_ad_banner_test_download_btn_background_color), context.getResources().getDimensionPixelSize(R.dimen.element_ad_banner_test_one_download_button_background_radius), context.getResources().getDimensionPixelSize(R.dimen.f8615xffde3aa2), context.getResources().getColor(R.color.de_element_ad_banner_test_download_btn_border_color)));
        }
    }
}

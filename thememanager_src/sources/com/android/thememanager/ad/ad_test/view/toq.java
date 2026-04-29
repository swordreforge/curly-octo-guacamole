package com.android.thememanager.ad.ad_test.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.android.thememanager.R;

/* JADX INFO: compiled from: ElementAdBannerViewTestFourForBigButton.java */
/* JADX INFO: loaded from: classes.dex */
public class toq extends AbstractC1641k {
    public toq(String type) {
        this.f9493k = type;
    }

    @Override // com.android.thememanager.ad.ad_test.view.AbstractC1641k
    /* JADX INFO: renamed from: k */
    public int mo6502k() {
        return R.layout.de_element_ad_banner_test_four_for_big_button_view_layout;
    }

    @Override // com.android.thememanager.ad.ad_test.view.AbstractC1641k
    /* JADX INFO: renamed from: q */
    public void mo6503q(Context context, View downloadBtn) {
        super.mo6503q(context, downloadBtn);
        if (downloadBtn.getBackground() instanceof GradientDrawable) {
            downloadBtn.setBackground(toq(context, (GradientDrawable) downloadBtn.getBackground(), context.getResources().getColor(R.color.de_element_ad_banner_test_four_download_btn_background_color), context.getResources().getDimensionPixelSize(R.dimen.element_ad_banner_test_four_download_button_background_radius), -1, -1));
        }
    }
}

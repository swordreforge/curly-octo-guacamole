package com.android.thememanager.ad.ad_test.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.android.thememanager.R;

/* JADX INFO: renamed from: com.android.thememanager.ad.ad_test.view.q */
/* JADX INFO: compiled from: ElementAdBannerViewTestThreeForBlackButton.java */
/* JADX INFO: loaded from: classes.dex */
public class C1643q extends AbstractC1641k {
    public C1643q(String type) {
        this.f9493k = type;
    }

    @Override // com.android.thememanager.ad.ad_test.view.AbstractC1641k
    /* JADX INFO: renamed from: k */
    public int mo6502k() {
        return R.layout.de_element_ad_banner_test_three_for_black_button_view_layout;
    }

    @Override // com.android.thememanager.ad.ad_test.view.AbstractC1641k
    /* JADX INFO: renamed from: q */
    public void mo6503q(Context context, View downloadBtn) {
        super.mo6503q(context, downloadBtn);
        if (downloadBtn.getBackground() instanceof GradientDrawable) {
            downloadBtn.setBackground(toq(context, (GradientDrawable) downloadBtn.getBackground(), context.getResources().getColor(R.color.de_element_ad_banner_test_three_download_btn_background_color), context.getResources().getDimensionPixelSize(R.dimen.element_ad_banner_test_three_download_button_background_radius), -1, -1));
        }
    }
}

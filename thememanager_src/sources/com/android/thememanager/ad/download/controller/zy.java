package com.android.thememanager.ad.download.controller;

import android.text.TextUtils;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.utils.kja0;
import hb.C6072k;
import zy.lvui;

/* JADX INFO: compiled from: HomepageSlideAdDownloadButtonController.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends AbstractC1646k {

    /* JADX INFO: renamed from: g */
    private int f9509g;

    public zy(@lvui TextView downloadView) {
        super(downloadView);
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1852k
    /* JADX INFO: renamed from: q */
    public void mo6499q(String packageName, int state) {
        AdInfo adInfo;
        int i2;
        TextView textView = this.f9498k.get();
        if (textView == null || (adInfo = this.f9499q) == null || !TextUtils.equals(packageName, adInfo.packageName)) {
            return;
        }
        if (state == -8 || state == -2) {
            textView.setText(R.string.ad_download_download);
            return;
        }
        if (state != 1) {
            if (state == 3) {
                textView.setText(R.string.ad_installing);
                return;
            } else if (state == 4) {
                textView.setText(R.string.ad_download_open);
                return;
            } else if (state != 5) {
                return;
            }
        }
        C6072k c6072kM6521y = com.android.thememanager.ad.download.toq.m6518s().m6521y(packageName);
        if (c6072kM6521y == null || c6072kM6521y.f35087k != 5 || this.f9509g == (i2 = c6072kM6521y.f35088n)) {
            return;
        }
        textView.setText(String.format(kja0.ld6(R.string.ad_download_progress), Integer.valueOf(i2)));
        this.f9509g = i2;
    }
}

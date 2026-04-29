package com.android.thememanager.ad.download.controller;

import android.text.TextUtils;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.AdDislikeManager;
import com.android.thememanager.basemodule.ad.InterfaceC1694q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.views.InterfaceC1852k;
import java.lang.ref.WeakReference;
import java.util.Map;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.ad.download.controller.k */
/* JADX INFO: compiled from: BaseAdDownloadButtonController.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1646k implements InterfaceC1852k, InterfaceC1694q {

    /* JADX INFO: renamed from: n */
    private static final String f9497n = "BaseAdDownloadButtonController";

    /* JADX INFO: renamed from: k */
    protected WeakReference<TextView> f9498k;

    /* JADX INFO: renamed from: q */
    protected AdInfo f9499q;

    public AbstractC1646k(@lvui TextView downloadView) {
        this.f9498k = new WeakReference<>(downloadView);
    }

    private void toq() {
        TextView textView = this.f9498k.get();
        if (textView == null || this.f9499q == null) {
            C7794k.toq("AdDownloadButtonManager", "initDownloadState downloadView or mAdInfo is null!");
            return;
        }
        if (AdDislikeManager.m6595g().f7l8(this.f9499q.tagId)) {
            m6507g(textView, false);
            return;
        }
        textView.setEnabled(true);
        if (a9.m6999s(this.f9499q.packageName)) {
            m6509n(textView, R.string.ad_download_open, true);
        } else {
            m6509n(textView, R.string.ad_download_download, true);
        }
    }

    /* JADX INFO: renamed from: g */
    protected void m6507g(TextView downloadView, boolean visible) {
        m6509n(downloadView, 0, visible);
    }

    /* JADX INFO: renamed from: k */
    public void m6508k() {
        if (this.f9498k.get() == null || this.f9499q == null) {
            return;
        }
        C1653q.m6524g(this.f9498k.get().getContext(), this.f9499q, true, new Map[0]);
    }

    /* JADX INFO: renamed from: n */
    protected void m6509n(TextView downloadView, int textResId, boolean visible) {
        downloadView.setVisibility(visible ? 0 : 8);
        if (textResId != 0) {
            downloadView.setText(textResId);
        }
    }

    @Override // com.android.thememanager.basemodule.ad.InterfaceC1694q
    /* JADX INFO: renamed from: s */
    public void mo6510s(String tagId) {
        AdInfo adInfo;
        if (this.f9498k.get() == null || (adInfo = this.f9499q) == null || !TextUtils.equals(tagId, adInfo.tagId)) {
            return;
        }
        this.f9498k.get().setVisibility(8);
    }

    public void zy(AdInfo adInfo) {
        if (adInfo == null) {
            C7794k.m28196p(f9497n, "Set AdInfo: adInfo is null!");
        } else {
            this.f9499q = adInfo;
            toq();
        }
    }
}

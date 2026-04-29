package com.android.thememanager.basemodule.ad;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.nn86;
import com.market.sdk.MarketManager;
import com.market.sdk.n7h;
import com.market.sdk.utils.C5010k;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: compiled from: MarketSdkWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class zy {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f57453toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57454zy = "MarketSdkWrapper";

    /* JADX INFO: renamed from: k */
    private n7h f9676k;

    /* JADX INFO: compiled from: MarketSdkWrapper.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        private static zy f9677k = new zy();
    }

    public static zy zy() {
        return toq.f9677k;
    }

    /* JADX INFO: renamed from: g */
    public boolean m6602g(@lvui String url) {
        n7h n7hVar = this.f9676k;
        if (n7hVar != null) {
            return n7hVar.m17330p(url);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m6603k(Context context, AdInfo info) {
        if (!mcp.m7139n()) {
            nn86.m7150k(R.string.unable_connect_network, 0);
            return;
        }
        String str = info.floatCardData;
        if (str != null && (str.startsWith("market://") || info.floatCardData.startsWith("mimarket://"))) {
            n7h n7hVar = this.f9676k;
            if (n7hVar != null) {
                n7hVar.toq(info.floatCardData);
                return;
            }
            return;
        }
        String str2 = info.landingPageUrl;
        if (str2 == null || !(str2.startsWith("market://") || info.landingPageUrl.startsWith("mimarket://"))) {
            C7794k.m28196p(f57454zy, "illegal params floatCardData=" + info.floatCardData + "&landingPageUrl=" + info.landingPageUrl);
            return;
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse(info.landingPageUrl));
        intent.setPackage("com.xiaomi.market");
        if (context.getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m6604n(@lvui String url) {
        n7h n7hVar = this.f9676k;
        if (n7hVar != null) {
            return n7hVar.m17333y(url);
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public void m6605q() {
        C5010k.m17434g(bf2.toq.toq());
        n7h n7hVarX2 = MarketManager.qrj().x2();
        this.f9676k = n7hVarX2;
        if (n7hVarX2 == null) {
            C7794k.m28196p(f57454zy, "initMarketSdk but mFloatCardManager is null");
        }
    }

    public boolean toq(@lvui String url) {
        n7h n7hVar = this.f9676k;
        if (n7hVar != null) {
            return n7hVar.toq(url);
        }
        return false;
    }

    private zy() {
        m6605q();
    }
}

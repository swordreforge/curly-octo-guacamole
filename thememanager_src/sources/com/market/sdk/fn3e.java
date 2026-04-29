package com.market.sdk;

import android.content.pm.PackageManager;
import com.market.sdk.utils.C5010k;

/* JADX INFO: compiled from: MarketType.java */
/* JADX INFO: loaded from: classes3.dex */
public enum fn3e {
    MARKET_PHONE("com.xiaomi.market"),
    MARKET_PAD("com.xiaomi.market"),
    MIPICKS("com.xiaomi.mipicks"),
    DISCOVER("com.xiaomi.discover");

    private final String mPackageName;
    private int mVersionCode = -1;
    private Boolean mIsEnabled = null;

    fn3e(String str) {
        this.mPackageName = str;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public int getVersionCode() {
        if (this.mVersionCode == -1) {
            try {
                this.mVersionCode = C5010k.toq().getPackageManager().getPackageInfo(this.mPackageName, 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                this.mVersionCode = -2;
            }
        }
        return this.mVersionCode;
    }

    public boolean isEnabled() {
        if (this.mIsEnabled == null) {
            this.mIsEnabled = Boolean.valueOf(com.market.sdk.utils.x2.toq(this.mPackageName));
        }
        return this.mIsEnabled.booleanValue();
    }
}

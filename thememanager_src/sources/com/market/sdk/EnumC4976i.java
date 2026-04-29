package com.market.sdk;

import android.util.Log;
import miui.os.Build;

/* JADX INFO: renamed from: com.market.sdk.i */
/* JADX INFO: compiled from: MarketFeatures.java */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4976i {
    INSTALL_LOCAL_APK(1914330, -1, 1914531, -1),
    DESK_RECOMMEND_V2(1914331, 1914331, -1, 1914312),
    DESK_RECOMMEND_V3(1914341, 1914341, -1, -1),
    DESK_FOLDER_CATEGORY_NAME(1914451, 1914451, 1914360, -1),
    DISCOVER_METERED_UPDATE_CONFIRM(-1, -1, -1, 1914380),
    FLOAT_CARD(1914651, 1914651, -1, -1);

    private final int mDiscoverSupportVersion;
    private final int mMarketSupportVersion;
    private final int mMipicksSupportVersion;
    private final int mPadSupportVersion;

    /* JADX INFO: renamed from: com.market.sdk.i$k */
    /* JADX INFO: compiled from: MarketFeatures.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f28059k;

        static {
            int[] iArr = new int[fn3e.values().length];
            f28059k = iArr;
            try {
                iArr[fn3e.MARKET_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28059k[fn3e.MARKET_PAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28059k[fn3e.MIPICKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28059k[fn3e.DISCOVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.i$toq */
    /* JADX INFO: compiled from: MarketFeatures.java */
    public static class toq extends Exception {
        private EnumC4976i mFeature;

        public toq(EnumC4976i enumC4976i) {
            this.mFeature = enumC4976i;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "feature not supported: " + this.mFeature.name();
        }
    }

    /* JADX INFO: renamed from: com.market.sdk.i$zy */
    /* JADX INFO: compiled from: MarketFeatures.java */
    static class zy {

        /* JADX INFO: renamed from: k */
        static final int f28060k = 0;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final int f68887toq = -1;

        zy() {
        }
    }

    EnumC4976i(int i2, int i3, int i4, int i5) {
        this.mMarketSupportVersion = i2;
        this.mMipicksSupportVersion = i4;
        this.mPadSupportVersion = i3;
        this.mDiscoverSupportVersion = i5;
    }

    public boolean isSupported() {
        try {
            if (!Build.IS_INTERNATIONAL_BUILD) {
                return Build.IS_MIPAD ? isSupportedBy(fn3e.MARKET_PAD) : isSupportedBy(fn3e.MARKET_PHONE);
            }
            if (!isSupportedBy(fn3e.MIPICKS) && !isSupportedBy(fn3e.DISCOVER)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            Log.d(MarketManager.f27964n, th.toString());
            return isSupportedBy(fn3e.MARKET_PHONE);
        }
    }

    public boolean isSupportedBy(fn3e fn3eVar) {
        int i2;
        if (!fn3eVar.isEnabled()) {
            return false;
        }
        int versionCode = fn3eVar.getVersionCode();
        int i3 = k.f28059k[fn3eVar.ordinal()];
        if (i3 == 1) {
            i2 = this.mMarketSupportVersion;
        } else if (i3 == 2) {
            i2 = this.mPadSupportVersion;
        } else if (i3 == 3) {
            i2 = this.mMipicksSupportVersion;
        } else {
            if (i3 != 4) {
                return false;
            }
            i2 = this.mDiscoverSupportVersion;
        }
        return i2 != -1 && versionCode >= i2;
    }

    public void throwExceptionIfNotSupported() throws toq {
        if (!isSupported()) {
            throw new toq(this);
        }
    }
}

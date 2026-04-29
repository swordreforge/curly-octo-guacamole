package com.android.thememanager.basemodule.ad.model;

import com.google.gson.C4871g;
import yz.C7794k;

/* JADX INFO: loaded from: classes.dex */
public class LocalAdInfo extends AdInfo {
    private int adPosition;
    private boolean isViewHolderInfo;

    public static class Builder {
        private int adPosition;
        private boolean isViewHolderInfo;
        private final AdInfo mAdInfo;

        public Builder(AdInfo adInfo) {
            this.isViewHolderInfo = false;
            this.adPosition = -1;
            this.mAdInfo = adInfo;
            if (adInfo instanceof LocalAdInfo) {
                LocalAdInfo localAdInfo = (LocalAdInfo) adInfo;
                this.isViewHolderInfo = localAdInfo.isViewHolderInfo();
                this.adPosition = localAdInfo.adPosition();
            }
        }

        public Builder adPosition(int val) {
            this.adPosition = val;
            return this;
        }

        public LocalAdInfo build() {
            if (this.mAdInfo == null) {
                return null;
            }
            LocalAdInfo localAdInfo = new LocalAdInfo();
            try {
                C4871g c4871g = new C4871g();
                localAdInfo = (LocalAdInfo) c4871g.n7h(c4871g.o1t(this.mAdInfo), LocalAdInfo.class);
            } catch (Exception e2) {
                C7794k.zy("LocalAdInfo", "clone object error: ", e2);
            }
            localAdInfo.isViewHolderInfo = this.isViewHolderInfo;
            localAdInfo.adPosition = this.adPosition;
            return localAdInfo;
        }

        public Builder isViewHolderInfo(boolean val) {
            this.isViewHolderInfo = val;
            return this;
        }
    }

    public static Builder builder(AdInfo adInfo) {
        return new Builder(adInfo);
    }

    public int adPosition() {
        return this.adPosition;
    }

    public boolean isViewHolderInfo() {
        return this.isViewHolderInfo;
    }

    private LocalAdInfo() {
        this.adPosition = -1;
    }
}

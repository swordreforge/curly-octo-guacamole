package com.android.thememanager.basemodule.ad.model;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class AdInfo implements Serializable {
    public static final int LANDING_PAGE_TYPE_APP_STORE_DETAIL = 2;
    public static final int LANDING_PAGE_TYPE_APP_STORE_SPECIAL_DETAIL = 4;
    public static final int LANDING_PAGE_TYPE_FLOAT_CARD = 5;
    public static final int LANDING_PAGE_TYPE_MINI_CARD = 3;
    public static final int LANDING_PAGE_TYPE_SIMPLE_DETAIL = 6;
    public static final int LANDING_PAGE_TYPE_SPECIAL_DETAIL = 1;
    public static final int LANDING_PAGE_TYPE_UNKNOWN = -1;
    public static final int TARGET_TYPE_APP = 2;
    public static final int TARGET_TYPE_H5 = 1;
    public static final int TARGET_TYPE_VIDEO_AD_APP = 4;
    public static final int TARGET_TYPE_VIDEO_AD_H5 = 3;
    private static final long serialVersionUID = 7;
    public String actionUrl;
    public String adMark;
    public long allDownloadNum;
    public long apkSize;
    public String appChannel;
    public String appClientId;
    public String appDeveloper;
    public String appIntroduction;
    public String appName;
    public String appPermission;
    public String appPrivacy;
    public float appRatingScore;
    public String appRef;
    public String appSignature;
    public String appVersion;
    public String brand;
    public String buttonName;
    public String categoryName;
    public ArrayList<String> clickMonitorUrls;
    public String deeplink;
    public String displayUrl;
    public String dspName;
    public String ex;
    public ArrayList<String> finishDownloadMonitorUrls;
    public ArrayList<String> finishInstallMonitorUrls;
    public String floatCardData;
    public float height;
    public String iconUrl;
    public long id;
    public ArrayList<String> imgUrls;
    public JumpControl jumpControl;
    public String landingPageUrl;
    public String nonce;
    public String packageName;
    public Parameters parameters;
    public String phoneNumber;
    public ArrayList<String> skipMonitorUrls;
    public String source;
    public ArrayList<String> startDownloadMonitorUrls;
    public ArrayList<String> startInstallMonitorUrls;
    public String summary;
    public String tagId;
    public int targetType;
    public String template;
    public String title;
    public int totalDownloadNum;
    public String videoUrl;
    public ArrayList<String> viewMonitorUrls;
    public float width;

    public class JumpControl implements Serializable {
        public String callee;
        public int jumpMode;
        public int mode;

        public JumpControl() {
        }
    }

    public class Parameters implements Serializable {
        public String categoryTop;
        public int landingPageType;
        public boolean startDownload;

        public Parameters() {
        }
    }

    public boolean isVideoAd() {
        int i2 = this.targetType;
        return i2 == 3 || i2 == 4;
    }
}

package com.android.thememanager.v9.model;

import android.content.Context;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.ad.model.AdInfoResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import e5.zy;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UIProduct implements Serializable {
    public static final String FONT = "FONT";
    public static final String LIVE_WALLPAPER = "LIVE_WALLPAPER";
    public static final String RINGTONE = "RINGTONE";
    public static final String THEME = "THEME";
    public static final String WALLPAPER = "WALLPAPER";
    private static final long serialVersionUID = 9;
    public AdInfoResponse adInfo;
    public String adTagId;
    public float auditScore;
    public String colorRingId;
    public int currentPriceInCent;
    public String darkModeImageUrl;
    public List<Decoration> decorations;
    public String designerName;
    public String deviceType;
    public String downloadCount;
    public String downloadUrl;
    public String eid;
    public String favoriteTime;
    public int fileSizeInKB;
    public String gifUrl;
    public boolean hidePrice;
    public String imageUrl;
    public List<String> innerTags;
    public Boolean isPurchased;
    public Boolean like;
    public Integer likeCount;
    public String localPath;
    public Resource mRelativeResource;
    public boolean manualHide;
    public String name;
    public boolean offShelf;

    @zy(alternate = {"originPriceInCent"}, value = "originOriginPriceInCent")
    public int originPriceInCent;
    public String originalImageUrl;
    public String playtimeDisplay;
    public String productType;
    public String productUuid;
    public int purchasedPriceInCent;
    public String purchasedTime;
    public float score;
    public String shareUrl;
    public String subjectUuid;
    public String title;
    public String traceId;
    public String trackId;
    public int uiVersion;
    public String uuid;
    public String videoUrl;
    public String wallpaperGalleryType;
    public String wallpaperGalleryTypeColor;
    public String wallpaperGalleryTypeId;

    public AdInfo getAdInfo() {
        return getAdInfo(false);
    }

    public String getImageUrl(Context context) {
        String str;
        return (!C1819o.d2ok(context) || (str = this.darkModeImageUrl) == null) ? this.imageUrl : str;
    }

    public AdInfo getAdInfo(boolean checkDislike) {
        AdInfoResponse adInfoResponse = this.adInfo;
        if (adInfoResponse == null) {
            return null;
        }
        return adInfoResponse.getAdInfo(checkDislike);
    }
}

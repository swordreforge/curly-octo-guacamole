package com.android.thememanager.router.recommend.entity;

import android.content.Context;
import android.text.TextUtils;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.ad.model.AdInfoResponse;
import com.android.thememanager.basemodule.utils.C1819o;
import e5.zy;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UIProduct implements Serializable {
    private static final long serialVersionUID = 11;
    public AdInfoResponse adInfo;
    public String adTagId;
    public float auditScore;
    public String brief;
    public String colorRingId;
    public int currentPriceInCent;
    public String darkModeImageUrl;
    public List<Decoration> decorations;
    public String designerDescription;
    public String designerIcon;
    public String designerId;
    public int designerLevel;
    public String designerMiId;
    public String designerName;
    public String downloadCount;
    public String downloadUrl;
    public String eid;
    public String favoriteTime;
    public int fileSizeInKB;
    public String foldInnerImageUrl;
    public String gifUrl;
    public String imageUrl;
    public List<String> innerTags;
    public Boolean isPurchased;
    public Boolean like;
    public Integer likeCount;
    public UILink link;
    public String localPath;
    public boolean manualHide;
    public String name;
    public boolean offShelf;

    @zy(alternate = {"originPriceInCent"}, value = "originOriginPriceInCent")
    public int originPriceInCent;
    public String originalImageUrl;
    public String playtimeDisplay;
    public UIProduct product;
    public boolean productBought;
    public String productType;
    public String productUuid;
    public int purchasedPriceInCent;
    public String purchasedTime;
    public float score;
    public String shareUrl;
    public String snapshotAspectRatio;
    public String subjectUuid;
    public String suitId;
    public String title;
    public String traceId;
    public String trackId;
    public int uiVersion;
    public String uuid;
    public String videoUrl;
    public String wallpaperGalleryType;
    public String wallpaperGalleryTypeColor;
    public String wallpaperGalleryTypeId;
    public String widgetSize;
    public int widgetSizeCount;

    public AdInfo getAdInfo() {
        return getAdInfo(false);
    }

    public String getImageUrl(Context context) {
        return (!C1819o.d2ok(context) || TextUtils.isEmpty(this.darkModeImageUrl)) ? this.imageUrl : this.darkModeImageUrl;
    }

    public AdInfo getAdInfo(boolean checkDislike) {
        AdInfoResponse adInfoResponse = this.adInfo;
        if (adInfoResponse == null) {
            return null;
        }
        return adInfoResponse.getAdInfo(checkDislike);
    }

    public String getImageUrl(Context context, boolean isDarkMode) {
        if (isDarkMode && !TextUtils.isEmpty(this.darkModeImageUrl)) {
            return this.darkModeImageUrl;
        }
        return this.imageUrl;
    }
}

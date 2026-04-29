package com.android.thememanager.router.recommend.entity;

import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.ad.model.AdInfoResponse;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UIImageWithLink implements Serializable {
    public static final int AD_STYLE_18_9 = 1;
    public static final int AD_STYLE_1_2 = 2;
    private static final long serialVersionUID = 10;
    public AdInfoResponse adInfo;
    public int adStyle;
    public float auditScore;
    public String brief;
    public boolean canEncourage;
    public int currentPriceInCent;
    public String designerDescription;
    public String designerIcon;
    public String designerId;
    public int designerLevel;
    public String designerMiId;
    public String designerName;
    public String gifUrl;
    public String imageUrl;
    public int imgHeight;
    public int imgWidth;
    public int index;
    public List<String> innerTags;
    public UILink link;
    public int originPriceInCent;
    public UIProduct product;
    public int productCount;
    public String productUuid;
    public List<UIProduct> products;
    public float score;
    public String snapshotAspectRatio;
    public String suitId;
    public List<String> tags;
    public String title;
    public String videoUrl;
    public String wallpaperGalleryType;
    public String wallpaperGalleryTypeColor;
    public String wallpaperGalleryTypeId;

    public AdInfo getAdInfo() {
        return getAdInfo(false);
    }

    public AdInfo getAdInfo(boolean checkDislike) {
        AdInfoResponse adInfoResponse = this.adInfo;
        if (adInfoResponse == null) {
            return null;
        }
        return adInfoResponse.getAdInfo(checkDislike);
    }
}

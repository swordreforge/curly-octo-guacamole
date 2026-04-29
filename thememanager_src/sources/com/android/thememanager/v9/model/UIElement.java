package com.android.thememanager.v9.model;

import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.ad.model.AdInfoResponse;
import com.android.thememanager.model.RecommendItem;
import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import com.android.thememanager.router.recommend.entity.Feed;
import com.android.thememanager.v9.C2864i;
import java.util.List;
import z4.C7796k;

/* JADX INFO: loaded from: classes2.dex */
public class UIElement {
    public static final int AD_BANNER = 0;

    @Deprecated
    public static final int BANNER_HIDE_IMAGE = 28;
    public static final int BIG_IMAGE_BANNER = 25;
    public static final int BOTTOM_LOAD_MORE = 4;
    public static final int CLASS_LIST_DIVIDER = 60;

    @Deprecated
    public static final int DETAIL_AUTHOR_ATTENTION_HEAD = 94;

    @Deprecated
    public static final int DETAIL_AUTHOR_ATTENTION_LIST = 92;

    @Deprecated
    public static final int DETAIL_AUTHOR_DYNCMIC_FOOT = 95;

    @Deprecated
    public static final int DETAIL_AUTHOR_DYNCMIC_LIST = 93;

    @Deprecated
    public static final int DETAIL_COMMENT = 70;

    @Deprecated
    public static final int DETAIL_DESIGNER = 71;

    @Deprecated
    public static final int DETAIL_PRODUCT_DETAIL = 69;
    public static final int DETAIL_RECOMMEND_ITEM = 72;
    public static final int DETAIL_RECOMMEND_TITLE = 73;

    @Deprecated
    public static final int DETAIL_TOP_VIEW = 68;

    @Deprecated
    public static final int DETAIL_TOP_VIEW_V2 = 83;
    public static final int DIVIDER_ITEM = 27;
    public static final int DYNAMIC_STAGGERED_BANNER = 77;
    public static final int FONT_SIX_GRID = 24;
    public static final int FOOT_TIPS = Integer.MAX_VALUE;
    public static final int FOUR_GRID_BANNER_GROUP = 6;
    public static final int FOUR_GRID_BANNER_LIST_GROUP = 7;
    public static final int ICON_GROUPS = 2;
    public static final int ICON_GROUPS_EMPTY = 97;
    public static final int IMAGE_BANNER = 10;
    public static final int IMAGE_TEXT_BANNER = 26;

    @Deprecated
    public static final int LOCAL_BOTTOM_LOAD_MORE = 63;

    @Deprecated
    public static final int LOCAL_FONT_LIST_ITEM = 82;
    public static final int NORMAL_FONT_ITEM = 23;
    public static final int NORMAL_RINGTONE_AD_ITEM = 84;
    public static final int NORMAL_RINGTONE_ITEM = 18;
    public static final int NORMAL_THREE_THEME_GROUP = 5;
    public static final int NORMAL_THREE_WALLPAPER_GROUP = 11;
    public static final int NORMAL_TWO_VIDEO_WALLPAPER_GROUP = 65;
    public static final int PURE_AD_BANNER = 74;
    public static final int RANK_DETAIL_FONT = 40;
    public static final int RANK_DETAIL_RINGTONE = 39;
    public static final int RANK_DETAIL_TOP_IMAGE = 38;
    public static final int RANK_DETAIL_TOP_THREE_THEME = 36;
    public static final int RANK_DETAIL_TOP_THREE_WALLPAPER = 37;
    public static final int RANK_LIST_FONT = 35;
    public static final int RANK_LIST_RINGTONE = 34;
    public static final int RANK_LIST_THEME = 29;

    @Deprecated
    public static final int RANK_LIST_WALLPAPER = 30;
    public static final int RINGTONE_BANNER = 19;
    public static final int RINGTONE_RANKING = 21;
    public static final int RINGTONE_SINGLE = 22;
    public static final int RINGTONE_SUBJECT_LIST = 20;

    @Deprecated
    public static final int SEARCH_HISTORY = 67;

    @Deprecated
    public static final int SEARCH_HOT = 66;

    @Deprecated
    public static final int SLIDE_THREE_THEME_GROUP = 9;

    @Deprecated
    public static final int SLIDE_THREE_WALLPAPER_GROUP = 13;
    public static final int STAGGERED_AD_VIEW = 78;
    public static final int STAGGERED_BANNER = 61;
    public static final int STAGGERED_FONT_CATEGORY = 81;
    public static final int STAGGERED_FONT_SUBJECT = 80;
    public static final int STAGGERED_RINGTONE_SUBJECT = 79;

    @Deprecated
    public static final int STAGGERED_SMALL_AD_VIEW = 86;
    public static final int STAGGERED_THEME_CATEGORY = 76;
    public static final int STAGGERED_VIDEO_AD_VIEW = 85;
    public static final int STAGGERED_VIDEO_WALLPAPER_CATEGORY = 64;
    public static final int STAGGERED_WALLPAPER_CATEGORY = 62;
    public static final int STAGGERED_WALLPAPER_SETTING_ITEM = 88;
    public static final int STAGGERED_WALLPAPER_SETTING_TITLE = 89;
    public static final int TEXT_IMAGE_BANNER = 8;

    @Deprecated
    public static final int THEME_DETAIL_DESIGNER = 96;

    @Deprecated
    public static final int THEME_RANKING_GROUP = 44;
    public static final int TOP_BANNER = 1;
    public static final int TOP_TITLE = 3;

    @Deprecated
    public static final int WALLPAPER_ALIEN_SIX_GRID_LIST = 43;
    public static final int WALLPAPER_BANNER_LIST_BOTTOM = 17;
    public static final int WALLPAPER_BANNER_LIST_TOP = 16;
    public static final int WALLPAPER_CLASS_LIST_ITEM = 59;

    @Deprecated
    public static final int WALLPAPER_RANKING_GROUP = 12;
    public static final int WALLPAPER_SETTING_BANNER_GROUP = 90;
    public static final int WALLPAPER_SETTING_OFFLINE = 98;
    public static final int WALLPAPER_SETTING_TILE = 87;
    public static final int WALLPAPER_SIX_GRID = 14;
    public static final int WALLPAPER_THREE_GRID = 15;
    private static final long serialVersionUID = 6;
    public AdInfoResponse adInfo;
    public String backImageUrl;
    public List<UIImageWithLink> banners;
    public int cardTypeOrdinal;
    public ResourceCommentItem comment;
    public String designerId;
    public String designerMiId;
    public UIDesignerOverView designerOverView;
    public C7796k desinger;
    public boolean enableExpand;
    public long fansNum;
    public Feed feed;
    public boolean hasFollow;
    public List<List<UIIcon>> iconGroups;
    public UIImageWithLink imageBanner;
    public String imageUrl;
    public int index;
    public boolean isShowDivider;
    public UILink link;
    public List<UIImageWithLink> originBanners;
    public List<UIProduct> originProducts;
    public String pageUuid;
    public List<UIProduct> products;
    public List<RecommendItem> recommends;
    public List<String> searchTexts;
    public String subTitle;
    public int subType;
    public String subjectImageUrl;
    public String subjectTitle;
    public String subjectUuid;
    public UIThemeOverView themeOverView;
    public String title;
    public String topBannerImageUrl;
    public long total;
    public String trackId;
    public C2864i wallpaperHandler;

    public UIElement(int cardType) {
        this.cardTypeOrdinal = cardType;
    }

    public static boolean isRankList(int type) {
        return type == 29 || type == 30 || type == 34 || type == 35;
    }

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

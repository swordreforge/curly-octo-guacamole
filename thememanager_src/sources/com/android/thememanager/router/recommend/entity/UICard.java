package com.android.thememanager.router.recommend.entity;

import android.text.TextUtils;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.ad.model.AdInfoResponse;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UICard implements Serializable {
    public static final int AD_BANNER = 0;
    public static final int ALIEN_SIX_GRID_BANNER = 4;
    public static final int AOD_ENDLESS_LIST = 100;
    public static final int AOD_RECOMMENDATION_CARD = 98;
    public static final int AOD_SEARCH_SLIDE_LIST = 104;
    public static final int AOD_SLIDE_LIST = 99;
    public static final int BIG_IMAGE_BANNER = 6;
    public static final int CONCENTRATION_LIST_CARD = 86;
    public static final int CONCENTRATION_WALLPAPER_DYNAMIC_RECOMMENDATION_CARD = 85;
    public static final int DESIGNER_BANNER = 35;
    public static final int DESIGNER_ENDLESS_LIST = 26;
    public static final int DESIGNER_NORMAL_LIST = 13;
    public static final int DESIGNER_RANKING_LIST = 21;
    public static final int FONT_ENDLESS_LIST = 25;
    public static final int FONT_NORMAL_LIST = 12;
    public static final int FONT_RANKING_LIST = 20;
    public static final int FOUR_GRID_BANNER = 2;
    public static final int FOUR_GRID_BANNER_LIST = 32;
    public static final int HOME_PAGE_HYBRID_MARQUEE_CARD = 149;
    public static final int HOME_PAGE_HYBRID_SIX_GRID_CARD = 148;
    public static final int HOME_PAGE_SLIDE_AD_CARD = 150;
    public static final int HYBRID_RECOMMENDATION_CARD = 75;
    public static final int ICONS_CHOSEN_CARD = 102;
    public static final int ICONS_RECOMMENDATION_CARD = 101;
    public static final int ICONS_SUBJECTS_CARD = 103;
    public static final int IMAGE_BANNER = 5;
    public static final int IMAGE_TEXT_BANNER = 7;
    public static final int LARGE_ICONS_APP_RECOMMENDATION_CARD = 138;
    public static final int LARGE_ICONS_APP_SEARCH_CARD = 139;
    public static final int LARGE_ICONS_ONE_SLIDE_CARD = 135;
    public static final int LARGE_ICONS_TWO_SLIDE_CARD = 136;
    public static final int LARGE_ICON_HOT_APP_CARD = 134;
    public static final int LARGE_ICON_PRODUCT_ITEM = 144;
    public static final int LIVE_WALLPAPER_SLIDE_LIST = 16;
    public static final int NATIVE_AD_BIG = 57;
    public static final int NATIVE_AD_SMALL = 56;
    public static final int PICKER_BOTTOM_LARGE_ICON_ITEM = 145;
    public static final int PRODUCT_CATEGORY = 33;
    public static final int PURE_AD_BANNER = 72;
    public static final int RANK_DETAIL_FONT_ENDLESS_LIST = 44;
    public static final int RANK_DETAIL_RINGTONE_ENDLESS_LIST = 43;
    public static final int RANK_DETAIL_THEME_ENDLESS_LIST = 41;
    public static final int RANK_DETAIL_WALLPAPER_ENDLESS_LIST = 42;
    public static final int RANK_LIST_FONT_LIST = 40;
    public static final int RANK_LIST_RINGTONE_LIST = 39;
    public static final int RANK_LIST_THEME_LIST = 37;
    public static final int RANK_LIST_WALLPAPER_LIST = 38;
    public static final int RECOMMEND_BOTTOM_ITEM = 127;
    public static final int RECOMMEND_BOTTOM_LARGE_ICON_ITEM = 143;
    public static final int RINGTONE_BANNER_LIST = 29;
    public static final int RINGTONE_ENDLESS_LIST = 24;
    public static final int RINGTONE_NORMAL_LIST = 11;
    public static final int RINGTONE_RANKING_LIST = 19;
    public static final int RINGTONE_SINGLE = 28;
    public static final int RINGTONE_SUBJECT_LIST = 27;
    public static final int RINGTONE_SUIT = 34;
    public static final int SEARCH_HISTORY = 66;
    public static final int SEARCH_HOT = 63;
    public static final int SIX_GRID_BANNER = 3;
    public static final int TEXT_IMAGE_BANNER = 8;
    public static final int THEME_DESIGNER_OVERVIEW_CARD = 68;
    public static final int THEME_DETAIL_CARD = 69;
    public static final int THEME_DETAIL_RECOMMENDATION_CARD = 71;
    public static final int THEME_ENDLESS_LIST = 22;
    public static final int THEME_FOLD_LIST = 125;
    public static final int THEME_NORMAL_LIST = 9;
    public static final int THEME_OVERVIEW_CARD = 67;
    public static final int THEME_OVERVIEW_CARD_V2 = 76;
    public static final int THEME_RANKING_LIST = 17;
    public static final int THEME_RECOMMENDATION_CARD_THREE_COLUMNS = 74;
    public static final int THEME_RECOMMENDATION_CARD_TWO_COLUMNS = 73;
    public static final int THEME_SEARCH_RESULT = 97;
    public static final int THEME_SLIDE_LIST = 14;
    public static final int THEME_TOPCOMMENT_CARD = 70;
    public static final int TOP_BANNER = 1;
    public static final int VIDEO_WALLPAPER_ENDLESS_LIST = 65;
    public static final int VIDEO_WALLPAPER_RECOMMENDATION_CARD = 62;
    public static final int VIDEO_WALLPAPER_SEARCH_LIST = 64;
    public static final int WALLPAPER_ALIEN_SIX_GRID_LIST = 36;
    public static final int WALLPAPER_BANNER_LIST = 31;
    public static final int WALLPAPER_CLASS_LIST = 58;
    public static final int WALLPAPER_ENDLESS_LIST = 23;
    public static final int WALLPAPER_NORMAL_LIST = 10;
    public static final int WALLPAPER_RANKING_LIST = 18;
    public static final int WALLPAPER_RECOMMENDATION_CARD = 59;
    public static final int WALLPAPER_SEARCH_TAG_LIST = 60;
    public static final int WALLPAPER_SETTING_STAGGER_CARD = 95;
    public static final int WALLPAPER_SLIDE_LIST = 15;
    public static final int WALLPAPER_THREE_GRID = 30;
    public static final int WIDGET_INTRODUCTION_CARD = 131;
    public static final int WIDGET_SLIDE_CARD = 130;
    public static final int WIDGET_SUIT = 129;
    public static final int WIDGET_SUIT_SUBJECT = 132;
    private static final long serialVersionUID = 8;
    public String adEid;
    public AdInfoResponse adInfo;
    public String backImageUrl;
    public List<UIImageWithLink> banners;
    public String cardType;
    public int cardTypeOrdinal;
    public String cardUuid;
    public String content;
    public String darkTitlePic;
    public String deepLink;
    public List<String> eids;
    public String expLayer;
    public List<UIImageWithLink> gridBanners;
    public String guide;
    public boolean hasMore;
    public List<String> hoverDisplayPosition;
    public List<List<UIIcon>> iconGroups;
    public UIImageWithLink imageBanner;
    public String imageUrl;
    public boolean isNonStanAd;
    public UILink link;
    public List<UIImageWithLink> loopImages;
    public String packageName;
    public String pageUuid;
    public int popDisplayTimes;
    public int productCount;
    public List<UIProduct> products;
    public boolean recommend;
    public List<UIImageWithLink> recommends;
    public List<UISubject> rightSubjects;
    public List<String> searchTexts;
    public boolean showPrice;
    public String subTitle;
    public UISubject subject;
    public String subjectUuid;
    public List<UISubject> subjects;
    public String title;
    public String titlePic;
    public String topBannerImageUrl;
    public UIImageWithLink topImage;
    public String trackId;

    public interface Verify {
        public static final int PAGEID = 8;
        public static final int PAGEID_PRODUCT = 24;
        public static final int PRODUCT = 16;
        public static final int SUBJECTID = 4;
        public static final int SUBTITLE = 2;
        public static final int TITLE = 1;
        public static final int TITLE_PAGEID_PRODUCT = 25;
        public static final int TITLE_SUBJECTID_PRODUCT = 21;
        public static final int TITLE_SUBJECTID_TOPBANNERIMAGE = 37;
        public static final int TOPBANNERIMAGE = 32;
    }

    public UICard(int cardType) {
        this.cardTypeOrdinal = cardType;
    }

    public AdInfo getAdInfo() {
        return getAdInfo(false);
    }

    public List<AdInfo> getAdInfos(boolean checkDislike) {
        AdInfoResponse adInfoResponse = this.adInfo;
        if (adInfoResponse == null) {
            return null;
        }
        return adInfoResponse.getAdInfos(checkDislike);
    }

    public boolean isAuthorized(int verify) {
        List<UIProduct> list;
        if ((verify & 1) != 0 && TextUtils.isEmpty(this.title)) {
            return false;
        }
        if ((verify & 2) != 0 && TextUtils.isEmpty(this.subTitle)) {
            return false;
        }
        if ((verify & 4) != 0 && TextUtils.isEmpty(this.subjectUuid)) {
            return false;
        }
        if ((verify & 8) != 0 && TextUtils.isEmpty(this.pageUuid)) {
            return false;
        }
        if ((verify & 16) == 0 || ((list = this.products) != null && list.size() >= 3)) {
            return (verify & 32) == 0 || !TextUtils.isEmpty(this.topBannerImageUrl);
        }
        return false;
    }

    public AdInfo getAdInfo(boolean checkDislike) {
        AdInfoResponse adInfoResponse = this.adInfo;
        if (adInfoResponse == null) {
            return null;
        }
        return adInfoResponse.getAdInfo(checkDislike);
    }
}

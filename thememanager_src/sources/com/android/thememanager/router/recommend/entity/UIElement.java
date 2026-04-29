package com.android.thememanager.router.recommend.entity;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UIElement {
    public static final int AD_BANNER = 0;
    public static final int AOD_PRODUCT_ITEM = 111;
    public static final int AOD_RECOMMEND_ITEM = 109;
    public static final int AOD_SLIDE_LIST = 110;
    public static final int BIG_IMAGE_BANNER = 25;
    public static final int BOTTOM_LOAD_MORE = 4;
    public static final int CLASS_LIST_DIVIDER = 60;
    public static final int CONCENTRATION_LIST = 98;
    public static final int CONCENTRATION_RECOMMEND = 99;
    public static final int DETAIL_AUTHOR_ATTENTION_HEAD = 94;
    public static final int DETAIL_AUTHOR_ATTENTION_LIST = 92;
    public static final int DETAIL_AUTHOR_DYNCMIC_LIST = 93;
    public static final int DETAIL_RECOMMEND_ITEM = 72;
    public static final int DETAIL_RECOMMEND_TITLE = 73;
    public static final int DIVIDER_ITEM = 27;
    public static final int DYNAMIC_STAGGERED_BANNER = 77;
    public static final int FOLD_THEME_RECOMMEND = 119;
    public static final int FONT_SIX_GRID = 24;
    public static final int FONT_WALLPAPER_CLASS_LIST_ITEM = 102;
    public static final int FOOT_TIPS = 1001;
    public static final int FOUR_GRID_BANNER_GROUP = 6;
    public static final int FOUR_GRID_BANNER_LIST_GROUP = 7;
    public static final int FOUR_LARGE_FOUR_ITEM_TITLE_CARD = 129;
    public static final int HOMEPAGE_SILDE_AD_CARD = 137;
    public static final int HOME_PAGE_HYBRID_RECOMMEND_MARQUEE_CARD = 136;
    public static final int HOME_PAGE_HYBRID_RECOMMEND_SIX_GRID_CARD = 135;
    public static final int ICON_CHOSEN_ITEM = 114;
    public static final int ICON_GROUPS = 2;
    public static final int ICON_GROUPS_EMPTY = 97;
    public static final int ICON_RECOMMEND_ITEM = 113;
    public static final int ICON_SUBJECTS_ITEM = 115;
    public static final int IMAGE_BANNER = 10;
    public static final int IMAGE_TEXT_BANNER = 26;
    public static final int LARGE_ICON_HOME_RECOMMEND_CARD = 131;
    public static final int LARGE_ICON_HOT_APP_CARD = 130;
    public static final int LARGE_ICON_PACKAGE_CATEGORY_CARD = 126;
    public static final int LARGE_ICON_PRODUCT_ITEM = 128;
    public static final int LARGE_ICON_TWO_ITEM_CARD = 127;
    public static final int LIST_FOOT = 100;
    public static final int MARGIN_ITEM = 1000;
    public static final int NORMAL_DETAIL_RINGTONE_ITEM = 101;
    public static final int NORMAL_FONT_AD_ITEM = 120;
    public static final int NORMAL_FONT_ITEM = 23;
    public static final int NORMAL_RINGTONE_AD_ITEM = 84;
    public static final int NORMAL_RINGTONE_ITEM = 18;
    public static final int NORMAL_THREE_THEME_GROUP = 5;
    public static final int NORMAL_THREE_WALLPAPER_GROUP = 11;
    public static final int NORMAL_TWO_VIDEO_WALLPAPER_GROUP = 65;
    public static final int PERSONALIZE_RECOMMEND_TITLE = 134;
    public static final int PURE_AD_BANNER = 74;
    public static final int PURE_AD_DSP_BANNER = 133;
    public static final int RANK_DETAIL_FONT = 40;
    public static final int RANK_DETAIL_RINGTONE = 39;
    public static final int RANK_DETAIL_TOP_IMAGE = 38;
    public static final int RANK_DETAIL_TOP_THREE_THEME = 36;
    public static final int RANK_DETAIL_TOP_THREE_WALLPAPER = 37;
    public static final int RANK_LIST_FONT = 35;
    public static final int RANK_LIST_RINGTONE = 34;
    public static final int RANK_LIST_THEME = 29;
    public static final int RECOMMEND_BOTTOM_ITEM = 121;
    public static final int RECOMMEND_BOTTOM_LARGE_ICON_ITEM = 132;
    public static final int RINGTONE_BANNER = 19;
    public static final int RINGTONE_RANKING = 21;
    public static final int RINGTONE_SINGLE = 22;
    public static final int RINGTONE_SUBJECT_LIST = 20;
    public static final int SEARCH_AOD_LIST = 108;
    public static final int SEARCH_FONT_LIST = 106;
    public static final int SEARCH_HINT_HISTORY = 118;
    public static final int SEARCH_HINT_HOT = 117;
    public static final int SEARCH_ICON_LIST = 116;
    public static final int SEARCH_RINGTONE_LIST = 107;
    public static final int SEARCH_THEME_LIST = 103;
    public static final int SEARCH_VIDEOWALLPAPER_LIST = 105;
    public static final int SEARCH_WALLPAPER_LIST = 104;
    public static final int SETTING_STAGGER_LOCAL_BANNER_GROUP = 90;
    public static final int STAGGERED_AD_VIEW = 78;
    public static final int STAGGERED_BANNER = 61;
    public static final int STAGGERED_FONT_CATEGORY = 81;
    public static final int STAGGERED_FONT_SUBJECT = 80;
    public static final int STAGGERED_RINGTONE_SUBJECT = 79;
    public static final int STAGGERED_THEME_CATEGORY = 76;
    public static final int STAGGERED_VIDEO_AD_VIEW = 85;
    public static final int STAGGERED_VIDEO_WALLPAPER_CATEGORY = 64;
    public static final int STAGGERED_WALLPAPER_CATEGORY = 62;
    public static final int STAGGERED_WALLPAPER_SETTING_ITEM = 88;
    public static final int STAGGERED_WALLPAPER_SETTING_TITLE = 89;
    private static final String TAG = "UIElement";
    public static final int TEXT_IMAGE_BANNER = 8;
    public static final int TOP_BANNER = 1;
    public static final int TOP_TITLE = 3;
    public static final int WALLPAPER_BANNER_LIST_BOTTOM = 17;
    public static final int WALLPAPER_BANNER_LIST_TOP = 16;
    public static final int WALLPAPER_CLASS_LIST_ITEM = 59;
    public static final int WALLPAPER_SETTING_OFFLINE = 91;
    public static final int WALLPAPER_SETTING_TILE = 87;
    public static final int WALLPAPER_SIX_GRID = 14;
    public static final int WALLPAPER_THREE_GRID = 15;
    public static final int WIDGET_INTRODUCTIONS_IMG = 124;
    public static final int WIDGET_SLIDE = 123;
    public static final int WIDGET_SUBJECT_ITEM = 125;
    public static final int WIDGET_SUIT = 122;
    private static final long serialVersionUID = 6;
    private int cardTypeOrdinal;

    protected UIElement(int cardType) {
        this.cardTypeOrdinal = cardType;
    }

    public static boolean isRankDetail(int elementType) {
        return elementType == 39 || elementType == 40 || elementType == 38;
    }

    public int getCardTypeOrdinal() {
        return this.cardTypeOrdinal;
    }
}

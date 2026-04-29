package com.android.thememanager.v9.model;

import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.toq;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.views.nav.C1857k;

/* JADX INFO: loaded from: classes2.dex */
public class NavItemFac implements toq {
    public static final String NAV_ATTENTION = "attention";
    public static final String NAV_DAILY = "daily";
    public static final String NAV_DYNAMICS = "dynamics";
    public static final String NAV_HOME_PAGE = "homepage";
    public static final String NAV_HYBRID = "hybrid";
    public static final String NAV_MINE = "mine";
    public static final String NAV_RESOURCE_CATEGORY = "resourcecategory";

    public static class NavItemFactory {
        public static C1857k create(String id) {
            boolean zD2ok = C1819o.d2ok(bf2.toq.toq());
            if ("theme".equals(id)) {
                return new C1857k("theme", R.drawable.nav_theme_item_selector, R.string.theme_component_title_all);
            }
            if ("wallpaper".equals(id)) {
                return new C1857k("wallpaper", R.drawable.nav_wallpaper_item_selector, R.string.component_title_wallpaper);
            }
            if ("videowallpaper".equals(id)) {
                return new C1857k("videowallpaper", R.drawable.nav_videowallpaper_item_selector, R.string.component_title_video_wallpaper);
            }
            if ("ringtone".equals(id)) {
                return new C1857k("ringtone", R.drawable.nav_ringtone_item_selector, R.string.theme_component_title_ringtone);
            }
            if ("fonts".equals(id)) {
                return new C1857k("fonts", R.drawable.nav_font_item_selector, R.string.theme_component_title_font);
            }
            if ("mine".equals(id)) {
                return new C1857k("mine", zD2ok ? R.raw.me_pressed_night : R.raw.me_pressed, R.string.account_info);
            }
            if ("daily".equals(id)) {
                return new C1857k("daily", zD2ok ? R.raw.daily_night : R.raw.daily, R.string.home_daily);
            }
            if ("homepage".equals(id)) {
                return new C1857k("homepage", zD2ok ? R.raw.home_pressed_night : R.raw.home_pressed, R.string.theme_component_title_homepage);
            }
            if ("resourcecategory".equals(id)) {
                return new C1857k("resourcecategory", zD2ok ? R.raw.groups_pressed_night : R.raw.groups_pressed, R.string.resource_category);
            }
            if ("attention".equals(id)) {
                return new C1857k("", 0, R.string.author_attention);
            }
            if ("dynamics".equals(id)) {
                return new C1857k("", 0, R.string.author_dynamic);
            }
            return null;
        }
    }

    public static class NavTopItemFactory {
        public static C1857k create(String id) {
            if ("hybrid".equals(id)) {
                return new C1857k("hybrid", R.drawable.banner_text_bottom, R.string.theme_detail_tab_recommend);
            }
            if ("theme".equals(id)) {
                return new C1857k("theme", R.drawable.banner_text_bottom, R.string.theme_component_title_all);
            }
            if ("wallpaper".equals(id)) {
                return new C1857k("wallpaper", R.drawable.banner_text_bottom, R.string.component_title_wallpaper);
            }
            if ("videowallpaper".equals(id)) {
                return new C1857k("videowallpaper", R.drawable.banner_text_bottom, R.string.live_wallpaper);
            }
            if ("ringtone".equals(id)) {
                return new C1857k("ringtone", R.drawable.banner_text_bottom, R.string.theme_component_title_ringtone);
            }
            if ("fonts".equals(id)) {
                return new C1857k("fonts", R.drawable.banner_text_bottom, R.string.theme_component_title_font);
            }
            return null;
        }
    }
}

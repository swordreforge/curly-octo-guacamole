package com.android.thememanager.settings.superwallpaper.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.provider.Settings;
import com.android.thememanager.R;

/* JADX INFO: compiled from: UIUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj {
    private qrj() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m9298k(Activity activity) {
        return Settings.Global.getInt(activity.getContentResolver(), "force_fsg_nav_bar", 0) == 0;
    }

    public static int toq(int level) {
        int i2 = level % 6;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? R.drawable.thumbnail_big_corner_bg_yellow : R.drawable.thumbnail_big_corner_bg_light_purple : R.drawable.thumbnail_big_corner_bg_light_blue : R.drawable.thumbnail_big_corner_bg_sky_blue : R.drawable.thumbnail_big_corner_bg_light_pink : R.drawable.thumbnail_big_corner_bg_pink : R.drawable.thumbnail_big_corner_bg_yellow;
    }

    public static int zy(Activity activity) {
        Resources resources = activity.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier <= 0 || !m9298k(activity)) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }
}

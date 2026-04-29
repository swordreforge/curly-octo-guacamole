package com.android.thememanager.module;

import com.android.thememanager.basemodule.utils.lrht;
import com.miui.maml.MamlConfigSettings;
import miui.content.res.ThemeResources;
import miui.os.UserHandle;
import yz.C7794k;

/* JADX INFO: loaded from: classes2.dex */
public class DependencyUtils {

    public static class MamlWrapper {
        public static final String MamlSettingClass = MamlConfigSettings.class.getName();
        public static String EXTRA_MAML_CODE = MamlConfigSettings.EXTRA_MAML_CODE;
        public static String EXTRA_MAML_ID = MamlConfigSettings.EXTRA_MAML_ID;

        public static boolean mamlContainsLockStyleConfig() {
            return ThemeResources.getSystem().containsAwesomeLockscreenEntry("config.xml");
        }
    }

    public static String getAppliedLockstyleConfigPath() {
        return "/data/system/theme/config.config";
    }

    public static String getThemeRightPath() {
        return "/data/system/theme/rights/";
    }

    public static String getThemeRuntimePath() {
        return "/data/system/theme/";
    }

    public static String getThemeVersionCompatibilityPath() {
        String str = (String) lrht.m7119q(ThemeResources.class, "THEME_VERSION_COMPATIBILITY_PATH", null);
        if (str != null && str.startsWith("/data/system/theme/") && str.contains("compatibility")) {
            return str;
        }
        C7794k.f7l8("init compatibility path fail.");
        return "/data/system/theme/compatibility-v12/";
    }

    public static int getUserHandleId() {
        return UserHandle.myUserId();
    }
}

package mbx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.thememanager.R;
import com.android.thememanager.ThemeResourceTabActivity;
import com.android.thememanager.activity.WallpaperDetailActivity;
import com.android.thememanager.detail.video.view.activity.VideoDetailActivity;
import com.android.thememanager.module.detail.view.ThemeDetailActivity;
import com.android.thememanager.recommend.view.activity.RecommendActivity;
import com.android.thememanager.v9.WallpaperSubjectActivity;

/* JADX INFO: renamed from: mbx.k */
/* JADX INFO: compiled from: PhonePadUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C6812k {
    public static boolean f7l8(Activity activity) {
        return (activity instanceof ThemeDetailActivity) || (activity instanceof ThemeResourceTabActivity) || (activity instanceof WallpaperSubjectActivity) || (activity instanceof WallpaperDetailActivity) || (activity instanceof RecommendActivity) || (activity instanceof VideoDetailActivity);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m24741g(Activity activity) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static Intent m24742k(Context context, Bundle bundle) {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static Intent m24743n(Activity activity) {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static String m24744q(String code) {
        return null;
    }

    public static int toq() {
        return R.raw.lock_function_tip_phone;
    }

    public static Intent zy(Context context, int ringtoneFlag) {
        return null;
    }
}

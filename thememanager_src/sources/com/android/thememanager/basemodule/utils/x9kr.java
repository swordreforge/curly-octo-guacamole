package com.android.thememanager.basemodule.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.thememanager.R;

/* JADX INFO: compiled from: ResourceIntentUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class x9kr {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f57817f7l8 = "miback";

    /* JADX INFO: renamed from: g */
    public static final String f10438g = "miref";

    /* JADX INFO: renamed from: k */
    private static final String f10439k = "theme://com.miui.miwallpaper/superwallpaper/setting";

    /* JADX INFO: renamed from: n */
    public static final String f10440n = "need_back_to_previous_app";

    /* JADX INFO: renamed from: q */
    public static final String f10441q = "enter_from_push_action";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f57818toq = "exit_to_data_scheme_app";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f57819zy = "enter_from_data_scheme";

    /* JADX INFO: renamed from: g */
    public static boolean m7239g(Context context, Uri originUri, String originUrlString) {
        try {
            context.startActivity(toq(originUri, originUrlString));
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            nn86.toq(context.getString(R.string.resource_no_match_app), 0);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m7240k(Uri originUri, String originUrlString, String refInfo) {
        if (TextUtils.isEmpty(refInfo) || TextUtils.isEmpty(originUrlString)) {
            return originUrlString;
        }
        if (originUri == null) {
            originUri = Uri.parse(originUrlString);
        }
        StringBuilder sb = new StringBuilder(originUrlString);
        if (originUri.isHierarchical() && TextUtils.isEmpty(originUri.getQueryParameter(f10438g))) {
            if (TextUtils.isEmpty(originUri.getQuery())) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append("miref=" + refInfo);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public static Intent m7241n() {
        if (!bf2.toq.m5810g()) {
            return null;
        }
        Intent intent = new Intent();
        intent.setClassName("com.android.thememanager", "com.android.thememanager.settings.ThemeAndWallpaperSettingActivity");
        intent.setFlags(335544320);
        return intent;
    }

    /* JADX INFO: renamed from: q */
    public static String m7242q(Intent intent, String tag, Uri originUri, String originUrlString) {
        if (originUri == null && !TextUtils.isEmpty(originUrlString)) {
            originUri = Uri.parse(originUrlString);
        }
        String queryParameter = null;
        if (originUri != null && originUri.isHierarchical()) {
            queryParameter = originUri.getQueryParameter(tag);
        }
        return (!TextUtils.isEmpty(queryParameter) || intent == null) ? queryParameter : intent.getStringExtra(tag);
    }

    public static Intent toq(Uri originUri, String originUrlString) {
        Intent intentM7241n;
        try {
            if (f10439k.equals(originUrlString) && (intentM7241n = m7241n()) != null) {
                return intentM7241n;
            }
            String packageName = bf2.toq.toq().getPackageName();
            Intent uri = Intent.parseUri(m7240k(originUri, originUrlString, packageName), 1);
            if (TextUtils.isEmpty(originUrlString) || !"widget".equals(Uri.parse(originUrlString).getScheme())) {
                uri.addCategory("android.intent.category.BROWSABLE");
            } else {
                uri.removeCategory("android.intent.category.BROWSABLE");
            }
            uri.setFlags(335544320);
            uri.putExtra(f10438g, packageName);
            uri.putExtra(f57818toq, true);
            uri.setComponent(null);
            uri.setSelector(null);
            return uri;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new Intent("android.intent.action.VIEW", Uri.parse(originUrlString));
        }
    }

    public static Intent zy(String originUrlString) {
        return toq(null, originUrlString);
    }
}

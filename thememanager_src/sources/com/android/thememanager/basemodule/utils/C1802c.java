package com.android.thememanager.basemodule.utils;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.thememanager.C2965z;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.C2789j;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.c */
/* JADX INFO: compiled from: ThemeIntentFlattenUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C1802c {

    /* JADX INFO: renamed from: k */
    public static final String f10282k = "http";

    /* JADX INFO: renamed from: q */
    public static final String f10283q = "zhuti.xiaomi.com";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f57722toq = "https";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f57723zy = "theme";

    /* JADX INFO: renamed from: k */
    public static void m7008k(Intent startIntent) {
        if (startIntent != null) {
            String stringExtra = startIntent.getStringExtra(x9kr.f10438g);
            Uri data = startIntent.getData();
            if (data != null && data.getPath() != null && ("http".equals(data.getScheme()) || "theme".equals(data.getScheme()) || "https".equals(data.getScheme()))) {
                m7009n(startIntent);
                String strM7242q = x9kr.m7242q(startIntent, x9kr.f10438g, data, null);
                if (TextUtils.isEmpty(strM7242q)) {
                    strM7242q = "unkown";
                }
                stringExtra = strM7242q;
                startIntent.putExtra(x9kr.f10440n, data.getBooleanQueryParameter(x9kr.f57817f7l8, false));
                startIntent.putExtra(x9kr.f57819zy, true);
            }
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            com.android.thememanager.basemodule.analysis.f7l8.toq(startIntent, stringExtra);
        }
    }

    /* JADX INFO: renamed from: n */
    private static void m7009n(Intent startIntent) {
        Uri data = startIntent.getData();
        if (data.isHierarchical()) {
            for (String str : data.getQueryParameterNames()) {
                String strSubstring = str.length() > 2 ? str.substring(2) : "";
                String queryParameter = data.getQueryParameter(str);
                try {
                    if (str.startsWith("S.")) {
                        startIntent.putExtra(strSubstring, queryParameter);
                    } else if (str.startsWith("B.")) {
                        startIntent.putExtra(strSubstring, Boolean.parseBoolean(queryParameter));
                    } else if (str.startsWith("b.")) {
                        startIntent.putExtra(strSubstring, Byte.parseByte(queryParameter));
                    } else if (str.startsWith("c.")) {
                        startIntent.putExtra(strSubstring, queryParameter.charAt(0));
                    } else if (str.startsWith("d.")) {
                        startIntent.putExtra(strSubstring, Double.parseDouble(queryParameter));
                    } else if (str.startsWith("f.")) {
                        startIntent.putExtra(strSubstring, Float.parseFloat(queryParameter));
                    } else if (str.startsWith("i.")) {
                        startIntent.putExtra(strSubstring, Integer.parseInt(queryParameter));
                    } else if (str.startsWith("l.")) {
                        startIntent.putExtra(strSubstring, Long.parseLong(queryParameter));
                    } else if (str.startsWith("s.")) {
                        startIntent.putExtra(strSubstring, Short.parseShort(queryParameter));
                    }
                } catch (NumberFormatException e2) {
                    C2789j.qrj(C2755a.f16307g, e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m7010q(String dataUri) {
        if (TextUtils.isEmpty(dataUri)) {
            return false;
        }
        Uri uri = Uri.parse(dataUri);
        String scheme = uri.getScheme();
        return ("http".equals(scheme) || "https".equals(scheme) || "theme".equals(scheme)) && "zhuti.xiaomi.com".equals(uri.getAuthority());
    }

    public static boolean toq(Intent intent) {
        return intent != null && C2965z.f17864k.equals(intent.getAction());
    }

    public static boolean zy(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        return "miui.intent.action.PICK_RESOURCE".equals(action) || "miui.intent.action.PICK_GADGET".equals(action) || "android.intent.action.RINGTONE_PICKER".equals(action) || C2965z.f17864k.equals(action);
    }
}

package com.android.thememanager.basemodule.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import java.io.File;
import java.net.URI;

/* JADX INFO: compiled from: UriUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class ek5k {

    /* JADX INFO: renamed from: k */
    public static final String f10301k = "UriUtils";

    /* JADX INFO: renamed from: k */
    private static String m7043k(Context context, Uri uri, String column) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{column}, null, null, null);
            if (cursorQuery != null) {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                cursorQuery.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return string != null ? string.replace("product", "system") : "";
    }

    /* JADX INFO: renamed from: n */
    public static URI m7044n(String url) {
        String str;
        String str2;
        String strSubstring;
        String strSubstring2;
        try {
            i1 i1Var = new i1(new String(URLUtil.decode(url.getBytes())));
            String strZy = i1Var.zy();
            if (strZy.length() > 0) {
                int iLastIndexOf = strZy.lastIndexOf(35);
                if (iLastIndexOf != -1) {
                    strSubstring2 = strZy.substring(iLastIndexOf + 1);
                    strZy = strZy.substring(0, iLastIndexOf);
                } else {
                    strSubstring2 = null;
                }
                int iLastIndexOf2 = strZy.lastIndexOf(63);
                if (iLastIndexOf2 != -1) {
                    String strSubstring3 = strZy.substring(iLastIndexOf2 + 1);
                    strSubstring = strZy.substring(0, iLastIndexOf2);
                    str = strSubstring3;
                } else {
                    str = null;
                    strSubstring = strZy;
                }
                str2 = strSubstring2;
            } else {
                str = null;
                str2 = null;
                strSubstring = strZy;
            }
            return new URI(i1Var.m7097n(), i1Var.m7096k(), i1Var.toq(), i1Var.m7099q(), strSubstring, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static Uri m7045q(String path) {
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        Uri uri = Uri.parse(path);
        return uri.getScheme() == null ? Uri.fromFile(new File(path)) : uri;
    }

    public static String toq(Uri uri) {
        return zy(uri, true);
    }

    public static String zy(Uri uri, boolean recursive) {
        if (uri == null) {
            return "";
        }
        if (!C1781k.zy()) {
            Log.e(f10301k, "User permission denied for reading local media files!");
            return "";
        }
        Context qVar = bf2.toq.toq();
        String string = uri.toString();
        String scheme = uri.getScheme();
        if (!"content".equals(scheme) || !recursive) {
            return "file".equals(scheme) ? uri.getPath() : string;
        }
        String authority = uri.getAuthority();
        if ("settings".equals(authority)) {
            string = m7043k(qVar, uri, "value");
        } else if ("media".equals(authority)) {
            string = m7043k(qVar, uri, "_data");
        } else if (com.android.thememanager.basemodule.resource.constants.toq.o9qk.equals(authority)) {
            string = uri.getPath();
            if (!TextUtils.isEmpty(string) && string.startsWith("/external-files-MIUI/")) {
                string = string.replace("/external-files-MIUI/", C1788k.f10175k);
            }
        }
        Uri uri2 = Uri.parse(string);
        return (uri2.getScheme() == null || uri2.equals(uri)) ? string : zy(uri2, true);
    }
}

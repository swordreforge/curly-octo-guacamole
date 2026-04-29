package com.android.thememanager.comment.util;

import android.content.Context;
import android.text.TextUtils;
import com.android.thememanager.R;
import java.util.Locale;

/* JADX INFO: renamed from: com.android.thememanager.comment.util.q */
/* JADX INFO: compiled from: ResourceCommentUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1881q {
    /* JADX INFO: renamed from: k */
    public static String m7422k() {
        return Locale.getDefault().getLanguage().startsWith("zh") ? "：" : ":";
    }

    /* JADX INFO: renamed from: q */
    public static String m7423q(Context context) {
        return Locale.getDefault().getLanguage().startsWith("zh") ? "回复" : "@";
    }

    public static String toq() {
        return Locale.getDefault().getLanguage().startsWith("zh") ? "：" : ": ";
    }

    public static String zy(Context context, String userName) {
        return TextUtils.isEmpty(userName) ? context.getString(R.string.resource_comment_name_default) : userName;
    }
}

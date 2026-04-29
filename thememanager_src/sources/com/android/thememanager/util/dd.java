package com.android.thememanager.util;

import android.graphics.Typeface;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: compiled from: FontUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class dd {

    /* JADX INFO: renamed from: k */
    public static final String f16402k = "mipro-medium";

    /* JADX INFO: renamed from: q */
    public static final String f16403q = "mipro-light";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f61228toq = "mipro";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f61229zy = "mipro-normal";

    /* JADX INFO: renamed from: k */
    public static void m9704k(TextView view, String familyName) {
        if (com.android.thememanager.basemodule.utils.o1t.n7h()) {
            view.setTypeface(Typeface.create(familyName, 0));
        }
    }

    public static void toq(TextView view, String familyName_zh, String familyName_en) {
        if (Locale.getDefault().getLanguage().startsWith("zh")) {
            m9704k(view, familyName_zh);
        } else {
            zy(view, familyName_en);
        }
    }

    public static void zy(TextView view, String familyName) {
        view.setTypeface(Typeface.createFromAsset(bf2.toq.toq().getAssets(), familyName));
    }
}

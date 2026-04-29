package com.android.thememanager.util;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.model.Resource;

/* JADX INFO: compiled from: WallpaperTrackData.java */
/* JADX INFO: loaded from: classes2.dex */
public class jbh {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f61311cdj = "id";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f61312f7l8 = "video";

    /* JADX INFO: renamed from: g */
    public static final String f16567g = "loop_image";

    /* JADX INFO: renamed from: h */
    public static final String f16568h = "type";

    /* JADX INFO: renamed from: i */
    public static final String f16569i = "valid";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f61313ki = "name";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f61314kja0 = "unknown";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f61315ld6 = "system";

    /* JADX INFO: renamed from: n */
    public static final String f16570n = "single_image";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f61316n7h = "pictorial";

    /* JADX INFO: renamed from: p */
    public static final String f16571p = "default";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f61317qrj = "theme";

    /* JADX INFO: renamed from: s */
    public static final String f16572s = "maml";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f61318t8r = "source";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f61319x2 = "photo";

    /* JADX INFO: renamed from: y */
    public static final String f16573y = "super";

    /* JADX INFO: renamed from: k */
    private String f16574k;

    /* JADX INFO: renamed from: q */
    private String f16575q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f61320toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f61321zy;

    public jbh(String type, String id, String name, String source) {
        this.f16574k = type;
        this.f61320toq = id;
        this.f61321zy = name;
        this.f16575q = source;
    }

    /* JADX INFO: renamed from: k */
    public static jbh m9832k(String type, String source, @zy.lvui Resource resource) {
        if (resource == null) {
            return null;
        }
        String onlineId = resource.getOnlineId();
        if (TextUtils.isEmpty(onlineId)) {
            onlineId = resource.getLocalId();
        }
        String title = resource.getTitle();
        if (TextUtils.isEmpty(title)) {
            String contentPath = resource.getContentPath();
            if (!TextUtils.isEmpty(contentPath)) {
                int iLastIndexOf = contentPath.lastIndexOf("/");
                int iLastIndexOf2 = contentPath.lastIndexOf(".");
                if (iLastIndexOf > 0 && iLastIndexOf2 > iLastIndexOf && iLastIndexOf2 < contentPath.length()) {
                    title = contentPath.substring(iLastIndexOf + 1, iLastIndexOf2);
                }
            }
        }
        return new jbh(type, onlineId, title, source);
    }

    /* JADX INFO: renamed from: s */
    private Intent m9833s(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!TextUtils.isEmpty(this.f16574k)) {
            intent.putExtra("type", this.f16574k);
        }
        if (!TextUtils.isEmpty(this.f61320toq)) {
            intent.putExtra("id", this.f61320toq);
        }
        if (!TextUtils.isEmpty(this.f61321zy)) {
            intent.putExtra("name", this.f61321zy);
        }
        if (!TextUtils.isEmpty(this.f16575q)) {
            intent.putExtra("source", this.f16575q);
        }
        if (!TextUtils.isEmpty(this.f61320toq) || !TextUtils.isEmpty(this.f16574k) || !TextUtils.isEmpty(this.f61321zy)) {
            intent.putExtra(f16569i, true);
        }
        return intent;
    }

    public void f7l8(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        context.sendStickyBroadcast(m9833s(intent));
    }

    /* JADX INFO: renamed from: g */
    public void m9834g(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        context.sendBroadcast(m9833s(intent));
    }

    /* JADX INFO: renamed from: n */
    public String m9835n() {
        return this.f16574k;
    }

    /* JADX INFO: renamed from: q */
    public String m9836q() {
        return this.f16575q;
    }

    public String toq() {
        return this.f61320toq;
    }

    /* JADX INFO: renamed from: y */
    public void m9837y(String source) {
        this.f16575q = source;
    }

    public String zy() {
        return this.f61321zy;
    }
}

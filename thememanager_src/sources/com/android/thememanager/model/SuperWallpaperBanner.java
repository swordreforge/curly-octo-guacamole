package com.android.thememanager.model;

import android.text.TextUtils;
import com.android.thememanager.presenter.C2308g;

/* JADX INFO: loaded from: classes2.dex */
public class SuperWallpaperBanner {
    public String downloadUrl;
    public String id;
    public String image;
    public String packId;
    public String packageName;
    public String productId;
    public String status;
    public String summary;
    public String title;
    public String type;

    public boolean isInvalid() {
        return C2308g.f13466h.equals(this.status) || (C2308g.f13473z.equals(this.type) && (TextUtils.isEmpty(this.packId) || TextUtils.isEmpty(this.productId) || TextUtils.isEmpty(this.downloadUrl))) || ("apk".equals(this.type) && (TextUtils.isEmpty(this.packageName) || TextUtils.isEmpty(this.id)));
    }

    public String toString() {
        return "title:" + this.title + " summary:" + this.summary + " image:" + this.image + " downloadUrl:" + this.downloadUrl + " type:" + this.type + " status:" + this.status + " packId:" + this.packId + " productId:" + this.productId;
    }
}

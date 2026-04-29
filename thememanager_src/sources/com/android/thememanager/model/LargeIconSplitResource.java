package com.android.thememanager.model;

import p029m.zy;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconSplitResource {
    private String link;
    private String title;

    public LargeIconSplitResource(String title, String link) {
        this.title = title;
        this.link = link;
    }

    public String getLink() {
        return this.link;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isValidData() {
        return !zy.toq(this.link);
    }
}

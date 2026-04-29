package com.android.thememanager.v9.model.factory;

/* JADX INFO: loaded from: classes2.dex */
public class UIResultBase {
    public String category;
    public boolean hasMore;
    public String pageId;
    public int requestedCount;

    public UIResultBase(boolean hasMore, String category, int requestedCount, String pageId) {
        this.hasMore = hasMore;
        this.category = category;
        this.requestedCount = requestedCount;
        this.pageId = pageId;
    }
}

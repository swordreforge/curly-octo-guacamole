package com.android.thememanager.router.recommend.entity;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UIResult {
    public List<String> adTagIds;
    public String category;
    public List<UIElement> elementList;
    public boolean hasMore;
    public String pageId;
    public int requestedCount;

    public UIResult(List<UIElement> elementList, boolean hasMore, String category, int requestedCount, List<String> adTagIds, String pageId) {
        this.hasMore = hasMore;
        this.category = category;
        this.requestedCount = requestedCount;
        this.pageId = pageId;
        this.elementList = elementList;
        this.adTagIds = adTagIds;
    }
}

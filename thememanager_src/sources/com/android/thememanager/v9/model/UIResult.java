package com.android.thememanager.v9.model;

import com.android.thememanager.v9.model.factory.UIResultBase;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UIResult extends UIResultBase {
    public List<String> adTagIds;
    public List<UIElement> elementList;
    public Object extraInfo;

    public UIResult(List<UIElement> elementList, boolean hasMore, String category, int requestedCount, List<String> adTagIds, String pageId) {
        this(elementList, hasMore, category, requestedCount, adTagIds, pageId, null);
    }

    public UIResult(List<UIElement> elementList, boolean hasMore, String category, int requestedCount, List<String> adTagIds, String pageId, Object extra) {
        super(hasMore, category, requestedCount, pageId);
        this.elementList = elementList;
        this.adTagIds = adTagIds;
        this.extraInfo = extra;
    }
}

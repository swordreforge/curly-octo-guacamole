package com.android.thememanager.v9.model;

import a98o.C0004k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.v9.model.factory.UIResultBase;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperUIResult extends UIResultBase {
    public C0004k<Resource> mDataGroup;

    public WallpaperUIResult(C0004k<Resource> dataGroup, boolean hasMore, String category, int requestedCount, String pageId) {
        super(hasMore, category, requestedCount, pageId);
        this.mDataGroup = dataGroup;
    }
}

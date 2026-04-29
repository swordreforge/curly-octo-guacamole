package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FontWallpaperClassListItemElement extends UIElement {
    private List<UIImageWithLink> mBanners;
    private boolean mIsLastItem;
    private String mSubjectUuid;

    public FontWallpaperClassListItemElement(String mSubjectUuid, List<UIImageWithLink> mBanners, boolean mIsLastItem) {
        super(102);
        this.mSubjectUuid = mSubjectUuid;
        this.mBanners = mBanners;
        this.mIsLastItem = mIsLastItem;
    }

    public List<UIImageWithLink> getBanners() {
        return this.mBanners;
    }

    public boolean getLastItem() {
        return this.mIsLastItem;
    }

    public String getSubjectUuid() {
        return this.mSubjectUuid;
    }
}

package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperClassListItemElement extends UIElement {
    private List<UIImageWithLink> banners;
    private boolean isFirstCard;
    private boolean isLastItem;
    private String subjectUuid;

    public WallpaperClassListItemElement(String subjectUuid, List<UIImageWithLink> banners, boolean isLastItem, boolean isFirstCard) {
        super(59);
        this.subjectUuid = subjectUuid;
        this.banners = banners;
        this.isLastItem = isLastItem;
        this.isFirstCard = isFirstCard;
    }

    public List<UIImageWithLink> getBanners() {
        return this.banners;
    }

    public boolean getFisrtCard() {
        return this.isFirstCard;
    }

    public boolean getLastItem() {
        return this.isLastItem;
    }

    public String getSubjectUuid() {
        return this.subjectUuid;
    }
}

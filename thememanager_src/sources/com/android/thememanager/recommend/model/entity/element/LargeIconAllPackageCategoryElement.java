package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconAllPackageCategoryElement extends UIElement {
    public List<UILink> uiLinks;

    public LargeIconAllPackageCategoryElement(List<UILink> uiLinkList) {
        super(126);
        this.uiLinks = uiLinkList;
    }
}

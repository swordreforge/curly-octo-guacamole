package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconFourItemCardTitleElement extends UIElement {
    public int count;
    public UILink link;
    public String trackId;

    public LargeIconFourItemCardTitleElement(int count, UILink link, String trackId) {
        super(129);
        this.count = count;
        this.link = link;
        this.trackId = trackId;
    }
}

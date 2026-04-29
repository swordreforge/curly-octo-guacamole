package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconHotAppCardElement extends UIElement {
    public String onlineId;
    public String title;
    public String trackId;
    public List<UIImageWithLink> uiImageWithLinks;

    public LargeIconHotAppCardElement(String title, List<UIImageWithLink> uiImageWithLinks, String onlineId, String trackId) {
        super(130);
        this.uiImageWithLinks = uiImageWithLinks;
        this.title = title;
        this.onlineId = onlineId;
        this.trackId = trackId;
    }
}

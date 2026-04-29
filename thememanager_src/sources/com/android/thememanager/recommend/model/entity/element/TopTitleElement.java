package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;

/* JADX INFO: loaded from: classes2.dex */
public class TopTitleElement extends UIElement {
    public String pageUuid;
    public String subTitle;
    public String subjectUuid;
    public String title;
    public String trackId;
    public UILink uiLink;

    public TopTitleElement(String title, String subTitle, String subjectUuid, String trackId, String pageUuid, UILink link) {
        super(3);
        this.title = title;
        this.subTitle = subTitle;
        this.subjectUuid = subjectUuid;
        this.trackId = trackId;
        this.pageUuid = pageUuid;
        this.uiLink = link;
    }
}

package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;

/* JADX INFO: loaded from: classes2.dex */
public class BottomLoadMoreElement extends UIElement {
    private String subjectUuid;
    private String title;
    private String trackId;

    public BottomLoadMoreElement(String subjectUuid, String title, String trackId) {
        super(4);
        this.subjectUuid = subjectUuid;
        this.title = title;
        this.trackId = trackId;
    }

    public String getSubjectUuid() {
        return this.subjectUuid;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackId() {
        return this.trackId;
    }
}

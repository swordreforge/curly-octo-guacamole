package com.android.thememanager.router.recommend.entity;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UISubject implements Serializable {
    private static final long serialVersionUID = 1;
    public String eid;
    public UILink link;
    public List<UIProduct> products;
    public String subjectImageUrl;
    public String subjectTitle;
    public String subjectUuid;
    public String traceId;
    public String trackId;
}

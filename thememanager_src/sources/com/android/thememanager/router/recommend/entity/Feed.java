package com.android.thememanager.router.recommend.entity;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class Feed implements Serializable {
    private static final long serialVersionUID = 1;
    public String authorIcon;
    public String authorName;
    public String designerId;
    public String designerMiId;
    public UILink link;
    public String packId;
    public String productName;
    public long publishTime;
    public ArrayList<String> snapshotsUrl;
}

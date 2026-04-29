package com.android.thememanager.router.recommend.entity;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UIPage implements Serializable {
    private static final long serialVersionUID = 1;
    public List<String> adTagIds;
    public List<UICard> cards;
    public String category;
    public boolean hasMore;
    public String uuid;
}

package com.android.thememanager.v9.model;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PurchasedOrFavoritedCategory implements Serializable {
    public boolean hasMore;
    public String name;
    public int page;
    public String pageCategory;
    public int pageSize;
    public List<UIProduct> products;
    public int requestedCount;
    public int total;
    public String uuid;
}

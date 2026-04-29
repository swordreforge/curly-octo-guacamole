package com.android.thememanager.mine.remote.model.entity;

import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PurchasedOrFavoritedCategory implements Serializable {
    public List<UICard> cards;
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

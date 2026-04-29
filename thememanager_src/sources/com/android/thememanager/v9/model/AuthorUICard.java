package com.android.thememanager.v9.model;

import com.android.thememanager.router.recommend.entity.Feed;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AuthorUICard implements Serializable {
    private static final long serialVersionUID = 1;
    public int cardCount;
    public String cardType;
    public String cardTypeOrdinal;
    public String cardUuid;
    public List<Feed> feedList;
    public boolean hasMore;
    public int index;
    public long nextMaxUpdateTime;
}

package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SearchHotElement extends UIElement {
    private List<String> recommendSearchHotTitleList;

    public SearchHotElement(int cardType, List<String> recommendSearchHotTitleListList) {
        super(cardType);
        this.recommendSearchHotTitleList = recommendSearchHotTitleListList;
    }

    public List<String> getRecommendSearchHotTitleList() {
        return this.recommendSearchHotTitleList;
    }
}

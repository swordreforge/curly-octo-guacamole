package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconAllTwoCardElement extends UIElement {
    public int row;
    public List<UIProduct> uiProducts;
    public int useEnd;
    public int useStart;

    public LargeIconAllTwoCardElement(List<UIProduct> uiProducts, int start, int end, int row) {
        super(127);
        this.uiProducts = uiProducts;
        this.useStart = start;
        this.useEnd = end;
        this.row = row;
    }
}

package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetSlideElement extends UIElement {
    public String darkTitlePic;
    public String guide;
    public UILink link;
    public List<UIProduct> products;
    public String subtitle;
    public String title;
    public String titlePic;

    public WidgetSlideElement() {
        super(123);
    }
}

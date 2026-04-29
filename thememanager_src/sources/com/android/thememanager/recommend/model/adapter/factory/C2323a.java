package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.WidgetSlideElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.a */
/* JADX INFO: compiled from: WidgetSlideElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2323a extends qrj {
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        WidgetSlideElement widgetSlideElement = new WidgetSlideElement();
        widgetSlideElement.title = card.title;
        widgetSlideElement.titlePic = card.titlePic;
        widgetSlideElement.darkTitlePic = card.darkTitlePic;
        widgetSlideElement.subtitle = card.subTitle;
        widgetSlideElement.guide = card.guide;
        widgetSlideElement.link = card.link;
        widgetSlideElement.products = card.products;
        arrayList.add(widgetSlideElement);
        return arrayList;
    }
}

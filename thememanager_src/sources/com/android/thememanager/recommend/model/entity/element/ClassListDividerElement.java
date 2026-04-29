package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class ClassListDividerElement extends UIElement {
    private String subTitle;

    public ClassListDividerElement(@dd String subTitle) {
        super(60);
        this.subTitle = subTitle;
    }

    public String getSubTitle() {
        return this.subTitle;
    }
}

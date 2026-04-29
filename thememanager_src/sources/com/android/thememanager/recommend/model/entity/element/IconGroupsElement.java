package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIIcon;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class IconGroupsElement extends UIElement {
    private List<List<UIIcon>> iconGroups;

    public IconGroupsElement(List<List<UIIcon>> iconGroups) {
        super(2);
        this.iconGroups = iconGroups;
    }

    public List<List<UIIcon>> getIconGroups() {
        return this.iconGroups;
    }
}

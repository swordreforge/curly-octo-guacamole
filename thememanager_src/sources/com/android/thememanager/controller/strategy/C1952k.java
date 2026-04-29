package com.android.thememanager.controller.strategy;

import com.android.thememanager.basemodule.resource.model.Resource;

/* JADX INFO: renamed from: com.android.thememanager.controller.strategy.k */
/* JADX INFO: compiled from: DefaultSearchStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1952k extends AbstractC1951g {
    @Override // com.android.thememanager.controller.strategy.AbstractC1951g
    /* JADX INFO: renamed from: k */
    public boolean mo7686k(String keyword, Resource resource) {
        if (resource == null) {
            return false;
        }
        String title = resource.getTitle();
        if (title != null && title.toLowerCase().contains(keyword.toLowerCase())) {
            return true;
        }
        String description = resource.getLocalInfo().getDescription();
        return description != null && description.toLowerCase().contains(keyword.toLowerCase());
    }
}

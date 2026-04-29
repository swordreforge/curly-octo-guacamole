package com.android.thememanager.v9;

import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;

/* JADX INFO: compiled from: V9ClassPageFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class ki extends AbstractC2865k {
    @Override // com.android.thememanager.v9.AbstractC2865k
    protected void btvn(int position) {
        super.btvn(position);
    }

    @Override // com.android.thememanager.v9.AbstractC2865k
    protected PageGroup imd(com.android.thememanager.fu4 resContext, boolean isHybrid) {
        if (!com.android.thememanager.basemodule.utils.toq.m7224q(resContext.getResourceCode())) {
            return null;
        }
        com.android.thememanager.controller.online.ld6 ld6Var = new com.android.thememanager.controller.online.ld6(resContext);
        PageGroup pageGroup = new PageGroup();
        pageGroup.setResourceCode(resContext.getResourceCode());
        Page page = new Page();
        page.setItemUrl(ld6Var.lrht());
        pageGroup.setPageGroupType(2);
        pageGroup.addPage(page);
        return pageGroup;
    }

    @Override // com.android.thememanager.v9.AbstractC2865k
    protected void mj() {
        this.f17156f.clear();
        this.f17156f.add("theme");
        this.f17156f.add("wallpaper");
        this.f17156f.add("videowallpaper");
        this.f17156f.add("ringtone");
        this.f17156f.add("fonts");
    }
}

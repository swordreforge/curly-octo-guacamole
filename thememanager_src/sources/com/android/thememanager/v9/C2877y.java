package com.android.thememanager.v9;

import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;

/* JADX INFO: renamed from: com.android.thememanager.v9.y */
/* JADX INFO: compiled from: NewV9HomePageFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2877y extends AbstractC2865k {
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
        page.setItemUrl(isHybrid ? ld6Var.vyq() : ld6Var.uv6());
        page.setKey(isHybrid ? "hybrid" : resContext.getResourceCode());
        pageGroup.addPage(page);
        return pageGroup;
    }

    @Override // com.android.thememanager.v9.AbstractC2865k
    protected void mj() {
        this.f17156f.clear();
        this.f17156f.add("hybrid");
        this.f17156f.add("theme");
        this.f17156f.add("wallpaper");
        this.f17156f.add("videowallpaper");
        this.f17156f.add("ringtone");
        this.f17156f.add("fonts");
    }
}

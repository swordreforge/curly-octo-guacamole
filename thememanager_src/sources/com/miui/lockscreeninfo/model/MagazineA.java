package com.miui.lockscreeninfo.model;

import com.miui.lockscreeninfo.C5117k;

/* JADX INFO: loaded from: classes3.dex */
public class MagazineA extends SignatureInfo {
    public MagazineA(String str) {
        super(str);
    }

    @Override // com.miui.lockscreeninfo.model.SignatureInfo
    protected void initData() {
        boolean z2 = this.verticalMode;
        this.textsize = z2 ? C5117k.k.f72111kja0 : C5117k.k.f72113n7h;
        this.letterSpaceValue = z2 ? 1.0f : 0.0f;
        this.lineSpaceValue = z2 ? 1.22f : 0.0f;
        this.lines = z2 ? 4 : 3;
        this.fontFamily = "miclock-qinghe-75w";
    }
}

package com.miui.lockscreeninfo.model;

import com.miui.lockscreeninfo.C5117k;

/* JADX INFO: loaded from: classes3.dex */
public class MagazineB extends SignatureInfo {
    public MagazineB(String str) {
        super(str);
    }

    @Override // com.miui.lockscreeninfo.model.SignatureInfo
    protected void initData() {
        this.alignment = 104;
        this.verticalMode = false;
        this.textsize = C5117k.k.f29430h;
        this.letterSpaceValue = 0.0f;
        this.lineSpaceValue = 0.85f;
        this.lines = 3;
        this.fontFamily = "miclock-inter-scaled-medium";
    }

    @Override // com.miui.lockscreeninfo.model.SignatureInfo
    public void setAlignment(int i2) {
        super.setAlignment(104);
    }
}

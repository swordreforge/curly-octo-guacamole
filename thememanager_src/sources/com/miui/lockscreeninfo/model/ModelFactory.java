package com.miui.lockscreeninfo.model;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ModelFactory {
    public static SignatureInfo createModel(SignatureInfo signatureInfo) {
        SignatureInfo signatureInfoCreateModel = createModel(signatureInfo.getTemplateId());
        signatureInfoCreateModel.setContent(signatureInfo.getContent());
        signatureInfoCreateModel.setAlignment(signatureInfo.getAlignment());
        signatureInfoCreateModel.setAutoPrimaryColor(signatureInfo.isAutoPrimaryColor());
        signatureInfoCreateModel.setPrimaryColor(signatureInfo.getPrimaryColor());
        return signatureInfoCreateModel;
    }

    public static SignatureInfo createModel(String str) {
        return TextUtils.equals("magazine_a", str) ? new MagazineA("magazine_a") : new MagazineB("magazine_b");
    }
}

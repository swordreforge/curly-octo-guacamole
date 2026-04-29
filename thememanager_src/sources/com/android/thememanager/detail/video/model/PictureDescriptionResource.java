package com.android.thememanager.detail.video.model;

import java.io.Serializable;
import java.util.List;
import p029m.zy;

/* JADX INFO: loaded from: classes2.dex */
public class PictureDescriptionResource implements Serializable {
    private static final long serialVersionUID = 9;
    public List<PictureDescriptionModel> modelList;

    public PictureDescriptionModel getSameNameModel(String name) {
        if (zy.toq(name)) {
            return null;
        }
        for (int i2 = 0; i2 < this.modelList.size(); i2++) {
            PictureDescriptionModel pictureDescriptionModel = this.modelList.get(i2);
            if (name.equals(pictureDescriptionModel.name)) {
                return pictureDescriptionModel;
            }
        }
        return null;
    }
}

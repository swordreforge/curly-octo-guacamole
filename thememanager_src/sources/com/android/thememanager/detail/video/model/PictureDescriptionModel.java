package com.android.thememanager.detail.video.model;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PictureDescriptionModel implements Serializable {
    private static final long serialVersionUID = 9;
    public String name;
    public String onlineId;
    private Map<String, PictureDescription> translationMap;

    public String getContentByLocale(String locale) {
        PictureDescription pictureDescription;
        Map<String, PictureDescription> map = this.translationMap;
        if (map == null || (pictureDescription = map.get(locale)) == null) {
            return null;
        }
        return pictureDescription.content;
    }

    public String getTitleByLocale(String locale) {
        PictureDescription pictureDescription;
        Map<String, PictureDescription> map = this.translationMap;
        if (map == null || (pictureDescription = map.get(locale)) == null) {
            return null;
        }
        return pictureDescription.title;
    }

    public Map<String, PictureDescription> getTranslationMap() {
        return this.translationMap;
    }
}

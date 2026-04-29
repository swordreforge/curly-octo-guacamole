package com.android.thememanager.router.recommend.entity;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperRecommendItem implements Serializable {
    private static final long serialVersionUID = 1;
    public List<UISubject> subjects;
    public String updateBelowUuid = null;
    public boolean isSubjectUuid = true;
    public int startProductPos = 0;
    public int endProdutPos = 0;
}

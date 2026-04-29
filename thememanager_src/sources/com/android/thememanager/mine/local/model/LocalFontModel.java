package com.android.thememanager.mine.local.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LocalFontModel {
    private String contentUri;
    private List<Integer> fontWeight;
    private String id;
    private boolean isUsing;
    private boolean isVariable;
    private boolean rightFileUnaccessable;
    private String title;

    public LocalFontModel(String id, String title, String contentUri, boolean isUsing, boolean isVariable, List<Integer> fontWeight) {
        this(id, title, contentUri, isUsing, isVariable, fontWeight, false);
    }

    public void setUsing(boolean using) {
        this.isUsing = using;
    }

    public LocalFontModel(String id, String title, String contentUri, boolean isUsing, boolean isVariable, List<Integer> fontWeight, boolean rightFileUnaccessable) {
        this.id = id;
        this.title = title;
        this.contentUri = contentUri;
        this.isUsing = isUsing;
        this.isVariable = isVariable;
        this.fontWeight = fontWeight;
        this.rightFileUnaccessable = rightFileUnaccessable;
    }
}

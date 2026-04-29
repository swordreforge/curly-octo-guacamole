package com.android.thememanager.model;

import com.android.thememanager.controller.online.zurt;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class ListParams implements Serializable {
    private static final long serialVersionUID = 1;
    private zurt listUrl;
    private int page;

    public ListParams() {
    }

    public zurt getListUrl() {
        return this.listUrl;
    }

    public int getPage() {
        return this.page;
    }

    public void setListUrl(zurt listUrl) {
        this.listUrl = listUrl;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public ListParams(zurt listUrl, int page) {
        this.listUrl = listUrl;
        this.page = page;
    }
}

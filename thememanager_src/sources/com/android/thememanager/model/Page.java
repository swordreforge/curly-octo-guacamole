package com.android.thememanager.model;

import com.android.thememanager.controller.online.zurt;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class Page implements Serializable, Cloneable {
    private static final long serialVersionUID = 3;
    private int flag;
    private zurt itemUrl;
    private String key;
    private zurt listUrl;
    private boolean paging;
    private String title;

    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public int getFlag() {
        return this.flag;
    }

    public zurt getItemUrl() {
        return this.itemUrl;
    }

    public String getKey() {
        return this.key;
    }

    public zurt getListUrl() {
        return this.listUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isPaging() {
        return this.paging;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setItemUrl(zurt itemUrl) {
        this.itemUrl = itemUrl;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setListUrl(zurt listUrl) {
        this.listUrl = listUrl;
    }

    public void setPaging(boolean paging) {
        this.paging = paging;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

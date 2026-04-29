package com.android.thememanager.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PageGroup implements Serializable, Cloneable {
    public static final int PAGE_GROUP_TYPE_NATIVE = 0;
    public static final int PAGE_GROUP_TYPE_V9_NATIVE = 2;
    public static final int PAGE_GROUP_TYPE_WEB = 1;
    private static final long serialVersionUID = 3;
    private String resourceCode;
    private String title;
    private String url;
    private List<Page> pages = new ArrayList();
    private int pageGroupType = 0;

    public void addPage(Page page) {
        this.pages.add(page);
    }

    public void clearPages() {
        this.pages.clear();
    }

    public Object clone() {
        try {
            PageGroup pageGroup = (PageGroup) super.clone();
            pageGroup.pages = new ArrayList(this.pages.size());
            Iterator<Page> it = this.pages.iterator();
            while (it.hasNext()) {
                pageGroup.pages.add((Page) it.next().clone());
            }
            return pageGroup;
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public int getPageGroupType() {
        return this.pageGroupType;
    }

    public List<Page> getPages() {
        return this.pages;
    }

    public String getResourceCode() {
        return this.resourceCode;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setPageGroupType(int pageGroupType) {
        this.pageGroupType = pageGroupType;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

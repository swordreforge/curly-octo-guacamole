package com.android.thememanager.model;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconInfoElement {
    public int id;
    public int order;
    public String packageName;
    public String packageTitle;
    public String relativePackage;
    public boolean support;
    public long updateTime;

    public String toString() {
        return "LargeIconInfoElement{id=" + this.id + ", packageName='" + this.packageName + "', packageTitle='" + this.packageTitle + "', support=" + this.support + ", updateTime=" + this.updateTime + ", order=" + this.order + ", relativePackage='" + this.relativePackage + "'}";
    }
}

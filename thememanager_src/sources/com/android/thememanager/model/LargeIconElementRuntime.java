package com.android.thememanager.model;

import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconElementRuntime implements Cloneable {
    public String[] fileHash;
    public String hash;
    public boolean isOfficialResource;
    public boolean isPairApp;
    public String localId;
    public String packageName;
    public String packageName1;
    public String packageName2;
    public String packageTitle;
    public String path;
    public String resourceName;
    public String size;
    public long updateTime;
    public String uuid;
    public int version;

    @lvui
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public LargeIconElementRuntime m28254clone() {
        LargeIconElementRuntime largeIconElementRuntime;
        CloneNotSupportedException e2;
        try {
            largeIconElementRuntime = (LargeIconElementRuntime) super.clone();
            try {
                String[] strArr = this.fileHash;
                if (strArr != null) {
                    System.arraycopy(strArr, 0, largeIconElementRuntime.fileHash, 0, strArr.length);
                }
            } catch (CloneNotSupportedException e3) {
                e2 = e3;
                e2.printStackTrace();
            }
        } catch (CloneNotSupportedException e4) {
            largeIconElementRuntime = null;
            e2 = e4;
        }
        return largeIconElementRuntime;
    }
}

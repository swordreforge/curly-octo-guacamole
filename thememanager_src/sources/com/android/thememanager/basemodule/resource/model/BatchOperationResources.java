package com.android.thememanager.basemodule.resource.model;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BatchOperationResources {
    private int oldNum;
    private List<Resource> resources;
    private int updatingNum;

    public BatchOperationResources(int oldNum, int updatingNum, List<Resource> resources) {
        this.oldNum = oldNum;
        this.updatingNum = updatingNum;
        this.resources = resources;
    }

    public int getOldNum() {
        return this.oldNum;
    }

    public List<Resource> getResources() {
        return this.resources;
    }

    public int getUpdatingNum() {
        return this.updatingNum;
    }

    public void setOldNum(int oldNum) {
        this.oldNum = oldNum;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public void setUpdatingNum(int updatingNum) {
        this.updatingNum = updatingNum;
    }
}

package com.android.thememanager.mine.remote.model.entity;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BatchOrderResult {
    private List<BatchOrderItem> failOrders;
    private List<BatchOrderItem> successOrders;

    public List<BatchOrderItem> getFailOrders() {
        return this.failOrders;
    }

    public List<BatchOrderItem> getSuccessOrders() {
        return this.successOrders;
    }

    public void setFailOrders(List<BatchOrderItem> failOrders) {
        this.failOrders = failOrders;
    }

    public void setSuccessOrders(List<BatchOrderItem> successOrders) {
        this.successOrders = successOrders;
    }
}

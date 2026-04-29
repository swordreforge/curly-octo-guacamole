package com.android.thememanager.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UpdateBundle {
    private String sourceDigest;
    private long sourceSize;
    private String targetDigest;
    private long targetSize;
    private List<Update> updates = new ArrayList();

    public void addUpdate(Update update) {
        this.updates.add(update);
    }

    public void clearUpdates() {
        this.updates.clear();
    }

    public String getSourceDigest() {
        return this.sourceDigest;
    }

    public long getSourceSize() {
        return this.sourceSize;
    }

    public String getTargetDigest() {
        return this.targetDigest;
    }

    public long getTargetSize() {
        return this.targetSize;
    }

    public List<Update> getUpdates() {
        return this.updates;
    }

    public void setSourceDigest(String sourceDigest) {
        this.sourceDigest = sourceDigest;
    }

    public void setSourceSize(long sourceSize) {
        this.sourceSize = sourceSize;
    }

    public void setTargetDigest(String targetDigest) {
        this.targetDigest = targetDigest;
    }

    public void setTargetSize(long targetSize) {
        this.targetSize = targetSize;
    }

    public void setUpdates(List<Update> updates) {
        this.updates = updates;
    }
}

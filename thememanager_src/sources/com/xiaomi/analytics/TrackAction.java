package com.xiaomi.analytics;

/* JADX INFO: loaded from: classes3.dex */
public class TrackAction extends Action {
    public TrackAction setAction(String str) {
        addContent("_action_", str);
        return this;
    }

    public TrackAction setCategory(String str) {
        addContent("_category_", str);
        return this;
    }

    public TrackAction setLabel(String str) {
        addContent("_label_", str);
        return this;
    }

    public TrackAction setValue(long j2) {
        addContent("_value_", j2 + "");
        return this;
    }
}

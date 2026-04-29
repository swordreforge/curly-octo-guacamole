package com.android.thememanager.clockmessage.model;

import java.io.Serializable;

/* JADX INFO: compiled from: ClockMessageContent.java */
/* JADX INFO: loaded from: classes.dex */
public class toq implements Serializable {
    public C1874k activity;
    public boolean enable;
    public C7910toq feedInfo;
    public C7910toq postInfo;

    /* JADX INFO: renamed from: com.android.thememanager.clockmessage.model.toq$k */
    /* JADX INFO: compiled from: ClockMessageContent.java */
    public class C1874k implements Serializable {
        public String link;
        public String linkType;

        public C1874k() {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.clockmessage.model.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClockMessageContent.java */
    public class C7910toq implements Serializable {
        public String link;
        public int msgNum;
        public long updateTime;

        public C7910toq() {
        }
    }
}

package com.miui.maml.data;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class TimeUpdater implements Runnable {
    private WeakReference<DateTimeVariableUpdater> mRef;

    public TimeUpdater(DateTimeVariableUpdater dateTimeVariableUpdater) {
        this.mRef = new WeakReference<>(dateTimeVariableUpdater);
    }

    @Override // java.lang.Runnable
    public void run() {
        DateTimeVariableUpdater dateTimeVariableUpdater;
        WeakReference<DateTimeVariableUpdater> weakReference = this.mRef;
        if (weakReference == null || (dateTimeVariableUpdater = weakReference.get()) == null) {
            return;
        }
        dateTimeVariableUpdater.checkUpdateTime();
    }
}

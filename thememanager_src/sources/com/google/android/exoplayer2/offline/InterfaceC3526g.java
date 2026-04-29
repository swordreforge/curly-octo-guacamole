package com.google.android.exoplayer2.offline;

import java.io.Closeable;

/* JADX INFO: renamed from: com.google.android.exoplayer2.offline.g */
/* JADX INFO: compiled from: DownloadCursor.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3526g extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getCount();

    int getPosition();

    default boolean isAfterLast() {
        return getCount() == 0 || getPosition() == getCount();
    }

    default boolean isBeforeFirst() {
        return getCount() == 0 || getPosition() == -1;
    }

    boolean isClosed();

    default boolean isFirst() {
        return getPosition() == 0 && getCount() != 0;
    }

    default boolean isLast() {
        int count = getCount();
        return getPosition() == count + (-1) && count != 0;
    }

    default boolean moveToFirst() {
        return moveToPosition(0);
    }

    default boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    default boolean moveToNext() {
        return moveToPosition(getPosition() + 1);
    }

    boolean moveToPosition(int i2);

    default boolean moveToPrevious() {
        return moveToPosition(getPosition() - 1);
    }

    /* JADX INFO: renamed from: u */
    C3531n mo12382u();
}

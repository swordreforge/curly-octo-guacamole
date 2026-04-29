package com.google.android.exoplayer2.database;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: DatabaseProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public interface zy {
    public static final String nust = "ExoPlayer";

    SQLiteDatabase getReadableDatabase();

    SQLiteDatabase getWritableDatabase();
}

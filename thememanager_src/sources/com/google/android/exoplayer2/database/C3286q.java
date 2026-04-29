package com.google.android.exoplayer2.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: com.google.android.exoplayer2.database.q */
/* JADX INFO: compiled from: DefaultDatabaseProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3286q implements zy {

    /* JADX INFO: renamed from: k */
    private final SQLiteOpenHelper f19548k;

    public C3286q(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f19548k = sQLiteOpenHelper;
    }

    @Override // com.google.android.exoplayer2.database.zy
    public SQLiteDatabase getReadableDatabase() {
        return this.f19548k.getReadableDatabase();
    }

    @Override // com.google.android.exoplayer2.database.zy
    public SQLiteDatabase getWritableDatabase() {
        return this.f19548k.getWritableDatabase();
    }
}

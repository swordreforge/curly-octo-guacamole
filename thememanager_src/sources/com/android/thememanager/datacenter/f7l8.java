package com.android.thememanager.datacenter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* JADX INFO: compiled from: LogSqlOpenHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: g */
    private static final int f11144g = 1;

    /* JADX INFO: renamed from: n */
    public static final String f11145n = "theme_log.db";

    /* JADX INFO: renamed from: q */
    private static final String f11146q = f7l8.class.getSimpleName();

    /* JADX INFO: renamed from: y */
    public static final String f11147y = "log_table";

    /* JADX INFO: renamed from: k */
    private boolean f11148k;

    public f7l8(Context context) {
        super(context, f11145n, (SQLiteDatabase.CursorFactory) null, 1);
        this.f11148k = false;
    }

    /* JADX INFO: renamed from: k */
    public void m7711k() {
        if (this.f11148k) {
            return;
        }
        try {
            getReadableDatabase().close();
            this.f11148k = true;
        } catch (Exception e2) {
            Log.e(f11146q, "init exception ", e2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists log_table(id INTEGER PRIMARY KEY AUTOINCREMENT, msg TEXT, timestamp LONG)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}

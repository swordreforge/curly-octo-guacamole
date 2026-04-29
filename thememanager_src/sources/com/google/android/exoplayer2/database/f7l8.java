package com.google.android.exoplayer2.database;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.exoplayer2.util.ni7;

/* JADX INFO: compiled from: StandaloneDatabaseProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 extends SQLiteOpenHelper implements zy {

    /* JADX INFO: renamed from: k */
    public static final String f19544k = "exoplayer_internal.db";

    /* JADX INFO: renamed from: n */
    private static final String f19545n = "SADatabaseProvider";

    /* JADX INFO: renamed from: q */
    private static final int f19546q = 1;

    public f7l8(Context context) {
        super(context.getApplicationContext(), f19544k, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* JADX INFO: renamed from: k */
    private static void m11559k(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(0);
                String string2 = cursorQuery.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 16 + String.valueOf(string2).length());
                    sb.append("DROP ");
                    sb.append(string);
                    sb.append(" IF EXISTS ");
                    sb.append(string2);
                    String string3 = sb.toString();
                    try {
                        sQLiteDatabase.execSQL(string3);
                    } catch (SQLException e2) {
                        String strValueOf = String.valueOf(string3);
                        ni7.m13700n(f19545n, strValueOf.length() != 0 ? "Error executing ".concat(strValueOf) : new String("Error executing "), e2);
                    }
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorQuery.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        m11559k(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}

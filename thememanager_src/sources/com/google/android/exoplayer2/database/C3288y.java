package com.google.android.exoplayer2.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.c8jq;
import com.google.android.exoplayer2.util.lrht;

/* JADX INFO: renamed from: com.google.android.exoplayer2.database.y */
/* JADX INFO: compiled from: VersionTable.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3288y {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f63547f7l8 = "feature";

    /* JADX INFO: renamed from: g */
    private static final String f19549g = "ExoPlayerVersions";

    /* JADX INFO: renamed from: k */
    public static final int f19550k = -1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f63548ld6 = "PRIMARY KEY (feature, instance_uid)";

    /* JADX INFO: renamed from: n */
    public static final int f19551n = 1000;

    /* JADX INFO: renamed from: p */
    private static final String f19552p = "feature = ? AND instance_uid = ?";

    /* JADX INFO: renamed from: q */
    public static final int f19553q = 2;

    /* JADX INFO: renamed from: s */
    private static final String f19554s = "version";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f63549toq = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f63550x2 = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))";

    /* JADX INFO: renamed from: y */
    private static final String f19555y = "instance_uid";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f63551zy = 1;

    static {
        c8jq.m11556k("goog.exo.database");
    }

    private C3288y() {
    }

    /* JADX INFO: renamed from: k */
    private static String[] m11560k(int i2, String str) {
        return new String[]{Integer.toString(i2), str};
    }

    /* JADX INFO: renamed from: q */
    public static void m11561q(SQLiteDatabase sQLiteDatabase, int i2, String str, int i3) throws toq {
        try {
            sQLiteDatabase.execSQL(f63550x2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i2));
            contentValues.put(f19555y, str);
            contentValues.put("version", Integer.valueOf(i3));
            sQLiteDatabase.replaceOrThrow(f19549g, null, contentValues);
        } catch (SQLException e2) {
            throw new toq(e2);
        }
    }

    public static int toq(SQLiteDatabase sQLiteDatabase, int i2, String str) throws toq {
        try {
        } catch (SQLException e2) {
            throw new toq(e2);
        }
        if (!lrht.ixz(sQLiteDatabase, f19549g)) {
            return -1;
        }
        Cursor cursorQuery = sQLiteDatabase.query(f19549g, new String[]{"version"}, f19552p, m11560k(i2, str), null, null, null);
        try {
            if (cursorQuery.getCount() == 0) {
                cursorQuery.close();
                return -1;
            }
            cursorQuery.moveToNext();
            int i3 = cursorQuery.getInt(0);
            cursorQuery.close();
            return i3;
        } finally {
        }
        throw new toq(e2);
    }

    public static void zy(SQLiteDatabase sQLiteDatabase, int i2, String str) throws toq {
        try {
            if (lrht.ixz(sQLiteDatabase, f19549g)) {
                sQLiteDatabase.delete(f19549g, f19552p, m11560k(i2, str));
            }
        } catch (SQLException e2) {
            throw new toq(e2);
        }
    }
}

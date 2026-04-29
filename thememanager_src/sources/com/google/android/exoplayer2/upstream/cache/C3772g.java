package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.database.C3288y;
import com.google.android.exoplayer2.util.C3844k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import zy.y9n;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.cache.g */
/* JADX INFO: compiled from: CacheFileMetadataIndex.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3772g {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f66759ld6 = "name = ?";

    /* JADX INFO: renamed from: n */
    private static final String f22898n = "name";

    /* JADX INFO: renamed from: p */
    private static final int f22899p = 2;

    /* JADX INFO: renamed from: q */
    private static final int f22900q = 1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f66760qrj = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";

    /* JADX INFO: renamed from: s */
    private static final int f22901s = 1;

    /* JADX INFO: renamed from: y */
    private static final int f22902y = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f66762zy = "ExoPlayerCacheFileMetadata";

    /* JADX INFO: renamed from: k */
    private final com.google.android.exoplayer2.database.zy f22903k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f66763toq;

    /* JADX INFO: renamed from: g */
    private static final String f22897g = "length";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f66758f7l8 = "last_touch_timestamp";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String[] f66761x2 = {"name", f22897g, f66758f7l8};

    public C3772g(com.google.android.exoplayer2.database.zy zyVar) {
        this.f22903k = zyVar;
    }

    @y9n
    /* JADX INFO: renamed from: k */
    public static void m13372k(com.google.android.exoplayer2.database.zy zyVar, long j2) throws com.google.android.exoplayer2.database.toq {
        String hexString = Long.toHexString(j2);
        try {
            String strM13373n = m13373n(hexString);
            SQLiteDatabase writableDatabase = zyVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                C3288y.zy(writableDatabase, 2, hexString);
                toq(writableDatabase, strM13373n);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
    }

    /* JADX INFO: renamed from: n */
    private static String m13373n(String str) {
        String strValueOf = String.valueOf(str);
        return strValueOf.length() != 0 ? f66762zy.concat(strValueOf) : new String(f66762zy);
    }

    /* JADX INFO: renamed from: q */
    private Cursor m13374q() {
        C3844k.f7l8(this.f66763toq);
        return this.f22903k.getReadableDatabase().query(this.f66763toq, f66761x2, null, null, null, null, null);
    }

    private static void toq(SQLiteDatabase sQLiteDatabase, String str) {
        String strValueOf = String.valueOf(str);
        sQLiteDatabase.execSQL(strValueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(strValueOf) : new String("DROP TABLE IF EXISTS "));
    }

    @y9n
    public void f7l8(String str) throws com.google.android.exoplayer2.database.toq {
        C3844k.f7l8(this.f66763toq);
        try {
            this.f22903k.getWritableDatabase().delete(this.f66763toq, f66759ld6, new String[]{str});
        } catch (SQLException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
    }

    @y9n
    /* JADX INFO: renamed from: g */
    public void m13375g(long j2) throws com.google.android.exoplayer2.database.toq {
        try {
            String hexString = Long.toHexString(j2);
            this.f66763toq = m13373n(hexString);
            if (C3288y.toq(this.f22903k.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f22903k.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    C3288y.m11561q(writableDatabase, 2, hexString, 1);
                    toq(writableDatabase, this.f66763toq);
                    String str = this.f66763toq;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 108);
                    sb.append("CREATE TABLE ");
                    sb.append(str);
                    sb.append(" ");
                    sb.append(f66760qrj);
                    writableDatabase.execSQL(sb.toString());
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
    }

    @y9n
    /* JADX INFO: renamed from: s */
    public void m13376s(String str, long j2, long j3) throws com.google.android.exoplayer2.database.toq {
        C3844k.f7l8(this.f66763toq);
        try {
            SQLiteDatabase writableDatabase = this.f22903k.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(f22897g, Long.valueOf(j2));
            contentValues.put(f66758f7l8, Long.valueOf(j3));
            writableDatabase.replaceOrThrow(this.f66763toq, null, contentValues);
        } catch (SQLException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
    }

    @y9n
    /* JADX INFO: renamed from: y */
    public void m13377y(Set<String> set) throws com.google.android.exoplayer2.database.toq {
        C3844k.f7l8(this.f66763toq);
        try {
            SQLiteDatabase writableDatabase = this.f22903k.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f66763toq, f66759ld6, new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
    }

    @y9n
    public Map<String, C3777n> zy() throws com.google.android.exoplayer2.database.toq {
        try {
            Cursor cursorM13374q = m13374q();
            try {
                HashMap map = new HashMap(cursorM13374q.getCount());
                while (cursorM13374q.moveToNext()) {
                    map.put((String) C3844k.f7l8(cursorM13374q.getString(0)), new C3777n(cursorM13374q.getLong(1), cursorM13374q.getLong(2)));
                }
                cursorM13374q.close();
                return map;
            } finally {
            }
        } catch (SQLException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
    }
}

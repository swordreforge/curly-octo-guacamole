package com.theme.loopwallpaper.controller;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.theme.loopwallpaper.model.LoopWallpaper;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: WallpaperLoopSQLiteHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: h */
    private static final String f30312h = "id";

    /* JADX INFO: renamed from: i */
    private static final String f30313i = "trackId";

    /* JADX INFO: renamed from: p */
    private static final String f30315p = "wallpaper";

    /* JADX INFO: renamed from: s */
    private static final int f30316s = 1;

    /* JADX INFO: renamed from: t */
    private static final int f30317t = 20;

    /* JADX INFO: renamed from: y */
    private static final String f30318y = "wallpaper_loop.db";

    /* JADX INFO: renamed from: z */
    private static final String f30319z = "downloadUrl";

    /* JADX INFO: renamed from: k */
    private SQLiteDatabase f30320k;

    /* JADX INFO: renamed from: q */
    private boolean f30321q;

    /* JADX INFO: renamed from: n */
    private static final String f30314n = zy.class.getSimpleName();

    /* JADX INFO: renamed from: g */
    private static final Object f30311g = new Object();

    public zy() {
        super(C2082k.m7998k(), f30318y, (SQLiteDatabase.CursorFactory) null, 1);
        this.f30321q = false;
        zy();
    }

    /* JADX INFO: renamed from: q */
    private void m18520q() {
        try {
            this.f30320k = C2082k.m7998k().openOrCreateDatabase(f30318y, 0, null);
        } catch (Exception e2) {
            Log.w(f30314n, "initDB error" + e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m18521k(List<LoopWallpaper> wallpaperList) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        synchronized (f30311g) {
            m18520q();
            if (wallpaperList != null && (sQLiteDatabase = this.f30320k) != null && !sQLiteDatabase.isReadOnly()) {
                try {
                    try {
                        this.f30320k.beginTransaction();
                        Iterator<LoopWallpaper> it = wallpaperList.iterator();
                        while (it.hasNext()) {
                            this.f30320k.delete("wallpaper", "trackId=?", new String[]{it.next().trackId});
                        }
                        this.f30320k.setTransactionSuccessful();
                        this.f30320k.endTransaction();
                        sQLiteDatabase2 = this.f30320k;
                    } catch (Exception e2) {
                        Log.w(f30314n, "delete LoopWallpaper error " + e2);
                        sQLiteDatabase2 = this.f30320k;
                    }
                    sQLiteDatabase2.close();
                } catch (Throwable th) {
                    this.f30320k.close();
                    throw th;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists wallpaper(id INTEGER PRIMARY KEY AUTOINCREMENT, trackId TEXT, downloadUrl TEXT)");
        db.execSQL("CREATE TRIGGER delete_till_fixed_size  AFTER INSERT ON wallpaper BEGIN delete from wallpaper WHERE ( SELECT COUNT( id ) FROM wallpaper ) > 40 AND id IN ( SELECT id FROM wallpaper ORDER BY id DESC LIMIT (SELECT COUNT( id ) FROM wallpaper ) OFFSET 40 ); END;");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[Catch: all -> 0x00a2, TryCatch #2 {, blocks: (B:4:0x0003, B:15:0x005c, B:16:0x0064, B:18:0x0066, B:19:0x006b, B:29:0x008d, B:30:0x0090, B:34:0x0097, B:35:0x009a, B:36:0x009f, B:37:0x00a0), top: B:44:0x0003 }] */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<com.theme.loopwallpaper.model.LoopWallpaper> m18522p() {
        /*
            r11 = this;
            java.lang.Object r0 = com.theme.loopwallpaper.controller.zy.f30311g
            monitor-enter(r0)
            r11.m18520q()     // Catch: java.lang.Throwable -> La2
            android.database.sqlite.SQLiteDatabase r1 = r11.f30320k     // Catch: java.lang.Throwable -> La2
            r10 = 0
            if (r1 == 0) goto La0
            java.lang.String r2 = "wallpaper"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "id desc"
            java.lang.String r9 = "0,20"
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            int r2 = r1.getCount()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            if (r2 <= 0) goto L66
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            r2.<init>()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
        L25:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            if (r3 == 0) goto L5c
            com.theme.loopwallpaper.model.LoopWallpaper r3 = new com.theme.loopwallpaper.model.LoopWallpaper     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            r3.<init>()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            java.lang.String r4 = "downloadUrl"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            r3.downloadUrl = r4     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            java.lang.String r4 = "id"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            int r4 = r1.getInt(r4)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            r3.id = r4     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            java.lang.String r4 = "trackId"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            r3.trackId = r4     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            r2.add(r3)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L93
            goto L25
        L5c:
            r1.close()     // Catch: java.lang.Throwable -> La2
            android.database.sqlite.SQLiteDatabase r1 = r11.f30320k     // Catch: java.lang.Throwable -> La2
            r1.close()     // Catch: java.lang.Throwable -> La2
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La2
            return r2
        L66:
            r1.close()     // Catch: java.lang.Throwable -> La2
            android.database.sqlite.SQLiteDatabase r1 = r11.f30320k     // Catch: java.lang.Throwable -> La2
        L6b:
            r1.close()     // Catch: java.lang.Throwable -> La2
            goto La0
        L6f:
            r2 = move-exception
            goto L75
        L71:
            r2 = move-exception
            goto L95
        L73:
            r2 = move-exception
            r1 = r10
        L75:
            java.lang.String r3 = com.theme.loopwallpaper.controller.zy.f30314n     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r4.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r5 = "query LoopWallpaper error "
            r4.append(r5)     // Catch: java.lang.Throwable -> L93
            r4.append(r2)     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L93
            android.util.Log.w(r3, r2)     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L90
            r1.close()     // Catch: java.lang.Throwable -> La2
        L90:
            android.database.sqlite.SQLiteDatabase r1 = r11.f30320k     // Catch: java.lang.Throwable -> La2
            goto L6b
        L93:
            r2 = move-exception
            r10 = r1
        L95:
            if (r10 == 0) goto L9a
            r10.close()     // Catch: java.lang.Throwable -> La2
        L9a:
            android.database.sqlite.SQLiteDatabase r1 = r11.f30320k     // Catch: java.lang.Throwable -> La2
            r1.close()     // Catch: java.lang.Throwable -> La2
            throw r2     // Catch: java.lang.Throwable -> La2
        La0:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La2
            return r10
        La2:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theme.loopwallpaper.controller.zy.m18522p():java.util.ArrayList");
    }

    /* JADX INFO: renamed from: y */
    public void m18523y(LoopWallpaper[] wallpaperArray) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        synchronized (f30311g) {
            m18520q();
            if (wallpaperArray != null && (sQLiteDatabase = this.f30320k) != null && !sQLiteDatabase.isReadOnly()) {
                try {
                    try {
                        this.f30320k.beginTransaction();
                        for (LoopWallpaper loopWallpaper : wallpaperArray) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("downloadUrl", loopWallpaper.downloadUrl);
                            contentValues.put("trackId", loopWallpaper.trackId);
                            this.f30320k.insert("wallpaper", null, contentValues);
                        }
                        this.f30320k.setTransactionSuccessful();
                        this.f30320k.endTransaction();
                        sQLiteDatabase2 = this.f30320k;
                    } catch (Exception e2) {
                        Log.w(f30314n, "add LoopWallpaper error " + e2);
                        sQLiteDatabase2 = this.f30320k;
                    }
                    sQLiteDatabase2.close();
                } catch (Throwable th) {
                    this.f30320k.close();
                    throw th;
                }
            }
        }
    }

    public void zy() {
        if (this.f30321q) {
            return;
        }
        try {
            getReadableDatabase().close();
            this.f30321q = true;
        } catch (Exception e2) {
            Log.e(f30314n, "init exception ", e2);
        }
    }
}

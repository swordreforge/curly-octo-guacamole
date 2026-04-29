package com.android.thememanager.clockmessage.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.thememanager.C2082k;
import com.android.thememanager.clockmessage.model.C1873k;
import zy.dd;

/* JADX INFO: renamed from: com.android.thememanager.clockmessage.db.k */
/* JADX INFO: compiled from: ClockMessageDBHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class C1871k extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: g */
    private static final int f10642g = 1;

    /* JADX INFO: renamed from: h */
    private static final String f10643h = "link";

    /* JADX INFO: renamed from: i */
    private static final String f10644i = "updateTime";

    /* JADX INFO: renamed from: n */
    private static final String f10645n = "community.db";

    /* JADX INFO: renamed from: p */
    private static final String f10646p = "msgNum";

    /* JADX INFO: renamed from: q */
    private static final Object f10647q = new Object();

    /* JADX INFO: renamed from: s */
    private static final String f10648s = "messageType";

    /* JADX INFO: renamed from: y */
    private static final String f10649y = "message";

    /* JADX INFO: renamed from: k */
    private String[] f10650k;

    /* JADX INFO: renamed from: com.android.thememanager.clockmessage.db.k$toq */
    /* JADX INFO: compiled from: ClockMessageDBHelper.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        private static C1871k f10651k = new C1871k();

        private toq() {
        }
    }

    /* JADX INFO: renamed from: k */
    private C1873k m7382k(Cursor cursor) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        cursor.moveToNext();
        C1873k c1873k = new C1873k();
        c1873k.f10655k = cursor.getString(cursor.getColumnIndex("messageType"));
        c1873k.f57852toq = cursor.getInt(cursor.getColumnIndex(f10646p));
        c1873k.f57853zy = cursor.getString(cursor.getColumnIndex(f10643h));
        c1873k.f10656q = cursor.getLong(cursor.getColumnIndex("updateTime"));
        cursor.close();
        return c1873k;
    }

    /* JADX INFO: renamed from: y */
    public static C1871k m7383y() {
        return toq.f10651k;
    }

    /* JADX INFO: renamed from: h */
    public void m7384h(@dd C1873k... messages) {
        if (messages == null || messages.length <= 0) {
            return;
        }
        synchronized (f10647q) {
            for (C1873k c1873k : messages) {
                ContentValues contentValues = new ContentValues(this.f10650k.length);
                contentValues.put("messageType", c1873k.f10655k);
                contentValues.put(f10646p, Integer.valueOf(c1873k.f57852toq));
                contentValues.put(f10643h, c1873k.f57853zy);
                contentValues.put("updateTime", Long.valueOf(c1873k.f10656q));
                getReadableDatabase().insert("message", null, contentValues);
            }
        }
    }

    @dd
    public C1873k ld6(String messageType) {
        C1873k c1873kM7382k;
        synchronized (f10647q) {
            c1873kM7382k = m7382k(getReadableDatabase().query("message", this.f10650k, "messageType=?", new String[]{messageType}, null, null, null, null));
        }
        return c1873kM7382k;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS message(messageType Text PRIMARY KEY, msgNum INTEGER, link TEXT, updateTime LONG)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.database.Cursor m7385p(@zy.lvui com.android.thememanager.clockmessage.model.C1873k r9) {
        /*
            r8 = this;
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            java.lang.String[] r1 = r8.f10650k
            r0.<init>(r1)
            java.lang.String r1 = r9.f10655k
            int r2 = r1.hashCode()
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1655966961: goto L33;
                case 3138974: goto L29;
                case 3202370: goto L1f;
                case 3446944: goto L15;
                default: goto L14;
            }
        L14:
            goto L3d
        L15:
            java.lang.String r2 = "post"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = r6
            goto L3e
        L1f:
            java.lang.String r2 = "hide"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = r3
            goto L3e
        L29:
            java.lang.String r2 = "feed"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = r5
            goto L3e
        L33:
            java.lang.String r2 = "activity"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = r4
            goto L3e
        L3d:
            r1 = -1
        L3e:
            if (r1 == 0) goto L47
            if (r1 == r6) goto L47
            if (r1 == r5) goto L47
            java.lang.String r1 = ""
            goto L4d
        L47:
            java.lang.String r1 = r9.f10655k
            java.lang.String r1 = com.android.thememanager.clockmessage.C1875q.m7398y(r1)
        L4d:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = r9.f10655k
            r2[r4] = r7
            int r4 = r9.f57852toq
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r6] = r4
            r2[r5] = r1
            long r4 = r9.f10656q
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            r2[r3] = r9
            r0.addRow(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.clockmessage.db.C1871k.m7385p(com.android.thememanager.clockmessage.model.k):android.database.Cursor");
    }

    /* JADX INFO: renamed from: q */
    public void m7386q(@dd String... types) {
        if (types == null || types.length <= 0) {
            return;
        }
        synchronized (f10647q) {
            for (String str : types) {
                getWritableDatabase().delete("message", "messageType=?", new String[]{str});
            }
        }
    }

    @dd
    public C1873k x2() {
        C1873k c1873kM7382k;
        synchronized (f10647q) {
            c1873kM7382k = m7382k(getReadableDatabase().query("message", this.f10650k, null, null, null, null, "updateTime desc", "1"));
        }
        return c1873kM7382k;
    }

    public void zy() {
        m7386q(C1873k.f10652g, C1873k.f10654y, "hide", "post");
    }

    private C1871k() {
        super(C2082k.m7998k(), f10645n, (SQLiteDatabase.CursorFactory) null, 1);
        this.f10650k = new String[]{"messageType", f10646p, f10643h, "updateTime"};
    }
}

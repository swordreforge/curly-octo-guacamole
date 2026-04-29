package com.android.thememanager.datacenter;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import bo.C1377k;
import com.android.thememanager.C2082k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.android.thememanager.datacenter.n */
/* JADX INFO: compiled from: LogDBManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1969n {

    /* JADX INFO: renamed from: k */
    private static final String f11154k = "n";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Object f58011toq = new Object();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static SQLiteDatabase f58012zy;

    /* JADX INFO: renamed from: k */
    public static long m7723k(C1377k bean) {
        synchronized (f58011toq) {
            long jInsert = -1;
            zy();
            SQLiteDatabase sQLiteDatabase = f58012zy;
            if (sQLiteDatabase == null || sQLiteDatabase.isReadOnly() || bean == null) {
                return -1L;
            }
            try {
                try {
                    f58012zy.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("msg", bean.toq());
                    contentValues.put("timestamp", Long.valueOf(bean.zy()));
                    jInsert = f58012zy.insert(f7l8.f11147y, null, contentValues);
                    f58012zy.setTransactionSuccessful();
                    f58012zy.endTransaction();
                    return jInsert;
                } catch (Exception e2) {
                    Log.e(f11154k, "add exception ", e2);
                    return jInsert;
                }
            } finally {
                f58012zy.close();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static ArrayList<C1377k> m7724q(long count) {
        synchronized (f58011toq) {
            zy();
            Cursor cursorQuery = null;
            if (f58012zy == null) {
                return null;
            }
            ArrayList<C1377k> arrayList = new ArrayList<>();
            try {
                try {
                    cursorQuery = f58012zy.query(f7l8.f11147y, null, null, null, null, null, "id asc", "0," + count);
                    if (cursorQuery.getCount() > 0) {
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(new C1377k(cursorQuery.getInt(cursorQuery.getColumnIndex("id")), cursorQuery.getLong(cursorQuery.getColumnIndex("timestamp")), cursorQuery.getString(cursorQuery.getColumnIndex("msg"))));
                        }
                    }
                    cursorQuery.close();
                    f58012zy.close();
                    return arrayList;
                } catch (Exception e2) {
                    Log.e(f11154k, "queryEarlyLog exception ", e2);
                    return arrayList;
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                f58012zy.close();
            }
        }
    }

    public static int toq(Collection<C1377k> collection) {
        synchronized (f58011toq) {
            zy();
            int i2 = 0;
            if (f58012zy == null || collection == null || collection.isEmpty()) {
                return 0;
            }
            try {
                try {
                    f58012zy.beginTransaction();
                    Iterator<C1377k> it = collection.iterator();
                    int iDelete = 0;
                    while (it.hasNext()) {
                        try {
                            iDelete += f58012zy.delete(f7l8.f11147y, "id=?", new String[]{String.valueOf(it.next().m5823k())});
                        } catch (Exception e2) {
                            e = e2;
                            i2 = iDelete;
                            Log.e(f11154k, "delete exception ", e);
                            return i2;
                        }
                    }
                    f58012zy.setTransactionSuccessful();
                    f58012zy.endTransaction();
                    return iDelete;
                } catch (Exception e3) {
                    e = e3;
                }
            } finally {
                f58012zy.close();
            }
        }
    }

    public static void zy() {
        try {
            f58012zy = C2082k.zy().toq().openOrCreateDatabase(f7l8.f11145n, 0, null);
        } catch (Exception e2) {
            Log.e(f11154k, "initDB exception", e2);
        }
    }
}

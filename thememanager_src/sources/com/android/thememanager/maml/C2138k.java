package com.android.thememanager.maml;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Log;
import com.android.thememanager.basemodule.analysis.C1704n;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.C1922n;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.maml.model.db.C2139k;
import com.google.gson.C4871g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import qo.toq;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.maml.k */
/* JADX INFO: compiled from: AnalyticsDataProducer.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2138k implements InterfaceC2148q, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    private static final String f12589g = "server";

    /* JADX INFO: renamed from: h */
    private static final String f12590h = "moduleId";

    /* JADX INFO: renamed from: i */
    private static final int f12591i = 50;

    /* JADX INFO: renamed from: n */
    private static final String f12592n = "userActions";

    /* JADX INFO: renamed from: p */
    private static final String f12593p = "content";

    /* JADX INFO: renamed from: q */
    private static final String f12594q = "AnalyticsDataProducer";

    /* JADX INFO: renamed from: s */
    private static final String f12595s = "action";

    /* JADX INFO: renamed from: y */
    private static final String f12596y = "ok";

    /* JADX INFO: renamed from: z */
    static final String f12597z = "analytics";

    /* JADX INFO: renamed from: k */
    private C2139k f12598k = C2139k.m8177k();

    C2138k() {
    }

    @Override // com.android.thememanager.maml.InterfaceC2148q
    public String toq(@lvui Uri uri) {
        return "vnd.android.cursor.item/api-analytics";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // com.android.thememanager.maml.InterfaceC2148q
    public Cursor zy(@lvui Uri uri, @dd String[] projection, @dd String selection, @dd String[] selectionArgs, @dd String sortOrder) throws Throwable {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        String path = uri.getPath();
        if (path == null || path.isEmpty()) {
            return null;
        }
        String str = "analytics" + File.separator;
        Uri uri2 = Uri.parse(path.substring(path.indexOf(str) + str.length()));
        if (uri2 == null) {
            return null;
        }
        String queryParameter = uri2.getQueryParameter("action");
        String queryParameter2 = uri2.getQueryParameter("content");
        String queryParameter3 = uri2.getQueryParameter("moduleId");
        String strM6646k = C1704n.toq().m6646k();
        MatrixCursor matrixCursor = new MatrixCursor(projection);
        if (uri2.getBooleanQueryParameter(f12589g, false)) {
            SQLiteDatabase writableDatabase = this.f12598k.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(toq.C7619k.ACTION, queryParameter);
            SQLiteDatabase sQLiteDatabase2 = "_content";
            contentValues.put("_content", queryParameter2);
            contentValues.put(toq.C7619k.GUID, strM6646k);
            contentValues.put(toq.C7619k.MODULE_ID, queryParameter3);
            writableDatabase.insert(C2139k.f12601n, null, contentValues);
            try {
                SQLiteDatabase sQLiteDatabase3 = writableDatabase;
                Cursor cursorQuery = writableDatabase.query(C2139k.f12601n, null, null, null, null, null, "_id");
                try {
                    int count = cursorQuery.getCount();
                    if (count > 49) {
                        ArrayList arrayList = new ArrayList();
                        if (cursorQuery.moveToFirst()) {
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                do {
                                    arrayList2.add(String.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("_id"))));
                                    arrayList.add(new toq.C7619k(cursorQuery.getString(cursorQuery.getColumnIndex(toq.C7619k.ACTION)), cursorQuery.getString(cursorQuery.getColumnIndex("_content")), cursorQuery.getString(cursorQuery.getColumnIndex(toq.C7619k.GUID)), cursorQuery.getString(cursorQuery.getColumnIndex(toq.C7619k.MODULE_ID))));
                                    if (cursorQuery.moveToNext()) {
                                    }
                                    break;
                                } while (arrayList.size() < 50);
                                break;
                                sQLiteDatabase3.beginTransaction();
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    sQLiteDatabase = sQLiteDatabase3;
                                    try {
                                        sQLiteDatabase.delete(C2139k.f12601n, "_id=?", new String[]{(String) it.next()});
                                        sQLiteDatabase3 = sQLiteDatabase;
                                    } catch (C1922n e2) {
                                        e = e2;
                                        Log.e(f12594q, "API_ANALYTICS throw an exception - " + e);
                                        sQLiteDatabase.endTransaction();
                                        miuix.core.util.f7l8.m25531k(cursorQuery);
                                        return matrixCursor;
                                    } catch (IOException e3) {
                                        e = e3;
                                        Log.e(f12594q, "API_ANALYTICS throw an exception - " + e);
                                        sQLiteDatabase.endTransaction();
                                        miuix.core.util.f7l8.m25531k(cursorQuery);
                                        return matrixCursor;
                                    }
                                }
                                sQLiteDatabase = sQLiteDatabase3;
                                String strO1t = new C4871g().o1t(new qo.toq(arrayList));
                                zurt zurtVar = new zurt(InterfaceC1925p.huhj, 1, zurt.EnumC1946k.API_PROXY);
                                zurtVar.addParameter(f12592n, strO1t);
                                zurtVar.setHttpMethod(zurt.toq.POST);
                                String strF7l8 = C1915g.f7l8(zurtVar);
                                if ("ok".equals(strF7l8)) {
                                    sQLiteDatabase.setTransactionSuccessful();
                                }
                                matrixCursor.addRow(new Object[]{strF7l8});
                            } catch (C1922n e4) {
                                e = e4;
                                sQLiteDatabase = sQLiteDatabase3;
                                Log.e(f12594q, "API_ANALYTICS throw an exception - " + e);
                                sQLiteDatabase.endTransaction();
                                miuix.core.util.f7l8.m25531k(cursorQuery);
                                return matrixCursor;
                            } catch (IOException e6) {
                                e = e6;
                                sQLiteDatabase = sQLiteDatabase3;
                                Log.e(f12594q, "API_ANALYTICS throw an exception - " + e);
                                sQLiteDatabase.endTransaction();
                                miuix.core.util.f7l8.m25531k(cursorQuery);
                                return matrixCursor;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteDatabase2 = sQLiteDatabase3;
                                sQLiteDatabase2.endTransaction();
                                throw th;
                            }
                            sQLiteDatabase.endTransaction();
                        }
                    } else {
                        matrixCursor.addRow(new Object[]{Integer.valueOf(count)});
                    }
                    miuix.core.util.f7l8.m25531k(cursorQuery);
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorQuery;
                    miuix.core.util.f7l8.m25531k(cursor);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
            }
        } else {
            matrixCursor.addRow(new Object[]{"ok"});
        }
        return matrixCursor;
    }
}

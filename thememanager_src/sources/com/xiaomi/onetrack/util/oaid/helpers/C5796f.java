package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.f */
/* JADX INFO: loaded from: classes3.dex */
public class C5796f {
    /* JADX INFO: renamed from: a */
    public String m20327a(Context context) {
        String strM20326a = "";
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            strM20326a = m20326a(cursorQuery);
            cursorQuery.close();
            return strM20326a;
        } catch (Throwable th) {
            th.printStackTrace();
            return strM20326a;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m20326a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return null;
        }
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("value");
        String string = columnIndex > 0 ? cursor.getString(columnIndex) : null;
        int columnIndex2 = cursor.getColumnIndex("code");
        if (columnIndex2 > 0) {
            cursor.getInt(columnIndex2);
        }
        int columnIndex3 = cursor.getColumnIndex("expired");
        if (columnIndex3 > 0) {
            cursor.getLong(columnIndex3);
        }
        return string;
    }
}

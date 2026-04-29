package com.xiaomi.onetrack.util.oaid.helpers;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.oaid.helpers.l */
/* JADX INFO: loaded from: classes3.dex */
public class C5802l {

    /* JADX INFO: renamed from: a */
    private static final String f32405a = "VivoDeviceIDHelper";

    /* JADX INFO: renamed from: a */
    public String m20337a(Context context) {
        String string;
        string = "";
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
            if (cursorQuery != null) {
                string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : "";
                cursorQuery.close();
            }
        } catch (Exception e2) {
            C5804p.m20342a(f32405a, e2.getMessage());
        }
        return string;
    }
}

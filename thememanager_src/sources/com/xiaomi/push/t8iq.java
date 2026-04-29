package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import com.xiaomi.push.y2;

/* JADX INFO: loaded from: classes3.dex */
public class t8iq extends y2.C5963n {

    /* JADX INFO: renamed from: i */
    private String f33963i;

    public t8iq(String str, ContentValues contentValues, String str2) {
        super(str, contentValues);
        this.f33963i = str2;
    }

    public static t8iq ld6(Context context, String str, kl7m kl7mVar) {
        byte[] bArrM21397g = qla.m21397g(kl7mVar);
        if (bArrM21397g == null || bArrM21397g.length <= 0) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 0);
        contentValues.put("messageId", "");
        contentValues.put("messageItemId", kl7mVar.m21127d());
        contentValues.put("messageItem", bArrM21397g);
        contentValues.put("appId", bf2.toq(context).x2());
        contentValues.put("packageName", bf2.toq(context).m20647q());
        contentValues.put("createTimeStamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("uploadTimestamp", (Integer) 0);
        return new t8iq(str, contentValues, "a job build to insert message to db");
    }
}

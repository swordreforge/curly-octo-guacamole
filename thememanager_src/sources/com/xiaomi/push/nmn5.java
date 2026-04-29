package com.xiaomi.push;

import android.content.Context;
import android.database.Cursor;
import com.xiaomi.push.y2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class nmn5 extends y2.toq<Long> {

    /* JADX INFO: renamed from: e */
    private long f33447e;

    /* JADX INFO: renamed from: j */
    private String f33448j;

    public nmn5(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i2, String str6) {
        super(str, list, str2, strArr, str3, str4, str5, i2);
        this.f33447e = 0L;
        this.f33448j = str6;
    }

    public static nmn5 qrj(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("count(*)");
        return new nmn5(str, arrayList, null, null, null, null, null, 0, "job to get count of all message");
    }

    @Override // com.xiaomi.push.y2.toq
    /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
    public Long ld6(Context context, Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    @Override // com.xiaomi.push.y2.AbstractRunnableC5962k
    public Object toq() {
        return Long.valueOf(this.f33447e);
    }

    @Override // com.xiaomi.push.y2.toq
    public void x2(Context context, List<Long> list) {
        if (context == null || list == null || list.size() <= 0) {
            return;
        }
        this.f33447e = list.get(0).longValue();
    }
}

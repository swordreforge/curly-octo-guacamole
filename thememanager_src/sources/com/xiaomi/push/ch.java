package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ch extends lv5 {
    public ch(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    private void qrj(long j2) {
        String[] strArr = this.f34201i;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        strArr[0] = String.valueOf(j2);
    }

    public static ch x2(Context context, String str, int i2) {
        com.xiaomi.channel.commonutils.logger.zy.m19302z("delete  messages when db size is too bigger");
        String strZy = y2.toq(context).zy(str);
        if (TextUtils.isEmpty(strZy)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("rowDataId in (select ");
        sb.append("rowDataId from " + strZy);
        sb.append(" order by createTimeStamp asc");
        sb.append(" limit ?)");
        return new ch(str, sb.toString(), new String[]{String.valueOf(i2)}, "a job build to delete history message");
    }

    @Override // com.xiaomi.push.y2.AbstractRunnableC5962k
    /* JADX INFO: renamed from: g */
    public void mo20693g(Context context, Object obj) {
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            long jM20979k = ikck.m20979k(zy());
            long j2 = zp.f73775toq;
            if (jM20979k <= j2) {
                com.xiaomi.channel.commonutils.logger.zy.m19302z("db size is suitable");
                return;
            }
            long j3 = (long) ((((jM20979k - j2) * 1.2d) / j2) * jLongValue);
            qrj(j3);
            bf2.toq(context).m20648s("begin delete " + j3 + "noUpload messages , because db size is " + jM20979k + "B");
            super.mo20693g(context, obj);
        }
    }
}

package com.xiaomi.push;

import android.app.NotificationChannel;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.owi;
import com.xiaomi.push.vahq;

/* JADX INFO: loaded from: classes3.dex */
public class qla {
    /* JADX INFO: renamed from: g */
    public static <T extends oaex<T, ?>> byte[] m21397g(T t2) {
        if (t2 == null) {
            return null;
        }
        try {
            return new eklw(new vahq.C5952k()).m20779k(t2);
        } catch (sb e2) {
            com.xiaomi.channel.commonutils.logger.zy.cdj("convertThriftObjectToBytes catch TException.", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    private static int m21398k(Context context, String str, String str2) {
        com.xiaomi.push.service.wvg wvgVarM21784n;
        NotificationChannel qVar;
        if (context == null || TextUtils.isEmpty(str) || (wvgVarM21784n = com.xiaomi.push.service.wvg.m21784n(context, str)) == null || (qVar = wvgVarM21784n.toq(wvgVarM21784n.m21788s(str2))) == null) {
            return 0;
        }
        return qVar.getImportance() != 0 ? 32 : 64;
    }

    /* JADX INFO: renamed from: n */
    public static <T extends oaex<T, ?>> void m21399n(T t2, byte[] bArr) {
        if (bArr == null) {
            throw new sb("the message byte is empty.");
        }
        new d6c(new owi.C5888k(true, true, bArr.length)).m20719k(t2, bArr);
    }

    /* JADX INFO: renamed from: q */
    public static short m21400q(Context context, String str, String str2) {
        return (short) (uf.m21858g(context, str, false).m21868a() + 0 + (C5894s.toq(context) ? 4 : 0) + (C5894s.m21457k(context) ? 8 : 0) + (com.xiaomi.push.service.wvg.m21782i(context) ? 16 : 0) + m21398k(context, str, str2));
    }

    public static short toq(Context context, m28 m28Var) {
        ge geVarM21235a = m28Var.m21235a();
        return m21400q(context, m28Var.f33393b, (geVarM21235a == null || geVarM21235a.m20907a() == null) ? null : geVarM21235a.m20907a().get("channel_id"));
    }

    public static short zy(Context context, String str) {
        return m21400q(context, str, null);
    }
}

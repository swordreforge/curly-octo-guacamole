package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class o1t implements InterfaceC5868i {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile o1t f73508zy;

    /* JADX INFO: renamed from: k */
    private InterfaceC5868i f33485k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f73509toq = C5966z.f34219k;

    private o1t(Context context) {
        this.f33485k = C5966z.m22064k(context);
        com.xiaomi.channel.commonutils.logger.zy.kja0("create id manager is: " + this.f73509toq);
    }

    /* JADX INFO: renamed from: k */
    public static o1t m21340k(Context context) {
        if (f73508zy == null) {
            synchronized (o1t.class) {
                if (f73508zy == null) {
                    f73508zy = new o1t(context.getApplicationContext());
                }
            }
        }
        return f73508zy;
    }

    private String toq(String str) {
        return str == null ? "" : str;
    }

    @Override // com.xiaomi.push.InterfaceC5868i
    /* JADX INFO: renamed from: a */
    public boolean mo20573a() {
        return this.f33485k.mo20573a();
    }

    public String f7l8() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public String m21341g() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public String m21342n() {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public void m21343q(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String strM21342n = m21342n();
        if (!TextUtils.isEmpty(strM21342n)) {
            map.put("udid", strM21342n);
        }
        String strMo20572a = mo20572a();
        if (!TextUtils.isEmpty(strMo20572a)) {
            map.put("oaid", strMo20572a);
        }
        String strM21341g = m21341g();
        if (!TextUtils.isEmpty(strM21341g)) {
            map.put("vaid", strM21341g);
        }
        String strF7l8 = f7l8();
        if (!TextUtils.isEmpty(strF7l8)) {
            map.put("aaid", strF7l8);
        }
        map.put("oaid_type", String.valueOf(this.f73509toq));
    }

    public void zy() {
    }

    @Override // com.xiaomi.push.InterfaceC5868i
    /* JADX INFO: renamed from: a */
    public String mo20572a() {
        return toq(this.f33485k.mo20572a());
    }
}

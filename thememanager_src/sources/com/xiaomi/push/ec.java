package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.push.lh;
import com.xiaomi.push.service.eqxt;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
class ec {
    /* JADX INFO: renamed from: k */
    public static void m20772k(eqxt.toq toqVar, String str, imd imdVar) {
        String qVar;
        lh.zy zyVar = new lh.zy();
        if (!TextUtils.isEmpty(toqVar.f73606zy)) {
            zyVar.ld6(toqVar.f73606zy);
        }
        if (!TextUtils.isEmpty(toqVar.f33758g)) {
            zyVar.m21197i(toqVar.f33758g);
        }
        if (!TextUtils.isEmpty(toqVar.f73595f7l8)) {
            zyVar.ni7(toqVar.f73595f7l8);
        }
        zyVar.n7h(toqVar.f33762n ? "1" : "0");
        if (TextUtils.isEmpty(toqVar.f33764q)) {
            zyVar.cdj("XIAOMI-SASL");
        } else {
            zyVar.cdj(toqVar.f33764q);
        }
        o5 o5Var = new o5();
        o5Var.m21352t(toqVar.f73603toq);
        o5Var.m21353y(Integer.parseInt(toqVar.f33766y));
        o5Var.zurt(toqVar.f33761k);
        o5Var.x2("BIND", null);
        o5Var.ld6(o5Var.jk());
        com.xiaomi.channel.commonutils.logger.zy.kja0("[Slim]: bind id=" + o5Var.jk());
        HashMap map = new HashMap();
        map.put("challenge", str);
        map.put("token", toqVar.f73606zy);
        map.put("chid", toqVar.f33766y);
        map.put("from", toqVar.f73603toq);
        map.put("id", o5Var.jk());
        map.put("to", "xiaomi.com");
        if (toqVar.f33762n) {
            map.put("kick", "1");
        } else {
            map.put("kick", "0");
        }
        if (TextUtils.isEmpty(toqVar.f33758g)) {
            map.put("client_attrs", "");
        } else {
            map.put("client_attrs", toqVar.f33758g);
        }
        if (TextUtils.isEmpty(toqVar.f73595f7l8)) {
            map.put("cloud_attrs", "");
        } else {
            map.put("cloud_attrs", toqVar.f73595f7l8);
        }
        if (toqVar.f33764q.equals("XIAOMI-PASS") || toqVar.f33764q.equals("XMPUSH-PASS")) {
            qVar = ncyb.toq(toqVar.f33764q, null, map, toqVar.f33765s);
        } else {
            toqVar.f33764q.equals("XIAOMI-SASL");
            qVar = null;
        }
        zyVar.o1t(qVar);
        o5Var.n7h(zyVar.m20674y(), null);
        imdVar.ni7(o5Var);
    }

    public static void toq(String str, String str2, imd imdVar) {
        o5 o5Var = new o5();
        o5Var.m21352t(str2);
        o5Var.m21353y(Integer.parseInt(str));
        o5Var.x2("UBND", null);
        imdVar.ni7(o5Var);
    }
}

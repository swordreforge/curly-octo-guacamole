package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.push.C5883n;
import com.xiaomi.push.anhx;
import com.xiaomi.push.fh;
import com.xiaomi.push.k4jz;
import com.xiaomi.push.le7;
import com.xiaomi.push.mub;
import com.xiaomi.push.vg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class fti {
    /* JADX INFO: renamed from: k */
    public static int m21613k(a9 a9Var, le7 le7Var) {
        return a9Var.toq(le7Var, jp0y.f33821k[le7Var.ordinal()] != 1 ? 0 : 1);
    }

    /* JADX INFO: renamed from: q */
    public static void m21614q(a9 a9Var, vg vgVar) {
        com.xiaomi.channel.commonutils.logger.zy.wvg("OnlineConfigHelper", "-->updateNormalConfigs(): onlineConfig=", a9Var, ", configMessage=", vgVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (fh fhVar : vgVar.m21904a()) {
            arrayList.add(new Pair<>(fhVar.m20865a(), Integer.valueOf(fhVar.m20863a())));
            List<Pair<Integer, Object>> qVar = toq(fhVar.f32929a, false);
            if (!C5883n.m21299k(qVar)) {
                arrayList2.addAll(qVar);
            }
        }
        a9Var.x2(arrayList, arrayList2);
        a9Var.n7h();
    }

    private static List<Pair<Integer, Object>> toq(List<anhx> list, boolean z2) {
        if (C5883n.m21299k(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (anhx anhxVar : list) {
            int iM20582a = anhxVar.m20582a();
            mub mubVarM21298a = mub.m21298a(anhxVar.m20590b());
            if (mubVarM21298a != null) {
                if (z2 && anhxVar.f32671a) {
                    arrayList.add(new Pair(Integer.valueOf(iM20582a), null));
                } else {
                    int i2 = jp0y.f73625toq[mubVarM21298a.ordinal()];
                    arrayList.add(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : new Pair(Integer.valueOf(iM20582a), Boolean.valueOf(anhxVar.m20602g())) : new Pair(Integer.valueOf(iM20582a), anhxVar.m20585a()) : new Pair(Integer.valueOf(iM20582a), Long.valueOf(anhxVar.m20584a())) : new Pair(Integer.valueOf(iM20582a), Integer.valueOf(anhxVar.m20593c())));
                }
            }
        }
        return arrayList;
    }

    public static void zy(a9 a9Var, k4jz k4jzVar) {
        com.xiaomi.channel.commonutils.logger.zy.wvg("OnlineConfigHelper", "-->updateCustomConfigs(): onlineConfig=", a9Var, ", configMessage=", k4jzVar);
        a9Var.ld6(toq(k4jzVar.m21063a(), true));
        a9Var.n7h();
    }
}

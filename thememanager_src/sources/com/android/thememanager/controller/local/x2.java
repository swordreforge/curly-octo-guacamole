package com.android.thememanager.controller.local;

import android.app.Activity;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.local.InterfaceC1744k;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.model.BatchOperationResources;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.fu4;
import com.android.thememanager.o1t;
import com.android.thememanager.service.ThemeSchedulerService;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.gc3c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: LocalThemeOperationHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class x2 implements com.android.thememanager.basemodule.resource.constants.toq, InterfaceC1357q, com.android.thememanager.basemodule.analysis.ld6 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m7537q(List list, fu4 fu4Var) throws Throwable {
        o1t o1tVarM8000g = C2082k.zy().m8000g();
        zy.C1711k c1711k = new zy.C1711k();
        c1711k.f9808n = true;
        c1711k.f57496toq = com.android.thememanager.basemodule.analysis.toq.wvka;
        c1711k.f57497zy = "";
        c1711k.f9807k = com.android.thememanager.basemodule.analysis.f7l8.m6607g();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Resource resource = (Resource) it.next();
            if (!o1tVarM8000g.n7h(resource)) {
                o1tVarM8000g.m8431g(resource, fu4Var, c1711k, false);
            }
        }
    }

    public static boolean toq(Activity activity, C1791k newResourceContext, List<Resource> lastCheckBatchLocalResources, InterfaceC1744k dataSetObserver) {
        if (!gc3c.cdj(activity)) {
            return false;
        }
        String strM9744h = g1.m9744h(null);
        ArrayList arrayList = new ArrayList();
        fu4 fu4VarM10537n = C2082k.zy().m8001n().m10537n(newResourceContext);
        com.android.thememanager.controller.ld6 ld6VarM7690k = new com.android.thememanager.controller.x2(fu4VarM10537n).m7690k();
        ld6VarM7690k.m7669k(dataSetObserver);
        o1t o1tVarM8000g = C2082k.zy().m8000g();
        for (Resource resource : lastCheckBatchLocalResources) {
            if (ld6VarM7690k.mo7478t(resource) && ld6VarM7690k.mcp(resource) && !o1tVarM8000g.kja0(resource)) {
                if (strM9744h == null || !strM9744h.equals(resource.getLocalId())) {
                    arrayList.add(resource);
                } else {
                    arrayList.add(0, resource);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        ThemeSchedulerService.ki(activity, fu4VarM10537n.getResourceCode(), arrayList);
        return true;
    }

    public static BatchOperationResources zy(C1791k newResourceContext) {
        com.android.thememanager.controller.x2 x2VarLd6 = C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10537n(newResourceContext));
        int iX2 = x2VarLd6.m7690k().x2();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (iX2 > 0) {
            Object[] array = x2VarLd6.m7690k().kja0().toArray();
            int length = array.length;
            int i3 = 0;
            while (i2 < length) {
                Resource resource = (Resource) array[i2];
                if (C2082k.zy().m8000g().kja0(resource)) {
                    i3++;
                }
                arrayList.add(resource);
                i2++;
            }
            i2 = i3;
        }
        return new BatchOperationResources(iX2, i2, arrayList);
    }
}

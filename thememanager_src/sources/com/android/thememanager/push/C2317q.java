package com.android.thememanager.push;

import android.text.TextUtils;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.ld6;
import com.android.thememanager.controller.x2;
import com.android.thememanager.fu4;
import com.android.thememanager.o1t;
import com.android.thememanager.push.InterfaceC2316n;
import com.android.thememanager.util.bwp;
import java.io.File;

/* JADX INFO: renamed from: com.android.thememanager.push.q */
/* JADX INFO: compiled from: ThemePushActionPC.java */
/* JADX INFO: loaded from: classes2.dex */
class C2317q extends C2315k {
    protected C2317q(C2319y pushMsg) {
        super(pushMsg);
    }

    private boolean kja0(Resource resource, fu4 resContext, ld6 dataMgr) {
        String resourceCode = resContext.getResourceCode();
        if (bwp.ki(resourceCode) || bwp.ni7(resourceCode)) {
            return new File(o1t.f7l8(resource, resContext)).exists();
        }
        dataMgr.kja0();
        return dataMgr.mo7478t(resource) && !dataMgr.mcp(resource);
    }

    @Override // com.android.thememanager.push.C2315k
    protected int ld6() {
        if (InterfaceC2316n.g.f13506n.equals(this.f60608toq.f60622x2.get(InterfaceC2316n.zy.f13518k))) {
            String str = this.f60608toq.f60622x2.get(InterfaceC2316n.g.f60613f7l8);
            String strM5744q = p001b.toq.m5744q(this.f60608toq.f60622x2.get(InterfaceC2316n.g.f13505g));
            if (str == null || TextUtils.isEmpty(strM5744q)) {
                n7h("invalid format!");
            } else {
                o1t o1tVarM8000g = C2082k.zy().m8000g();
                fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(strM5744q);
                ld6 ld6VarM7690k = new x2(fu4VarM10535g).m7690k();
                Resource resourceT8r = ld6VarM7690k.t8r(str);
                if (resourceT8r == null || o1tVarM8000g.n7h(resourceT8r)) {
                    n7h("duplicate-downloading!");
                } else {
                    if (!kja0(resourceT8r, fu4VarM10535g, ld6VarM7690k)) {
                        zy.C1711k c1711k = new zy.C1711k();
                        c1711k.f57496toq = com.android.thememanager.basemodule.analysis.toq.gg;
                        c1711k.f57497zy = "";
                        c1711k.f9807k = com.android.thememanager.basemodule.analysis.toq.wwr9;
                        o1tVarM8000g.m8434n(resourceT8r, fu4VarM10535g, c1711k);
                        return 1;
                    }
                    n7h("duplicate-local exist!");
                }
            }
        }
        return -1;
    }
}

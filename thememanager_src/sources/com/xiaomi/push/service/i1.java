package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.anw;
import com.xiaomi.push.e4e;
import com.xiaomi.push.erbd;
import com.xiaomi.push.ff;
import com.xiaomi.push.kjd;
import com.xiaomi.push.m28;
import com.xiaomi.push.nod;
import com.xiaomi.push.oaex;
import com.xiaomi.push.qla;
import com.xiaomi.push.rf;
import com.xiaomi.push.uv;
import com.xiaomi.push.wwp;
import com.xiaomi.push.x7o;
import com.xiaomi.push.z8;

/* JADX INFO: loaded from: classes3.dex */
public class i1 {
    /* JADX INFO: renamed from: k */
    public static oaex m21620k(Context context, m28 m28Var) {
        if (m28Var.m21253b()) {
            return null;
        }
        byte[] bArrM21248a = m28Var.m21248a();
        oaex qVar = toq(m28Var.m21242a(), m28Var.f33394b);
        if (qVar != null) {
            qla.m21399n(qVar, bArrM21248a);
        }
        return qVar;
    }

    private static oaex toq(wwp wwpVar, boolean z2) {
        switch (a98o.f33718k[wwpVar.ordinal()]) {
            case 1:
                return new e4e();
            case 2:
                return new anw();
            case 3:
                return new ff();
            case 4:
                return new uv();
            case 5:
                return new rf();
            case 6:
                return new x7o();
            case 7:
                return new kjd();
            case 8:
                return new nod();
            case 9:
                if (z2) {
                    return new erbd();
                }
                z8 z8Var = new z8();
                z8Var.m22085a(true);
                return z8Var;
            case 10:
                return new kjd();
            default:
                return null;
        }
    }
}

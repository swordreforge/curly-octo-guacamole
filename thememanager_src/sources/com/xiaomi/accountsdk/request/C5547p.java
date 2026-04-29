package com.xiaomi.accountsdk.request;

import com.xiaomi.accountsdk.account.C5500p;
import com.xiaomi.accountsdk.account.stat.AbstractC5503k;
import com.xiaomi.accountsdk.utils.fti;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.request.p */
/* JADX INFO: compiled from: IPStatHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5547p {
    /* JADX INFO: renamed from: k */
    protected String m18979k() {
        return kja0.zy(C5500p.toq());
    }

    /* JADX INFO: renamed from: q */
    protected void m18980q(String str) {
        if (fti.toq()) {
            return;
        }
        toq().mo18816g(str, 0L);
    }

    protected AbstractC5503k toq() {
        return AbstractC5503k.toq();
    }

    protected void zy(String str, String str2) {
        toq().mo18818q(str, str2);
    }
}

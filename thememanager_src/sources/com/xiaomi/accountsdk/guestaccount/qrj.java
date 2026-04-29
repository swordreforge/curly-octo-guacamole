package com.xiaomi.accountsdk.guestaccount;

import android.content.Context;
import com.xiaomi.accountsdk.guestaccount.data.GuestAccount;

/* JADX INFO: compiled from: GuestAccountStorage.java */
/* JADX INFO: loaded from: classes3.dex */
class qrj {
    qrj() {
    }

    /* JADX INFO: renamed from: g */
    void m18888g(Context context, GuestAccount guestAccount) {
        zy.m18899k(context).ld6(guestAccount);
    }

    /* JADX INFO: renamed from: k */
    GuestAccount m18889k(Context context) {
        return toq(context, null);
    }

    /* JADX INFO: renamed from: n */
    void m18890n(Context context, GuestAccount guestAccount) {
        zy.m18899k(context).m18900p(guestAccount);
    }

    /* JADX INFO: renamed from: q */
    void m18891q(Context context, String str) {
        zy.m18899k(context).m18902y(str);
    }

    GuestAccount toq(Context context, String str) {
        return zy.m18899k(context).zy(str);
    }

    void zy(Context context) {
        zy.m18899k(context).m18901q();
    }
}

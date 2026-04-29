package com.xiaomi.accountsdk.guestaccount;

import android.app.Activity;
import android.content.Context;
import com.xiaomi.accountsdk.guestaccount.GuestAccountUiHelper;

/* JADX INFO: compiled from: IGuestAccountManager.java */
/* JADX INFO: loaded from: classes3.dex */
public interface n7h {
    void f7l8(f7l8 f7l8Var);

    /* JADX INFO: renamed from: g */
    com.xiaomi.accountsdk.guestaccount.data.toq mo18882g(Context context, String str);

    /* JADX INFO: renamed from: k */
    void mo18877k();

    com.xiaomi.accountsdk.guestaccount.data.toq ld6(Context context, String str, String str2);

    /* JADX INFO: renamed from: n */
    com.xiaomi.accountsdk.guestaccount.data.toq mo18883n(Context context, String str);

    void onXiaomiAccountCTAAllowed();

    /* JADX INFO: renamed from: p */
    void mo18878p();

    /* JADX INFO: renamed from: q */
    void mo18884q(Activity activity, com.xiaomi.accountsdk.guestaccount.data.zy zyVar);

    /* JADX INFO: renamed from: s */
    void mo18879s(InterfaceC5518g interfaceC5518g);

    void toq(GuestAccountUiHelper.InterfaceC5510q interfaceC5510q);

    /* JADX INFO: renamed from: y */
    void mo18880y(InterfaceC5519k interfaceC5519k);

    com.xiaomi.accountsdk.guestaccount.data.toq zy();
}

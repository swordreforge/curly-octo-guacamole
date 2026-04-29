package com.xiaomi.passport.servicetoken;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.accountsdk.utils.C5577s;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import com.xiaomi.passport.servicetoken.data.XmAccountVisibility;

/* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.y */
/* JADX INFO: compiled from: ServiceTokenUtilAM.java */
/* JADX INFO: loaded from: classes3.dex */
class C5834y extends AbstractC5831p {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC5832q f73230toq;

    C5834y(InterfaceC5832q interfaceC5832q) {
        if (interfaceC5832q == null) {
            throw new IllegalArgumentException("amUtil == null");
        }
        this.f73230toq = interfaceC5832q;
    }

    private ServiceTokenResult ld6(String str) {
        return new ServiceTokenResult.C5817k(str).cdj(ServiceTokenResult.toq.ERROR_NO_ACCOUNT).n7h();
    }

    /* JADX INFO: renamed from: p */
    static String m20480p(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split(",");
        if (strArrSplit.length == 2 && str.equalsIgnoreCase(strArrSplit[0])) {
            return strArrSplit[1];
        }
        return null;
    }

    @Override // com.xiaomi.passport.servicetoken.AbstractC5831p
    public final ServiceTokenResult f7l8(Context context, String str) {
        Account accountMo20472g = this.f73230toq.mo20472g(context);
        if (accountMo20472g == null) {
            return ld6(str);
        }
        String strZy = this.f73230toq.zy(context, str, accountMo20472g);
        if (!TextUtils.isEmpty(strZy)) {
            return m20481s(context, accountMo20472g, C5824k.m20461q(str, strZy, true));
        }
        try {
            return m20481s(context, accountMo20472g, C5824k.toq(this.f73230toq.f7l8(context, str, accountMo20472g).getResult(), str));
        } catch (Exception e2) {
            return C5824k.zy(str, e2);
        }
    }

    @Override // com.xiaomi.passport.servicetoken.AbstractC5831p
    /* JADX INFO: renamed from: g */
    protected XmAccountVisibility mo20463g(Context context) {
        Account accountMo20472g = this.f73230toq.mo20472g(context);
        return accountMo20472g == null ? new XmAccountVisibility.C5821k(XmAccountVisibility.toq.ERROR_NO_ACCOUNT, null).m20455y() : new XmAccountVisibility.C5821k(XmAccountVisibility.toq.ERROR_NONE, null).f7l8(true, accountMo20472g).m20455y();
    }

    /* JADX INFO: renamed from: s */
    final ServiceTokenResult m20481s(Context context, Account account, ServiceTokenResult serviceTokenResult) {
        if (serviceTokenResult.f32506g != ServiceTokenResult.toq.ERROR_NONE || TextUtils.isEmpty(serviceTokenResult.f32509k) || TextUtils.isEmpty(serviceTokenResult.f32513q)) {
            return serviceTokenResult;
        }
        String strM19132n = C5577s.m19132n(serviceTokenResult.f32513q);
        String qVar = this.f73230toq.toq(context, account);
        String strM20480p = m20480p(strM19132n, this.f73230toq.mo20475q(context, serviceTokenResult.f32509k, account));
        return new ServiceTokenResult.C5817k(serviceTokenResult.f32509k).fu4(serviceTokenResult.f32513q).ni7(serviceTokenResult.f32511n).cdj(serviceTokenResult.f32506g).ki(serviceTokenResult.f32517y).t8r(serviceTokenResult.f32515s).fn3e(serviceTokenResult.f32516t).kja0(qVar).m20445z(strM20480p).zurt(m20480p(strM19132n, this.f73230toq.mo20474n(context, serviceTokenResult.f32509k, account))).wvg(account.name).n7h();
    }

    @Override // com.xiaomi.passport.servicetoken.AbstractC5831p
    /* JADX INFO: renamed from: y */
    protected final ServiceTokenResult mo20465y(Context context, ServiceTokenResult serviceTokenResult) {
        if (this.f73230toq.mo20472g(context) == null) {
            return ld6(serviceTokenResult.f32509k);
        }
        this.f73230toq.mo20473k(context, C5824k.m20459k(serviceTokenResult));
        return new ServiceTokenResult.C5817k(serviceTokenResult.f32509k).n7h();
    }

    @Override // com.xiaomi.passport.servicetoken.InterfaceC5830n
    public boolean zy(Context context) {
        return true;
    }
}

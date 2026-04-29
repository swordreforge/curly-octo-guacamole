package com.xiaomi.passport.servicetoken;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.accountsdk.account.data.C5480k;
import com.xiaomi.accountsdk.futureservice.AbstractC5505k;
import com.xiaomi.accountsdk.futureservice.C5506q;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.accountsdk.utils.fn3e;
import com.xiaomi.accountsdk.utils.ni7;
import com.xiaomi.accountsdk.utils.zurt;
import com.xiaomi.passport.IPassportServiceTokenService;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import com.xiaomi.passport.servicetoken.data.XmAccountVisibility;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: ServiceTokenUtilMiui.java */
/* JADX INFO: loaded from: classes3.dex */
final class ld6 extends AbstractC5831p {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73221toq = "ServiceTokenUtilMiui";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile AtomicBoolean f73222zy = new AtomicBoolean(true);

    /* JADX INFO: renamed from: q */
    private static volatile Boolean f32542q = null;

    /* JADX INFO: compiled from: ServiceTokenUtilMiui.java */
    private static abstract class f7l8 extends AbstractC5829y<ServiceTokenResult> {
        protected f7l8(Context context, com.xiaomi.passport.servicetoken.f7l8 f7l8Var) {
            super(context, f7l8Var);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.ld6$g */
    /* JADX INFO: compiled from: ServiceTokenUtilMiui.java */
    private static class C5825g {

        /* JADX INFO: renamed from: k */
        private static volatile Boolean f32543k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static volatile Boolean f73223toq;

        private C5825g() {
        }

        /* JADX INFO: renamed from: k */
        static boolean m20466k() {
            if (f32543k != null) {
                return f32543k.booleanValue();
            }
            boolean z2 = false;
            if ((fn3e.m19074q(false) && ni7.zy(new ni7(8, 0), false)) || (fn3e.zy(false) && zurt.zy(new zurt(6, 7, 1), false))) {
                z2 = true;
            }
            if (f32543k == null) {
                f32543k = new Boolean(z2);
            }
            return f32543k.booleanValue();
        }

        static boolean toq() {
            if (f73223toq != null) {
                return f73223toq.booleanValue();
            }
            boolean z2 = false;
            if ((fn3e.m19074q(false) && ni7.zy(new ni7(8, 2), false)) || (fn3e.zy(false) && zurt.zy(new zurt(6, 11, 25), false))) {
                z2 = true;
            }
            if (f73223toq == null) {
                f73223toq = new Boolean(z2);
            }
            return f73223toq.booleanValue();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.ld6$k */
    /* JADX INFO: compiled from: ServiceTokenUtilMiui.java */
    class C5826k extends f7l8 {

        /* JADX INFO: renamed from: r */
        final /* synthetic */ Context f32545r;

        /* JADX INFO: renamed from: t */
        final /* synthetic */ String f32546t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5826k(Context context, com.xiaomi.passport.servicetoken.f7l8 f7l8Var, String str, Context context2) {
            super(context, f7l8Var);
            this.f32546t = str;
            this.f32545r = context2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public ServiceTokenResult mo18841q() throws RemoteException {
            return ServiceTokenUIErrorHandler.m20446k(this.f32545r, m18843y().getServiceToken(this.f32546t));
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.ld6$n */
    /* JADX INFO: compiled from: ServiceTokenUtilMiui.java */
    class C5827n extends AbstractC5829y<XmAccountVisibility> {

        /* JADX INFO: renamed from: t */
        final /* synthetic */ Context f32548t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5827n(Context context, AbstractC5505k abstractC5505k, Context context2) {
            super(context, abstractC5505k);
            this.f32548t = context2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public XmAccountVisibility mo18841q() throws RemoteException {
            if (m18843y().supportAccessAccount()) {
                return m18843y().setAccountVisible(this.f32548t.getPackageName());
            }
            return new XmAccountVisibility.C5821k(XmAccountVisibility.toq.ERROR_NOT_SUPPORT, null).m20454s(AccountManager.newChooseAccountIntent(null, null, new String[]{"com.xiaomi"}, null, null, null, null)).m20455y();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.ld6$q */
    /* JADX INFO: compiled from: ServiceTokenUtilMiui.java */
    class C5828q extends AbstractC5829y<Boolean> {
        C5828q(Context context, AbstractC5505k abstractC5505k) {
            super(context, abstractC5505k);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Boolean mo18841q() throws RemoteException {
            return Boolean.valueOf(m18843y().fastCheckSlhPhCompatibility());
        }
    }

    /* JADX INFO: compiled from: ServiceTokenUtilMiui.java */
    class toq extends f7l8 {

        /* JADX INFO: renamed from: t */
        final /* synthetic */ ServiceTokenResult f32551t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(Context context, com.xiaomi.passport.servicetoken.f7l8 f7l8Var, ServiceTokenResult serviceTokenResult) {
            super(context, f7l8Var);
            this.f32551t = serviceTokenResult;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public ServiceTokenResult mo18841q() throws RemoteException {
            return m18843y().invalidateServiceToken((this.f32551t == null || !C5825g.m20466k()) ? this.f32551t : ServiceTokenResult.C5817k.m20437h(this.f32551t).o1t(true).n7h());
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.ld6$y */
    /* JADX INFO: compiled from: ServiceTokenUtilMiui.java */
    private static abstract class AbstractC5829y<T> extends com.xiaomi.accountsdk.futureservice.zy<IPassportServiceTokenService, T, T> {

        /* JADX INFO: renamed from: i */
        private static final String f32552i = "com.xiaomi.account";

        /* JADX INFO: renamed from: z */
        private static final String f32553z = "com.xiaomi.account.action.SERVICE_TOKEN_OP";

        protected AbstractC5829y(Context context, AbstractC5505k<T, T> abstractC5505k) {
            super(context, "com.xiaomi.account.action.SERVICE_TOKEN_OP", "com.xiaomi.account", abstractC5505k);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final IPassportServiceTokenService zy(IBinder iBinder) {
            return IPassportServiceTokenService.Stub.asInterface(iBinder);
        }
    }

    /* JADX INFO: compiled from: ServiceTokenUtilMiui.java */
    class zy extends AbstractC5829y<Boolean> {
        zy(Context context, AbstractC5505k abstractC5505k) {
            super(context, abstractC5505k);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Boolean mo18841q() throws RemoteException {
            return Boolean.valueOf(m18843y().supportServiceTokenUIResponse());
        }
    }

    ld6() {
    }

    private C5834y ld6() {
        return new C5834y(new com.xiaomi.passport.servicetoken.zy(new com.xiaomi.passport.servicetoken.toq()));
    }

    /* JADX INFO: renamed from: s */
    private boolean m20462s(com.xiaomi.passport.servicetoken.f7l8 f7l8Var) {
        return (f7l8Var.isDone() && f7l8Var.get().f32506g == ServiceTokenResult.toq.ERROR_REMOTE_EXCEPTION) ? false : true;
    }

    @Override // com.xiaomi.passport.servicetoken.AbstractC5831p
    public ServiceTokenResult f7l8(Context context, String str) {
        if (str != null && str.startsWith(C5480k.f72647ld6) && C5825g.toq()) {
            return ld6().f7l8(context, str);
        }
        if (f73222zy.get()) {
            com.xiaomi.passport.servicetoken.f7l8 f7l8Var = new com.xiaomi.passport.servicetoken.f7l8(null);
            new C5826k(context, f7l8Var, str, context).toq();
            if (m20462s(f7l8Var)) {
                return f7l8Var.get();
            }
            f73222zy.set(false);
        }
        return ld6().f7l8(context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.passport.servicetoken.AbstractC5831p
    /* JADX INFO: renamed from: g */
    protected XmAccountVisibility mo20463g(Context context) {
        Account accountMo20472g = new com.xiaomi.passport.servicetoken.zy(new com.xiaomi.passport.servicetoken.toq()).mo20472g(context);
        if (accountMo20472g != null) {
            return new XmAccountVisibility.C5821k(XmAccountVisibility.toq.ERROR_NONE, null).f7l8(true, accountMo20472g).m20455y();
        }
        C5506q c5506q = new C5506q();
        new C5827n(context, c5506q, context).toq();
        try {
            return (XmAccountVisibility) c5506q.get();
        } catch (InterruptedException e2) {
            AbstractC5574n.m19113q(f73221toq, "setSystemAccountVisible", e2);
            return new XmAccountVisibility.C5821k(XmAccountVisibility.toq.ERROR_CANCELLED, null).m20455y();
        } catch (ExecutionException e3) {
            AbstractC5574n.m19113q(f73221toq, "setSystemAccountVisible", e3);
            return new XmAccountVisibility.C5821k(XmAccountVisibility.toq.ERROR_EXECUTION, e3.getMessage()).m20455y();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public boolean m20464p(Context context) {
        if (!f73222zy.get()) {
            return false;
        }
        C5506q c5506q = new C5506q();
        new zy(context, c5506q).toq();
        try {
            return ((Boolean) c5506q.get()).booleanValue();
        } catch (InterruptedException e2) {
            AbstractC5574n.m19116z(f73221toq, "", e2);
            return false;
        } catch (ExecutionException e3) {
            AbstractC5574n.m19116z(f73221toq, "", e3);
            return false;
        }
    }

    @Override // com.xiaomi.passport.servicetoken.AbstractC5831p
    /* JADX INFO: renamed from: y */
    public ServiceTokenResult mo20465y(Context context, ServiceTokenResult serviceTokenResult) {
        if (f73222zy.get()) {
            com.xiaomi.passport.servicetoken.f7l8 f7l8Var = new com.xiaomi.passport.servicetoken.f7l8(null);
            new toq(context, f7l8Var, serviceTokenResult).toq();
            if (m20462s(f7l8Var)) {
                return f7l8Var.get();
            }
            f73222zy.set(false);
        }
        return ld6().mo20465y(context, serviceTokenResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.passport.servicetoken.InterfaceC5830n
    public boolean zy(Context context) {
        if (!f73222zy.get()) {
            return false;
        }
        synchronized (ld6.class) {
            if (f32542q != null) {
                return f32542q.booleanValue();
            }
            C5506q c5506q = new C5506q();
            new C5828q(context, c5506q).toq();
            try {
                Boolean bool = (Boolean) c5506q.get();
                synchronized (ld6.class) {
                    f32542q = bool;
                }
                return bool.booleanValue();
            } catch (InterruptedException e2) {
                AbstractC5574n.m19116z(f73221toq, "", e2);
                return false;
            } catch (ExecutionException e3) {
                AbstractC5574n.m19116z(f73221toq, "", e3);
                return false;
            }
        }
    }
}

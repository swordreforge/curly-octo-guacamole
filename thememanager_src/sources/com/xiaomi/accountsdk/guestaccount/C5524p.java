package com.xiaomi.accountsdk.guestaccount;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.accountsdk.guestaccount.data.C5513g;
import com.xiaomi.accountsdk.guestaccount.data.EnumC5515n;
import com.xiaomi.accountsdk.guestaccount.data.GuestAccount;
import com.xiaomi.accountsdk.utils.AbstractC5574n;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.p */
/* JADX INFO: compiled from: GuestAccountManagerImplApp.java */
/* JADX INFO: loaded from: classes3.dex */
class C5524p extends AbstractC5526s {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f72874f7l8 = "GuestAccountManagerApp";

    /* JADX INFO: renamed from: y */
    private static volatile C5524p f30868y;

    /* JADX INFO: renamed from: g */
    private final x2 f30869g;

    /* JADX INFO: renamed from: n */
    private final qrj f30870n;

    /* JADX INFO: renamed from: q */
    private final EnumC5515n f30871q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private InterfaceC5519k f72875zy;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.p$k */
    /* JADX INFO: compiled from: GuestAccountManagerImplApp.java */
    class k extends zy {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ GuestAccount f30873n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(GuestAccount guestAccount) {
            super();
            this.f30873n = guestAccount;
        }

        @Override // com.xiaomi.accountsdk.guestaccount.C5524p.zy
        protected com.xiaomi.accountsdk.guestaccount.data.zy toq() {
            com.xiaomi.accountsdk.guestaccount.data.zy zyVarM18898y = C5524p.this.f30869g.m18898y(this.f30873n, null);
            GuestAccount guestAccountM18866q = zyVarM18898y.m18866q();
            if (guestAccountM18866q != null) {
                zyVarM18898y.m18868y(guestAccountM18866q.m18846k(this.f30873n.f30836z));
            }
            return zyVarM18898y;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.p$toq */
    /* JADX INFO: compiled from: GuestAccountManagerImplApp.java */
    class toq extends zy {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C5513g f30875n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(C5513g c5513g) {
            super();
            this.f30875n = c5513g;
        }

        @Override // com.xiaomi.accountsdk.guestaccount.C5524p.zy
        protected com.xiaomi.accountsdk.guestaccount.data.zy toq() {
            return C5524p.this.f30869g.x2(C5524p.this.f30871q, this.f30875n.m18859n(), this.f30875n.toq(), this.f30875n.zy());
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.p$zy */
    /* JADX INFO: compiled from: GuestAccountManagerImplApp.java */
    private abstract class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        private final com.xiaomi.accountsdk.guestaccount.data.toq f30876k = new com.xiaomi.accountsdk.guestaccount.data.toq();

        public zy() {
        }

        /* JADX INFO: renamed from: k */
        public com.xiaomi.accountsdk.guestaccount.data.toq m18886k() {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(this);
            } else {
                run();
            }
            return this.f30876k;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.xiaomi.accountsdk.guestaccount.data.zy qVar = toq();
            GuestAccount guestAccountM18866q = qVar.m18866q();
            if (guestAccountM18866q == null) {
                this.f30876k.m18835y(qVar);
                return;
            }
            if (C5524p.m18885i(guestAccountM18866q)) {
                C5524p.this.f30870n.m18890n(C5524p.this.f30878k, guestAccountM18866q);
            }
            if (C5524p.fn3e(guestAccountM18866q)) {
                C5524p.this.f30870n.m18888g(C5524p.this.f30878k, guestAccountM18866q);
                this.f30876k.m18835y(qVar);
            } else {
                if (TextUtils.isEmpty(guestAccountM18866q.f30832p)) {
                    this.f30876k.m18835y(qVar);
                    return;
                }
                com.xiaomi.accountsdk.guestaccount.data.zy zyVarKja0 = C5524p.this.f30869g.kja0(guestAccountM18866q);
                GuestAccount guestAccountM18866q2 = zyVarKja0.m18866q();
                if (C5524p.fn3e(guestAccountM18866q2)) {
                    C5524p.this.f30870n.m18888g(C5524p.this.f30878k, guestAccountM18866q2);
                }
                this.f30876k.m18835y(zyVarKja0);
            }
        }

        protected abstract com.xiaomi.accountsdk.guestaccount.data.zy toq();
    }

    private C5524p(Context context, EnumC5515n enumC5515n) {
        this(context, enumC5515n, new x2(context.getApplicationContext()), new qrj());
    }

    static boolean fn3e(GuestAccount guestAccount) {
        return (guestAccount == null || TextUtils.isEmpty(guestAccount.f30830k) || TextUtils.isEmpty(guestAccount.f30833q) || TextUtils.isEmpty(guestAccount.f30827g) || TextUtils.isEmpty(guestAccount.f30835y) || TextUtils.isEmpty(guestAccount.f30828h) || TextUtils.isEmpty(guestAccount.f30829i)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    static boolean m18885i(GuestAccount guestAccount) {
        return (guestAccount == null || TextUtils.isEmpty(guestAccount.f30830k) || TextUtils.isEmpty(guestAccount.f30833q) || TextUtils.isEmpty(guestAccount.f30834s)) ? false : true;
    }

    private com.xiaomi.accountsdk.guestaccount.data.toq ni7(boolean z2, C5513g c5513g) {
        if (z2) {
            this.f30870n.m18891q(this.f30878k, c5513g.m18859n());
        }
        GuestAccount qVar = this.f30870n.toq(this.f30878k, c5513g.m18859n());
        if (fn3e(qVar)) {
            com.xiaomi.accountsdk.guestaccount.data.toq toqVar = new com.xiaomi.accountsdk.guestaccount.data.toq();
            toqVar.m18835y(new com.xiaomi.accountsdk.guestaccount.data.zy().m18868y(qVar));
            AbstractC5574n.zurt(f72874f7l8, "getGuestAccount from cache");
            return toqVar;
        }
        if (m18885i(qVar)) {
            AbstractC5574n.zurt(f72874f7l8, "getGuestAccount from login");
            return new k(qVar).m18886k();
        }
        AbstractC5574n.zurt(f72874f7l8, "getGuestAccount from register");
        return new toq(c5513g).m18886k();
    }

    static synchronized C5524p zurt(Context context, EnumC5515n enumC5515n) {
        if (f30868y == null) {
            f30868y = new C5524p(context, enumC5515n);
        }
        return f30868y;
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    public void f7l8(f7l8 f7l8Var) {
        this.f30869g.n7h(f7l8Var);
    }

    @Override // com.xiaomi.accountsdk.guestaccount.AbstractC5526s
    /* JADX INFO: renamed from: h */
    protected com.xiaomi.accountsdk.guestaccount.data.toq mo18876h(C5513g c5513g, IGuestAccountIntentHandler iGuestAccountIntentHandler) {
        return ni7(true, c5513g);
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    /* JADX INFO: renamed from: k */
    public void mo18877k() {
        if (this.f72875zy == null) {
            AbstractC5574n.fu4(f72874f7l8, "null backup util. Bail.");
            return;
        }
        GuestAccount guestAccountM18889k = this.f30870n.m18889k(this.f30878k);
        if (m18885i(guestAccountM18889k)) {
            this.f72875zy.m18874k(guestAccountM18889k);
        } else {
            AbstractC5574n.fu4(f72874f7l8, "fail to checkPassToken. Can not save to backup. Bail.");
        }
    }

    @Override // com.xiaomi.accountsdk.guestaccount.AbstractC5526s
    protected com.xiaomi.accountsdk.guestaccount.data.toq kja0(C5513g c5513g) {
        com.xiaomi.accountsdk.guestaccount.data.toq toqVar = new com.xiaomi.accountsdk.guestaccount.data.toq();
        toqVar.m18835y(new com.xiaomi.accountsdk.guestaccount.data.zy().m18868y(this.f30870n.m18889k(this.f30878k)));
        return toqVar;
    }

    @Override // com.xiaomi.accountsdk.guestaccount.AbstractC5526s
    protected com.xiaomi.accountsdk.guestaccount.data.toq n7h(C5513g c5513g, IGuestAccountIntentHandler iGuestAccountIntentHandler) {
        return ni7(false, c5513g);
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    public void onXiaomiAccountCTAAllowed() {
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    /* JADX INFO: renamed from: p */
    public void mo18878p() {
        AbstractC5574n.m19115y(f72874f7l8, "restoreFromBackup called.");
        if (this.f72875zy == null) {
            AbstractC5574n.fu4(f72874f7l8, "null backup util. Bail.");
            return;
        }
        try {
            if (zy().get().m18866q() != null) {
                AbstractC5574n.fu4(f72874f7l8, "already has account. Can not restore. Bail.");
                return;
            }
            GuestAccount qVar = this.f72875zy.toq();
            if (m18885i(qVar)) {
                this.f30870n.m18890n(this.f30878k, qVar);
            } else {
                AbstractC5574n.fu4(f72874f7l8, "fail to checkPassToken. Can not restore from backup. Bail.");
            }
        } catch (InterruptedException e2) {
            AbstractC5574n.o1t(f72874f7l8, e2);
        }
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    /* JADX INFO: renamed from: s */
    public void mo18879s(InterfaceC5518g interfaceC5518g) {
        this.f30869g.qrj(interfaceC5518g);
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    /* JADX INFO: renamed from: y */
    public void mo18880y(InterfaceC5519k interfaceC5519k) {
        this.f72875zy = interfaceC5519k;
    }

    C5524p(Context context, EnumC5515n enumC5515n, x2 x2Var, qrj qrjVar) {
        super(context);
        if (x2Var == null) {
            throw new IllegalArgumentException("onlineFetcher == null");
        }
        if (qrjVar == null) {
            throw new IllegalArgumentException("storage == null");
        }
        if (enumC5515n != null) {
            this.f30871q = enumC5515n;
            this.f30869g = x2Var;
            this.f30870n = qrjVar;
            return;
        }
        throw new IllegalArgumentException("type == null");
    }
}

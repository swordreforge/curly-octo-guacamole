package com.xiaomi.accountsdk.guestaccount;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.accountsdk.futureservice.C5506q;
import com.xiaomi.accountsdk.guestaccount.IGuestAccountService;
import com.xiaomi.accountsdk.guestaccount.data.C5513g;

/* JADX INFO: compiled from: GuestAccountManagerImplMiui.java */
/* JADX INFO: loaded from: classes3.dex */
class ld6 extends AbstractC5526s {

    /* JADX INFO: renamed from: n */
    private static final String f30855n = "com.xiaomi.account.action.BIND_GUEST_ACCOUNT_SERVICE";

    /* JADX INFO: renamed from: q */
    private static final String f30856q = "com.xiaomi.account";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile ld6 f72872zy;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.ld6$k */
    /* JADX INFO: compiled from: GuestAccountManagerImplMiui.java */
    class C5520k extends AbstractC5521n<com.xiaomi.accountsdk.guestaccount.data.zy> {

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C5513g f30858z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5520k(C5506q c5506q, C5513g c5513g) {
            super(c5506q);
            this.f30858z = c5513g;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public com.xiaomi.accountsdk.guestaccount.data.zy mo18841q() throws RemoteException {
            return new com.xiaomi.accountsdk.guestaccount.data.zy(m18843y().getStoredUserId(this.f30858z.mo18858k()));
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.ld6$n */
    /* JADX INFO: compiled from: GuestAccountManagerImplMiui.java */
    private abstract class AbstractC5521n<T> extends com.xiaomi.accountsdk.futureservice.zy<IGuestAccountService, T, T> {
        public AbstractC5521n(C5506q<T> c5506q) {
            super(ld6.this.f30878k, ld6.f30855n, "com.xiaomi.account", c5506q);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public IGuestAccountService zy(IBinder iBinder) {
            return IGuestAccountService.Stub.asInterface(iBinder);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.ld6$q */
    /* JADX INFO: compiled from: GuestAccountManagerImplMiui.java */
    class C5522q extends AbstractC5521n<Void> {
        C5522q(C5506q c5506q) {
            super(c5506q);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Void mo18841q() throws RemoteException {
            m18843y().onXiaomiAccountCTAAllowed();
            return null;
        }
    }

    /* JADX INFO: compiled from: GuestAccountManagerImplMiui.java */
    class toq extends AbstractC5521n<com.xiaomi.accountsdk.guestaccount.data.zy> {

        /* JADX INFO: renamed from: t */
        final /* synthetic */ IGuestAccountIntentHandler f30862t;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C5513g f30863z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(C5506q c5506q, C5513g c5513g, IGuestAccountIntentHandler iGuestAccountIntentHandler) {
            super(c5506q);
            this.f30863z = c5513g;
            this.f30862t = iGuestAccountIntentHandler;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public com.xiaomi.accountsdk.guestaccount.data.zy mo18841q() throws RemoteException {
            return new com.xiaomi.accountsdk.guestaccount.data.zy(m18843y().getGuestAccount(this.f30863z.mo18858k(), this.f30862t));
        }
    }

    /* JADX INFO: compiled from: GuestAccountManagerImplMiui.java */
    class zy extends AbstractC5521n<com.xiaomi.accountsdk.guestaccount.data.zy> {

        /* JADX INFO: renamed from: t */
        final /* synthetic */ IGuestAccountIntentHandler f30865t;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C5513g f30866z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(C5506q c5506q, C5513g c5513g, IGuestAccountIntentHandler iGuestAccountIntentHandler) {
            super(c5506q);
            this.f30866z = c5513g;
            this.f30865t = iGuestAccountIntentHandler;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public com.xiaomi.accountsdk.guestaccount.data.zy mo18841q() throws RemoteException {
            return new com.xiaomi.accountsdk.guestaccount.data.zy(m18843y().renewServiceToken(this.f30866z.mo18858k(), this.f30865t));
        }
    }

    private ld6(Context context) {
        super(context);
    }

    static synchronized ld6 cdj(Context context) {
        if (f72872zy == null) {
            f72872zy = new ld6(context);
        }
        return f72872zy;
    }

    static boolean ki(Context context) {
        Intent intent = new Intent(f30855n);
        intent.setPackage("com.xiaomi.account");
        return context.getPackageManager().resolveService(intent, 0) != null;
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    public void f7l8(f7l8 f7l8Var) {
    }

    @Override // com.xiaomi.accountsdk.guestaccount.AbstractC5526s
    /* JADX INFO: renamed from: h */
    protected com.xiaomi.accountsdk.guestaccount.data.toq mo18876h(C5513g c5513g, IGuestAccountIntentHandler iGuestAccountIntentHandler) {
        com.xiaomi.accountsdk.guestaccount.data.toq toqVar = new com.xiaomi.accountsdk.guestaccount.data.toq();
        new zy(toqVar, c5513g, iGuestAccountIntentHandler).toq();
        return toqVar;
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    /* JADX INFO: renamed from: k */
    public void mo18877k() {
        throw new IllegalStateException("don NOT call this for GuestAccountManagerImplMiui");
    }

    @Override // com.xiaomi.accountsdk.guestaccount.AbstractC5526s
    protected com.xiaomi.accountsdk.guestaccount.data.toq kja0(C5513g c5513g) {
        com.xiaomi.accountsdk.guestaccount.data.toq toqVar = new com.xiaomi.accountsdk.guestaccount.data.toq();
        new C5520k(toqVar, c5513g).toq();
        return toqVar;
    }

    @Override // com.xiaomi.accountsdk.guestaccount.AbstractC5526s
    protected com.xiaomi.accountsdk.guestaccount.data.toq n7h(C5513g c5513g, IGuestAccountIntentHandler iGuestAccountIntentHandler) {
        com.xiaomi.accountsdk.guestaccount.data.toq toqVar = new com.xiaomi.accountsdk.guestaccount.data.toq();
        new toq(toqVar, c5513g, iGuestAccountIntentHandler).toq();
        return toqVar;
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    public void onXiaomiAccountCTAAllowed() {
        new C5522q(new C5506q()).toq();
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    /* JADX INFO: renamed from: p */
    public void mo18878p() {
        throw new IllegalStateException("don NOT call this for GuestAccountManagerImplMiui");
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    /* JADX INFO: renamed from: s */
    public void mo18879s(InterfaceC5518g interfaceC5518g) {
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    /* JADX INFO: renamed from: y */
    public void mo18880y(InterfaceC5519k interfaceC5519k) {
    }
}

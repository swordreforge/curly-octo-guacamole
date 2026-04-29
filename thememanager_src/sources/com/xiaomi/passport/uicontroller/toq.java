package com.xiaomi.passport.uicontroller;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.accountsdk.account.data.MiLoginResult;
import com.xiaomi.accountsdk.account.data.NotificationAuthResult;
import com.xiaomi.accountsdk.account.data.NotificationLoginEndParams;
import com.xiaomi.accountsdk.account.data.PasswordLoginParams;
import com.xiaomi.accountsdk.account.data.Step2LoginParams;
import com.xiaomi.accountsdk.futureservice.AbstractC5505k;
import com.xiaomi.passport.uicontroller.AbstractC5838k;
import com.xiaomi.passport.uicontroller.IMiPassportUIControllerService;

/* JADX INFO: compiled from: MiPassportUIController.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static volatile toq f73250f7l8 = null;

    /* JADX INFO: renamed from: g */
    private static final String f32612g = "com.xiaomi.account";

    /* JADX INFO: renamed from: n */
    private static final String f32613n = "com.xiaomi.account.action.UI_CONTROLLER_SERVICE";

    /* JADX INFO: renamed from: q */
    private static final String f32614q = "MiPassportUIController";

    /* JADX INFO: renamed from: y */
    private static volatile com.xiaomi.passport.uicontroller.zy f32615y = com.xiaomi.passport.uicontroller.zy.f32628k;

    /* JADX INFO: renamed from: k */
    private final Context f32616k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f73251toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f73252zy;

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.toq$g */
    /* JADX INFO: compiled from: MiPassportUIController.java */
    private abstract class AbstractC5841g<ModelDataType, UIDataType> extends com.xiaomi.accountsdk.futureservice.zy<IMiPassportUIControllerService, ModelDataType, UIDataType> {
        protected AbstractC5841g(AbstractC5505k<ModelDataType, UIDataType> abstractC5505k) {
            super(toq.this.f32616k, toq.this.f73251toq, toq.this.f73252zy, abstractC5505k);
        }

        protected abstract ModelDataType ld6() throws RemoteException;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public IMiPassportUIControllerService zy(IBinder iBinder) {
            return IMiPassportUIControllerService.Stub.asInterface(iBinder);
        }

        @Override // com.xiaomi.accountsdk.futureservice.zy
        /* JADX INFO: renamed from: q */
        protected ModelDataType mo18841q() throws RemoteException {
            return ld6();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.toq$k */
    /* JADX INFO: compiled from: MiPassportUIController.java */
    class C5842k extends AbstractC5841g<MiLoginResult, AccountInfo> {

        /* JADX INFO: renamed from: z */
        final /* synthetic */ PasswordLoginParams f32619z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5842k(AbstractC5505k abstractC5505k, PasswordLoginParams passwordLoginParams) {
            super(abstractC5505k);
            this.f32619z = passwordLoginParams;
        }

        @Override // com.xiaomi.passport.uicontroller.toq.AbstractC5841g
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public MiLoginResult ld6() throws RemoteException {
            return m18843y().loginByPassword(this.f32619z);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.toq$n */
    /* JADX INFO: compiled from: MiPassportUIController.java */
    class C5843n extends AbstractC5841g<NotificationAuthResult, NotificationAuthResult> {

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f32621z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5843n(AbstractC5505k abstractC5505k, String str) {
            super(abstractC5505k);
            this.f32621z = str;
        }

        @Override // com.xiaomi.passport.uicontroller.toq.AbstractC5841g
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public NotificationAuthResult ld6() throws RemoteException {
            return m18843y().onNotificationAuthEnd(this.f32621z);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.toq$q */
    /* JADX INFO: compiled from: MiPassportUIController.java */
    class C5844q extends AbstractC5841g<Void, Void> {

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AccountInfo f32623z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5844q(AbstractC5505k abstractC5505k, AccountInfo accountInfo) {
            super(abstractC5505k);
            this.f32623z = accountInfo;
        }

        @Override // com.xiaomi.passport.uicontroller.toq.AbstractC5841g
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public Void ld6() throws RemoteException {
            m18843y().addOrUpdateAccountManager(this.f32623z);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MiPassportUIController.java */
    class C8041toq extends AbstractC5841g<MiLoginResult, AccountInfo> {

        /* JADX INFO: renamed from: z */
        final /* synthetic */ NotificationLoginEndParams f32625z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8041toq(AbstractC5505k abstractC5505k, NotificationLoginEndParams notificationLoginEndParams) {
            super(abstractC5505k);
            this.f32625z = notificationLoginEndParams;
        }

        @Override // com.xiaomi.passport.uicontroller.toq.AbstractC5841g
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public MiLoginResult ld6() throws RemoteException {
            return m18843y().onNotificationLoginEnd(this.f32625z);
        }
    }

    /* JADX INFO: compiled from: MiPassportUIController.java */
    class zy extends AbstractC5841g<MiLoginResult, AccountInfo> {

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Step2LoginParams f32627z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(AbstractC5505k abstractC5505k, Step2LoginParams step2LoginParams) {
            super(abstractC5505k);
            this.f32627z = step2LoginParams;
        }

        @Override // com.xiaomi.passport.uicontroller.toq.AbstractC5841g
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public MiLoginResult ld6() throws RemoteException {
            return m18843y().loginByStep2(this.f32627z);
        }
    }

    public toq(Context context, String str, String str2) {
        this.f32616k = context.getApplicationContext();
        this.f73251toq = str;
        this.f73252zy = str2;
    }

    public static toq f7l8(Context context) {
        return f32615y.mo20539k(context, f32613n, "com.xiaomi.account");
    }

    /* JADX INFO: renamed from: g */
    public static toq m20531g(Context context) {
        return f32615y.mo20539k(context, f32613n, context.getPackageName());
    }

    public static void qrj(com.xiaomi.passport.uicontroller.zy zyVar) {
        f32615y = zyVar;
    }

    public static void x2() {
        f32615y = com.xiaomi.passport.uicontroller.zy.f32628k;
    }

    public AbstractC5838k.n ld6(NotificationLoginEndParams notificationLoginEndParams, AbstractC5838k.g gVar) {
        AbstractC5838k.n nVar = new AbstractC5838k.n(gVar);
        new C8041toq(nVar, notificationLoginEndParams).toq();
        return nVar;
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public void m20533n(AccountInfo accountInfo) {
        m20535q(accountInfo, null);
    }

    /* JADX INFO: renamed from: p */
    public AbstractC5838k.zy m20534p(String str, AbstractC5838k.q qVar) {
        AbstractC5838k.zy zyVar = new AbstractC5838k.zy(qVar);
        new C5843n(zyVar, str).toq();
        return zyVar;
    }

    /* JADX INFO: renamed from: q */
    public AbstractC5838k.k m20535q(AccountInfo accountInfo, AbstractC5838k.toq toqVar) {
        AbstractC5838k.k kVar = new AbstractC5838k.k(toqVar);
        new C5844q(kVar, accountInfo).toq();
        return kVar;
    }

    /* JADX INFO: renamed from: s */
    public AbstractC5838k.s m20536s(Step2LoginParams step2LoginParams, AbstractC5838k.p pVar) {
        AbstractC5838k.s sVar = new AbstractC5838k.s(pVar);
        new zy(sVar, step2LoginParams).toq();
        return sVar;
    }

    /* JADX INFO: renamed from: y */
    public AbstractC5838k.f7l8 m20537y(PasswordLoginParams passwordLoginParams, AbstractC5838k.y yVar) {
        AbstractC5838k.f7l8 f7l8Var = new AbstractC5838k.f7l8(yVar);
        new C5842k(f7l8Var, passwordLoginParams).toq();
        return f7l8Var;
    }
}

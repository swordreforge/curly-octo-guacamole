package com.xiaomi.passport.uicontroller;

import android.text.TextUtils;
import com.xiaomi.accountsdk.account.C5500p;
import com.xiaomi.accountsdk.account.C5502s;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.accountsdk.account.data.C5479i;
import com.xiaomi.accountsdk.account.data.PasswordLoginParams;
import com.xiaomi.accountsdk.account.data.PhoneTicketLoginParams;
import com.xiaomi.accountsdk.account.data.PhoneTokenRegisterParams;
import com.xiaomi.accountsdk.account.data.RegisterUserInfo;
import com.xiaomi.accountsdk.account.data.Step2LoginParams;
import com.xiaomi.accountsdk.request.C5539k;
import com.xiaomi.accountsdk.utils.AbstractC5574n;
import com.xiaomi.passport.C5815k;
import com.xiaomi.passport.uicontroller.f7l8;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p039w.C7723k;
import p039w.C7725p;
import p039w.C7726q;
import p039w.C7727s;
import p039w.C7728y;
import ra.C7630k;

/* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n */
/* JADX INFO: compiled from: PhoneLoginController.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5839n {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73236toq = "PhoneLoginController";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final ExecutorService f73237zy = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: k */
    private zurt f32581k = new zurt();

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$cdj */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    public enum cdj {
        NONE,
        ERROR_UNKNOWN,
        ERROR_AUTH_FAIL,
        ERROR_NETWORK,
        ERROR_SERVER,
        ERROR_ACCESS_DENIED,
        ERROR_INVALID_PARAM,
        ERROR_USER_ACTION_OVER_LIMIT,
        ERROR_PASSWORD,
        ERROR_NON_EXIST_USER,
        ERROR_NO_PHONE
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$f7l8 */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    static class f7l8 implements Callable<C7630k> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f32583k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f32584q;

        f7l8(String str, String str2) {
            this.f32583k = str;
            this.f32584q = str2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C7630k call() throws Exception {
            return com.xiaomi.passport.utils.toq.m20548k(this.f32583k, this.f32584q);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$fn3e */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    public interface fn3e {
        void f7l8(RegisterUserInfo registerUserInfo);

        /* JADX INFO: renamed from: g */
        void m20501g(RegisterUserInfo registerUserInfo);

        /* JADX INFO: renamed from: k */
        void m20502k();

        /* JADX INFO: renamed from: n */
        void m20503n(cdj cdjVar, String str);

        /* JADX INFO: renamed from: q */
        void m20504q();

        /* JADX INFO: renamed from: y */
        void m20505y(RegisterUserInfo registerUserInfo);
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$fu4 */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    public interface fu4 {
        /* JADX INFO: renamed from: k */
        void m20506k(String str);

        void toq();

        void zy(cdj cdjVar, String str);
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$g */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    static class g extends f7l8.toq<C7630k> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ t8r f32585k;

        g(t8r t8rVar) {
            this.f32585k = t8rVar;
        }

        @Override // com.xiaomi.passport.uicontroller.f7l8.toq
        /* JADX INFO: renamed from: k */
        public void mo20490k(com.xiaomi.passport.uicontroller.f7l8<C7630k> f7l8Var) {
            try {
                this.f32585k.toq(f7l8Var.get());
            } catch (InterruptedException e2) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "getPhoneLoginConfigOnLine", e2);
                this.f32585k.zy(cdj.ERROR_UNKNOWN, e2.getMessage());
            } catch (ExecutionException e3) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "getPhoneLoginConfigOnLine", e3);
                Throwable cause = e3.getCause();
                if (cause instanceof C7727s) {
                    this.f32585k.m20524k();
                } else {
                    this.f32585k.zy(C5839n.m20495q(cause), e3.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$h */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class h extends f7l8.toq<AccountInfo> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i f32586k;

        h(i iVar) {
            this.f32586k = iVar;
        }

        @Override // com.xiaomi.passport.uicontroller.f7l8.toq
        /* JADX INFO: renamed from: k */
        public void mo20490k(com.xiaomi.passport.uicontroller.f7l8<AccountInfo> f7l8Var) {
            try {
                this.f32586k.zy(f7l8Var.get());
            } catch (InterruptedException e2) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "registerByPhone", e2);
                this.f32586k.toq(cdj.ERROR_UNKNOWN, e2.getMessage());
            } catch (ExecutionException e3) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "registerByPhone", e3);
                Throwable cause = e3.getCause();
                if (cause instanceof p039w.fu4) {
                    this.f32586k.m20507k();
                    return;
                }
                if (cause instanceof p039w.zurt) {
                    this.f32586k.m20508q();
                } else if (cause instanceof p039w.t8r) {
                    this.f32586k.toq(cdj.ERROR_USER_ACTION_OVER_LIMIT, e3.getMessage());
                } else {
                    this.f32586k.toq(C5839n.m20495q(cause), e3.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$i */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    public interface i {
        /* JADX INFO: renamed from: k */
        void m20507k();

        /* JADX INFO: renamed from: q */
        void m20508q();

        void toq(cdj cdjVar, String str);

        void zy(AccountInfo accountInfo);
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$k */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class k implements Callable<AccountInfo> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ PhoneTokenRegisterParams f32587k;

        k(PhoneTokenRegisterParams phoneTokenRegisterParams) {
            this.f32587k = phoneTokenRegisterParams;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AccountInfo call() throws Exception {
            return C5502s.dr(this.f32587k);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$ki */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    public interface ki {
        void f7l8(Step2LoginParams step2LoginParams);

        /* JADX INFO: renamed from: g */
        void m20510g(boolean z2, String str);

        /* JADX INFO: renamed from: n */
        void m20511n(AccountInfo accountInfo);

        void toq(cdj cdjVar, String str, boolean z2);

        void zy(String str, String str2);
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$kja0 */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class kja0 implements Callable<AccountInfo> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ PasswordLoginParams f32589k;

        kja0(PasswordLoginParams passwordLoginParams) {
            this.f32589k = passwordLoginParams;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AccountInfo call() throws Exception {
            return C5502s.m18799j(this.f32589k);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$ld6 */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class ld6 implements Callable<RegisterUserInfo> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.xiaomi.accountsdk.account.data.cdj f32591k;

        ld6(com.xiaomi.accountsdk.account.data.cdj cdjVar) {
            this.f32591k = cdjVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public RegisterUserInfo call() throws Exception {
            return C5839n.this.f32581k.toq(this.f32591k);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$n */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class n implements Callable<String> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.xiaomi.accountsdk.account.data.zurt f32593k;

        n(com.xiaomi.accountsdk.account.data.zurt zurtVar) {
            this.f32593k = zurtVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            return C5502s.gbni(this.f32593k);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$n7h */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class n7h extends f7l8.toq<AccountInfo> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ki f32595k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ PasswordLoginParams f73239toq;

        n7h(ki kiVar, PasswordLoginParams passwordLoginParams) {
            this.f32595k = kiVar;
            this.f73239toq = passwordLoginParams;
        }

        @Override // com.xiaomi.passport.uicontroller.f7l8.toq
        /* JADX INFO: renamed from: k */
        public void mo20490k(com.xiaomi.passport.uicontroller.f7l8<AccountInfo> f7l8Var) {
            try {
                this.f32595k.m20511n(f7l8Var.get());
            } catch (InterruptedException e2) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "passwordLogin", e2);
                this.f32595k.toq(cdj.ERROR_UNKNOWN, e2.getMessage(), false);
            } catch (ExecutionException e3) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "passwordLogin", e3);
                Throwable cause = e3.getCause();
                if (cause instanceof p039w.kja0) {
                    this.f32595k.zy(this.f73239toq.f30497n, ((p039w.kja0) cause).getNotificationUrl());
                    return;
                }
                if (cause instanceof p039w.cdj) {
                    p039w.cdj cdjVar = (p039w.cdj) cause;
                    this.f32595k.f7l8(new Step2LoginParams.C5475k().cdj(cdjVar.getUserId()).ld6(cdjVar.getMetaLoginData()).qrj(this.f73239toq.f30497n).n7h(cdjVar.getStep1Token()).m18656s());
                } else {
                    if (cause instanceof p039w.n7h) {
                        this.f32595k.m20510g(false, ((p039w.n7h) cause).getCaptchaUrl());
                        return;
                    }
                    if (!(cause instanceof p039w.f7l8)) {
                        this.f32595k.toq(C5839n.m20495q(cause), e3.getMessage(), C5839n.this.zy(cause));
                    } else {
                        p039w.f7l8 f7l8Var2 = (p039w.f7l8) cause;
                        if (TextUtils.isEmpty(f7l8Var2.getCaptchaUrl())) {
                            this.f32595k.toq(cdj.ERROR_PASSWORD, e3.getMessage(), false);
                        } else {
                            this.f32595k.m20510g(true, f7l8Var2.getCaptchaUrl());
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$ni7 */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    public interface ni7 {
        /* JADX INFO: renamed from: g */
        void m20515g(String str);

        /* JADX INFO: renamed from: k */
        void m20516k();

        /* JADX INFO: renamed from: n */
        void m20517n(int i2);

        /* JADX INFO: renamed from: q */
        void m20518q();

        void toq();

        void zy(cdj cdjVar, String str);
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$o1t */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    public interface o1t {
        /* JADX INFO: renamed from: k */
        void m20519k();

        /* JADX INFO: renamed from: n */
        void m20520n(AccountInfo accountInfo);

        /* JADX INFO: renamed from: q */
        void m20521q();

        void toq(cdj cdjVar, String str, boolean z2);

        void zy(String str, String str2);
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$p */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class p extends f7l8.toq<RegisterUserInfo> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ fn3e f32596k;

        p(fn3e fn3eVar) {
            this.f32596k = fn3eVar;
        }

        @Override // com.xiaomi.passport.uicontroller.f7l8.toq
        /* JADX INFO: renamed from: k */
        public void mo20490k(com.xiaomi.passport.uicontroller.f7l8<RegisterUserInfo> f7l8Var) {
            try {
                RegisterUserInfo registerUserInfo = f7l8Var.get();
                RegisterUserInfo.toq toqVar = registerUserInfo.f30546k;
                if (toqVar == RegisterUserInfo.toq.STATUS_NOT_REGISTERED) {
                    this.f32596k.m20505y(registerUserInfo);
                } else if (toqVar == RegisterUserInfo.toq.STATUS_REGISTERED_NOT_RECYCLED) {
                    this.f32596k.f7l8(registerUserInfo);
                } else {
                    this.f32596k.m20501g(registerUserInfo);
                }
            } catch (InterruptedException e2) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "query user phone info", e2);
                this.f32596k.m20503n(cdj.ERROR_UNKNOWN, e2.getMessage());
            } catch (ExecutionException e3) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "query user phone info", e3);
                Throwable cause = e3.getCause();
                if (cause instanceof p039w.qrj) {
                    this.f32596k.m20504q();
                } else if (cause instanceof C7727s) {
                    this.f32596k.m20502k();
                } else {
                    this.f32596k.m20503n(C5839n.m20495q(cause), e3.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$q */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class q extends f7l8.toq<String> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ z f32597k;

        q(z zVar) {
            this.f32597k = zVar;
        }

        @Override // com.xiaomi.passport.uicontroller.f7l8.toq
        /* JADX INFO: renamed from: k */
        public void mo20490k(com.xiaomi.passport.uicontroller.f7l8<String> f7l8Var) {
            try {
                this.f32597k.zy(f7l8Var.get());
            } catch (InterruptedException e2) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "setPassword", e2);
                this.f32597k.m20525k(cdj.ERROR_UNKNOWN, e2.getMessage());
            } catch (ExecutionException e3) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "setPassword", e3);
                Throwable cause = e3.getCause();
                if (cause instanceof p039w.qrj) {
                    this.f32597k.m20527q();
                    return;
                }
                if (cause instanceof p039w.f7l8) {
                    this.f32597k.m20526n();
                } else if (cause instanceof p039w.fu4) {
                    this.f32597k.toq();
                } else {
                    this.f32597k.m20525k(C5839n.m20495q(cause), e3.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$qrj */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class qrj implements Callable<AccountInfo> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ PhoneTicketLoginParams f32598k;

        qrj(PhoneTicketLoginParams phoneTicketLoginParams) {
            this.f32598k = phoneTicketLoginParams;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AccountInfo call() throws Exception {
            PhoneTicketLoginParams phoneTicketLoginParamsM18623p = this.f32598k;
            if (phoneTicketLoginParamsM18623p.f30514i == null) {
                phoneTicketLoginParamsM18623p = PhoneTicketLoginParams.m18615k(phoneTicketLoginParamsM18623p).x2(C5815k.toq.toq().x2(C5500p.toq())).m18623p();
            }
            return C5502s.y9n(phoneTicketLoginParamsM18623p);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$s */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class s implements Callable<Integer> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C5479i f32600k;

        s(C5479i c5479i) {
            this.f32600k = c5479i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer call() throws Exception {
            return Integer.valueOf(C5502s.qo(this.f32600k));
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$t8r */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    public interface t8r {
        /* JADX INFO: renamed from: k */
        void m20524k();

        void toq(C7630k c7630k);

        void zy(cdj cdjVar, String str);
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$toq */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class toq extends f7l8.toq<String> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ fu4 f32602k;

        toq(fu4 fu4Var) {
            this.f32602k = fu4Var;
        }

        @Override // com.xiaomi.passport.uicontroller.f7l8.toq
        /* JADX INFO: renamed from: k */
        public void mo20490k(com.xiaomi.passport.uicontroller.f7l8<String> f7l8Var) {
            try {
                this.f32602k.m20506k(f7l8Var.get());
            } catch (InterruptedException e2) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "sendSetPasswordTicket", e2);
                this.f32602k.zy(cdj.ERROR_UNKNOWN, e2.getMessage());
            } catch (ExecutionException e3) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "sendSetPasswordTicket", e3);
                Throwable cause = e3.getCause();
                if (cause instanceof p039w.t8r) {
                    this.f32602k.toq();
                } else if (cause instanceof C7727s) {
                    this.f32602k.zy(cdj.ERROR_NO_PHONE, e3.getMessage());
                } else {
                    this.f32602k.zy(C5839n.m20495q(cause), e3.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$x2 */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class x2 extends f7l8.toq<AccountInfo> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ o1t f32603k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ PhoneTicketLoginParams f73244toq;

        x2(o1t o1tVar, PhoneTicketLoginParams phoneTicketLoginParams) {
            this.f32603k = o1tVar;
            this.f73244toq = phoneTicketLoginParams;
        }

        @Override // com.xiaomi.passport.uicontroller.f7l8.toq
        /* JADX INFO: renamed from: k */
        public void mo20490k(com.xiaomi.passport.uicontroller.f7l8<AccountInfo> f7l8Var) {
            try {
                this.f32603k.m20520n(f7l8Var.get());
            } catch (InterruptedException e2) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "loginByPhoneTicket", e2);
                this.f32603k.toq(cdj.ERROR_UNKNOWN, e2.getMessage(), false);
            } catch (ExecutionException e3) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "loginByPhoneTicket", e3);
                Throwable cause = e3.getCause();
                if (cause instanceof p039w.kja0) {
                    this.f32603k.zy(this.f73244toq.f30513h, ((p039w.kja0) cause).getNotificationUrl());
                    return;
                }
                if (cause instanceof C7727s) {
                    this.f32603k.m20519k();
                } else {
                    if (cause instanceof p039w.qrj) {
                        this.f32603k.m20521q();
                        return;
                    }
                    this.f32603k.toq(C5839n.m20495q(cause), e3.getMessage(), C5839n.this.zy(cause));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$y */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class y extends f7l8.toq<Integer> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ni7 f32604k;

        y(ni7 ni7Var) {
            this.f32604k = ni7Var;
        }

        @Override // com.xiaomi.passport.uicontroller.f7l8.toq
        /* JADX INFO: renamed from: k */
        public void mo20490k(com.xiaomi.passport.uicontroller.f7l8<Integer> f7l8Var) {
            try {
                this.f32604k.m20517n(f7l8Var.get().intValue());
            } catch (InterruptedException e2) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "sendPhoneLoginTicket", e2);
                this.f32604k.zy(cdj.ERROR_UNKNOWN, e2.getMessage());
            } catch (ExecutionException e3) {
                AbstractC5574n.m19113q(C5839n.f73236toq, "sendPhoneLoginTicket", e3);
                Throwable cause = e3.getCause();
                if (cause instanceof p039w.n7h) {
                    this.f32604k.m20515g(((p039w.n7h) cause).getCaptchaUrl());
                    return;
                }
                if (cause instanceof p039w.zurt) {
                    this.f32604k.m20518q();
                    return;
                }
                if (cause instanceof p039w.t8r) {
                    this.f32604k.toq();
                } else if (cause instanceof C7727s) {
                    this.f32604k.m20516k();
                } else {
                    this.f32604k.zy(C5839n.m20495q(cause), e3.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$z */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    public interface z {
        /* JADX INFO: renamed from: k */
        void m20525k(cdj cdjVar, String str);

        /* JADX INFO: renamed from: n */
        void m20526n();

        /* JADX INFO: renamed from: q */
        void m20527q();

        void toq();

        void zy(String str);
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$zurt */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    public static class zurt {
        /* JADX INFO: renamed from: k */
        public RegisterUserInfo m20528k(com.xiaomi.accountsdk.account.data.zy zyVar) throws com.xiaomi.accountsdk.request.n7h, C5539k, com.xiaomi.accountsdk.request.zy, C7725p, IOException, p039w.fu4 {
            return C5502s.m18808s(zyVar);
        }

        public RegisterUserInfo toq(com.xiaomi.accountsdk.account.data.cdj cdjVar) throws Exception {
            return C5502s.m18810u(cdjVar);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.n$zy */
    /* JADX INFO: compiled from: PhoneLoginController.java */
    class zy implements Callable<String> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.xiaomi.accountsdk.account.data.n7h f32605k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f32607q;

        zy(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str) {
            this.f32605k = n7hVar;
            this.f32607q = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            return C5502s.d8wk(this.f32605k, this.f32607q);
        }
    }

    /* JADX INFO: renamed from: n */
    public static com.xiaomi.passport.uicontroller.f7l8<C7630k> m20494n(String str, String str2, t8r t8rVar) {
        com.xiaomi.passport.uicontroller.f7l8<C7630k> f7l8Var = new com.xiaomi.passport.uicontroller.f7l8<>(new f7l8(str, str2), t8rVar == null ? null : new g(t8rVar));
        f73237zy.submit(f7l8Var);
        return f7l8Var;
    }

    /* JADX INFO: renamed from: q */
    public static cdj m20495q(Throwable th) {
        return th instanceof com.xiaomi.accountsdk.request.n7h ? cdj.ERROR_SERVER : th instanceof IOException ? cdj.ERROR_NETWORK : th instanceof com.xiaomi.accountsdk.request.zy ? cdj.ERROR_AUTH_FAIL : th instanceof C5539k ? cdj.ERROR_ACCESS_DENIED : th instanceof C7728y ? cdj.ERROR_INVALID_PARAM : th instanceof p039w.x2 ? cdj.ERROR_NON_EXIST_USER : th instanceof p039w.f7l8 ? cdj.ERROR_PASSWORD : cdj.ERROR_UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zy(Throwable th) {
        if (th instanceof C7723k) {
            return ((C7723k) th).isStsUrlRequestError;
        }
        if (th instanceof C7726q) {
            return ((C7726q) th).isStsUrlRequestError;
        }
        if (th instanceof p039w.ki) {
            return ((p039w.ki) th).isStsUrlRequestError;
        }
        return false;
    }

    public com.xiaomi.passport.uicontroller.f7l8<RegisterUserInfo> f7l8(com.xiaomi.accountsdk.account.data.cdj cdjVar, fn3e fn3eVar) {
        if (fn3eVar == null) {
            throw new IllegalArgumentException("should implements phone user info callback");
        }
        com.xiaomi.passport.uicontroller.f7l8<RegisterUserInfo> f7l8Var = new com.xiaomi.passport.uicontroller.f7l8<>(new ld6(cdjVar), new p(fn3eVar));
        f73237zy.submit(f7l8Var);
        return f7l8Var;
    }

    /* JADX INFO: renamed from: g */
    public com.xiaomi.passport.uicontroller.f7l8<AccountInfo> m20496g(PasswordLoginParams passwordLoginParams, ki kiVar) {
        if (kiVar == null) {
            throw new IllegalArgumentException("should implements login callback");
        }
        com.xiaomi.passport.uicontroller.f7l8<AccountInfo> f7l8Var = new com.xiaomi.passport.uicontroller.f7l8<>(new kja0(passwordLoginParams), new n7h(kiVar, passwordLoginParams));
        f73237zy.submit(f7l8Var);
        return f7l8Var;
    }

    public com.xiaomi.passport.uicontroller.f7l8<String> ld6(com.xiaomi.accountsdk.account.data.zurt zurtVar, z zVar) {
        if (zVar == null) {
            throw new IllegalArgumentException("should implement set password callback");
        }
        com.xiaomi.passport.uicontroller.f7l8<String> f7l8Var = new com.xiaomi.passport.uicontroller.f7l8<>(new n(zurtVar), new q(zVar));
        f73237zy.submit(f7l8Var);
        return f7l8Var;
    }

    /* JADX INFO: renamed from: p */
    public com.xiaomi.passport.uicontroller.f7l8<String> m20497p(com.xiaomi.accountsdk.account.data.n7h n7hVar, String str, fu4 fu4Var) {
        if (fu4Var == null) {
            throw new IllegalArgumentException("should implement send set pwd ticket callback");
        }
        com.xiaomi.passport.uicontroller.f7l8<String> f7l8Var = new com.xiaomi.passport.uicontroller.f7l8<>(new zy(n7hVar, str), new toq(fu4Var));
        f73237zy.submit(f7l8Var);
        return f7l8Var;
    }

    public com.xiaomi.passport.uicontroller.f7l8<AccountInfo> qrj(PhoneTicketLoginParams phoneTicketLoginParams, o1t o1tVar) {
        if (o1tVar == null) {
            throw new IllegalArgumentException("should implements login callback");
        }
        com.xiaomi.passport.uicontroller.f7l8<AccountInfo> f7l8Var = new com.xiaomi.passport.uicontroller.f7l8<>(new qrj(phoneTicketLoginParams), new x2(o1tVar, phoneTicketLoginParams));
        f73237zy.submit(f7l8Var);
        return f7l8Var;
    }

    /* JADX INFO: renamed from: s */
    public com.xiaomi.passport.uicontroller.f7l8<Integer> m20498s(C5479i c5479i, ni7 ni7Var) {
        if (ni7Var == null) {
            throw new IllegalArgumentException("should implements login callback");
        }
        com.xiaomi.passport.uicontroller.f7l8<Integer> f7l8Var = new com.xiaomi.passport.uicontroller.f7l8<>(new s(c5479i), new y(ni7Var));
        f73237zy.submit(f7l8Var);
        return f7l8Var;
    }

    public void x2(zurt zurtVar) {
        this.f32581k = zurtVar;
    }

    /* JADX INFO: renamed from: y */
    public com.xiaomi.passport.uicontroller.f7l8<AccountInfo> m20499y(PhoneTokenRegisterParams phoneTokenRegisterParams, i iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("should implements register callback");
        }
        com.xiaomi.passport.uicontroller.f7l8<AccountInfo> f7l8Var = new com.xiaomi.passport.uicontroller.f7l8<>(new k(phoneTokenRegisterParams), new h(iVar));
        f73237zy.submit(f7l8Var);
        return f7l8Var;
    }
}

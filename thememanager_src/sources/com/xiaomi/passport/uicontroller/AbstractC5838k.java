package com.xiaomi.passport.uicontroller;

import android.os.RemoteException;
import com.xiaomi.accountsdk.account.data.AccountInfo;
import com.xiaomi.accountsdk.account.data.MiLoginResult;
import com.xiaomi.accountsdk.account.data.NotificationAuthResult;
import com.xiaomi.accountsdk.futureservice.AbstractC5505k;
import com.xiaomi.accountsdk.request.C5539k;
import com.xiaomi.accountsdk.request.n7h;
import com.xiaomi.passport.uicontroller.AbstractC5845y;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import javax.net.ssl.SSLException;
import p039w.C7724n;
import p039w.cdj;
import p039w.ki;
import p039w.kja0;
import p039w.ld6;
import p039w.x2;

/* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.k */
/* JADX INFO: compiled from: MiPassportLoginFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5838k extends AbstractC5845y<MiLoginResult, AccountInfo> {

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.k$f7l8 */
    /* JADX INFO: compiled from: MiPassportLoginFuture.java */
    public static final class f7l8 extends AbstractC5838k {
        public f7l8(AbstractC5845y.k<AccountInfo> kVar) {
            super(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.passport.uicontroller.AbstractC5838k, com.xiaomi.passport.uicontroller.AbstractC5845y
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public AccountInfo mo20492p(MiLoginResult miLoginResult) throws cdj, n7h, C5539k, C7724n, x2, IOException, RemoteException, p039w.n7h, p039w.f7l8, kja0 {
            try {
                return super.mo20492p(miLoginResult);
            } catch (ld6 unused) {
                throw new IllegalStateException("this should not be happen");
            }
        }

        @Override // com.xiaomi.passport.uicontroller.AbstractC5838k, com.xiaomi.accountsdk.futureservice.AbstractC5505k
        /* JADX INFO: renamed from: n */
        public void mo18833n(ExecutionException executionException) throws cdj, n7h, C7724n, C5539k, x2, RemoteException, IOException, p039w.n7h, p039w.f7l8, kja0 {
            try {
                super.mo18833n(executionException);
            } catch (ld6 unused) {
                throw new IllegalStateException("this should not be happen");
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.k$g */
    /* JADX INFO: compiled from: MiPassportLoginFuture.java */
    public static abstract class g implements AbstractC5845y.k {
        @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k.zy
        /* JADX INFO: renamed from: k */
        public final void mo18836k(AbstractC5505k abstractC5505k) {
            toq((n) abstractC5505k);
        }

        protected abstract void toq(n nVar);
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.k$k */
    /* JADX INFO: compiled from: MiPassportLoginFuture.java */
    public static final class k extends AbstractC5845y<Void, Void> {
        public k(AbstractC5845y.k<Void> kVar) {
            super(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.passport.uicontroller.AbstractC5845y
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Void mo20492p(Void r1) {
            return null;
        }

        @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k
        /* JADX INFO: renamed from: n */
        public void mo18833n(ExecutionException executionException) throws RemoteException {
            Throwable cause = executionException.getCause();
            if (cause instanceof RemoteException) {
                throw ((RemoteException) cause);
            }
            throw new IllegalStateException("unknown exception met: " + executionException.getCause().getMessage());
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.k$n */
    /* JADX INFO: compiled from: MiPassportLoginFuture.java */
    public static final class n extends AbstractC5838k {
        public n(AbstractC5845y.k<AccountInfo> kVar) {
            super(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.passport.uicontroller.AbstractC5838k, com.xiaomi.passport.uicontroller.AbstractC5845y
        /* JADX INFO: renamed from: ld6 */
        public AccountInfo mo20492p(MiLoginResult miLoginResult) throws n7h, C5539k, C7724n, x2, IOException, RemoteException, p039w.f7l8, kja0 {
            try {
                return super.mo20492p(miLoginResult);
            } catch (cdj unused) {
                throw new IllegalStateException("this should not be happen");
            } catch (ld6 unused2) {
                throw new IllegalStateException("this should not be happen");
            } catch (p039w.n7h unused3) {
                throw new IllegalStateException("this should not be happen");
            }
        }

        @Override // com.xiaomi.passport.uicontroller.AbstractC5838k, com.xiaomi.accountsdk.futureservice.AbstractC5505k
        /* JADX INFO: renamed from: n */
        public void mo18833n(ExecutionException executionException) throws n7h, C7724n, C5539k, x2, RemoteException, IOException, p039w.f7l8, kja0 {
            try {
                super.mo18833n(executionException);
            } catch (cdj unused) {
                throw new IllegalStateException("this should not be happen");
            } catch (ld6 unused2) {
                throw new IllegalStateException("this should not be happen");
            } catch (p039w.n7h unused3) {
                throw new IllegalStateException("this should not be happen");
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.k$p */
    /* JADX INFO: compiled from: MiPassportLoginFuture.java */
    public static abstract class p implements AbstractC5845y.k {
        @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k.zy
        /* JADX INFO: renamed from: k */
        public final void mo18836k(AbstractC5505k abstractC5505k) {
            toq((s) abstractC5505k);
        }

        protected abstract void toq(s sVar);
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.k$q */
    /* JADX INFO: compiled from: MiPassportLoginFuture.java */
    public static abstract class q implements AbstractC5845y.k {
        @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k.zy
        /* JADX INFO: renamed from: k */
        public final void mo18836k(AbstractC5505k abstractC5505k) {
            toq((zy) abstractC5505k);
        }

        protected abstract void toq(zy zyVar);
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.k$s */
    /* JADX INFO: compiled from: MiPassportLoginFuture.java */
    public static final class s extends AbstractC5838k {
        public s(AbstractC5845y.k<AccountInfo> kVar) {
            super(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.passport.uicontroller.AbstractC5838k, com.xiaomi.passport.uicontroller.AbstractC5845y
        /* JADX INFO: renamed from: ld6 */
        public AccountInfo mo20492p(MiLoginResult miLoginResult) throws n7h, ld6, C5539k, C7724n, x2, IOException, RemoteException, p039w.f7l8 {
            try {
                return super.mo20492p(miLoginResult);
            } catch (cdj unused) {
                throw new IllegalStateException("this should not be happen");
            } catch (kja0 unused2) {
                throw new IllegalStateException("this should not be happen");
            } catch (p039w.n7h unused3) {
                throw new IllegalStateException("this should not be happen");
            }
        }

        @Override // com.xiaomi.passport.uicontroller.AbstractC5838k, com.xiaomi.accountsdk.futureservice.AbstractC5505k
        /* JADX INFO: renamed from: n */
        public void mo18833n(ExecutionException executionException) throws n7h, ld6, C7724n, C5539k, x2, RemoteException, IOException, p039w.f7l8 {
            try {
                super.mo18833n(executionException);
            } catch (cdj unused) {
                throw new IllegalStateException("this should not be happen");
            } catch (kja0 unused2) {
                throw new IllegalStateException("this should not be happen");
            } catch (p039w.n7h unused3) {
                throw new IllegalStateException("this should not be happen");
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.k$toq */
    /* JADX INFO: compiled from: MiPassportLoginFuture.java */
    public static abstract class toq implements AbstractC5845y.k {
        @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k.zy
        /* JADX INFO: renamed from: k */
        public final void mo18836k(AbstractC5505k abstractC5505k) {
            toq((k) abstractC5505k);
        }

        protected abstract void toq(k kVar);
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.k$y */
    /* JADX INFO: compiled from: MiPassportLoginFuture.java */
    public static abstract class y implements AbstractC5845y.k {
        @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k.zy
        /* JADX INFO: renamed from: k */
        public final void mo18836k(AbstractC5505k abstractC5505k) {
            toq((f7l8) abstractC5505k);
        }

        protected abstract void toq(f7l8 f7l8Var);
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.k$zy */
    /* JADX INFO: compiled from: MiPassportLoginFuture.java */
    public static class zy extends AbstractC5845y<NotificationAuthResult, NotificationAuthResult> {
        public zy(AbstractC5845y.k<NotificationAuthResult> kVar) {
            super(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.passport.uicontroller.AbstractC5845y
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public NotificationAuthResult mo20492p(NotificationAuthResult notificationAuthResult) {
            return notificationAuthResult;
        }

        @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k
        /* JADX INFO: renamed from: n */
        public void mo18833n(ExecutionException executionException) throws Exception {
            if (executionException.getCause() instanceof RemoteException) {
                throw ((RemoteException) executionException.getCause());
            }
            throw new IllegalStateException("unknown exception met: " + executionException.getCause().getMessage());
        }
    }

    public AbstractC5838k(AbstractC5845y.k<AccountInfo> kVar) {
        super(kVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.passport.uicontroller.AbstractC5845y
    /* JADX INFO: renamed from: ld6 */
    public AccountInfo mo20492p(MiLoginResult miLoginResult) throws n7h, ld6, x2, RemoteException, IOException, p039w.n7h, kja0, cdj, C7724n, C5539k, p039w.f7l8 {
        if (miLoginResult == null) {
            throw new n7h("result is null");
        }
        switch (miLoginResult.f30461h) {
            case 0:
                return miLoginResult.f30464n;
            case 1:
                throw new p039w.n7h(miLoginResult.f30460g);
            case 2:
                throw new cdj(miLoginResult.f30467s, miLoginResult.f30465p, miLoginResult.f30463k);
            case 3:
                throw new kja0(miLoginResult.f30463k, miLoginResult.f30468y);
            case 4:
                throw new p039w.f7l8(miLoginResult.f30462i).metaLoginData(miLoginResult.f30467s).captchaUrl(miLoginResult.f30460g);
            case 5:
                if (!miLoginResult.f30469z) {
                    throw new IOException("network error");
                }
                ki kiVar = new ki(0, "http exception");
                kiVar.stsUrlRequestError(miLoginResult.f30466q);
                throw kiVar;
            case 6:
                n7h n7hVar = new n7h("server error");
                if (!miLoginResult.f30469z) {
                    throw n7hVar;
                }
                n7hVar.stsUrlRequestError(miLoginResult.f30466q);
                throw n7hVar;
            case 7:
                C5539k c5539k = new C5539k(403, "access denied");
                if (!miLoginResult.f30469z) {
                    throw c5539k;
                }
                c5539k.stsUrlRequestError(miLoginResult.f30466q);
                throw c5539k;
            case 8:
                throw new x2();
            case 9:
                throw new C7724n("device id should not be null");
            case 10:
                throw new SSLException("time or network error");
            case 11:
                throw new ld6();
            case 12:
            default:
                throw new IllegalStateException("this should not be happen");
            case 13:
                throw new RemoteException("Service side fatal error");
        }
    }

    @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k
    /* JADX INFO: renamed from: n */
    public void mo18833n(ExecutionException executionException) throws cdj, n7h, ld6, C7724n, C5539k, x2, RemoteException, IOException, p039w.n7h, p039w.f7l8, kja0 {
        Throwable cause = executionException.getCause();
        if (cause instanceof kja0) {
            throw ((kja0) cause);
        }
        if (cause instanceof cdj) {
            throw ((cdj) cause);
        }
        if (cause instanceof ld6) {
            throw ((ld6) cause);
        }
        if (cause instanceof IOException) {
            throw ((IOException) cause);
        }
        if (cause instanceof p039w.f7l8) {
            throw ((p039w.f7l8) cause);
        }
        if (cause instanceof p039w.n7h) {
            throw ((p039w.n7h) cause);
        }
        if (cause instanceof x2) {
            throw ((x2) cause);
        }
        if (cause instanceof C5539k) {
            throw ((C5539k) cause);
        }
        if (cause instanceof n7h) {
            throw ((n7h) cause);
        }
        if (cause instanceof SSLException) {
            throw ((SSLException) cause);
        }
        if (cause instanceof C7724n) {
            throw ((C7724n) cause);
        }
        if (cause instanceof IllegalStateException) {
            throw ((IllegalStateException) cause);
        }
        if (cause instanceof RemoteException) {
            throw ((RemoteException) cause);
        }
        throw new IllegalStateException("unknown exception met: " + cause.getMessage());
    }
}

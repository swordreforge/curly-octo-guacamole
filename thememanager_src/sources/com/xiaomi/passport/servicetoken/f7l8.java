package com.xiaomi.passport.servicetoken;

import android.os.RemoteException;
import com.xiaomi.accountsdk.futureservice.AbstractC5505k;
import com.xiaomi.passport.servicetoken.ServiceTokenResult;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: ServiceTokenFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 extends AbstractC5505k<ServiceTokenResult, ServiceTokenResult> {

    /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.f7l8$k */
    /* JADX INFO: compiled from: ServiceTokenFuture.java */
    public static abstract class AbstractC5822k implements AbstractC5505k.zy<ServiceTokenResult> {
        @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k.zy
        /* JADX INFO: renamed from: k */
        public final void mo18836k(AbstractC5505k<?, ServiceTokenResult> abstractC5505k) {
            toq((f7l8) abstractC5505k);
        }

        protected abstract void toq(f7l8 f7l8Var);
    }

    public f7l8(AbstractC5505k.zy<ServiceTokenResult> zyVar) {
        super(zyVar);
    }

    private ServiceTokenResult qrj(Long l2, TimeUnit timeUnit) {
        try {
            return (l2 == null || timeUnit == null) ? (ServiceTokenResult) super.get() : (ServiceTokenResult) super.get(l2.longValue(), timeUnit);
        } catch (InterruptedException e2) {
            return new ServiceTokenResult.C5817k(null).cdj(ServiceTokenResult.toq.ERROR_CANCELLED).ki(e2.getMessage()).n7h();
        } catch (ExecutionException e3) {
            e = e3;
            if (e.getCause() instanceof RemoteException) {
                return new ServiceTokenResult.C5817k(null).cdj(ServiceTokenResult.toq.ERROR_REMOTE_EXCEPTION).ki(e.getMessage()).n7h();
            }
            if (e.getCause() != null) {
                e = e.getCause();
            }
            return new ServiceTokenResult.C5817k(null).cdj(ServiceTokenResult.toq.ERROR_UNKNOWN).ki(e.getMessage()).n7h();
        } catch (TimeoutException unused) {
            return new ServiceTokenResult.C5817k(null).cdj(ServiceTokenResult.toq.ERROR_TIME_OUT).ki("time out after " + l2 + " " + timeUnit).n7h();
        }
    }

    @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k, java.util.concurrent.FutureTask, java.util.concurrent.Future
    /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
    public ServiceTokenResult get() {
        return qrj(null, null);
    }

    @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k
    /* JADX INFO: renamed from: n */
    public void mo18833n(ExecutionException executionException) throws Exception {
        throw new IllegalStateException("not going here");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ServiceTokenResult toq(ServiceTokenResult serviceTokenResult) throws Throwable {
        return serviceTokenResult;
    }

    @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k, java.util.concurrent.FutureTask, java.util.concurrent.Future
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public ServiceTokenResult get(long j2, TimeUnit timeUnit) {
        return qrj(Long.valueOf(j2), timeUnit);
    }
}

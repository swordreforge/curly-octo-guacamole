package com.xiaomi.passport.servicetoken;

import android.content.Context;
import android.os.AsyncTask;
import com.xiaomi.passport.servicetoken.data.XmAccountVisibility;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.p */
/* JADX INFO: compiled from: ServiceTokenUtilImplBase.java */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5831p implements InterfaceC5830n {

    /* JADX INFO: renamed from: k */
    private static Executor f32555k = AsyncTask.THREAD_POOL_EXECUTOR;

    /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.p$k */
    /* JADX INFO: compiled from: ServiceTokenUtilImplBase.java */
    class k extends q {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f32556k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f73224toq;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, String str) {
            super(null);
            this.f32556k = context;
            this.f73224toq = str;
        }

        @Override // com.xiaomi.passport.servicetoken.AbstractC5831p.q
        /* JADX INFO: renamed from: k */
        protected ServiceTokenResult mo20471k() {
            return AbstractC5831p.this.f7l8(this.f32556k, this.f73224toq);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.p$q */
    /* JADX INFO: compiled from: ServiceTokenUtilImplBase.java */
    private static abstract class q {

        /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.p$q$k */
        /* JADX INFO: compiled from: ServiceTokenUtilImplBase.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ f7l8 f32557k;

            k(f7l8 f7l8Var) {
                this.f32557k = f7l8Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f32557k.m18835y(q.this.mo20471k());
                } catch (Throwable th) {
                    this.f32557k.m18834s(th);
                }
            }
        }

        private q() {
        }

        /* JADX INFO: renamed from: k */
        protected abstract ServiceTokenResult mo20471k();

        f7l8 toq() {
            f7l8 f7l8Var = new f7l8(null);
            AbstractC5831p.f32555k.execute(new k(f7l8Var));
            return f7l8Var;
        }

        /* synthetic */ q(k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.p$toq */
    /* JADX INFO: compiled from: ServiceTokenUtilImplBase.java */
    class toq extends q {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f32559k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ ServiceTokenResult f73226toq;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(Context context, ServiceTokenResult serviceTokenResult) {
            super(null);
            this.f32559k = context;
            this.f73226toq = serviceTokenResult;
        }

        @Override // com.xiaomi.passport.servicetoken.AbstractC5831p.q
        /* JADX INFO: renamed from: k */
        protected ServiceTokenResult mo20471k() {
            return AbstractC5831p.this.mo20465y(this.f32559k, this.f73226toq);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.p$zy */
    /* JADX INFO: compiled from: ServiceTokenUtilImplBase.java */
    class zy extends com.xiaomi.accountsdk.futureservice.toq<XmAccountVisibility> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Context f32560g;

        zy(Context context) {
            this.f32560g = context;
        }

        @Override // com.xiaomi.accountsdk.futureservice.toq
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public XmAccountVisibility mo18837p() {
            return AbstractC5831p.this.mo20463g(this.f32560g);
        }
    }

    AbstractC5831p() {
    }

    protected abstract ServiceTokenResult f7l8(Context context, String str);

    /* JADX INFO: renamed from: g */
    protected abstract XmAccountVisibility mo20463g(Context context);

    @Override // com.xiaomi.passport.servicetoken.InterfaceC5830n
    /* JADX INFO: renamed from: k */
    public com.xiaomi.accountsdk.futureservice.toq<XmAccountVisibility> mo20468k(Context context) {
        return new zy(context).ld6();
    }

    @Override // com.xiaomi.passport.servicetoken.InterfaceC5830n
    /* JADX INFO: renamed from: q */
    public final f7l8 mo20469q(Context context, ServiceTokenResult serviceTokenResult) {
        return new toq(context, serviceTokenResult).toq();
    }

    @Override // com.xiaomi.passport.servicetoken.InterfaceC5830n
    public final f7l8 toq(Context context, String str) {
        return new k(context, str).toq();
    }

    /* JADX INFO: renamed from: y */
    protected abstract ServiceTokenResult mo20465y(Context context, ServiceTokenResult serviceTokenResult);
}

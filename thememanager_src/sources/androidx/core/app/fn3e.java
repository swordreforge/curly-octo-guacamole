package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: JobIntentService.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class fn3e extends Service {

    /* JADX INFO: renamed from: h */
    static final String f3151h = "JobIntentService";

    /* JADX INFO: renamed from: i */
    static final boolean f3152i = false;

    /* JADX INFO: renamed from: k */
    toq f3156k;

    /* JADX INFO: renamed from: n */
    AsyncTaskC0426k f3157n;

    /* JADX INFO: renamed from: q */
    AbstractC0429y f3159q;

    /* JADX INFO: renamed from: z */
    static final Object f3154z = new Object();

    /* JADX INFO: renamed from: t */
    static final HashMap<ComponentName, AbstractC0429y> f3153t = new HashMap<>();

    /* JADX INFO: renamed from: g */
    boolean f3155g = false;

    /* JADX INFO: renamed from: y */
    boolean f3161y = false;

    /* JADX INFO: renamed from: s */
    boolean f3160s = false;

    /* JADX INFO: renamed from: p */
    final ArrayList<C0428q> f3158p = null;

    /* JADX INFO: compiled from: JobIntentService.java */
    @zy.hyr(26)
    static final class f7l8 extends AbstractC0429y {

        /* JADX INFO: renamed from: n */
        private final JobScheduler f3162n;

        /* JADX INFO: renamed from: q */
        private final JobInfo f3163q;

        f7l8(Context context, ComponentName componentName, int i2) {
            super(componentName);
            toq(i2);
            this.f3163q = new JobInfo.Builder(i2, this.f3170k).setOverrideDeadline(0L).build();
            this.f3162n = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.fn3e.AbstractC0429y
        /* JADX INFO: renamed from: k */
        void mo1872k(Intent intent) {
            this.f3162n.enqueue(this.f3163q, new JobWorkItem(intent));
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.fn3e$g */
    /* JADX INFO: compiled from: JobIntentService.java */
    @zy.hyr(26)
    static final class JobServiceEngineC0425g extends JobServiceEngine implements toq {

        /* JADX INFO: renamed from: n */
        static final boolean f3164n = false;

        /* JADX INFO: renamed from: q */
        static final String f3165q = "JobServiceEngineImpl";

        /* JADX INFO: renamed from: k */
        final fn3e f3166k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Object f50060toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        JobParameters f50061zy;

        /* JADX INFO: renamed from: androidx.core.app.fn3e$g$k */
        /* JADX INFO: compiled from: JobIntentService.java */
        final class k implements InterfaceC0427n {

            /* JADX INFO: renamed from: k */
            final JobWorkItem f3167k;

            k(JobWorkItem jobWorkItem) {
                this.f3167k = jobWorkItem;
            }

            @Override // androidx.core.app.fn3e.InterfaceC0427n
            public Intent getIntent() {
                return this.f3167k.getIntent();
            }

            @Override // androidx.core.app.fn3e.InterfaceC0427n
            public void ld6() {
                synchronized (JobServiceEngineC0425g.this.f50060toq) {
                    JobParameters jobParameters = JobServiceEngineC0425g.this.f50061zy;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f3167k);
                    }
                }
            }
        }

        JobServiceEngineC0425g(fn3e fn3eVar) {
            super(fn3eVar);
            this.f50060toq = new Object();
            this.f3166k = fn3eVar;
        }

        @Override // androidx.core.app.fn3e.toq
        /* JADX INFO: renamed from: k */
        public IBinder mo1873k() {
            return getBinder();
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f50061zy = jobParameters;
            this.f3166k.m1868n(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean qVar = this.f3166k.toq();
            synchronized (this.f50060toq) {
                this.f50061zy = null;
            }
            return qVar;
        }

        @Override // androidx.core.app.fn3e.toq
        public InterfaceC0427n toq() {
            synchronized (this.f50060toq) {
                JobParameters jobParameters = this.f50061zy;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f3166k.getClassLoader());
                return new k(jobWorkItemDequeueWork);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.fn3e$k */
    /* JADX INFO: compiled from: JobIntentService.java */
    final class AsyncTaskC0426k extends AsyncTask<Void, Void, Void> {
        AsyncTaskC0426k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                InterfaceC0427n interfaceC0427nM1867k = fn3e.this.m1867k();
                if (interfaceC0427nM1867k == null) {
                    return null;
                }
                fn3e.this.m1871y(interfaceC0427nM1867k.getIntent());
                interfaceC0427nM1867k.ld6();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r1) {
            fn3e.this.m1869p();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r1) {
            fn3e.this.m1869p();
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.fn3e$n */
    /* JADX INFO: compiled from: JobIntentService.java */
    interface InterfaceC0427n {
        Intent getIntent();

        void ld6();
    }

    /* JADX INFO: renamed from: androidx.core.app.fn3e$q */
    /* JADX INFO: compiled from: JobIntentService.java */
    final class C0428q implements InterfaceC0427n {

        /* JADX INFO: renamed from: k */
        final Intent f3169k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f50063toq;

        C0428q(Intent intent, int i2) {
            this.f3169k = intent;
            this.f50063toq = i2;
        }

        @Override // androidx.core.app.fn3e.InterfaceC0427n
        public Intent getIntent() {
            return this.f3169k;
        }

        @Override // androidx.core.app.fn3e.InterfaceC0427n
        public void ld6() {
            fn3e.this.stopSelf(this.f50063toq);
        }
    }

    /* JADX INFO: compiled from: JobIntentService.java */
    interface toq {
        /* JADX INFO: renamed from: k */
        IBinder mo1873k();

        InterfaceC0427n toq();
    }

    /* JADX INFO: renamed from: androidx.core.app.fn3e$y */
    /* JADX INFO: compiled from: JobIntentService.java */
    static abstract class AbstractC0429y {

        /* JADX INFO: renamed from: k */
        final ComponentName f3170k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        boolean f50065toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f50066zy;

        AbstractC0429y(ComponentName componentName) {
            this.f3170k = componentName;
        }

        /* JADX INFO: renamed from: k */
        abstract void mo1872k(Intent intent);

        /* JADX INFO: renamed from: n */
        public void mo1875n() {
        }

        /* JADX INFO: renamed from: q */
        public void mo1876q() {
        }

        void toq(int i2) {
            if (!this.f50065toq) {
                this.f50065toq = true;
                this.f50066zy = i2;
            } else {
                if (this.f50066zy == i2) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i2 + " is different than previous " + this.f50066zy);
            }
        }

        public void zy() {
        }
    }

    /* JADX INFO: compiled from: JobIntentService.java */
    static final class zy extends AbstractC0429y {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        boolean f50067f7l8;

        /* JADX INFO: renamed from: g */
        private final PowerManager.WakeLock f3171g;

        /* JADX INFO: renamed from: n */
        private final PowerManager.WakeLock f3172n;

        /* JADX INFO: renamed from: q */
        private final Context f3173q;

        /* JADX INFO: renamed from: y */
        boolean f3174y;

        zy(Context context, ComponentName componentName) {
            super(componentName);
            this.f3173q = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f3172n = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f3171g = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.fn3e.AbstractC0429y
        /* JADX INFO: renamed from: k */
        void mo1872k(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f3170k);
            if (this.f3173q.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f50067f7l8) {
                        this.f50067f7l8 = true;
                        if (!this.f3174y) {
                            this.f3172n.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // androidx.core.app.fn3e.AbstractC0429y
        /* JADX INFO: renamed from: n */
        public void mo1875n() {
            synchronized (this) {
                this.f50067f7l8 = false;
            }
        }

        @Override // androidx.core.app.fn3e.AbstractC0429y
        /* JADX INFO: renamed from: q */
        public void mo1876q() {
            synchronized (this) {
                if (!this.f3174y) {
                    this.f3174y = true;
                    this.f3171g.acquire(600000L);
                    this.f3172n.release();
                }
            }
        }

        @Override // androidx.core.app.fn3e.AbstractC0429y
        public void zy() {
            synchronized (this) {
                if (this.f3174y) {
                    if (this.f50067f7l8) {
                        this.f3172n.acquire(60000L);
                    }
                    this.f3174y = false;
                    this.f3171g.release();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    static AbstractC0429y m1865g(Context context, ComponentName componentName, boolean z2, int i2) {
        HashMap<ComponentName, AbstractC0429y> map = f3153t;
        AbstractC0429y abstractC0429y = map.get(componentName);
        if (abstractC0429y != null) {
            return abstractC0429y;
        }
        if (!z2) {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        f7l8 f7l8Var = new f7l8(context, componentName, i2);
        map.put(componentName, f7l8Var);
        return f7l8Var;
    }

    /* JADX INFO: renamed from: q */
    public static void m1866q(@zy.lvui Context context, @zy.lvui Class<?> cls, int i2, @zy.lvui Intent intent) {
        zy(context, new ComponentName(context, cls), i2, intent);
    }

    public static void zy(@zy.lvui Context context, @zy.lvui ComponentName componentName, int i2, @zy.lvui Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f3154z) {
            AbstractC0429y abstractC0429yM1865g = m1865g(context, componentName, true, i2);
            abstractC0429yM1865g.toq(i2);
            abstractC0429yM1865g.mo1872k(intent);
        }
    }

    public boolean f7l8() {
        return this.f3161y;
    }

    /* JADX INFO: renamed from: k */
    InterfaceC0427n m1867k() {
        toq toqVar = this.f3156k;
        if (toqVar != null) {
            return toqVar.toq();
        }
        synchronized (this.f3158p) {
            if (this.f3158p.size() <= 0) {
                return null;
            }
            return this.f3158p.remove(0);
        }
    }

    public void ld6(boolean z2) {
        this.f3155g = z2;
    }

    /* JADX INFO: renamed from: n */
    void m1868n(boolean z2) {
        if (this.f3157n == null) {
            this.f3157n = new AsyncTaskC0426k();
            AbstractC0429y abstractC0429y = this.f3159q;
            if (abstractC0429y != null && z2) {
                abstractC0429y.mo1876q();
            }
            this.f3157n.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(@zy.lvui Intent intent) {
        toq toqVar = this.f3156k;
        if (toqVar != null) {
            return toqVar.mo1873k();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f3156k = new JobServiceEngineC0425g(this);
        this.f3159q = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0428q> arrayList = this.f3158p;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3160s = true;
                this.f3159q.zy();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@zy.dd Intent intent, int i2, int i3) {
        if (this.f3158p == null) {
            return 2;
        }
        this.f3159q.mo1875n();
        synchronized (this.f3158p) {
            ArrayList<C0428q> arrayList = this.f3158p;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0428q(intent, i3));
            m1868n(true);
        }
        return 3;
    }

    /* JADX INFO: renamed from: p */
    void m1869p() {
        ArrayList<C0428q> arrayList = this.f3158p;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3157n = null;
                ArrayList<C0428q> arrayList2 = this.f3158p;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    m1868n(false);
                } else if (!this.f3160s) {
                    this.f3159q.zy();
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m1870s() {
        return true;
    }

    boolean toq() {
        AsyncTaskC0426k asyncTaskC0426k = this.f3157n;
        if (asyncTaskC0426k != null) {
            asyncTaskC0426k.cancel(this.f3155g);
        }
        this.f3161y = true;
        return m1870s();
    }

    /* JADX INFO: renamed from: y */
    protected abstract void m1871y(@zy.lvui Intent intent);
}

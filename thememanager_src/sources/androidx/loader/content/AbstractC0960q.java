package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import zy.uv6;

/* JADX INFO: renamed from: androidx.loader.content.q */
/* JADX INFO: compiled from: ModernAsyncTask.java */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0960q<Params, Progress, Result> {

    /* JADX INFO: renamed from: c */
    private static g f5153c = null;

    /* JADX INFO: renamed from: e */
    private static volatile Executor f5154e = null;

    /* JADX INFO: renamed from: f */
    private static final int f5155f = 2;

    /* JADX INFO: renamed from: h */
    private static final int f5156h = 128;

    /* JADX INFO: renamed from: i */
    private static final int f5157i = 1;

    /* JADX INFO: renamed from: l */
    private static final int f5158l = 1;

    /* JADX INFO: renamed from: p */
    private static final int f5159p = 5;

    /* JADX INFO: renamed from: r */
    public static final Executor f5160r;

    /* JADX INFO: renamed from: s */
    private static final String f5161s = "AsyncTask";

    /* JADX INFO: renamed from: t */
    private static final BlockingQueue<Runnable> f5162t;

    /* JADX INFO: renamed from: z */
    private static final ThreadFactory f5163z;

    /* JADX INFO: renamed from: k */
    private final y<Params, Result> f5165k;

    /* JADX INFO: renamed from: q */
    private final FutureTask<Result> f5167q;

    /* JADX INFO: renamed from: n */
    private volatile f7l8 f5166n = f7l8.PENDING;

    /* JADX INFO: renamed from: g */
    final AtomicBoolean f5164g = new AtomicBoolean();

    /* JADX INFO: renamed from: y */
    final AtomicBoolean f5168y = new AtomicBoolean();

    /* JADX INFO: renamed from: androidx.loader.content.q$f7l8 */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    public enum f7l8 {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX INFO: renamed from: androidx.loader.content.q$g */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    private static class g extends Handler {
        g() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            n nVar = (n) message.obj;
            int i2 = message.what;
            if (i2 == 1) {
                nVar.f5171k.m4517g(nVar.f51623toq[0]);
            } else {
                if (i2 != 2) {
                    return;
                }
                nVar.f5171k.m4518h(nVar.f51623toq);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.q$k */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    static class k implements ThreadFactory {

        /* JADX INFO: renamed from: k */
        private final AtomicInteger f5170k = new AtomicInteger(1);

        k() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f5170k.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.q$n */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    private static class n<Data> {

        /* JADX INFO: renamed from: k */
        final AbstractC0960q f5171k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Data[] f51623toq;

        n(AbstractC0960q abstractC0960q, Data... dataArr) {
            this.f5171k = abstractC0960q;
            this.f51623toq = dataArr;
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.q$q */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    static /* synthetic */ class q {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f5172k;

        static {
            int[] iArr = new int[f7l8.values().length];
            f5172k = iArr;
            try {
                iArr[f7l8.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5172k[f7l8.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.q$toq */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    class toq extends y<Params, Result> {
        toq() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            AbstractC0960q.this.f5168y.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) AbstractC0960q.this.toq(this.f5174k);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.q$y */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    private static abstract class y<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: k */
        Params[] f5174k;

        y() {
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.q$zy */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    class zy extends FutureTask<Result> {
        zy(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC0960q.this.ki(get());
            } catch (InterruptedException e2) {
                Log.w(AbstractC0960q.f5161s, e2);
            } catch (CancellationException unused) {
                AbstractC0960q.this.ki(null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    static {
        k kVar = new k();
        f5163z = kVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f5162t = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, kVar);
        f5160r = threadPoolExecutor;
        f5154e = threadPoolExecutor;
    }

    AbstractC0960q() {
        toq toqVar = new toq();
        this.f5165k = toqVar;
        this.f5167q = new zy(toqVar);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: i */
    public static void m4514i(Executor executor) {
        f5154e = executor;
    }

    /* JADX INFO: renamed from: q */
    public static void m4515q(Runnable runnable) {
        f5154e.execute(runnable);
    }

    /* JADX INFO: renamed from: s */
    private static Handler m4516s() {
        g gVar;
        synchronized (AbstractC0960q.class) {
            if (f5153c == null) {
                f5153c = new g();
            }
            gVar = f5153c;
        }
        return gVar;
    }

    Result cdj(Result result) {
        m4516s().obtainMessage(1, new n(this, result)).sendToTarget();
        return result;
    }

    public final Result f7l8() throws ExecutionException, InterruptedException {
        return this.f5167q.get();
    }

    /* JADX INFO: renamed from: g */
    void m4517g(Result result) {
        if (ld6()) {
            qrj(result);
        } else {
            n7h(result);
        }
        this.f5166n = f7l8.FINISHED;
    }

    /* JADX INFO: renamed from: h */
    protected void m4518h(Progress... progressArr) {
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4519k(boolean z2) {
        this.f5164g.set(true);
        return this.f5167q.cancel(z2);
    }

    void ki(Result result) {
        if (this.f5168y.get()) {
            return;
        }
        cdj(result);
    }

    protected void kja0() {
    }

    public final boolean ld6() {
        return this.f5164g.get();
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC0960q<Params, Progress, Result> m4520n(Executor executor, Params... paramsArr) {
        if (this.f5166n == f7l8.PENDING) {
            this.f5166n = f7l8.RUNNING;
            kja0();
            this.f5165k.f5174k = paramsArr;
            executor.execute(this.f5167q);
            return this;
        }
        int i2 = q.f5172k[this.f5166n.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    protected void n7h(Result result) {
    }

    /* JADX INFO: renamed from: p */
    public final f7l8 m4521p() {
        return this.f5166n;
    }

    protected void qrj(Result result) {
        x2();
    }

    protected final void t8r(Progress... progressArr) {
        if (ld6()) {
            return;
        }
        m4516s().obtainMessage(2, new n(this, progressArr)).sendToTarget();
    }

    protected abstract Result toq(Params... paramsArr);

    protected void x2() {
    }

    /* JADX INFO: renamed from: y */
    public final Result m4522y(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f5167q.get(j2, timeUnit);
    }

    public final AbstractC0960q<Params, Progress, Result> zy(Params... paramsArr) {
        return m4520n(f5154e, paramsArr);
    }
}

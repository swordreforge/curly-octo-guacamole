package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.cdj;
import androidx.core.util.fu4;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.loader.content.k */
/* JADX INFO: compiled from: AsyncTaskLoader.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0959k<D> extends zy<D> {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    static final boolean f51617cdj = false;

    /* JADX INFO: renamed from: h */
    static final String f5148h = "AsyncTaskLoader";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    Handler f51618kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    volatile AbstractC0959k<D>.k f51619ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    long f51620n7h;

    /* JADX INFO: renamed from: p */
    private final Executor f5149p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    long f51621qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    volatile AbstractC0959k<D>.k f51622x2;

    /* JADX INFO: renamed from: androidx.loader.content.k$k */
    /* JADX INFO: compiled from: AsyncTaskLoader.java */
    final class k extends AbstractC0960q<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: j */
        private final CountDownLatch f5150j = new CountDownLatch(1);

        /* JADX INFO: renamed from: o */
        boolean f5152o;

        k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.loader.content.AbstractC0960q
        /* JADX INFO: renamed from: fn3e, reason: merged with bridge method [inline-methods] */
        public D toq(Void... voidArr) {
            try {
                return (D) AbstractC0959k.this.eqxt();
            } catch (cdj e2) {
                if (ld6()) {
                    return null;
                }
                throw e2;
            }
        }

        @Override // androidx.loader.content.AbstractC0960q
        protected void n7h(D d2) {
            try {
                AbstractC0959k.this.fti(this, d2);
            } finally {
                this.f5150j.countDown();
            }
        }

        @Override // androidx.loader.content.AbstractC0960q
        protected void qrj(D d2) {
            try {
                AbstractC0959k.this.a9(this, d2);
            } finally {
                this.f5150j.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5152o = false;
            AbstractC0959k.this.jp0y();
        }

        public void zurt() {
            try {
                this.f5150j.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public AbstractC0959k(@lvui Context context) {
        this(context, AbstractC0960q.f5160r);
    }

    void a9(AbstractC0959k<D>.k kVar, D d2) {
        oc(d2);
        if (this.f51622x2 == kVar) {
            fu4();
            this.f51620n7h = SystemClock.uptimeMillis();
            this.f51622x2 = null;
            m4532n();
            jp0y();
        }
    }

    @Override // androidx.loader.content.zy
    protected void cdj() {
        super.cdj();
        toq();
        this.f51619ld6 = new k();
        jp0y();
    }

    public void d2ok(long j2) {
        this.f51621qrj = j2;
        if (j2 != 0) {
            this.f51618kja0 = new Handler();
        }
    }

    @dd
    public abstract D d3();

    @dd
    protected D eqxt() {
        return d3();
    }

    @Override // androidx.loader.content.zy
    @Deprecated
    public void f7l8(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.f7l8(str, fileDescriptor, printWriter, strArr);
        if (this.f51619ld6 != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f51619ld6);
            printWriter.print(" waiting=");
            printWriter.println(this.f51619ld6.f5152o);
        }
        if (this.f51622x2 != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f51622x2);
            printWriter.print(" waiting=");
            printWriter.println(this.f51622x2.f5152o);
        }
        if (this.f51621qrj != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            fu4.zy(this.f51621qrj, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            fu4.toq(this.f51620n7h, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    void fti(AbstractC0959k<D>.k kVar, D d2) {
        if (this.f51619ld6 != kVar) {
            a9(kVar, d2);
            return;
        }
        if (ld6()) {
            oc(d2);
            return;
        }
        zy();
        this.f51620n7h = SystemClock.uptimeMillis();
        this.f51619ld6 = null;
        mo4526g(d2);
    }

    public boolean gvn7() {
        return this.f51622x2 != null;
    }

    public void jk() {
    }

    void jp0y() {
        if (this.f51622x2 != null || this.f51619ld6 == null) {
            return;
        }
        if (this.f51619ld6.f5152o) {
            this.f51619ld6.f5152o = false;
            this.f51618kja0.removeCallbacks(this.f51619ld6);
        }
        if (this.f51621qrj <= 0 || SystemClock.uptimeMillis() >= this.f51620n7h + this.f51621qrj) {
            this.f51619ld6.m4520n(this.f5149p, null);
        } else {
            this.f51619ld6.f5152o = true;
            this.f51618kja0.postAtTime(this.f51619ld6, this.f51620n7h + this.f51621qrj);
        }
    }

    @Override // androidx.loader.content.zy
    protected boolean kja0() {
        if (this.f51619ld6 == null) {
            return false;
        }
        if (!this.f5180n) {
            this.f5183y = true;
        }
        if (this.f51622x2 != null) {
            if (this.f51619ld6.f5152o) {
                this.f51619ld6.f5152o = false;
                this.f51618kja0.removeCallbacks(this.f51619ld6);
            }
            this.f51619ld6 = null;
            return false;
        }
        if (this.f51619ld6.f5152o) {
            this.f51619ld6.f5152o = false;
            this.f51618kja0.removeCallbacks(this.f51619ld6);
            this.f51619ld6 = null;
            return false;
        }
        boolean zM4519k = this.f51619ld6.m4519k(false);
        if (zM4519k) {
            this.f51622x2 = this.f51619ld6;
            jk();
        }
        this.f51619ld6 = null;
        return zM4519k;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void lvui() {
        AbstractC0959k<D>.k kVar = this.f51619ld6;
        if (kVar != null) {
            kVar.zurt();
        }
    }

    public void oc(@dd D d2) {
    }

    private AbstractC0959k(@lvui Context context, @lvui Executor executor) {
        super(context);
        this.f51620n7h = -10000L;
        this.f5149p = executor;
    }
}

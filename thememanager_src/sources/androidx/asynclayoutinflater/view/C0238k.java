package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.qrj;
import java.util.concurrent.ArrayBlockingQueue;
import zy.dd;
import zy.ek5k;
import zy.gvn7;
import zy.lvui;

/* JADX INFO: renamed from: androidx.asynclayoutinflater.view.k */
/* JADX INFO: compiled from: AsyncLayoutInflater.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0238k {

    /* JADX INFO: renamed from: n */
    private static final String f1278n = "AsyncLayoutInflater";

    /* JADX INFO: renamed from: k */
    LayoutInflater f1279k;

    /* JADX INFO: renamed from: q */
    private Handler.Callback f1280q = new k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    Handler f47009toq = new Handler(this.f1280q);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    q f47010zy = q.toq();

    /* JADX INFO: renamed from: androidx.asynclayoutinflater.view.k$k */
    /* JADX INFO: compiled from: AsyncLayoutInflater.java */
    class k implements Handler.Callback {
        k() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            zy zyVar = (zy) message.obj;
            if (zyVar.f1288q == null) {
                zyVar.f1288q = C0238k.this.f1279k.inflate(zyVar.f47012zy, zyVar.f47011toq, false);
            }
            zyVar.f1287n.mo778k(zyVar.f1288q, zyVar.f47012zy, zyVar.f47011toq);
            C0238k.this.f47010zy.m781q(zyVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.asynclayoutinflater.view.k$n */
    /* JADX INFO: compiled from: AsyncLayoutInflater.java */
    public interface n {
        /* JADX INFO: renamed from: k */
        void mo778k(@lvui View view, @gvn7 int i2, @dd ViewGroup viewGroup);
    }

    /* JADX INFO: renamed from: androidx.asynclayoutinflater.view.k$q */
    /* JADX INFO: compiled from: AsyncLayoutInflater.java */
    private static class q extends Thread {

        /* JADX INFO: renamed from: n */
        private static final q f1282n;

        /* JADX INFO: renamed from: k */
        private ArrayBlockingQueue<zy> f1283k = new ArrayBlockingQueue<>(10);

        /* JADX INFO: renamed from: q */
        private qrj.zy<zy> f1284q = new qrj.zy<>(10);

        static {
            q qVar = new q();
            f1282n = qVar;
            qVar.start();
        }

        private q() {
        }

        public static q toq() {
            return f1282n;
        }

        /* JADX INFO: renamed from: k */
        public void m779k(zy zyVar) {
            try {
                this.f1283k.put(zyVar);
            } catch (InterruptedException e2) {
                throw new RuntimeException("Failed to enqueue async inflate request", e2);
            }
        }

        /* JADX INFO: renamed from: n */
        public void m780n() {
            try {
                zy zyVarTake = this.f1283k.take();
                try {
                    zyVarTake.f1288q = zyVarTake.f1286k.f1279k.inflate(zyVarTake.f47012zy, zyVarTake.f47011toq, false);
                } catch (RuntimeException e2) {
                    Log.w(C0238k.f1278n, "Failed to inflate resource in the background! Retrying on the UI thread", e2);
                }
                Message.obtain(zyVarTake.f1286k.f47009toq, 0, zyVarTake).sendToTarget();
            } catch (InterruptedException e3) {
                Log.w(C0238k.f1278n, e3);
            }
        }

        /* JADX INFO: renamed from: q */
        public void m781q(zy zyVar) {
            zyVar.f1287n = null;
            zyVar.f1286k = null;
            zyVar.f47011toq = null;
            zyVar.f47012zy = 0;
            zyVar.f1288q = null;
            this.f1284q.toq(zyVar);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                m780n();
            }
        }

        public zy zy() {
            zy zyVarMo2983k = this.f1284q.mo2983k();
            return zyVarMo2983k == null ? new zy() : zyVarMo2983k;
        }
    }

    /* JADX INFO: renamed from: androidx.asynclayoutinflater.view.k$toq */
    /* JADX INFO: compiled from: AsyncLayoutInflater.java */
    private static class toq extends LayoutInflater {

        /* JADX INFO: renamed from: k */
        private static final String[] f1285k = {"android.widget.", "android.webkit.", "android.app."};

        toq(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new toq(context);
        }

        @Override // android.view.LayoutInflater
        protected View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View viewCreateView;
            for (String str2 : f1285k) {
                try {
                    viewCreateView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (viewCreateView != null) {
                    return viewCreateView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* JADX INFO: renamed from: androidx.asynclayoutinflater.view.k$zy */
    /* JADX INFO: compiled from: AsyncLayoutInflater.java */
    private static class zy {

        /* JADX INFO: renamed from: k */
        C0238k f1286k;

        /* JADX INFO: renamed from: n */
        n f1287n;

        /* JADX INFO: renamed from: q */
        View f1288q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        ViewGroup f47011toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f47012zy;

        zy() {
        }
    }

    public C0238k(@lvui Context context) {
        this.f1279k = new toq(context);
    }

    @ek5k
    /* JADX INFO: renamed from: k */
    public void m777k(@gvn7 int i2, @dd ViewGroup viewGroup, @lvui n nVar) {
        if (nVar == null) {
            throw new NullPointerException("callback argument may not be null!");
        }
        zy zyVarZy = this.f47010zy.zy();
        zyVarZy.f1286k = this;
        zyVarZy.f47012zy = i2;
        zyVarZy.f47011toq = viewGroup;
        zyVarZy.f1287n = nVar;
        this.f47010zy.m779k(zyVarZy);
    }
}

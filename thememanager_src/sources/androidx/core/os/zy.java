package androidx.core.os;

import android.os.CancellationSignal;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;

/* JADX INFO: compiled from: CancellationSignal.java */
/* JADX INFO: loaded from: classes.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    private boolean f3720k;

    /* JADX INFO: renamed from: q */
    private boolean f3721q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private toq f50550toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Object f50551zy;

    /* JADX INFO: renamed from: androidx.core.os.zy$k */
    /* JADX INFO: compiled from: CancellationSignal.java */
    @hyr(16)
    static class C0595k {
        private C0595k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m2783k(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        @InterfaceC7830i
        static CancellationSignal toq() {
            return new CancellationSignal();
        }
    }

    /* JADX INFO: compiled from: CancellationSignal.java */
    public interface toq {
        void onCancel();
    }

    /* JADX INFO: renamed from: g */
    private void m2779g() {
        while (this.f3721q) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2780k() {
        synchronized (this) {
            if (this.f3720k) {
                return;
            }
            this.f3720k = true;
            this.f3721q = true;
            toq toqVar = this.f50550toq;
            Object obj = this.f50551zy;
            if (toqVar != null) {
                try {
                    toqVar.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f3721q = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                C0595k.m2783k(obj);
            }
            synchronized (this) {
                this.f3721q = false;
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2781n() {
        if (zy()) {
            throw new cdj();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2782q(@dd toq toqVar) {
        synchronized (this) {
            m2779g();
            if (this.f50550toq == toqVar) {
                return;
            }
            this.f50550toq = toqVar;
            if (this.f3720k && toqVar != null) {
                toqVar.onCancel();
            }
        }
    }

    @dd
    public Object toq() {
        Object obj;
        synchronized (this) {
            if (this.f50551zy == null) {
                CancellationSignal qVar = C0595k.toq();
                this.f50551zy = qVar;
                if (this.f3720k) {
                    C0595k.m2783k(qVar);
                }
            }
            obj = this.f50551zy;
        }
        return obj;
    }

    public boolean zy() {
        boolean z2;
        synchronized (this) {
            z2 = this.f3720k;
        }
        return z2;
    }
}

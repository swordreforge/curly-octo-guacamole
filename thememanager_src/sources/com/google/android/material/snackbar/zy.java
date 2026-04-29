package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: SnackbarManager.java */
/* JADX INFO: loaded from: classes2.dex */
class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f67902f7l8 = 2750;

    /* JADX INFO: renamed from: g */
    private static final int f25118g = 1500;

    /* JADX INFO: renamed from: n */
    static final int f25119n = 0;

    /* JADX INFO: renamed from: y */
    private static zy f25120y;

    /* JADX INFO: renamed from: q */
    @dd
    private C7977zy f25122q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private C7977zy f67904zy;

    /* JADX INFO: renamed from: k */
    @lvui
    private final Object f25121k = new Object();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final Handler f67903toq = new Handler(Looper.getMainLooper(), new C4135k());

    /* JADX INFO: renamed from: com.google.android.material.snackbar.zy$k */
    /* JADX INFO: compiled from: SnackbarManager.java */
    class C4135k implements Handler.Callback {
        C4135k() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@lvui Message message) {
            if (message.what != 0) {
                return false;
            }
            zy.this.m14956q((C7977zy) message.obj);
            return true;
        }
    }

    /* JADX INFO: compiled from: SnackbarManager.java */
    interface toq {
        /* JADX INFO: renamed from: g */
        void mo14940g();

        /* JADX INFO: renamed from: k */
        void mo14941k(int i2);
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SnackbarManager.java */
    private static class C7977zy {

        /* JADX INFO: renamed from: k */
        @lvui
        final WeakReference<toq> f25124k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f67905toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f67906zy;

        C7977zy(int i2, toq toqVar) {
            this.f25124k = new WeakReference<>(toqVar);
            this.f67905toq = i2;
        }

        /* JADX INFO: renamed from: k */
        boolean m14958k(@dd toq toqVar) {
            return toqVar != null && this.f25124k.get() == toqVar;
        }
    }

    private zy() {
    }

    private boolean f7l8(toq toqVar) {
        C7977zy c7977zy = this.f67904zy;
        return c7977zy != null && c7977zy.m14958k(toqVar);
    }

    /* JADX INFO: renamed from: k */
    private boolean m14951k(@lvui C7977zy c7977zy, int i2) {
        toq toqVar = c7977zy.f25124k.get();
        if (toqVar == null) {
            return false;
        }
        this.f67903toq.removeCallbacksAndMessages(c7977zy);
        toqVar.mo14941k(i2);
        return true;
    }

    private void kja0() {
        C7977zy c7977zy = this.f25122q;
        if (c7977zy != null) {
            this.f67904zy = c7977zy;
            this.f25122q = null;
            toq toqVar = c7977zy.f25124k.get();
            if (toqVar != null) {
                toqVar.mo14940g();
            } else {
                this.f67904zy = null;
            }
        }
    }

    private void qrj(@lvui C7977zy c7977zy) {
        int i2 = c7977zy.f67905toq;
        if (i2 == -2) {
            return;
        }
        if (i2 <= 0) {
            i2 = i2 == -1 ? f25118g : f67902f7l8;
        }
        this.f67903toq.removeCallbacksAndMessages(c7977zy);
        Handler handler = this.f67903toq;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c7977zy), i2);
    }

    /* JADX INFO: renamed from: y */
    private boolean m14952y(toq toqVar) {
        C7977zy c7977zy = this.f25122q;
        return c7977zy != null && c7977zy.m14958k(toqVar);
    }

    static zy zy() {
        if (f25120y == null) {
            f25120y = new zy();
        }
        return f25120y;
    }

    /* JADX INFO: renamed from: g */
    public boolean m14953g(toq toqVar) {
        boolean z2;
        synchronized (this.f25121k) {
            z2 = f7l8(toqVar) || m14952y(toqVar);
        }
        return z2;
    }

    public void ld6(toq toqVar) {
        synchronized (this.f25121k) {
            if (f7l8(toqVar)) {
                C7977zy c7977zy = this.f67904zy;
                if (!c7977zy.f67906zy) {
                    c7977zy.f67906zy = true;
                    this.f67903toq.removeCallbacksAndMessages(c7977zy);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m14954n(toq toqVar) {
        boolean zF7l8;
        synchronized (this.f25121k) {
            zF7l8 = f7l8(toqVar);
        }
        return zF7l8;
    }

    public void n7h(int i2, toq toqVar) {
        synchronized (this.f25121k) {
            if (f7l8(toqVar)) {
                C7977zy c7977zy = this.f67904zy;
                c7977zy.f67905toq = i2;
                this.f67903toq.removeCallbacksAndMessages(c7977zy);
                qrj(this.f67904zy);
                return;
            }
            if (m14952y(toqVar)) {
                this.f25122q.f67905toq = i2;
            } else {
                this.f25122q = new C7977zy(i2, toqVar);
            }
            C7977zy c7977zy2 = this.f67904zy;
            if (c7977zy2 == null || !m14951k(c7977zy2, 4)) {
                this.f67904zy = null;
                kja0();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m14955p(toq toqVar) {
        synchronized (this.f25121k) {
            if (f7l8(toqVar)) {
                qrj(this.f67904zy);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    void m14956q(@lvui C7977zy c7977zy) {
        synchronized (this.f25121k) {
            if (this.f67904zy == c7977zy || this.f25122q == c7977zy) {
                m14951k(c7977zy, 2);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m14957s(toq toqVar) {
        synchronized (this.f25121k) {
            if (f7l8(toqVar)) {
                this.f67904zy = null;
                if (this.f25122q != null) {
                    kja0();
                }
            }
        }
    }

    public void toq(toq toqVar, int i2) {
        synchronized (this.f25121k) {
            if (f7l8(toqVar)) {
                m14951k(this.f67904zy, i2);
            } else if (m14952y(toqVar)) {
                m14951k(this.f25122q, i2);
            }
        }
    }

    public void x2(toq toqVar) {
        synchronized (this.f25121k) {
            if (f7l8(toqVar)) {
                C7977zy c7977zy = this.f67904zy;
                if (c7977zy.f67906zy) {
                    c7977zy.f67906zy = false;
                    qrj(c7977zy);
                }
            }
        }
    }
}

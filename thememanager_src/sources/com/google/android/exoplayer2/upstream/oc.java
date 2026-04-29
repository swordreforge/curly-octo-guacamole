package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: Loader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class oc implements eqxt {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f66890f7l8 = 2;

    /* JADX INFO: renamed from: g */
    private static final int f23051g = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final zy f66891ld6;

    /* JADX INFO: renamed from: n */
    private static final int f23052n = 0;

    /* JADX INFO: renamed from: p */
    public static final zy f23053p;

    /* JADX INFO: renamed from: q */
    private static final String f23054q = "ExoPlayer:Loader:";

    /* JADX INFO: renamed from: s */
    public static final zy f23055s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final zy f66892x2;

    /* JADX INFO: renamed from: y */
    private static final int f23056y = 3;

    /* JADX INFO: renamed from: k */
    private final ExecutorService f23057k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private HandlerC3815q<? extends InterfaceC3814n> f66893toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    private IOException f66894zy;

    /* JADX INFO: compiled from: Loader.java */
    private static final class f7l8 implements Runnable {

        /* JADX INFO: renamed from: k */
        private final InterfaceC3812g f23058k;

        public f7l8(InterfaceC3812g interfaceC3812g) {
            this.f23058k = interfaceC3812g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23058k.ki();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.oc$g */
    /* JADX INFO: compiled from: Loader.java */
    public interface InterfaceC3812g {
        void ki();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.oc$n */
    /* JADX INFO: compiled from: Loader.java */
    public interface InterfaceC3814n {
        /* JADX INFO: renamed from: k */
        void mo12654k() throws IOException;

        void zy();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.oc$q */
    /* JADX INFO: compiled from: Loader.java */
    @SuppressLint({"HandlerLeak"})
    private final class HandlerC3815q<T extends InterfaceC3814n> extends Handler implements Runnable {

        /* JADX INFO: renamed from: c */
        private static final int f23059c = 3;

        /* JADX INFO: renamed from: f */
        private static final int f23060f = 2;

        /* JADX INFO: renamed from: l */
        private static final int f23061l = 1;

        /* JADX INFO: renamed from: r */
        private static final int f23062r = 0;

        /* JADX INFO: renamed from: t */
        private static final String f23063t = "LoadTask";

        /* JADX INFO: renamed from: g */
        @zy.dd
        private toq<T> f23064g;

        /* JADX INFO: renamed from: h */
        private boolean f23065h;

        /* JADX INFO: renamed from: i */
        private volatile boolean f23066i;

        /* JADX INFO: renamed from: k */
        public final int f23067k;

        /* JADX INFO: renamed from: n */
        private final long f23068n;

        /* JADX INFO: renamed from: p */
        @zy.dd
        private Thread f23069p;

        /* JADX INFO: renamed from: q */
        private final T f23070q;

        /* JADX INFO: renamed from: s */
        private int f23071s;

        /* JADX INFO: renamed from: y */
        @zy.dd
        private IOException f23072y;

        public HandlerC3815q(Looper looper, T t2, toq<T> toqVar, int i2, long j2) {
            super(looper);
            this.f23070q = t2;
            this.f23064g = toqVar;
            this.f23067k = i2;
            this.f23068n = j2;
        }

        /* JADX INFO: renamed from: q */
        private long m13503q() {
            return Math.min((this.f23071s - 1) * 1000, 5000);
        }

        private void toq() {
            this.f23072y = null;
            oc.this.f23057k.execute((Runnable) C3844k.f7l8(oc.this.f66893toq));
        }

        private void zy() {
            oc.this.f66893toq = null;
        }

        /* JADX INFO: renamed from: g */
        public void m13504g(long j2) {
            C3844k.m13633s(oc.this.f66893toq == null);
            oc.this.f66893toq = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
            } else {
                toq();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f23066i) {
                return;
            }
            int i2 = message.what;
            if (i2 == 0) {
                toq();
                return;
            }
            if (i2 == 3) {
                throw ((Error) message.obj);
            }
            zy();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = jElapsedRealtime - this.f23068n;
            toq toqVar = (toq) C3844k.f7l8(this.f23064g);
            if (this.f23065h) {
                toqVar.mo12670y(this.f23070q, jElapsedRealtime, j2, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                try {
                    toqVar.ld6(this.f23070q, jElapsedRealtime, j2);
                    return;
                } catch (RuntimeException e2) {
                    com.google.android.exoplayer2.util.ni7.m13700n(f23063t, "Unexpected exception handling load completed", e2);
                    oc.this.f66894zy = new C3816y(e2);
                    return;
                }
            }
            if (i3 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f23072y = iOException;
            int i4 = this.f23071s + 1;
            this.f23071s = i4;
            zy zyVarMo12667h = toqVar.mo12667h(this.f23070q, jElapsedRealtime, j2, iOException, i4);
            if (zyVarMo12667h.f23074k == 3) {
                oc.this.f66894zy = this.f23072y;
            } else if (zyVarMo12667h.f23074k != 2) {
                if (zyVarMo12667h.f23074k == 1) {
                    this.f23071s = 1;
                }
                m13504g(zyVarMo12667h.f66895toq != C3548p.f65257toq ? zyVarMo12667h.f66895toq : m13503q());
            }
        }

        /* JADX INFO: renamed from: k */
        public void m13505k(boolean z2) {
            this.f23066i = z2;
            this.f23072y = null;
            if (hasMessages(0)) {
                this.f23065h = true;
                removeMessages(0);
                if (!z2) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f23065h = true;
                    this.f23070q.zy();
                    Thread thread = this.f23069p;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z2) {
                zy();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((toq) C3844k.f7l8(this.f23064g)).mo12670y(this.f23070q, jElapsedRealtime, jElapsedRealtime - this.f23068n, true);
                this.f23064g = null;
            }
        }

        /* JADX INFO: renamed from: n */
        public void m13506n(int i2) throws IOException {
            IOException iOException = this.f23072y;
            if (iOException != null && this.f23071s > i2) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z2;
            try {
                synchronized (this) {
                    z2 = !this.f23065h;
                    this.f23069p = Thread.currentThread();
                }
                if (z2) {
                    String simpleName = this.f23070q.getClass().getSimpleName();
                    com.google.android.exoplayer2.util.n5r1.m13686k(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        this.f23070q.mo12654k();
                        com.google.android.exoplayer2.util.n5r1.zy();
                    } catch (Throwable th) {
                        com.google.android.exoplayer2.util.n5r1.zy();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f23069p = null;
                    Thread.interrupted();
                }
                if (this.f23066i) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e2) {
                if (this.f23066i) {
                    return;
                }
                obtainMessage(2, e2).sendToTarget();
            } catch (Error e3) {
                if (!this.f23066i) {
                    com.google.android.exoplayer2.util.ni7.m13700n(f23063t, "Unexpected error loading stream", e3);
                    obtainMessage(3, e3).sendToTarget();
                }
                throw e3;
            } catch (Exception e4) {
                if (this.f23066i) {
                    return;
                }
                com.google.android.exoplayer2.util.ni7.m13700n(f23063t, "Unexpected exception loading stream", e4);
                obtainMessage(2, new C3816y(e4)).sendToTarget();
            } catch (OutOfMemoryError e6) {
                if (this.f23066i) {
                    return;
                }
                com.google.android.exoplayer2.util.ni7.m13700n(f23063t, "OutOfMemory error loading stream", e6);
                obtainMessage(2, new C3816y(e6)).sendToTarget();
            }
        }
    }

    /* JADX INFO: compiled from: Loader.java */
    public interface toq<T extends InterfaceC3814n> {
        /* JADX INFO: renamed from: h */
        zy mo12667h(T t2, long j2, long j3, IOException iOException, int i2);

        void ld6(T t2, long j2, long j3);

        /* JADX INFO: renamed from: y */
        void mo12670y(T t2, long j2, long j3, boolean z2);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.oc$y */
    /* JADX INFO: compiled from: Loader.java */
    public static final class C3816y extends IOException {
        public C3816y(Throwable th) {
            String simpleName = th.getClass().getSimpleName();
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(simpleName.length() + 13 + String.valueOf(message).length());
            sb.append("Unexpected ");
            sb.append(simpleName);
            sb.append(": ");
            sb.append(message);
            super(sb.toString(), th);
        }
    }

    /* JADX INFO: compiled from: Loader.java */
    public static final class zy {

        /* JADX INFO: renamed from: k */
        private final int f23074k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final long f66895toq;

        public boolean zy() {
            int i2 = this.f23074k;
            return i2 == 0 || i2 == 1;
        }

        private zy(int i2, long j2) {
            this.f23074k = i2;
            this.f66895toq = j2;
        }
    }

    static {
        long j2 = C3548p.f65257toq;
        f23055s = m13500s(false, C3548p.f65257toq);
        f23053p = m13500s(true, C3548p.f65257toq);
        f66891ld6 = new zy(2, j2);
        f66892x2 = new zy(3, j2);
    }

    public oc(String str) {
        String strValueOf = String.valueOf(str);
        this.f23057k = com.google.android.exoplayer2.util.lrht.etdu(strValueOf.length() != 0 ? f23054q.concat(strValueOf) : new String(f23054q));
    }

    /* JADX INFO: renamed from: s */
    public static zy m13500s(boolean z2, long j2) {
        return new zy(z2 ? 1 : 0, j2);
    }

    public void f7l8() {
        ((HandlerC3815q) C3844k.ld6(this.f66893toq)).m13505k(false);
    }

    @Override // com.google.android.exoplayer2.upstream.eqxt
    /* JADX INFO: renamed from: k */
    public void mo13460k(int i2) throws IOException {
        IOException iOException = this.f66894zy;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC3815q<? extends InterfaceC3814n> handlerC3815q = this.f66893toq;
        if (handlerC3815q != null) {
            if (i2 == Integer.MIN_VALUE) {
                i2 = handlerC3815q.f23067k;
            }
            handlerC3815q.m13506n(i2);
        }
    }

    public boolean ld6() {
        return this.f66893toq != null;
    }

    public <T extends InterfaceC3814n> long n7h(T t2, toq<T> toqVar, int i2) {
        Looper looper = (Looper) C3844k.ld6(Looper.myLooper());
        this.f66894zy = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC3815q(looper, t2, toqVar, i2, jElapsedRealtime).m13504g(0L);
        return jElapsedRealtime;
    }

    /* JADX INFO: renamed from: p */
    public boolean m13501p() {
        return this.f66894zy != null;
    }

    public void qrj(@zy.dd InterfaceC3812g interfaceC3812g) {
        HandlerC3815q<? extends InterfaceC3814n> handlerC3815q = this.f66893toq;
        if (handlerC3815q != null) {
            handlerC3815q.m13505k(true);
        }
        if (interfaceC3812g != null) {
            this.f23057k.execute(new f7l8(interfaceC3812g));
        }
        this.f23057k.shutdown();
    }

    @Override // com.google.android.exoplayer2.upstream.eqxt
    public void toq() throws IOException {
        mo13460k(Integer.MIN_VALUE);
    }

    public void x2() {
        qrj(null);
    }

    /* JADX INFO: renamed from: y */
    public void m13502y() {
        this.f66894zy = null;
    }
}

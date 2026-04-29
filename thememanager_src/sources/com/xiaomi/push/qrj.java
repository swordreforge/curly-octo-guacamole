package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class qrj {

    /* JADX INFO: renamed from: g */
    private volatile toq f33570g;

    /* JADX INFO: renamed from: k */
    private C5891k f33571k;

    /* JADX INFO: renamed from: n */
    private int f33572n;

    /* JADX INFO: renamed from: q */
    private final boolean f33573q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Handler f73538toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private volatile boolean f73539zy;

    /* JADX INFO: renamed from: com.xiaomi.push.qrj$k */
    private class C5891k extends Thread {

        /* JADX INFO: renamed from: k */
        private final LinkedBlockingQueue<toq> f33574k;

        public C5891k() {
            super("PackageProcessor");
            this.f33574k = new LinkedBlockingQueue<>();
        }

        /* JADX INFO: renamed from: k */
        private void m21407k(int i2, toq toqVar) {
            try {
                qrj.this.f73538toq.sendMessage(qrj.this.f73538toq.obtainMessage(i2, toqVar));
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long j2 = qrj.this.f33572n > 0 ? qrj.this.f33572n : Long.MAX_VALUE;
            while (!qrj.this.f73539zy) {
                try {
                    toq toqVarPoll = this.f33574k.poll(j2, TimeUnit.SECONDS);
                    qrj.this.f33570g = toqVarPoll;
                    if (toqVarPoll != null) {
                        m21407k(0, toqVarPoll);
                        toqVarPoll.toq();
                        m21407k(1, toqVarPoll);
                    } else if (qrj.this.f33572n > 0) {
                        qrj.this.m21403q();
                    }
                } catch (InterruptedException e2) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
                }
            }
        }

        public void toq(toq toqVar) {
            try {
                this.f33574k.add(toqVar);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static abstract class toq {
        /* JADX INFO: renamed from: k */
        public void m21408k() {
        }

        public abstract void toq();

        public void zy() {
        }
    }

    public qrj() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public synchronized void m21403q() {
        this.f33571k = null;
        this.f73539zy = true;
    }

    /* JADX INFO: renamed from: g */
    public void m21405g(toq toqVar, long j2) {
        this.f73538toq.postDelayed(new kja0(this, toqVar), j2);
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m21406n(toq toqVar) {
        if (this.f33571k == null) {
            C5891k c5891k = new C5891k();
            this.f33571k = c5891k;
            c5891k.setDaemon(this.f33573q);
            this.f73539zy = false;
            this.f33571k.start();
        }
        this.f33571k.toq(toqVar);
    }

    public qrj(boolean z2) {
        this(z2, 0);
    }

    public qrj(boolean z2, int i2) {
        this.f73538toq = null;
        this.f73539zy = false;
        this.f33572n = 0;
        this.f73538toq = new n7h(this, Looper.getMainLooper());
        this.f33573q = z2;
        this.f33572n = i2;
    }
}

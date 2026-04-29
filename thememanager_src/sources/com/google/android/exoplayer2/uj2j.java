package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.InterfaceC3850n;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PlayerMessage.java */
/* JADX INFO: loaded from: classes2.dex */
public final class uj2j {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Looper f66746f7l8;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private Object f22872g;

    /* JADX INFO: renamed from: k */
    private final toq f22873k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f66747ld6;

    /* JADX INFO: renamed from: n */
    private int f22874n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f66748n7h;

    /* JADX INFO: renamed from: q */
    private final pc f22876q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f66749qrj;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC3769k f66750toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f66751x2;

    /* JADX INFO: renamed from: y */
    private int f22878y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final InterfaceC3850n f66752zy;

    /* JADX INFO: renamed from: s */
    private long f22877s = C3548p.f65257toq;

    /* JADX INFO: renamed from: p */
    private boolean f22875p = true;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.uj2j$k */
    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface InterfaceC3769k {
        void zy(uj2j uj2jVar);
    }

    /* JADX INFO: compiled from: PlayerMessage.java */
    public interface toq {
        void x2(int i2, @zy.dd Object obj) throws ki;
    }

    public uj2j(InterfaceC3769k interfaceC3769k, toq toqVar, pc pcVar, int i2, InterfaceC3850n interfaceC3850n, Looper looper) {
        this.f66750toq = interfaceC3769k;
        this.f22873k = toqVar;
        this.f22876q = pcVar;
        this.f66746f7l8 = looper;
        this.f66752zy = interfaceC3850n;
        this.f22878y = i2;
    }

    public uj2j cdj(Looper looper) {
        C3844k.m13633s(!this.f66747ld6);
        this.f66746f7l8 = looper;
        return this;
    }

    @zy.dd
    public Object f7l8() {
        return this.f22872g;
    }

    public uj2j fn3e(int i2) {
        C3844k.m13633s(!this.f66747ld6);
        this.f22874n = i2;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public int m13348g() {
        return this.f22878y;
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public uj2j m13349h(Handler handler) {
        return cdj(handler.getLooper());
    }

    /* JADX INFO: renamed from: i */
    public uj2j m13350i(long j2) {
        C3844k.m13633s(!this.f66747ld6);
        this.f22877s = j2;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public synchronized boolean m13351k() throws InterruptedException {
        C3844k.m13633s(this.f66747ld6);
        C3844k.m13633s(this.f66746f7l8.getThread() != Thread.currentThread());
        while (!this.f66749qrj) {
            wait();
        }
        return this.f66751x2;
    }

    public uj2j ki(@zy.dd Object obj) {
        C3844k.m13633s(!this.f66747ld6);
        this.f22872g = obj;
        return this;
    }

    public uj2j kja0(boolean z2) {
        C3844k.m13633s(!this.f66747ld6);
        this.f22875p = z2;
        return this;
    }

    public int ld6() {
        return this.f22874n;
    }

    /* JADX INFO: renamed from: n */
    public Looper m13352n() {
        return this.f66746f7l8;
    }

    public uj2j n7h() {
        C3844k.m13633s(!this.f66747ld6);
        if (this.f22877s == C3548p.f65257toq) {
            C3844k.m13629k(this.f22875p);
        }
        this.f66747ld6 = true;
        this.f66750toq.zy(this);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public pc m13353p() {
        return this.f22876q;
    }

    /* JADX INFO: renamed from: q */
    public boolean m13354q() {
        return this.f22875p;
    }

    public synchronized void qrj(boolean z2) {
        this.f66751x2 = z2 | this.f66751x2;
        this.f66749qrj = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: s */
    public toq m13355s() {
        return this.f22873k;
    }

    public uj2j t8r(int i2, long j2) {
        C3844k.m13633s(!this.f66747ld6);
        C3844k.m13629k(j2 != C3548p.f65257toq);
        if (i2 < 0 || (!this.f22876q.ni7() && i2 >= this.f22876q.zurt())) {
            throw new vq(this.f22876q, i2, j2);
        }
        this.f22878y = i2;
        this.f22877s = j2;
        return this;
    }

    public synchronized boolean toq(long j2) throws InterruptedException, TimeoutException {
        boolean z2;
        C3844k.m13633s(this.f66747ld6);
        C3844k.m13633s(this.f66746f7l8.getThread() != Thread.currentThread());
        long jMo13575q = this.f66752zy.mo13575q() + j2;
        while (true) {
            z2 = this.f66749qrj;
            if (z2 || j2 <= 0) {
                break;
            }
            this.f66752zy.mo13574n();
            wait(j2);
            j2 = jMo13575q - this.f66752zy.mo13575q();
        }
        if (!z2) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f66751x2;
    }

    public synchronized boolean x2() {
        return this.f66748n7h;
    }

    /* JADX INFO: renamed from: y */
    public long m13356y() {
        return this.f22877s;
    }

    public synchronized uj2j zy() {
        C3844k.m13633s(this.f66747ld6);
        this.f66748n7h = true;
        qrj(false);
        return this;
    }
}

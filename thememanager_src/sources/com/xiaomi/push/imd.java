package com.xiaomi.push;

import android.os.SystemClock;
import android.util.Pair;
import com.miui.maml.ActionCommand;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.eqxt;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class imd {

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final AtomicInteger f73366ki = new AtomicInteger(0);

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static boolean f73367t8r;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    protected XMPushService f73370kja0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    protected bqie f73372n7h;

    /* JADX INFO: renamed from: k */
    protected int f33026k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected long f73374toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected volatile long f73376zy = 0;

    /* JADX INFO: renamed from: q */
    protected volatile long f33029q = 0;

    /* JADX INFO: renamed from: n */
    private LinkedList<Pair<Integer, Long>> f33027n = new LinkedList<>();

    /* JADX INFO: renamed from: g */
    private final Collection<tww7> f33024g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected final Map<kbj, C5870k> f73369f7l8 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: y */
    protected final Map<kbj, C5870k> f33031y = new ConcurrentHashMap();

    /* JADX INFO: renamed from: s */
    protected exv8 f33030s = null;

    /* JADX INFO: renamed from: p */
    protected String f33028p = "";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected String f73371ld6 = "";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f73375x2 = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    protected final int f73373qrj = f73366ki.getAndIncrement();

    /* JADX INFO: renamed from: h */
    private long f33025h = 0;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    protected long f73368cdj = 0;

    /* JADX INFO: renamed from: com.xiaomi.push.imd$k */
    public static class C5870k {

        /* JADX INFO: renamed from: k */
        private kbj f33032k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private qh4d f73377toq;

        public C5870k(kbj kbjVar, qh4d qh4dVar) {
            this.f33032k = kbjVar;
            this.f73377toq = qh4dVar;
        }

        /* JADX INFO: renamed from: k */
        public void m20989k(o5 o5Var) {
            this.f33032k.toq(o5Var);
        }

        public void toq(xtb7 xtb7Var) {
            qh4d qh4dVar = this.f73377toq;
            if (qh4dVar == null || qh4dVar.mo20973k(xtb7Var)) {
                this.f33032k.mo20972k(xtb7Var);
            }
        }
    }

    static {
        f73367t8r = false;
        try {
            f73367t8r = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        gb.zy();
    }

    protected imd(XMPushService xMPushService, bqie bqieVar) {
        this.f73372n7h = bqieVar;
        this.f73370kja0 = xMPushService;
        fn3e();
    }

    private void f7l8(int i2) {
        synchronized (this.f33027n) {
            if (i2 == 1) {
                this.f33027n.clear();
            } else {
                this.f33027n.add(new Pair<>(Integer.valueOf(i2), Long.valueOf(System.currentTimeMillis())));
                if (this.f33027n.size() > 6) {
                    this.f33027n.remove(0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private String m20980n(int i2) {
        return i2 == 1 ? ActionCommand.USB_CONNECTED : i2 == 0 ? "connecting" : i2 == 2 ? "disconnected" : "unknown";
    }

    public void a9() {
        synchronized (this.f33027n) {
            this.f33027n.clear();
        }
    }

    public boolean cdj() {
        return false;
    }

    protected void fn3e() {
        String property;
        if (this.f73372n7h.m20662s() && this.f33030s == null) {
            Class<?> cls = null;
            try {
                property = System.getProperty("smack.debuggerClass");
            } catch (Throwable unused) {
                property = null;
            }
            if (property != null) {
                try {
                    cls = Class.forName(property);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (cls == null) {
                this.f33030s = new wt(this);
                return;
            }
            try {
                this.f33030s = (exv8) cls.getConstructor(imd.class, Writer.class, Reader.class).newInstance(this);
            } catch (Exception e3) {
                throw new IllegalArgumentException("Can't initialize the configured debugger!", e3);
            }
        }
    }

    public void fu4(tww7 tww7Var) {
        this.f33024g.remove(tww7Var);
    }

    /* JADX INFO: renamed from: g */
    protected Map<kbj, C5870k> m20981g() {
        return this.f73369f7l8;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo20664h(o5[] o5VarArr);

    /* JADX INFO: renamed from: i */
    public String m20982i() {
        return this.f73372n7h.n7h();
    }

    public boolean jk() {
        return this.f73375x2 == 1;
    }

    /* JADX INFO: renamed from: k */
    public int m20983k() {
        return this.f33026k;
    }

    public synchronized boolean ki(long j2) {
        return this.f33025h >= j2;
    }

    public abstract void kja0(String str, String str2);

    public void ld6(kbj kbjVar, qh4d qh4dVar) {
        if (kbjVar == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.f73369f7l8.put(kbjVar, new C5870k(kbjVar, qh4dVar));
    }

    public synchronized void mcp() {
        this.f33025h = SystemClock.elapsedRealtime();
    }

    public synchronized void n7h(String str) {
        if (this.f73375x2 == 0) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("setChallenge hash = " + C5874l.toq(str).substring(0, 8));
            this.f33028p = str;
            m20987y(1, 0, null);
        } else {
            com.xiaomi.channel.commonutils.logger.zy.kja0("ignore setChallenge because connection was disconnected");
        }
    }

    public abstract void ni7(o5 o5Var);

    public void o1t(kbj kbjVar, qh4d qh4dVar) {
        if (kbjVar == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.f33031y.put(kbjVar, new C5870k(kbjVar, qh4dVar));
    }

    /* JADX INFO: renamed from: p */
    public void m20984p(kbj kbjVar) {
        this.f73369f7l8.remove(kbjVar);
    }

    /* JADX INFO: renamed from: q */
    public String mo20666q() {
        return this.f73372n7h.cdj();
    }

    public abstract void qrj(eqxt.toq toqVar);

    /* JADX INFO: renamed from: s */
    public void m20985s(tww7 tww7Var) {
        if (tww7Var == null || this.f33024g.contains(tww7Var)) {
            return;
        }
        this.f33024g.add(tww7Var);
    }

    /* JADX INFO: renamed from: t */
    public boolean m20986t() {
        return this.f73375x2 == 0;
    }

    public int t8r() {
        return this.f73375x2;
    }

    public long toq() {
        return this.f33029q;
    }

    public abstract void wvg(boolean z2);

    public abstract void x2(xtb7 xtb7Var);

    /* JADX INFO: renamed from: y */
    public void m20987y(int i2, int i3, Exception exc) {
        int i4 = this.f73375x2;
        if (i2 != i4) {
            com.xiaomi.channel.commonutils.logger.zy.kja0(String.format("update the connection status. %1$s -> %2$s : %3$s ", m20980n(i4), m20980n(i2), com.xiaomi.push.service.dd.m21576k(i3)));
        }
        if (oc.zurt(this.f73370kja0)) {
            f7l8(i2);
        }
        if (i2 == 1) {
            this.f73370kja0.m21526a(10);
            if (this.f73375x2 != 0) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("try set connected while not connecting.");
            }
            this.f73375x2 = i2;
            Iterator<tww7> it = this.f33024g.iterator();
            while (it.hasNext()) {
                it.next().mo20692b(this);
            }
            return;
        }
        if (i2 == 0) {
            if (this.f73375x2 != 2) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("try set connecting while not disconnected.");
            }
            this.f73375x2 = i2;
            Iterator<tww7> it2 = this.f33024g.iterator();
            while (it2.hasNext()) {
                it2.next().mo20689a(this);
            }
            return;
        }
        if (i2 == 2) {
            this.f73370kja0.m21526a(10);
            int i5 = this.f73375x2;
            if (i5 == 0) {
                Iterator<tww7> it3 = this.f33024g.iterator();
                while (it3.hasNext()) {
                    it3.next().mo20691a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i5 == 1) {
                Iterator<tww7> it4 = this.f33024g.iterator();
                while (it4.hasNext()) {
                    it4.next().mo20690a(this, i3, exc);
                }
            }
            this.f73375x2 = i2;
        }
    }

    /* JADX INFO: renamed from: z */
    public void m20988z(kbj kbjVar) {
        this.f33031y.remove(kbjVar);
    }

    public abstract void zurt(int i2, Exception exc);

    public bqie zy() {
        return this.f73372n7h;
    }
}

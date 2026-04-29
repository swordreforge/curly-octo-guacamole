package kotlin.concurrent;

import cyoe.x2;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.nn86;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Timer.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "TimersKt")
public final class zy {

    /* JADX INFO: renamed from: kotlin.concurrent.zy$k */
    /* JADX INFO: compiled from: Timer.kt */
    @lv5({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    public static final class C6194k extends TimerTask {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ x2<TimerTask, was> f36248k;

        /* JADX WARN: Multi-variable type inference failed */
        public C6194k(x2<? super TimerTask, was> x2Var) {
            this.f36248k = x2Var;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f36248k.invoke(this);
        }
    }

    @InterfaceC6234g
    private static final TimerTask f7l8(Timer timer, Date time, long j2, x2<? super TimerTask, was> action) {
        d2ok.m23075h(timer, "<this>");
        d2ok.m23075h(time, "time");
        d2ok.m23075h(action, "action");
        C6194k c6194k = new C6194k(action);
        timer.schedule(c6194k, time, j2);
        return c6194k;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: g */
    private static final TimerTask m22726g(Timer timer, long j2, x2<? super TimerTask, was> action) {
        d2ok.m23075h(timer, "<this>");
        d2ok.m23075h(action, "action");
        C6194k c6194k = new C6194k(action);
        timer.schedule(c6194k, j2);
        return c6194k;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: h */
    private static final TimerTask m22727h(x2<? super TimerTask, was> action) {
        d2ok.m23075h(action, "action");
        return new C6194k(action);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: k */
    private static final Timer m22728k(String str, boolean z2, long j2, long j3, x2<? super TimerTask, was> action) {
        d2ok.m23075h(action, "action");
        Timer timerLd6 = ld6(str, z2);
        timerLd6.scheduleAtFixedRate(new C6194k(action), j2, j3);
        return timerLd6;
    }

    static /* synthetic */ Timer kja0(String str, boolean z2, Date startAt, long j2, x2 action, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        d2ok.m23075h(startAt, "startAt");
        d2ok.m23075h(action, "action");
        Timer timerLd6 = ld6(str, z2);
        timerLd6.schedule(new C6194k(action), startAt, j2);
        return timerLd6;
    }

    @nn86
    @InterfaceC7396q
    public static final Timer ld6(@InterfaceC7395n String str, boolean z2) {
        return str == null ? new Timer(z2) : new Timer(str, z2);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: n */
    private static final TimerTask m22729n(Timer timer, long j2, long j3, x2<? super TimerTask, was> action) {
        d2ok.m23075h(timer, "<this>");
        d2ok.m23075h(action, "action");
        C6194k c6194k = new C6194k(action);
        timer.schedule(c6194k, j2, j3);
        return c6194k;
    }

    static /* synthetic */ Timer n7h(String str, boolean z2, long j2, long j3, x2 action, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            j2 = 0;
        }
        d2ok.m23075h(action, "action");
        Timer timerLd6 = ld6(str, z2);
        timerLd6.schedule(new C6194k(action), j2, j3);
        return timerLd6;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: p */
    private static final TimerTask m22730p(Timer timer, Date time, long j2, x2<? super TimerTask, was> action) {
        d2ok.m23075h(timer, "<this>");
        d2ok.m23075h(time, "time");
        d2ok.m23075h(action, "action");
        C6194k c6194k = new C6194k(action);
        timer.scheduleAtFixedRate(c6194k, time, j2);
        return c6194k;
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ Timer m22731q(String str, boolean z2, Date startAt, long j2, x2 action, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        d2ok.m23075h(startAt, "startAt");
        d2ok.m23075h(action, "action");
        Timer timerLd6 = ld6(str, z2);
        timerLd6.scheduleAtFixedRate(new C6194k(action), startAt, j2);
        return timerLd6;
    }

    @InterfaceC6234g
    private static final Timer qrj(String str, boolean z2, Date startAt, long j2, x2<? super TimerTask, was> action) {
        d2ok.m23075h(startAt, "startAt");
        d2ok.m23075h(action, "action");
        Timer timerLd6 = ld6(str, z2);
        timerLd6.schedule(new C6194k(action), startAt, j2);
        return timerLd6;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: s */
    private static final TimerTask m22732s(Timer timer, long j2, long j3, x2<? super TimerTask, was> action) {
        d2ok.m23075h(timer, "<this>");
        d2ok.m23075h(action, "action");
        C6194k c6194k = new C6194k(action);
        timer.scheduleAtFixedRate(c6194k, j2, j3);
        return c6194k;
    }

    @InterfaceC6234g
    private static final Timer toq(String str, boolean z2, Date startAt, long j2, x2<? super TimerTask, was> action) {
        d2ok.m23075h(startAt, "startAt");
        d2ok.m23075h(action, "action");
        Timer timerLd6 = ld6(str, z2);
        timerLd6.scheduleAtFixedRate(new C6194k(action), startAt, j2);
        return timerLd6;
    }

    @InterfaceC6234g
    private static final Timer x2(String str, boolean z2, long j2, long j3, x2<? super TimerTask, was> action) {
        d2ok.m23075h(action, "action");
        Timer timerLd6 = ld6(str, z2);
        timerLd6.schedule(new C6194k(action), j2, j3);
        return timerLd6;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: y */
    private static final TimerTask m22733y(Timer timer, Date time, x2<? super TimerTask, was> action) {
        d2ok.m23075h(timer, "<this>");
        d2ok.m23075h(time, "time");
        d2ok.m23075h(action, "action");
        C6194k c6194k = new C6194k(action);
        timer.schedule(c6194k, time);
        return c6194k;
    }

    static /* synthetic */ Timer zy(String str, boolean z2, long j2, long j3, x2 action, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            j2 = 0;
        }
        d2ok.m23075h(action, "action");
        Timer timerLd6 = ld6(str, z2);
        timerLd6.scheduleAtFixedRate(new C6194k(action), j2, j3);
        return timerLd6;
    }
}

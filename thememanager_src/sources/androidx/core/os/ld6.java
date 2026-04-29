package androidx.core.os;

import android.os.Handler;
import cyoe.InterfaceC5981k;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Handler.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b\u001a1\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¨\u0006\f"}, d2 = {"Landroid/os/Handler;", "", "delayInMillis", "", "token", "Lkotlin/Function0;", "Lkotlin/was;", "action", "Ljava/lang/Runnable;", "zy", "uptimeMillis", "k", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class ld6 {

    /* JADX INFO: renamed from: androidx.core.os.ld6$k */
    /* JADX INFO: compiled from: Handler.kt */
    @d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/was;", "run", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class RunnableC0583k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5981k f3706k;

        public RunnableC0583k(InterfaceC5981k interfaceC5981k) {
            this.f3706k = interfaceC5981k;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3706k.invoke();
        }
    }

    /* JADX INFO: compiled from: Handler.kt */
    @d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/was;", "run", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 4, 0})
    public static final class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5981k f3707k;

        public toq(InterfaceC5981k interfaceC5981k) {
            this.f3707k = interfaceC5981k;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3707k.invoke();
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final Runnable m2735k(@InterfaceC7396q Handler postAtTime, long j2, @InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC5981k<was> action) {
        d2ok.cdj(postAtTime, "$this$postAtTime");
        d2ok.cdj(action, "action");
        RunnableC0583k runnableC0583k = new RunnableC0583k(action);
        postAtTime.postAtTime(runnableC0583k, obj, j2);
        return runnableC0583k;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Runnable m2736q(Handler postDelayed, long j2, Object obj, InterfaceC5981k action, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            obj = null;
        }
        d2ok.cdj(postDelayed, "$this$postDelayed");
        d2ok.cdj(action, "action");
        toq toqVar = new toq(action);
        if (obj == null) {
            postDelayed.postDelayed(toqVar, j2);
        } else {
            C0589s.m2754q(postDelayed, toqVar, obj, j2);
        }
        return toqVar;
    }

    public static /* synthetic */ Runnable toq(Handler postAtTime, long j2, Object obj, InterfaceC5981k action, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            obj = null;
        }
        d2ok.cdj(postAtTime, "$this$postAtTime");
        d2ok.cdj(action, "action");
        RunnableC0583k runnableC0583k = new RunnableC0583k(action);
        postAtTime.postAtTime(runnableC0583k, obj, j2);
        return runnableC0583k;
    }

    @InterfaceC7396q
    public static final Runnable zy(@InterfaceC7396q Handler postDelayed, long j2, @InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC5981k<was> action) {
        d2ok.cdj(postDelayed, "$this$postDelayed");
        d2ok.cdj(action, "action");
        toq toqVar = new toq(action);
        if (obj == null) {
            postDelayed.postDelayed(toqVar, j2);
        } else {
            C0589s.m2754q(postDelayed, toqVar, obj, j2);
        }
        return toqVar;
    }
}

package kotlin.concurrent;

import cyoe.InterfaceC5981k;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Thread.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
@InterfaceC6769y(name = "ThreadsKt")
public final class toq {

    /* JADX INFO: renamed from: kotlin.concurrent.toq$k */
    /* JADX INFO: compiled from: Thread.kt */
    public static final class C6193k extends Thread {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5981k<was> f36247k;

        C6193k(InterfaceC5981k<was> interfaceC5981k) {
            this.f36247k = interfaceC5981k;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f36247k.invoke();
        }
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: k */
    private static final <T> T m22725k(ThreadLocal<T> threadLocal, InterfaceC5981k<? extends T> interfaceC5981k) {
        d2ok.m23075h(threadLocal, "<this>");
        d2ok.m23075h(interfaceC5981k, "default");
        T t2 = threadLocal.get();
        if (t2 != null) {
            return t2;
        }
        T tInvoke = interfaceC5981k.invoke();
        threadLocal.set(tInvoke);
        return tInvoke;
    }

    @InterfaceC7396q
    public static final Thread toq(boolean z2, boolean z3, @InterfaceC7395n ClassLoader classLoader, @InterfaceC7395n String str, int i2, @InterfaceC7396q InterfaceC5981k<was> block) {
        d2ok.m23075h(block, "block");
        C6193k c6193k = new C6193k(block);
        if (z3) {
            c6193k.setDaemon(true);
        }
        if (i2 > 0) {
            c6193k.setPriority(i2);
        }
        if (str != null) {
            c6193k.setName(str);
        }
        if (classLoader != null) {
            c6193k.setContextClassLoader(classLoader);
        }
        if (z2) {
            c6193k.start();
        }
        return c6193k;
    }

    public static /* synthetic */ Thread zy(boolean z2, boolean z3, ClassLoader classLoader, String str, int i2, InterfaceC5981k interfaceC5981k, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = true;
        }
        boolean z5 = z2;
        if ((i3 & 2) != 0) {
            z3 = false;
        }
        boolean z6 = z3;
        ClassLoader classLoader2 = (i3 & 4) != 0 ? null : classLoader;
        String str2 = (i3 & 8) != 0 ? null : str;
        if ((i3 & 16) != 0) {
            i2 = -1;
        }
        return toq(z5, z6, classLoader2, str2, i2, interfaceC5981k);
    }
}

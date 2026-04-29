package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5981k;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.g */
/* JADX INFO: compiled from: Concurrent.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0000H\u0000\u001a,\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00060\u0005j\u0002`\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0080\b\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000\"\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015*\f\b\u0000\u0010\u0017\"\u00020\u00052\u00020\u0005¨\u0006\u0018"}, d2 = {C0846k.d9i, "", "Lkotlinx/coroutines/internal/SubscribersList;", "q", C0846k.zaso, "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "Lkotlin/Function0;", "action", "n", "(Ljava/util/concurrent/locks/ReentrantLock;Lcyoe/k;)Ljava/lang/Object;", "", "expectedSize", "", "toq", "Ljava/util/concurrent/Executor;", "executor", "", "zy", "Ljava/lang/reflect/Method;", "k", "Ljava/lang/reflect/Method;", "REMOVE_FUTURE_ON_CANCEL", "ReentrantLock", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6673g {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private static final Method f37215k;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f37215k = method;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m24343k() {
    }

    /* JADX INFO: renamed from: n */
    public static final <T> T m24344n(@InterfaceC7396q ReentrantLock reentrantLock, @InterfaceC7396q InterfaceC5981k<? extends T> interfaceC5981k) {
        reentrantLock.lock();
        try {
            return interfaceC5981k.invoke();
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final <E> List<E> m24345q() {
        return new CopyOnWriteArrayList();
    }

    @InterfaceC7396q
    public static final <E> Set<E> toq(int i2) {
        return Collections.newSetFromMap(new IdentityHashMap(i2));
    }

    public static final boolean zy(@InterfaceC7396q Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f37215k) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}

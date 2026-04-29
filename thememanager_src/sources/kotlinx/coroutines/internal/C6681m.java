package kotlinx.coroutines.internal;

import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.reflect.C4991s;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.m */
/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00062\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR:\u0010\u000f\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/m;", "Lkotlinx/coroutines/internal/ld6;", "Ljava/lang/Class;", "", InterfaceC1925p.qn, "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "k", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "toq", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "Ljava/util/WeakHashMap;", "zy", "Ljava/util/WeakHashMap;", "exceptionCtors", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6681m extends ld6 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C6681m f37227k = new C6681m();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final ReentrantReadWriteLock f82020toq = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final WeakHashMap<Class<? extends Throwable>, cyoe.x2<Throwable, Throwable>> f82021zy = new WeakHashMap<>();

    private C6681m() {
    }

    @Override // kotlinx.coroutines.internal.ld6
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public cyoe.x2<Throwable, Throwable> mo24364k(@InterfaceC7396q Class<? extends Throwable> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = f82020toq;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            cyoe.x2<Throwable, Throwable> x2Var = f82021zy.get(cls);
            if (x2Var != null) {
                return x2Var;
            }
            lock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            int i3 = 0;
            while (i3 < readHoldCount) {
                i3++;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, cyoe.x2<Throwable, Throwable>> weakHashMap = f82021zy;
                cyoe.x2<Throwable, Throwable> x2Var2 = weakHashMap.get(cls);
                if (x2Var2 == null) {
                    cyoe.x2<Throwable, Throwable> qVar = n7h.toq(cls);
                    weakHashMap.put(cls, qVar);
                    return qVar;
                }
                while (i2 < readHoldCount) {
                    i2++;
                    lock.lock();
                }
                writeLock.unlock();
                return x2Var2;
            } finally {
                while (i2 < readHoldCount) {
                    i2++;
                    lock.lock();
                }
                writeLock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }
}

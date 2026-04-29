package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.C6231h;
import kotlin.C6318m;
import kotlin.C6323o;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/coroutines/f7l8;", "context", "", "exception", "Lkotlin/was;", "k", "", "Lkotlinx/coroutines/x9kr;", "Ljava/util/List;", "handlers", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class ncyb {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final List<x9kr> f37304k = kotlin.sequences.fn3e.nyj(kotlin.sequences.t8r.m23475n(ServiceLoader.load(x9kr.class, x9kr.class.getClassLoader()).iterator()));

    /* JADX INFO: renamed from: k */
    public static final void m24507k(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Throwable th) {
        Iterator<x9kr> it = f37304k.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(f7l8Var, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, C6697l.zy(th, th2));
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            C6323o.k kVar = C6323o.Companion;
            C6231h.m22845k(th, new y9n(f7l8Var));
            C6323o.m28280constructorimpl(kotlin.was.f36763k);
        } catch (Throwable th3) {
            C6323o.k kVar2 = C6323o.Companion;
            C6323o.m28280constructorimpl(C6318m.m23191k(th3));
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}

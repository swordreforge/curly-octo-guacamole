package kotlinx.coroutines.test;

import cyoe.x2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.d3;
import kotlin.hb;
import kotlin.jvm.internal.d2ok;
import kotlin.ld6;
import kotlin.qrj;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TestCoroutineContext.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/test/k;", "testContext", "Lkotlin/Function1;", "Lkotlin/was;", "Lkotlin/fn3e;", "testBody", "k", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class toq {
    @ld6(level = qrj.ERROR, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @hb(expression = "testContext.runBlockingTest(testBody)", imports = {"kotlin.coroutines.test"}))
    /* JADX INFO: renamed from: k */
    public static final void m24627k(@InterfaceC7396q C6740k c6740k, @InterfaceC7396q x2<? super C6740k, was> x2Var) {
        x2Var.invoke(c6740k);
        List<Throwable> listA9 = c6740k.a9();
        boolean z2 = true;
        if (!(listA9 instanceof Collection) || !listA9.isEmpty()) {
            Iterator<T> it = listA9.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!(((Throwable) it.next()) instanceof CancellationException)) {
                    z2 = false;
                    break;
                }
            }
        }
        if (!z2) {
            throw new AssertionError(d2ok.mcp("Coroutine encountered unhandled exceptions:\n", c6740k.a9()));
        }
    }

    public static /* synthetic */ void toq(C6740k c6740k, x2 x2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c6740k = new C6740k(null, 1, null);
        }
        m24627k(c6740k, x2Var);
    }
}

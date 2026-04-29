package kotlinx.coroutines.flow.internal;

import com.market.sdk.reflect.C4991s;
import java.util.concurrent.CancellationException;
import kotlin.d3;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FlowExceptions.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/x2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class x2 extends CancellationException {
    public x2() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    @InterfaceC7396q
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

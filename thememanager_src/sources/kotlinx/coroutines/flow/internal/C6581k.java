package kotlinx.coroutines.flow.internal;

import com.market.sdk.reflect.C4991s;
import java.util.concurrent.CancellationException;
import kotlin.d3;
import kotlinx.coroutines.flow.InterfaceC6618p;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.k */
/* JADX INFO: compiled from: FlowExceptions.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001b\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/internal/k;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "Lkotlinx/coroutines/flow/p;", "owner", "Lkotlinx/coroutines/flow/p;", "getOwner", "()Lkotlinx/coroutines/flow/p;", C4991s.f28129n, "(Lkotlinx/coroutines/flow/p;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class C6581k extends CancellationException {

    @InterfaceC7396q
    private final InterfaceC6618p<?> owner;

    public C6581k(@InterfaceC7396q InterfaceC6618p<?> interfaceC6618p) {
        super("Flow was aborted, no more elements needed");
        this.owner = interfaceC6618p;
    }

    @Override // java.lang.Throwable
    @InterfaceC7396q
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @InterfaceC7396q
    public final InterfaceC6618p<?> getOwner() {
        return this.owner;
    }
}

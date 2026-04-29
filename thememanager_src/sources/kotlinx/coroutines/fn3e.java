package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC6216q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/fn3e;", "Lkotlinx/coroutines/a9;", "", "zy", "()Z", "Lkotlin/coroutines/q;", "continuation", "", "cause", "handled", C4991s.f28129n, "(Lkotlin/coroutines/q;Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class fn3e extends a9 {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f81998zy = AtomicIntegerFieldUpdater.newUpdater(fn3e.class, "_resumed");

    @InterfaceC7396q
    private volatile /* synthetic */ int _resumed;

    public fn3e(@InterfaceC7396q InterfaceC6216q<?> interfaceC6216q, @InterfaceC7395n Throwable th, boolean z2) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC6216q + " was cancelled normally");
        }
        super(th, z2);
        this._resumed = 0;
    }

    public final boolean zy() {
        return f81998zy.compareAndSet(this, 0, 1);
    }
}

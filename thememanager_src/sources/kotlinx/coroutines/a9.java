package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/a9;", "", "", "toq", "()Z", "", "toString", "()Ljava/lang/String;", "", "k", "Ljava/lang/Throwable;", "cause", "handled", C4991s.f28129n, "(Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class a9 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f81954toq = AtomicIntegerFieldUpdater.newUpdater(a9.class, "_handled");

    @InterfaceC7396q
    private volatile /* synthetic */ int _handled;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public final Throwable f36774k;

    public a9(@InterfaceC7396q Throwable th, boolean z2) {
        this.f36774k = th;
        this._handled = z2 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX INFO: renamed from: k */
    public final boolean m23817k() {
        return this._handled;
    }

    @InterfaceC7396q
    public String toString() {
        return C6551e.m24040k(this) + '[' + this.f36774k + ']';
    }

    public final boolean toq() {
        return f81954toq.compareAndSet(this, 0, 1);
    }

    public /* synthetic */ a9(Throwable th, boolean z2, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(th, (i2 & 2) != 0 ? false : z2);
    }
}

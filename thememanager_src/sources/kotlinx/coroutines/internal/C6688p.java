package kotlinx.coroutines.internal;

import com.market.sdk.reflect.C4991s;
import kotlinx.coroutines.InterfaceC6556f;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.p */
/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/f;", "", "toString", "Lkotlin/coroutines/f7l8;", "k", "Lkotlin/coroutines/f7l8;", "i1", "()Lkotlin/coroutines/f7l8;", "coroutineContext", "context", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class C6688p implements InterfaceC6556f {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final kotlin.coroutines.f7l8 f37234k;

    public C6688p(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        this.f37234k = f7l8Var;
    }

    @Override // kotlinx.coroutines.InterfaceC6556f
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 i1() {
        return this.f37234k;
    }

    @InterfaceC7396q
    public String toString() {
        return "CoroutineScope(coroutineContext=" + i1() + ')';
    }
}

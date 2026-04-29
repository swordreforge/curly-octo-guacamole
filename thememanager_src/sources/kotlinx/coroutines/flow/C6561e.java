package kotlinx.coroutines.flow;

import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.was;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.e */
/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/p;", "", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "k", "Ljava/lang/Throwable;", "e", C4991s.f28129n, "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class C6561e implements InterfaceC6618p<Object> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public final Throwable f36948k;

    public C6561e(@InterfaceC7396q Throwable th) {
        this.f36948k = th;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6618p
    @InterfaceC7395n
    public Object emit(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) throws Throwable {
        throw this.f36948k;
    }
}

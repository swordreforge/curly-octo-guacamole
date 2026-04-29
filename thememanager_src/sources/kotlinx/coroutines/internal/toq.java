package kotlinx.coroutines.internal;

import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&R&\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/internal/toq;", "", "Lkotlinx/coroutines/internal/q;", "op", "zy", "failure", "Lkotlin/was;", "k", "Lkotlinx/coroutines/internal/q;", "toq", "()Lkotlinx/coroutines/internal/q;", "q", "(Lkotlinx/coroutines/internal/q;)V", "atomicOp", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class toq {

    /* JADX INFO: renamed from: k */
    public AbstractC6689q<?> f37253k;

    /* JADX INFO: renamed from: k */
    public abstract void mo24414k(@InterfaceC7396q AbstractC6689q<?> abstractC6689q, @InterfaceC7395n Object obj);

    /* JADX INFO: renamed from: q */
    public final void m24415q(@InterfaceC7396q AbstractC6689q<?> abstractC6689q) {
        this.f37253k = abstractC6689q;
    }

    @InterfaceC7396q
    public final AbstractC6689q<?> toq() {
        AbstractC6689q<?> abstractC6689q = this.f37253k;
        if (abstractC6689q != null) {
            return abstractC6689q;
        }
        kotlin.jvm.internal.d2ok.n5r1("atomicOp");
        return null;
    }

    @InterfaceC7395n
    public abstract Object zy(@InterfaceC7396q AbstractC6689q<?> abstractC6689q);
}

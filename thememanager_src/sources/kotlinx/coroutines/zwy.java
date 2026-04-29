package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Unconfined.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/zwy;", "Lkotlinx/coroutines/dd;", "", "parallelism", "ga", "Lkotlin/coroutines/f7l8;", "context", "", "wlev", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/was;", "bap7", "", "toString", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class zwy extends dd {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final zwy f37491q = new zwy();

    private zwy() {
    }

    @Override // kotlinx.coroutines.dd
    public void bap7(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Runnable runnable) {
        ngy ngyVar = (ngy) f7l8Var.get(ngy.f37305q);
        if (ngyVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        ngyVar.f37306k = true;
    }

    @Override // kotlinx.coroutines.dd
    @InterfaceC7396q
    @InterfaceC6533d
    public dd ga(int i2) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.dd
    @InterfaceC7396q
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // kotlinx.coroutines.dd
    public boolean wlev(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        return false;
    }
}

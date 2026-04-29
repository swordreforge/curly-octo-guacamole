package kotlinx.coroutines.internal;

import com.market.sdk.reflect.C4991s;
import kotlinx.coroutines.C6551e;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000R\u001a\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/internal/oc;", "", "affected", "zy", "", "toString", "that", "", "toq", "Lkotlinx/coroutines/internal/q;", "k", "()Lkotlinx/coroutines/internal/q;", "atomicOp", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class oc {
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public abstract AbstractC6689q<?> mo24394k();

    @InterfaceC7396q
    public String toString() {
        return C6551e.m24040k(this) + '@' + C6551e.toq(this);
    }

    public final boolean toq(@InterfaceC7396q oc ocVar) {
        AbstractC6689q<?> abstractC6689qMo24394k;
        AbstractC6689q<?> abstractC6689qMo24394k2 = mo24394k();
        return (abstractC6689qMo24394k2 == null || (abstractC6689qMo24394k = ocVar.mo24394k()) == null || abstractC6689qMo24394k2.f7l8() >= abstractC6689qMo24394k.f7l8()) ? false : true;
    }

    @InterfaceC7395n
    public abstract Object zy(@InterfaceC7395n Object obj);
}

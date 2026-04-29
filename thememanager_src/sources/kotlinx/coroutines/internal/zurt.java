package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicInteger;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: LocalAtomics.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\".\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00028À\u0002@À\u0002X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlinx/coroutines/internal/LocalAtomicInt;", "", "value", "k", "(Ljava/util/concurrent/atomic/AtomicInteger;)I", "toq", "(Ljava/util/concurrent/atomic/AtomicInteger;I)V", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class zurt {
    /* JADX INFO: renamed from: k */
    public static final int m24453k(@InterfaceC7396q AtomicInteger atomicInteger) {
        return atomicInteger.get();
    }

    public static final void toq(@InterfaceC7396q AtomicInteger atomicInteger, int i2) {
        atomicInteger.set(i2);
    }
}

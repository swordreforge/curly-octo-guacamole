package kotlinx.coroutines.sync;

import kotlin.coroutines.InterfaceC6216q;
import kotlin.d3;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.g */
/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0002H&R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/sync/g;", "", "Lkotlin/was;", "zy", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "toq", "release", "", "k", "()I", "availablePermits", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface InterfaceC6732g {
    /* JADX INFO: renamed from: k */
    int mo24591k();

    void release();

    boolean toq();

    @InterfaceC7395n
    Object zy(@InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q);
}

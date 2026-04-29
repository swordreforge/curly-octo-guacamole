package kotlinx.coroutines.internal;

import kotlinx.coroutines.tfm;
import mub.InterfaceC7395n;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001R\"\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/internal/hb;", "", "Lkotlinx/coroutines/internal/nn86;", "q", "()Lkotlinx/coroutines/internal/nn86;", "toq", "(Lkotlinx/coroutines/internal/nn86;)V", "heap", "", "getIndex", "()I", "setIndex", "(I)V", "index", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@tfm
public interface hb {
    int getIndex();

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    nn86<?> mo23835q();

    void setIndex(int i2);

    void toq(@InterfaceC7395n nn86<?> nn86Var);
}

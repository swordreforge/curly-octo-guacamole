package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/nmn5;", "Lkotlinx/coroutines/kja0;", "", "cause", "Lkotlin/was;", "k", "", "toString", "Lkotlinx/coroutines/ch;", "Lkotlinx/coroutines/ch;", "handle", C4991s.f28129n, "(Lkotlinx/coroutines/ch;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class nmn5 extends kja0 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final ch f37307k;

    public nmn5(@InterfaceC7396q ch chVar) {
        this.f37307k = chVar;
    }

    @Override // cyoe.x2
    public /* bridge */ /* synthetic */ kotlin.was invoke(Throwable th) {
        mo23837k(th);
        return kotlin.was.f36763k;
    }

    @Override // kotlinx.coroutines.AbstractC6666h
    /* JADX INFO: renamed from: k */
    public void mo23837k(@InterfaceC7395n Throwable th) {
        this.f37307k.zy();
    }

    @InterfaceC7396q
    public String toString() {
        return "DisposeOnCancel[" + this.f37307k + ']';
    }
}

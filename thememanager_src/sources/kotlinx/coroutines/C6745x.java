package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import java.util.concurrent.Future;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.x */
/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/x;", "Lkotlinx/coroutines/ch;", "Lkotlin/was;", "zy", "", "toString", "Ljava/util/concurrent/Future;", "k", "Ljava/util/concurrent/Future;", "future", C4991s.f28129n, "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6745x implements ch {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Future<?> f37483k;

    public C6745x(@InterfaceC7396q Future<?> future) {
        this.f37483k = future;
    }

    @InterfaceC7396q
    public String toString() {
        return "DisposableFutureHandle[" + this.f37483k + ']';
    }

    @Override // kotlinx.coroutines.ch
    public void zy() {
        this.f37483k.cancel(false);
    }
}

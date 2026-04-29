package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.Future;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/n7h;", "Lkotlinx/coroutines/v0af;", "", "cause", "Lkotlin/was;", "y9n", "Ljava/util/concurrent/Future;", AnimatedProperty.PROPERTY_NAME_Y, "Ljava/util/concurrent/Future;", "future", C4991s.f28129n, "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class n7h extends v0af {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final Future<?> f37303y;

    public n7h(@InterfaceC7396q Future<?> future) {
        this.f37303y = future;
    }

    @Override // cyoe.x2
    public /* bridge */ /* synthetic */ kotlin.was invoke(Throwable th) {
        y9n(th);
        return kotlin.was.f36763k;
    }

    @Override // kotlinx.coroutines.jp0y
    public void y9n(@InterfaceC7395n Throwable th) {
        if (th != null) {
            this.f37303y.cancel(false);
        }
    }
}

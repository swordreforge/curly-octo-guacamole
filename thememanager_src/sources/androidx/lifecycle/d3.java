package androidx.lifecycle;

import com.market.sdk.reflect.C4991s;
import kotlinx.coroutines.C6481a;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PausingDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/d3;", "Lkotlinx/coroutines/dd;", "Lkotlin/coroutines/f7l8;", "context", "", "wlev", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/was;", "bap7", "Landroidx/lifecycle/y;", "q", "Landroidx/lifecycle/y;", "dispatchQueue", C4991s.f28129n, "()V", "lifecycle-runtime-ktx_release"}, m22787k = 1, mv = {1, 6, 0})
public final class d3 extends kotlinx.coroutines.dd {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @InterfaceC6765n
    public final C0953y f5051q = new C0953y();

    @Override // kotlinx.coroutines.dd
    public void bap7(@InterfaceC7396q kotlin.coroutines.f7l8 context, @InterfaceC7396q Runnable block) {
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        this.f5051q.zy(context, block);
    }

    @Override // kotlinx.coroutines.dd
    public boolean wlev(@InterfaceC7396q kotlin.coroutines.f7l8 context) {
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
        if (C6481a.m23813n().dxef().wlev(context)) {
            return true;
        }
        return !this.f5051q.toq();
    }
}

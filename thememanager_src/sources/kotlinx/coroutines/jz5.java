package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/jz5;", "Lkotlinx/coroutines/v0af;", "", "cause", "Lkotlin/was;", "y9n", "Lkotlin/coroutines/q;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlin/coroutines/q;", "continuation", C4991s.f28129n, "(Lkotlin/coroutines/q;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class jz5 extends v0af {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final InterfaceC6216q<kotlin.was> f37279y;

    /* JADX WARN: Multi-variable type inference failed */
    public jz5(@InterfaceC7396q InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
        this.f37279y = interfaceC6216q;
    }

    @Override // cyoe.x2
    public /* bridge */ /* synthetic */ kotlin.was invoke(Throwable th) {
        y9n(th);
        return kotlin.was.f36763k;
    }

    @Override // kotlinx.coroutines.jp0y
    public void y9n(@InterfaceC7395n Throwable th) {
        InterfaceC6216q<kotlin.was> interfaceC6216q = this.f37279y;
        C6323o.k kVar = C6323o.Companion;
        interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(kotlin.was.f36763k));
    }
}

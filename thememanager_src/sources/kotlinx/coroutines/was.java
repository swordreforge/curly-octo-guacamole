package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0006j\u0002`\t¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R5\u0010\f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0006j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/was;", "Lkotlinx/coroutines/v0af;", "", "cause", "Lkotlin/was;", "y9n", "Lkotlin/Function1;", "Lkotlin/c;", "name", "Lkotlinx/coroutines/CompletionHandler;", AnimatedProperty.PROPERTY_NAME_Y, "Lcyoe/x2;", "handler", C4991s.f28129n, "(Lcyoe/x2;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class was extends v0af {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final cyoe.x2<Throwable, kotlin.was> f37480y;

    /* JADX WARN: Multi-variable type inference failed */
    public was(@InterfaceC7396q cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        this.f37480y = x2Var;
    }

    @Override // cyoe.x2
    public /* bridge */ /* synthetic */ kotlin.was invoke(Throwable th) {
        y9n(th);
        return kotlin.was.f36763k;
    }

    @Override // kotlinx.coroutines.jp0y
    public void y9n(@InterfaceC7395n Throwable th) {
        this.f37480y.invoke(th);
    }
}

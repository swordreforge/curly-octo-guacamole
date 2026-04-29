package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\r\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\bj\u0002`\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R5\u0010\r\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\bj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/d8wk;", "Lkotlinx/coroutines/kja0;", "", "cause", "Lkotlin/was;", "k", "", "toString", "Lkotlin/Function1;", "Lkotlin/c;", "name", "Lkotlinx/coroutines/CompletionHandler;", "Lcyoe/x2;", "handler", C4991s.f28129n, "(Lcyoe/x2;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class d8wk extends kja0 {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final cyoe.x2<Throwable, kotlin.was> f36881k;

    /* JADX WARN: Multi-variable type inference failed */
    public d8wk(@InterfaceC7396q cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        this.f36881k = x2Var;
    }

    @Override // cyoe.x2
    public /* bridge */ /* synthetic */ kotlin.was invoke(Throwable th) {
        mo23837k(th);
        return kotlin.was.f36763k;
    }

    @Override // kotlinx.coroutines.AbstractC6666h
    /* JADX INFO: renamed from: k */
    public void mo23837k(@InterfaceC7395n Throwable th) {
        this.f36881k.invoke(th);
    }

    @InterfaceC7396q
    public String toString() {
        return "InvokeOnCancel[" + C6551e.m24040k(this.f36881k) + '@' + C6551e.toq(this) + ']';
    }
}

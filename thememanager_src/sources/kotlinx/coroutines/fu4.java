package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/fu4;", "Lkotlinx/coroutines/py;", "Lkotlinx/coroutines/ni7;", "", "cause", "Lkotlin/was;", "y9n", "", "f7l8", "Lkotlinx/coroutines/z;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/z;", "childJob", "Lkotlinx/coroutines/gbni;", "getParent", "()Lkotlinx/coroutines/gbni;", "parent", C4991s.f28129n, "(Lkotlinx/coroutines/z;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class fu4 extends py implements ni7 {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    @InterfaceC6765n
    public final InterfaceC6749z f37186y;

    public fu4(@InterfaceC7396q InterfaceC6749z interfaceC6749z) {
        this.f37186y = interfaceC6749z;
    }

    @Override // kotlinx.coroutines.ni7
    public boolean f7l8(@InterfaceC7396q Throwable th) {
        return m24638b().ek5k(th);
    }

    @Override // kotlinx.coroutines.ni7
    @InterfaceC7396q
    public gbni getParent() {
        return m24638b();
    }

    @Override // cyoe.x2
    public /* bridge */ /* synthetic */ kotlin.was invoke(Throwable th) {
        y9n(th);
        return kotlin.was.f36763k;
    }

    @Override // kotlinx.coroutines.jp0y
    public void y9n(@InterfaceC7395n Throwable th) {
        this.f37186y.mo24057f(m24638b());
    }
}

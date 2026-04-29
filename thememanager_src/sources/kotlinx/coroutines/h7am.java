package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.coroutines.InterfaceC6216q;
import kotlinx.coroutines.selects.InterfaceC6720g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import tww7.C7677k;
import v5yj.C7704k;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B6\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR-\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/h7am;", "R", "Lkotlinx/coroutines/v0af;", "", "cause", "Lkotlin/was;", "y9n", "Lkotlinx/coroutines/selects/g;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/Function1;", "Lkotlin/coroutines/q;", "", C7704k.y.toq.f44691k, "Lcyoe/x2;", "block", C4991s.f28129n, "(Lkotlinx/coroutines/selects/g;Lcyoe/x2;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class h7am<R> extends v0af {

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private final cyoe.x2<InterfaceC6216q<? super R>, Object> f37195s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final InterfaceC6720g<R> f37196y;

    /* JADX WARN: Multi-variable type inference failed */
    public h7am(@InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, @InterfaceC7396q cyoe.x2<? super InterfaceC6216q<? super R>, ? extends Object> x2Var) {
        this.f37196y = interfaceC6720g;
        this.f37195s = x2Var;
    }

    @Override // cyoe.x2
    public /* bridge */ /* synthetic */ kotlin.was invoke(Throwable th) throws Throwable {
        y9n(th);
        return kotlin.was.f36763k;
    }

    @Override // kotlinx.coroutines.jp0y
    public void y9n(@InterfaceC7395n Throwable th) throws Throwable {
        if (this.f37196y.ki()) {
            C7677k.zy(this.f37195s, this.f37196y.t8r());
        }
    }
}

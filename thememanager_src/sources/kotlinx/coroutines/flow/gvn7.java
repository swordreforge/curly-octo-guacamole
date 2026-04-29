package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012-\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R>\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/gvn7;", C0846k.zaso, "Lkotlinx/coroutines/flow/k;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", AnimatedProperty.PROPERTY_NAME_Y, "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "k", "Lcyoe/h;", "block", C4991s.f28129n, "(Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class gvn7<T> extends AbstractC6597k<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC5979h<InterfaceC6618p<? super T>, InterfaceC6216q<? super was>, Object> f36966k;

    /* JADX WARN: Multi-variable type inference failed */
    public gvn7(@InterfaceC7396q InterfaceC5979h<? super InterfaceC6618p<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        this.f36966k = interfaceC5979h;
    }

    @Override // kotlinx.coroutines.flow.AbstractC6597k
    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public Object mo24107y(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        Object objInvoke = this.f36966k.invoke(interfaceC6618p, interfaceC6216q);
        return objInvoke == C6199q.x2() ? objInvoke : was.f36763k;
    }
}

package kotlinx.coroutines.flow;

import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.was;
import kotlinx.coroutines.flow.internal.AbstractC6587q;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/d2ok;", "Lkotlinx/coroutines/flow/internal/q;", "Lkotlinx/coroutines/flow/oc;", "flow", "", "zy", "", "Lkotlin/coroutines/q;", "Lkotlin/was;", "q", "(Lkotlinx/coroutines/flow/oc;)[Lkotlin/coroutines/q;", "", "k", com.market.sdk.reflect.toq.f68928f7l8, "index", "toq", "Lkotlin/coroutines/q;", "cont", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class d2ok extends AbstractC6587q<oc<?>> {

    /* JADX INFO: renamed from: k */
    @InterfaceC6765n
    public long f36945k = -1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC6765n
    @InterfaceC7395n
    public InterfaceC6216q<? super was> f81988toq;

    @Override // kotlinx.coroutines.flow.internal.AbstractC6587q
    @InterfaceC7396q
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceC6216q<was>[] toq(@InterfaceC7396q oc<?> ocVar) {
        long j2 = this.f36945k;
        this.f36945k = -1L;
        this.f81988toq = null;
        return ocVar.m24225o(j2);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6587q
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public boolean mo24077k(@InterfaceC7396q oc<?> ocVar) {
        if (this.f36945k >= 0) {
            return false;
        }
        this.f36945k = ocVar.m24224m();
        return true;
    }
}

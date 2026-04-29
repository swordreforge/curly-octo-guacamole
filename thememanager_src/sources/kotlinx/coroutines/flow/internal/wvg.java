package kotlinx.coroutines.flow.internal;

import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlinx.coroutines.flow.hyr;
import kotlinx.coroutines.flow.oc;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/internal/wvg;", "Lkotlinx/coroutines/flow/hyr;", "", "Lkotlinx/coroutines/flow/oc;", "delta", "", "yz", "ek5k", "()Ljava/lang/Integer;", "value", "initialValue", C4991s.f28129n, "(I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class wvg extends oc<Integer> implements hyr<Integer> {
    public wvg(int i2) {
        super(1, Integer.MAX_VALUE, kotlinx.coroutines.channels.qrj.DROP_OLDEST);
        toq(Integer.valueOf(i2));
    }

    @Override // kotlinx.coroutines.flow.hyr
    @InterfaceC7396q
    /* JADX INFO: renamed from: ek5k, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(m24223l().intValue());
        }
        return numValueOf;
    }

    public final boolean yz(int i2) {
        boolean qVar;
        synchronized (this) {
            qVar = toq(Integer.valueOf(m24223l().intValue() + i2));
        }
        return qVar;
    }
}

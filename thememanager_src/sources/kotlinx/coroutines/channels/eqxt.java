package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import kotlin.was;
import mub.InterfaceC7395n;

/* JADX INFO: compiled from: RendezvousChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/eqxt;", C0846k.d9i, "Lkotlinx/coroutines/channels/k;", "", "ek5k", "()Z", "isBufferAlwaysEmpty", "yz", "isBufferEmpty", "eqxt", "isBufferAlwaysFull", "d2ok", "isBufferFull", "Lkotlin/Function1;", "Lkotlin/was;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", C4991s.f28129n, "(Lcyoe/x2;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class eqxt<E> extends AbstractC6500k<E> {
    public eqxt(@InterfaceC7395n cyoe.x2<? super E, was> x2Var) {
        super(x2Var);
    }

    @Override // kotlinx.coroutines.channels.zy
    protected final boolean d2ok() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    protected final boolean ek5k() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.zy
    protected final boolean eqxt() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractC6500k
    protected final boolean yz() {
        return true;
    }
}

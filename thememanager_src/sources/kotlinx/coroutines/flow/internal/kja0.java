package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.d3;
import kotlinx.coroutines.internal.C6690r;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FlowCoroutine.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/internal/kja0;", C0846k.zaso, "Lkotlinx/coroutines/internal/r;", "", "cause", "", "ek5k", "Lkotlin/coroutines/f7l8;", "context", "Lkotlin/coroutines/q;", "uCont", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;Lkotlin/coroutines/q;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class kja0<T> extends C6690r<T> {
    public kja0(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        super(f7l8Var, interfaceC6216q);
    }

    @Override // kotlinx.coroutines.etdu
    public boolean ek5k(@InterfaceC7396q Throwable th) {
        if (th instanceof x2) {
            return true;
        }
        return nn86(th);
    }
}

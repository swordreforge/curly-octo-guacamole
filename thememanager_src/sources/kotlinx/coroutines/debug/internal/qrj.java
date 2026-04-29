package kotlinx.coroutines.debug.internal;

import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.jvm.internal.InterfaceC6207n;
import kotlin.d3;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: StackTraceFrame.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/internal/qrj;", "Lkotlin/coroutines/jvm/internal/n;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "k", "Lkotlin/coroutines/jvm/internal/n;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/n;", "callerFrame", "q", "Ljava/lang/StackTraceElement;", "stackTraceElement", C4991s.f28129n, "(Lkotlin/coroutines/jvm/internal/n;Ljava/lang/StackTraceElement;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class qrj implements InterfaceC6207n {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final InterfaceC6207n f36905k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final StackTraceElement f36906q;

    public qrj(@InterfaceC7395n InterfaceC6207n interfaceC6207n, @InterfaceC7396q StackTraceElement stackTraceElement) {
        this.f36905k = interfaceC6207n;
        this.f36906q = stackTraceElement;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public InterfaceC6207n getCallerFrame() {
        return this.f36905k;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7396q
    public StackTraceElement getStackTraceElement() {
        return this.f36906q;
    }
}

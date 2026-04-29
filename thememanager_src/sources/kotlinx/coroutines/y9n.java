package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/y9n;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "getLocalizedMessage", "", "fillInStackTrace", "Lkotlin/coroutines/f7l8;", "context", "Lkotlin/coroutines/f7l8;", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class y9n extends RuntimeException {

    @InterfaceC7396q
    private final kotlin.coroutines.f7l8 context;

    public y9n(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        this.context = f7l8Var;
    }

    @Override // java.lang.Throwable
    @InterfaceC7396q
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @InterfaceC7396q
    public String getLocalizedMessage() {
        return this.context.toString();
    }
}

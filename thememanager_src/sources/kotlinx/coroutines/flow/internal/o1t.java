package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.InterfaceC6207n;
import kotlin.d3;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/flow/internal/o1t;", C0846k.zaso, "Lkotlin/coroutines/q;", "Lkotlin/coroutines/jvm/internal/n;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/o;", "result", "Lkotlin/was;", "resumeWith", "(Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "k", "Lkotlin/coroutines/q;", "uCont", "Lkotlin/coroutines/f7l8;", "q", "Lkotlin/coroutines/f7l8;", "getContext", "()Lkotlin/coroutines/f7l8;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/n;", "callerFrame", C4991s.f28129n, "(Lkotlin/coroutines/q;Lkotlin/coroutines/f7l8;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class o1t<T> implements InterfaceC6216q<T>, InterfaceC6207n {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC6216q<T> f36998k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final kotlin.coroutines.f7l8 f36999q;

    /* JADX WARN: Multi-variable type inference failed */
    public o1t(@InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        this.f36998k = interfaceC6216q;
        this.f36999q = f7l8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public InterfaceC6207n getCallerFrame() {
        InterfaceC6216q<T> interfaceC6216q = this.f36998k;
        if (interfaceC6216q instanceof InterfaceC6207n) {
            return (InterfaceC6207n) interfaceC6216q;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 getContext() {
        return this.f36999q;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    public void resumeWith(@InterfaceC7396q Object obj) {
        this.f36998k.resumeWith(obj);
    }
}

package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.C6323o;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.f7l8;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.coroutines.jvm.internal.InterfaceC6207n;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.ltg8;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b-\u0010.J'\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u001b\u0010\u001b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lkotlinx/coroutines/flow/internal/zurt;", C0846k.zaso, "Lkotlinx/coroutines/flow/p;", "Lkotlin/coroutines/jvm/internal/q;", "Lkotlin/coroutines/jvm/internal/n;", "Lkotlin/coroutines/q;", "Lkotlin/was;", "uCont", "value", "", "n", "(Lkotlin/coroutines/q;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/f7l8;", "currentContext", "previousContext", "q", "(Lkotlin/coroutines/f7l8;Lkotlin/coroutines/f7l8;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/n7h;", "exception", AnimatedProperty.PROPERTY_NAME_Y, "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/o;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "collector", "Lkotlinx/coroutines/flow/p;", "collectContext", "Lkotlin/coroutines/f7l8;", "", "collectContextSize", com.market.sdk.reflect.toq.f28131g, "lastEmissionContext", "completion", "Lkotlin/coroutines/q;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/n;", "callerFrame", "getContext", "()Lkotlin/coroutines/f7l8;", "context", C4991s.f28129n, "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/f7l8;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class zurt<T> extends AbstractC6209q implements InterfaceC6618p<T>, InterfaceC6207n {

    @InterfaceC7396q
    @InterfaceC6765n
    public final kotlin.coroutines.f7l8 collectContext;

    @InterfaceC6765n
    public final int collectContextSize;

    @InterfaceC7396q
    @InterfaceC6765n
    public final InterfaceC6618p<T> collector;

    @InterfaceC7395n
    private InterfaceC6216q<? super was> completion;

    @InterfaceC7395n
    private kotlin.coroutines.f7l8 lastEmissionContext;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.zurt$k */
    /* JADX INFO: compiled from: SafeCollector.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {C0846k.zaso, "", "count", "Lkotlin/coroutines/f7l8$toq;", "<anonymous parameter 1>", "invoke", "(ILkotlin/coroutines/f7l8$toq;)Ljava/lang/Integer;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6596k extends AbstractC6308r implements InterfaceC5979h<Integer, f7l8.toq, Integer> {
        public static final C6596k INSTANCE = new C6596k();

        C6596k() {
            super(2);
        }

        @InterfaceC7396q
        public final Integer invoke(int i2, @InterfaceC7396q f7l8.toq toqVar) {
            return Integer.valueOf(i2 + 1);
        }

        @Override // cyoe.InterfaceC5979h
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, f7l8.toq toqVar) {
            return invoke(num.intValue(), toqVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zurt(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        super(t8r.f37019k, C6217s.INSTANCE);
        this.collector = interfaceC6618p;
        this.collectContext = f7l8Var;
        this.collectContextSize = ((Number) f7l8Var.fold(0, C6596k.INSTANCE)).intValue();
    }

    /* JADX INFO: renamed from: n */
    private final Object m24141n(InterfaceC6216q<? super was> interfaceC6216q, T t2) {
        kotlin.coroutines.f7l8 context = interfaceC6216q.getContext();
        ltg8.o1t(context);
        kotlin.coroutines.f7l8 f7l8Var = this.lastEmissionContext;
        if (f7l8Var != context) {
            m24142q(context, f7l8Var, t2);
            this.lastEmissionContext = context;
        }
        this.completion = interfaceC6216q;
        Object objInvoke = ni7.f36997k.invoke(this.collector, t2, this);
        if (!d2ok.f7l8(objInvoke, C6199q.x2())) {
            this.completion = null;
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: q */
    private final void m24142q(kotlin.coroutines.f7l8 f7l8Var, kotlin.coroutines.f7l8 f7l8Var2, T t2) {
        if (f7l8Var2 instanceof n7h) {
            m24143y((n7h) f7l8Var2, t2);
        }
        fu4.m24125k(this, f7l8Var);
    }

    /* JADX INFO: renamed from: y */
    private final void m24143y(n7h n7hVar, Object obj) {
        throw new IllegalStateException(kotlin.text.fu4.m23524h("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + n7hVar.f36995k + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6618p
    @InterfaceC7395n
    public Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        try {
            Object objM24141n = m24141n(interfaceC6216q, t2);
            if (objM24141n == C6199q.x2()) {
                C6211y.zy(interfaceC6216q);
            }
            return objM24141n == C6199q.x2() ? objM24141n : was.f36763k;
        } catch (Throwable th) {
            this.lastEmissionContext = new n7h(th, interfaceC6216q.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6206k, kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public InterfaceC6207n getCallerFrame() {
        InterfaceC6216q<? super was> interfaceC6216q = this.completion;
        if (interfaceC6216q instanceof InterfaceC6207n) {
            return (InterfaceC6207n) interfaceC6216q;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6209q, kotlin.coroutines.InterfaceC6216q
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 getContext() {
        kotlin.coroutines.f7l8 f7l8Var = this.lastEmissionContext;
        return f7l8Var == null ? C6217s.INSTANCE : f7l8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6206k, kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
    @InterfaceC7396q
    public Object invokeSuspend(@InterfaceC7396q Object obj) {
        Throwable thM28283exceptionOrNullimpl = C6323o.m28283exceptionOrNullimpl(obj);
        if (thM28283exceptionOrNullimpl != null) {
            this.lastEmissionContext = new n7h(thM28283exceptionOrNullimpl, getContext());
        }
        InterfaceC6216q<? super was> interfaceC6216q = this.completion;
        if (interfaceC6216q != null) {
            interfaceC6216q.resumeWith(obj);
        }
        return C6199q.x2();
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6209q, kotlin.coroutines.jvm.internal.AbstractC6206k
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}

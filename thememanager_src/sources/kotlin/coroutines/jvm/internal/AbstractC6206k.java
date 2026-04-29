package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.k */
/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.3")
public abstract class AbstractC6206k implements InterfaceC6216q<Object>, InterfaceC6207n, Serializable {

    @InterfaceC7395n
    private final InterfaceC6216q<Object> completion;

    public AbstractC6206k(@InterfaceC7395n InterfaceC6216q<Object> interfaceC6216q) {
        this.completion = interfaceC6216q;
    }

    @InterfaceC7396q
    public InterfaceC6216q<was> create(@InterfaceC7396q InterfaceC6216q<?> completion) {
        d2ok.m23075h(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public InterfaceC6207n getCallerFrame() {
        InterfaceC6216q<Object> interfaceC6216q = this.completion;
        if (interfaceC6216q instanceof InterfaceC6207n) {
            return (InterfaceC6207n) interfaceC6216q;
        }
        return null;
    }

    @InterfaceC7395n
    public final InterfaceC6216q<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public StackTraceElement getStackTraceElement() {
        return f7l8.m22753n(this);
    }

    @InterfaceC7395n
    protected abstract Object invokeSuspend(@InterfaceC7396q Object obj);

    protected void releaseIntercepted() {
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    public final void resumeWith(@InterfaceC7396q Object obj) {
        Object objInvokeSuspend;
        InterfaceC6216q<Object> interfaceC6216q = this;
        while (true) {
            C6211y.toq(interfaceC6216q);
            AbstractC6206k abstractC6206k = (AbstractC6206k) interfaceC6216q;
            InterfaceC6216q<Object> interfaceC6216q2 = abstractC6206k.completion;
            d2ok.qrj(interfaceC6216q2);
            try {
                objInvokeSuspend = abstractC6206k.invokeSuspend(obj);
            } catch (Throwable th) {
                C6323o.k kVar = C6323o.Companion;
                obj = C6323o.m28280constructorimpl(C6318m.m23191k(th));
            }
            if (objInvokeSuspend == C6199q.x2()) {
                return;
            }
            C6323o.k kVar2 = C6323o.Companion;
            obj = C6323o.m28280constructorimpl(objInvokeSuspend);
            abstractC6206k.releaseIntercepted();
            if (!(interfaceC6216q2 instanceof AbstractC6206k)) {
                interfaceC6216q2.resumeWith(obj);
                return;
            }
            interfaceC6216q = interfaceC6216q2;
        }
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @InterfaceC7396q
    public InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> completion) {
        d2ok.m23075h(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}

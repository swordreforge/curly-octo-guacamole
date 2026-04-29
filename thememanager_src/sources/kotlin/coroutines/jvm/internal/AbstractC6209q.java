package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.InterfaceC6214n;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.f7l8;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.q */
/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
@yz(version = "1.3")
public abstract class AbstractC6209q extends AbstractC6206k {

    @InterfaceC7395n
    private final kotlin.coroutines.f7l8 _context;

    @InterfaceC7395n
    private transient InterfaceC6216q<Object> intercepted;

    public AbstractC6209q(@InterfaceC7395n InterfaceC6216q<Object> interfaceC6216q, @InterfaceC7395n kotlin.coroutines.f7l8 f7l8Var) {
        super(interfaceC6216q);
        this._context = f7l8Var;
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 getContext() {
        kotlin.coroutines.f7l8 f7l8Var = this._context;
        d2ok.qrj(f7l8Var);
        return f7l8Var;
    }

    @InterfaceC7396q
    public final InterfaceC6216q<Object> intercepted() {
        InterfaceC6216q<Object> interfaceC6216qKi = this.intercepted;
        if (interfaceC6216qKi == null) {
            InterfaceC6214n interfaceC6214n = (InterfaceC6214n) getContext().get(InterfaceC6214n.ep);
            if (interfaceC6214n == null || (interfaceC6216qKi = interfaceC6214n.ki(this)) == null) {
                interfaceC6216qKi = this;
            }
            this.intercepted = interfaceC6216qKi;
        }
        return interfaceC6216qKi;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
    protected void releaseIntercepted() {
        InterfaceC6216q<?> interfaceC6216q = this.intercepted;
        if (interfaceC6216q != null && interfaceC6216q != this) {
            f7l8.toq toqVar = getContext().get(InterfaceC6214n.ep);
            d2ok.qrj(toqVar);
            ((InterfaceC6214n) toqVar).x2(interfaceC6216q);
        }
        this.intercepted = zy.f36257k;
    }

    public AbstractC6209q(@InterfaceC7395n InterfaceC6216q<Object> interfaceC6216q) {
        this(interfaceC6216q, interfaceC6216q != null ? interfaceC6216q.getContext() : null);
    }
}

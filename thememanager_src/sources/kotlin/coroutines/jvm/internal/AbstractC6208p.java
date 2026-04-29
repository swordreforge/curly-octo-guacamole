package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.p */
/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.3")
public abstract class AbstractC6208p extends AbstractC6206k {
    public AbstractC6208p(@InterfaceC7395n InterfaceC6216q<Object> interfaceC6216q) {
        super(interfaceC6216q);
        if (interfaceC6216q != null) {
            if (!(interfaceC6216q.getContext() == C6217s.INSTANCE)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 getContext() {
        return C6217s.INSTANCE;
    }
}

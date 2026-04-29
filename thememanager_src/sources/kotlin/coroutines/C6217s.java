package kotlin.coroutines;

import cyoe.InterfaceC5979h;
import java.io.Serializable;
import kotlin.coroutines.f7l8;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.coroutines.s */
/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.3")
public final class C6217s implements f7l8, Serializable {

    @InterfaceC7396q
    public static final C6217s INSTANCE = new C6217s();
    private static final long serialVersionUID = 0;

    private C6217s() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // kotlin.coroutines.f7l8
    public <R> R fold(R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> operation) {
        d2ok.m23075h(operation, "operation");
        return r2;
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7395n
    public <E extends f7l8.toq> E get(@InterfaceC7396q f7l8.zy<E> key) {
        d2ok.m23075h(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7396q
    public f7l8 minusKey(@InterfaceC7396q f7l8.zy<?> key) {
        d2ok.m23075h(key, "key");
        return this;
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7396q
    public f7l8 plus(@InterfaceC7396q f7l8 context) {
        d2ok.m23075h(context, "context");
        return context;
    }

    @InterfaceC7396q
    public String toString() {
        return "EmptyCoroutineContext";
    }
}

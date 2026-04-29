package kotlin.coroutines;

import cyoe.InterfaceC5979h;
import kotlin.coroutines.f7l8;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.coroutines.n */
/* JADX INFO: compiled from: ContinuationInterceptor.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.3")
public interface InterfaceC6214n extends f7l8.toq {

    @InterfaceC7396q
    public static final toq ep = toq.f36261k;

    /* JADX INFO: renamed from: kotlin.coroutines.n$k */
    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    public static final class k {
        /* JADX INFO: renamed from: k */
        public static <R> R m22773k(@InterfaceC7396q InterfaceC6214n interfaceC6214n, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> operation) {
            d2ok.m23075h(operation, "operation");
            return (R) f7l8.toq.C6196k.m22735k(interfaceC6214n, r2, operation);
        }

        /* JADX INFO: renamed from: n */
        public static void m22774n(@InterfaceC7396q InterfaceC6214n interfaceC6214n, @InterfaceC7396q InterfaceC6216q<?> continuation) {
            d2ok.m23075h(continuation, "continuation");
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public static f7l8 m22775q(@InterfaceC7396q InterfaceC6214n interfaceC6214n, @InterfaceC7396q f7l8 context) {
            d2ok.m23075h(context, "context");
            return f7l8.toq.C6196k.m22736q(interfaceC6214n, context);
        }

        @InterfaceC7395n
        public static <E extends f7l8.toq> E toq(@InterfaceC7396q InterfaceC6214n interfaceC6214n, @InterfaceC7396q f7l8.zy<E> key) {
            d2ok.m23075h(key, "key");
            if (!(key instanceof kotlin.coroutines.toq)) {
                if (InterfaceC6214n.ep != key) {
                    return null;
                }
                d2ok.n7h(interfaceC6214n, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC6214n;
            }
            kotlin.coroutines.toq toqVar = (kotlin.coroutines.toq) key;
            if (!toqVar.m22776k(interfaceC6214n.getKey())) {
                return null;
            }
            E e2 = (E) toqVar.toq(interfaceC6214n);
            if (e2 instanceof f7l8.toq) {
                return e2;
            }
            return null;
        }

        @InterfaceC7396q
        public static f7l8 zy(@InterfaceC7396q InterfaceC6214n interfaceC6214n, @InterfaceC7396q f7l8.zy<?> key) {
            d2ok.m23075h(key, "key");
            if (!(key instanceof kotlin.coroutines.toq)) {
                return InterfaceC6214n.ep == key ? C6217s.INSTANCE : interfaceC6214n;
            }
            kotlin.coroutines.toq toqVar = (kotlin.coroutines.toq) key;
            return (!toqVar.m22776k(interfaceC6214n.getKey()) || toqVar.toq(interfaceC6214n) == null) ? interfaceC6214n : C6217s.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.n$toq */
    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    public static final class toq implements f7l8.zy<InterfaceC6214n> {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ toq f36261k = new toq();

        private toq() {
        }
    }

    @Override // kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    @InterfaceC7395n
    <E extends f7l8.toq> E get(@InterfaceC7396q f7l8.zy<E> zyVar);

    @InterfaceC7396q
    <T> InterfaceC6216q<T> ki(@InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q);

    @Override // kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    @InterfaceC7396q
    f7l8 minusKey(@InterfaceC7396q f7l8.zy<?> zyVar);

    void x2(@InterfaceC7396q InterfaceC6216q<?> interfaceC6216q);
}

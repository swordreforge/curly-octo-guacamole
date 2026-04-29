package kotlin.coroutines;

import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6214n;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.3")
public interface f7l8 {

    /* JADX INFO: renamed from: kotlin.coroutines.f7l8$k */
    /* JADX INFO: compiled from: CoroutineContext.kt */
    public static final class C6195k {

        /* JADX INFO: renamed from: kotlin.coroutines.f7l8$k$k */
        /* JADX INFO: compiled from: CoroutineContext.kt */
        static final class k extends AbstractC6308r implements InterfaceC5979h<f7l8, toq, f7l8> {
            public static final k INSTANCE = new k();

            k() {
                super(2);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7396q
            public final f7l8 invoke(@InterfaceC7396q f7l8 acc, @InterfaceC7396q toq element) {
                kotlin.coroutines.zy zyVar;
                d2ok.m23075h(acc, "acc");
                d2ok.m23075h(element, "element");
                f7l8 f7l8VarMinusKey = acc.minusKey(element.getKey());
                C6217s c6217s = C6217s.INSTANCE;
                if (f7l8VarMinusKey == c6217s) {
                    return element;
                }
                InterfaceC6214n.toq toqVar = InterfaceC6214n.ep;
                InterfaceC6214n interfaceC6214n = (InterfaceC6214n) f7l8VarMinusKey.get(toqVar);
                if (interfaceC6214n == null) {
                    zyVar = new kotlin.coroutines.zy(f7l8VarMinusKey, element);
                } else {
                    f7l8 f7l8VarMinusKey2 = f7l8VarMinusKey.minusKey(toqVar);
                    if (f7l8VarMinusKey2 == c6217s) {
                        return new kotlin.coroutines.zy(element, interfaceC6214n);
                    }
                    zyVar = new kotlin.coroutines.zy(new kotlin.coroutines.zy(f7l8VarMinusKey2, element), interfaceC6214n);
                }
                return zyVar;
            }
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public static f7l8 m22734k(@InterfaceC7396q f7l8 f7l8Var, @InterfaceC7396q f7l8 context) {
            d2ok.m23075h(context, "context");
            return context == C6217s.INSTANCE ? f7l8Var : (f7l8) context.fold(f7l8Var, k.INSTANCE);
        }
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface toq extends f7l8 {

        /* JADX INFO: renamed from: kotlin.coroutines.f7l8$toq$k */
        /* JADX INFO: compiled from: CoroutineContext.kt */
        public static final class C6196k {
            /* JADX INFO: renamed from: k */
            public static <R> R m22735k(@InterfaceC7396q toq toqVar, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super toq, ? extends R> operation) {
                d2ok.m23075h(operation, "operation");
                return operation.invoke(r2, toqVar);
            }

            @InterfaceC7396q
            /* JADX INFO: renamed from: q */
            public static f7l8 m22736q(@InterfaceC7396q toq toqVar, @InterfaceC7396q f7l8 context) {
                d2ok.m23075h(context, "context");
                return C6195k.m22734k(toqVar, context);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @InterfaceC7395n
            public static <E extends toq> E toq(@InterfaceC7396q toq toqVar, @InterfaceC7396q zy<E> key) {
                d2ok.m23075h(key, "key");
                if (!d2ok.f7l8(toqVar.getKey(), key)) {
                    return null;
                }
                d2ok.n7h(toqVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return toqVar;
            }

            @InterfaceC7396q
            public static f7l8 zy(@InterfaceC7396q toq toqVar, @InterfaceC7396q zy<?> key) {
                d2ok.m23075h(key, "key");
                return d2ok.f7l8(toqVar.getKey(), key) ? C6217s.INSTANCE : toqVar;
            }
        }

        @Override // kotlin.coroutines.f7l8
        <R> R fold(R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super toq, ? extends R> interfaceC5979h);

        @Override // kotlin.coroutines.f7l8
        @InterfaceC7395n
        <E extends toq> E get(@InterfaceC7396q zy<E> zyVar);

        @InterfaceC7396q
        zy<?> getKey();

        @Override // kotlin.coroutines.f7l8
        @InterfaceC7396q
        f7l8 minusKey(@InterfaceC7396q zy<?> zyVar);
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface zy<E extends toq> {
    }

    <R> R fold(R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super toq, ? extends R> interfaceC5979h);

    @InterfaceC7395n
    <E extends toq> E get(@InterfaceC7396q zy<E> zyVar);

    @InterfaceC7396q
    f7l8 minusKey(@InterfaceC7396q zy<?> zyVar);

    @InterfaceC7396q
    f7l8 plus(@InterfaceC7396q f7l8 f7l8Var);
}

package kotlinx.coroutines.channels;

import cyoe.InterfaceC5979h;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C6227f;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.hb;
import kotlin.nn86;
import kotlin.was;
import kotlinx.coroutines.gc3c;
import kotlinx.coroutines.selects.InterfaceC6725q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"kotlinx/coroutines/channels/i", "kotlinx/coroutines/channels/fn3e", "kotlinx/coroutines/channels/zurt"}, d2 = {}, m22787k = 4, mv = {1, 6, 0})
public final class t8r {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final String f36852k = "Channel was closed";

    @InterfaceC7396q
    /* JADX INFO: renamed from: a */
    public static final <E> Object m23937a(@InterfaceC7396q lvui<? super E> lvuiVar, E e2) {
        return C6498i.toq(lvuiVar, e2);
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @hb(expression = "receiveCatching().getOrNull()", imports = {}))
    /* JADX INFO: renamed from: c */
    public static final <E> Object m23939c(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q InterfaceC6216q<? super E> interfaceC6216q) {
        return fn3e.m23886s(d3Var, interfaceC6216q);
    }

    @nn86
    @InterfaceC7396q
    public static final <E, R> d3<R> d2ok(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q cyoe.cdj<? super Integer, ? super E, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar) {
        return zurt.jp0y(d3Var, f7l8Var, cdjVar);
    }

    @nn86
    @InterfaceC7395n
    public static final <E, C extends Collection<? super E>> Object ek5k(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q C c2, @InterfaceC7396q InterfaceC6216q<? super C> interfaceC6216q) {
        return zurt.uv6(d3Var, c2, interfaceC6216q);
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    /* JADX INFO: renamed from: f */
    public static final <E> InterfaceC6725q<E> m23941f(@InterfaceC7396q d3<? extends E> d3Var) {
        return fn3e.m23887y(d3Var);
    }

    @nn86
    @InterfaceC7396q
    public static final cyoe.x2<Throwable, was> f7l8(@InterfaceC7396q d3<?> d3Var) {
        return zurt.toq(d3Var);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public static final <E> Object m23942g(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q cyoe.x2<? super E, was> x2Var, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        return fn3e.m23883n(d3Var, x2Var, interfaceC6216q);
    }

    @nn86
    @InterfaceC7395n
    public static final <E> Object i1(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q InterfaceC6216q<? super Set<E>> interfaceC6216q) {
        return zurt.hb(d3Var, interfaceC6216q);
    }

    @nn86
    @InterfaceC7396q
    public static final <E, K> d3<E> ld6(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q InterfaceC5979h<? super E, ? super InterfaceC6216q<? super K>, ? extends Object> interfaceC5979h) {
        return zurt.m23975g(d3Var, f7l8Var, interfaceC5979h);
    }

    @nn86
    @InterfaceC7395n
    /* JADX INFO: renamed from: m */
    public static final <E, C extends lvui<? super E>> Object m23948m(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q C c2, @InterfaceC7396q InterfaceC6216q<? super C> interfaceC6216q) {
        return zurt.lrht(d3Var, c2, interfaceC6216q);
    }

    @InterfaceC7395n
    @gc3c
    /* JADX INFO: renamed from: n */
    public static final <E> Object m23949n(@InterfaceC7396q InterfaceC6511s<E> interfaceC6511s, @InterfaceC7396q cyoe.x2<? super E, was> x2Var, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        return fn3e.m23885q(interfaceC6511s, x2Var, interfaceC6216q);
    }

    @nn86
    @InterfaceC7396q
    public static final <E, R, V> d3<V> nmn5(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q d3<? extends R> d3Var2, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q InterfaceC5979h<? super E, ? super R, ? extends V> interfaceC5979h) {
        return zurt.yz(d3Var, d3Var2, f7l8Var, interfaceC5979h);
    }

    @nn86
    @InterfaceC7396q
    public static final <E, R> d3<R> oc(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q InterfaceC5979h<? super E, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        return zurt.a9(d3Var, f7l8Var, interfaceC5979h);
    }

    /* JADX INFO: renamed from: q */
    public static final <E, R> R m23952q(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q cyoe.x2<? super d3<? extends E>, ? extends R> x2Var) {
        return (R) fn3e.zy(d3Var, x2Var);
    }

    @nn86
    @InterfaceC7396q
    public static final <E> d3<E> t8r(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q InterfaceC5979h<? super E, ? super InterfaceC6216q<? super Boolean>, ? extends Object> interfaceC5979h) {
        return zurt.n7h(d3Var, f7l8Var, interfaceC5979h);
    }

    @nn86
    public static final void toq(@InterfaceC7396q d3<?> d3Var, @InterfaceC7395n Throwable th) {
        fn3e.m23882k(d3Var, th);
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @hb(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void uv6(@InterfaceC7396q lvui<? super E> lvuiVar, E e2) throws InterruptedException {
        C6498i.m23894k(lvuiVar, e2);
    }

    @nn86
    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final cyoe.x2<Throwable, was> m23957y(@InterfaceC7396q d3<?>... d3VarArr) {
        return zurt.zy(d3VarArr);
    }

    @nn86
    @InterfaceC7395n
    public static final <K, V, M extends Map<? super K, ? super V>> Object y9n(@InterfaceC7396q d3<? extends C6227f<? extends K, ? extends V>> d3Var, @InterfaceC7396q M m2, @InterfaceC7396q InterfaceC6216q<? super M> interfaceC6216q) {
        return zurt.vyq(d3Var, m2, interfaceC6216q);
    }

    @InterfaceC7395n
    public static final <E> Object yz(@InterfaceC7396q d3<? extends E> d3Var, @InterfaceC7396q InterfaceC6216q<? super List<? extends E>> interfaceC6216q) {
        return fn3e.m23884p(d3Var, interfaceC6216q);
    }

    @nn86
    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public static final <E> d3<E> m23958z(@InterfaceC7396q d3<? extends E> d3Var) {
        return zurt.m23977i(d3Var);
    }

    @gc3c
    public static final <E, R> R zy(@InterfaceC7396q InterfaceC6511s<E> interfaceC6511s, @InterfaceC7396q cyoe.x2<? super d3<? extends E>, ? extends R> x2Var) {
        return (R) fn3e.toq(interfaceC6511s, x2Var);
    }
}

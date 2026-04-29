package kotlin.coroutines;

import cyoe.x2;
import kotlin.coroutines.f7l8;
import kotlin.coroutines.f7l8.toq;
import kotlin.jvm.internal.d2ok;
import kotlin.ki;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@ki
@yz(version = "1.3")
public abstract class toq<B extends f7l8.toq, E extends B> implements f7l8.zy<E> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final x2<f7l8.toq, E> f36262k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final f7l8.zy<?> f36263q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.f7l8$zy<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [cyoe.x2<? super kotlin.coroutines.f7l8$toq, ? extends E extends B>, cyoe.x2<kotlin.coroutines.f7l8$toq, E extends B>, java.lang.Object] */
    public toq(@InterfaceC7396q f7l8.zy<B> baseKey, @InterfaceC7396q x2<? super f7l8.toq, ? extends E> safeCast) {
        d2ok.m23075h(baseKey, "baseKey");
        d2ok.m23075h(safeCast, "safeCast");
        this.f36262k = safeCast;
        this.f36263q = baseKey instanceof toq ? (f7l8.zy<B>) ((toq) baseKey).f36263q : baseKey;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m22776k(@InterfaceC7396q f7l8.zy<?> key) {
        d2ok.m23075h(key, "key");
        return key == this || this.f36263q == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/f7l8$toq;)TE; */
    @InterfaceC7395n
    public final f7l8.toq toq(@InterfaceC7396q f7l8.toq element) {
        d2ok.m23075h(element, "element");
        return (f7l8.toq) this.f36262k.invoke(element);
    }
}

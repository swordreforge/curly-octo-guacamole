package kotlin.coroutines;

import cyoe.InterfaceC5979h;
import kotlin.coroutines.f7l8;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.coroutines.k */
/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.3")
public abstract class AbstractC6212k implements f7l8.toq {

    @InterfaceC7396q
    private final f7l8.zy<?> key;

    public AbstractC6212k(@InterfaceC7396q f7l8.zy<?> key) {
        d2ok.m23075h(key, "key");
        this.key = key;
    }

    @Override // kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    public <R> R fold(R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> interfaceC5979h) {
        return (R) f7l8.toq.C6196k.m22735k(this, r2, interfaceC5979h);
    }

    @Override // kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    @InterfaceC7395n
    public <E extends f7l8.toq> E get(@InterfaceC7396q f7l8.zy<E> zyVar) {
        return (E) f7l8.toq.C6196k.toq(this, zyVar);
    }

    @Override // kotlin.coroutines.f7l8.toq
    @InterfaceC7396q
    public f7l8.zy<?> getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    @InterfaceC7396q
    public f7l8 minusKey(@InterfaceC7396q f7l8.zy<?> zyVar) {
        return f7l8.toq.C6196k.zy(this, zyVar);
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7396q
    public f7l8 plus(@InterfaceC7396q f7l8 f7l8Var) {
        return f7l8.toq.C6196k.m22736q(this, f7l8Var);
    }
}

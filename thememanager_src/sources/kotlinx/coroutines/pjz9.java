package kotlinx.coroutines;

import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.f7l8;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/pjz9;", "Lkotlin/coroutines/f7l8$toq;", "Lkotlin/coroutines/f7l8$zy;", "getKey", "()Lkotlin/coroutines/f7l8$zy;", InterfaceC1925p.qn, C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class pjz9 implements f7l8.toq, f7l8.zy<pjz9> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final pjz9 f37317k = new pjz9();

    private pjz9() {
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
        return this;
    }

    @Override // kotlin.coroutines.f7l8.toq, kotlin.coroutines.f7l8
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 minusKey(@InterfaceC7396q f7l8.zy<?> zyVar) {
        return f7l8.toq.C6196k.zy(this, zyVar);
    }

    @Override // kotlin.coroutines.f7l8
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 plus(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        return f7l8.toq.C6196k.m22736q(this, f7l8Var);
    }
}

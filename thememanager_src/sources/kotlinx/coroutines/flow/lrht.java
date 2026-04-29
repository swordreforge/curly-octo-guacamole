package kotlinx.coroutines.flow;

import com.market.sdk.reflect.C4991s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.was;
import kotlinx.coroutines.flow.internal.AbstractC6587q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/lrht;", "Lkotlinx/coroutines/flow/internal/q;", "Lkotlinx/coroutines/flow/f;", "flow", "", "zy", "(Lkotlinx/coroutines/flow/f;)Z", "", "Lkotlin/coroutines/q;", "Lkotlin/was;", "n", "(Lkotlinx/coroutines/flow/f;)[Lkotlin/coroutines/q;", C7704k.y.toq.f95579toq, "()V", "f7l8", "()Z", "q", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", C4991s.f28129n, "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class lrht extends AbstractC6587q<C6562f<?>> {

    /* JADX INFO: renamed from: k */
    static final /* synthetic */ AtomicReferenceFieldUpdater f37036k = AtomicReferenceFieldUpdater.newUpdater(lrht.class, Object.class, "_state");

    @InterfaceC7396q
    volatile /* synthetic */ Object _state = null;

    public final boolean f7l8() {
        Object andSet = f37036k.getAndSet(this, C6557c.f36941k);
        kotlin.jvm.internal.d2ok.qrj(andSet);
        return andSet == C6557c.f81987toq;
    }

    /* JADX INFO: renamed from: g */
    public final void m24181g() {
        while (true) {
            Object obj = this._state;
            if (obj == null || obj == C6557c.f81987toq) {
                return;
            }
            if (obj == C6557c.f36941k) {
                if (androidx.concurrent.futures.toq.m906k(f37036k, this, obj, C6557c.f81987toq)) {
                    return;
                }
            } else if (androidx.concurrent.futures.toq.m906k(f37036k, this, obj, C6557c.f36941k)) {
                C6323o.k kVar = C6323o.Companion;
                ((kotlinx.coroutines.ki) obj).resumeWith(C6323o.m28280constructorimpl(was.f36763k));
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6587q
    @InterfaceC7396q
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public InterfaceC6216q<was>[] toq(@InterfaceC7396q C6562f<?> c6562f) {
        this._state = null;
        return kotlinx.coroutines.flow.internal.zy.f37027k;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public final Object m24183q(@InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        kotlinx.coroutines.ki kiVar = new kotlinx.coroutines.ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
        kiVar.a9();
        if (!androidx.concurrent.futures.toq.m906k(f37036k, this, C6557c.f36941k, kiVar)) {
            C6323o.k kVar = C6323o.Companion;
            kiVar.resumeWith(C6323o.m28280constructorimpl(was.f36763k));
        }
        Object objM24474z = kiVar.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z == C6199q.x2() ? objM24474z : was.f36763k;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6587q
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public boolean mo24077k(@InterfaceC7396q C6562f<?> c6562f) {
        if (this._state != null) {
            return false;
        }
        this._state = C6557c.f36941k;
        return true;
    }
}

package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/ixz;", "", "Lkotlinx/coroutines/u;", "k", "()Lkotlinx/coroutines/u;", "Lkotlin/was;", "zy", "()V", "eventLoop", "q", "(Lkotlinx/coroutines/u;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "toq", "Ljava/lang/ThreadLocal;", "ref", C4991s.f28129n, "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class ixz {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final ixz f37275k = new ixz();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final ThreadLocal<AbstractC6741u> f82051toq = new ThreadLocal<>();

    private ixz() {
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final AbstractC6741u m24455k() {
        return f82051toq.get();
    }

    /* JADX INFO: renamed from: q */
    public final void m24456q(@InterfaceC7396q AbstractC6741u abstractC6741u) {
        f82051toq.set(abstractC6741u);
    }

    @InterfaceC7396q
    public final AbstractC6741u toq() {
        ThreadLocal<AbstractC6741u> threadLocal = f82051toq;
        AbstractC6741u abstractC6741u = threadLocal.get();
        if (abstractC6741u != null) {
            return abstractC6741u;
        }
        AbstractC6741u abstractC6741uM23845k = c8jq.m23845k();
        threadLocal.set(abstractC6741uM23845k);
        return abstractC6741uM23845k;
    }

    public final void zy() {
        f82051toq.set(null);
    }
}

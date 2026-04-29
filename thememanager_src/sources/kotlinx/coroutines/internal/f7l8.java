package kotlinx.coroutines.internal;

import cyoe.InterfaceC5979h;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ao\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u000228\u0010\b\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0082\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000e\u001a\u00028\u0000\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0018\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/internal/dd;", "S", "", "id", "Lkotlin/Function2;", "Lkotlin/c;", "name", "prev", "createNewSegment", "Lkotlinx/coroutines/internal/x9kr;", "zy", "(Lkotlinx/coroutines/internal/dd;JLcyoe/h;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/y;", "N", "toq", "(Lkotlinx/coroutines/internal/y;)Lkotlinx/coroutines/internal/y;", "", "k", com.market.sdk.reflect.toq.f28131g, "POINTERS_SHIFT", "Lkotlinx/coroutines/internal/l;", "Lkotlinx/coroutines/internal/l;", "getCLOSED$annotations", "()V", "CLOSED", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final int f37210k = 16;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final C6679l f82009toq = new C6679l("CLOSED");

    /* JADX INFO: renamed from: q */
    private static /* synthetic */ void m24332q() {
    }

    @InterfaceC7396q
    public static final <N extends AbstractC6693y<N>> N toq(@InterfaceC7396q N n2) {
        while (true) {
            Object objM24434n = n2.m24434n();
            if (objM24434n == f82009toq) {
                return n2;
            }
            AbstractC6693y abstractC6693y = (AbstractC6693y) objM24434n;
            if (abstractC6693y != null) {
                n2 = (N) abstractC6693y;
            } else if (n2.m24437p()) {
                return n2;
            }
        }
    }

    private static final <S extends dd<S>> Object zy(S s2, long j2, InterfaceC5979h<? super Long, ? super S, ? extends S> interfaceC5979h) {
        while (true) {
            if (s2.kja0() >= j2 && !s2.f7l8()) {
                return x9kr.toq(s2);
            }
            Object objM24434n = s2.m24434n();
            if (objM24434n == f82009toq) {
                return x9kr.toq(f82009toq);
            }
            S sInvoke = (S) ((AbstractC6693y) objM24434n);
            if (sInvoke == null) {
                sInvoke = interfaceC5979h.invoke(Long.valueOf(s2.kja0() + 1), s2);
                if (s2.qrj(sInvoke)) {
                    if (s2.f7l8()) {
                        s2.x2();
                    }
                }
            }
            s2 = (Object) sInvoke;
        }
    }
}

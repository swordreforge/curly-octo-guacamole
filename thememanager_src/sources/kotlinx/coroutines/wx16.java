package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import kotlin.coroutines.InterfaceC6216q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {C0846k.zaso, "Ljava/lang/ThreadLocal;", "value", "Lkotlinx/coroutines/uc;", "k", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lkotlinx/coroutines/uc;", "", "n", "(Ljava/lang/ThreadLocal;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/was;", "zy", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class wx16 {
    /* JADX INFO: renamed from: g */
    private static final Object m24645g(ThreadLocal<?> threadLocal, InterfaceC6216q<? super Boolean> interfaceC6216q) {
        kotlin.jvm.internal.d3.m23089n(3);
        throw null;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> uc<T> m24646k(@InterfaceC7396q ThreadLocal<T> threadLocal, T t2) {
        return new kotlinx.coroutines.internal.uv6(t2, threadLocal);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public static final Object m24647n(@InterfaceC7396q ThreadLocal<?> threadLocal, @InterfaceC7396q InterfaceC6216q<? super Boolean> interfaceC6216q) {
        return kotlin.coroutines.jvm.internal.toq.m22766k(interfaceC6216q.getContext().get(new kotlinx.coroutines.internal.vyq(threadLocal)) != null);
    }

    /* JADX INFO: renamed from: q */
    private static final Object m24648q(ThreadLocal<?> threadLocal, InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
        kotlin.jvm.internal.d3.m23089n(3);
        throw null;
    }

    public static /* synthetic */ uc toq(ThreadLocal threadLocal, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = threadLocal.get();
        }
        return m24646k(threadLocal, obj);
    }

    @InterfaceC7395n
    public static final Object zy(@InterfaceC7396q ThreadLocal<?> threadLocal, @InterfaceC7396q InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
        if (interfaceC6216q.getContext().get(new kotlinx.coroutines.internal.vyq(threadLocal)) != null) {
            return kotlin.was.f36763k;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + interfaceC6216q.getContext()).toString());
    }
}

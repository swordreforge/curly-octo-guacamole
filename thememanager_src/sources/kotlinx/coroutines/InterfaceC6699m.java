package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.m */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/m;", "", "", "time", "Lkotlin/was;", "bek6", "(JLkotlin/coroutines/q;)Ljava/lang/Object;", "timeMillis", "Lkotlinx/coroutines/cdj;", "continuation", "zy", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/coroutines/f7l8;", "context", "Lkotlinx/coroutines/ch;", "i1", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@tfm
public interface InterfaceC6699m {

    /* JADX INFO: renamed from: kotlinx.coroutines.m$k */
    /* JADX INFO: compiled from: Delay.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class k {
        @InterfaceC7395n
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        /* JADX INFO: renamed from: k */
        public static Object m24489k(@InterfaceC7396q InterfaceC6699m interfaceC6699m, long j2, @InterfaceC7396q InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
            if (j2 <= 0) {
                return kotlin.was.f36763k;
            }
            ki kiVar = new ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
            kiVar.a9();
            interfaceC6699m.zy(j2, kiVar);
            Object objM24474z = kiVar.m24474z();
            if (objM24474z == C6199q.x2()) {
                C6211y.zy(interfaceC6216q);
            }
            return objM24474z == C6199q.x2() ? objM24474z : kotlin.was.f36763k;
        }

        @InterfaceC7396q
        public static ch toq(@InterfaceC7396q InterfaceC6699m interfaceC6699m, long j2, @InterfaceC7396q Runnable runnable, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
            return hb.m24301k().i1(j2, runnable, f7l8Var);
        }
    }

    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    Object bek6(long j2, @InterfaceC7396q InterfaceC6216q<? super kotlin.was> interfaceC6216q);

    @InterfaceC7396q
    ch i1(long j2, @InterfaceC7396q Runnable runnable, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var);

    void zy(long j2, @InterfaceC7396q cdj<? super kotlin.was> cdjVar);
}

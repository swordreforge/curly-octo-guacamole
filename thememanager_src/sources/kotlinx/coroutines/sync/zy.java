package kotlinx.coroutines.sync;

import kotlin.coroutines.InterfaceC6216q;
import kotlin.d3;
import kotlin.ld6;
import kotlin.qrj;
import kotlin.was;
import kotlinx.coroutines.selects.InterfaceC6723n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\u001f\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&J\u0014\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&R\u0014\u0010\f\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR(\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00000\r8&X§\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/sync/zy;", "", "owner", "", "k", "Lkotlin/was;", "zy", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "n", "q", "toq", "()Z", "isLocked", "Lkotlinx/coroutines/selects/n;", C7704k.y.toq.f95579toq, "()Lkotlinx/coroutines/selects/n;", "getOnLock$annotations", "()V", "onLock", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface zy {

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.zy$k */
    /* JADX INFO: compiled from: Mutex.kt */
    @d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6738k {
        @ld6(level = qrj.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ void m24617k() {
        }

        /* JADX INFO: renamed from: q */
        public static /* synthetic */ void m24618q(zy zyVar, Object obj, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i2 & 1) != 0) {
                obj = null;
            }
            zyVar.mo24604q(obj);
        }

        public static /* synthetic */ Object toq(zy zyVar, Object obj, InterfaceC6216q interfaceC6216q, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i2 & 1) != 0) {
                obj = null;
            }
            return zyVar.zy(obj, interfaceC6216q);
        }

        public static /* synthetic */ boolean zy(zy zyVar, Object obj, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i2 & 1) != 0) {
                obj = null;
            }
            return zyVar.mo24602k(obj);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    InterfaceC6723n<Object, zy> mo24601g();

    /* JADX INFO: renamed from: k */
    boolean mo24602k(@InterfaceC7395n Object obj);

    /* JADX INFO: renamed from: n */
    boolean mo24603n(@InterfaceC7396q Object obj);

    /* JADX INFO: renamed from: q */
    void mo24604q(@InterfaceC7395n Object obj);

    boolean toq();

    @InterfaceC7395n
    Object zy(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q);
}

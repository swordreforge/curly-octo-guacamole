package kotlinx.coroutines.sync;

import com.google.common.util.concurrent.C4849x;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.d3;
import kotlinx.coroutines.internal.dd;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.s */
/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\t\u0010\nJ,\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/sync/s;", "Lkotlinx/coroutines/internal/dd;", "", "index", "", "fn3e", "(I)Ljava/lang/Object;", "value", "Lkotlin/was;", "ni7", "(ILjava/lang/Object;)V", "expected", "", "i", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "zurt", "(ILjava/lang/Object;)Ljava/lang/Object;", "t8r", "(I)V", "", "toString", "()Ljava/lang/String;", AnimatedProperty.PROPERTY_NAME_H, "()I", "maxSlots", "", "id", "prev", "pointers", C4991s.f28129n, "(JLkotlinx/coroutines/sync/s;I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6736s extends dd<C6736s> {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    /* synthetic */ AtomicReferenceArray f37439n;

    public C6736s(long j2, @InterfaceC7395n C6736s c6736s, int i2) {
        super(j2, c6736s, i2);
        this.f37439n = new AtomicReferenceArray(C6737y.f37441g);
    }

    @InterfaceC7395n
    public final Object fn3e(int i2) {
        return this.f37439n.get(i2);
    }

    @Override // kotlinx.coroutines.internal.dd
    /* JADX INFO: renamed from: h */
    public int mo24327h() {
        return C6737y.f37441g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m24608i(int i2, @InterfaceC7395n Object obj, @InterfaceC7395n Object obj2) {
        return C4849x.m17025k(this.f37439n, i2, obj, obj2);
    }

    public final void ni7(int i2, @InterfaceC7395n Object obj) {
        this.f37439n.set(i2, obj);
    }

    public final void t8r(int i2) {
        this.f37439n.set(i2, C6737y.f37443n);
        cdj();
    }

    @InterfaceC7396q
    public String toString() {
        return "SemaphoreSegment[id=" + kja0() + ", hashCode=" + hashCode() + ']';
    }

    @InterfaceC7395n
    public final Object zurt(int i2, @InterfaceC7395n Object obj) {
        return this.f37439n.getAndSet(i2, obj);
    }
}

package kotlinx.coroutines.internal;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.dd;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/internal/dd;", "S", "Lkotlinx/coroutines/internal/y;", "", "ki", "()Z", "n7h", "Lkotlin/was;", "cdj", "()V", "", "zy", com.market.sdk.reflect.toq.f68928f7l8, "kja0", "()J", "id", "", AnimatedProperty.PROPERTY_NAME_H, "()I", "maxSlots", "f7l8", "removed", "prev", "pointers", C4991s.f28129n, "(JLkotlinx/coroutines/internal/dd;I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class dd<S extends dd<S>> extends AbstractC6693y<S> {

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f37208q = AtomicIntegerFieldUpdater.newUpdater(dd.class, "cleanedAndPointers");

    @InterfaceC7396q
    private volatile /* synthetic */ int cleanedAndPointers;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f82008zy;

    public dd(long j2, @InterfaceC7395n S s2, int i2) {
        super(s2);
        this.f82008zy = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    public final void cdj() {
        if (f37208q.incrementAndGet(this) != mo24327h() || m24439s()) {
            return;
        }
        x2();
    }

    @Override // kotlinx.coroutines.internal.AbstractC6693y
    public boolean f7l8() {
        return this.cleanedAndPointers == mo24327h() && !m24439s();
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo24327h();

    public final boolean ki() {
        int i2;
        do {
            i2 = this.cleanedAndPointers;
            if (!(i2 != mo24327h() || m24439s())) {
                return false;
            }
        } while (!f37208q.compareAndSet(this, i2, 65536 + i2));
        return true;
    }

    public final long kja0() {
        return this.f82008zy;
    }

    public final boolean n7h() {
        return f37208q.addAndGet(this, -65536) == mo24327h() && !m24439s();
    }
}

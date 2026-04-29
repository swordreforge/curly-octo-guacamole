package kotlinx.coroutines.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.tfm;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.q */
/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/internal/q;", C0846k.zaso, "Lkotlinx/coroutines/internal/oc;", "", "decision", "n", "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", C7704k.y.toq.f44691k, "failure", "Lkotlin/was;", "q", "(Ljava/lang/Object;Ljava/lang/Object;)V", "zy", C7704k.y.toq.f95579toq, "()Ljava/lang/Object;", "consensus", "", AnimatedProperty.PROPERTY_NAME_Y, "()Z", "isDecided", "", "f7l8", "()J", "opSequence", "k", "()Lkotlinx/coroutines/internal/q;", "atomicOp", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@tfm
public abstract class AbstractC6689q<T> extends oc {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f37235k = AtomicReferenceFieldUpdater.newUpdater(AbstractC6689q.class, Object.class, "_consensus");

    @InterfaceC7396q
    private volatile /* synthetic */ Object _consensus = zy.f37274k;

    public long f7l8() {
        return 0L;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public final Object m24395g() {
        return this._consensus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.oc
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public AbstractC6689q<?> mo24394k() {
        return this;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final Object m24396n(@InterfaceC7395n Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = zy.f37274k;
        return obj2 != obj3 ? obj2 : androidx.concurrent.futures.toq.m906k(f37235k, this, obj3, obj) ? obj : this._consensus;
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo24397q(T t2, @InterfaceC7395n Object obj);

    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    public abstract Object mo23910s(T t2);

    /* JADX INFO: renamed from: y */
    public final boolean m24398y() {
        return this._consensus != zy.f37274k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.oc
    @InterfaceC7395n
    public final Object zy(@InterfaceC7395n Object obj) {
        Object objM24396n = this._consensus;
        if (objM24396n == zy.f37274k) {
            objM24396n = m24396n(mo23910s(obj));
        }
        mo24397q(obj, objM24396n);
        return objM24396n;
    }
}

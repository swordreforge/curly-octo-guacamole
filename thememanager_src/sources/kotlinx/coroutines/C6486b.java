package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlinx.coroutines.internal.C6690r;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.b */
/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/b;", C0846k.zaso, "Lkotlinx/coroutines/internal/r;", "", "n2t", "()Z", "zwy", "", "state", "Lkotlin/was;", "lrht", "(Ljava/lang/Object;)V", "uc", "pc", "()Ljava/lang/Object;", "Lkotlin/coroutines/f7l8;", "context", "Lkotlin/coroutines/q;", "uCont", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;Lkotlin/coroutines/q;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class C6486b<T> extends C6690r<T> {

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f36787g = AtomicIntegerFieldUpdater.newUpdater(C6486b.class, "_decision");

    @InterfaceC7396q
    private volatile /* synthetic */ int _decision;

    public C6486b(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        super(f7l8Var, interfaceC6216q);
        this._decision = 0;
    }

    private final boolean n2t() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f36787g.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean zwy() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f36787g.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // kotlinx.coroutines.internal.C6690r, kotlinx.coroutines.etdu
    protected void lrht(@InterfaceC7395n Object obj) {
        uc(obj);
    }

    @InterfaceC7395n
    public final Object pc() {
        if (n2t()) {
            return C6199q.x2();
        }
        Object objKja0 = sok.kja0(mu());
        if (objKja0 instanceof a9) {
            throw ((a9) objKja0).f36774k;
        }
        return objKja0;
    }

    @Override // kotlinx.coroutines.internal.C6690r, kotlinx.coroutines.AbstractC6696k
    protected void uc(@InterfaceC7395n Object obj) {
        if (zwy()) {
            return;
        }
        kotlinx.coroutines.internal.qrj.f7l8(kotlin.coroutines.intrinsics.zy.m22747n(this.f37237n), eqxt.m24046k(obj, this.f37237n), null, 2, null);
    }
}

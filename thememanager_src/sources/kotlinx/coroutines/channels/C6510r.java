package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.was;
import kotlinx.coroutines.C6551e;
import kotlinx.coroutines.internal.C6679l;
import kotlinx.coroutines.internal.C6694z;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.r */
/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0012\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/channels/r;", C0846k.d9i, "Lkotlinx/coroutines/channels/d2ok;", "Lkotlinx/coroutines/internal/z$q;", "otherOp", "Lkotlinx/coroutines/internal/l;", "i1", "Lkotlin/was;", "y9n", "Lkotlinx/coroutines/channels/ni7;", "closed", "bf2", "", "toString", C7704k.y.toq.f95579toq, "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "pollResult", "Lkotlinx/coroutines/cdj;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/cdj;", "cont", C4991s.f28129n, "(Ljava/lang/Object;Lkotlinx/coroutines/cdj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class C6510r<E> extends d2ok {

    /* JADX INFO: renamed from: g */
    private final E f36849g;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    @InterfaceC6765n
    public final kotlinx.coroutines.cdj<was> f36850y;

    /* JADX WARN: Multi-variable type inference failed */
    public C6510r(E e2, @InterfaceC7396q kotlinx.coroutines.cdj<? super was> cdjVar) {
        this.f36849g = e2;
        this.f36850y = cdjVar;
    }

    @Override // kotlinx.coroutines.channels.d2ok
    /* JADX INFO: renamed from: b */
    public E mo23860b() {
        return this.f36849g;
    }

    @Override // kotlinx.coroutines.channels.d2ok
    public void bf2(@InterfaceC7396q ni7<?> ni7Var) {
        kotlinx.coroutines.cdj<was> cdjVar = this.f36850y;
        C6323o.k kVar = C6323o.Companion;
        cdjVar.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(ni7Var.ch())));
    }

    @Override // kotlinx.coroutines.channels.d2ok
    @InterfaceC7395n
    public C6679l i1(@InterfaceC7395n C6694z.q qVar) {
        if (this.f36850y.qrj(was.f36763k, qVar == null ? null : qVar.f82045zy) == null) {
            return null;
        }
        if (qVar != null) {
            qVar.m24451q();
        }
        return kotlinx.coroutines.t8r.f37447q;
    }

    @Override // kotlinx.coroutines.internal.C6694z
    @InterfaceC7396q
    public String toString() {
        return C6551e.m24040k(this) + '@' + C6551e.toq(this) + '(' + mo23860b() + ')';
    }

    @Override // kotlinx.coroutines.channels.d2ok
    public void y9n() {
        this.f36850y.mo23848r(kotlinx.coroutines.t8r.f37447q);
    }
}

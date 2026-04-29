package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import kotlinx.coroutines.C6551e;
import kotlinx.coroutines.internal.C6679l;
import kotlinx.coroutines.internal.C6694z;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, d2 = {"Lkotlinx/coroutines/channels/ni7;", C0846k.d9i, "Lkotlinx/coroutines/channels/d2ok;", "Lkotlinx/coroutines/channels/oc;", "Lkotlinx/coroutines/internal/z$q;", "otherOp", "Lkotlinx/coroutines/internal/l;", "i1", "Lkotlin/was;", "y9n", "value", "z", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/z$q;)Lkotlinx/coroutines/internal/l;", AnimatedProperty.PROPERTY_NAME_Y, "(Ljava/lang/Object;)V", "closed", "bf2", "", "toString", "", C7704k.y.toq.f95579toq, "Ljava/lang/Throwable;", "closeCause", "ch", "()Ljava/lang/Throwable;", "sendException", AnimatedProperty.PROPERTY_NAME_X, "receiveException", "a", "()Lkotlinx/coroutines/channels/ni7;", "offerResult", "zp", "pollResult", C4991s.f28129n, "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class ni7<E> extends d2ok implements oc<E> {

    /* JADX INFO: renamed from: g */
    @InterfaceC6765n
    @InterfaceC7395n
    public final Throwable f36836g;

    public ni7(@InterfaceC7395n Throwable th) {
        this.f36836g = th;
    }

    @Override // kotlinx.coroutines.channels.oc
    @InterfaceC7396q
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ni7<E> mo23891q() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.d2ok
    public void bf2(@InterfaceC7396q ni7<?> ni7Var) {
    }

    @InterfaceC7396q
    public final Throwable ch() {
        Throwable th = this.f36836g;
        return th == null ? new C6517z(t8r.f36852k) : th;
    }

    @Override // kotlinx.coroutines.channels.d2ok
    @InterfaceC7396q
    public C6679l i1(@InterfaceC7395n C6694z.q qVar) {
        C6679l c6679l = kotlinx.coroutines.t8r.f37447q;
        if (qVar != null) {
            qVar.m24451q();
        }
        return c6679l;
    }

    @Override // kotlinx.coroutines.internal.C6694z
    @InterfaceC7396q
    public String toString() {
        return "Closed@" + C6551e.toq(this) + '[' + this.f36836g + ']';
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: x */
    public final Throwable m23929x() {
        Throwable th = this.f36836g;
        return th == null ? new fu4(t8r.f36852k) : th;
    }

    @Override // kotlinx.coroutines.channels.oc
    /* JADX INFO: renamed from: y */
    public void mo23908y(E e2) {
    }

    @Override // kotlinx.coroutines.channels.d2ok
    public void y9n() {
    }

    @Override // kotlinx.coroutines.channels.oc
    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public C6679l mo23909z(E e2, @InterfaceC7395n C6694z.q qVar) {
        C6679l c6679l = kotlinx.coroutines.t8r.f37447q;
        if (qVar != null) {
            qVar.m24451q();
        }
        return c6679l;
    }

    @Override // kotlinx.coroutines.channels.d2ok
    @InterfaceC7396q
    /* JADX INFO: renamed from: zp, reason: merged with bridge method [inline-methods] */
    public ni7<E> mo23860b() {
        return this;
    }
}

package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.was;
import kotlinx.coroutines.flow.internal.AbstractC6584n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.g */
/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J!\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0094@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R>\u0010\u0017\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/flow/g;", C0846k.zaso, "Lkotlinx/coroutines/flow/internal/n;", "Lkotlin/coroutines/f7l8;", "context", "", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "ld6", "Lkotlinx/coroutines/channels/jp0y;", "scope", "Lkotlin/was;", "p", "(Lkotlinx/coroutines/channels/jp0y;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "toString", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", C7704k.y.toq.f95579toq, "Lcyoe/h;", "block", C4991s.f28129n, "(Lcyoe/h;Lkotlin/coroutines/f7l8;ILkotlinx/coroutines/channels/qrj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
class C6572g<T> extends AbstractC6584n<T> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final InterfaceC5979h<kotlinx.coroutines.channels.jp0y<? super T>, InterfaceC6216q<? super was>, Object> f36965g;

    public /* synthetic */ C6572g(InterfaceC5979h interfaceC5979h, kotlin.coroutines.f7l8 f7l8Var, int i2, kotlinx.coroutines.channels.qrj qrjVar, int i3, kotlin.jvm.internal.ni7 ni7Var) {
        this(interfaceC5979h, (i3 & 2) != 0 ? C6217s.INSTANCE : f7l8Var, (i3 & 4) != 0 ? -2 : i2, (i3 & 8) != 0 ? kotlinx.coroutines.channels.qrj.SUSPEND : qrjVar);
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ Object m24105h(C6572g c6572g, kotlinx.coroutines.channels.jp0y jp0yVar, InterfaceC6216q interfaceC6216q) {
        Object objInvoke = c6572g.f36965g.invoke(jp0yVar, interfaceC6216q);
        return objInvoke == C6199q.x2() ? objInvoke : was.f36763k;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    protected AbstractC6584n<T> ld6(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        return new C6572g(this.f36965g, f7l8Var, i2, qrjVar);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    protected Object mo24106p(@InterfaceC7396q kotlinx.coroutines.channels.jp0y<? super T> jp0yVar, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        return m24105h(this, jp0yVar, interfaceC6216q);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    public String toString() {
        return "block[" + this.f36965g + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6572g(@InterfaceC7396q InterfaceC5979h<? super kotlinx.coroutines.channels.jp0y<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        super(f7l8Var, i2, qrjVar);
        this.f36965g = interfaceC5979h;
    }
}

package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.flow.internal.AbstractC6584n;
import kotlinx.coroutines.flow.internal.C6595z;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.n */
/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0006\u0010%\u001a\u00020#\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0012\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lkotlinx/coroutines/flow/n;", C0846k.zaso, "Lkotlinx/coroutines/flow/internal/n;", "Lkotlin/was;", AnimatedProperty.PROPERTY_NAME_H, "()V", "Lkotlin/coroutines/f7l8;", "context", "", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "ld6", "(Lkotlin/coroutines/f7l8;ILkotlinx/coroutines/channels/qrj;)Lkotlinx/coroutines/flow/internal/n;", "Lkotlinx/coroutines/flow/s;", "x2", "()Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/channels/jp0y;", "scope", "p", "(Lkotlinx/coroutines/channels/jp0y;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/f;", "Lkotlinx/coroutines/channels/d3;", "kja0", "(Lkotlinx/coroutines/f;)Lkotlinx/coroutines/channels/d3;", "Lkotlinx/coroutines/flow/p;", "collector", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", AnimatedProperty.PROPERTY_NAME_Y, "()Ljava/lang/String;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/channels/d3;", "channel", "", com.market.sdk.reflect.toq.f68929toq, "consume", C4991s.f28129n, "(Lkotlinx/coroutines/channels/d3;ZLkotlin/coroutines/f7l8;ILkotlinx/coroutines/channels/qrj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6606n<T> extends AbstractC6584n<T> {

    /* JADX INFO: renamed from: s */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f37038s = AtomicIntegerFieldUpdater.newUpdater(C6606n.class, "consumed");

    @InterfaceC7396q
    private volatile /* synthetic */ int consumed;

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final kotlinx.coroutines.channels.d3<T> f37039g;

    /* JADX INFO: renamed from: y */
    private final boolean f37040y;

    public /* synthetic */ C6606n(kotlinx.coroutines.channels.d3 d3Var, boolean z2, kotlin.coroutines.f7l8 f7l8Var, int i2, kotlinx.coroutines.channels.qrj qrjVar, int i3, kotlin.jvm.internal.ni7 ni7Var) {
        this(d3Var, z2, (i3 & 4) != 0 ? C6217s.INSTANCE : f7l8Var, (i3 & 8) != 0 ? -3 : i2, (i3 & 16) != 0 ? kotlinx.coroutines.channels.qrj.SUSPEND : qrjVar);
    }

    /* JADX INFO: renamed from: h */
    private final void m24192h() {
        if (this.f37040y) {
            if (!(f37038s.getAndSet(this, 1) == 0)) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n, kotlinx.coroutines.flow.InterfaceC6622s
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        if (this.f36994q != -3) {
            Object objMo5262k = super.mo5262k(interfaceC6618p, interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }
        m24192h();
        Object objM24228n = qrj.m24228n(interfaceC6618p, this.f37039g, this.f37040y, interfaceC6216q);
        return objM24228n == C6199q.x2() ? objM24228n : was.f36763k;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    public kotlinx.coroutines.channels.d3<T> kja0(@InterfaceC7396q InterfaceC6556f interfaceC6556f) {
        m24192h();
        return this.f36994q == -3 ? this.f37039g : super.kja0(interfaceC6556f);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    protected AbstractC6584n<T> ld6(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        return new C6606n(this.f37039g, this.f37040y, f7l8Var, i2, qrjVar);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    protected Object mo24106p(@InterfaceC7396q kotlinx.coroutines.channels.jp0y<? super T> jp0yVar, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        Object objM24228n = qrj.m24228n(new C6595z(jp0yVar), this.f37039g, this.f37040y, interfaceC6216q);
        return objM24228n == C6199q.x2() ? objM24228n : was.f36763k;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    public InterfaceC6622s<T> x2() {
        return new C6606n(this.f37039g, this.f37040y, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    protected String mo24122y() {
        return kotlin.jvm.internal.d2ok.mcp("channel=", this.f37039g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6606n(@InterfaceC7396q kotlinx.coroutines.channels.d3<? extends T> d3Var, boolean z2, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        super(f7l8Var, i2, qrjVar);
        this.f37039g = d3Var;
        this.f37040y = z2;
        this.consumed = 0;
    }
}

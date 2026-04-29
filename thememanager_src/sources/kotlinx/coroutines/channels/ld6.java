package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.hb;
import kotlin.was;
import kotlinx.coroutines.AbstractC6696k;
import kotlinx.coroutines.C6697l;
import kotlinx.coroutines.InterfaceC6533d;
import kotlinx.coroutines.channels.lvui;
import kotlinx.coroutines.etdu;
import kotlinx.coroutines.gbni;
import kotlinx.coroutines.selects.InterfaceC6723n;
import kotlinx.coroutines.zsr0;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B%\u0012\u0006\u00104\u001a\u000203\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u00105\u001a\u00020\u000e¢\u0006\u0004\b6\u00107J.\u0010\f\u001a\u00020\u00032#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0006H\u0097\u0001J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0001J\u001b\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u0016\u0010\u001b\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u000eH\u0014J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016R \u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+0*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010(R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lkotlinx/coroutines/channels/ld6;", C0846k.d9i, "Lkotlinx/coroutines/k;", "Lkotlin/was;", "Lkotlinx/coroutines/channels/jp0y;", "Lkotlinx/coroutines/channels/s;", "Lkotlin/Function1;", "", "Lkotlin/c;", "name", "cause", "handler", "n", "element", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/d3;", "f7l8", "d3", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ki;", C7704k.y.toq.f44691k, "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "q", "hb", "value", "pc", "(Lkotlin/was;)V", "handled", "ixz", "jp0y", "Lkotlinx/coroutines/channels/s;", "ebn", "()Lkotlinx/coroutines/channels/s;", "_channel", "oc", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/n;", "Lkotlinx/coroutines/channels/lvui;", C7704k.y.toq.f95579toq, "()Lkotlinx/coroutines/selects/n;", "onSend", "isActive", "zy", "()Lkotlinx/coroutines/channels/lvui;", "channel", "Lkotlin/coroutines/f7l8;", "parentContext", C7704k.q.f95568zurt, C4991s.f28129n, "(Lkotlin/coroutines/f7l8;Lkotlinx/coroutines/channels/s;Z)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
class ld6<E> extends AbstractC6696k<was> implements jp0y<E>, InterfaceC6511s<E> {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final InterfaceC6511s<E> f36828n;

    public ld6(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q InterfaceC6511s<E> interfaceC6511s, boolean z2) {
        super(f7l8Var, false, z2);
        this.f36828n = interfaceC6511s;
        fnq8((gbni) f7l8Var.get(gbni.ygy));
    }

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC7395n
    public Object d3(E e2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        return this.f36828n.d3(e2, interfaceC6216q);
    }

    @InterfaceC7396q
    protected final InterfaceC6511s<E> ebn() {
        return this.f36828n;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6511s
    @InterfaceC7396q
    public d3<E> f7l8() {
        return this.f36828n.f7l8();
    }

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public InterfaceC6723n<E, lvui<E>> mo23919g() {
        return this.f36828n.mo23919g();
    }

    @Override // kotlinx.coroutines.etdu
    public void hb(@InterfaceC7396q Throwable th) {
        CancellationException cancellationExceptionB3e = etdu.b3e(this, th, null, 1, null);
        this.f36828n.mo23877q(cancellationExceptionB3e);
        m24056e(cancellationExceptionB3e);
    }

    @Override // kotlinx.coroutines.AbstractC6696k, kotlinx.coroutines.etdu, kotlinx.coroutines.gbni
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.AbstractC6696k
    protected void ixz(@InterfaceC7396q Throwable th, boolean z2) {
        if (this.f36828n.mo23876k(th) || z2) {
            return;
        }
        C6697l.toq(getContext(), th);
    }

    @Override // kotlinx.coroutines.channels.lvui
    /* JADX INFO: renamed from: jp0y */
    public boolean mo23876k(@InterfaceC7395n Throwable th) {
        boolean zMo23876k = this.f36828n.mo23876k(th);
        start();
        return zMo23876k;
    }

    @Override // kotlinx.coroutines.etdu, kotlinx.coroutines.gbni, kotlinx.coroutines.channels.d3
    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean mo23861k(Throwable th) {
        if (th == null) {
            th = new zsr0(mo24058m(), null, this);
        }
        hb(th);
        return true;
    }

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC6533d
    /* JADX INFO: renamed from: n */
    public void mo23920n(@InterfaceC7396q cyoe.x2<? super Throwable, was> x2Var) {
        this.f36828n.mo23920n(x2Var);
    }

    @Override // kotlinx.coroutines.channels.lvui
    public boolean oc() {
        return this.f36828n.oc();
    }

    @Override // kotlinx.coroutines.channels.lvui
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @hb(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e2) {
        return this.f36828n.offer(e2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC6696k
    /* JADX INFO: renamed from: pc, reason: merged with bridge method [inline-methods] */
    public void mo28293do(@InterfaceC7396q was wasVar) {
        lvui.C6502k.m23922k(this.f36828n, null, 1, null);
    }

    @Override // kotlinx.coroutines.etdu, kotlinx.coroutines.gbni, kotlinx.coroutines.channels.d3
    /* JADX INFO: renamed from: q */
    public final void mo23862q(@InterfaceC7395n CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new zsr0(mo24058m(), null, this);
        }
        hb(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public Object mo23921s(E e2) {
        return this.f36828n.mo23921s(e2);
    }

    @Override // kotlinx.coroutines.channels.jp0y
    @InterfaceC7396q
    public lvui<E> zy() {
        return this;
    }
}

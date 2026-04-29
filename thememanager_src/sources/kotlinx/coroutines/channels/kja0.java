package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.hb;
import kotlin.internal.InterfaceC6244y;
import kotlin.was;
import kotlinx.coroutines.AbstractC6696k;
import kotlinx.coroutines.InterfaceC6533d;
import kotlinx.coroutines.etdu;
import kotlinx.coroutines.selects.InterfaceC6723n;
import kotlinx.coroutines.selects.InterfaceC6725q;
import kotlinx.coroutines.zsr0;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: ChannelCoroutine.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010?\u001a\u00020>\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010@\u001a\u00020\u0007\u0012\u0006\u0010A\u001a\u00020\u0007¢\u0006\u0004\bB\u0010CJ\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J.\u0010\r\u001a\u00020\u00032#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\tH\u0097\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0003J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096Aø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u0014J'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0012\u0010 \u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0016\u0010#\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b.\u0010*R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170/8\u0016X\u0096\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b3\u00101R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000/8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b5\u00101R&\u0010;\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000008078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010'\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Lkotlinx/coroutines/channels/kja0;", C0846k.d9i, "Lkotlinx/coroutines/k;", "Lkotlin/was;", "Lkotlinx/coroutines/channels/n7h;", "", "cause", "", "jp0y", "Lkotlin/Function1;", "Lkotlin/c;", "name", "handler", "n", "Lkotlinx/coroutines/channels/h;", "iterator", "element", "offer", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "fti", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ki;", "mcp", "o1t", "d3", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "z", C7704k.y.toq.f44691k, "(Ljava/lang/Object;)Ljava/lang/Object;", "cancel", "k", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "q", "hb", "Lkotlinx/coroutines/channels/n7h;", "ebn", "()Lkotlinx/coroutines/channels/n7h;", "_channel", "toq", "()Z", "isClosedForReceive", "oc", "isClosedForSend", "isEmpty", "Lkotlinx/coroutines/selects/q;", "t8r", "()Lkotlinx/coroutines/selects/q;", "onReceive", "fn3e", "onReceiveCatching", "zurt", "onReceiveOrNull", "Lkotlinx/coroutines/selects/n;", "Lkotlinx/coroutines/channels/lvui;", C7704k.y.toq.f95579toq, "()Lkotlinx/coroutines/selects/n;", "onSend", "zy", "channel", "Lkotlin/coroutines/f7l8;", "parentContext", "initParentJob", C7704k.q.f95568zurt, C4991s.f28129n, "(Lkotlin/coroutines/f7l8;Lkotlinx/coroutines/channels/n7h;ZZ)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public class kja0<E> extends AbstractC6696k<was> implements n7h<E> {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final n7h<E> f36827n;

    public kja0(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q n7h<E> n7hVar, boolean z2, boolean z3) {
        super(f7l8Var, z2, z3);
        this.f36827n = n7hVar;
    }

    @Override // kotlinx.coroutines.etdu, kotlinx.coroutines.gbni, kotlinx.coroutines.channels.d3
    public /* synthetic */ void cancel() {
        hb(new zsr0(mo24058m(), null, this));
    }

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC7395n
    public Object d3(E e2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        return this.f36827n.d3(e2, interfaceC6216q);
    }

    @InterfaceC7396q
    protected final n7h<E> ebn() {
        return this.f36827n;
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7396q
    public InterfaceC6725q<ki<E>> fn3e() {
        return this.f36827n.fn3e();
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7395n
    public Object fti(@InterfaceC7396q InterfaceC6216q<? super E> interfaceC6216q) {
        return this.f36827n.fti(interfaceC6216q);
    }

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public InterfaceC6723n<E, lvui<E>> mo23919g() {
        return this.f36827n.mo23919g();
    }

    @Override // kotlinx.coroutines.etdu
    public void hb(@InterfaceC7396q Throwable th) {
        CancellationException cancellationExceptionB3e = etdu.b3e(this, th, null, 1, null);
        this.f36827n.mo23862q(cancellationExceptionB3e);
        m24056e(cancellationExceptionB3e);
    }

    @Override // kotlinx.coroutines.channels.d3
    public boolean isEmpty() {
        return this.f36827n.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7396q
    public InterfaceC6497h<E> iterator() {
        return this.f36827n.iterator();
    }

    @Override // kotlinx.coroutines.channels.lvui
    /* JADX INFO: renamed from: jp0y */
    public boolean mo23876k(@InterfaceC7395n Throwable th) {
        return this.f36827n.mo23876k(th);
    }

    @Override // kotlinx.coroutines.etdu, kotlinx.coroutines.gbni, kotlinx.coroutines.channels.d3
    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean mo23861k(Throwable th) {
        hb(new zsr0(mo24058m(), null, this));
        return true;
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7395n
    public Object mcp(@InterfaceC7396q InterfaceC6216q<? super ki<? extends E>> interfaceC6216q) {
        Object objMcp = this.f36827n.mcp(interfaceC6216q);
        C6199q.x2();
        return objMcp;
    }

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC6533d
    /* JADX INFO: renamed from: n */
    public void mo23920n(@InterfaceC7396q cyoe.x2<? super Throwable, was> x2Var) {
        this.f36827n.mo23920n(x2Var);
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC6244y
    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @hb(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object o1t(@InterfaceC7396q InterfaceC6216q<? super E> interfaceC6216q) {
        return this.f36827n.o1t(interfaceC6216q);
    }

    @Override // kotlinx.coroutines.channels.lvui
    public boolean oc() {
        return this.f36827n.oc();
    }

    @Override // kotlinx.coroutines.channels.lvui
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @hb(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e2) {
        return this.f36827n.offer(e2);
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @hb(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return this.f36827n.poll();
    }

    @Override // kotlinx.coroutines.etdu, kotlinx.coroutines.gbni, kotlinx.coroutines.channels.d3
    /* JADX INFO: renamed from: q */
    public final void mo23862q(@InterfaceC7395n CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new zsr0(mo24058m(), null, this);
        }
        hb(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public Object mo23921s(E e2) {
        return this.f36827n.mo23921s(e2);
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7396q
    public InterfaceC6725q<E> t8r() {
        return this.f36827n.t8r();
    }

    @Override // kotlinx.coroutines.channels.d3
    public boolean toq() {
        return this.f36827n.toq();
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public Object mo23863z() {
        return this.f36827n.mo23863z();
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7396q
    public InterfaceC6725q<E> zurt() {
        return this.f36827n.zurt();
    }

    @InterfaceC7396q
    public final n7h<E> zy() {
        return this;
    }
}

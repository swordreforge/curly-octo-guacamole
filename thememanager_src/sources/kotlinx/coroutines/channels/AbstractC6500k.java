package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.hb;
import kotlin.internal.InterfaceC6244y;
import kotlin.was;
import kotlinx.coroutines.C6551e;
import kotlinx.coroutines.C6668i;
import kotlinx.coroutines.cdj;
import kotlinx.coroutines.ch;
import kotlinx.coroutines.channels.InterfaceC6497h;
import kotlinx.coroutines.channels.ki;
import kotlinx.coroutines.channels.n7h;
import kotlinx.coroutines.internal.C6679l;
import kotlinx.coroutines.internal.C6694z;
import kotlinx.coroutines.selects.InterfaceC6720g;
import kotlinx.coroutines.selects.InterfaceC6725q;
import l05.InterfaceC6765n;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import tww7.C7677k;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.k */
/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0007)GW,XYZB)\u0012 \u0010T\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010Rj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`S¢\u0006\u0004\bU\u0010VJ!\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002JT\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JZ\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u0004* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00132\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0014J\u0013\u0010 \u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\"\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010!J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000#ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0012\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0007J\u0016\u0010,\u001a\u00020\u00132\u000e\u0010(\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+J\u0019\u0010-\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u000bH\u0014J/\u00106\u001a\u00020\u00132\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\n\u00105\u001a\u0006\u0012\u0002\b\u000304H\u0014ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008H\u0086\u0002J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:H\u0004J\u0010\u0010=\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010<H\u0014J\b\u0010>\u001a\u00020\u0013H\u0014J\b\u0010?\u001a\u00020\u0013H\u0014R\u0014\u0010B\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0014\u0010F\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bE\u0010AR\u0014\u0010H\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010AR\u0014\u0010I\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010AR\u0014\u0010K\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010AR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR \u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#0L8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\bP\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006["}, d2 = {"Lkotlinx/coroutines/channels/k;", C0846k.d9i, "Lkotlinx/coroutines/channels/zy;", "Lkotlinx/coroutines/channels/n7h;", "R", "", "receiveMode", AnimatedProperty.PROPERTY_NAME_X, "(ILkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/gvn7;", "receive", "", "hb", "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/Function2;", "", "Lkotlin/coroutines/q;", "block", "Lkotlin/was;", "ch", "(Lkotlinx/coroutines/selects/g;ILcyoe/h;)V", "value", "lv5", "(Lcyoe/h;Lkotlinx/coroutines/selects/g;ILjava/lang/Object;)V", "o", "(Lkotlinx/coroutines/selects/g;Lcyoe/h;I)Z", "Lkotlinx/coroutines/cdj;", "cont", "nmn5", "a", "zp", "fti", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "j", "Lkotlinx/coroutines/channels/ki;", "mcp", "z", "()Ljava/lang/Object;", "", "cause", "k", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "q", "e", "(Ljava/lang/Throwable;)Z", "wasClosed", "b", "Lkotlinx/coroutines/internal/cdj;", "Lkotlinx/coroutines/channels/d2ok;", "list", "Lkotlinx/coroutines/channels/ni7;", "closed", "bf2", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/ni7;)V", "Lkotlinx/coroutines/channels/h;", "iterator", "Lkotlinx/coroutines/channels/k$f7l8;", "nn86", "Lkotlinx/coroutines/channels/oc;", "hyr", "a98o", "i1", "ek5k", "()Z", "isBufferAlwaysEmpty", "yz", "isBufferEmpty", "m", "hasReceiveOrClosed", "toq", "isClosedForReceive", "isEmpty", "y9n", "isEmptyImpl", "Lkotlinx/coroutines/selects/q;", "t8r", "()Lkotlinx/coroutines/selects/q;", "onReceive", "fn3e", "onReceiveCatching", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", C4991s.f28129n, "(Lcyoe/x2;)V", "zy", "n", C7704k.y.toq.f95579toq, "f7l8", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class AbstractC6500k<E> extends kotlinx.coroutines.channels.zy<E> implements n7h<E> {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.k$f7l8 */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/k$f7l8;", C0846k.d9i, "Lkotlinx/coroutines/internal/z$n;", "Lkotlinx/coroutines/channels/d2ok;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lkotlinx/coroutines/internal/z;", "affected", "", "n", "Lkotlinx/coroutines/internal/z$q;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "p", "Lkotlin/was;", "ld6", "Lkotlinx/coroutines/internal/ni7;", "queue", C4991s.f28129n, "(Lkotlinx/coroutines/internal/ni7;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    protected static final class f7l8<E> extends C6694z.n<d2ok> {
        public f7l8(@InterfaceC7396q kotlinx.coroutines.internal.ni7 ni7Var) {
            super(ni7Var);
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        public void ld6(@InterfaceC7396q C6694z c6694z) {
            ((d2ok) c6694z).a98o();
        }

        @Override // kotlinx.coroutines.internal.C6694z.n, kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7395n
        /* JADX INFO: renamed from: n */
        protected Object mo23903n(@InterfaceC7396q C6694z c6694z) {
            if (c6694z instanceof ni7) {
                return c6694z;
            }
            if (c6694z instanceof d2ok) {
                return null;
            }
            return kotlinx.coroutines.channels.toq.f36853g;
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7395n
        /* JADX INFO: renamed from: p */
        public Object mo23904p(@InterfaceC7396q C6694z.q qVar) {
            C6679l c6679lI1 = ((d2ok) qVar.f37272k).i1(qVar);
            if (c6679lI1 == null) {
                return kotlinx.coroutines.internal.o1t.f37233k;
            }
            Object obj = kotlinx.coroutines.internal.zy.f82050toq;
            if (c6679lI1 == obj) {
                return obj;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.k$g */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/k$g;", "Lkotlinx/coroutines/f7l8;", "", "cause", "Lkotlin/was;", "k", "", "toString", "Lkotlinx/coroutines/channels/gvn7;", "Lkotlinx/coroutines/channels/gvn7;", "receive", C4991s.f28129n, "(Lkotlinx/coroutines/channels/k;Lkotlinx/coroutines/channels/gvn7;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private final class g extends kotlinx.coroutines.f7l8 {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final gvn7<?> f36809k;

        public g(@InterfaceC7396q gvn7<?> gvn7Var) {
            this.f36809k = gvn7Var;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Throwable th) {
            mo23837k(th);
            return was.f36763k;
        }

        @Override // kotlinx.coroutines.AbstractC6666h
        /* JADX INFO: renamed from: k */
        public void mo23837k(@InterfaceC7395n Throwable th) {
            if (this.f36809k.nn86()) {
                AbstractC6500k.this.i1();
            }
        }

        @InterfaceC7396q
        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f36809k + ']';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.k$k */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0013\u0010\u0007\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005H\u0096Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/channels/k$k;", C0846k.d9i, "Lkotlinx/coroutines/channels/h;", "", "result", "", "n", C7704k.y.toq.f95579toq, "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "toq", "next", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/k;", "k", "Lkotlinx/coroutines/channels/k;", "channel", "Ljava/lang/Object;", "q", "f7l8", "(Ljava/lang/Object;)V", C4991s.f28129n, "(Lkotlinx/coroutines/channels/k;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class k<E> implements InterfaceC6497h<E> {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        @InterfaceC6765n
        public final AbstractC6500k<E> f36811k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7395n
        private Object f81957toq = kotlinx.coroutines.channels.toq.f36853g;

        public k(@InterfaceC7396q AbstractC6500k<E> abstractC6500k) {
            this.f36811k = abstractC6500k;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public final Object m23905g(InterfaceC6216q<? super Boolean> interfaceC6216q) {
            kotlinx.coroutines.ki qVar = C6668i.toq(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q));
            q qVar2 = new q(this, qVar);
            while (true) {
                if (this.f36811k.hb(qVar2)) {
                    this.f36811k.nmn5(qVar, qVar2);
                    break;
                }
                Object objMo23879a = this.f36811k.mo23879a();
                f7l8(objMo23879a);
                if (objMo23879a instanceof ni7) {
                    ni7 ni7Var = (ni7) objMo23879a;
                    if (ni7Var.f36836g == null) {
                        C6323o.k kVar = C6323o.Companion;
                        qVar.resumeWith(C6323o.m28280constructorimpl(kotlin.coroutines.jvm.internal.toq.m22766k(false)));
                    } else {
                        C6323o.k kVar2 = C6323o.Companion;
                        qVar.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(ni7Var.m23929x())));
                    }
                } else if (objMo23879a != kotlinx.coroutines.channels.toq.f36853g) {
                    Boolean boolM22766k = kotlin.coroutines.jvm.internal.toq.m22766k(true);
                    cyoe.x2<E, was> x2Var = this.f36811k.f36868k;
                    qVar.n7h(boolM22766k, x2Var == null ? null : kotlinx.coroutines.internal.d3.m24325k(x2Var, objMo23879a, qVar.getContext()));
                }
            }
            Object objM24474z = qVar.m24474z();
            if (objM24474z == C6199q.x2()) {
                C6211y.zy(interfaceC6216q);
            }
            return objM24474z;
        }

        /* JADX INFO: renamed from: n */
        private final boolean m23906n(Object obj) throws Throwable {
            if (!(obj instanceof ni7)) {
                return true;
            }
            ni7 ni7Var = (ni7) obj;
            if (ni7Var.f36836g == null) {
                return false;
            }
            throw kotlinx.coroutines.internal.ncyb.m24375h(ni7Var.m23929x());
        }

        public final void f7l8(@InterfaceC7395n Object obj) {
            this.f81957toq = obj;
        }

        @Override // kotlinx.coroutines.channels.InterfaceC6497h
        @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @InterfaceC6769y(name = "next")
        /* JADX INFO: renamed from: k */
        public /* synthetic */ Object mo23892k(InterfaceC6216q interfaceC6216q) {
            return InterfaceC6497h.k.m23893k(this, interfaceC6216q);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.channels.InterfaceC6497h
        public E next() throws Throwable {
            E e2 = (E) this.f81957toq;
            if (e2 instanceof ni7) {
                throw kotlinx.coroutines.internal.ncyb.m24375h(((ni7) e2).m23929x());
            }
            C6679l c6679l = kotlinx.coroutines.channels.toq.f36853g;
            if (e2 == c6679l) {
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            this.f81957toq = c6679l;
            return e2;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: q */
        public final Object m23907q() {
            return this.f81957toq;
        }

        @Override // kotlinx.coroutines.channels.InterfaceC6497h
        @InterfaceC7395n
        public Object toq(@InterfaceC7396q InterfaceC6216q<? super Boolean> interfaceC6216q) {
            Object objM23907q = m23907q();
            C6679l c6679l = kotlinx.coroutines.channels.toq.f36853g;
            if (objM23907q != c6679l) {
                return kotlin.coroutines.jvm.internal.toq.m22766k(m23906n(m23907q()));
            }
            f7l8(this.f36811k.mo23879a());
            return m23907q() != c6679l ? kotlin.coroutines.jvm.internal.toq.m22766k(m23906n(m23907q())) : m23905g(interfaceC6216q);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.k$ld6 */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.channels.AbstractChannel", m22756f = "AbstractChannel.kt", m22757i = {}, m22758l = {633}, m22759m = "receiveCatching-JP2dKIU", m22760n = {}, m22761s = {})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class ld6 extends AbstractC6209q {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AbstractC6500k<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ld6(AbstractC6500k<E> abstractC6500k, InterfaceC6216q<? super ld6> interfaceC6216q) {
            super(interfaceC6216q);
            this.this$0 = abstractC6500k;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objMcp = this.this$0.mcp(this);
            return objMcp == C6199q.x2() ? objMcp : ki.toq(objMcp);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.k$n */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u00028\u00020\u00032\u00020\u0004BT\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c\u0012$\u0010$\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f\u0012\u0006\u0010(\u001a\u00020%ø\u0001\u0000¢\u0006\u0004\b)\u0010*J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR5\u0010$\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010!\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lkotlinx/coroutines/channels/k$n;", "R", C0846k.d9i, "Lkotlinx/coroutines/channels/gvn7;", "Lkotlinx/coroutines/ch;", "value", "Lkotlinx/coroutines/internal/z$q;", "otherOp", "Lkotlinx/coroutines/internal/l;", "z", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/z$q;)Lkotlinx/coroutines/internal/l;", "Lkotlin/was;", AnimatedProperty.PROPERTY_NAME_Y, "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/ni7;", "closed", "bf2", "zy", "Lkotlin/Function1;", "", "b", "(Ljava/lang/Object;)Lcyoe/x2;", "", "toString", "Lkotlinx/coroutines/channels/k;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/channels/k;", "channel", "Lkotlinx/coroutines/selects/g;", "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/Function2;", "", "Lkotlin/coroutines/q;", C7704k.y.toq.f44691k, "Lcyoe/h;", "block", "", "p", com.market.sdk.reflect.toq.f28131g, "receiveMode", C4991s.f28129n, "(Lkotlinx/coroutines/channels/k;Lkotlinx/coroutines/selects/g;Lcyoe/h;I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class n<R, E> extends gvn7<E> implements ch {

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        @InterfaceC6765n
        public final AbstractC6500k<E> f36812g;

        /* JADX INFO: renamed from: p */
        @InterfaceC6765n
        public final int f36813p;

        /* JADX INFO: renamed from: s */
        @InterfaceC7396q
        @InterfaceC6765n
        public final InterfaceC5979h<Object, InterfaceC6216q<? super R>, Object> f36814s;

        /* JADX INFO: renamed from: y */
        @InterfaceC7396q
        @InterfaceC6765n
        public final InterfaceC6720g<R> f36815y;

        /* JADX WARN: Multi-variable type inference failed */
        public n(@InterfaceC7396q AbstractC6500k<E> abstractC6500k, @InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, @InterfaceC7396q InterfaceC5979h<Object, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h, int i2) {
            this.f36812g = abstractC6500k;
            this.f36815y = interfaceC6720g;
            this.f36814s = interfaceC5979h;
            this.f36813p = i2;
        }

        @Override // kotlinx.coroutines.channels.gvn7
        @InterfaceC7395n
        /* JADX INFO: renamed from: b */
        public cyoe.x2<Throwable, was> mo23890b(E e2) {
            cyoe.x2<E, was> x2Var = this.f36812g.f36868k;
            if (x2Var == null) {
                return null;
            }
            return kotlinx.coroutines.internal.d3.m24325k(x2Var, e2, this.f36815y.t8r().getContext());
        }

        @Override // kotlinx.coroutines.channels.gvn7
        public void bf2(@InterfaceC7396q ni7<?> ni7Var) throws Throwable {
            if (this.f36815y.ki()) {
                int i2 = this.f36813p;
                if (i2 == 0) {
                    this.f36815y.zurt(ni7Var.m23929x());
                } else {
                    if (i2 != 1) {
                        return;
                    }
                    C7677k.m28034g(this.f36814s, ki.toq(ki.f81958toq.m23918k(ni7Var.f36836g)), this.f36815y.t8r(), null, 4, null);
                }
            }
        }

        @Override // kotlinx.coroutines.internal.C6694z
        @InterfaceC7396q
        public String toString() {
            return "ReceiveSelect@" + C6551e.toq(this) + '[' + this.f36815y + ",receiveMode=" + this.f36813p + ']';
        }

        @Override // kotlinx.coroutines.channels.oc
        /* JADX INFO: renamed from: y */
        public void mo23908y(E e2) throws Throwable {
            C7677k.m28037q(this.f36814s, this.f36813p == 1 ? ki.toq(ki.f81958toq.zy(e2)) : e2, this.f36815y.t8r(), mo23890b(e2));
        }

        @Override // kotlinx.coroutines.channels.oc
        @InterfaceC7395n
        /* JADX INFO: renamed from: z */
        public C6679l mo23909z(E e2, @InterfaceC7395n C6694z.q qVar) {
            return (C6679l) this.f36815y.x2(qVar);
        }

        @Override // kotlinx.coroutines.ch
        public void zy() {
            if (nn86()) {
                this.f36812g.i1();
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.k$p */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JS\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"kotlinx/coroutines/channels/k$p", "Lkotlinx/coroutines/selects/q;", "Lkotlinx/coroutines/channels/ki;", "R", "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "block", "Lkotlin/was;", "eqxt", "(Lkotlinx/coroutines/selects/g;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class p implements InterfaceC6725q<ki<? extends E>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AbstractC6500k<E> f36816k;

        p(AbstractC6500k<E> abstractC6500k) {
            this.f36816k = abstractC6500k;
        }

        @Override // kotlinx.coroutines.selects.InterfaceC6725q
        public <R> void eqxt(@InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, @InterfaceC7396q InterfaceC5979h<? super ki<? extends E>, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) throws Throwable {
            this.f36816k.ch(interfaceC6720g, 1, interfaceC5979h);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.k$q */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/channels/k$q;", C0846k.d9i, "Lkotlinx/coroutines/channels/gvn7;", "value", "Lkotlinx/coroutines/internal/z$q;", "otherOp", "Lkotlinx/coroutines/internal/l;", "z", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/z$q;)Lkotlinx/coroutines/internal/l;", "Lkotlin/was;", AnimatedProperty.PROPERTY_NAME_Y, "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/ni7;", "closed", "bf2", "Lkotlin/Function1;", "", "b", "(Ljava/lang/Object;)Lcyoe/x2;", "", "toString", "Lkotlinx/coroutines/channels/k$k;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/channels/k$k;", "iterator", "Lkotlinx/coroutines/cdj;", "", "Lkotlinx/coroutines/cdj;", "cont", C4991s.f28129n, "(Lkotlinx/coroutines/channels/k$k;Lkotlinx/coroutines/cdj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static class q<E> extends gvn7<E> {

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        @InterfaceC6765n
        public final k<E> f36817g;

        /* JADX INFO: renamed from: y */
        @InterfaceC7396q
        @InterfaceC6765n
        public final kotlinx.coroutines.cdj<Boolean> f36818y;

        /* JADX WARN: Multi-variable type inference failed */
        public q(@InterfaceC7396q k<E> kVar, @InterfaceC7396q kotlinx.coroutines.cdj<? super Boolean> cdjVar) {
            this.f36817g = kVar;
            this.f36818y = cdjVar;
        }

        @Override // kotlinx.coroutines.channels.gvn7
        @InterfaceC7395n
        /* JADX INFO: renamed from: b */
        public cyoe.x2<Throwable, was> mo23890b(E e2) {
            cyoe.x2<E, was> x2Var = this.f36817g.f36811k.f36868k;
            if (x2Var == null) {
                return null;
            }
            return kotlinx.coroutines.internal.d3.m24325k(x2Var, e2, this.f36818y.getContext());
        }

        @Override // kotlinx.coroutines.channels.gvn7
        public void bf2(@InterfaceC7396q ni7<?> ni7Var) {
            Object qVar = ni7Var.f36836g == null ? cdj.C6491k.toq(this.f36818y, Boolean.FALSE, null, 2, null) : this.f36818y.kja0(ni7Var.m23929x());
            if (qVar != null) {
                this.f36817g.f7l8(ni7Var);
                this.f36818y.mo23848r(qVar);
            }
        }

        @Override // kotlinx.coroutines.internal.C6694z
        @InterfaceC7396q
        public String toString() {
            return kotlin.jvm.internal.d2ok.mcp("ReceiveHasNext@", C6551e.toq(this));
        }

        @Override // kotlinx.coroutines.channels.oc
        /* JADX INFO: renamed from: y */
        public void mo23908y(E e2) {
            this.f36817g.f7l8(e2);
            this.f36818y.mo23848r(kotlinx.coroutines.t8r.f37447q);
        }

        @Override // kotlinx.coroutines.channels.oc
        @InterfaceC7395n
        /* JADX INFO: renamed from: z */
        public C6679l mo23909z(E e2, @InterfaceC7395n C6694z.q qVar) {
            if (this.f36818y.lvui(Boolean.TRUE, qVar == null ? null : qVar.f82045zy, mo23890b(e2)) == null) {
                return null;
            }
            if (qVar != null) {
                qVar.m24451q();
            }
            return kotlinx.coroutines.t8r.f37447q;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.k$s */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JJ\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"kotlinx/coroutines/channels/k$s", "Lkotlinx/coroutines/selects/q;", "R", "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "block", "Lkotlin/was;", "eqxt", "(Lkotlinx/coroutines/selects/g;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class s implements InterfaceC6725q<E> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AbstractC6500k<E> f36819k;

        s(AbstractC6500k<E> abstractC6500k) {
            this.f36819k = abstractC6500k;
        }

        @Override // kotlinx.coroutines.selects.InterfaceC6725q
        public <R> void eqxt(@InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, @InterfaceC7396q InterfaceC5979h<? super E, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) throws Throwable {
            this.f36819k.ch(interfaceC6720g, 0, interfaceC5979h);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.k$toq */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/channels/k$toq;", C0846k.d9i, "Lkotlinx/coroutines/channels/gvn7;", "value", "", "i1", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/z$q;", "otherOp", "Lkotlinx/coroutines/internal/l;", "z", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/z$q;)Lkotlinx/coroutines/internal/l;", "Lkotlin/was;", AnimatedProperty.PROPERTY_NAME_Y, "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/channels/ni7;", "closed", "bf2", "", "toString", "Lkotlinx/coroutines/cdj;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/cdj;", "cont", "", com.market.sdk.reflect.toq.f28131g, "receiveMode", C4991s.f28129n, "(Lkotlinx/coroutines/cdj;I)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static class toq<E> extends gvn7<E> {

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        @InterfaceC6765n
        public final kotlinx.coroutines.cdj<Object> f36820g;

        /* JADX INFO: renamed from: y */
        @InterfaceC6765n
        public final int f36821y;

        public toq(@InterfaceC7396q kotlinx.coroutines.cdj<Object> cdjVar, int i2) {
            this.f36820g = cdjVar;
            this.f36821y = i2;
        }

        @Override // kotlinx.coroutines.channels.gvn7
        public void bf2(@InterfaceC7396q ni7<?> ni7Var) {
            if (this.f36821y == 1) {
                kotlinx.coroutines.cdj<Object> cdjVar = this.f36820g;
                C6323o.k kVar = C6323o.Companion;
                cdjVar.resumeWith(C6323o.m28280constructorimpl(ki.toq(ki.f81958toq.m23918k(ni7Var.f36836g))));
            } else {
                kotlinx.coroutines.cdj<Object> cdjVar2 = this.f36820g;
                C6323o.k kVar2 = C6323o.Companion;
                cdjVar2.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(ni7Var.m23929x())));
            }
        }

        @InterfaceC7395n
        public final Object i1(E e2) {
            return this.f36821y == 1 ? ki.toq(ki.f81958toq.zy(e2)) : e2;
        }

        @Override // kotlinx.coroutines.internal.C6694z
        @InterfaceC7396q
        public String toString() {
            return "ReceiveElement@" + C6551e.toq(this) + "[receiveMode=" + this.f36821y + ']';
        }

        @Override // kotlinx.coroutines.channels.oc
        /* JADX INFO: renamed from: y */
        public void mo23908y(E e2) {
            this.f36820g.mo23848r(kotlinx.coroutines.t8r.f37447q);
        }

        @Override // kotlinx.coroutines.channels.oc
        @InterfaceC7395n
        /* JADX INFO: renamed from: z */
        public C6679l mo23909z(E e2, @InterfaceC7395n C6694z.q qVar) {
            if (this.f36820g.lvui(i1(e2), qVar == null ? null : qVar.f82045zy, mo23890b(e2)) == null) {
                return null;
            }
            if (qVar != null) {
                qVar.m24451q();
            }
            return kotlinx.coroutines.t8r.f37447q;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.k$y */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/z$g", "Lkotlinx/coroutines/internal/z$zy;", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "ld6", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class y extends C6694z.zy {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ AbstractC6500k f36822n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ C6694z f36823q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(C6694z c6694z, AbstractC6500k abstractC6500k) {
            super(c6694z);
            this.f36823q = c6694z;
            this.f36822n = abstractC6500k;
        }

        @Override // kotlinx.coroutines.internal.AbstractC6689q
        @InterfaceC7395n
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Object mo23910s(@InterfaceC7396q C6694z c6694z) {
            if (this.f36822n.yz()) {
                return null;
            }
            return kotlinx.coroutines.internal.fu4.m24339k();
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.k$zy */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/channels/k$zy;", C0846k.d9i, "Lkotlinx/coroutines/channels/k$toq;", "value", "Lkotlin/Function1;", "", "Lkotlin/was;", "b", "(Ljava/lang/Object;)Lcyoe/x2;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", C7704k.y.toq.f44691k, "Lcyoe/x2;", "onUndeliveredElement", "Lkotlinx/coroutines/cdj;", "", "cont", "", "receiveMode", C4991s.f28129n, "(Lkotlinx/coroutines/cdj;ILcyoe/x2;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class zy<E> extends toq<E> {

        /* JADX INFO: renamed from: s */
        @InterfaceC7396q
        @InterfaceC6765n
        public final cyoe.x2<E, was> f36824s;

        /* JADX WARN: Multi-variable type inference failed */
        public zy(@InterfaceC7396q kotlinx.coroutines.cdj<Object> cdjVar, int i2, @InterfaceC7396q cyoe.x2<? super E, was> x2Var) {
            super(cdjVar, i2);
            this.f36824s = x2Var;
        }

        @Override // kotlinx.coroutines.channels.gvn7
        @InterfaceC7395n
        /* JADX INFO: renamed from: b */
        public cyoe.x2<Throwable, was> mo23890b(E e2) {
            return kotlinx.coroutines.internal.d3.m24325k(this.f36824s, e2, this.f36820g.getContext());
        }
    }

    public AbstractC6500k(@InterfaceC7395n cyoe.x2<? super E, was> x2Var) {
        super(x2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void ch(InterfaceC6720g<? super R> interfaceC6720g, int i2, InterfaceC5979h<Object, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) throws Throwable {
        while (!interfaceC6720g.mo24565g()) {
            if (!y9n()) {
                Object objZp = zp(interfaceC6720g);
                if (objZp == kotlinx.coroutines.selects.f7l8.m24562q()) {
                    return;
                }
                if (objZp != kotlinx.coroutines.channels.toq.f36853g && objZp != kotlinx.coroutines.internal.zy.f82050toq) {
                    lv5(interfaceC5979h, interfaceC6720g, i2, objZp);
                }
            } else if (m23897o(interfaceC6720g, interfaceC5979h, i2)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hb(gvn7<? super E> gvn7Var) {
        boolean zMo23901j = mo23901j(gvn7Var);
        if (zMo23901j) {
            a98o();
        }
        return zMo23901j;
    }

    private final <R> void lv5(InterfaceC5979h<Object, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h, InterfaceC6720g<? super R> interfaceC6720g, int i2, Object obj) throws Throwable {
        boolean z2 = obj instanceof ni7;
        if (!z2) {
            if (i2 != 1) {
                tww7.toq.m28041q(interfaceC5979h, obj, interfaceC6720g.t8r());
                return;
            } else {
                ki.toq toqVar = ki.f81958toq;
                tww7.toq.m28041q(interfaceC5979h, ki.toq(z2 ? toqVar.m23918k(((ni7) obj).f36836g) : toqVar.zy(obj)), interfaceC6720g.t8r());
                return;
            }
        }
        if (i2 == 0) {
            throw kotlinx.coroutines.internal.ncyb.m24375h(((ni7) obj).m23929x());
        }
        if (i2 == 1 && interfaceC6720g.ki()) {
            tww7.toq.m28041q(interfaceC5979h, ki.toq(ki.f81958toq.m23918k(((ni7) obj).f36836g)), interfaceC6720g.t8r());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nmn5(kotlinx.coroutines.cdj<?> cdjVar, gvn7<?> gvn7Var) {
        cdjVar.ni7(new g(gvn7Var));
    }

    /* JADX INFO: renamed from: o */
    private final <R> boolean m23897o(InterfaceC6720g<? super R> interfaceC6720g, InterfaceC5979h<Object, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h, int i2) {
        n nVar = new n(this, interfaceC6720g, interfaceC5979h, i2);
        boolean zHb = hb(nVar);
        if (zHb) {
            interfaceC6720g.mo24566s(nVar);
        }
        return zHb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final <R> Object m23898x(int i2, InterfaceC6216q<? super R> interfaceC6216q) {
        kotlinx.coroutines.ki qVar = C6668i.toq(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q));
        toq toqVar = this.f36868k == null ? new toq(qVar, i2) : new zy(qVar, i2, this.f36868k);
        while (true) {
            if (hb(toqVar)) {
                nmn5(qVar, toqVar);
                break;
            }
            Object objMo23879a = mo23879a();
            if (objMo23879a instanceof ni7) {
                toqVar.bf2((ni7) objMo23879a);
                break;
            }
            if (objMo23879a != kotlinx.coroutines.channels.toq.f36853g) {
                qVar.n7h(toqVar.i1(objMo23879a), toqVar.mo23890b(objMo23879a));
                break;
            }
        }
        Object objM24474z = qVar.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: a */
    protected Object mo23879a() {
        while (true) {
            d2ok d2okVarM23994f = m23994f();
            if (d2okVarM23994f == null) {
                return kotlinx.coroutines.channels.toq.f36853g;
            }
            if (d2okVarM23994f.i1(null) != null) {
                d2okVarM23994f.y9n();
                return d2okVarM23994f.mo23860b();
            }
            d2okVarM23994f.a98o();
        }
    }

    protected void a98o() {
    }

    /* JADX INFO: renamed from: b */
    protected void mo23899b(boolean z2) {
        ni7<?> ni7VarM23995i = m23995i();
        if (ni7VarM23995i == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object objZy = kotlinx.coroutines.internal.cdj.zy(null, 1, null);
        while (true) {
            C6694z c6694zM24444f = ni7VarM23995i.m24444f();
            if (c6694zM24444f instanceof kotlinx.coroutines.internal.ni7) {
                bf2(objZy, ni7VarM23995i);
                return;
            } else if (c6694zM24444f.nn86()) {
                objZy = kotlinx.coroutines.internal.cdj.m24323y(objZy, (d2ok) c6694zM24444f);
            } else {
                c6694zM24444f.m24443c();
            }
        }
    }

    protected void bf2(@InterfaceC7396q Object obj, @InterfaceC7396q ni7<?> ni7Var) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((d2ok) obj).bf2(ni7Var);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            ((d2ok) arrayList.get(size)).bf2(ni7Var);
            if (i2 < 0) {
                return;
            } else {
                size = i2;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.d3
    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        mo23862q(null);
    }

    @Override // kotlinx.coroutines.channels.d3
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean mo23861k(@InterfaceC7395n Throwable th) {
        boolean zJp0y = jp0y(th);
        mo23899b(zJp0y);
        return zJp0y;
    }

    protected abstract boolean ek5k();

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7396q
    public final InterfaceC6725q<ki<E>> fn3e() {
        return new p(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7395n
    public final Object fti(@InterfaceC7396q InterfaceC6216q<? super E> interfaceC6216q) {
        Object objMo23879a = mo23879a();
        return (objMo23879a == kotlinx.coroutines.channels.toq.f36853g || (objMo23879a instanceof ni7)) ? m23898x(0, interfaceC6216q) : objMo23879a;
    }

    @Override // kotlinx.coroutines.channels.zy
    @InterfaceC7395n
    protected oc<E> hyr() {
        oc<E> ocVarHyr = super.hyr();
        if (ocVarHyr != null && !(ocVarHyr instanceof ni7)) {
            i1();
        }
        return ocVarHyr;
    }

    protected void i1() {
    }

    @Override // kotlinx.coroutines.channels.d3
    public boolean isEmpty() {
        return y9n();
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7396q
    public final InterfaceC6497h<E> iterator() {
        return new k(this);
    }

    /* JADX INFO: renamed from: j */
    protected boolean mo23901j(@InterfaceC7396q gvn7<? super E> gvn7Var) {
        int iEk5k;
        C6694z c6694zM24444f;
        if (!ek5k()) {
            C6694z c6694zNi7 = ni7();
            y yVar = new y(gvn7Var, this);
            do {
                C6694z c6694zM24444f2 = c6694zNi7.m24444f();
                if (!(!(c6694zM24444f2 instanceof d2ok))) {
                    return false;
                }
                iEk5k = c6694zM24444f2.ek5k(gvn7Var, c6694zNi7, yVar);
                if (iEk5k != 1) {
                }
            } while (iEk5k != 2);
            return false;
        }
        C6694z c6694zNi72 = ni7();
        do {
            c6694zM24444f = c6694zNi72.m24444f();
            if (!(!(c6694zM24444f instanceof d2ok))) {
                return false;
            }
        } while (!c6694zM24444f.oc(gvn7Var, c6694zNi72));
        return true;
    }

    /* JADX INFO: renamed from: m */
    protected final boolean m23902m() {
        return ni7().hyr() instanceof oc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.channels.d3
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mcp(@mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlinx.coroutines.channels.ki<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.AbstractC6500k.ld6
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.k$ld6 r0 = (kotlinx.coroutines.channels.AbstractC6500k.ld6) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.k$ld6 r0 = new kotlinx.coroutines.channels.k$ld6
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C6318m.n7h(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C6318m.n7h(r5)
            java.lang.Object r5 = r4.mo23879a()
            kotlinx.coroutines.internal.l r2 = kotlinx.coroutines.channels.toq.f36853g
            if (r5 == r2) goto L52
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ni7
            if (r0 == 0) goto L4b
            kotlinx.coroutines.channels.ki$toq r0 = kotlinx.coroutines.channels.ki.f81958toq
            kotlinx.coroutines.channels.ni7 r5 = (kotlinx.coroutines.channels.ni7) r5
            java.lang.Throwable r5 = r5.f36836g
            java.lang.Object r5 = r0.m23918k(r5)
            goto L51
        L4b:
            kotlinx.coroutines.channels.ki$toq r0 = kotlinx.coroutines.channels.ki.f81958toq
            java.lang.Object r5 = r0.zy(r5)
        L51:
            return r5
        L52:
            r0.label = r3
            java.lang.Object r5 = r4.m23898x(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            kotlinx.coroutines.channels.ki r5 = (kotlinx.coroutines.channels.ki) r5
            java.lang.Object r5 = r5.kja0()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractC6500k.mcp(kotlin.coroutines.q):java.lang.Object");
    }

    @InterfaceC7396q
    protected final f7l8<E> nn86() {
        return new f7l8<>(ni7());
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC6244y
    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @hb(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object o1t(@InterfaceC7396q InterfaceC6216q<? super E> interfaceC6216q) {
        return n7h.C6504k.m23925n(this, interfaceC6216q);
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @hb(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return (E) n7h.C6504k.m23926q(this);
    }

    @Override // kotlinx.coroutines.channels.d3
    /* JADX INFO: renamed from: q */
    public final void mo23862q(@InterfaceC7395n CancellationException cancellationException) {
        if (toq()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(kotlin.jvm.internal.d2ok.mcp(C6551e.m24040k(this), " was cancelled"));
        }
        mo23861k(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7396q
    public final InterfaceC6725q<E> t8r() {
        return new s(this);
    }

    @Override // kotlinx.coroutines.channels.d3
    public boolean toq() {
        return ki() != null && yz();
    }

    protected final boolean y9n() {
        return !(ni7().hyr() instanceof d2ok) && yz();
    }

    protected abstract boolean yz();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public final Object mo23863z() {
        Object objMo23879a = mo23879a();
        return objMo23879a == kotlinx.coroutines.channels.toq.f36853g ? ki.f81958toq.toq() : objMo23879a instanceof ni7 ? ki.f81958toq.m23918k(((ni7) objMo23879a).f36836g) : ki.f81958toq.zy(objMo23879a);
    }

    @InterfaceC7395n
    protected Object zp(@InterfaceC7396q InterfaceC6720g<?> interfaceC6720g) {
        f7l8<E> f7l8VarNn86 = nn86();
        Object objFu4 = interfaceC6720g.fu4(f7l8VarNn86);
        if (objFu4 != null) {
            return objFu4;
        }
        f7l8VarNn86.kja0().y9n();
        return f7l8VarNn86.kja0().mo23860b();
    }

    @Override // kotlinx.coroutines.channels.d3
    @InterfaceC7396q
    public InterfaceC6725q<E> zurt() {
        return n7h.C6504k.toq(this);
    }
}

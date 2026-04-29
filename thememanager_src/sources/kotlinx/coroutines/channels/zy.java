package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.p013b.C5717e;
import cyoe.InterfaceC5979h;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6231h;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.jvm.internal.bo;
import kotlin.was;
import kotlinx.coroutines.C6551e;
import kotlinx.coroutines.ch;
import kotlinx.coroutines.channels.lvui;
import kotlinx.coroutines.internal.C6679l;
import kotlinx.coroutines.internal.C6687o;
import kotlinx.coroutines.internal.C6694z;
import kotlinx.coroutines.selects.InterfaceC6720g;
import kotlinx.coroutines.selects.InterfaceC6723n;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import tww7.C7677k;
import v5yj.C7704k;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004KklOB)\u0012 \u0010M\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010:j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`J¢\u0006\u0004\bj\u0010>J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u001c\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\b\u001a\u00028\u00002(\u0010\u001b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0004¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010(2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u000e\u0012\u0002\b\u00030+j\u0006\u0012\u0002\b\u0003`,2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u0010\rJ\u0017\u00101\u001a\u0002002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102J$\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b032\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u0010\"J\u0019\u00106\u001a\u0004\u0018\u00010\u001a2\u0006\u00105\u001a\u00020%H\u0014¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u0002002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b8\u00109J)\u0010=\u001a\u00020\u000b2\u0018\u0010<\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u000b0:j\u0002`;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020?H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010(H\u0014¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000D2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IR.\u0010M\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010:j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`J8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010S\u001a\u00020N8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010V\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010IR\u0014\u0010Z\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\bY\u0010UR\u0014\u0010\\\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\b[\u0010UR\u001a\u0010_\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001a\u0010a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b`\u0010^R\u0011\u0010c\u001a\u0002008F¢\u0006\u0006\u001a\u0004\bb\u0010UR#\u0010g\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020d8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010i\u001a\u00020G8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bh\u0010I\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006m"}, d2 = {"Lkotlinx/coroutines/channels/zy;", C0846k.d9i, "Lkotlinx/coroutines/channels/lvui;", "Lkotlinx/coroutines/channels/ni7;", "closed", "", "jk", "(Lkotlinx/coroutines/channels/ni7;)Ljava/lang/Throwable;", "element", "t", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/ni7;)Ljava/lang/Throwable;", "Lkotlin/was;", "n5r1", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/coroutines/q;", "a9", "(Lkotlin/coroutines/q;Ljava/lang/Object;Lkotlinx/coroutines/channels/ni7;)V", "cause", "gvn7", "(Ljava/lang/Throwable;)V", "wvg", "(Lkotlinx/coroutines/channels/ni7;)V", "R", "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/Function2;", "", "block", "ncyb", "(Lkotlinx/coroutines/selects/g;Ljava/lang/Object;Lcyoe/h;)V", "", "qrj", "()I", "r", "(Ljava/lang/Object;)Ljava/lang/Object;", "dd", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/g;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/d2ok;", "f", "()Lkotlinx/coroutines/channels/d2ok;", "Lkotlinx/coroutines/channels/oc;", C5717e.f31929a, "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/oc;", "Lkotlinx/coroutines/internal/z$toq;", "Lkotlinx/coroutines/internal/AddLastDesc;", "n7h", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/z$toq;", "d3", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/ki;", C7704k.y.toq.f44691k, InterfaceC1925p.pnh, AnimatedProperty.PROPERTY_NAME_H, "(Lkotlinx/coroutines/channels/d2ok;)Ljava/lang/Object;", "jp0y", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "n", "(Lcyoe/x2;)V", "Lkotlinx/coroutines/internal/z;", "x9kr", "(Lkotlinx/coroutines/internal/z;)V", "hyr", "()Lkotlinx/coroutines/channels/oc;", "Lkotlinx/coroutines/channels/zy$q;", "kja0", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/zy$q;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "k", "Lcyoe/x2;", "onUndeliveredElement", "Lkotlinx/coroutines/internal/ni7;", "q", "Lkotlinx/coroutines/internal/ni7;", "ni7", "()Lkotlinx/coroutines/internal/ni7;", "queue", "lvui", "()Z", "isFullImpl", "fu4", "queueDebugStateString", "eqxt", "isBufferAlwaysFull", "d2ok", "isBufferFull", "i", "()Lkotlinx/coroutines/channels/ni7;", "closedForSend", "ki", "closedForReceive", "oc", "isClosedForSend", "Lkotlinx/coroutines/selects/n;", C7704k.y.toq.f95579toq, "()Lkotlinx/coroutines/selects/n;", "onSend", "cdj", "bufferDebugString", C4991s.f28129n, "toq", "zy", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class zy<E> implements lvui<E> {

    /* JADX INFO: renamed from: n */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f36867n = AtomicReferenceFieldUpdater.newUpdater(zy.class, Object.class, "onCloseHandler");

    /* JADX INFO: renamed from: k */
    @InterfaceC6765n
    @InterfaceC7395n
    protected final cyoe.x2<E, was> f36868k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final kotlinx.coroutines.internal.ni7 f36869q = new kotlinx.coroutines.internal.ni7();

    @InterfaceC7396q
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.zy$g */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"kotlinx/coroutines/channels/zy$g", "Lkotlinx/coroutines/selects/n;", "Lkotlinx/coroutines/channels/lvui;", "R", "Lkotlinx/coroutines/selects/g;", "select", "param", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "block", "Lkotlin/was;", "i", "(Lkotlinx/coroutines/selects/g;Ljava/lang/Object;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6529g implements InterfaceC6723n<E, lvui<? super E>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ zy<E> f36870k;

        C6529g(zy<E> zyVar) {
            this.f36870k = zyVar;
        }

        @Override // kotlinx.coroutines.selects.InterfaceC6723n
        /* JADX INFO: renamed from: i */
        public <R> void mo23934i(@InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, E e2, @InterfaceC7396q InterfaceC5979h<? super lvui<? super E>, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) throws Throwable {
            this.f36870k.ncyb(interfaceC6720g, e2, interfaceC5979h);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.zy$k */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/channels/zy$k;", C0846k.d9i, "Lkotlinx/coroutines/channels/d2ok;", "Lkotlinx/coroutines/internal/z$q;", "otherOp", "Lkotlinx/coroutines/internal/l;", "i1", "Lkotlin/was;", "y9n", "Lkotlinx/coroutines/channels/ni7;", "closed", "bf2", "", "toString", C7704k.y.toq.f95579toq, "Ljava/lang/Object;", "element", "", "b", "()Ljava/lang/Object;", "pollResult", C4991s.f28129n, "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6530k<E> extends d2ok {

        /* JADX INFO: renamed from: g */
        @InterfaceC6765n
        public final E f36871g;

        public C6530k(E e2) {
            this.f36871g = e2;
        }

        @Override // kotlinx.coroutines.channels.d2ok
        @InterfaceC7395n
        /* JADX INFO: renamed from: b */
        public Object mo23860b() {
            return this.f36871g;
        }

        @Override // kotlinx.coroutines.channels.d2ok
        public void bf2(@InterfaceC7396q ni7<?> ni7Var) {
        }

        @Override // kotlinx.coroutines.channels.d2ok
        @InterfaceC7395n
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
            return "SendBuffered@" + C6551e.toq(this) + '(' + this.f36871g + ')';
        }

        @Override // kotlinx.coroutines.channels.d2ok
        public void y9n() {
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.zy$n */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/z$g", "Lkotlinx/coroutines/internal/z$zy;", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "ld6", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6531n extends C6694z.zy {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ zy f36872n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ C6694z f36873q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6531n(C6694z c6694z, zy zyVar) {
            super(c6694z);
            this.f36873q = c6694z;
            this.f36872n = zyVar;
        }

        @Override // kotlinx.coroutines.internal.AbstractC6689q
        @InterfaceC7395n
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Object mo23910s(@InterfaceC7396q C6694z c6694z) {
            if (this.f36872n.d2ok()) {
                return null;
            }
            return kotlinx.coroutines.internal.fu4.m24339k();
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.zy$q */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\u000e\u001a\u00028\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016R\u0014\u0010\u000e\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/channels/zy$q;", C0846k.d9i, "Lkotlinx/coroutines/internal/z$n;", "Lkotlinx/coroutines/channels/oc;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lkotlinx/coroutines/internal/z;", "affected", "", "n", "Lkotlinx/coroutines/internal/z$q;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "p", "Ljava/lang/Object;", "element", "Lkotlinx/coroutines/internal/ni7;", "queue", C4991s.f28129n, "(Ljava/lang/Object;Lkotlinx/coroutines/internal/ni7;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    protected static final class C6532q<E> extends C6694z.n<oc<? super E>> {

        /* JADX INFO: renamed from: n */
        @InterfaceC6765n
        public final E f36874n;

        public C6532q(E e2, @InterfaceC7396q kotlinx.coroutines.internal.ni7 ni7Var) {
            super(ni7Var);
            this.f36874n = e2;
        }

        @Override // kotlinx.coroutines.internal.C6694z.n, kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7395n
        /* JADX INFO: renamed from: n */
        protected Object mo23903n(@InterfaceC7396q C6694z c6694z) {
            if (c6694z instanceof ni7) {
                return c6694z;
            }
            if (c6694z instanceof oc) {
                return null;
            }
            return kotlinx.coroutines.channels.toq.f36855n;
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7395n
        /* JADX INFO: renamed from: p */
        public Object mo23904p(@InterfaceC7396q C6694z.q qVar) {
            C6679l c6679lMo23909z = ((oc) qVar.f37272k).mo23909z(this.f36874n, qVar);
            if (c6679lMo23909z == null) {
                return kotlinx.coroutines.internal.o1t.f37233k;
            }
            Object obj = kotlinx.coroutines.internal.zy.f82050toq;
            if (c6679lMo23909z == obj) {
                return obj;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/zy$toq;", C0846k.d9i, "Lkotlinx/coroutines/internal/z$toq;", "Lkotlinx/coroutines/channels/zy$k;", "Lkotlinx/coroutines/internal/AddLastDesc;", "Lkotlinx/coroutines/internal/z;", "affected", "", "n", "Lkotlinx/coroutines/internal/ni7;", "queue", "element", C4991s.f28129n, "(Lkotlinx/coroutines/internal/ni7;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static class toq<E> extends C6694z.toq<C6530k<? extends E>> {
        public toq(@InterfaceC7396q kotlinx.coroutines.internal.ni7 ni7Var, E e2) {
            super(ni7Var, new C6530k(e2));
        }

        @Override // kotlinx.coroutines.internal.C6694z.k
        @InterfaceC7395n
        /* JADX INFO: renamed from: n */
        protected Object mo23903n(@InterfaceC7396q C6694z c6694z) {
            if (c6694z instanceof ni7) {
                return c6694z;
            }
            if (c6694z instanceof oc) {
                return kotlinx.coroutines.channels.toq.f36855n;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u0004BX\u0012\u0006\u0010\u0016\u001a\u00028\u0001\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b\u0012(\u0010%\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001fø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0016\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR9\u0010%\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001f8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lkotlinx/coroutines/channels/zy$zy;", C0846k.d9i, "R", "Lkotlinx/coroutines/channels/d2ok;", "Lkotlinx/coroutines/ch;", "Lkotlinx/coroutines/internal/z$q;", "otherOp", "Lkotlinx/coroutines/internal/l;", "i1", "Lkotlin/was;", "y9n", "zy", "Lkotlinx/coroutines/channels/ni7;", "closed", "bf2", "a98o", "", "toString", C7704k.y.toq.f95579toq, "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "pollResult", "Lkotlinx/coroutines/channels/zy;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/channels/zy;", "channel", "Lkotlinx/coroutines/selects/g;", C7704k.y.toq.f44691k, "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/lvui;", "Lkotlin/coroutines/q;", "", "p", "Lcyoe/h;", "block", C4991s.f28129n, "(Ljava/lang/Object;Lkotlinx/coroutines/channels/zy;Lkotlinx/coroutines/selects/g;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class C8069zy<E, R> extends d2ok implements ch {

        /* JADX INFO: renamed from: g */
        private final E f36875g;

        /* JADX INFO: renamed from: p */
        @InterfaceC7396q
        @InterfaceC6765n
        public final InterfaceC5979h<lvui<? super E>, InterfaceC6216q<? super R>, Object> f36876p;

        /* JADX INFO: renamed from: s */
        @InterfaceC7396q
        @InterfaceC6765n
        public final InterfaceC6720g<R> f36877s;

        /* JADX INFO: renamed from: y */
        @InterfaceC7396q
        @InterfaceC6765n
        public final zy<E> f36878y;

        /* JADX WARN: Multi-variable type inference failed */
        public C8069zy(E e2, @InterfaceC7396q zy<E> zyVar, @InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, @InterfaceC7396q InterfaceC5979h<? super lvui<? super E>, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
            this.f36875g = e2;
            this.f36878y = zyVar;
            this.f36877s = interfaceC6720g;
            this.f36876p = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.channels.d2ok
        public void a98o() {
            cyoe.x2<E, was> x2Var = this.f36878y.f36868k;
            if (x2Var == null) {
                return;
            }
            kotlinx.coroutines.internal.d3.toq(x2Var, mo23860b(), this.f36877s.t8r().getContext());
        }

        @Override // kotlinx.coroutines.channels.d2ok
        /* JADX INFO: renamed from: b */
        public E mo23860b() {
            return this.f36875g;
        }

        @Override // kotlinx.coroutines.channels.d2ok
        public void bf2(@InterfaceC7396q ni7<?> ni7Var) {
            if (this.f36877s.ki()) {
                this.f36877s.zurt(ni7Var.ch());
            }
        }

        @Override // kotlinx.coroutines.channels.d2ok
        @InterfaceC7395n
        public C6679l i1(@InterfaceC7395n C6694z.q qVar) {
            return (C6679l) this.f36877s.x2(qVar);
        }

        @Override // kotlinx.coroutines.internal.C6694z
        @InterfaceC7396q
        public String toString() {
            return "SendSelect@" + C6551e.toq(this) + '(' + mo23860b() + ")[" + this.f36878y + ", " + this.f36877s + ']';
        }

        @Override // kotlinx.coroutines.channels.d2ok
        public void y9n() throws Throwable {
            C7677k.m28034g(this.f36876p, this.f36878y, this.f36877s.t8r(), null, 4, null);
        }

        @Override // kotlinx.coroutines.ch
        public void zy() {
            if (nn86()) {
                a98o();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zy(@InterfaceC7395n cyoe.x2<? super E, was> x2Var) {
        this.f36868k = x2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a9(InterfaceC6216q<?> interfaceC6216q, E e2, ni7<?> ni7Var) {
        C6687o c6687oM24326q;
        wvg(ni7Var);
        Throwable thCh = ni7Var.ch();
        cyoe.x2<E, was> x2Var = this.f36868k;
        if (x2Var == null || (c6687oM24326q = kotlinx.coroutines.internal.d3.m24326q(x2Var, e2, null, 2, null)) == null) {
            C6323o.k kVar = C6323o.Companion;
            interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(thCh)));
        } else {
            C6231h.m22845k(c6687oM24326q, thCh);
            C6323o.k kVar2 = C6323o.Companion;
            interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(c6687oM24326q)));
        }
    }

    private final String fu4() {
        C6694z c6694zHyr = this.f36869q.hyr();
        if (c6694zHyr == this.f36869q) {
            return "EmptyQueue";
        }
        String string = c6694zHyr instanceof ni7 ? c6694zHyr.toString() : c6694zHyr instanceof gvn7 ? "ReceiveQueued" : c6694zHyr instanceof d2ok ? "SendQueued" : kotlin.jvm.internal.d2ok.mcp("UNEXPECTED:", c6694zHyr);
        C6694z c6694zM24444f = this.f36869q.m24444f();
        if (c6694zM24444f == c6694zHyr) {
            return string;
        }
        String str = string + ",queueSize=" + qrj();
        if (!(c6694zM24444f instanceof ni7)) {
            return str;
        }
        return str + ",closedForSend=" + c6694zM24444f;
    }

    private final void gvn7(Throwable th) {
        C6679l c6679l;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (c6679l = kotlinx.coroutines.channels.toq.f36857y) || !androidx.concurrent.futures.toq.m906k(f36867n, this, obj, c6679l)) {
            return;
        }
        ((cyoe.x2) bo.cdj(obj, 1)).invoke(th);
    }

    private final Throwable jk(ni7<?> ni7Var) {
        wvg(ni7Var);
        return ni7Var.ch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean lvui() {
        return !(this.f36869q.hyr() instanceof oc) && d2ok();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n5r1(E r4, kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r5) {
        /*
            r3 = this;
            kotlin.coroutines.q r0 = kotlin.coroutines.intrinsics.toq.m22744n(r5)
            kotlinx.coroutines.ki r0 = kotlinx.coroutines.C6668i.toq(r0)
        L8:
            boolean r1 = m23991p(r3)
            if (r1 == 0) goto L4d
            cyoe.x2<E, kotlin.was> r1 = r3.f36868k
            if (r1 != 0) goto L18
            kotlinx.coroutines.channels.r r1 = new kotlinx.coroutines.channels.r
            r1.<init>(r4, r0)
            goto L1f
        L18:
            kotlinx.coroutines.channels.dd r1 = new kotlinx.coroutines.channels.dd
            cyoe.x2<E, kotlin.was> r2 = r3.f36868k
            r1.<init>(r4, r0, r2)
        L1f:
            java.lang.Object r2 = r3.mo23971h(r1)
            if (r2 != 0) goto L29
            kotlinx.coroutines.C6668i.zy(r0, r1)
            goto L6f
        L29:
            boolean r1 = r2 instanceof kotlinx.coroutines.channels.ni7
            if (r1 == 0) goto L33
            kotlinx.coroutines.channels.ni7 r2 = (kotlinx.coroutines.channels.ni7) r2
            m23993y(r3, r0, r4, r2)
            goto L6f
        L33:
            kotlinx.coroutines.internal.l r1 = kotlinx.coroutines.channels.toq.f81964f7l8
            if (r2 != r1) goto L38
            goto L4d
        L38:
            boolean r1 = r2 instanceof kotlinx.coroutines.channels.gvn7
            if (r1 == 0) goto L3d
            goto L4d
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "enqueueSend returned "
            java.lang.String r5 = kotlin.jvm.internal.d2ok.mcp(r5, r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4d:
            java.lang.Object r1 = r3.mo23878r(r4)
            kotlinx.coroutines.internal.l r2 = kotlinx.coroutines.channels.toq.f36856q
            if (r1 != r2) goto L61
            kotlin.o$k r4 = kotlin.C6323o.Companion
            kotlin.was r4 = kotlin.was.f36763k
            java.lang.Object r4 = kotlin.C6323o.m28280constructorimpl(r4)
            r0.resumeWith(r4)
            goto L6f
        L61:
            kotlinx.coroutines.internal.l r2 = kotlinx.coroutines.channels.toq.f36855n
            if (r1 != r2) goto L66
            goto L8
        L66:
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.ni7
            if (r2 == 0) goto L86
            kotlinx.coroutines.channels.ni7 r1 = (kotlinx.coroutines.channels.ni7) r1
            m23993y(r3, r0, r4, r1)
        L6f:
            java.lang.Object r4 = r0.m24474z()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
            if (r4 != r0) goto L7c
            kotlin.coroutines.jvm.internal.C6211y.zy(r5)
        L7c:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.toq.x2()
            if (r4 != r5) goto L83
            return r4
        L83:
            kotlin.was r4 = kotlin.was.f36763k
            return r4
        L86:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "offerInternal returned "
            java.lang.String r5 = kotlin.jvm.internal.d2ok.mcp(r5, r1)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.zy.n5r1(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void ncyb(InterfaceC6720g<? super R> interfaceC6720g, E e2, InterfaceC5979h<? super lvui<? super E>, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) throws Throwable {
        while (!interfaceC6720g.mo24565g()) {
            if (lvui()) {
                C8069zy c8069zy = new C8069zy(e2, this, interfaceC6720g, interfaceC5979h);
                Object objMo23971h = mo23971h(c8069zy);
                if (objMo23971h == null) {
                    interfaceC6720g.mo24566s(c8069zy);
                    return;
                }
                if (objMo23971h instanceof ni7) {
                    throw kotlinx.coroutines.internal.ncyb.m24375h(m23992t(e2, (ni7) objMo23971h));
                }
                if (objMo23971h != kotlinx.coroutines.channels.toq.f81964f7l8 && !(objMo23971h instanceof gvn7)) {
                    throw new IllegalStateException(("enqueueSend returned " + objMo23971h + ' ').toString());
                }
            }
            Object objDd = dd(e2, interfaceC6720g);
            if (objDd == kotlinx.coroutines.selects.f7l8.m24562q()) {
                return;
            }
            if (objDd != kotlinx.coroutines.channels.toq.f36855n && objDd != kotlinx.coroutines.internal.zy.f82050toq) {
                if (objDd == kotlinx.coroutines.channels.toq.f36856q) {
                    tww7.toq.m28041q(interfaceC5979h, this, interfaceC6720g.t8r());
                    return;
                } else {
                    if (!(objDd instanceof ni7)) {
                        throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("offerSelectInternal returned ", objDd).toString());
                    }
                    throw kotlinx.coroutines.internal.ncyb.m24375h(m23992t(e2, (ni7) objDd));
                }
            }
        }
    }

    private final int qrj() {
        kotlinx.coroutines.internal.ni7 ni7Var = this.f36869q;
        int i2 = 0;
        for (C6694z c6694zHyr = (C6694z) ni7Var.n5r1(); !kotlin.jvm.internal.d2ok.f7l8(c6694zHyr, ni7Var); c6694zHyr = c6694zHyr.hyr()) {
            if (c6694zHyr instanceof C6694z) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: t */
    private final Throwable m23992t(E e2, ni7<?> ni7Var) {
        C6687o c6687oM24326q;
        wvg(ni7Var);
        cyoe.x2<E, was> x2Var = this.f36868k;
        if (x2Var == null || (c6687oM24326q = kotlinx.coroutines.internal.d3.m24326q(x2Var, e2, null, 2, null)) == null) {
            return ni7Var.ch();
        }
        C6231h.m22845k(c6687oM24326q, ni7Var.ch());
        throw c6687oM24326q;
    }

    private final void wvg(ni7<?> ni7Var) {
        Object objZy = kotlinx.coroutines.internal.cdj.zy(null, 1, null);
        while (true) {
            C6694z c6694zM24444f = ni7Var.m24444f();
            gvn7 gvn7Var = c6694zM24444f instanceof gvn7 ? (gvn7) c6694zM24444f : null;
            if (gvn7Var == null) {
                break;
            } else if (gvn7Var.nn86()) {
                objZy = kotlinx.coroutines.internal.cdj.m24323y(objZy, gvn7Var);
            } else {
                gvn7Var.m24443c();
            }
        }
        if (objZy != null) {
            if (objZy instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objZy;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        ((gvn7) arrayList.get(size)).bf2(ni7Var);
                        if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
            } else {
                ((gvn7) objZy).bf2(ni7Var);
            }
        }
        x9kr(ni7Var);
    }

    @InterfaceC7396q
    protected String cdj() {
        return "";
    }

    protected abstract boolean d2ok();

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC7395n
    public final Object d3(E e2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        if (mo23878r(e2) == kotlinx.coroutines.channels.toq.f36856q) {
            return was.f36763k;
        }
        Object objN5r1 = n5r1(e2, interfaceC6216q);
        return objN5r1 == C6199q.x2() ? objN5r1 : was.f36763k;
    }

    @InterfaceC7396q
    protected Object dd(E e2, @InterfaceC7396q InterfaceC6720g<?> interfaceC6720g) {
        C6532q<E> c6532qKja0 = kja0(e2);
        Object objFu4 = interfaceC6720g.fu4(c6532qKja0);
        if (objFu4 != null) {
            return objFu4;
        }
        oc<? super E> ocVarKja0 = c6532qKja0.kja0();
        ocVarKja0.mo23908y(e2);
        return ocVarKja0.mo23891q();
    }

    protected abstract boolean eqxt();

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r1 = null;
     */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final kotlinx.coroutines.channels.d2ok m23994f() {
        /*
            r4 = this;
            kotlinx.coroutines.internal.ni7 r0 = r4.f36869q
        L2:
            java.lang.Object r1 = r0.n5r1()
            kotlinx.coroutines.internal.z r1 = (kotlinx.coroutines.internal.C6694z) r1
            r2 = 0
            if (r1 != r0) goto Ld
        Lb:
            r1 = r2
            goto L26
        Ld:
            boolean r3 = r1 instanceof kotlinx.coroutines.channels.d2ok
            if (r3 != 0) goto L12
            goto Lb
        L12:
            r2 = r1
            kotlinx.coroutines.channels.d2ok r2 = (kotlinx.coroutines.channels.d2ok) r2
            boolean r2 = r2 instanceof kotlinx.coroutines.channels.ni7
            if (r2 == 0) goto L20
            boolean r2 = r1.uv6()
            if (r2 != 0) goto L20
            goto L26
        L20:
            kotlinx.coroutines.internal.z r2 = r1.m24446o()
            if (r2 != 0) goto L29
        L26:
            kotlinx.coroutines.channels.d2ok r1 = (kotlinx.coroutines.channels.d2ok) r1
            return r1
        L29:
            r2.lrht()
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.zy.m23994f():kotlinx.coroutines.channels.d2ok");
    }

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final InterfaceC6723n<E, lvui<E>> mo23919g() {
        return new C6529g(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        return kotlinx.coroutines.channels.toq.f81964f7l8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        return null;
     */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object mo23971h(@mub.InterfaceC7396q kotlinx.coroutines.channels.d2ok r5) {
        /*
            r4 = this;
            boolean r0 = r4.eqxt()
            if (r0 == 0) goto L18
            kotlinx.coroutines.internal.ni7 r0 = r4.f36869q
        L8:
            kotlinx.coroutines.internal.z r1 = r0.m24444f()
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.oc
            if (r2 == 0) goto L11
            return r1
        L11:
            boolean r1 = r1.oc(r5, r0)
            if (r1 == 0) goto L8
            goto L39
        L18:
            kotlinx.coroutines.internal.ni7 r0 = r4.f36869q
            kotlinx.coroutines.channels.zy$n r1 = new kotlinx.coroutines.channels.zy$n
            r1.<init>(r5, r4)
        L1f:
            kotlinx.coroutines.internal.z r2 = r0.m24444f()
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.oc
            if (r3 == 0) goto L28
            return r2
        L28:
            int r2 = r2.ek5k(r5, r0, r1)
            r3 = 1
            if (r2 == r3) goto L34
            r3 = 2
            if (r2 == r3) goto L33
            goto L1f
        L33:
            r3 = 0
        L34:
            if (r3 != 0) goto L39
            kotlinx.coroutines.internal.l r5 = kotlinx.coroutines.channels.toq.f81964f7l8
            return r5
        L39:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.zy.mo23971h(kotlinx.coroutines.channels.d2ok):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.z] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected kotlinx.coroutines.channels.oc<E> hyr() {
        /*
            r4 = this;
            kotlinx.coroutines.internal.ni7 r0 = r4.f36869q
        L2:
            java.lang.Object r1 = r0.n5r1()
            kotlinx.coroutines.internal.z r1 = (kotlinx.coroutines.internal.C6694z) r1
            r2 = 0
            if (r1 != r0) goto Ld
        Lb:
            r1 = r2
            goto L26
        Ld:
            boolean r3 = r1 instanceof kotlinx.coroutines.channels.oc
            if (r3 != 0) goto L12
            goto Lb
        L12:
            r2 = r1
            kotlinx.coroutines.channels.oc r2 = (kotlinx.coroutines.channels.oc) r2
            boolean r2 = r2 instanceof kotlinx.coroutines.channels.ni7
            if (r2 == 0) goto L20
            boolean r2 = r1.uv6()
            if (r2 != 0) goto L20
            goto L26
        L20:
            kotlinx.coroutines.internal.z r2 = r1.m24446o()
            if (r2 != 0) goto L29
        L26:
            kotlinx.coroutines.channels.oc r1 = (kotlinx.coroutines.channels.oc) r1
            return r1
        L29:
            r2.lrht()
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.zy.hyr():kotlinx.coroutines.channels.oc");
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: i */
    protected final ni7<?> m23995i() {
        C6694z c6694zM24444f = this.f36869q.m24444f();
        ni7<?> ni7Var = c6694zM24444f instanceof ni7 ? (ni7) c6694zM24444f : null;
        if (ni7Var == null) {
            return null;
        }
        wvg(ni7Var);
        return ni7Var;
    }

    @Override // kotlinx.coroutines.channels.lvui
    /* JADX INFO: renamed from: jp0y */
    public boolean mo23876k(@InterfaceC7395n Throwable th) {
        boolean z2;
        ni7<?> ni7Var = new ni7<>(th);
        C6694z c6694z = this.f36869q;
        while (true) {
            C6694z c6694zM24444f = c6694z.m24444f();
            z2 = true;
            if (!(!(c6694zM24444f instanceof ni7))) {
                z2 = false;
                break;
            }
            if (c6694zM24444f.oc(ni7Var, c6694z)) {
                break;
            }
        }
        if (!z2) {
            ni7Var = (ni7) this.f36869q.m24444f();
        }
        wvg(ni7Var);
        if (z2) {
            gvn7(th);
        }
        return z2;
    }

    @InterfaceC7395n
    protected final ni7<?> ki() {
        C6694z c6694zHyr = this.f36869q.hyr();
        ni7<?> ni7Var = c6694zHyr instanceof ni7 ? (ni7) c6694zHyr : null;
        if (ni7Var == null) {
            return null;
        }
        wvg(ni7Var);
        return ni7Var;
    }

    @InterfaceC7396q
    protected final C6532q<E> kja0(E e2) {
        return new C6532q<>(e2, this.f36869q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7395n
    /* JADX INFO: renamed from: l */
    protected final oc<?> m23996l(E e2) {
        C6694z c6694zM24444f;
        kotlinx.coroutines.internal.ni7 ni7Var = this.f36869q;
        C6530k c6530k = new C6530k(e2);
        do {
            c6694zM24444f = ni7Var.m24444f();
            if (c6694zM24444f instanceof oc) {
                return (oc) c6694zM24444f;
            }
        } while (!c6694zM24444f.oc(c6530k, ni7Var));
        return null;
    }

    @Override // kotlinx.coroutines.channels.lvui
    /* JADX INFO: renamed from: n */
    public void mo23920n(@InterfaceC7396q cyoe.x2<? super Throwable, was> x2Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36867n;
        if (!androidx.concurrent.futures.toq.m906k(atomicReferenceFieldUpdater, this, null, x2Var)) {
            Object obj = this.onCloseHandler;
            if (obj != kotlinx.coroutines.channels.toq.f36857y) {
                throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Another handler was already registered: ", obj));
            }
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        ni7<?> ni7VarM23995i = m23995i();
        if (ni7VarM23995i == null || !androidx.concurrent.futures.toq.m906k(atomicReferenceFieldUpdater, this, x2Var, kotlinx.coroutines.channels.toq.f36857y)) {
            return;
        }
        x2Var.invoke(ni7VarM23995i.f36836g);
    }

    @InterfaceC7396q
    protected final C6694z.toq<?> n7h(E e2) {
        return new toq(this.f36869q, e2);
    }

    @InterfaceC7396q
    protected final kotlinx.coroutines.internal.ni7 ni7() {
        return this.f36869q;
    }

    @Override // kotlinx.coroutines.channels.lvui
    public final boolean oc() {
        return m23995i() != null;
    }

    @Override // kotlinx.coroutines.channels.lvui
    public boolean offer(E e2) {
        C6687o c6687oM24326q;
        try {
            return lvui.C6502k.zy(this, e2);
        } catch (Throwable th) {
            cyoe.x2<E, was> x2Var = this.f36868k;
            if (x2Var == null || (c6687oM24326q = kotlinx.coroutines.internal.d3.m24326q(x2Var, e2, null, 2, null)) == null) {
                throw th;
            }
            C6231h.m22845k(c6687oM24326q, th);
            throw c6687oM24326q;
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: r */
    protected Object mo23878r(E e2) {
        oc<E> ocVarHyr;
        do {
            ocVarHyr = hyr();
            if (ocVarHyr == null) {
                return kotlinx.coroutines.channels.toq.f36855n;
            }
        } while (ocVarHyr.mo23909z(e2, null) == null);
        ocVarHyr.mo23908y(e2);
        return ocVarHyr.mo23891q();
    }

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public final Object mo23921s(E e2) {
        Object objMo23878r = mo23878r(e2);
        if (objMo23878r == kotlinx.coroutines.channels.toq.f36856q) {
            return ki.f81958toq.zy(was.f36763k);
        }
        if (objMo23878r == kotlinx.coroutines.channels.toq.f36855n) {
            ni7<?> ni7VarM23995i = m23995i();
            return ni7VarM23995i == null ? ki.f81958toq.toq() : ki.f81958toq.m23918k(jk(ni7VarM23995i));
        }
        if (objMo23878r instanceof ni7) {
            return ki.f81958toq.m23918k(jk((ni7) objMo23878r));
        }
        throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("trySend returned ", objMo23878r).toString());
    }

    @InterfaceC7396q
    public String toString() {
        return C6551e.m24040k(this) + '@' + C6551e.toq(this) + '{' + fu4() + '}' + cdj();
    }

    protected void x9kr(@InterfaceC7396q C6694z c6694z) {
    }
}

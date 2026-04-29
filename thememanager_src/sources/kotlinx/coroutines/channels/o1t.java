package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.C6144h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.hb;
import kotlin.jvm.internal.bo;
import kotlin.was;
import kotlinx.coroutines.channels.InterfaceC6511s;
import kotlinx.coroutines.gc3c;
import kotlinx.coroutines.internal.C6679l;
import kotlinx.coroutines.selects.InterfaceC6720g;
import kotlinx.coroutines.selects.InterfaceC6723n;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 **\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004*DE-B\u0007¢\u0006\u0004\bB\u00107B\u0011\b\u0016\u0012\u0006\u00108\u001a\u00028\u0000¢\u0006\u0004\bB\u0010CJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\b2\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JX\u0010\u001d\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0011\u001a\u00028\u00002(\u0010\u001c\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b#\u0010$J)\u0010(\u001a\u00020\u00052\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050%j\u0002`&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b*\u0010$J\u001f\u0010-\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0016¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u00100J&\u00102\u001a\b\u0012\u0004\u0012\u00020\u0005012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b2\u00103R\u0017\u00108\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R\u0013\u0010:\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b9\u00105R\u0014\u0010=\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R&\u0010A\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Lkotlinx/coroutines/channels/o1t;", C0846k.d9i, "Lkotlinx/coroutines/channels/s;", "Lkotlinx/coroutines/channels/o1t$q;", "subscriber", "Lkotlin/was;", "ld6", "(Lkotlinx/coroutines/channels/o1t$q;)V", "", "list", "p", "([Lkotlinx/coroutines/channels/o1t$q;Lkotlinx/coroutines/channels/o1t$q;)[Lkotlinx/coroutines/channels/o1t$q;", "ki", "", "cause", "kja0", "(Ljava/lang/Throwable;)V", "element", "Lkotlinx/coroutines/channels/o1t$k;", AnimatedProperty.PROPERTY_NAME_H, "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/o1t$k;", "R", "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/lvui;", "Lkotlin/coroutines/q;", "", "block", "cdj", "(Lkotlinx/coroutines/selects/g;Ljava/lang/Object;Lcyoe/h;)V", "Lkotlinx/coroutines/channels/d3;", "f7l8", "()Lkotlinx/coroutines/channels/d3;", "", "jp0y", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "n", "(Lcyoe/x2;)V", "k", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "q", "(Ljava/util/concurrent/CancellationException;)V", "d3", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ki;", C7704k.y.toq.f44691k, "(Ljava/lang/Object;)Ljava/lang/Object;", "x2", "()Ljava/lang/Object;", "getValue$annotations", "()V", "value", "n7h", "valueOrNull", "oc", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/n;", C7704k.y.toq.f95579toq, "()Lkotlinx/coroutines/selects/n;", "onSend", C4991s.f28129n, "(Ljava/lang/Object;)V", "toq", "zy", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@gc3c
public final class o1t<E> implements InterfaceC6511s<E> {

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f36837g;

    /* JADX INFO: renamed from: n */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f36839n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    @Deprecated
    private static final zy<Object> f36840p;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f36841q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    @Deprecated
    private static final C6679l f36842s;

    @InterfaceC7396q
    private volatile /* synthetic */ Object _state;

    @InterfaceC7396q
    private volatile /* synthetic */ int _updating;

    @InterfaceC7396q
    private volatile /* synthetic */ Object onCloseHandler;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final toq f36838k = new toq(null);

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    @Deprecated
    private static final C6505k f36843y = new C6505k(null);

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.o1t$k */
    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/channels/o1t$k;", "", "", "k", "Ljava/lang/Throwable;", "closeCause", "()Ljava/lang/Throwable;", "sendException", "toq", "valueException", C4991s.f28129n, "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class C6505k {

        /* JADX INFO: renamed from: k */
        @InterfaceC6765n
        @InterfaceC7395n
        public final Throwable f36844k;

        public C6505k(@InterfaceC7395n Throwable th) {
            this.f36844k = th;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final Throwable m23933k() {
            Throwable th = this.f36844k;
            return th == null ? new C6517z(t8r.f36852k) : th;
        }

        @InterfaceC7396q
        public final Throwable toq() {
            Throwable th = this.f36844k;
            return th == null ? new IllegalStateException(t8r.f36852k) : th;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.o1t$n */
    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"kotlinx/coroutines/channels/o1t$n", "Lkotlinx/coroutines/selects/n;", "Lkotlinx/coroutines/channels/lvui;", "R", "Lkotlinx/coroutines/selects/g;", "select", "param", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "block", "Lkotlin/was;", "i", "(Lkotlinx/coroutines/selects/g;Ljava/lang/Object;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6506n implements InterfaceC6723n<E, lvui<? super E>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ o1t<E> f36845k;

        C6506n(o1t<E> o1tVar) {
            this.f36845k = o1tVar;
        }

        @Override // kotlinx.coroutines.selects.InterfaceC6723n
        /* JADX INFO: renamed from: i */
        public <R> void mo23934i(@InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, E e2, @InterfaceC7396q InterfaceC5979h<? super lvui<? super E>, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
            this.f36845k.cdj(interfaceC6720g, e2, interfaceC5979h);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.o1t$q */
    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/o1t$q;", C0846k.d9i, "Lkotlinx/coroutines/channels/wvg;", "Lkotlinx/coroutines/channels/d3;", "", "wasClosed", "Lkotlin/was;", "b", "element", "", "r", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/o1t;", C7704k.y.toq.f44691k, "Lkotlinx/coroutines/channels/o1t;", "broadcastChannel", C4991s.f28129n, "(Lkotlinx/coroutines/channels/o1t;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class C6507q<E> extends wvg<E> implements d3<E> {

        /* JADX INFO: renamed from: s */
        @InterfaceC7396q
        private final o1t<E> f36846s;

        public C6507q(@InterfaceC7396q o1t<E> o1tVar) {
            super(null);
            this.f36846s = o1tVar;
        }

        @Override // kotlinx.coroutines.channels.wvg, kotlinx.coroutines.channels.AbstractC6500k
        /* JADX INFO: renamed from: b */
        protected void mo23899b(boolean z2) {
            if (z2) {
                this.f36846s.ld6(this);
            }
        }

        @Override // kotlinx.coroutines.channels.wvg, kotlinx.coroutines.channels.zy
        @InterfaceC7396q
        /* JADX INFO: renamed from: r */
        public Object mo23878r(E e2) {
            return super.mo23878r(e2);
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/o1t$toq;", "", "Lkotlinx/coroutines/channels/o1t$k;", "CLOSED", "Lkotlinx/coroutines/channels/o1t$k;", "Lkotlinx/coroutines/channels/o1t$zy;", "INITIAL_STATE", "Lkotlinx/coroutines/channels/o1t$zy;", "Lkotlinx/coroutines/internal/l;", "UNDEFINED", "Lkotlinx/coroutines/internal/l;", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B'\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/o1t$zy;", C0846k.d9i, "", "k", "Ljava/lang/Object;", "value", "", "Lkotlinx/coroutines/channels/o1t$q;", "toq", "[Lkotlinx/coroutines/channels/o1t$q;", InterfaceC1925p.tgj1, C4991s.f28129n, "(Ljava/lang/Object;[Lkotlinx/coroutines/channels/o1t$q;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class zy<E> {

        /* JADX INFO: renamed from: k */
        @InterfaceC6765n
        @InterfaceC7395n
        public final Object f36847k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC6765n
        @InterfaceC7395n
        public final C6507q<E>[] f81963toq;

        public zy(@InterfaceC7395n Object obj, @InterfaceC7395n C6507q<E>[] c6507qArr) {
            this.f36847k = obj;
            this.f81963toq = c6507qArr;
        }
    }

    static {
        C6679l c6679l = new C6679l("UNDEFINED");
        f36842s = c6679l;
        f36840p = new zy<>(c6679l, null);
        f36841q = AtomicReferenceFieldUpdater.newUpdater(o1t.class, Object.class, "_state");
        f36839n = AtomicIntegerFieldUpdater.newUpdater(o1t.class, "_updating");
        f36837g = AtomicReferenceFieldUpdater.newUpdater(o1t.class, Object.class, "onCloseHandler");
    }

    public o1t() {
        this._state = f36840p;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> void cdj(InterfaceC6720g<? super R> interfaceC6720g, E e2, InterfaceC5979h<? super lvui<? super E>, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        if (interfaceC6720g.ki()) {
            C6505k c6505kM23930h = m23930h(e2);
            if (c6505kM23930h == null) {
                tww7.toq.m28041q(interfaceC5979h, this, interfaceC6720g.t8r());
            } else {
                interfaceC6720g.zurt(c6505kM23930h.m23933k());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private final C6505k m23930h(E e2) {
        Object obj;
        if (!f36839n.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof C6505k) {
                    return (C6505k) obj;
                }
                if (!(obj instanceof zy)) {
                    throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Invalid state ", obj).toString());
                }
            } finally {
                this._updating = 0;
            }
        } while (!androidx.concurrent.futures.toq.m906k(f36841q, this, obj, new zy(e2, ((zy) obj).f81963toq)));
        C6507q<E>[] c6507qArr = ((zy) obj).f81963toq;
        if (c6507qArr != null) {
            int length = c6507qArr.length;
            int i2 = 0;
            while (i2 < length) {
                C6507q<E> c6507q = c6507qArr[i2];
                i2++;
                c6507q.mo23878r(e2);
            }
        }
        return null;
    }

    private final C6507q<E>[] ki(C6507q<E>[] c6507qArr, C6507q<E> c6507q) {
        int length = c6507qArr.length;
        int iIobz = C6144h.iobz(c6507qArr, c6507q);
        if (length == 1) {
            return null;
        }
        C6507q<E>[] c6507qArr2 = new C6507q[length - 1];
        kotlin.collections.kja0.d8wk(c6507qArr, c6507qArr2, 0, 0, iIobz, 6, null);
        kotlin.collections.kja0.d8wk(c6507qArr, c6507qArr2, iIobz, iIobz + 1, 0, 8, null);
        return c6507qArr2;
    }

    private final void kja0(Throwable th) {
        C6679l c6679l;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (c6679l = kotlinx.coroutines.channels.toq.f36857y) || !androidx.concurrent.futures.toq.m906k(f36837g, this, obj, c6679l)) {
            return;
        }
        ((cyoe.x2) bo.cdj(obj, 1)).invoke(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ld6(C6507q<E> c6507q) {
        Object obj;
        Object obj2;
        C6507q<E>[] c6507qArr;
        do {
            obj = this._state;
            if (obj instanceof C6505k) {
                return;
            }
            if (!(obj instanceof zy)) {
                throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Invalid state ", obj).toString());
            }
            zy zyVar = (zy) obj;
            obj2 = zyVar.f36847k;
            c6507qArr = zyVar.f81963toq;
            kotlin.jvm.internal.d2ok.qrj(c6507qArr);
        } while (!androidx.concurrent.futures.toq.m906k(f36841q, this, obj, new zy(obj2, ki(c6507qArr, c6507q))));
    }

    /* JADX INFO: renamed from: p */
    private final C6507q<E>[] m23931p(C6507q<E>[] c6507qArr, C6507q<E> c6507q) {
        if (c6507qArr != null) {
            return (C6507q[]) kotlin.collections.kja0.kq(c6507qArr, c6507q);
        }
        C6507q<E>[] c6507qArr2 = new C6507q[1];
        for (int i2 = 0; i2 < 1; i2++) {
            c6507qArr2[i2] = c6507q;
        }
        return c6507qArr2;
    }

    public static /* synthetic */ void qrj() {
    }

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC7395n
    public Object d3(E e2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) throws Throwable {
        C6505k c6505kM23930h = m23930h(e2);
        if (c6505kM23930h != null) {
            throw c6505kM23930h.m23933k();
        }
        if (C6199q.x2() == null) {
            return null;
        }
        return was.f36763k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.InterfaceC6511s
    @InterfaceC7396q
    public d3<E> f7l8() {
        Object obj;
        zy zyVar;
        C6507q c6507q = new C6507q(this);
        do {
            obj = this._state;
            if (obj instanceof C6505k) {
                c6507q.mo23876k(((C6505k) obj).f36844k);
                return c6507q;
            }
            if (!(obj instanceof zy)) {
                throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Invalid state ", obj).toString());
            }
            zyVar = (zy) obj;
            Object obj2 = zyVar.f36847k;
            if (obj2 != f36842s) {
                c6507q.mo23878r(obj2);
            }
        } while (!androidx.concurrent.futures.toq.m906k(f36841q, this, obj, new zy(zyVar.f36847k, m23931p(zyVar.f81963toq, c6507q))));
        return c6507q;
    }

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public InterfaceC6723n<E, lvui<E>> mo23919g() {
        return new C6506n(this);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6511s
    /* JADX INFO: renamed from: jp0y, reason: merged with bridge method [inline-methods] */
    public boolean mo23876k(@InterfaceC7395n Throwable th) {
        Object obj;
        int i2;
        do {
            obj = this._state;
            i2 = 0;
            if (obj instanceof C6505k) {
                return false;
            }
            if (!(obj instanceof zy)) {
                throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Invalid state ", obj).toString());
            }
        } while (!androidx.concurrent.futures.toq.m906k(f36841q, this, obj, th == null ? f36843y : new C6505k(th)));
        C6507q<E>[] c6507qArr = ((zy) obj).f81963toq;
        if (c6507qArr != null) {
            int length = c6507qArr.length;
            while (i2 < length) {
                C6507q<E> c6507q = c6507qArr[i2];
                i2++;
                c6507q.mo23876k(th);
            }
        }
        kja0(th);
        return true;
    }

    @Override // kotlinx.coroutines.channels.lvui
    /* JADX INFO: renamed from: n */
    public void mo23920n(@InterfaceC7396q cyoe.x2<? super Throwable, was> x2Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36837g;
        if (!androidx.concurrent.futures.toq.m906k(atomicReferenceFieldUpdater, this, null, x2Var)) {
            Object obj = this.onCloseHandler;
            if (obj != kotlinx.coroutines.channels.toq.f36857y) {
                throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Another handler was already registered: ", obj));
            }
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        Object obj2 = this._state;
        if ((obj2 instanceof C6505k) && androidx.concurrent.futures.toq.m906k(atomicReferenceFieldUpdater, this, x2Var, kotlinx.coroutines.channels.toq.f36857y)) {
            x2Var.invoke(((C6505k) obj2).f36844k);
        }
    }

    @InterfaceC7395n
    public final E n7h() {
        Object obj = this._state;
        if (obj instanceof C6505k) {
            return null;
        }
        if (!(obj instanceof zy)) {
            throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Invalid state ", obj).toString());
        }
        C6679l c6679l = f36842s;
        E e2 = (E) ((zy) obj).f36847k;
        if (e2 == c6679l) {
            return null;
        }
        return e2;
    }

    @Override // kotlinx.coroutines.channels.lvui
    public boolean oc() {
        return this._state instanceof C6505k;
    }

    @Override // kotlinx.coroutines.channels.lvui
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @hb(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e2) {
        return InterfaceC6511s.k.zy(this, e2);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC6511s
    /* JADX INFO: renamed from: q */
    public void mo23877q(@InterfaceC7395n CancellationException cancellationException) {
        mo23876k(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.lvui
    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public Object mo23921s(E e2) {
        C6505k c6505kM23930h = m23930h(e2);
        return c6505kM23930h == null ? ki.f81958toq.zy(was.f36763k) : ki.f81958toq.m23918k(c6505kM23930h.m23933k());
    }

    public final E x2() throws Throwable {
        Object obj = this._state;
        if (obj instanceof C6505k) {
            throw ((C6505k) obj).toq();
        }
        if (!(obj instanceof zy)) {
            throw new IllegalStateException(kotlin.jvm.internal.d2ok.mcp("Invalid state ", obj).toString());
        }
        E e2 = (E) ((zy) obj).f36847k;
        if (e2 != f36842s) {
            return e2;
        }
        throw new IllegalStateException("No value");
    }

    public o1t(E e2) {
        this();
        f36841q.lazySet(this, new zy(e2, null));
    }
}

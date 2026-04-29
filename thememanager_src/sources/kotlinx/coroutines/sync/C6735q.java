package kotlinx.coroutines.sync;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.x2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.cdj;
import kotlinx.coroutines.ch;
import kotlinx.coroutines.internal.AbstractC6689q;
import kotlinx.coroutines.internal.C6694z;
import kotlinx.coroutines.internal.ni7;
import kotlinx.coroutines.internal.oc;
import kotlinx.coroutines.selects.InterfaceC6720g;
import kotlinx.coroutines.selects.InterfaceC6723n;
import kotlinx.coroutines.t8r;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import tww7.C7677k;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.q */
/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0006\t\u001a\u000b\u0015\u0014\u001fB\u000f\u0012\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u001d\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007JT\u0010\u0012\u001a\u00020\u0005\"\u0004\b\u0000\u0010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u0019\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\"\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lkotlinx/coroutines/sync/q;", "Lkotlinx/coroutines/sync/zy;", "Lkotlinx/coroutines/selects/n;", "", "owner", "Lkotlin/was;", C7704k.y.toq.f44691k, "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "k", "(Ljava/lang/Object;)Z", "zy", "R", "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "block", "i", "(Lkotlinx/coroutines/selects/g;Ljava/lang/Object;Lcyoe/h;)V", "n", "q", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "toq", "()Z", "isLocked", AnimatedProperty.PROPERTY_NAME_Y, "isLockedEmptyQueueState", C7704k.y.toq.f95579toq, "()Lkotlinx/coroutines/selects/n;", "onLock", "locked", C4991s.f28129n, "(Z)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class C6735q implements kotlinx.coroutines.sync.zy, InterfaceC6723n<Object, kotlinx.coroutines.sync.zy> {

    /* JADX INFO: renamed from: k */
    static final /* synthetic */ AtomicReferenceFieldUpdater f37428k = AtomicReferenceFieldUpdater.newUpdater(C6735q.class, Object.class, "_state");

    @InterfaceC7396q
    volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.q$f7l8 */
    /* JADX INFO: compiled from: Mutex.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/was;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class f7l8 extends AbstractC6308r implements x2<Throwable, was> {
        final /* synthetic */ Object $owner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f7l8(Object obj) {
            super(1);
            this.$owner = obj;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Throwable th) {
            invoke2(th);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@InterfaceC7396q Throwable th) {
            C6735q.this.mo24604q(this.$owner);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.q$g */
    /* JADX INFO: compiled from: Mutex.kt */
    @d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/sync/q$g;", "Lkotlinx/coroutines/internal/q;", "Lkotlinx/coroutines/sync/q;", "affected", "", "ld6", "failure", "Lkotlin/was;", "p", "Lkotlinx/coroutines/sync/q$q;", "toq", "Lkotlinx/coroutines/sync/q$q;", "queue", C4991s.f28129n, "(Lkotlinx/coroutines/sync/q$q;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class g extends AbstractC6689q<C6735q> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public final q f82075toq;

        public g(@InterfaceC7396q q qVar) {
            this.f82075toq = qVar;
        }

        @Override // kotlinx.coroutines.internal.AbstractC6689q
        @InterfaceC7395n
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Object mo23910s(@InterfaceC7396q C6735q c6735q) {
            if (this.f82075toq.m24383b()) {
                return null;
            }
            return C6734n.f82073toq;
        }

        @Override // kotlinx.coroutines.internal.AbstractC6689q
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo24397q(@InterfaceC7396q C6735q c6735q, @InterfaceC7395n Object obj) {
            androidx.concurrent.futures.toq.m906k(C6735q.f37428k, c6735q, this, obj == null ? C6734n.f37424g : this.f82075toq);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.q$k */
    /* JADX INFO: compiled from: Mutex.kt */
    @d3(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/sync/q$k;", "Lkotlinx/coroutines/sync/q$zy;", "Lkotlinx/coroutines/sync/q;", "", "bf2", "Lkotlin/was;", "y9n", "", "toString", "Lkotlinx/coroutines/cdj;", "p", "Lkotlinx/coroutines/cdj;", "cont", "", "owner", C4991s.f28129n, "(Lkotlinx/coroutines/sync/q;Ljava/lang/Object;Lkotlinx/coroutines/cdj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private final class k extends zy {

        /* JADX INFO: renamed from: p */
        @InterfaceC7396q
        private final cdj<was> f37430p;

        /* JADX INFO: renamed from: kotlinx.coroutines.sync.q$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Mutex.kt */
        @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/was;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class C8090k extends AbstractC6308r implements x2<Throwable, was> {
            final /* synthetic */ C6735q this$0;
            final /* synthetic */ k this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8090k(C6735q c6735q, k kVar) {
                super(1);
                this.this$0 = c6735q;
                this.this$1 = kVar;
            }

            @Override // cyoe.x2
            public /* bridge */ /* synthetic */ was invoke(Throwable th) {
                invoke2(th);
                return was.f36763k;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@InterfaceC7396q Throwable th) {
                this.this$0.mo24604q(this.this$1.f37437g);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public k(@InterfaceC7395n Object obj, @InterfaceC7396q cdj<? super was> cdjVar) {
            super(obj);
            this.f37430p = cdjVar;
        }

        @Override // kotlinx.coroutines.sync.C6735q.zy
        public boolean bf2() {
            return m24607b() && this.f37430p.lvui(was.f36763k, null, new C8090k(C6735q.this, this)) != null;
        }

        @Override // kotlinx.coroutines.internal.C6694z
        @InterfaceC7396q
        public String toString() {
            return "LockCont[" + this.f37437g + ", " + this.f37430p + "] for " + C6735q.this;
        }

        @Override // kotlinx.coroutines.sync.C6735q.zy
        public void y9n() {
            this.f37430p.mo23848r(t8r.f37447q);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.q$n */
    /* JADX INFO: compiled from: Mutex.kt */
    @d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/sync/q$n;", "Lkotlinx/coroutines/internal/toq;", "Lkotlinx/coroutines/internal/q;", "op", "", "zy", "failure", "Lkotlin/was;", "k", "Lkotlinx/coroutines/sync/q;", "toq", "Lkotlinx/coroutines/sync/q;", "mutex", "Ljava/lang/Object;", "owner", C4991s.f28129n, "(Lkotlinx/coroutines/sync/q;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class n extends kotlinx.coroutines.internal.toq {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public final C6735q f82076toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC6765n
        @InterfaceC7395n
        public final Object f82077zy;

        /* JADX INFO: renamed from: kotlinx.coroutines.sync.q$n$k */
        /* JADX INFO: compiled from: Mutex.kt */
        @d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001e\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/sync/q$n$k;", "Lkotlinx/coroutines/internal/oc;", "", "affected", "zy", "Lkotlinx/coroutines/internal/q;", "k", "Lkotlinx/coroutines/internal/q;", "()Lkotlinx/coroutines/internal/q;", "atomicOp", C4991s.f28129n, "(Lkotlinx/coroutines/sync/q$n;Lkotlinx/coroutines/internal/q;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
        private final class k extends oc {

            /* JADX INFO: renamed from: k */
            @InterfaceC7396q
            private final AbstractC6689q<?> f37431k;

            public k(@InterfaceC7396q AbstractC6689q<?> abstractC6689q) {
                this.f37431k = abstractC6689q;
            }

            @Override // kotlinx.coroutines.internal.oc
            @InterfaceC7396q
            /* JADX INFO: renamed from: k */
            public AbstractC6689q<?> mo24394k() {
                return this.f37431k;
            }

            @Override // kotlinx.coroutines.internal.oc
            @InterfaceC7395n
            public Object zy(@InterfaceC7395n Object obj) {
                Object objMo24394k = mo24394k().m24398y() ? C6734n.f37424g : mo24394k();
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
                }
                androidx.concurrent.futures.toq.m906k(C6735q.f37428k, (C6735q) obj, this, objMo24394k);
                return null;
            }
        }

        public n(@InterfaceC7396q C6735q c6735q, @InterfaceC7395n Object obj) {
            this.f82076toq = c6735q;
            this.f82077zy = obj;
        }

        @Override // kotlinx.coroutines.internal.toq
        /* JADX INFO: renamed from: k */
        public void mo24414k(@InterfaceC7396q AbstractC6689q<?> abstractC6689q, @InterfaceC7395n Object obj) {
            kotlinx.coroutines.sync.toq toqVar;
            if (obj != null) {
                toqVar = C6734n.f37424g;
            } else {
                Object obj2 = this.f82077zy;
                toqVar = obj2 == null ? C6734n.f37426n : new kotlinx.coroutines.sync.toq(obj2);
            }
            androidx.concurrent.futures.toq.m906k(C6735q.f37428k, this.f82076toq, abstractC6689q, toqVar);
        }

        @Override // kotlinx.coroutines.internal.toq
        @InterfaceC7395n
        public Object zy(@InterfaceC7396q AbstractC6689q<?> abstractC6689q) {
            k kVar = new k(abstractC6689q);
            return !androidx.concurrent.futures.toq.m906k(C6735q.f37428k, this.f82076toq, C6734n.f37424g, kVar) ? C6734n.f37425k : kVar.zy(this.f82076toq);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.q$q */
    /* JADX INFO: compiled from: Mutex.kt */
    @d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/sync/q$q;", "Lkotlinx/coroutines/internal/ni7;", "", "toString", "", C7704k.y.toq.f95579toq, "Ljava/lang/Object;", "owner", C4991s.f28129n, "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class q extends ni7 {

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        @InterfaceC6765n
        public Object f37432g;

        public q(@InterfaceC7396q Object obj) {
            this.f37432g = obj;
        }

        @Override // kotlinx.coroutines.internal.C6694z
        @InterfaceC7396q
        public String toString() {
            return "LockedQueue[" + this.f37432g + ']';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.q$toq */
    /* JADX INFO: compiled from: Mutex.kt */
    @d3(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BF\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR3\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/sync/q$toq;", "R", "Lkotlinx/coroutines/sync/q$zy;", "Lkotlinx/coroutines/sync/q;", "", "bf2", "Lkotlin/was;", "y9n", "", "toString", "Lkotlinx/coroutines/selects/g;", "p", "Lkotlinx/coroutines/selects/g;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/zy;", "Lkotlin/coroutines/q;", "", AnimatedProperty.PROPERTY_NAME_H, "Lcyoe/h;", "block", "owner", C4991s.f28129n, "(Lkotlinx/coroutines/sync/q;Ljava/lang/Object;Lkotlinx/coroutines/selects/g;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private final class toq<R> extends zy {

        /* JADX INFO: renamed from: h */
        @InterfaceC7396q
        @InterfaceC6765n
        public final InterfaceC5979h<kotlinx.coroutines.sync.zy, InterfaceC6216q<? super R>, Object> f37433h;

        /* JADX INFO: renamed from: p */
        @InterfaceC7396q
        @InterfaceC6765n
        public final InterfaceC6720g<R> f37435p;

        /* JADX INFO: renamed from: kotlinx.coroutines.sync.q$toq$k */
        /* JADX INFO: compiled from: Mutex.kt */
        @d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/was;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class k extends AbstractC6308r implements x2<Throwable, was> {
            final /* synthetic */ C6735q this$0;
            final /* synthetic */ toq<R> this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(C6735q c6735q, toq<R> toqVar) {
                super(1);
                this.this$0 = c6735q;
                this.this$1 = toqVar;
            }

            @Override // cyoe.x2
            public /* bridge */ /* synthetic */ was invoke(Throwable th) {
                invoke2(th);
                return was.f36763k;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@InterfaceC7396q Throwable th) {
                this.this$0.mo24604q(this.this$1.f37437g);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public toq(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, @InterfaceC7396q InterfaceC5979h<? super kotlinx.coroutines.sync.zy, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
            super(obj);
            this.f37435p = interfaceC6720g;
            this.f37433h = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.sync.C6735q.zy
        public boolean bf2() {
            return m24607b() && this.f37435p.ki();
        }

        @Override // kotlinx.coroutines.internal.C6694z
        @InterfaceC7396q
        public String toString() {
            return "LockSelect[" + this.f37437g + ", " + this.f37435p + "] for " + C6735q.this;
        }

        @Override // kotlinx.coroutines.sync.C6735q.zy
        public void y9n() throws Throwable {
            C7677k.m28037q(this.f37433h, C6735q.this, this.f37435p.t8r(), new k(C6735q.this, this));
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.q$zy */
    /* JADX INFO: compiled from: Mutex.kt */
    @d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/sync/q$zy;", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/ch;", "", "b", "()Z", "Lkotlin/was;", "zy", "()V", "bf2", "y9n", "", C7704k.y.toq.f95579toq, "Ljava/lang/Object;", "owner", C4991s.f28129n, "(Lkotlinx/coroutines/sync/q;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private abstract class zy extends C6694z implements ch {

        /* JADX INFO: renamed from: s */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f37436s = AtomicIntegerFieldUpdater.newUpdater(zy.class, "isTaken");

        /* JADX INFO: renamed from: g */
        @InterfaceC6765n
        @InterfaceC7395n
        public final Object f37437g;

        @InterfaceC7396q
        private volatile /* synthetic */ int isTaken = 0;

        public zy(@InterfaceC7395n Object obj) {
            this.f37437g = obj;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m24607b() {
            return f37436s.compareAndSet(this, 0, 1);
        }

        public abstract boolean bf2();

        public abstract void y9n();

        @Override // kotlinx.coroutines.ch
        public final void zy() {
            nn86();
        }
    }

    public C6735q(boolean z2) {
        this._state = z2 ? C6734n.f37426n : C6734n.f37424g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        kotlinx.coroutines.C6668i.zy(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r7 = r0.m24474z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r7 != kotlin.coroutines.intrinsics.C6199q.x2()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        kotlin.coroutines.jvm.internal.C6211y.zy(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r7 != kotlin.coroutines.intrinsics.C6199q.x2()) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        return kotlin.was.f36763k;
     */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m24600s(java.lang.Object r7, kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r8) {
        /*
            r6 = this;
            kotlin.coroutines.q r0 = kotlin.coroutines.intrinsics.toq.m22744n(r8)
            kotlinx.coroutines.ki r0 = kotlinx.coroutines.C6668i.toq(r0)
            kotlinx.coroutines.sync.q$k r1 = new kotlinx.coroutines.sync.q$k
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.toq
            if (r3 == 0) goto L4a
            r3 = r2
            kotlinx.coroutines.sync.toq r3 = (kotlinx.coroutines.sync.toq) r3
            java.lang.Object r4 = r3.f37440k
            kotlinx.coroutines.internal.l r5 = kotlinx.coroutines.sync.C6734n.f7l8()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.C6735q.f37428k
            kotlinx.coroutines.sync.q$q r5 = new kotlinx.coroutines.sync.q$q
            java.lang.Object r3 = r3.f37440k
            r5.<init>(r3)
            androidx.concurrent.futures.toq.m906k(r4, r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            kotlinx.coroutines.sync.toq r3 = kotlinx.coroutines.sync.C6734n.zy()
            goto L37
        L32:
            kotlinx.coroutines.sync.toq r3 = new kotlinx.coroutines.sync.toq
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.C6735q.f37428k
            boolean r2 = androidx.concurrent.futures.toq.m906k(r4, r6, r2, r3)
            if (r2 == 0) goto Ld
            kotlin.was r1 = kotlin.was.f36763k
            kotlinx.coroutines.sync.q$f7l8 r2 = new kotlinx.coroutines.sync.q$f7l8
            r2.<init>(r7)
            r0.n7h(r1, r2)
            goto L71
        L4a:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.C6735q.q
            if (r3 == 0) goto L98
            r3 = r2
            kotlinx.coroutines.sync.q$q r3 = (kotlinx.coroutines.sync.C6735q.q) r3
            java.lang.Object r4 = r3.f37432g
            if (r4 == r7) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L88
            r3.fti(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L6e
            boolean r2 = r1.m24607b()
            if (r2 != 0) goto L68
            goto L6e
        L68:
            kotlinx.coroutines.sync.q$k r1 = new kotlinx.coroutines.sync.q$k
            r1.<init>(r7, r0)
            goto Ld
        L6e:
            kotlinx.coroutines.C6668i.zy(r0, r1)
        L71:
            java.lang.Object r7 = r0.m24474z()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
            if (r7 != r0) goto L7e
            kotlin.coroutines.jvm.internal.C6211y.zy(r8)
        L7e:
            java.lang.Object r8 = kotlin.coroutines.intrinsics.toq.x2()
            if (r7 != r8) goto L85
            return r7
        L85:
            kotlin.was r7 = kotlin.was.f36763k
            return r7
        L88:
            java.lang.String r8 = "Already locked by "
            java.lang.String r7 = kotlin.jvm.internal.d2ok.mcp(r8, r7)
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L98:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.oc
            if (r3 == 0) goto La3
            kotlinx.coroutines.internal.oc r2 = (kotlinx.coroutines.internal.oc) r2
            r2.zy(r6)
            goto Ld
        La3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Illegal state "
            java.lang.String r8 = kotlin.jvm.internal.d2ok.mcp(r8, r2)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C6735q.m24600s(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
    }

    @Override // kotlinx.coroutines.sync.zy
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public InterfaceC6723n<Object, kotlinx.coroutines.sync.zy> mo24601g() {
        return this;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6723n
    /* JADX INFO: renamed from: i */
    public <R> void mo23934i(@InterfaceC7396q InterfaceC6720g<? super R> interfaceC6720g, @InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC5979h<? super kotlinx.coroutines.sync.zy, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        while (!interfaceC6720g.mo24565g()) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.toq) {
                kotlinx.coroutines.sync.toq toqVar = (kotlinx.coroutines.sync.toq) obj2;
                if (toqVar.f37440k != C6734n.f37427q) {
                    androidx.concurrent.futures.toq.m906k(f37428k, this, obj2, new q(toqVar.f37440k));
                } else {
                    Object objFu4 = interfaceC6720g.fu4(new n(this, obj));
                    if (objFu4 == null) {
                        tww7.toq.m28041q(interfaceC5979h, this, interfaceC6720g.t8r());
                        return;
                    } else {
                        if (objFu4 == kotlinx.coroutines.selects.f7l8.m24562q()) {
                            return;
                        }
                        if (objFu4 != C6734n.f37425k && objFu4 != kotlinx.coroutines.internal.zy.f82050toq) {
                            throw new IllegalStateException(d2ok.mcp("performAtomicTrySelect(TryLockDesc) returned ", objFu4).toString());
                        }
                    }
                }
            } else if (obj2 instanceof q) {
                q qVar = (q) obj2;
                if (!(qVar.f37432g != obj)) {
                    throw new IllegalStateException(d2ok.mcp("Already locked by ", obj).toString());
                }
                toq toqVar2 = new toq(obj, interfaceC6720g, interfaceC5979h);
                qVar.fti(toqVar2);
                if (this._state == obj2 || !toqVar2.m24607b()) {
                    interfaceC6720g.mo24566s(toqVar2);
                    return;
                }
            } else {
                if (!(obj2 instanceof oc)) {
                    throw new IllegalStateException(d2ok.mcp("Illegal state ", obj2).toString());
                }
                ((oc) obj2).zy(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.zy
    /* JADX INFO: renamed from: k */
    public boolean mo24602k(@InterfaceC7395n Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.toq) {
                if (((kotlinx.coroutines.sync.toq) obj2).f37440k != C6734n.f37427q) {
                    return false;
                }
                if (androidx.concurrent.futures.toq.m906k(f37428k, this, obj2, obj == null ? C6734n.f37426n : new kotlinx.coroutines.sync.toq(obj))) {
                    return true;
                }
            } else {
                if (obj2 instanceof q) {
                    if (((q) obj2).f37432g != obj) {
                        return false;
                    }
                    throw new IllegalStateException(d2ok.mcp("Already locked by ", obj).toString());
                }
                if (!(obj2 instanceof oc)) {
                    throw new IllegalStateException(d2ok.mcp("Illegal state ", obj2).toString());
                }
                ((oc) obj2).zy(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.zy
    /* JADX INFO: renamed from: n */
    public boolean mo24603n(@InterfaceC7396q Object obj) {
        Object obj2 = this._state;
        if (obj2 instanceof kotlinx.coroutines.sync.toq) {
            if (((kotlinx.coroutines.sync.toq) obj2).f37440k == obj) {
                return true;
            }
        } else if ((obj2 instanceof q) && ((q) obj2).f37432g == obj) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.zy
    /* JADX INFO: renamed from: q */
    public void mo24604q(@InterfaceC7395n Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.toq) {
                if (obj == null) {
                    if (!(((kotlinx.coroutines.sync.toq) obj2).f37440k != C6734n.f37427q)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    kotlinx.coroutines.sync.toq toqVar = (kotlinx.coroutines.sync.toq) obj2;
                    if (!(toqVar.f37440k == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + toqVar.f37440k + " but expected " + obj).toString());
                    }
                }
                if (androidx.concurrent.futures.toq.m906k(f37428k, this, obj2, C6734n.f37424g)) {
                    return;
                }
            } else if (obj2 instanceof oc) {
                ((oc) obj2).zy(this);
            } else {
                if (!(obj2 instanceof q)) {
                    throw new IllegalStateException(d2ok.mcp("Illegal state ", obj2).toString());
                }
                if (obj != null) {
                    q qVar = (q) obj2;
                    if (!(qVar.f37432g == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + qVar.f37432g + " but expected " + obj).toString());
                    }
                }
                q qVar2 = (q) obj2;
                C6694z c6694zM24445j = qVar2.m24445j();
                if (c6694zM24445j == null) {
                    g gVar = new g(qVar2);
                    if (androidx.concurrent.futures.toq.m906k(f37428k, this, obj2, gVar) && gVar.zy(this) == null) {
                        return;
                    }
                } else {
                    zy zyVar = (zy) c6694zM24445j;
                    if (zyVar.bf2()) {
                        Object obj3 = zyVar.f37437g;
                        if (obj3 == null) {
                            obj3 = C6734n.f82074zy;
                        }
                        qVar2.f37432g = obj3;
                        zyVar.y9n();
                        return;
                    }
                }
            }
        }
    }

    @InterfaceC7396q
    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.toq) {
                return "Mutex[" + ((kotlinx.coroutines.sync.toq) obj).f37440k + ']';
            }
            if (!(obj instanceof oc)) {
                if (!(obj instanceof q)) {
                    throw new IllegalStateException(d2ok.mcp("Illegal state ", obj).toString());
                }
                return "Mutex[" + ((q) obj).f37432g + ']';
            }
            ((oc) obj).zy(this);
        }
    }

    @Override // kotlinx.coroutines.sync.zy
    public boolean toq() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.toq) {
                return ((kotlinx.coroutines.sync.toq) obj).f37440k != C6734n.f37427q;
            }
            if (obj instanceof q) {
                return true;
            }
            if (!(obj instanceof oc)) {
                throw new IllegalStateException(d2ok.mcp("Illegal state ", obj).toString());
            }
            ((oc) obj).zy(this);
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m24605y() {
        Object obj = this._state;
        return (obj instanceof q) && ((q) obj).m24383b();
    }

    @Override // kotlinx.coroutines.sync.zy
    @InterfaceC7395n
    public Object zy(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        if (mo24602k(obj)) {
            return was.f36763k;
        }
        Object objM24600s = m24600s(obj, interfaceC6216q);
        return objM24600s == C6199q.x2() ? objM24600s : was.f36763k;
    }
}

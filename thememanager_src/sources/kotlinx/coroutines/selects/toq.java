package kotlinx.coroutines.selects;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import cyoe.x2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6318m;
import kotlin.C6323o;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6207n;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.nn86;
import kotlin.was;
import kotlinx.coroutines.C6697l;
import kotlinx.coroutines.a9;
import kotlinx.coroutines.ch;
import kotlinx.coroutines.ek5k;
import kotlinx.coroutines.eqxt;
import kotlinx.coroutines.gbni;
import kotlinx.coroutines.internal.AbstractC6689q;
import kotlinx.coroutines.internal.C6694z;
import kotlinx.coroutines.internal.ni7;
import kotlinx.coroutines.internal.oc;
import kotlinx.coroutines.py;
import kotlinx.coroutines.selects.InterfaceC6721k;
import kotlinx.coroutines.t8r;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import tww7.C7677k;
import v5yj.C7704k;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes3.dex */
@nn86
@d3(bv = {}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004Z[\\]B\u0015\u0012\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bX\u0010YJ.\u0010\r\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001aH\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u0004\u0018\u00010\t2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J5\u00106\u001a\u00020\u000b*\u0002042\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t05H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107JG\u0010;\u001a\u00020\u000b\"\u0004\b\u0001\u00108*\b\u0012\u0004\u0012\u00028\u0001092\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0:H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<J[\u0010@\u001a\u00020\u000b\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u00108*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020>2\u0006\u0010?\u001a\u00028\u00012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t0:H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ8\u0010D\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020B2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t05H\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010ER\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR(\u0010L\u001a\u0004\u0018\u00010\"2\b\u0010\n\u001a\u0004\u0018\u00010\"8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010%R\u001c\u0010O\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006^"}, d2 = {"Lkotlinx/coroutines/selects/toq;", "R", "Lkotlinx/coroutines/internal/ni7;", "Lkotlinx/coroutines/selects/k;", "Lkotlinx/coroutines/selects/g;", "Lkotlin/coroutines/q;", "Lkotlin/coroutines/jvm/internal/n;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/Function0;", "", "value", "Lkotlin/was;", "block", "zp", "(Lcyoe/k;Lcyoe/k;)V", "a9", "()V", "a", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/o;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "exception", "zurt", "(Ljava/lang/Throwable;)V", "ch", "()Ljava/lang/Object;", "e", "nmn5", "Lkotlinx/coroutines/ch;", "handle", C7704k.y.toq.f44691k, "(Lkotlinx/coroutines/ch;)V", "", "ki", "()Z", "Lkotlinx/coroutines/internal/z$q;", "otherOp", "x2", "(Lkotlinx/coroutines/internal/z$q;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/toq;", "desc", "fu4", "(Lkotlinx/coroutines/internal/toq;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/selects/zy;", "Lkotlin/Function1;", AnimatedProperty.PROPERTY_NAME_H, "(Lkotlinx/coroutines/selects/zy;Lcyoe/x2;)V", "Q", "Lkotlinx/coroutines/selects/q;", "Lkotlin/Function2;", "fn3e", "(Lkotlinx/coroutines/selects/q;Lcyoe/h;)V", "P", "Lkotlinx/coroutines/selects/n;", "param", "ld6", "(Lkotlinx/coroutines/selects/n;Ljava/lang/Object;Lcyoe/h;)V", "", "timeMillis", "n", "(JLcyoe/x2;)V", C7704k.y.toq.f95579toq, "Lkotlin/coroutines/q;", "uCont", AnimatedProperty.PROPERTY_NAME_X, "()Lkotlinx/coroutines/ch;", "lv5", "parentHandle", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/n;", "callerFrame", "Lkotlin/coroutines/f7l8;", "getContext", "()Lkotlin/coroutines/f7l8;", "context", "t8r", "()Lkotlin/coroutines/q;", "completion", "isSelected", C4991s.f28129n, "(Lkotlin/coroutines/q;)V", "k", "toq", "zy", "q", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class toq<R> extends ni7 implements InterfaceC6721k<R>, InterfaceC6720g<R>, InterfaceC6216q<R>, InterfaceC6207n {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final InterfaceC6216q<R> f37404g;

    /* JADX INFO: renamed from: y */
    static final /* synthetic */ AtomicReferenceFieldUpdater f37403y = AtomicReferenceFieldUpdater.newUpdater(toq.class, Object.class, "_state");

    /* JADX INFO: renamed from: s */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f37402s = AtomicReferenceFieldUpdater.newUpdater(toq.class, Object.class, "_result");

    @InterfaceC7396q
    volatile /* synthetic */ Object _state = f7l8.m24558g();

    @InterfaceC7396q
    private volatile /* synthetic */ Object _result = f7l8.f82064zy;

    @InterfaceC7396q
    private volatile /* synthetic */ Object _parentHandle = null;

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.toq$k */
    /* JADX INFO: compiled from: Select.kt */
    @d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/selects/toq$k;", "Lkotlinx/coroutines/internal/q;", "", "ld6", "Lkotlin/was;", "x2", "failure", "p", "affected", C7704k.y.toq.f44691k, "q", "", "toString", "Lkotlinx/coroutines/selects/toq;", "toq", "Lkotlinx/coroutines/selects/toq;", "impl", "Lkotlinx/coroutines/internal/toq;", "zy", "Lkotlinx/coroutines/internal/toq;", "desc", "", com.market.sdk.reflect.toq.f68928f7l8, "f7l8", "()J", "opSequence", C4991s.f28129n, "(Lkotlinx/coroutines/selects/toq;Lkotlinx/coroutines/internal/toq;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class C6727k extends AbstractC6689q<Object> {

        /* JADX INFO: renamed from: q */
        private final long f37405q = f7l8.f37397n.m24573k();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public final toq<?> f82065toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public final kotlinx.coroutines.internal.toq f82066zy;

        public C6727k(@InterfaceC7396q toq<?> toqVar, @InterfaceC7396q kotlinx.coroutines.internal.toq toqVar2) {
            this.f82065toq = toqVar;
            this.f82066zy = toqVar2;
            toqVar2.m24415q(this);
        }

        private final Object ld6() {
            toq<?> toqVar = this.f82065toq;
            while (true) {
                Object obj = toqVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof oc) {
                    ((oc) obj).zy(this.f82065toq);
                } else {
                    if (obj != f7l8.m24558g()) {
                        return f7l8.m24562q();
                    }
                    if (androidx.concurrent.futures.toq.m906k(toq.f37403y, this.f82065toq, f7l8.m24558g(), this)) {
                        return null;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: p */
        private final void m24576p(Object obj) {
            boolean z2 = obj == null;
            if (androidx.concurrent.futures.toq.m906k(toq.f37403y, this.f82065toq, this, z2 ? null : f7l8.m24558g()) && z2) {
                this.f82065toq.m24574a();
            }
        }

        private final void x2() {
            androidx.concurrent.futures.toq.m906k(toq.f37403y, this.f82065toq, this, f7l8.m24558g());
        }

        @Override // kotlinx.coroutines.internal.AbstractC6689q
        public long f7l8() {
            return this.f37405q;
        }

        @Override // kotlinx.coroutines.internal.AbstractC6689q
        /* JADX INFO: renamed from: q */
        public void mo24397q(@InterfaceC7395n Object obj, @InterfaceC7395n Object obj2) {
            m24576p(obj2);
            this.f82066zy.mo24414k(this, obj2);
        }

        @Override // kotlinx.coroutines.internal.AbstractC6689q
        @InterfaceC7395n
        /* JADX INFO: renamed from: s */
        public Object mo23910s(@InterfaceC7395n Object obj) {
            Object objLd6;
            if (obj == null && (objLd6 = ld6()) != null) {
                return objLd6;
            }
            try {
                return this.f82066zy.zy(this);
            } catch (Throwable th) {
                if (obj == null) {
                    x2();
                }
                throw th;
            }
        }

        @Override // kotlinx.coroutines.internal.oc
        @InterfaceC7396q
        public String toString() {
            return "AtomicSelectOp(sequence=" + f7l8() + ')';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.toq$n */
    /* JADX INFO: compiled from: Runnable.kt */
    @d3(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/was;", "run", "()V", "kotlinx/coroutines/b3e$k", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class RunnableC6728n implements Runnable {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ x2 f37407q;

        public RunnableC6728n(x2 x2Var) {
            this.f37407q = x2Var;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            if (toq.this.ki()) {
                C7677k.zy(this.f37407q, toq.this.t8r());
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.toq$q */
    /* JADX INFO: compiled from: Select.kt */
    @d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/selects/toq$q;", "Lkotlinx/coroutines/py;", "", "cause", "Lkotlin/was;", "y9n", C4991s.f28129n, "(Lkotlinx/coroutines/selects/toq;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private final class C6729q extends py {
        public C6729q() {
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(Throwable th) {
            y9n(th);
            return was.f36763k;
        }

        @Override // kotlinx.coroutines.jp0y
        public void y9n(@InterfaceC7395n Throwable th) {
            if (toq.this.ki()) {
                toq.this.zurt(m24638b().d2ok());
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Select.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/selects/toq$toq;", "Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/ch;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/ch;", "handle", C4991s.f28129n, "(Lkotlinx/coroutines/ch;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class C8089toq extends C6694z {

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        @InterfaceC6765n
        public final ch f37409g;

        public C8089toq(@InterfaceC7396q ch chVar) {
            this.f37409g = chVar;
        }
    }

    /* JADX INFO: compiled from: Select.kt */
    @d3(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/selects/toq$zy;", "Lkotlinx/coroutines/internal/oc;", "", "affected", "zy", "Lkotlinx/coroutines/internal/z$q;", "k", "Lkotlinx/coroutines/internal/z$q;", "otherOp", "Lkotlinx/coroutines/internal/q;", "()Lkotlinx/coroutines/internal/q;", "atomicOp", C4991s.f28129n, "(Lkotlinx/coroutines/internal/z$q;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    private static final class zy extends oc {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        @InterfaceC6765n
        public final C6694z.q f37410k;

        public zy(@InterfaceC7396q C6694z.q qVar) {
            this.f37410k = qVar;
        }

        @Override // kotlinx.coroutines.internal.oc
        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public AbstractC6689q<?> mo24394k() {
            return this.f37410k.mo24394k();
        }

        @Override // kotlinx.coroutines.internal.oc
        @InterfaceC7395n
        public Object zy(@InterfaceC7395n Object obj) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
            }
            toq toqVar = (toq) obj;
            this.f37410k.m24451q();
            Object objM24396n = this.f37410k.mo24394k().m24396n(null);
            androidx.concurrent.futures.toq.m906k(toq.f37403y, toqVar, this, objM24396n == null ? this.f37410k.f82045zy : f7l8.m24558g());
            return objM24396n;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public toq(@InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        this.f37404g = interfaceC6216q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m24574a() {
        ch chVarM24575x = m24575x();
        if (chVarM24575x != null) {
            chVarM24575x.zy();
        }
        for (C6694z c6694zHyr = (C6694z) n5r1(); !d2ok.f7l8(c6694zHyr, this); c6694zHyr = c6694zHyr.hyr()) {
            if (c6694zHyr instanceof C8089toq) {
                ((C8089toq) c6694zHyr).f37409g.zy();
            }
        }
    }

    private final void a9() {
        gbni gbniVar = (gbni) getContext().get(gbni.ygy);
        if (gbniVar == null) {
            return;
        }
        ch chVarM24291g = gbni.C6665k.m24291g(gbniVar, true, false, new C6729q(), 2, null);
        lv5(chVarM24291g);
        if (mo24565g()) {
            chVarM24291g.zy();
        }
    }

    private final void lv5(ch chVar) {
        this._parentHandle = chVar;
    }

    /* JADX INFO: renamed from: x */
    private final ch m24575x() {
        return (ch) this._parentHandle;
    }

    private final void zp(InterfaceC5981k<? extends Object> interfaceC5981k, InterfaceC5981k<was> interfaceC5981k2) {
        while (true) {
            Object obj = this._result;
            if (obj == f7l8.f82064zy) {
                if (androidx.concurrent.futures.toq.m906k(f37402s, this, f7l8.f82064zy, interfaceC5981k.invoke())) {
                    return;
                }
            } else {
                if (obj != C6199q.x2()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.toq.m906k(f37402s, this, C6199q.x2(), f7l8.f37398q)) {
                    interfaceC5981k2.invoke();
                    return;
                }
            }
        }
    }

    @nn86
    @InterfaceC7395n
    public final Object ch() {
        if (!mo24565g()) {
            a9();
        }
        Object obj = this._result;
        if (obj == f7l8.f82064zy) {
            if (androidx.concurrent.futures.toq.m906k(f37402s, this, f7l8.f82064zy, C6199q.x2())) {
                return C6199q.x2();
            }
            obj = this._result;
        }
        if (obj == f7l8.f37398q) {
            throw new IllegalStateException("Already resumed");
        }
        if (obj instanceof a9) {
            throw ((a9) obj).f36774k;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.InterfaceC6721k
    public <Q> void fn3e(@InterfaceC7396q InterfaceC6725q<? extends Q> interfaceC6725q, @InterfaceC7396q InterfaceC5979h<? super Q, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        interfaceC6725q.eqxt(this, interfaceC5979h);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6720g
    @InterfaceC7395n
    public Object fu4(@InterfaceC7396q kotlinx.coroutines.internal.toq toqVar) {
        return new C6727k(this, toqVar).zy(null);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6720g
    /* JADX INFO: renamed from: g */
    public boolean mo24565g() {
        while (true) {
            Object obj = this._state;
            if (obj == f7l8.m24558g()) {
                return false;
            }
            if (!(obj instanceof oc)) {
                return true;
            }
            ((oc) obj).zy(this);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public InterfaceC6207n getCallerFrame() {
        InterfaceC6216q<R> interfaceC6216q = this.f37404g;
        if (interfaceC6216q instanceof InterfaceC6207n) {
            return (InterfaceC6207n) interfaceC6216q;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    @InterfaceC7396q
    public kotlin.coroutines.f7l8 getContext() {
        return this.f37404g.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6207n
    @InterfaceC7395n
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6721k
    /* JADX INFO: renamed from: h */
    public void mo24567h(@InterfaceC7396q kotlinx.coroutines.selects.zy zyVar, @InterfaceC7396q x2<? super InterfaceC6216q<? super R>, ? extends Object> x2Var) {
        zyVar.gvn7(this, x2Var);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6720g
    public boolean ki() {
        Object objX2 = x2(null);
        if (objX2 == t8r.f37447q) {
            return true;
        }
        if (objX2 == null) {
            return false;
        }
        throw new IllegalStateException(d2ok.mcp("Unexpected trySelectIdempotent result ", objX2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.InterfaceC6721k
    public <P, Q> void ld6(@InterfaceC7396q InterfaceC6723n<? super P, ? extends Q> interfaceC6723n, P p2, @InterfaceC7396q InterfaceC5979h<? super Q, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        interfaceC6723n.mo23934i(this, p2, interfaceC5979h);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6721k
    /* JADX INFO: renamed from: n */
    public void mo24568n(long j2, @InterfaceC7396q x2<? super InterfaceC6216q<? super R>, ? extends Object> x2Var) {
        if (j2 > 0) {
            mo24566s(ek5k.m24045q(getContext()).i1(j2, new RunnableC6728n(x2Var), getContext()));
        } else if (ki()) {
            tww7.toq.zy(x2Var, t8r());
        }
    }

    @nn86
    public final void nmn5(@InterfaceC7396q Throwable th) {
        if (ki()) {
            C6323o.k kVar = C6323o.Companion;
            resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(th)));
        } else {
            if (th instanceof CancellationException) {
                return;
            }
            Object objCh = ch();
            if ((objCh instanceof a9) && ((a9) objCh).f36774k == th) {
                return;
            }
            C6697l.toq(getContext(), th);
        }
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6721k
    public <P, Q> void o1t(@InterfaceC7396q InterfaceC6723n<? super P, ? extends Q> interfaceC6723n, @InterfaceC7396q InterfaceC5979h<? super Q, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        InterfaceC6721k.k.m24569k(this, interfaceC6723n, interfaceC5979h);
    }

    @Override // kotlin.coroutines.InterfaceC6216q
    public void resumeWith(@InterfaceC7396q Object obj) {
        while (true) {
            Object obj2 = this._result;
            if (obj2 == f7l8.f82064zy) {
                if (androidx.concurrent.futures.toq.m906k(f37402s, this, f7l8.f82064zy, eqxt.m24047q(obj, null, 1, null))) {
                    return;
                }
            } else {
                if (obj2 != C6199q.x2()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.toq.m906k(f37402s, this, C6199q.x2(), f7l8.f37398q)) {
                    if (!C6323o.m28285isFailureimpl(obj)) {
                        this.f37404g.resumeWith(obj);
                        return;
                    }
                    InterfaceC6216q<R> interfaceC6216q = this.f37404g;
                    Throwable thM28283exceptionOrNullimpl = C6323o.m28283exceptionOrNullimpl(obj);
                    d2ok.qrj(thM28283exceptionOrNullimpl);
                    C6323o.k kVar = C6323o.Companion;
                    interfaceC6216q.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(thM28283exceptionOrNullimpl)));
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6720g
    /* JADX INFO: renamed from: s */
    public void mo24566s(@InterfaceC7396q ch chVar) {
        C8089toq c8089toq = new C8089toq(chVar);
        if (!mo24565g()) {
            fti(c8089toq);
            if (!mo24565g()) {
                return;
            }
        }
        chVar.zy();
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6720g
    @InterfaceC7396q
    public InterfaceC6216q<R> t8r() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.C6694z
    @InterfaceC7396q
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        m24574a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return kotlinx.coroutines.t8r.f37447q;
     */
    @Override // kotlinx.coroutines.selects.InterfaceC6720g
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x2(@mub.InterfaceC7395n kotlinx.coroutines.internal.C6694z.q r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = kotlinx.coroutines.selects.f7l8.m24558g()
            r2 = 0
            if (r0 != r1) goto L37
            if (r4 != 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.toq.f37403y
            java.lang.Object r1 = kotlinx.coroutines.selects.f7l8.m24558g()
            boolean r0 = androidx.concurrent.futures.toq.m906k(r0, r3, r1, r2)
            if (r0 != 0) goto L31
            goto L0
        L18:
            kotlinx.coroutines.selects.toq$zy r0 = new kotlinx.coroutines.selects.toq$zy
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.toq.f37403y
            java.lang.Object r2 = kotlinx.coroutines.selects.f7l8.m24558g()
            boolean r1 = androidx.concurrent.futures.toq.m906k(r1, r3, r2, r0)
            if (r1 != 0) goto L2a
            goto L0
        L2a:
            java.lang.Object r4 = r0.zy(r3)
            if (r4 == 0) goto L31
            return r4
        L31:
            r3.m24574a()
            kotlinx.coroutines.internal.l r4 = kotlinx.coroutines.t8r.f37447q
            return r4
        L37:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.oc
            if (r1 == 0) goto L6b
            if (r4 == 0) goto L65
            kotlinx.coroutines.internal.q r1 = r4.mo24394k()
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.toq.C6727k
            if (r2 == 0) goto L59
            r2 = r1
            kotlinx.coroutines.selects.toq$k r2 = (kotlinx.coroutines.selects.toq.C6727k) r2
            kotlinx.coroutines.selects.toq<?> r2 = r2.f82065toq
            if (r2 == r3) goto L4d
            goto L59
        L4d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use matching select clauses on the same object"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L59:
            r2 = r0
            kotlinx.coroutines.internal.oc r2 = (kotlinx.coroutines.internal.oc) r2
            boolean r1 = r1.toq(r2)
            if (r1 == 0) goto L65
            java.lang.Object r4 = kotlinx.coroutines.internal.zy.f82050toq
            return r4
        L65:
            kotlinx.coroutines.internal.oc r0 = (kotlinx.coroutines.internal.oc) r0
            r0.zy(r3)
            goto L0
        L6b:
            if (r4 != 0) goto L6e
            return r2
        L6e:
            kotlinx.coroutines.internal.z$k r4 = r4.f82045zy
            if (r0 != r4) goto L75
            kotlinx.coroutines.internal.l r4 = kotlinx.coroutines.t8r.f37447q
            return r4
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.toq.x2(kotlinx.coroutines.internal.z$q):java.lang.Object");
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6720g
    public void zurt(@InterfaceC7396q Throwable th) {
        while (true) {
            Object obj = this._result;
            if (obj == f7l8.f82064zy) {
                if (androidx.concurrent.futures.toq.m906k(f37402s, this, f7l8.f82064zy, new a9(th, false, 2, null))) {
                    return;
                }
            } else {
                if (obj != C6199q.x2()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.toq.m906k(f37402s, this, C6199q.x2(), f7l8.f37398q)) {
                    InterfaceC6216q interfaceC6216qM22747n = kotlin.coroutines.intrinsics.zy.m22747n(this.f37404g);
                    C6323o.k kVar = C6323o.Companion;
                    interfaceC6216qM22747n.resumeWith(C6323o.m28280constructorimpl(C6318m.m23191k(th)));
                    return;
                }
            }
        }
    }
}

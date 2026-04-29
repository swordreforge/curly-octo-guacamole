package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.C6318m;
import kotlin.C6480z;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.hb;
import kotlin.internal.InterfaceC6234g;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Lint.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\"\u0010\u000f\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0007\u001ao\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\b\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001ah\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\n\u0010\u001e\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001cH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0084\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012Y\b\b\u0010\u001e\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150!¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a)\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a)\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b)\u0010'\u001a#\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b+\u0010'\"\"\u00100\u001a\u00020\u001d*\u0006\u0012\u0002\b\u00030\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-\"\"\u00104\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/d3;", "Lkotlinx/coroutines/flow/s;", "zy", "Lkotlin/coroutines/f7l8;", "context", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/flow/hyr;", "n", "f7l8", "Lkotlinx/coroutines/flow/p;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/was;", "k", "Lkotlin/Function3;", "", "Lkotlin/c;", "name", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "action", "q", "(Lkotlinx/coroutines/flow/d3;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", "", "retries", "Lkotlin/Function2;", "", "predicate", "qrj", "(Lkotlinx/coroutines/flow/d3;JLcyoe/h;)Lkotlinx/coroutines/flow/s;", "Lkotlin/Function4;", "attempt", "kja0", "(Lkotlinx/coroutines/flow/d3;Lcyoe/ki;)Lkotlinx/coroutines/flow/s;", "", AnimatedProperty.PROPERTY_NAME_H, "(Lkotlinx/coroutines/flow/d3;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "cdj", "", C7704k.y.toq.f95579toq, "ld6", "(Lkotlinx/coroutines/flow/p;)Z", "isActive$annotations", "(Lkotlinx/coroutines/flow/p;)V", "isActive", C7704k.y.toq.f44691k, "(Lkotlinx/coroutines/flow/p;)Lkotlin/coroutines/f7l8;", "getCoroutineContext$annotations", "coroutineContext", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class mcp {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.mcp$k */
    /* JADX INFO: compiled from: Lint.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.LintKt$retry$1", m22756f = "Lint.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "", "it", "", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class C6605k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<Throwable, InterfaceC6216q<? super Boolean>, Object> {
        int label;

        public C6605k(InterfaceC6216q<? super C6605k> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C6605k(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q Throwable th, @InterfaceC7395n InterfaceC6216q<? super Boolean> interfaceC6216q) {
            return ((C6605k) create(th, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            return kotlin.coroutines.jvm.internal.toq.m22766k(true);
        }
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    private static final <T> Object cdj(d3<? extends T> d3Var, InterfaceC6216q<? super Set<? extends T>> interfaceC6216q) {
        kotlin.jvm.internal.d3.m23089n(0);
        Object objM24152n = kja0.m24152n(d3Var, null, interfaceC6216q, 1, null);
        kotlin.jvm.internal.d3.m23089n(1);
        return objM24152n;
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @hb(expression = "this", imports = {}))
    public static final <T> InterfaceC6622s<T> f7l8(@InterfaceC7396q hyr<? extends T> hyrVar) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    /* JADX INFO: renamed from: g */
    private static final <T> Object m24184g(d3<? extends T> d3Var, InterfaceC6216q<? super Integer> interfaceC6216q) {
        kotlin.jvm.internal.d3.m23089n(0);
        Object objM24159e = ld6.m24159e(d3Var, interfaceC6216q);
        kotlin.jvm.internal.d3.m23089n(1);
        return objM24159e;
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    /* JADX INFO: renamed from: h */
    private static final <T> Object m24185h(d3<? extends T> d3Var, InterfaceC6216q<? super List<? extends T>> interfaceC6216q) {
        kotlin.jvm.internal.d3.m23089n(0);
        Object objZy = kja0.zy(d3Var, null, interfaceC6216q, 1, null);
        kotlin.jvm.internal.d3.m23089n(1);
        return objZy;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @hb(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    /* JADX INFO: renamed from: k */
    public static final void m24186k(@InterfaceC7396q InterfaceC6618p<?> interfaceC6618p, @InterfaceC7395n CancellationException cancellationException) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @hb(expression = "this", imports = {}))
    private static final <T> InterfaceC6622s<T> kja0(d3<? extends T> d3Var, cyoe.ki<? super InterfaceC6618p<? super T>, ? super Throwable, ? super Long, ? super InterfaceC6216q<? super Boolean>, ? extends Object> kiVar) {
        return ld6.ebn(d3Var, kiVar);
    }

    public static final boolean ld6(@InterfaceC7396q InterfaceC6618p<?> interfaceC6618p) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @hb(expression = "this", imports = {}))
    /* JADX INFO: renamed from: n */
    public static final <T> InterfaceC6622s<T> m24187n(@InterfaceC7396q hyr<? extends T> hyrVar) {
        ld6.kcsr();
        throw new C6480z();
    }

    static /* synthetic */ InterfaceC6622s n7h(d3 d3Var, long j2, InterfaceC5979h interfaceC5979h, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = Long.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            interfaceC5979h = new C6605k(null);
        }
        return ld6.m28296do(d3Var, j2, interfaceC5979h);
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @hb(expression = "currentCoroutineContext()", imports = {}))
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m24188p(InterfaceC6618p interfaceC6618p) {
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @hb(expression = "this", imports = {}))
    /* JADX INFO: renamed from: q */
    private static final <T> InterfaceC6622s<T> m24189q(d3<? extends T> d3Var, cyoe.cdj<? super InterfaceC6618p<? super T>, ? super Throwable, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar) {
        return ld6.fn3e(d3Var, cdjVar);
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @hb(expression = "this", imports = {}))
    private static final <T> InterfaceC6622s<T> qrj(d3<? extends T> d3Var, long j2, InterfaceC5979h<? super Throwable, ? super InterfaceC6216q<? super Boolean>, ? extends Object> interfaceC5979h) {
        return ld6.m28296do(d3Var, j2, interfaceC5979h);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final kotlin.coroutines.f7l8 m24190s(@InterfaceC7396q InterfaceC6618p<?> interfaceC6618p) {
        ld6.kcsr();
        throw new C6480z();
    }

    public static /* synthetic */ void toq(InterfaceC6618p interfaceC6618p, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        m24186k(interfaceC6618p, cancellationException);
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @hb(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void x2(InterfaceC6618p interfaceC6618p) {
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @hb(expression = "this", imports = {}))
    /* JADX INFO: renamed from: y */
    public static final <T> InterfaceC6622s<T> m24191y(@InterfaceC7396q d3<? extends T> d3Var, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        ld6.kcsr();
        throw new C6480z();
    }

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @hb(expression = "this", imports = {}))
    public static final <T> InterfaceC6622s<T> zy(@InterfaceC7396q d3<? extends T> d3Var) {
        ld6.kcsr();
        throw new C6480z();
    }
}

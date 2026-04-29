package kotlinx.coroutines;

import com.android.thememanager.basemodule.network.theme.interceptors.C1774q;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.f7l8;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 ,2\u00020\u0001:\u0001-J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\b\u0010\n\u001a\u00020\bH\u0017J\u0014\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000bH'J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'J\u0013\u0010\u0011\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0019\u001a\u00020\u00182'\u0010\u0017\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0016H&JE\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052'\u0010\u0017\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0016H'J\u0011\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0097\u0002R\u0014\u0010\u001f\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0014\u0010#\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010 R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lkotlinx/coroutines/gbni;", "Lkotlin/coroutines/f7l8$toq;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "d2ok", "", "start", "cause", "Lkotlin/was;", "q", "cancel", "", "k", "Lkotlinx/coroutines/z;", C1774q.as, "Lkotlinx/coroutines/ni7;", "ngy", "was", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/c;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/ch;", "yz", "onCancelling", "invokeImmediately", "ij", C2690k.k.f61039ld6, "y9n", "isActive", "()Z", "p", "isCompleted", "isCancelled", "Lkotlin/sequences/qrj;", "wvg", "()Lkotlin/sequences/qrj;", "children", "Lkotlinx/coroutines/selects/zy;", "h7am", "()Lkotlinx/coroutines/selects/zy;", "onJoin", "ygy", "toq", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface gbni extends f7l8.toq {

    @InterfaceC7396q
    public static final toq ygy = toq.f37189k;

    /* JADX INFO: renamed from: kotlinx.coroutines.gbni$k */
    /* JADX INFO: compiled from: Job.kt */
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class C6665k {
        @InterfaceC7396q
        public static kotlin.coroutines.f7l8 f7l8(@InterfaceC7396q gbni gbniVar, @InterfaceC7396q f7l8.zy<?> zyVar) {
            return f7l8.toq.C6196k.zy(gbniVar, zyVar);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ ch m24291g(gbni gbniVar, boolean z2, boolean z3, cyoe.x2 x2Var, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            if ((i2 & 2) != 0) {
                z3 = true;
            }
            return gbniVar.ij(z2, z3, x2Var);
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: n */
        public static <E extends f7l8.toq> E m24293n(@InterfaceC7396q gbni gbniVar, @InterfaceC7396q f7l8.zy<E> zyVar) {
            return (E) f7l8.toq.C6196k.toq(gbniVar, zyVar);
        }

        /* JADX INFO: renamed from: q */
        public static <R> R m24294q(@InterfaceC7396q gbni gbniVar, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super f7l8.toq, ? extends R> interfaceC5979h) {
            return (R) f7l8.toq.C6196k.m22735k(gbniVar, r2, interfaceC5979h);
        }

        @InterfaceC7396q
        @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        /* JADX INFO: renamed from: s */
        public static gbni m24295s(@InterfaceC7396q gbni gbniVar, @InterfaceC7396q gbni gbniVar2) {
            return gbniVar2;
        }

        public static /* synthetic */ void toq(gbni gbniVar, CancellationException cancellationException, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                cancellationException = null;
            }
            gbniVar.mo23862q(cancellationException);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: y */
        public static kotlin.coroutines.f7l8 m24296y(@InterfaceC7396q gbni gbniVar, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
            return f7l8.toq.C6196k.m22736q(gbniVar, f7l8Var);
        }

        public static /* synthetic */ boolean zy(gbni gbniVar, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                th = null;
            }
            return gbniVar.mo23861k(th);
        }
    }

    /* JADX INFO: compiled from: Job.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/gbni$toq;", "Lkotlin/coroutines/f7l8$zy;", "Lkotlinx/coroutines/gbni;", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq implements f7l8.zy<gbni> {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ toq f37189k = new toq();

        private toq() {
        }
    }

    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @InterfaceC7396q
    @tfm
    CancellationException d2ok();

    @InterfaceC7396q
    kotlinx.coroutines.selects.zy h7am();

    @InterfaceC7396q
    @tfm
    ch ij(boolean z2, boolean z3, @InterfaceC7396q cyoe.x2<? super Throwable, kotlin.was> x2Var);

    boolean isActive();

    boolean isCancelled();

    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: k */
    /* synthetic */ boolean mo23861k(Throwable th);

    @InterfaceC7396q
    @tfm
    ni7 ngy(@InterfaceC7396q InterfaceC6749z interfaceC6749z);

    /* JADX INFO: renamed from: p */
    boolean mo24059p();

    /* JADX INFO: renamed from: q */
    void mo23862q(@InterfaceC7395n CancellationException cancellationException);

    boolean start();

    @InterfaceC7395n
    Object was(@InterfaceC7396q InterfaceC6216q<? super kotlin.was> interfaceC6216q);

    @InterfaceC7396q
    kotlin.sequences.qrj<gbni> wvg();

    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    gbni y9n(@InterfaceC7396q gbni gbniVar);

    @InterfaceC7396q
    ch yz(@InterfaceC7396q cyoe.x2<? super Throwable, kotlin.was> x2Var);
}

package kotlinx.coroutines;

import com.android.thememanager.basemodule.network.theme.interceptors.C1774q;
import com.market.sdk.reflect.C4991s;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractC6212k;
import kotlin.coroutines.InterfaceC6216q;
import kotlinx.coroutines.gbni;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: NonCancellable.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b4\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0013\u0010\u0006\u001a\u00020\u0005H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00060\bj\u0002`\tH\u0017J1\u0010\u0013\u001a\u00020\u00122'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017JA\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017J\u0018\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0017J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0017J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u001a\u0010!\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"R\u001a\u0010(\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\"R\u001a\u0010.\u001a\u00020*8VX\u0097\u0004¢\u0006\f\u0012\u0004\b-\u0010$\u001a\u0004\b+\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00020/8VX\u0097\u0004¢\u0006\f\u0012\u0004\b2\u0010$\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lkotlinx/coroutines/kcsr;", "Lkotlin/coroutines/k;", "Lkotlinx/coroutines/gbni;", "", "start", "Lkotlin/was;", "was", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "d2ok", "Lkotlin/Function1;", "", "Lkotlin/c;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/ch;", "yz", "onCancelling", "invokeImmediately", "ij", "q", "k", "Lkotlinx/coroutines/z;", C1774q.as, "Lkotlinx/coroutines/ni7;", "ngy", "", "toString", "Ljava/lang/String;", "message", "isActive", "()Z", "isActive$annotations", "()V", "p", "isCompleted$annotations", "isCompleted", "isCancelled", "isCancelled$annotations", "Lkotlinx/coroutines/selects/zy;", "h7am", "()Lkotlinx/coroutines/selects/zy;", "getOnJoin$annotations", "onJoin", "Lkotlin/sequences/qrj;", "wvg", "()Lkotlin/sequences/qrj;", "getChildren$annotations", "children", C4991s.f28129n, "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class kcsr extends AbstractC6212k implements gbni {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final kcsr f37281k = new kcsr();

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final String f37282q = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    private kcsr() {
        super(gbni.ygy);
    }

    @kotlin.ld6(level = kotlin.qrj.WARNING, message = f37282q)
    public static /* synthetic */ void bap7() {
    }

    @kotlin.ld6(level = kotlin.qrj.WARNING, message = f37282q)
    public static /* synthetic */ void e5() {
    }

    @kotlin.ld6(level = kotlin.qrj.WARNING, message = f37282q)
    public static /* synthetic */ void ga() {
    }

    @kotlin.ld6(level = kotlin.qrj.WARNING, message = f37282q)
    public static /* synthetic */ void h4b() {
    }

    @kotlin.ld6(level = kotlin.qrj.WARNING, message = f37282q)
    public static /* synthetic */ void wlev() {
    }

    @Override // kotlinx.coroutines.gbni, kotlinx.coroutines.channels.d3
    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        mo23862q(null);
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = f37282q)
    public CancellationException d2ok() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    public kotlinx.coroutines.selects.zy h7am() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = f37282q)
    public ch ij(boolean z2, boolean z3, @InterfaceC7396q cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        return bwp.f36798k;
    }

    @Override // kotlinx.coroutines.gbni
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.gbni
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.gbni, kotlinx.coroutines.channels.d3
    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: k */
    public /* synthetic */ boolean mo23861k(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = f37282q)
    public ni7 ngy(@InterfaceC7396q InterfaceC6749z interfaceC6749z) {
        return bwp.f36798k;
    }

    @Override // kotlinx.coroutines.gbni
    /* JADX INFO: renamed from: p */
    public boolean mo24059p() {
        return false;
    }

    @Override // kotlinx.coroutines.gbni, kotlinx.coroutines.channels.d3
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = f37282q)
    /* JADX INFO: renamed from: q */
    public void mo23862q(@InterfaceC7395n CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.gbni
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = f37282q)
    public boolean start() {
        return false;
    }

    @InterfaceC7396q
    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7395n
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = f37282q)
    public Object was(@InterfaceC7396q InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    public kotlin.sequences.qrj<gbni> wvg() {
        return kotlin.sequences.t8r.f7l8();
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public gbni y9n(@InterfaceC7396q gbni gbniVar) {
        return gbni.C6665k.m24295s(this, gbniVar);
    }

    @Override // kotlinx.coroutines.gbni
    @InterfaceC7396q
    @kotlin.ld6(level = kotlin.qrj.WARNING, message = f37282q)
    public ch yz(@InterfaceC7396q cyoe.x2<? super Throwable, kotlin.was> x2Var) {
        return bwp.f36798k;
    }
}

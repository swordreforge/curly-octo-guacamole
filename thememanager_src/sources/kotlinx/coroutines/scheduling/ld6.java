package kotlinx.coroutines.scheduling;

import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b \u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0012\u0010\u000e\u001a\u00020\u000b8Æ\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/scheduling/ld6;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "k", com.market.sdk.reflect.toq.f68928f7l8, "submissionTime", "Lkotlinx/coroutines/scheduling/x2;", "q", "Lkotlinx/coroutines/scheduling/x2;", "taskContext", "", "toq", "()I", "mode", C4991s.f28129n, "(JLkotlinx/coroutines/scheduling/x2;)V", "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class ld6 implements Runnable {

    /* JADX INFO: renamed from: k */
    @InterfaceC6765n
    public long f37378k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @InterfaceC6765n
    public x2 f37379q;

    public ld6(long j2, @InterfaceC7396q x2 x2Var) {
        this.f37378k = j2;
        this.f37379q = x2Var;
    }

    public final int toq() {
        return this.f37379q.bwp();
    }

    public ld6() {
        this(0L, kja0.f37376s);
    }
}

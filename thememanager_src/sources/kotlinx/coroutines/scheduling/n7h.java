package kotlinx.coroutines.scheduling;

import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlinx.coroutines.C6551e;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/scheduling/n7h;", "Lkotlinx/coroutines/scheduling/ld6;", "Lkotlin/was;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "n", "Ljava/lang/Runnable;", "block", "", "submissionTime", "Lkotlinx/coroutines/scheduling/x2;", "taskContext", C4991s.f28129n, "(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/x2;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class n7h extends ld6 {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    @InterfaceC6765n
    public final Runnable f37385n;

    public n7h(@InterfaceC7396q Runnable runnable, long j2, @InterfaceC7396q x2 x2Var) {
        super(j2, x2Var);
        this.f37385n = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f37385n.run();
        } finally {
            this.f37379q.ltg8();
        }
    }

    @InterfaceC7396q
    public String toString() {
        return "Task[" + C6551e.m24040k(this.f37385n) + '@' + C6551e.toq(this.f37385n) + ", " + this.f37378k + ", " + this.f37379q + ']';
    }
}

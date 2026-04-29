package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import java.util.concurrent.locks.LockSupport;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.y */
/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/y;", C0846k.zaso, "Lkotlinx/coroutines/k;", "", "state", "Lkotlin/was;", "lrht", "ebn", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "n", "Ljava/lang/Thread;", "blockedThread", "Lkotlinx/coroutines/u;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/u;", "eventLoop", "", "wo", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/f7l8;", "parentContext", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;Ljava/lang/Thread;Lkotlinx/coroutines/u;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class C6748y<T> extends AbstractC6696k<T> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private final AbstractC6741u f37487g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final Thread f37488n;

    public C6748y(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q Thread thread, @InterfaceC7395n AbstractC6741u abstractC6741u) {
        super(f7l8Var, true, true);
        this.f37488n = thread;
        this.f37487g = abstractC6741u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T ebn() throws Throwable {
        kotlin.was wasVar;
        toq qVar = zy.toq();
        if (qVar != null) {
            qVar.m24631q();
        }
        try {
            AbstractC6741u abstractC6741u = this.f37487g;
            if (abstractC6741u != null) {
                AbstractC6741u.o05(abstractC6741u, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC6741u abstractC6741u2 = this.f37487g;
                    long jB8 = abstractC6741u2 == null ? Long.MAX_VALUE : abstractC6741u2.b8();
                    if (mo24059p()) {
                        T t2 = (T) sok.kja0(mu());
                        a9Var = t2 instanceof a9 ? (a9) t2 : null;
                        if (a9Var == null) {
                            return t2;
                        }
                        throw a9Var.f36774k;
                    }
                    toq qVar2 = zy.toq();
                    if (qVar2 == null) {
                        wasVar = null;
                    } else {
                        qVar2.zy(this, jB8);
                        wasVar = kotlin.was.f36763k;
                    }
                    if (wasVar == null) {
                        LockSupport.parkNanos(this, jB8);
                    }
                } finally {
                    AbstractC6741u abstractC6741u3 = this.f37487g;
                    if (abstractC6741u3 != null) {
                        AbstractC6741u.vy(abstractC6741u3, false, 1, null);
                    }
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m24056e(interruptedException);
            throw interruptedException;
        } finally {
            toq qVar3 = zy.toq();
            if (qVar3 != null) {
                qVar3.m24633y();
            }
        }
    }

    @Override // kotlinx.coroutines.etdu
    protected void lrht(@InterfaceC7395n Object obj) {
        kotlin.was wasVar;
        if (kotlin.jvm.internal.d2ok.f7l8(Thread.currentThread(), this.f37488n)) {
            return;
        }
        Thread thread = this.f37488n;
        toq qVar = zy.toq();
        if (qVar == null) {
            wasVar = null;
        } else {
            qVar.f7l8(thread);
            wasVar = kotlin.was.f36763k;
        }
        if (wasVar == null) {
            LockSupport.unpark(thread);
        }
    }

    @Override // kotlinx.coroutines.etdu
    protected boolean wo() {
        return true;
    }
}

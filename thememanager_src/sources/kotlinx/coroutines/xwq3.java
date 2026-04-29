package kotlinx.coroutines;

import com.market.sdk.reflect.C4991s;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.f7l8;
import kotlin.jvm.internal.AbstractC6308r;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H&R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/xwq3;", "Lkotlinx/coroutines/dd;", "Ljava/io/Closeable;", "Lkotlin/was;", "close", "Ljava/util/concurrent/Executor;", "dxef", "()Ljava/util/concurrent/Executor;", "executor", C4991s.f28129n, "()V", "q", "k", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class xwq3 extends dd implements Closeable {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C6747k f37486q = new C6747k(null);

    /* JADX INFO: renamed from: kotlinx.coroutines.xwq3$k */
    /* JADX INFO: compiled from: Executors.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/xwq3$k;", "Lkotlin/coroutines/toq;", "Lkotlinx/coroutines/dd;", "Lkotlinx/coroutines/xwq3;", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    @kotlin.ki
    public static final class C6747k extends kotlin.coroutines.toq<dd, xwq3> {

        /* JADX INFO: renamed from: kotlinx.coroutines.xwq3$k$k */
        /* JADX INFO: compiled from: Executors.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/f7l8$toq;", "it", "Lkotlinx/coroutines/xwq3;", "invoke", "(Lkotlin/coroutines/f7l8$toq;)Lkotlinx/coroutines/xwq3;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class k extends AbstractC6308r implements cyoe.x2<f7l8.toq, xwq3> {
            public static final k INSTANCE = new k();

            k() {
                super(1);
            }

            @Override // cyoe.x2
            @InterfaceC7395n
            public final xwq3 invoke(@InterfaceC7396q f7l8.toq toqVar) {
                if (toqVar instanceof xwq3) {
                    return (xwq3) toqVar;
                }
                return null;
            }
        }

        private C6747k() {
            super(dd.f36882k, k.INSTANCE);
        }

        public /* synthetic */ C6747k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    public abstract void close();

    @InterfaceC7396q
    public abstract Executor dxef();
}

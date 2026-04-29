package kotlinx.coroutines.selects;

import com.market.sdk.reflect.C4991s;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.d3;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.s */
/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/selects/s;", "", "", "k", "()J", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class C6726s {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ AtomicLongFieldUpdater f37401k = AtomicLongFieldUpdater.newUpdater(C6726s.class, "number");

    @InterfaceC7396q
    private volatile /* synthetic */ long number = 1;

    /* JADX INFO: renamed from: k */
    public final long m24573k() {
        return f37401k.incrementAndGet(this);
    }
}

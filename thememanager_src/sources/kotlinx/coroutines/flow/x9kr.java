package kotlinx.coroutines.flow;

import kotlin.time.C6467n;
import kotlinx.coroutines.flow.dd;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/dd$k;", "Lkotlin/time/n;", "stopTimeout", "replayExpiration", "Lkotlinx/coroutines/flow/dd;", "k", "(Lkotlinx/coroutines/flow/dd$k;JJ)Lkotlinx/coroutines/flow/dd;", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class x9kr {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final dd m24271k(@InterfaceC7396q dd.C6560k c6560k, long j2, long j3) {
        return new n5r1(C6467n.lvui(j2), C6467n.lvui(j3));
    }

    public static /* synthetic */ dd toq(dd.C6560k c6560k, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = C6467n.f36743q.lrht();
        }
        if ((i2 & 2) != 0) {
            j3 = C6467n.f36743q.cdj();
        }
        return m24271k(c6560k, j2, j3);
    }
}

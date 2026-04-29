package kotlinx.coroutines.flow;

import com.market.sdk.reflect.C4991s;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/flow/dd;", "", "Lkotlinx/coroutines/flow/hyr;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/lvui;", "k", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public interface dd {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C6560k f36946k = C6560k.f36947k;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.dd$k */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/flow/dd$k;", "", "", "stopTimeoutMillis", "replayExpirationMillis", "Lkotlinx/coroutines/flow/dd;", "k", "toq", "Lkotlinx/coroutines/flow/dd;", "zy", "()Lkotlinx/coroutines/flow/dd;", "Eagerly", "q", "Lazily", C4991s.f28129n, "()V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6560k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ C6560k f36947k = new C6560k();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private static final dd f81989toq = new ncyb();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private static final dd f81990zy = new C6604l();

        private C6560k() {
        }

        public static /* synthetic */ dd toq(C6560k c6560k, long j2, long j3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j2 = 0;
            }
            if ((i2 & 2) != 0) {
                j3 = Long.MAX_VALUE;
            }
            return c6560k.m24081k(j2, j3);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final dd m24081k(long j2, long j3) {
            return new n5r1(j2, j3);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final dd m24082q() {
            return f81990zy;
        }

        @InterfaceC7396q
        public final dd zy() {
            return f81989toq;
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    InterfaceC6622s<lvui> mo24080k(@InterfaceC7396q hyr<Integer> hyrVar);
}

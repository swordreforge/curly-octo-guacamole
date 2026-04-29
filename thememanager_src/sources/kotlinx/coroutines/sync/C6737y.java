package kotlinx.coroutines.sync;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5981k;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.d3;
import kotlinx.coroutines.internal.C6669c;
import kotlinx.coroutines.internal.C6679l;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.y */
/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000\u001a8\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002\"\u001a\u0010\u0012\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0011\"\u001a\u0010\u001a\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u0012\u0004\b\u0019\u0010\u0011\"\u001a\u0010\u001d\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u0012\u0004\b\u001c\u0010\u0011\"\u001a\u0010 \u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u0012\u0004\b\u001f\u0010\u0011\"\u001a\u0010#\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\f\n\u0004\b!\u0010\u000f\u0012\u0004\b\"\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"", "permits", "acquiredPermits", "Lkotlinx/coroutines/sync/g;", "k", C0846k.zaso, "Lkotlin/Function0;", "action", "cdj", "(Lkotlinx/coroutines/sync/g;Lcyoe/k;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "id", "Lkotlinx/coroutines/sync/s;", "prev", "p", com.market.sdk.reflect.toq.f28131g, "getMAX_SPIN_CYCLES$annotations", "()V", "MAX_SPIN_CYCLES", "Lkotlinx/coroutines/internal/l;", "toq", "Lkotlinx/coroutines/internal/l;", "getPERMIT$annotations", "PERMIT", "zy", "getTAKEN$annotations", "TAKEN", "q", "getBROKEN$annotations", "BROKEN", "n", "getCANCELLED$annotations", "CANCELLED", C7704k.y.toq.f95579toq, "getSEGMENT_SIZE$annotations", "SEGMENT_SIZE", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6737y {

    /* JADX INFO: renamed from: k */
    private static final int f37442k = C6669c.m24317q("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final C6679l f82079toq = new C6679l("PERMIT");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final C6679l f82080zy = new C6679l("TAKEN");

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final C6679l f37444q = new C6679l("BROKEN");

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final C6679l f37443n = new C6679l("CANCELLED");

    /* JADX INFO: renamed from: g */
    private static final int f37441g = C6669c.m24317q("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.y$k */
    /* JADX INFO: compiled from: Semaphore.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.sync.SemaphoreKt", m22756f = "Semaphore.kt", m22757i = {0, 0}, m22758l = {85}, m22759m = "withPermit", m22760n = {"$this$withPermit", "action"}, m22761s = {"L$0", "L$1"})
    @d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
    static final class k<T> extends AbstractC6209q {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        k(InterfaceC6216q<? super k> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6737y.cdj(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object cdj(@mub.InterfaceC7396q kotlinx.coroutines.sync.InterfaceC6732g r4, @mub.InterfaceC7396q cyoe.InterfaceC5981k<? extends T> r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.sync.C6737y.k
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.sync.y$k r0 = (kotlinx.coroutines.sync.C6737y.k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.y$k r0 = new kotlinx.coroutines.sync.y$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            cyoe.k r5 = (cyoe.InterfaceC5981k) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.sync.g r4 = (kotlinx.coroutines.sync.InterfaceC6732g) r4
            kotlin.C6318m.n7h(r6)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.C6318m.n7h(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r4.zy(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L58
            kotlin.jvm.internal.d3.m23090q(r3)
            r4.release()
            kotlin.jvm.internal.d3.zy(r3)
            return r5
        L58:
            r5 = move-exception
            kotlin.jvm.internal.d3.m23090q(r3)
            r4.release()
            kotlin.jvm.internal.d3.zy(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C6737y.cdj(kotlinx.coroutines.sync.g, cyoe.k, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX INFO: renamed from: h */
    private static /* synthetic */ void m24610h() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final InterfaceC6732g m24611k(int i2, int i3) {
        return new f7l8(i2, i3);
    }

    private static final <T> Object ki(InterfaceC6732g interfaceC6732g, InterfaceC5981k<? extends T> interfaceC5981k, InterfaceC6216q<? super T> interfaceC6216q) {
        kotlin.jvm.internal.d3.m23089n(0);
        interfaceC6732g.zy(interfaceC6216q);
        kotlin.jvm.internal.d3.m23089n(1);
        try {
            return interfaceC5981k.invoke();
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            interfaceC6732g.release();
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    private static /* synthetic */ void kja0() {
    }

    private static /* synthetic */ void ld6() {
    }

    private static /* synthetic */ void n7h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C6736s m24613p(long j2, C6736s c6736s) {
        return new C6736s(j2, c6736s, 0);
    }

    private static /* synthetic */ void qrj() {
    }

    public static /* synthetic */ InterfaceC6732g toq(int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return m24611k(i2, i3);
    }

    private static /* synthetic */ void x2() {
    }
}

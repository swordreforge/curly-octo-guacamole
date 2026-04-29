package kotlinx.coroutines.sync;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5981k;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.d3;
import kotlinx.coroutines.internal.C6679l;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.n */
/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u000f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u0012\u0004\b\r\u0010\u000e\"\u001a\u0010\u0012\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u0012\u0004\b\u0011\u0010\u000e\"\u001a\u0010\u0015\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u0012\u0004\b\u0014\u0010\u000e\"\u001a\u0010\u0018\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0016\u0010\f\u0012\u0004\b\u0017\u0010\u000e\"\u001a\u0010\u001d\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u000e\"\u001a\u0010 \u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b\u001f\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"", "locked", "Lkotlinx/coroutines/sync/zy;", "k", C0846k.zaso, "", "owner", "Lkotlin/Function0;", "action", "kja0", "(Lkotlinx/coroutines/sync/zy;Ljava/lang/Object;Lcyoe/k;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/l;", "Lkotlinx/coroutines/internal/l;", "getLOCK_FAIL$annotations", "()V", "LOCK_FAIL", "toq", "getUNLOCK_FAIL$annotations", "UNLOCK_FAIL", "zy", "getLOCKED$annotations", "LOCKED", "q", "getUNLOCKED$annotations", "UNLOCKED", "Lkotlinx/coroutines/sync/toq;", "n", "Lkotlinx/coroutines/sync/toq;", "getEMPTY_LOCKED$annotations", "EMPTY_LOCKED", C7704k.y.toq.f95579toq, "getEMPTY_UNLOCKED$annotations", "EMPTY_UNLOCKED", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6734n {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private static final toq f37424g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final toq f37426n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final C6679l f37427q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final C6679l f82074zy;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final C6679l f37425k = new C6679l("LOCK_FAIL");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final C6679l f82073toq = new C6679l("UNLOCK_FAIL");

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.n$k */
    /* JADX INFO: compiled from: Mutex.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.sync.MutexKt", m22756f = "Mutex.kt", m22757i = {0, 0, 0}, m22758l = {112}, m22759m = "withLock", m22760n = {"$this$withLock", "owner", "action"}, m22761s = {"L$0", "L$1", "L$2"})
    @d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
    static final class k<T> extends AbstractC6209q {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return C6734n.kja0(null, null, null, this);
        }
    }

    static {
        C6679l c6679l = new C6679l("LOCKED");
        f82074zy = c6679l;
        C6679l c6679l2 = new C6679l("UNLOCKED");
        f37427q = c6679l2;
        f37426n = new toq(c6679l);
        f37424g = new toq(c6679l2);
    }

    public static /* synthetic */ Object cdj(zy zyVar, Object obj, InterfaceC5981k interfaceC5981k, InterfaceC6216q interfaceC6216q, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        kotlin.jvm.internal.d3.m23089n(0);
        zyVar.zy(obj, interfaceC6216q);
        kotlin.jvm.internal.d3.m23089n(1);
        try {
            return interfaceC5981k.invoke();
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            zyVar.mo24604q(obj);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    /* JADX INFO: renamed from: h */
    private static final <T> Object m24593h(zy zyVar, Object obj, InterfaceC5981k<? extends T> interfaceC5981k, InterfaceC6216q<? super T> interfaceC6216q) {
        kotlin.jvm.internal.d3.m23089n(0);
        zyVar.zy(obj, interfaceC6216q);
        kotlin.jvm.internal.d3.m23089n(1);
        try {
            return interfaceC5981k.invoke();
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            zyVar.mo24604q(obj);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final zy m24594k(boolean z2) {
        return new C6735q(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object kja0(@mub.InterfaceC7396q kotlinx.coroutines.sync.zy r4, @mub.InterfaceC7395n java.lang.Object r5, @mub.InterfaceC7396q cyoe.InterfaceC5981k<? extends T> r6, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.C6734n.k
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.sync.n$k r0 = (kotlinx.coroutines.sync.C6734n.k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.n$k r0 = new kotlinx.coroutines.sync.n$k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.L$2
            r6 = r4
            cyoe.k r6 = (cyoe.InterfaceC5981k) r6
            java.lang.Object r5 = r0.L$1
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.sync.zy r4 = (kotlinx.coroutines.sync.zy) r4
            kotlin.C6318m.n7h(r7)
            goto L4e
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.C6318m.n7h(r7)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r7 = r4.zy(r5, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L5c
            kotlin.jvm.internal.d3.m23090q(r3)
            r4.mo24604q(r5)
            kotlin.jvm.internal.d3.zy(r3)
            return r6
        L5c:
            r6 = move-exception
            kotlin.jvm.internal.d3.m23090q(r3)
            r4.mo24604q(r5)
            kotlin.jvm.internal.d3.zy(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C6734n.kja0(kotlinx.coroutines.sync.zy, java.lang.Object, cyoe.k, kotlin.coroutines.q):java.lang.Object");
    }

    private static /* synthetic */ void ld6() {
    }

    private static /* synthetic */ void n7h() {
    }

    /* JADX INFO: renamed from: p */
    private static /* synthetic */ void m24596p() {
    }

    private static /* synthetic */ void qrj() {
    }

    /* JADX INFO: renamed from: s */
    private static /* synthetic */ void m24598s() {
    }

    public static /* synthetic */ zy toq(boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return m24594k(z2);
    }

    private static /* synthetic */ void x2() {
    }
}

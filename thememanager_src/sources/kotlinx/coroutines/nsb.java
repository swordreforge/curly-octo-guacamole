package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000<\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000b2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\r\u0010\n\u001aL\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001aR\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000b2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\n\u001aa\u0010\u0013\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0016H\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {C0846k.zaso, "", "timeMillis", "Lkotlin/Function2;", "Lkotlinx/coroutines/f;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "block", "zy", "(JLcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/time/n;", "timeout", "q", "n", C7704k.y.toq.f95579toq, "U", "Lkotlinx/coroutines/ij;", "coroutine", "toq", "(Lkotlinx/coroutines/ij;Lcyoe/h;)Ljava/lang/Object;", "time", "Lkotlinx/coroutines/gbni;", "Lkotlinx/coroutines/pc;", "k", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class nsb {

    /* JADX INFO: renamed from: kotlinx.coroutines.nsb$k */
    /* JADX INFO: compiled from: Timeout.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.TimeoutKt", m22756f = "Timeout.kt", m22757i = {0, 0, 0}, m22758l = {100}, m22759m = "withTimeoutOrNull", m22760n = {"block", "coroutine", "timeMillis"}, m22761s = {"L$0", "L$1", "J$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C6705k<T> extends AbstractC6209q {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C6705k(InterfaceC6216q<? super C6705k> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return nsb.m24511n(0L, null, this);
        }
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public static final <T> Object m24509g(long j2, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        return m24511n(ek5k.m24044n(j2), interfaceC5979h, interfaceC6216q);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final pc m24510k(long j2, @InterfaceC7396q gbni gbniVar) {
        return new pc("Timed out waiting for " + j2 + " ms", gbniVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.ij] */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object m24511n(long r7, @mub.InterfaceC7396q cyoe.InterfaceC5979h<? super kotlinx.coroutines.InterfaceC6556f, ? super kotlin.coroutines.InterfaceC6216q<? super T>, ? extends java.lang.Object> r9, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super T> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.nsb.C6705k
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.nsb$k r0 = (kotlinx.coroutines.nsb.C6705k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.nsb$k r0 = new kotlinx.coroutines.nsb$k
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.i1$y r7 = (kotlin.jvm.internal.i1.C6299y) r7
            java.lang.Object r8 = r0.L$0
            cyoe.h r8 = (cyoe.InterfaceC5979h) r8
            kotlin.C6318m.n7h(r10)     // Catch: kotlinx.coroutines.pc -> L32
            goto L6b
        L32:
            r8 = move-exception
            goto L6e
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.C6318m.n7h(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.i1$y r10 = new kotlin.jvm.internal.i1$y
            r10.<init>()
            r0.L$0 = r9     // Catch: kotlinx.coroutines.pc -> L6c
            r0.L$1 = r10     // Catch: kotlinx.coroutines.pc -> L6c
            r0.J$0 = r7     // Catch: kotlinx.coroutines.pc -> L6c
            r0.label = r4     // Catch: kotlinx.coroutines.pc -> L6c
            kotlinx.coroutines.ij r2 = new kotlinx.coroutines.ij     // Catch: kotlinx.coroutines.pc -> L6c
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.pc -> L6c
            r10.element = r2     // Catch: kotlinx.coroutines.pc -> L6c
            java.lang.Object r7 = toq(r2, r9)     // Catch: kotlinx.coroutines.pc -> L6c
            java.lang.Object r8 = kotlin.coroutines.intrinsics.toq.x2()     // Catch: kotlinx.coroutines.pc -> L6c
            if (r7 != r8) goto L67
            kotlin.coroutines.jvm.internal.C6211y.zy(r0)     // Catch: kotlinx.coroutines.pc -> L6c
        L67:
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r10 = r7
        L6b:
            return r10
        L6c:
            r8 = move-exception
            r7 = r10
        L6e:
            kotlinx.coroutines.gbni r9 = r8.coroutine
            T r7 = r7.element
            if (r9 != r7) goto L75
            return r3
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.nsb.m24511n(long, cyoe.h, kotlin.coroutines.q):java.lang.Object");
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public static final <T> Object m24512q(long j2, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        return zy(ek5k.m24044n(j2), interfaceC5979h, interfaceC6216q);
    }

    private static final <U, T extends U> Object toq(ij<U, ? super T> ijVar, InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h) {
        ltg8.m24488z(ijVar, ek5k.m24045q(ijVar.f37237n.getContext()).i1(ijVar.f37204g, ijVar, ijVar.getContext()));
        return tww7.toq.f7l8(ijVar, ijVar, interfaceC5979h);
    }

    @InterfaceC7395n
    public static final <T> Object zy(long j2, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        if (j2 <= 0) {
            throw new pc("Timed out immediately");
        }
        Object qVar = toq(new ij(j2, interfaceC6216q), interfaceC5979h);
        if (qVar == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return qVar;
    }
}

package kotlinx.coroutines;

import com.android.thememanager.router.recommend.entity.UICard;
import kotlin.coroutines.InterfaceC6214n;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.f7l8;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.time.C6467n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"", "k", "(Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "timeMillis", "Lkotlin/was;", "toq", "(JLkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/time/n;", "duration", "zy", "n", "(J)J", "Lkotlin/coroutines/f7l8;", "Lkotlinx/coroutines/m;", "q", "(Lkotlin/coroutines/f7l8;)Lkotlinx/coroutines/m;", "delay", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class ek5k {

    /* JADX INFO: renamed from: kotlinx.coroutines.ek5k$k */
    /* JADX INFO: compiled from: Delay.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.DelayKt", m22756f = "Delay.kt", m22757i = {}, m22758l = {UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD}, m22759m = "awaitCancellation", m22760n = {}, m22761s = {})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C6552k extends AbstractC6209q {
        int label;
        /* synthetic */ Object result;

        C6552k(InterfaceC6216q<? super C6552k> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ek5k.m24043k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m24043k(@mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<?> r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.ek5k.C6552k
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.ek5k$k r0 = (kotlinx.coroutines.ek5k.C6552k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.ek5k$k r0 = new kotlinx.coroutines.ek5k$k
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            kotlin.C6318m.n7h(r4)
            goto L52
        L31:
            kotlin.C6318m.n7h(r4)
            r0.label = r3
            kotlinx.coroutines.ki r4 = new kotlinx.coroutines.ki
            kotlin.coroutines.q r2 = kotlin.coroutines.intrinsics.toq.m22744n(r0)
            r4.<init>(r2, r3)
            r4.a9()
            java.lang.Object r4 = r4.m24474z()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.toq.x2()
            if (r4 != r2) goto L4f
            kotlin.coroutines.jvm.internal.C6211y.zy(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            kotlin.z r4 = new kotlin.z
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.ek5k.m24043k(kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX INFO: renamed from: n */
    public static final long m24044n(long j2) {
        if (C6467n.ld6(j2, C6467n.f36743q.lrht()) > 0) {
            return kotlin.ranges.fn3e.zurt(C6467n.lvui(j2), 1L);
        }
        return 0L;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final InterfaceC6699m m24045q(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        f7l8.toq toqVar = f7l8Var.get(InterfaceC6214n.ep);
        InterfaceC6699m interfaceC6699m = toqVar instanceof InterfaceC6699m ? (InterfaceC6699m) toqVar : null;
        return interfaceC6699m == null ? hb.m24301k() : interfaceC6699m;
    }

    @InterfaceC7395n
    public static final Object toq(long j2, @InterfaceC7396q InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
        if (j2 <= 0) {
            return kotlin.was.f36763k;
        }
        ki kiVar = new ki(kotlin.coroutines.intrinsics.zy.m22747n(interfaceC6216q), 1);
        kiVar.a9();
        if (j2 < Long.MAX_VALUE) {
            m24045q(kiVar.getContext()).zy(j2, kiVar);
        }
        Object objM24474z = kiVar.m24474z();
        if (objM24474z == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM24474z == C6199q.x2() ? objM24474z : kotlin.was.f36763k;
    }

    @InterfaceC7395n
    public static final Object zy(long j2, @InterfaceC7396q InterfaceC6216q<? super kotlin.was> interfaceC6216q) {
        Object qVar = toq(m24044n(j2), interfaceC6216q);
        return qVar == C6199q.x2() ? qVar : kotlin.was.f36763k;
    }
}

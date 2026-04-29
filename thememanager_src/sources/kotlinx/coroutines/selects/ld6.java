package kotlinx.coroutines.selects;

import cyoe.x2;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.d3;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6533d;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: WhileSelect.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u00020\u00032\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0002\b\u0004H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lkotlinx/coroutines/selects/k;", "", "Lkotlin/was;", "Lkotlin/fn3e;", "builder", "k", "(Lcyoe/x2;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class ld6 {

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.ld6$k */
    /* JADX INFO: compiled from: WhileSelect.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.selects.WhileSelectKt", m22756f = "WhileSelect.kt", m22757i = {0}, m22758l = {37}, m22759m = "whileSelect", m22760n = {"builder"}, m22761s = {"L$0"})
    @d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
    static final class C6722k extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C6722k(InterfaceC6216q<? super C6722k> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ld6.m24570k(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @mub.InterfaceC7395n
    @kotlinx.coroutines.InterfaceC6533d
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m24570k(@mub.InterfaceC7396q cyoe.x2<? super kotlinx.coroutines.selects.InterfaceC6721k<? super java.lang.Boolean>, kotlin.was> r4, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.ld6.C6722k
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.selects.ld6$k r0 = (kotlinx.coroutines.selects.ld6.C6722k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.ld6$k r0 = new kotlinx.coroutines.selects.ld6$k
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            cyoe.x2 r4 = (cyoe.x2) r4
            kotlin.C6318m.n7h(r5)
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C6318m.n7h(r5)
        L38:
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.selects.toq r5 = new kotlinx.coroutines.selects.toq
            r5.<init>(r0)
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r2 = move-exception
            r5.nmn5(r2)
        L49:
            java.lang.Object r5 = r5.ch()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.toq.x2()
            if (r5 != r2) goto L56
            kotlin.coroutines.jvm.internal.C6211y.zy(r0)
        L56:
            if (r5 != r1) goto L59
            return r1
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L62
            goto L38
        L62:
            kotlin.was r4 = kotlin.was.f36763k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.ld6.m24570k(cyoe.x2, kotlin.coroutines.q):java.lang.Object");
    }

    @InterfaceC6533d
    private static final Object toq(x2<? super InterfaceC6721k<? super Boolean>, was> x2Var, InterfaceC6216q<? super was> interfaceC6216q) {
        Object objCh;
        do {
            kotlin.jvm.internal.d3.m23089n(0);
            toq toqVar = new toq(interfaceC6216q);
            try {
                x2Var.invoke(toqVar);
            } catch (Throwable th) {
                toqVar.nmn5(th);
            }
            objCh = toqVar.ch();
            if (objCh == C6199q.x2()) {
                C6211y.zy(interfaceC6216q);
            }
            kotlin.jvm.internal.d3.m23089n(1);
        } while (((Boolean) objCh).booleanValue());
        return was.f36763k;
    }
}

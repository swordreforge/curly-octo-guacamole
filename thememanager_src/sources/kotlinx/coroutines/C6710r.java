package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6214n;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.f7l8;
import kotlin.coroutines.jvm.internal.InterfaceC6207n;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.i1;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.r */
/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a6\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a:\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a(\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0013\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u00020\u001aH\u0080\u0010\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d\"\u001a\u0010!\u001a\u0004\u0018\u00010\u001c*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkotlinx/coroutines/f;", "Lkotlin/coroutines/f7l8;", "context", "n", "addedContext", "q", "", "zy", "originalContext", "appendContext", "isNewCoroutine", "k", C0846k.zaso, "", "countOrElement", "Lkotlin/Function0;", "block", C7704k.y.toq.f44691k, "(Lkotlin/coroutines/f7l8;Ljava/lang/Object;Lcyoe/k;)Ljava/lang/Object;", "Lkotlin/coroutines/q;", "continuation", AnimatedProperty.PROPERTY_NAME_Y, "(Lkotlin/coroutines/q;Ljava/lang/Object;Lcyoe/k;)Ljava/lang/Object;", "oldValue", "Lkotlinx/coroutines/n2t;", "f7l8", "Lkotlin/coroutines/jvm/internal/n;", C7704k.y.toq.f95579toq, "", "Ljava/lang/String;", "DEBUG_THREAD_NAME_SEPARATOR", "toq", "(Lkotlin/coroutines/f7l8;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6710r {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final String f37322k = " @";

    /* JADX INFO: renamed from: kotlinx.coroutines.r$k */
    /* JADX INFO: compiled from: CoroutineContext.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/f7l8;", "result", "Lkotlin/coroutines/f7l8$toq;", "element", "invoke", "(Lkotlin/coroutines/f7l8;Lkotlin/coroutines/f7l8$toq;)Lkotlin/coroutines/f7l8;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class k extends AbstractC6308r implements InterfaceC5979h<kotlin.coroutines.f7l8, f7l8.toq, kotlin.coroutines.f7l8> {
        public static final k INSTANCE = new k();

        k() {
            super(2);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7396q
        public final kotlin.coroutines.f7l8 invoke(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q f7l8.toq toqVar) {
            return toqVar instanceof d2ok ? f7l8Var.plus(((d2ok) toqVar).a98o()) : f7l8Var.plus(toqVar);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.r$toq */
    /* JADX INFO: compiled from: CoroutineContext.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/f7l8;", "result", "Lkotlin/coroutines/f7l8$toq;", "element", "invoke", "(Lkotlin/coroutines/f7l8;Lkotlin/coroutines/f7l8$toq;)Lkotlin/coroutines/f7l8;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends AbstractC6308r implements InterfaceC5979h<kotlin.coroutines.f7l8, f7l8.toq, kotlin.coroutines.f7l8> {
        final /* synthetic */ boolean $isNewCoroutine;
        final /* synthetic */ i1.C6299y<kotlin.coroutines.f7l8> $leftoverContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(i1.C6299y<kotlin.coroutines.f7l8> c6299y, boolean z2) {
            super(2);
            this.$leftoverContext = c6299y;
            this.$isNewCoroutine = z2;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.f7l8] */
        @Override // cyoe.InterfaceC5979h
        @InterfaceC7396q
        public final kotlin.coroutines.f7l8 invoke(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q f7l8.toq toqVar) {
            if (!(toqVar instanceof d2ok)) {
                return f7l8Var.plus(toqVar);
            }
            f7l8.toq toqVar2 = this.$leftoverContext.element.get(toqVar.getKey());
            if (toqVar2 != null) {
                i1.C6299y<kotlin.coroutines.f7l8> c6299y = this.$leftoverContext;
                c6299y.element = c6299y.element.minusKey(toqVar.getKey());
                return f7l8Var.plus(((d2ok) toqVar).fu4(toqVar2));
            }
            d2ok d2okVarA98o = (d2ok) toqVar;
            if (this.$isNewCoroutine) {
                d2okVarA98o = d2okVarA98o.a98o();
            }
            return f7l8Var.plus(d2okVarA98o);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.r$zy */
    /* JADX INFO: compiled from: CoroutineContext.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "result", "Lkotlin/coroutines/f7l8$toq;", "it", "invoke", "(ZLkotlin/coroutines/f7l8$toq;)Ljava/lang/Boolean;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class zy extends AbstractC6308r implements InterfaceC5979h<Boolean, f7l8.toq, Boolean> {
        public static final zy INSTANCE = new zy();

        zy() {
            super(2);
        }

        @InterfaceC7396q
        public final Boolean invoke(boolean z2, @InterfaceC7396q f7l8.toq toqVar) {
            return Boolean.valueOf(z2 || (toqVar instanceof d2ok));
        }

        @Override // cyoe.InterfaceC5979h
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, f7l8.toq toqVar) {
            return invoke(bool.booleanValue(), toqVar);
        }
    }

    @InterfaceC7395n
    public static final n2t<?> f7l8(@InterfaceC7396q InterfaceC6216q<?> interfaceC6216q, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7395n Object obj) {
        if (!(interfaceC6216q instanceof InterfaceC6207n)) {
            return null;
        }
        if (!(f7l8Var.get(pjz9.f37317k) != null)) {
            return null;
        }
        n2t<?> n2tVarM24524g = m24524g((InterfaceC6207n) interfaceC6216q);
        if (n2tVarM24524g != null) {
            n2tVarM24524g.zwy(f7l8Var, obj);
        }
        return n2tVarM24524g;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public static final n2t<?> m24524g(@InterfaceC7396q InterfaceC6207n interfaceC6207n) {
        while (!(interfaceC6207n instanceof C6486b) && (interfaceC6207n = interfaceC6207n.getCallerFrame()) != null) {
            if (interfaceC6207n instanceof n2t) {
                return (n2t) interfaceC6207n;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: k */
    private static final kotlin.coroutines.f7l8 m24525k(kotlin.coroutines.f7l8 f7l8Var, kotlin.coroutines.f7l8 f7l8Var2, boolean z2) {
        boolean zZy = zy(f7l8Var);
        boolean zZy2 = zy(f7l8Var2);
        if (!zZy && !zZy2) {
            return f7l8Var.plus(f7l8Var2);
        }
        i1.C6299y c6299y = new i1.C6299y();
        c6299y.element = f7l8Var2;
        C6217s c6217s = C6217s.INSTANCE;
        kotlin.coroutines.f7l8 f7l8Var3 = (kotlin.coroutines.f7l8) f7l8Var.fold(c6217s, new toq(c6299y, z2));
        if (zZy2) {
            c6299y.element = ((kotlin.coroutines.f7l8) c6299y.element).fold(c6217s, k.INSTANCE);
        }
        return f7l8Var3.plus((kotlin.coroutines.f7l8) c6299y.element);
    }

    @InterfaceC7396q
    @InterfaceC6533d
    /* JADX INFO: renamed from: n */
    public static final kotlin.coroutines.f7l8 m24526n(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        kotlin.coroutines.f7l8 f7l8VarM24525k = m24525k(interfaceC6556f.i1(), f7l8Var, true);
        return (f7l8VarM24525k == C6481a.m23812k() || f7l8VarM24525k.get(InterfaceC6214n.ep) != null) ? f7l8VarM24525k : f7l8VarM24525k.plus(C6481a.m23812k());
    }

    @InterfaceC7396q
    @tfm
    /* JADX INFO: renamed from: q */
    public static final kotlin.coroutines.f7l8 m24527q(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var2) {
        return !zy(f7l8Var2) ? f7l8Var.plus(f7l8Var2) : m24525k(f7l8Var, f7l8Var2, false);
    }

    /* JADX INFO: renamed from: s */
    public static final <T> T m24528s(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC5981k<? extends T> interfaceC5981k) {
        Object objZy = kotlinx.coroutines.internal.lrht.zy(f7l8Var, obj);
        try {
            return interfaceC5981k.invoke();
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            kotlinx.coroutines.internal.lrht.m24365k(f7l8Var, objZy);
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    @InterfaceC7395n
    public static final String toq(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[DONT_GENERATE] */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T m24529y(@mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<?> r2, @mub.InterfaceC7395n java.lang.Object r3, @mub.InterfaceC7396q cyoe.InterfaceC5981k<? extends T> r4) {
        /*
            kotlin.coroutines.f7l8 r0 = r2.getContext()
            java.lang.Object r3 = kotlinx.coroutines.internal.lrht.zy(r0, r3)
            kotlinx.coroutines.internal.l r1 = kotlinx.coroutines.internal.lrht.f37225k
            if (r3 == r1) goto L11
            kotlinx.coroutines.n2t r2 = f7l8(r2, r0, r3)
            goto L12
        L11:
            r2 = 0
        L12:
            r1 = 1
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.d3.m23090q(r1)
            if (r2 == 0) goto L22
            boolean r2 = r2.pc()
            if (r2 == 0) goto L25
        L22:
            kotlinx.coroutines.internal.lrht.m24365k(r0, r3)
        L25:
            kotlin.jvm.internal.d3.zy(r1)
            return r4
        L29:
            r4 = move-exception
            kotlin.jvm.internal.d3.m23090q(r1)
            if (r2 == 0) goto L35
            boolean r2 = r2.pc()
            if (r2 == 0) goto L38
        L35:
            kotlinx.coroutines.internal.lrht.m24365k(r0, r3)
        L38:
            kotlin.jvm.internal.d3.zy(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6710r.m24529y(kotlin.coroutines.q, java.lang.Object, cyoe.k):java.lang.Object");
    }

    private static final boolean zy(kotlin.coroutines.f7l8 f7l8Var) {
        return ((Boolean) f7l8Var.fold(Boolean.FALSE, zy.INSTANCE)).booleanValue();
    }
}

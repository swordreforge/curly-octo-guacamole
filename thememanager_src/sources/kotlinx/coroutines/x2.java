package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6214n;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlinx.coroutines.debug.internal.C6541g;
import kotlinx.coroutines.internal.C6690r;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import tww7.C7677k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001aQ\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aW\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aH\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e*\u00020\u00142)\b\b\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086Jø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/f;", "Lkotlin/coroutines/f7l8;", "context", "Lkotlinx/coroutines/lrht;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "Lkotlin/was;", "", "Lkotlin/fn3e;", "block", "Lkotlinx/coroutines/gbni;", "n", "(Lkotlinx/coroutines/f;Lkotlin/coroutines/f7l8;Lkotlinx/coroutines/lrht;Lcyoe/h;)Lkotlinx/coroutines/gbni;", C0846k.zaso, "Lkotlinx/coroutines/j;", "k", "(Lkotlinx/coroutines/f;Lkotlin/coroutines/f7l8;Lkotlinx/coroutines/lrht;Lcyoe/h;)Lkotlinx/coroutines/j;", "f7l8", "(Lkotlin/coroutines/f7l8;Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/dd;", "zy", "(Lkotlinx/coroutines/dd;Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", com.market.sdk.reflect.toq.f28131g, "UNDECIDED", "toq", C6541g.f81973zy, "RESUMED", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class x2 {

    /* JADX INFO: renamed from: k */
    private static final int f37484k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f82088toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f82089zy = 2;

    @InterfaceC7395n
    public static final <T> Object f7l8(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) throws Throwable {
        Object objPc;
        kotlin.coroutines.f7l8 context = interfaceC6216q.getContext();
        kotlin.coroutines.f7l8 f7l8VarM24527q = C6710r.m24527q(context, f7l8Var);
        ltg8.o1t(f7l8VarM24527q);
        if (f7l8VarM24527q == context) {
            C6690r c6690r = new C6690r(f7l8VarM24527q, interfaceC6216q);
            objPc = tww7.toq.m28038g(c6690r, c6690r, interfaceC5979h);
        } else {
            InterfaceC6214n.toq toqVar = InterfaceC6214n.ep;
            if (kotlin.jvm.internal.d2ok.f7l8(f7l8VarM24527q.get(toqVar), context.get(toqVar))) {
                n2t n2tVar = new n2t(f7l8VarM24527q, interfaceC6216q);
                Object objZy = kotlinx.coroutines.internal.lrht.zy(f7l8VarM24527q, null);
                try {
                    Object objM28038g = tww7.toq.m28038g(n2tVar, n2tVar, interfaceC5979h);
                    kotlinx.coroutines.internal.lrht.m24365k(f7l8VarM24527q, objZy);
                    objPc = objM28038g;
                } catch (Throwable th) {
                    kotlinx.coroutines.internal.lrht.m24365k(f7l8VarM24527q, objZy);
                    throw th;
                }
            } else {
                C6486b c6486b = new C6486b(f7l8VarM24527q, interfaceC6216q);
                C7677k.m28034g(interfaceC5979h, c6486b, c6486b, null, 4, null);
                objPc = c6486b.pc();
            }
        }
        if (objPc == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objPc;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ gbni m24649g(InterfaceC6556f interfaceC6556f, kotlin.coroutines.f7l8 f7l8Var, lrht lrhtVar, InterfaceC5979h interfaceC5979h, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f7l8Var = C6217s.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            lrhtVar = lrht.DEFAULT;
        }
        return C6708p.m24522q(interfaceC6556f, f7l8Var, lrhtVar, interfaceC5979h);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> InterfaceC6695j<T> m24650k(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q lrht lrhtVar, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h) {
        kotlin.coroutines.f7l8 f7l8VarM24526n = C6710r.m24526n(interfaceC6556f, f7l8Var);
        C6706o cfrVar = lrhtVar.isLazy() ? new cfr(f7l8VarM24526n, interfaceC5979h) : new C6706o(f7l8VarM24526n, true);
        ((AbstractC6696k) cfrVar).ukdy(lrhtVar, cfrVar, interfaceC5979h);
        return (InterfaceC6695j<T>) cfrVar;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final gbni m24651n(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q lrht lrhtVar, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super kotlin.was>, ? extends Object> interfaceC5979h) {
        kotlin.coroutines.f7l8 f7l8VarM24526n = C6710r.m24526n(interfaceC6556f, f7l8Var);
        AbstractC6696k w831Var = lrhtVar.isLazy() ? new w831(f7l8VarM24526n, interfaceC5979h) : new vep5(f7l8VarM24526n, true);
        w831Var.ukdy(lrhtVar, w831Var, interfaceC5979h);
        return w831Var;
    }

    /* JADX INFO: renamed from: q */
    private static final <T> Object m24652q(dd ddVar, InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super T> interfaceC6216q) throws Throwable {
        kotlin.jvm.internal.d3.m23089n(0);
        Object objM24523y = C6708p.m24523y(ddVar, interfaceC5979h, interfaceC6216q);
        kotlin.jvm.internal.d3.m23089n(1);
        return objM24523y;
    }

    public static /* synthetic */ InterfaceC6695j toq(InterfaceC6556f interfaceC6556f, kotlin.coroutines.f7l8 f7l8Var, lrht lrhtVar, InterfaceC5979h interfaceC5979h, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f7l8Var = C6217s.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            lrhtVar = lrht.DEFAULT;
        }
        return C6708p.m24520k(interfaceC6556f, f7l8Var, lrhtVar, interfaceC5979h);
    }

    @InterfaceC7395n
    public static final <T> Object zy(@InterfaceC7396q dd ddVar, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        return C6708p.m24523y(ddVar, interfaceC5979h, interfaceC6216q);
    }
}

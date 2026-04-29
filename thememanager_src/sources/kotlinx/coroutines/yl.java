package kotlinx.coroutines;

import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Supervisor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001aO\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0002\b\u000bH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/gbni;", "parent", "Lkotlinx/coroutines/mcp;", "k", "toq", "(Lkotlinx/coroutines/gbni;)Lkotlinx/coroutines/gbni;", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/f;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "block", "n", "(Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class yl {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final mcp m24655k(@InterfaceC7395n gbni gbniVar) {
        return new jbh(gbniVar);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public static final <R> Object m24656n(@InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        mbx mbxVar = new mbx(interfaceC6216q.getContext(), interfaceC6216q);
        Object objM28038g = tww7.toq.m28038g(mbxVar, mbxVar, interfaceC5979h);
        if (objM28038g == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM28038g;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ gbni m24657q(gbni gbniVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gbniVar = null;
        }
        return m24655k(gbniVar);
    }

    public static /* synthetic */ mcp zy(gbni gbniVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gbniVar = null;
        }
        return m24655k(gbniVar);
    }
}

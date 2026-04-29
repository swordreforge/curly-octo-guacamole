package kotlinx.coroutines;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6214n;
import kotlin.coroutines.InterfaceC6216q;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {C0846k.zaso, "Lkotlin/coroutines/f7l8;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/f;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "block", "k", "(Lkotlin/coroutines/f7l8;Lcyoe/h;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class ld6 {
    /* JADX INFO: renamed from: k */
    public static final <T> T m24476k(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h) throws InterruptedException {
        AbstractC6741u abstractC6741uM24455k;
        kotlin.coroutines.f7l8 f7l8VarM24526n;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC6214n interfaceC6214n = (InterfaceC6214n) f7l8Var.get(InterfaceC6214n.ep);
        if (interfaceC6214n == null) {
            abstractC6741uM24455k = ixz.f37275k.toq();
            f7l8VarM24526n = C6710r.m24526n(vq.f37472k, f7l8Var.plus(abstractC6741uM24455k));
        } else {
            AbstractC6741u abstractC6741u = null;
            AbstractC6741u abstractC6741u2 = interfaceC6214n instanceof AbstractC6741u ? (AbstractC6741u) interfaceC6214n : null;
            if (abstractC6741u2 != null && abstractC6741u2.r25n()) {
                abstractC6741u = abstractC6741u2;
            }
            abstractC6741uM24455k = abstractC6741u == null ? ixz.f37275k.m24455k() : abstractC6741u;
            f7l8VarM24526n = C6710r.m24526n(vq.f37472k, f7l8Var);
        }
        C6748y c6748y = new C6748y(f7l8VarM24526n, threadCurrentThread, abstractC6741uM24455k);
        c6748y.ukdy(lrht.DEFAULT, c6748y, interfaceC5979h);
        return (T) c6748y.ebn();
    }

    public static /* synthetic */ Object toq(kotlin.coroutines.f7l8 f7l8Var, InterfaceC5979h interfaceC5979h, int i2, Object obj) throws InterruptedException {
        if ((i2 & 1) != 0) {
            f7l8Var = C6217s.INSTANCE;
        }
        return C6708p.m24519g(f7l8Var, interfaceC5979h);
    }
}

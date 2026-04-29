package kotlinx.coroutines.channels;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.was;
import kotlinx.coroutines.AbstractC6696k;
import kotlinx.coroutines.C6710r;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.etdu;
import kotlinx.coroutines.gc3c;
import kotlinx.coroutines.lrht;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.n */
/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009e\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062-\b\u0002\u0010\u000f\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\u0004\u0018\u0001`\u000e2-\u0010\u0015\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {C0846k.d9i, "Lkotlinx/coroutines/f;", "Lkotlin/coroutines/f7l8;", "context", "", "capacity", "Lkotlinx/coroutines/lrht;", "start", "Lkotlin/Function1;", "", "Lkotlin/c;", "name", "cause", "Lkotlin/was;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/g;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "block", "Lkotlinx/coroutines/channels/lvui;", "k", "(Lkotlinx/coroutines/f;Lkotlin/coroutines/f7l8;ILkotlinx/coroutines/lrht;Lcyoe/x2;Lcyoe/h;)Lkotlinx/coroutines/channels/lvui;", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6503n {
    @InterfaceC7396q
    @gc3c
    /* JADX INFO: renamed from: k */
    public static final <E> lvui<E> m23923k(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q lrht lrhtVar, @InterfaceC7395n cyoe.x2<? super Throwable, was> x2Var, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6496g<E>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        kotlin.coroutines.f7l8 f7l8VarM24526n = C6710r.m24526n(interfaceC6556f, f7l8Var);
        n7h n7hVarM23858q = cdj.m23858q(i2, null, null, 6, null);
        C6509q c6512t = lrhtVar.isLazy() ? new C6512t(f7l8VarM24526n, n7hVarM23858q, interfaceC5979h) : new C6509q(f7l8VarM24526n, n7hVarM23858q, true);
        if (x2Var != null) {
            ((etdu) c6512t).yz(x2Var);
        }
        ((AbstractC6696k) c6512t).ukdy(lrhtVar, c6512t, interfaceC5979h);
        return (lvui<E>) c6512t;
    }

    public static /* synthetic */ lvui toq(InterfaceC6556f interfaceC6556f, kotlin.coroutines.f7l8 f7l8Var, int i2, lrht lrhtVar, cyoe.x2 x2Var, InterfaceC5979h interfaceC5979h, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f7l8Var = C6217s.INSTANCE;
        }
        kotlin.coroutines.f7l8 f7l8Var2 = f7l8Var;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            lrhtVar = lrht.DEFAULT;
        }
        lrht lrhtVar2 = lrhtVar;
        if ((i3 & 8) != 0) {
            x2Var = null;
        }
        return m23923k(interfaceC6556f, f7l8Var2, i4, lrhtVar2, x2Var, interfaceC5979h);
    }
}

package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.d3;
import kotlin.jvm.internal.bo;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.flow.InterfaceC6622s;
import kotlinx.coroutines.internal.lrht;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.g */
/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a]\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/internal/n;", "toq", "Lkotlinx/coroutines/flow/p;", "Lkotlin/coroutines/f7l8;", "emitContext", "n", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "block", "zy", "(Lkotlin/coroutines/f7l8;Ljava/lang/Object;Ljava/lang/Object;Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6578g {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static final <T> InterfaceC6618p<T> m24128n(InterfaceC6618p<? super T> interfaceC6618p, kotlin.coroutines.f7l8 f7l8Var) {
        return interfaceC6618p instanceof C6595z ? true : interfaceC6618p instanceof C6580i ? interfaceC6618p : new C6593t(interfaceC6618p, f7l8Var);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m24129q(kotlin.coroutines.f7l8 f7l8Var, Object obj, Object obj2, InterfaceC5979h interfaceC5979h, InterfaceC6216q interfaceC6216q, int i2, Object obj3) {
        if ((i2 & 4) != 0) {
            obj2 = lrht.toq(f7l8Var);
        }
        return zy(f7l8Var, obj, obj2, interfaceC5979h, interfaceC6216q);
    }

    @InterfaceC7396q
    public static final <T> AbstractC6584n<T> toq(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s) {
        AbstractC6584n<T> abstractC6584n = interfaceC6622s instanceof AbstractC6584n ? (AbstractC6584n) interfaceC6622s : null;
        return abstractC6584n == null ? new C6592s(interfaceC6622s, null, 0, null, 14, null) : abstractC6584n;
    }

    @InterfaceC7395n
    public static final <T, V> Object zy(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, V v2, @InterfaceC7396q Object obj, @InterfaceC7396q InterfaceC5979h<? super V, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        Object objZy = lrht.zy(f7l8Var, obj);
        try {
            Object objInvoke = ((InterfaceC5979h) bo.cdj(interfaceC5979h, 2)).invoke(v2, new o1t(interfaceC6216q, f7l8Var));
            lrht.m24365k(f7l8Var, objZy);
            if (objInvoke == C6199q.x2()) {
                C6211y.zy(interfaceC6216q);
            }
            return objInvoke;
        } catch (Throwable th) {
            lrht.m24365k(f7l8Var, objZy);
            throw th;
        }
    }
}

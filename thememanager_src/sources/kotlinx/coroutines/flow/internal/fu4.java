package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.f7l8;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.nn86;
import kotlin.was;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.flow.InterfaceC6622s;
import kotlinx.coroutines.gbni;
import kotlinx.coroutines.internal.C6690r;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0080\u0010\u001aP\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\b2/\b\u0005\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/flow/internal/zurt;", "Lkotlin/coroutines/f7l8;", "currentContext", "Lkotlin/was;", "k", "Lkotlinx/coroutines/gbni;", "collectJob", "toq", C0846k.zaso, "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/p;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "block", "Lkotlinx/coroutines/flow/s;", "zy", "(Lcyoe/h;)Lkotlinx/coroutines/flow/s;", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class fu4 {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.fu4$k */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "count", "Lkotlin/coroutines/f7l8$toq;", "element", "invoke", "(ILkotlin/coroutines/f7l8$toq;)Ljava/lang/Integer;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6576k extends AbstractC6308r implements InterfaceC5979h<Integer, f7l8.toq, Integer> {
        final /* synthetic */ zurt<?> $this_checkContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6576k(zurt<?> zurtVar) {
            super(2);
            this.$this_checkContext = zurtVar;
        }

        @Override // cyoe.InterfaceC5979h
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, f7l8.toq toqVar) {
            return invoke(num.intValue(), toqVar);
        }

        @InterfaceC7396q
        public final Integer invoke(int i2, @InterfaceC7396q f7l8.toq toqVar) {
            f7l8.zy<?> key = toqVar.getKey();
            f7l8.toq toqVar2 = this.$this_checkContext.collectContext.get(key);
            if (key != gbni.ygy) {
                return Integer.valueOf(toqVar != toqVar2 ? Integer.MIN_VALUE : i2 + 1);
            }
            gbni gbniVar = (gbni) toqVar2;
            gbni qVar = fu4.toq((gbni) toqVar, gbniVar);
            if (qVar == gbniVar) {
                if (gbniVar != null) {
                    i2++;
                }
                return Integer.valueOf(i2);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + qVar + ", expected child of " + gbniVar + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5979h<InterfaceC6618p<? super T>, InterfaceC6216q<? super was>, Object> f36988k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.fu4$toq$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class C6577k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;

            public C6577k(InterfaceC6216q<? super C6577k> interfaceC6216q) {
                super(interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return toq.this.mo5262k(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public toq(InterfaceC5979h<? super InterfaceC6618p<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
            this.f36988k = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            Object objInvoke = this.f36988k.invoke(interfaceC6618p, interfaceC6216q);
            return objInvoke == C6199q.x2() ? objInvoke : was.f36763k;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public Object m24126y(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new C6577k(interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            this.f36988k.invoke(interfaceC6618p, interfaceC6216q);
            return was.f36763k;
        }
    }

    @InterfaceC6769y(name = "checkContext")
    /* JADX INFO: renamed from: k */
    public static final void m24125k(@InterfaceC7396q zurt<?> zurtVar, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var) {
        if (((Number) f7l8Var.fold(0, new C6576k(zurtVar))).intValue() == zurtVar.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + zurtVar.collectContext + ",\n\t\tbut emission happened in " + f7l8Var + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    @InterfaceC7395n
    public static final gbni toq(@InterfaceC7395n gbni gbniVar, @InterfaceC7395n gbni gbniVar2) {
        while (gbniVar != null) {
            if (gbniVar == gbniVar2) {
                return gbniVar;
            }
            if (!(gbniVar instanceof C6690r)) {
                return gbniVar;
            }
            gbniVar = ((C6690r) gbniVar).ebn();
        }
        return null;
    }

    @nn86
    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> zy(@InterfaceC7396q @kotlin.toq InterfaceC5979h<? super InterfaceC6618p<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        return new toq(interfaceC5979h);
    }
}

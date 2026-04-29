package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6214n;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.channels.jp0y;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.flow.InterfaceC6622s;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.y */
/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/flow/internal/y;", "S", C0846k.zaso, "Lkotlinx/coroutines/flow/internal/n;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/coroutines/f7l8;", "newContext", "Lkotlin/was;", "t8r", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/f7l8;Lkotlin/coroutines/q;)Ljava/lang/Object;", "i", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/jp0y;", "scope", "p", "(Lkotlinx/coroutines/channels/jp0y;Lkotlin/coroutines/q;)Ljava/lang/Object;", "k", "", "toString", "Lkotlinx/coroutines/flow/s;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/flow/s;", "flow", "context", "", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", C4991s.f28129n, "(Lkotlinx/coroutines/flow/s;Lkotlin/coroutines/f7l8;ILkotlinx/coroutines/channels/qrj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public abstract class AbstractC6594y<S, T> extends AbstractC6584n<T> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    @InterfaceC6765n
    protected final InterfaceC6622s<S> f37025g;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.y$k */
    /* JADX INFO: compiled from: ChannelFlow.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m22756f = "ChannelFlow.kt", m22757i = {}, m22758l = {152}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"S", C0846k.zaso, "Lkotlinx/coroutines/flow/p;", "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super T>, InterfaceC6216q<? super was>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC6594y<S, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(AbstractC6594y<S, T> abstractC6594y, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.this$0 = abstractC6594y;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            k kVar = new k(this.this$0, interfaceC6216q);
            kVar.L$0 = obj;
            return kVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((k) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6618p<? super T> interfaceC6618p = (InterfaceC6618p) this.L$0;
                AbstractC6594y<S, T> abstractC6594y = this.this$0;
                this.label = 1;
                if (abstractC6594y.mo24134i(interfaceC6618p, this) == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            return was.f36763k;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6594y(@InterfaceC7396q InterfaceC6622s<? extends S> interfaceC6622s, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        super(f7l8Var, i2, qrjVar);
        this.f37025g = interfaceC6622s;
    }

    static /* synthetic */ Object cdj(AbstractC6594y abstractC6594y, InterfaceC6618p interfaceC6618p, InterfaceC6216q interfaceC6216q) {
        if (abstractC6594y.f36994q == -3) {
            kotlin.coroutines.f7l8 context = interfaceC6216q.getContext();
            kotlin.coroutines.f7l8 f7l8VarPlus = context.plus(abstractC6594y.f36992k);
            if (d2ok.f7l8(f7l8VarPlus, context)) {
                Object objMo24134i = abstractC6594y.mo24134i(interfaceC6618p, interfaceC6216q);
                return objMo24134i == C6199q.x2() ? objMo24134i : was.f36763k;
            }
            InterfaceC6214n.toq toqVar = InterfaceC6214n.ep;
            if (d2ok.f7l8(f7l8VarPlus.get(toqVar), context.get(toqVar))) {
                Object objT8r = abstractC6594y.t8r(interfaceC6618p, f7l8VarPlus, interfaceC6216q);
                return objT8r == C6199q.x2() ? objT8r : was.f36763k;
            }
        }
        Object objMo5262k = super.mo5262k(interfaceC6618p, interfaceC6216q);
        return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
    }

    static /* synthetic */ Object ki(AbstractC6594y abstractC6594y, jp0y jp0yVar, InterfaceC6216q interfaceC6216q) {
        Object objMo24134i = abstractC6594y.mo24134i(new C6595z(jp0yVar), interfaceC6216q);
        return objMo24134i == C6199q.x2() ? objMo24134i : was.f36763k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t8r(InterfaceC6618p<? super T> interfaceC6618p, kotlin.coroutines.f7l8 f7l8Var, InterfaceC6216q<? super was> interfaceC6216q) {
        Object objM24129q = C6578g.m24129q(f7l8Var, C6578g.m24128n(interfaceC6618p, interfaceC6216q.getContext()), null, new k(this, null), interfaceC6216q, 4, null);
        return objM24129q == C6199q.x2() ? objM24129q : was.f36763k;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: i */
    protected abstract Object mo24134i(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q);

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n, kotlinx.coroutines.flow.InterfaceC6622s
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        return cdj(this, interfaceC6618p, interfaceC6216q);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    protected Object mo24106p(@InterfaceC7396q jp0y<? super T> jp0yVar, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        return ki(this, jp0yVar, interfaceC6216q);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    public String toString() {
        return this.f37025g + " -> " + super.toString();
    }
}

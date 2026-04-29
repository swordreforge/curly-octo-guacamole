package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import java.util.ArrayList;
import kotlin.C6318m;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.C6490c;
import kotlinx.coroutines.C6551e;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.channels.a9;
import kotlinx.coroutines.channels.jp0y;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.flow.InterfaceC6622s;
import kotlinx.coroutines.lrht;
import kotlinx.coroutines.tfm;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.n */
/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH$J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¤@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J!\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR9\u0010%\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0!\u0012\u0006\u0012\u0004\u0018\u00010\"0 8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lkotlinx/coroutines/flow/internal/n;", C0846k.zaso, "Lkotlinx/coroutines/flow/internal/ki;", "Lkotlinx/coroutines/flow/s;", "x2", "Lkotlin/coroutines/f7l8;", "context", "", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "q", "ld6", "Lkotlinx/coroutines/channels/jp0y;", "scope", "Lkotlin/was;", "p", "(Lkotlinx/coroutines/channels/jp0y;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/f;", "Lkotlinx/coroutines/channels/d3;", "kja0", "Lkotlinx/coroutines/flow/p;", "collector", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", AnimatedProperty.PROPERTY_NAME_Y, "toString", "Lkotlin/coroutines/f7l8;", com.market.sdk.reflect.toq.f28131g, "n", "Lkotlinx/coroutines/channels/qrj;", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "qrj", "()Lcyoe/h;", "collectToFun", "n7h", "()I", "produceCapacity", C4991s.f28129n, "(Lkotlin/coroutines/f7l8;ILkotlinx/coroutines/channels/qrj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@tfm
public abstract class AbstractC6584n<T> implements ki<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public final kotlin.coroutines.f7l8 f36992k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    @InterfaceC6765n
    public final kotlinx.coroutines.channels.qrj f36993n;

    /* JADX INFO: renamed from: q */
    @InterfaceC6765n
    public final int f36994q;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.n$k */
    /* JADX INFO: compiled from: ChannelFlow.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m22756f = "ChannelFlow.kt", m22757i = {}, m22758l = {123}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @d3(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6618p<T> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC6584n<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(InterfaceC6618p<? super T> interfaceC6618p, AbstractC6584n<T> abstractC6584n, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$collector = interfaceC6618p;
            this.this$0 = abstractC6584n;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            k kVar = new k(this.$collector, this.this$0, interfaceC6216q);
            kVar.L$0 = obj;
            return kVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6556f interfaceC6556f = (InterfaceC6556f) this.L$0;
                InterfaceC6618p<T> interfaceC6618p = this.$collector;
                kotlinx.coroutines.channels.d3<T> d3VarKja0 = this.this$0.kja0(interfaceC6556f);
                this.label = 1;
                if (kotlinx.coroutines.flow.ld6.a98o(interfaceC6618p, d3VarKja0, this) == objX2) {
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

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.n$toq */
    /* JADX INFO: compiled from: ChannelFlow.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m22756f = "ChannelFlow.kt", m22757i = {}, m22758l = {60}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/channels/jp0y;", "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<jp0y<? super T>, InterfaceC6216q<? super was>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC6584n<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(AbstractC6584n<T> abstractC6584n, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.this$0 = abstractC6584n;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            toq toqVar = new toq(this.this$0, interfaceC6216q);
            toqVar.L$0 = obj;
            return toqVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q jp0y<? super T> jp0yVar, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((toq) create(jp0yVar, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                jp0y<? super T> jp0yVar = (jp0y) this.L$0;
                AbstractC6584n<T> abstractC6584n = this.this$0;
                this.label = 1;
                if (abstractC6584n.mo24106p(jp0yVar, this) == objX2) {
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

    public AbstractC6584n(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        this.f36992k = f7l8Var;
        this.f36994q = i2;
        this.f36993n = qrjVar;
    }

    /* JADX INFO: renamed from: s */
    static /* synthetic */ Object m24132s(AbstractC6584n abstractC6584n, InterfaceC6618p interfaceC6618p, InterfaceC6216q interfaceC6216q) {
        Object objF7l8 = C6490c.f7l8(new k(interfaceC6618p, abstractC6584n, null), interfaceC6216q);
        return objF7l8 == C6199q.x2() ? objF7l8 : was.f36763k;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6622s
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        return m24132s(this, interfaceC6618p, interfaceC6216q);
    }

    @InterfaceC7396q
    public kotlinx.coroutines.channels.d3<T> kja0(@InterfaceC7396q InterfaceC6556f interfaceC6556f) {
        return a9.m23854y(interfaceC6556f, this.f36992k, n7h(), this.f36993n, lrht.ATOMIC, null, qrj(), 16, null);
    }

    @InterfaceC7396q
    protected abstract AbstractC6584n<T> ld6(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar);

    public final int n7h() {
        int i2 = this.f36994q;
        if (i2 == -3) {
            return -2;
        }
        return i2;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    protected abstract Object mo24106p(@InterfaceC7396q jp0y<? super T> jp0yVar, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q);

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013 A[PHI: r4
      0x0013: PHI (r4v5 int) = (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:8:0x0011, B:13:0x0019, B:16:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlinx.coroutines.flow.internal.ki
    @mub.InterfaceC7396q
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlinx.coroutines.flow.InterfaceC6622s<T> mo24089q(@mub.InterfaceC7396q kotlin.coroutines.f7l8 r2, int r3, @mub.InterfaceC7396q kotlinx.coroutines.channels.qrj r4) {
        /*
            r1 = this;
            kotlin.coroutines.f7l8 r0 = r1.f36992k
            kotlin.coroutines.f7l8 r2 = r2.plus(r0)
            kotlinx.coroutines.channels.qrj r0 = kotlinx.coroutines.channels.qrj.SUSPEND
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f36994q
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r4 = r4 + r3
            if (r4 < 0) goto L20
            goto L13
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            kotlinx.coroutines.channels.qrj r4 = r1.f36993n
        L25:
            kotlin.coroutines.f7l8 r0 = r1.f36992k
            boolean r0 = kotlin.jvm.internal.d2ok.f7l8(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f36994q
            if (r3 != r0) goto L36
            kotlinx.coroutines.channels.qrj r0 = r1.f36993n
            if (r4 != r0) goto L36
            return r1
        L36:
            kotlinx.coroutines.flow.internal.n r2 = r1.ld6(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.AbstractC6584n.mo24089q(kotlin.coroutines.f7l8, int, kotlinx.coroutines.channels.qrj):kotlinx.coroutines.flow.s");
    }

    @InterfaceC7396q
    public final InterfaceC5979h<jp0y<? super T>, InterfaceC6216q<? super was>, Object> qrj() {
        return new toq(this, null);
    }

    @InterfaceC7396q
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo24122y = mo24122y();
        if (strMo24122y != null) {
            arrayList.add(strMo24122y);
        }
        kotlin.coroutines.f7l8 f7l8Var = this.f36992k;
        if (f7l8Var != C6217s.INSTANCE) {
            arrayList.add(d2ok.mcp("context=", f7l8Var));
        }
        int i2 = this.f36994q;
        if (i2 != -3) {
            arrayList.add(d2ok.mcp("capacity=", Integer.valueOf(i2)));
        }
        kotlinx.coroutines.channels.qrj qrjVar = this.f36993n;
        if (qrjVar != kotlinx.coroutines.channels.qrj.SUSPEND) {
            arrayList.add(d2ok.mcp("onBufferOverflow=", qrjVar));
        }
        return C6551e.m24040k(this) + '[' + kotlin.collections.a9.uo(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    @InterfaceC7395n
    public InterfaceC6622s<T> x2() {
        return null;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    protected String mo24122y() {
        return null;
    }
}

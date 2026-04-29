package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import java.util.Iterator;
import kotlin.C6318m;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.d3;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.channels.a9;
import kotlinx.coroutines.channels.jp0y;
import kotlinx.coroutines.flow.InterfaceC6622s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/flow/internal/ld6;", C0846k.zaso, "Lkotlinx/coroutines/flow/internal/n;", "Lkotlin/coroutines/f7l8;", "context", "", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "ld6", "Lkotlinx/coroutines/f;", "scope", "Lkotlinx/coroutines/channels/d3;", "kja0", "Lkotlinx/coroutines/channels/jp0y;", "Lkotlin/was;", "p", "(Lkotlinx/coroutines/channels/jp0y;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/flow/s;", C7704k.y.toq.f95579toq, "Ljava/lang/Iterable;", "flows", C4991s.f28129n, "(Ljava/lang/Iterable;Lkotlin/coroutines/f7l8;ILkotlinx/coroutines/channels/qrj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class ld6<T> extends AbstractC6584n<T> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final Iterable<InterfaceC6622s<T>> f36991g;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ld6$k */
    /* JADX INFO: compiled from: Merge.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", m22756f = "Merge.kt", m22757i = {}, m22758l = {96}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @d3(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6583k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ C6595z<T> $collector;
        final /* synthetic */ InterfaceC6622s<T> $flow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6583k(InterfaceC6622s<? extends T> interfaceC6622s, C6595z<T> c6595z, InterfaceC6216q<? super C6583k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$flow = interfaceC6622s;
            this.$collector = c6595z;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C6583k(this.$flow, this.$collector, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C6583k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6622s<T> interfaceC6622s = this.$flow;
                C6595z<T> c6595z = this.$collector;
                this.label = 1;
                if (interfaceC6622s.mo5262k(c6595z, this) == objX2) {
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

    public /* synthetic */ ld6(Iterable iterable, kotlin.coroutines.f7l8 f7l8Var, int i2, kotlinx.coroutines.channels.qrj qrjVar, int i3, kotlin.jvm.internal.ni7 ni7Var) {
        this(iterable, (i3 & 2) != 0 ? C6217s.INSTANCE : f7l8Var, (i3 & 4) != 0 ? -2 : i2, (i3 & 8) != 0 ? kotlinx.coroutines.channels.qrj.SUSPEND : qrjVar);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    public kotlinx.coroutines.channels.d3<T> kja0(@InterfaceC7396q InterfaceC6556f interfaceC6556f) {
        return a9.zy(interfaceC6556f, this.f36992k, this.f36994q, qrj());
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    protected AbstractC6584n<T> ld6(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        return new ld6(this.f36991g, f7l8Var, i2, qrjVar);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    protected Object mo24106p(@InterfaceC7396q jp0y<? super T> jp0yVar, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        C6595z c6595z = new C6595z(jp0yVar);
        Iterator<InterfaceC6622s<T>> it = this.f36991g.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.x2.m24649g(jp0yVar, null, null, new C6583k(it.next(), c6595z, null), 3, null);
        }
        return was.f36763k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ld6(@InterfaceC7396q Iterable<? extends InterfaceC6622s<? extends T>> iterable, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        super(f7l8Var, i2, qrjVar);
        this.f36991g = iterable;
    }
}

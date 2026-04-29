package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.flow.internal.C6580i;
import kotlinx.coroutines.gbni;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001am\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002H\b\u0004\u0010\u0011\u001aB\b\u0001\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tH\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aV\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000021\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0019\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\u001b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000023\b\u0004\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/s;", "Lkotlin/was;", "toq", "(Lkotlinx/coroutines/flow/s;Lkotlin/coroutines/q;)Ljava/lang/Object;", C0846k.zaso, "Lkotlinx/coroutines/f;", "scope", "Lkotlinx/coroutines/gbni;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlin/Function3;", "", "Lkotlin/c;", "name", "index", "value", "Lkotlin/coroutines/q;", "", "action", "q", "(Lkotlinx/coroutines/flow/s;Lcyoe/cdj;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/Function2;", C7704k.y.toq.f95579toq, "(Lkotlinx/coroutines/flow/s;Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/p;", "flow", "f7l8", "(Lkotlinx/coroutines/flow/p;Lkotlinx/coroutines/flow/s;Lkotlin/coroutines/q;)Ljava/lang/Object;", "k", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class n7h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.n7h$k */
    /* JADX INFO: compiled from: Collect.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/n7h$k", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6608k<T> implements InterfaceC6618p<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5979h<T, InterfaceC6216q<? super was>, Object> f37041k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.n7h$k$k */
        /* JADX INFO: compiled from: Collect.kt */
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;

            public k(InterfaceC6216q<? super k> interfaceC6216q) {
                super(interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C6608k.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C6608k(InterfaceC5979h<? super T, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
            this.f37041k = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @InterfaceC7395n
        public Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            Object objInvoke = this.f37041k.invoke(t2, interfaceC6216q);
            return objInvoke == C6199q.x2() ? objInvoke : was.f36763k;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object m24198k(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new k(interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            this.f37041k.invoke(t2, interfaceC6216q);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Collect.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"kotlinx/coroutines/flow/n7h$toq", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "", "k", com.market.sdk.reflect.toq.f28131g, "index", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq<T> implements InterfaceC6618p<T> {

        /* JADX INFO: renamed from: k */
        private int f37042k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.cdj<Integer, T, InterfaceC6216q<? super was>, Object> f37043q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.n7h$toq$k */
        /* JADX INFO: compiled from: Collect.kt */
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class C6609k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;

            public C6609k(InterfaceC6216q<? super C6609k> interfaceC6216q) {
                super(interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return toq.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public toq(cyoe.cdj<? super Integer, ? super T, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar) {
            this.f37043q = cdjVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @InterfaceC7395n
        public Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            cyoe.cdj<Integer, T, InterfaceC6216q<? super was>, Object> cdjVar = this.f37043q;
            int i2 = this.f37042k;
            this.f37042k = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            Object objInvoke = cdjVar.invoke(kotlin.coroutines.jvm.internal.toq.m22765g(i2), t2, interfaceC6216q);
            return objInvoke == C6199q.x2() ? objInvoke : was.f36763k;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object m24199k(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new C6609k(interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            cyoe.cdj<Integer, T, InterfaceC6216q<? super was>, Object> cdjVar = this.f37043q;
            int i2 = this.f37042k;
            this.f37042k = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            cdjVar.invoke(Integer.valueOf(i2), t2, interfaceC6216q);
            return was.f36763k;
        }
    }

    /* JADX INFO: compiled from: Collect.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", m22756f = "Collect.kt", m22757i = {}, m22758l = {50}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class zy extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6622s<T> $this_launchIn;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        zy(InterfaceC6622s<? extends T> interfaceC6622s, InterfaceC6216q<? super zy> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_launchIn = interfaceC6622s;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new zy(this.$this_launchIn, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((zy) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6622s<T> interfaceC6622s = this.$this_launchIn;
                this.label = 1;
                if (ld6.m24180z(interfaceC6622s, this) == objX2) {
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

    @InterfaceC7395n
    public static final <T> Object f7l8(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        ld6.m24178x(interfaceC6618p);
        Object objMo5262k = interfaceC6622s.mo5262k(interfaceC6618p, interfaceC6216q);
        return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public static final <T> Object m24193g(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        Object objM24180z = ld6.m24180z(C6573h.m24111q(ld6.sok(interfaceC6622s, interfaceC5979h), 0, null, 2, null), interfaceC6216q);
        return objM24180z == C6199q.x2() ? objM24180z : was.f36763k;
    }

    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Backwards compatibility with JS and K/N")
    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ <T> Object m24194k(InterfaceC6622s<? extends T> interfaceC6622s, InterfaceC5979h<? super T, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super was> interfaceC6216q) {
        Object objMo5262k = interfaceC6622s.mo5262k(new C6608k(interfaceC5979h), interfaceC6216q);
        return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
    }

    /* JADX INFO: renamed from: n */
    private static final <T> Object m24195n(InterfaceC6622s<? extends T> interfaceC6622s, cyoe.cdj<? super Integer, ? super T, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, InterfaceC6216q<? super was> interfaceC6216q) {
        toq toqVar = new toq(cdjVar);
        kotlin.jvm.internal.d3.m23089n(0);
        interfaceC6622s.mo5262k(toqVar, interfaceC6216q);
        kotlin.jvm.internal.d3.m23089n(1);
        return was.f36763k;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public static final <T> Object m24196q(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q cyoe.cdj<? super Integer, ? super T, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        Object objMo5262k = interfaceC6622s.mo5262k(new toq(cdjVar), interfaceC6216q);
        return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
    }

    @InterfaceC7395n
    public static final Object toq(@InterfaceC7396q InterfaceC6622s<?> interfaceC6622s, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        Object objMo5262k = interfaceC6622s.mo5262k(C6580i.f36990k, interfaceC6216q);
        return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final <T> gbni m24197y(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC6556f interfaceC6556f) {
        return kotlinx.coroutines.x2.m24649g(interfaceC6556f, null, null, new zy(interfaceC6622s, null), 3, null);
    }

    @kotlin.ld6(level = kotlin.qrj.HIDDEN, message = "Backwards compatibility with JS and K/N")
    private static final /* synthetic */ <T> Object zy(InterfaceC6622s<? extends T> interfaceC6622s, InterfaceC5979h<? super T, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super was> interfaceC6216q) {
        C6608k c6608k = new C6608k(interfaceC5979h);
        kotlin.jvm.internal.d3.m23089n(0);
        interfaceC6622s.mo5262k(c6608k, interfaceC6216q);
        kotlin.jvm.internal.d3.m23089n(1);
        return was.f36763k;
    }
}

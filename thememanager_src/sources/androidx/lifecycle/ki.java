package androidx.lifecycle;

import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.gbni;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\t\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ9\u0010\u000b\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ9\u0010\f\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0010\u001a\u00020\r8 X \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/ki;", "Lkotlinx/coroutines/f;", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "Lkotlin/was;", "", "Lkotlin/fn3e;", "block", "Lkotlinx/coroutines/gbni;", "toq", "(Lcyoe/h;)Lkotlinx/coroutines/gbni;", "n", "q", "Landroidx/lifecycle/kja0;", "k", "()Landroidx/lifecycle/kja0;", "lifecycle", C4991s.f28129n, "()V", "lifecycle-runtime-ktx_release"}, m22787k = 1, mv = {1, 6, 0})
public abstract class ki implements InterfaceC6556f {

    /* JADX INFO: renamed from: androidx.lifecycle.ki$k */
    /* JADX INFO: compiled from: Lifecycle.kt */
    @InterfaceC6205g(m22755c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", m22756f = "Lifecycle.kt", m22757i = {}, m22758l = {79}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C0934k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0934k(InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super C0934k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$block = interfaceC5979h;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return ki.this.new C0934k(this.$block, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C0934k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                kja0 kja0VarMo4381k = ki.this.mo4381k();
                InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> interfaceC5979h = this.$block;
                this.label = 1;
                if (oc.m4469k(kja0VarMo4381k, interfaceC5979h, this) == objX2) {
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

    /* JADX INFO: compiled from: Lifecycle.kt */
    @InterfaceC6205g(m22755c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", m22756f = "Lifecycle.kt", m22757i = {}, m22758l = {114}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        toq(InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$block = interfaceC5979h;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return ki.this.new toq(this.$block, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((toq) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                kja0 kja0VarMo4381k = ki.this.mo4381k();
                InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> interfaceC5979h = this.$block;
                this.label = 1;
                if (oc.zy(kja0VarMo4381k, interfaceC5979h, this) == objX2) {
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

    /* JADX INFO: compiled from: Lifecycle.kt */
    @InterfaceC6205g(m22755c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", m22756f = "Lifecycle.kt", m22757i = {}, m22758l = {97}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class zy extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        zy(InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super zy> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$block = interfaceC5979h;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return ki.this.new zy(this.$block, interfaceC6216q);
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
                kja0 kja0VarMo4381k = ki.this.mo4381k();
                InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> interfaceC5979h = this.$block;
                this.label = 1;
                if (oc.m4470n(kja0VarMo4381k, interfaceC5979h, this) == objX2) {
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

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public abstract kja0 mo4381k();

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final gbni m4449n(@InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super was>, ? extends Object> block) {
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        return kotlinx.coroutines.x2.m24649g(this, null, null, new zy(block, null), 3, null);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final gbni m4450q(@InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super was>, ? extends Object> block) {
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        return kotlinx.coroutines.x2.m24649g(this, null, null, new toq(block, null), 3, null);
    }

    @InterfaceC7396q
    public final gbni toq(@InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super was>, ? extends Object> block) {
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        return kotlinx.coroutines.x2.m24649g(this, null, null, new C0934k(block, null), 3, null);
    }
}

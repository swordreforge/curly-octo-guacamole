package androidx.lifecycle;

import androidx.exifinterface.media.C0846k;
import androidx.lifecycle.kja0;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.gbni;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: PausingDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\t\u001aF\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\f\u001aF\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u001aF\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\f\u001aN\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {C0846k.zaso, "Landroidx/lifecycle/z;", "Lkotlin/Function2;", "Lkotlinx/coroutines/f;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "block", "toq", "(Landroidx/lifecycle/z;Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Landroidx/lifecycle/kja0;", "k", "(Landroidx/lifecycle/kja0;Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", C7704k.y.toq.f95579toq, "n", "q", "zy", "Landroidx/lifecycle/kja0$zy;", "minState", "f7l8", "(Landroidx/lifecycle/kja0;Landroidx/lifecycle/kja0$zy;Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, m22787k = 2, mv = {1, 6, 0})
public final class oc {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.oc$k */
    /* JADX INFO: compiled from: PausingDispatcher.kt */
    @InterfaceC6205g(m22755c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m22756f = "PausingDispatcher.kt", m22757i = {0}, m22758l = {162}, m22759m = "invokeSuspend", m22760n = {"controller"}, m22761s = {"L$0"})
    @kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/f;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C0943k<T> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super T>, Object> {
        final /* synthetic */ InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super T>, Object> $block;
        final /* synthetic */ kja0.zy $minState;
        final /* synthetic */ kja0 $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0943k(kja0 kja0Var, kja0.zy zyVar, InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super C0943k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_whenStateAtLeast = kja0Var;
            this.$minState = zyVar;
            this.$block = interfaceC5979h;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C0943k c0943k = new C0943k(this.$this_whenStateAtLeast, this.$minState, this.$block, interfaceC6216q);
            c0943k.L$0 = obj;
            return c0943k;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super T> interfaceC6216q) {
            return ((C0943k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            cdj cdjVar;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cdjVar = (cdj) this.L$0;
                try {
                    C6318m.n7h(obj);
                    cdjVar.toq();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    cdjVar.toq();
                    throw th;
                }
            }
            C6318m.n7h(obj);
            gbni gbniVar = (gbni) ((InterfaceC6556f) this.L$0).i1().get(gbni.ygy);
            if (gbniVar == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            d3 d3Var = new d3();
            cdj cdjVar2 = new cdj(this.$this_whenStateAtLeast, this.$minState, d3Var.f5051q, gbniVar);
            try {
                InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super T>, Object> interfaceC5979h = this.$block;
                this.L$0 = cdjVar2;
                this.label = 1;
                obj = C6708p.m24523y(d3Var, interfaceC5979h, this);
                if (obj == objX2) {
                    return objX2;
                }
                cdjVar = cdjVar2;
                cdjVar.toq();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                cdjVar = cdjVar2;
                cdjVar.toq();
                throw th;
            }
        }
    }

    @InterfaceC7395n
    public static final <T> Object f7l8(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q kja0.zy zyVar, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        return C6708p.m24523y(C6481a.m23813n().dxef(), new C0943k(kja0Var, zyVar, interfaceC5979h, null), interfaceC6216q);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public static final <T> Object m4468g(@InterfaceC7396q InterfaceC0954z interfaceC0954z, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        kotlin.jvm.internal.d2ok.kja0(lifecycle, "lifecycle");
        return m4470n(lifecycle, interfaceC5979h, interfaceC6216q);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public static final <T> Object m4469k(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        return f7l8(kja0Var, kja0.zy.CREATED, interfaceC5979h, interfaceC6216q);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public static final <T> Object m4470n(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        return f7l8(kja0Var, kja0.zy.STARTED, interfaceC5979h, interfaceC6216q);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public static final <T> Object m4471q(@InterfaceC7396q InterfaceC0954z interfaceC0954z, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        kotlin.jvm.internal.d2ok.kja0(lifecycle, "lifecycle");
        return zy(lifecycle, interfaceC5979h, interfaceC6216q);
    }

    @InterfaceC7395n
    public static final <T> Object toq(@InterfaceC7396q InterfaceC0954z interfaceC0954z, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        kotlin.jvm.internal.d2ok.kja0(lifecycle, "lifecycle");
        return m4469k(lifecycle, interfaceC5979h, interfaceC6216q);
    }

    @InterfaceC7395n
    public static final <T> Object zy(@InterfaceC7396q kja0 kja0Var, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        return f7l8(kja0Var, kja0.zy.RESUMED, interfaceC5979h, interfaceC6216q);
    }
}

package androidx.lifecycle;

import androidx.exifinterface.media.C0846k;
import androidx.lifecycle.kja0;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.channels.lvui;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.flow.InterfaceC6622s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.lifecycle.p */
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "Landroidx/lifecycle/kja0;", "lifecycle", "Landroidx/lifecycle/kja0$zy;", "minActiveState", "k", "lifecycle-runtime-ktx_release"}, m22787k = 2, mv = {1, 6, 0})
public final class C0944p {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.p$k */
    /* JADX INFO: compiled from: FlowExt.kt */
    @InterfaceC6205g(m22755c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", m22756f = "FlowExt.kt", m22757i = {0}, m22758l = {91}, m22759m = "invokeSuspend", m22760n = {"$this$callbackFlow"}, m22761s = {"L$0"})
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/channels/jp0y;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class k<T> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<kotlinx.coroutines.channels.jp0y<? super T>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ kja0 $lifecycle;
        final /* synthetic */ kja0.zy $minActiveState;
        final /* synthetic */ InterfaceC6622s<T> $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.p$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FlowExt.kt */
        @InterfaceC6205g(m22755c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", m22756f = "FlowExt.kt", m22757i = {}, m22758l = {92}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class C7885k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ kotlinx.coroutines.channels.jp0y<T> $$this$callbackFlow;
            final /* synthetic */ InterfaceC6622s<T> $this_flowWithLifecycle;
            int label;

            /* JADX INFO: renamed from: androidx.lifecycle.p$k$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: FlowExt.kt */
            @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "it", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
            static final class C7886k<T> implements InterfaceC6618p {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ kotlinx.coroutines.channels.jp0y<T> f5114k;

                /* JADX WARN: Multi-variable type inference failed */
                C7886k(kotlinx.coroutines.channels.jp0y<? super T> jp0yVar) {
                    this.f5114k = jp0yVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC6618p
                @InterfaceC7395n
                public final Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
                    Object objD3 = this.f5114k.d3(t2, interfaceC6216q);
                    return objD3 == C6199q.x2() ? objD3 : was.f36763k;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C7885k(InterfaceC6622s<? extends T> interfaceC6622s, kotlinx.coroutines.channels.jp0y<? super T> jp0yVar, InterfaceC6216q<? super C7885k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$this_flowWithLifecycle = interfaceC6622s;
                this.$$this$callbackFlow = jp0yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new C7885k(this.$this_flowWithLifecycle, this.$$this$callbackFlow, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((C7885k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    InterfaceC6622s<T> interfaceC6622s = this.$this_flowWithLifecycle;
                    C7886k c7886k = new C7886k(this.$$this$callbackFlow);
                    this.label = 1;
                    if (interfaceC6622s.mo5262k(c7886k, this) == objX2) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(kja0 kja0Var, kja0.zy zyVar, InterfaceC6622s<? extends T> interfaceC6622s, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$lifecycle = kja0Var;
            this.$minActiveState = zyVar;
            this.$this_flowWithLifecycle = interfaceC6622s;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            k kVar = new k(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, interfaceC6216q);
            kVar.L$0 = obj;
            return kVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kotlinx.coroutines.channels.jp0y<? super T> jp0yVar, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((k) create(jp0yVar, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            kotlinx.coroutines.channels.jp0y jp0yVar;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                kotlinx.coroutines.channels.jp0y jp0yVar2 = (kotlinx.coroutines.channels.jp0y) this.L$0;
                kja0 kja0Var = this.$lifecycle;
                kja0.zy zyVar = this.$minActiveState;
                C7885k c7885k = new C7885k(this.$this_flowWithLifecycle, jp0yVar2, null);
                this.L$0 = jp0yVar2;
                this.label = 1;
                if (RepeatOnLifecycleKt.m4396k(kja0Var, zyVar, c7885k, this) == objX2) {
                    return objX2;
                }
                jp0yVar = jp0yVar2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jp0yVar = (kotlinx.coroutines.channels.jp0y) this.L$0;
                C6318m.n7h(obj);
            }
            lvui.C6502k.m23922k(jp0yVar, null, 1, null);
            return was.f36763k;
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> InterfaceC6622s<T> m4472k(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q kja0 lifecycle, @InterfaceC7396q kja0.zy minActiveState) {
        kotlin.jvm.internal.d2ok.m23075h(interfaceC6622s, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(lifecycle, "lifecycle");
        kotlin.jvm.internal.d2ok.m23075h(minActiveState, "minActiveState");
        return kotlinx.coroutines.flow.ld6.t8r(new k(lifecycle, minActiveState, interfaceC6622s, null));
    }

    public static /* synthetic */ InterfaceC6622s toq(InterfaceC6622s interfaceC6622s, kja0 kja0Var, kja0.zy zyVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            zyVar = kja0.zy.STARTED;
        }
        return m4472k(interfaceC6622s, kja0Var, zyVar);
    }
}

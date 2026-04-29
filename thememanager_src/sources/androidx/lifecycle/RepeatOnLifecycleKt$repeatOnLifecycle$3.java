package androidx.lifecycle;

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
import kotlinx.coroutines.z4;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: RepeatOnLifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6205g(m22755c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m22756f = "RepeatOnLifecycle.kt", m22757i = {}, m22758l = {84}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
@kotlin.d3(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
    final /* synthetic */ InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> $block;
    final /* synthetic */ kja0.zy $state;
    final /* synthetic */ kja0 $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
    @InterfaceC6205g(m22755c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m22756f = "RepeatOnLifecycle.kt", m22757i = {0, 0}, m22758l = {166}, m22759m = "invokeSuspend", m22760n = {"launchedJob", "observer"}, m22761s = {"L$0", "L$1"})
    @kotlin.d3(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C09171 extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6556f $$this$coroutineScope;
        final /* synthetic */ InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> $block;
        final /* synthetic */ kja0.zy $state;
        final /* synthetic */ kja0 $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C09171(kja0 kja0Var, kja0.zy zyVar, InterfaceC6556f interfaceC6556f, InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super C09171> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_repeatOnLifecycle = kja0Var;
            this.$state = zyVar;
            this.$$this$coroutineScope = interfaceC6556f;
            this.$block = interfaceC5979h;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C09171(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C09171) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
        /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1] */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 213
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.C09171.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RepeatOnLifecycleKt$repeatOnLifecycle$3(kja0 kja0Var, kja0.zy zyVar, InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> interfaceC6216q) {
        super(2, interfaceC6216q);
        this.$this_repeatOnLifecycle = kja0Var;
        this.$state = zyVar;
        this.$block = interfaceC5979h;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
    @InterfaceC7396q
    public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, interfaceC6216q);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // cyoe.InterfaceC5979h
    @InterfaceC7395n
    public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
    @InterfaceC7395n
    public final Object invokeSuspend(@InterfaceC7396q Object obj) {
        Object objX2 = C6199q.x2();
        int i2 = this.label;
        if (i2 == 0) {
            C6318m.n7h(obj);
            InterfaceC6556f interfaceC6556f = (InterfaceC6556f) this.L$0;
            z4 z4VarDxef = C6481a.m23813n().dxef();
            C09171 c09171 = new C09171(this.$this_repeatOnLifecycle, this.$state, interfaceC6556f, this.$block, null);
            this.label = 1;
            if (C6708p.m24523y(z4VarDxef, c09171, this) == objX2) {
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

package kotlinx.coroutines.flow.internal;

import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.d3;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.flow.InterfaceC6622s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.h */
/* JADX INFO: compiled from: FlowCoroutine.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002)\b\u0001\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aU\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u000025\b\u0001\u0010\u0006\u001a/\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t¢\u0006\u0002\b\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"R", "Lkotlin/Function2;", "Lkotlinx/coroutines/f;", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", "block", "k", "(Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "Lkotlinx/coroutines/flow/s;", "toq", "(Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class C6579h {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.h$k */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class k<R> implements InterfaceC6622s<R> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.cdj f36989k;

        public k(cyoe.cdj cdjVar) {
            this.f36989k = cdjVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            Object objM24130k = C6579h.m24130k(new toq(this.f36989k, interfaceC6618p, null), interfaceC6216q);
            return objM24130k == C6199q.x2() ? objM24130k : was.f36763k;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.h$toq */
    /* JADX INFO: compiled from: FlowCoroutine.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", m22756f = "FlowCoroutine.kt", m22757i = {}, m22758l = {51}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @d3(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ cyoe.cdj<InterfaceC6556f, InterfaceC6618p<? super R>, InterfaceC6216q<? super was>, Object> $block;
        final /* synthetic */ InterfaceC6618p<R> $this_unsafeFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        toq(cyoe.cdj<? super InterfaceC6556f, ? super InterfaceC6618p<? super R>, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, InterfaceC6618p<? super R> interfaceC6618p, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$block = cdjVar;
            this.$this_unsafeFlow = interfaceC6618p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            toq toqVar = new toq(this.$block, this.$this_unsafeFlow, interfaceC6216q);
            toqVar.L$0 = obj;
            return toqVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((toq) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6556f interfaceC6556f = (InterfaceC6556f) this.L$0;
                cyoe.cdj<InterfaceC6556f, InterfaceC6618p<? super R>, InterfaceC6216q<? super was>, Object> cdjVar = this.$block;
                Object obj2 = this.$this_unsafeFlow;
                this.label = 1;
                if (cdjVar.invoke(interfaceC6556f, obj2, this) == objX2) {
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
    /* JADX INFO: renamed from: k */
    public static final <R> Object m24130k(@InterfaceC7396q @kotlin.toq InterfaceC5979h<? super InterfaceC6556f, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h, @InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        kja0 kja0Var = new kja0(interfaceC6216q.getContext(), interfaceC6216q);
        Object objM28038g = tww7.toq.m28038g(kja0Var, kja0Var, interfaceC5979h);
        if (objM28038g == C6199q.x2()) {
            C6211y.zy(interfaceC6216q);
        }
        return objM28038g;
    }

    @InterfaceC7396q
    public static final <R> InterfaceC6622s<R> toq(@InterfaceC7396q @kotlin.toq cyoe.cdj<? super InterfaceC6556f, ? super InterfaceC6618p<? super R>, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar) {
        return new k(cdjVar);
    }
}

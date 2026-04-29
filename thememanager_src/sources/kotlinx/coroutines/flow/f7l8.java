package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.clock.module.AbstractC5074q;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.i1;
import kotlin.was;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002Bg\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012:\u0010\u0017\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000f¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rRH\u0010\u0017\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/flow/f7l8;", C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/s;", "upstream", "Lkotlin/Function1;", "", "q", "Lcyoe/x2;", "keySelector", "Lkotlin/Function2;", "Lkotlin/c;", "name", AbstractC5074q.f29194r, "new", "", "n", "Lcyoe/h;", "areEquivalent", C4991s.f28129n, "(Lkotlinx/coroutines/flow/s;Lcyoe/x2;Lcyoe/h;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
final class f7l8<T> implements InterfaceC6622s<T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC6622s<T> f36951k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    @InterfaceC6765n
    public final InterfaceC5979h<Object, Object, Boolean> f36952n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @InterfaceC6765n
    public final cyoe.x2<T, Object> f36953q;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.f7l8$k */
    /* JADX INFO: compiled from: Distinct.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6563k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ f7l8<T> f36954k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ InterfaceC6618p<T> f36955n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ i1.C6299y<Object> f36956q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.f7l8$k$k */
        /* JADX INFO: compiled from: Distinct.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m22756f = "Distinct.kt", m22757i = {}, m22758l = {81}, m22759m = "emit", m22760n = {}, m22761s = {})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C6563k<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(C6563k<? super T> c6563k, InterfaceC6216q<? super k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = c6563k;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C6563k(f7l8<T> f7l8Var, i1.C6299y<Object> c6299y, InterfaceC6618p<? super T> interfaceC6618p) {
            this.f36954k = f7l8Var;
            this.f36956q = c6299y;
            this.f36955n = interfaceC6618p;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.f7l8.C6563k.k
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.f7l8$k$k r0 = (kotlinx.coroutines.flow.f7l8.C6563k.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.f7l8$k$k r0 = new kotlinx.coroutines.flow.f7l8$k$k
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C6318m.n7h(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C6318m.n7h(r7)
                kotlinx.coroutines.flow.f7l8<T> r7 = r5.f36954k
                cyoe.x2<T, java.lang.Object> r7 = r7.f36953q
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.i1$y<java.lang.Object> r2 = r5.f36956q
                T r2 = r2.element
                kotlinx.coroutines.internal.l r4 = kotlinx.coroutines.flow.internal.fn3e.f36987k
                if (r2 == r4) goto L58
                kotlinx.coroutines.flow.f7l8<T> r4 = r5.f36954k
                cyoe.h<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f36952n
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            L58:
                kotlin.jvm.internal.i1$y<java.lang.Object> r2 = r5.f36956q
                r2.element = r7
                kotlinx.coroutines.flow.p<T> r7 = r5.f36955n
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.f7l8.C6563k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f7l8(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q cyoe.x2<? super T, ? extends Object> x2Var, @InterfaceC7396q InterfaceC5979h<Object, Object, Boolean> interfaceC5979h) {
        this.f36951k = interfaceC6622s;
        this.f36953q = x2Var;
        this.f36952n = interfaceC5979h;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6622s
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        i1.C6299y c6299y = new i1.C6299y();
        c6299y.element = (T) kotlinx.coroutines.flow.internal.fn3e.f36987k;
        Object objMo5262k = this.f36951k.mo5262k(new C6563k(this, c6299y, interfaceC6618p), interfaceC6216q);
        return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
    }
}

package kotlinx.coroutines.selects;

import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import cyoe.x2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.nn86;
import kotlin.was;
import kotlinx.coroutines.selects.InterfaceC6721k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.p */
/* JADX INFO: compiled from: SelectUnbiased.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0001J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001J5\u0010\r\u001a\u00020\u0005*\u00020\t2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0012\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00010\u00102\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\u0017\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u00012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R3\u0010(\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050$0#j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050$`%8\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b\u001e\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lkotlinx/coroutines/selects/p;", "R", "Lkotlinx/coroutines/selects/k;", "", "e", "Lkotlin/was;", "zy", "", "q", "Lkotlinx/coroutines/selects/zy;", "Lkotlin/Function1;", "Lkotlin/coroutines/q;", "block", AnimatedProperty.PROPERTY_NAME_H, "(Lkotlinx/coroutines/selects/zy;Lcyoe/x2;)V", "Q", "Lkotlinx/coroutines/selects/q;", "Lkotlin/Function2;", "fn3e", "(Lkotlinx/coroutines/selects/q;Lcyoe/h;)V", "P", "Lkotlinx/coroutines/selects/n;", "param", "ld6", "(Lkotlinx/coroutines/selects/n;Ljava/lang/Object;Lcyoe/h;)V", "", "timeMillis", "n", "(JLcyoe/x2;)V", "Lkotlinx/coroutines/selects/toq;", "k", "Lkotlinx/coroutines/selects/toq;", "toq", "()Lkotlinx/coroutines/selects/toq;", "instance", "Ljava/util/ArrayList;", "Lkotlin/Function0;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "clauses", "uCont", C4991s.f28129n, "(Lkotlin/coroutines/q;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
@nn86
public final class C6724p<R> implements InterfaceC6721k<R> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final kotlinx.coroutines.selects.toq<R> f37399k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final ArrayList<InterfaceC5981k<was>> f37400q = new ArrayList<>();

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.p$k */
    /* JADX INFO: compiled from: SelectUnbiased.kt */
    @d3(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/was;", "invoke", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class k extends AbstractC6308r implements InterfaceC5981k<was> {
        final /* synthetic */ x2<InterfaceC6216q<? super R>, Object> $block;
        final /* synthetic */ kotlinx.coroutines.selects.zy $this_invoke;
        final /* synthetic */ C6724p<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(kotlinx.coroutines.selects.zy zyVar, C6724p<? super R> c6724p, x2<? super InterfaceC6216q<? super R>, ? extends Object> x2Var) {
            super(0);
            this.$this_invoke = zyVar;
            this.this$0 = c6724p;
            this.$block = x2Var;
        }

        @Override // cyoe.InterfaceC5981k
        public /* bridge */ /* synthetic */ was invoke() {
            invoke2();
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_invoke.gvn7(this.this$0.toq(), this.$block);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.p$q */
    /* JADX INFO: compiled from: SelectUnbiased.kt */
    @d3(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/was;", "invoke", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class q extends AbstractC6308r implements InterfaceC5981k<was> {
        final /* synthetic */ x2<InterfaceC6216q<? super R>, Object> $block;
        final /* synthetic */ long $timeMillis;
        final /* synthetic */ C6724p<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(C6724p<? super R> c6724p, long j2, x2<? super InterfaceC6216q<? super R>, ? extends Object> x2Var) {
            super(0);
            this.this$0 = c6724p;
            this.$timeMillis = j2;
            this.$block = x2Var;
        }

        @Override // cyoe.InterfaceC5981k
        public /* bridge */ /* synthetic */ was invoke() {
            invoke2();
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.toq().mo24568n(this.$timeMillis, this.$block);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.p$toq */
    /* JADX INFO: compiled from: SelectUnbiased.kt */
    @d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Q", "R", "Lkotlin/was;", "invoke", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends AbstractC6308r implements InterfaceC5981k<was> {
        final /* synthetic */ InterfaceC5979h<Q, InterfaceC6216q<? super R>, Object> $block;
        final /* synthetic */ InterfaceC6725q<Q> $this_invoke;
        final /* synthetic */ C6724p<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        toq(InterfaceC6725q<? extends Q> interfaceC6725q, C6724p<? super R> c6724p, InterfaceC5979h<? super Q, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
            super(0);
            this.$this_invoke = interfaceC6725q;
            this.this$0 = c6724p;
            this.$block = interfaceC5979h;
        }

        @Override // cyoe.InterfaceC5981k
        public /* bridge */ /* synthetic */ was invoke() {
            invoke2();
            return was.f36763k;
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
        /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            /*
                r3 = this;
                kotlinx.coroutines.selects.q<Q> r0 = r3.$this_invoke
                kotlinx.coroutines.selects.p<R> r1 = r3.this$0
                kotlinx.coroutines.selects.toq r1 = r1.toq()
                cyoe.h<Q, kotlin.coroutines.q<? super R>, java.lang.Object> r2 = r3.$block
                r0.eqxt(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.C6724p.toq.invoke2():void");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.p$zy */
    /* JADX INFO: compiled from: SelectUnbiased.kt */
    @d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0006\b\u0002\u0010\u0002 \u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"P", "Q", "R", "Lkotlin/was;", "invoke", "()V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class zy extends AbstractC6308r implements InterfaceC5981k<was> {
        final /* synthetic */ InterfaceC5979h<Q, InterfaceC6216q<? super R>, Object> $block;
        final /* synthetic */ P $param;
        final /* synthetic */ InterfaceC6723n<P, Q> $this_invoke;
        final /* synthetic */ C6724p<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        zy(InterfaceC6723n<? super P, ? extends Q> interfaceC6723n, C6724p<? super R> c6724p, P p2, InterfaceC5979h<? super Q, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
            super(0);
            this.$this_invoke = interfaceC6723n;
            this.this$0 = c6724p;
            this.$param = p2;
            this.$block = interfaceC5979h;
        }

        @Override // cyoe.InterfaceC5981k
        public /* bridge */ /* synthetic */ was invoke() {
            invoke2();
            return was.f36763k;
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
        /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            /*
                r4 = this;
                kotlinx.coroutines.selects.n<P, Q> r0 = r4.$this_invoke
                kotlinx.coroutines.selects.p<R> r1 = r4.this$0
                kotlinx.coroutines.selects.toq r1 = r1.toq()
                P r2 = r4.$param
                cyoe.h<Q, kotlin.coroutines.q<? super R>, java.lang.Object> r3 = r4.$block
                r0.mo23934i(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.C6724p.zy.invoke2():void");
        }
    }

    public C6724p(@InterfaceC7396q InterfaceC6216q<? super R> interfaceC6216q) {
        this.f37399k = new kotlinx.coroutines.selects.toq<>(interfaceC6216q);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6721k
    public <Q> void fn3e(@InterfaceC7396q InterfaceC6725q<? extends Q> interfaceC6725q, @InterfaceC7396q InterfaceC5979h<? super Q, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        this.f37400q.add(new toq(interfaceC6725q, this, interfaceC5979h));
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6721k
    /* JADX INFO: renamed from: h */
    public void mo24567h(@InterfaceC7396q kotlinx.coroutines.selects.zy zyVar, @InterfaceC7396q x2<? super InterfaceC6216q<? super R>, ? extends Object> x2Var) {
        this.f37400q.add(new k(zyVar, this, x2Var));
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final ArrayList<InterfaceC5981k<was>> m24571k() {
        return this.f37400q;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6721k
    public <P, Q> void ld6(@InterfaceC7396q InterfaceC6723n<? super P, ? extends Q> interfaceC6723n, P p2, @InterfaceC7396q InterfaceC5979h<? super Q, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        this.f37400q.add(new zy(interfaceC6723n, this, p2, interfaceC5979h));
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6721k
    /* JADX INFO: renamed from: n */
    public void mo24568n(long j2, @InterfaceC7396q x2<? super InterfaceC6216q<? super R>, ? extends Object> x2Var) {
        this.f37400q.add(new q(this, j2, x2Var));
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6721k
    public <P, Q> void o1t(@InterfaceC7396q InterfaceC6723n<? super P, ? extends Q> interfaceC6723n, @InterfaceC7396q InterfaceC5979h<? super Q, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        InterfaceC6721k.k.m24569k(this, interfaceC6723n, interfaceC5979h);
    }

    @nn86
    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public final Object m24572q() {
        if (!this.f37399k.mo24565g()) {
            try {
                Collections.shuffle(this.f37400q);
                Iterator<T> it = this.f37400q.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5981k) it.next()).invoke();
                }
            } catch (Throwable th) {
                this.f37399k.nmn5(th);
            }
        }
        return this.f37399k.ch();
    }

    @InterfaceC7396q
    public final kotlinx.coroutines.selects.toq<R> toq() {
        return this.f37399k;
    }

    @nn86
    public final void zy(@InterfaceC7396q Throwable th) {
        this.f37399k.nmn5(th);
    }
}

package kotlin.coroutines.intrinsics;

import cyoe.InterfaceC5979h;
import cyoe.cdj;
import cyoe.x2;
import kotlin.C6318m;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6206k;
import kotlin.coroutines.jvm.internal.AbstractC6208p;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.bo;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.nn86;
import kotlin.was;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: IntrinsicsJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n204#1,4:270\n225#1:274\n204#1,4:275\n225#1:279\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n130#1:270,4\n130#1:274\n165#1:275,4\n165#1:279\n*E\n"})
public class zy {

    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    public static final class f7l8 extends AbstractC6208p {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f7l8(InterfaceC6216q<? super T> interfaceC6216q) {
            super(interfaceC6216q);
            d2ok.n7h(interfaceC6216q, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        protected Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6318m.n7h(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.intrinsics.zy$g */
    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    @lv5({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n166#2:270\n*E\n"})
    public static final class C6200g extends AbstractC6209q {
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ InterfaceC5979h $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6200g(InterfaceC6216q interfaceC6216q, kotlin.coroutines.f7l8 f7l8Var, InterfaceC5979h interfaceC5979h, Object obj) {
            super(interfaceC6216q, f7l8Var);
            this.$this_createCoroutineUnintercepted$inlined = interfaceC5979h;
            this.$receiver$inlined = obj;
            d2ok.n7h(interfaceC6216q, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        protected Object invokeSuspend(@InterfaceC7396q Object obj) {
            int i2 = this.label;
            if (i2 == 0) {
                this.label = 1;
                C6318m.n7h(obj);
                d2ok.n7h(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((InterfaceC5979h) bo.cdj(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
            }
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.label = 2;
            C6318m.n7h(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.intrinsics.zy$k */
    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    @lv5({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n*L\n1#1,269:1\n*E\n"})
    public static final class C6201k extends AbstractC6208p {
        final /* synthetic */ x2<InterfaceC6216q<? super T>, Object> $block;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6201k(InterfaceC6216q<? super T> interfaceC6216q, x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var) {
            super(interfaceC6216q);
            this.$block = x2Var;
            d2ok.n7h(interfaceC6216q, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlin.coroutines.intrinsics.zy$k for r2v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        protected java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r3) {
            /*
                r2 = this;
                int r0 = r2.label
                r1 = 1
                if (r0 == 0) goto L1a
                if (r0 != r1) goto Le
                r0 = 2
                r2.label = r0
                kotlin.C6318m.n7h(r3)
                goto L25
            Le:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "This coroutine had already completed"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L1a:
                r2.label = r1
                kotlin.C6318m.n7h(r3)
                cyoe.x2<kotlin.coroutines.q<? super T>, java.lang.Object> r3 = r2.$block
                java.lang.Object r3 = r3.invoke(r2)
            L25:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.intrinsics.zy.C6201k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.intrinsics.zy$n */
    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    @lv5({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n166#2:270\n*E\n"})
    public static final class C6202n extends AbstractC6208p {
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ InterfaceC5979h $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6202n(InterfaceC6216q interfaceC6216q, InterfaceC5979h interfaceC5979h, Object obj) {
            super(interfaceC6216q);
            this.$this_createCoroutineUnintercepted$inlined = interfaceC5979h;
            this.$receiver$inlined = obj;
            d2ok.n7h(interfaceC6216q, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        protected Object invokeSuspend(@InterfaceC7396q Object obj) {
            int i2 = this.label;
            if (i2 == 0) {
                this.label = 1;
                C6318m.n7h(obj);
                d2ok.n7h(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((InterfaceC5979h) bo.cdj(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
            }
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.label = 2;
            C6318m.n7h(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.intrinsics.zy$q */
    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    @lv5({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n131#2:270\n*E\n"})
    public static final class C6203q extends AbstractC6209q {
        final /* synthetic */ x2 $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6203q(InterfaceC6216q interfaceC6216q, kotlin.coroutines.f7l8 f7l8Var, x2 x2Var) {
            super(interfaceC6216q, f7l8Var);
            this.$this_createCoroutineUnintercepted$inlined = x2Var;
            d2ok.n7h(interfaceC6216q, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        protected Object invokeSuspend(@InterfaceC7396q Object obj) {
            int i2 = this.label;
            if (i2 == 0) {
                this.label = 1;
                C6318m.n7h(obj);
                d2ok.n7h(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((x2) bo.cdj(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
            }
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.label = 2;
            C6318m.n7h(obj);
            return obj;
        }
    }

    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    @lv5({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n*L\n1#1,269:1\n*E\n"})
    public static final class toq extends AbstractC6209q {
        final /* synthetic */ x2<InterfaceC6216q<? super T>, Object> $block;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public toq(InterfaceC6216q<? super T> interfaceC6216q, kotlin.coroutines.f7l8 f7l8Var, x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var) {
            super(interfaceC6216q, f7l8Var);
            this.$block = x2Var;
            d2ok.n7h(interfaceC6216q, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlin.coroutines.intrinsics.zy$toq for r2v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        protected java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r3) {
            /*
                r2 = this;
                int r0 = r2.label
                r1 = 1
                if (r0 == 0) goto L1a
                if (r0 != r1) goto Le
                r0 = 2
                r2.label = r0
                kotlin.C6318m.n7h(r3)
                goto L25
            Le:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "This coroutine had already completed"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L1a:
                r2.label = r1
                kotlin.C6318m.n7h(r3)
                cyoe.x2<kotlin.coroutines.q<? super T>, java.lang.Object> r3 = r2.$block
                java.lang.Object r3 = r3.invoke(r2)
            L25:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.intrinsics.zy.toq.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.intrinsics.zy$y */
    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    public static final class C6204y extends AbstractC6209q {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6204y(InterfaceC6216q<? super T> interfaceC6216q, kotlin.coroutines.f7l8 f7l8Var) {
            super(interfaceC6216q, f7l8Var);
            d2ok.n7h(interfaceC6216q, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        protected Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6318m.n7h(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.intrinsics.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    @lv5({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n131#2:270\n*E\n"})
    public static final class C8056zy extends AbstractC6208p {
        final /* synthetic */ x2 $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8056zy(InterfaceC6216q interfaceC6216q, x2 x2Var) {
            super(interfaceC6216q);
            this.$this_createCoroutineUnintercepted$inlined = x2Var;
            d2ok.n7h(interfaceC6216q, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        protected Object invokeSuspend(@InterfaceC7396q Object obj) {
            int i2 = this.label;
            if (i2 == 0) {
                this.label = 1;
                C6318m.n7h(obj);
                d2ok.n7h(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((x2) bo.cdj(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
            }
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.label = 2;
            C6318m.n7h(obj);
            return obj;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    private static final <R, T> Object f7l8(InterfaceC5979h<? super R, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, R r2, InterfaceC6216q<? super T> completion) {
        d2ok.m23075h(interfaceC5979h, "<this>");
        d2ok.m23075h(completion, "completion");
        return !(interfaceC5979h instanceof AbstractC6206k) ? m22748p(interfaceC5979h, r2, completion) : ((InterfaceC5979h) bo.cdj(interfaceC5979h, 2)).invoke(r2, completion);
    }

    @InterfaceC6234g
    @yz(version = "1.3")
    /* JADX INFO: renamed from: g */
    private static final <T> Object m22745g(x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var, InterfaceC6216q<? super T> completion) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(completion, "completion");
        return !(x2Var instanceof AbstractC6206k) ? m22750s(x2Var, completion) : ((x2) bo.cdj(x2Var, 1)).invoke(completion);
    }

    @yz(version = "1.3")
    /* JADX INFO: renamed from: k */
    private static final <T> InterfaceC6216q<was> m22746k(InterfaceC6216q<? super T> interfaceC6216q, x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var) {
        kotlin.coroutines.f7l8 context = interfaceC6216q.getContext();
        return context == C6217s.INSTANCE ? new C6201k(interfaceC6216q, x2Var) : new toq(interfaceC6216q, context, x2Var);
    }

    @nn86
    @InterfaceC7395n
    public static <R, P, T> Object ld6(@InterfaceC7396q cdj<? super R, ? super P, ? super InterfaceC6216q<? super T>, ? extends Object> cdjVar, R r2, P p2, @InterfaceC7396q InterfaceC6216q<? super T> completion) {
        d2ok.m23075h(cdjVar, "<this>");
        d2ok.m23075h(completion, "completion");
        return ((cdj) bo.cdj(cdjVar, 3)).invoke(r2, p2, m22749q(C6211y.m22771k(completion)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    @yz(version = "1.3")
    /* JADX INFO: renamed from: n */
    public static <T> InterfaceC6216q<T> m22747n(@InterfaceC7396q InterfaceC6216q<? super T> interfaceC6216q) {
        InterfaceC6216q<T> interfaceC6216q2;
        d2ok.m23075h(interfaceC6216q, "<this>");
        AbstractC6209q abstractC6209q = interfaceC6216q instanceof AbstractC6209q ? (AbstractC6209q) interfaceC6216q : null;
        return (abstractC6209q == null || (interfaceC6216q2 = (InterfaceC6216q<T>) abstractC6209q.intercepted()) == null) ? interfaceC6216q : interfaceC6216q2;
    }

    @nn86
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    public static final <R, T> Object m22748p(@InterfaceC7396q InterfaceC5979h<? super R, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, R r2, @InterfaceC7396q InterfaceC6216q<? super T> completion) {
        d2ok.m23075h(interfaceC5979h, "<this>");
        d2ok.m23075h(completion, "completion");
        return ((InterfaceC5979h) bo.cdj(interfaceC5979h, 2)).invoke(r2, m22749q(C6211y.m22771k(completion)));
    }

    /* JADX INFO: renamed from: q */
    private static final <T> InterfaceC6216q<T> m22749q(InterfaceC6216q<? super T> interfaceC6216q) {
        kotlin.coroutines.f7l8 context = interfaceC6216q.getContext();
        return context == C6217s.INSTANCE ? new f7l8(interfaceC6216q) : new C6204y(interfaceC6216q, context);
    }

    @nn86
    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    public static final <T> Object m22750s(@InterfaceC7396q x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var, @InterfaceC7396q InterfaceC6216q<? super T> completion) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(completion, "completion");
        return ((x2) bo.cdj(x2Var, 1)).invoke(m22749q(C6211y.m22771k(completion)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    @yz(version = "1.3")
    public static <T> InterfaceC6216q<was> toq(@InterfaceC7396q x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var, @InterfaceC7396q InterfaceC6216q<? super T> completion) {
        d2ok.m23075h(x2Var, "<this>");
        d2ok.m23075h(completion, "completion");
        InterfaceC6216q<?> interfaceC6216qM22771k = C6211y.m22771k(completion);
        if (x2Var instanceof AbstractC6206k) {
            return ((AbstractC6206k) x2Var).create(interfaceC6216qM22771k);
        }
        kotlin.coroutines.f7l8 context = interfaceC6216qM22771k.getContext();
        return context == C6217s.INSTANCE ? new C8056zy(interfaceC6216qM22771k, x2Var) : new C6203q(interfaceC6216qM22771k, context, x2Var);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: y */
    private static final <R, P, T> Object m22751y(cdj<? super R, ? super P, ? super InterfaceC6216q<? super T>, ? extends Object> cdjVar, R r2, P p2, InterfaceC6216q<? super T> completion) {
        d2ok.m23075h(cdjVar, "<this>");
        d2ok.m23075h(completion, "completion");
        return !(cdjVar instanceof AbstractC6206k) ? ld6(cdjVar, r2, p2, completion) : ((cdj) bo.cdj(cdjVar, 3)).invoke(r2, p2, completion);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    @yz(version = "1.3")
    public static <R, T> InterfaceC6216q<was> zy(@InterfaceC7396q InterfaceC5979h<? super R, ? super InterfaceC6216q<? super T>, ? extends Object> interfaceC5979h, R r2, @InterfaceC7396q InterfaceC6216q<? super T> completion) {
        d2ok.m23075h(interfaceC5979h, "<this>");
        d2ok.m23075h(completion, "completion");
        InterfaceC6216q<?> interfaceC6216qM22771k = C6211y.m22771k(completion);
        if (interfaceC5979h instanceof AbstractC6206k) {
            return ((AbstractC6206k) interfaceC5979h).create(r2, interfaceC6216qM22771k);
        }
        kotlin.coroutines.f7l8 context = interfaceC6216qM22771k.getContext();
        return context == C6217s.INSTANCE ? new C6202n(interfaceC6216qM22771k, interfaceC5979h, r2) : new C6200g(interfaceC6216qM22771k, context, interfaceC5979h, r2);
    }
}

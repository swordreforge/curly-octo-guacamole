package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.router.recommend.entity.UICard;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.i1;
import kotlin.was;
import kotlinx.coroutines.flow.internal.C6581k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.z */
/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001au\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022F\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a{\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u00012H\b\u0004\u0010\n\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a#\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u001aG\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001aI\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001a\u001a#\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013\u001a%\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"S", C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "Lkotlin/Function3;", "Lkotlin/c;", "name", "accumulator", "value", "Lkotlin/coroutines/q;", "", "operation", C7704k.y.toq.f44691k, "(Lkotlinx/coroutines/flow/s;Lcyoe/cdj;Lkotlin/coroutines/q;)Ljava/lang/Object;", "R", "initial", "acc", "n", "(Lkotlinx/coroutines/flow/s;Ljava/lang/Object;Lcyoe/cdj;Lkotlin/coroutines/q;)Ljava/lang/Object;", "p", "(Lkotlinx/coroutines/flow/s;Lkotlin/coroutines/q;)Ljava/lang/Object;", "ld6", "toq", "Lkotlin/Function2;", "", "predicate", "k", "(Lkotlinx/coroutines/flow/s;Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "q", "zy", "f7l8", AnimatedProperty.PROPERTY_NAME_Y, "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class C6653z {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$cdj */
    /* JADX INFO: compiled from: Reduce.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m22756f = "Reduce.kt", m22757i = {0}, m22758l = {57}, m22759m = "single", m22760n = {"result"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class cdj<T> extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        cdj(InterfaceC6216q<? super cdj> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.ld6.h4b(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$f7l8 */
    /* JADX INFO: compiled from: Reduce.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m22756f = "Reduce.kt", m22757i = {0, 0}, m22758l = {183}, m22759m = "firstOrNull", m22760n = {"result", "collector$iv"}, m22761s = {"L$0", "L$1"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class f7l8<T> extends AbstractC6209q {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        f7l8(InterfaceC6216q<? super f7l8> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.ld6.c8jq(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$g */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/zurt$toq", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class g<T> implements InterfaceC6618p<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5979h f37149k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ i1.C6299y f37150q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$g$k */
        /* JADX INFO: compiled from: Limit.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", m22756f = "Reduce.kt", m22757i = {0, 0}, m22758l = {UICard.RECOMMEND_BOTTOM_LARGE_ICON_ITEM}, m22759m = "emit", m22760n = {"this", "it"}, m22761s = {"L$0", "L$1"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class k extends AbstractC6209q {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public k(InterfaceC6216q interfaceC6216q) {
                super(interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return g.this.emit(null, this);
            }
        }

        public g(InterfaceC5979h interfaceC5979h, i1.C6299y c6299y) {
            this.f37149k = interfaceC5979h;
            this.f37150q = c6299y;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6653z.g.k
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.z$g$k r0 = (kotlinx.coroutines.flow.C6653z.g.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.z$g$k r0 = new kotlinx.coroutines.flow.z$g$k
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.L$1
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.flow.z$g r0 = (kotlinx.coroutines.flow.C6653z.g) r0
                kotlin.C6318m.n7h(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.C6318m.n7h(r6)
                cyoe.h r6 = r4.f37149k
                r0.L$0 = r4
                r0.L$1 = r5
                r0.label = r3
                r2 = 6
                kotlin.jvm.internal.d3.m23089n(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.d3.m23089n(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                kotlin.jvm.internal.i1$y r6 = r0.f37150q
                r6.element = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                kotlin.was r5 = kotlin.was.f36763k
                return r5
            L64:
                kotlinx.coroutines.flow.internal.k r5 = new kotlinx.coroutines.flow.internal.k
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.g.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$h */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", C0846k.zaso, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class h<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6299y<Object> f37151k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.cdj<S, T, InterfaceC6216q<? super S>, Object> f37152q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$h$k */
        /* JADX INFO: compiled from: Reduce.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", m22756f = "Reduce.kt", m22757i = {}, m22758l = {25}, m22759m = "emit", m22760n = {}, m22761s = {})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class k extends AbstractC6209q {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ h<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(h<? super T> hVar, InterfaceC6216q<? super k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = hVar;
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
        h(i1.C6299y<Object> c6299y, cyoe.cdj<? super S, ? super T, ? super InterfaceC6216q<? super S>, ? extends Object> cdjVar) {
            this.f37151k = c6299y;
            this.f37152q = cdjVar;
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
        public final java.lang.Object emit(T r7, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.C6653z.h.k
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.z$h$k r0 = (kotlinx.coroutines.flow.C6653z.h.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.z$h$k r0 = new kotlinx.coroutines.flow.z$h$k
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.L$0
                kotlin.jvm.internal.i1$y r7 = (kotlin.jvm.internal.i1.C6299y) r7
                kotlin.C6318m.n7h(r8)
                goto L50
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                kotlin.C6318m.n7h(r8)
                kotlin.jvm.internal.i1$y<java.lang.Object> r8 = r6.f37151k
                T r2 = r8.element
                kotlinx.coroutines.internal.l r4 = kotlinx.coroutines.flow.internal.fn3e.f36987k
                if (r2 == r4) goto L53
                cyoe.cdj<S, T, kotlin.coroutines.q<? super S>, java.lang.Object> r4 = r6.f37152q
                r0.L$0 = r8
                r0.label = r3
                java.lang.Object r7 = r4.invoke(r2, r7, r0)
                if (r7 != r1) goto L4d
                return r1
            L4d:
                r5 = r8
                r8 = r7
                r7 = r5
            L50:
                r5 = r8
                r8 = r7
                r7 = r5
            L53:
                r8.element = r7
                kotlin.was r7 = kotlin.was.f36763k
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.h.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$i */
    /* JADX INFO: compiled from: Reduce.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m22756f = "Reduce.kt", m22757i = {0, 0}, m22758l = {183}, m22759m = "singleOrNull", m22760n = {"result", "collector$iv"}, m22761s = {"L$0", "L$1"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class i<T> extends AbstractC6209q {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        i(InterfaceC6216q<? super i> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.ld6.wlev(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$k */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/zurt$toq", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class k<T> implements InterfaceC6618p<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6299y f37153k;

        public k(i1.C6299y c6299y) {
            this.f37153k = c6299y;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @InterfaceC7395n
        public Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            this.f37153k.element = t2;
            throw new C6581k(this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$ki */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class ki<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6299y<Object> f37154k;

        ki(i1.C6299y<Object> c6299y) {
            this.f37154k = c6299y;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @InterfaceC7395n
        public final Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            i1.C6299y<Object> c6299y = this.f37154k;
            if (!(c6299y.element == kotlinx.coroutines.flow.internal.fn3e.f36987k)) {
                throw new IllegalArgumentException("Flow has more than one element".toString());
            }
            c6299y.element = t2;
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$kja0 */
    /* JADX INFO: compiled from: Reduce.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m22756f = "Reduce.kt", m22757i = {0}, m22758l = {22}, m22759m = "reduce", m22760n = {"accumulator"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class kja0<S, T extends S> extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        kja0(InterfaceC6216q<? super kja0> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.ld6.uc(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$ld6 */
    /* JADX INFO: compiled from: Reduce.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m22756f = "Reduce.kt", m22757i = {0}, m22758l = {155}, m22759m = "last", m22760n = {"result"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class ld6<T> extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        ld6(InterfaceC6216q<? super ld6> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.ld6.r8s8(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$n */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/zurt$toq", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class n<T> implements InterfaceC6618p<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6299y f37155k;

        public n(i1.C6299y c6299y) {
            this.f37155k = c6299y;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @InterfaceC7395n
        public Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            this.f37155k.element = t2;
            throw new C6581k(this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$n7h */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "it", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class n7h<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6299y<T> f37156k;

        n7h(i1.C6299y<T> c6299y) {
            this.f37156k = c6299y;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @InterfaceC7395n
        public final Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            this.f37156k.element = t2;
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$p */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class p<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6299y<R> f37157k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.cdj<R, T, InterfaceC6216q<? super R>, Object> f37158q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$p$k */
        /* JADX INFO: compiled from: Reduce.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", m22756f = "Reduce.kt", m22757i = {}, m22758l = {45}, m22759m = "emit", m22760n = {}, m22761s = {})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class k extends AbstractC6209q {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ p<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public k(p<? super T> pVar, InterfaceC6216q<? super k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = pVar;
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
        public p(i1.C6299y<R> c6299y, cyoe.cdj<? super R, ? super T, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar) {
            this.f37157k = c6299y;
            this.f37158q = cdjVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.C6653z.p.k
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.z$p$k r0 = (kotlinx.coroutines.flow.C6653z.p.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.z$p$k r0 = new kotlinx.coroutines.flow.z$p$k
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.L$0
                kotlin.jvm.internal.i1$y r7 = (kotlin.jvm.internal.i1.C6299y) r7
                kotlin.C6318m.n7h(r8)
                goto L4c
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                kotlin.C6318m.n7h(r8)
                kotlin.jvm.internal.i1$y<R> r8 = r6.f37157k
                cyoe.cdj<R, T, kotlin.coroutines.q<? super R>, java.lang.Object> r2 = r6.f37158q
                T r4 = r8.element
                r0.L$0 = r8
                r0.label = r3
                java.lang.Object r7 = r2.invoke(r4, r7, r0)
                if (r7 != r1) goto L49
                return r1
            L49:
                r5 = r8
                r8 = r7
                r7 = r5
            L4c:
                r7.element = r8
                kotlin.was r7 = kotlin.was.f36763k
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.p.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final Object m24279k(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new k(this, interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            i1.C6299y<R> c6299y = this.f37157k;
            c6299y.element = (T) this.f37158q.invoke((R) c6299y.element, t2, (InterfaceC6216q<? super R>) interfaceC6216q);
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$q */
    /* JADX INFO: compiled from: Reduce.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m22756f = "Reduce.kt", m22757i = {0, 0, 0}, m22758l = {183}, m22759m = "first", m22760n = {"predicate", "result", "collector$iv"}, m22761s = {"L$0", "L$1", "L$2"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class q<T> extends AbstractC6209q {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        q(InterfaceC6216q<? super q> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.ld6.m24175u(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$qrj */
    /* JADX INFO: compiled from: Reduce.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m22756f = "Reduce.kt", m22757i = {0}, m22758l = {167}, m22759m = "lastOrNull", m22760n = {"result"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class qrj<T> extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        qrj(InterfaceC6216q<? super qrj> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.ld6.m4(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$s */
    /* JADX INFO: compiled from: Reduce.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m22756f = "Reduce.kt", m22757i = {0}, m22758l = {44}, m22759m = "fold", m22760n = {"accumulator"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
    static final class s<T, R> extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        s(InterfaceC6216q<? super s> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6653z.m24274n(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$t8r */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/zurt$toq", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class t8r<T> implements InterfaceC6618p<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6299y f37159k;

        public t8r(i1.C6299y c6299y) {
            this.f37159k = c6299y;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @InterfaceC7395n
        public Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            boolean z2;
            i1.C6299y c6299y = this.f37159k;
            T t3 = c6299y.element;
            T t4 = (T) kotlinx.coroutines.flow.internal.fn3e.f36987k;
            if (t3 == t4) {
                c6299y.element = t2;
                z2 = true;
            } else {
                c6299y.element = t4;
                z2 = false;
            }
            if (z2) {
                return was.f36763k;
            }
            throw new C6581k(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$toq */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/zurt$toq", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq<T> implements InterfaceC6618p<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5979h f37160k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ i1.C6299y f37161q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$toq$k */
        /* JADX INFO: compiled from: Limit.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", m22756f = "Reduce.kt", m22757i = {0, 0}, m22758l = {UICard.RECOMMEND_BOTTOM_LARGE_ICON_ITEM}, m22759m = "emit", m22760n = {"this", "it"}, m22761s = {"L$0", "L$1"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class k extends AbstractC6209q {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public k(InterfaceC6216q interfaceC6216q) {
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

        public toq(InterfaceC5979h interfaceC5979h, i1.C6299y c6299y) {
            this.f37160k = interfaceC5979h;
            this.f37161q = c6299y;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6653z.toq.k
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.z$toq$k r0 = (kotlinx.coroutines.flow.C6653z.toq.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.z$toq$k r0 = new kotlinx.coroutines.flow.z$toq$k
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.L$1
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.flow.z$toq r0 = (kotlinx.coroutines.flow.C6653z.toq) r0
                kotlin.C6318m.n7h(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.C6318m.n7h(r6)
                cyoe.h r6 = r4.f37160k
                r0.L$0 = r4
                r0.L$1 = r5
                r0.label = r3
                r2 = 6
                kotlin.jvm.internal.d3.m23089n(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.d3.m23089n(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                kotlin.jvm.internal.i1$y r6 = r0.f37161q
                r6.element = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                kotlin.was r5 = kotlin.was.f36763k
                return r5
            L64:
                kotlinx.coroutines.flow.internal.k r5 = new kotlinx.coroutines.flow.internal.k
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.toq.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$x2 */
    /* JADX INFO: compiled from: Reduce.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "it", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class x2<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6299y<Object> f37162k;

        x2(i1.C6299y<Object> c6299y) {
            this.f37162k = c6299y;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @InterfaceC7395n
        public final Object emit(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            this.f37162k.element = t2;
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$y */
    /* JADX INFO: compiled from: Reduce.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m22756f = "Reduce.kt", m22757i = {0, 0}, m22758l = {183}, m22759m = "firstOrNull", m22760n = {"result", "collector$iv"}, m22761s = {"L$0", "L$1"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class y<T> extends AbstractC6209q {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        y(InterfaceC6216q<? super y> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.ld6.y2(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.z$zy */
    /* JADX INFO: compiled from: Reduce.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m22756f = "Reduce.kt", m22757i = {0, 0}, m22758l = {183}, m22759m = "first", m22760n = {"result", "collector$iv"}, m22761s = {"L$0", "L$1"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class zy<T> extends AbstractC6209q {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        zy(InterfaceC6216q<? super zy> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.ld6.bo(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object f7l8(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.C6653z.ld6
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.z$ld6 r0 = (kotlinx.coroutines.flow.C6653z.ld6) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.z$ld6 r0 = new kotlinx.coroutines.flow.z$ld6
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.i1$y r4 = (kotlin.jvm.internal.i1.C6299y) r4
            kotlin.C6318m.n7h(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C6318m.n7h(r5)
            kotlin.jvm.internal.i1$y r5 = new kotlin.jvm.internal.i1$y
            r5.<init>()
            kotlinx.coroutines.internal.l r2 = kotlinx.coroutines.flow.internal.fn3e.f36987k
            r5.element = r2
            kotlinx.coroutines.flow.z$x2 r2 = new kotlinx.coroutines.flow.z$x2
            r2.<init>(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.mo5262k(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.element
            kotlinx.coroutines.internal.l r5 = kotlinx.coroutines.flow.internal.fn3e.f36987k
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.f7l8(kotlinx.coroutines.flow.s, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    private static final <T, R> Object m24272g(InterfaceC6622s<? extends T> interfaceC6622s, R r2, cyoe.cdj<? super R, ? super T, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar, InterfaceC6216q<? super R> interfaceC6216q) {
        i1.C6299y c6299y = new i1.C6299y();
        c6299y.element = r2;
        p pVar = new p(c6299y, cdjVar);
        kotlin.jvm.internal.d3.m23089n(0);
        interfaceC6622s.mo5262k(pVar, interfaceC6216q);
        kotlin.jvm.internal.d3.m23089n(1);
        return c6299y.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object m24273k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q cyoe.InterfaceC5979h<? super T, ? super kotlin.coroutines.InterfaceC6216q<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6653z.q
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.z$q r0 = (kotlinx.coroutines.flow.C6653z.q) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.z$q r0 = new kotlinx.coroutines.flow.z$q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.L$2
            kotlinx.coroutines.flow.z$toq r4 = (kotlinx.coroutines.flow.C6653z.toq) r4
            java.lang.Object r5 = r0.L$1
            kotlin.jvm.internal.i1$y r5 = (kotlin.jvm.internal.i1.C6299y) r5
            java.lang.Object r0 = r0.L$0
            cyoe.h r0 = (cyoe.InterfaceC5979h) r0
            kotlin.C6318m.n7h(r6)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            kotlin.C6318m.n7h(r6)
            kotlin.jvm.internal.i1$y r6 = new kotlin.jvm.internal.i1$y
            r6.<init>()
            kotlinx.coroutines.internal.l r2 = kotlinx.coroutines.flow.internal.fn3e.f36987k
            r6.element = r2
            kotlinx.coroutines.flow.z$toq r2 = new kotlinx.coroutines.flow.z$toq
            r2.<init>(r5, r6)
            r0.L$0 = r5     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L62
            r0.L$1 = r6     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L62
            r0.L$2 = r2     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L62
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L62
            java.lang.Object r4 = r4.mo5262k(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            kotlinx.coroutines.flow.internal.cdj.toq(r6, r4)
        L6a:
            T r4 = r5.element
            kotlinx.coroutines.internal.l r5 = kotlinx.coroutines.flow.internal.fn3e.f36987k
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate "
            java.lang.String r5 = kotlin.jvm.internal.d2ok.mcp(r5, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.m24273k(kotlinx.coroutines.flow.s, cyoe.h, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object ld6(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.C6653z.i
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.z$i r0 = (kotlinx.coroutines.flow.C6653z.i) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.z$i r0 = new kotlinx.coroutines.flow.z$i
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.flow.z$t8r r4 = (kotlinx.coroutines.flow.C6653z.t8r) r4
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.i1$y r0 = (kotlin.jvm.internal.i1.C6299y) r0
            kotlin.C6318m.n7h(r5)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.C6318m.n7h(r5)
            kotlin.jvm.internal.i1$y r5 = new kotlin.jvm.internal.i1$y
            r5.<init>()
            kotlinx.coroutines.internal.l r2 = kotlinx.coroutines.flow.internal.fn3e.f36987k
            r5.element = r2
            kotlinx.coroutines.flow.z$t8r r2 = new kotlinx.coroutines.flow.z$t8r
            r2.<init>(r5)
            r0.L$0 = r5     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L5b
            r0.L$1 = r2     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L5b
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L5b
            java.lang.Object r4 = r4.mo5262k(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            kotlinx.coroutines.flow.internal.cdj.toq(r5, r4)
        L62:
            T r4 = r0.element
            kotlinx.coroutines.internal.l r5 = kotlinx.coroutines.flow.internal.fn3e.f36987k
            if (r4 != r5) goto L69
            r4 = 0
        L69:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.ld6(kotlinx.coroutines.flow.s, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, R> java.lang.Object m24274n(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, R r5, @mub.InterfaceC7396q cyoe.cdj<? super R, ? super T, ? super kotlin.coroutines.InterfaceC6216q<? super R>, ? extends java.lang.Object> r6, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super R> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.C6653z.s
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.z$s r0 = (kotlinx.coroutines.flow.C6653z.s) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.z$s r0 = new kotlinx.coroutines.flow.z$s
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.i1$y r4 = (kotlin.jvm.internal.i1.C6299y) r4
            kotlin.C6318m.n7h(r7)
            goto L50
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C6318m.n7h(r7)
            kotlin.jvm.internal.i1$y r7 = new kotlin.jvm.internal.i1$y
            r7.<init>()
            r7.element = r5
            kotlinx.coroutines.flow.z$p r5 = new kotlinx.coroutines.flow.z$p
            r5.<init>(r7, r6)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r4 = r4.mo5262k(r5, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r7
        L50:
            T r4 = r4.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.m24274n(kotlinx.coroutines.flow.s, java.lang.Object, cyoe.cdj, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object m24275p(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.C6653z.cdj
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.z$cdj r0 = (kotlinx.coroutines.flow.C6653z.cdj) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.z$cdj r0 = new kotlinx.coroutines.flow.z$cdj
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.i1$y r4 = (kotlin.jvm.internal.i1.C6299y) r4
            kotlin.C6318m.n7h(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C6318m.n7h(r5)
            kotlin.jvm.internal.i1$y r5 = new kotlin.jvm.internal.i1$y
            r5.<init>()
            kotlinx.coroutines.internal.l r2 = kotlinx.coroutines.flow.internal.fn3e.f36987k
            r5.element = r2
            kotlinx.coroutines.flow.z$ki r2 = new kotlinx.coroutines.flow.z$ki
            r2.<init>(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.mo5262k(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.element
            kotlinx.coroutines.internal.l r5 = kotlinx.coroutines.flow.internal.fn3e.f36987k
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.m24275p(kotlinx.coroutines.flow.s, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object m24276q(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.C6653z.f7l8
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.z$f7l8 r0 = (kotlinx.coroutines.flow.C6653z.f7l8) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.z$f7l8 r0 = new kotlinx.coroutines.flow.z$f7l8
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.flow.z$n r4 = (kotlinx.coroutines.flow.C6653z.n) r4
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.i1$y r0 = (kotlin.jvm.internal.i1.C6299y) r0
            kotlin.C6318m.n7h(r5)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.C6318m.n7h(r5)
            kotlin.jvm.internal.i1$y r5 = new kotlin.jvm.internal.i1$y
            r5.<init>()
            kotlinx.coroutines.flow.z$n r2 = new kotlinx.coroutines.flow.z$n
            r2.<init>(r5)
            r0.L$0 = r5     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L57
            r0.L$1 = r2     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L57
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L57
            java.lang.Object r4 = r4.mo5262k(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            kotlinx.coroutines.flow.internal.cdj.toq(r5, r4)
        L5e:
            T r4 = r0.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.m24276q(kotlinx.coroutines.flow.s, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.internal.l] */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, T extends S> java.lang.Object m24277s(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q cyoe.cdj<? super S, ? super T, ? super kotlin.coroutines.InterfaceC6216q<? super S>, ? extends java.lang.Object> r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super S> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6653z.kja0
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.z$kja0 r0 = (kotlinx.coroutines.flow.C6653z.kja0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.z$kja0 r0 = new kotlinx.coroutines.flow.z$kja0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.i1$y r4 = (kotlin.jvm.internal.i1.C6299y) r4
            kotlin.C6318m.n7h(r6)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C6318m.n7h(r6)
            kotlin.jvm.internal.i1$y r6 = new kotlin.jvm.internal.i1$y
            r6.<init>()
            kotlinx.coroutines.internal.l r2 = kotlinx.coroutines.flow.internal.fn3e.f36987k
            r6.element = r2
            kotlinx.coroutines.flow.z$h r2 = new kotlinx.coroutines.flow.z$h
            r2.<init>(r6, r5)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r4 = r4.mo5262k(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r6
        L52:
            T r4 = r4.element
            kotlinx.coroutines.internal.l r5 = kotlinx.coroutines.flow.internal.fn3e.f36987k
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Empty flow can't be reduced"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.m24277s(kotlinx.coroutines.flow.s, cyoe.cdj, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object toq(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.C6653z.zy
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.z$zy r0 = (kotlinx.coroutines.flow.C6653z.zy) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.z$zy r0 = new kotlinx.coroutines.flow.z$zy
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.flow.z$k r4 = (kotlinx.coroutines.flow.C6653z.k) r4
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.internal.i1$y r0 = (kotlin.jvm.internal.i1.C6299y) r0
            kotlin.C6318m.n7h(r5)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.C6318m.n7h(r5)
            kotlin.jvm.internal.i1$y r5 = new kotlin.jvm.internal.i1$y
            r5.<init>()
            kotlinx.coroutines.internal.l r2 = kotlinx.coroutines.flow.internal.fn3e.f36987k
            r5.element = r2
            kotlinx.coroutines.flow.z$k r2 = new kotlinx.coroutines.flow.z$k
            r2.<init>(r5)
            r0.L$0 = r5     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L5b
            r0.L$1 = r2     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L5b
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L5b
            java.lang.Object r4 = r4.mo5262k(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            kotlinx.coroutines.flow.internal.cdj.toq(r5, r4)
        L62:
            T r4 = r0.element
            kotlinx.coroutines.internal.l r5 = kotlinx.coroutines.flow.internal.fn3e.f36987k
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.toq(kotlinx.coroutines.flow.s, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object m24278y(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.C6653z.qrj
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.z$qrj r0 = (kotlinx.coroutines.flow.C6653z.qrj) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.z$qrj r0 = new kotlinx.coroutines.flow.z$qrj
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.i1$y r4 = (kotlin.jvm.internal.i1.C6299y) r4
            kotlin.C6318m.n7h(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.C6318m.n7h(r5)
            kotlin.jvm.internal.i1$y r5 = new kotlin.jvm.internal.i1$y
            r5.<init>()
            kotlinx.coroutines.flow.z$n7h r2 = new kotlinx.coroutines.flow.z$n7h
            r2.<init>(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.mo5262k(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            T r4 = r4.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.m24278y(kotlinx.coroutines.flow.s, kotlin.coroutines.q):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object zy(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q cyoe.InterfaceC5979h<? super T, ? super kotlin.coroutines.InterfaceC6216q<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6653z.y
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.z$y r0 = (kotlinx.coroutines.flow.C6653z.y) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.z$y r0 = new kotlinx.coroutines.flow.z$y
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            kotlinx.coroutines.flow.z$g r4 = (kotlinx.coroutines.flow.C6653z.g) r4
            java.lang.Object r5 = r0.L$0
            kotlin.jvm.internal.i1$y r5 = (kotlin.jvm.internal.i1.C6299y) r5
            kotlin.C6318m.n7h(r6)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L31
            goto L5e
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.C6318m.n7h(r6)
            kotlin.jvm.internal.i1$y r6 = new kotlin.jvm.internal.i1$y
            r6.<init>()
            kotlinx.coroutines.flow.z$g r2 = new kotlinx.coroutines.flow.z$g
            r2.<init>(r5, r6)
            r0.L$0 = r6     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L57
            r0.L$1 = r2     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L57
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L57
            java.lang.Object r4 = r4.mo5262k(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L5e
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            kotlinx.coroutines.flow.internal.cdj.toq(r6, r4)
        L5e:
            T r4 = r5.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6653z.zy(kotlinx.coroutines.flow.s, cyoe.h, kotlin.coroutines.q):java.lang.Object");
    }
}

package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.i1;
import kotlin.was;
import kotlinx.coroutines.flow.internal.C6581k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a+\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aJ\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000b\u001ar\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\u0001\u0010\u0018\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0014¢\u0006\u0002\b\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\u001b\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0080Hø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "", "count", "q", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "", "predicate", "n", "(Lkotlinx/coroutines/flow/s;Lcyoe/h;)Lkotlinx/coroutines/flow/s;", "f7l8", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", C7704k.y.toq.f95579toq, "(Lkotlinx/coroutines/flow/p;Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", AnimatedProperty.PROPERTY_NAME_Y, "R", "Lkotlin/Function3;", "Lkotlin/c;", "name", "Lkotlin/fn3e;", "transform", C7704k.y.toq.f44691k, "(Lkotlinx/coroutines/flow/s;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", "toq", "(Lkotlinx/coroutines/flow/s;Lcyoe/h;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class zurt {

    /* JADX INFO: compiled from: Limit.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m22756f = "Limit.kt", m22757i = {0}, m22758l = {73}, m22759m = "emitAbort$FlowKt__LimitKt", m22760n = {"$this$emitAbort"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class f7l8<T> extends AbstractC6209q {
        Object L$0;
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
            return zurt.m24280g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$g */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6654g<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6295k f37163k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ InterfaceC5979h<T, InterfaceC6216q<? super Boolean>, Object> f37164n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC6618p<T> f37165q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$g$k */
        /* JADX INFO: compiled from: Limit.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m22756f = "Limit.kt", m22757i = {1, 1}, m22758l = {37, 38, 40}, m22759m = "emit", m22760n = {"this", "value"}, m22761s = {"L$0", "L$1"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class k extends AbstractC6209q {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C6654g<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(C6654g<? super T> c6654g, InterfaceC6216q<? super k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = c6654g;
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
        C6654g(i1.C6295k c6295k, InterfaceC6618p<? super T> interfaceC6618p, InterfaceC5979h<? super T, ? super InterfaceC6216q<? super Boolean>, ? extends Object> interfaceC5979h) {
            this.f37163k = c6295k;
            this.f37165q = interfaceC6618p;
            this.f37164n = interfaceC5979h;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
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
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.zurt.C6654g.k
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.zurt$g$k r0 = (kotlinx.coroutines.flow.zurt.C6654g.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.zurt$g$k r0 = new kotlinx.coroutines.flow.zurt$g$k
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                kotlin.C6318m.n7h(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.L$1
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.zurt$g r2 = (kotlinx.coroutines.flow.zurt.C6654g) r2
                kotlin.C6318m.n7h(r8)
                goto L6c
            L41:
                kotlin.C6318m.n7h(r8)
                goto L59
            L45:
                kotlin.C6318m.n7h(r8)
                kotlin.jvm.internal.i1$k r8 = r6.f37163k
                boolean r8 = r8.element
                if (r8 == 0) goto L5c
                kotlinx.coroutines.flow.p<T> r8 = r6.f37165q
                r0.label = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                kotlin.was r7 = kotlin.was.f36763k
                return r7
            L5c:
                cyoe.h<T, kotlin.coroutines.q<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f37164n
                r0.L$0 = r6
                r0.L$1 = r7
                r0.label = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.i1$k r8 = r2.f37163k
                r8.element = r5
                kotlinx.coroutines.flow.p<T> r8 = r2.f37165q
                r2 = 0
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                kotlin.was r7 = kotlin.was.f36763k
                return r7
            L8b:
                kotlin.was r7 = kotlin.was.f36763k
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.zurt.C6654g.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$k */
    /* JADX INFO: compiled from: Limit.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m22756f = "Limit.kt", m22757i = {0}, m22758l = {UIElement.HOMEPAGE_SILDE_AD_CARD}, m22759m = "collectWhile", m22760n = {"collector"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
    static final class C6655k<T> extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C6655k(InterfaceC6216q<? super C6655k> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return zurt.toq(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/zurt$toq", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class ld6<T> implements InterfaceC6618p<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5979h f37166k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC6618p f37167q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$ld6$k */
        /* JADX INFO: compiled from: Limit.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", m22756f = "Limit.kt", m22757i = {0, 0, 1}, m22758l = {UICard.RECOMMEND_BOTTOM_LARGE_ICON_ITEM, 144}, m22759m = "emit", m22760n = {"this", "value", "this"}, m22761s = {"L$0", "L$1", "L$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class C6656k extends AbstractC6209q {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C6656k(InterfaceC6216q interfaceC6216q) {
                super(interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return ld6.this.emit(null, this);
            }
        }

        public ld6(InterfaceC5979h interfaceC5979h, InterfaceC6618p interfaceC6618p) {
            this.f37166k = interfaceC5979h;
            this.f37167q = interfaceC6618p;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r8, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.zurt.ld6.C6656k
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.zurt$ld6$k r0 = (kotlinx.coroutines.flow.zurt.ld6.C6656k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.zurt$ld6$k r0 = new kotlinx.coroutines.flow.zurt$ld6$k
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.L$0
                kotlinx.coroutines.flow.zurt$ld6 r8 = (kotlinx.coroutines.flow.zurt.ld6) r8
                kotlin.C6318m.n7h(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.L$1
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.zurt$ld6 r2 = (kotlinx.coroutines.flow.zurt.ld6) r2
                kotlin.C6318m.n7h(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                kotlin.C6318m.n7h(r9)
                cyoe.h r9 = r7.f37166k
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r4
                r2 = 6
                kotlin.jvm.internal.d3.m23089n(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.d3.m23089n(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                kotlinx.coroutines.flow.p r2 = r8.f37167q
                r0.L$0 = r8
                r5 = 0
                r0.L$1 = r5
                r0.label = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            L81:
                kotlinx.coroutines.flow.internal.k r9 = new kotlinx.coroutines.flow.internal.k
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.zurt.ld6.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$n */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6657n<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37168k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h f37169q;

        public C6657n(InterfaceC6622s interfaceC6622s, InterfaceC5979h interfaceC5979h) {
            this.f37168k = interfaceC6622s;
            this.f37169q = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            Object objMo5262k = this.f37168k.mo5262k(new C6654g(new i1.C6295k(), interfaceC6618p, this.f37169q), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$p */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6658p<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37170k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h f37171q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$p$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", m22756f = "Limit.kt", m22757i = {0}, m22758l = {124}, m22759m = "collect", m22760n = {"collector$iv"}, m22761s = {"L$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class k extends AbstractC6209q {
            Object L$0;
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
                return C6658p.this.mo5262k(null, this);
            }
        }

        public C6658p(InterfaceC6622s interfaceC6622s, InterfaceC5979h interfaceC5979h) {
            this.f37170k = interfaceC6622s;
            this.f37171q = interfaceC5979h;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super T> r6, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.zurt.C6658p.k
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.zurt$p$k r0 = (kotlinx.coroutines.flow.zurt.C6658p.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.zurt$p$k r0 = new kotlinx.coroutines.flow.zurt$p$k
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.L$0
                kotlinx.coroutines.flow.zurt$ld6 r6 = (kotlinx.coroutines.flow.zurt.ld6) r6
                kotlin.C6318m.n7h(r7)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                kotlin.C6318m.n7h(r7)
                kotlinx.coroutines.flow.s r7 = r5.f37170k
                kotlinx.coroutines.flow.zurt$ld6 r2 = new kotlinx.coroutines.flow.zurt$ld6
                cyoe.h r4 = r5.f37171q
                r2.<init>(r4, r6)
                r0.L$0 = r2     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L4e
                r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L4e
                java.lang.Object r6 = r7.mo5262k(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                kotlinx.coroutines.flow.internal.cdj.toq(r7, r6)
            L53:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.zurt.C6658p.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$q */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6659q<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6294g f37172k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ InterfaceC6618p<T> f37173n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f37174q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$q$k */
        /* JADX INFO: compiled from: Limit.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", m22756f = "Limit.kt", m22757i = {}, m22758l = {25}, m22759m = "emit", m22760n = {}, m22761s = {})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C6659q<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(C6659q<? super T> c6659q, InterfaceC6216q<? super k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = c6659q;
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
        C6659q(i1.C6294g c6294g, int i2, InterfaceC6618p<? super T> interfaceC6618p) {
            this.f37172k = c6294g;
            this.f37174q = i2;
            this.f37173n = interfaceC6618p;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.zurt.C6659q.k
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.zurt$q$k r0 = (kotlinx.coroutines.flow.zurt.C6659q.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.zurt$q$k r0 = new kotlinx.coroutines.flow.zurt$q$k
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C6318m.n7h(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C6318m.n7h(r7)
                kotlin.jvm.internal.i1$g r7 = r5.f37172k
                int r2 = r7.element
                int r4 = r5.f37174q
                if (r2 < r4) goto L4a
                kotlinx.coroutines.flow.p<T> r7 = r5.f37173n
                r0.label = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            L4a:
                int r2 = r2 + r3
                r7.element = r2
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.zurt.C6659q.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$s */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6660s<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6294g f37175k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ InterfaceC6618p<T> f37176n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f37177q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$s$k */
        /* JADX INFO: compiled from: Limit.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", m22756f = "Limit.kt", m22757i = {}, m22758l = {61, 63}, m22759m = "emit", m22760n = {}, m22761s = {})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C6660s<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(C6660s<? super T> c6660s, InterfaceC6216q<? super k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = c6660s;
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
        C6660s(i1.C6294g c6294g, int i2, InterfaceC6618p<? super T> interfaceC6618p) {
            this.f37175k = c6294g;
            this.f37177q = i2;
            this.f37176n = interfaceC6618p;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.zurt.C6660s.k
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.zurt$s$k r0 = (kotlinx.coroutines.flow.zurt.C6660s.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.zurt$s$k r0 = new kotlinx.coroutines.flow.zurt$s$k
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C6318m.n7h(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                kotlin.C6318m.n7h(r7)
                goto L51
            L38:
                kotlin.C6318m.n7h(r7)
                kotlin.jvm.internal.i1$g r7 = r5.f37175k
                int r2 = r7.element
                int r2 = r2 + r4
                r7.element = r2
                int r7 = r5.f37177q
                if (r2 >= r7) goto L54
                kotlinx.coroutines.flow.p<T> r7 = r5.f37176n
                r0.label = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            L54:
                kotlinx.coroutines.flow.p<T> r7 = r5.f37176n
                r0.label = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.zurt.m24281k(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.zurt.C6660s.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/zurt$toq", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq<T> implements InterfaceC6618p<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5979h<T, InterfaceC6216q<? super Boolean>, Object> f37178k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$toq$k */
        /* JADX INFO: compiled from: Limit.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", m22756f = "Limit.kt", m22757i = {0}, m22758l = {131}, m22759m = "emit", m22760n = {"this"}, m22761s = {"L$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class C6661k extends AbstractC6209q {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public C6661k(InterfaceC6216q<? super C6661k> interfaceC6216q) {
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
        public toq(InterfaceC5979h<? super T, ? super InterfaceC6216q<? super Boolean>, ? extends Object> interfaceC5979h) {
            this.f37178k = interfaceC5979h;
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
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.zurt.toq.C6661k
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.zurt$toq$k r0 = (kotlinx.coroutines.flow.zurt.toq.C6661k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.zurt$toq$k r0 = new kotlinx.coroutines.flow.zurt$toq$k
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.zurt$toq r5 = (kotlinx.coroutines.flow.zurt.toq) r5
                kotlin.C6318m.n7h(r6)
                goto L46
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.C6318m.n7h(r6)
                cyoe.h<T, kotlin.coroutines.q<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f37178k
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                r5 = r4
            L46:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L51
                kotlin.was r5 = kotlin.was.f36763k
                return r5
            L51:
                kotlinx.coroutines.flow.internal.k r6 = new kotlinx.coroutines.flow.internal.k
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.zurt.toq.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object m24286k(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new C6661k(interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            if (((Boolean) this.f37178k.invoke(t2, interfaceC6216q)).booleanValue()) {
                return was.f36763k;
            }
            throw new C6581k(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: Limit.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", m22756f = "Limit.kt", m22757i = {0}, m22758l = {153}, m22759m = "invokeSuspend", m22760n = {"collector$iv"}, m22761s = {"L$0"})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class x2<R> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6622s<T> $this_transformWhile;
        final /* synthetic */ cyoe.cdj<InterfaceC6618p<? super R>, T, InterfaceC6216q<? super Boolean>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$x2$k */
        /* JADX INFO: compiled from: Limit.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/zurt$toq", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
        public static final class C6662k<T> implements InterfaceC6618p<T> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ cyoe.cdj f37179k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ InterfaceC6618p f37180q;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$x2$k$k */
            /* JADX INFO: compiled from: Limit.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", m22756f = "Limit.kt", m22757i = {0}, m22758l = {UICard.RECOMMEND_BOTTOM_LARGE_ICON_ITEM}, m22759m = "emit", m22760n = {"this"}, m22761s = {"L$0"})
            @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
            public static final class k extends AbstractC6209q {
                Object L$0;
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
                    return C6662k.this.emit(null, this);
                }
            }

            public C6662k(cyoe.cdj cdjVar, InterfaceC6618p interfaceC6618p) {
                this.f37179k = cdjVar;
                this.f37180q = interfaceC6618p;
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
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.zurt.x2.C6662k.k
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.zurt$x2$k$k r0 = (kotlinx.coroutines.flow.zurt.x2.C6662k.k) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.zurt$x2$k$k r0 = new kotlinx.coroutines.flow.zurt$x2$k$k
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r5 = r0.L$0
                    kotlinx.coroutines.flow.zurt$x2$k r5 = (kotlinx.coroutines.flow.zurt.x2.C6662k) r5
                    kotlin.C6318m.n7h(r6)
                    goto L50
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    kotlin.C6318m.n7h(r6)
                    cyoe.cdj r6 = r4.f37179k
                    kotlinx.coroutines.flow.p r2 = r4.f37180q
                    r0.L$0 = r4
                    r0.label = r3
                    r3 = 6
                    kotlin.jvm.internal.d3.m23089n(r3)
                    java.lang.Object r6 = r6.invoke(r2, r5, r0)
                    r5 = 7
                    kotlin.jvm.internal.d3.m23089n(r5)
                    if (r6 != r1) goto L4f
                    return r1
                L4f:
                    r5 = r4
                L50:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L5b
                    kotlin.was r5 = kotlin.was.f36763k
                    return r5
                L5b:
                    kotlinx.coroutines.flow.internal.k r6 = new kotlinx.coroutines.flow.internal.k
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.zurt.x2.C6662k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x2(InterfaceC6622s<? extends T> interfaceC6622s, cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T, ? super InterfaceC6216q<? super Boolean>, ? extends Object> cdjVar, InterfaceC6216q<? super x2> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_transformWhile = interfaceC6622s;
            this.$transform = cdjVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            x2 x2Var = new x2(this.$this_transformWhile, this.$transform, interfaceC6216q);
            x2Var.L$0 = obj;
            return x2Var;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((x2) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.q to kotlinx.coroutines.flow.zurt$x2<R> for r5v1 'this'  kotlin.coroutines.q
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r5.L$0
                kotlinx.coroutines.flow.zurt$x2$k r0 = (kotlinx.coroutines.flow.zurt.x2.C6662k) r0
                kotlin.C6318m.n7h(r6)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L13
                goto L3d
            L13:
                r6 = move-exception
                goto L3a
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                kotlin.C6318m.n7h(r6)
                java.lang.Object r6 = r5.L$0
                kotlinx.coroutines.flow.p r6 = (kotlinx.coroutines.flow.InterfaceC6618p) r6
                kotlinx.coroutines.flow.s<T> r1 = r5.$this_transformWhile
                cyoe.cdj<kotlinx.coroutines.flow.p<? super R>, T, kotlin.coroutines.q<? super java.lang.Boolean>, java.lang.Object> r3 = r5.$transform
                kotlinx.coroutines.flow.zurt$x2$k r4 = new kotlinx.coroutines.flow.zurt$x2$k
                r4.<init>(r3, r6)
                r5.L$0 = r4     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L38
                r5.label = r2     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L38
                java.lang.Object r6 = r1.mo5262k(r4, r5)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L38
                if (r6 != r0) goto L3d
                return r0
            L38:
                r6 = move-exception
                r0 = r4
            L3a:
                kotlinx.coroutines.flow.internal.cdj.toq(r6, r0)
            L3d:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.zurt.x2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$y */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6663y<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37181k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f37182q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.zurt$y$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", m22756f = "Limit.kt", m22757i = {0}, m22758l = {115}, m22759m = "collect", m22760n = {"$this$take_u24lambda_u2d4"}, m22761s = {"L$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class k extends AbstractC6209q {
            Object L$0;
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
                return C6663y.this.mo5262k(null, this);
            }
        }

        public C6663y(InterfaceC6622s interfaceC6622s, int i2) {
            this.f37181k = interfaceC6622s;
            this.f37182q = i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.flow.p, kotlinx.coroutines.flow.p<? super T>] */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.p] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super T> r7, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.zurt.C6663y.k
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.zurt$y$k r0 = (kotlinx.coroutines.flow.zurt.C6663y.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.zurt$y$k r0 = new kotlinx.coroutines.flow.zurt$y$k
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.flow.p r7 = (kotlinx.coroutines.flow.InterfaceC6618p) r7
                kotlin.C6318m.n7h(r8)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L51
                goto L55
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                kotlin.C6318m.n7h(r8)
                kotlin.jvm.internal.i1$g r8 = new kotlin.jvm.internal.i1$g
                r8.<init>()
                kotlinx.coroutines.flow.s r2 = r6.f37181k     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L51
                kotlinx.coroutines.flow.zurt$s r4 = new kotlinx.coroutines.flow.zurt$s     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L51
                int r5 = r6.f37182q     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L51
                r4.<init>(r8, r5, r7)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L51
                r0.L$0 = r7     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L51
                r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L51
                java.lang.Object r7 = r2.mo5262k(r4, r0)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L51
                if (r7 != r1) goto L55
                return r1
            L51:
                r8 = move-exception
                kotlinx.coroutines.flow.internal.cdj.toq(r8, r7)
            L55:
                kotlin.was r7 = kotlin.was.f36763k
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.zurt.C6663y.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class zy<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37183k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f37184q;

        public zy(InterfaceC6622s interfaceC6622s, int i2) {
            this.f37183k = interfaceC6622s;
            this.f37184q = i2;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            Object objMo5262k = this.f37183k.mo5262k(new C6659q(new i1.C6294g(), this.f37184q, interfaceC6618p), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> f7l8(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, int i2) {
        if (i2 > 0) {
            return new C6663y(interfaceC6622s, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " should be positive").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object m24280g(kotlinx.coroutines.flow.InterfaceC6618p<? super T> r4, T r5, kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.zurt.f7l8
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.zurt$f7l8 r0 = (kotlinx.coroutines.flow.zurt.f7l8) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.zurt$f7l8 r0 = new kotlinx.coroutines.flow.zurt$f7l8
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.p r4 = (kotlinx.coroutines.flow.InterfaceC6618p) r4
            kotlin.C6318m.n7h(r6)
            goto L43
        L35:
            kotlin.C6318m.n7h(r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlinx.coroutines.flow.internal.k r5 = new kotlinx.coroutines.flow.internal.k
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.zurt.m24280g(kotlinx.coroutines.flow.p, java.lang.Object, kotlin.coroutines.q):java.lang.Object");
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final <T> InterfaceC6622s<T> m24282n(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super Boolean>, ? extends Object> interfaceC5979h) {
        return new C6657n(interfaceC6622s, interfaceC5979h);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final <T> InterfaceC6622s<T> m24283q(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, int i2) {
        if (i2 >= 0) {
            return new zy(interfaceC6622s, i2);
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.d2ok.mcp("Drop count should be non-negative, but had ", Integer.valueOf(i2)).toString());
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final <T, R> InterfaceC6622s<R> m24284s(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q @kotlin.toq cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T, ? super InterfaceC6216q<? super Boolean>, ? extends Object> cdjVar) {
        return kotlinx.coroutines.flow.ld6.tfm(new x2(interfaceC6622s, cdjVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object toq(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q cyoe.InterfaceC5979h<? super T, ? super kotlin.coroutines.InterfaceC6216q<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.zurt.C6655k
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.zurt$k r0 = (kotlinx.coroutines.flow.zurt.C6655k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.zurt$k r0 = new kotlinx.coroutines.flow.zurt$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.zurt$toq r4 = (kotlinx.coroutines.flow.zurt.toq) r4
            kotlin.C6318m.n7h(r6)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.C6318m.n7h(r6)
            kotlinx.coroutines.flow.zurt$toq r6 = new kotlinx.coroutines.flow.zurt$toq
            r6.<init>(r5)
            r0.L$0 = r6     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L4a
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L4a
            java.lang.Object r4 = r4.mo5262k(r6, r0)     // Catch: kotlinx.coroutines.flow.internal.C6581k -> L4a
            if (r4 != r1) goto L4f
            return r1
        L4a:
            r5 = move-exception
            r4 = r6
        L4c:
            kotlinx.coroutines.flow.internal.cdj.toq(r5, r4)
        L4f:
            kotlin.was r4 = kotlin.was.f36763k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.zurt.toq(kotlinx.coroutines.flow.s, cyoe.h, kotlin.coroutines.q):java.lang.Object");
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final <T> InterfaceC6622s<T> m24285y(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super Boolean>, ? extends Object> interfaceC5979h) {
        return new C6658p(interfaceC6622s, interfaceC5979h);
    }

    private static final <T> Object zy(InterfaceC6622s<? extends T> interfaceC6622s, InterfaceC5979h<? super T, ? super InterfaceC6216q<? super Boolean>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super was> interfaceC6216q) {
        toq toqVar = new toq(interfaceC5979h);
        try {
            kotlin.jvm.internal.d3.m23089n(0);
            interfaceC6622s.mo5262k(toqVar, interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(1);
        } catch (C6581k e2) {
            kotlinx.coroutines.flow.internal.cdj.toq(e2, toqVar);
        }
        return was.f36763k;
    }
}

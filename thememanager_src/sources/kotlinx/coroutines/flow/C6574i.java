package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.i1;
import kotlin.nn86;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.i */
/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\u001au\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001au\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001aU\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001al\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000e\u001aU\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0010\u0010\u0018\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0004H\u0000\u001as\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/s;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/p;", "Lkotlin/c;", "name", "value", "Lkotlin/coroutines/q;", "Lkotlin/was;", "", "Lkotlin/fn3e;", "transform", "f7l8", "(Lkotlinx/coroutines/flow/s;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlin/Function2;", "action", C7704k.y.toq.f95579toq, "(Lkotlinx/coroutines/flow/s;Lcyoe/h;)Lkotlinx/coroutines/flow/s;", "", "cause", "q", "n", "toq", "zy", "(Lkotlinx/coroutines/flow/p;Lcyoe/cdj;Ljava/lang/Throwable;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class C6574i {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$f7l8 */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class f7l8<R> implements InterfaceC6622s<R> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f36967k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.cdj f36968q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$f7l8$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class k extends AbstractC6209q {
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
                return f7l8.this.mo5262k(null, this);
            }
        }

        public f7l8(InterfaceC6622s interfaceC6622s, cyoe.cdj cdjVar) {
            this.f36967k = interfaceC6622s;
            this.f36968q = cdjVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            Object objMo5262k = this.f36967k.mo5262k(new y(this.f36968q, interfaceC6618p), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public Object m24118y(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new k(interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            InterfaceC6622s interfaceC6622s = this.f36967k;
            y yVar = new y(this.f36968q, interfaceC6618p);
            kotlin.jvm.internal.d3.m23089n(0);
            interfaceC6622s.mo5262k(yVar, interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$g */
    /* JADX INFO: compiled from: Emitters.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", m22756f = "Emitters.kt", m22757i = {}, m22758l = {40}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class g<R> extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super R>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6622s<T> $this_transform;
        final /* synthetic */ cyoe.cdj<InterfaceC6618p<? super R>, T, InterfaceC6216q<? super was>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$g$k */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ cyoe.cdj<InterfaceC6618p<? super R>, T, InterfaceC6216q<? super was>, Object> f36969k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ InterfaceC6618p<R> f36970q;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$g$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", m22756f = "Emitters.kt", m22757i = {}, m22758l = {42}, m22759m = "emit", m22760n = {}, m22761s = {})
            @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
            public static final class C8072k extends AbstractC6209q {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ k<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C8072k(k<? super T> kVar, InterfaceC6216q<? super C8072k> interfaceC6216q) {
                    super(interfaceC6216q);
                    this.this$0 = kVar;
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
            public k(cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, InterfaceC6618p<? super R> interfaceC6618p) {
                this.f36969k = cdjVar;
                this.f36970q = interfaceC6618p;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlinx.coroutines.flow.InterfaceC6618p
            @mub.InterfaceC7395n
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6574i.g.k.C8072k
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.i$g$k$k r0 = (kotlinx.coroutines.flow.C6574i.g.k.C8072k) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.i$g$k$k r0 = new kotlinx.coroutines.flow.i$g$k$k
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C6318m.n7h(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C6318m.n7h(r6)
                    cyoe.cdj<kotlinx.coroutines.flow.p<? super R>, T, kotlin.coroutines.q<? super kotlin.was>, java.lang.Object> r6 = r4.f36969k
                    kotlinx.coroutines.flow.p<R> r2 = r4.f36970q
                    r0.label = r3
                    java.lang.Object r5 = r6.invoke(r2, r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    kotlin.was r5 = kotlin.was.f36763k
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6574i.g.k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @InterfaceC7395n
            /* JADX INFO: renamed from: k */
            public final Object m24119k(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
                kotlin.jvm.internal.d3.m23089n(4);
                new C8072k(this, interfaceC6216q);
                kotlin.jvm.internal.d3.m23089n(5);
                this.f36969k.invoke((InterfaceC6618p<? super R>) this.f36970q, t2, interfaceC6216q);
                return was.f36763k;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(InterfaceC6622s<? extends T> interfaceC6622s, cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, InterfaceC6216q<? super g> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_transform = interfaceC6622s;
            this.$transform = cdjVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            g gVar = new g(this.$this_transform, this.$transform, interfaceC6216q);
            gVar.L$0 = obj;
            return gVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((g) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.q to kotlinx.coroutines.flow.i$g<R> for r5v1 'this'  kotlin.coroutines.q
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
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.C6318m.n7h(r6)
                goto L30
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.C6318m.n7h(r6)
                java.lang.Object r6 = r5.L$0
                kotlinx.coroutines.flow.p r6 = (kotlinx.coroutines.flow.InterfaceC6618p) r6
                kotlinx.coroutines.flow.s<T> r1 = r5.$this_transform
                kotlinx.coroutines.flow.i$g$k r3 = new kotlinx.coroutines.flow.i$g$k
                cyoe.cdj<kotlinx.coroutines.flow.p<? super R>, T, kotlin.coroutines.q<? super kotlin.was>, java.lang.Object> r4 = r5.$transform
                r3.<init>(r4, r6)
                r5.label = r2
                java.lang.Object r6 = r1.mo5262k(r3, r5)
                if (r6 != r0) goto L30
                return r0
            L30:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6574i.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.q to kotlinx.coroutines.flow.i$g<R> for r3v1 'this'  kotlin.coroutines.q
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @mub.InterfaceC7395n
        public final java.lang.Object invokeSuspend$$forInline(@mub.InterfaceC7396q java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r4 = r3.L$0
                kotlinx.coroutines.flow.p r4 = (kotlinx.coroutines.flow.InterfaceC6618p) r4
                kotlinx.coroutines.flow.s<T> r0 = r3.$this_transform
                kotlinx.coroutines.flow.i$g$k r1 = new kotlinx.coroutines.flow.i$g$k
                cyoe.cdj<kotlinx.coroutines.flow.p<? super R>, T, kotlin.coroutines.q<? super kotlin.was>, java.lang.Object> r2 = r3.$transform
                r1.<init>(r2, r4)
                r4 = 0
                kotlin.jvm.internal.d3.m23089n(r4)
                r0.mo5262k(r1, r3)
                r4 = 1
                kotlin.jvm.internal.d3.m23089n(r4)
                kotlin.was r4 = kotlin.was.f36763k
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6574i.g.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$k */
    /* JADX INFO: compiled from: Emitters.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", m22756f = "Emitters.kt", m22757i = {0}, m22758l = {216}, m22759m = "invokeSafely$FlowKt__EmittersKt", m22760n = {"cause"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class k<T> extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        k(InterfaceC6216q<? super k> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C6574i.zy(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$n */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class n<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5979h f36971k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC6622s f36972q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$n$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", m22756f = "Emitters.kt", m22757i = {0, 0, 0}, m22758l = {116, 120}, m22759m = "collect", m22760n = {"this", "$this$onStart_u24lambda_u2d1", "safeCollector"}, m22761s = {"L$0", "L$1", "L$2"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class k extends AbstractC6209q {
            Object L$0;
            Object L$1;
            Object L$2;
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
                return n.this.mo5262k(null, this);
            }
        }

        public n(InterfaceC5979h interfaceC5979h, InterfaceC6622s interfaceC6622s) {
            this.f36971k = interfaceC5979h;
            this.f36972q = interfaceC6622s;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super T> r7, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.C6574i.n.k
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.i$n$k r0 = (kotlinx.coroutines.flow.C6574i.n.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.i$n$k r0 = new kotlinx.coroutines.flow.i$n$k
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C6318m.n7h(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.L$2
                kotlinx.coroutines.flow.internal.zurt r7 = (kotlinx.coroutines.flow.internal.zurt) r7
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.flow.p r2 = (kotlinx.coroutines.flow.InterfaceC6618p) r2
                java.lang.Object r4 = r0.L$0
                kotlinx.coroutines.flow.i$n r4 = (kotlinx.coroutines.flow.C6574i.n) r4
                kotlin.C6318m.n7h(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                kotlin.C6318m.n7h(r8)
                kotlinx.coroutines.flow.internal.zurt r8 = new kotlinx.coroutines.flow.internal.zurt
                kotlin.coroutines.f7l8 r2 = r0.getContext()
                r8.<init>(r7, r2)
                cyoe.h r2 = r6.f36971k     // Catch: java.lang.Throwable -> L86
                r0.L$0 = r6     // Catch: java.lang.Throwable -> L86
                r0.L$1 = r7     // Catch: java.lang.Throwable -> L86
                r0.L$2 = r8     // Catch: java.lang.Throwable -> L86
                r0.label = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.d3.m23089n(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.d3.m23089n(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                kotlinx.coroutines.flow.s r7 = r4.f36972q
                r8 = 0
                r0.L$0 = r8
                r0.L$1 = r8
                r0.L$2 = r8
                r0.label = r3
                java.lang.Object r7 = r7.mo5262k(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                kotlin.was r7 = kotlin.was.f36763k
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6574i.n.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$q */
    /* JADX INFO: compiled from: Emitters.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "it", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class q<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6295k f36973k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC6618p<T> f36974q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$q$k */
        /* JADX INFO: compiled from: Emitters.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", m22756f = "Emitters.kt", m22757i = {}, m22758l = {185}, m22759m = "emit", m22760n = {}, m22761s = {})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ q<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(q<? super T> qVar, InterfaceC6216q<? super k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = qVar;
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
        q(i1.C6295k c6295k, InterfaceC6618p<? super T> interfaceC6618p) {
            this.f36973k = c6295k;
            this.f36974q = interfaceC6618p;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6574i.q.k
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.i$q$k r0 = (kotlinx.coroutines.flow.C6574i.q.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.i$q$k r0 = new kotlinx.coroutines.flow.i$q$k
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C6318m.n7h(r6)
                goto L44
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C6318m.n7h(r6)
                kotlin.jvm.internal.i1$k r6 = r4.f36973k
                r2 = 0
                r6.element = r2
                kotlinx.coroutines.flow.p<T> r6 = r4.f36974q
                r0.label = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                kotlin.was r5 = kotlin.was.f36763k
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6574i.q.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$toq */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f36975k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.cdj f36976q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$toq$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m22756f = "Emitters.kt", m22757i = {0, 0, 1, 2}, m22758l = {114, 121, 128}, m22759m = "collect", m22760n = {"this", "$this$onCompletion_u24lambda_u2d2", "e", "sc"}, m22761s = {"L$0", "L$1", "L$0", "L$0"})
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
                return toq.this.mo5262k(null, this);
            }
        }

        public toq(InterfaceC6622s interfaceC6622s, cyoe.cdj cdjVar) {
            this.f36975k = interfaceC6622s;
            this.f36976q = cdjVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super T> r9, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.C6574i.toq.k
                if (r0 == 0) goto L13
                r0 = r10
                kotlinx.coroutines.flow.i$toq$k r0 = (kotlinx.coroutines.flow.C6574i.toq.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.i$toq$k r0 = new kotlinx.coroutines.flow.i$toq$k
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.L$0
                kotlinx.coroutines.flow.internal.zurt r9 = (kotlinx.coroutines.flow.internal.zurt) r9
                kotlin.C6318m.n7h(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.L$0
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                kotlin.C6318m.n7h(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.L$1
                kotlinx.coroutines.flow.p r9 = (kotlinx.coroutines.flow.InterfaceC6618p) r9
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.i$toq r2 = (kotlinx.coroutines.flow.C6574i.toq) r2
                kotlin.C6318m.n7h(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                kotlin.C6318m.n7h(r10)
                kotlinx.coroutines.flow.s r10 = r8.f36975k     // Catch: java.lang.Throwable -> L96
                r0.L$0 = r8     // Catch: java.lang.Throwable -> L96
                r0.L$1 = r9     // Catch: java.lang.Throwable -> L96
                r0.label = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.mo5262k(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                kotlinx.coroutines.flow.internal.zurt r10 = new kotlinx.coroutines.flow.internal.zurt
                kotlin.coroutines.f7l8 r4 = r0.getContext()
                r10.<init>(r9, r4)
                cyoe.cdj r9 = r2.f36976q     // Catch: java.lang.Throwable -> L8e
                r0.L$0 = r10     // Catch: java.lang.Throwable -> L8e
                r0.L$1 = r6     // Catch: java.lang.Throwable -> L8e
                r0.label = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                kotlin.jvm.internal.d3.m23089n(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                kotlin.jvm.internal.d3.m23089n(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                kotlin.was r9 = kotlin.was.f36763k
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                kotlinx.coroutines.flow.e r10 = new kotlinx.coroutines.flow.e
                r10.<init>(r9)
                cyoe.cdj r2 = r2.f36976q
                r0.L$0 = r9
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r10 = kotlinx.coroutines.flow.C6574i.m24114k(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6574i.toq.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$y */
    /* JADX INFO: compiled from: Emitters.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class y<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.cdj<InterfaceC6618p<? super R>, T, InterfaceC6216q<? super was>, Object> f36977k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC6618p<R> f36978q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$y$k */
        /* JADX INFO: compiled from: Emitters.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", m22756f = "Emitters.kt", m22757i = {}, m22758l = {53}, m22759m = "emit", m22760n = {}, m22761s = {})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ y<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public k(y<? super T> yVar, InterfaceC6216q<? super k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = yVar;
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
        public y(cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, InterfaceC6618p<? super R> interfaceC6618p) {
            this.f36977k = cdjVar;
            this.f36978q = interfaceC6618p;
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
        public final java.lang.Object emit(T r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6574i.y.k
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.i$y$k r0 = (kotlinx.coroutines.flow.C6574i.y.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.i$y$k r0 = new kotlinx.coroutines.flow.i$y$k
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C6318m.n7h(r6)
                goto L41
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C6318m.n7h(r6)
                cyoe.cdj<kotlinx.coroutines.flow.p<? super R>, T, kotlin.coroutines.q<? super kotlin.was>, java.lang.Object> r6 = r4.f36977k
                kotlinx.coroutines.flow.p<R> r2 = r4.f36978q
                r0.label = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                kotlin.was r5 = kotlin.was.f36763k
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6574i.y.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
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
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final Object m24120k(T t2, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new k(this, interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            this.f36977k.invoke(this.f36978q, t2, interfaceC6216q);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$zy */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class zy<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f36979k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h f36980q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.i$zy$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", m22756f = "Emitters.kt", m22757i = {0, 0, 0, 1}, m22758l = {114, 122}, m22759m = "collect", m22760n = {"this", "$this$onEmpty_u24lambda_u2d3", "isEmpty", "collector"}, m22761s = {"L$0", "L$1", "L$2", "L$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class k extends AbstractC6209q {
            Object L$0;
            Object L$1;
            Object L$2;
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
                return zy.this.mo5262k(null, this);
            }
        }

        public zy(InterfaceC6622s interfaceC6622s, InterfaceC5979h interfaceC5979h) {
            this.f36979k = interfaceC6622s;
            this.f36980q = interfaceC5979h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.flow.p] */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.flow.p, kotlinx.coroutines.flow.p<? super T>] */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.internal.zurt] */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.flow.internal.zurt] */
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
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.C6574i.zy.k
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.i$zy$k r0 = (kotlinx.coroutines.flow.C6574i.zy.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.i$zy$k r0 = new kotlinx.coroutines.flow.i$zy$k
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4a
                if (r2 == r4) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.flow.internal.zurt r7 = (kotlinx.coroutines.flow.internal.zurt) r7
                kotlin.C6318m.n7h(r8)     // Catch: java.lang.Throwable -> L30
                goto L94
            L30:
                r8 = move-exception
                goto L98
            L32:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3a:
                java.lang.Object r7 = r0.L$2
                kotlin.jvm.internal.i1$k r7 = (kotlin.jvm.internal.i1.C6295k) r7
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.flow.p r2 = (kotlinx.coroutines.flow.InterfaceC6618p) r2
                java.lang.Object r4 = r0.L$0
                kotlinx.coroutines.flow.i$zy r4 = (kotlinx.coroutines.flow.C6574i.zy) r4
                kotlin.C6318m.n7h(r8)
                goto L6d
            L4a:
                kotlin.C6318m.n7h(r8)
                kotlin.jvm.internal.i1$k r8 = new kotlin.jvm.internal.i1$k
                r8.<init>()
                r8.element = r4
                kotlinx.coroutines.flow.s r2 = r6.f36979k
                kotlinx.coroutines.flow.i$q r5 = new kotlinx.coroutines.flow.i$q
                r5.<init>(r8, r7)
                r0.L$0 = r6
                r0.L$1 = r7
                r0.L$2 = r8
                r0.label = r4
                java.lang.Object r2 = r2.mo5262k(r5, r0)
                if (r2 != r1) goto L6a
                return r1
            L6a:
                r4 = r6
                r2 = r7
                r7 = r8
            L6d:
                boolean r7 = r7.element
                if (r7 == 0) goto L9c
                kotlinx.coroutines.flow.internal.zurt r7 = new kotlinx.coroutines.flow.internal.zurt
                kotlin.coroutines.f7l8 r8 = r0.getContext()
                r7.<init>(r2, r8)
                cyoe.h r8 = r4.f36980q     // Catch: java.lang.Throwable -> L30
                r0.L$0 = r7     // Catch: java.lang.Throwable -> L30
                r2 = 0
                r0.L$1 = r2     // Catch: java.lang.Throwable -> L30
                r0.L$2 = r2     // Catch: java.lang.Throwable -> L30
                r0.label = r3     // Catch: java.lang.Throwable -> L30
                r2 = 6
                kotlin.jvm.internal.d3.m23089n(r2)     // Catch: java.lang.Throwable -> L30
                java.lang.Object r8 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L30
                r0 = 7
                kotlin.jvm.internal.d3.m23089n(r0)     // Catch: java.lang.Throwable -> L30
                if (r8 != r1) goto L94
                return r1
            L94:
                r7.releaseIntercepted()
                goto L9c
            L98:
                r7.releaseIntercepted()
                throw r8
            L9c:
                kotlin.was r7 = kotlin.was.f36763k
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6574i.zy.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    @InterfaceC7396q
    public static final <T, R> InterfaceC6622s<R> f7l8(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q @kotlin.toq cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar) {
        return ld6.tfm(new g(interfaceC6622s, cdjVar, null));
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final <T> InterfaceC6622s<T> m24113g(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6618p<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        return new n(interfaceC5979h, interfaceC6622s);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final <T> InterfaceC6622s<T> m24115n(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super InterfaceC6618p<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        return new zy(interfaceC6622s, interfaceC5979h);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final <T> InterfaceC6622s<T> m24116q(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q cyoe.cdj<? super InterfaceC6618p<? super T>, ? super Throwable, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar) {
        return new toq(interfaceC6622s, cdjVar);
    }

    public static final void toq(@InterfaceC7396q InterfaceC6618p<?> interfaceC6618p) {
        if (interfaceC6618p instanceof C6561e) {
            throw ((C6561e) interfaceC6618p).f36948k;
        }
    }

    @nn86
    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final <T, R> InterfaceC6622s<R> m24117y(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q @kotlin.toq cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar) {
        return new f7l8(interfaceC6622s, cdjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object zy(kotlinx.coroutines.flow.InterfaceC6618p<? super T> r4, cyoe.cdj<? super kotlinx.coroutines.flow.InterfaceC6618p<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.InterfaceC6216q<? super kotlin.was>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.C6574i.k
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.i$k r0 = (kotlinx.coroutines.flow.C6574i.k) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.i$k r0 = new kotlinx.coroutines.flow.i$k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.C6318m.n7h(r7)     // Catch: java.lang.Throwable -> L47
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.C6318m.n7h(r7)
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L47
            r0.label = r3     // Catch: java.lang.Throwable -> L47
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L47
            if (r4 != r1) goto L44
            return r1
        L44:
            kotlin.was r4 = kotlin.was.f36763k
            return r4
        L47:
            r4 = move-exception
            if (r6 == 0) goto L4f
            if (r6 == r4) goto L4f
            kotlin.kja0.m23173k(r4, r6)
        L4f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6574i.zy(kotlinx.coroutines.flow.p, cyoe.cdj, java.lang.Throwable, kotlin.coroutines.q):java.lang.Object");
    }
}

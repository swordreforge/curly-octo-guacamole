package kotlinx.coroutines.flow;

import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.exifinterface.media.C0846k;
import com.miui.clock.module.toq;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.C6211y;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.i1;
import kotlin.time.C6467n;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.channels.ki;
import kotlinx.coroutines.ek5k;
import kotlinx.coroutines.flow.internal.C6579h;
import kotlinx.coroutines.internal.C6679l;
import kotlinx.coroutines.mu;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a2\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0007\u001a3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00020\u0002H\u0007\u001a$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002H\u0000\u001a3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "", "timeoutMillis", "k", "Lkotlin/Function1;", "toq", "Lkotlin/time/n;", "timeout", "zy", "(Lkotlinx/coroutines/flow/s;J)Lkotlinx/coroutines/flow/s;", "q", "(Lkotlinx/coroutines/flow/s;Lcyoe/x2;)Lkotlinx/coroutines/flow/s;", "timeoutMillisSelector", "n", "periodMillis", AnimatedProperty.PROPERTY_NAME_Y, "Lkotlinx/coroutines/f;", "delayMillis", "initialDelayMillis", "Lkotlinx/coroutines/channels/d3;", "Lkotlin/was;", C7704k.y.toq.f95579toq, zurt.zy.f47503ncyb, C7704k.y.toq.f44691k, "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class ki {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.ki$k */
    /* JADX INFO: compiled from: Delay.kt */
    @kotlin.d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", C0846k.zaso, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Long;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C6598k<T> extends AbstractC6308r implements cyoe.x2<T, Long> {
        final /* synthetic */ long $timeoutMillis;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6598k(long j2) {
            super(1);
            this.$timeoutMillis = j2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.x2
        @InterfaceC7396q
        public final Long invoke(T t2) {
            return Long.valueOf(this.$timeoutMillis);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.ki$n */
    /* JADX INFO: compiled from: Delay.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", m22756f = "Delay.kt", m22757i = {0, 0, 0, 0}, m22758l = {352}, m22759m = "invokeSuspend", m22760n = {"downstream", "values", "lastValue", "ticker"}, m22761s = {"L$0", "L$1", "L$2", "L$3"})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/f;", "Lkotlinx/coroutines/flow/p;", "downstream", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6599n<T> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6556f, InterfaceC6618p<? super T>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ long $periodMillis;
        final /* synthetic */ InterfaceC6622s<T> $this_sample;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.ki$n$k */
        /* JADX INFO: compiled from: Delay.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", m22756f = "Delay.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/channels/ki;", "", "result", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<kotlinx.coroutines.channels.ki<? extends Object>, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ i1.C6299y<Object> $lastValue;
            final /* synthetic */ kotlinx.coroutines.channels.d3<was> $ticker;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(i1.C6299y<Object> c6299y, kotlinx.coroutines.channels.d3<was> d3Var, InterfaceC6216q<? super k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$lastValue = c6299y;
                this.$ticker = d3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                k kVar = new k(this.$lastValue, this.$ticker, interfaceC6216q);
                kVar.L$0 = obj;
                return kVar;
            }

            @Override // cyoe.InterfaceC5979h
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.ki<? extends Object> kiVar, InterfaceC6216q<? super was> interfaceC6216q) {
                return m28294invokeWpGqRn0(kiVar.kja0(), interfaceC6216q);
            }

            @InterfaceC7395n
            /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
            public final Object m28294invokeWpGqRn0(@InterfaceC7396q Object obj, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((k) create(kotlinx.coroutines.channels.ki.toq(obj), interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
                C6199q.x2();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
                T t2 = (T) ((kotlinx.coroutines.channels.ki) this.L$0).kja0();
                i1.C6299y<Object> c6299y = this.$lastValue;
                boolean z2 = t2 instanceof ki.zy;
                if (!z2) {
                    c6299y.element = t2;
                }
                kotlinx.coroutines.channels.d3<was> d3Var = this.$ticker;
                if (z2) {
                    Throwable thM23911g = kotlinx.coroutines.channels.ki.m23911g(t2);
                    if (thM23911g != null) {
                        throw thM23911g;
                    }
                    d3Var.mo23862q(new kotlinx.coroutines.flow.internal.x2());
                    c6299y.element = (T) kotlinx.coroutines.flow.internal.fn3e.f81992zy;
                }
                return was.f36763k;
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.ki$n$toq */
        /* JADX INFO: compiled from: Delay.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", m22756f = "Delay.kt", m22757i = {}, m22758l = {300}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlin/was;", "it", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<was, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ InterfaceC6618p<T> $downstream;
            final /* synthetic */ i1.C6299y<Object> $lastValue;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            toq(i1.C6299y<Object> c6299y, InterfaceC6618p<? super T> interfaceC6618p, InterfaceC6216q<? super toq> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$lastValue = c6299y;
                this.$downstream = interfaceC6618p;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new toq(this.$lastValue, this.$downstream, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q was wasVar, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((toq) create(wasVar, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.q to kotlinx.coroutines.flow.ki$n$toq for r5v1 'this'  kotlin.coroutines.q
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
                    goto L36
                Lf:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L17:
                    kotlin.C6318m.n7h(r6)
                    kotlin.jvm.internal.i1$y<java.lang.Object> r6 = r5.$lastValue
                    T r1 = r6.element
                    if (r1 != 0) goto L23
                    kotlin.was r6 = kotlin.was.f36763k
                    return r6
                L23:
                    r3 = 0
                    r6.element = r3
                    kotlinx.coroutines.flow.p<T> r6 = r5.$downstream
                    kotlinx.coroutines.internal.l r4 = kotlinx.coroutines.flow.internal.fn3e.f36987k
                    if (r1 != r4) goto L2d
                    r1 = r3
                L2d:
                    r5.label = r2
                    java.lang.Object r6 = r6.emit(r1, r5)
                    if (r6 != r0) goto L36
                    return r0
                L36:
                    kotlin.was r6 = kotlin.was.f36763k
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.ki.C6599n.toq.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.ki$n$zy */
        /* JADX INFO: compiled from: Delay.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", m22756f = "Delay.kt", m22757i = {}, m22758l = {gcp.f7l8.f77018f7l8}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/channels/jp0y;", "", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class zy extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<kotlinx.coroutines.channels.jp0y<? super Object>, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ InterfaceC6622s<T> $this_sample;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.ki$n$zy$k */
            /* JADX INFO: compiled from: Delay.kt */
            @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
            static final class k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ kotlinx.coroutines.channels.jp0y<Object> f37030k;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.ki$n$zy$k$k, reason: collision with other inner class name */
                /* JADX INFO: compiled from: Delay.kt */
                @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", m22756f = "Delay.kt", m22757i = {}, m22758l = {gcp.f7l8.f77018f7l8}, m22759m = "emit", m22760n = {}, m22761s = {})
                @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
                static final class C8079k extends AbstractC6209q {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ k<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C8079k(k<? super T> kVar, InterfaceC6216q<? super C8079k> interfaceC6216q) {
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

                k(kotlinx.coroutines.channels.jp0y<Object> jp0yVar) {
                    this.f37030k = jp0yVar;
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
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.ki.C6599n.zy.k.C8079k
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.ki$n$zy$k$k r0 = (kotlinx.coroutines.flow.ki.C6599n.zy.k.C8079k) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.ki$n$zy$k$k r0 = new kotlinx.coroutines.flow.ki$n$zy$k$k
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C6318m.n7h(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C6318m.n7h(r6)
                        kotlinx.coroutines.channels.jp0y<java.lang.Object> r6 = r4.f37030k
                        if (r5 != 0) goto L3a
                        kotlinx.coroutines.internal.l r5 = kotlinx.coroutines.flow.internal.fn3e.f36987k
                    L3a:
                        r0.label = r3
                        java.lang.Object r5 = r6.d3(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.was r5 = kotlin.was.f36763k
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.ki.C6599n.zy.k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            zy(InterfaceC6622s<? extends T> interfaceC6622s, InterfaceC6216q<? super zy> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$this_sample = interfaceC6622s;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                zy zyVar = new zy(this.$this_sample, interfaceC6216q);
                zyVar.L$0 = obj;
                return zyVar;
            }

            @Override // cyoe.InterfaceC5979h
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.jp0y<? super Object> jp0yVar, InterfaceC6216q<? super was> interfaceC6216q) {
                return invoke2((kotlinx.coroutines.channels.jp0y<Object>) jp0yVar, interfaceC6216q);
            }

            @InterfaceC7395n
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@InterfaceC7396q kotlinx.coroutines.channels.jp0y<Object> jp0yVar, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((zy) create(jp0yVar, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    kotlinx.coroutines.channels.jp0y jp0yVar = (kotlinx.coroutines.channels.jp0y) this.L$0;
                    InterfaceC6622s<T> interfaceC6622s = this.$this_sample;
                    k kVar = new k(jp0yVar);
                    this.label = 1;
                    if (interfaceC6622s.mo5262k(kVar, this) == objX2) {
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
        C6599n(long j2, InterfaceC6622s<? extends T> interfaceC6622s, InterfaceC6216q<? super C6599n> interfaceC6216q) {
            super(3, interfaceC6216q);
            this.$periodMillis = j2;
            this.$this_sample = interfaceC6622s;
        }

        @Override // cyoe.cdj
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            C6599n c6599n = new C6599n(this.$periodMillis, this.$this_sample, interfaceC6216q);
            c6599n.L$0 = interfaceC6556f;
            c6599n.L$1 = interfaceC6618p;
            return c6599n.invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            InterfaceC6618p interfaceC6618p;
            kotlinx.coroutines.channels.d3 d3Var;
            i1.C6299y c6299y;
            kotlinx.coroutines.channels.d3 d3VarF7l8;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6556f interfaceC6556f = (InterfaceC6556f) this.L$0;
                InterfaceC6618p interfaceC6618p2 = (InterfaceC6618p) this.L$1;
                kotlinx.coroutines.channels.d3 d3VarM23850g = kotlinx.coroutines.channels.a9.m23850g(interfaceC6556f, null, -1, new zy(this.$this_sample, null), 1, null);
                i1.C6299y c6299y2 = new i1.C6299y();
                interfaceC6618p = interfaceC6618p2;
                d3Var = d3VarM23850g;
                c6299y = c6299y2;
                d3VarF7l8 = ki.f7l8(interfaceC6556f, this.$periodMillis, 0L, 2, null);
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d3VarF7l8 = (kotlinx.coroutines.channels.d3) this.L$3;
                c6299y = (i1.C6299y) this.L$2;
                d3Var = (kotlinx.coroutines.channels.d3) this.L$1;
                interfaceC6618p = (InterfaceC6618p) this.L$0;
                C6318m.n7h(obj);
            }
            while (c6299y.element != kotlinx.coroutines.flow.internal.fn3e.f81992zy) {
                this.L$0 = interfaceC6618p;
                this.L$1 = d3Var;
                this.L$2 = c6299y;
                this.L$3 = d3VarF7l8;
                this.label = 1;
                kotlinx.coroutines.selects.toq toqVar = new kotlinx.coroutines.selects.toq(this);
                try {
                    toqVar.fn3e(d3Var.fn3e(), new k(c6299y, d3VarF7l8, null));
                    toqVar.fn3e(d3VarF7l8.t8r(), new toq(c6299y, interfaceC6618p, null));
                } catch (Throwable th) {
                    toqVar.nmn5(th);
                }
                Object objCh = toqVar.ch();
                if (objCh == C6199q.x2()) {
                    C6211y.zy(this);
                }
                if (objCh == objX2) {
                    return objX2;
                }
            }
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.ki$q */
    /* JADX INFO: compiled from: Delay.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", m22756f = "Delay.kt", m22757i = {0, 1, 2}, m22758l = {314, zurt.InterfaceC0290k.f47401cdj, zurt.InterfaceC0290k.f47413ki}, m22759m = "invokeSuspend", m22760n = {"$this$produce", "$this$produce", "$this$produce"}, m22761s = {"L$0", "L$0", "L$0"})
    @kotlin.d3(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/jp0y;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6600q extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<kotlinx.coroutines.channels.jp0y<? super was>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ long $delayMillis;
        final /* synthetic */ long $initialDelayMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6600q(long j2, long j3, InterfaceC6216q<? super C6600q> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$initialDelayMillis = j2;
            this.$delayMillis = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C6600q c6600q = new C6600q(this.$initialDelayMillis, this.$delayMillis, interfaceC6216q);
            c6600q.L$0 = obj;
            return c6600q;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q kotlinx.coroutines.channels.jp0y<? super was> jp0yVar, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C6600q) create(jp0yVar, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:15:0x0040). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L11
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
            L11:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.channels.jp0y r1 = (kotlinx.coroutines.channels.jp0y) r1
                kotlin.C6318m.n7h(r8)
                goto L3f
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.channels.jp0y r1 = (kotlinx.coroutines.channels.jp0y) r1
                kotlin.C6318m.n7h(r8)
                r8 = r7
                goto L51
            L2a:
                kotlin.C6318m.n7h(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                kotlinx.coroutines.channels.jp0y r1 = (kotlinx.coroutines.channels.jp0y) r1
                long r5 = r7.$initialDelayMillis
                r7.L$0 = r1
                r7.label = r4
                java.lang.Object r8 = kotlinx.coroutines.ek5k.toq(r5, r7)
                if (r8 != r0) goto L3f
                return r0
            L3f:
                r8 = r7
            L40:
                kotlinx.coroutines.channels.lvui r4 = r1.zy()
                kotlin.was r5 = kotlin.was.f36763k
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r4 = r4.d3(r5, r8)
                if (r4 != r0) goto L51
                return r0
            L51:
                long r4 = r8.$delayMillis
                r8.L$0 = r1
                r8.label = r2
                java.lang.Object r4 = kotlinx.coroutines.ek5k.toq(r4, r8)
                if (r4 != r0) goto L40
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.ki.C6600q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Delay.kt */
    @kotlin.d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", C0846k.zaso, "emittedItem", "invoke", "(Ljava/lang/Object;)Ljava/lang/Long;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class toq<T> extends AbstractC6308r implements cyoe.x2<T, Long> {
        final /* synthetic */ cyoe.x2<T, C6467n> $timeout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        toq(cyoe.x2<? super T, C6467n> x2Var) {
            super(1);
            this.$timeout = x2Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.x2
        @InterfaceC7396q
        public final Long invoke(T t2) {
            return Long.valueOf(ek5k.m24044n(this.$timeout.invoke(t2).xwq3()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Delay.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m22756f = "Delay.kt", m22757i = {0, 0, 0, 0, 1, 1, 1, 1}, m22758l = {222, 355}, m22759m = "invokeSuspend", m22760n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue", "timeoutMillis"}, m22761s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/f;", "Lkotlinx/coroutines/flow/p;", "downstream", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class zy<T> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6556f, InterfaceC6618p<? super T>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6622s<T> $this_debounceInternal;
        final /* synthetic */ cyoe.x2<T, Long> $timeoutMillisSelector;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.ki$zy$k */
        /* JADX INFO: compiled from: Delay.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m22756f = "Delay.kt", m22757i = {}, m22758l = {233}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {C0846k.zaso, "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class C6601k extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.x2<InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ InterfaceC6618p<T> $downstream;
            final /* synthetic */ i1.C6299y<Object> $lastValue;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C6601k(InterfaceC6618p<? super T> interfaceC6618p, i1.C6299y<Object> c6299y, InterfaceC6216q<? super C6601k> interfaceC6216q) {
                super(1, interfaceC6216q);
                this.$downstream = interfaceC6618p;
                this.$lastValue = c6299y;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new C6601k(this.$downstream, this.$lastValue, interfaceC6216q);
            }

            @Override // cyoe.x2
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((C6601k) create(interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    InterfaceC6618p<T> interfaceC6618p = this.$downstream;
                    C6679l c6679l = kotlinx.coroutines.flow.internal.fn3e.f36987k;
                    T t2 = this.$lastValue.element;
                    if (t2 == c6679l) {
                        t2 = null;
                    }
                    this.label = 1;
                    if (interfaceC6618p.emit(t2, this) == objX2) {
                        return objX2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6318m.n7h(obj);
                }
                this.$lastValue.element = null;
                return was.f36763k;
            }
        }

        /* JADX INFO: compiled from: Delay.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m22756f = "Delay.kt", m22757i = {0}, m22758l = {243}, m22759m = "invokeSuspend", m22760n = {"$this$onFailure$iv"}, m22761s = {"L$0"})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/channels/ki;", "", "value", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<kotlinx.coroutines.channels.ki<? extends Object>, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ InterfaceC6618p<T> $downstream;
            final /* synthetic */ i1.C6299y<Object> $lastValue;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            toq(i1.C6299y<Object> c6299y, InterfaceC6618p<? super T> interfaceC6618p, InterfaceC6216q<? super toq> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$lastValue = c6299y;
                this.$downstream = interfaceC6618p;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                toq toqVar = new toq(this.$lastValue, this.$downstream, interfaceC6216q);
                toqVar.L$0 = obj;
                return toqVar;
            }

            @Override // cyoe.InterfaceC5979h
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.ki<? extends Object> kiVar, InterfaceC6216q<? super was> interfaceC6216q) {
                return m28295invokeWpGqRn0(kiVar.kja0(), interfaceC6216q);
            }

            @InterfaceC7395n
            /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
            public final Object m28295invokeWpGqRn0(@InterfaceC7396q Object obj, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((toq) create(kotlinx.coroutines.channels.ki.toq(obj), interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            /* JADX WARN: Type inference failed for: r7v6, types: [T, kotlinx.coroutines.internal.l] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.q to kotlinx.coroutines.flow.ki$zy$toq for r6v1 'this'  kotlin.coroutines.q
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @mub.InterfaceC7395n
            public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                    int r1 = r6.label
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r0 = r6.L$1
                    kotlin.jvm.internal.i1$y r0 = (kotlin.jvm.internal.i1.C6299y) r0
                    kotlin.C6318m.n7h(r7)
                    goto L4f
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    kotlin.C6318m.n7h(r7)
                    java.lang.Object r7 = r6.L$0
                    kotlinx.coroutines.channels.ki r7 = (kotlinx.coroutines.channels.ki) r7
                    java.lang.Object r7 = r7.kja0()
                    kotlin.jvm.internal.i1$y<java.lang.Object> r1 = r6.$lastValue
                    boolean r3 = r7 instanceof kotlinx.coroutines.channels.ki.zy
                    if (r3 != 0) goto L2e
                    r1.element = r7
                L2e:
                    kotlinx.coroutines.flow.p<T> r4 = r6.$downstream
                    if (r3 == 0) goto L56
                    java.lang.Throwable r3 = kotlinx.coroutines.channels.ki.m23911g(r7)
                    if (r3 != 0) goto L55
                    T r3 = r1.element
                    if (r3 == 0) goto L50
                    kotlinx.coroutines.internal.l r5 = kotlinx.coroutines.flow.internal.fn3e.f36987k
                    if (r3 != r5) goto L41
                    r3 = 0
                L41:
                    r6.L$0 = r7
                    r6.L$1 = r1
                    r6.label = r2
                    java.lang.Object r7 = r4.emit(r3, r6)
                    if (r7 != r0) goto L4e
                    return r0
                L4e:
                    r0 = r1
                L4f:
                    r1 = r0
                L50:
                    kotlinx.coroutines.internal.l r7 = kotlinx.coroutines.flow.internal.fn3e.f81992zy
                    r1.element = r7
                    goto L56
                L55:
                    throw r3
                L56:
                    kotlin.was r7 = kotlin.was.f36763k
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.ki.zy.toq.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.ki$zy$zy, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Delay.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", m22756f = "Delay.kt", m22757i = {}, m22758l = {toq.zy.f72004x2}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/channels/jp0y;", "", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class C8080zy extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<kotlinx.coroutines.channels.jp0y<? super Object>, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ InterfaceC6622s<T> $this_debounceInternal;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.ki$zy$zy$k */
            /* JADX INFO: compiled from: Delay.kt */
            @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
            static final class C6602k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ kotlinx.coroutines.channels.jp0y<Object> f37031k;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.ki$zy$zy$k$k */
                /* JADX INFO: compiled from: Delay.kt */
                @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", m22756f = "Delay.kt", m22757i = {}, m22758l = {toq.zy.f72004x2}, m22759m = "emit", m22760n = {}, m22761s = {})
                @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
                static final class k extends AbstractC6209q {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C6602k<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    k(C6602k<? super T> c6602k, InterfaceC6216q<? super k> interfaceC6216q) {
                        super(interfaceC6216q);
                        this.this$0 = c6602k;
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
                    @InterfaceC7395n
                    public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                C6602k(kotlinx.coroutines.channels.jp0y<Object> jp0yVar) {
                    this.f37031k = jp0yVar;
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
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.ki.zy.C8080zy.C6602k.k
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.ki$zy$zy$k$k r0 = (kotlinx.coroutines.flow.ki.zy.C8080zy.C6602k.k) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.ki$zy$zy$k$k r0 = new kotlinx.coroutines.flow.ki$zy$zy$k$k
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C6318m.n7h(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C6318m.n7h(r6)
                        kotlinx.coroutines.channels.jp0y<java.lang.Object> r6 = r4.f37031k
                        if (r5 != 0) goto L3a
                        kotlinx.coroutines.internal.l r5 = kotlinx.coroutines.flow.internal.fn3e.f36987k
                    L3a:
                        r0.label = r3
                        java.lang.Object r5 = r6.d3(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.was r5 = kotlin.was.f36763k
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.ki.zy.C8080zy.C6602k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C8080zy(InterfaceC6622s<? extends T> interfaceC6622s, InterfaceC6216q<? super C8080zy> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$this_debounceInternal = interfaceC6622s;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                C8080zy c8080zy = new C8080zy(this.$this_debounceInternal, interfaceC6216q);
                c8080zy.L$0 = obj;
                return c8080zy;
            }

            @Override // cyoe.InterfaceC5979h
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.jp0y<? super Object> jp0yVar, InterfaceC6216q<? super was> interfaceC6216q) {
                return invoke2((kotlinx.coroutines.channels.jp0y<Object>) jp0yVar, interfaceC6216q);
            }

            @InterfaceC7395n
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@InterfaceC7396q kotlinx.coroutines.channels.jp0y<Object> jp0yVar, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((C8080zy) create(jp0yVar, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                if (i2 == 0) {
                    C6318m.n7h(obj);
                    kotlinx.coroutines.channels.jp0y jp0yVar = (kotlinx.coroutines.channels.jp0y) this.L$0;
                    InterfaceC6622s<T> interfaceC6622s = this.$this_debounceInternal;
                    C6602k c6602k = new C6602k(jp0yVar);
                    this.label = 1;
                    if (interfaceC6622s.mo5262k(c6602k, this) == objX2) {
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
        zy(cyoe.x2<? super T, Long> x2Var, InterfaceC6622s<? extends T> interfaceC6622s, InterfaceC6216q<? super zy> interfaceC6216q) {
            super(3, interfaceC6216q);
            this.$timeoutMillisSelector = x2Var;
            this.$this_debounceInternal = interfaceC6622s;
        }

        @Override // cyoe.cdj
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            zy zyVar = new zy(this.$timeoutMillisSelector, this.$this_debounceInternal, interfaceC6216q);
            zyVar.L$0 = interfaceC6556f;
            zyVar.L$1 = interfaceC6618p;
            return zyVar.invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:9|31|32|35|51|36|(1:38)|39|43|(1:45)|(1:47)(1:48)) */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00f7, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
        
            r10.nmn5(r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e0 A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:36:0x00dc, B:38:0x00e0, B:39:0x00ea), top: B:51:0x00dc }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x010a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x010b -> B:11:0x006f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.ki.zy.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ kotlinx.coroutines.channels.d3 f7l8(InterfaceC6556f interfaceC6556f, long j2, long j3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j3 = j2;
        }
        return ld6.gyi(interfaceC6556f, j2, j3);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final kotlinx.coroutines.channels.d3<was> m24145g(@InterfaceC7396q InterfaceC6556f interfaceC6556f, long j2, long j3) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j2 + " ms").toString());
        }
        if (j3 >= 0) {
            return kotlinx.coroutines.channels.a9.m23850g(interfaceC6556f, null, 0, new C6600q(j3, j2, null), 1, null);
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j3 + " ms").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    @mu
    /* JADX INFO: renamed from: k */
    public static final <T> InterfaceC6622s<T> m24146k(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? interfaceC6622s : m24147n(interfaceC6622s, new C6598k(j2));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    /* JADX INFO: renamed from: n */
    private static final <T> InterfaceC6622s<T> m24147n(InterfaceC6622s<? extends T> interfaceC6622s, cyoe.x2<? super T, Long> x2Var) {
        return C6579h.toq(new zy(x2Var, interfaceC6622s, null));
    }

    @kotlin.hyr
    @InterfaceC7396q
    @mu
    @InterfaceC6769y(name = "debounceDuration")
    /* JADX INFO: renamed from: q */
    public static final <T> InterfaceC6622s<T> m24148q(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q cyoe.x2<? super T, C6467n> x2Var) {
        return m24147n(interfaceC6622s, new toq(x2Var));
    }

    @InterfaceC7396q
    @mu
    /* JADX INFO: renamed from: s */
    public static final <T> InterfaceC6622s<T> m24149s(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, long j2) {
        return ld6.nsb(interfaceC6622s, ek5k.m24044n(j2));
    }

    @InterfaceC7396q
    @mu
    @kotlin.hyr
    public static final <T> InterfaceC6622s<T> toq(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q cyoe.x2<? super T, Long> x2Var) {
        return m24147n(interfaceC6622s, x2Var);
    }

    @InterfaceC7396q
    @mu
    /* JADX INFO: renamed from: y */
    public static final <T> InterfaceC6622s<T> m24150y(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, long j2) {
        if (j2 > 0) {
            return C6579h.toq(new C6599n(j2, interfaceC6622s, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    @InterfaceC7396q
    @mu
    public static final <T> InterfaceC6622s<T> zy(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, long j2) {
        return ld6.nn86(interfaceC6622s, ek5k.m24044n(j2));
    }
}

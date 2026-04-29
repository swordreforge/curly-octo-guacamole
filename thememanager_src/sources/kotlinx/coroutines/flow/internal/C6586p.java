package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.C6217s;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.d3;
import kotlin.jvm.internal.i1;
import kotlin.was;
import kotlinx.coroutines.C6490c;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.flow.InterfaceC6622s;
import kotlinx.coroutines.gbni;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.p */
/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bz\u0012B\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010RS\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u00178\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/flow/internal/p;", C0846k.zaso, "R", "Lkotlinx/coroutines/flow/internal/y;", "Lkotlin/coroutines/f7l8;", "context", "", "capacity", "Lkotlinx/coroutines/channels/qrj;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/n;", "ld6", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "i", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/c;", "name", "value", "Lkotlin/coroutines/q;", "", "Lkotlin/fn3e;", AnimatedProperty.PROPERTY_NAME_Y, "Lcyoe/cdj;", "transform", "Lkotlinx/coroutines/flow/s;", "flow", C4991s.f28129n, "(Lcyoe/cdj;Lkotlinx/coroutines/flow/s;Lkotlin/coroutines/f7l8;ILkotlinx/coroutines/channels/qrj;)V", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
public final class C6586p<T, R> extends AbstractC6594y<T, R> {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final cyoe.cdj<InterfaceC6618p<? super R>, T, InterfaceC6216q<? super was>, Object> f37000y;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.p$k */
    /* JADX INFO: compiled from: Merge.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m22756f = "Merge.kt", m22757i = {}, m22758l = {27}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6618p<R> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C6586p<T, R> this$0;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.p$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Merge.kt */
        @d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class C8073k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ InterfaceC6618p<R> f37001g;

            /* JADX INFO: renamed from: k */
            final /* synthetic */ i1.C6299y<gbni> f37002k;

            /* JADX INFO: renamed from: n */
            final /* synthetic */ C6586p<T, R> f37003n;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ InterfaceC6556f f37004q;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.p$k$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Merge.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m22756f = "Merge.kt", m22757i = {}, m22758l = {34}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
            @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
            static final class C8074k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
                final /* synthetic */ InterfaceC6618p<R> $collector;
                final /* synthetic */ T $value;
                int label;
                final /* synthetic */ C6586p<T, R> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C8074k(C6586p<T, R> c6586p, InterfaceC6618p<? super R> interfaceC6618p, T t2, InterfaceC6216q<? super C8074k> interfaceC6216q) {
                    super(2, interfaceC6216q);
                    this.this$0 = c6586p;
                    this.$collector = interfaceC6618p;
                    this.$value = t2;
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
                @InterfaceC7396q
                public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                    return new C8074k(this.this$0, this.$collector, this.$value, interfaceC6216q);
                }

                @Override // cyoe.InterfaceC5979h
                @InterfaceC7395n
                public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                    return ((C8074k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
                @InterfaceC7395n
                public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                    Object objX2 = C6199q.x2();
                    int i2 = this.label;
                    if (i2 == 0) {
                        C6318m.n7h(obj);
                        cyoe.cdj cdjVar = ((C6586p) this.this$0).f37000y;
                        InterfaceC6618p<R> interfaceC6618p = this.$collector;
                        T t2 = this.$value;
                        this.label = 1;
                        if (cdjVar.invoke(interfaceC6618p, t2, this) == objX2) {
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

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.p$k$k$toq */
            /* JADX INFO: compiled from: Merge.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m22756f = "Merge.kt", m22757i = {0, 0}, m22758l = {30}, m22759m = "emit", m22760n = {"this", "value"}, m22761s = {"L$0", "L$1"})
            @d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
            static final class toq extends AbstractC6209q {
                Object L$0;
                Object L$1;
                Object L$2;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C8073k<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                toq(C8073k<? super T> c8073k, InterfaceC6216q<? super toq> interfaceC6216q) {
                    super(interfaceC6216q);
                    this.this$0 = c8073k;
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
            C8073k(i1.C6299y<gbni> c6299y, InterfaceC6556f interfaceC6556f, C6586p<T, R> c6586p, InterfaceC6618p<? super R> interfaceC6618p) {
                this.f37002k = c6299y;
                this.f37004q = interfaceC6556f;
                this.f37003n = c6586p;
                this.f37001g = interfaceC6618p;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC6618p
            @mub.InterfaceC7395n
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.C6586p.k.C8073k.toq
                    if (r0 == 0) goto L13
                    r0 = r9
                    kotlinx.coroutines.flow.internal.p$k$k$toq r0 = (kotlinx.coroutines.flow.internal.C6586p.k.C8073k.toq) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.p$k$k$toq r0 = new kotlinx.coroutines.flow.internal.p$k$k$toq
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.L$2
                    kotlinx.coroutines.gbni r8 = (kotlinx.coroutines.gbni) r8
                    java.lang.Object r8 = r0.L$1
                    java.lang.Object r0 = r0.L$0
                    kotlinx.coroutines.flow.internal.p$k$k r0 = (kotlinx.coroutines.flow.internal.C6586p.k.C8073k) r0
                    kotlin.C6318m.n7h(r9)
                    goto L5f
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.C6318m.n7h(r9)
                    kotlin.jvm.internal.i1$y<kotlinx.coroutines.gbni> r9 = r7.f37002k
                    T r9 = r9.element
                    kotlinx.coroutines.gbni r9 = (kotlinx.coroutines.gbni) r9
                    if (r9 != 0) goto L48
                L46:
                    r0 = r7
                    goto L5f
                L48:
                    kotlinx.coroutines.flow.internal.x2 r2 = new kotlinx.coroutines.flow.internal.x2
                    r2.<init>()
                    r9.mo23862q(r2)
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.L$2 = r9
                    r0.label = r3
                    java.lang.Object r9 = r9.was(r0)
                    if (r9 != r1) goto L46
                    return r1
                L5f:
                    kotlin.jvm.internal.i1$y<kotlinx.coroutines.gbni> r9 = r0.f37002k
                    kotlinx.coroutines.f r1 = r0.f37004q
                    r2 = 0
                    kotlinx.coroutines.lrht r3 = kotlinx.coroutines.lrht.UNDISPATCHED
                    kotlinx.coroutines.flow.internal.p$k$k$k r4 = new kotlinx.coroutines.flow.internal.p$k$k$k
                    kotlinx.coroutines.flow.internal.p<T, R> r5 = r0.f37003n
                    kotlinx.coroutines.flow.p<R> r0 = r0.f37001g
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    kotlinx.coroutines.gbni r8 = kotlinx.coroutines.C6708p.m24521n(r1, r2, r3, r4, r5, r6)
                    r9.element = r8
                    kotlin.was r8 = kotlin.was.f36763k
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C6586p.k.C8073k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(C6586p<T, R> c6586p, InterfaceC6618p<? super R> interfaceC6618p, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.this$0 = c6586p;
            this.$collector = interfaceC6618p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            k kVar = new k(this.this$0, this.$collector, interfaceC6216q);
            kVar.L$0 = obj;
            return kVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.q to kotlinx.coroutines.flow.internal.p$k for r7v1 'this'  kotlin.coroutines.q
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.C6318m.n7h(r8)
                goto L37
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                kotlin.C6318m.n7h(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.f r8 = (kotlinx.coroutines.InterfaceC6556f) r8
                kotlin.jvm.internal.i1$y r1 = new kotlin.jvm.internal.i1$y
                r1.<init>()
                kotlinx.coroutines.flow.internal.p<T, R> r3 = r7.this$0
                kotlinx.coroutines.flow.s<S> r4 = r3.f37025g
                kotlinx.coroutines.flow.internal.p$k$k r5 = new kotlinx.coroutines.flow.internal.p$k$k
                kotlinx.coroutines.flow.p<R> r6 = r7.$collector
                r5.<init>(r1, r8, r3, r6)
                r7.label = r2
                java.lang.Object r8 = r4.mo5262k(r5, r7)
                if (r8 != r0) goto L37
                return r0
            L37:
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C6586p.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ C6586p(cyoe.cdj cdjVar, InterfaceC6622s interfaceC6622s, kotlin.coroutines.f7l8 f7l8Var, int i2, kotlinx.coroutines.channels.qrj qrjVar, int i3, kotlin.jvm.internal.ni7 ni7Var) {
        this(cdjVar, interfaceC6622s, (i3 & 4) != 0 ? C6217s.INSTANCE : f7l8Var, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? kotlinx.coroutines.channels.qrj.SUSPEND : qrjVar);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6594y
    @InterfaceC7395n
    /* JADX INFO: renamed from: i */
    protected Object mo24134i(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        Object objF7l8 = C6490c.f7l8(new k(this, interfaceC6618p, null), interfaceC6216q);
        return objF7l8 == C6199q.x2() ? objF7l8 : was.f36763k;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6584n
    @InterfaceC7396q
    protected AbstractC6584n<R> ld6(@InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        return new C6586p(this.f37000y, this.f37025g, f7l8Var, i2, qrjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6586p(@InterfaceC7396q cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, @InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q kotlin.coroutines.f7l8 f7l8Var, int i2, @InterfaceC7396q kotlinx.coroutines.channels.qrj qrjVar) {
        super(interfaceC6622s, f7l8Var, i2, qrjVar);
        this.f37000y = cdjVar;
    }
}

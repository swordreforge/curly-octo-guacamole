package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.collections.C6144h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.InterfaceC6533d;
import kotlinx.coroutines.flow.internal.C6586p;
import kotlinx.coroutines.mu;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000R\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ag\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000227\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aq\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\r\u001a\u00020\f27\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002H\u0007\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0011\u001a9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0014\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0013\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0007\u001at\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0001\u0010\t\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0018¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aj\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000229\b\u0005\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u000b\u001ac\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0001\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000b\" \u0010%\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\"\u001a\u0010'\u001a\u00020&8\u0006X\u0087T¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/s;", "Lkotlin/Function2;", "Lkotlin/c;", "name", "value", "Lkotlin/coroutines/q;", "", "transform", "k", "(Lkotlinx/coroutines/flow/s;Lcyoe/h;)Lkotlinx/coroutines/flow/s;", "", "concurrency", "zy", "(Lkotlinx/coroutines/flow/s;ILcyoe/h;)Lkotlinx/coroutines/flow/s;", "n", "", "x2", "", "flows", "qrj", "([Lkotlinx/coroutines/flow/s;)Lkotlinx/coroutines/flow/s;", C7704k.y.toq.f95579toq, "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/p;", "Lkotlin/was;", "Lkotlin/fn3e;", "n7h", "(Lkotlinx/coroutines/flow/s;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", "toq", "ld6", com.market.sdk.reflect.toq.f28131g, AnimatedProperty.PROPERTY_NAME_Y, "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "Ljava/lang/String;", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class ni7 {

    /* JADX INFO: renamed from: k */
    private static final int f37044k = kotlinx.coroutines.internal.hyr.toq(ld6.f37035k, 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.ni7$g */
    /* JADX INFO: compiled from: Merge.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m22756f = "Merge.kt", m22757i = {}, m22758l = {214, 214}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6610g<R, T> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, T, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC5979h<T, InterfaceC6216q<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6610g(InterfaceC5979h<? super T, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super C6610g> interfaceC6216q) {
            super(3, interfaceC6216q);
            this.$transform = interfaceC5979h;
        }

        @Override // cyoe.cdj
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, T t2, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            C6610g c6610g = new C6610g(this.$transform, interfaceC6216q);
            c6610g.L$0 = interfaceC6618p;
            c6610g.L$1 = t2;
            return c6610g.invokeSuspend(was.f36763k);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.ni7$g<R, T> for r5v1 'this'  java.lang.Object
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
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.C6318m.n7h(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.L$0
                kotlinx.coroutines.flow.p r1 = (kotlinx.coroutines.flow.InterfaceC6618p) r1
                kotlin.C6318m.n7h(r6)
                goto L39
            L22:
                kotlin.C6318m.n7h(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                kotlinx.coroutines.flow.p r1 = (kotlinx.coroutines.flow.InterfaceC6618p) r1
                java.lang.Object r6 = r5.L$1
                cyoe.h<T, kotlin.coroutines.q<? super R>, java.lang.Object> r4 = r5.$transform
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L45
                return r0
            L45:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.ni7.C6610g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.ni7$k */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/wvg$n"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6611k<R> implements InterfaceC6622s<InterfaceC6622s<? extends R>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37045k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h f37046q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.ni7$k$k */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx/coroutines/flow/wvg$n$toq", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC6618p f37047k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ InterfaceC5979h f37048q;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.ni7$k$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", m22756f = "Merge.kt", m22757i = {}, m22758l = {223, 223}, m22759m = "emit", m22760n = {}, m22761s = {})
            @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
            public static final class C8083k extends AbstractC6209q {
                Object L$0;
                int label;
                /* synthetic */ Object result;

                public C8083k(InterfaceC6216q interfaceC6216q) {
                    super(interfaceC6216q);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
                @InterfaceC7395n
                public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return k.this.emit(null, this);
                }
            }

            public k(InterfaceC6618p interfaceC6618p, InterfaceC5979h interfaceC5979h) {
                this.f37047k = interfaceC6618p;
                this.f37048q = interfaceC5979h;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC6618p
            @mub.InterfaceC7395n
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.ni7.C6611k.k.C8083k
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.ni7$k$k$k r0 = (kotlinx.coroutines.flow.ni7.C6611k.k.C8083k) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.ni7$k$k$k r0 = new kotlinx.coroutines.flow.ni7$k$k$k
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C6318m.n7h(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.L$0
                    kotlinx.coroutines.flow.p r7 = (kotlinx.coroutines.flow.InterfaceC6618p) r7
                    kotlin.C6318m.n7h(r8)
                    goto L51
                L3c:
                    kotlin.C6318m.n7h(r8)
                    kotlinx.coroutines.flow.p r8 = r6.f37047k
                    cyoe.h r2 = r6.f37048q
                    r0.L$0 = r8
                    r0.label = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.was r7 = kotlin.was.f36763k
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.ni7.C6611k.k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
            }
        }

        public C6611k(InterfaceC6622s interfaceC6622s, InterfaceC5979h interfaceC5979h) {
            this.f37045k = interfaceC6622s;
            this.f37046q = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            Object objMo5262k = this.f37045k.mo5262k(new k(interfaceC6618p, this.f37046q), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.ni7$n */
    /* JADX INFO: compiled from: Merge.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "value", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/s;Lkotlin/coroutines/q;)Ljava/lang/Object;"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6612n<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6618p<T> f37049k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.ni7$n$k */
        /* JADX INFO: compiled from: Merge.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", m22756f = "Merge.kt", m22757i = {}, m22758l = {80}, m22759m = "emit", m22760n = {}, m22761s = {})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C6612n<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(C6612n<? super T> c6612n, InterfaceC6216q<? super k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = c6612n;
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
        C6612n(InterfaceC6618p<? super T> interfaceC6618p) {
            this.f37049k = interfaceC6618p;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.ni7.C6612n.k
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.ni7$n$k r0 = (kotlinx.coroutines.flow.ni7.C6612n.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.ni7$n$k r0 = new kotlinx.coroutines.flow.ni7$n$k
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C6318m.n7h(r6)
                goto L3f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C6318m.n7h(r6)
                kotlinx.coroutines.flow.p<T> r6 = r4.f37049k
                r0.label = r3
                java.lang.Object r5 = kotlinx.coroutines.flow.ld6.m24155a(r6, r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                kotlin.was r5 = kotlin.was.f36763k
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.ni7.C6612n.emit(kotlinx.coroutines.flow.s, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.ni7$q */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6613q<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37050k;

        public C6613q(InterfaceC6622s interfaceC6622s) {
            this.f37050k = interfaceC6622s;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            Object objMo5262k = this.f37050k.mo5262k(new C6612n(interfaceC6618p), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: compiled from: Merge.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", m22756f = "Merge.kt", m22757i = {}, m22758l = {190, 190}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {C0846k.zaso, "R", "Lkotlinx/coroutines/flow/p;", "it", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    public static final class toq<R, T> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.cdj<InterfaceC6618p<? super R>, T, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC5979h<T, InterfaceC6216q<? super InterfaceC6622s<? extends R>>, Object> $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public toq(InterfaceC5979h<? super T, ? super InterfaceC6216q<? super InterfaceC6622s<? extends R>>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(3, interfaceC6216q);
            this.$transform = interfaceC5979h;
        }

        @Override // cyoe.cdj
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, T t2, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            toq toqVar = new toq(this.$transform, interfaceC6216q);
            toqVar.L$0 = interfaceC6618p;
            toqVar.L$1 = t2;
            return toqVar.invokeSuspend(was.f36763k);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.ni7$toq<R, T> for r5v1 'this'  java.lang.Object
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
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.C6318m.n7h(r6)
                goto L47
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.L$0
                kotlinx.coroutines.flow.p r1 = (kotlinx.coroutines.flow.InterfaceC6618p) r1
                kotlin.C6318m.n7h(r6)
                goto L39
            L22:
                kotlin.C6318m.n7h(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                kotlinx.coroutines.flow.p r1 = (kotlinx.coroutines.flow.InterfaceC6618p) r1
                java.lang.Object r6 = r5.L$1
                cyoe.h<T, kotlin.coroutines.q<? super kotlinx.coroutines.flow.s<? extends R>>, java.lang.Object> r4 = r5.$transform
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                kotlinx.coroutines.flow.s r6 = (kotlinx.coroutines.flow.InterfaceC6622s) r6
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r6 = kotlinx.coroutines.flow.ld6.m24155a(r1, r6, r5)
                if (r6 != r0) goto L47
                return r0
            L47:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.ni7.toq.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.ni7$toq<R, T> for r2v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @mub.InterfaceC7395n
        public final java.lang.Object invokeSuspend$$forInline(@mub.InterfaceC7396q java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r3 = r2.L$0
                kotlinx.coroutines.flow.p r3 = (kotlinx.coroutines.flow.InterfaceC6618p) r3
                java.lang.Object r0 = r2.L$1
                cyoe.h<T, kotlin.coroutines.q<? super kotlinx.coroutines.flow.s<? extends R>>, java.lang.Object> r1 = r2.$transform
                java.lang.Object r0 = r1.invoke(r0, r2)
                kotlinx.coroutines.flow.s r0 = (kotlinx.coroutines.flow.InterfaceC6622s) r0
                r1 = 0
                kotlin.jvm.internal.d3.m23089n(r1)
                kotlinx.coroutines.flow.ld6.m24155a(r3, r0, r2)
                r3 = 1
                kotlin.jvm.internal.d3.m23089n(r3)
                kotlin.was r3 = kotlin.was.f36763k
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.ni7.toq.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/wvg$n"}, m22787k = 1, mv = {1, 6, 0})
    public static final class zy<R> implements InterfaceC6622s<InterfaceC6622s<? extends R>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37051k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h f37052q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.ni7$zy$k */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx/coroutines/flow/wvg$n$toq", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class C6614k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC6618p f37053k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ InterfaceC5979h f37054q;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.ni7$zy$k$k */
            /* JADX INFO: compiled from: Emitters.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", m22756f = "Merge.kt", m22757i = {}, m22758l = {223, 223}, m22759m = "emit", m22760n = {}, m22761s = {})
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
                    return C6614k.this.emit(null, this);
                }
            }

            public C6614k(InterfaceC6618p interfaceC6618p, InterfaceC5979h interfaceC5979h) {
                this.f37053k = interfaceC6618p;
                this.f37054q = interfaceC5979h;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC6618p
            @mub.InterfaceC7395n
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.ni7.zy.C6614k.k
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.ni7$zy$k$k r0 = (kotlinx.coroutines.flow.ni7.zy.C6614k.k) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.ni7$zy$k$k r0 = new kotlinx.coroutines.flow.ni7$zy$k$k
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C6318m.n7h(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.L$0
                    kotlinx.coroutines.flow.p r7 = (kotlinx.coroutines.flow.InterfaceC6618p) r7
                    kotlin.C6318m.n7h(r8)
                    goto L51
                L3c:
                    kotlin.C6318m.n7h(r8)
                    kotlinx.coroutines.flow.p r8 = r6.f37053k
                    cyoe.h r2 = r6.f37054q
                    r0.L$0 = r8
                    r0.label = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.was r7 = kotlin.was.f36763k
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.ni7.zy.C6614k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
            }
        }

        public zy(InterfaceC6622s interfaceC6622s, InterfaceC5979h interfaceC5979h) {
            this.f37051k = interfaceC6622s;
            this.f37052q = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            Object objMo5262k = this.f37051k.mo5262k(new C6614k(interfaceC6618p, this.f37052q), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }
    }

    public static /* synthetic */ InterfaceC6622s f7l8(InterfaceC6622s interfaceC6622s, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = f37044k;
        }
        return ld6.fnq8(interfaceC6622s, i2);
    }

    @InterfaceC7396q
    @mu
    /* JADX INFO: renamed from: g */
    public static final <T> InterfaceC6622s<T> m24200g(@InterfaceC7396q InterfaceC6622s<? extends InterfaceC6622s<? extends T>> interfaceC6622s, int i2) {
        if (i2 > 0) {
            return i2 == 1 ? ld6.qkj8(interfaceC6622s) : new kotlinx.coroutines.flow.internal.f7l8(interfaceC6622s, i2, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.d2ok.mcp("Expected positive concurrency level, but had ", Integer.valueOf(i2)).toString());
    }

    @InterfaceC7396q
    @mu
    /* JADX INFO: renamed from: k */
    public static final <T, R> InterfaceC6622s<R> m24201k(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super InterfaceC6622s<? extends R>>, ? extends Object> interfaceC5979h) {
        return ld6.qkj8(new C6611k(interfaceC6622s, interfaceC5979h));
    }

    @InterfaceC7396q
    @InterfaceC6533d
    public static final <T, R> InterfaceC6622s<R> ld6(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q @kotlin.toq InterfaceC5979h<? super T, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        return ld6.m24177w(interfaceC6622s, new C6610g(interfaceC5979h, null));
    }

    @InterfaceC7396q
    @mu
    /* JADX INFO: renamed from: n */
    public static final <T> InterfaceC6622s<T> m24202n(@InterfaceC7396q InterfaceC6622s<? extends InterfaceC6622s<? extends T>> interfaceC6622s) {
        return new C6613q(interfaceC6622s);
    }

    @InterfaceC7396q
    @InterfaceC6533d
    public static final <T, R> InterfaceC6622s<R> n7h(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q @kotlin.toq cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar) {
        return new C6586p(cdjVar, interfaceC6622s, null, 0, null, 28, null);
    }

    @mu
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m24203p() {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ InterfaceC6622s m24204q(InterfaceC6622s interfaceC6622s, int i2, InterfaceC5979h interfaceC5979h, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = f37044k;
        }
        return ld6.m24158d(interfaceC6622s, i2, interfaceC5979h);
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> qrj(@InterfaceC7396q InterfaceC6622s<? extends T>... interfaceC6622sArr) {
        return ld6.w831(C6144h.bb(interfaceC6622sArr));
    }

    @mu
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m24205s() {
    }

    @InterfaceC7396q
    @InterfaceC6533d
    public static final <T, R> InterfaceC6622s<R> toq(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q @kotlin.toq InterfaceC5979h<? super T, ? super InterfaceC6216q<? super InterfaceC6622s<? extends R>>, ? extends Object> interfaceC5979h) {
        return ld6.m24177w(interfaceC6622s, new toq(interfaceC5979h, null));
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> x2(@InterfaceC7396q Iterable<? extends InterfaceC6622s<? extends T>> iterable) {
        return new kotlinx.coroutines.flow.internal.ld6(iterable, null, 0, null, 14, null);
    }

    /* JADX INFO: renamed from: y */
    public static final int m24206y() {
        return f37044k;
    }

    @InterfaceC7396q
    @mu
    public static final <T, R> InterfaceC6622s<R> zy(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, int i2, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super InterfaceC6622s<? extends R>>, ? extends Object> interfaceC5979h) {
        return ld6.fnq8(new zy(interfaceC6622s, interfaceC5979h), i2);
    }
}

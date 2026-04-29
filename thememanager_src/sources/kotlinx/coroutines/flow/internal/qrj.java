package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.data.VariableNames;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C6318m;
import kotlin.collections.x9kr;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.nn86;
import kotlin.was;
import kotlinx.coroutines.C6490c;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.channels.a9;
import kotlinx.coroutines.channels.d3;
import kotlinx.coroutines.channels.jp0y;
import kotlinx.coroutines.channels.lvui;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.flow.InterfaceC6622s;
import kotlinx.coroutines.internal.lrht;
import kotlinx.coroutines.m4;
import kotlinx.coroutines.mcp;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0092\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ap\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015*\u001c\b\u0002\u0010\u0017\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00162\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"R", C0846k.zaso, "Lkotlinx/coroutines/flow/p;", "", "Lkotlinx/coroutines/flow/s;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/q;", "Lkotlin/was;", "", "Lkotlin/fn3e;", "transform", "k", "(Lkotlinx/coroutines/flow/p;[Lkotlinx/coroutines/flow/s;Lcyoe/k;Lcyoe/cdj;Lkotlin/coroutines/q;)Ljava/lang/Object;", "T1", "T2", "flow", "flow2", "toq", "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/s;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", "Lkotlin/collections/x9kr;", "Update", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class qrj {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.qrj$k */
    /* JADX INFO: compiled from: Combine.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m22756f = "Combine.kt", m22757i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m22758l = {57, 79, 82}, m22759m = "invokeSuspend", m22760n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, m22761s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", C0846k.zaso, "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6588k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC5981k<T[]> $arrayFactory;
        final /* synthetic */ InterfaceC6622s<T>[] $flows;
        final /* synthetic */ InterfaceC6618p<R> $this_combineInternal;
        final /* synthetic */ cyoe.cdj<InterfaceC6618p<? super R>, T[], InterfaceC6216q<? super was>, Object> $transform;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.qrj$k$k */
        /* JADX INFO: compiled from: Combine.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m22756f = "Combine.kt", m22757i = {}, m22758l = {34}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", C0846k.zaso, "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ InterfaceC6622s<T>[] $flows;
            final /* synthetic */ int $i;
            final /* synthetic */ AtomicInteger $nonClosed;
            final /* synthetic */ kotlinx.coroutines.channels.n7h<x9kr<Object>> $resultChannel;
            int label;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.qrj$k$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            @d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", C0846k.zaso, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
            static final class C8075k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ kotlinx.coroutines.channels.n7h<x9kr<Object>> f37005k;

                /* JADX INFO: renamed from: q */
                final /* synthetic */ int f37006q;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.qrj$k$k$k$k, reason: collision with other inner class name */
                /* JADX INFO: compiled from: Combine.kt */
                @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", m22756f = "Combine.kt", m22757i = {}, m22758l = {35, 36}, m22759m = "emit", m22760n = {}, m22761s = {})
                @d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
                static final class C8076k extends AbstractC6209q {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C8075k<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C8076k(C8075k<? super T> c8075k, InterfaceC6216q<? super C8076k> interfaceC6216q) {
                        super(interfaceC6216q);
                        this.this$0 = c8075k;
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
                    @InterfaceC7395n
                    public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                C8075k(kotlinx.coroutines.channels.n7h<x9kr<Object>> n7hVar, int i2) {
                    this.f37005k = n7hVar;
                    this.f37006q = i2;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC6618p
                @mub.InterfaceC7395n
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.qrj.C6588k.k.C8075k.C8076k
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.internal.qrj$k$k$k$k r0 = (kotlinx.coroutines.flow.internal.qrj.C6588k.k.C8075k.C8076k) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.qrj$k$k$k$k r0 = new kotlinx.coroutines.flow.internal.qrj$k$k$k$k
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.C6318m.n7h(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        kotlin.C6318m.n7h(r8)
                        goto L4d
                    L38:
                        kotlin.C6318m.n7h(r8)
                        kotlinx.coroutines.channels.n7h<kotlin.collections.x9kr<java.lang.Object>> r8 = r6.f37005k
                        kotlin.collections.x9kr r2 = new kotlin.collections.x9kr
                        int r5 = r6.f37006q
                        r2.<init>(r5, r7)
                        r0.label = r4
                        java.lang.Object r7 = r8.d3(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.label = r3
                        java.lang.Object r7 = kotlinx.coroutines.lh.m24477k(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        kotlin.was r7 = kotlin.was.f36763k
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.qrj.C6588k.k.C8075k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(InterfaceC6622s<? extends T>[] interfaceC6622sArr, int i2, AtomicInteger atomicInteger, kotlinx.coroutines.channels.n7h<x9kr<Object>> n7hVar, InterfaceC6216q<? super k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$flows = interfaceC6622sArr;
                this.$i = i2;
                this.$nonClosed = atomicInteger;
                this.$resultChannel = n7hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new k(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                AtomicInteger atomicInteger;
                Object objX2 = C6199q.x2();
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        C6318m.n7h(obj);
                        InterfaceC6622s[] interfaceC6622sArr = this.$flows;
                        int i3 = this.$i;
                        InterfaceC6622s interfaceC6622s = interfaceC6622sArr[i3];
                        C8075k c8075k = new C8075k(this.$resultChannel, i3);
                        this.label = 1;
                        if (interfaceC6622s.mo5262k(c8075k, this) == objX2) {
                            return objX2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6318m.n7h(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        lvui.C6502k.m23922k(this.$resultChannel, null, 1, null);
                    }
                    return was.f36763k;
                } finally {
                    if (this.$nonClosed.decrementAndGet() == 0) {
                        lvui.C6502k.m23922k(this.$resultChannel, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6588k(InterfaceC6622s<? extends T>[] interfaceC6622sArr, InterfaceC5981k<T[]> interfaceC5981k, cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T[], ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, InterfaceC6618p<? super R> interfaceC6618p, InterfaceC6216q<? super C6588k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$flows = interfaceC6622sArr;
            this.$arrayFactory = interfaceC5981k;
            this.$transform = cdjVar;
            this.$this_combineInternal = interfaceC6618p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            C6588k c6588k = new C6588k(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, interfaceC6216q);
            c6588k.L$0 = obj;
            return c6588k;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C6588k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ed A[LOOP:0: B:28:0x00ed->B:52:?, LOOP_START, PHI: r3 r10
          0x00ed: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:25:0x00e8, B:52:?] A[DONT_GENERATE, DONT_INLINE]
          0x00ed: PHI (r10v5 kotlin.collections.x9kr) = (r10v4 kotlin.collections.x9kr), (r10v18 kotlin.collections.x9kr) binds: [B:25:0x00e8, B:52:?] A[DONT_GENERATE, DONT_INLINE]] */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0136 -> B:20:0x00c8). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 369
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.qrj.C6588k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq<R> implements InterfaceC6622s<R> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37007k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ cyoe.cdj f37008n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC6622s f37009q;

        public toq(InterfaceC6622s interfaceC6622s, InterfaceC6622s interfaceC6622s2, cyoe.cdj cdjVar) {
            this.f37007k = interfaceC6622s;
            this.f37009q = interfaceC6622s2;
            this.f37008n = cdjVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            Object objF7l8 = C6490c.f7l8(new zy(interfaceC6618p, this.f37007k, this.f37009q, this.f37008n, null), interfaceC6216q);
            return objF7l8 == C6199q.x2() ? objF7l8 : was.f36763k;
        }
    }

    /* JADX INFO: compiled from: Combine.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", m22756f = "Combine.kt", m22757i = {0}, m22758l = {129}, m22759m = "invokeSuspend", m22760n = {VariableNames.VAR_SECOND}, m22761s = {"L$0"})
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class zy extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ InterfaceC6622s<T1> $flow;
        final /* synthetic */ InterfaceC6622s<T2> $flow2;
        final /* synthetic */ InterfaceC6618p<R> $this_unsafeFlow;
        final /* synthetic */ cyoe.cdj<T1, T2, InterfaceC6216q<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.qrj$zy$k */
        /* JADX INFO: compiled from: Combine.kt */
        @d3(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T1", "T2", "R", "", "it", "Lkotlin/was;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class C6589k extends AbstractC6308r implements cyoe.x2<Throwable, was> {
            final /* synthetic */ mcp $collectJob;
            final /* synthetic */ InterfaceC6618p<R> $this_unsafeFlow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C6589k(mcp mcpVar, InterfaceC6618p<? super R> interfaceC6618p) {
                super(1);
                this.$collectJob = mcpVar;
                this.$this_unsafeFlow = interfaceC6618p;
            }

            @Override // cyoe.x2
            public /* bridge */ /* synthetic */ was invoke(Throwable th) {
                invoke2(th);
                return was.f36763k;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@InterfaceC7395n Throwable th) {
                if (this.$collectJob.isActive()) {
                    this.$collectJob.mo23862q(new C6581k(this.$this_unsafeFlow));
                }
            }
        }

        /* JADX INFO: compiled from: Combine.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", m22756f = "Combine.kt", m22757i = {}, m22758l = {130}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlin/was;", "it", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<was, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ Object $cnt;
            final /* synthetic */ InterfaceC6622s<T1> $flow;
            final /* synthetic */ kotlin.coroutines.f7l8 $scopeContext;
            final /* synthetic */ kotlinx.coroutines.channels.d3<Object> $second;
            final /* synthetic */ InterfaceC6618p<R> $this_unsafeFlow;
            final /* synthetic */ cyoe.cdj<T1, T2, InterfaceC6216q<? super R>, Object> $transform;
            int label;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.qrj$zy$toq$k */
            /* JADX INFO: compiled from: Combine.kt */
            @d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
            static final class C6590k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

                /* JADX INFO: renamed from: g */
                final /* synthetic */ InterfaceC6618p<R> f37010g;

                /* JADX INFO: renamed from: k */
                final /* synthetic */ kotlin.coroutines.f7l8 f37011k;

                /* JADX INFO: renamed from: n */
                final /* synthetic */ kotlinx.coroutines.channels.d3<Object> f37012n;

                /* JADX INFO: renamed from: q */
                final /* synthetic */ Object f37013q;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ cyoe.cdj<T1, T2, InterfaceC6216q<? super R>, Object> f37014y;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.qrj$zy$toq$k$k */
                /* JADX INFO: compiled from: Combine.kt */
                @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", m22756f = "Combine.kt", m22757i = {}, m22758l = {132, 135, 135}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
                @d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlin/was;", "it", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
                static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<was, InterfaceC6216q<? super was>, Object> {
                    final /* synthetic */ kotlinx.coroutines.channels.d3<Object> $second;
                    final /* synthetic */ InterfaceC6618p<R> $this_unsafeFlow;
                    final /* synthetic */ cyoe.cdj<T1, T2, InterfaceC6216q<? super R>, Object> $transform;
                    final /* synthetic */ T1 $value;
                    Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    k(kotlinx.coroutines.channels.d3<? extends Object> d3Var, InterfaceC6618p<? super R> interfaceC6618p, cyoe.cdj<? super T1, ? super T2, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar, T1 t1, InterfaceC6216q<? super k> interfaceC6216q) {
                        super(2, interfaceC6216q);
                        this.$second = d3Var;
                        this.$this_unsafeFlow = interfaceC6618p;
                        this.$transform = cdjVar;
                        this.$value = t1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
                    @InterfaceC7396q
                    public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                        return new k(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, interfaceC6216q);
                    }

                    @Override // cyoe.InterfaceC5979h
                    @InterfaceC7395n
                    public final Object invoke(@InterfaceC7396q was wasVar, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                        return ((k) create(wasVar, interfaceC6216q)).invokeSuspend(was.f36763k);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[RETURN] */
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
                    @mub.InterfaceC7395n
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r9) throws java.lang.Throwable {
                        /*
                            r8 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                            int r1 = r8.label
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L30
                            if (r1 == r5) goto L26
                            if (r1 == r4) goto L1e
                            if (r1 != r3) goto L16
                            kotlin.C6318m.n7h(r9)
                            goto L6f
                        L16:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L1e:
                            java.lang.Object r1 = r8.L$0
                            kotlinx.coroutines.flow.p r1 = (kotlinx.coroutines.flow.InterfaceC6618p) r1
                            kotlin.C6318m.n7h(r9)
                            goto L64
                        L26:
                            kotlin.C6318m.n7h(r9)
                            kotlinx.coroutines.channels.ki r9 = (kotlinx.coroutines.channels.ki) r9
                            java.lang.Object r9 = r9.kja0()
                            goto L3e
                        L30:
                            kotlin.C6318m.n7h(r9)
                            kotlinx.coroutines.channels.d3<java.lang.Object> r9 = r8.$second
                            r8.label = r5
                            java.lang.Object r9 = r9.mcp(r8)
                            if (r9 != r0) goto L3e
                            return r0
                        L3e:
                            kotlinx.coroutines.flow.p<R> r1 = r8.$this_unsafeFlow
                            boolean r5 = r9 instanceof kotlinx.coroutines.channels.ki.zy
                            if (r5 == 0) goto L50
                            java.lang.Throwable r9 = kotlinx.coroutines.channels.ki.m23911g(r9)
                            if (r9 != 0) goto L4f
                            kotlinx.coroutines.flow.internal.k r9 = new kotlinx.coroutines.flow.internal.k
                            r9.<init>(r1)
                        L4f:
                            throw r9
                        L50:
                            cyoe.cdj<T1, T2, kotlin.coroutines.q<? super R>, java.lang.Object> r5 = r8.$transform
                            T1 r6 = r8.$value
                            kotlinx.coroutines.internal.l r7 = kotlinx.coroutines.flow.internal.fn3e.f36987k
                            if (r9 != r7) goto L59
                            r9 = r2
                        L59:
                            r8.L$0 = r1
                            r8.label = r4
                            java.lang.Object r9 = r5.invoke(r6, r9, r8)
                            if (r9 != r0) goto L64
                            return r0
                        L64:
                            r8.L$0 = r2
                            r8.label = r3
                            java.lang.Object r9 = r1.emit(r9, r8)
                            if (r9 != r0) goto L6f
                            return r0
                        L6f:
                            kotlin.was r9 = kotlin.was.f36763k
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.qrj.zy.toq.C6590k.k.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.qrj$zy$toq$k$toq, reason: collision with other inner class name */
                /* JADX INFO: compiled from: Combine.kt */
                @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", m22756f = "Combine.kt", m22757i = {}, m22758l = {131}, m22759m = "emit", m22760n = {}, m22761s = {})
                @d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
                static final class C8077toq extends AbstractC6209q {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C6590k<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C8077toq(C6590k<? super T> c6590k, InterfaceC6216q<? super C8077toq> interfaceC6216q) {
                        super(interfaceC6216q);
                        this.this$0 = c6590k;
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
                C6590k(kotlin.coroutines.f7l8 f7l8Var, Object obj, kotlinx.coroutines.channels.d3<? extends Object> d3Var, InterfaceC6618p<? super R> interfaceC6618p, cyoe.cdj<? super T1, ? super T2, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar) {
                    this.f37011k = f7l8Var;
                    this.f37013q = obj;
                    this.f37012n = d3Var;
                    this.f37010g = interfaceC6618p;
                    this.f37014y = cdjVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC6618p
                @mub.InterfaceC7395n
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T1 r13, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.qrj.zy.toq.C6590k.C8077toq
                        if (r0 == 0) goto L13
                        r0 = r14
                        kotlinx.coroutines.flow.internal.qrj$zy$toq$k$toq r0 = (kotlinx.coroutines.flow.internal.qrj.zy.toq.C6590k.C8077toq) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.qrj$zy$toq$k$toq r0 = new kotlinx.coroutines.flow.internal.qrj$zy$toq$k$toq
                        r0.<init>(r12, r14)
                    L18:
                        java.lang.Object r14 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C6318m.n7h(r14)
                        goto L51
                    L29:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L31:
                        kotlin.C6318m.n7h(r14)
                        kotlin.coroutines.f7l8 r14 = r12.f37011k
                        kotlin.was r2 = kotlin.was.f36763k
                        java.lang.Object r4 = r12.f37013q
                        kotlinx.coroutines.flow.internal.qrj$zy$toq$k$k r11 = new kotlinx.coroutines.flow.internal.qrj$zy$toq$k$k
                        kotlinx.coroutines.channels.d3<java.lang.Object> r6 = r12.f37012n
                        kotlinx.coroutines.flow.p<R> r7 = r12.f37010g
                        cyoe.cdj<T1, T2, kotlin.coroutines.q<? super R>, java.lang.Object> r8 = r12.f37014y
                        r10 = 0
                        r5 = r11
                        r9 = r13
                        r5.<init>(r6, r7, r8, r9, r10)
                        r0.label = r3
                        java.lang.Object r13 = kotlinx.coroutines.flow.internal.C6578g.zy(r14, r2, r4, r11, r0)
                        if (r13 != r1) goto L51
                        return r1
                    L51:
                        kotlin.was r13 = kotlin.was.f36763k
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.qrj.zy.toq.C6590k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            toq(InterfaceC6622s<? extends T1> interfaceC6622s, kotlin.coroutines.f7l8 f7l8Var, Object obj, kotlinx.coroutines.channels.d3<? extends Object> d3Var, InterfaceC6618p<? super R> interfaceC6618p, cyoe.cdj<? super T1, ? super T2, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar, InterfaceC6216q<? super toq> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$flow = interfaceC6622s;
                this.$scopeContext = f7l8Var;
                this.$cnt = obj;
                this.$second = d3Var;
                this.$this_unsafeFlow = interfaceC6618p;
                this.$transform = cdjVar;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new toq(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q was wasVar, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((toq) create(wasVar, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.q to kotlinx.coroutines.flow.internal.qrj$zy$toq for r9v1 'this'  kotlin.coroutines.q
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @mub.InterfaceC7395n
            public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                    int r1 = r9.label
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.C6318m.n7h(r10)
                    goto L35
                Lf:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L17:
                    kotlin.C6318m.n7h(r10)
                    kotlinx.coroutines.flow.s<T1> r10 = r9.$flow
                    kotlinx.coroutines.flow.internal.qrj$zy$toq$k r1 = new kotlinx.coroutines.flow.internal.qrj$zy$toq$k
                    kotlin.coroutines.f7l8 r4 = r9.$scopeContext
                    java.lang.Object r5 = r9.$cnt
                    kotlinx.coroutines.channels.d3<java.lang.Object> r6 = r9.$second
                    kotlinx.coroutines.flow.p<R> r7 = r9.$this_unsafeFlow
                    cyoe.cdj<T1, T2, kotlin.coroutines.q<? super R>, java.lang.Object> r8 = r9.$transform
                    r3 = r1
                    r3.<init>(r4, r5, r6, r7, r8)
                    r9.label = r2
                    java.lang.Object r10 = r10.mo5262k(r1, r9)
                    if (r10 != r0) goto L35
                    return r0
                L35:
                    kotlin.was r10 = kotlin.was.f36763k
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.qrj.zy.toq.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.qrj$zy$zy, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Combine.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", m22756f = "Combine.kt", m22757i = {}, m22758l = {92}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        @d3(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/channels/jp0y;", "", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        static final class C8078zy extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<jp0y<? super Object>, InterfaceC6216q<? super was>, Object> {
            final /* synthetic */ InterfaceC6622s<T2> $flow2;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.qrj$zy$zy$k */
            /* JADX INFO: compiled from: Combine.kt */
            @d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
            static final class C6591k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ jp0y<Object> f37015k;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.qrj$zy$zy$k$k */
                /* JADX INFO: compiled from: Combine.kt */
                @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", m22756f = "Combine.kt", m22757i = {}, m22758l = {93}, m22759m = "emit", m22760n = {}, m22761s = {})
                @d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
                static final class k extends AbstractC6209q {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C6591k<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    k(C6591k<? super T> c6591k, InterfaceC6216q<? super k> interfaceC6216q) {
                        super(interfaceC6216q);
                        this.this$0 = c6591k;
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
                    @InterfaceC7395n
                    public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                C6591k(jp0y<Object> jp0yVar) {
                    this.f37015k = jp0yVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC6618p
                @mub.InterfaceC7395n
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T2 r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.internal.qrj.zy.C8078zy.C6591k.k
                        if (r0 == 0) goto L13
                        r0 = r6
                        kotlinx.coroutines.flow.internal.qrj$zy$zy$k$k r0 = (kotlinx.coroutines.flow.internal.qrj.zy.C8078zy.C6591k.k) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.qrj$zy$zy$k$k r0 = new kotlinx.coroutines.flow.internal.qrj$zy$zy$k$k
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C6318m.n7h(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C6318m.n7h(r6)
                        kotlinx.coroutines.channels.jp0y<java.lang.Object> r6 = r4.f37015k
                        kotlinx.coroutines.channels.lvui r6 = r6.zy()
                        if (r5 != 0) goto L3e
                        kotlinx.coroutines.internal.l r5 = kotlinx.coroutines.flow.internal.fn3e.f36987k
                    L3e:
                        r0.label = r3
                        java.lang.Object r5 = r6.d3(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        kotlin.was r5 = kotlin.was.f36763k
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.qrj.zy.C8078zy.C6591k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C8078zy(InterfaceC6622s<? extends T2> interfaceC6622s, InterfaceC6216q<? super C8078zy> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$flow2 = interfaceC6622s;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                C8078zy c8078zy = new C8078zy(this.$flow2, interfaceC6216q);
                c8078zy.L$0 = obj;
                return c8078zy;
            }

            @Override // cyoe.InterfaceC5979h
            public /* bridge */ /* synthetic */ Object invoke(jp0y<? super Object> jp0yVar, InterfaceC6216q<? super was> interfaceC6216q) {
                return invoke2((jp0y<Object>) jp0yVar, interfaceC6216q);
            }

            @InterfaceC7395n
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@InterfaceC7396q jp0y<Object> jp0yVar, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
                return ((C8078zy) create(jp0yVar, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.q to kotlinx.coroutines.flow.internal.qrj$zy$zy for r4v1 'this'  kotlin.coroutines.q
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @mub.InterfaceC7395n
            public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                    int r1 = r4.label
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.C6318m.n7h(r5)
                    goto L2e
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    kotlin.C6318m.n7h(r5)
                    java.lang.Object r5 = r4.L$0
                    kotlinx.coroutines.channels.jp0y r5 = (kotlinx.coroutines.channels.jp0y) r5
                    kotlinx.coroutines.flow.s<T2> r1 = r4.$flow2
                    kotlinx.coroutines.flow.internal.qrj$zy$zy$k r3 = new kotlinx.coroutines.flow.internal.qrj$zy$zy$k
                    r3.<init>(r5)
                    r4.label = r2
                    java.lang.Object r5 = r1.mo5262k(r3, r4)
                    if (r5 != r0) goto L2e
                    return r0
                L2e:
                    kotlin.was r5 = kotlin.was.f36763k
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.qrj.zy.C8078zy.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        zy(InterfaceC6618p<? super R> interfaceC6618p, InterfaceC6622s<? extends T2> interfaceC6622s, InterfaceC6622s<? extends T1> interfaceC6622s2, cyoe.cdj<? super T1, ? super T2, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar, InterfaceC6216q<? super zy> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$this_unsafeFlow = interfaceC6618p;
            this.$flow2 = interfaceC6622s;
            this.$flow = interfaceC6622s2;
            this.$transform = cdjVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            zy zyVar = new zy(this.$this_unsafeFlow, this.$flow2, this.$flow, this.$transform, interfaceC6216q);
            zyVar.L$0 = obj;
            return zyVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((zy) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.channels.d3] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.channels.d3] */
        /* JADX WARN: Type inference failed for: r1v5 */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            kotlinx.coroutines.channels.d3 d3Var;
            kotlinx.coroutines.channels.d3 d3Var2;
            kotlin.coroutines.f7l8 f7l8VarPlus;
            was wasVar;
            toq toqVar;
            Object objX2 = C6199q.x2();
            ?? r1 = this.label;
            try {
                if (r1 != 0) {
                    if (r1 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d3Var2 = (kotlinx.coroutines.channels.d3) this.L$0;
                    try {
                        C6318m.n7h(obj);
                        r1 = d3Var2;
                    } catch (C6581k e2) {
                        e = e2;
                        cdj.toq(e, this.$this_unsafeFlow);
                        r1 = d3Var2;
                    }
                    d3.C6493k.toq(r1, null, 1, null);
                    return was.f36763k;
                }
                C6318m.n7h(obj);
                InterfaceC6556f interfaceC6556f = (InterfaceC6556f) this.L$0;
                kotlinx.coroutines.channels.d3 d3VarM23850g = a9.m23850g(interfaceC6556f, null, 0, new C8078zy(this.$flow2, null), 3, null);
                mcp mcpVarZy = m4.zy(null, 1, null);
                ((lvui) d3VarM23850g).mo23920n(new C6589k(mcpVarZy, this.$this_unsafeFlow));
                try {
                    kotlin.coroutines.f7l8 f7l8VarI1 = interfaceC6556f.i1();
                    Object qVar = lrht.toq(f7l8VarI1);
                    f7l8VarPlus = interfaceC6556f.i1().plus(mcpVarZy);
                    wasVar = was.f36763k;
                    toqVar = new toq(this.$flow, f7l8VarI1, qVar, d3VarM23850g, this.$this_unsafeFlow, this.$transform, null);
                    this.L$0 = d3VarM23850g;
                    this.label = 1;
                    d3Var = d3VarM23850g;
                } catch (C6581k e3) {
                    e = e3;
                    d3Var = d3VarM23850g;
                } catch (Throwable th) {
                    th = th;
                    d3Var = d3VarM23850g;
                }
                try {
                } catch (C6581k e4) {
                    e = e4;
                    d3Var2 = d3Var;
                    cdj.toq(e, this.$this_unsafeFlow);
                    r1 = d3Var2;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = d3Var;
                    d3.C6493k.toq(r1, null, 1, null);
                    throw th;
                }
                if (C6578g.m24129q(f7l8VarPlus, wasVar, null, toqVar, this, 4, null) == objX2) {
                    return objX2;
                }
                r1 = d3Var;
                d3.C6493k.toq(r1, null, 1, null);
                return was.f36763k;
                cdj.toq(e, this.$this_unsafeFlow);
                r1 = d3Var2;
                d3.C6493k.toq(r1, null, 1, null);
                return was.f36763k;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @nn86
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public static final <R, T> Object m24135k(@InterfaceC7396q InterfaceC6618p<? super R> interfaceC6618p, @InterfaceC7396q InterfaceC6622s<? extends T>[] interfaceC6622sArr, @InterfaceC7396q InterfaceC5981k<T[]> interfaceC5981k, @InterfaceC7396q cyoe.cdj<? super InterfaceC6618p<? super R>, ? super T[], ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
        Object objM24130k = C6579h.m24130k(new C6588k(interfaceC6622sArr, interfaceC5981k, cdjVar, interfaceC6618p, null), interfaceC6216q);
        return objM24130k == C6199q.x2() ? objM24130k : was.f36763k;
    }

    @InterfaceC7396q
    public static final <T1, T2, R> InterfaceC6622s<R> toq(@InterfaceC7396q InterfaceC6622s<? extends T1> interfaceC6622s, @InterfaceC7396q InterfaceC6622s<? extends T2> interfaceC6622s2, @InterfaceC7396q cyoe.cdj<? super T1, ? super T2, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar) {
        return new toq(interfaceC6622s2, interfaceC6622s, cdjVar);
    }
}

package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.i1;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\n\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001ad\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\u0010\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\b\u001aj\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\n*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u000125\b\u0004\u0010\u0010\u001a/\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\b\u001a\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aJ\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\b\u001a~\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a~\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001an\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012F\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "Lkotlin/Function2;", "Lkotlin/coroutines/q;", "", "", "predicate", "k", "(Lkotlinx/coroutines/flow/s;Lcyoe/h;)Lkotlinx/coroutines/flow/s;", "zy", "R", "toq", "q", "Lkotlin/c;", "name", "value", "transform", "n", C7704k.y.toq.f95579toq, "Lkotlin/collections/x9kr;", "ld6", "Lkotlin/was;", "action", "f7l8", "initial", "Lkotlin/Function3;", "accumulator", "operation", "p", "(Lkotlinx/coroutines/flow/s;Ljava/lang/Object;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", AnimatedProperty.PROPERTY_NAME_Y, C7704k.y.toq.f44691k, "(Lkotlinx/coroutines/flow/s;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class wvg {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/i$f7l8"}, m22787k = 1, mv = {1, 6, 0})
    public static final class f7l8<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37098k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h f37099q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$f7l8$k */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx/coroutines/flow/i$y", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class C6628k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC6618p f37100k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ InterfaceC5979h f37101q;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$f7l8$k$k */
            /* JADX INFO: compiled from: Emitters.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m22756f = "Transform.kt", m22757i = {0, 0}, m22758l = {223, 224}, m22759m = "emit", m22760n = {"value", "$this$onEach_u24lambda_u2d7"}, m22761s = {"L$0", "L$1"})
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
                    return C6628k.this.emit(null, this);
                }
            }

            public C6628k(InterfaceC6618p interfaceC6618p, InterfaceC5979h interfaceC5979h) {
                this.f37100k = interfaceC6618p;
                this.f37101q = interfaceC5979h;
            }

            /* JADX WARN: Multi-variable type inference failed */
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
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.wvg.f7l8.C6628k.k
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.wvg$f7l8$k$k r0 = (kotlinx.coroutines.flow.wvg.f7l8.C6628k.k) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.wvg$f7l8$k$k r0 = new kotlinx.coroutines.flow.wvg$f7l8$k$k
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C6318m.n7h(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.L$1
                    kotlinx.coroutines.flow.p r6 = (kotlinx.coroutines.flow.InterfaceC6618p) r6
                    java.lang.Object r2 = r0.L$0
                    kotlin.C6318m.n7h(r7)
                    goto L5c
                L3e:
                    kotlin.C6318m.n7h(r7)
                    kotlinx.coroutines.flow.p r7 = r5.f37100k
                    cyoe.h r2 = r5.f37101q
                    r0.L$0 = r6
                    r0.L$1 = r7
                    r0.label = r4
                    r4 = 6
                    kotlin.jvm.internal.d3.m23089n(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.d3.m23089n(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.L$0 = r7
                    r0.L$1 = r7
                    r0.label = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    kotlin.was r6 = kotlin.was.f36763k
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.wvg.f7l8.C6628k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
            }
        }

        public f7l8(InterfaceC6622s interfaceC6622s, InterfaceC5979h interfaceC5979h) {
            this.f37098k = interfaceC6622s;
            this.f37099q = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            Object objMo5262k = this.f37098k.mo5262k(new C6628k(interfaceC6618p, this.f37099q), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$g */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/i$f7l8"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6629g<R> implements InterfaceC6622s<R> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37102k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h f37103q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$g$k */
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
                return C6629g.this.mo5262k(null, this);
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$g$toq */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx/coroutines/flow/i$y", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class toq<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC6618p f37104k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ InterfaceC5979h f37105q;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$g$toq$k */
            /* JADX INFO: compiled from: Emitters.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", m22756f = "Transform.kt", m22757i = {0}, m22758l = {223, 224}, m22759m = "emit", m22760n = {"$this$mapNotNull_u24lambda_u2d5"}, m22761s = {"L$0"})
            @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
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
                    return toq.this.emit(null, this);
                }
            }

            public toq(InterfaceC6618p interfaceC6618p, InterfaceC5979h interfaceC5979h) {
                this.f37104k = interfaceC6618p;
                this.f37105q = interfaceC5979h;
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
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.wvg.C6629g.toq.k
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.wvg$g$toq$k r0 = (kotlinx.coroutines.flow.wvg.C6629g.toq.k) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.wvg$g$toq$k r0 = new kotlinx.coroutines.flow.wvg$g$toq$k
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
                    goto L60
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
                    kotlinx.coroutines.flow.p r8 = r6.f37104k
                    cyoe.h r2 = r6.f37105q
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
                    if (r8 != 0) goto L54
                    goto L60
                L54:
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L60
                    return r1
                L60:
                    kotlin.was r7 = kotlin.was.f36763k
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.wvg.C6629g.toq.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @InterfaceC7395n
            /* JADX INFO: renamed from: k */
            public final Object m24254k(Object obj, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
                kotlin.jvm.internal.d3.m23089n(4);
                new k(interfaceC6216q);
                kotlin.jvm.internal.d3.m23089n(5);
                InterfaceC6618p interfaceC6618p = this.f37104k;
                Object objInvoke = this.f37105q.invoke(obj, interfaceC6216q);
                if (objInvoke != null) {
                    kotlin.jvm.internal.d3.m23089n(0);
                    interfaceC6618p.emit(objInvoke, interfaceC6216q);
                    kotlin.jvm.internal.d3.m23089n(1);
                }
                return was.f36763k;
            }
        }

        public C6629g(InterfaceC6622s interfaceC6622s, InterfaceC5979h interfaceC5979h) {
            this.f37102k = interfaceC6622s;
            this.f37103q = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            Object objMo5262k = this.f37102k.mo5262k(new toq(interfaceC6618p, this.f37103q), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public Object m24253y(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new k(interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            InterfaceC6622s interfaceC6622s = this.f37102k;
            toq toqVar = new toq(interfaceC6618p, this.f37103q);
            kotlin.jvm.internal.d3.m23089n(0);
            interfaceC6622s.mo5262k(toqVar, interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$k */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/i$f7l8"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6630k<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37106k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h f37107q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$k$k */
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
                return C6630k.this.mo5262k(null, this);
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$k$toq */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx/coroutines/flow/i$y", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class toq<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC6618p f37108k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ InterfaceC5979h f37109q;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$k$toq$k */
            /* JADX INFO: compiled from: Emitters.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", m22756f = "Transform.kt", m22757i = {0, 0}, m22758l = {223, 223}, m22759m = "emit", m22760n = {"value", "$this$filter_u24lambda_u2d0"}, m22761s = {"L$0", "L$1"})
            @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
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

            public toq(InterfaceC6618p interfaceC6618p, InterfaceC5979h interfaceC5979h) {
                this.f37108k = interfaceC6618p;
                this.f37109q = interfaceC5979h;
            }

            /* JADX WARN: Multi-variable type inference failed */
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
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.wvg.C6630k.toq.k
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.wvg$k$toq$k r0 = (kotlinx.coroutines.flow.wvg.C6630k.toq.k) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.wvg$k$toq$k r0 = new kotlinx.coroutines.flow.wvg$k$toq$k
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C6318m.n7h(r8)
                    goto L6c
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.L$1
                    kotlinx.coroutines.flow.p r7 = (kotlinx.coroutines.flow.InterfaceC6618p) r7
                    java.lang.Object r2 = r0.L$0
                    kotlin.C6318m.n7h(r8)
                    goto L56
                L3e:
                    kotlin.C6318m.n7h(r8)
                    kotlinx.coroutines.flow.p r8 = r6.f37108k
                    cyoe.h r2 = r6.f37109q
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.label = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
                    if (r2 != r1) goto L52
                    return r1
                L52:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L56:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L6c
                    r8 = 0
                    r0.L$0 = r8
                    r0.L$1 = r8
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L6c
                    return r1
                L6c:
                    kotlin.was r7 = kotlin.was.f36763k
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.wvg.C6630k.toq.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
            }

            @InterfaceC7395n
            /* JADX INFO: renamed from: k */
            public final Object m24256k(Object obj, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
                kotlin.jvm.internal.d3.m23089n(4);
                new k(interfaceC6216q);
                kotlin.jvm.internal.d3.m23089n(5);
                InterfaceC6618p interfaceC6618p = this.f37108k;
                if (((Boolean) this.f37109q.invoke(obj, interfaceC6216q)).booleanValue()) {
                    kotlin.jvm.internal.d3.m23089n(0);
                    interfaceC6618p.emit(obj, interfaceC6216q);
                    kotlin.jvm.internal.d3.m23089n(1);
                }
                return was.f36763k;
            }
        }

        public C6630k(InterfaceC6622s interfaceC6622s, InterfaceC5979h interfaceC5979h) {
            this.f37106k = interfaceC6622s;
            this.f37107q = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            Object objMo5262k = this.f37106k.mo5262k(new toq(interfaceC6618p, this.f37107q), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public Object m24255y(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new k(interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            InterfaceC6622s interfaceC6622s = this.f37106k;
            toq toqVar = new toq(interfaceC6618p, this.f37107q);
            kotlin.jvm.internal.d3.m23089n(0);
            interfaceC6622s.mo5262k(toqVar, interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: compiled from: Transform.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class ld6<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6299y<Object> f37110k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ InterfaceC6618p<T> f37111n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.cdj<T, T, InterfaceC6216q<? super T>, Object> f37112q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$ld6$k */
        /* JADX INFO: compiled from: Transform.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", m22756f = "Transform.kt", m22757i = {0}, m22758l = {125, 127}, m22759m = "emit", m22760n = {"this"}, m22761s = {"L$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class C6631k extends AbstractC6209q {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ ld6<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C6631k(ld6<? super T> ld6Var, InterfaceC6216q<? super C6631k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = ld6Var;
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
        ld6(i1.C6299y<Object> c6299y, cyoe.cdj<? super T, ? super T, ? super InterfaceC6216q<? super T>, ? extends Object> cdjVar, InterfaceC6618p<? super T> interfaceC6618p) {
            this.f37110k = c6299y;
            this.f37112q = cdjVar;
            this.f37111n = interfaceC6618p;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[RETURN] */
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
        public final java.lang.Object emit(T r8, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.wvg.ld6.C6631k
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.wvg$ld6$k r0 = (kotlinx.coroutines.flow.wvg.ld6.C6631k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.wvg$ld6$k r0 = new kotlinx.coroutines.flow.wvg$ld6$k
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C6318m.n7h(r9)
                goto L79
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.L$1
                kotlin.jvm.internal.i1$y r8 = (kotlin.jvm.internal.i1.C6299y) r8
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.wvg$ld6 r2 = (kotlinx.coroutines.flow.wvg.ld6) r2
                kotlin.C6318m.n7h(r9)
                goto L60
            L40:
                kotlin.C6318m.n7h(r9)
                kotlin.jvm.internal.i1$y<java.lang.Object> r9 = r7.f37110k
                T r2 = r9.element
                kotlinx.coroutines.internal.l r5 = kotlinx.coroutines.flow.internal.fn3e.f36987k
                if (r2 != r5) goto L4d
                r2 = r7
                goto L63
            L4d:
                cyoe.cdj<T, T, kotlin.coroutines.q<? super T>, java.lang.Object> r5 = r7.f37112q
                r0.L$0 = r7
                r0.L$1 = r9
                r0.label = r4
                java.lang.Object r8 = r5.invoke(r2, r8, r0)
                if (r8 != r1) goto L5c
                return r1
            L5c:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L60:
                r6 = r9
                r9 = r8
                r8 = r6
            L63:
                r9.element = r8
                kotlinx.coroutines.flow.p<T> r8 = r2.f37111n
                kotlin.jvm.internal.i1$y<java.lang.Object> r9 = r2.f37110k
                T r9 = r9.element
                r2 = 0
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L79
                return r1
            L79:
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.wvg.ld6.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$n */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/i$f7l8"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6632n<R> implements InterfaceC6622s<R> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37113k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h f37114q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$n$k */
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
                return C6632n.this.mo5262k(null, this);
            }
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$n$toq */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx/coroutines/flow/i$y", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class toq<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC6618p f37115k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ InterfaceC5979h f37116q;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$n$toq$k */
            /* JADX INFO: compiled from: Emitters.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", m22756f = "Transform.kt", m22757i = {}, m22758l = {223, 223}, m22759m = "emit", m22760n = {}, m22761s = {})
            @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
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
                    return toq.this.emit(null, this);
                }
            }

            public toq(InterfaceC6618p interfaceC6618p, InterfaceC5979h interfaceC5979h) {
                this.f37115k = interfaceC6618p;
                this.f37116q = interfaceC5979h;
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
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.wvg.C6632n.toq.k
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.wvg$n$toq$k r0 = (kotlinx.coroutines.flow.wvg.C6632n.toq.k) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.wvg$n$toq$k r0 = new kotlinx.coroutines.flow.wvg$n$toq$k
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
                    kotlinx.coroutines.flow.p r8 = r6.f37115k
                    cyoe.h r2 = r6.f37116q
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
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.wvg.C6632n.toq.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @InterfaceC7395n
            /* JADX INFO: renamed from: k */
            public final Object m24258k(Object obj, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
                kotlin.jvm.internal.d3.m23089n(4);
                new k(interfaceC6216q);
                kotlin.jvm.internal.d3.m23089n(5);
                InterfaceC6618p interfaceC6618p = this.f37115k;
                Object objInvoke = this.f37116q.invoke(obj, interfaceC6216q);
                kotlin.jvm.internal.d3.m23089n(0);
                interfaceC6618p.emit(objInvoke, interfaceC6216q);
                kotlin.jvm.internal.d3.m23089n(1);
                return was.f36763k;
            }
        }

        public C6632n(InterfaceC6622s interfaceC6622s, InterfaceC5979h interfaceC5979h) {
            this.f37113k = interfaceC6622s;
            this.f37114q = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            Object objMo5262k = this.f37113k.mo5262k(new toq(interfaceC6618p, this.f37114q), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public Object m24257y(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new k(interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            InterfaceC6622s interfaceC6622s = this.f37113k;
            toq toqVar = new toq(interfaceC6618p, this.f37114q);
            kotlin.jvm.internal.d3.m23089n(0);
            interfaceC6622s.mo5262k(toqVar, interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$p */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6633p<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37117k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.cdj f37118q;

        public C6633p(InterfaceC6622s interfaceC6622s, cyoe.cdj cdjVar) {
            this.f37117k = interfaceC6622s;
            this.f37118q = cdjVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            i1.C6299y c6299y = new i1.C6299y();
            c6299y.element = (T) kotlinx.coroutines.flow.internal.fn3e.f36987k;
            Object objMo5262k = this.f37117k.mo5262k(new ld6(c6299y, this.f37118q, interfaceC6618p), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$q */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/i$f7l8"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6634q<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37119k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$q$k */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx/coroutines/flow/i$y", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class k<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC6618p f37120k;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$q$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", m22756f = "Transform.kt", m22757i = {}, m22758l = {223}, m22759m = "emit", m22760n = {}, m22761s = {})
            @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
            public static final class C8086k extends AbstractC6209q {
                int label;
                /* synthetic */ Object result;

                public C8086k(InterfaceC6216q interfaceC6216q) {
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

            public k(InterfaceC6618p interfaceC6618p) {
                this.f37120k = interfaceC6618p;
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
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.wvg.C6634q.k.C8086k
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.wvg$q$k$k r0 = (kotlinx.coroutines.flow.wvg.C6634q.k.C8086k) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.wvg$q$k$k r0 = new kotlinx.coroutines.flow.wvg$q$k$k
                    r0.<init>(r6)
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
                    kotlinx.coroutines.flow.p r6 = r4.f37120k
                    if (r5 == 0) goto L41
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    kotlin.was r5 = kotlin.was.f36763k
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.wvg.C6634q.k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
            }
        }

        public C6634q(InterfaceC6622s interfaceC6622s) {
            this.f37119k = interfaceC6622s;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            Object objMo5262k = this.f37119k.mo5262k(new k(interfaceC6618p), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }
    }

    /* JADX INFO: compiled from: Transform.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class qrj<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6618p<kotlin.collections.x9kr<? extends T>> f37121k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ i1.C6294g f37122q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$qrj$k */
        /* JADX INFO: compiled from: Transform.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", m22756f = "Transform.kt", m22757i = {}, m22758l = {65}, m22759m = "emit", m22760n = {}, m22761s = {})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class C6635k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ qrj<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C6635k(qrj<? super T> qrjVar, InterfaceC6216q<? super C6635k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = qrjVar;
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
        qrj(InterfaceC6618p<? super kotlin.collections.x9kr<? extends T>> interfaceC6618p, i1.C6294g c6294g) {
            this.f37121k = interfaceC6618p;
            this.f37122q = c6294g;
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
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.wvg.qrj.C6635k
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.wvg$qrj$k r0 = (kotlinx.coroutines.flow.wvg.qrj.C6635k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.wvg$qrj$k r0 = new kotlinx.coroutines.flow.wvg$qrj$k
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C6318m.n7h(r9)
                goto L4e
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                kotlin.C6318m.n7h(r9)
                kotlinx.coroutines.flow.p<kotlin.collections.x9kr<? extends T>> r9 = r7.f37121k
                kotlin.collections.x9kr r2 = new kotlin.collections.x9kr
                kotlin.jvm.internal.i1$g r4 = r7.f37122q
                int r5 = r4.element
                int r6 = r5 + 1
                r4.element = r6
                if (r5 < 0) goto L51
                r2.<init>(r5, r8)
                r0.label = r3
                java.lang.Object r8 = r9.emit(r2, r0)
                if (r8 != r1) goto L4e
                return r1
            L4e:
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            L51:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.wvg.qrj.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$s */
    /* JADX INFO: compiled from: Transform.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6636s<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ i1.C6299y<R> f37123k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ InterfaceC6618p<R> f37124n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.cdj<R, T, InterfaceC6216q<? super R>, Object> f37125q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$s$k */
        /* JADX INFO: compiled from: Transform.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", m22756f = "Transform.kt", m22757i = {0}, m22758l = {103, 104}, m22759m = "emit", m22760n = {"this"}, m22761s = {"L$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class k extends AbstractC6209q {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ C6636s<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(C6636s<? super T> c6636s, InterfaceC6216q<? super k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = c6636s;
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
        C6636s(i1.C6299y<R> c6299y, cyoe.cdj<? super R, ? super T, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar, InterfaceC6618p<? super R> interfaceC6618p) {
            this.f37123k = c6299y;
            this.f37125q = cdjVar;
            this.f37124n = interfaceC6618p;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.wvg.C6636s.k
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.wvg$s$k r0 = (kotlinx.coroutines.flow.wvg.C6636s.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.wvg$s$k r0 = new kotlinx.coroutines.flow.wvg$s$k
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C6318m.n7h(r9)
                goto L70
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                java.lang.Object r8 = r0.L$1
                kotlin.jvm.internal.i1$y r8 = (kotlin.jvm.internal.i1.C6299y) r8
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.wvg$s r2 = (kotlinx.coroutines.flow.wvg.C6636s) r2
                kotlin.C6318m.n7h(r9)
                goto L5a
            L40:
                kotlin.C6318m.n7h(r9)
                kotlin.jvm.internal.i1$y<R> r9 = r7.f37123k
                cyoe.cdj<R, T, kotlin.coroutines.q<? super R>, java.lang.Object> r2 = r7.f37125q
                T r5 = r9.element
                r0.L$0 = r7
                r0.L$1 = r9
                r0.label = r4
                java.lang.Object r8 = r2.invoke(r5, r8, r0)
                if (r8 != r1) goto L56
                return r1
            L56:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L5a:
                r8.element = r9
                kotlinx.coroutines.flow.p<R> r8 = r2.f37124n
                kotlin.jvm.internal.i1$y<R> r9 = r2.f37123k
                T r9 = r9.element
                r2 = 0
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L70
                return r1
            L70:
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.wvg.C6636s.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/wvg$k"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq implements InterfaceC6622s<Object> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37126k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$toq$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class C6637k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;

            public C6637k(InterfaceC6216q interfaceC6216q) {
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

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx/coroutines/flow/wvg$k$toq", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class C8087toq<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC6618p f37127k;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$toq$toq$k */
            /* JADX INFO: compiled from: Emitters.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", m22756f = "Transform.kt", m22757i = {}, m22758l = {224}, m22759m = "emit", m22760n = {}, m22761s = {})
            @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
            public static final class C6638k extends AbstractC6209q {
                Object L$0;
                Object L$1;
                int label;
                /* synthetic */ Object result;

                public C6638k(InterfaceC6216q interfaceC6216q) {
                    super(interfaceC6216q);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
                @InterfaceC7395n
                public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return C8087toq.this.emit(null, this);
                }
            }

            public C8087toq(InterfaceC6618p interfaceC6618p) {
                this.f37127k = interfaceC6618p;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC6618p
            @mub.InterfaceC7395n
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.wvg.toq.C8087toq.C6638k
                    if (r0 == 0) goto L13
                    r0 = r7
                    kotlinx.coroutines.flow.wvg$toq$toq$k r0 = (kotlinx.coroutines.flow.wvg.toq.C8087toq.C6638k) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.wvg$toq$toq$k r0 = new kotlinx.coroutines.flow.wvg$toq$toq$k
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C6318m.n7h(r7)
                    goto L49
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C6318m.n7h(r7)
                    kotlinx.coroutines.flow.p r7 = r5.f37127k
                    r2 = 3
                    java.lang.String r4 = "R"
                    kotlin.jvm.internal.d2ok.m23086z(r2, r4)
                    boolean r2 = r6 instanceof java.lang.Object
                    if (r2 == 0) goto L49
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L49
                    return r1
                L49:
                    kotlin.was r6 = kotlin.was.f36763k
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.wvg.toq.C8087toq.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
            }

            @InterfaceC7395n
            /* JADX INFO: renamed from: k */
            public final Object m24260k(Object obj, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
                kotlin.jvm.internal.d3.m23089n(4);
                new C6638k(interfaceC6216q);
                kotlin.jvm.internal.d3.m23089n(5);
                InterfaceC6618p interfaceC6618p = this.f37127k;
                kotlin.jvm.internal.d2ok.m23086z(3, "R");
                if (obj instanceof Object) {
                    kotlin.jvm.internal.d3.m23089n(0);
                    interfaceC6618p.emit(obj, interfaceC6216q);
                    kotlin.jvm.internal.d3.m23089n(1);
                }
                return was.f36763k;
            }
        }

        public toq(InterfaceC6622s interfaceC6622s) {
            this.f37126k = interfaceC6622s;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super Object> interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            InterfaceC6622s interfaceC6622s = this.f37126k;
            kotlin.jvm.internal.d2ok.ni7();
            Object objMo5262k = interfaceC6622s.mo5262k(new C8087toq(interfaceC6618p), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public Object m24259y(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new C6637k(interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            InterfaceC6622s interfaceC6622s = this.f37126k;
            kotlin.jvm.internal.d2ok.ni7();
            C8087toq c8087toq = new C8087toq(interfaceC6618p);
            kotlin.jvm.internal.d3.m23089n(0);
            interfaceC6622s.mo5262k(c8087toq, interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class x2<T> implements InterfaceC6622s<kotlin.collections.x9kr<? extends T>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37128k;

        public x2(InterfaceC6622s interfaceC6622s) {
            this.f37128k = interfaceC6622s;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super kotlin.collections.x9kr<? extends T>> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            Object objMo5262k = this.f37128k.mo5262k(new qrj(interfaceC6618p, new i1.C6294g()), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$y */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6639y<R> implements InterfaceC6622s<R> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object f37129k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ cyoe.cdj f37130n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC6622s f37131q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$y$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", m22756f = "Transform.kt", m22757i = {0, 0, 0}, m22758l = {114, 115}, m22759m = "collect", m22760n = {"this", "$this$runningFold_u24lambda_u2d8", "accumulator"}, m22761s = {"L$0", "L$1", "L$2"})
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
                return C6639y.this.mo5262k(null, this);
            }
        }

        public C6639y(Object obj, InterfaceC6622s interfaceC6622s, cyoe.cdj cdjVar) {
            this.f37129k = obj;
            this.f37131q = interfaceC6622s;
            this.f37130n = cdjVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super R> r7, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.wvg.C6639y.k
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.wvg$y$k r0 = (kotlinx.coroutines.flow.wvg.C6639y.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.wvg$y$k r0 = new kotlinx.coroutines.flow.wvg$y$k
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C6318m.n7h(r8)
                goto L7b
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.L$2
                kotlin.jvm.internal.i1$y r7 = (kotlin.jvm.internal.i1.C6299y) r7
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.flow.p r2 = (kotlinx.coroutines.flow.InterfaceC6618p) r2
                java.lang.Object r4 = r0.L$0
                kotlinx.coroutines.flow.wvg$y r4 = (kotlinx.coroutines.flow.wvg.C6639y) r4
                kotlin.C6318m.n7h(r8)
                goto L62
            L44:
                kotlin.C6318m.n7h(r8)
                kotlin.jvm.internal.i1$y r8 = new kotlin.jvm.internal.i1$y
                r8.<init>()
                java.lang.Object r2 = r6.f37129k
                r8.element = r2
                r0.L$0 = r6
                r0.L$1 = r7
                r0.L$2 = r8
                r0.label = r4
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L5f
                return r1
            L5f:
                r4 = r6
                r2 = r7
                r7 = r8
            L62:
                kotlinx.coroutines.flow.s r8 = r4.f37131q
                kotlinx.coroutines.flow.wvg$s r5 = new kotlinx.coroutines.flow.wvg$s
                cyoe.cdj r4 = r4.f37130n
                r5.<init>(r7, r4, r2)
                r7 = 0
                r0.L$0 = r7
                r0.L$1 = r7
                r0.L$2 = r7
                r0.label = r3
                java.lang.Object r7 = r8.mo5262k(r5, r0)
                if (r7 != r1) goto L7b
                return r1
            L7b:
                kotlin.was r7 = kotlin.was.f36763k
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.wvg.C6639y.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/i$f7l8"}, m22787k = 1, mv = {1, 6, 0})
    public static final class zy<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f37132k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h f37133q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$zy$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class C6640k extends AbstractC6209q {
            int label;
            /* synthetic */ Object result;

            public C6640k(InterfaceC6216q interfaceC6216q) {
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

        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {C0846k.zaso, "R", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx/coroutines/flow/i$y", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
        public static final class toq<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC6618p f37134k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ InterfaceC5979h f37135q;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.wvg$zy$toq$k */
            /* JADX INFO: compiled from: Emitters.kt */
            @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", m22756f = "Transform.kt", m22757i = {0, 0}, m22758l = {223, 223}, m22759m = "emit", m22760n = {"value", "$this$filterNot_u24lambda_u2d1"}, m22761s = {"L$0", "L$1"})
            @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 176)
            public static final class C6641k extends AbstractC6209q {
                Object L$0;
                Object L$1;
                int label;
                /* synthetic */ Object result;

                public C6641k(InterfaceC6216q interfaceC6216q) {
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

            public toq(InterfaceC6618p interfaceC6618p, InterfaceC5979h interfaceC5979h) {
                this.f37134k = interfaceC6618p;
                this.f37135q = interfaceC5979h;
            }

            /* JADX WARN: Multi-variable type inference failed */
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
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.wvg.zy.toq.C6641k
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.wvg$zy$toq$k r0 = (kotlinx.coroutines.flow.wvg.zy.toq.C6641k) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.wvg$zy$toq$k r0 = new kotlinx.coroutines.flow.wvg$zy$toq$k
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C6318m.n7h(r8)
                    goto L6c
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.L$1
                    kotlinx.coroutines.flow.p r7 = (kotlinx.coroutines.flow.InterfaceC6618p) r7
                    java.lang.Object r2 = r0.L$0
                    kotlin.C6318m.n7h(r8)
                    goto L56
                L3e:
                    kotlin.C6318m.n7h(r8)
                    kotlinx.coroutines.flow.p r8 = r6.f37134k
                    cyoe.h r2 = r6.f37135q
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.label = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
                    if (r2 != r1) goto L52
                    return r1
                L52:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L56:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 != 0) goto L6c
                    r8 = 0
                    r0.L$0 = r8
                    r0.L$1 = r8
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L6c
                    return r1
                L6c:
                    kotlin.was r7 = kotlin.was.f36763k
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.wvg.zy.toq.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
            }

            @InterfaceC7395n
            /* JADX INFO: renamed from: k */
            public final Object m24262k(Object obj, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
                kotlin.jvm.internal.d3.m23089n(4);
                new C6641k(interfaceC6216q);
                kotlin.jvm.internal.d3.m23089n(5);
                InterfaceC6618p interfaceC6618p = this.f37134k;
                if (!((Boolean) this.f37135q.invoke(obj, interfaceC6216q)).booleanValue()) {
                    kotlin.jvm.internal.d3.m23089n(0);
                    interfaceC6618p.emit(obj, interfaceC6216q);
                    kotlin.jvm.internal.d3.m23089n(1);
                }
                return was.f36763k;
            }
        }

        public zy(InterfaceC6622s interfaceC6622s, InterfaceC5979h interfaceC5979h) {
            this.f37132k = interfaceC6622s;
            this.f37133q = interfaceC5979h;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            Object objMo5262k = this.f37132k.mo5262k(new toq(interfaceC6618p, this.f37133q), interfaceC6216q);
            return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: y */
        public Object m24261y(@InterfaceC7396q InterfaceC6618p interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
            kotlin.jvm.internal.d3.m23089n(4);
            new C6640k(interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(5);
            InterfaceC6622s interfaceC6622s = this.f37132k;
            toq toqVar = new toq(interfaceC6618p, this.f37133q);
            kotlin.jvm.internal.d3.m23089n(0);
            interfaceC6622s.mo5262k(toqVar, interfaceC6216q);
            kotlin.jvm.internal.d3.m23089n(1);
            return was.f36763k;
        }
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> f7l8(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        return new f7l8(interfaceC6622s, interfaceC5979h);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final <T, R> InterfaceC6622s<R> m24246g(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        return new C6629g(interfaceC6622s, interfaceC5979h);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> InterfaceC6622s<T> m24247k(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super Boolean>, ? extends Object> interfaceC5979h) {
        return new C6630k(interfaceC6622s, interfaceC5979h);
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<kotlin.collections.x9kr<T>> ld6(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s) {
        return new x2(interfaceC6622s);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final <T, R> InterfaceC6622s<R> m24248n(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super R>, ? extends Object> interfaceC5979h) {
        return new C6632n(interfaceC6622s, interfaceC5979h);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final <T, R> InterfaceC6622s<R> m24249p(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, R r2, @InterfaceC7396q @kotlin.toq cyoe.cdj<? super R, ? super T, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar) {
        return kotlinx.coroutines.flow.ld6.pc(interfaceC6622s, r2, cdjVar);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final <T> InterfaceC6622s<T> m24250q(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s) {
        return new C6634q(interfaceC6622s);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final <T> InterfaceC6622s<T> m24251s(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q cyoe.cdj<? super T, ? super T, ? super InterfaceC6216q<? super T>, ? extends Object> cdjVar) {
        return new C6633p(interfaceC6622s, cdjVar);
    }

    public static final /* synthetic */ <R> InterfaceC6622s<R> toq(InterfaceC6622s<?> interfaceC6622s) {
        kotlin.jvm.internal.d2ok.ni7();
        return new toq(interfaceC6622s);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final <T, R> InterfaceC6622s<R> m24252y(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, R r2, @InterfaceC7396q @kotlin.toq cyoe.cdj<? super R, ? super T, ? super InterfaceC6216q<? super R>, ? extends Object> cdjVar) {
        return new C6639y(r2, interfaceC6622s, cdjVar);
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> zy(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q InterfaceC5979h<? super T, ? super InterfaceC6216q<? super Boolean>, ? extends Object> interfaceC5979h) {
        return new zy(interfaceC6622s, interfaceC5979h);
    }
}

package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.util.Iterator;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.was;
import kotlinx.coroutines.mu;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0007\u001a8\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0012\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0016\"\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0012\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020\u001f\u001a\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020\"\u001a\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020%\u001a\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020'\u001aM\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b*\u0010\n\u001aM\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b+\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {C0846k.zaso, "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/p;", "Lkotlin/coroutines/q;", "Lkotlin/was;", "", "Lkotlin/fn3e;", "block", "Lkotlinx/coroutines/flow/s;", "n7h", "(Lcyoe/h;)Lkotlinx/coroutines/flow/s;", "Lkotlin/Function0;", "k", "Lkotlin/Function1;", "toq", "(Lcyoe/x2;)Lkotlinx/coroutines/flow/s;", "", "zy", "", "q", "Lkotlin/sequences/qrj;", "f7l8", "", "elements", AnimatedProperty.PROPERTY_NAME_H, "([Ljava/lang/Object;)Lkotlinx/coroutines/flow/s;", "value", "kja0", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/s;", "qrj", "p", "", "", AnimatedProperty.PROPERTY_NAME_Y, "", "", C7704k.y.toq.f44691k, "Lkotlin/ranges/x2;", "n", "Lkotlin/ranges/kja0;", C7704k.y.toq.f95579toq, "Lkotlinx/coroutines/channels/jp0y;", "x2", "ld6", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class x2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class f7l8<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object[] f37136k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$f7l8$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", m22756f = "Builders.kt", m22757i = {0}, m22758l = {115}, m22759m = "collect", m22760n = {"$this$asFlow_u24lambda_u2d11"}, m22761s = {"L$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class C6642k extends AbstractC6209q {
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C6642k(InterfaceC6216q interfaceC6216q) {
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

        public f7l8(Object[] objArr) {
            this.f37136k = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super T> r8, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.x2.f7l8.C6642k
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.x2$f7l8$k r0 = (kotlinx.coroutines.flow.x2.f7l8.C6642k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.x2$f7l8$k r0 = new kotlinx.coroutines.flow.x2$f7l8$k
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.I$1
                int r2 = r0.I$0
                java.lang.Object r4 = r0.L$1
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.p r5 = (kotlinx.coroutines.flow.InterfaceC6618p) r5
                kotlin.C6318m.n7h(r9)
                r9 = r5
                goto L49
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                kotlin.C6318m.n7h(r9)
                java.lang.Object[] r9 = r7.f37136k
                r2 = 0
                int r4 = r9.length
                r6 = r9
                r9 = r8
                r8 = r4
                r4 = r6
            L49:
                if (r2 >= r8) goto L60
                r5 = r4[r2]
                int r2 = r2 + 1
                r0.L$0 = r9
                r0.L$1 = r4
                r0.I$0 = r2
                r0.I$1 = r8
                r0.label = r3
                java.lang.Object r5 = r9.emit(r5, r0)
                if (r5 != r1) goto L49
                return r1
            L60:
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x2.f7l8.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$g */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6643g<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlin.sequences.qrj f37137k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$g$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", m22756f = "Builders.kt", m22757i = {0}, m22758l = {115}, m22759m = "collect", m22760n = {"$this$asFlow_u24lambda_u2d7"}, m22761s = {"L$0"})
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
                return C6643g.this.mo5262k(null, this);
            }
        }

        public C6643g(kotlin.sequences.qrj qrjVar) {
            this.f37137k = qrjVar;
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
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.x2.C6643g.k
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.x2$g$k r0 = (kotlinx.coroutines.flow.x2.C6643g.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.x2$g$k r0 = new kotlinx.coroutines.flow.x2$g$k
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.p r2 = (kotlinx.coroutines.flow.InterfaceC6618p) r2
                kotlin.C6318m.n7h(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                kotlin.C6318m.n7h(r7)
                kotlin.sequences.qrj r7 = r5.f37137k
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.L$0 = r7
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x2.C6643g.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$k */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6644k implements InterfaceC6622s<Long> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlin.ranges.kja0 f37138k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$k$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", m22756f = "Builders.kt", m22757i = {0}, m22758l = {115}, m22759m = "collect", m22760n = {"$this$asFlow_u24lambda_u2d19"}, m22761s = {"L$0"})
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
                return C6644k.this.mo5262k(null, this);
            }
        }

        public C6644k(kotlin.ranges.kja0 kja0Var) {
            this.f37138k = kja0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super java.lang.Long> r8, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.x2.C6644k.k
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.x2$k$k r0 = (kotlinx.coroutines.flow.x2.C6644k.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.x2$k$k r0 = new kotlinx.coroutines.flow.x2$k$k
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r8 = r0.L$1
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.p r2 = (kotlinx.coroutines.flow.InterfaceC6618p) r2
                kotlin.C6318m.n7h(r9)
                r9 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3a:
                kotlin.C6318m.n7h(r9)
                kotlin.ranges.kja0 r9 = r7.f37138k
                java.util.Iterator r9 = r9.iterator()
                r6 = r9
                r9 = r8
                r8 = r6
            L46:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L64
                r2 = r8
                kotlin.collections.hyr r2 = (kotlin.collections.hyr) r2
                long r4 = r2.nextLong()
                java.lang.Long r2 = kotlin.coroutines.jvm.internal.toq.f7l8(r4)
                r0.L$0 = r9
                r0.L$1 = r8
                r0.label = r3
                java.lang.Object r2 = r9.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L64:
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x2.C6644k.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class ld6<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object[] f37139k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$ld6$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", m22756f = "Builders.kt", m22757i = {0, 0}, m22758l = {114}, m22759m = "collect", m22760n = {"this", "$this$flowOf_u24lambda_u2d8"}, m22761s = {"L$0", "L$1"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class C6645k extends AbstractC6209q {
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C6645k(InterfaceC6216q interfaceC6216q) {
                super(interfaceC6216q);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return ld6.this.mo5262k(null, this);
            }
        }

        public ld6(Object[] objArr) {
            this.f37139k = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super T> r8, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.x2.ld6.C6645k
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.x2$ld6$k r0 = (kotlinx.coroutines.flow.x2.ld6.C6645k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.x2$ld6$k r0 = new kotlinx.coroutines.flow.x2$ld6$k
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L42
                if (r2 != r3) goto L3a
                int r8 = r0.I$1
                int r2 = r0.I$0
                java.lang.Object r4 = r0.L$1
                kotlinx.coroutines.flow.p r4 = (kotlinx.coroutines.flow.InterfaceC6618p) r4
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.x2$ld6 r5 = (kotlinx.coroutines.flow.x2.ld6) r5
                kotlin.C6318m.n7h(r9)
                r9 = r4
                r6 = r1
                r1 = r0
                r0 = r2
                r2 = r6
                goto L50
            L3a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L42:
                kotlin.C6318m.n7h(r9)
                r9 = 0
                java.lang.Object[] r2 = r7.f37139k
                int r2 = r2.length
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r1
                r1 = r0
                r0 = r6
            L50:
                if (r0 >= r8) goto L69
                java.lang.Object[] r4 = r5.f37139k
                r4 = r4[r0]
                int r0 = r0 + 1
                r1.L$0 = r5
                r1.L$1 = r9
                r1.I$0 = r0
                r1.I$1 = r8
                r1.label = r3
                java.lang.Object r4 = r9.emit(r4, r1)
                if (r4 != r2) goto L50
                return r2
            L69:
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x2.ld6.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$n */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6646n<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Iterator f37140k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$n$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", m22756f = "Builders.kt", m22757i = {0}, m22758l = {115}, m22759m = "collect", m22760n = {"$this$asFlow_u24lambda_u2d5"}, m22761s = {"L$0"})
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
                return C6646n.this.mo5262k(null, this);
            }
        }

        public C6646n(Iterator it) {
            this.f37140k = it;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.x2.C6646n.k
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.x2$n$k r0 = (kotlinx.coroutines.flow.x2.C6646n.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.x2$n$k r0 = new kotlinx.coroutines.flow.x2$n$k
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.p r2 = (kotlinx.coroutines.flow.InterfaceC6618p) r2
                kotlin.C6318m.n7h(r7)
                r7 = r2
                goto L42
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                kotlin.C6318m.n7h(r7)
                java.util.Iterator r7 = r5.f37140k
                r4 = r7
                r7 = r6
                r6 = r4
            L42:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L59
                java.lang.Object r2 = r6.next()
                r0.L$0 = r7
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L42
                return r1
            L59:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x2.C6646n.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$p */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6647p implements InterfaceC6622s<Integer> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ kotlin.ranges.x2 f37141k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$p$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", m22756f = "Builders.kt", m22757i = {0}, m22758l = {115}, m22759m = "collect", m22760n = {"$this$asFlow_u24lambda_u2d17"}, m22761s = {"L$0"})
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
                return C6647p.this.mo5262k(null, this);
            }
        }

        public C6647p(kotlin.ranges.x2 x2Var) {
            this.f37141k = x2Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super java.lang.Integer> r6, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.x2.C6647p.k
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.x2$p$k r0 = (kotlinx.coroutines.flow.x2.C6647p.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.x2$p$k r0 = new kotlinx.coroutines.flow.x2$p$k
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.p r2 = (kotlinx.coroutines.flow.InterfaceC6618p) r2
                kotlin.C6318m.n7h(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                kotlin.C6318m.n7h(r7)
                kotlin.ranges.x2 r7 = r5.f37141k
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L64
                r2 = r6
                kotlin.collections.n5r1 r2 = (kotlin.collections.n5r1) r2
                int r2 = r2.nextInt()
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.toq.m22765g(r2)
                r0.L$0 = r7
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L64:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x2.C6647p.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$q */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6648q<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Iterable f37142k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$q$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", m22756f = "Builders.kt", m22757i = {0}, m22758l = {115}, m22759m = "collect", m22760n = {"$this$asFlow_u24lambda_u2d3"}, m22761s = {"L$0"})
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
                return C6648q.this.mo5262k(null, this);
            }
        }

        public C6648q(Iterable iterable) {
            this.f37142k = iterable;
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
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.x2.C6648q.k
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.x2$q$k r0 = (kotlinx.coroutines.flow.x2.C6648q.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.x2$q$k r0 = new kotlinx.coroutines.flow.x2$q$k
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.p r2 = (kotlinx.coroutines.flow.InterfaceC6618p) r2
                kotlin.C6318m.n7h(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                kotlin.C6318m.n7h(r7)
                java.lang.Iterable r7 = r5.f37142k
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.L$0 = r7
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x2.C6648q.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$s */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6649s implements InterfaceC6622s<Long> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ long[] f37143k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$s$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", m22756f = "Builders.kt", m22757i = {0}, m22758l = {115}, m22759m = "collect", m22760n = {"$this$asFlow_u24lambda_u2d15"}, m22761s = {"L$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class k extends AbstractC6209q {
            int I$0;
            int I$1;
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
                return C6649s.this.mo5262k(null, this);
            }
        }

        public C6649s(long[] jArr) {
            this.f37143k = jArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super java.lang.Long> r9, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.x2.C6649s.k
                if (r0 == 0) goto L13
                r0 = r10
                kotlinx.coroutines.flow.x2$s$k r0 = (kotlinx.coroutines.flow.x2.C6649s.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.x2$s$k r0 = new kotlinx.coroutines.flow.x2$s$k
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r9 = r0.I$1
                int r2 = r0.I$0
                java.lang.Object r4 = r0.L$1
                long[] r4 = (long[]) r4
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.p r5 = (kotlinx.coroutines.flow.InterfaceC6618p) r5
                kotlin.C6318m.n7h(r10)
                r10 = r5
                goto L49
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                kotlin.C6318m.n7h(r10)
                long[] r10 = r8.f37143k
                r2 = 0
                int r4 = r10.length
                r7 = r10
                r10 = r9
                r9 = r4
                r4 = r7
            L49:
                if (r2 >= r9) goto L64
                r5 = r4[r2]
                int r2 = r2 + 1
                java.lang.Long r5 = kotlin.coroutines.jvm.internal.toq.f7l8(r5)
                r0.L$0 = r10
                r0.L$1 = r4
                r0.I$0 = r2
                r0.I$1 = r9
                r0.label = r3
                java.lang.Object r5 = r10.emit(r5, r0)
                if (r5 != r1) goto L49
                return r1
            L64:
                kotlin.was r9 = kotlin.was.f36763k
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x2.C6649s.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5981k f37144k;

        public toq(InterfaceC5981k interfaceC5981k) {
            this.f37144k = interfaceC5981k;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            Object objEmit = interfaceC6618p.emit((Object) this.f37144k.invoke(), interfaceC6216q);
            return objEmit == C6199q.x2() ? objEmit : was.f36763k;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$x2, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C8088x2<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object f37145k;

        public C8088x2(Object obj) {
            this.f37145k = obj;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
            Object objEmit = interfaceC6618p.emit((Object) this.f37145k, interfaceC6216q);
            return objEmit == C6199q.x2() ? objEmit : was.f36763k;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$y */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6650y implements InterfaceC6622s<Integer> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int[] f37146k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$y$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", m22756f = "Builders.kt", m22757i = {0}, m22758l = {115}, m22759m = "collect", m22760n = {"$this$asFlow_u24lambda_u2d13"}, m22761s = {"L$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class k extends AbstractC6209q {
            int I$0;
            int I$1;
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
                return C6650y.this.mo5262k(null, this);
            }
        }

        public C6650y(int[] iArr) {
            this.f37146k = iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super java.lang.Integer> r8, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.x2.C6650y.k
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.x2$y$k r0 = (kotlinx.coroutines.flow.x2.C6650y.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.x2$y$k r0 = new kotlinx.coroutines.flow.x2$y$k
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.I$1
                int r2 = r0.I$0
                java.lang.Object r4 = r0.L$1
                int[] r4 = (int[]) r4
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.p r5 = (kotlinx.coroutines.flow.InterfaceC6618p) r5
                kotlin.C6318m.n7h(r9)
                r9 = r5
                goto L49
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                kotlin.C6318m.n7h(r9)
                int[] r9 = r7.f37146k
                r2 = 0
                int r4 = r9.length
                r6 = r9
                r9 = r8
                r8 = r4
                r4 = r6
            L49:
                if (r2 >= r8) goto L64
                r5 = r4[r2]
                int r2 = r2 + 1
                java.lang.Integer r5 = kotlin.coroutines.jvm.internal.toq.m22765g(r5)
                r0.L$0 = r9
                r0.L$1 = r4
                r0.I$0 = r2
                r0.I$1 = r8
                r0.label = r3
                java.lang.Object r5 = r9.emit(r5, r0)
                if (r5 != r1) goto L49
                return r1
            L64:
                kotlin.was r8 = kotlin.was.f36763k
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x2.C6650y.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class zy<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2 f37147k;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.x2$zy$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", m22756f = "Builders.kt", m22757i = {}, m22758l = {113, 113}, m22759m = "collect", m22760n = {}, m22761s = {})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class C6651k extends AbstractC6209q {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public C6651k(InterfaceC6216q interfaceC6216q) {
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

        public zy(cyoe.x2 x2Var) {
            this.f37147k = x2Var;
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
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.x2.zy.C6651k
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.x2$zy$k r0 = (kotlinx.coroutines.flow.x2.zy.C6651k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.x2$zy$k r0 = new kotlinx.coroutines.flow.x2$zy$k
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C6318m.n7h(r7)
                goto L60
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.L$0
                kotlinx.coroutines.flow.p r6 = (kotlinx.coroutines.flow.InterfaceC6618p) r6
                kotlin.C6318m.n7h(r7)
                goto L54
            L3c:
                kotlin.C6318m.n7h(r7)
                cyoe.x2 r7 = r5.f37147k
                r0.L$0 = r6
                r0.label = r4
                r2 = 6
                kotlin.jvm.internal.d3.m23089n(r2)
                java.lang.Object r7 = r7.invoke(r0)
                r2 = 7
                kotlin.jvm.internal.d3.m23089n(r2)
                if (r7 != r1) goto L54
                return r1
            L54:
                r2 = 0
                r0.L$0 = r2
                r0.label = r3
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L60
                return r1
            L60:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x2.zy.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> f7l8(@InterfaceC7396q kotlin.sequences.qrj<? extends T> qrjVar) {
        return new C6643g(qrjVar);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final InterfaceC6622s<Long> m24263g(@InterfaceC7396q kotlin.ranges.kja0 kja0Var) {
        return new C6644k(kja0Var);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: h */
    public static final <T> InterfaceC6622s<T> m24264h(@InterfaceC7396q T... tArr) {
        return new ld6(tArr);
    }

    @InterfaceC7396q
    @mu
    /* JADX INFO: renamed from: k */
    public static final <T> InterfaceC6622s<T> m24265k(@InterfaceC7396q InterfaceC5981k<? extends T> interfaceC5981k) {
        return new toq(interfaceC5981k);
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> kja0(T t2) {
        return new C8088x2(t2);
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> ld6(@InterfaceC7396q @kotlin.toq InterfaceC5979h<? super kotlinx.coroutines.channels.jp0y<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        return new kotlinx.coroutines.flow.toq(interfaceC5979h, null, 0, null, 14, null);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final InterfaceC6622s<Integer> m24266n(@InterfaceC7396q kotlin.ranges.x2 x2Var) {
        return new C6647p(x2Var);
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> n7h(@InterfaceC7396q @kotlin.toq InterfaceC5979h<? super InterfaceC6618p<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        return new gvn7(interfaceC5979h);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public static final <T> InterfaceC6622s<T> m24267p(@InterfaceC7396q T[] tArr) {
        return new f7l8(tArr);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final <T> InterfaceC6622s<T> m24268q(@InterfaceC7396q Iterator<? extends T> it) {
        return new C6646n(it);
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> qrj() {
        return C6652y.f37148k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public static final InterfaceC6622s<Long> m24269s(@InterfaceC7396q long[] jArr) {
        return new C6649s(jArr);
    }

    @InterfaceC7396q
    @mu
    public static final <T> InterfaceC6622s<T> toq(@InterfaceC7396q cyoe.x2<? super InterfaceC6216q<? super T>, ? extends Object> x2Var) {
        return new zy(x2Var);
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> x2(@InterfaceC7396q @kotlin.toq InterfaceC5979h<? super kotlinx.coroutines.channels.jp0y<? super T>, ? super InterfaceC6216q<? super was>, ? extends Object> interfaceC5979h) {
        return new C6572g(interfaceC5979h, null, 0, null, 14, null);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final InterfaceC6622s<Integer> m24270y(@InterfaceC7396q int[] iArr) {
        return new C6650y(iArr);
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> zy(@InterfaceC7396q Iterable<? extends T> iterable) {
        return new C6648q(iterable);
    }
}

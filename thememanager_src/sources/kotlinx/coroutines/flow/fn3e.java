package kotlinx.coroutines.flow;

import androidx.exifinterface.media.C0846k;
import com.android.thememanager.settingssearch.C2690k;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.i1;
import kotlin.was;
import kotlinx.coroutines.gbni;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Errors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aj\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ae\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f23\b\u0002\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u007f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012W\u0010\u0013\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001f\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\"\u001a\u00020\u0012*\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/s;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/p;", "", "Lkotlin/c;", "name", "cause", "Lkotlin/coroutines/q;", "Lkotlin/was;", "", "Lkotlin/fn3e;", "action", "k", "(Lkotlinx/coroutines/flow/s;Lcyoe/cdj;)Lkotlinx/coroutines/flow/s;", "", "retries", "Lkotlin/Function2;", "", "predicate", "n", "(Lkotlinx/coroutines/flow/s;JLcyoe/h;)Lkotlinx/coroutines/flow/s;", "Lkotlin/Function4;", "attempt", "f7l8", "(Lkotlinx/coroutines/flow/s;Lcyoe/ki;)Lkotlinx/coroutines/flow/s;", "collector", "toq", "(Lkotlinx/coroutines/flow/s;Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "Lkotlin/coroutines/f7l8;", "coroutineContext", "zy", "(Ljava/lang/Throwable;Lkotlin/coroutines/f7l8;)Z", C2690k.k.f61039ld6, "q", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, m22787k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class fn3e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.fn3e$g */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6564g<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f36957k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.ki f36958q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.fn3e$g$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", m22756f = "Errors.kt", m22757i = {0, 0, 0, 0, 1, 1, 1, 1}, m22758l = {117, 119}, m22759m = "collect", m22760n = {"this", "$this$retryWhen_u24lambda_u2d2", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u2d2", "cause", "attempt"}, m22761s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class k extends AbstractC6209q {
            int I$0;
            long J$0;
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
                return C6564g.this.mo5262k(null, this);
            }
        }

        public C6564g(InterfaceC6622s interfaceC6622s, cyoe.ki kiVar) {
            this.f36957k = interfaceC6622s;
            this.f36958q = kiVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:31:0x00a9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0098 -> B:27:0x009b). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super T> r13, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r14) throws java.lang.Throwable {
            /*
                r12 = this;
                boolean r0 = r14 instanceof kotlinx.coroutines.flow.fn3e.C6564g.k
                if (r0 == 0) goto L13
                r0 = r14
                kotlinx.coroutines.flow.fn3e$g$k r0 = (kotlinx.coroutines.flow.fn3e.C6564g.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.fn3e$g$k r0 = new kotlinx.coroutines.flow.fn3e$g$k
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L52
                if (r2 == r4) goto L42
                if (r2 != r3) goto L3a
                long r5 = r0.J$0
                java.lang.Object r13 = r0.L$2
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.flow.p r2 = (kotlinx.coroutines.flow.InterfaceC6618p) r2
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.flow.fn3e$g r7 = (kotlinx.coroutines.flow.fn3e.C6564g) r7
                kotlin.C6318m.n7h(r14)
                goto L9b
            L3a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L42:
                int r13 = r0.I$0
                long r5 = r0.J$0
                java.lang.Object r2 = r0.L$1
                kotlinx.coroutines.flow.p r2 = (kotlinx.coroutines.flow.InterfaceC6618p) r2
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.flow.fn3e$g r7 = (kotlinx.coroutines.flow.fn3e.C6564g) r7
                kotlin.C6318m.n7h(r14)
                goto L75
            L52:
                kotlin.C6318m.n7h(r14)
                r5 = 0
                r14 = r12
            L58:
                r2 = 0
                kotlinx.coroutines.flow.s r7 = r14.f36957k
                r0.L$0 = r14
                r0.L$1 = r13
                r8 = 0
                r0.L$2 = r8
                r0.J$0 = r5
                r0.I$0 = r2
                r0.label = r4
                java.lang.Object r7 = kotlinx.coroutines.flow.ld6.zurt(r7, r13, r0)
                if (r7 != r1) goto L6f
                return r1
            L6f:
                r10 = r2
                r2 = r13
                r13 = r10
                r11 = r7
                r7 = r14
                r14 = r11
            L75:
                java.lang.Throwable r14 = (java.lang.Throwable) r14
                if (r14 == 0) goto La9
                cyoe.ki r13 = r7.f36958q
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.toq.f7l8(r5)
                r0.L$0 = r7
                r0.L$1 = r2
                r0.L$2 = r14
                r0.J$0 = r5
                r0.label = r3
                r9 = 6
                kotlin.jvm.internal.d3.m23089n(r9)
                java.lang.Object r13 = r13.invoke(r2, r14, r8, r0)
                r8 = 7
                kotlin.jvm.internal.d3.m23089n(r8)
                if (r13 != r1) goto L98
                return r1
            L98:
                r10 = r14
                r14 = r13
                r13 = r10
            L9b:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto La8
                r13 = 1
                long r5 = r5 + r13
                r13 = r4
                goto La9
            La8:
                throw r13
            La9:
                r14 = r7
                if (r13 != 0) goto Laf
                kotlin.was r13 = kotlin.was.f36763k
                return r13
            Laf:
                r13 = r2
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.fn3e.C6564g.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.fn3e$k */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/fu4$toq", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C6565k<T> implements InterfaceC6622s<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6622s f36959k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.cdj f36960q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.fn3e$k$k */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m22756f = "Errors.kt", m22757i = {0, 0}, m22758l = {113, 114}, m22759m = "collect", m22760n = {"this", "$this$catch_u24lambda_u2d0"}, m22761s = {"L$0", "L$1"})
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
                return C6565k.this.mo5262k(null, this);
            }
        }

        public C6565k(InterfaceC6622s interfaceC6622s, cyoe.cdj cdjVar) {
            this.f36959k = interfaceC6622s;
            this.f36960q = cdjVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6622s
        @mub.InterfaceC7395n
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo5262k(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super T> r6, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.fn3e.C6565k.k
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.fn3e$k$k r0 = (kotlinx.coroutines.flow.fn3e.C6565k.k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.fn3e$k$k r0 = new kotlinx.coroutines.flow.fn3e$k$k
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C6318m.n7h(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.L$1
                kotlinx.coroutines.flow.p r6 = (kotlinx.coroutines.flow.InterfaceC6618p) r6
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.fn3e$k r2 = (kotlinx.coroutines.flow.fn3e.C6565k) r2
                kotlin.C6318m.n7h(r7)
                goto L53
            L40:
                kotlin.C6318m.n7h(r7)
                kotlinx.coroutines.flow.s r7 = r5.f36959k
                r0.L$0 = r5
                r0.L$1 = r6
                r0.label = r4
                java.lang.Object r7 = kotlinx.coroutines.flow.ld6.zurt(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                cyoe.cdj r2 = r2.f36960q
                r4 = 0
                r0.L$0 = r4
                r0.L$1 = r4
                r0.label = r3
                r3 = 6
                kotlin.jvm.internal.d3.m23089n(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.d3.m23089n(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                kotlin.was r6 = kotlin.was.f36763k
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.fn3e.C6565k.mo5262k(kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.fn3e$n */
    /* JADX INFO: compiled from: Errors.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", m22756f = "Errors.kt", m22757i = {}, m22758l = {95}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {C0846k.zaso, "Lkotlinx/coroutines/flow/p;", "", "cause", "", "attempt", "", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6566n<T> extends kotlin.coroutines.jvm.internal.kja0 implements cyoe.ki<InterfaceC6618p<? super T>, Throwable, Long, InterfaceC6216q<? super Boolean>, Object> {
        final /* synthetic */ InterfaceC5979h<Throwable, InterfaceC6216q<? super Boolean>, Object> $predicate;
        final /* synthetic */ long $retries;
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6566n(long j2, InterfaceC5979h<? super Throwable, ? super InterfaceC6216q<? super Boolean>, ? extends Object> interfaceC5979h, InterfaceC6216q<? super C6566n> interfaceC6216q) {
            super(4, interfaceC6216q);
            this.$retries = j2;
            this.$predicate = interfaceC5979h;
        }

        @Override // cyoe.ki
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th, Long l2, InterfaceC6216q<? super Boolean> interfaceC6216q) {
            return invoke((InterfaceC6618p) obj, th, l2.longValue(), interfaceC6216q);
        }

        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super T> interfaceC6618p, @InterfaceC7396q Throwable th, long j2, @InterfaceC7395n InterfaceC6216q<? super Boolean> interfaceC6216q) {
            C6566n c6566n = new C6566n(this.$retries, this.$predicate, interfaceC6216q);
            c6566n.L$0 = th;
            c6566n.J$0 = j2;
            return c6566n.invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                Throwable th = (Throwable) this.L$0;
                if (this.J$0 < this.$retries) {
                    InterfaceC5979h<Throwable, InterfaceC6216q<? super Boolean>, Object> interfaceC5979h = this.$predicate;
                    this.label = 1;
                    obj = interfaceC5979h.invoke(th, this);
                    if (obj == objX2) {
                        return objX2;
                    }
                }
                return kotlin.coroutines.jvm.internal.toq.m22766k(z);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            boolean z2 = ((Boolean) obj).booleanValue();
            return kotlin.coroutines.jvm.internal.toq.m22766k(z2);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.fn3e$q */
    /* JADX INFO: compiled from: Errors.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", m22756f = "Errors.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @kotlin.d3(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {C0846k.zaso, "", "it", "", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class C6567q extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<Throwable, InterfaceC6216q<? super Boolean>, Object> {
        int label;

        C6567q(InterfaceC6216q<? super C6567q> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C6567q(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q Throwable th, @InterfaceC7395n InterfaceC6216q<? super Boolean> interfaceC6216q) {
            return ((C6567q) create(th, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            return kotlin.coroutines.jvm.internal.toq.m22766k(true);
        }
    }

    /* JADX INFO: compiled from: Errors.kt */
    @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m22756f = "Errors.kt", m22757i = {0}, m22758l = {156}, m22759m = "catchImpl", m22760n = {"fromDownstream"}, m22761s = {"L$0"})
    @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class toq<T> extends AbstractC6209q {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        toq(InterfaceC6216q<? super toq> interfaceC6216q) {
            super(interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ld6.zurt(null, null, this);
        }
    }

    /* JADX INFO: compiled from: Errors.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {C0846k.zaso, "it", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class zy<T> implements InterfaceC6618p, kotlin.coroutines.jvm.internal.n7h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC6618p<T> f36961k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ i1.C6299y<Throwable> f36962q;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.fn3e$zy$k */
        /* JADX INFO: compiled from: Errors.kt */
        @InterfaceC6205g(m22755c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m22756f = "Errors.kt", m22757i = {0}, m22758l = {158}, m22759m = "emit", m22760n = {"this"}, m22761s = {"L$0"})
        @kotlin.d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
        static final class C6568k extends AbstractC6209q {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ zy<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C6568k(zy<? super T> zyVar, InterfaceC6216q<? super C6568k> interfaceC6216q) {
                super(interfaceC6216q);
                this.this$0 = zyVar;
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
        zy(InterfaceC6618p<? super T> interfaceC6618p, i1.C6299y<Throwable> c6299y) {
            this.f36961k = interfaceC6618p;
            this.f36962q = c6299y;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC6618p
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super kotlin.was> r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.fn3e.zy.C6568k
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.fn3e$zy$k r0 = (kotlinx.coroutines.flow.fn3e.zy.C6568k) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.fn3e$zy$k r0 = new kotlinx.coroutines.flow.fn3e$zy$k
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.L$0
                kotlinx.coroutines.flow.fn3e$zy r5 = (kotlinx.coroutines.flow.fn3e.zy) r5
                kotlin.C6318m.n7h(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.C6318m.n7h(r6)
                kotlinx.coroutines.flow.p<T> r6 = r4.f36961k     // Catch: java.lang.Throwable -> L4a
                r0.L$0 = r4     // Catch: java.lang.Throwable -> L4a
                r0.label = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                kotlin.was r5 = kotlin.was.f36763k
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.i1$y<java.lang.Throwable> r5 = r5.f36962q
                r5.element = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.fn3e.zy.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
        }
    }

    @InterfaceC7396q
    public static final <T> InterfaceC6622s<T> f7l8(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q cyoe.ki<? super InterfaceC6618p<? super T>, ? super Throwable, ? super Long, ? super InterfaceC6216q<? super Boolean>, ? extends Object> kiVar) {
        return new C6564g(interfaceC6622s, kiVar);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC6622s m24090g(InterfaceC6622s interfaceC6622s, long j2, InterfaceC5979h interfaceC5979h, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = Long.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            interfaceC5979h = new C6567q(null);
        }
        return ld6.m28296do(interfaceC6622s, j2, interfaceC5979h);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> InterfaceC6622s<T> m24091k(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, @InterfaceC7396q cyoe.cdj<? super InterfaceC6618p<? super T>, ? super Throwable, ? super InterfaceC6216q<? super was>, ? extends Object> cdjVar) {
        return new C6565k(interfaceC6622s, cdjVar);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final <T> InterfaceC6622s<T> m24092n(@InterfaceC7396q InterfaceC6622s<? extends T> interfaceC6622s, long j2, @InterfaceC7396q InterfaceC5979h<? super Throwable, ? super InterfaceC6216q<? super Boolean>, ? extends Object> interfaceC5979h) {
        if (j2 > 0) {
            return ld6.ebn(interfaceC6622s, new C6566n(j2, interfaceC5979h, null));
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.d2ok.mcp("Expected positive amount of retries, but had ", Long.valueOf(j2)).toString());
    }

    /* JADX INFO: renamed from: q */
    private static final boolean m24093q(Throwable th, Throwable th2) {
        return th2 != null && kotlin.jvm.internal.d2ok.f7l8(th2, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @mub.InterfaceC7395n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object toq(@mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6622s<? extends T> r4, @mub.InterfaceC7396q kotlinx.coroutines.flow.InterfaceC6618p<? super T> r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q<? super java.lang.Throwable> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.fn3e.toq
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.fn3e$toq r0 = (kotlinx.coroutines.flow.fn3e.toq) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.fn3e$toq r0 = new kotlinx.coroutines.flow.fn3e$toq
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.i1$y r4 = (kotlin.jvm.internal.i1.C6299y) r4
            kotlin.C6318m.n7h(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.C6318m.n7h(r6)
            kotlin.jvm.internal.i1$y r6 = new kotlin.jvm.internal.i1$y
            r6.<init>()
            kotlinx.coroutines.flow.fn3e$zy r2 = new kotlinx.coroutines.flow.fn3e$zy     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L51
            r0.label = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.mo5262k(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.element
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = m24093q(r5, r4)
            if (r6 != 0) goto L76
            kotlin.coroutines.f7l8 r6 = r0.getContext()
            boolean r6 = zy(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            kotlin.kja0.m23173k(r4, r5)
            throw r4
        L72:
            kotlin.kja0.m23173k(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.fn3e.toq(kotlinx.coroutines.flow.s, kotlinx.coroutines.flow.p, kotlin.coroutines.q):java.lang.Object");
    }

    private static final boolean zy(Throwable th, kotlin.coroutines.f7l8 f7l8Var) {
        gbni gbniVar = (gbni) f7l8Var.get(gbni.ygy);
        if (gbniVar == null || !gbniVar.isCancelled()) {
            return false;
        }
        return m24093q(th, gbniVar.d2ok());
    }
}

package androidx.window.layout;

import android.app.Activity;
import com.android.thememanager.clockmessage.model.C1873k;
import com.market.sdk.reflect.C4991s;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.flow.InterfaceC6622s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/window/layout/fn3e;", "Landroidx/window/layout/t8r;", "Landroid/app/Activity;", C1873k.f10652g, "Lkotlinx/coroutines/flow/s;", "Landroidx/window/layout/fu4;", "zy", "Landroidx/window/layout/o1t;", "toq", "Landroidx/window/layout/o1t;", "windowMetricsCalculator", "Landroidx/window/layout/ki;", "Landroidx/window/layout/ki;", "windowBackend", C4991s.f28129n, "(Landroidx/window/layout/o1t;Landroidx/window/layout/ki;)V", "q", "k", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class fn3e implements t8r {

    /* JADX INFO: renamed from: n */
    private static final int f7150n = 10;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C1329k f7151q = new C1329k(null);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final o1t f53738toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final ki f53739zy;

    /* JADX INFO: renamed from: androidx.window.layout.fn3e$k */
    /* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/fn3e$k;", "", "", "BUFFER_CAPACITY", com.market.sdk.reflect.toq.f28131g, C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C1329k {
        private C1329k() {
        }

        public /* synthetic */ C1329k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: compiled from: WindowInfoTrackerImpl.kt */
    @InterfaceC6205g(m22755c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", m22756f = "WindowInfoTrackerImpl.kt", m22757i = {0, 0, 1, 1}, m22758l = {54, 55}, m22759m = "invokeSuspend", m22760n = {"$this$flow", "listener", "$this$flow", "listener"}, m22761s = {"L$0", "L$1", "L$0", "L$1"})
    @d3(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/p;", "Landroidx/window/layout/fu4;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6618p<? super fu4>, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(Activity activity, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static final void m5677n(kotlinx.coroutines.channels.n7h n7hVar, fu4 info) {
            d2ok.kja0(info, "info");
            n7hVar.mo23921s(info);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            toq toqVar = fn3e.this.new toq(this.$activity, interfaceC6216q);
            toqVar.L$0 = obj;
            return toqVar;
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6618p<? super fu4> interfaceC6618p, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((toq) create(interfaceC6618p, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:17:0x0064, B:21:0x0076, B:23:0x007e), top: B:35:0x0064 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0093 -> B:35:0x0064). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.toq.x2()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L39
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r9.L$2
                kotlinx.coroutines.channels.h r1 = (kotlinx.coroutines.channels.InterfaceC6497h) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.zy r4 = (androidx.core.util.zy) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.flow.p r5 = (kotlinx.coroutines.flow.InterfaceC6618p) r5
                kotlin.C6318m.n7h(r10)     // Catch: java.lang.Throwable -> La3
                r10 = r5
                goto L63
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.L$2
                kotlinx.coroutines.channels.h r1 = (kotlinx.coroutines.channels.InterfaceC6497h) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.zy r4 = (androidx.core.util.zy) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.flow.p r5 = (kotlinx.coroutines.flow.InterfaceC6618p) r5
                kotlin.C6318m.n7h(r10)     // Catch: java.lang.Throwable -> La3
                r6 = r5
                r5 = r9
                goto L76
            L39:
                kotlin.C6318m.n7h(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.flow.p r10 = (kotlinx.coroutines.flow.InterfaceC6618p) r10
                r1 = 10
                kotlinx.coroutines.channels.qrj r4 = kotlinx.coroutines.channels.qrj.DROP_OLDEST
                r5 = 4
                r6 = 0
                kotlinx.coroutines.channels.n7h r1 = kotlinx.coroutines.channels.cdj.m23858q(r1, r4, r6, r5, r6)
                androidx.window.layout.zurt r4 = new androidx.window.layout.zurt
                r4.<init>()
                androidx.window.layout.fn3e r5 = androidx.window.layout.fn3e.this
                androidx.window.layout.ki r5 = androidx.window.layout.fn3e.m5676q(r5)
                android.app.Activity r6 = r9.$activity
                androidx.window.layout.ni7 r7 = new androidx.window.layout.ni7
                r7.<init>()
                r5.mo5687k(r6, r7, r4)
                kotlinx.coroutines.channels.h r1 = r1.iterator()     // Catch: java.lang.Throwable -> La3
            L63:
                r5 = r9
            L64:
                r5.L$0 = r10     // Catch: java.lang.Throwable -> La1
                r5.L$1 = r4     // Catch: java.lang.Throwable -> La1
                r5.L$2 = r1     // Catch: java.lang.Throwable -> La1
                r5.label = r3     // Catch: java.lang.Throwable -> La1
                java.lang.Object r6 = r1.toq(r5)     // Catch: java.lang.Throwable -> La1
                if (r6 != r0) goto L73
                return r0
            L73:
                r8 = r6
                r6 = r10
                r10 = r8
            L76:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La1
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La1
                if (r10 == 0) goto L95
                java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> La1
                androidx.window.layout.fu4 r10 = (androidx.window.layout.fu4) r10     // Catch: java.lang.Throwable -> La1
                r5.L$0 = r6     // Catch: java.lang.Throwable -> La1
                r5.L$1 = r4     // Catch: java.lang.Throwable -> La1
                r5.L$2 = r1     // Catch: java.lang.Throwable -> La1
                r5.label = r2     // Catch: java.lang.Throwable -> La1
                java.lang.Object r10 = r6.emit(r10, r5)     // Catch: java.lang.Throwable -> La1
                if (r10 != r0) goto L93
                return r0
            L93:
                r10 = r6
                goto L64
            L95:
                androidx.window.layout.fn3e r10 = androidx.window.layout.fn3e.this
                androidx.window.layout.ki r10 = androidx.window.layout.fn3e.m5676q(r10)
                r10.toq(r4)
                kotlin.was r10 = kotlin.was.f36763k
                return r10
            La1:
                r10 = move-exception
                goto La5
            La3:
                r10 = move-exception
                r5 = r9
            La5:
                androidx.window.layout.fn3e r0 = androidx.window.layout.fn3e.this
                androidx.window.layout.ki r0 = androidx.window.layout.fn3e.m5676q(r0)
                r0.toq(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.fn3e.toq.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public fn3e(@InterfaceC7396q o1t windowMetricsCalculator, @InterfaceC7396q ki windowBackend) {
        d2ok.m23075h(windowMetricsCalculator, "windowMetricsCalculator");
        d2ok.m23075h(windowBackend, "windowBackend");
        this.f53738toq = windowMetricsCalculator;
        this.f53739zy = windowBackend;
    }

    @Override // androidx.window.layout.t8r
    @InterfaceC7396q
    public InterfaceC6622s<fu4> zy(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        return kotlinx.coroutines.flow.ld6.tfm(new toq(activity, null));
    }
}

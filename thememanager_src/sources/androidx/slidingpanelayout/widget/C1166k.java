package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.window.layout.f7l8;
import androidx.window.layout.fu4;
import androidx.window.layout.t8r;
import androidx.window.layout.x2;
import com.android.thememanager.clockmessage.model.C1873k;
import com.market.sdk.reflect.C4991s;
import com.xiaomi.onetrack.api.at;
import cyoe.InterfaceC5979h;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.AbstractC6209q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.coroutines.jvm.internal.kja0;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.C6490c;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.flow.InterfaceC6618p;
import kotlinx.coroutines.flow.InterfaceC6622s;
import kotlinx.coroutines.flow.ld6;
import kotlinx.coroutines.gbni;
import kotlinx.coroutines.ikck;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: androidx.slidingpanelayout.widget.k */
/* JADX INFO: compiled from: FoldingFeatureObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\bR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/slidingpanelayout/widget/k;", "", "Landroidx/window/layout/fu4;", "windowLayoutInfo", "Landroidx/window/layout/x2;", "q", "Landroidx/slidingpanelayout/widget/k$k;", "onFoldingFeatureChangeListener", "Lkotlin/was;", C7704k.y.toq.f95579toq, "Landroid/app/Activity;", C1873k.f10652g, "n", "f7l8", "Landroidx/window/layout/t8r;", "k", "Landroidx/window/layout/t8r;", "windowInfoTracker", "Ljava/util/concurrent/Executor;", "toq", "Ljava/util/concurrent/Executor;", "executor", "Lkotlinx/coroutines/gbni;", "zy", "Lkotlinx/coroutines/gbni;", at.f31711e, "Landroidx/slidingpanelayout/widget/k$k;", C4991s.f28129n, "(Landroidx/window/layout/t8r;Ljava/util/concurrent/Executor;)V", "slidingpanelayout_release"}, m22787k = 1, mv = {1, 6, 0})
public final class C1166k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final t8r f6329k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private k f6330q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final Executor f52453toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private gbni f52454zy;

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.k$k */
    /* JADX INFO: compiled from: FoldingFeatureObserver.kt */
    @d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Landroidx/slidingpanelayout/widget/k$k;", "", "Landroidx/window/layout/x2;", "foldingFeature", "Lkotlin/was;", "k", "slidingpanelayout_release"}, m22787k = 1, mv = {1, 6, 0})
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo5256k(@InterfaceC7396q x2 x2Var);
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.k$toq */
    /* JADX INFO: compiled from: FoldingFeatureObserver.kt */
    @InterfaceC6205g(m22755c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", m22756f = "FoldingFeatureObserver.kt", m22757i = {}, m22758l = {97}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    @d3(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/f;", "Lkotlin/was;", "<anonymous>"}, m22787k = 3, mv = {1, 6, 0})
    static final class toq extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ Activity $activity;
        int label;

        /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.k$toq$k */
        /* JADX INFO: compiled from: Collect.kt */
        @d3(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/n7h$k", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m22787k = 1, mv = {1, 6, 0})
        public static final class k implements InterfaceC6618p<x2> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ C1166k f6331k;

            public k(C1166k c1166k) {
                this.f6331k = c1166k;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC6618p
            @InterfaceC7395n
            public Object emit(x2 x2Var, @InterfaceC7396q InterfaceC6216q<? super was> interfaceC6216q) {
                was wasVar;
                x2 x2Var2 = x2Var;
                k kVar = this.f6331k.f6330q;
                if (kVar == null) {
                    wasVar = null;
                } else {
                    kVar.mo5256k(x2Var2);
                    wasVar = was.f36763k;
                }
                return wasVar == C6199q.x2() ? wasVar : was.f36763k;
            }
        }

        /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.k$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SafeCollector.common.kt */
        @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/s;", "Lkotlinx/coroutines/flow/p;", "collector", "Lkotlin/was;", "k", "(Lkotlinx/coroutines/flow/p;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/wvg$g"}, m22787k = 1, mv = {1, 6, 0})
        public static final class C7894toq implements InterfaceC6622s<x2> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC6622s f6332k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ C1166k f6333q;

            /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.k$toq$toq$k */
            /* JADX INFO: compiled from: Collect.kt */
            @d3(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/p;", "value", "Lkotlin/was;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/q;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/wvg$g$toq"}, m22787k = 1, mv = {1, 6, 0})
            public static final class k implements InterfaceC6618p<fu4> {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ InterfaceC6618p f6334k;

                /* JADX INFO: renamed from: q */
                final /* synthetic */ C1166k f6335q;

                /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.k$toq$toq$k$k, reason: collision with other inner class name */
                @InterfaceC6205g(m22755c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", m22756f = "FoldingFeatureObserver.kt", m22757i = {}, m22758l = {138}, m22759m = "emit", m22760n = {}, m22761s = {})
                @d3(m22787k = 3, mv = {1, 6, 0}, xi = 48)
                public static final class C7895k extends AbstractC6209q {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C7895k(InterfaceC6216q interfaceC6216q) {
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

                public k(InterfaceC6618p interfaceC6618p, C1166k c1166k) {
                    this.f6334k = interfaceC6618p;
                    this.f6335q = c1166k;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC6618p
                @mub.InterfaceC7395n
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(androidx.window.layout.fu4 r5, @mub.InterfaceC7396q kotlin.coroutines.InterfaceC6216q r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.slidingpanelayout.widget.C1166k.toq.C7894toq.k.C7895k
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.slidingpanelayout.widget.k$toq$toq$k$k r0 = (androidx.slidingpanelayout.widget.C1166k.toq.C7894toq.k.C7895k) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.slidingpanelayout.widget.k$toq$toq$k$k r0 = new androidx.slidingpanelayout.widget.k$toq$toq$k$k
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.toq.x2()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C6318m.n7h(r6)
                        goto L4a
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C6318m.n7h(r6)
                        kotlinx.coroutines.flow.p r6 = r4.f6334k
                        androidx.window.layout.fu4 r5 = (androidx.window.layout.fu4) r5
                        androidx.slidingpanelayout.widget.k r2 = r4.f6335q
                        androidx.window.layout.x2 r5 = androidx.slidingpanelayout.widget.C1166k.m5258k(r2, r5)
                        if (r5 != 0) goto L41
                        goto L4a
                    L41:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4a
                        return r1
                    L4a:
                        kotlin.was r5 = kotlin.was.f36763k
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.C1166k.toq.C7894toq.k.emit(java.lang.Object, kotlin.coroutines.q):java.lang.Object");
                }
            }

            public C7894toq(InterfaceC6622s interfaceC6622s, C1166k c1166k) {
                this.f6332k = interfaceC6622s;
                this.f6333q = c1166k;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC6622s
            @InterfaceC7395n
            /* JADX INFO: renamed from: k */
            public Object mo5262k(@InterfaceC7396q InterfaceC6618p<? super x2> interfaceC6618p, @InterfaceC7396q InterfaceC6216q interfaceC6216q) {
                Object objMo5262k = this.f6332k.mo5262k(new k(interfaceC6618p, this.f6333q), interfaceC6216q);
                return objMo5262k == C6199q.x2() ? objMo5262k : was.f36763k;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(Activity activity, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return C1166k.this.new toq(this.$activity, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((toq) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                InterfaceC6622s interfaceC6622sYz = ld6.yz(new C7894toq(C1166k.this.f6329k.zy(this.$activity), C1166k.this));
                k kVar = new k(C1166k.this);
                this.label = 1;
                if (interfaceC6622sYz.mo5262k(kVar, this) == objX2) {
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

    public C1166k(@InterfaceC7396q t8r windowInfoTracker, @InterfaceC7396q Executor executor) {
        d2ok.m23075h(windowInfoTracker, "windowInfoTracker");
        d2ok.m23075h(executor, "executor");
        this.f6329k = windowInfoTracker;
        this.f52453toq = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final x2 m5259q(fu4 fu4Var) {
        Object next;
        Iterator<T> it = fu4Var.m5679k().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((f7l8) next) instanceof x2) {
                break;
            }
        }
        if (next instanceof x2) {
            return (x2) next;
        }
        return null;
    }

    public final void f7l8() {
        gbni gbniVar = this.f52454zy;
        if (gbniVar == null) {
            return;
        }
        gbni.C6665k.toq(gbniVar, null, 1, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m5260g(@InterfaceC7396q k onFoldingFeatureChangeListener) {
        d2ok.m23075h(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        this.f6330q = onFoldingFeatureChangeListener;
    }

    /* JADX INFO: renamed from: n */
    public final void m5261n(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        gbni gbniVar = this.f52454zy;
        if (gbniVar != null) {
            gbni.C6665k.toq(gbniVar, null, 1, null);
        }
        this.f52454zy = kotlinx.coroutines.x2.m24649g(C6490c.m23839k(ikck.zy(this.f52453toq)), null, null, new toq(activity, null), 3, null);
    }
}

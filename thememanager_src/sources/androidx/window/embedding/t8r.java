package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.window.core.InterfaceC1310q;
import com.android.thememanager.clockmessage.model.C1873k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.a9;
import kotlin.collections.a98o;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: SplitController.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0005J*\u0010\u0014\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u001a\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u0006\u0010\u0017\u001a\u00020\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Landroidx/window/embedding/t8r;", "", "", "Landroidx/window/embedding/qrj;", "staticRules", "Lkotlin/was;", "qrj", AnimatedProperty.PROPERTY_NAME_Y, "rule", "ld6", "n7h", C7704k.y.toq.f95579toq, "Landroid/app/Activity;", C1873k.f10652g, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/zy;", "", "Landroidx/window/embedding/i;", "consumer", "n", "x2", "", "p", "Landroidx/window/embedding/p;", "k", "Landroidx/window/embedding/p;", "embeddingBackend", "toq", "Ljava/util/Set;", "staticSplitRules", C4991s.f28129n, "()V", "zy", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public final class t8r {

    /* JADX INFO: renamed from: g */
    public static final boolean f7125g = false;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private static volatile t8r f7127q;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC1320p f7128k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private Set<? extends qrj> f53726toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final C1323k f53725zy = new C1323k(null);

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final ReentrantLock f7126n = new ReentrantLock();

    /* JADX INFO: renamed from: androidx.window.embedding.t8r$k */
    /* JADX INFO: compiled from: SplitController.kt */
    @d3(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/window/embedding/t8r$k;", "", "Landroidx/window/embedding/t8r;", "k", "Landroid/content/Context;", "context", "", "staticRuleResourceId", "Lkotlin/was;", "toq", "globalInstance", "Landroidx/window/embedding/t8r;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "sDebug", com.market.sdk.reflect.toq.f68929toq, C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C1323k {
        private C1323k() {
        }

        public /* synthetic */ C1323k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final t8r m5655k() {
            if (t8r.f7127q == null) {
                ReentrantLock reentrantLock = t8r.f7126n;
                reentrantLock.lock();
                try {
                    if (t8r.f7127q == null) {
                        C1323k c1323k = t8r.f53725zy;
                        t8r.f7127q = new t8r(null);
                    }
                    was wasVar = was.f36763k;
                } finally {
                    reentrantLock.unlock();
                }
            }
            t8r t8rVar = t8r.f7127q;
            d2ok.qrj(t8rVar);
            return t8rVar;
        }

        @l05.qrj
        public final void toq(@InterfaceC7396q Context context, int i2) {
            d2ok.m23075h(context, "context");
            Set<qrj> setF7l8 = new C1326z().f7l8(context, i2);
            t8r t8rVarM5655k = m5655k();
            if (setF7l8 == null) {
                setF7l8 = a98o.ld6();
            }
            t8rVarM5655k.qrj(setF7l8);
        }
    }

    private t8r() {
        this.f7128k = C1315h.f7107n.m5624k();
        this.f53726toq = a98o.ld6();
    }

    public /* synthetic */ t8r(kotlin.jvm.internal.ni7 ni7Var) {
        this();
    }

    @InterfaceC7396q
    @l05.qrj
    public static final t8r f7l8() {
        return f53725zy.m5655k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void qrj(Set<? extends qrj> set) {
        this.f53726toq = set;
        this.f7128k.mo5621k(set);
    }

    @l05.qrj
    /* JADX INFO: renamed from: s */
    public static final void m5650s(@InterfaceC7396q Context context, int i2) {
        f53725zy.toq(context, i2);
    }

    /* JADX INFO: renamed from: g */
    public final void m5651g() {
        this.f7128k.mo5621k(this.f53726toq);
    }

    public final void ld6(@InterfaceC7396q qrj rule) {
        d2ok.m23075h(rule, "rule");
        this.f7128k.mo5623q(rule);
    }

    /* JADX INFO: renamed from: n */
    public final void m5652n(@InterfaceC7396q Activity activity, @InterfaceC7396q Executor executor, @InterfaceC7396q androidx.core.util.zy<List<C1316i>> consumer) {
        d2ok.m23075h(activity, "activity");
        d2ok.m23075h(executor, "executor");
        d2ok.m23075h(consumer, "consumer");
        this.f7128k.zy(activity, executor, consumer);
    }

    public final void n7h(@InterfaceC7396q qrj rule) {
        d2ok.m23075h(rule, "rule");
        this.f7128k.f7l8(rule);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m5653p() {
        return this.f7128k.mo5620g();
    }

    public final void x2(@InterfaceC7396q androidx.core.util.zy<List<C1316i>> consumer) {
        d2ok.m23075h(consumer, "consumer");
        this.f7128k.mo5622n(consumer);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final Set<qrj> m5654y() {
        return a9.yvs(this.f7128k.toq());
    }
}

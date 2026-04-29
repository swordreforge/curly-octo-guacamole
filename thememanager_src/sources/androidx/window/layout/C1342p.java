package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.android.thememanager.clockmessage.model.C1873k;
import com.android.thememanager.util.yz;
import com.market.sdk.reflect.C4991s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.window.layout.p */
/* JADX INFO: compiled from: ExtensionWindowLayoutInfoBackend.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/window/layout/p;", "Landroidx/window/layout/ki;", "Landroid/app/Activity;", C1873k.f10652g, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/zy;", "Landroidx/window/layout/fu4;", "callback", "Lkotlin/was;", "k", "toq", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "extensionWindowBackendLock", "", "Landroidx/window/layout/p$k;", "zy", "Ljava/util/Map;", "activityToListeners", "q", "listenerToActivity", C4991s.f28129n, "(Landroidx/window/extensions/layout/WindowLayoutComponent;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class C1342p implements ki {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final WindowLayoutComponent f7168k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    @zy.o1t(yz.xk5)
    private final Map<androidx.core.util.zy<fu4>, Activity> f7169q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final ReentrantLock f53749toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    @zy.o1t(yz.xk5)
    private final Map<Activity, k> f53750zy;

    /* JADX INFO: renamed from: androidx.window.layout.p$k */
    /* JADX INFO: compiled from: ExtensionWindowLayoutInfoBackend.kt */
    @SuppressLint({"NewApi"})
    @d3(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0005\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/window/layout/p$k;", "Ljava/util/function/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Lkotlin/was;", "k", "Landroidx/core/util/zy;", "Landroidx/window/layout/fu4;", "listener", "toq", "q", "", "zy", "Landroid/app/Activity;", "Landroid/app/Activity;", C1873k.f10652g, "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "multicastConsumerLock", "Landroidx/window/layout/fu4;", "lastKnownValue", "", "Ljava/util/Set;", "registeredListeners", C4991s.f28129n, "(Landroid/app/Activity;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    private static final class k implements Consumer<WindowLayoutInfo> {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Activity f7170k;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        @zy.o1t(yz.xk5)
        private final Set<androidx.core.util.zy<fu4>> f7171q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final ReentrantLock f53751toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.o1t(yz.xk5)
        @InterfaceC7395n
        private fu4 f53752zy;

        public k(@InterfaceC7396q Activity activity) {
            d2ok.m23075h(activity, "activity");
            this.f7170k = activity;
            this.f53751toq = new ReentrantLock();
            this.f7171q = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void accept(@InterfaceC7396q WindowLayoutInfo value) {
            d2ok.m23075h(value, "value");
            ReentrantLock reentrantLock = this.f53751toq;
            reentrantLock.lock();
            try {
                this.f53752zy = ld6.f7163k.toq(this.f7170k, value);
                Iterator<T> it = this.f7171q.iterator();
                while (it.hasNext()) {
                    ((androidx.core.util.zy) it.next()).accept(this.f53752zy);
                }
                was wasVar = was.f36763k;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m5719q(@InterfaceC7396q androidx.core.util.zy<fu4> listener) {
            d2ok.m23075h(listener, "listener");
            ReentrantLock reentrantLock = this.f53751toq;
            reentrantLock.lock();
            try {
                this.f7171q.remove(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void toq(@InterfaceC7396q androidx.core.util.zy<fu4> listener) {
            d2ok.m23075h(listener, "listener");
            ReentrantLock reentrantLock = this.f53751toq;
            reentrantLock.lock();
            try {
                fu4 fu4Var = this.f53752zy;
                if (fu4Var != null) {
                    listener.accept(fu4Var);
                }
                this.f7171q.add(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean zy() {
            return this.f7171q.isEmpty();
        }
    }

    public C1342p(@InterfaceC7396q WindowLayoutComponent component) {
        d2ok.m23075h(component, "component");
        this.f7168k = component;
        this.f53749toq = new ReentrantLock();
        this.f53750zy = new LinkedHashMap();
        this.f7169q = new LinkedHashMap();
    }

    @Override // androidx.window.layout.ki
    /* JADX INFO: renamed from: k */
    public void mo5687k(@InterfaceC7396q Activity activity, @InterfaceC7396q Executor executor, @InterfaceC7396q androidx.core.util.zy<fu4> callback) {
        was wasVar;
        d2ok.m23075h(activity, "activity");
        d2ok.m23075h(executor, "executor");
        d2ok.m23075h(callback, "callback");
        ReentrantLock reentrantLock = this.f53749toq;
        reentrantLock.lock();
        try {
            k kVar = this.f53750zy.get(activity);
            if (kVar == null) {
                wasVar = null;
            } else {
                kVar.toq(callback);
                this.f7169q.put(callback, activity);
                wasVar = was.f36763k;
            }
            if (wasVar == null) {
                k kVar2 = new k(activity);
                this.f53750zy.put(activity, kVar2);
                this.f7169q.put(callback, activity);
                kVar2.toq(callback);
                this.f7168k.addWindowLayoutInfoListener(activity, kVar2);
            }
            was wasVar2 = was.f36763k;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.ki
    public void toq(@InterfaceC7396q androidx.core.util.zy<fu4> callback) {
        d2ok.m23075h(callback, "callback");
        ReentrantLock reentrantLock = this.f53749toq;
        reentrantLock.lock();
        try {
            Activity activity = this.f7169q.get(callback);
            if (activity == null) {
                return;
            }
            k kVar = this.f53750zy.get(activity);
            if (kVar == null) {
                return;
            }
            kVar.m5719q(callback);
            if (kVar.zy()) {
                this.f7168k.removeWindowLayoutInfoListener(kVar);
            }
            was wasVar = was.f36763k;
        } finally {
            reentrantLock.unlock();
        }
    }
}

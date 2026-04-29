package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.window.core.C1311s;
import androidx.window.layout.C1331h;
import androidx.window.layout.InterfaceC1346s;
import com.android.thememanager.clockmessage.model.C1873k;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.yz;

/* JADX INFO: renamed from: androidx.window.layout.h */
/* JADX INFO: compiled from: SidecarWindowBackend.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0003\r\u000e\u001fB\u0013\b\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J&\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Landroidx/window/layout/h;", "Landroidx/window/layout/ki;", "Landroid/app/Activity;", C1873k.f10652g, "", "p", "Lkotlin/was;", C7704k.y.toq.f95579toq, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/zy;", "Landroidx/window/layout/fu4;", "callback", "k", "toq", "Landroidx/window/layout/s;", "Landroidx/window/layout/s;", "f7l8", "()Landroidx/window/layout/s;", "ld6", "(Landroidx/window/layout/s;)V", "windowExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/h$zy;", "Ljava/util/concurrent/CopyOnWriteArrayList;", AnimatedProperty.PROPERTY_NAME_Y, "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks$annotations", "()V", "windowLayoutChangeCallbacks", C4991s.f28129n, "zy", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class C1331h implements ki {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f53740f7l8 = "WindowServer";

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private static volatile C1331h f7155n = null;

    /* JADX INFO: renamed from: q */
    public static final boolean f7156q = false;

    /* JADX INFO: renamed from: k */
    @zy.o1t("globalLock")
    @InterfaceC7395n
    @yz
    private InterfaceC1346s f7157k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final CopyOnWriteArrayList<zy> f53742toq = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final k f53741zy = new k(null);

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private static final ReentrantLock f7154g = new ReentrantLock();

    /* JADX INFO: renamed from: androidx.window.layout.h$k */
    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    @d3(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\r\u001a\u00020\fH\u0007R\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/window/layout/h$k;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/h;", "k", "Landroidx/window/layout/s;", "toq", "Landroidx/window/core/s;", "sidecarVersion", "", "zy", "Lkotlin/was;", "q", "DEBUG", com.market.sdk.reflect.toq.f68929toq, "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/layout/h;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final C1331h m5689k(@InterfaceC7396q Context context) {
            d2ok.m23075h(context, "context");
            if (C1331h.f7155n == null) {
                ReentrantLock reentrantLock = C1331h.f7154g;
                reentrantLock.lock();
                try {
                    if (C1331h.f7155n == null) {
                        C1331h.f7155n = new C1331h(C1331h.f53741zy.toq(context));
                    }
                    was wasVar = was.f36763k;
                } finally {
                    reentrantLock.unlock();
                }
            }
            C1331h c1331h = C1331h.f7155n;
            d2ok.qrj(c1331h);
            return c1331h;
        }

        @yz
        /* JADX INFO: renamed from: q */
        public final void m5690q() {
            C1331h.f7155n = null;
        }

        @InterfaceC7395n
        public final InterfaceC1346s toq(@InterfaceC7396q Context context) {
            d2ok.m23075h(context, "context");
            try {
                if (!zy(SidecarCompat.f7135g.zy())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (sidecarCompat.mo5671q()) {
                    return sidecarCompat;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        @yz
        public final boolean zy(@InterfaceC7395n C1311s c1311s) {
            return c1311s != null && c1311s.compareTo(C1311s.f7085s.zy()) >= 0;
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.h$toq */
    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    @d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\n"}, d2 = {"Landroidx/window/layout/h$toq;", "Landroidx/window/layout/s$k;", "Landroid/app/Activity;", C1873k.f10652g, "Landroidx/window/layout/fu4;", "newLayout", "Lkotlin/was;", "k", C4991s.f28129n, "(Landroidx/window/layout/h;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    @yz
    public final class toq implements InterfaceC1346s.k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C1331h f7158k;

        public toq(C1331h this$0) {
            d2ok.m23075h(this$0, "this$0");
            this.f7158k = this$0;
        }

        @Override // androidx.window.layout.InterfaceC1346s.k
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: k */
        public void mo5675k(@InterfaceC7396q Activity activity, @InterfaceC7396q fu4 newLayout) {
            d2ok.m23075h(activity, "activity");
            d2ok.m23075h(newLayout, "newLayout");
            for (zy zyVar : this.f7158k.m5688y()) {
                if (d2ok.f7l8(zyVar.m5694q(), activity)) {
                    zyVar.toq(newLayout);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.h$zy */
    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    @d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/window/layout/h$zy;", "", "Landroidx/window/layout/fu4;", "newLayoutInfo", "Lkotlin/was;", "toq", "Landroid/app/Activity;", "k", "Landroid/app/Activity;", "q", "()Landroid/app/Activity;", C1873k.f10652g, "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/zy;", "zy", "Landroidx/core/util/zy;", "n", "()Landroidx/core/util/zy;", "callback", "Landroidx/window/layout/fu4;", C7704k.y.toq.f95579toq, "()Landroidx/window/layout/fu4;", "f7l8", "(Landroidx/window/layout/fu4;)V", "lastInfo", C4991s.f28129n, "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/zy;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class zy {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Activity f7159k;

        /* JADX INFO: renamed from: q */
        @InterfaceC7395n
        private fu4 f7160q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final Executor f53743toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final androidx.core.util.zy<fu4> f53744zy;

        public zy(@InterfaceC7396q Activity activity, @InterfaceC7396q Executor executor, @InterfaceC7396q androidx.core.util.zy<fu4> callback) {
            d2ok.m23075h(activity, "activity");
            d2ok.m23075h(executor, "executor");
            d2ok.m23075h(callback, "callback");
            this.f7159k = activity;
            this.f53743toq = executor;
            this.f53744zy = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void zy(zy this$0, fu4 newLayoutInfo) {
            d2ok.m23075h(this$0, "this$0");
            d2ok.m23075h(newLayoutInfo, "$newLayoutInfo");
            this$0.f53744zy.accept(newLayoutInfo);
        }

        public final void f7l8(@InterfaceC7395n fu4 fu4Var) {
            this.f7160q = fu4Var;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: g */
        public final fu4 m5692g() {
            return this.f7160q;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final androidx.core.util.zy<fu4> m5693n() {
            return this.f53744zy;
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final Activity m5694q() {
            return this.f7159k;
        }

        public final void toq(@InterfaceC7396q final fu4 newLayoutInfo) {
            d2ok.m23075h(newLayoutInfo, "newLayoutInfo");
            this.f7160q = newLayoutInfo;
            this.f53743toq.execute(new Runnable() { // from class: androidx.window.layout.cdj
                @Override // java.lang.Runnable
                public final void run() {
                    C1331h.zy.zy(this.f7148k, newLayoutInfo);
                }
            });
        }
    }

    @yz
    public C1331h(@InterfaceC7395n InterfaceC1346s interfaceC1346s) {
        this.f7157k = interfaceC1346s;
        InterfaceC1346s interfaceC1346s2 = this.f7157k;
        if (interfaceC1346s2 == null) {
            return;
        }
        interfaceC1346s2.mo5669k(new toq(this));
    }

    @zy.o1t("sLock")
    /* JADX INFO: renamed from: g */
    private final void m5682g(Activity activity) {
        InterfaceC1346s interfaceC1346s;
        CopyOnWriteArrayList<zy> copyOnWriteArrayList = this.f53742toq;
        boolean z2 = false;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (d2ok.f7l8(((zy) it.next()).m5694q(), activity)) {
                    z2 = true;
                    break;
                }
            }
        }
        if (z2 || (interfaceC1346s = this.f7157k) == null) {
            return;
        }
        interfaceC1346s.zy(activity);
    }

    /* JADX INFO: renamed from: p */
    private final boolean m5684p(Activity activity) {
        CopyOnWriteArrayList<zy> copyOnWriteArrayList = this.f53742toq;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (d2ok.f7l8(((zy) it.next()).m5694q(), activity)) {
                return true;
            }
        }
        return false;
    }

    @yz
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m5686s() {
    }

    @InterfaceC7395n
    public final InterfaceC1346s f7l8() {
        return this.f7157k;
    }

    @Override // androidx.window.layout.ki
    /* JADX INFO: renamed from: k */
    public void mo5687k(@InterfaceC7396q Activity activity, @InterfaceC7396q Executor executor, @InterfaceC7396q androidx.core.util.zy<fu4> callback) {
        fu4 fu4VarM5692g;
        Object next;
        d2ok.m23075h(activity, "activity");
        d2ok.m23075h(executor, "executor");
        d2ok.m23075h(callback, "callback");
        ReentrantLock reentrantLock = f7154g;
        reentrantLock.lock();
        try {
            InterfaceC1346s interfaceC1346sF7l8 = f7l8();
            if (interfaceC1346sF7l8 == null) {
                callback.accept(new fu4(kotlin.collections.ni7.a9()));
                return;
            }
            boolean zM5684p = m5684p(activity);
            zy zyVar = new zy(activity, executor, callback);
            m5688y().add(zyVar);
            if (zM5684p) {
                Iterator<T> it = m5688y().iterator();
                while (true) {
                    fu4VarM5692g = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (d2ok.f7l8(activity, ((zy) next).m5694q())) {
                            break;
                        }
                    }
                }
                zy zyVar2 = (zy) next;
                if (zyVar2 != null) {
                    fu4VarM5692g = zyVar2.m5692g();
                }
                if (fu4VarM5692g != null) {
                    zyVar.toq(fu4VarM5692g);
                }
            } else {
                interfaceC1346sF7l8.toq(activity);
            }
            was wasVar = was.f36763k;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void ld6(@InterfaceC7395n InterfaceC1346s interfaceC1346s) {
        this.f7157k = interfaceC1346s;
    }

    @Override // androidx.window.layout.ki
    public void toq(@InterfaceC7396q androidx.core.util.zy<fu4> callback) {
        d2ok.m23075h(callback, "callback");
        synchronized (f7154g) {
            if (f7l8() == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zy callbackWrapper : m5688y()) {
                if (callbackWrapper.m5693n() == callback) {
                    d2ok.kja0(callbackWrapper, "callbackWrapper");
                    arrayList.add(callbackWrapper);
                }
            }
            m5688y().removeAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m5682g(((zy) it.next()).m5694q());
            }
            was wasVar = was.f36763k;
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public final CopyOnWriteArrayList<zy> m5688y() {
        return this.f53742toq;
    }
}

package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.core.C1311s;
import androidx.window.layout.InterfaceC1346s;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.android.thememanager.clockmessage.model.C1873k;
import com.android.thememanager.util.yz;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import com.xiaomi.onetrack.api.C5693g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: compiled from: SidecarCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\u00020\u0001:\u0005\t\f(\u0010)B\u001d\b\u0007\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\"\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0017R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006*"}, d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/s;", "Landroid/app/Activity;", C1873k.f10652g, "Lkotlin/was;", "ld6", "x2", "Landroidx/window/layout/s$k;", "extensionCallback", "k", "Landroidx/window/layout/fu4;", C7704k.y.toq.f44691k, "toq", "Landroid/os/IBinder;", "windowToken", "p", "zy", "", "q", "Landroidx/window/sidecar/SidecarInterface;", "Landroidx/window/sidecar/SidecarInterface;", AnimatedProperty.PROPERTY_NAME_Y, "()Landroidx/window/sidecar/SidecarInterface;", "sidecar", "Landroidx/window/layout/kja0;", "Landroidx/window/layout/kja0;", "sidecarAdapter", "", "Ljava/util/Map;", "windowListenerRegisteredContexts", "Landroid/content/ComponentCallbacks;", "componentCallbackMap", "n", "Landroidx/window/layout/s$k;", C4991s.f28129n, "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/kja0;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", C7704k.y.toq.f95579toq, "DistinctSidecarElementCallback", "TranslatingCallback", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class SidecarCompat implements InterfaceC1346s {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f53731f7l8 = "SidecarCompat";

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final C1327k f7135g = new C1327k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final SidecarInterface f7136k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private InterfaceC1346s.k f7137n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final Map<Activity, ComponentCallbacks> f7138q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final kja0 f53732toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final Map<IBinder, Activity> f53733zy;

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @d3(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lkotlin/was;", "onDeviceStateChanged", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "Landroidx/window/layout/kja0;", "k", "Landroidx/window/layout/kja0;", "sidecarAdapter", "toq", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "callbackInterface", "Ljava/util/concurrent/locks/ReentrantLock;", "zy", "Ljava/util/concurrent/locks/ReentrantLock;", yz.xk5, "q", "Landroidx/window/sidecar/SidecarDeviceState;", "lastDeviceState", "Ljava/util/WeakHashMap;", "n", "Ljava/util/WeakHashMap;", "mActivityWindowLayoutInfo", C4991s.f28129n, "(Landroidx/window/layout/kja0;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final kja0 f7139k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        @zy.o1t("mLock")
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> f7140n;

        /* JADX INFO: renamed from: q */
        @zy.o1t(yz.xk5)
        @InterfaceC7395n
        private SidecarDeviceState f7141q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final SidecarInterface.SidecarCallback f53734toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final ReentrantLock f53735zy;

        public DistinctSidecarElementCallback(@InterfaceC7396q kja0 sidecarAdapter, @InterfaceC7396q SidecarInterface.SidecarCallback callbackInterface) {
            d2ok.m23075h(sidecarAdapter, "sidecarAdapter");
            d2ok.m23075h(callbackInterface, "callbackInterface");
            this.f7139k = sidecarAdapter;
            this.f53734toq = callbackInterface;
            this.f53735zy = new ReentrantLock();
            this.f7140n = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(@InterfaceC7396q SidecarDeviceState newDeviceState) {
            d2ok.m23075h(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.f53735zy;
            reentrantLock.lock();
            try {
                if (this.f7139k.m5698k(this.f7141q, newDeviceState)) {
                    return;
                }
                this.f7141q = newDeviceState;
                this.f53734toq.onDeviceStateChanged(newDeviceState);
                was wasVar = was.f36763k;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(@InterfaceC7396q IBinder token, @InterfaceC7396q SidecarWindowLayoutInfo newLayout) {
            d2ok.m23075h(token, "token");
            d2ok.m23075h(newLayout, "newLayout");
            synchronized (this.f53735zy) {
                if (this.f7139k.m5700q(this.f7140n.get(token), newLayout)) {
                    return;
                }
                this.f7140n.put(token, newLayout);
                this.f53734toq.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @d3(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¨\u0006\r"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lkotlin/was;", "onDeviceStateChanged", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", C4991s.f28129n, "(Landroidx/window/layout/SidecarCompat;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ SidecarCompat f7142k;

        public TranslatingCallback(SidecarCompat this$0) {
            d2ok.m23075h(this$0, "this$0");
            this.f7142k = this$0;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@InterfaceC7396q SidecarDeviceState newDeviceState) {
            SidecarInterface sidecarInterfaceM5673y;
            d2ok.m23075h(newDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = this.f7142k.f53733zy.values();
            SidecarCompat sidecarCompat = this.f7142k;
            for (Activity activity : collectionValues) {
                IBinder iBinderM5674k = SidecarCompat.f7135g.m5674k(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderM5674k != null && (sidecarInterfaceM5673y = sidecarCompat.m5673y()) != null) {
                    windowLayoutInfo = sidecarInterfaceM5673y.getWindowLayoutInfo(iBinderM5674k);
                }
                InterfaceC1346s.k kVar = sidecarCompat.f7137n;
                if (kVar != null) {
                    kVar.mo5675k(activity, sidecarCompat.f53732toq.m5699n(windowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@InterfaceC7396q IBinder windowToken, @InterfaceC7396q SidecarWindowLayoutInfo newLayout) {
            d2ok.m23075h(windowToken, "windowToken");
            d2ok.m23075h(newLayout, "newLayout");
            Activity activity = (Activity) this.f7142k.f53733zy.get(windowToken);
            if (activity == null) {
                Log.w(SidecarCompat.f53731f7l8, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            kja0 kja0Var = this.f7142k.f53732toq;
            SidecarInterface sidecarInterfaceM5673y = this.f7142k.m5673y();
            SidecarDeviceState deviceState = sidecarInterfaceM5673y == null ? null : sidecarInterfaceM5673y.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            fu4 fu4VarM5699n = kja0Var.m5699n(newLayout, deviceState);
            InterfaceC1346s.k kVar = this.f7142k.f7137n;
            if (kVar == null) {
                return;
            }
            kVar.mo5675k(activity, fu4VarM5699n);
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.SidecarCompat$k */
    /* JADX INFO: compiled from: SidecarCompat.kt */
    @d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/SidecarCompat$k;", "", "Landroid/content/Context;", "context", "Landroidx/window/sidecar/SidecarInterface;", "toq", "(Landroid/content/Context;)Landroidx/window/sidecar/SidecarInterface;", "Landroid/app/Activity;", C1873k.f10652g, "Landroid/os/IBinder;", "k", "(Landroid/app/Activity;)Landroid/os/IBinder;", "Landroidx/window/core/s;", "zy", "()Landroidx/window/core/s;", "sidecarVersion", "", "TAG", "Ljava/lang/String;", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C1327k {
        private C1327k() {
        }

        public /* synthetic */ C1327k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: k */
        public final IBinder m5674k(@InterfaceC7395n Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        @InterfaceC7395n
        public final SidecarInterface toq(@InterfaceC7396q Context context) {
            d2ok.m23075h(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        @InterfaceC7395n
        public final C1311s zy() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return C1311s.f7085s.m5598n(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.SidecarCompat$q */
    /* JADX INFO: compiled from: SidecarCompat.kt */
    @d3(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"androidx/window/layout/SidecarCompat$q", "Landroid/content/ComponentCallbacks;", "Landroid/content/res/Configuration;", "newConfig", "Lkotlin/was;", "onConfigurationChanged", "onLowMemory", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class ComponentCallbacksC1328q implements ComponentCallbacks {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Activity f7144q;

        ComponentCallbacksC1328q(Activity activity) {
            this.f7144q = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@InterfaceC7396q Configuration newConfig) {
            d2ok.m23075h(newConfig, "newConfig");
            InterfaceC1346s.k kVar = SidecarCompat.this.f7137n;
            if (kVar == null) {
                return;
            }
            Activity activity = this.f7144q;
            kVar.mo5675k(activity, SidecarCompat.this.m5672s(activity));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/SidecarCompat$toq;", "Landroidx/window/layout/s$k;", "Landroid/app/Activity;", C1873k.f10652g, "Landroidx/window/layout/fu4;", "newLayout", "Lkotlin/was;", "k", "Landroidx/window/layout/s$k;", "callbackInterface", "Ljava/util/concurrent/locks/ReentrantLock;", "toq", "Ljava/util/concurrent/locks/ReentrantLock;", yz.xk5, "Ljava/util/WeakHashMap;", "zy", "Ljava/util/WeakHashMap;", "activityWindowLayoutInfo", C4991s.f28129n, "(Landroidx/window/layout/s$k;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    private static final class toq implements InterfaceC1346s.k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final InterfaceC1346s.k f7145k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final ReentrantLock f53736toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        @zy.o1t("mLock")
        private final WeakHashMap<Activity, fu4> f53737zy;

        public toq(@InterfaceC7396q InterfaceC1346s.k callbackInterface) {
            d2ok.m23075h(callbackInterface, "callbackInterface");
            this.f7145k = callbackInterface;
            this.f53736toq = new ReentrantLock();
            this.f53737zy = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.InterfaceC1346s.k
        /* JADX INFO: renamed from: k */
        public void mo5675k(@InterfaceC7396q Activity activity, @InterfaceC7396q fu4 newLayout) {
            d2ok.m23075h(activity, "activity");
            d2ok.m23075h(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.f53736toq;
            reentrantLock.lock();
            try {
                if (d2ok.f7l8(newLayout, this.f53737zy.get(activity))) {
                    return;
                }
                this.f53737zy.put(activity, newLayout);
                reentrantLock.unlock();
                this.f7145k.mo5675k(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @d3(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/SidecarCompat$zy;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", C5693g.ae, "Lkotlin/was;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroidx/window/layout/SidecarCompat;", "k", "Landroidx/window/layout/SidecarCompat;", "sidecarCompat", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "kotlin.jvm.PlatformType", "q", "Ljava/lang/ref/WeakReference;", "activityWeakReference", C1873k.f10652g, C4991s.f28129n, "(Landroidx/window/layout/SidecarCompat;Landroid/app/Activity;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    private static final class zy implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final SidecarCompat f7146k;

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private final WeakReference<Activity> f7147q;

        public zy(@InterfaceC7396q SidecarCompat sidecarCompat, @InterfaceC7396q Activity activity) {
            d2ok.m23075h(sidecarCompat, "sidecarCompat");
            d2ok.m23075h(activity, "activity");
            this.f7146k = sidecarCompat;
            this.f7147q = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@InterfaceC7396q View view) {
            d2ok.m23075h(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f7147q.get();
            IBinder iBinderM5674k = SidecarCompat.f7135g.m5674k(activity);
            if (activity == null || iBinderM5674k == null) {
                return;
            }
            this.f7146k.m5670p(iBinderM5674k, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@InterfaceC7396q View view) {
            d2ok.m23075h(view, "view");
        }
    }

    @zy.yz
    public SidecarCompat(@InterfaceC7395n @zy.yz SidecarInterface sidecarInterface, @InterfaceC7396q kja0 sidecarAdapter) {
        d2ok.m23075h(sidecarAdapter, "sidecarAdapter");
        this.f7136k = sidecarInterface;
        this.f53732toq = sidecarAdapter;
        this.f53733zy = new LinkedHashMap();
        this.f7138q = new LinkedHashMap();
    }

    private final void ld6(Activity activity) {
        if (this.f7138q.get(activity) == null) {
            ComponentCallbacksC1328q componentCallbacksC1328q = new ComponentCallbacksC1328q(activity);
            this.f7138q.put(activity, componentCallbacksC1328q);
            activity.registerComponentCallbacks(componentCallbacksC1328q);
        }
    }

    private final void x2(Activity activity) {
        activity.unregisterComponentCallbacks(this.f7138q.get(activity));
        this.f7138q.remove(activity);
    }

    @Override // androidx.window.layout.InterfaceC1346s
    /* JADX INFO: renamed from: k */
    public void mo5669k(@InterfaceC7396q InterfaceC1346s.k extensionCallback) {
        d2ok.m23075h(extensionCallback, "extensionCallback");
        this.f7137n = new toq(extensionCallback);
        SidecarInterface sidecarInterface = this.f7136k;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f53732toq, new TranslatingCallback(this)));
    }

    /* JADX INFO: renamed from: p */
    public final void m5670p(@InterfaceC7396q IBinder windowToken, @InterfaceC7396q Activity activity) {
        SidecarInterface sidecarInterface;
        d2ok.m23075h(windowToken, "windowToken");
        d2ok.m23075h(activity, "activity");
        this.f53733zy.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.f7136k;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.f53733zy.size() == 1 && (sidecarInterface = this.f7136k) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        InterfaceC1346s.k kVar = this.f7137n;
        if (kVar != null) {
            kVar.mo5675k(activity, m5672s(activity));
        }
        ld6(activity);
    }

    @Override // androidx.window.layout.InterfaceC1346s
    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: q */
    public boolean mo5671q() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f7136k;
            Class<?> returnType = null;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType2 = method == null ? null : method.getReturnType();
            if (!d2ok.f7l8(returnType2, Void.TYPE)) {
                throw new NoSuchMethodException(d2ok.mcp("Illegal return type for 'setSidecarCallback': ", returnType2));
            }
            SidecarInterface sidecarInterface2 = this.f7136k;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f7136k;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f7136k;
            Method method2 = (sidecarInterface4 == null || (cls2 = sidecarInterface4.getClass()) == null) ? null : cls2.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType3 = method2 == null ? null : method2.getReturnType();
            if (!d2ok.f7l8(returnType3, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(d2ok.mcp("Illegal return type for 'getWindowLayoutInfo': ", returnType3));
            }
            SidecarInterface sidecarInterface5 = this.f7136k;
            Method method3 = (sidecarInterface5 == null || (cls3 = sidecarInterface5.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType4 = method3 == null ? null : method3.getReturnType();
            if (!d2ok.f7l8(returnType4, Void.TYPE)) {
                throw new NoSuchMethodException(d2ok.mcp("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", returnType4));
            }
            SidecarInterface sidecarInterface6 = this.f7136k;
            Method method4 = (sidecarInterface6 == null || (cls4 = sidecarInterface6.getClass()) == null) ? null : cls4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            if (method4 != null) {
                returnType = method4.getReturnType();
            }
            if (!d2ok.f7l8(returnType, Void.TYPE)) {
                throw new NoSuchMethodException(d2ok.mcp("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", returnType));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            d2ok.kja0(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
                if (d2ok.f7l8(arrayList, (List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    @InterfaceC7396q
    @zy.yz
    /* JADX INFO: renamed from: s */
    public final fu4 m5672s(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        IBinder iBinderM5674k = f7135g.m5674k(activity);
        if (iBinderM5674k == null) {
            return new fu4(kotlin.collections.ni7.a9());
        }
        SidecarInterface sidecarInterface = this.f7136k;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinderM5674k);
        kja0 kja0Var = this.f53732toq;
        SidecarInterface sidecarInterface2 = this.f7136k;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return kja0Var.m5699n(windowLayoutInfo, deviceState);
    }

    @Override // androidx.window.layout.InterfaceC1346s
    public void toq(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        IBinder iBinderM5674k = f7135g.m5674k(activity);
        if (iBinderM5674k != null) {
            m5670p(iBinderM5674k, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new zy(this, activity));
        }
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public final SidecarInterface m5673y() {
        return this.f7136k;
    }

    @Override // androidx.window.layout.InterfaceC1346s
    public void zy(@InterfaceC7396q Activity activity) {
        SidecarInterface sidecarInterface;
        d2ok.m23075h(activity, "activity");
        IBinder iBinderM5674k = f7135g.m5674k(activity);
        if (iBinderM5674k == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f7136k;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderM5674k);
        }
        x2(activity);
        boolean z2 = this.f53733zy.size() == 1;
        this.f53733zy.remove(iBinderM5674k);
        if (!z2 || (sidecarInterface = this.f7136k) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(@InterfaceC7396q Context context) {
        this(f7135g.toq(context), new kja0(null, 1, null));
        d2ok.m23075h(context, "context");
    }
}

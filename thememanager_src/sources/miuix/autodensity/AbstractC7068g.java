package miuix.autodensity;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import miuix.core.util.C7085q;
import miuix.core.util.t8r;

/* JADX INFO: renamed from: miuix.autodensity.g */
/* JADX INFO: compiled from: DensityProcessor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7068g {
    protected HashMap<Integer, k> mModifier;
    protected DisplayManager mDisplayManager = null;
    private final Handler mUiHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: miuix.autodensity.g$k */
    /* JADX INFO: compiled from: DensityProcessor.java */
    class k implements DisplayManager.DisplayListener, ComponentCallbacks {

        /* JADX INFO: renamed from: k */
        private WeakReference<Activity> f39744k;

        /* JADX INFO: renamed from: n */
        private final AbstractC7068g f39745n;

        /* JADX INFO: renamed from: q */
        private WeakReference<View.OnAttachStateChangeListener> f39746q = null;

        public k(Activity activity, AbstractC7068g abstractC7068g) {
            this.f39744k = null;
            this.f39744k = new WeakReference<>(activity);
            this.f39745n = abstractC7068g;
        }

        /* JADX INFO: renamed from: k */
        void m25503k(View.OnAttachStateChangeListener onAttachStateChangeListener) {
            this.f39746q = new WeakReference<>(onAttachStateChangeListener);
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            WeakReference<Activity> weakReference = this.f39744k;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity != null) {
                this.f39745n.processBeforeActivityConfigChanged(activity, configuration);
            } else {
                AbstractC7068g.this.unregisterDisplayListener(this);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            WeakReference<Activity> weakReference = this.f39744k;
            Activity activity = weakReference == null ? null : weakReference.get();
            if (activity != null) {
                this.f39745n.processOnActivityDisplayChanged(i2, activity);
            } else {
                AbstractC7068g.this.unregisterDisplayListener(this);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        void toq() {
            WeakReference<Activity> weakReference = this.f39744k;
            if (weakReference != null) {
                weakReference.clear();
            }
            WeakReference<View.OnAttachStateChangeListener> weakReference2 = this.f39746q;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
        }

        void zy(Activity activity) {
            View.OnAttachStateChangeListener onAttachStateChangeListener;
            WeakReference<View.OnAttachStateChangeListener> weakReference = this.f39746q;
            if (weakReference == null || (onAttachStateChangeListener = weakReference.get()) == null) {
                return;
            }
            activity.getWindow().getDecorView().removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* JADX INFO: renamed from: miuix.autodensity.g$toq */
    /* JADX INFO: compiled from: DensityProcessor.java */
    static class toq implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: k */
        private final AbstractC7068g f39747k;

        public toq(AbstractC7068g abstractC7068g) {
            this.f39747k = abstractC7068g;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            this.f39747k.processOnActivityCreated(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            this.f39747k.processOnActivityDestroyed(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public abstract boolean isEnableProcessInActivity(Activity activity);

    protected void onDensityChangedBeforeActivityConfigChanged(Activity activity, Configuration configuration, t8r t8rVar) {
        C7085q.a9(configuration, t8rVar);
        C7085q.mcp(activity, t8rVar);
        C7085q.m25602i(activity);
        C7085q.ni7(t8rVar);
    }

    protected void onDensityChangedOnActivityCreated(Activity activity) {
        registerCallback(activity);
    }

    protected void onDensityChangedOnActivityDisplayChanged(int i2, Activity activity) {
    }

    protected void onDensityChangedOnAppConfigChanged(Application application) {
    }

    protected void onRegisterDensityCallback(Object obj) {
    }

    protected abstract void prepareInApplication(Application application);

    protected abstract void processBeforeActivityConfigChanged(Activity activity, Configuration configuration);

    protected abstract void processOnActivityCreated(Activity activity);

    protected abstract void processOnActivityDestroyed(Activity activity);

    protected abstract void processOnActivityDisplayChanged(int i2, Activity activity);

    protected abstract void processOnAppConfigChanged(Application application, Configuration configuration);

    protected void registerCallback(Activity activity) {
        if (this.mDisplayManager == null) {
            this.mDisplayManager = (DisplayManager) activity.getApplication().getSystemService("display");
        }
        if (this.mModifier == null) {
            this.mModifier = new HashMap<>();
        }
        int iHashCode = activity.hashCode();
        if (this.mModifier.get(Integer.valueOf(iHashCode)) == null) {
            k kVar = new k(activity, this);
            this.mModifier.put(Integer.valueOf(iHashCode), kVar);
            this.mDisplayManager.registerDisplayListener(kVar, this.mUiHandler);
            activity.getApplication().registerComponentCallbacks(kVar);
            activity.registerComponentCallbacks(kVar);
        }
    }

    protected void unregisterCallback(Activity activity) {
        if (this.mModifier != null) {
            int iHashCode = activity.hashCode();
            k kVar = this.mModifier.get(Integer.valueOf(iHashCode));
            zy.m25521q("unregisterCallback obj: " + kVar);
            if (kVar != null) {
                unregisterDisplayListener(kVar);
                activity.getApplication().unregisterComponentCallbacks(kVar);
                activity.unregisterComponentCallbacks(kVar);
                kVar.zy(activity);
                kVar.toq();
            }
            this.mModifier.remove(Integer.valueOf(iHashCode));
        }
    }

    protected void unregisterDisplayListener(k kVar) {
        DisplayManager displayManager = this.mDisplayManager;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(kVar);
        }
    }
}

package miuix.autodensity;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.ICompatCameraControlCallback;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewRootImpl;
import miuix.autodensity.AbstractC7068g;
import miuix.core.util.C7079h;
import miuix.core.util.C7085q;
import miuix.core.util.t8r;
import miuix.reflect.C7320k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class AutoDensityConfig extends AbstractC7068g {
    private static final String TAG_CONFIG_CHANGE_FRAGMENT = "ConfigurationChangeFragment";
    private static AutoDensityConfig sInstance = null;
    private static boolean sUpdateSystemResources = true;
    private boolean sCanAccessHiddenAPI = false;

    private AutoDensityConfig(final Application application) {
        prepareInApplication(application);
        if (!(application instanceof miuix.app.zy)) {
            application.registerActivityLifecycleCallbacks(new AbstractC7068g.toq(this));
            application.registerComponentCallbacks(new ComponentCallbacks() { // from class: miuix.autodensity.AutoDensityConfig.2
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    AutoDensityConfig.this.processOnAppConfigChanged(application, configuration);
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            });
        } else {
            miuix.app.zy zyVar = (miuix.app.zy) application;
            zyVar.m24809k(new AbstractC7068g.toq(this));
            zyVar.toq(new ComponentCallbacks() { // from class: miuix.autodensity.AutoDensityConfig.1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    AutoDensityConfig.this.processOnAppConfigChanged(application, configuration);
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            });
        }
    }

    private void addForOnConfigurationChange(Activity activity) {
        Fragment configurationChangeFragment = getConfigurationChangeFragment(activity);
        if (configurationChangeFragment != null) {
            ((toq) configurationChangeFragment).toq(this);
            Log.d("AutoDensity", "ConfigurationChangeFragment has already added");
        } else {
            toq toqVar = new toq();
            toqVar.toq(this);
            activity.getFragmentManager().beginTransaction().add(toqVar, TAG_CONFIG_CHANGE_FRAGMENT).commitAllowingStateLoss();
        }
    }

    private void changeCurrentConfig(Activity activity) {
        try {
            ((Configuration) C7320k.qrj(Activity.class, activity, "mCurrentConfig")).densityDpi = C7070n.ld6().kja0().f42313q;
            ActivityInfo activityInfo = (ActivityInfo) C7320k.qrj(Activity.class, activity, "mActivityInfo");
            int i2 = activityInfo.configChanges;
            if ((i2 & 4096) == 0) {
                activityInfo.configChanges = i2 | 4096;
                Fragment configurationChangeFragment = getConfigurationChangeFragment(activity);
                if (configurationChangeFragment != null) {
                    ((toq) configurationChangeFragment).m25515k();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void forceUpdateDensity(Context context) {
        if (sInstance != null) {
            f7l8.m25501s(context);
        }
    }

    private Fragment getConfigurationChangeFragment(Activity activity) {
        return activity.getFragmentManager().findFragmentByTag(TAG_CONFIG_CHANGE_FRAGMENT);
    }

    public static AutoDensityConfig init(Application application) {
        if (sInstance == null) {
            sInstance = init(application, true);
        }
        return sInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isShouldAdaptAutoDensity(Application application) {
        if (application instanceof InterfaceC7074y) {
            return ((InterfaceC7074y) application).shouldAdaptAutoDensity();
        }
        return true;
    }

    private void removeCurrentConfig(Activity activity) {
        try {
            C7320k.fn3e(Activity.class, activity, "mCurrentConfig", null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void setForceDeviceScale(float f2) {
        C7070n.ld6().m25511i(f2);
    }

    public static void setForcePPI(int i2) {
        C7070n.ld6().fn3e(i2);
    }

    public static void setUpdateSystemRes(boolean z2) {
        if (z2) {
            f7l8.f7l8(C7070n.ld6().kja0());
        } else {
            f7l8.f7l8(C7070n.ld6().n7h());
        }
    }

    @Deprecated
    public static void setUseDeprecatedDensityLogic(boolean z2) {
        C7070n.ld6().t8r(z2);
    }

    public static boolean shouldUpdateSystemResource() {
        return sUpdateSystemResources;
    }

    private void tryToAddActivityConfigCallback(final Activity activity) {
        View viewPeekDecorView;
        if (!this.sCanAccessHiddenAPI || (viewPeekDecorView = activity.getWindow().peekDecorView()) == null) {
            return;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: miuix.autodensity.AutoDensityConfig.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@lvui View view) {
                try {
                    Object objKi = C7320k.ki(View.class, view, "getViewRootImpl", new Class[0], new Object[0]);
                    final Object objQrj = C7320k.qrj(ViewRootImpl.class, objKi, "mActivityConfigCallback");
                    C7320k.ki(ViewRootImpl.class, objKi, "setActivityConfigCallback", new Class[]{ViewRootImpl.ActivityConfigCallback.class}, new ViewRootImpl.ActivityConfigCallback() { // from class: miuix.autodensity.AutoDensityConfig.3.1
                        public void onConfigurationChanged(Configuration configuration, int i2) {
                            try {
                                C7320k.ki(ViewRootImpl.ActivityConfigCallback.class, objQrj, "onConfigurationChanged", new Class[]{Configuration.class, Integer.TYPE}, configuration, Integer.valueOf(i2));
                                f7l8.m25501s(activity);
                            } catch (Exception unused) {
                            }
                        }

                        public void requestCompatCameraControl(boolean z2, boolean z3, ICompatCameraControlCallback iCompatCameraControlCallback) {
                        }
                    });
                } catch (Exception unused) {
                }
                view.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@lvui View view) {
            }
        };
        viewPeekDecorView.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.mModifier.get(Integer.valueOf(activity.hashCode())).m25503k(onAttachStateChangeListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void updateDensity(Context context) {
        if (sInstance == null) {
            return;
        }
        if (((context instanceof Activity) && (context instanceof InterfaceC7074y)) ? ((InterfaceC7074y) context).shouldAdaptAutoDensity() : context.getApplicationContext() instanceof InterfaceC7074y ? ((InterfaceC7074y) context.getApplicationContext()).shouldAdaptAutoDensity() : false) {
            forceUpdateDensity(context);
        }
    }

    public static boolean updateDensityByConfig(@dd Context context, Configuration configuration) {
        AutoDensityConfig autoDensityConfig = sInstance;
        if (autoDensityConfig == null || context == null) {
            return false;
        }
        return autoDensityConfig.updateDensityOnConfigChanged(context, configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.autodensity.AbstractC7068g
    public boolean isEnableProcessInActivity(Activity activity) {
        boolean zShouldAdaptAutoDensity;
        try {
            if (activity instanceof InterfaceC7074y) {
                zShouldAdaptAutoDensity = ((InterfaceC7074y) activity).shouldAdaptAutoDensity();
            } else {
                if (!(activity.getApplication() instanceof InterfaceC7074y)) {
                    return false;
                }
                zShouldAdaptAutoDensity = ((InterfaceC7074y) activity.getApplication()).shouldAdaptAutoDensity();
            }
            return zShouldAdaptAutoDensity;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // miuix.autodensity.AbstractC7068g
    protected void onDensityChangedOnActivityCreated(Activity activity) {
        super.onDensityChangedOnActivityCreated(activity);
        addForOnConfigurationChange(activity);
    }

    @Override // miuix.autodensity.AbstractC7068g
    protected void onRegisterDensityCallback(Object obj) {
        zy.m25521q("registerCallback obj: " + obj);
    }

    @Override // miuix.autodensity.AbstractC7068g
    public void prepareInApplication(Application application) {
        try {
            this.sCanAccessHiddenAPI = ((Boolean) C7320k.ki(ApplicationInfo.class, application.getApplicationInfo(), "isAllowedToUseHiddenApis", new Class[0], new Object[0])).booleanValue();
        } catch (Exception unused) {
        }
        zy.toq();
        C7070n.ld6().cdj(application);
        if (isShouldAdaptAutoDensity(application)) {
            f7l8.m25501s(application);
        }
    }

    @Override // miuix.autodensity.AbstractC7068g
    protected void processBeforeActivityConfigChanged(Activity activity, Configuration configuration) {
        zy.m25521q("processBeforeActivityConfigChanged");
        f7l8.m25501s(activity);
        t8r t8rVarM25607s = C7085q.m25607s(activity);
        onDensityChangedBeforeActivityConfigChanged(activity, configuration, t8rVarM25607s);
        if (!C7079h.m25549n(t8rVarM25607s.f87379f7l8)) {
            C7079h.m25550q(t8rVarM25607s.f87379f7l8);
        }
        if (Build.VERSION.SDK_INT <= 31) {
            removeCurrentConfig(activity);
        } else {
            changeCurrentConfig(activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.autodensity.AbstractC7068g
    public void processOnActivityCreated(Activity activity) {
        zy.m25521q("processOnActivityCreated");
        boolean zShouldAdaptAutoDensity = activity instanceof InterfaceC7074y ? ((InterfaceC7074y) activity).shouldAdaptAutoDensity() : isShouldAdaptAutoDensity(activity.getApplication());
        updateApplicationDensity(activity.getApplication());
        if (zShouldAdaptAutoDensity) {
            f7l8.m25501s(activity);
            onDensityChangedOnActivityCreated(activity);
        }
    }

    @Override // miuix.autodensity.AbstractC7068g
    public void processOnActivityDestroyed(Activity activity) {
        unregisterCallback(activity);
    }

    @Override // miuix.autodensity.AbstractC7068g
    public void processOnActivityDisplayChanged(int i2, Activity activity) {
        zy.m25521q("onDisplayChanged displayId: " + i2 + " config " + activity.getResources().getConfiguration() + " activity: " + activity);
        f7l8.m25501s(activity);
        onDensityChangedOnActivityDisplayChanged(i2, activity);
    }

    @Override // miuix.autodensity.AbstractC7068g
    public void processOnAppConfigChanged(Application application, Configuration configuration) {
        zy.m25521q("AutoDensityConfig processOnAppConfigChanged");
        C7070n.ld6().zurt(application, configuration);
        if (isShouldAdaptAutoDensity(application)) {
            f7l8.m25501s(application);
            onDensityChangedOnAppConfigChanged(application);
            configuration.densityDpi = C7070n.ld6().kja0().f42313q;
        }
    }

    @Override // miuix.autodensity.AbstractC7068g
    protected void registerCallback(Activity activity) {
        super.registerCallback(activity);
        tryToAddActivityConfigCallback(activity);
    }

    void updateApplicationDensity(Application application) {
        if (Build.VERSION.SDK_INT == 29 && isShouldAdaptAutoDensity(application)) {
            f7l8.m25501s(application);
        }
    }

    public boolean updateDensityOnConfigChanged(Context context, Configuration configuration) {
        boolean zZurt = C7070n.ld6().zurt(context, configuration);
        if (context instanceof Activity) {
            Application application = ((Activity) context).getApplication();
            if (isShouldAdaptAutoDensity(application)) {
                updateApplicationDensity(application);
            }
        }
        updateDensity(context);
        return zZurt;
    }

    public static AutoDensityConfig init(Application application, boolean z2) {
        if (sInstance == null) {
            sUpdateSystemResources = z2;
            sInstance = new AutoDensityConfig(application);
        }
        return sInstance;
    }
}

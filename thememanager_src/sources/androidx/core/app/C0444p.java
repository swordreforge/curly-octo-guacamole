package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.app.p */
/* JADX INFO: compiled from: ActivityRecreator.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY})
final class C0444p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected static final Method f50122f7l8;

    /* JADX INFO: renamed from: g */
    protected static final Method f3231g;

    /* JADX INFO: renamed from: k */
    private static final String f3232k = "ActivityRecreator";

    /* JADX INFO: renamed from: n */
    protected static final Method f3233n;

    /* JADX INFO: renamed from: q */
    protected static final Field f3234q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected static final Class<?> f50123toq;

    /* JADX INFO: renamed from: y */
    private static final Handler f3235y = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected static final Field f50124zy;

    /* JADX INFO: renamed from: androidx.core.app.p$k */
    /* JADX INFO: compiled from: ActivityRecreator.java */
    class k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ q f3236k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Object f3237q;

        k(q qVar, Object obj) {
            this.f3236k = qVar;
            this.f3237q = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3236k.f3239k = this.f3237q;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.p$q */
    /* JADX INFO: compiled from: ActivityRecreator.java */
    private static final class q implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: k */
        Object f3239k;

        /* JADX INFO: renamed from: n */
        private final int f3240n;

        /* JADX INFO: renamed from: q */
        private Activity f3241q;

        /* JADX INFO: renamed from: g */
        private boolean f3238g = false;

        /* JADX INFO: renamed from: y */
        private boolean f3243y = false;

        /* JADX INFO: renamed from: s */
        private boolean f3242s = false;

        q(@zy.lvui Activity activity) {
            this.f3241q = activity;
            this.f3240n = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f3241q == activity) {
                this.f3241q = null;
                this.f3243y = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f3243y || this.f3242s || this.f3238g || !C0444p.m1965y(this.f3239k, this.f3240n, activity)) {
                return;
            }
            this.f3242s = true;
            this.f3239k = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f3241q == activity) {
                this.f3238g = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.p$toq */
    /* JADX INFO: compiled from: ActivityRecreator.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Application f3244k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ q f3245q;

        toq(Application application, q qVar) {
            this.f3244k = application;
            this.f3245q = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3244k.unregisterActivityLifecycleCallbacks(this.f3245q);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.p$zy */
    /* JADX INFO: compiled from: ActivityRecreator.java */
    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object f3246k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Object f3247q;

        zy(Object obj, Object obj2) {
            this.f3246k = obj;
            this.f3247q = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C0444p.f3233n;
                if (method != null) {
                    method.invoke(this.f3246k, this.f3247q, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C0444p.f3231g.invoke(this.f3246k, this.f3247q, Boolean.FALSE);
                }
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable th) {
                Log.e(C0444p.f3232k, "Exception while invoking performStopActivity", th);
            }
        }
    }

    static {
        Class<?> clsM1961k = m1961k();
        f50123toq = clsM1961k;
        f50124zy = toq();
        f3234q = m1960g();
        f3233n = m1963q(clsM1961k);
        f3231g = zy(clsM1961k);
        f50122f7l8 = m1962n(clsM1961k);
    }

    private C0444p() {
    }

    private static boolean f7l8() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    /* JADX INFO: renamed from: g */
    private static Field m1960g() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    private static Class<?> m1961k() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    private static Method m1962n(Class<?> cls) {
        if (f7l8() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    private static Method m1963q(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    static boolean m1964s(@zy.lvui Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (f7l8() && f50122f7l8 == null) {
            return false;
        }
        if (f3231g == null && f3233n == null) {
            return false;
        }
        try {
            Object obj2 = f3234q.get(activity);
            if (obj2 == null || (obj = f50124zy.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            q qVar = new q(activity);
            application.registerActivityLifecycleCallbacks(qVar);
            Handler handler = f3235y;
            handler.post(new k(qVar, obj2));
            try {
                if (f7l8()) {
                    Method method = f50122f7l8;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new toq(application, qVar));
                return true;
            } catch (Throwable th) {
                f3235y.post(new toq(application, qVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field toq() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    protected static boolean m1965y(Object obj, int i2, Activity activity) {
        try {
            Object obj2 = f3234q.get(activity);
            if (obj2 == obj && activity.hashCode() == i2) {
                f3235y.postAtFrontOfQueue(new zy(f50124zy.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e(f3232k, "Exception while fetching field values", th);
            return false;
        }
    }

    private static Method zy(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }
}

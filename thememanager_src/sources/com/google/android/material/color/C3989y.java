package com.google.android.material.color;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.material.color.C3988s;
import com.xiaomi.accountsdk.account.C5497k;
import ij.C6095k;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import zy.dd;
import zy.hb;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.color.y */
/* JADX INFO: compiled from: DynamicColors.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3989y {

    /* JADX INFO: renamed from: g */
    private static final int f24253g = 0;

    /* JADX INFO: renamed from: k */
    private static final int[] f24254k = {C6095k.zy.wh};

    /* JADX INFO: renamed from: n */
    private static final Map<String, zy> f24255n;

    /* JADX INFO: renamed from: q */
    private static final Map<String, zy> f24256q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final zy f67548toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @SuppressLint({"PrivateApi"})
    private static final zy f67549zy;

    /* JADX INFO: renamed from: com.google.android.material.color.y$g */
    /* JADX INFO: compiled from: DynamicColors.java */
    public interface g {
        /* JADX INFO: renamed from: k */
        boolean mo14331k(@lvui Activity activity, @hb int i2);
    }

    /* JADX INFO: renamed from: com.google.android.material.color.y$k */
    /* JADX INFO: compiled from: DynamicColors.java */
    class k implements zy {
        k() {
        }

        @Override // com.google.android.material.color.C3989y.zy
        /* JADX INFO: renamed from: k */
        public boolean mo14357k() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.y$n */
    /* JADX INFO: compiled from: DynamicColors.java */
    public interface n {
        /* JADX INFO: renamed from: k */
        void mo14332k(@lvui Activity activity);
    }

    /* JADX INFO: renamed from: com.google.android.material.color.y$q */
    /* JADX INFO: compiled from: DynamicColors.java */
    private static class q implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: k */
        private final C3988s f24257k;

        q(@lvui C3988s c3988s) {
            this.f24257k = c3988s;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@lvui Activity activity, @dd Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@lvui Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@lvui Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@lvui Activity activity, @dd Bundle bundle) {
            C3989y.ld6(activity, this.f24257k.m14329n(), this.f24257k.m14330q(), this.f24257k.zy());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@lvui Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@lvui Activity activity, @lvui Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@lvui Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@lvui Activity activity) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.y$toq */
    /* JADX INFO: compiled from: DynamicColors.java */
    class toq implements zy {

        /* JADX INFO: renamed from: k */
        private Long f24258k;

        toq() {
        }

        @Override // com.google.android.material.color.C3989y.zy
        /* JADX INFO: renamed from: k */
        public boolean mo14357k() {
            if (this.f24258k == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    this.f24258k = Long.valueOf(((Long) declaredMethod.invoke(null, "ro.build.version.oneui")).longValue());
                } catch (Exception unused) {
                    this.f24258k = -1L;
                }
            }
            return this.f24258k.longValue() >= 40100;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.y$zy */
    /* JADX INFO: compiled from: DynamicColors.java */
    private interface zy {
        /* JADX INFO: renamed from: k */
        boolean mo14357k();
    }

    static {
        k kVar = new k();
        f67548toq = kVar;
        toq toqVar = new toq();
        f67549zy = toqVar;
        HashMap map = new HashMap();
        map.put(C5497k.f30743g, kVar);
        map.put("hmd global", kVar);
        map.put("infinix", kVar);
        map.put("infinix mobility limited", kVar);
        map.put("itel", kVar);
        map.put("kyocera", kVar);
        map.put("lenovo", kVar);
        map.put("lge", kVar);
        map.put("motorola", kVar);
        map.put("nothing", kVar);
        map.put("oneplus", kVar);
        map.put("oppo", kVar);
        map.put("realme", kVar);
        map.put("robolectric", kVar);
        map.put("samsung", toqVar);
        map.put("sharp", kVar);
        map.put("sony", kVar);
        map.put("tcl", kVar);
        map.put("tecno", kVar);
        map.put("tecno mobile limited", kVar);
        map.put("vivo", kVar);
        map.put("xiaomi", kVar);
        f24256q = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", kVar);
        map2.put("jio", kVar);
        f24255n = Collections.unmodifiableMap(map2);
    }

    private C3989y() {
    }

    @Deprecated
    public static void f7l8(@lvui Application application, @hb int i2, @lvui g gVar) {
        m14355s(application, new C3988s.zy().f7l8(i2).m14334g(gVar).m14336q());
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static void m14349g(@lvui Application application, @hb int i2) {
        m14355s(application, new C3988s.zy().f7l8(i2).m14336q());
    }

    @lvui
    /* JADX INFO: renamed from: h */
    public static Context m14350h(@lvui Context context, @hb int i2) {
        if (!n7h()) {
            return context;
        }
        if (i2 == 0) {
            i2 = qrj(context);
        }
        return i2 == 0 ? context : new ContextThemeWrapper(context, i2);
    }

    @lvui
    public static Context kja0(@lvui Context context) {
        return m14350h(context, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ld6(@lvui Activity activity, @hb int i2, @lvui g gVar, @lvui n nVar) {
        if (n7h()) {
            if (i2 == 0) {
                i2 = qrj(activity);
            }
            if (i2 == 0 || !gVar.mo14331k(activity, i2)) {
                return;
            }
            cdj.m14257k(activity, i2);
            nVar.mo14332k(activity);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m14352n(@lvui Application application) {
        m14355s(application, new C3988s.zy().m14336q());
    }

    @zy.ld6(api = 31)
    @SuppressLint({"DefaultLocale"})
    public static boolean n7h() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        zy zyVar = f24256q.get(Build.MANUFACTURER.toLowerCase());
        if (zyVar == null) {
            zyVar = f24255n.get(Build.BRAND.toLowerCase());
        }
        return zyVar != null && zyVar.mo14357k();
    }

    /* JADX INFO: renamed from: p */
    public static void m14353p(@lvui Activity activity) {
        x2(activity, new C3988s.zy().m14336q());
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public static void m14354q(@lvui Activity activity, @lvui g gVar) {
        x2(activity, new C3988s.zy().m14334g(gVar).m14336q());
    }

    private static int qrj(@lvui Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f24254k);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: s */
    public static void m14355s(@lvui Application application, @lvui C3988s c3988s) {
        application.registerActivityLifecycleCallbacks(new q(c3988s));
    }

    @Deprecated
    public static void toq(@lvui Activity activity) {
        m14353p(activity);
    }

    public static void x2(@lvui Activity activity, @lvui C3988s c3988s) {
        ld6(activity, c3988s.m14329n(), c3988s.m14330q(), c3988s.zy());
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static void m14356y(@lvui Application application, @lvui g gVar) {
        m14355s(application, new C3988s.zy().m14334g(gVar).m14336q());
    }

    @Deprecated
    public static void zy(@lvui Activity activity, @hb int i2) {
        x2(activity, new C3988s.zy().f7l8(i2).m14336q());
    }
}

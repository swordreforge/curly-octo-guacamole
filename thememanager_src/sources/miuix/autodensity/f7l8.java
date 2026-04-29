package miuix.autodensity;

import android.app.ResourcesManager;
import android.content.Context;
import android.content.res.CompatibilityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.ResourcesImpl;
import android.content.res.ResourcesKey;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.ArrayMap;
import android.util.DisplayMetrics;
import android.util.Log;
import java.lang.ref.WeakReference;
import miuix.reflect.C7320k;
import miuix.view.C7389y;

/* JADX INFO: compiled from: DensityUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {

    /* JADX INFO: renamed from: k */
    private static ResourcesManager f39741k;

    /* JADX INFO: renamed from: q */
    private static boolean f39742q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static ArrayMap<ResourcesKey, WeakReference<ResourcesImpl>> f87167toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Object f87168zy;

    static {
        try {
            f39741k = (ResourcesManager) C7320k.f7l8(ResourcesManager.class, new Class[0], new Object[0]);
            ResourcesManager resourcesManager = ResourcesManager.getInstance();
            f39741k = resourcesManager;
            f87167toq = (ArrayMap) C7320k.qrj(ResourcesManager.class, resourcesManager, "mResourceImpls");
            f87168zy = f39741k;
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                f87168zy = C7320k.qrj(ResourcesManager.class, f39741k, "mLock");
            } catch (Exception unused2) {
                f87168zy = null;
            }
        }
        if (f39741k == null || f87167toq == null || f87168zy == null) {
            Log.w("AutoDensity", "ResourcesManager reflection failed, this app do not have permission to disable AutoDensity for activity/application");
        }
        try {
            int[] iArr = (int[]) C7320k.ki(Class.forName("miui.util.FeatureParser"), null, "getIntArray", new Class[]{String.class}, "screen_resolution_supported");
            if (iArr == null || iArr.length <= 1) {
                return;
            }
            f39742q = true;
        } catch (Throwable unused3) {
        }
    }

    public static void f7l8(C7389y c7389y) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i2 = c7389y.f42313q;
        configuration.densityDpi = i2;
        displayMetrics.densityDpi = i2;
        displayMetrics.scaledDensity = c7389y.f42310g;
        displayMetrics.density = c7389y.f42312n;
        configuration.fontScale = c7389y.f92295f7l8;
        m25497g(c7389y.f92297zy);
        zy.m25521q("setSystemResources " + displayMetrics + " " + configuration + " defaultBitmapDensity:" + c7389y.f92297zy);
    }

    /* JADX INFO: renamed from: g */
    private static void m25497g(int i2) {
        try {
            C7320k.m26526h(Bitmap.class, null, "setDefaultDensity", new Class[]{Integer.TYPE}, Integer.valueOf(i2));
            zy.m25521q("setDefaultBitmapDensity " + i2);
        } catch (Exception e2) {
            zy.m25521q("reflect exception: " + e2.toString());
        }
    }

    /* JADX INFO: renamed from: k */
    private static void m25498k(Resources resources) {
        C7072q c7072qKja0 = C7070n.ld6().kja0();
        if (c7072qKja0 == null || resources.getDisplayMetrics().densityDpi == c7072qKja0.f42313q) {
            return;
        }
        m25502y(resources, c7072qKja0);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        int i2 = c7072qKja0.f42313q;
        configuration.densityDpi = i2;
        displayMetrics.densityDpi = i2;
        displayMetrics.density = c7072qKja0.f42312n;
        displayMetrics.scaledDensity = c7072qKja0.f42310g;
        configuration.fontScale = c7072qKja0.f92295f7l8;
        if (AutoDensityConfig.shouldUpdateSystemResource()) {
            f7l8(c7072qKja0);
        }
        zy.m25521q("after changeDensity " + displayMetrics + " " + configuration);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m25499n() {
        return f39742q;
    }

    /* JADX INFO: renamed from: q */
    public static int m25500q() {
        try {
            return ((Integer) C7320k.ki(Bitmap.class, null, "getDefaultDensity", new Class[0], new Object[0])).intValue();
        } catch (Exception e2) {
            zy.m25521q("reflect exception: " + e2.toString());
            return -1;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m25501s(Context context) {
        if (context == null) {
            Log.w("AutoDensity", "context should not null");
        } else if (C7070n.ld6().ki()) {
            m25498k(context.getResources());
        }
    }

    private static ResourcesImpl toq(ResourcesKey resourcesKey, C7389y c7389y) {
        try {
            Configuration configuration = new Configuration();
            configuration.setTo((Configuration) C7320k.qrj(ResourcesKey.class, resourcesKey, "mOverrideConfiguration"));
            configuration.densityDpi = c7389y.f42313q;
            int iIntValue = ((Integer) C7320k.qrj(ResourcesKey.class, resourcesKey, "mDisplayId")).intValue();
            String[] strArr = (String[]) C7320k.qrj(ResourcesKey.class, resourcesKey, "mLibDirs");
            CompatibilityInfo compatibilityInfo = (CompatibilityInfo) C7320k.qrj(ResourcesKey.class, resourcesKey, "mCompatInfo");
            int i2 = Build.VERSION.SDK_INT;
            String[] strArr2 = i2 <= 30 ? (String[]) C7320k.qrj(ResourcesKey.class, resourcesKey, "mOverlayDirs") : (String[]) C7320k.qrj(ResourcesKey.class, resourcesKey, "mOverlayPaths");
            ResourcesKey resourcesKey2 = i2 <= 29 ? (ResourcesKey) C7320k.f7l8(ResourcesKey.class, new Class[]{String.class, String[].class, String[].class, String[].class, Integer.TYPE, Configuration.class, CompatibilityInfo.class}, resourcesKey.mResDir, resourcesKey.mSplitResDirs, strArr2, strArr, Integer.valueOf(iIntValue), configuration, compatibilityInfo) : (ResourcesKey) C7320k.f7l8(ResourcesKey.class, new Class[]{String.class, String[].class, String[].class, String[].class, Integer.TYPE, Configuration.class, CompatibilityInfo.class, ResourcesLoader[].class}, resourcesKey.mResDir, resourcesKey.mSplitResDirs, strArr2, strArr, Integer.valueOf(iIntValue), configuration, compatibilityInfo, (ResourcesLoader[]) C7320k.qrj(ResourcesKey.class, resourcesKey, "mLoaders"));
            zy.m25521q("newKey " + resourcesKey2);
            return (ResourcesImpl) C7320k.ki(ResourcesManager.class, f39741k, "findOrCreateResourcesImplForKeyLocked", new Class[]{ResourcesKey.class}, resourcesKey2);
        } catch (Error e2) {
            zy.m25521q("findOrCreateResourcesImplForKeyLocked failed " + e2.toString());
            return null;
        } catch (Exception e3) {
            zy.m25521q("findOrCreateResourcesImplForKeyLocked failed " + e3.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    private static void m25502y(Resources resources, C7389y c7389y) {
        Object obj;
        ResourcesImpl qVar;
        if (f39741k == null || f87167toq == null || (obj = f87168zy) == null) {
            return;
        }
        try {
            synchronized (obj) {
                ResourcesKey resourcesKeyZy = zy((ResourcesImpl) C7320k.qrj(Resources.class, resources, "mResourcesImpl"));
                zy.m25521q("oldKey " + resourcesKeyZy);
                if (resourcesKeyZy != null && (qVar = toq(resourcesKeyZy, c7389y)) != null) {
                    C7320k.m26526h(Resources.class, resources, "setImpl", new Class[]{ResourcesImpl.class}, qVar);
                    zy.m25521q("set impl success " + qVar);
                }
            }
        } catch (Exception e2) {
            zy.m25521q("tryToCreateAndSetResourcesImpl failed " + e2.toString());
        }
    }

    private static ResourcesKey zy(ResourcesImpl resourcesImpl) {
        int size = f87167toq.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                return null;
            }
            WeakReference<ResourcesImpl> weakReferenceValueAt = f87167toq.valueAt(i2);
            if (resourcesImpl == (weakReferenceValueAt != null ? weakReferenceValueAt.get() : null)) {
                return f87167toq.keyAt(i2);
            }
            i2++;
        }
    }
}

package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: ResourcesFlusher.java */
/* JADX INFO: loaded from: classes.dex */
class qrj {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static boolean f46616f7l8 = false;

    /* JADX INFO: renamed from: g */
    private static Field f318g = null;

    /* JADX INFO: renamed from: k */
    private static final String f319k = "ResourcesFlusher";

    /* JADX INFO: renamed from: n */
    private static boolean f320n;

    /* JADX INFO: renamed from: q */
    private static Class<?> f321q;

    /* JADX INFO: renamed from: s */
    private static boolean f322s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Field f46617toq;

    /* JADX INFO: renamed from: y */
    private static Field f323y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static boolean f46618zy;

    private qrj() {
    }

    /* JADX INFO: renamed from: k */
    static void m240k(@lvui Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        m242q(resources);
    }

    @hyr(16)
    /* JADX INFO: renamed from: n */
    private static void m241n(@lvui Object obj) {
        if (!f320n) {
            try {
                f321q = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e(f319k, "Could not find ThemedResourceCache class", e2);
            }
            f320n = true;
        }
        Class<?> cls = f321q;
        if (cls == null) {
            return;
        }
        if (!f46616f7l8) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f318g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e(f319k, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f46616f7l8 = true;
        }
        Field field = f318g;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e(f319k, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    @hyr(24)
    /* JADX INFO: renamed from: q */
    private static void m242q(@lvui Resources resources) {
        Object obj;
        if (!f322s) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f323y = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(f319k, "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            f322s = true;
        }
        Field field = f323y;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e(f319k, "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f46618zy) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f46617toq = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e(f319k, "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            f46618zy = true;
        }
        Field field2 = f46617toq;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e6) {
                Log.e(f319k, "Could not retrieve value from ResourcesImpl#mDrawableCache", e6);
            }
        }
        if (obj2 != null) {
            m241n(obj2);
        }
    }

    @hyr(21)
    private static void toq(@lvui Resources resources) {
        if (!f46618zy) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f46617toq = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(f319k, "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f46618zy = true;
        }
        Field field = f46617toq;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e(f319k, "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @hyr(23)
    private static void zy(@lvui Resources resources) {
        if (!f46618zy) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f46617toq = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(f319k, "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f46618zy = true;
        }
        Object obj = null;
        Field field = f46617toq;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e(f319k, "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (obj == null) {
            return;
        }
        m241n(obj);
    }
}

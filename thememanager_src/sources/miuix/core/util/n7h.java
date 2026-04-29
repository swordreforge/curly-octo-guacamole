package miuix.core.util;

import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ResourcesUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class n7h {

    /* JADX INFO: renamed from: k */
    private static Method f39879k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Constructor<AssetManager> f87358toq;

    static {
        try {
            f39879k = AssetManager.class.getMethod("addAssetPath", String.class);
            f87358toq = AssetManager.class.getConstructor(new Class[0]);
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }

    private n7h() {
    }

    /* JADX INFO: renamed from: k */
    public static Resources m25592k(Resources resources, String... strArr) {
        AssetManager assetManagerNewInstance;
        try {
            assetManagerNewInstance = f87358toq.newInstance(new Object[0]);
            try {
                for (String str : strArr) {
                    f39879k.invoke(assetManagerNewInstance, str);
                }
            } catch (IllegalAccessException e2) {
                e = e2;
                e.printStackTrace();
            } catch (InstantiationException e3) {
                e = e3;
                e.printStackTrace();
            } catch (InvocationTargetException e4) {
                e = e4;
                e.printStackTrace();
            }
        } catch (IllegalAccessException e6) {
            e = e6;
            assetManagerNewInstance = null;
        } catch (InstantiationException e7) {
            e = e7;
            assetManagerNewInstance = null;
        } catch (InvocationTargetException e8) {
            e = e8;
            assetManagerNewInstance = null;
        }
        return resources == null ? new Resources(assetManagerNewInstance, null, null) : new Resources(assetManagerNewInstance, resources.getDisplayMetrics(), resources.getConfiguration());
    }

    public static Resources toq(String... strArr) {
        return m25592k(null, strArr);
    }
}

package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.content.res.loader.ResourcesLoader;
import android.os.Build;
import android.view.ContextThemeWrapper;
import androidx.core.content.C0498q;
import ij.C6095k;
import java.util.HashMap;
import java.util.Map;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: HarmonizedColors.java */
/* JADX INFO: loaded from: classes2.dex */
public class x2 {

    /* JADX INFO: renamed from: k */
    private static final String f24252k = "x2";

    private x2() {
    }

    @lvui
    public static Context f7l8(@lvui Context context, @lvui qrj qrjVar) {
        if (!m14345g()) {
            return context;
        }
        Map<Integer, Integer> mapM14348q = m14348q(context, qrjVar);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, qrjVar.m14322n(C6095k.n7h.bz4g));
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return toq(contextThemeWrapper, mapM14348q) ? contextThemeWrapper : context;
    }

    @zy.ld6(api = 30)
    /* JADX INFO: renamed from: g */
    public static boolean m14345g() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @hyr(api = 21)
    /* JADX INFO: renamed from: k */
    private static void m14346k(@lvui Map<Integer, Integer> map, @lvui TypedArray typedArray, @dd TypedArray typedArray2, @zy.x2 int i2) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i3 = 0; i3 < typedArray.getIndexCount(); i3++) {
            int resourceId = typedArray2.getResourceId(i3, 0);
            if (resourceId != 0 && typedArray.hasValue(i3) && m14347n(typedArray.getType(i3))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(kja0.m14286s(typedArray.getColor(i3, 0), i2)));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private static boolean m14347n(int i2) {
        return 28 <= i2 && i2 <= 31;
    }

    @hyr(api = 21)
    /* JADX INFO: renamed from: q */
    private static Map<Integer, Integer> m14348q(Context context, qrj qrjVar) {
        HashMap map = new HashMap();
        int iZy = kja0.zy(context, qrjVar.toq(), f24252k);
        for (int i2 : qrjVar.m14323q()) {
            map.put(Integer.valueOf(i2), Integer.valueOf(kja0.m14286s(C0498q.m2252g(context, i2), iZy)));
        }
        C3985p c3985pZy = qrjVar.zy();
        if (c3985pZy != null) {
            int[] iArrM14319q = c3985pZy.m14319q();
            if (iArrM14319q.length > 0) {
                int iM14318n = c3985pZy.m14318n();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArrM14319q);
                TypedArray typedArrayObtainStyledAttributes2 = iM14318n != 0 ? new ContextThemeWrapper(context, iM14318n).obtainStyledAttributes(iArrM14319q) : null;
                m14346k(map, typedArrayObtainStyledAttributes, typedArrayObtainStyledAttributes2, iZy);
                typedArrayObtainStyledAttributes.recycle();
                if (typedArrayObtainStyledAttributes2 != null) {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
        return map;
    }

    @hyr(api = 30)
    private static boolean toq(Context context, Map<Integer, Integer> map) throws Throwable {
        ResourcesLoader resourcesLoaderM14320k = C3986q.m14320k(context, map);
        if (resourcesLoaderM14320k == null) {
            return false;
        }
        context.getResources().addLoaders(resourcesLoaderM14320k);
        return true;
    }

    @lvui
    public static void zy(@lvui Context context, @lvui qrj qrjVar) {
        if (m14345g()) {
            Map<Integer, Integer> mapM14348q = m14348q(context, qrjVar);
            int iM14322n = qrjVar.m14322n(0);
            if (!toq(context, mapM14348q) || iM14322n == 0) {
                return;
            }
            cdj.m14257k(context, iM14322n);
        }
    }
}

package com.android.thememanager.miuixcompat;

import android.util.ArrayMap;
import android.util.Log;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.kja0;
import java.util.List;

/* JADX INFO: compiled from: IComponentThemeCompatibleAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public interface toq {
    /* JADX INFO: renamed from: k */
    default boolean m8321k(String code, Resource resource, boolean isThirdAppUpdate) {
        if (!p029m.zy.toq(code) && resource != null && !resource.getIsBackUpVersion()) {
            List<RelatedResource> parentResources = resource.getParentResources();
            if (kja0.qrj(parentResources)) {
                RelatedResource subResource = resource.getSubResource(code);
                if (subResource != null) {
                    resource = C1792n.zy(subResource, C1791k.getInstance(code));
                }
            } else {
                Resource resourceZy = C1792n.zy(parentResources.get(0), C1791k.getInstance(code));
                if (resourceZy == null || resourceZy.getSubResource(code) == null) {
                    if (isThirdAppUpdate) {
                        C2206g.jk(false, "checkIsCompatible , parentResource is null or getSubResource is null", code);
                    }
                    return true;
                }
            }
            if (resource == null) {
                return true;
            }
            String miuiAdapterVersion = resource.getMiuiAdapterVersion();
            float f2 = -1.0f;
            try {
                f2 = Float.parseFloat(miuiAdapterVersion);
            } catch (Exception unused) {
                Log.i("theme", "isCompatibleForCodeAndResource: themeVersion = " + miuiAdapterVersion);
            }
            boolean z2 = f2 >= C2206g.f60496zy;
            String str = p001b.toq.m5742n().get(zy());
            ArrayMap<String, Integer> arrayMapX2 = C2206g.x2(str);
            if (isThirdAppUpdate) {
                C2206g.jk(false, "checkIsCompatible , isThemeVersionMIUIX2 = " + z2 + ",appMap=" + arrayMapX2, code);
            }
            Log.i("theme", "isCompatibleForCodeAndResource: themeMIUIXVersion = " + f2 + "，code = " + code);
            if (z2) {
                return true;
            }
            Integer num = arrayMapX2.get(C2206g.f13002h);
            Log.i("theme", "isCompatibleForCodeAndResource: appcompatVersion =" + num + "，packageName =" + str);
            return (num != null && f2 == ((float) num.intValue())) || (num == null && f2 < 0.0f);
        }
        return true;
    }

    String toq();

    String zy();
}

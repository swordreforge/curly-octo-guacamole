package zsr0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment;
import com.android.thememanager.util.nn86;
import com.miui.maml.widget.edit.MamlutilKt;
import java.io.File;
import java.util.List;
import miuix.core.util.C7083n;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: LocalResourceUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {
    public static boolean f7l8(String imagePath) {
        int iLastIndexOf;
        return !TextUtils.isEmpty(imagePath) && new File(imagePath).exists() && (iLastIndexOf = imagePath.lastIndexOf("_")) >= 0 && imagePath.substring(iLastIndexOf).contains(MamlutilKt.PREVIEW_DARK_SUF);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m28219g(String packageName, String localId, boolean isOfficial) {
        return nn86.zy().f7l8(localId, packageName, isOfficial);
    }

    /* JADX INFO: renamed from: k */
    public static String m28220k(String imagePath) {
        int iLastIndexOf;
        if (!TextUtils.isEmpty(imagePath) && (iLastIndexOf = imagePath.lastIndexOf(".")) > 0) {
            File file = new File(imagePath.substring(0, iLastIndexOf) + "_dark." + imagePath.substring(iLastIndexOf + 1));
            if (file.exists()) {
                return file.getPath();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m28221n(Context context, Resource resource, String resourceCode) {
        String strM6971y = new C1795s(resource, C1791k.getInstance(resourceCode)).m6971y();
        String strO1t = C2320q.o1t(context, resourceCode);
        if (TextUtils.isEmpty(strO1t)) {
            return false;
        }
        String strM28220k = null;
        if (o1t.m7179z() && TextUtils.equals(resourceCode, "wallpaper") && (C1792n.nn86(strM6971y) || C1792n.hyr(strM6971y))) {
            strM28220k = m28220k(strM6971y);
        }
        String strM25584g = C7083n.m25584g(strO1t);
        return TextUtils.equals(C7083n.m25584g(strM6971y), strM25584g) || TextUtils.equals(C7083n.m25584g(strM28220k), strM25584g);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m28222q(Intent intent) {
        Bundle extras;
        return (intent.getExtras() == null || (extras = intent.getExtras()) == null || !extras.containsKey(InterfaceC1357q.f53952vep5)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m28223s(String resourceCode) {
        boolean z2 = !bf2.toq.toq().getSharedPreferences(BaseLocalResourceFragment.f12738w, 0).getBoolean(BaseLocalResourceFragment.f60451ab, false);
        return z2 ? C2320q.m8486o(C1791k.getInstance(resourceCode)) : z2;
    }

    public static String toq(String imageSensorPath) {
        int iLastIndexOf;
        if (C1807g.zurt() && !TextUtils.isEmpty(imageSensorPath) && (iLastIndexOf = imageSensorPath.lastIndexOf(".")) > 0) {
            File file = new File(imageSensorPath.substring(0, iLastIndexOf) + "_small." + imageSensorPath.substring(iLastIndexOf + 1));
            if (file.exists()) {
                return file.getPath();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static void m28224y() {
        SharedPreferences.Editor editorEdit = bf2.toq.toq().getSharedPreferences(BaseLocalResourceFragment.f12738w, 0).edit();
        editorEdit.putBoolean(BaseLocalResourceFragment.f60451ab, true);
        editorEdit.apply();
    }

    public static String zy(Resource resource, String resourceCode) {
        C1795s c1795s = new C1795s(resource, C1791k.getInstance(resourceCode));
        List<String> listM6967n = c1795s.m6967n();
        String str = listM6967n.isEmpty() ? null : listM6967n.get(0);
        if (!TextUtils.isEmpty(str) && new File(str).isFile()) {
            return str;
        }
        List<PathEntry> listM6968p = c1795s.m6968p();
        PathEntry pathEntry = listM6968p.isEmpty() ? null : listM6968p.get(0);
        if (pathEntry == null || pathEntry.getLocalPath() == null) {
            return null;
        }
        return pathEntry.getLocalPath();
    }
}

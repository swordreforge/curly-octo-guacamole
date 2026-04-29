package com.android.thememanager.superwallpaper.util;

import android.app.Activity;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.provider.Settings;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.presenter.C2308g;
import com.android.thememanager.v9.data.C2850g;
import com.android.thememanager.v9.data.C2852n;
import h7am.C6071k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.appcompat.app.ki;
import qkj8.C7617k;

/* JADX INFO: compiled from: MamlSuperWallpaperUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy {

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.util.zy$k */
    /* JADX INFO: compiled from: MamlSuperWallpaperUtils.java */
    class DialogInterfaceOnClickListenerC2734k implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ DialogInterface.OnClickListener f16153k;

        DialogInterfaceOnClickListenerC2734k(final DialogInterface.OnClickListener val$onConfirmListener) {
            this.f16153k = val$onConfirmListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            DialogInterface.OnClickListener onClickListener = this.f16153k;
            if (onClickListener != null) {
                onClickListener.onClick(dialog, which);
            }
        }
    }

    public static boolean f7l8(String packageName) {
        try {
            bf2.toq.toq().getPackageManager().getPackageInfo(packageName, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m9515g(String id, int landPosition, String code, List<Resource> list, boolean isTheme) {
        if (list == null) {
            return null;
        }
        for (Resource resource : list) {
            if (resource.getParentResources() != null && resource.getParentResources().size() > 0) {
                RelatedResource relatedResource = resource.getParentResources().get(0);
                if (id.equals(relatedResource.getLocalId())) {
                    String str = isTheme ? "theme" : "spwallpaper";
                    List<String> listM6969q = new C1795s(C1792n.zy(relatedResource, C1791k.getInstance(str)), C1791k.getInstance(str)).m6969q();
                    if (listM6969q != null && listM6969q.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int size = listM6969q.size() - 1; size >= 0; size--) {
                            String str2 = listM6969q.get(size);
                            if (str2.contains(code)) {
                                if (!"spwallpaper".contains(code)) {
                                    return str2;
                                }
                                if (!isTheme) {
                                    if (str2.contains("spwallpaper_" + landPosition)) {
                                        return str2;
                                    }
                                }
                                arrayList.add(str2);
                            }
                        }
                        if (arrayList.size() > 0) {
                            return (String) arrayList.get(0);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static ki m9516k(Activity activity, DialogInterface.OnClickListener onConfirmListener) {
        return new ki.C6947k(activity).uv6(activity.getString(R.string.de_super_wp_dialog_tip_title)).m25050z(activity.getString(R.string.de_super_wp_dialog_tip_content)).m25047s(true).x9kr(activity.getString(R.string.miuix_compat_dialog_ok), new DialogInterfaceOnClickListenerC2734k(onConfirmListener)).jk(activity.getString(R.string.miuix_compat_dialog_cancel), null).m25037g();
    }

    /* JADX INFO: renamed from: n */
    public static int m9517n(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), C6071k.f35076i.getClassName(), 0);
    }

    /* JADX INFO: renamed from: q */
    public static ArrayList<C2852n> m9518q() {
        ArrayList<C2852n> arrayList = new ArrayList<>();
        List<Resource> listJp0y = C2320q.jp0y();
        if (!kja0.qrj(listJp0y)) {
            Iterator<Resource> it = listJp0y.iterator();
            while (it.hasNext()) {
                List<RelatedResource> parentResources = it.next().getParentResources();
                if (!kja0.qrj(parentResources)) {
                    Resource resourceZy = C1792n.zy(parentResources.get(0), C1791k.getInstance("spwallpaper"));
                    C2850g c2850g = new C2850g(resourceZy, resourceZy.getTitle(), resourceZy.getLocalInfo().getDescription());
                    c2850g.f17070k = resourceZy.getProductId();
                    c2850g.f61467toq = C2308g.f13473z;
                    arrayList.add(c2850g);
                }
            }
        }
        return arrayList;
    }

    public static String toq(String code) {
        String strZurt = vyq.zurt(code);
        if (strZurt == null) {
            if (vyq.zurt("spwallpaper") == null || !"splockscreen".equals(code) || !"com.android.thememanager.theme_lock_live_wallpaper".equals(C7617k.toq().zy())) {
                return null;
            }
            strZurt = vyq.zurt("spwallpaper");
        }
        int iM9517n = m9517n(bf2.toq.toq());
        String strM9515g = m9515g(strZurt, iM9517n, code, C2320q.jp0y(), false);
        return strM9515g != null ? strM9515g : m9515g(strZurt, iM9517n, code, C2320q.a9(code, false), true);
    }

    /* JADX INFO: renamed from: y */
    public static void m9519y(Context context, int position) {
        Settings.Secure.putInt(context.getContentResolver(), C6071k.f35076i.getClassName(), position);
    }

    public static String zy() {
        String str;
        if ("com.android.thememanager.theme_lock_live_wallpaper".equals(C7617k.toq().zy())) {
            String strFu4 = vyq.fu4("spwallpaper");
            if (!p029m.zy.toq(strFu4)) {
                return strFu4;
            }
            WallpaperInfo wallpaperInfo = WallpaperManager.getInstance(bf2.toq.toq()).getWallpaperInfo();
            if (wallpaperInfo == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentServices = bf2.toq.toq().getPackageManager().queryIntentServices(new Intent("miui.service.wallpaper.SuperWallpaperService"), 128);
            if (listQueryIntentServices != null && listQueryIntentServices.size() != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= listQueryIntentServices.size()) {
                        break;
                    }
                    if (listQueryIntentServices.get(i2) == null || listQueryIntentServices.get(i2).serviceInfo == null || (str = listQueryIntentServices.get(i2).serviceInfo.packageName) == null || !str.equals(wallpaperInfo.getPackageName())) {
                        i2++;
                    } else if (listQueryIntentServices.get(i2).serviceInfo.metaData != null) {
                        return listQueryIntentServices.get(i2).serviceInfo.metaData.getString("id");
                    }
                }
            }
        }
        return null;
    }
}

package com.android.thememanager.basemodule.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.presenter.C2308g;
import com.android.thememanager.util.C2755a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.C6311u;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import yz.C7794k;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.e */
/* JADX INFO: compiled from: ThirdPartyIntentUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1803e {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C1803e f10298k = new C1803e();

    /* JADX INFO: renamed from: n */
    public static final int f10299n = 1;

    /* JADX INFO: renamed from: q */
    public static final int f10300q = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f57733toq = 11;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f57734zy = 10;

    private C1803e() {
    }

    public static /* synthetic */ Intent f7l8(String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return m7035g(str, str2, z2);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: g */
    public static final Intent m7035g(@InterfaceC7395n String str, @InterfaceC7395n String str2, boolean z2) {
        int i2 = !com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().qrj() ? 1 : 0;
        int i3 = z2 ? 11 : 10;
        C6311u c6311u = C6311u.f36447k;
        String str3 = String.format("widget://picker/detail?type=%s&appName=%s&groupId=%s&openSource=3&pickerStatusBarColorMode=%s", Arrays.copyOf(new Object[]{Integer.valueOf(i3), str, str2, Integer.valueOf(i2)}, 4));
        kotlin.jvm.internal.d2ok.kja0(str3, "format(format, *args)");
        return new Intent("android.intent.action.VIEW", Uri.parse(str3));
    }

    @l05.qrj
    /* JADX INFO: renamed from: h */
    public static final boolean m7036h(@InterfaceC7395n Fragment fragment, @InterfaceC7395n Activity activity, int i2) {
        Intent intentM7042y = f10298k.m7042y();
        try {
            if (fragment != null) {
                fragment.startActivityForResult(intentM7042y, i2);
                return true;
            }
            kotlin.jvm.internal.d2ok.qrj(activity);
            activity.startActivityForResult(intentM7042y, i2);
            return true;
        } catch (Exception unused) {
            C7794k.toq(C2755a.f16307g, "no activity for wallpaperLoopPicker");
            return false;
        }
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: k */
    public static final Intent m7037k() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        return intent;
    }

    @l05.qrj
    public static final void kja0(@InterfaceC7396q Fragment fragment, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(fragment, "fragment");
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setPackage("com.android.fileexplorer");
        intent.putExtra("root_directory", "/");
        intent.putExtra("ext_filter", new String[]{C2308g.f13473z});
        intent.putExtra("ext_file_first", true);
        intent.putExtra("back_to_parent_directory", false);
        fragment.startActivityForResult(intent, i2);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Uri ld6(@InterfaceC7396q String keyWord) {
        kotlin.jvm.internal.d2ok.m23075h(keyWord, "keyWord");
        Uri uri = Uri.parse("market://search?q=" + keyWord + "&ref=theme");
        kotlin.jvm.internal.d2ok.kja0(uri, "parse(...)");
        return uri;
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: n */
    public static final Intent m7038n(@InterfaceC7396q Context context) {
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
        Intent intent = new Intent();
        intent.setClassName(context, "com.android.thememanager.ThemeResourceProxyTabActivity");
        intent.addFlags(268468224);
        return intent;
    }

    public static /* synthetic */ boolean n7h(Activity activity, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return qrj(activity, z2);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: p */
    public static final Uri m7039p(@InterfaceC7396q String packageName, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(packageName, "packageName");
        if (z2) {
            Uri uri = Uri.parse("mimarket://details?id=" + packageName);
            kotlin.jvm.internal.d2ok.kja0(uri, "parse(...)");
            return uri;
        }
        Uri uri2 = Uri.parse("market://details?id=" + packageName);
        kotlin.jvm.internal.d2ok.kja0(uri2, "parse(...)");
        return uri2;
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ Intent m7040q(C1803e c1803e, Activity activity, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return c1803e.zy(activity, z2);
    }

    @l05.qrj
    public static final boolean qrj(@InterfaceC7395n Activity activity, boolean z2) {
        Intent intentZy = f10298k.zy(activity, z2);
        if (activity == null) {
            return true;
        }
        try {
            activity.startActivityForResult(intentZy, 102);
            return true;
        } catch (Exception e2) {
            C7794k.zy(C2755a.f16307g, "startGallerySafe error ", e2);
            return false;
        }
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: s */
    public static final Intent m7041s(@InterfaceC7395n String str, @InterfaceC7395n String str2, @InterfaceC7395n String str3) {
        int i2 = !com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().qrj() ? 1 : 0;
        C6311u c6311u = C6311u.f36447k;
        String str4 = String.format("widget://picker/detail?type=6&openSource=3&appName=%s&productId=%s&mamlSize=%s&pickerStatusBarColorMode=%s", Arrays.copyOf(new Object[]{str3, str, str2, Integer.valueOf(i2)}, 4));
        kotlin.jvm.internal.d2ok.kja0(str4, "format(format, *args)");
        return new Intent("android.intent.action.VIEW", Uri.parse(str4));
    }

    @InterfaceC7396q
    @l05.qrj
    public static final Intent toq(@InterfaceC7395n Context context) {
        if (context == null) {
            context = bf2.toq.toq();
        }
        Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
        kotlin.jvm.internal.d2ok.qrj(context);
        intent.putExtra(cdj.f10286n, context.getPackageName());
        intent.addFlags(268435456);
        ArrayList<ResolveInfo> arrayListQrj = a9.qrj(context, intent);
        kotlin.jvm.internal.d2ok.kja0(arrayListQrj, "resolveIntent(...)");
        if (arrayListQrj.size() > 1) {
            Iterator<ResolveInfo> it = arrayListQrj.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (kotlin.jvm.internal.d2ok.f7l8("com.android.providers.downloads.ui", next.activityInfo.packageName)) {
                    intent.setPackage(next.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    @InterfaceC7395n
    @l05.qrj
    public static final ArrayList<ResolveInfo> x2() {
        return y9n.m7244c(m7037k());
    }

    /* JADX INFO: renamed from: y */
    private final Intent m7042y() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        intent.putExtra("pick-upper-bound", 5);
        intent.setPackage("com.miui.gallery");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        return intent;
    }

    private final Intent zy(Activity activity, boolean z2) {
        Intent intent;
        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
        intent2.addCategory("android.intent.category.OPENABLE");
        intent2.setType((qrj.zy(qrj.toq.VIDEO_WALLPAPER) || z2) ? "image/*" : "image/*, video/*");
        intent2.setPackage("com.miui.gallery");
        intent2.putExtra("pick-need-origin", true);
        intent2.putExtra(com.android.thememanager.f7l8.f11607n, (activity == null || (intent = activity.getIntent()) == null) ? null : Integer.valueOf(intent.getIntExtra(com.android.thememanager.f7l8.f11607n, -1)));
        return intent2;
    }
}

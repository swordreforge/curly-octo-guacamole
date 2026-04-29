package com.android.thememanager.settings;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.FileProvider;
import bz2.InterfaceC1382k;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.C1808h;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.recommend.model.entity.element.WallpaperSettingElement;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.settings.C2532p;
import com.google.gson.C4871g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import retrofit2.C7639i;
import sok.C7670k;
import yqrt.C7792k;
import zy.y9n;

/* JADX INFO: loaded from: classes2.dex */
public class OnlineWallpapersForSettingProvider extends ContentProvider {

    /* JADX INFO: renamed from: a */
    private static final String f14903a = "aod_picker";

    /* JADX INFO: renamed from: b */
    private static final String f14904b = "online_aod_available";

    /* JADX INFO: renamed from: c */
    private static final String f14905c = "UserAgreement_Theme";

    /* JADX INFO: renamed from: e */
    private static final String f14906e = "aod_detail";

    /* JADX INFO: renamed from: f */
    private static final String f14907f = "result_uri";

    /* JADX INFO: renamed from: g */
    private static final String f14908g = "getOnlineWallpapers";

    /* JADX INFO: renamed from: h */
    private static final String f14909h = "enterAODDetail";

    /* JADX INFO: renamed from: i */
    private static final String f14910i = "enterAODSubject";

    /* JADX INFO: renamed from: j */
    private static final String f14911j = "subject_uuid";

    /* JADX INFO: renamed from: l */
    private static final String f14912l = "page_id";

    /* JADX INFO: renamed from: m */
    private static final String f14913m = "title";

    /* JADX INFO: renamed from: o */
    private static final String f14915o = "track_id";

    /* JADX INFO: renamed from: p */
    private static final String f14916p = "getOnlineAODs";

    /* JADX INFO: renamed from: r */
    private static final String f14917r = "json_list";

    /* JADX INFO: renamed from: s */
    private static final String f14918s = "onlineAodAvailable";

    /* JADX INFO: renamed from: t */
    private static final String f14919t = "detail";

    /* JADX INFO: renamed from: y */
    private static final String f14921y = "getWallpaperUri";

    /* JADX INFO: renamed from: z */
    private static final String f14922z = "getEnterIntent";

    /* JADX INFO: renamed from: k */
    private retrofit2.toq<CommonResponse<sok.toq<C7670k<sok.zy>>>> f14923k;

    /* JADX INFO: renamed from: q */
    private C4871g f14924q;

    /* JADX INFO: renamed from: n */
    private static final String f14914n = OnlineWallpapersForSettingProvider.class.getSimpleName();

    /* JADX INFO: renamed from: x */
    private static String f14920x = null;

    @y9n
    private String f7l8() {
        if (!C1819o.m7159l()) {
            return null;
        }
        retrofit2.toq<CommonResponse<sok.toq<C7670k<sok.zy>>>> toqVar = this.f14923k;
        if (toqVar != null) {
            toqVar.cancel();
        }
        retrofit2.toq<CommonResponse<sok.toq<C7670k<sok.zy>>>> qVar = ((com.android.thememanager.zurt) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().qrj(com.android.thememanager.zurt.class)).toq();
        this.f14923k = qVar;
        try {
            C7639i<CommonResponse<sok.toq<C7670k<sok.zy>>>> c7639iF7l8 = qVar.f7l8();
            if (!com.android.thememanager.basemodule.network.theme.toq.m6892k(c7639iF7l8)) {
                return null;
            }
            Collection collection = c7639iF7l8.m27986k().apiData.cards;
            if (com.android.thememanager.basemodule.utils.kja0.qrj(collection)) {
                return null;
            }
            m8975k(getContext());
            return new C4871g().o1t(collection);
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private Intent m8974g(Bundle extras) {
        if (extras == null) {
            return null;
        }
        String string = extras.getString("subject_uuid");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("theme://zhuti.xiaomi.com/uipages/subjects/");
        sb.append(string);
        sb.append("?");
        sb.append(com.android.thememanager.basemodule.utils.x9kr.f10438g);
        sb.append("=");
        sb.append(f14903a);
        sb.append("&");
        sb.append("S.");
        sb.append("REQUEST_RESOURCE_CODE");
        sb.append("=");
        sb.append("aod");
        sb.append("&");
        sb.append(com.android.thememanager.basemodule.utils.x9kr.f57817f7l8);
        sb.append("=true");
        String string2 = extras.getString("title");
        if (!TextUtils.isEmpty(string2)) {
            sb.append("&title=");
            sb.append(string2);
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse(sb.toString()));
        intent.putExtra("REQUEST_IS_GRID", true);
        intent.addFlags(335544320);
        return intent;
    }

    /* JADX INFO: renamed from: k */
    private static void m8975k(Context context) {
        File[] fileArrListFiles;
        File file = new File(m8978s(context));
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private Intent m8976n(Bundle extras) {
        if (extras == null) {
            return null;
        }
        String string = extras.getString(f14906e);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        UIProduct uIProduct = (UIProduct) new C4871g().n7h(string, UIProduct.class);
        if (TextUtils.isEmpty(uIProduct.uuid)) {
            return null;
        }
        Intent intentKi = com.android.thememanager.toq.ki(getContext(), null, uIProduct.uuid, null, uIProduct.trackId, Boolean.FALSE, uIProduct.productType);
        intentKi.addFlags(335544320);
        com.android.thememanager.basemodule.analysis.f7l8.toq(intentKi, f14903a);
        return intentKi;
    }

    /* JADX INFO: renamed from: q */
    private Uri m8977q(Context context, String packageName, File file) {
        Uri uriM2162g = FileProvider.m2162g(context, com.android.thememanager.basemodule.resource.constants.toq.o9qk, file);
        if (TextUtils.isEmpty(packageName)) {
            packageName = "com.miui.miwallpaper";
        }
        context.grantUriPermission(packageName, uriM2162g, 1);
        return uriM2162g;
    }

    /* JADX INFO: renamed from: s */
    public static String m8978s(Context context) {
        if (!TextUtils.isEmpty(f14920x)) {
            return f14920x;
        }
        String str = context.getFilesDir() + File.separator + "setting_wallpaperimg_cache";
        f14920x = str;
        C1821p.m7190s(str);
        return f14920x;
    }

    private void toq(@zy.dd Bundle extras) {
        if (extras == null) {
            return;
        }
        String string = extras.getString(f14906e);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        UIProduct uIProduct = (UIProduct) new C4871g().n7h(string, UIProduct.class);
        if (TextUtils.isEmpty(uIProduct.uuid)) {
            return;
        }
        getContext().startActivity(m8976n(extras));
        if (TextUtils.isEmpty(uIProduct.trackId)) {
            return;
        }
        com.android.thememanager.basemodule.analysis.kja0.f7l8(com.android.thememanager.basemodule.analysis.toq.dyer, uIProduct.trackId, null);
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.dyer, uIProduct.trackId, null));
    }

    /* JADX INFO: renamed from: y */
    private void m8979y(Bundle ret, int page) {
        List<UIElement> qVar;
        String str;
        WallpaperSettingElement wallpaperSettingElement;
        UIImageWithLink imageBanner;
        try {
            C7639i<CommonResponse<com.google.gson.kja0>> c7639iF7l8 = ((InterfaceC1382k) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().qrj(InterfaceC1382k.class)).zy(page, com.android.thememanager.basemodule.network.theme.toq.toq()).f7l8();
            if (c7639iF7l8.m27986k() != null) {
                UIPage uIPage = (UIPage) C1808h.m7086k().m17099s(c7639iF7l8.m27986k().apiData, UIPage.class);
                str = uIPage.uuid;
                qVar = new C7792k(false).toq(uIPage.cards, page == 0, uIPage.hasMore);
            } else {
                qVar = null;
                str = "";
            }
            if (qVar == null || qVar.size() <= 0) {
                return;
            }
            m8975k(getContext());
            C2532p qVar2 = C2532p.toq();
            ArrayList arrayList = new ArrayList();
            for (UIElement uIElement : qVar) {
                if ((uIElement instanceof WallpaperSettingElement) && (imageBanner = (wallpaperSettingElement = (WallpaperSettingElement) uIElement).getImageBanner()) != null && imageBanner.link != null) {
                    arrayList.add(wallpaperSettingElement.getImageBanner());
                    if (!TextUtils.isEmpty(imageBanner.wallpaperGalleryType) && !TextUtils.isEmpty(imageBanner.wallpaperGalleryTypeId)) {
                        qVar2.m9037n(imageBanner.imageUrl, new C2532p.k(imageBanner.wallpaperGalleryType, imageBanner.wallpaperGalleryTypeId));
                    }
                }
            }
            int size = arrayList.size();
            if (size > 0 && size % 2 != 0) {
                arrayList.remove(size - 1);
            }
            ret.putString(f14917r, this.f14924q.o1t(arrayList));
            ret.putString(f14912l, str);
        } catch (IOException e2) {
            Log.w(f14914n, "getOnlineWallpapers fail." + e2);
        }
    }

    private void zy(@zy.dd Bundle extras) {
        Intent intentM8974g = m8974g(extras);
        if (intentM8974g == null) {
            return;
        }
        getContext().startActivity(intentM8974g);
        String string = extras.getString("track_id");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        com.android.thememanager.basemodule.analysis.kja0.f7l8(com.android.thememanager.basemodule.analysis.toq.dyer, string, null);
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.dyer, string, null));
    }

    @Override // android.content.ContentProvider
    public Bundle call(@zy.lvui String method, String arg, Bundle extras) {
        Log.d(f14914n, "call:" + method + " arg:" + arg);
        Bundle bundle = new Bundle();
        if (!C1781k.toq(getContext())) {
            bundle.putBoolean(f14905c, false);
            if (f14918s.equals(method)) {
                bundle.putBoolean(f14904b, C1819o.m7159l());
            }
            return bundle;
        }
        bundle.putBoolean(f14905c, true);
        if (method.equals("getOnlineWallpapers")) {
            m8979y(bundle, extras != null ? extras.getInt("page_num") : 0);
            return bundle;
        }
        if (method.equals("getWallpaperUri")) {
            Uri uriM8980p = m8980p(extras);
            if (uriM8980p != null) {
                bundle.putString(f14907f, uriM8980p.toString());
            }
            return bundle;
        }
        if (f14918s.equals(method)) {
            bundle.putBoolean(f14904b, C1819o.m7159l());
            return bundle;
        }
        if (f14916p.equals(method)) {
            com.android.thememanager.basemodule.analysis.kja0.m6641s(com.android.thememanager.basemodule.analysis.toq.cjaj, com.android.thememanager.basemodule.analysis.toq.dyer, null, null);
            C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.cjaj, C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.dyer, null, ""));
            bundle.putString(f14917r, f7l8());
            return bundle;
        }
        if (f14909h.equals(method)) {
            toq(extras);
            return bundle;
        }
        if (f14910i.equals(method)) {
            zy(extras);
            return bundle;
        }
        if (!f14922z.equals(method)) {
            return null;
        }
        bundle.putParcelable("android.intent.extra.INTENT", "detail".equals(arg) ? m8976n(extras) : m8974g(extras));
        return bundle;
    }

    @Override // android.content.ContentProvider
    public int delete(@zy.lvui Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(@zy.lvui Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@zy.lvui Uri uri, ContentValues values) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f14924q = new C4871g();
        Log.d(f14914n, "onCreate");
        return false;
    }

    /* JADX INFO: renamed from: p */
    public Uri m8980p(Bundle extra) {
        Context context;
        try {
            context = getContext();
        } catch (Exception e2) {
            Log.e(f14914n, e2.getMessage());
        }
        if (extra != null && context != null) {
            String string = extra.getString("id");
            String string2 = extra.getString("url");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                File file = new File(m8978s(context) + "/" + string);
                if (file.exists()) {
                    return m8977q(getContext(), getCallingPackage(), file);
                }
                File file2 = com.bumptech.glide.zy.a9(context).mcp().mo6748i(string2).dxef().get();
                C1821p.f7l8(new FileInputStream(file2), file);
                if (file.exists()) {
                    Uri uriM8977q = m8977q(getContext(), getCallingPackage(), file);
                    Log.d(f14914n, "getWallpaperUri:" + uriM8977q);
                    return uriM8977q;
                }
                if (file2.exists()) {
                    Uri uriM8977q2 = m8977q(getContext(), getCallingPackage(), file2);
                    Log.d(f14914n, "getWallpaperUri:" + uriM8977q2);
                    return uriM8977q2;
                }
                return null;
            }
            Log.w(f14914n, "getWallpaperUri id or url = null");
            return null;
        }
        Log.w(f14914n, "getWallpaperUri extra = null, or context null");
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@zy.lvui Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@zy.lvui Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}

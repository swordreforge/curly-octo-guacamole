package com.android.thememanager.settings.superwallpaper.activity.data;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.android.thememanager.settings.eqxt;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.utils.C2667q;
import com.android.thememanager.settings.superwallpaper.utils.x2;
import com.android.thememanager.v9.data.C2852n;
import com.android.thememanager.v9.data.C2854q;
import com.miui.maml.widget.edit.MamlutilKt;
import ek5k.C6002g;
import h7am.C6071k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import zy.oc;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.data.k */
/* JADX INFO: compiled from: SuperWallpaperResourceDataLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2640k {

    /* JADX INFO: renamed from: q */
    private static final String f15625q = "SWallpaperRDataLoader";

    /* JADX INFO: renamed from: k */
    private AsyncTask<Void, Void, SuperWallpaperSummaryData[]> f15626k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private HashSet<WeakReference<toq>> f60884toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private HashMap<String, SuperWallpaperSummaryData> f60885zy;

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.data.k$q */
    /* JADX INFO: compiled from: SuperWallpaperResourceDataLoader.java */
    private static class q extends AsyncTask<Void, Void, SuperWallpaperSummaryData[]> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public SuperWallpaperSummaryData[] doInBackground(Void... params) {
            Log.d(C6071k.f35077k, "LoadSuperWallpaperSummaryTask");
            return C2640k.m9217p(bf2.toq.toq());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(SuperWallpaperSummaryData[] superWallpaperLandData) {
            if (isCancelled()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("LoadSuperWallpaperSummaryTask onPostExecute ");
            sb.append(superWallpaperLandData == null ? -1 : superWallpaperLandData.length);
            Log.d(C6071k.f35077k, sb.toString());
            C2640k.m9216n().qrj(superWallpaperLandData);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.data.k$toq */
    /* JADX INFO: compiled from: SuperWallpaperResourceDataLoader.java */
    public interface toq {
        void c8jq(SuperWallpaperSummaryData[] data);
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.data.k$zy */
    /* JADX INFO: compiled from: SuperWallpaperResourceDataLoader.java */
    private static class zy {

        /* JADX INFO: renamed from: k */
        private static final C2640k f15627k = new C2640k();

        private zy() {
        }
    }

    private static int f7l8(Context context, String name, String type) {
        try {
            return context.getResources().getIdentifier(name, type, context.getPackageName());
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m9215g(SuperWallpaperSummaryData data, String provider, String type) throws Throwable {
        Bundle bundle = new Bundle();
        bundle.putString(C2656k.f60907d2ok, type);
        Bundle bundleM9296k = C2667q.m9296k(bf2.toq.toq(), Uri.parse(provider), C2656k.f60918jp0y, null, bundle);
        if (bundleM9296k != null) {
            Bitmap bitmap = (Bitmap) bundleM9296k.getParcelable("preview");
            if (bitmap != null) {
                if (type == "0") {
                    data.f15594f.f15611g = Icon.createWithBitmap(bitmap);
                } else if (type == "1") {
                    data.f15594f.f15618s = Icon.createWithBitmap(bitmap);
                } else if (type == "2") {
                    data.f15594f.f15612h = Icon.createWithBitmap(bitmap);
                }
            }
            Bitmap bitmap2 = (Bitmap) bundleM9296k.getParcelable(C2656k.f60909dd);
            if (bitmap2 == null) {
                SuperWallpaperSummaryData.SuperWallpaperLandData superWallpaperLandData = data.f15594f;
                superWallpaperLandData.f15619y = superWallpaperLandData.f15611g;
                superWallpaperLandData.f15616p = superWallpaperLandData.f15618s;
                superWallpaperLandData.f15613i = superWallpaperLandData.f15612h;
                return;
            }
            if (type == "0") {
                data.f15594f.f15619y = Icon.createWithBitmap(bitmap2);
            } else if (type == "1") {
                data.f15594f.f15616p = Icon.createWithBitmap(bitmap2);
            } else if (type == "2") {
                data.f15594f.f15613i = Icon.createWithBitmap(bitmap2);
            }
        }
    }

    private static void ld6(ServiceInfo info, SuperWallpaperSummaryData data) throws Throwable {
        data.f15599k = info.metaData.getInt(C2656k.f60919ki);
        data.f15605q = info.metaData.getFloat("clock_position_x");
        data.f15602n = info.metaData.getFloat("clock_position_y");
        data.f15595g = info.metaData.getFloat("dual_clock_position_x_anchor_right");
        data.f15609y = info.metaData.getFloat("dual_clock_position_y");
        data.f15600l = true;
        if (info.packageName.equals(data.f15610z)) {
            data.f15606r = true;
        }
        Context contextCreatePackageContext = null;
        try {
            contextCreatePackageContext = bf2.toq.toq().createPackageContext(data.f15597i, 3);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(f15625q, e2.getLocalizedMessage());
        }
        if (data.f15608t == null) {
            data.f15608t = Icon.createWithResource(contextCreatePackageContext.getPackageName(), com.android.thememanager.settings.superwallpaper.utils.zy.m9312k(contextCreatePackageContext, data.f15607s + "_banner"));
        }
        data.f15599k = info.metaData.getInt(C2656k.f60919ki);
        data.f15594f = new SuperWallpaperSummaryData.SuperWallpaperLandData();
        data.f15598j = info.metaData.getString(C2656k.f60924mcp);
        data.f15603o = info.metaData.getString(C2656k.f60905a9);
        data.f15601m = info.metaData.getString(C2656k.f60917jk);
        data.f15591b = info.metaData.getString("aod_category");
        int i2 = info.metaData.getInt(C2656k.f60932t8r);
        if (i2 > 0 || p029m.zy.toq(data.f15598j)) {
            data.f15594f.f15618s = Icon.createWithResource(data.f15597i, i2);
            data.f15594f.f15616p = Icon.createWithResource(data.f15597i, info.metaData.getInt(C2656k.f15711i));
        } else {
            m9215g(data, data.f15598j, "1");
        }
        int i3 = info.metaData.getInt(C2656k.f60912fn3e);
        if (i3 > 0 || p029m.zy.toq(data.f15598j)) {
            data.f15594f.f15611g = Icon.createWithResource(data.f15597i, i3);
            data.f15594f.f15619y = Icon.createWithResource(data.f15597i, info.metaData.getInt(C2656k.f60939zurt));
        } else {
            m9215g(data, data.f15598j, "0");
        }
        int i4 = info.metaData.getInt(C2656k.f60928ni7);
        if (i4 > 0 || p029m.zy.toq(data.f15598j)) {
            data.f15594f.f15612h = Icon.createWithResource(data.f15597i, i4);
            data.f15594f.f15613i = Icon.createWithResource(data.f15597i, info.metaData.getInt(C2656k.f60914fu4));
        } else {
            m9215g(data, data.f15598j, "2");
        }
        int i5 = data.f15599k;
        if (i5 == 1) {
            return;
        }
        SuperWallpaperSummaryData.SuperWallpaperLandData superWallpaperLandData = data.f15594f;
        superWallpaperLandData.f15617q = new Icon[i5];
        superWallpaperLandData.f15614k = new Icon[i5];
        superWallpaperLandData.f15615n = new SuperWallpaperSummaryData.SuperWallpaperLandData.LandPositionData[i5];
        for (int i6 = 0; i6 < data.f15599k; i6++) {
            SuperWallpaperSummaryData.SuperWallpaperLandData.LandPositionData landPositionData = new SuperWallpaperSummaryData.SuperWallpaperLandData.LandPositionData();
            landPositionData.f15621k = m9219y(contextCreatePackageContext, data.f15607s + "_view_height_" + i6);
            landPositionData.f15623q = m9219y(contextCreatePackageContext, data.f15607s + "_coordinate_longitude_" + i6);
            landPositionData.f15622n = m9219y(contextCreatePackageContext, data.f15607s + "_coordinate_latitude_" + i6);
            landPositionData.f15620g = m9219y(contextCreatePackageContext, data.f15607s + "_position_title_" + i6);
            landPositionData.f15624y = m9219y(contextCreatePackageContext, data.f15607s + "_position_content_" + i6);
            data.f15594f.f15615n[i6] = landPositionData;
            data.f15594f.f15614k[i6] = Icon.createWithResource(data.f15597i, info.metaData.getInt("position_preview_" + i6));
            data.f15594f.f15617q[i6] = Icon.createWithResource(data.f15597i, info.metaData.getInt("position_preview_" + i6 + MamlutilKt.PREVIEW_DARK_SUF));
        }
    }

    /* JADX INFO: renamed from: n */
    public static C2640k m9216n() {
        return zy.f15627k;
    }

    /* JADX INFO: renamed from: p */
    public static SuperWallpaperSummaryData[] m9217p(Context context) throws Throwable {
        if (!eqxt.f7l8()) {
            Log.d(f15625q, "not support super wallpaper ");
            return null;
        }
        Log.d(f15625q, "get prefabricate superwallpaper data");
        Bundle bundleM9296k = C2667q.m9296k(context, Uri.parse(x2.f15797q), x2.f60988ld6, x2.f60992x2, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (bundleM9296k != null) {
            bundleM9296k.setClassLoader(SuperWallpaperSummaryData.class.getClassLoader());
            Parcelable[] parcelableArray = bundleM9296k.getParcelableArray(x2.f60990qrj);
            if (parcelableArray != null && parcelableArray.length != 0) {
                SuperWallpaperSummaryData[] superWallpaperSummaryDataArr = new SuperWallpaperSummaryData[parcelableArray.length];
                for (int i3 = 0; i3 < parcelableArray.length; i3++) {
                    superWallpaperSummaryDataArr[i3] = (SuperWallpaperSummaryData) parcelableArray[i3];
                    arrayList.add(((SuperWallpaperSummaryData) parcelableArray[i3]).f15610z);
                    Log.d(f15625q, "get pre super wallpaper data:" + superWallpaperSummaryDataArr[i3].f15607s);
                    SuperWallpaperSummaryData superWallpaperSummaryData = superWallpaperSummaryDataArr[i3];
                    linkedHashMap.put(superWallpaperSummaryData.f15607s, superWallpaperSummaryData);
                }
            }
        }
        Log.d(f15625q, "get installed superwallpaper data");
        List<ResolveInfo> listQueryIntentServices = bf2.toq.toq().getPackageManager().queryIntentServices(new Intent("miui.service.wallpaper.SuperWallpaperService"), 128);
        if (listQueryIntentServices == null || listQueryIntentServices.size() == 0) {
            Log.w(f15625q, "resolveInfos is null");
        } else {
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && serviceInfo.metaData != null && !serviceInfo.name.contains(C6071k.f77062x2) && !"com.miui.miwallpaper.miweatherwallpaper".equals(resolveInfo.serviceInfo.packageName)) {
                    String string = resolveInfo.serviceInfo.metaData.getString("id");
                    if (linkedHashMap.containsKey(string) && p029m.zy.m24738k(resolveInfo.serviceInfo.packageName, ((SuperWallpaperSummaryData) linkedHashMap.get(string)).f15597i)) {
                        ld6(resolveInfo.serviceInfo, (SuperWallpaperSummaryData) linkedHashMap.get(string));
                        Log.d(f15625q, "refresh super wallpaper data:" + linkedHashMap.get(string));
                    } else {
                        SuperWallpaperSummaryData superWallpaperSummaryData2 = (SuperWallpaperSummaryData) linkedHashMap.get(string);
                        if (superWallpaperSummaryData2 == null) {
                            superWallpaperSummaryData2 = new SuperWallpaperSummaryData();
                            superWallpaperSummaryData2.f15607s = string;
                            superWallpaperSummaryData2.f15604p = resolveInfo.serviceInfo.metaData.getString("title");
                            superWallpaperSummaryData2.f15596h = resolveInfo.serviceInfo.metaData.getString(C2656k.f60926n7h);
                            String str = resolveInfo.serviceInfo.packageName;
                            superWallpaperSummaryData2.f15597i = str;
                            superWallpaperSummaryData2.f15610z = str;
                            superWallpaperSummaryData2.f15593e = true;
                        } else {
                            superWallpaperSummaryData2.f15597i = superWallpaperSummaryData2.f15610z;
                        }
                        ld6(resolveInfo.serviceInfo, superWallpaperSummaryData2);
                        Log.d(f15625q, "add installed super wallpaper data:" + string);
                        linkedHashMap.put(string, superWallpaperSummaryData2);
                    }
                }
            }
        }
        if (linkedHashMap.size() == 0) {
            Log.d(f15625q, "the capacity of super wallpapers is empty ");
            return null;
        }
        SuperWallpaperSummaryData[] superWallpaperSummaryDataArr2 = new SuperWallpaperSummaryData[linkedHashMap.size()];
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            superWallpaperSummaryDataArr2[i2] = (SuperWallpaperSummaryData) ((Map.Entry) it.next()).getValue();
            i2++;
        }
        return superWallpaperSummaryDataArr2;
    }

    /* JADX INFO: renamed from: q */
    public static ArrayList<C2852n> m9218q(Context context) throws Throwable {
        Log.d(f15625q, "begin getApkLocalSuperWallpaperDatas");
        ArrayList<C2852n> arrayList = new ArrayList<>();
        SuperWallpaperSummaryData[] superWallpaperSummaryDataArrM9217p = m9217p(context);
        if (superWallpaperSummaryDataArrM9217p != null && superWallpaperSummaryDataArrM9217p.length > 0) {
            for (SuperWallpaperSummaryData superWallpaperSummaryData : superWallpaperSummaryDataArrM9217p) {
                if (!p029m.zy.toq(superWallpaperSummaryData.f15597i) && !p029m.zy.toq(superWallpaperSummaryData.f15607s)) {
                    C2854q c2854q = new C2854q(superWallpaperSummaryData, superWallpaperSummaryData.f15597i, true);
                    c2854q.f17070k = superWallpaperSummaryData.f15607s;
                    c2854q.f61467toq = "apk";
                    arrayList.add(c2854q);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    private static String m9219y(Context context, String name) {
        int iF7l8 = f7l8(context, name, "string");
        if (iF7l8 == 0) {
            return null;
        }
        return context.getResources().getString(iF7l8);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public void m9220k(toq callback) {
        if (callback == null) {
            return;
        }
        this.f60884toq.add(new WeakReference<>(callback));
        AsyncTask<Void, Void, SuperWallpaperSummaryData[]> asyncTask = this.f15626k;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f15626k = null;
        }
        q qVar = new q();
        this.f15626k = qVar;
        qVar.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @oc
    public void qrj(SuperWallpaperSummaryData[] datas) {
        if (datas == null) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(this.f60884toq);
            this.f60884toq.clear();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                toq toqVar = (toq) ((WeakReference) it.next()).get();
                if (toqVar != null) {
                    toqVar.c8jq(null);
                }
            }
            return;
        }
        this.f60885zy.clear();
        for (SuperWallpaperSummaryData superWallpaperSummaryData : datas) {
            this.f60885zy.put(superWallpaperSummaryData.f15607s, superWallpaperSummaryData);
        }
        Iterator<WeakReference<toq>> it2 = this.f60884toq.iterator();
        while (it2.hasNext()) {
            toq toqVar2 = it2.next().get();
            if (toqVar2 != null) {
                toqVar2.c8jq(datas);
            }
        }
        this.f60884toq.clear();
    }

    @oc
    /* JADX INFO: renamed from: s */
    public SuperWallpaperSummaryData m9221s(String superWallpaperId) {
        return this.f60885zy.get(superWallpaperId);
    }

    public void toq() {
        this.f60885zy.clear();
    }

    public void x2(SuperWallpaperSummaryData data) {
        if (data != null) {
            this.f60885zy.put(data.f15607s, data);
        }
    }

    public void zy(String superWallpaperId) {
        this.f60885zy.remove(superWallpaperId);
    }

    private C2640k() {
        this.f60884toq = new HashSet<>();
        this.f60885zy = new HashMap<>();
    }
}

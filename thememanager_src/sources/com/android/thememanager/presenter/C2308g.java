package com.android.thememanager.presenter;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.fti;
import androidx.lifecycle.lrht;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.fu4;
import com.android.thememanager.jk;
import com.android.thememanager.model.SuperWallpaperBanner;
import com.android.thememanager.model.SuperWallpaperBannerGroup;
import com.android.thememanager.module.detail.util.C2244g;
import com.android.thememanager.o1t;
import com.android.thememanager.settings.eqxt;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.utils.C2667q;
import com.android.thememanager.v9.data.C2850g;
import com.android.thememanager.v9.data.C2852n;
import com.android.thememanager.v9.data.C2854q;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import retrofit2.C7639i;
import retrofit2.InterfaceC7648q;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.presenter.g */
/* JADX INFO: compiled from: SuperWallpaperListVM.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2308g extends lrht {

    /* JADX INFO: renamed from: f */
    private static boolean f13465f = false;

    /* JADX INFO: renamed from: h */
    public static final String f13466h = "OFFLINE";

    /* JADX INFO: renamed from: i */
    public static final String f13467i = "apk";

    /* JADX INFO: renamed from: l */
    private static boolean f13468l = false;

    /* JADX INFO: renamed from: p */
    public static final String f13469p = "ONLINE";

    /* JADX INFO: renamed from: r */
    public static final int f13470r = 1;

    /* JADX INFO: renamed from: s */
    private static final String f13471s = "SuperWallpaperPresenter";

    /* JADX INFO: renamed from: t */
    public static final int f13472t = 0;

    /* JADX INFO: renamed from: z */
    public static final String f13473z = "mtz";

    /* JADX INFO: renamed from: g */
    private k f13474g;

    /* JADX INFO: renamed from: y */
    private final fti<ArrayList<C2852n>> f13475y = new fti<>();

    /* JADX INFO: renamed from: com.android.thememanager.presenter.g$k */
    /* JADX INFO: compiled from: SuperWallpaperListVM.java */
    private static class k extends AsyncTask<Void, Void, ArrayList<C2852n>> {

        /* JADX INFO: renamed from: k */
        private final C2308g f13476k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f60600toq;

        /* JADX INFO: renamed from: com.android.thememanager.presenter.g$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SuperWallpaperListVM.java */
        class C7928k implements InterfaceC7648q<CommonResponse<SuperWallpaperBannerGroup>> {
            C7928k() {
            }

            @Override // retrofit2.InterfaceC7648q
            public void onFailure(@lvui retrofit2.toq<CommonResponse<SuperWallpaperBannerGroup>> call, @lvui Throwable throwable) {
                Log.i(C2308g.f13471s, "fail get online SuperWallpaper. " + throwable);
            }

            @Override // retrofit2.InterfaceC7648q
            public void onResponse(retrofit2.toq<CommonResponse<SuperWallpaperBannerGroup>> call, C7639i<CommonResponse<SuperWallpaperBannerGroup>> response) {
                C2852n c2852nM8447q;
                ArrayList<C2852n> arrayList = new ArrayList<>();
                if (com.android.thememanager.basemodule.network.theme.toq.m6892k(response)) {
                    ArrayList<SuperWallpaperBanner> arrayList2 = response.m27986k().apiData.superWallpaperBannerList;
                    if (!kja0.qrj(arrayList2)) {
                        for (SuperWallpaperBanner superWallpaperBanner : arrayList2) {
                            if (!superWallpaperBanner.isInvalid() && (c2852nM8447q = k.this.m8447q(superWallpaperBanner, C2308g.f13465f, C2308g.f13468l)) != null) {
                                arrayList.add(c2852nM8447q);
                            }
                        }
                    }
                }
                if (kja0.qrj(arrayList) || k.this.isCancelled()) {
                    return;
                }
                k.this.f13476k.hb(arrayList, true);
            }
        }

        public k(C2308g vm, int entryType) {
            this.f13476k = vm;
            this.f60600toq = entryType;
        }

        /* JADX INFO: renamed from: g */
        private ArrayList<C2852n> m8443g(ArrayList<C2852n> onlineSuperWallpaperList, ArrayList<C2852n> mtzDownloadedSuperWallpapers, ArrayList<C2852n> apkLocalSuperWallpapers) {
            ArrayList<C2852n> arrayList = new ArrayList<>();
            if (!kja0.qrj(onlineSuperWallpaperList)) {
                for (C2852n c2852n : onlineSuperWallpaperList) {
                    if (C2308g.f13473z.equals(c2852n.f61467toq)) {
                        arrayList.add(c2852n);
                        m8446p(mtzDownloadedSuperWallpapers, c2852n.f17070k);
                    } else if ("apk".equals(c2852n.f61467toq)) {
                        C2852n c2852nM8448y = m8448y(apkLocalSuperWallpapers, c2852n.f17070k);
                        if (c2852nM8448y != null) {
                            kja0.toq(arrayList, c2852nM8448y, this.f60600toq == 0);
                        } else if (this.f60600toq == 0) {
                            arrayList.add(c2852n);
                        } else {
                            apkLocalSuperWallpapers.add(c2852n);
                        }
                    }
                }
            }
            kja0.zy(arrayList, mtzDownloadedSuperWallpapers);
            kja0.m7112q(arrayList, apkLocalSuperWallpapers, this.f60600toq != 0);
            return arrayList;
        }

        /* JADX INFO: renamed from: n */
        private Resource m8445n(SuperWallpaperBanner banner, fu4 resourceContext) {
            Resource resource = new Resource();
            resource.setOnlineId(banner.packId);
            resource.setProductId(banner.productId);
            resource.setAssemblyId(banner.productId);
            resource.setOnlinePath(banner.downloadUrl);
            resource.setDownloadPath(o1t.f7l8(resource, resourceContext));
            resource.getOnlineInfo().setTitle(banner.title);
            resource.getOnlineInfo().setDescription(banner.summary);
            return C2244g.f7l8("spwallpaper", resource, false);
        }

        /* JADX INFO: renamed from: p */
        private void m8446p(ArrayList<C2852n> localDatas, String id) {
            if (kja0.qrj(localDatas) || TextUtils.isEmpty(id)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<C2852n> it = localDatas.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2852n next = it.next();
                if (id.equals(next.f17070k)) {
                    arrayList.add(next);
                    break;
                }
            }
            localDatas.removeAll(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public C2852n m8447q(SuperWallpaperBanner banner, boolean isSupportMtzSuperWallpaper, boolean isSupportApkSuperWallpaper) {
            fu4 fu4VarM10537n = C2082k.zy().m8001n().m10537n(C1791k.getInstance("spwallpaper"));
            String str = banner.type;
            str.hashCode();
            if (!str.equals("apk")) {
                if (!str.equals(C2308g.f13473z)) {
                    return null;
                }
                if (!isSupportMtzSuperWallpaper) {
                    Log.w(C2308g.f13471s, "is not support maml super wallpaper");
                    return null;
                }
                C2850g c2850g = new C2850g(m8445n(banner, fu4VarM10537n), banner.title, banner.summary);
                c2850g.f17070k = banner.productId;
                c2850g.f61468zy = banner.image;
                c2850g.f61467toq = C2308g.f13473z;
                return c2850g;
            }
            if (!isSupportApkSuperWallpaper) {
                Log.w(C2308g.f13471s, "is not support apk super wallpaper");
                return null;
            }
            if (!a9.fu4(bf2.toq.toq(), banner.id)) {
                Log.w(C2308g.f13471s, "not support weather super wallpaper");
                return null;
            }
            SuperWallpaperSummaryData superWallpaperSummaryData = new SuperWallpaperSummaryData(banner);
            String str2 = banner.packageName;
            superWallpaperSummaryData.f15597i = str2;
            superWallpaperSummaryData.f15606r = com.android.thememanager.superwallpaper.util.zy.f7l8(str2);
            C2854q c2854q = new C2854q(superWallpaperSummaryData, banner.packageName, false);
            c2854q.f17070k = banner.id;
            c2854q.f61468zy = banner.image;
            c2854q.f61467toq = "apk";
            return c2854q;
        }

        /* JADX INFO: renamed from: y */
        private C2852n m8448y(ArrayList<C2852n> localDatas, String id) {
            if (!kja0.qrj(localDatas) && !TextUtils.isEmpty(id)) {
                for (C2852n c2852n : localDatas) {
                    if (id.equals(c2852n.f17070k)) {
                        return c2852n;
                    }
                }
            }
            return null;
        }

        private void zy() {
            if (mcp.m7138k() && mcp.m7139n()) {
                ((jk) f7l8.m6882h().qrj(jk.class)).m7997k().mo27954p(new C7928k());
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public ArrayList<C2852n> doInBackground(Void... voids) {
            boolean unused = C2308g.f13468l = eqxt.f7l8();
            boolean unused2 = C2308g.f13465f = eqxt.m9002p();
            return m8443g(null, this.f60600toq != 0 ? com.android.thememanager.superwallpaper.util.zy.m9518q() : null, C2640k.m9218q(bf2.toq.toq()));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ArrayList<C2852n> banners) {
            if (isCancelled()) {
                return;
            }
            this.f13476k.hb(banners, false);
            zy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m8439e(ArrayList arrayList) {
        ArrayList<Bundle> parcelableArrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C2854q) ((C2852n) it.next())).f17089q.f15610z);
        }
        boolean z2 = false;
        if (arrayList2.size() > 0) {
            HashMap<String, ResolveInfo> mapUv6 = uv6();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C2854q c2854q = (C2854q) ((C2852n) it2.next());
                if (mapUv6.containsKey(c2854q.f17089q.f15597i)) {
                    SuperWallpaperSummaryData superWallpaperSummaryData = c2854q.f17089q;
                    if (!superWallpaperSummaryData.f15606r) {
                        superWallpaperSummaryData.f15606r = true;
                        if (superWallpaperSummaryData.f15592c != null) {
                            superWallpaperSummaryData.f15592c = null;
                        }
                        z2 = true;
                    }
                }
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("packageNames", arrayList2);
            Bundle qVar = C2667q.toq(bf2.toq.toq(), a9.f57713zy, a9.f10269q, null, bundle);
            if (qVar != null && (parcelableArrayList = qVar.getParcelableArrayList("packageNames")) != null && parcelableArrayList.size() > 0) {
                for (Bundle bundle2 : parcelableArrayList) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C2852n c2852n = (C2852n) it3.next();
                        if (!TextUtils.isEmpty(bundle2.getString("packageName"))) {
                            C2854q c2854q2 = (C2854q) c2852n;
                            if (bundle2.getString("packageName").equals(c2854q2.f17088n)) {
                                c2854q2.f17089q.f15592c = new Pair<>(Integer.valueOf(bundle2.getInt("status")), Integer.valueOf(bundle2.getInt("progress")));
                            }
                        }
                    }
                }
                z2 = true;
            }
            if (z2) {
                this.f13475y.n7h(arrayList);
            }
        }
    }

    private HashMap<String, ResolveInfo> uv6() {
        List<ResolveInfo> listQueryIntentServices = bf2.toq.toq().getPackageManager().queryIntentServices(new Intent("miui.service.wallpaper.SuperWallpaperService"), 128);
        HashMap<String, ResolveInfo> map = new HashMap<>(5);
        for (ResolveInfo resolveInfo : listQueryIntentServices) {
            if (!map.containsKey(resolveInfo.serviceInfo.packageName)) {
                map.put(resolveInfo.serviceInfo.packageName, resolveInfo);
            }
        }
        return map;
    }

    void hb(ArrayList<C2852n> banners, boolean append) {
        ArrayList<C2852n> arrayListM4388g = this.f13475y.m4388g();
        if (!append || arrayListM4388g == null) {
            this.f13475y.cdj(banners);
            m8441j(banners);
        } else {
            arrayListM4388g.addAll(banners);
            this.f13475y.cdj(arrayListM4388g);
            m8441j(arrayListM4388g);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m8441j(final ArrayList<C2852n> sumData) {
        if (sumData == null || sumData.size() <= 0) {
            return;
        }
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.presenter.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f13484k.m8439e(sumData);
            }
        });
    }

    @Override // androidx.lifecycle.lrht
    protected void ncyb() {
        k kVar = this.f13474g;
        if (kVar != null) {
            kVar.cancel(true);
            this.f13474g = null;
        }
    }

    public void nn86(int entryType) {
        ArrayList<C2852n> arrayListM4388g = this.f13475y.m4388g();
        if (arrayListM4388g != null && arrayListM4388g.size() > 0) {
            m8441j(arrayListM4388g);
            return;
        }
        k kVar = this.f13474g;
        if (kVar != null) {
            kVar.cancel(true);
            this.f13474g = null;
        }
        k kVar2 = new k(this, entryType);
        this.f13474g = kVar2;
        kVar2.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: renamed from: o */
    public void m8442o(ArrayList<C2852n> sumData, String packageName) {
        Iterator<C2852n> it = sumData.iterator();
        while (it.hasNext()) {
            C2854q c2854q = (C2854q) it.next();
            if (TextUtils.equals(c2854q.f17089q.f15597i, packageName)) {
                SuperWallpaperSummaryData superWallpaperSummaryData = c2854q.f17089q;
                superWallpaperSummaryData.f15606r = true;
                if (superWallpaperSummaryData.f15592c != null) {
                    superWallpaperSummaryData.f15592c = null;
                }
                this.f13475y.n7h(sumData);
                m8441j(sumData);
                return;
            }
        }
    }

    public LiveData<ArrayList<C2852n>> vyq() {
        return this.f13475y;
    }
}

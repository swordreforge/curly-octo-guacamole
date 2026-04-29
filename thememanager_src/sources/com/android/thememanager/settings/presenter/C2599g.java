package com.android.thememanager.settings.presenter;

import android.app.Application;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.fti;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.settings.C2608s;
import com.android.thememanager.settings.C2687z;
import com.android.thememanager.settings.eqxt;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.utils.C2667q;
import com.android.thememanager.util.sok;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import zy.dd;
import zy.lvui;
import zy.oc;
import zy.y9n;

/* JADX INFO: renamed from: com.android.thememanager.settings.presenter.g */
/* JADX INFO: compiled from: ThemeAndWallpaperVM.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2599g extends androidx.lifecycle.toq implements com.android.thememanager.basemodule.async.toq<Void, Object, Integer> {

    /* JADX INFO: renamed from: c */
    public static final int f15375c;

    /* JADX INFO: renamed from: e */
    private static int f15376e = 0;

    /* JADX INFO: renamed from: f */
    private static final int f15377f = 3;

    /* JADX INFO: renamed from: l */
    private static final int f15378l = 6;

    /* JADX INFO: renamed from: r */
    private static final String f15379r = "ThemeAndWallpaper";

    /* JADX INFO: renamed from: h */
    private final fti<zy> f15380h;

    /* JADX INFO: renamed from: i */
    private final fti<SuperWallpaperSummaryData[]> f15381i;

    /* JADX INFO: renamed from: p */
    private final fti<zy> f15382p;

    /* JADX INFO: renamed from: s */
    private toq f15383s;

    /* JADX INFO: renamed from: t */
    private int f15384t;

    /* JADX INFO: renamed from: y */
    @dd
    private toq f15385y;

    /* JADX INFO: renamed from: z */
    private boolean f15386z;

    /* JADX INFO: renamed from: com.android.thememanager.settings.presenter.g$k */
    /* JADX INFO: compiled from: ThemeAndWallpaperVM.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo9135k(List<com.android.thememanager.settings.subsettings.f7l8> wgList);
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.presenter.g$zy */
    /* JADX INFO: compiled from: ThemeAndWallpaperVM.java */
    public static class zy {

        /* JADX INFO: renamed from: k */
        public final int f15389k;

        /* JADX INFO: renamed from: q */
        public final boolean f15390q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final List<com.android.thememanager.settings.subsettings.f7l8> f60847toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final boolean f60848zy;

        zy(int t2, List<com.android.thememanager.settings.subsettings.f7l8> l2, boolean a2) {
            this(t2, l2, a2, true);
        }

        zy(int t2, List<com.android.thememanager.settings.subsettings.f7l8> l2, boolean a2, boolean h2) {
            this.f15389k = t2;
            this.f60847toq = l2;
            this.f60848zy = a2;
            this.f15390q = h2;
        }
    }

    static {
        f15375c = C1807g.m7081r() ? 11 : Integer.MAX_VALUE;
    }

    public C2599g(@lvui Application app) {
        super(app);
        this.f15382p = new fti<>();
        this.f15380h = new fti<>();
        this.f15381i = new fti<>();
        f15376e = 0;
        this.f15384t = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @lvui
    @y9n
    /* JADX INFO: renamed from: a */
    public static List<com.android.thememanager.settings.subsettings.f7l8> m9136a() {
        Log.d(f15379r, "LoadMyWallpaperTask: load my wallpaper");
        List<sok<String, Matrix, Long>> listF7l8 = C2687z.f7l8(0);
        ArrayList arrayList = new ArrayList();
        Iterator<sok<String, Matrix, Long>> it = listF7l8.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f16799k);
            if (arrayList.size() >= 6) {
                break;
            }
        }
        listF7l8.addAll(C2687z.f7l8(1));
        listF7l8.sort(new Comparator() { // from class: com.android.thememanager.settings.presenter.q
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2599g.y9n((sok) obj, (sok) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        int i2 = 1;
        for (sok<String, Matrix, Long> sokVar : listF7l8) {
            Resource resource = new Resource();
            resource.setContentPath(sokVar.f16799k);
            resource.setCategory(arrayList.contains(sokVar.f16799k) ? "wallpaper" : "videowallpaper");
            C2687z.cdj(resource, sokVar);
            arrayList2.add(resource);
            if (i2 >= 6) {
                break;
            }
            i2++;
        }
        com.android.thememanager.settings.subsettings.f7l8 f7l8Var = new com.android.thememanager.settings.subsettings.f7l8(1, 10);
        f7l8Var.f15454q = bf2.toq.toq().getString(R.string.title_my_wallpaper);
        f7l8Var.f60866zy = arrayList2;
        f7l8Var.f15456y = listF7l8.size();
        listF7l8.clear();
        return Collections.singletonList(f7l8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<com.android.thememanager.settings.subsettings.f7l8> a98o() {
        return eqxt.kja0(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m9137b() throws Throwable {
        Log.d(f15379r, "begin loadSuperWallpaper");
        SuperWallpaperSummaryData[] superWallpaperSummaryDataArrM9217p = C2640k.m9217p(n5r1());
        StringBuilder sb = new StringBuilder();
        sb.append("loadSuperWallpaper. ");
        sb.append(superWallpaperSummaryDataArrM9217p == null ? -1 : superWallpaperSummaryDataArrM9217p.length);
        Log.i(f15379r, sb.toString());
        this.f15381i.n7h(superWallpaperSummaryDataArrM9217p);
        gyi(superWallpaperSummaryDataArrM9217p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bf2(SuperWallpaperSummaryData[] superWallpaperSummaryDataArr) {
        ArrayList<Bundle> parcelableArrayList;
        ArrayList<String> arrayList = new ArrayList<>();
        for (SuperWallpaperSummaryData superWallpaperSummaryData : superWallpaperSummaryDataArr) {
            if (!superWallpaperSummaryData.f15606r) {
                arrayList.add(superWallpaperSummaryData.f15610z);
            }
        }
        if (arrayList.size() > 0) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("packageNames", arrayList);
            Bundle qVar = C2667q.toq(bf2.toq.toq(), a9.f57713zy, a9.f10269q, null, bundle);
            if (qVar == null || (parcelableArrayList = qVar.getParcelableArrayList("packageNames")) == null || parcelableArrayList.size() <= 0) {
                return;
            }
            for (Bundle bundle2 : parcelableArrayList) {
                for (SuperWallpaperSummaryData superWallpaperSummaryData2 : superWallpaperSummaryDataArr) {
                    if (!p029m.zy.toq(bundle2.getString("packageName")) && bundle2.getString("packageName").equals(superWallpaperSummaryData2.f15597i)) {
                        superWallpaperSummaryData2.f15592c = new Pair<>(Integer.valueOf(bundle2.getInt("status")), Integer.valueOf(bundle2.getInt("progress")));
                    }
                }
            }
            this.f15381i.n7h(superWallpaperSummaryDataArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @lvui
    @y9n
    public static List<com.android.thememanager.settings.subsettings.f7l8> bo() {
        Log.d(f15379r, "LoadSystemWallpaperTask: load system Wallpaper");
        return eqxt.t8r(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @y9n
    public void c8jq(zy r2) {
        if (r2.f15389k != 2 || r2.f60847toq.size() <= 0) {
            return;
        }
        Log.i(f15379r, "Update system wallpaper result");
        this.f15382p.n7h(r2);
    }

    @dd
    @y9n
    private static List<com.android.thememanager.settings.subsettings.f7l8> lv5() {
        return com.android.thememanager.settings.subsettings.f7l8.toq(bz2.toq.m5843n(0));
    }

    /* JADX INFO: renamed from: o */
    private zy m9142o(LiveData<zy> liveData, zy newR) {
        List<com.android.thememanager.settings.subsettings.f7l8> list;
        zy zyVarM4388g = liveData.m4388g();
        List<com.android.thememanager.settings.subsettings.f7l8> list2 = newR.f60847toq;
        if (list2 == null || list2.size() == 0) {
            return zyVarM4388g == null ? newR : zyVarM4388g;
        }
        if (zyVarM4388g != null && (list = zyVarM4388g.f60847toq) != null && (zyVarM4388g.f15389k != 4 || newR.f60848zy)) {
            list.addAll(newR.f60847toq);
            newR.f60847toq.clear();
            newR.f60847toq.addAll(zyVarM4388g.f60847toq);
        }
        return newR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @y9n
    /* JADX INFO: renamed from: u */
    public static void m9143u(@lvui List<com.android.thememanager.settings.subsettings.f7l8> wgList, @lvui final k callback) {
        Iterator<com.android.thememanager.settings.subsettings.f7l8> it = wgList.iterator();
        while (it.hasNext()) {
            for (Resource resource : it.next().f60866zy) {
                if (!p029m.zy.toq(resource.getPictureDescriptionTitle()) && !p029m.zy.toq(resource.getPictureDescriptionContent())) {
                    Log.i(f15379r, "Wallpapers already have description title and content");
                    return;
                }
            }
        }
        C2608s c2608s = new C2608s();
        Objects.requireNonNull(callback);
        c2608s.m9162q(wgList, new C2608s.k() { // from class: com.android.thememanager.settings.presenter.toq
            @Override // com.android.thememanager.settings.C2608s.k
            /* JADX INFO: renamed from: k */
            public final void mo9155k(List list) {
                callback.mo9135k(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @dd
    @y9n
    /* JADX INFO: renamed from: x */
    public static Pair<List<com.android.thememanager.settings.subsettings.f7l8>, Boolean> m9144x() {
        return com.android.thememanager.settings.subsettings.f7l8.m9173k(bz2.toq.toq(f15376e), f15376e, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @oc
    public void y2(zy r2) {
        if (r2.f15389k != 4) {
            fti<zy> ftiVar = this.f15382p;
            ftiVar.cdj(m9142o(ftiVar, r2));
            return;
        }
        List<com.android.thememanager.settings.subsettings.f7l8> list = r2.f60847toq;
        if (list == null) {
            f15376e = 0;
            fti<zy> ftiVar2 = this.f15380h;
            ftiVar2.cdj(m9142o(ftiVar2, r2));
            return;
        }
        f15376e += list.size();
        this.f15384t += r2.f60847toq.size();
        if (!r2.f15390q) {
            f15376e = 0;
            this.f15384t = f15375c + 1;
        }
        fti<zy> ftiVar3 = this.f15380h;
        ftiVar3.cdj(m9142o(ftiVar3, r2));
        this.f15386z = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int y9n(sok sokVar, sok sokVar2) {
        T t2;
        if (sokVar.f61414zy == 0 || (t2 = sokVar2.f61414zy) == 0) {
            return 0;
        }
        return Long.compare(((Long) t2).longValue(), ((Long) sokVar.f61414zy).longValue());
    }

    public void dr(boolean isLoad) {
        this.f15386z = isLoad;
    }

    public LiveData<SuperWallpaperSummaryData[]> ek5k() {
        return this.f15381i;
    }

    public void gyi(final SuperWallpaperSummaryData[] sumData) {
        if (sumData == null || sumData.length <= 0) {
            return;
        }
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.settings.presenter.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f15392k.bf2(sumData);
            }
        });
    }

    public void i1(int flag, boolean isRefresh) {
        if ((flag & 1) != 0 || (flag & 2) != 0 || (flag & 8) != 0) {
            toq toqVar = new toq(this, flag);
            this.f15385y = toqVar;
            toqVar.executeOnExecutor(C6002g.ld6(), new Void[0]);
        } else {
            if (this.f15386z) {
                return;
            }
            if (isRefresh) {
                this.f15384t = 0;
            }
            if (this.f15384t > f15375c) {
                return;
            }
            this.f15386z = true;
            toq toqVar2 = new toq(this, 4, isRefresh);
            this.f15383s = toqVar2;
            toqVar2.executeOnExecutor(C6002g.x2(), new Void[0]);
        }
    }

    /* JADX INFO: renamed from: m */
    public LiveData<zy> m9145m() {
        return this.f15380h;
    }

    @Override // androidx.lifecycle.lrht
    protected void ncyb() {
        toq toqVar = this.f15385y;
        if (toqVar != null) {
            toqVar.cancel(false);
        }
        toq toqVar2 = this.f15383s;
        if (toqVar2 != null) {
            toqVar2.cancel(false);
        }
    }

    public void nmn5() {
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.settings.presenter.zy
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f15404k.m9137b();
            }
        });
    }

    public void t8iq() {
        toq toqVar = new toq(this, 2);
        this.f15383s = toqVar;
        toqVar.f60846zy = true;
        this.f15383s.executeOnExecutor(C6002g.x2(), new Void[0]);
    }

    public void xwq3(SuperWallpaperSummaryData[] sumData, String packageName) {
        if (sumData == null || sumData.length <= 0) {
            return;
        }
        for (SuperWallpaperSummaryData superWallpaperSummaryData : sumData) {
            if (TextUtils.equals(superWallpaperSummaryData.f15597i, packageName)) {
                superWallpaperSummaryData.f15606r = true;
                if (superWallpaperSummaryData.f15592c != null) {
                    superWallpaperSummaryData.f15592c = null;
                }
                this.f15381i.n7h(sumData);
                gyi(sumData);
                return;
            }
        }
    }

    public LiveData<zy> yz() {
        return this.f15382p;
    }

    public void zp(boolean online) {
        List<com.android.thememanager.settings.subsettings.f7l8> list;
        List<com.android.thememanager.settings.subsettings.f7l8> list2;
        zy zyVarM4388g = this.f15382p.m4388g();
        int i2 = (online || !(zyVarM4388g == null || (list2 = zyVarM4388g.f60847toq) == null || list2.size() <= 0)) ? 0 : 2;
        zy zyVarM4388g2 = this.f15380h.m4388g();
        if (online && (zyVarM4388g2 == null || (list = zyVarM4388g2.f60847toq) == null || list.size() <= 0)) {
            i2 |= 4;
        }
        if (i2 != 0) {
            i1(i2, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.settings.presenter.g$toq */
    /* JADX INFO: compiled from: ThemeAndWallpaperVM.java */
    static class toq extends AsyncTask<Void, zy, Integer> {

        /* JADX INFO: renamed from: k */
        private final C2599g f15387k;

        /* JADX INFO: renamed from: q */
        private boolean f15388q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f60845toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f60846zy;

        toq(C2599g vm, int flag) {
            this.f15387k = vm;
            this.f60845toq = flag;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public /* synthetic */ void m9147q(List list) {
            this.f15387k.c8jq(new zy(2, list, false));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(zy... values) {
            if (values.length <= 0) {
                return;
            }
            zy zyVar = values[0];
            if (zyVar.f60847toq == null) {
                return;
            }
            this.f15387k.y2(zyVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer aBoolean) {
            if (isCancelled()) {
                return;
            }
            this.f15387k.ij(0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voids) {
            Pair pairM9144x;
            Log.i(C2599g.f15379r, "LoadTask load flag = " + this.f60845toq + ",  " + this.f60846zy);
            if ((this.f60845toq & 1) != 0 && !isCancelled()) {
                publishProgress(new zy(1, C2599g.m9136a(), false));
            }
            if ((this.f60845toq & 2) != 0) {
                List listA98o = C1807g.zurt() ? C2599g.a98o() : null;
                if (!this.f60846zy && !isCancelled()) {
                    List listBo = C2599g.bo();
                    C2599g.m9143u(listBo, new k() { // from class: com.android.thememanager.settings.presenter.f7l8
                        @Override // com.android.thememanager.settings.presenter.C2599g.k
                        /* JADX INFO: renamed from: k */
                        public final void mo9135k(List list) {
                            this.f15374k.m9147q(list);
                        }
                    });
                    if (listA98o != null && listA98o.size() > 0) {
                        listBo.add(0, (com.android.thememanager.settings.subsettings.f7l8) listA98o.get(0));
                    }
                    Log.i(C2599g.f15379r, "load system  = " + listBo.size());
                    publishProgress(new zy(2, listBo, false));
                }
            }
            if ((this.f60845toq & 4) != 0 && !isCancelled() && (pairM9144x = C2599g.m9144x()) != null) {
                publishProgress(new zy(4, (List) pairM9144x.first, true ^ this.f15388q, ((Boolean) pairM9144x.second).booleanValue()));
            }
            return 0;
        }

        toq(C2599g vm, int flag, boolean isRefresh) {
            this.f15387k = vm;
            this.f60845toq = flag;
            this.f15388q = isRefresh;
        }
    }
}

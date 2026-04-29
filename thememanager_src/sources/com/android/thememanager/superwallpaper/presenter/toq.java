package com.android.thememanager.superwallpaper.presenter;

import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.cdj;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.ncyb;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.basesuperwallpaper.C2651k;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import com.android.thememanager.settings.superwallpaper.utils.C2667q;
import com.android.thememanager.settings.superwallpaper.utils.C2670y;
import com.android.thememanager.settings.superwallpaper.utils.n7h;
import com.android.thememanager.superwallpaper.base.AbstractC2723p;
import com.android.thememanager.superwallpaper.base.ld6;
import com.android.thememanager.util.h7am;
import com.android.thememanager.util.jbh;
import com.android.thememanager.util.uc;
import com.android.thememanager.wallpaper.C2951n;
import h7am.C6071k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p001b.f7l8;
import p029m.zy;
import vep5.C7705k;

/* JADX INFO: compiled from: UnitySuperWallpaperPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends AbstractC2723p {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private ComponentName f61158ld6;

    /* JADX INFO: renamed from: p */
    private SuperWallpaperSummaryData f16143p;

    /* JADX INFO: renamed from: s */
    private String f16144s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private ComponentName f61159x2;

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.presenter.toq$k */
    /* JADX INFO: compiled from: UnitySuperWallpaperPresenter.java */
    class C2729k implements C2640k.toq {
        C2729k() {
        }

        @Override // com.android.thememanager.settings.superwallpaper.activity.data.C2640k.toq
        public void c8jq(SuperWallpaperSummaryData[] data) {
            toq.this.f16143p = C2640k.m9216n().m9221s(toq.this.f16144s);
            Log.d(C6071k.f35077k, "unity loadLandPositionData " + toq.this.f16144s + " onLoad:" + toq.this.f16143p);
            if (toq.this.f16143p != null) {
                toq.this.cdj();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.presenter.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UnitySuperWallpaperPresenter.java */
    private static class AsyncTaskC7936toq extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: g */
        private int f16146g;

        /* JADX INFO: renamed from: k */
        private WeakReference<ld6> f16147k;

        /* JADX INFO: renamed from: n */
        private ComponentName f16148n;

        /* JADX INFO: renamed from: q */
        private ComponentName f16149q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private SuperWallpaperSummaryData f61160toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private WallpaperManager f61161zy;

        public AsyncTaskC7936toq(ld6 view, SuperWallpaperSummaryData data, int position, ComponentName componentName, ComponentName previewComponent) {
            this.f16147k = new WeakReference<>(view);
            this.f61160toq = data;
            this.f16146g = position;
            this.f16149q = componentName;
            this.f16148n = previewComponent;
            this.f61161zy = WallpaperManager.getInstance(view.getActivity());
        }

        /* JADX INFO: renamed from: g */
        private boolean m9504g() {
            SuperWallpaperSummaryData superWallpaperSummaryData = this.f61160toq;
            return zy(superWallpaperSummaryData.f15598j, superWallpaperSummaryData.f15603o);
        }

        /* JADX INFO: renamed from: k */
        private void m9505k() {
            if (y9n.lvui()) {
                ncyb.wvg(false, "super");
                ncyb.wvg(true, "super");
            }
        }

        /* JADX INFO: renamed from: q */
        private boolean m9506q() {
            SuperWallpaperSummaryData superWallpaperSummaryData = this.f61160toq;
            return zy(superWallpaperSummaryData.f15598j, superWallpaperSummaryData.f15601m);
        }

        private boolean zy(String provider, String method) {
            Bundle bundleM9296k;
            if (zy.toq(provider) || zy.toq(method) || (bundleM9296k = C2667q.m9296k(bf2.toq.toq(), Uri.parse(provider), method, null, null)) == null) {
                return true;
            }
            return bundleM9296k.getBoolean("result", true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void result) {
            super.onPostExecute(result);
            ld6 ld6Var = this.f16147k.get();
            if (ld6Var == null) {
                Log.i("UnitySuperWallpaperPresenter", "view == null");
                return;
            }
            Intent intent = new Intent(miuix.android.content.toq.f86697toq);
            intent.putExtra("set_lock_wallpaper_result", true);
            SuperWallpaperSummaryData superWallpaperSummaryData = this.f61160toq;
            jbh jbhVar = new jbh("super", superWallpaperSummaryData.f15607s, superWallpaperSummaryData.f15604p, "theme");
            jbhVar.m9834g(bf2.toq.toq(), intent);
            jbhVar.m9834g(bf2.toq.toq(), new Intent(f7l8.f53803oph));
            h7am.m9796k(true);
            h7am.m9796k(false);
            Intent intent2 = new Intent(C2651k.f15688i);
            intent2.putExtra("position", C2656k.m9242n(bf2.toq.toq(), this.f16149q.getClassName()));
            bf2.toq.toq().sendBroadcast(intent2);
            C2670y.m9310y(bf2.toq.toq(), 4);
            ld6Var.gvn7(true);
            ld6Var.getActivity().finish();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voids) {
            m9504g();
            if (C2951n.fn3e().kja0()) {
                C2951n.fn3e().m10474b(this.f16149q, this.f61160toq, this.f16146g);
            } else {
                cdj.zurt(this.f61161zy, this.f16149q);
            }
            if (!o1t.fu4()) {
                uc.m10026j();
            }
            uc.lrht(bf2.toq.toq(), false, false);
            n7h.n7h(bf2.toq.toq(), "com.android.thememanager.theme_lock_live_wallpaper");
            m9505k();
            Context qVar = bf2.toq.toq();
            SuperWallpaperSummaryData superWallpaperSummaryData = this.f61160toq;
            C2663k.x2(qVar, true, superWallpaperSummaryData.f15605q, superWallpaperSummaryData.f15602n, superWallpaperSummaryData.f15595g, superWallpaperSummaryData.f15609y, superWallpaperSummaryData.f15591b);
            if (this.f16146g != -1) {
                Log.d(C6071k.f35077k, "unity Data apply, save, position:" + this.f16146g);
                C2656k.qrj(bf2.toq.toq(), this.f16149q.getClassName());
                C2656k.ld6(bf2.toq.toq(), this.f16149q.getClassName(), this.f16146g);
                C2656k.ld6(bf2.toq.toq(), this.f16148n.getClassName(), this.f16146g);
            }
            m9506q();
            com.android.thememanager.superwallpaper.util.toq.m9511g();
            return null;
        }
    }

    public toq(ld6 view, String id) {
        super(view, id);
        this.f16144s = id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cdj() {
        SuperWallpaperSummaryData.SuperWallpaperLandData.LandPositionData[] landPositionDataArr;
        Icon[] iconArr;
        this.f61158ld6 = new ComponentName(this.f16143p.f15597i, this.f16143p.f15597i + ".superwallpaper." + com.android.thememanager.settings.superwallpaper.utils.zy.ld6(this.f16144s) + "SuperWallpaper");
        this.f61159x2 = new ComponentName(this.f16143p.f15597i, this.f16143p.f15597i + ".superwallpaper." + com.android.thememanager.settings.superwallpaper.utils.zy.ld6(this.f16144s) + "PreviewSuperWallpaper");
        C7705k c7705k = new C7705k();
        this.f16113q = c7705k;
        c7705k.m28102n(this.f16143p.f15605q);
        this.f16113q.m28100g(this.f16143p.f15602n);
        this.f16113q.f7l8(this.f16143p.f15595g);
        this.f16113q.m28104y(this.f16143p.f15609y);
        SuperWallpaperSummaryData.SuperWallpaperLandData superWallpaperLandData = this.f16143p.f15594f;
        if (superWallpaperLandData != null && (landPositionDataArr = superWallpaperLandData.f15615n) != null && landPositionDataArr.length > 0 && (iconArr = superWallpaperLandData.f15617q) != null) {
            boolean z2 = iconArr.length == landPositionDataArr.length;
            Icon[] iconArr2 = superWallpaperLandData.f15614k;
            if ((z2 & (iconArr2 != null)) && iconArr2.length == landPositionDataArr.length) {
                this.f61149zy = new ArrayList<>();
                int i2 = 0;
                while (true) {
                    SuperWallpaperSummaryData.SuperWallpaperLandData.LandPositionData[] landPositionDataArr2 = this.f16143p.f15594f.f15615n;
                    if (i2 >= landPositionDataArr2.length || landPositionDataArr2[i2] == null) {
                        break;
                    }
                    vep5.toq toqVar = new vep5.toq(1);
                    toqVar.zurt(this.f16143p.f15594f.f15615n[i2].f15620g);
                    toqVar.n7h(this.f16143p.f15594f.f15615n[i2].f15624y);
                    toqVar.qrj(0);
                    toqVar.kja0(this.f16143p.f15594f.f15615n[i2].f15622n);
                    toqVar.m28106h(this.f16143p.f15594f.f15615n[i2].f15623q);
                    toqVar.ki(i2);
                    toqVar.fu4(this.f16143p.f15594f.f15615n[i2].f15621k);
                    toqVar.t8r(this.f16143p.f15594f.f15617q[i2]);
                    toqVar.m28107i(this.f16143p.f15594f.f15614k[i2]);
                    this.f61149zy.add(toqVar);
                    i2++;
                }
            }
        }
        this.f16111k.wvg();
        int iMax = Math.max(0, Math.min(C2656k.m9242n(bf2.toq.toq(), this.f61158ld6.getClassName()), this.f16143p.f15599k - 1));
        Log.d(C6071k.f35077k, "unity Data load finished, get first data, position:" + iMax);
        zy(iMax);
    }

    /* JADX INFO: renamed from: h */
    private void m9503h(int position) {
        if (this.f16143p == null) {
            return;
        }
        new AsyncTaskC7936toq(this.f16111k, this.f16143p, position, this.f61158ld6, this.f61159x2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractC2723p
    /* JADX INFO: renamed from: g */
    public String mo9490g() {
        return this.f16111k.getActivity().getResources().getString(R.string.de_super_wp_land_position_default_des);
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractC2723p
    /* JADX INFO: renamed from: p */
    public void mo9493p(String s2) {
        SuperWallpaperSummaryData superWallpaperSummaryDataM9221s = C2640k.m9216n().m9221s(this.f16144s);
        this.f16143p = superWallpaperSummaryDataM9221s;
        if (superWallpaperSummaryDataM9221s != null) {
            cdj();
        } else {
            C2640k.m9216n().m9220k(new C2729k());
        }
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractC2723p
    /* JADX INFO: renamed from: s */
    public int mo9495s() {
        return 1;
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractC2723p
    public void toq() {
        m9503h(this.f16112n);
    }
}

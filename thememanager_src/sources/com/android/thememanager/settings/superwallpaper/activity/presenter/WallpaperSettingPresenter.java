package com.android.thememanager.settings.superwallpaper.activity.presenter;

import android.util.Pair;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q;
import com.android.thememanager.settings.eqxt;
import com.android.thememanager.settings.subsettings.f7l8;
import com.android.thememanager.settings.superwallpaper.activity.WallpaperSettingSupportSuperWallpaperActivity;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperSettingPresenter implements InterfaceC0928g, com.android.thememanager.basemodule.async.toq<Void, Object, Boolean> {

    /* JADX INFO: renamed from: h */
    private static final int f15653h = 3;

    /* JADX INFO: renamed from: i */
    private static final int f15654i = 23;

    /* JADX INFO: renamed from: p */
    private static final int f15655p = 6;

    /* JADX INFO: renamed from: z */
    private static int f15656z;

    /* JADX INFO: renamed from: g */
    private boolean f15657g;

    /* JADX INFO: renamed from: k */
    @lvui
    private final WallpaperSettingSupportSuperWallpaperActivity f15658k;

    /* JADX INFO: renamed from: n */
    private AsyncTaskC2643k f15659n;

    /* JADX INFO: renamed from: q */
    @dd
    private zy f15660q;

    /* JADX INFO: renamed from: s */
    private int f15661s;

    /* JADX INFO: renamed from: y */
    private boolean f15662y;

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.presenter.WallpaperSettingPresenter$k */
    static class AsyncTaskC2643k extends AbstractAsyncTaskC1714q<Void, Object, Boolean> {
        AsyncTaskC2643k() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voids) {
            Pair<List<f7l8>, Boolean> pairM9173k = f7l8.m9173k(bz2.toq.toq(WallpaperSettingPresenter.f15656z), WallpaperSettingPresenter.f15656z, 3);
            List list = pairM9173k != null ? (List) pairM9173k.first : null;
            if (list != null) {
                publishProgress(4, list);
            }
            return Boolean.TRUE;
        }
    }

    static class toq extends AbstractAsyncTaskC1714q<Void, Object, Boolean> {
        toq() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voids) {
            List<f7l8> qVar = f7l8.toq(bz2.toq.m5843n(0));
            if (qVar != null) {
                publishProgress(2, qVar);
            }
            return Boolean.TRUE;
        }
    }

    static class zy extends AbstractAsyncTaskC1714q<Void, Object, Boolean> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final WeakReference<WallpaperSettingPresenter> f60886toq;

        zy(WallpaperSettingPresenter observer) {
            this.f60886toq = new WeakReference<>(observer);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q, android.os.AsyncTask
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean aBoolean) {
            WallpaperSettingPresenter wallpaperSettingPresenter;
            if (isCancelled() || (wallpaperSettingPresenter = this.f60886toq.get()) == null) {
                return;
            }
            toq toqVar = new toq();
            toqVar.m6700k(wallpaperSettingPresenter);
            toqVar.executeOnExecutor(C6002g.x2(), new Void[0]);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voids) {
            List<f7l8> listT8r = eqxt.t8r(true, true);
            if (listT8r.size() > 0) {
                publishProgress(2, listT8r);
            }
            return Boolean.TRUE;
        }
    }

    public WallpaperSettingPresenter(@lvui WallpaperSettingSupportSuperWallpaperActivity v2) {
        this.f15658k = v2;
        f15656z = 0;
        this.f15661s = 0;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void f7l8(@lvui InterfaceC0954z owner) {
        toq(2, true);
        toq(4, true);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        zy zyVar = this.f15660q;
        if (zyVar != null) {
            zyVar.toq(this);
        }
        AsyncTaskC2643k asyncTaskC2643k = this.f15659n;
        if (asyncTaskC2643k != null) {
            asyncTaskC2643k.toq(this);
        }
    }

    @Override // com.android.thememanager.basemodule.async.toq
    public void py(Object... values) {
        boolean z2 = false;
        Object obj = values[0];
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            List<f7l8> list = (List) values[1];
            if (list == null) {
                return;
            }
            if (iIntValue != 4) {
                this.f15658k.lw(iIntValue, list, true);
                return;
            }
            if (list.size() < 6) {
                f15656z = 0;
                z2 = true;
            } else {
                f15656z += list.size();
            }
            if (z2) {
                return;
            }
            this.f15661s += list.size();
            this.f15658k.lw(iIntValue, list, true ^ this.f15662y);
        }
    }

    public void toq(int flag, boolean isRefresh) {
        if (flag == 2) {
            zy zyVar = new zy(this);
            this.f15660q = zyVar;
            zyVar.m6700k(this);
            this.f15660q.executeOnExecutor(C6002g.ld6(), new Void[0]);
            return;
        }
        if (this.f15657g) {
            return;
        }
        this.f15662y = isRefresh;
        if (isRefresh) {
            this.f15661s = 0;
        }
        if (this.f15661s > 23) {
            return;
        }
        this.f15657g = true;
        AsyncTaskC2643k asyncTaskC2643k = new AsyncTaskC2643k();
        this.f15659n = asyncTaskC2643k;
        asyncTaskC2643k.m6700k(this);
        this.f15659n.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @Override // com.android.thememanager.basemodule.async.toq
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public void ij(Boolean aBoolean) {
        this.f15657g = false;
        this.f15658k.gcp();
    }
}

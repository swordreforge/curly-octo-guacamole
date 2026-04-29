package com.android.thememanager.activity;

import a98o.C0004k;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.android.thememanager.activity.WallpaperDetailViewPager;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.view.WallpaperView;

/* JADX INFO: compiled from: ScrollableWallpaperViewHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class zwy {

    /* JADX INFO: renamed from: k */
    private WallpaperDetailViewPager f9434k;

    /* JADX INFO: renamed from: q */
    private int f9436q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C0004k<Resource> f57365toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private WallpaperView f57366zy;

    /* JADX INFO: renamed from: n */
    private boolean f9435n = true;

    /* JADX INFO: renamed from: g */
    private boolean f9433g = true;

    public zwy(Fragment fragment, C0004k<Resource> dataGroup, WallpaperDetailViewPager viewPager, WallpaperView wallpaperView, int pageIndex, r25n viewModel) {
        this.f57365toq = dataGroup;
        this.f9434k = viewPager;
        this.f9436q = pageIndex;
        this.f57366zy = wallpaperView;
        this.f9434k.setAdapter(new ew(fragment, dataGroup, viewModel));
        this.f9434k.setCurrentItem(this.f9436q);
        this.f9434k.setOffscreenPageLimit(3);
    }

    /* JADX INFO: renamed from: g */
    public void m6484g(boolean show) {
        this.f9434k.setVisibility(show ? 0 : 8);
        this.f57366zy.setVisibility(show ? 4 : 0);
        if (C1819o.ncyb(bf2.toq.toq())) {
            this.f9435n = show;
        } else {
            this.f9433g = show;
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m6485k() {
        WallpaperDetailViewPager wallpaperDetailViewPager = this.f9434k;
        return wallpaperDetailViewPager != null && wallpaperDetailViewPager.m6378e();
    }

    /* JADX INFO: renamed from: n */
    public void m6486n(WallpaperDetailViewPager.InterfaceC1559k l2) {
        WallpaperDetailViewPager wallpaperDetailViewPager = this.f9434k;
        if (wallpaperDetailViewPager != null) {
            wallpaperDetailViewPager.setWallpaperPagerGestureListener(l2);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m6487q(boolean enable) {
        WallpaperDetailViewPager wallpaperDetailViewPager = this.f9434k;
        if (wallpaperDetailViewPager != null) {
            wallpaperDetailViewPager.setEnabled(enable);
        }
    }

    protected void toq() {
        if (C1819o.ncyb(bf2.toq.toq())) {
            m6484g(this.f9435n);
        } else {
            m6484g(this.f9433g);
        }
    }

    public void zy(ViewPager.InterfaceC1284p l2) {
        this.f9434k.zy(l2);
    }
}

package com.android.thememanager.activity;

import a98o.C0004k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.AbstractC1288k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.model.Resource;

/* JADX INFO: compiled from: WallpaperDetailPageAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class ew extends AbstractC1288k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Fragment f57306f7l8;

    /* JADX INFO: renamed from: g */
    private r25n f9043g;

    /* JADX INFO: renamed from: n */
    private C0004k<Resource> f9044n;

    public ew(Fragment fragment, C0004k<Resource> dataSet, r25n viewModel) {
        this.f9044n = dataSet;
        this.f9043g = viewModel;
        this.f57306f7l8 = fragment;
    }

    private void zurt(Resource resource) {
        this.f9044n.add(resource);
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public boolean ld6(@zy.lvui View view, @zy.lvui Object object) {
        return view == object;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: n */
    public int mo5575n() {
        return this.f9044n.size();
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    /* JADX INFO: renamed from: p */
    public Object mo4276p(ViewGroup container, final int position) {
        WallpaperLoadView wallpaperLoadView = (WallpaperLoadView) LayoutInflater.from(container.getContext()).inflate(R.layout.wallpaper_detail_page_item, container, false);
        wallpaperLoadView.m6383n(this.f57306f7l8, this.f9043g, position);
        container.addView(wallpaperLoadView);
        return wallpaperLoadView;
    }

    @Override // androidx.viewpager.widget.AbstractC1288k
    public void toq(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}

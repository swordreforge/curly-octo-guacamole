package com.android.thememanager.recommend.view.listview;

import com.android.thememanager.recommend.view.listview.viewmodel.C2449k;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.g */
/* JADX INFO: compiled from: RecommendVMListViewBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2365g extends C2367n {

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private boolean f60675ni7 = true;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private C2449k f60676zurt;

    public C2365g mcp(C2449k vm) {
        this.f60676zurt = vm;
        return this;
    }

    public C2449k o1t() {
        return this.f60676zurt;
    }

    /* JADX INFO: renamed from: t */
    public C2365g m8553t(boolean enable) {
        this.f60675ni7 = enable;
        return this;
    }

    public boolean wvg() {
        return this.f60675ni7;
    }

    @Override // com.android.thememanager.recommend.view.listview.C2367n, com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public RecommendVMListView build() {
        m8560k();
        return new RecommendVMListView(this);
    }
}

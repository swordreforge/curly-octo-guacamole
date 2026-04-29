package com.android.thememanager;

import com.android.thememanager.recommend.view.listview.viewmodel.C2449k;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.i */
/* JADX INFO: compiled from: LargeIconRecommendResource.java */
/* JADX INFO: loaded from: classes.dex */
public class C2081i {

    /* JADX INFO: renamed from: k */
    private List<UIElement> f12298k;

    /* JADX INFO: renamed from: n */
    private int f12299n;

    /* JADX INFO: renamed from: q */
    private boolean f12300q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f60328toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f60329zy;

    public C2081i() {
        this.f12300q = true;
    }

    public void f7l8(boolean mHasMore) {
        this.f12300q = mHasMore;
    }

    /* JADX INFO: renamed from: g */
    public void m7990g(C2449k recommendViewModel) {
        recommendViewModel.lrht(new ArrayList(this.f12298k));
        recommendViewModel.vyq(this.f60328toq);
        recommendViewModel.uv6(this.f60329zy);
        recommendViewModel.m8793c(this.f12300q);
    }

    /* JADX INFO: renamed from: k */
    public List<UIElement> m7991k() {
        return this.f12298k;
    }

    public void ld6(String mResourceCode) {
        this.f60328toq = mResourceCode;
    }

    /* JADX INFO: renamed from: n */
    public boolean m7992n() {
        return this.f12300q;
    }

    /* JADX INFO: renamed from: p */
    public void m7993p(int preloadHelperCardStart) {
        this.f12299n = preloadHelperCardStart;
    }

    /* JADX INFO: renamed from: q */
    public String m7994q() {
        return this.f60328toq;
    }

    /* JADX INFO: renamed from: s */
    public void m7995s(int mPageIndex) {
        this.f60329zy = mPageIndex;
    }

    public int toq() {
        return this.f60329zy;
    }

    public C2081i x2(UIPage uiPage, List<UIElement> itemDataList, boolean refresh, int cardCount) {
        if (refresh) {
            this.f12298k = itemDataList;
            this.f60329zy = uiPage.cards.size();
            this.f12299n = -1;
        } else {
            if (this.f12298k == null) {
                this.f12298k = new ArrayList();
            }
            this.f12298k.addAll(itemDataList);
            this.f60329zy += uiPage.cards.size();
        }
        boolean z2 = uiPage.hasMore;
        this.f12300q = z2;
        if (z2 && cardCount > uiPage.cards.size()) {
            this.f60329zy += cardCount - uiPage.cards.size();
        }
        return this;
    }

    /* JADX INFO: renamed from: y */
    public void m7996y(List<UIElement> mItemDataList) {
        this.f12298k = mItemDataList;
    }

    public int zy() {
        return this.f12299n;
    }

    public C2081i(UIPage uiPage, List<UIElement> itemDataList) {
        this.f12300q = true;
        this.f12298k = itemDataList;
        this.f60329zy = itemDataList.size();
        this.f12300q = uiPage.hasMore;
    }
}

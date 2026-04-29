package com.android.thememanager.recommend.view.listview;

import android.content.Context;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n7h;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.n */
/* JADX INFO: compiled from: RecommendListViewBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2367n implements IRecommendListViewBuilder {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f60677cdj;

    /* JADX INFO: renamed from: h */
    private int f13751h;

    /* JADX INFO: renamed from: k */
    private ActivityC0891q f13753k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f60680ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f60681kja0;

    /* JADX INFO: renamed from: s */
    private IRecommendListView.CallBack f13757s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private GridLayoutManager.zy f60685t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Fragment f60686toq;

    /* JADX INFO: renamed from: y */
    private IRecommendListView.Request f13758y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f60688zy;

    /* JADX INFO: renamed from: q */
    private boolean f13756q = true;

    /* JADX INFO: renamed from: n */
    private boolean f13754n = true;

    /* JADX INFO: renamed from: g */
    private boolean f13750g = false;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f60678f7l8 = 0;

    /* JADX INFO: renamed from: p */
    private boolean f13755p = false;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f60682ld6 = false;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private RecyclerView.kja0 f60687x2 = null;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f60684qrj = false;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f60683n7h = false;

    /* JADX INFO: renamed from: i */
    private int f13752i = 0;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private boolean f60679fn3e = true;

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListView build() {
        m8560k();
        return new RecommendListView(this);
    }

    public boolean cdj() {
        return this.f60679fn3e;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder disableAnim() {
        this.f13750g = true;
        return this;
    }

    RecyclerView.kja0 f7l8() {
        return this.f60687x2;
    }

    public boolean fn3e() {
        return this.f60684qrj;
    }

    public boolean fu4() {
        return this.f60683n7h;
    }

    /* JADX INFO: renamed from: g */
    public Fragment m8557g() {
        return this.f60686toq;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC1719p m8558h() {
        n7h n7hVar = this.f60686toq;
        return n7hVar != null ? (InterfaceC1719p) n7hVar : (InterfaceC1719p) this.f13753k;
    }

    /* JADX INFO: renamed from: i */
    boolean m8559i() {
        return this.f13754n;
    }

    /* JADX INFO: renamed from: k */
    protected void m8560k() {
        ActivityC0891q activityC0891q = this.f13753k;
        if (activityC0891q == null && this.f60686toq == null) {
            throw new IllegalArgumentException("context is null");
        }
        if (!(activityC0891q instanceof InterfaceC1719p) && !(this.f60686toq instanceof InterfaceC1719p)) {
            throw new IllegalArgumentException("context is not ViewContainer");
        }
        int i2 = this.f60678f7l8;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("mLayoutManagerType is illegal");
        }
        if (this.f13758y == null) {
            throw new IllegalArgumentException("mRequest is null");
        }
    }

    boolean ki() {
        return this.f13750g;
    }

    public int kja0() {
        return this.f60681kja0;
    }

    @dd
    public String ld6() {
        return this.f60688zy;
    }

    /* JADX INFO: renamed from: n */
    Context m8561n() {
        ActivityC0891q activityC0891q = this.f13753k;
        return activityC0891q != null ? activityC0891q : this.f60686toq.getActivity();
    }

    public int n7h() {
        return this.f13751h;
    }

    boolean ni7() {
        return this.f13756q;
    }

    @lvui
    /* JADX INFO: renamed from: p */
    IRecommendListView.Request m8562p() {
        return this.f13758y;
    }

    /* JADX INFO: renamed from: q */
    public int m8563q() {
        return this.f13752i;
    }

    public GridLayoutManager.zy qrj() {
        return this.f60685t8r;
    }

    /* JADX INFO: renamed from: s */
    public int m8564s() {
        return this.f60678f7l8;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setCallBack(@lvui IRecommendListView.CallBack callBack) {
        this.f13757s = callBack;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setCardCount(int cardCount) {
        this.f13752i = cardCount;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setCardDivider(boolean hasCardDivider) {
        this.f60682ld6 = hasCardDivider;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setContext(ActivityC0891q activity) {
        this.f13753k = activity;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setItemDecoration(RecyclerView.kja0 decoration) {
        this.f60687x2 = decoration;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setLayoutManagerSpanCount(int count) {
        this.f60680ki = count;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setLayoutManagerType(int type) {
        this.f60678f7l8 = type;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setLoadMore(boolean loadMore) {
        this.f13754n = loadMore;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setNeedFootTip(boolean needFootTip) {
        this.f60684qrj = needFootTip;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setPicker(boolean isPicker) {
        this.f13755p = isPicker;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setRefresh(boolean refresh) {
        this.f13756q = refresh;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setRequest(IRecommendListView.Request request) {
        this.f13758y = request;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setResCode(String resCode) {
        this.f60688zy = resCode;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setRingtoneFlag(int ringtoneFlag) {
        this.f60677cdj = ringtoneFlag;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setSettingPage(boolean isSettingPage) {
        this.f60683n7h = isSettingPage;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setSpanSizeLookup(GridLayoutManager.zy spanSizeLookup) {
        this.f60685t8r = spanSizeLookup;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setStaggerDecorationSize(int staggerDecorationSize) {
        this.f13751h = staggerDecorationSize;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setStaggerHolderWidth(int staggerHolderWidth) {
        this.f60681kja0 = staggerHolderWidth;
        return this;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setViewHolderLifecycleEnable(boolean needLifeCycle) {
        this.f60679fn3e = needLifeCycle;
        return this;
    }

    boolean t8r() {
        return this.f60682ld6;
    }

    public ActivityC0891q toq() {
        ActivityC0891q activityC0891q = this.f13753k;
        return activityC0891q == null ? this.f60686toq.getActivity() : activityC0891q;
    }

    public int x2() {
        return this.f60677cdj;
    }

    /* JADX INFO: renamed from: y */
    public int m8565y() {
        return this.f60680ki;
    }

    public boolean zurt() {
        return this.f13755p;
    }

    IRecommendListView.CallBack zy() {
        return this.f13757s;
    }

    @Override // com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder
    public IRecommendListViewBuilder setContext(Fragment fragment) {
        this.f60686toq = fragment;
        return this;
    }
}

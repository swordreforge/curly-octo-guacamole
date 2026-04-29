package com.android.thememanager.module.detail.presenter;

import android.app.Application;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.fti;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.basemodule.utils.C1825s;
import com.android.thememanager.detail.theme.model.DetailRequestInterface;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.miuixcompat.AsyncTaskC2208n;
import com.android.thememanager.module.detail.view.C2258d;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.util.C2782h;
import retrofit2.C7639i;
import retrofit2.InterfaceC7648q;
import zy.lvui;

/* JADX INFO: compiled from: ThemeDetailPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
public class cdj extends qrj {
    private retrofit2.toq<EmptyResponse> yl25;
    private final fti<C1723y<Pair<Boolean, Integer>>> zmmu;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.cdj$k */
    /* JADX INFO: compiled from: ThemeDetailPresenter.java */
    class C2224k implements InterfaceC7648q<EmptyResponse> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f13063k;

        C2224k(final boolean val$follow) {
            this.f13063k = val$follow;
        }

        @Override // retrofit2.InterfaceC7648q
        public void onFailure(@lvui retrofit2.toq<EmptyResponse> call, @lvui Throwable t2) {
            Log.e("ThemeDetailPresenter", "AuthorFollowCallback failed: " + t2.getMessage());
            cdj.this.zp();
        }

        @Override // retrofit2.InterfaceC7648q
        public void onResponse(@lvui retrofit2.toq<EmptyResponse> call, @lvui C7639i<EmptyResponse> response) {
            if (!response.f7l8()) {
                cdj.this.zp();
                return;
            }
            OnlineResourceDetail onlineResourceDetail = cdj.this.f13109z;
            boolean z2 = this.f13063k;
            onlineResourceDetail.follow = z2;
            if (z2) {
                onlineResourceDetail.fansNum++;
                C2782h.m9787k();
            } else {
                onlineResourceDetail.fansNum--;
                C2782h.toq();
            }
            cdj.this.zmmu.cdj(new C1723y(Pair.create(Boolean.valueOf(cdj.this.f13109z.follow), Integer.valueOf(cdj.this.f13109z.fansNum))));
            cdj.this.bf2();
        }
    }

    public cdj(Application app) {
        super(app);
        this.zmmu = new fti<>();
    }

    private void ixz(boolean isMix) {
        if (this.f13109z.hasAod && C2258d.wt(n5r1())) {
            this.an.cdj(new C1723y<>(Pair.create(102, Boolean.valueOf(isMix))));
        } else {
            yz(false, isMix);
        }
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj, c8jq.InterfaceC1392k.toq
    public void apply() {
        ixz(false);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m28255do() {
        ixz(true);
    }

    public retrofit2.toq<CommonResponse<com.google.gson.kja0>> ebn(int cardStart) {
        return ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRelateRecommendTheme(cardStart, this.f13109z.packId);
    }

    public fti<C1723y<Pair<Boolean, Integer>>> n2t() {
        return this.zmmu;
    }

    public retrofit2.toq<CommonResponse<com.google.gson.kja0>> nsb() {
        return ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRelateRecommendTheme(0, this.f13109z.packId);
    }

    public retrofit2.toq<CommonResponse<UIPage>> pc(int cardStart) {
        if ("theme".equals(this.f13103t)) {
            return ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRecommendTheme(cardStart);
        }
        return null;
    }

    public void ukdy(boolean follow) {
        retrofit2.toq<EmptyResponse> toqVar = this.yl25;
        if (toqVar != null) {
            toqVar.cancel();
        }
        OnlineResourceDetail onlineResourceDetail = this.f13109z;
        this.yl25 = was.toq.m28125n(onlineResourceDetail.designerMiId, follow, onlineResourceDetail.designerName, new C2224k(follow));
        jbh(follow ? "ATTENTION" : "DIS_ATTENTION");
    }

    public void zwy() {
        C1825s.f10404q.m7215k(AsyncTaskC2208n.f60497kja0);
    }
}

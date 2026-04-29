package com.android.thememanager.module.detail.presenter;

import android.app.Application;
import android.util.Pair;
import androidx.lifecycle.fti;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.detail.theme.model.DetailRequestInterface;
import com.android.thememanager.lvui;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.k */
/* JADX INFO: compiled from: AodDetailPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2227k extends qrj {
    public final fti<C1723y<Boolean>> yl25;
    public Pair<UIPage, List<UIElement>> zmmu;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.k$k */
    /* JADX INFO: compiled from: AodDetailPresenter.java */
    class k implements lvui.toq {
        k() {
        }

        @Override // com.android.thememanager.lvui.toq
        /* JADX INFO: renamed from: n */
        public void mo6395n(Resource resource) {
            Resource resource2 = C2227k.this.f13094h;
            if (resource2 == null || resource2.getAssemblyId() == null || !C2227k.this.f13094h.getAssemblyId().equals(resource.getAssemblyId())) {
                return;
            }
            C2227k c2227k = C2227k.this;
            c2227k.f13094h = resource;
            c2227k.h7am(0);
            C2227k.this.yl25.cdj(new C1723y<>(Boolean.TRUE));
        }

        @Override // com.android.thememanager.lvui.toq
        /* JADX INFO: renamed from: p */
        public void mo6396p(Resource resource) {
            Resource resource2 = C2227k.this.f13094h;
            if (resource2 == null || resource2.getAssemblyId() == null || !C2227k.this.f13094h.getAssemblyId().equals(resource.getAssemblyId())) {
                return;
            }
            C2227k.this.h7am(0);
        }

        @Override // com.android.thememanager.lvui.toq
        /* JADX INFO: renamed from: q */
        public void mo6397q(Resource resource) {
            Resource resource2 = C2227k.this.f13094h;
            if (resource2 == null || resource2.getAssemblyId() == null || !C2227k.this.f13094h.getAssemblyId().equals(resource.getAssemblyId())) {
                return;
            }
            C2227k.this.h7am(6);
        }

        @Override // com.android.thememanager.lvui.toq
        public void toq(Resource resource, int downloadBytes, int totalBytes) {
        }
    }

    public C2227k(Application app) {
        super(app);
        this.yl25 = new fti<>();
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj, c8jq.InterfaceC1392k.toq
    public void apply() {
        if (C1819o.m7153f()) {
            this.bv.cdj(new C1723y<>(18));
        } else {
            ek5k(false);
        }
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected lvui.toq bo() {
        return new k();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public Pair<UIPage, List<UIElement>> m28257do() {
        return this.zmmu;
    }

    public void ebn(Pair<UIPage, List<UIElement>> recommendData) {
        this.zmmu = recommendData;
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected boolean gbni() {
        return m28257do() == null;
    }

    public retrofit2.toq<CommonResponse<UIPage>> ixz(int randIndex, int cardStart) {
        if ("aod".equals(this.f13103t)) {
            return ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRecommendAod(randIndex, cardStart);
        }
        return null;
    }

    public retrofit2.toq<CommonResponse<com.google.gson.kja0>> ukdy(int randIndex) {
        return ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRelateRecommendAod(randIndex, 0, this.f13109z.packId);
    }

    public retrofit2.toq<CommonResponse<com.google.gson.kja0>> wx16(int randIndex, int cardStart) {
        return ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRelateRecommendAod(randIndex, cardStart, this.f13109z.packId);
    }
}

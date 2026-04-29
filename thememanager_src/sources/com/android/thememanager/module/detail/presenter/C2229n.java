package com.android.thememanager.module.detail.presenter;

import android.app.Application;
import android.util.ArrayMap;
import android.util.Log;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.detail.theme.model.DetailRequestInterface;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.model.LargeIconElement;
import com.android.thememanager.module.detail.util.C2247q;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.view.C2938r;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.n */
/* JADX INFO: compiled from: LargeIconDetailPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2229n extends C2226h implements zy {
    private final fti<C2938r> sk1t;
    private String yl25;
    private boolean zmmu;

    public C2229n(Application app) {
        super(app);
        this.sk1t = new fti<>(new C2938r(-1, null));
    }

    private void nsb() {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("pageId", com.android.thememanager.basemodule.analysis.toq.ja);
        arrayMap.put("app_package_name", ukdy());
        Resource resource = this.f13094h;
        arrayMap.put("content", resource == null ? null : resource.getOnlineId());
        arrayMap.put("resourceType", "largeicons");
        arrayMap.put("size", C2938r.toq(ni7()));
        C1708s.f7l8().ld6().zurt(arrayMap);
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj, c8jq.InterfaceC1392k.toq
    public void apply() {
        Log.i("LargeIcon", "apply detail large Icon");
        super.apply();
        nsb();
    }

    @Override // com.android.thememanager.module.detail.presenter.C2226h
    /* JADX INFO: renamed from: do */
    public retrofit2.toq<CommonResponse<com.google.gson.kja0>> mo28256do(int randIndex) {
        return ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRelateLargeIcon(randIndex, 0, this.f13109z.packId);
    }

    public boolean ebn() {
        return this.zmmu;
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj, c8jq.InterfaceC1392k.toq
    public void f7l8() {
        super.f7l8();
    }

    @Override // com.android.thememanager.module.detail.presenter.zy
    public LargeIconElement fu4() {
        return this.sk1t.m4388g().f61539zy;
    }

    @Override // com.android.thememanager.module.detail.presenter.zy
    /* JADX INFO: renamed from: g */
    public void mo8330g(@InterfaceC7396q @lvui InterfaceC0954z owner, @InterfaceC7396q @lvui jp0y<C2938r> observer) {
        this.sk1t.m4391p(owner, observer);
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected C2247q i1() {
        C2247q c2247qI1 = super.i1();
        String str = this.yl25;
        String str2 = null;
        if (str == null) {
            str = fu4() != null ? fu4().packageName : null;
        }
        c2247qI1.f13157s = str;
        if (str == null && this.f13109z != null) {
            Log.i("LargeIcon", "createApplyParams: use detail pkgName");
            c2247qI1.f13157s = this.f13109z.productPackageName;
        }
        c2247qI1.f13158y = ni7();
        c2247qI1.f60527ld6 = "theme";
        c2247qI1.f13155p = false;
        if (fu4() != null) {
            str2 = fu4().id;
        } else {
            OnlineResourceDetail onlineResourceDetail = this.f13109z;
            if (onlineResourceDetail != null) {
                str2 = onlineResourceDetail.packId;
            }
        }
        c2247qI1.f60526f7l8 = str2;
        Log.d("LargeIcon", "createApplyParams: " + c2247qI1.f13157s);
        return c2247qI1;
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected void ikck() {
        if (this.yl25 == null || !this.zmmu) {
            super.ikck();
        } else if (p029m.zy.toq(vyq.ni7("icons"))) {
            this.f13092e = ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getDefaultLargeIconDetail(this.yl25);
        } else {
            Log.i("LargeIcon", "loadOfficialResource detail: return");
        }
    }

    @Override // com.android.thememanager.module.detail.presenter.C2226h
    public retrofit2.toq<CommonResponse<UIPage>> ixz(int randIndex, int cardStart) {
        return ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRecommendLargeIcon(randIndex, cardStart);
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    public void m4(int apiCode) {
        Resource resource;
        super.m4(apiCode);
        if (apiCode == 520 && (resource = this.f13094h) != null && p029m.zy.m24738k(LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID, resource.getOnlineId())) {
            LargeIconElement largeIconElementFu4 = fu4();
            largeIconElementFu4.preview_1_1 = LargeIconElement.getDefaultIconPathByPackageNames(this.yl25);
            largeIconElementFu4.signature = vyq.fn3e("icons") + vyq.fu4("icons");
            largeIconElementFu4.packageName = this.yl25;
            largeIconElementFu4.name = C1819o.m7168z();
            largeIconElementFu4.id = LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID;
            mo8331s(largeIconElementFu4, -1);
        }
    }

    @Override // com.android.thememanager.module.detail.presenter.zy
    public int ni7() {
        return this.sk1t.m4388g().f17676k;
    }

    public void pc(String largeIconPackageName, boolean isOfficial) {
        this.zmmu = isOfficial;
        this.yl25 = largeIconPackageName;
    }

    @Override // com.android.thememanager.module.detail.presenter.zy
    /* JADX INFO: renamed from: s */
    public void mo8331s(LargeIconElement element, int type) {
        Resource resource;
        OnlineResourceDetail onlineResourceDetail;
        C2938r c2938rM4388g = this.sk1t.m4388g();
        if (element != null) {
            c2938rM4388g.f61539zy = element;
            if (!p029m.zy.toq(vyq.ni7("icons")) && (p029m.zy.m24738k(LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID, c2938rM4388g.f61539zy.id) || (((resource = this.f13094h) != null && resource.getLocalInfo().isOfficial()) || ((onlineResourceDetail = this.f13109z) != null && onlineResourceDetail.isOfficialIcons == 1)))) {
                Log.i("LargeIcon", "setSelectedResource clear official resource");
                LargeIconElement largeIconElement = c2938rM4388g.f61539zy;
                largeIconElement.preview_1_2 = null;
                largeIconElement.preview_2_1 = null;
                largeIconElement.preview_2_2 = null;
            }
        }
        if (type > 0) {
            c2938rM4388g.f17676k = type;
        }
        this.sk1t.cdj(c2938rM4388g);
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj, c8jq.InterfaceC1392k.toq
    /* JADX INFO: renamed from: t */
    public boolean mo5857t() {
        Resource resource = this.f13094h;
        return (resource == null || resource.getLocalInfo().getLargeIconPackageName() == null || this.f13094h.getLocalId() == null || this.f13094h.getLocalInfo().isOfficial() || zsr0.toq.m28219g(this.f13094h.getLocalInfo().getLargeIconPackageName(), this.f13094h.getLocalId(), this.f13094h.getLocalInfo().isOfficial())) ? false : true;
    }

    public String ukdy() {
        String str = this.yl25;
        if (str != null) {
            return str;
        }
        if (fu4() != null) {
            return fu4().packageName;
        }
        return null;
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected void v0af(@InterfaceC7396q @lvui OnlineResourceDetail response) {
        super.v0af(response);
        mo8331s(LargeIconElement.create(response, fu4(), this.yl25), -1);
    }

    @Override // com.android.thememanager.module.detail.presenter.C2226h
    public retrofit2.toq<CommonResponse<com.google.gson.kja0>> wx16(int randIndex, int cardStart) {
        return ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRelateLargeIcon(randIndex, cardStart, this.f13109z.packId);
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj, c8jq.InterfaceC1392k.toq
    public boolean zurt() {
        Resource resource = this.f13094h;
        if (resource == null || resource.getLocalInfo() == null || !this.f13094h.getLocalInfo().isOfficial() || LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID.equals(this.f13094h.getOnlineId())) {
            return super.zurt();
        }
        return false;
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj, c8jq.InterfaceC1392k.toq
    public boolean zy() {
        return false;
    }
}

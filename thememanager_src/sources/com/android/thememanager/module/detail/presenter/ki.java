package com.android.thememanager.module.detail.presenter;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.fti;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.controller.online.t8r;
import com.android.thememanager.detail.theme.model.DetailRequestInterface;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.util.C2782h;
import kotlin.C6227f;
import kotlin.ch;
import kotlin.enums.InterfaceC6225k;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import retrofit2.C7639i;
import retrofit2.InterfaceC7648q;

/* JADX INFO: compiled from: WidgetDetailVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ki extends qrj {

    @InterfaceC7395n
    private retrofit2.toq<EmptyResponse> yl25;

    @InterfaceC7396q
    private final fti<C1723y<C6227f<Boolean, Integer>>> zmmu;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.ki$k */
    /* JADX INFO: compiled from: WidgetDetailVM.kt */
    public static final class EnumC2228k {

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ EnumC2228k[] f13079k;

        /* JADX INFO: renamed from: q */
        private static final /* synthetic */ InterfaceC6225k f13080q;
        public static final EnumC2228k WIDGET_1X2 = new EnumC2228k("WIDGET_1X2", 0);
        public static final EnumC2228k WIDGET_2X1 = new EnumC2228k("WIDGET_2X1", 1);
        public static final EnumC2228k WIDGET_2X2 = new EnumC2228k("WIDGET_2X2", 2);
        public static final EnumC2228k WIDGET_4X2 = new EnumC2228k("WIDGET_4X2", 3);
        public static final EnumC2228k WIDGET_2X3 = new EnumC2228k("WIDGET_2X3", 4);
        public static final EnumC2228k WIDGET_4X4 = new EnumC2228k("WIDGET_4X4", 5);
        public static final EnumC2228k WIDGET_FRONT = new EnumC2228k("WIDGET_FRONT", 6);

        static {
            EnumC2228k[] qVar = toq();
            f13079k = qVar;
            f13080q = kotlin.enums.toq.toq(qVar);
        }

        private EnumC2228k(String str, int i2) {
        }

        @InterfaceC7396q
        public static InterfaceC6225k<EnumC2228k> getEntries() {
            return f13080q;
        }

        private static final /* synthetic */ EnumC2228k[] toq() {
            return new EnumC2228k[]{WIDGET_1X2, WIDGET_2X1, WIDGET_2X2, WIDGET_4X2, WIDGET_2X3, WIDGET_4X4, WIDGET_FRONT};
        }

        public static EnumC2228k valueOf(String str) {
            return (EnumC2228k) Enum.valueOf(EnumC2228k.class, str);
        }

        public static EnumC2228k[] values() {
            return (EnumC2228k[]) f13079k.clone();
        }
    }

    /* JADX INFO: compiled from: WidgetDetailVM.kt */
    public static final class toq implements InterfaceC7648q<EmptyResponse> {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ boolean f13082q;

        toq(boolean z2) {
            this.f13082q = z2;
        }

        @Override // retrofit2.InterfaceC7648q
        public void onFailure(@InterfaceC7396q retrofit2.toq<EmptyResponse> call, @InterfaceC7396q Throwable t2) {
            d2ok.m23075h(call, "call");
            d2ok.m23075h(t2, "t");
            Log.e(t8r.f13131k, "AuthorFollowCallback failed: " + t2.getMessage());
            ki.this.zp();
        }

        @Override // retrofit2.InterfaceC7648q
        public void onResponse(@InterfaceC7396q retrofit2.toq<EmptyResponse> call, @InterfaceC7396q C7639i<EmptyResponse> response) {
            d2ok.m23075h(call, "call");
            d2ok.m23075h(response, "response");
            if (!response.f7l8()) {
                ki.this.zp();
                return;
            }
            OnlineResourceDetail onlineResourceDetail = ki.this.f13109z;
            boolean z2 = this.f13082q;
            onlineResourceDetail.follow = z2;
            if (z2) {
                onlineResourceDetail.fansNum++;
                C2782h.m9787k();
            } else {
                onlineResourceDetail.fansNum--;
                C2782h.toq();
            }
            ki.this.zmmu.cdj(new C1723y(new C6227f(Boolean.valueOf(ki.this.f13109z.follow), Integer.valueOf(ki.this.f13109z.fansNum))));
            ki.this.bf2();
        }
    }

    /* JADX INFO: compiled from: WidgetDetailVM.kt */
    public static final class zy implements t8r.f7l8 {
        zy() {
        }

        @Override // com.android.thememanager.controller.online.t8r.f7l8
        /* JADX INFO: renamed from: q */
        public void mo6370q(int i2, int i3, @InterfaceC7395n String str) {
            Log.w(t8r.f13131k, "onPurchaseFailed: " + i2 + "; $" + i3 + ';' + str);
            ki.this.an.cdj(new C1723y<>(new ch(Integer.valueOf(i2), Integer.valueOf(i3), str)));
            ki.this.h7am(0);
        }

        @Override // com.android.thememanager.controller.online.t8r.f7l8
        public void toq() {
            ki.this.h7am(8);
            ki kiVar = ki.this;
            if (!kiVar.f13109z.bought) {
                kiVar.bf2();
            }
            ki kiVar2 = ki.this;
            kiVar2.f13109z.bought = true;
            kiVar2.f13094h.setProductBought(true);
            ki.this.f13094h.setCheckBoughtStatus(true);
            ki.this.h7am(0);
            ki.this.jbh("BUY_SUCCESS");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(@InterfaceC7396q Application app) {
        super(app);
        d2ok.m23075h(app, "app");
        this.f13103t = "WIDGET_SUIT";
        this.zmmu = new fti<>();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final retrofit2.toq<CommonResponse<com.google.gson.kja0>> m28258do(int i2) {
        retrofit2.toq<CommonResponse<com.google.gson.kja0>> relatedWidget = ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRelatedWidget(i2, this.f13109z.packId);
        d2ok.kja0(relatedWidget, "getRelatedWidget(...)");
        return relatedWidget;
    }

    @InterfaceC7396q
    public final fti<C1723y<C6227f<Boolean, Integer>>> ebn() {
        return this.zmmu;
    }

    public final void ixz(boolean z2) {
        retrofit2.toq<EmptyResponse> toqVar = this.yl25;
        if (toqVar != null) {
            d2ok.qrj(toqVar);
            toqVar.cancel();
        }
        OnlineResourceDetail onlineResourceDetail = this.f13109z;
        this.yl25 = was.toq.m28125n(onlineResourceDetail.designerMiId, z2, onlineResourceDetail.designerName, new toq(z2));
        jbh(z2 ? "ATTENTION" : "DIS_ATTENTION");
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: u */
    public t8r.f7l8 mo8337u() {
        return new zy();
    }

    @InterfaceC7396q
    public final retrofit2.toq<CommonResponse<com.google.gson.kja0>> ukdy() {
        retrofit2.toq<CommonResponse<com.google.gson.kja0>> relatedWidget = ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRelatedWidget(0, this.f13109z.packId);
        d2ok.kja0(relatedWidget, "getRelatedWidget(...)");
        return relatedWidget;
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    public void vep5() {
        h7am(3);
        if (this.f13094h == null) {
            Log.w(t8r.f13131k, "startBuy fail because mResource is null");
        } else {
            bf2();
            jbh("BUY");
        }
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    @InterfaceC7396q
    protected retrofit2.toq<CommonResponse<OnlineResourceDetail>> y2(@InterfaceC7396q DetailRequestInterface detailRequest) {
        d2ok.m23075h(detailRequest, "detailRequest");
        if (C1688q.cdj().o1t()) {
            retrofit2.toq<CommonResponse<OnlineResourceDetail>> safeWidgetDetail = detailRequest.getSafeWidgetDetail(lv5(), "WIDGET_SUIT");
            d2ok.qrj(safeWidgetDetail);
            return safeWidgetDetail;
        }
        retrofit2.toq<CommonResponse<OnlineResourceDetail>> widgetDetail = detailRequest.getWidgetDetail(lv5(), "WIDGET_SUIT");
        d2ok.qrj(widgetDetail);
        return widgetDetail;
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    @InterfaceC7395n
    public String z4() {
        return this.f13095i;
    }
}

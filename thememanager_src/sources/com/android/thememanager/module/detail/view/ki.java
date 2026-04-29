package com.android.thememanager.module.detail.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.kja0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import c8jq.InterfaceC1392k;
import com.android.thememanager.R;
import com.android.thememanager.ad.AdUtils;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.ad.InterfaceC1694q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.ad.model.AdInfoResponse;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.views.AdSubTextView;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.detail.theme.model.UIUpdateLog;
import com.android.thememanager.detail.theme.view.C1977k;
import com.android.thememanager.detail.theme.view.widget.DetailActionView;
import com.android.thememanager.detail.theme.view.widget.RewardDialog;
import com.android.thememanager.detail.theme.view.widget.ThemeOperationButton;
import com.android.thememanager.detail.widget.RewardGuide;
import com.android.thememanager.module.detail.presenter.C2227k;
import com.android.thememanager.module.detail.util.C2244g;
import com.android.thememanager.module.detail.view.AodPreview;
import com.android.thememanager.module.detail.view.AodRecommendListView;
import com.android.thememanager.module.detail.view.ThemeDetailActivity;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIPage;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import miuix.internal.widget.C7177g;
import y9n.C7780k;

/* JADX INFO: compiled from: AodDetailFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class ki extends y9n<C2227k> implements InterfaceC1392k.k, ThemeDetailActivity.zy {
    private AodPreview.C2249k ac;
    private FullScreenAodPreview ad;
    private InterfaceC1392k.n.k aj;
    private C7177g am;
    private View an;
    private boolean ar;
    private DetailActionView as;
    private IRecommendListView ax;
    private View ay;
    private DetailActionView az;
    private com.android.thememanager.detail.theme.view.widget.cdj ba;
    private List<UIUpdateLog> bb;
    private miuix.appcompat.app.ki bd;
    private InterfaceC1694q be;
    private DetailActionView bg;
    private ThemeOperationButton bl;
    private AodPreview bq;
    private boolean bs;
    private com.android.thememanager.ad.download.controller.toq bu;
    private ViewGroup bv;
    private ViewGroup id;
    private View in;
    private RewardDialog k0;
    private boolean bp = false;
    private int bc = com.android.thememanager.basemodule.network.theme.toq.toq();
    private final p000a.zy tlhn = new zy();

    /* JADX INFO: compiled from: AodDetailFragment.java */
    class f7l8 implements DialogInterface.OnClickListener {
        f7l8() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            ki.this.wtop().apply();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ki$g */
    /* JADX INFO: compiled from: AodDetailFragment.java */
    class C2274g implements IRecommendListView.Request {
        C2274g() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getLoadMoreCall(int cardStart) {
            return ki.this.wtop().wx16(ki.this.bc, cardStart);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getRefreshCall() {
            ki.this.bc = com.android.thememanager.basemodule.network.theme.toq.toq();
            return ki.this.wtop().ukdy(ki.this.bc);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ki$k */
    /* JADX INFO: compiled from: AodDetailFragment.java */
    class ViewTreeObserverOnGlobalLayoutListenerC2275k implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC2275k() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ki.this.az.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ki.this.ax.scrollTop();
            FrameLayout frameLayout = (FrameLayout) ki.this.f13397m.getWindow().getDecorView();
            ki kiVar = ki.this;
            frameLayout.addView(new RewardGuide(kiVar.f13397m, kiVar.az));
            com.android.thememanager.detail.theme.view.widget.ki.m7818q();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ki$n */
    /* JADX INFO: compiled from: AodDetailFragment.java */
    class C2276n extends IRecommendListView.CallBack<UIPage> {
        C2276n() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadFail(boolean refresh) {
            if (ki.this.an == null || !C1819o.eqxt(ki.this.getActivity())) {
                return;
            }
            ki.this.an.setPadding(ki.this.an.getPaddingLeft(), ki.this.an.getPaddingTop(), ki.this.an.getPaddingRight(), ki.this.getResources().getDimensionPixelSize(R.dimen.de_no_recommendation_padding_bottom));
            super.onRecommendLoadFail(refresh);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadSuccess(boolean refresh) {
            View viewFindViewById;
            if (ki.this.an != null && (viewFindViewById = ki.this.an.findViewById(R.id.detail_recommend_title)) != null) {
                viewFindViewById.setVisibility(0);
            }
            super.onRecommendLoadSuccess(refresh);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        @zy.y9n
        public UIPage onRequestFinish(UIPage apiData, boolean refresh) {
            if (refresh) {
                ((com.android.thememanager.basemodule.base.toq) ki.this).f9877s = apiData.uuid;
            }
            return super.onRequestFinish(apiData, refresh);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ki$p */
    /* JADX INFO: compiled from: AodDetailFragment.java */
    private static class C2277p extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        private int f13291k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f60561toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f60562zy;

        public C2277p(Context context) {
            this.f13291k = context.getResources().getDimensionPixelSize(R.dimen.de_recommend_aod_item_edge_padding);
            this.f60561toq = context.getResources().getDimensionPixelSize(R.dimen.de_recommend_aod_item_center_padding);
            this.f60562zy = context.getResources().getDimensionPixelSize(R.dimen.de_aod_recommend_item_margin_bottom);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
            if (parent.getChildAdapterPosition(view) < 1) {
                return;
            }
            if (((StaggeredGridLayoutManager.zy) view.getLayoutParams()).m4926p() == 0) {
                outRect.set(this.f13291k, 0, this.f60561toq, this.f60562zy);
            } else {
                outRect.set(this.f60561toq, 0, this.f13291k, this.f60562zy);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ki$q */
    /* JADX INFO: compiled from: AodDetailFragment.java */
    class DialogInterfaceOnClickListenerC2278q implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC2278q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            ki.this.wtop().apply();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ki$s */
    /* JADX INFO: compiled from: AodDetailFragment.java */
    private static class C2279s extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        private final int f13293k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f60563toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f60564zy;

        public C2279s(@zy.lvui Context context, int colCount) {
            this.f13293k = colCount;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.aod_recommend_item_decoration);
            this.f60563toq = dimensionPixelOffset;
            this.f60564zy = dimensionPixelOffset * 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@zy.lvui Rect outRect, @zy.lvui View view, @zy.lvui RecyclerView parent, @zy.lvui RecyclerView.mcp state) {
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int i2 = this.f13293k;
            if (childAdapterPosition % i2 == 1) {
                int i3 = this.f60564zy;
                outRect.set(i3, 0, this.f60563toq, i3);
            } else if (childAdapterPosition % i2 != 0) {
                int i4 = this.f60563toq;
                outRect.set(i4, 0, i4, this.f60564zy);
            } else {
                int i5 = this.f60563toq;
                int i6 = this.f60564zy;
                outRect.set(i5, 0, i6, i6);
            }
        }
    }

    /* JADX INFO: compiled from: AodDetailFragment.java */
    class toq implements C1781k.g {
        toq() {
        }

        @Override // com.android.thememanager.basemodule.privacy.C1781k.g
        /* JADX INFO: renamed from: k */
        public void mo6371k(boolean agree) {
            if (agree) {
                ki kiVar = ki.this;
                if (com.android.thememanager.basemodule.utils.lvui.kja0(kiVar, kiVar.tlhn)) {
                    return;
                }
                ki.this.alcv();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ki$y */
    /* JADX INFO: compiled from: AodDetailFragment.java */
    private static class C2280y implements InterfaceC1694q {

        /* JADX INFO: renamed from: k */
        private WeakReference<View> f13295k;

        public C2280y(View adView) {
            this.f13295k = new WeakReference<>(adView);
        }

        @Override // com.android.thememanager.basemodule.ad.InterfaceC1694q
        /* JADX INFO: renamed from: s */
        public void mo6510s(String tagId) {
            View view = this.f13295k.get();
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: compiled from: AodDetailFragment.java */
    class zy implements p000a.zy {
        zy() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            ki.this.alcv();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(ki.this.f13397m, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a3dw(java.util.List<java.lang.String> r10, java.lang.String r11, boolean r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.module.detail.view.ki.a3dw(java.util.List, java.lang.String, boolean, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ae4(View view) {
        com.android.thememanager.basemodule.utils.nn86.m7150k(com.android.thememanager.basemodule.utils.o1t.m7172k() == 1 ? R.string.apply_not_support_maml_aod : R.string.apply_not_support_aod, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b6(View view) {
        c25();
    }

    private void bf5(OnlineResourceDetail onlineResourceDetail) {
        View viewFindViewById = this.an.findViewById(R.id.icon_container);
        DetailActionView detailActionView = (DetailActionView) viewFindViewById.findViewById(R.id.like);
        this.as = detailActionView;
        detailActionView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.ld6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13300k.zt(view);
            }
        });
        mo5847t(onlineResourceDetail.like, onlineResourceDetail.likeCount.intValue());
        DetailActionView detailActionView2 = (DetailActionView) viewFindViewById.findViewById(R.id.favorite);
        this.bg = detailActionView2;
        detailActionView2.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.x2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13382k.jb9(view);
            }
        });
        v0af(onlineResourceDetail.collect);
        DetailActionView detailActionView3 = (DetailActionView) viewFindViewById.findViewById(R.id.reward);
        this.az = detailActionView3;
        if (onlineResourceDetail.productPrice == 0) {
            detailActionView3.setVisibility(0);
        }
        if (wtop().oc()) {
            jbh();
        }
        this.az.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.qrj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13339k.x3b(view);
            }
        });
        if (com.android.thememanager.basemodule.utils.o1t.fn3e()) {
            return;
        }
        viewFindViewById.setVisibility(0);
    }

    private void bmt3(String actionType) {
        boolean zEquals = "TRIAL".equals(actionType);
        if (zEquals) {
            actionType = "APPLY";
        }
        Resource resource = wtop().getResource();
        String strMo5853k = wtop().mo5853k();
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("entryType", com.android.thememanager.basemodule.analysis.f7l8.m6607g());
        arrayMapM6679k.put("name", resource.getTitle());
        arrayMapM6679k.put("resourceType", strMo5853k);
        arrayMapM6679k.put("productId", resource.getOnlineId());
        if ("APPLY".equals(actionType)) {
            arrayMapM6679k.put("type", zEquals ? com.android.thememanager.basemodule.analysis.toq.xn : com.android.thememanager.basemodule.analysis.toq.hql);
        }
        if ("APPLY".equals(actionType)) {
            arrayMapM6679k.put("resourceType", strMo5853k);
            arrayMapM6679k.put("productId", resource.getOnlineId());
        }
        C1708s.f7l8().ld6().n5r1(actionType, C1706p.ki(arrayMapM6679k));
    }

    private int brv() {
        if (C1807g.m7083t(this.f13397m)) {
            return C1819o.ncyb(this.f13397m) ? 4 : 3;
        }
        return 2;
    }

    private void c2() {
        this.in.setVisibility(0);
        this.id.setVisibility(8);
        this.an.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cb(ThemeStatus themeStatus) {
        if (98 == themeStatus.status) {
            cr3();
        }
    }

    private void d6od(OnlineResourceDetail onlineResourceDetail) {
        AdInfo adInfoCheckAndGetAdInfo;
        if (TextUtils.isEmpty(onlineResourceDetail.adInfo) || (adInfoCheckAndGetAdInfo = AdInfoResponse.checkAndGetAdInfo(onlineResourceDetail.adInfo)) == null) {
            return;
        }
        View viewM6498z = AdUtils.m6498z(this.an, onlineResourceDetail.adEid);
        this.ay = viewM6498z;
        if (viewM6498z == null) {
            return;
        }
        com.android.thememanager.ad.download.controller.toq toqVarO1t = AdUtils.o1t(getActivity(), this.ay, adInfoCheckAndGetAdInfo, onlineResourceDetail.adEid, ps(), wtop());
        this.bu = toqVarO1t;
        C1653q.toq(toqVarO1t);
        C2280y c2280y = new C2280y(this.ay);
        this.be = c2280y;
        C1653q.m6526k(c2280y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d9i(View view) {
        if (!com.android.thememanager.basemodule.privacy.x2.zy()) {
            u38j().m6909i(this.f13397m, new toq());
        } else {
            if (com.android.thememanager.basemodule.utils.lvui.kja0(this, this.tlhn)) {
                return;
            }
            alcv();
        }
    }

    private void f26p(OnlineResourceDetail onlineResourceDetail, int dataPart) {
        if ((dataPart & 1) != 0) {
            if ((dataPart & 2) == 0 || TextUtils.isEmpty(onlineResourceDetail.adInfo)) {
                a3dw(onlineResourceDetail.snapshotsUrl, onlineResourceDetail.snapshotAspectRatio, false, onlineResourceDetail.adEid);
            } else {
                a3dw(onlineResourceDetail.snapshotsUrl, onlineResourceDetail.snapshotAspectRatio, true, onlineResourceDetail.adEid);
            }
            wu(onlineResourceDetail);
            lg4k(onlineResourceDetail);
            mla(onlineResourceDetail, false);
        }
        if ((dataPart & 2) != 0) {
            if (!C1807g.zurt()) {
                bf5(onlineResourceDetail);
                if (TextUtils.isEmpty(onlineResourceDetail.adEid) || AdUtils.f9445y.equals(onlineResourceDetail.adEid)) {
                    l7o(onlineResourceDetail);
                } else {
                    d6od(onlineResourceDetail);
                }
            }
            mla(onlineResourceDetail, true);
        }
        if (this.f13395j) {
            cr3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ie(View view) {
        this.ad.ni7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jb9(View view) {
        wtop().jk(requireActivity(), !this.bg.isSelected());
    }

    private void jglj() {
        if (this.bq != null && ps() && getLifecycle().toq().isAtLeast(kja0.zy.CREATED) && !this.bp) {
            this.bp = true;
            this.bq.ld6();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jog(String str, String str2, View view) {
        if (this.ad == null) {
            FullScreenAodPreview fullScreenAodPreview = new FullScreenAodPreview(this.f13397m);
            this.ad = fullScreenAodPreview;
            this.ac.toq(fullScreenAodPreview);
            this.ad.mo8387p(this.f13397m.getWindow().getDecorView().getWidth(), this.f13397m.getWindow().getDecorView().getHeight(), false, false, str, str2);
            this.ad.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.n7h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f13313k.ie(view2);
                }
            });
        }
        this.ad.m8397z(true);
        this.ad.ld6();
        nme("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.xtxy, null);
        com.android.thememanager.detail.theme.view.widget.cdj cdjVar = this.ba;
        if (cdjVar == null || !cdjVar.isShowing()) {
            return;
        }
        this.ba.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(View view) {
        c2();
        wtop().f7l8();
    }

    private void l7o(OnlineResourceDetail onlineResourceDetail) {
        AdInfo adInfoCheckAndGetAdInfo;
        TextView textView;
        TextView textView2;
        if (TextUtils.isEmpty(onlineResourceDetail.adInfo) || (adInfoCheckAndGetAdInfo = AdInfoResponse.checkAndGetAdInfo(onlineResourceDetail.adInfo)) == null) {
            return;
        }
        boolean zM6525h = C1653q.m6525h(adInfoCheckAndGetAdInfo.dspName);
        ViewStub viewStub = (ViewStub) this.an.findViewById(R.id.ad_stub);
        if (viewStub != null) {
            if (zM6525h) {
                viewStub.setLayoutResource(R.layout.element_ad_detail_dsp_banner);
            }
            View viewInflate = viewStub.inflate();
            this.ay = viewInflate;
            View viewFindViewById = viewInflate.findViewById(R.id.ad_info_view);
            ImageView imageView = (ImageView) this.ay.findViewById(R.id.thumbnail);
            AdSubTextView adSubTextView = (AdSubTextView) this.ay.findViewById(R.id.ad_textview);
            TextView textView3 = (TextView) this.ay.findViewById(R.id.download_button);
            if (zM6525h) {
                textView = (TextView) this.ay.findViewById(R.id.ad_title);
                textView2 = (TextView) this.ay.findViewById(R.id.ad_subtitle);
            } else {
                textView = null;
                textView2 = null;
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.aod_round_corner);
            ybb(adInfoCheckAndGetAdInfo, imageView, viewFindViewById);
            C1653q.m6530s(this.f13397m, adInfoCheckAndGetAdInfo, this.ay, imageView, dimensionPixelSize, textView, textView2, null, Collections.singletonMap(C7780k.f100595y9n, C7780k.f100565a98o));
            C2280y c2280y = new C2280y(this.ay);
            this.be = c2280y;
            C1653q.m6526k(c2280y);
            if (ps()) {
                wtop().d2ok();
            }
            com.android.thememanager.ad.download.controller.toq toqVar = new com.android.thememanager.ad.download.controller.toq(textView3, adSubTextView, adInfoCheckAndGetAdInfo, true);
            this.bu = toqVar;
            C1653q.toq(toqVar);
            C6077k.o1t(imageView);
        }
    }

    private void lg4k(OnlineResourceDetail onlineResourceDetail) {
        ThemeOperationButton themeOperationButton = (ThemeOperationButton) this.an.findViewById(R.id.operation_btn);
        this.bl = themeOperationButton;
        themeOperationButton.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13250k.d9i(view);
            }
        });
        xo(0);
        if (!wtop().x2() && onlineResourceDetail.originPrice > onlineResourceDetail.productPrice) {
            TextView textView = (TextView) this.an.findViewById(R.id.origin_price);
            textView.getPaint().setFlags(textView.getPaintFlags() | 16);
            textView.setText(C1815m.toq(this.f13397m, onlineResourceDetail.originPrice));
            textView.setVisibility(0);
        }
        if (com.android.thememanager.basemodule.utils.o1t.m7172k() < 2) {
            View viewFindViewById = this.an.findViewById(R.id.operation_btn_mask);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.f7l8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ki.ae4(view);
                }
            });
            viewFindViewById.setVisibility(0);
            this.bl.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ln(OnlineResourceDetail onlineResourceDetail, View view) {
        wqp(onlineResourceDetail.description);
    }

    private void mkmm() {
        this.in.setVisibility(8);
        this.id.setVisibility(0);
        this.an.setVisibility(8);
    }

    private void mla(OnlineResourceDetail onlineResourceDetail, boolean isOnline) {
        TextView textView = (TextView) this.an.findViewById(R.id.author_component);
        View viewFindViewById = this.an.findViewById(R.id.author_container);
        if (C1807g.zurt()) {
            textView.setVisibility(8);
            viewFindViewById.setVisibility(8);
            return;
        }
        if (TextUtils.isEmpty(onlineResourceDetail.designerName)) {
            textView.setVisibility(8);
            viewFindViewById.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        viewFindViewById.setVisibility(0);
        if (C1807g.zurt()) {
            this.an.findViewById(R.id.find_more).setVisibility(8);
        } else {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13385k.b6(view);
                }
            });
        }
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.author_avatar);
        com.android.thememanager.basemodule.imageloader.x2.m6782y(this.f13397m, onlineResourceDetail.designerIcon, imageView, com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(R.drawable.icon_default_avatar));
        TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.author_name);
        textView2.setSelected(true);
        textView2.setText(onlineResourceDetail.designerName);
        if (isOnline) {
            View viewFindViewById2 = this.an.findViewById(R.id.author_info_container);
            TextView textView3 = (TextView) viewFindViewById2.findViewById(R.id.author_theme_amount);
            Resources resources = getResources();
            int i2 = onlineResourceDetail.productCount;
            textView3.setText(resources.getQuantityString(R.plurals.de_author_theme_amount, i2, Integer.valueOf(i2)));
            viewFindViewById2.setVisibility(0);
            C6077k.fn3e(imageView, viewFindViewById);
            C6077k.m22372p(viewFindViewById, textView2, textView3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void qexj(Pair pair) {
        Object obj;
        if (pair == null || (obj = pair.first) == null) {
            mkmm();
            return;
        }
        this.f13396l = (OnlineResourceDetail) obj;
        int iIntValue = ((Integer) pair.second).intValue();
        zaso();
        this.f9877s = this.f13396l.packId;
        this.bs = true;
        InterfaceC1392k.n.k kVar = this.aj;
        if (kVar != null) {
            kVar.mo5850k();
        }
        this.bb = this.f13396l.updateLogs;
        ydj3();
        f26p(this.f13396l, iIntValue);
        if ((iIntValue & 2) != 0) {
            if (((C2227k) this.f13400t).m28257do() != null) {
                ((AodRecommendListView) this.ax).setListData();
            } else {
                this.ax.refreshData();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void qppo(C1723y c1723y) {
        if (((Boolean) c1723y.m6720k()) != null) {
            cnbm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void rig(AdapterView adapterView, View view, int i2, long j2) {
        z617();
    }

    private void sm() {
        if (this.bq != null && ps() && getLifecycle().toq().isAtLeast(kja0.zy.CREATED)) {
            if (getString(R.string.resource_apply).contentEquals(this.bl.getText())) {
                nme("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.bqr, "aod");
            } else if (getString(R.string.resource_download).contentEquals(this.bl.getText())) {
                nme("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.uyb, "aod");
            } else if (getString(R.string.resource_update).contentEquals(this.bl.getText())) {
                nme("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.mj4s, "aod");
            }
        }
    }

    private RecyclerView.kja0 verb() {
        if (C1807g.m7081r()) {
            return new C2279s(this.f13397m, !C1807g.m7083t(this.f13397m) ? 2 : C1819o.ncyb(this.f13397m) ? 4 : 3);
        }
        return new C2277p(this.f13397m);
    }

    private void wqp(@zy.dd String description) {
        Resource resource = wtop().getResource();
        if (this.ba == null) {
            if (this.bv.findViewById(R.id.preview_container) == null) {
                return;
            }
            com.android.thememanager.detail.theme.view.widget.cdj cdjVar = new com.android.thememanager.detail.theme.view.widget.cdj(this.f13397m, resource.getTitle(), resource.getScore(), description, UIUpdateLog.getUpdateString(this.bb), (this.bv.getBottom() - r1.getBottom()) - 10, true);
            this.ba = cdjVar;
            cdjVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.android.thememanager.module.detail.view.kja0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ki.zi4o();
                }
            });
        }
        this.ba.showAtLocation(this.bv, 80, 0, 0);
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.jrla));
    }

    private void wu(final OnlineResourceDetail onlineResourceDetail) {
        ((TextView) this.an.findViewById(R.id.title)).setText(onlineResourceDetail.name);
        if (TextUtils.isEmpty(onlineResourceDetail.description)) {
            this.an.findViewById(R.id.info_container).setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.an.findViewById(R.id.info);
        textView.setText(onlineResourceDetail.description.trim());
        View viewFindViewById = this.an.findViewById(R.id.more_info);
        if (C1807g.m7083t(getContext())) {
            viewFindViewById.setVisibility(8);
            return;
        }
        textView.setSingleLine();
        textView.setMaxWidth(getContext().getResources().getDimensionPixelSize(R.dimen.de_detail_info_max_width_with_one_button));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        viewFindViewById.setVisibility(0);
        C6077k.f7l8(viewFindViewById);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13284k.ln(onlineResourceDetail, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x3b(View view) {
        erbd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xo(int state) {
        if (this.bl == null) {
            return;
        }
        Resource resource = wtop().getResource();
        if (state == 0) {
            boolean zZy = C2244g.zy(wtop().mo5853k(), resource);
            boolean zM8367g = C2244g.m8367g(wtop().mo5853k(), resource);
            if (wtop().x2()) {
                if (zZy && !zM8367g) {
                    if (ps() && !getString(R.string.resource_apply).contentEquals(this.bl.getText())) {
                        nme("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.bqr, "aod");
                    }
                    this.bl.setText(R.string.resource_apply);
                    if (wtop().oc()) {
                        jbh();
                    }
                } else if (zM8367g) {
                    this.bl.setText(R.string.resource_update);
                } else {
                    if (ps() && !getString(R.string.resource_download).contentEquals(this.bl.getText())) {
                        nme("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.uyb, "aod");
                    }
                    this.bl.setText(R.string.resource_download);
                }
            } else if (this.f13392c != null) {
                this.bl.setText(R.string.de_redeem);
            } else if (this.f13395j) {
                this.bl.setText(R.string.resource_buy);
            } else {
                this.bl.setText(C1815m.toq(this.f13397m, resource.getProductPrice()));
            }
        } else if (state == 2 || state == 3 || state == 4 || state == 6 || state == 7) {
            this.bl.setLoading(true);
        }
        if (com.android.thememanager.basemodule.utils.o1t.m7172k() < 2) {
            this.bl.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void xouc(View view) {
        cp(view, (ViewGroup) view.getParent());
    }

    private void y3() {
        this.an = LayoutInflater.from(getActivity()).inflate(com.android.thememanager.basemodule.utils.zurt.m7261k(R.layout.de_aod_detail_header, R.layout.de_aod_detail_header_elder), this.bv, false);
        StaggeredGridLayoutManager.zy zyVar = new StaggeredGridLayoutManager.zy(-1, -2);
        zyVar.x2(true);
        this.an.setLayoutParams(zyVar);
        wtop().fn3e(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.h
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13259k.qexj((Pair) obj);
            }
        });
        wtop().mcp(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.cdj
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13224k.xo(((Integer) obj).intValue());
            }
        });
        wtop().mo5851h(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.toq
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13350k.cb((ThemeStatus) obj);
            }
        });
        c2();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ybb(com.android.thememanager.basemodule.ad.model.AdInfo r6, android.widget.ImageView r7, android.view.View r8) {
        /*
            r5 = this;
            com.android.thememanager.basemodule.base.k r0 = r5.f13397m
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = r6.dspName
            boolean r1 = com.android.thememanager.ad.C1653q.m6525h(r1)
            if (r1 == 0) goto L16
            r1 = 2131166108(0x7f07039c, float:1.7946452E38)
            float r1 = r0.getDimension(r1)
            goto L1d
        L16:
            r1 = 2131165898(0x7f0702ca, float:1.7946026E38)
            float r1 = r0.getDimension(r1)
        L1d:
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()
            int r2 = r2.widthPixels
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r3
            float r2 = r2 - r1
            float r1 = r6.height
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 == 0) goto L38
            float r6 = r6.width
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L38
            float r1 = r1 / r6
            float r1 = r1 * r2
            goto L3f
        L38:
            r6 = 2131165947(0x7f0702fb, float:1.7946125E38)
            float r1 = r0.getDimension(r6)
        L3f:
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            int r0 = (int) r1
            r6.height = r0
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            int r7 = (int) r2
            r6.width = r7
            if (r8 == 0) goto L55
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            r6.height = r0
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.module.detail.view.ki.ybb(com.android.thememanager.basemodule.ad.model.AdInfo, android.widget.ImageView, android.view.View):void");
    }

    private void ydj3() {
        if (this.ax != null) {
            return;
        }
        AodRecommendListView.C2250k c2250k = new AodRecommendListView.C2250k((C2227k) this.f13400t);
        if (!C1807g.m7081r()) {
            c2250k.setStaggerHolderWidth((C1819o.jk(getActivity()) - (getActivity().getResources().getDimensionPixelSize(R.dimen.stagger_divider) * 6)) / 2);
        }
        IRecommendListView iRecommendListViewBuild = c2250k.setContext(this).setResCode(wtop().mo5853k()).setRefresh(false).setLayoutManagerType(0).setItemDecoration(verb()).setRequest(new C2274g()).setCallBack(new C2276n()).setLayoutManagerSpanCount(brv()).build();
        this.ax = iRecommendListViewBuild;
        iRecommendListViewBuild.addHeaderView(this.an);
        this.bv.addView(this.ax, 0);
        this.ax.getDrawingRect(new Rect());
    }

    private void zaso() {
        this.in.setVisibility(8);
        this.id.setVisibility(8);
        this.an.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zi4o() {
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.zxe));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zt(View view) {
        wtop().gvn7(requireActivity(), !this.as.isSelected());
    }

    public void alcv() {
        if (!wtop().x2()) {
            if (this.f13392c != null) {
                wtop().mo5858y(this.f13392c);
                return;
            } else {
                pnt2();
                return;
            }
        }
        if (C2244g.zy(wtop().mo5853k(), wtop().getResource())) {
            if (C2244g.m8367g(wtop().mo5853k(), wtop().getResource())) {
                xzl(true);
                return;
            }
            if (com.android.thememanager.basemodule.utils.lvui.a9(this.f13397m)) {
                com.android.thememanager.basemodule.utils.lvui.m7124i(this.f13397m);
                return;
            }
            if (!InterfaceC1789q.q28.contains(wtop().mo5853k())) {
                wtop().apply();
                return;
            }
            if (this.bd == null) {
                this.bd = com.android.thememanager.superwallpaper.util.zy.m9516k(this.f13397m, new DialogInterfaceOnClickListenerC2278q());
            }
            if (this.bd.isShowing()) {
                return;
            }
            this.bd.show();
            return;
        }
        int state = wtop().getState();
        if (state == 0) {
            if (wtop().mo5855p() || !C1688q.cdj().o1t()) {
                xzl(false);
                return;
            } else {
                pnt2();
                return;
            }
        }
        if (state == 4) {
            wtop().mo5856q();
        } else if (state == 5) {
            wtop().mo5854n();
        }
    }

    @Override // c8jq.InterfaceC1392k.k
    public void cnbm() {
        if (C2244g.zy(wtop().mo5853k(), wtop().getResource())) {
            this.bq.zurt(new C1795s(wtop().getResource(), C1791k.getAod()).f7l8());
            this.bq.t8r();
            this.bq.ld6();
        }
    }

    public void cp(View anchor, ViewGroup parent) {
        if (this.am == null) {
            C1977k c1977k = new C1977k(getActivity());
            C7177g c7177g = new C7177g(getActivity());
            this.am = c7177g;
            c7177g.x2(c1977k);
            this.am.m26034b(new AdapterView.OnItemClickListener() { // from class: com.android.thememanager.module.detail.view.s
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
                    this.f13342k.rig(adapterView, view, i2, j2);
                }
            });
        }
        if (this.am.isShowing()) {
            return;
        }
        this.am.kja0(anchor, parent);
    }

    protected void cr3() {
        if (C1807g.m7081r()) {
            return;
        }
        if (!wtop().mo5857t()) {
            this.f13397m.setActionBarRightMenu(null);
            return;
        }
        ImageView imageView = new ImageView(getActivity());
        C1812k.m7106k(imageView, R.string.accessibiliy_description_content_more);
        imageView.setBackgroundResource(R.drawable.action_immersion);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13310k.xouc(view);
            }
        });
        this.f13397m.setActionBarRightMenu(imageView);
    }

    @Override // c8jq.InterfaceC1392k.n
    public void ek5k(int count) {
    }

    @Override // c8jq.InterfaceC1392k.k
    /* JADX INFO: renamed from: g */
    public retrofit2.toq<CommonResponse<UIPage>> mo5846g(int randIndex, int cardStart) {
        if (wtop() == null) {
            return null;
        }
        return wtop().ixz(randIndex, cardStart);
    }

    @Override // com.android.thememanager.module.detail.view.ThemeDetailActivity.zy
    public void g1() {
        IRecommendListView iRecommendListView = this.ax;
        if (iRecommendListView != null) {
            iRecommendListView.scrollTop();
        }
    }

    public void gw() {
        if (!wtop().x2()) {
            if (this.f13392c != null) {
                wtop().mo5858y(this.f13392c);
                return;
            } else {
                pnt2();
                return;
            }
        }
        if (C2244g.zy(wtop().mo5853k(), wtop().getResource())) {
            if (C2244g.m8367g(wtop().mo5853k(), wtop().getResource())) {
                xzl(true);
                return;
            }
            if (!InterfaceC1789q.q28.contains(wtop().mo5853k())) {
                wtop().apply();
                return;
            }
            if (this.bd == null) {
                this.bd = com.android.thememanager.superwallpaper.util.zy.m9516k(this.f13397m, new f7l8());
            }
            if (this.bd.isShowing()) {
                return;
            }
            this.bd.show();
            return;
        }
        int state = wtop().getState();
        if (state == 0) {
            if (wtop().mo5855p() || !C1688q.cdj().o1t()) {
                xzl(false);
                return;
            } else {
                pnt2();
                return;
            }
        }
        if (state == 4) {
            wtop().mo5856q();
        } else if (state == 5) {
            wtop().mo5854n();
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.h5.C2069n.k
    public boolean gyi() {
        RewardDialog rewardDialog = this.k0;
        if (rewardDialog != null && rewardDialog.hb()) {
            this.k0 = null;
            return true;
        }
        FullScreenAodPreview fullScreenAodPreview = this.ad;
        if (fullScreenAodPreview == null || fullScreenAodPreview.getWindowToken() == null) {
            return false;
        }
        this.ad.ni7();
        return true;
    }

    @Override // c8jq.InterfaceC1392k.n
    public void jbh() {
        FullScreenAodPreview fullScreenAodPreview;
        RewardDialog rewardDialog = this.k0;
        if ((rewardDialog == null || rewardDialog.getWindowToken() == null) && !this.ar && this.az != null && ps() && !com.android.thememanager.detail.theme.view.widget.ki.zy() && ((fullScreenAodPreview = this.ad) == null || !fullScreenAodPreview.fu4())) {
            this.ar = true;
            this.az.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2275k());
        }
        DetailActionView detailActionView = this.az;
        if (detailActionView != null) {
            com.android.thememanager.detail.theme.view.widget.ki.m7815g(detailActionView, this.f13397m);
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        return this.f13394f;
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    public void nc(String verifyResult) {
        this.k0.setVerifyResult(verifyResult);
        this.k0.m7800l();
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.basemodule.analysis.qrj
    public void nme(String actionType, String trackId, String extra) {
        super.nme(actionType, trackId, extra);
        bmt3(actionType);
    }

    @Override // androidx.fragment.app.Fragment
    @zy.dd
    public View onCreateView(LayoutInflater inflater, @zy.dd ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.de_fragment_aod_detail, container, false);
        this.bv = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.empty_view);
        this.id = viewGroup2;
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13334k.l0(view);
            }
        });
        this.in = this.bv.findViewById(R.id.loading);
        y3();
        return this.bv;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ThemeOperationButton themeOperationButton = this.bl;
        if (themeOperationButton != null) {
            themeOperationButton.zy();
            this.bl = null;
        }
        InterfaceC1694q interfaceC1694q = this.be;
        if (interfaceC1694q != null) {
            AdUtils.jp0y(interfaceC1694q);
        }
        AodPreview aodPreview = this.bq;
        if (aodPreview != null) {
            AodPreview.C2249k c2249k = this.ac;
            if (c2249k != null) {
                c2249k.m8390n(aodPreview);
            }
            this.bq.m8386h();
            this.bq = null;
        }
        FullScreenAodPreview fullScreenAodPreview = this.ad;
        if (fullScreenAodPreview != null) {
            AodPreview.C2249k c2249k2 = this.ac;
            if (c2249k2 != null) {
                c2249k2.m8390n(fullScreenAodPreview);
            }
            this.ad.m8386h();
            this.ad = null;
        }
        AodPreview.C2249k c2249k3 = this.ac;
        if (c2249k3 != null) {
            c2249k3.m8392q();
        }
        this.bp = false;
        ViewGroup viewGroup = this.bv;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.bv = null;
        }
        this.ax = null;
        C1653q.ki(this.bu);
        super.onDestroyView();
    }

    @Override // com.android.thememanager.basemodule.base.toq
    protected void ra(boolean visibleForUser) {
        if (visibleForUser) {
            jglj();
            sm();
            if (this.ay != null && wtop() != null) {
                wtop().d2ok();
            }
            AodPreview aodPreview = this.bq;
            if (aodPreview != null) {
                aodPreview.ki();
            }
            FullScreenAodPreview fullScreenAodPreview = this.ad;
            if (fullScreenAodPreview != null) {
                fullScreenAodPreview.ki();
            }
        } else {
            com.android.thememanager.detail.theme.view.widget.cdj cdjVar = this.ba;
            if (cdjVar != null && cdjVar.isShowing()) {
                this.ba.dismiss();
            }
            AodPreview aodPreview2 = this.bq;
            if (aodPreview2 != null) {
                aodPreview2.cdj();
            }
            FullScreenAodPreview fullScreenAodPreview2 = this.ad;
            if (fullScreenAodPreview2 != null) {
                fullScreenAodPreview2.cdj();
            }
        }
        if (visibleForUser && wtop().oc()) {
            jbh();
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    public void rf(String onlineId, String designerName) {
        RewardDialog rewardDialog = this.k0;
        if (rewardDialog == null || rewardDialog.getWindowToken() == null) {
            this.k0 = new RewardDialog(this.f13397m, onlineId, designerName, wtop());
            ((ViewGroup) this.f13397m.getWindow().getDecorView()).addView(this.k0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setMenuVisibility(boolean visible) {
        super.setMenuVisibility(visible);
        nnh(visible);
    }

    @Override // c8jq.InterfaceC1392k.n
    /* JADX INFO: renamed from: t */
    public void mo5847t(boolean like, int count) {
        this.as.setInfo(like, count > 0 ? com.android.thememanager.basemodule.utils.x2.zy(count) : getString(R.string.de_icon_text_like));
    }

    @Override // c8jq.InterfaceC1392k.n
    /* JADX INFO: renamed from: u */
    public void mo5848u(@zy.dd InterfaceC1392k.n.k callback) {
        this.aj = callback;
        if (callback != null && this.bs) {
            callback.mo5850k();
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n, c8jq.InterfaceC1392k.n
    /* JADX INFO: renamed from: v */
    public void mo5849v(int progress) {
        this.bl.setProgress(progress);
    }

    @Override // c8jq.InterfaceC1392k.n
    public void v0af(boolean favorite) {
        this.bg.setInfo(favorite, null);
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void vg() {
        super.vg();
        this.f13398o = "aod";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.module.detail.view.y9n
    @zy.lvui
    /* JADX INFO: renamed from: z1r, reason: merged with bridge method [inline-methods] */
    public C2227k lk() {
        VM vm = (VM) new C0924e(this).m4420k(C2227k.class);
        this.f13400t = vm;
        ((C2227k) vm).yl25.m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.p
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13331k.qppo((C1723y) obj);
            }
        });
        return (C2227k) this.f13400t;
    }

    @Override // c8jq.InterfaceC1392k.n
    public void zwy(int count) {
    }
}

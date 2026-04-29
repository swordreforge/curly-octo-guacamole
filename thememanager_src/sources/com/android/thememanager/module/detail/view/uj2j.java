package com.android.thememanager.module.detail.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import c8jq.InterfaceC1392k;
import cfr.C1394k;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ad.AdUtils;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.ad.InterfaceC1694q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.ad.model.AdInfoResponse;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.basemodule.views.AdSubTextView;
import com.android.thememanager.basemodule.views.NestViewPager;
import com.android.thememanager.clockmessage.C1875q;
import com.android.thememanager.comment.view.activity.ResourceCommentsActivity;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.detail.theme.model.UIUpdateLog;
import com.android.thememanager.detail.theme.view.C1977k;
import com.android.thememanager.detail.theme.view.widget.DetailActionView;
import com.android.thememanager.detail.theme.view.widget.DetailTopComment;
import com.android.thememanager.detail.theme.view.widget.FollowButton;
import com.android.thememanager.detail.theme.view.widget.ResourceDetailPreview;
import com.android.thememanager.detail.theme.view.widget.RewardDialog;
import com.android.thememanager.detail.theme.view.widget.ThemeOperationButton;
import com.android.thememanager.detail.widget.RewardGuide;
import com.android.thememanager.detail.widget.VerticalFlipView;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.module.detail.util.C2244g;
import com.android.thememanager.module.detail.util.C2247q;
import com.android.thememanager.module.detail.view.ThemeDetailActivity;
import com.android.thememanager.module.detail.view.fu4;
import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.view.ResourceEmptyView;
import i1.C6077k;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import miui.drm.DrmManager;
import miuix.internal.widget.C7177g;
import p001b.InterfaceC1357q;
import y9n.C7780k;

/* JADX INFO: compiled from: ThemeDetailFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class uj2j extends y9n<com.android.thememanager.module.detail.presenter.cdj> implements InterfaceC1392k.q, ThemeDetailActivity.zy, com.android.thememanager.basemodule.analysis.toq, NestViewPager.toq, fu4.InterfaceC2263k {
    public static final String d1cy = "auto_restore";
    public static final String ndjo = "pending_thumbnail";
    public static final String q7k9 = "comment_id";
    public static final String th6 = "auto_comment_edit";
    public static final String xqx = "auto_buy";
    private DetailActionView ac;
    private ViewGroup ad;
    private String aj;
    private View am;
    private boolean an;
    private com.android.thememanager.detail.theme.view.widget.cdj ar;
    private ViewGroup as;
    private DetailActionView ax;
    private FollowButton ay;
    private DetailActionView az;
    private DetailActionView ba;
    private boolean bb;
    private ThemeOperationButton bc;
    private IRecommendListView bd;
    private TextView be;
    private View bg;
    private long bp;
    private DetailActionView bq;
    private ResourceDetailPreview bs;
    private ThemeOperationButton bu;
    private String bv;
    private RewardDialog dy;
    private boolean id;
    private String in;
    private fu4 k0;
    private com.android.thememanager.ad.download.controller.toq k6e;
    private Bundle mjvl;
    private boolean s8y;
    private boolean sk1t;
    private InterfaceC1694q tgs;
    private C7177g tlhn;
    private boolean vb6;
    private View w97r;
    private boolean xk5;
    private List<UIUpdateLog> yl25;
    private InterfaceC1392k.n.k zmmu;
    private int bl = 0;
    private final androidx.lifecycle.jp0y<Intent> hp = new zy();
    private p000a.zy cw14 = new C2298y();
    private p000a.zy xy8 = new C2297s();

    /* JADX INFO: compiled from: ThemeDetailFragment.java */
    class f7l8 implements C1781k.g {
        f7l8() {
        }

        @Override // com.android.thememanager.basemodule.privacy.C1781k.g
        /* JADX INFO: renamed from: k */
        public void mo6371k(boolean agree) {
            if (agree) {
                uj2j uj2jVar = uj2j.this;
                if (com.android.thememanager.basemodule.utils.lvui.kja0(uj2jVar, uj2jVar.xy8)) {
                    return;
                }
                uj2j.this.xy8.mo0k();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.uj2j$g */
    /* JADX INFO: compiled from: ThemeDetailFragment.java */
    class C2292g implements C1781k.g {
        C2292g() {
        }

        @Override // com.android.thememanager.basemodule.privacy.C1781k.g
        /* JADX INFO: renamed from: k */
        public void mo6371k(boolean agree) {
            if (agree) {
                uj2j uj2jVar = uj2j.this;
                if (com.android.thememanager.basemodule.utils.lvui.kja0(uj2jVar, uj2jVar.cw14)) {
                    return;
                }
                uj2j.this.cw14.mo0k();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.uj2j$k */
    /* JADX INFO: compiled from: ThemeDetailFragment.java */
    class C2293k implements IRecommendListView.Request {
        C2293k() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getLoadMoreCall(int cardStart) {
            return uj2j.this.wtop().ebn(cardStart);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getRefreshCall() {
            return uj2j.this.wtop().nsb();
        }
    }

    /* JADX INFO: compiled from: ThemeDetailFragment.java */
    class ld6 extends IRecommendListView.CallBack<UIPage> {
        ld6() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadFail(boolean refresh) {
            if (uj2j.this.bg == null || !com.android.thememanager.util.gc3c.cdj(uj2j.this.getActivity())) {
                return;
            }
            uj2j.this.bg.setPadding(uj2j.this.bg.getPaddingLeft(), uj2j.this.bg.getPaddingTop(), uj2j.this.bg.getPaddingRight(), uj2j.this.getResources().getDimensionPixelSize(R.dimen.de_no_recommendation_padding_bottom));
            super.onRecommendLoadFail(refresh);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadSuccess(boolean refresh) {
            View viewFindViewById;
            if (uj2j.this.bg != null && (viewFindViewById = uj2j.this.bg.findViewById(R.id.detail_recommend_title)) != null) {
                viewFindViewById.setVisibility(0);
            }
            super.onRecommendLoadSuccess(refresh);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        @zy.y9n
        public UIPage onRequestFinish(UIPage apiData, boolean refresh) {
            if (refresh) {
                ((com.android.thememanager.basemodule.base.toq) uj2j.this).f9877s = apiData.uuid;
            }
            return super.onRequestFinish(apiData, refresh);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.uj2j$n */
    /* JADX INFO: compiled from: ThemeDetailFragment.java */
    class C2294n extends RecyclerView.fn3e {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f13358k;

        C2294n(final View val$aodPreviewHint) {
            this.f13358k = val$aodPreviewHint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrolled(@zy.lvui RecyclerView recyclerView, int dx, int dy) {
            uj2j.brv(uj2j.this, dx);
            if (uj2j.this.bl < -20) {
                uj2j.this.bs.removeOnScrollListener(this);
                this.f13358k.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.uj2j$p */
    /* JADX INFO: compiled from: ThemeDetailFragment.java */
    class C2295p implements C1781k.f7l8 {
        C2295p() {
        }

        @Override // com.android.thememanager.basemodule.privacy.C1781k.f7l8
        public void y9n(boolean agree) {
            if (agree) {
                uj2j.this.ab();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.uj2j$q */
    /* JADX INFO: compiled from: ThemeDetailFragment.java */
    class ViewTreeObserverOnGlobalLayoutListenerC2296q implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC2296q() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            uj2j.this.ac.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            uj2j.this.bd.scrollTop();
            ((FrameLayout) uj2j.this.getActivity().getWindow().getDecorView()).addView(new RewardGuide(uj2j.this.getActivity(), uj2j.this.ac));
            com.android.thememanager.detail.theme.view.widget.ki.m7818q();
        }
    }

    /* JADX INFO: compiled from: ThemeDetailFragment.java */
    private static class qrj extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        private int f13361k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f60570toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f60571zy;

        public qrj(Context context) {
            this.f13361k = context.getResources().getDimensionPixelSize(R.dimen.de_recommend_item_edge_padding);
            this.f60570toq = context.getResources().getDimensionPixelSize(R.dimen.de_recommend_item_center_padding);
            this.f60571zy = context.getResources().getDimensionPixelOffset(R.dimen.de_recommend_padding_bottom);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
            if (parent.getChildAdapterPosition(view) <= 0) {
                return;
            }
            if (((StaggeredGridLayoutManager.zy) view.getLayoutParams()).m4926p() == 0) {
                outRect.set(this.f13361k, 0, this.f60570toq, this.f60571zy);
            } else {
                outRect.set(this.f60570toq, 0, this.f13361k, this.f60571zy);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.uj2j$s */
    /* JADX INFO: compiled from: ThemeDetailFragment.java */
    class C2297s implements p000a.zy {
        C2297s() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            uj2j.this.y3();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(uj2j.this.getContext(), false);
            }
        }
    }

    /* JADX INFO: compiled from: ThemeDetailFragment.java */
    class toq implements C1688q.n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f13363k;

        toq(final String val$uri) {
            this.f13363k = val$uri;
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            if (com.android.thememanager.basemodule.utils.mcp.m7138k() && com.android.thememanager.basemodule.utils.mcp.m7139n()) {
                com.android.thememanager.v9.f7l8.f7l8(uj2j.this.getActivity(), this.f13363k);
            } else {
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.online_no_network, 0);
            }
        }
    }

    /* JADX INFO: compiled from: ThemeDetailFragment.java */
    private static class x2 implements InterfaceC1694q {

        /* JADX INFO: renamed from: k */
        private WeakReference<View> f13364k;

        public x2(View adView) {
            this.f13364k = new WeakReference<>(adView);
        }

        @Override // com.android.thememanager.basemodule.ad.InterfaceC1694q
        /* JADX INFO: renamed from: s */
        public void mo6510s(String tagId) {
            View view = this.f13364k.get();
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.uj2j$y */
    /* JADX INFO: compiled from: ThemeDetailFragment.java */
    class C2298y implements p000a.zy {
        C2298y() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            if (uj2j.this.wtop().x2()) {
                if (!C2244g.zy(uj2j.this.wtop().mo5853k(), uj2j.this.wtop().getResource()) || C1819o.lvui()) {
                    return;
                }
                uj2j.this.fupf(true);
                return;
            }
            int state = uj2j.this.wtop().getState();
            if (state == 0) {
                uj2j.this.anw();
            } else if (state == 4) {
                uj2j.this.wtop().mo5856q();
            } else if (state == 5) {
                uj2j.this.wtop().mo5854n();
            }
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(uj2j.this.getContext(), false);
            }
        }
    }

    /* JADX INFO: compiled from: ThemeDetailFragment.java */
    class zy implements androidx.lifecycle.jp0y<Intent> {
        zy() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(Intent intent) {
            if (InterfaceC1357q.f53946uf.equals(intent.getAction())) {
                uj2j.this.s8y = true;
                uj2j.this.mjvl = intent.getExtras();
            }
        }
    }

    private void a3dw() {
        if (!com.android.thememanager.basemodule.privacy.x2.zy()) {
            u38j().m6909i(getActivity(), null);
        } else {
            startActivity(ResourceCommentsActivity.was(getActivity(), wtop().getResource(), this.bb, this.bp));
            nme("COMMENT", m2t(), null);
        }
    }

    private void a7zh() {
        this.am.setVisibility(8);
        this.ad.setVisibility(8);
        this.bg.setVisibility(0);
    }

    private void ae4(OnlineResourceDetail onlineResourceDetail, int dataPart) {
        if ((dataPart & 1) != 0) {
            cb(onlineResourceDetail.snapshotsUrl, onlineResourceDetail.previewPriorityDisplayIdx, onlineResourceDetail.snapshotAspectRatio, onlineResourceDetail.adEid);
            x3b(onlineResourceDetail);
            qexj(onlineResourceDetail);
            jb9(onlineResourceDetail, false);
        }
        if ((dataPart & 2) != 0) {
            qppo(onlineResourceDetail);
            if (TextUtils.isEmpty(onlineResourceDetail.adEid) || AdUtils.f9445y.equals(onlineResourceDetail.adEid)) {
                xouc(onlineResourceDetail);
            } else {
                ln(onlineResourceDetail);
            }
            jb9(onlineResourceDetail, true);
            zt(onlineResourceDetail);
        }
        if (this.f13395j) {
            f26p();
        }
    }

    private void ahb(final OnlineResourceDetail onlineResourceDetail) {
        if (getView() instanceof FrameLayout) {
            this.xk5 = true;
            View viewInflate = getLayoutInflater().inflate(R.layout.de_widget_trance_view, (ViewGroup) null);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.de_widget_door_layout_width);
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.de_widget_door_layout_height);
            FrameLayout frameLayout = (FrameLayout) getView();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset2);
            int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.widget_trance_margin_bottom);
            layoutParams.gravity = 8388693;
            layoutParams.setMargins(0, 0, (int) getResources().getDimension(R.dimen.de_widget_door_ic_margin_end), dimensionPixelOffset3);
            frameLayout.addView(viewInflate, layoutParams);
            C6077k.o1t(viewInflate);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.widget_door_icon);
            String str = com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().qrj() ? onlineResourceDetail.widgetDarkPreview : onlineResourceDetail.widgetPreview;
            if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(onlineResourceDetail.widgetPreview)) {
                str = onlineResourceDetail.widgetPreview;
            }
            com.android.thememanager.basemodule.imageloader.x2.m6780q(getActivity(), str, imageView, R.drawable.ic_widget_door_icon);
            final ArrayMap<String, Object> arrayMapKja0 = C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.ih, "", onlineResourceDetail.packId);
            arrayMapKja0.put("widget_id", onlineResourceDetail.widgetProductId);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.gc3c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13254k.je1q(onlineResourceDetail, arrayMapKja0, view);
                }
            });
            C1708s.f7l8().ld6().cdj(arrayMapKja0);
        }
    }

    private void b3fl(int state) {
        if (this.bc == null || this.bu == null) {
            return;
        }
        Resource resource = wtop().getResource();
        if (state != 0) {
            if (state == 1) {
                this.bc.setLoading(true);
                this.bu.setEnabled(false);
                return;
            }
            if (state != 2 && state != 3) {
                if (state == 4 || state == 6) {
                    if (wtop().x2()) {
                        this.bc.setEnabled(false);
                        this.bu.setLoading(true);
                        return;
                    } else {
                        this.bc.setLoading(true);
                        this.bu.setEnabled(false);
                        return;
                    }
                }
                if (state != 7) {
                    return;
                }
            }
            this.bc.setEnabled(false);
            this.bu.setLoading(true);
            return;
        }
        if (wtop().x2()) {
            if (!C2244g.zy(wtop().mo5853k(), resource) || C2244g.m8367g(wtop().mo5853k(), resource)) {
                this.bc.setVisibility(8);
                if (C2244g.m8367g(wtop().mo5853k(), resource)) {
                    this.bu.setText(R.string.resource_update);
                } else {
                    this.bu.setText(R.string.resource_download);
                }
            } else {
                if (bb()) {
                    this.bc.setVisibility(0);
                    this.bc.setText(R.string.de_mix);
                } else {
                    this.bc.setVisibility(8);
                }
                this.bu.setText(R.string.resource_apply);
                if (wtop().oc()) {
                    jbh();
                }
            }
        } else if (this.f13392c != null) {
            this.bc.setVisibility(8);
            this.bu.setText(R.string.de_redeem);
        } else {
            this.bc.setVisibility(0);
            boolean zM8381s = com.android.thememanager.module.detail.util.zy.m8381s(wtop().mo5853k(), resource);
            DrmManager.TrialLimits trialLimitsLg4k = lg4k();
            if (!zM8381s || trialLimitsLg4k == null || trialLimitsLg4k.endTime <= System.currentTimeMillis()) {
                this.bc.setText(R.string.de_try);
            } else {
                this.bc.setCountDown(trialLimitsLg4k.endTime - System.currentTimeMillis());
            }
            if (this.f13395j) {
                this.bu.setText(R.string.resource_buy);
            } else {
                this.bu.setText(C1815m.toq(getActivity(), resource.getProductPrice()));
            }
        }
        p6(this.bc.getVisibility() != 0);
    }

    private void b6() {
        this.bg = LayoutInflater.from(getActivity()).inflate(com.android.thememanager.basemodule.utils.zurt.m7261k(R.layout.de_online_theme_detail_header, R.layout.de_online_theme_detail_header_elder), this.as, false);
        StaggeredGridLayoutManager.zy zyVar = new StaggeredGridLayoutManager.zy(-1, -2);
        zyVar.x2(true);
        this.bg.setLayoutParams(zyVar);
        wtop().fn3e(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.ltg8
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13302k.c2((Pair) obj);
            }
        });
        wtop().mcp(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.r8s8
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13341k.bmt3((Integer) obj);
            }
        });
        cyg();
    }

    private boolean bb() {
        return !wtop().m8347d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bmt3(Integer num) {
        b3fl(num.intValue());
    }

    static /* synthetic */ int brv(uj2j uj2jVar, int i2) {
        int i3 = uj2jVar.bl + i2;
        uj2jVar.bl = i3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c2(Pair pair) {
        Object obj;
        if (pair == null || (obj = pair.first) == null) {
            ma8k();
            return;
        }
        OnlineResourceDetail onlineResourceDetail = (OnlineResourceDetail) obj;
        int iIntValue = ((Integer) pair.second).intValue();
        a7zh();
        this.f9877s = onlineResourceDetail.packId;
        this.sk1t = true;
        InterfaceC1392k.n.k kVar = this.zmmu;
        if (kVar != null) {
            kVar.mo5850k();
        }
        this.yl25 = onlineResourceDetail.updateLogs;
        d9i();
        ie(onlineResourceDetail);
        ae4(onlineResourceDetail, iIntValue);
        if ((iIntValue & 2) != 0 && com.android.thememanager.basemodule.utils.qrj.m7199q(qrj.toq.THEME_DETAIL)) {
            this.bd.refreshData();
        }
        if (this.bb || this.bp > 0) {
            a3dw();
            this.bb = false;
            this.bp = 0L;
        } else if (this.id) {
            this.id = false;
            pnt2();
        } else if (this.an) {
            this.an = false;
            wtop().mo5852i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void cb(java.util.List<java.lang.String> r11, int r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.module.detail.view.uj2j.cb(java.util.List, int, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cp(OnlineResourceDetail onlineResourceDetail, View view) {
        wkrb(onlineResourceDetail.description);
    }

    private void cyg() {
        this.am.setVisibility(0);
        this.ad.setVisibility(8);
        this.bg.setVisibility(8);
    }

    private void d9i() {
        if (this.bd != null) {
            return;
        }
        IRecommendListView iRecommendListViewBuild = C1394k.m5862q().setContext(this).setResCode(wtop().mo5853k()).setRefresh(false).setLoadMore(!wtop().o1t() && com.android.thememanager.basemodule.utils.qrj.m7199q(qrj.toq.THEME_DETAIL)).setLayoutManagerType(0).setItemDecoration(new qrj(getActivity())).setStaggerHolderWidth((C1819o.jk(getActivity()) - (getActivity().getResources().getDimensionPixelSize(R.dimen.stagger_divider) * 6)) / 2).setRequest(new C2293k()).setCallBack(new ld6()).build();
        this.bd = iRecommendListViewBuild;
        iRecommendListViewBuild.addHeaderView(this.bg);
        this.as.addView(this.bd, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void drpy() {
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.zxe));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fupf(boolean show) {
        boolean z2;
        if (!show) {
            fu4 fu4Var = this.k0;
            if (fu4Var != null) {
                fu4Var.kx3();
                return;
            }
            return;
        }
        if (this.k0 == null) {
            boolean z3 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            for (Integer num : com.android.thememanager.module.detail.util.zy.f13164h.keySet()) {
                String[] strArr = com.android.thememanager.module.detail.util.zy.f13164h.get(num);
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    }
                    if (C1792n.ni7(wtop().getResource(), strArr[i2])) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                if (z2) {
                    int iIntValue = num.intValue();
                    if (iIntValue == 1) {
                        z5 = true;
                    } else if (iIntValue == 2) {
                        z6 = true;
                    } else if (iIntValue == 4) {
                        z7 = true;
                    } else if (iIntValue == 8) {
                        z8 = true;
                    } else if (iIntValue == 16) {
                        z3 = true;
                    } else if (iIntValue == 32) {
                        z9 = true;
                    }
                }
            }
            this.k0 = fu4.zff0(z3, z5, z6, z7, z8, z9);
        }
        fu4 fu4Var2 = this.k0;
        if (fu4Var2 == null || fu4Var2.u38j() == null || !this.k0.u38j().isShowing()) {
            Log.d(C2755a.f16307g, "showMixDialog");
            this.k0.r6ty(getChildFragmentManager(), null);
        }
    }

    private void ie(OnlineResourceDetail onlineResourceDetail) {
        if (!TextUtils.isEmpty(onlineResourceDetail.widgetSubjectId) && C1915g.m7550n() && jog()) {
            ahb(onlineResourceDetail);
        }
    }

    private void jb9(OnlineResourceDetail onlineResourceDetail, boolean isOnline) {
        TextView textView = (TextView) this.bg.findViewById(R.id.author_component);
        View viewFindViewById = this.bg.findViewById(R.id.author_container);
        if (TextUtils.isEmpty(onlineResourceDetail.designerName)) {
            textView.setVisibility(8);
            viewFindViewById.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        viewFindViewById.setVisibility(0);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.yqrt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13406k.xo(view);
            }
        });
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.author_avatar);
        int dimensionPixelSize = viewFindViewById.getResources().getDimensionPixelSize(R.dimen.de_detail_component_author_avatar_size);
        com.android.thememanager.basemodule.imageloader.x2.m6782y(getActivity(), onlineResourceDetail.designerIcon, imageView, com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(R.drawable.icon_default_avatar).x9kr(dimensionPixelSize, dimensionPixelSize).oc(true));
        TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.author_name);
        textView2.setText(onlineResourceDetail.designerName);
        textView2.setSelected(true);
        if (isOnline) {
            this.in = onlineResourceDetail.designerId;
            this.be = (TextView) this.bg.findViewById(R.id.author_info);
            Resources resources = getResources();
            int i2 = onlineResourceDetail.productCount;
            this.aj = resources.getQuantityString(R.plurals.de_author_theme_amount, i2, Integer.valueOf(i2));
            this.ay = (FollowButton) viewFindViewById.findViewById(R.id.author_follow);
            oc(onlineResourceDetail.follow, onlineResourceDetail.fansNum);
            this.ay.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.kcsr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13286k.mkmm(view);
                }
            });
            this.ay.setVisibility(0);
            C6077k.fn3e(imageView, viewFindViewById);
            C6077k.f7l8(this.ay);
            C6077k.m22372p(viewFindViewById, textView2, this.be);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void je1q(OnlineResourceDetail onlineResourceDetail, ArrayMap arrayMap, View view) {
        Intent intent = new Intent(getActivity(), (Class<?>) WidgetListActivity.class);
        intent.putExtra("uuid", onlineResourceDetail.widgetSubjectId);
        intent.putExtra("title", onlineResourceDetail.name);
        startActivity(intent);
        C1708s.f7l8().ld6().ni7(arrayMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jglj(View view) {
        erbd();
    }

    private boolean jog() {
        return (C1807g.gvn7() || C1807g.jk() || (C1807g.ki() <= 4 && C1807g.ki() > 0)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jre(View view) {
        cyg();
        wtop().f7l8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(OnlineResourceDetail onlineResourceDetail, View view) {
        ydj3(onlineResourceDetail.themeBoardLink);
    }

    private void l92(String actionType) {
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
        if ("ATTENTION".equals(actionType) || "DIS_ATTENTION".equals(actionType)) {
            arrayMapM6679k.put("author", this.in);
        }
        if ("APPLY".equals(actionType)) {
            arrayMapM6679k.put("resourceType", strMo5853k);
            Resource resource2 = this.f13393e;
            if (resource2 != null) {
                arrayMapM6679k.put("productId", resource2.getOnlineId());
            }
        }
        C1708s.toq toqVarLd6 = C1708s.f7l8().ld6();
        String strKx3 = kx3();
        Resource resource3 = this.f13393e;
        toqVarLd6.n5r1(actionType, C1706p.n7h(strKx3, resource3 == null ? "" : resource3.getOnlineInfo().getTrackId(), arrayMapM6679k));
    }

    private DrmManager.TrialLimits lg4k() {
        File file = new File(new ResourceResolver(wtop().getResource(), C2082k.zy().m8001n().m10535g(wtop().mo5853k())).getRightsPath());
        if (file.exists()) {
            return DrmManager.getTrialLimits(file);
        }
        return null;
    }

    private void ln(OnlineResourceDetail onlineResourceDetail) {
        AdInfo adInfoCheckAndGetAdInfo;
        if (TextUtils.isEmpty(onlineResourceDetail.adInfo) || (adInfoCheckAndGetAdInfo = AdInfoResponse.checkAndGetAdInfo(onlineResourceDetail.adInfo)) == null) {
            return;
        }
        View viewM6498z = AdUtils.m6498z(this.bg, onlineResourceDetail.adEid);
        this.w97r = viewM6498z;
        if (viewM6498z == null) {
            return;
        }
        com.android.thememanager.ad.download.controller.toq toqVarO1t = AdUtils.o1t(getActivity(), this.w97r, adInfoCheckAndGetAdInfo, onlineResourceDetail.adEid, ps(), wtop());
        this.k6e = toqVarO1t;
        C1653q.toq(toqVarO1t);
        x2 x2Var = new x2(this.w97r);
        this.tgs = x2Var;
        C1653q.m6526k(x2Var);
    }

    private void ma8k() {
        this.am.setVisibility(8);
        this.ad.setVisibility(0);
        this.bg.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mkmm(View view) {
        C1688q.cdj().fti(this.f13397m, new C1688q.n() { // from class: com.android.thememanager.module.detail.view.m4
            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public final void loginSuccess() {
                this.f13306k.zaso();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mq(View view) {
        boolean zO1t = wtop().o1t();
        if (!zO1t && com.android.thememanager.basemodule.utils.lvui.a9(getContext())) {
            com.android.thememanager.basemodule.utils.lvui.m7124i(getActivity());
            return;
        }
        if (!com.android.thememanager.basemodule.privacy.x2.zy() && !zO1t) {
            u38j().m6909i(getActivity(), new C2292g());
        } else if (zO1t || !com.android.thememanager.basemodule.utils.lvui.kja0(this, this.cw14)) {
            this.cw14.mo0k();
        }
    }

    private void p6(boolean oneButton) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        if (oneButton) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.de_detail_title_max_width_with_one_button);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.de_detail_info_max_width_with_one_button);
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.de_detail_title_max_width_with_two_buttons);
            dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.de_detail_info_max_width_with_two_buttons);
        }
        ((TextView) this.bg.findViewById(R.id.title)).setMaxWidth(dimensionPixelSize);
        ((TextView) this.bg.findViewById(R.id.info)).setMaxWidth(dimensionPixelSize2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void py7(AdapterView adapterView, View view, int i2, long j2) {
        z617();
    }

    private void qexj(OnlineResourceDetail onlineResourceDetail) {
        ThemeOperationButton themeOperationButton = (ThemeOperationButton) this.bg.findViewById(R.id.operation_btn_1);
        this.bc = themeOperationButton;
        themeOperationButton.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.v0af
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13371k.mq(view);
            }
        });
        ThemeOperationButton themeOperationButton2 = (ThemeOperationButton) this.bg.findViewById(R.id.operation_btn_2);
        this.bu = themeOperationButton2;
        themeOperationButton2.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.etdu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13246k.xnu(view);
            }
        });
        b3fl(0);
        if (wtop().x2() || onlineResourceDetail.originPrice <= onlineResourceDetail.productPrice) {
            return;
        }
        TextView textView = (TextView) this.bg.findViewById(R.id.origin_price);
        textView.getPaint().setFlags(textView.getPaintFlags() | 16);
        textView.setText(C1815m.toq(getActivity(), onlineResourceDetail.originPrice));
        textView.setVisibility(0);
    }

    private void qppo(final OnlineResourceDetail onlineResourceDetail) {
        View viewFindViewById = this.bg.findViewById(R.id.icon_container);
        DetailActionView detailActionView = (DetailActionView) viewFindViewById.findViewById(R.id.like);
        this.az = detailActionView;
        detailActionView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.bz2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13221k.ybb(view);
            }
        });
        mo5847t(onlineResourceDetail.like, onlineResourceDetail.likeCount.intValue());
        if (TextUtils.isEmpty(onlineResourceDetail.themeBoardLink)) {
            DetailActionView detailActionView2 = (DetailActionView) viewFindViewById.findViewById(R.id.comment);
            this.ba = detailActionView2;
            detailActionView2.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.gbni
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13253k.rig(view);
                }
            });
            this.ba.setVisibility(0);
            ek5k(onlineResourceDetail.commentCount);
        } else {
            C1875q.m7391g().mcp(onlineResourceDetail.packId);
            DetailActionView detailActionView3 = (DetailActionView) viewFindViewById.findViewById(R.id.community);
            this.ax = detailActionView3;
            detailActionView3.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.was
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13376k.l0(onlineResourceDetail, view);
                }
            });
            this.ax.setVisibility(0);
            zwy(onlineResourceDetail.postCount);
        }
        if (C1688q.cdj().jk()) {
            DetailActionView detailActionView4 = this.ax;
            if (detailActionView4 != null) {
                detailActionView4.setVisibility(8);
            }
            DetailActionView detailActionView5 = this.ba;
            if (detailActionView5 != null) {
                detailActionView5.setVisibility(8);
            }
        }
        DetailActionView detailActionView6 = (DetailActionView) viewFindViewById.findViewById(R.id.favorite);
        this.bq = detailActionView6;
        detailActionView6.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.zsr0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13412k.zi4o(view);
            }
        });
        v0af(onlineResourceDetail.collect);
        VerticalFlipView verticalFlipView = (VerticalFlipView) viewFindViewById.findViewById(R.id.share);
        verticalFlipView.toq(com.android.thememanager.detail.theme.util.toq.m7748q());
        if (wtop().zy()) {
            verticalFlipView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.py
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13333k.sm(view);
                }
            });
        } else {
            verticalFlipView.setVisibility(8);
        }
        DetailActionView detailActionView7 = (DetailActionView) viewFindViewById.findViewById(R.id.reward);
        this.ac = detailActionView7;
        if (onlineResourceDetail.productPrice == 0) {
            detailActionView7.setVisibility(0);
        }
        if (wtop().oc()) {
            jbh();
        }
        this.ac.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.i9jn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13267k.jglj(view);
            }
        });
        if (com.android.thememanager.basemodule.utils.o1t.fn3e()) {
            return;
        }
        viewFindViewById.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void rig(View view) {
        a3dw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void sm(View view) {
        if (com.android.thememanager.basemodule.privacy.x2.zy()) {
            e4e();
        } else {
            u38j().m6909i(getActivity(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vymi(C1723y c1723y) {
        Pair pair = (Pair) c1723y.m6720k();
        if (pair != null) {
            oc(((Boolean) pair.first).booleanValue(), ((Integer) pair.second).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wh(int i2) {
        com.android.thememanager.detail.theme.view.widget.cdj cdjVar = this.ar;
        if (cdjVar == null || !cdjVar.isShowing()) {
            return;
        }
        this.ar.dismiss();
    }

    private void wkrb(@zy.dd String description) {
        Resource resource = wtop().getResource();
        if (this.ar == null) {
            com.android.thememanager.detail.theme.view.widget.cdj cdjVar = new com.android.thememanager.detail.theme.view.widget.cdj(getActivity(), resource.getTitle(), resource.getScore(), description, UIUpdateLog.getUpdateString(this.yl25), (this.as.getBottom() - this.bs.getBottom()) - 10, resource.getScore() < 0.0f);
            this.ar = cdjVar;
            cdjVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.android.thememanager.module.detail.view.se
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    uj2j.drpy();
                }
            });
        }
        this.ar.m7814q(resource.getScore() < 0.0f, resource.getScore());
        if (!this.ar.isShowing()) {
            this.ar.showAtLocation(this.as, 80, 0, 0);
        }
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.jrla));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wqp(View view) {
        a3dw();
    }

    private void x3b(final OnlineResourceDetail onlineResourceDetail) {
        ((TextView) this.bg.findViewById(R.id.title)).setText(com.android.thememanager.basemodule.utils.fu4.zy(wtop().getResource(), onlineResourceDetail.name));
        if (TextUtils.isEmpty(onlineResourceDetail.description)) {
            this.bg.findViewById(R.id.info_container).setVisibility(8);
            return;
        }
        ((TextView) this.bg.findViewById(R.id.info)).setText(onlineResourceDetail.description.trim());
        View viewFindViewById = this.bg.findViewById(R.id.more_info);
        C6077k.f7l8(viewFindViewById);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13251k.cp(onlineResourceDetail, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void xnu(View view) {
        boolean zO1t = wtop().o1t();
        if (!com.android.thememanager.basemodule.privacy.x2.zy() && !zO1t) {
            u38j().m6909i(getActivity(), new f7l8());
        } else if (zO1t || !com.android.thememanager.basemodule.utils.lvui.kja0(this, this.xy8)) {
            this.xy8.mo0k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void xo(View view) {
        if (C1781k.toq(bf2.toq.toq())) {
            ab();
        } else {
            ix(true, new C2295p());
        }
    }

    private void xouc(OnlineResourceDetail onlineResourceDetail) {
        AdInfo adInfoCheckAndGetAdInfo;
        ViewStub viewStub;
        if (TextUtils.isEmpty(onlineResourceDetail.adInfo) || (adInfoCheckAndGetAdInfo = AdInfoResponse.checkAndGetAdInfo(onlineResourceDetail.adInfo)) == null || (viewStub = (ViewStub) this.bg.findViewById(R.id.ad_stub)) == null) {
            return;
        }
        if (C1653q.m6525h(adInfoCheckAndGetAdInfo.dspName)) {
            viewStub.setLayoutResource(R.layout.element_ad_detail_dsp_banner);
        }
        View viewInflate = viewStub.inflate();
        this.w97r = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.ad_info_view);
        ImageView imageView = (ImageView) this.w97r.findViewById(R.id.thumbnail);
        TextView textView = (TextView) this.w97r.findViewById(R.id.ad_title);
        TextView textView2 = (TextView) this.w97r.findViewById(R.id.ad_subtitle);
        TextView textView3 = (TextView) this.w97r.findViewById(R.id.download_button);
        AdSubTextView adSubTextView = (AdSubTextView) this.w97r.findViewById(R.id.ad_textview);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.round_corner_default);
        zxa9(adInfoCheckAndGetAdInfo, imageView, viewFindViewById);
        C1653q.m6530s(getActivity(), adInfoCheckAndGetAdInfo, this.w97r, imageView, dimensionPixelSize, textView, textView2, null, Collections.singletonMap(C7780k.f100595y9n, C7780k.f100565a98o));
        if (textView != null && TextUtils.isEmpty(textView.getText())) {
            textView.setVisibility(8);
        }
        x2 x2Var = new x2(this.w97r);
        this.tgs = x2Var;
        C1653q.m6526k(x2Var);
        if (ps()) {
            wtop().d2ok();
        }
        com.android.thememanager.ad.download.controller.toq toqVar = new com.android.thememanager.ad.download.controller.toq(textView3, adSubTextView, adInfoCheckAndGetAdInfo, true);
        this.k6e = toqVar;
        C1653q.toq(toqVar);
        C6077k.o1t(imageView);
        C1812k.toq(imageView, C1653q.x2(adInfoCheckAndGetAdInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3() {
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
            } else if (wtop().o1t() || !com.android.thememanager.basemodule.utils.lvui.a9(getContext())) {
                wtop().apply();
                return;
            } else {
                com.android.thememanager.basemodule.utils.lvui.m7124i(getActivity());
                return;
            }
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ybb(View view) {
        wtop().gvn7(requireActivity(), !this.az.isSelected());
    }

    private void ydj3(String uri) {
        if (com.android.thememanager.util.fti.zy()) {
            C1688q.cdj().fti(getActivity(), new toq(uri));
        } else {
            com.android.thememanager.v9.f7l8.m10168p(getActivity(), this, com.android.thememanager.v9.f7l8.toq(uri, "THEME", "HREF", wtop().getResource().getTitle(), null, m2t()));
        }
        nme("COMMUNITY", m2t(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zaso() {
        wtop().ukdy(!this.ay.toq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zi4o(View view) {
        wtop().jk(requireActivity(), !this.bq.isSelected());
    }

    private void zt(OnlineResourceDetail onlineResourceDetail) {
        if (C1688q.cdj().jk()) {
            return;
        }
        DetailTopComment detailTopComment = (DetailTopComment) this.bg.findViewById(R.id.top_comment);
        detailTopComment.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.sok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13343k.wqp(view);
            }
        });
        ResourceCommentItem resourceCommentItem = onlineResourceDetail.comment;
        if (resourceCommentItem != null) {
            detailTopComment.setInfo(resourceCommentItem.userName, resourceCommentItem.updateTime, resourceCommentItem.score, resourceCommentItem.content, onlineResourceDetail.commentCount);
        } else {
            detailTopComment.setInfo(null, 0L, 0.0f, null, 0);
        }
        this.bg.findViewById(R.id.top_comment_title).setVisibility(0);
        detailTopComment.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void zxa9(com.android.thememanager.basemodule.ad.model.AdInfo r6, android.widget.ImageView r7, android.view.View r8) {
        /*
            r5 = this;
            androidx.fragment.app.q r0 = r5.getActivity()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = r6.dspName
            boolean r1 = com.android.thememanager.ad.C1653q.m6525h(r1)
            if (r1 == 0) goto L18
            r1 = 2131166108(0x7f07039c, float:1.7946452E38)
            float r1 = r0.getDimension(r1)
            goto L1f
        L18:
            r1 = 2131165898(0x7f0702ca, float:1.7946026E38)
            float r1 = r0.getDimension(r1)
        L1f:
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()
            int r2 = r2.widthPixels
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r3
            float r2 = r2 - r1
            float r1 = r6.height
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 == 0) goto L3a
            float r6 = r6.width
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L3a
            float r1 = r1 / r6
            float r1 = r1 * r2
            goto L41
        L3a:
            r6 = 2131165947(0x7f0702fb, float:1.7946125E38)
            float r1 = r0.getDimension(r6)
        L41:
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            int r0 = (int) r1
            r6.height = r0
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            int r7 = (int) r2
            r6.width = r7
            if (r8 == 0) goto L57
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            r6.height = r0
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.module.detail.view.uj2j.zxa9(com.android.thememanager.basemodule.ad.model.AdInfo, android.widget.ImageView, android.view.View):void");
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    public void ab() {
        String str;
        String str2;
        OnlineResourceDetail onlineResourceDetail = this.f13396l;
        String str3 = onlineResourceDetail.designerName;
        if (str3 == null || (str = onlineResourceDetail.designerId) == null || (str2 = onlineResourceDetail.designerMiId) == null) {
            c25();
        } else {
            com.android.thememanager.toq.zurt(this.f13397m, str, str2, str3, 2);
            iz("AUTHOR_WORK", null);
        }
    }

    @Override // c8jq.InterfaceC1392k.q
    public retrofit2.toq<CommonResponse<UIPage>> bap7(int cardStart) {
        if (wtop() == null) {
            return null;
        }
        return wtop().pc(cardStart);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.module.detail.view.y9n
    /* JADX INFO: renamed from: d6od, reason: merged with bridge method [inline-methods] */
    public com.android.thememanager.module.detail.presenter.cdj lk() {
        return (com.android.thememanager.module.detail.presenter.cdj) new C0924e(this).m4420k(com.android.thememanager.module.detail.presenter.cdj.class);
    }

    @Override // c8jq.InterfaceC1392k.n
    public void ek5k(int count) {
        String strZy = count > 0 ? com.android.thememanager.basemodule.utils.x2.zy(count) : getString(R.string.de_icon_text_comment);
        DetailActionView detailActionView = this.ba;
        if (detailActionView != null) {
            detailActionView.setInfo(false, strZy);
        }
        if (count > 0) {
            C1812k.toq(this.ba, getString(R.string.accessibiliy_description_content_comment) + strZy);
        }
    }

    @Override // com.android.thememanager.basemodule.views.NestViewPager.toq
    /* JADX INFO: renamed from: f */
    public boolean mo7321f(int direction) {
        ResourceDetailPreview resourceDetailPreview = this.bs;
        return resourceDetailPreview != null && resourceDetailPreview.canScrollHorizontally(direction);
    }

    protected void f26p() {
        if (getActivity() instanceof AbstractActivityC1717k) {
            if (!wtop().mo5857t()) {
                ((AbstractActivityC1717k) getActivity()).setActionBarRightMenu(null);
                return;
            }
            ImageView imageView = new ImageView(getActivity());
            C1812k.m7106k(imageView, R.string.accessibiliy_description_content_more);
            imageView.setBackgroundResource(R.drawable.action_immersion);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.zkd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13410k.iw(view);
                }
            });
            ((AbstractActivityC1717k) getActivity()).setActionBarRightMenu(imageView);
        }
    }

    @Override // com.android.thememanager.module.detail.view.ThemeDetailActivity.zy
    public void g1() {
        IRecommendListView iRecommendListView = this.bd;
        if (iRecommendListView != null) {
            iRecommendListView.scrollTop();
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.h5.C2069n.k
    public boolean gyi() {
        RewardDialog rewardDialog = this.dy;
        if (rewardDialog != null && rewardDialog.hb()) {
            this.dy = null;
            return true;
        }
        ResourceDetailPreview resourceDetailPreview = this.bs;
        if (resourceDetailPreview != null) {
            return resourceDetailPreview.a9();
        }
        return false;
    }

    public void iw(View anchor) {
        if (this.tlhn == null) {
            C1977k c1977k = new C1977k(anchor.getContext());
            C7177g c7177g = new C7177g(anchor.getContext());
            this.tlhn = c7177g;
            c7177g.x2(c1977k);
            this.tlhn.m26034b(new AdapterView.OnItemClickListener() { // from class: com.android.thememanager.module.detail.view.bwp
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
                    this.f13220k.py7(adapterView, view, i2, j2);
                }
            });
        }
        if (this.tlhn.isShowing()) {
            return;
        }
        this.tlhn.kja0(anchor, (ViewGroup) anchor.getParent());
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void iz(String actionType, String extra) {
        if ("DOWNLOAD".equals(actionType) || "APPLY".equals(actionType)) {
            extra = extra + "&eid=" + C1724k.m6723p().ld6().wallpaper_detail_page_style;
        }
        super.iz(actionType, extra);
    }

    @Override // c8jq.InterfaceC1392k.n
    public void jbh() {
        RewardDialog rewardDialog;
        ResourceDetailPreview resourceDetailPreview;
        if (!this.xk5 && (((rewardDialog = this.dy) == null || rewardDialog.getWindowToken() == null) && !this.vb6 && this.ac != null && ps() && !com.android.thememanager.detail.theme.view.widget.ki.zy() && (resourceDetailPreview = this.bs) != null && !resourceDetailPreview.jp0y())) {
            this.vb6 = true;
            this.ac.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2296q());
        }
        DetailActionView detailActionView = this.ac;
        if (detailActionView != null) {
            com.android.thememanager.detail.theme.view.widget.ki.m7815g(detailActionView, getActivity());
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        return this.f13394f;
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void mete() {
        super.mete();
        ((com.android.thememanager.module.detail.presenter.cdj) this.f13400t).n2t().m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.w831
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13375k.vymi((C1723y) obj);
            }
        });
        com.android.thememanager.basemodule.utils.ni7.m7146k().toq(InterfaceC1357q.f53946uf, this.hp);
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    public void nc(String verifyResult) {
        this.dy.setVerifyResult(verifyResult);
        this.dy.m7800l();
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.basemodule.analysis.qrj
    public void nme(String actionType, String trackId, String extra) {
        super.nme(actionType, trackId, extra);
    }

    @Override // c8jq.InterfaceC1392k.q
    public void oc(boolean follow, int count) {
        FollowButton followButton = this.ay;
        if (followButton != null) {
            followButton.setFollow(follow);
        }
        String quantityString = getResources().getQuantityString(R.plurals.de_author_fans_amount, count, Integer.valueOf(count));
        if (!TextUtils.isEmpty(this.aj)) {
            quantityString = this.aj + " | " + quantityString;
        }
        TextView textView = this.be;
        if (textView != null) {
            textView.setText(quantityString);
            this.be.setTextSize(0, 36.0f);
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 4001 && this.id) {
            this.id = false;
            pnt2();
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@zy.dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wtop().zwy();
    }

    @Override // androidx.fragment.app.Fragment
    @zy.dd
    public View onCreateView(LayoutInflater inflater, @zy.dd ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.de_fragment_online_theme_detail, container, false);
        this.as = viewGroup;
        ResourceEmptyView resourceEmptyView = (ResourceEmptyView) viewGroup.findViewById(R.id.empty_view);
        this.ad = resourceEmptyView;
        resourceEmptyView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.cfr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13225k.jre(view);
            }
        });
        this.am = this.as.findViewById(R.id.loading);
        b6();
        return this.as;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ThemeOperationButton themeOperationButton = this.bc;
        if (themeOperationButton != null) {
            themeOperationButton.zy();
            this.bc = null;
        }
        ThemeOperationButton themeOperationButton2 = this.bu;
        if (themeOperationButton2 != null) {
            themeOperationButton2.zy();
            this.bu = null;
        }
        InterfaceC1694q interfaceC1694q = this.tgs;
        if (interfaceC1694q != null) {
            AdUtils.jp0y(interfaceC1694q);
        }
        com.android.thememanager.detail.theme.view.widget.cdj cdjVar = this.ar;
        if (cdjVar != null && cdjVar.isShowing()) {
            this.ar.dismiss();
        }
        ViewGroup viewGroup = this.as;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.as = null;
        }
        this.bd = null;
        C1653q.ki(this.k6e);
        com.android.thememanager.basemodule.utils.ni7.m7146k().m7147n(InterfaceC1357q.f53946uf, this.hp);
        super.onDestroyView();
    }

    @Override // com.android.thememanager.module.detail.view.y9n, androidx.fragment.app.Fragment
    public void onResume() {
        Bundle bundle;
        OnlineResourceDetail onlineResourceDetail;
        super.onResume();
        if (!this.s8y || (bundle = this.mjvl) == null || (onlineResourceDetail = this.f13396l) == null || !TextUtils.equals(onlineResourceDetail.designerId, bundle.getString(InterfaceC1357q.f53908m2t))) {
            return;
        }
        oc(this.mjvl.getBoolean(InterfaceC1357q.f53897kiv, false), this.mjvl.getInt(InterfaceC1357q.f53971z4t));
        this.s8y = false;
        this.mjvl = null;
    }

    @Override // com.android.thememanager.basemodule.base.toq
    protected void ra(boolean visibleForUser) {
        if (!visibleForUser) {
            com.android.thememanager.detail.theme.view.widget.cdj cdjVar = this.ar;
            if (cdjVar != null && cdjVar.isShowing()) {
                this.ar.dismiss();
            }
        } else if (this.w97r != null && wtop() != null) {
            wtop().d2ok();
        }
        if (visibleForUser && wtop().oc()) {
            jbh();
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    public void rf(String onlineId, String designerName) {
        RewardDialog rewardDialog = this.dy;
        if (rewardDialog == null || rewardDialog.getWindowToken() == null) {
            this.dy = new RewardDialog(getActivity(), onlineId, designerName, wtop());
            ((ViewGroup) getActivity().getWindow().getDecorView()).addView(this.dy);
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
        String strZy = count > 0 ? com.android.thememanager.basemodule.utils.x2.zy(count) : getString(R.string.de_icon_text_like);
        DetailActionView detailActionView = this.az;
        if (detailActionView != null) {
            detailActionView.setInfo(like, strZy);
        }
        if (count > 0) {
            C1812k.toq(this.az, getString(R.string.de_icon_text_like) + strZy);
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected boolean tjz5(C2247q args) {
        return (args.f13156q && (com.android.thememanager.module.detail.util.zy.m8378n() & 8) == 0) ? false : true;
    }

    @Override // c8jq.InterfaceC1392k.n
    /* JADX INFO: renamed from: u */
    public void mo5848u(@zy.dd InterfaceC1392k.n.k callback) {
        this.zmmu = callback;
        if (callback != null && this.sk1t) {
            callback.mo5850k();
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n, c8jq.InterfaceC1392k.n
    /* JADX INFO: renamed from: v */
    public void mo5849v(int progress) {
        if (wtop().x2()) {
            this.bu.setProgress(progress);
            this.bc.setEnabled(false);
        } else {
            this.bc.setProgress(progress);
            this.bu.setEnabled(false);
        }
    }

    @Override // c8jq.InterfaceC1392k.n
    public void v0af(boolean favorite) {
        DetailActionView detailActionView = this.bq;
        if (detailActionView != null) {
            detailActionView.setInfo(favorite, null);
        }
    }

    @Override // com.android.thememanager.module.detail.view.fu4.InterfaceC2263k
    public void vep5(int mixFlag) {
        com.android.thememanager.module.detail.util.zy.m8379p(mixFlag);
        wtop().m28255do();
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void vg() {
        super.vg();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.bb = arguments.getBoolean(th6);
            this.bp = arguments.getLong("comment_id");
            this.f13392c = arguments.getString("redeem_code");
            this.bv = arguments.getString(ndjo);
            this.id = arguments.getBoolean("auto_buy", false);
            this.an = arguments.getBoolean("auto_restore", false);
            arguments.remove("auto_buy");
            arguments.remove("auto_restore");
        }
        this.f13398o = "theme";
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.basemodule.privacy.C1781k.f7l8
    public void y9n(boolean agree) {
    }

    @Override // c8jq.InterfaceC1392k.n
    public void zwy(int count) {
        String strZy = count > 0 ? com.android.thememanager.basemodule.utils.x2.zy(count) : getString(R.string.de_icon_text_discuss);
        DetailActionView detailActionView = this.ax;
        if (detailActionView != null) {
            detailActionView.setInfo(false, strZy);
        }
        if (count > 0) {
            C1812k.toq(this.ax, getString(R.string.de_icon_text_discuss) + strZy);
        }
    }
}

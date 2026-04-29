package com.android.thememanager.module.detail.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.C0924e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import cfr.C1394k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1803e;
import com.android.thememanager.controller.online.t8r;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.detail.theme.model.UIUpdateLog;
import com.android.thememanager.detail.theme.view.widget.DetailActionView;
import com.android.thememanager.detail.theme.view.widget.FollowButton;
import com.android.thememanager.module.detail.WidgetPreviewAdapter;
import com.android.thememanager.network.entity.WidgetPreviewInfo;
import com.android.thememanager.recommend.model.entity.element.DetailRecommendTitleElement;
import com.android.thememanager.recommend.model.entity.element.WidgetIntroductionsElement;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.IRecommendListViewBuilder;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.view.ResourceEmptyView;
import com.google.gson.C4871g;
import i1.C6077k;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.C6227f;
import kotlinx.coroutines.internal.C6692t;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import p001b.InterfaceC1357q;

/* JADX INFO: renamed from: com.android.thememanager.module.detail.view.do, reason: invalid class name */
/* JADX INFO: compiled from: WidgetDetailFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Cdo extends y9n<com.android.thememanager.module.detail.presenter.ki> implements View.OnClickListener {
    private int ac;
    private int ad;
    private boolean am;
    private FrameLayout an;

    @InterfaceC7395n
    private com.android.thememanager.detail.theme.view.widget.cdj as;
    private FollowButton ax;

    @InterfaceC7395n
    private Bundle ay;
    private TextView az;
    private String ba;

    @InterfaceC7396q
    private final String bb = "WidgetDetailFragment";

    @InterfaceC7396q
    private final androidx.lifecycle.jp0y<Intent> be = new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.ixz
        @Override // androidx.lifecycle.jp0y
        public final void toq(Object obj) {
            Cdo.d6od(this.f13277k, (Intent) obj);
        }
    };
    private DetailActionView bg;
    private IRecommendListView bl;
    private ResourceEmptyView bp;

    @InterfaceC7395n
    private Button bq;
    private View bv;
    private View id;

    @InterfaceC7395n
    private ViewPager2 in;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.do$k */
    /* JADX INFO: compiled from: WidgetDetailFragment.kt */
    public static final class C2259k extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        private final int f13235k;

        /* JADX INFO: renamed from: q */
        private final int f13236q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f60554toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f60555zy;

        public C2259k(@InterfaceC7396q Resources res) {
            kotlin.jvm.internal.d2ok.m23075h(res, "res");
            int dimensionPixelSize = res.getDimensionPixelSize(R.dimen.stagger_divider);
            this.f13235k = dimensionPixelSize;
            this.f60554toq = dimensionPixelSize * 2;
            this.f60555zy = res.getDimensionPixelSize(R.dimen.me_widget_top_offset);
            this.f13236q = res.getDimensionPixelSize(R.dimen.me_widget_bottom_offset);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@InterfaceC7396q Rect outRect, @InterfaceC7396q View view, @InterfaceC7396q RecyclerView parent, @InterfaceC7396q RecyclerView.mcp state) {
            kotlin.jvm.internal.d2ok.m23075h(outRect, "outRect");
            kotlin.jvm.internal.d2ok.m23075h(view, "view");
            kotlin.jvm.internal.d2ok.m23075h(parent, "parent");
            kotlin.jvm.internal.d2ok.m23075h(state, "state");
            super.mo4711n(outRect, view, parent, state);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.d2ok.n7h(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int qVar = ((RecyclerView.cdj) layoutParams).toq();
            RecyclerView.AbstractC1060y adapter = parent.getAdapter();
            kotlin.jvm.internal.d2ok.n7h(adapter, "null cannot be cast to non-null type com.android.thememanager.basemodule.views.HeaderAndFooterRecyclerViewAdapter");
            int itemViewType = ((com.android.thememanager.basemodule.views.f7l8) adapter).getItemViewType(qVar) - C6692t.f37242p;
            if (itemViewType == 122 || itemViewType == 125) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                kotlin.jvm.internal.d2ok.n7h(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
                if (((StaggeredGridLayoutManager.zy) layoutParams2).m4926p() == 0) {
                    outRect.set(this.f60554toq, this.f60555zy, this.f13235k, this.f13236q);
                } else {
                    outRect.set(this.f13235k, this.f60555zy, this.f60554toq, this.f13236q);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.do$q */
    /* JADX INFO: compiled from: WidgetDetailFragment.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nWidgetDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetDetailFragment.kt\ncom/android/thememanager/module/detail/view/WidgetDetailFragment$initRecommendListView$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,602:1\n1864#2,3:603\n*S KotlinDebug\n*F\n+ 1 WidgetDetailFragment.kt\ncom/android/thememanager/module/detail/view/WidgetDetailFragment$initRecommendListView$2\n*L\n453#1:603,3\n*E\n"})
    public static final class C2260q extends IRecommendListView.CallBack<UIPage> {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ List<WidgetPreviewInfo> f60556toq;

        C2260q(List<WidgetPreviewInfo> list) {
            this.f60556toq = list;
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onParseUICardFinish(@InterfaceC7395n List<UIElement> list, boolean z2) {
            if (Cdo.this.getContext() == null || list == null || !z2) {
                return;
            }
            IRecommendListView iRecommendListView = Cdo.this.bl;
            if (iRecommendListView == null) {
                kotlin.jvm.internal.d2ok.n5r1("mRecommendListView");
                iRecommendListView = null;
            }
            DetailRecommendTitleElement detailRecommendTitleElement = new DetailRecommendTitleElement(iRecommendListView.getResources().getString(R.string.detail_recommend_title));
            int i2 = 0;
            list.add(0, detailRecommendTitleElement);
            for (Object obj : this.f60556toq) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.ni7.lrht();
                }
                list.add(i2, new WidgetIntroductionsElement((WidgetPreviewInfo) obj));
                i2 = i3;
            }
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendListScroll(@InterfaceC7395n IRecommendListView iRecommendListView, @InterfaceC7395n RecyclerView recyclerView, int i2, int i3) {
            Cdo.this.ad += i3;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.do$toq */
    /* JADX INFO: compiled from: WidgetDetailFragment.kt */
    public static final class toq implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ TextView f13239q;

        toq(TextView textView) {
            this.f13239q = textView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View view = Cdo.this.id;
            View view2 = null;
            if (view == null) {
                kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
                view = null;
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            View view3 = Cdo.this.id;
            if (view3 == null) {
                kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
            } else {
                view2 = view3;
            }
            Cdo.this.ac = this.f13239q.getBottom() + view2.getTop();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.do$zy */
    /* JADX INFO: compiled from: WidgetDetailFragment.kt */
    public static final class zy implements IRecommendListView.Request {
        zy() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        @InterfaceC7396q
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getLoadMoreCall(int i2) {
            return Cdo.this.wtop().m28258do(i2);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        @InterfaceC7396q
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getRefreshCall() {
            return Cdo.this.wtop().ukdy();
        }
    }

    public Cdo() {
        this.f13398o = "widget_suit";
    }

    private final void a3dw(OnlineResourceDetail onlineResourceDetail) {
        int i2 = onlineResourceDetail.productPrice;
        if (i2 == 100) {
            Button button = this.bq;
            kotlin.jvm.internal.d2ok.qrj(button);
            button.setText(getResources().getQuantityString(R.plurals.pay_mibi, 1, "1"));
        } else if (i2 % 100 == 0) {
            Button button2 = this.bq;
            kotlin.jvm.internal.d2ok.qrj(button2);
            button2.setText(getResources().getQuantityString(R.plurals.pay_mibi, 0, Integer.valueOf(onlineResourceDetail.productPrice / 100)));
        } else {
            String str = new DecimalFormat("0.00").format(((double) onlineResourceDetail.productPrice) / ((double) 100));
            kotlin.jvm.internal.d2ok.kja0(str, "format(...)");
            Button button3 = this.bq;
            kotlin.jvm.internal.d2ok.qrj(button3);
            button3.setText(getResources().getQuantityString(R.plurals.pay_mibi, 0, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void alcv(Cdo this$0, OnlineResourceDetail onlineThemeDetail, View view) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        kotlin.jvm.internal.d2ok.m23075h(onlineThemeDetail, "$onlineThemeDetail");
        Resource resource = this$0.wtop().getResource();
        FrameLayout frameLayout = null;
        if (this$0.as == null) {
            FrameLayout frameLayout2 = this$0.an;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.d2ok.n5r1("root");
                frameLayout2 = null;
            }
            int bottom = frameLayout2.getBottom();
            kotlin.jvm.internal.d2ok.qrj(this$0.in);
            this$0.as = new com.android.thememanager.detail.theme.view.widget.cdj(this$0.getActivity(), resource.getTitle(), 0.0f, onlineThemeDetail.description, UIUpdateLog.getUpdateString(onlineThemeDetail.updateLogs), (bottom - r3.getBottom()) - 10, true);
        }
        com.android.thememanager.detail.theme.view.widget.cdj cdjVar = this$0.as;
        kotlin.jvm.internal.d2ok.qrj(cdjVar);
        if (cdjVar.isShowing()) {
            return;
        }
        com.android.thememanager.detail.theme.view.widget.cdj cdjVar2 = this$0.as;
        kotlin.jvm.internal.d2ok.qrj(cdjVar2);
        FrameLayout frameLayout3 = this$0.an;
        if (frameLayout3 == null) {
            kotlin.jvm.internal.d2ok.n5r1("root");
        } else {
            frameLayout = frameLayout3;
        }
        cdjVar2.showAtLocation(frameLayout, 80, 0, 0);
    }

    private final void bf5(OnlineResourceDetail onlineResourceDetail) {
        View view = this.id;
        if (view == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
            view = null;
        }
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.vp2);
        this.in = viewPager2;
        kotlin.jvm.internal.d2ok.qrj(viewPager2);
        viewPager2.setOffscreenPageLimit(1);
        WidgetPreviewAdapter widgetPreviewAdapter = new WidgetPreviewAdapter(this);
        List<WidgetPreviewInfo> widgetPreviewInfos = onlineResourceDetail.widgetPreviewInfos;
        kotlin.jvm.internal.d2ok.kja0(widgetPreviewInfos, "widgetPreviewInfos");
        widgetPreviewAdapter.lvui(widgetPreviewInfos);
        ViewPager2 viewPager22 = this.in;
        kotlin.jvm.internal.d2ok.qrj(viewPager22);
        viewPager22.setAdapter(widgetPreviewAdapter);
        ViewPager2 viewPager23 = this.in;
        kotlin.jvm.internal.d2ok.qrj(viewPager23);
        viewPager23.setPageTransformer(new etdu.zy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void brv(Cdo this$0, Pair pair) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        IRecommendListView iRecommendListView = null;
        if ((pair != null ? (OnlineResourceDetail) pair.first : null) == null) {
            this$0.f26p();
            return;
        }
        this$0.ydj3();
        Object first = pair.first;
        kotlin.jvm.internal.d2ok.kja0(first, "first");
        OnlineResourceDetail onlineResourceDetail = (OnlineResourceDetail) first;
        List<WidgetPreviewInfo> descriptionPics = onlineResourceDetail.descriptionPics;
        kotlin.jvm.internal.d2ok.kja0(descriptionPics, "descriptionPics");
        this$0.z1r(descriptionPics);
        this$0.bf5(onlineResourceDetail);
        this$0.l7o(onlineResourceDetail);
        IRecommendListView iRecommendListView2 = this$0.bl;
        if (iRecommendListView2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mRecommendListView");
        } else {
            iRecommendListView = iRecommendListView2;
        }
        iRecommendListView.refreshData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cjaj(final Cdo this$0, View view) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        if (C1781k.toq(bf2.toq.toq())) {
            this$0.ab();
        } else {
            this$0.ix(true, new C1781k.f7l8() { // from class: com.android.thememanager.module.detail.view.wx16
                @Override // com.android.thememanager.basemodule.privacy.C1781k.f7l8
                public final void y9n(boolean z2) {
                    Cdo.eu(this.f13380k, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cr3(Cdo this$0, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        if (i2 == 0) {
            OnlineResourceDetail mOnlineDetail = this$0.f13396l;
            if (!mOnlineDetail.bought && mOnlineDetail.productPrice != 0) {
                kotlin.jvm.internal.d2ok.kja0(mOnlineDetail, "mOnlineDetail");
                this$0.a3dw(mOnlineDetail);
                return;
            } else {
                Button button = this$0.bq;
                kotlin.jvm.internal.d2ok.qrj(button);
                button.setText(this$0.getResources().getString(R.string.use_now));
                return;
            }
        }
        if (i2 == 3) {
            Button button2 = this$0.bq;
            if (button2 == null) {
                return;
            }
            button2.setText(this$0.getResources().getString(R.string.paying));
            return;
        }
        if (i2 != 8) {
            return;
        }
        Button button3 = this$0.bq;
        if (button3 != null) {
            button3.setText(this$0.getResources().getString(R.string.use_now));
        }
        ActivityC0891q activityC0891qRequireActivity = this$0.requireActivity();
        kotlin.jvm.internal.d2ok.kja0(activityC0891qRequireActivity, "requireActivity(...)");
        this$0.koj(activityC0891qRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d6od(Cdo this$0, Intent intent) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        if (kotlin.jvm.internal.d2ok.f7l8(InterfaceC1357q.f53946uf, intent.getAction())) {
            this$0.am = true;
            this$0.ay = intent.getExtras();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eu(Cdo this$0, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        if (z2) {
            this$0.ab();
        }
    }

    private final void f26p() {
        View view = this.bv;
        View view2 = null;
        if (view == null) {
            kotlin.jvm.internal.d2ok.n5r1("mLoadingView");
            view = null;
        }
        com.android.thememanager.util.bek6.m9613g(view);
        ResourceEmptyView resourceEmptyView = this.bp;
        if (resourceEmptyView == null) {
            kotlin.jvm.internal.d2ok.n5r1("mEmptyView");
            resourceEmptyView = null;
        }
        com.android.thememanager.util.bek6.x2(resourceEmptyView);
        View view3 = this.id;
        if (view3 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
        } else {
            view2 = view3;
        }
        com.android.thememanager.util.bek6.m9613g(view2);
    }

    private final void gw(final OnlineResourceDetail onlineResourceDetail) {
        View view = this.id;
        View view2 = null;
        if (view == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
            view = null;
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        View view3 = this.id;
        if (view3 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
            view3 = null;
        }
        view3.getViewTreeObserver().addOnGlobalLayoutListener(new toq(textView));
        textView.setText(com.android.thememanager.basemodule.utils.fu4.zy(wtop().getResource(), onlineResourceDetail.name));
        if (TextUtils.isEmpty(onlineResourceDetail.description)) {
            View view4 = this.id;
            if (view4 == null) {
                kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
            } else {
                view2 = view4;
            }
            view2.findViewById(R.id.info_container).setVisibility(8);
            return;
        }
        View view5 = this.id;
        if (view5 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
            view5 = null;
        }
        View viewFindViewById = view5.findViewById(R.id.info);
        kotlin.jvm.internal.d2ok.n7h(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        String description = onlineResourceDetail.description;
        kotlin.jvm.internal.d2ok.kja0(description, "description");
        ((TextView) viewFindViewById).setText(kotlin.text.fti.l92(description).toString());
        View view6 = this.id;
        if (view6 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
        } else {
            view2 = view6;
        }
        View viewFindViewById2 = view2.findViewById(R.id.more_info);
        C6077k.f7l8(viewFindViewById2);
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.ktq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                Cdo.alcv(this.f13297k, onlineResourceDetail, view7);
            }
        });
    }

    private final void koj(Context context) {
        OnlineResourceDetail onlineResourceDetailT8iq = ((com.android.thememanager.module.detail.presenter.ki) this.f13400t).t8iq();
        Bundle arguments = getArguments();
        context.startActivity(C1803e.m7035g(onlineResourceDetailT8iq.name, onlineResourceDetailT8iq.productId, arguments != null ? arguments.getBoolean(jz5.f13283q) : false));
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        C1708s.toq toqVarLd6 = C1708s.f7l8().ld6();
        ActivityC0891q activityC0891qRequireActivity = requireActivity();
        kotlin.jvm.internal.d2ok.n7h(activityC0891qRequireActivity, "null cannot be cast to non-null type com.android.thememanager.module.detail.view.WidgetDetailActivity");
        toqVarLd6.zurt(C1706p.n7h(((WidgetDetailActivity) activityC0891qRequireActivity).yz(), ((com.android.thememanager.module.detail.presenter.ki) this.f13400t).gyi(), C1706p.ki(arrayMapM6679k)));
    }

    private final void l7o(final OnlineResourceDetail onlineResourceDetail) {
        gw(onlineResourceDetail);
        oei(onlineResourceDetail);
        View view = this.id;
        FrameLayout frameLayout = null;
        if (view == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.favorite);
        kotlin.jvm.internal.d2ok.kja0(viewFindViewById, "findViewById(...)");
        DetailActionView detailActionView = (DetailActionView) viewFindViewById;
        this.bg = detailActionView;
        if (detailActionView == null) {
            kotlin.jvm.internal.d2ok.n5r1("mActionFavorite");
            detailActionView = null;
        }
        detailActionView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.cv06
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Cdo.mla(this.f13227k, view2);
            }
        });
        v0af(onlineResourceDetail.collect);
        View viewInflate = getLayoutInflater().inflate(R.layout.widget_buy_button, (ViewGroup) null, false);
        kotlin.jvm.internal.d2ok.kja0(viewInflate, "inflate(...)");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this.bq = (Button) viewInflate.findViewById(R.id.buy);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.widget_buy_button_margin_bottom);
        FrameLayout frameLayout2 = this.an;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("root");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.addView(viewInflate, layoutParams);
        Button button = this.bq;
        kotlin.jvm.internal.d2ok.qrj(button);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.h7am
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Cdo.wu(onlineResourceDetail, this, view2);
            }
        });
        C6077k.m22369i(this.bq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lg4k(Cdo this$0, C1723y c1723y) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        C6227f c6227f = (C6227f) c1723y.m6720k();
        if (c6227f != null) {
            this$0.oc(((Boolean) c6227f.getFirst()).booleanValue(), ((Number) c6227f.getSecond()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mla(Cdo this$0, View view) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        com.android.thememanager.module.detail.presenter.ki kiVarWtop = this$0.wtop();
        ActivityC0891q activityC0891qRequireActivity = this$0.requireActivity();
        DetailActionView detailActionView = this$0.bg;
        if (detailActionView == null) {
            kotlin.jvm.internal.d2ok.n5r1("mActionFavorite");
            detailActionView = null;
        }
        kiVarWtop.jk(activityC0891qRequireActivity, !detailActionView.isSelected());
    }

    private final void oc(boolean z2, int i2) {
        FollowButton followButton = this.ax;
        TextView textView = null;
        if (followButton == null) {
            kotlin.jvm.internal.d2ok.n5r1("mFollowButton");
            followButton = null;
        }
        followButton.setFollow(z2);
        String quantityString = getResources().getQuantityString(R.plurals.de_author_fans_amount, i2, Integer.valueOf(i2));
        kotlin.jvm.internal.d2ok.kja0(quantityString, "getQuantityString(...)");
        String str = this.ba;
        if (str == null) {
            kotlin.jvm.internal.d2ok.n5r1("mAuthorThemeAmount");
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            String str2 = this.ba;
            if (str2 == null) {
                kotlin.jvm.internal.d2ok.n5r1("mAuthorThemeAmount");
                str2 = null;
            }
            sb.append(str2);
            sb.append(" | ");
            sb.append(quantityString);
            quantityString = sb.toString();
        }
        TextView textView2 = this.az;
        if (textView2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mAuthorInfoView");
            textView2 = null;
        }
        textView2.setText(quantityString);
        TextView textView3 = this.az;
        if (textView3 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mAuthorInfoView");
        } else {
            textView = textView3;
        }
        textView.setTextSize(0, 36.0f);
    }

    private final void oei(OnlineResourceDetail onlineResourceDetail) {
        View view = this.id;
        TextView textView = null;
        if (view == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
            view = null;
        }
        TextView textView2 = (TextView) view.findViewById(R.id.author_component);
        View view2 = this.id;
        if (view2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
            view2 = null;
        }
        View viewFindViewById = view2.findViewById(R.id.author_container);
        if (TextUtils.isEmpty(onlineResourceDetail.designerName)) {
            textView2.setVisibility(8);
            viewFindViewById.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        viewFindViewById.setVisibility(0);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.vep5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Cdo.cjaj(this.f13372k, view3);
            }
        });
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.author_avatar);
        int dimensionPixelSize = viewFindViewById.getResources().getDimensionPixelSize(R.dimen.de_detail_component_author_avatar_size);
        com.android.thememanager.basemodule.imageloader.x2.m6782y(getActivity(), onlineResourceDetail.designerIcon, imageView, com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(R.drawable.icon_default_avatar).x9kr(dimensionPixelSize, dimensionPixelSize).oc(true));
        TextView textView3 = (TextView) viewFindViewById.findViewById(R.id.author_name);
        textView3.setSelected(true);
        textView3.setText(onlineResourceDetail.designerName);
        View view3 = this.id;
        if (view3 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
            view3 = null;
        }
        View viewFindViewById2 = view3.findViewById(R.id.author_info);
        kotlin.jvm.internal.d2ok.kja0(viewFindViewById2, "findViewById(...)");
        this.az = (TextView) viewFindViewById2;
        Resources resources = getResources();
        int i2 = onlineResourceDetail.productCount;
        String quantityString = resources.getQuantityString(R.plurals.de_author_theme_amount, i2, Integer.valueOf(i2));
        kotlin.jvm.internal.d2ok.kja0(quantityString, "getQuantityString(...)");
        this.ba = quantityString;
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.author_follow);
        kotlin.jvm.internal.d2ok.kja0(viewFindViewById3, "findViewById(...)");
        this.ax = (FollowButton) viewFindViewById3;
        oc(onlineResourceDetail.follow, onlineResourceDetail.fansNum);
        FollowButton followButton = this.ax;
        if (followButton == null) {
            kotlin.jvm.internal.d2ok.n5r1("mFollowButton");
            followButton = null;
        }
        followButton.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.mbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                Cdo.s31(this.f13307k, view4);
            }
        });
        FollowButton followButton2 = this.ax;
        if (followButton2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mFollowButton");
            followButton2 = null;
        }
        followButton2.setVisibility(0);
        C6077k.fn3e(imageView, viewFindViewById);
        FollowButton followButton3 = this.ax;
        if (followButton3 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mFollowButton");
            followButton3 = null;
        }
        C6077k.f7l8(followButton3);
        View[] viewArr = new View[2];
        viewArr[0] = textView3;
        TextView textView4 = this.az;
        if (textView4 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mAuthorInfoView");
        } else {
            textView = textView4;
        }
        viewArr[1] = textView;
        C6077k.m22372p(viewFindViewById, viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void owi(Cdo this$0) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        com.android.thememanager.module.detail.presenter.ki kiVar = (com.android.thememanager.module.detail.presenter.ki) this$0.f13400t;
        FollowButton followButton = this$0.ax;
        if (followButton == null) {
            kotlin.jvm.internal.d2ok.n5r1("mFollowButton");
            followButton = null;
        }
        kiVar.ixz(!followButton.toq());
    }

    private final void qppo() {
        ResourceEmptyView resourceEmptyView = this.bp;
        View view = null;
        if (resourceEmptyView == null) {
            kotlin.jvm.internal.d2ok.n5r1("mEmptyView");
            resourceEmptyView = null;
        }
        com.android.thememanager.util.bek6.m9613g(resourceEmptyView);
        View view2 = this.bv;
        if (view2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mLoadingView");
            view2 = null;
        }
        com.android.thememanager.util.bek6.x2(view2);
        View view3 = this.id;
        if (view3 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
        } else {
            view = view3;
        }
        com.android.thememanager.util.bek6.m9613g(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s31(final Cdo this$0, View view) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        C1688q.cdj().fti(this$0.f13397m, new C1688q.n() { // from class: com.android.thememanager.module.detail.view.bek6
            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public final void loginSuccess() {
                Cdo.owi(this.f13217k);
            }
        });
    }

    private final void verb() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getActivity());
        FrameLayout frameLayout = this.an;
        View view = null;
        if (frameLayout == null) {
            kotlin.jvm.internal.d2ok.n5r1("root");
            frameLayout = null;
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.widget_detail_header_layout, (ViewGroup) frameLayout, false);
        kotlin.jvm.internal.d2ok.kja0(viewInflate, "inflate(...)");
        this.id = viewInflate;
        StaggeredGridLayoutManager.zy zyVar = new StaggeredGridLayoutManager.zy(-1, -2);
        zyVar.x2(true);
        View view2 = this.id;
        if (view2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
        } else {
            view = view2;
        }
        view.setLayoutParams(zyVar);
        ((com.android.thememanager.module.detail.presenter.ki) this.f13400t).fn3e(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.yl
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                Cdo.brv(this.f13405k, (Pair) obj);
            }
        });
        ((com.android.thememanager.module.detail.presenter.ki) this.f13400t).mcp(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.uc
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                Cdo.cr3(this.f13353k, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wu(OnlineResourceDetail onlineThemeDetail, final Cdo this$0, View view) {
        kotlin.jvm.internal.d2ok.m23075h(onlineThemeDetail, "$onlineThemeDetail");
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        if (onlineThemeDetail.bought || onlineThemeDetail.productPrice == 0) {
            Context context = view.getContext();
            kotlin.jvm.internal.d2ok.kja0(context, "getContext(...)");
            this$0.koj(context);
        } else if (com.android.thememanager.basemodule.privacy.x2.zy()) {
            this$0.pnt2();
        } else {
            this$0.u38j().m6909i(this$0.getActivity(), new C1781k.g() { // from class: com.android.thememanager.module.detail.view.jbh
                @Override // com.android.thememanager.basemodule.privacy.C1781k.g
                /* JADX INFO: renamed from: k */
                public final void mo6371k(boolean z2) {
                    Cdo.y3(this.f13279k, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(Cdo this$0, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        if (z2) {
            this$0.pnt2();
        }
    }

    private final void ydj3() {
        View view = this.bv;
        View view2 = null;
        if (view == null) {
            kotlin.jvm.internal.d2ok.n5r1("mLoadingView");
            view = null;
        }
        com.android.thememanager.util.bek6.m9613g(view);
        ResourceEmptyView resourceEmptyView = this.bp;
        if (resourceEmptyView == null) {
            kotlin.jvm.internal.d2ok.n5r1("mEmptyView");
            resourceEmptyView = null;
        }
        com.android.thememanager.util.bek6.m9613g(resourceEmptyView);
        View view3 = this.id;
        if (view3 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
        } else {
            view2 = view3;
        }
        com.android.thememanager.util.bek6.x2(view2);
    }

    private final void z1r(List<WidgetPreviewInfo> list) {
        IRecommendListViewBuilder cardDivider = C1394k.m5862q().setContext(this).setResCode(wtop().mo5853k()).setRefresh(false).setLayoutManagerType(0).setCardDivider(false);
        Resources resources = getResources();
        kotlin.jvm.internal.d2ok.kja0(resources, "getResources(...)");
        IRecommendListView iRecommendListViewBuild = cardDivider.setItemDecoration(new C2259k(resources)).setRequest(new zy()).setCallBack(new C2260q(list)).build();
        kotlin.jvm.internal.d2ok.kja0(iRecommendListViewBuild, "build(...)");
        this.bl = iRecommendListViewBuild;
        IRecommendListView iRecommendListView = null;
        if (iRecommendListViewBuild == null) {
            kotlin.jvm.internal.d2ok.n5r1("mRecommendListView");
            iRecommendListViewBuild = null;
        }
        View view = this.id;
        if (view == null) {
            kotlin.jvm.internal.d2ok.n5r1("mHeaderView");
            view = null;
        }
        iRecommendListViewBuild.addHeaderView(view);
        FrameLayout frameLayout = this.an;
        if (frameLayout == null) {
            kotlin.jvm.internal.d2ok.n5r1("root");
            frameLayout = null;
        }
        IRecommendListView iRecommendListView2 = this.bl;
        if (iRecommendListView2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mRecommendListView");
        } else {
            iRecommendListView = iRecommendListView2;
        }
        frameLayout.addView(iRecommendListView, 0);
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    public void ab() {
        AbstractActivityC1717k mActivity = this.f13397m;
        kotlin.jvm.internal.d2ok.kja0(mActivity, "mActivity");
        OnlineResourceDetail onlineResourceDetail = this.f13396l;
        com.android.thememanager.toq.zurt(mActivity, onlineResourceDetail.designerId, onlineResourceDetail.designerMiId, onlineResourceDetail.designerName, 1);
        iz("AUTHOR_WORK", null);
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void iz(@InterfaceC7395n String str, @InterfaceC7395n String str2) {
        if (!kotlin.jvm.internal.d2ok.f7l8("BUY", str) && !kotlin.jvm.internal.d2ok.f7l8("BUY_SUCCESS", str)) {
            super.iz(str, str2);
            return;
        }
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        kotlin.jvm.internal.d2ok.kja0(arrayMapM6679k, "createArrayMap(...)");
        arrayMapM6679k.put(com.android.thememanager.basemodule.analysis.toq.dxr2, Integer.valueOf(this.f13396l.productPrice));
        arrayMapM6679k.put(com.android.thememanager.basemodule.analysis.toq.ip4r, com.android.thememanager.basemodule.analysis.toq.ptq);
        String str3 = this.f13394f;
        if (str3 == null) {
            str3 = this.f13399r;
        }
        nme(str, str3, new C4871g().o1t(arrayMapM6679k));
    }

    @Override // com.android.thememanager.basemodule.base.toq
    @InterfaceC7396q
    public String kx3() {
        return com.android.thememanager.basemodule.analysis.toq.zuh;
    }

    @Override // com.android.thememanager.basemodule.base.toq
    @InterfaceC7395n
    public String m2t() {
        return this.f13394f;
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected void mete() {
        super.mete();
        ((com.android.thememanager.module.detail.presenter.ki) this.f13400t).ebn().m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.b3e
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                Cdo.lg4k(this.f13216k, (C1723y) obj);
            }
        });
        com.android.thememanager.basemodule.utils.ni7.m7146k().toq(InterfaceC1357q.f53946uf, this.be);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@InterfaceC7396q View v2) {
        kotlin.jvm.internal.d2ok.m23075h(v2, "v");
        if (v2.getId() == R.id.empty_view) {
            qppo();
            ((com.android.thememanager.module.detail.presenter.ki) this.f13400t).f7l8();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC7396q
    public View onCreateView(@InterfaceC7396q LayoutInflater inflater, @InterfaceC7395n ViewGroup viewGroup, @InterfaceC7395n Bundle bundle) {
        kotlin.jvm.internal.d2ok.m23075h(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_widget_detail_info, viewGroup, false);
        kotlin.jvm.internal.d2ok.n7h(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        this.an = frameLayout;
        if (frameLayout == null) {
            kotlin.jvm.internal.d2ok.n5r1("root");
            frameLayout = null;
        }
        View viewFindViewById = frameLayout.findViewById(R.id.empty_view);
        kotlin.jvm.internal.d2ok.kja0(viewFindViewById, "findViewById(...)");
        ResourceEmptyView resourceEmptyView = (ResourceEmptyView) viewFindViewById;
        this.bp = resourceEmptyView;
        if (resourceEmptyView == null) {
            kotlin.jvm.internal.d2ok.n5r1("mEmptyView");
            resourceEmptyView = null;
        }
        resourceEmptyView.setOnClickListener(this);
        FrameLayout frameLayout2 = this.an;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("root");
            frameLayout2 = null;
        }
        View viewFindViewById2 = frameLayout2.findViewById(R.id.loading);
        kotlin.jvm.internal.d2ok.kja0(viewFindViewById2, "findViewById(...)");
        this.bv = viewFindViewById2;
        if (viewFindViewById2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mLoadingView");
            viewFindViewById2 = null;
        }
        viewFindViewById2.setVisibility(0);
        verb();
        C1708s.f7l8().ld6().cdj(C1706p.n7h(kx3(), this.f13394f, com.android.thememanager.basemodule.analysis.zy.m6679k()));
        FrameLayout frameLayout3 = this.an;
        if (frameLayout3 != null) {
            return frameLayout3;
        }
        kotlin.jvm.internal.d2ok.n5r1("root");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        com.android.thememanager.basemodule.utils.ni7.m7146k().m7147n(InterfaceC1357q.f53946uf, this.be);
        super.onDestroyView();
    }

    @Override // com.android.thememanager.module.detail.view.y9n, androidx.fragment.app.Fragment
    public void onResume() {
        Bundle bundle;
        OnlineResourceDetail onlineResourceDetail;
        super.onResume();
        if (!this.am || (bundle = this.ay) == null || (onlineResourceDetail = this.f13396l) == null) {
            return;
        }
        String str = onlineResourceDetail.designerId;
        kotlin.jvm.internal.d2ok.qrj(bundle);
        if (TextUtils.equals(str, bundle.getString(InterfaceC1357q.f53908m2t))) {
            Bundle bundle2 = this.ay;
            kotlin.jvm.internal.d2ok.qrj(bundle2);
            boolean z2 = bundle2.getBoolean(InterfaceC1357q.f53897kiv, false);
            Bundle bundle3 = this.ay;
            kotlin.jvm.internal.d2ok.qrj(bundle3);
            oc(z2, bundle3.getInt(InterfaceC1357q.f53971z4t));
            this.am = false;
            this.ay = null;
        }
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    public void pnt2() {
        if (com.android.thememanager.basemodule.utils.o1t.fu4()) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.personalize_second_space_not_support_buy_widget, 0);
            return;
        }
        ((com.android.thememanager.module.detail.presenter.ki) this.f13400t).vep5();
        ActivityC0891q activityC0891qRequireActivity = requireActivity();
        kotlin.jvm.internal.d2ok.n7h(activityC0891qRequireActivity, "null cannot be cast to non-null type com.android.thememanager.basemodule.base.AbstractBaseActivity");
        new com.android.thememanager.controller.online.t8r((AbstractActivityC1717k) activityC0891qRequireActivity, ((com.android.thememanager.module.detail.presenter.ki) this.f13400t).mo8337u(), this.f13400t).fu4(((com.android.thememanager.module.detail.presenter.ki) this.f13400t).z4(), this.f13398o, t8r.EnumC1934g.SINGLE);
    }

    @Override // c8jq.InterfaceC1392k.n
    public void v0af(boolean z2) {
        DetailActionView detailActionView = this.bg;
        if (detailActionView == null) {
            kotlin.jvm.internal.d2ok.n5r1("mActionFavorite");
            detailActionView = null;
        }
        detailActionView.setInfo(z2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.module.detail.view.y9n
    @InterfaceC7396q
    /* JADX INFO: renamed from: zah1, reason: merged with bridge method [inline-methods] */
    public com.android.thememanager.module.detail.presenter.ki lk() {
        VM mViewModel = (VM) new C0924e(this).m4420k(com.android.thememanager.module.detail.presenter.ki.class);
        this.f13400t = mViewModel;
        this.f13398o = "widget_suit";
        kotlin.jvm.internal.d2ok.kja0(mViewModel, "mViewModel");
        return (com.android.thememanager.module.detail.presenter.ki) mViewModel;
    }
}

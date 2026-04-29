package com.android.thememanager.module.detail.view;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0924e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.module.detail.presenter.C2226h;
import com.android.thememanager.module.detail.presenter.C2231q;
import com.android.thememanager.module.detail.util.C2247q;
import com.android.thememanager.recommend.view.listview.C2365g;
import com.android.thememanager.recommend.view.listview.C2367n;
import com.android.thememanager.recommend.view.listview.decoration.C2362k;
import com.android.thememanager.recommend.view.listview.viewmodel.C2449k;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIPage;
import miuix.appcompat.app.ki;

/* JADX INFO: renamed from: com.android.thememanager.module.detail.view.t */
/* JADX INFO: compiled from: IconsDetailFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2290t extends ikck {
    private static final int hp = 1;
    private static final int mjvl = 0;
    private miuix.appcompat.app.ki k6e;
    protected C2449k xk5;
    private int vb6 = com.android.thememanager.basemodule.network.theme.toq.toq();
    private final DialogInterface.OnClickListener s8y = new DialogInterface.OnClickListener() { // from class: com.android.thememanager.module.detail.view.wvg
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f13379k.ahb(dialogInterface, i2);
        }
    };

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.t$k */
    /* JADX INFO: compiled from: IconsDetailFragment.java */
    class k extends IRecommendListView.CallBack<UIPage> {
        k() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadFail(boolean refresh) {
            C2290t c2290t = C2290t.this;
            if (c2290t.bp == null || !C1819o.eqxt(c2290t.getActivity())) {
                return;
            }
            View view = C2290t.this.bp;
            view.setPadding(view.getPaddingLeft(), C2290t.this.bp.getPaddingTop(), C2290t.this.bp.getPaddingRight(), C2290t.this.getResources().getDimensionPixelSize(R.dimen.de_no_recommendation_padding_bottom));
            super.onRecommendLoadFail(refresh);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadSuccess(boolean refresh) {
            View viewFindViewById;
            View view = C2290t.this.bp;
            if (view != null && (viewFindViewById = view.findViewById(R.id.detail_recommend_title)) != null) {
                viewFindViewById.setVisibility(0);
            }
            super.onRecommendLoadSuccess(refresh);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        @zy.y9n
        public UIPage onRequestFinish(UIPage apiData, boolean refresh) {
            if (refresh) {
                ((com.android.thememanager.basemodule.base.toq) C2290t.this).f9877s = apiData.uuid;
            }
            return super.onRequestFinish(apiData, refresh);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.t$toq */
    /* JADX INFO: compiled from: IconsDetailFragment.java */
    class toq implements IRecommendListView.Request {
        toq() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getLoadMoreCall(int cardStart) {
            return C2290t.this.wtop().wx16(C2290t.this.vb6, cardStart);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getRefreshCall() {
            C2290t.this.vb6 = com.android.thememanager.basemodule.network.theme.toq.toq();
            return C2290t.this.wtop().mo28256do(C2290t.this.vb6);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.t$zy */
    /* JADX INFO: compiled from: IconsDetailFragment.java */
    private static class zy extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        private int f13346k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f60567toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f60568zy;

        public zy(Context context) {
            this.f13346k = context.getResources().getDimensionPixelSize(R.dimen.de_recommend_icon_item_edge_padding);
            this.f60567toq = context.getResources().getDimensionPixelSize(R.dimen.de_recommend_icon_item_center_padding);
            this.f60568zy = context.getResources().getDimensionPixelSize(R.dimen.de_recommend_icon_item_bottom_padding);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
            if (parent.getChildAdapterPosition(view) < 1) {
                return;
            }
            if (((StaggeredGridLayoutManager.zy) view.getLayoutParams()).m4926p() == 0) {
                outRect.set(this.f13346k, 0, this.f60567toq, this.f60568zy);
            } else {
                outRect.set(this.f60567toq, 0, this.f13346k, this.f60568zy);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ahb(DialogInterface dialogInterface, int i2) {
        d8wk(i2 == 0 ? com.android.thememanager.basemodule.analysis.toq.l8l : com.android.thememanager.basemodule.analysis.toq.z4zy, null);
        if (i2 == 1) {
            Resource resourceZy = this.f13393e;
            if (!com.android.thememanager.basemodule.utils.kja0.qrj(resourceZy.getParentResources())) {
                resourceZy = C1792n.zy(this.f13393e.getParentResources().get(0), C1791k.getInstance("theme"));
            }
            if (resourceZy.getSubResource("wallpaper") != null) {
                ((C2226h) this.f13400t).y9n(false, false, true);
                return;
            }
        }
        ((C2226h) this.f13400t).y9n(false, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fupf(C1723y c1723y) {
        if (c1723y.m6720k() == null) {
            return;
        }
        if (this.k6e == null) {
            this.k6e = new ki.C6947k(requireActivity()).zurt(R.array.apply_icon_choices, this.s8y).mcp(android.R.string.cancel, null).m25037g();
        }
        if (!this.k6e.isShowing()) {
            this.k6e.show();
        }
        nme("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.bic, null);
    }

    private int iw() {
        if (C1807g.lvui()) {
            return C1819o.ncyb(this.f13397m) ? 6 : 4;
        }
        if (!C1807g.zurt() || C1807g.m7083t(this.f13397m)) {
            return C1819o.ncyb(this.f13397m) ? 4 : 3;
        }
        return 2;
    }

    private int ma8k() {
        return C1807g.m7081r() ? 2 : 0;
    }

    private int wkrb() {
        if (C1807g.m7081r()) {
            return ((((C1807g.lvui() && C1819o.dd(getActivity())) ? C1819o.wvg(getActivity(), true) : C1819o.fti(getActivity())) - ((iw() - 1) * bf2.toq.toq().getResources().getDimensionPixelSize(R.dimen.pad_theme_thumb_blank_center))) - (bf2.toq.toq().getResources().getDimensionPixelSize(R.dimen.pad_detail_recommend_list_edge) * 2)) / iw();
        }
        return (C1819o.jk(getActivity()) - (getActivity().getResources().getDimensionPixelSize(R.dimen.stagger_divider) * 6)) / 2;
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    @zy.lvui
    /* JADX INFO: renamed from: a7zh, reason: merged with bridge method [inline-methods] */
    public C2231q lk() {
        C2231q c2231q = (C2231q) new C0924e(this).m4420k(C2231q.class);
        c2231q.yl25.m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.o1t
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13329k.fupf((C1723y) obj);
            }
        });
        return c2231q;
    }

    protected C2367n b3fl() {
        return C1807g.m7081r() ? new C2365g() : new C2367n();
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void brv(OnlineResourceDetail onlineResourceDetail) {
        if (C1807g.m7081r()) {
            return;
        }
        super.brv(onlineResourceDetail);
        this.bp.findViewById(R.id.comment).setVisibility(8);
        this.bp.findViewById(R.id.share).setVisibility(8);
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void cr3(OnlineResourceDetail onlineResourceDetail) {
        if (C1807g.m7081r()) {
            return;
        }
        super.cr3(onlineResourceDetail);
    }

    protected RecyclerView.kja0 cyg() {
        return C1807g.m7081r() ? new C2362k(getContext(), iw(), wkrb(), C1819o.fti(getActivity()), this.f13398o, getActivity().getResources().getDimensionPixelSize(R.dimen.pad_detail_recommend_list_edge)) : new zy(getActivity());
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void l7o(OnlineResourceDetail onlineResourceDetail, boolean isOnline) {
        if (C1807g.m7081r()) {
            return;
        }
        super.l7o(onlineResourceDetail, isOnline);
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void mla(OnlineResourceDetail onlineResourceDetail) {
        TextView textView = (TextView) this.bp.findViewById(R.id.title);
        if (textView != null) {
            textView.setText(com.android.thememanager.basemodule.utils.fu4.zy(wtop().getResource(), onlineResourceDetail.name));
        }
        View viewFindViewById = this.bp.findViewById(R.id.info_container);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        if (C1807g.m7081r()) {
            return;
        }
        TextView textView2 = (TextView) this.bp.findViewById(R.id.info);
        Integer num = onlineResourceDetail.adaptedIconsCount;
        if (num == null || num.intValue() <= 0) {
            this.bp.findViewById(R.id.info_container).setVisibility(8);
            return;
        }
        textView2.setText(getResources().getQuantityString(R.plurals.de_icon_count, onlineResourceDetail.adaptedIconsCount.intValue(), onlineResourceDetail.adaptedIconsCount));
        textView2.setTypeface(null, 1);
        textView2.setTextColor(getResources().getColor(R.color.de_detail_icon_count));
        Drawable drawable = getResources().getDrawable(R.drawable.de_icon_count);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.de_icon_count_compound_drawable_size);
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        textView2.setCompoundDrawablesRelative(drawable, null, null, null);
        textView2.setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.de_icon_count_compound_drawable_padding));
    }

    @Override // com.android.thememanager.module.detail.view.ikck, androidx.fragment.app.Fragment
    public void onDestroyView() {
        miuix.appcompat.app.ki kiVar = this.k6e;
        if (kiVar != null && kiVar.isShowing()) {
            this.k6e.n7h();
            this.k6e = null;
        }
        super.onDestroyView();
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void qppo(OnlineResourceDetail onlineResourceDetail) {
    }

    @Override // com.android.thememanager.module.detail.view.y9n
    protected boolean tjz5(C2247q params) {
        return true;
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void wu(OnlineResourceDetail onlineResourceDetail) {
    }

    @Override // com.android.thememanager.module.detail.view.ikck
    protected void ydj3() {
        View viewFindViewById;
        this.xk5 = (C2449k) new C0924e(this).m4420k(C2449k.class);
        if (C1807g.m7081r() && this.xk5.a9() && (viewFindViewById = this.bp.findViewById(R.id.detail_recommend_title)) != null) {
            viewFindViewById.setVisibility(0);
        }
        this.xk5.vyq("icons");
        if (this.bv == null) {
            C2367n c2367nB3fl = b3fl();
            if (c2367nB3fl instanceof C2365g) {
                ((C2365g) c2367nB3fl).mcp(this.xk5).setLayoutManagerSpanCount(iw());
            }
            IRecommendListView iRecommendListViewBuild = c2367nB3fl.setContext(this).setResCode(wtop().mo5853k()).setRefresh(false).setLayoutManagerType(ma8k()).setItemDecoration(cyg()).setStaggerHolderWidth(wkrb()).setRequest(new toq()).setCallBack(new k()).build();
            this.bv = iRecommendListViewBuild;
            iRecommendListViewBuild.addHeaderView(this.bp);
            this.bb.addView(this.bv, 0);
        }
        if (C1807g.m7081r()) {
            if (this.xk5.a9()) {
                return;
            }
            this.bv.refreshData();
        } else if (wtop().zurt()) {
            this.bv.refreshData();
        }
    }
}

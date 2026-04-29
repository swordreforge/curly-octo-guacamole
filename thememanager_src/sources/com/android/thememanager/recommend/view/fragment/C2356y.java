package com.android.thememanager.recommend.view.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.kja0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.views.InterfaceC1870y;
import com.android.thememanager.recommend.presenter.RecommendSearchPresenter;
import com.android.thememanager.recommend.view.listview.C2367n;
import com.android.thememanager.recommend.view.widget.ThemeFilterContainer;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.google.gson.kja0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mub.InterfaceC7396q;
import org.json.JSONException;
import org.json.JSONObject;
import p001b.InterfaceC1357q;
import w831.InterfaceC7729k;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.y */
/* JADX INFO: compiled from: RecommendSearchFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2356y extends com.android.thememanager.basemodule.base.f7l8<InterfaceC7729k.k> implements ThemeFilterContainer.toq, InterfaceC7729k.toq, InterfaceC1870y {
    protected static final String as = "search_key";
    private static final String ax = "2";
    private static final String az = "1";
    private static final String ba = "1";
    private static final String bg = "0";
    private static final String bq = "3";

    /* JADX INFO: renamed from: a */
    private ThemeFilterContainer f13680a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private String[] f60658ab;
    private String an;

    /* JADX INFO: renamed from: b */
    private View f13681b;
    private String[] bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private String f60659bo;
    private String[] bp;
    private String bv;

    /* JADX INFO: renamed from: c */
    private ViewGroup f13682c;

    /* JADX INFO: renamed from: d */
    private String f13683d;

    /* JADX INFO: renamed from: e */
    private LinearLayout f13684e;

    /* JADX INFO: renamed from: f */
    private ViewGroup f13685f;
    private int id;

    /* JADX INFO: renamed from: j */
    private LinearLayout f13686j;

    /* JADX INFO: renamed from: l */
    private RecommendSearchPresenter f13687l;

    /* JADX INFO: renamed from: m */
    private TextView f13688m;

    /* JADX INFO: renamed from: o */
    private LinearLayout f13689o;

    /* JADX INFO: renamed from: v */
    private String f13692v;

    /* JADX INFO: renamed from: w */
    private String f13693w;

    /* JADX INFO: renamed from: x */
    protected IRecommendListView f13694x;

    /* JADX INFO: renamed from: r */
    private int[] f13690r = {6, 9, 12, 15};

    /* JADX INFO: renamed from: u */
    private Map<String, String[]> f13691u = new HashMap();
    private int in = Integer.MAX_VALUE;
    private boolean bl = false;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.y$k */
    /* JADX INFO: compiled from: RecommendSearchFragment.java */
    class k extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f13695k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f13697q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f60660toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ int f60661zy;

        k(final int val$columns, final int val$firstTopPadding, final int val$verticalPadding, final int val$horizontalPadding) {
            this.f13695k = val$columns;
            this.f60660toq = val$firstTopPadding;
            this.f60661zy = val$verticalPadding;
            this.f13697q = val$horizontalPadding;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@InterfaceC7396q @lvui Rect outRect, @InterfaceC7396q @lvui View view, @InterfaceC7396q @lvui RecyclerView parent, @InterfaceC7396q @lvui RecyclerView.mcp state) {
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            ViewGroup.LayoutParams layoutParams = parent.getChildViewHolder(view).itemView.getLayoutParams();
            int i2 = this.f13695k;
            outRect.top = childAdapterPosition < i2 ? this.f60660toq : this.f60661zy;
            outRect.bottom = this.f60661zy;
            if (layoutParams instanceof StaggeredGridLayoutManager.zy) {
                int iM4926p = ((StaggeredGridLayoutManager.zy) layoutParams).m4926p();
                outRect.right = iM4926p == this.f13695k + (-1) ? this.f13697q * 2 : this.f13697q;
                outRect.left = iM4926p == 0 ? this.f13697q * 2 : this.f13697q;
            } else {
                outRect.right = childAdapterPosition % i2 == i2 + (-1) ? this.f13697q * 2 : this.f13697q;
                int i3 = childAdapterPosition % i2;
                int i4 = this.f13697q;
                if (i3 == 0) {
                    i4 *= 2;
                }
                outRect.left = i4;
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.y$q */
    /* JADX INFO: compiled from: RecommendSearchFragment.java */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C2356y.this.ob();
            C2356y.this.pnt2();
            C2356y.this.f13694x.refreshData();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.y$toq */
    /* JADX INFO: compiled from: RecommendSearchFragment.java */
    class toq extends IRecommendListView.CallBack<UIPage> {
        toq() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onParseUICardFinish(List<UIElement> uiElements, boolean refresh) {
            C2356y.this.cn02(uiElements, refresh);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendListScroll(IRecommendListView listView, RecyclerView recyclerView, int dx, int dy) {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadFail(boolean refresh) {
            C2356y.this.kbj();
            if (!mcp.m7139n() && C2356y.this.f13694x.getElementSize() == 0) {
                C2356y.this.xblq();
                return;
            }
            if (C2356y.this.f13694x.getElementSize() == 0) {
                if (!refresh) {
                    C2356y.this.xblq();
                    return;
                }
                C2356y.this.f13686j.setVisibility(0);
                C2356y.this.f13688m.setVisibility(0);
                C2356y.this.f13689o.setVisibility(8);
            }
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadSuccess(boolean refresh) {
            C2356y.this.f13686j.setVisibility(8);
            C2356y.this.kbj();
            if (refresh) {
                C2356y.this.f13694x.scrollTop();
            }
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public UIPage onRequestFinish(UIPage apiData, boolean refresh) {
            return C2356y.this.ovdh(apiData, refresh);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.y$zy */
    /* JADX INFO: compiled from: RecommendSearchFragment.java */
    class zy implements IRecommendListView.Request {
        zy() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart) {
            return ((InterfaceC7729k.k) C2356y.this.kiv()).getLoadMoreCall(cardStart);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<kja0>> getRefreshCall() {
            return ((InterfaceC7729k.k) C2356y.this.kiv()).getRefreshCall();
        }
    }

    private RecyclerView.kja0 bqie() {
        if (p029m.zy.toq(this.f60659bo)) {
            return null;
        }
        String str = this.f60659bo;
        str.hashCode();
        int i2 = 2;
        if (!str.equals("widget_suit") && !str.equals("largeicons")) {
            i2 = 0;
        }
        int i3 = i2;
        if (i3 == 0) {
            return null;
        }
        return new k(i3, getContext().getResources().getDimensionPixelOffset(R.dimen.large_icon_search_item_decoration_first_row_top_padding), getContext().getResources().getDimensionPixelOffset(R.dimen.large_icon_search_item_decoration_vertical_padding), getContext().getResources().getDimensionPixelOffset(R.dimen.large_icon_search_item_decoration_horizontal_padding));
    }

    private int f1bi() {
        return ("largeicons".equals(this.f60659bo) || "widget_suit".equals(this.f60659bo)) ? 0 : 1;
    }

    public static C2356y g0ad(String listUrl, String searchKey, String resourceCode) {
        C2356y c2356y = new C2356y();
        Bundle bundle = new Bundle();
        bundle.putString(InterfaceC1357q.f53973zp, listUrl);
        bundle.putString(as, searchKey);
        bundle.putString("resource_code", resourceCode);
        c2356y.setArguments(bundle);
        return c2356y;
    }

    private void kq2f() {
        if (this.f13682c == null) {
            ViewGroup viewGroupM7337k = new com.android.thememanager.basemodule.views.ld6().m7337k((ViewStub) this.f13685f.findViewById(R.id.reload_stub), 2);
            this.f13682c = viewGroupM7337k;
            viewGroupM7337k.findViewById(R.id.local_entry).setVisibility(8);
            this.f13682c.setOnClickListener(new q());
        }
    }

    private void mj() {
        if (ps() && getLifecycle().toq().isAtLeast(kja0.zy.CREATED) && !this.bl) {
            this.bl = true;
            pnt2();
            this.f13694x.refreshData();
        }
    }

    private void r6ty() {
        this.f60658ab = getResources().getStringArray(R.array.search_sort_list);
        this.bb = getResources().getStringArray(R.array.search_price_list);
        String str = this.f60659bo;
        str.hashCode();
        switch (str) {
            case "widget_suit":
                zff0();
                break;
            case "fonts":
                yp31();
                break;
            case "wallpaper":
                this.f13691u.put("0", this.f60658ab);
                break;
            default:
                this.f13691u.put("0", this.f60658ab);
                this.f13691u.put("1", this.bb);
                break;
        }
    }

    private void yp31() {
        String[] strArr = new String[this.f13690r.length + 3];
        this.bp = strArr;
        strArr[0] = getResources().getString(R.string.search_price_name);
        this.bp[1] = getResources().getString(R.string.search_price_no_limit);
        this.bp[2] = getResources().getString(R.string.search_price_free);
        String string = getResources().getString(R.string.resource_price_unit);
        for (int i2 = 0; i2 < this.f13690r.length; i2++) {
            this.bp[i2 + 3] = this.f13690r[i2] + string;
        }
        this.f13691u.put("0", this.f60658ab);
        this.f13691u.put("1", this.bp);
    }

    private void zff0() {
        int[] iArr = {3, 6, 9, 12};
        String[] strArr = new String[6];
        strArr[0] = getResources().getString(R.string.search_price_name);
        strArr[1] = getResources().getString(R.string.search_price_no_limit);
        String string = getResources().getString(R.string.resource_price_unit);
        for (int i2 = 0; i2 < 4; i2++) {
            strArr[i2 + 2] = iArr[i2] + string;
        }
        this.f13691u.put("1", strArr);
        this.f13691u.put("0", this.f60658ab);
    }

    protected void btvn(ViewGroup rootView) {
        this.f13694x = gb().build();
        l05(rootView);
    }

    public void cn02(List<UIElement> uiElements, boolean refresh) {
    }

    public void cyoe(String key) {
        if (getResources().getString(R.string.search_sort_synthesize).equals(key)) {
            this.f13693w = "2";
            this.bv = key;
            return;
        }
        if (getResources().getString(R.string.search_sort_news).equals(key)) {
            this.bv = key;
            this.f13693w = "1";
            return;
        }
        if (getResources().getString(R.string.search_sort_top).equals(key)) {
            this.bv = key;
            this.f13693w = "3";
            return;
        }
        if (getResources().getString(R.string.search_price_no_limit).equals(key)) {
            this.an = key;
            this.id = 0;
            this.in = Integer.MAX_VALUE;
            return;
        }
        if (getResources().getString(R.string.search_price_free).equals(key)) {
            this.an = key;
            this.id = 0;
            this.in = 0;
        } else if (getResources().getString(R.string.search_price_charge).equals(key)) {
            this.an = key;
            this.id = 1;
            this.in = Integer.MAX_VALUE;
        } else {
            if (key == null || !key.contains(getResources().getString(R.string.resource_price_unit))) {
                return;
            }
            int i2 = Integer.parseInt(key.replace(getResources().getString(R.string.resource_price_unit), "00"));
            this.id = i2;
            this.in = i2;
            this.an = key;
        }
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1870y
    public void d2ok() {
        this.f13694x.scrollTop();
    }

    public void el() {
        this.f13693w = null;
        this.id = 0;
        this.bv = null;
        this.an = null;
        this.in = Integer.MAX_VALUE;
        this.f13687l.oc(null);
        this.f13687l.jk(this.id);
        this.f13687l.d2ok(this.in);
        this.f13686j.setVisibility(8);
        this.f13689o.setVisibility(8);
        this.f13680a.zy();
        this.f13694x.clearData();
        ob();
    }

    protected void exv8(boolean isLazyInit) {
        this.bl = isLazyInit;
    }

    protected C2367n gb() {
        C2367n c2367nWt = wt();
        c2367nWt.setContext(this).setLayoutManagerType(f1bi()).setItemDecoration(bqie()).setStaggerHolderWidth((C1819o.jk(getActivity()) - (getActivity().getResources().getDimensionPixelSize(R.dimen.stagger_divider) * 6)) / 2).setNeedFootTip(xm()).setResCode(this.f60659bo).setStaggerDecorationSize(getActivity().getResources().getDimensionPixelSize(R.dimen.stagger_divider)).setRequest(new zy()).setCallBack(new toq());
        return c2367nWt;
    }

    public void hyow(boolean visible) {
        ThemeFilterContainer themeFilterContainer = this.f13680a;
        if (themeFilterContainer != null) {
            themeFilterContainer.setVisibleChange(visible);
        }
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: imd, reason: merged with bridge method [inline-methods] */
    public InterfaceC7729k.k uv6() {
        RecommendSearchPresenter recommendSearchPresenter = new RecommendSearchPresenter(this.f13692v, this.f13683d, null, 0, Integer.MAX_VALUE, 0);
        this.f13687l = recommendSearchPresenter;
        return recommendSearchPresenter;
    }

    protected void kbj() {
        this.f13684e.setVisibility(0);
        this.f13681b.setVisibility(8);
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String kx3() {
        return com.android.thememanager.basemodule.analysis.toq.iqz;
    }

    protected void l05(ViewGroup rootView) {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.rc_search_container, rootView, false);
        this.f13684e = (LinearLayout) viewInflate.findViewById(R.id.search_container);
        ThemeFilterContainer themeFilterContainer = (ThemeFilterContainer) viewInflate.findViewById(R.id.search_spinner);
        this.f13680a = themeFilterContainer;
        themeFilterContainer.m8839k(this.f13691u, this);
        hyow(false);
        this.f13686j = (LinearLayout) viewInflate.findViewById(R.id.search_tv_container);
        this.f13689o = (LinearLayout) viewInflate.findViewById(R.id.search_loading_container);
        this.f13688m = (TextView) viewInflate.findViewById(R.id.search_alert);
        ((FrameLayout) viewInflate.findViewById(R.id.search_list_container)).addView(this.f13694x, 0);
        rootView.addView(this.f13684e, 0);
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        return com.android.thememanager.basemodule.analysis.toq.gjbz;
    }

    public void ob() {
        kq2f();
        this.f13682c.setVisibility(8);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(@dd Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mj();
    }

    @Override // androidx.fragment.app.Fragment
    @dd
    public View onCreateView(LayoutInflater inflater, @dd ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.rc_fragment_recommend, container, false);
        this.f13685f = viewGroup;
        this.f13681b = viewGroup.findViewById(R.id.loading);
        r6ty();
        btvn(this.f13685f);
        this.bl = false;
        return this.f13685f;
    }

    protected UIPage ovdh(UIPage apiData, boolean refresh) {
        if (refresh) {
            this.f9877s = apiData.uuid;
        }
        return apiData;
    }

    protected void pnt2() {
        this.f13684e.setVisibility(8);
        this.f13681b.setVisibility(0);
    }

    public void qh4d(String searchKey) {
        RecommendSearchPresenter recommendSearchPresenter = this.f13687l;
        if (recommendSearchPresenter != null) {
            recommendSearchPresenter.lvui(searchKey);
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public void ra(boolean visibleForUser) {
        super.ra(visibleForUser);
        if (visibleForUser) {
            mj();
        } else {
            this.bl = false;
        }
    }

    public IRecommendListView tww7() {
        return this.f13694x;
    }

    @Override // com.android.thememanager.recommend.view.widget.ThemeFilterContainer.toq
    public void uj2j(String name) {
        cyoe(name);
        RecommendSearchPresenter recommendSearchPresenter = this.f13687l;
        recommendSearchPresenter.lvui(recommendSearchPresenter.mcp());
        this.f13687l.oc(this.f13693w);
        this.f13687l.jk(this.id);
        this.f13687l.d2ok(this.in);
        this.f13686j.setVisibility(0);
        this.f13688m.setVisibility(8);
        this.f13689o.setVisibility(0);
        this.f13694x.clearData();
        this.f13694x.refreshData();
        JSONObject jSONObject = new JSONObject();
        try {
            String string = this.bv;
            if (string == null) {
                string = getResources().getString(R.string.search_sort_synthesize);
            }
            jSONObject.put("order", string);
            String string2 = this.an;
            if (string2 == null) {
                string2 = getResources().getString(R.string.search_price_no_limit);
            }
            jSONObject.put("price", string2);
            jSONObject.put("hint", "1");
            jSONObject.put(com.android.thememanager.basemodule.analysis.toq.bao0, this.f13687l.mcp());
            jSONObject.put("resourceType", this.f60659bo);
        } catch (JSONException e2) {
            Log.e("RecommendSearchFragment", e2.toString());
        }
        com.android.thememanager.basemodule.analysis.kja0.f7l8(m2t(), this.f13687l.mcp(), jSONObject.toString());
        ArrayMap<String, Object> arrayMapKja0 = C1706p.kja0(m2t(), this.f13687l.mcp(), "");
        String string3 = this.bv;
        if (string3 == null) {
            string3 = getResources().getString(R.string.search_sort_synthesize);
        }
        arrayMapKja0.put("order", string3);
        String string4 = this.an;
        if (string4 == null) {
            string4 = getResources().getString(R.string.search_price_no_limit);
        }
        arrayMapKja0.put("price", string4);
        arrayMapKja0.put("hint", "1");
        arrayMapKja0.put(com.android.thememanager.basemodule.analysis.toq.bao0, this.f13687l.mcp());
        arrayMapKja0.put("resourceType", this.f60659bo);
        C1708s.f7l8().ld6().ni7(arrayMapKja0);
    }

    protected C2367n wt() {
        return new C2367n();
    }

    public void xblq() {
        kq2f();
        this.f13682c.setVisibility(0);
    }

    protected boolean xm() {
        return false;
    }

    @Override // com.android.thememanager.basemodule.base.f7l8
    public void z4t() {
        super.z4t();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13683d = arguments.getString(as);
            this.f60659bo = arguments.getString("resource_code");
            this.f13692v = arguments.getString(InterfaceC1357q.f53973zp);
        }
    }
}

package com.android.thememanager.activity;

import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.C0924e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2081i;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.model.LargeIconRequestModel;
import com.android.thememanager.model.LargeIconSplitResource;
import com.android.thememanager.recommend.view.listview.C2365g;
import com.android.thememanager.recommend.view.listview.C2367n;
import com.android.thememanager.recommend.view.listview.C2368q;
import com.android.thememanager.recommend.view.listview.RecommendVMListView;
import com.android.thememanager.recommend.view.listview.viewmodel.C2449k;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.google.gson.C4871g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: LargeIconAllFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class nmn5 extends C1582h {

    /* JADX INFO: renamed from: v */
    private static final int f9267v = 9;

    /* JADX INFO: renamed from: a */
    private String f9268a;

    /* JADX INFO: renamed from: b */
    private View f9269b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private FrameLayout f57345bo;

    /* JADX INFO: renamed from: c */
    private com.android.thememanager.ki f9270c;

    /* JADX INFO: renamed from: e */
    private lv5 f9271e;

    /* JADX INFO: renamed from: f */
    private RecyclerView f9272f;

    /* JADX INFO: renamed from: j */
    private C2449k f9273j;

    /* JADX INFO: renamed from: m */
    private View f9274m;

    /* JADX INFO: renamed from: o */
    private IRecommendListView f9275o;

    /* JADX INFO: renamed from: u */
    private ViewGroup f9276u;

    /* JADX INFO: renamed from: x */
    private ViewGroup f9277x;

    /* JADX INFO: renamed from: com.android.thememanager.activity.nmn5$k */
    /* JADX INFO: compiled from: LargeIconAllFragment.java */
    class C1615k extends IRecommendListView.CallBack<UIPage> {
        C1615k() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public Pair<UIPage, List<UIElement>> editRecommendLoadResult(UIPage page, List<UIElement> list, boolean refresh) {
            if (page != null && !com.android.thememanager.basemodule.utils.y9n.mcp(list) && nmn5.this.cn02()) {
                nmn5.this.f9271e.n5r1(page.uuid, page, new ArrayList(list), refresh, 9);
            }
            return null;
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public boolean isInterruptLoadData(UIPage uiPage) {
            if (uiPage == null) {
                return false;
            }
            return !p029m.zy.m24738k(nmn5.this.f9268a, uiPage.uuid);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadFail(boolean refresh) {
            C2081i c2081iM6432c;
            if (!refresh) {
                if (!nmn5.this.cn02() || (c2081iM6432c = nmn5.this.f9271e.m6432c(nmn5.this.f9268a)) == null) {
                    return;
                }
                c2081iM6432c.m7993p(c2081iM6432c.zy() - 1);
                return;
            }
            nmn5.this.pnt2();
            if (nmn5.this.f9276u == null || !C1781k.toq(bf2.toq.toq()) || !C1915g.m7550n() || com.android.thememanager.basemodule.privacy.x2.f7l8()) {
                return;
            }
            ((TextView) nmn5.this.f9276u.findViewById(R.id.reload_info)).setText(R.string.resource_data_empty);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadSuccess(boolean refresh) {
            nmn5.this.vwb();
        }
    }

    /* JADX INFO: compiled from: LargeIconAllFragment.java */
    class toq implements IRecommendListView.Request {
        toq() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getLoadMoreCall(int cardStart) {
            return LargeIconRequestModel.getLargeIconCategoryData(nmn5.this.f9268a, cardStart, 9);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<com.google.gson.kja0>> getRefreshCall() {
            return LargeIconRequestModel.getLargeIconCategoryData(nmn5.this.f9268a, 0, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void exv8(View view) {
        z617();
    }

    private LargeIconSplitResource gb() {
        return this.f9271e.lrht();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hyow(LargeIconSplitResource largeIconSplitResource) {
        String link = largeIconSplitResource.getLink();
        this.f9268a = link;
        C2081i c2081iM6432c = this.f9271e.m6432c(link);
        if (c2081iM6432c == null) {
            z617();
            return;
        }
        c2081iM6432c.m7990g(this.f9273j);
        C2368q c2368qMo8556y = ((RecommendVMListView) this.f9275o).getAdapter().mo8556y();
        c2368qMo8556y.m8568n();
        c2368qMo8556y.zy(c2081iM6432c.zy());
        ((RecommendVMListView) this.f9275o).kja0(this.f9273j);
        vwb();
    }

    private int kbj() {
        return com.android.thememanager.basemodule.utils.y9n.fn3e().x - (cn02() ? getContext().getResources().getDimensionPixelSize(R.dimen.large_icon_all_page_catatory_list_width) : 0);
    }

    private void kq2f(View rootView) {
        if (this.f9277x == null) {
            ViewGroup viewGroupM7337k = new com.android.thememanager.basemodule.views.ld6().m7337k((ViewStub) rootView.findViewById(R.id.reload_stub), 2);
            this.f9277x = viewGroupM7337k;
            viewGroupM7337k.findViewById(R.id.local_entry).setVisibility(8);
            this.f9277x.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8915k.ovdh(view);
                }
            });
        }
        if (this.f9276u == null) {
            ViewGroup viewGroupM7337k2 = new com.android.thememanager.basemodule.views.ld6().m7337k((ViewStub) this.f57345bo.findViewById(R.id.data_reload_stub), 2);
            this.f9276u = viewGroupM7337k2;
            viewGroupM7337k2.findViewById(R.id.local_entry).setVisibility(8);
            this.f9276u.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.zp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9428k.exv8(view);
                }
            });
        }
    }

    private void lk() {
        mi1u();
        this.f9271e.m6433e(gb().getLink());
    }

    private void mi1u() {
        this.f9277x.setVisibility(8);
        this.f9274m.setVisibility(8);
        this.f9269b.setVisibility(0);
        this.f9275o.setVisibility(8);
        this.f9276u.setVisibility(8);
    }

    private void mj(View rootView) {
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.split_list);
        this.f9272f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        com.android.thememanager.ki kiVar = new com.android.thememanager.ki(this);
        this.f9270c = kiVar;
        this.f9272f.setAdapter(kiVar);
        this.f9269b = rootView.findViewById(R.id.refresh_loading);
        FrameLayout frameLayout = (FrameLayout) rootView.findViewById(R.id.large_icon_list);
        this.f57345bo = frameLayout;
        this.f9274m = frameLayout.findViewById(R.id.loading);
        IRecommendListView iRecommendListViewBuild = btvn().build();
        this.f9275o = iRecommendListViewBuild;
        this.f57345bo.addView(iRecommendListViewBuild, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ovdh(View view) {
        lk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pnt2() {
        this.f9277x.setVisibility(8);
        this.f9274m.setVisibility(8);
        this.f9269b.setVisibility(8);
        this.f9275o.setVisibility(8);
        this.f9276u.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void qh4d(List list) {
        if (!com.android.thememanager.basemodule.utils.y9n.mcp(list)) {
            com.android.thememanager.ki kiVar = this.f9270c;
            if (kiVar != null) {
                kiVar.notifyDataSetChanged();
                this.f9268a = tww7() != null ? tww7().getLink() : ((LargeIconSplitResource) list.get(0)).getLink();
                return;
            }
            return;
        }
        xblq();
        if (this.f9277x == null || !C1781k.toq(bf2.toq.toq()) || !C1915g.m7550n() || com.android.thememanager.basemodule.privacy.x2.f7l8()) {
            return;
        }
        ((TextView) this.f9277x.findViewById(R.id.reload_info)).setText(R.string.resource_data_empty);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vwb() {
        this.f9277x.setVisibility(8);
        this.f9274m.setVisibility(8);
        this.f9269b.setVisibility(8);
        this.f9276u.setVisibility(8);
        this.f9275o.setVisibility(0);
    }

    private void xblq() {
        this.f9277x.setVisibility(0);
        this.f9274m.setVisibility(8);
        this.f9269b.setVisibility(8);
        this.f9275o.setVisibility(8);
        this.f9276u.setVisibility(8);
    }

    private void xm() {
        this.f9271e.m6434f().m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.x
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9369k.qh4d((List) obj);
            }
        });
        this.f9271e.hyr().m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.ch
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f8976k.hyow((LargeIconSplitResource) obj);
            }
        });
    }

    private void xtb7() {
        this.f9277x.setVisibility(8);
        if (this.f9269b.getVisibility() != 0) {
            this.f9274m.setVisibility(0);
        }
        this.f9269b.setVisibility(8);
        this.f9275o.setVisibility(8);
        this.f9276u.setVisibility(8);
    }

    private void z617() {
        xtb7();
        this.f9275o.refreshData();
    }

    protected C2367n btvn() {
        C2365g c2365g = new C2365g();
        c2365g.mcp(this.f9273j);
        c2365g.setContext(this).setLayoutManagerType(1).setRefresh(false).setCardCount(9).setViewHolderLifecycleEnable(false).setStaggerHolderWidth(kbj()).setRequest(new toq()).setCallBack(new C1615k());
        return c2365g;
    }

    public boolean cn02() {
        return this.f9271e.uv6().booleanValue();
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String kx3() {
        if (cn02()) {
            if (tww7() == null) {
                return null;
            }
            return tww7().getLink();
        }
        if (this.f9271e.lrht() == null) {
            return null;
        }
        return this.f9271e.lrht().getLink();
    }

    public lv5 ob() {
        return this.f9271e;
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f9271e = (lv5) new C0924e(this).m4420k(lv5.class);
        this.f9273j = (C2449k) new C0924e(this).m4420k(C2449k.class);
        xzl();
        this.f9273j.vyq("largeicons");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.activity_large_icon_all, container, false);
        if (cn02()) {
            viewInflate.setPadding(0, getResources().getDimensionPixelSize(R.dimen.large_icon_all_fragment_padding_top), 0, 0);
        }
        mj(viewInflate);
        kq2f(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        nnh(true);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        nnh(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        xm();
        if (!cn02()) {
            this.f9272f.setVisibility(8);
            if (tww7() == null) {
                this.f9271e.hyr().cdj(gb());
                return;
            }
            return;
        }
        if (this.f9271e.vyq()) {
            lk();
        } else {
            vwb();
            this.f9271e.hyr().cdj(tww7());
        }
    }

    public LargeIconSplitResource tww7() {
        return this.f9271e.hyr().m4388g();
    }

    @Override // com.android.thememanager.basemodule.base.toq
    /* JADX INFO: renamed from: w */
    public String mo6436w() {
        if (!cn02()) {
            return super.mo6436w();
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(com.android.thememanager.basemodule.analysis.toq.tkle, tww7() == null ? null : tww7().getTitle());
        return new C4871g().o1t(arrayMap);
    }

    public void wtop() {
        this.f9275o.scrollTop();
    }

    protected void xzl() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (this.f9271e.uv6() == null) {
                this.f9271e.nn86(Boolean.valueOf(arguments.getBoolean(p001b.f7l8.qla)));
            }
            if (this.f9271e.lrht() == null) {
                this.f9271e.hb(new LargeIconSplitResource(arguments.getString(p001b.f7l8.uv), arguments.getString(p001b.f7l8.a8p6)));
            }
        }
    }
}

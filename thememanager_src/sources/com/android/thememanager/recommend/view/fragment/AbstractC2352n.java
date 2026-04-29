package com.android.thememanager.recommend.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.jp0y;
import androidx.lifecycle.kja0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.privacy.x2;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.ni7;
import com.android.thememanager.basemodule.views.InterfaceC1870y;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.recommend.view.listview.C2367n;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.google.gson.kja0;
import java.util.List;
import w831.InterfaceC7729k;
import zy.dd;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.n */
/* JADX INFO: compiled from: RecommendFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2352n extends com.android.thememanager.basemodule.base.f7l8<InterfaceC7729k.k> implements InterfaceC7729k.toq, InterfaceC1870y {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    protected static final String f60651ab = "layout_manager_type";
    protected static final String bb = "is_picker";
    protected static final String bp = "res_code";
    protected static final String bv = "ringtone_flag";

    /* JADX INFO: renamed from: w */
    protected static final String f13654w = "need_refresh";

    /* JADX INFO: renamed from: a */
    protected String f13655a;

    /* JADX INFO: renamed from: b */
    protected RecyclerView.kja0 f13656b;

    /* JADX INFO: renamed from: c */
    private ViewGroup f13657c;

    /* JADX INFO: renamed from: e */
    private boolean f13659e;

    /* JADX INFO: renamed from: f */
    protected View f13660f;

    /* JADX INFO: renamed from: j */
    protected int f13661j;

    /* JADX INFO: renamed from: l */
    protected IRecommendListView f13662l;

    /* JADX INFO: renamed from: m */
    protected GridLayoutManager.zy f13663m;

    /* JADX INFO: renamed from: o */
    protected int f13664o;

    /* JADX INFO: renamed from: r */
    protected ViewGroup f13665r;

    /* JADX INFO: renamed from: u */
    protected int f13666u;

    /* JADX INFO: renamed from: v */
    private boolean f13667v;

    /* JADX INFO: renamed from: x */
    protected boolean f13668x;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    protected boolean f60652bo = false;

    /* JADX INFO: renamed from: d */
    private final jp0y<Intent> f13658d = new k();

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.n$k */
    /* JADX INFO: compiled from: RecommendFragment.java */
    class k implements jp0y<Intent> {
        k() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(Intent intent) {
            IRecommendListView iRecommendListView;
            if (!x2.f7l8() || (iRecommendListView = AbstractC2352n.this.f13662l) == null || iRecommendListView.getElementSize() <= 0) {
                return;
            }
            AbstractC2352n.this.f13662l.clearData();
            AbstractC2352n.this.mj();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.n$q */
    /* JADX INFO: compiled from: RecommendFragment.java */
    class q implements View.OnClickListener {
        q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq() {
            AbstractC2352n.this.yp31();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (!C1781k.toq(AbstractC2352n.this.getContext())) {
                AbstractC2352n.this.ew(true);
                return;
            }
            boolean zF7l8 = x2.f7l8();
            AbstractC2352n.this.kq2f(zF7l8);
            if (zF7l8) {
                x2.m6916q(AbstractC2352n.this.getContext(), new p000a.toq() { // from class: com.android.thememanager.recommend.view.fragment.g
                    @Override // p000a.toq
                    public final void onSuccess() {
                        this.f13640k.toq();
                    }
                });
            } else {
                AbstractC2352n.this.yp31();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.n$toq */
    /* JADX INFO: compiled from: RecommendFragment.java */
    class toq extends IRecommendListView.CallBack<UIPage> {
        toq() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onParseUICardFinish(List<UIElement> uiElements, boolean refresh) {
            if (AbstractC2352n.this.f13667v) {
                return;
            }
            AbstractC2352n.this.kbj(uiElements, refresh);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendListScroll(IRecommendListView listView, RecyclerView recyclerView, int dx, int dy) {
            AbstractC2352n.this.gb(listView, recyclerView, dx, dy);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadFail(boolean refresh) {
            if (AbstractC2352n.this.f13667v) {
                return;
            }
            AbstractC2352n.this.wt();
            if (AbstractC2352n.this.f13662l.getElementSize() == 0) {
                AbstractC2352n.this.mj();
                if (AbstractC2352n.this.f13657c == null || !C1781k.toq(bf2.toq.toq()) || !C1915g.m7550n() || x2.f7l8()) {
                    return;
                }
                ((TextView) AbstractC2352n.this.f13657c.findViewById(R.id.reload_info)).setText(R.string.resource_data_empty);
            }
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadSuccess(boolean refresh) {
            if (AbstractC2352n.this.f13667v) {
                return;
            }
            AbstractC2352n.this.wt();
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public UIPage onRequestFinish(UIPage apiData, boolean refresh) {
            return AbstractC2352n.this.f13667v ? apiData : AbstractC2352n.this.btvn(apiData, refresh);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.n$zy */
    /* JADX INFO: compiled from: RecommendFragment.java */
    class zy implements IRecommendListView.Request {
        zy() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart) {
            InterfaceC7729k.k kVar = (InterfaceC7729k.k) AbstractC2352n.this.kiv();
            if (kVar == null) {
                return null;
            }
            return kVar.getLoadMoreCall(cardStart);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<kja0>> getRefreshCall() {
            InterfaceC7729k.k kVar = (InterfaceC7729k.k) AbstractC2352n.this.kiv();
            if (kVar == null) {
                return null;
            }
            return kVar.getRefreshCall();
        }
    }

    private void bqie() {
        if (this.f13657c == null) {
            ViewGroup viewGroupM7337k = new com.android.thememanager.basemodule.views.ld6().m7337k((ViewStub) this.f13665r.findViewById(R.id.reload_stub), 2);
            this.f13657c = viewGroupM7337k;
            viewGroupM7337k.findViewById(R.id.local_entry).setVisibility(8);
            this.f13657c.setOnClickListener(new q());
        }
    }

    private void cn02() {
        IRecommendListView iRecommendListView = this.f13662l;
        if (iRecommendListView == null || iRecommendListView.getElementSize() > 0) {
            return;
        }
        this.f13660f.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq2f(boolean isLocalMode) {
        ViewGroup viewGroup = this.f13657c;
        if (viewGroup != null) {
            ((TextView) viewGroup.findViewById(R.id.reload_info)).setText(isLocalMode ? R.string.local_mode_hint : R.string.no_data);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yp31() {
        el();
        cn02();
        this.f13662l.refreshData();
    }

    protected UIPage btvn(UIPage apiData, boolean refresh) {
        if (refresh) {
            this.f9877s = apiData.uuid;
        }
        return apiData;
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1870y
    public void d2ok() {
        IRecommendListView iRecommendListView = this.f13662l;
        if (iRecommendListView != null) {
            iRecommendListView.scrollTop();
        }
    }

    public void el() {
        bqie();
        this.f13657c.setVisibility(8);
    }

    protected boolean f1bi() {
        return this.f13661j == 1;
    }

    protected C2367n g0ad() {
        C2367n c2367nR6ty = r6ty();
        c2367nR6ty.setContext(this).setRefresh(this.f13659e).setLayoutManagerType(this.f13661j).setLayoutManagerSpanCount(this.f13664o).setSpanSizeLookup(this.f13663m).setCardDivider(this.f13661j == 1).setCardDivider(f1bi()).setItemDecoration(this.f13656b).setNeedFootTip(tww7()).setResCode(this.f13655a).setPicker(this.f13668x).setRingtoneFlag(this.f13666u).setStaggerHolderWidth((C1819o.jk(getActivity()) - (getActivity().getResources().getDimensionPixelSize(R.dimen.stagger_divider) * 6)) / 2).setStaggerDecorationSize(getActivity().getResources().getDimensionPixelSize(R.dimen.stagger_divider)).setRequest(new zy()).setCallBack(new toq());
        return c2367nR6ty;
    }

    public void gb(IRecommendListView listView, RecyclerView recyclerView, int dx, int dy) {
    }

    protected void imd() {
        IRecommendListView iRecommendListViewBuild = g0ad().build();
        this.f13662l = iRecommendListViewBuild;
        this.f13665r.addView(iRecommendListViewBuild, 0);
    }

    public void kbj(List<UIElement> uiElements, boolean refresh) {
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        String str = this.f9877s;
        return str != null ? String.format(com.android.thememanager.basemodule.analysis.toq.dkhc, str) : super.m2t();
    }

    public void mj() {
        bqie();
        this.f13657c.setVisibility(0);
    }

    protected void ob() {
        if (ps() && getLifecycle().toq().isAtLeast(kja0.zy.CREATED) && !this.f60652bo) {
            this.f60652bo = true;
            cn02();
            this.f13662l.refreshData();
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(@dd Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ob();
    }

    @Override // androidx.fragment.app.Fragment
    @dd
    public View onCreateView(LayoutInflater inflater, @dd ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.rc_fragment_recommend, container, false);
        this.f13665r = viewGroup;
        int i2 = this.f13661j;
        if (i2 == 0 || i2 == 2) {
            viewGroup.setPadding(getResources().getDimensionPixelOffset(R.dimen.stagger_divider), this.f13665r.getPaddingTop(), getResources().getDimensionPixelOffset(R.dimen.stagger_divider), this.f13665r.getPaddingBottom());
        }
        this.f13660f = this.f13665r.findViewById(R.id.loading);
        imd();
        this.f60652bo = false;
        this.f13667v = false;
        ni7.m7146k().toq(x2.f57643qrj, this.f13658d);
        return this.f13665r;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        IRecommendListView iRecommendListView = this.f13662l;
        if (iRecommendListView != null) {
            iRecommendListView.clear();
        }
        this.f13657c = null;
        this.f13667v = true;
        ni7.m7146k().m7147n(x2.f57643qrj, this.f13658d);
        super.onDestroyView();
    }

    protected C2367n r6ty() {
        return new C2367n();
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public void ra(boolean visibleForUser) {
        super.ra(visibleForUser);
        if (visibleForUser) {
            ob();
        }
    }

    protected boolean tww7() {
        return false;
    }

    protected void wt() {
        this.f13660f.setVisibility(8);
    }

    public void xm() {
        el();
        cn02();
        this.f13662l.refreshData();
    }

    @Override // com.android.thememanager.basemodule.base.f7l8
    public void z4t() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13659e = arguments.getBoolean(f13654w);
            this.f13661j = arguments.getInt(f60651ab, 0);
            this.f13668x = arguments.getBoolean(bb);
            this.f13666u = arguments.getInt(bv, -1);
        }
    }

    public IRecommendListView zff0() {
        return this.f13662l;
    }
}

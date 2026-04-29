package com.android.thememanager.mine.remote.view.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.lifecycle.jp0y;
import androidx.lifecycle.kja0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.ni7;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.basemodule.views.C1858p;
import com.android.thememanager.basemodule.views.ld6;
import com.android.thememanager.basemodule.views.x2;
import com.android.thememanager.mine.local.view.fragment.LocalIconFragment;
import com.android.thememanager.mine.remote.model.entity.LargeIconRemoteBatchItem;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.mine.remote.widget.C2197k;
import com.android.thememanager.recommend.view.listview.decoration.C2363n;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i9jn.InterfaceC6094k;
import java.util.List;
import miuix.internal.widget.C7177g;
import miuix.recyclerview.widget.C7318k;
import miuix.springback.view.SpringBackLayout;
import yz.C7794k;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: BaseRemoteResourceTabFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zy extends com.android.thememanager.basemodule.base.f7l8<InterfaceC6094k.q> implements InterfaceC6094k.f7l8, BatchOperationAdapter.zy {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final String f60463ab = "wallpaper";
    public static final String an = "aod";
    public static final String as = "like_or_favorite_state_change";
    public static final String bb = "fonts";
    public static final String bl = "largeicons";
    public static final String bp = "miwallpaper";
    public static final String bv = "videowallpaper";
    public static final String id = "icons";
    public static final String in = "widget_suit";

    /* JADX INFO: renamed from: w */
    public static final String f12859w = "theme";

    /* JADX INFO: renamed from: a */
    private C7177g f12860a;

    /* JADX INFO: renamed from: b */
    private C2197k f12861b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f60464bo;

    /* JADX INFO: renamed from: c */
    private x2 f12862c;

    /* JADX INFO: renamed from: e */
    private SpringBackLayout f12864e;

    /* JADX INFO: renamed from: f */
    private ViewGroup f12865f;

    /* JADX INFO: renamed from: j */
    protected RecyclerView f12866j;

    /* JADX INFO: renamed from: l */
    private View f12867l;

    /* JADX INFO: renamed from: m */
    protected BaseRemoteResourceAdapter f12868m;

    /* JADX INFO: renamed from: o */
    protected GridLayoutManager f12869o;

    /* JADX INFO: renamed from: r */
    protected ViewGroup f12870r;

    /* JADX INFO: renamed from: u */
    private String f12871u;

    /* JADX INFO: renamed from: v */
    private String f12872v;

    /* JADX INFO: renamed from: x */
    private boolean f12873x = false;

    /* JADX INFO: renamed from: d */
    private final jp0y<Intent> f12863d = new C2190k();

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.fragment.zy$k */
    /* JADX INFO: compiled from: BaseRemoteResourceTabFragment.java */
    class C2190k implements jp0y<Intent> {
        C2190k() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(Intent intent) {
            if (zy.as.equals(intent.getAction())) {
                zy.this.f60464bo = true;
                zy.this.f12872v = intent.getStringExtra("resource_code");
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.fragment.zy$n */
    /* JADX INFO: compiled from: BaseRemoteResourceTabFragment.java */
    class C2191n implements C1688q.n {
        C2191n() {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            zy.this.kq2f();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.fragment.zy$q */
    /* JADX INFO: compiled from: BaseRemoteResourceTabFragment.java */
    class C2192q extends GridLayoutManager.zy {
        C2192q() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.zy
        /* JADX INFO: renamed from: g */
        public int mo4760g(int position) {
            LargeIconRemoteBatchItem largeIconRemoteBatchItem = (LargeIconRemoteBatchItem) zy.this.f12868m.ni7().get(position);
            return (largeIconRemoteBatchItem == null || largeIconRemoteBatchItem.type != 1) ? 1 : 3;
        }
    }

    /* JADX INFO: compiled from: BaseRemoteResourceTabFragment.java */
    class toq extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f12877k;

        toq(final int val$girdSpace) {
            this.f12877k = val$girdSpace;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@lvui Rect rect, @lvui View view, @lvui RecyclerView recyclerView, @lvui RecyclerView.mcp mcpVar) {
            int iZy = ((GridLayoutManager.toq) view.getLayoutParams()).zy();
            boolean zBqie = zy.this.bqie();
            int itemCount = zy.this.f12868m.getItemCount();
            int iLd6 = zy.this.f12869o.ld6();
            int i2 = this.f12877k;
            C1858p.m7344k(rect, recyclerView, itemCount, iLd6, i2, 0, i2, 0, iZy, zBqie ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.fragment.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseRemoteResourceTabFragment.java */
    class C7925zy implements x2.InterfaceC1868n {
        C7925zy() {
        }

        @Override // com.android.thememanager.basemodule.views.x2.InterfaceC1868n
        /* JADX INFO: renamed from: k */
        public void mo7377k() {
            ((InterfaceC6094k.q) zy.this.kiv()).mo8265z();
        }

        @Override // com.android.thememanager.basemodule.views.x2.InterfaceC1868n
        public void toq() {
            ((InterfaceC6094k.q) zy.this.kiv()).ki();
        }
    }

    private void btvn() {
        if (this.f12865f == null) {
            String strWt = wt();
            int i2 = 2;
            if (strWt.equals("theme")) {
                i2 = 1;
            } else if (strWt.equals("ringtone")) {
                i2 = 3;
            } else if (strWt.equals("fonts")) {
                i2 = 4;
            } else if (!strWt.equals("wallpaper")) {
                strWt.equals("widget_suit");
            }
            ViewGroup viewGroupM7337k = new ld6().m7337k((ViewStub) this.f12870r.findViewById(R.id.reload_stub), i2);
            this.f12865f = viewGroupM7337k;
            viewGroupM7337k.findViewById(R.id.local_entry).setVisibility(8);
            this.f12865f.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.mine.remote.view.fragment.toq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12858k.xm(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: exv8, reason: merged with bridge method [inline-methods] */
    public void kq2f() {
        ob();
        xblq();
        kiv().mo8265z();
    }

    private void gb() {
        this.f12864e = (SpringBackLayout) this.f12870r.findViewById(R.id.refreshLayout);
        this.f12866j = (RecyclerView) this.f12870r.findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManagerZff0 = zff0();
        this.f12869o = gridLayoutManagerZff0;
        this.f12866j.setLayoutManager(gridLayoutManagerZff0);
        this.f12866j.setItemAnimator(new C7318k());
        BaseRemoteResourceAdapter baseRemoteResourceAdapterR6ty = r6ty();
        this.f12868m = baseRemoteResourceAdapterR6ty;
        baseRemoteResourceAdapterR6ty.ch(((C1819o.jk(getActivity()) - (getActivity().getResources().getDimensionPixelSize(R.dimen.me_card_aod_thunmnail_padding_horizontal) * 6)) - (getActivity().getResources().getDimensionPixelSize(R.dimen.me_local_margin_left) * 2)) / 2);
        this.f12868m.a98o(this);
        this.f12866j.setAdapter(this.f12868m);
        this.f12866j.addItemDecoration(kbj(wt()));
        RecyclerView recyclerView = this.f12866j;
        if (recyclerView instanceof miuix.recyclerview.widget.RecyclerView) {
            ((miuix.recyclerview.widget.RecyclerView) recyclerView).setSpringEnabled(false);
        }
        this.f12862c = new x2(this.f12864e, new C7925zy(), false, true);
        if ("widget_suit".equals(wt())) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.stagger_divider);
            RecyclerView recyclerView2 = this.f12866j;
            recyclerView2.setPaddingRelative(dimensionPixelSize, recyclerView2.getPaddingTop(), dimensionPixelSize, this.f12866j.getPaddingBottom());
        }
    }

    public static String imd(Context context, @lvui String tabType) {
        return tabType.equals("theme") ? context.getResources().getString(R.string.theme_component_title_all) : tabType.equals("wallpaper") ? context.getResources().getString(R.string.component_title_wallpaper) : tabType.equals("miwallpaper") ? context.getResources().getString(R.string.desktop_effects) : tabType.equals("fonts") ? context.getResources().getString(R.string.theme_component_title_font) : tabType.equals("videowallpaper") ? context.getResources().getString(R.string.live_wallpaper) : tabType.equals("aod") ? context.getResources().getString(R.string.theme_component_title_aod) : tabType.equals("icons") ? context.getResources().getString(R.string.theme_component_title_icon) : tabType.equals("widget_suit") ? context.getResources().getString(R.string.component_title_widget_suit) : tabType.equals("largeicons") ? context.getResources().getString(R.string.theme_component_title_large_icon) : context.getResources().getString(R.string.theme_component_title_all);
    }

    private void mj() {
        if (ps() && getLifecycle().toq().isAtLeast(kja0.zy.CREATED) && !this.f12873x) {
            if (!C1688q.cdj().wvg()) {
                xtb7();
                return;
            }
            this.f12873x = true;
            ob();
            xblq();
            qh4d();
        }
    }

    private void tww7(boolean success, boolean hasMore) {
        this.f12862c.m7374q(success, hasMore);
    }

    private void xblq() {
        this.f12867l.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void xm(View view) {
        if (!C1781k.toq(bf2.toq.toq())) {
            ew(true);
            return;
        }
        if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
            com.android.thememanager.basemodule.privacy.x2.m6916q(getContext(), new p000a.toq() { // from class: com.android.thememanager.mine.remote.view.fragment.k
                @Override // p000a.toq
                public final void onSuccess() {
                    this.f12857k.kq2f();
                }
            });
        } else if (C1688q.cdj().wvg()) {
            kq2f();
        } else {
            C1688q.cdj().fti(getActivity(), new C2191n());
        }
    }

    public static Bundle yp31(String tabType, String pageName) {
        Bundle bundle = new Bundle();
        bundle.putString(com.android.thememanager.mine.remote.view.activity.zy.f12846j, tabType);
        bundle.putString(com.android.thememanager.mine.remote.view.activity.zy.f12848o, pageName);
        return bundle;
    }

    public boolean bqie() {
        BaseRemoteResourceAdapter baseRemoteResourceAdapter = this.f12868m;
        return (baseRemoteResourceAdapter == null || baseRemoteResourceAdapter.ni7() == null || this.f12868m.ni7().size() <= 0 || ((BaseRemoteResourceAdapter.toq) this.f12868m.ni7().get(0)).getProduct() == null || !"message_header_id".equals(((BaseRemoteResourceAdapter.toq) this.f12868m.ni7().get(0)).getProduct().uuid)) ? false : true;
    }

    public boolean cn02(@lvui MenuItem item) {
        if (this.f12861b == null) {
            this.f12861b = new C2197k(this);
        }
        return this.f12861b.f7l8(item);
    }

    public void e5(List<UIProduct> products, boolean refresh, boolean hasMore) {
        f1bi();
        tww7(true, hasMore);
        ob();
        this.f12862c.m7373p(hasMore);
        this.f12868m.mu(products, !refresh);
        if (this.f12868m.getItemCount() == 0) {
            pnt2();
        }
    }

    protected int el() {
        return R.layout.me_fragment_remote_resource;
    }

    protected void f1bi() {
        this.f12867l.setVisibility(8);
    }

    public String g0ad() {
        return imd(getActivity(), wt());
    }

    @Override // i9jn.InterfaceC6094k.f7l8
    public void hb(List<UICard> card, boolean refresh, boolean hasMore) {
        f1bi();
        tww7(true, hasMore);
        ob();
        this.f12862c.m7373p(hasMore);
        this.f12868m.vq(card, !refresh);
        if (this.f12868m.getItemCount() == 0) {
            pnt2();
        }
    }

    public void hyow() {
        btvn();
        ((TextView) this.f12865f.findViewById(R.id.reload_info)).setText(com.android.thememanager.basemodule.privacy.x2.f7l8() ? R.string.local_mode_hint : R.string.no_data);
        this.f12865f.setVisibility(0);
    }

    protected RecyclerView.kja0 kbj(String tabType) {
        if ("widget_suit".equals(tabType)) {
            return new C2363n(requireContext(), R.dimen.me_widget_top_offset, R.dimen.me_widget_bottom_offset);
        }
        if ("icons".equals(tabType)) {
            return new LocalIconFragment.C2168k(getActivity());
        }
        if (!"largeicons".equals(tabType)) {
            return new toq(getResources().getDimensionPixelOffset(R.dimen.me_recycler_divider_width));
        }
        int dimensionPixelSize = bf2.toq.toq().getResources().getDimensionPixelSize(R.dimen.me_remote_large_icon_margin_border);
        this.f12866j.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        return new zsr0.zy(this.f12868m, getContext());
    }

    public void ob() {
        btvn();
        this.f12865f.setVisibility(8);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(@dd Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mj();
    }

    @Override // androidx.fragment.app.Fragment
    @dd
    public View onCreateView(LayoutInflater inflater, @dd ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(el(), container, false);
        this.f12870r = viewGroup;
        this.f12867l = viewGroup.findViewById(R.id.loading);
        gb();
        this.f12873x = false;
        ni7.m7146k().toq(as, this.f12863d);
        return this.f12870r;
    }

    @Override // com.android.thememanager.basemodule.base.f7l8, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f12868m.nmn5();
        super.onDestroy();
        C7177g c7177g = this.f12860a;
        if (c7177g != null && c7177g.isShowing()) {
            this.f12860a.dismiss();
            this.f12860a = null;
        }
        ni7.m7146k().m7147n(as, this.f12863d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f60464bo && !p029m.zy.toq(this.f12872v) && p029m.zy.m24738k(wt(), this.f12872v)) {
            C7794k.m28194k("BaseRemoteResourceTabFragment", "onResume: refreshData, mIsNeedRefresh = " + this.f60464bo + " mChangedType = " + this.f12872v);
            qh4d();
            this.f60464bo = false;
            this.f12872v = null;
        }
    }

    public boolean ovdh(Menu menu) {
        if (this.f12861b == null) {
            this.f12861b = new C2197k(this);
        }
        this.f12861b.m8292y(menu);
        return true;
    }

    public void pnt2() {
        btvn();
        ((TextView) this.f12865f.findViewById(R.id.reload_info)).setText(R.string.resource_data_empty);
        this.f12865f.setVisibility(0);
    }

    public void qh4d() {
        kiv().mo8265z();
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void qrj() {
        if (this.f12868m.getItemCount() == 0 && this.f12862c.zy()) {
            this.f12865f.callOnClick();
        }
    }

    protected abstract BaseRemoteResourceAdapter r6ty();

    @Override // com.android.thememanager.basemodule.base.toq
    public void ra(boolean visibleForUser) {
        super.ra(visibleForUser);
        if (visibleForUser) {
            mj();
        }
    }

    @Override // i9jn.InterfaceC6094k.f7l8
    /* JADX INFO: renamed from: s */
    public void mo8272s() {
        f1bi();
        tww7(false, true);
        if (this.f12868m.getItemCount() == 0) {
            if (C1688q.cdj().wvg()) {
                hyow();
            } else {
                xtb7();
            }
        }
    }

    public String wt() {
        return this.f12871u;
    }

    public void xtb7() {
        btvn();
        ((TextView) this.f12865f.findViewById(R.id.reload_info)).setText(com.android.thememanager.basemodule.privacy.x2.f7l8() ? R.string.local_mode_hint : R.string.mine_tab_not_login);
        this.f12865f.setVisibility(0);
    }

    @Override // com.android.thememanager.basemodule.base.f7l8
    protected void z4t() {
        super.z4t();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12871u = arguments.getString(com.android.thememanager.mine.remote.view.activity.zy.f12846j);
        }
    }

    public GridLayoutManager zff0() {
        if (wt().equals("fonts")) {
            return new GridLayoutManager(getActivity(), 1);
        }
        if (wt().equals("aod") || wt().equals("icons") || "widget_suit".equals(wt())) {
            return new GridLayoutManager(getActivity(), 2);
        }
        if (!wt().equals("largeicons")) {
            return new GridLayoutManager(getActivity(), 3);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        gridLayoutManager.fn3e(new C2192q());
        return gridLayoutManager;
    }

    public void zy() {
    }
}

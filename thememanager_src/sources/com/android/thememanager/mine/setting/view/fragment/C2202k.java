package com.android.thememanager.mine.setting.view.fragment;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.jp0y;
import cfr.C1394k;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.mine.setting.presenter.FontSettingPresenter;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.google.gson.kja0;
import i1.C6077k;
import java.util.List;
import r8s8.InterfaceC7629k;
import zy.dd;
import zy.lvui;
import zy.y9n;

/* JADX INFO: renamed from: com.android.thememanager.mine.setting.view.fragment.k */
/* JADX INFO: compiled from: FontSettingFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2202k extends com.android.thememanager.basemodule.base.f7l8<InterfaceC7629k.k> implements InterfaceC7629k.toq, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: b */
    private static final int f12974b = 3;

    /* JADX INFO: renamed from: c */
    private View f12975c;

    /* JADX INFO: renamed from: e */
    private IRecommendListView f12976e;

    /* JADX INFO: renamed from: f */
    private View f12977f;

    /* JADX INFO: renamed from: l */
    private View f12979l;

    /* JADX INFO: renamed from: r */
    private ViewGroup f12982r;

    /* JADX INFO: renamed from: j */
    private View[] f12978j = new View[3];

    /* JADX INFO: renamed from: o */
    private ImageView[] f12981o = new ImageView[3];

    /* JADX INFO: renamed from: m */
    private ImageView[] f12980m = new ImageView[3];

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.view.fragment.k$f7l8 */
    /* JADX INFO: compiled from: FontSettingFragment.java */
    class f7l8 implements View.OnClickListener {
        f7l8() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (C1781k.toq(bf2.toq.toq())) {
                C2202k.this.f12976e.refreshData();
            } else {
                C2202k.this.ew(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.view.fragment.k$g */
    /* JADX INFO: compiled from: FontSettingFragment.java */
    class g implements IRecommendListView.Request {
        g() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart) {
            return ((InterfaceC7629k.k) C2202k.this.kiv()).getLoadMoreCall(cardStart);
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.Request
        public retrofit2.toq<CommonResponse<kja0>> getRefreshCall() {
            return ((InterfaceC7629k.k) C2202k.this.kiv()).getRefreshCall();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.view.fragment.k$k */
    /* JADX INFO: compiled from: FontSettingFragment.java */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.fjcj));
            C2202k.this.startActivity(com.android.thememanager.toq.toq(C2202k.this.getActivity(), "fonts"));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.view.fragment.k$n */
    /* JADX INFO: compiled from: FontSettingFragment.java */
    class n extends IRecommendListView.CallBack<UIPage> {
        n() {
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadFail(boolean refresh) {
            super.onRecommendLoadFail(refresh);
            if (C2202k.this.f12976e.getElementSize() > 0 || C1781k.toq(bf2.toq.toq())) {
                return;
            }
            C2202k.this.f1bi();
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        public void onRecommendLoadSuccess(boolean refresh) {
            super.onRecommendLoadSuccess(refresh);
            C2202k.this.wt();
        }

        @Override // com.android.thememanager.router.recommend.entity.IRecommendListView.CallBack
        @y9n
        public UIPage onRequestFinish(UIPage apiData, boolean refresh) {
            if (refresh) {
                ((com.android.thememanager.basemodule.base.toq) C2202k.this).f9877s = apiData.uuid;
            }
            return super.onRequestFinish(apiData, refresh);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.view.fragment.k$q */
    /* JADX INFO: compiled from: FontSettingFragment.java */
    class q implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Resource f12987k;

        q(final Resource val$resource) {
            this.f12987k = val$resource;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            Intent intentZy = com.android.thememanager.toq.zy(this.f12987k.getLocalId());
            if (C1807g.zurt()) {
                C1819o.m7160n(intentZy);
                intentZy.setComponent(new ComponentName("com.android.thememanager", "com.android.thememanager.module.detail.view.ThemeDetailActivity"));
            }
            C2202k.this.getActivity().startActivity(intentZy);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.view.fragment.k$toq */
    /* JADX INFO: compiled from: FontSettingFragment.java */
    class toq implements jp0y<List<Resource>> {
        toq() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(@dd List<Resource> resources) {
            if (resources == null || resources.size() > 3) {
                C2202k.this.f12977f.setVisibility(0);
            } else {
                C2202k.this.f12977f.setVisibility(8);
            }
            for (int i2 = 0; i2 < 3; i2++) {
                if (resources == null || i2 >= resources.size()) {
                    C2202k.this.f12978j[i2].setVisibility(8);
                } else {
                    C2202k.this.f12978j[i2].setVisibility(0);
                    C2202k.this.bqie(i2, resources.get(i2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.setting.view.fragment.k$zy */
    /* JADX INFO: compiled from: FontSettingFragment.java */
    class zy implements View.OnClickListener {
        zy() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            Intent intentM9545q = com.android.thememanager.toq.m9545q(C2202k.this.getActivity());
            if (C1807g.zurt()) {
                intentM9545q.putExtra("REQUEST_RESOURCE_CODE", "fonts");
            }
            C2202k.this.getActivity().startActivity(intentM9545q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bqie(int pos, Resource resource) {
        String strMo8297h = kiv().mo8297h(resource);
        if (!TextUtils.isEmpty(strMo8297h)) {
            if (C1819o.x9kr()) {
                this.f12981o[pos].setScaleType(ImageView.ScaleType.FIT_END);
            } else {
                this.f12981o[pos].setScaleType(ImageView.ScaleType.FIT_START);
            }
            x2.C1735g c1735gFn3e = x2.fn3e();
            c1735gFn3e.fti(C1819o.d2ok(getActivity()));
            x2.m6782y(getActivity(), strMo8297h, this.f12981o[pos], c1735gFn3e);
            C1812k.toq(this.f12981o[pos], resource.getLocalInfo().getTitle());
        }
        this.f12978j[pos].setOnClickListener(new q(resource));
        String strN7h = kiv().n7h(resource);
        String strO1t = C2320q.o1t(getActivity(), "fonts");
        if (TextUtils.isEmpty(strN7h) || !strN7h.equals(strO1t)) {
            this.f12980m[pos].setVisibility(8);
        } else {
            this.f12980m[pos].setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1bi() {
        if (this.f12975c == null) {
            View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.offline_view, (ViewGroup) null, true);
            this.f12975c = viewInflate;
            this.f12976e.addHeaderView(viewInflate);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f12975c.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams.gravity = 1;
            this.f12975c.setLayoutParams(layoutParams);
            this.f12975c.setOnClickListener(new f7l8());
        }
        this.f12975c.setVisibility(0);
        C6077k.cdj(this.f12975c);
    }

    private void g0ad() {
        this.f12979l = LayoutInflater.from(getActivity()).inflate(R.layout.me_font_setting_header, this.f12982r, false);
        int[] iArr = {R.id.font_1, R.id.font_2, R.id.font_3};
        for (int i2 = 0; i2 < 3; i2++) {
            this.f12978j[i2] = this.f12979l.findViewById(iArr[i2]);
            this.f12981o[i2] = (ImageView) this.f12978j[i2].findViewById(R.id.thumbnail);
            this.f12980m[i2] = (ImageView) this.f12978j[i2].findViewById(R.id.center_flag);
            View view = this.f12978j[i2];
            C6077k.x2(view, view);
        }
        kiv().x2(this, new toq());
        View viewFindViewById = this.f12979l.findViewById(R.id.card_view_more);
        this.f12977f = viewFindViewById;
        C6077k.ld6(viewFindViewById);
        this.f12977f.setOnClickListener(new zy());
    }

    private void imd() {
        IRecommendListView iRecommendListViewBuild = C1394k.m5862q().setContext(this).setResCode("fonts").setRefresh(false).setSettingPage(true).setLayoutManagerType(1).setRequest(new g()).setCallBack(new n()).build();
        this.f12976e = iRecommendListViewBuild;
        iRecommendListViewBuild.addHeaderView(this.f12979l);
        if (!C1807g.m7081r()) {
            this.f12976e.setPadding(0, 0, 0, getResources().getDimensionPixelOffset(R.dimen.me_settings_list_padding_bottom));
        }
        this.f12982r.addView(this.f12976e, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wt() {
        View view = this.f12975c;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: el, reason: merged with bridge method [inline-methods] */
    public InterfaceC7629k.k uv6() {
        return new FontSettingPresenter();
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        String str = this.f9877s;
        return str != null ? String.format(com.android.thememanager.basemodule.analysis.toq.dkhc, str) : super.m2t();
    }

    @Override // androidx.fragment.app.Fragment
    @dd
    public View onCreateView(LayoutInflater inflater, @dd ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.me_fragment_font_setting, container, false);
        this.f12982r = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.button);
        C6077k.m22369i(viewFindViewById);
        viewFindViewById.setOnClickListener(new k());
        if (!com.android.thememanager.basemodule.utils.toq.m7224q("fonts") || C1807g.m7081r()) {
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.setVisibility(0);
        }
        g0ad();
        imd();
        if (com.android.thememanager.basemodule.utils.toq.m7224q("fonts")) {
            this.f12976e.refreshData();
        }
        return this.f12982r;
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.basemodule.privacy.C1781k.f7l8
    public void y9n(boolean agree) {
        super.y9n(agree);
        if (agree) {
            this.f12976e.refreshData();
        }
    }
}

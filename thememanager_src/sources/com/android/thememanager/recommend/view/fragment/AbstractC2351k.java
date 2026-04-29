package com.android.thememanager.recommend.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n7h;
import androidx.viewpager.widget.ViewPager;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.kja0;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.views.InterfaceC1870y;
import com.android.thememanager.basemodule.views.nav.C1857k;
import com.android.thememanager.basemodule.views.nav.NavViewContainer;
import com.android.thememanager.recommend.view.widget.nav.NavViewTopContainer;
import com.google.gson.C4871g;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import se.C7669k;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.k */
/* JADX INFO: compiled from: BaseRecommendTabFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2351k extends com.android.thememanager.basemodule.base.toq implements InterfaceC1870y {

    /* JADX INFO: renamed from: o */
    private static final String f13641o = "BaseRecommendTabFragment";

    /* JADX INFO: renamed from: l */
    private ViewPager f13646l;

    /* JADX INFO: renamed from: r */
    private NavViewContainer f13647r;

    /* JADX INFO: renamed from: t */
    protected View f13648t;

    /* JADX INFO: renamed from: f */
    private final ArrayList<String> f13644f = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private final ArrayList<C1857k> f13642c = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    private final ArrayList<com.android.thememanager.basemodule.model.flextab.toq> f13643e = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    private String f13645j = null;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.k$k */
    /* JADX INFO: compiled from: BaseRecommendTabFragment.java */
    class k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f13649k;

        k(final String val$trackId) {
            this.f13649k = val$trackId;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayMap<String, Object> arrayMapZy = C1706p.zy(AbstractC2351k.this.l05());
            arrayMapZy.put("contentType", this.f13649k);
            com.android.thememanager.basemodule.analysis.zy.m6681q(arrayMapZy);
            kja0.f7l8(AbstractC2351k.this.o5(), this.f13649k, new C4871g().o1t(arrayMapZy));
            C1708s.f7l8().ld6().ni7(C1706p.n7h(AbstractC2351k.this.o5(), this.f13649k, arrayMapZy));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.k$q */
    /* JADX INFO: compiled from: BaseRecommendTabFragment.java */
    class q implements ViewPager.InterfaceC1284p {
        q() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        /* JADX INFO: renamed from: k */
        public void mo5550k(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void toq(int i2) {
            AbstractC2351k.this.f13647r.setSelectedPosition(i2);
            AbstractC2351k.this.yp31();
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void zy(int i2, float v2, int i12) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.k$toq */
    /* JADX INFO: compiled from: BaseRecommendTabFragment.java */
    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            String strRp = AbstractC2351k.this.rp();
            if ("hybrid".equals(strRp)) {
                strRp = "theme";
            }
            ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.n358);
            arrayMapZy.put("contentType", strRp);
            C1708s.f7l8().ld6().ni7(arrayMapZy);
            AbstractC2351k.this.startActivity(com.android.thememanager.toq.kja0(AbstractC2351k.this.getActivity(), strRp));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.k$zy */
    /* JADX INFO: compiled from: BaseRecommendTabFragment.java */
    class zy implements NavViewContainer.InterfaceC1856q {
        zy() {
        }

        @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer.InterfaceC1856q
        /* JADX INFO: renamed from: k */
        public void mo6323k(int position) {
            if (C1819o.eqxt(AbstractC2351k.this.getActivity())) {
                AbstractC2351k.this.f13646l.setCurrentItem(position);
            }
        }

        @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer.InterfaceC1856q
        public void toq() {
        }
    }

    private void r6ty() {
        ImageView imageView = (ImageView) this.f13648t.findViewById(R.id.iv_search);
        if (C1807g.zurt()) {
            imageView.setVisibility(8);
        }
        C6077k.f7l8(imageView);
        if (!o1t.n7h()) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.recommend_search_padding);
            imageView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            imageView.setImageResource(R.drawable.home_search);
        } else if (!C1819o.d2ok(getActivity())) {
            imageView.setAlpha(1.0f);
        }
        imageView.setOnClickListener(new toq());
        NavViewContainer navViewContainer = (NavViewContainer) this.f13648t.findViewById(R.id.nav_container);
        this.f13647r = navViewContainer;
        navViewContainer.mo7342q(this.f13642c);
        this.f13647r.setOnItemClickListener(new zy());
        C7669k c7669k = new C7669k(getActivity(), getChildFragmentManager(), this.f13643e, o5(), cyoe());
        ViewPager viewPager = (ViewPager) this.f13648t.findViewById(R.id.viewPager);
        this.f13646l = viewPager;
        viewPager.setOffscreenPageLimit(1);
        this.f13646l.setOnPageChangeListener(new q());
        this.f13646l.setAdapter(c7669k);
    }

    private void zff0(Intent intent) {
        if (!TextUtils.isEmpty(this.f13645j) && !this.f13645j.equals(this.f13642c.get(0).toq())) {
            el(this.f13645j);
        } else if (intent.hasExtra("EXTRA_TAB_ID")) {
            el(intent.getStringExtra("EXTRA_TAB_ID"));
        } else {
            yp31();
        }
    }

    protected void bih(String resCode, C1857k navItem, com.android.thememanager.basemodule.model.flextab.toq flexTab) {
        if (this.f13644f.contains(resCode)) {
            return;
        }
        this.f13644f.add(resCode);
        this.f13642c.add(navItem);
        this.f13643e.add(flexTab);
    }

    protected abstract String cyoe();

    @Override // com.android.thememanager.basemodule.views.InterfaceC1870y
    public void d2ok() {
        n7h n7hVarYw = yw();
        if (n7hVarYw instanceof InterfaceC1870y) {
            ((InterfaceC1870y) n7hVarYw).d2ok();
        }
    }

    public String ec() {
        if (this.f13644f.size() > 0) {
            return this.f13644f.get(0);
        }
        return null;
    }

    public void el(String requestTabId) {
        boolean z2;
        ArrayList<C1857k> arrayList = this.f13642c;
        if (arrayList == null || arrayList.size() == 0 || this.f13647r == null) {
            this.f13645j = requestTabId;
            return;
        }
        if (TextUtils.isEmpty(requestTabId)) {
            z2 = false;
        } else {
            for (int i2 = 0; i2 < this.f13642c.size(); i2++) {
                if (requestTabId.equals(this.f13642c.get(i2).toq())) {
                    this.f13647r.m7341n(i2);
                    this.f13646l.setCurrentItem(i2);
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (z2) {
            return;
        }
        this.f13647r.m7341n(0);
        this.f13646l.setCurrentItem(0);
    }

    public void g0ad() {
        NavViewContainer navViewContainer = this.f13647r;
        if (navViewContainer instanceof NavViewTopContainer) {
            ((NavViewTopContainer) navViewContainer).m8851s();
        }
    }

    protected abstract String l05();

    protected abstract String o5();

    @Override // androidx.fragment.app.Fragment
    @dd
    public View onCreateView(LayoutInflater inflater, @dd ViewGroup container, Bundle savedInstanceState) {
        this.f13648t = inflater.inflate(R.layout.rc_fragment_recommend_tab_page, container, false);
        C1819o.zy(getActivity(), this.f13648t);
        return this.f13648t;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@lvui View view, @dd Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        wt();
        r6ty();
        zff0(getActivity().getIntent());
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public void ra(boolean visibleForUser) {
        if (this.f13643e.size() > 0) {
            Fragment fragmentYw = yw();
            if (fragmentYw instanceof com.android.thememanager.basemodule.base.toq) {
                ((com.android.thememanager.basemodule.base.toq) fragmentYw).nnh(visibleForUser);
            }
        }
    }

    public String rp() {
        NavViewContainer navViewContainer = this.f13647r;
        if (navViewContainer == null) {
            return null;
        }
        int selectedPosition = navViewContainer.getSelectedPosition();
        if (selectedPosition < 0 || selectedPosition >= this.f13644f.size()) {
            selectedPosition = 0;
        }
        return this.f13644f.size() > 0 ? this.f13644f.get(selectedPosition) : "theme";
    }

    protected void wt() {
        List<com.android.thememanager.basemodule.model.flextab.toq> listZurt = p001b.toq.zurt(o5());
        if (listZurt != null) {
            for (com.android.thememanager.basemodule.model.flextab.toq toqVar : listZurt) {
                if (toqVar.mo6880y(o5())) {
                    bih(toqVar.m6881q(), new C1857k(toqVar.m6881q(), R.drawable.banner_text_bottom, toqVar.mo6879n()), toqVar);
                }
            }
        }
    }

    protected void yp31() {
        kja0.f9714g.execute(new k(rp()));
    }

    @dd
    public Fragment yw() {
        int selectedPosition = this.f13647r.getSelectedPosition();
        if (selectedPosition < 0 || selectedPosition >= this.f13643e.size()) {
            selectedPosition = 0;
        }
        if (this.f13643e.size() > 0) {
            return ((C7669k) this.f13646l.getAdapter()).getItem(selectedPosition);
        }
        return null;
    }
}

package com.android.thememanager.v9;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.OriginalViewPager;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.activity.bf2;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.basemodule.views.nav.C1857k;
import com.android.thememanager.basemodule.views.nav.NavViewContainer;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.qrj;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.util.gc3c;
import com.android.thememanager.v9.model.NavItemFac;
import java.util.ArrayList;
import java.util.List;
import miuix.viewpager.widget.ViewPager;
import p001b.InterfaceC1357q;
import zy.dd;

/* JADX INFO: renamed from: com.android.thememanager.v9.k */
/* JADX INFO: compiled from: BaseTabFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2865k extends C1582h {

    /* JADX INFO: renamed from: a */
    private bf2 f17152a;

    /* JADX INFO: renamed from: b */
    private HorizontalScrollView f17153b;

    /* JADX INFO: renamed from: c */
    private ArrayList<C1857k> f17154c;

    /* JADX INFO: renamed from: e */
    private NavViewContainer f17155e;

    /* JADX INFO: renamed from: j */
    private ImageView f17157j;

    /* JADX INFO: renamed from: m */
    private ViewPager f17158m;

    /* JADX INFO: renamed from: o */
    private FragmentManager f17159o;

    /* JADX INFO: renamed from: x */
    private float f17161x;

    /* JADX INFO: renamed from: f */
    protected List<String> f17156f = new ArrayList();

    /* JADX INFO: renamed from: u */
    private int f17160u = -1;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private OriginalViewPager.InterfaceC1274p f61477bo = new zy();

    /* JADX INFO: renamed from: com.android.thememanager.v9.k$k */
    /* JADX INFO: compiled from: BaseTabFragment.java */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            AbstractC2865k.this.l05(false, "");
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.k$toq */
    /* JADX INFO: compiled from: BaseTabFragment.java */
    class toq implements NavViewContainer.InterfaceC1856q {
        toq() {
        }

        @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer.InterfaceC1856q
        /* JADX INFO: renamed from: k */
        public void mo6323k(int position) {
            if (position == AbstractC2865k.this.f17160u) {
                return;
            }
            AbstractC2865k.this.btvn(position);
            AbstractC2865k.this.f17155e.setSelectedPosition(position);
            AbstractC2865k.this.f17158m.setCurrentItem(position);
            AbstractC2865k.this.f17160u = position;
        }

        @Override // com.android.thememanager.basemodule.views.nav.NavViewContainer.InterfaceC1856q
        public void toq() {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.k$zy */
    /* JADX INFO: compiled from: BaseTabFragment.java */
    class zy implements OriginalViewPager.InterfaceC1274p {
        zy() {
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.InterfaceC1274p
        /* JADX INFO: renamed from: k */
        public void mo5546k(int state) {
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.InterfaceC1274p
        public void toq(int position) {
            AbstractC2865k.this.f17155e.setSelectedPosition(position);
            AbstractC2865k.this.f17160u = position;
            if (AbstractC2865k.this.f17155e.getSelectedView() != null) {
                AbstractC2865k.this.f17153b.smoothScrollTo(r3.getLeft() - ((int) AbstractC2865k.this.f17161x), 0);
            }
        }

        @Override // androidx.viewpager.widget.OriginalViewPager.InterfaceC1274p
        public void zy(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    private void bqie() {
        this.f17154c = new ArrayList<>();
        for (String str : this.f17156f) {
            if (com.android.thememanager.basemodule.utils.toq.m7224q(str)) {
                this.f17154c.add(NavItemFac.NavTopItemFactory.create(str));
            }
        }
        if (this.f17154c.isEmpty()) {
            nn86.m7150k(R.string.region_not_support, 1);
            return;
        }
        for (int i2 = 0; i2 < this.f17154c.size(); i2++) {
            String qVar = this.f17154c.get(i2).toq();
            boolean zEquals = "hybrid".equals(qVar);
            com.android.thememanager.fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(zEquals ? "theme" : qVar);
            qrj.C2321k c2321kM8495k = com.android.thememanager.qrj.m8495k(getActivity().getIntent(), fu4VarM10535g, imd(fu4VarM10535g, zEquals));
            this.f17152a.ni7(qVar, c2321kM8495k.f60623toq, c2321kM8495k.f60624zy);
            Fragment fragmentM6391z = this.f17152a.m6391z(i2, true);
            if (fragmentM6391z instanceof C1582h) {
                ((C1582h) fragmentM6391z).cyoe(c2321kM8495k.f60624zy);
            }
        }
    }

    private Fragment f1bi() {
        int i2 = this.f17160u;
        if (i2 < 0) {
            return null;
        }
        return this.f17159o.nmn5(this.f17154c.get(i2).toq());
    }

    private void gb() {
        this.f17155e.mo7342q(this.f17154c);
        this.f17155e.setOnItemClickListener(new toq());
        kq2f(getActivity().getIntent());
    }

    private void kbj() {
        this.f17159o = getChildFragmentManager();
        this.f17152a = new bf2(getActivity(), this.f17159o, this.f17158m);
        this.f17161x = getResources().getDimension(R.dimen.top_selected_banner_padding_left_width);
        bqie();
        this.f17158m.setOffscreenPageLimit(this.f17154c.size());
        this.f17158m.setOnPageChangeListener(this.f61477bo);
    }

    private void kq2f(Intent intent) {
        String stringExtra = "hybrid";
        if (intent.hasExtra("EXTRA_TAB_ID")) {
            stringExtra = intent.getStringExtra("EXTRA_TAB_ID");
        } else if (!this.f17156f.contains("hybrid")) {
            stringExtra = "theme";
        }
        xm(stringExtra);
    }

    protected void btvn(int position) {
    }

    protected abstract PageGroup imd(com.android.thememanager.fu4 resContext, boolean isHybrid);

    @Override // com.android.thememanager.activity.C1582h
    public void l05(boolean isSearchFromAudio, String searchContent) {
        String resourceCode;
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.setComponent(((SearchManager) getActivity().getSystemService(C2656k.f15718s)).getSearchableInfo(getActivity().getComponentName()).getSearchActivity());
        Fragment fragmentF1bi = f1bi();
        if (!(fragmentF1bi instanceof C1582h) || (resourceCode = ((C1582h) fragmentF1bi).bih().getResourceCode()) == null) {
            resourceCode = "hybrid";
        }
        intent.putExtra("REQUEST_RESOURCE_CODE", resourceCode);
        intent.putExtra(isSearchFromAudio ? InterfaceC1357q.f53866eqxt : InterfaceC1357q.f53941t8iq, searchContent);
        startActivityForResult(intent, 1);
    }

    protected abstract void mj();

    public void ob() {
        int i2 = this.f17160u;
        if (i2 >= 0) {
            Fragment fragmentNmn5 = this.f17159o.nmn5(this.f17154c.get(i2).toq());
            if (fragmentNmn5 instanceof C1582h) {
                ((C1582h) fragmentNmn5).ec();
            }
        }
    }

    @Override // com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(@dd Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        kbj();
        gb();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        mj();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_v10_home_page, container, false);
        ((FrameLayout) viewInflate.findViewById(R.id.ll_tab_container)).setPadding(0, y9n.jp0y() ? gc3c.m9779k(32.0f) : gc3c.qrj(getResources()), 0, 0);
        this.f17155e = (NavViewContainer) viewInflate.findViewById(R.id.nav_container);
        this.f17153b = (HorizontalScrollView) viewInflate.findViewById(R.id.scroll_view);
        this.f17158m = (ViewPager) viewInflate.findViewById(R.id.viewPager);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_search);
        this.f17157j = imageView;
        imageView.setOnClickListener(new k());
        return viewInflate;
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public void ra(boolean visibleForUser) {
        super.ra(visibleForUser);
        bf2 bf2Var = this.f17152a;
        if (bf2Var == null || bf2Var.mo5575n() <= 0) {
            return;
        }
        Fragment fragmentF1bi = f1bi();
        if (fragmentF1bi instanceof C1582h) {
            ((C1582h) fragmentF1bi).nnh(visibleForUser);
        }
    }

    public C1857k tww7() {
        int i2 = this.f17160u;
        if (i2 >= 0) {
            return this.f17154c.get(i2);
        }
        return null;
    }

    public void xm(String requestTabId) {
        boolean z2;
        if (this.f17154c == null) {
            return;
        }
        if (TextUtils.isEmpty(requestTabId)) {
            z2 = false;
        } else {
            for (int i2 = 0; i2 < this.f17154c.size(); i2++) {
                if (requestTabId.equals(this.f17154c.get(i2).toq())) {
                    this.f17155e.m7341n(i2);
                    this.f17158m.setCurrentItem(i2);
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (z2) {
            return;
        }
        this.f17155e.m7341n(0);
        this.f17158m.setCurrentItem(0);
    }
}

package com.android.thememanager.module.detail.view;

import a98o.C0004k;
import a98o.C0005q;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0924e;
import androidx.viewpager.widget.ViewPager;
import c8jq.InterfaceC1392k;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1627v;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1802c;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.ScreenShotReportManager;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.basemodule.views.NestViewPager;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.detail.theme.view.widget.MoreResourceBar;
import com.android.thememanager.model.LargeIconElement;
import com.android.thememanager.module.detail.presenter.C2241y;
import com.android.thememanager.module.detail.util.InterfaceC2245k;
import com.android.thememanager.recommend.player.AdAutoPlayer;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.search.C2479k;
import com.android.thememanager.util.C2821y;
import com.google.gson.C4871g;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import miuix.springback.view.SpringBackLayout;
import p001b.InterfaceC1357q;
import y2.C7776k;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeDetailActivity extends AbstractActivityC1717k implements RestoreHomeIconHelper.toq, AdAutoPlayer.InterfaceC2345k, InterfaceC2245k {
    private static final int ac = 3;
    private static final int ad = 4;
    private static final int am = 5;
    private static final String as = "resource_ids";
    private static final int ax = 1;
    private static final int ay = 200;
    private static final String az = "restore_dialog";
    private static final int ba = 0;
    private static final String bg = "resource";
    private static final String bl = "current_position";
    private static final int bq = 2;
    private static final String in = "has_user_swipe";

    /* JADX INFO: renamed from: a */
    private String f13191a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private OnlineResourceDetail f60544ab;
    private AdAutoPlayer an;

    /* JADX INFO: renamed from: b */
    private TextView f13192b;
    private Resource bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private retrofit2.toq<CommonResponse<UIPage>> f60545bo;
    private ArrayList<C0005q<String, String>> bp;

    /* JADX INFO: renamed from: f */
    private C2253q f13196f;
    private C2241y id;

    /* JADX INFO: renamed from: j */
    private MoreResourceBar f13197j;

    /* JADX INFO: renamed from: l */
    private NestViewPager f13198l;

    /* JADX INFO: renamed from: m */
    private View f13199m;

    /* JADX INFO: renamed from: o */
    private ViewGroup f13200o;

    /* JADX INFO: renamed from: r */
    private SpringBackLayout f13201r;

    /* JADX INFO: renamed from: v */
    private int f13203v;

    /* JADX INFO: renamed from: w */
    private zy f13204w;

    /* JADX INFO: renamed from: c */
    private final ArrayList<Bundle> f13193c = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    private boolean f13195e = false;

    /* JADX INFO: renamed from: x */
    private int f13205x = 0;

    /* JADX INFO: renamed from: u */
    private final int f13202u = com.android.thememanager.basemodule.network.theme.toq.toq();

    /* JADX INFO: renamed from: d */
    private int f13194d = -1;
    private boolean bv = false;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ThemeDetailActivity$k */
    class C2252k implements ViewPager.InterfaceC1284p {
        C2252k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: n */
        public /* synthetic */ void m8398n(Fragment fragment) {
            ((InterfaceC1392k.n) fragment).mo5848u(null);
            ThemeDetailActivity.this.wlev(fragment);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        /* JADX INFO: renamed from: k */
        public void mo5550k(int i2) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void toq(int i2) {
            if (!ThemeDetailActivity.this.f13195e && ThemeDetailActivity.this.f13203v != i2) {
                ThemeDetailActivity.this.f13195e = true;
                PreferenceManager.getDefaultSharedPreferences(ThemeDetailActivity.this).edit().putBoolean(ThemeDetailActivity.in, true).apply();
                ThemeDetailActivity.this.o05(false, false);
            }
            ThemeDetailActivity themeDetailActivity = ThemeDetailActivity.this;
            themeDetailActivity.b9ub(themeDetailActivity.f13203v, i2);
            ThemeDetailActivity.this.f13203v = i2;
            final Fragment item = ThemeDetailActivity.this.f13196f.getItem(i2);
            if (item instanceof zy) {
                ThemeDetailActivity.this.f13204w = (zy) item;
            } else {
                ThemeDetailActivity.this.f13204w = null;
            }
            if (i2 == ThemeDetailActivity.this.f13196f.mo5575n() - 2 && (item instanceof InterfaceC1392k.n)) {
                ((InterfaceC1392k.n) item).mo5848u(new InterfaceC1392k.n.k() { // from class: com.android.thememanager.module.detail.view.wo
                    @Override // c8jq.InterfaceC1392k.n.k
                    /* JADX INFO: renamed from: k */
                    public final void mo5850k() {
                        this.f13378k.m8398n(item);
                    }
                });
            }
            if (!com.android.thememanager.basemodule.utils.kja0.qrj(ThemeDetailActivity.this.bp) || i2 < ThemeDetailActivity.this.bp.size()) {
                ThemeDetailActivity themeDetailActivity2 = ThemeDetailActivity.this;
                themeDetailActivity2.cnbm((String) ((C0005q) themeDetailActivity2.bp.get(i2)).first, p001b.toq.m5744q(ThemeDetailActivity.this.f60544ab.category));
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void zy(int i2, float v2, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.ThemeDetailActivity$q */
    class C2253q extends androidx.fragment.app.fu4 implements NestViewPager.InterfaceC1846k<Fragment> {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private boolean f60546cdj;

        /* JADX INFO: renamed from: h */
        private Pair<Integer, Fragment> f13207h;

        public C2253q(FragmentManager fm) {
            super(fm);
            this.f13207h = new Pair<>(-1, null);
            this.f60546cdj = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o1t(y9n y9nVar) {
            y9nVar.mo5848u(null);
            ThemeDetailActivity.this.wlev(y9nVar);
            ThemeDetailActivity.this.o05(true, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void wvg() {
            this.f60546cdj = true;
        }

        @Override // androidx.fragment.app.fu4, androidx.viewpager.widget.AbstractC1288k
        public void cdj(ViewGroup container, int position, Object object) {
            super.cdj(container, position, object);
            this.f13207h = new Pair<>(Integer.valueOf(position), (Fragment) object);
        }

        @Override // androidx.viewpager.widget.AbstractC1288k
        /* JADX INFO: renamed from: n */
        public int mo5575n() {
            return ThemeDetailActivity.this.f13193c.size();
        }

        @Override // com.android.thememanager.basemodule.views.NestViewPager.InterfaceC1846k
        @zy.lvui
        /* JADX INFO: renamed from: zurt, reason: merged with bridge method [inline-methods] */
        public Fragment getItem(int position) {
            Object obj;
            if (((Integer) this.f13207h.first).intValue() == position && (obj = this.f13207h.second) != null) {
                return (Fragment) obj;
            }
            int i2 = ThemeDetailActivity.this.f13194d;
            final y9n ikckVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? new ikck() : new C1627v() : C1807g.m7081r() ? new C2479k() : new C2303z() : new C2290t() : new ki() : new uj2j();
            ikckVar.setArguments((Bundle) ThemeDetailActivity.this.f13193c.get(position));
            if (this.f60546cdj) {
                this.f60546cdj = false;
                if (ikckVar instanceof zy) {
                    ThemeDetailActivity.this.f13204w = (zy) ikckVar;
                }
                ikckVar.mo5848u(new InterfaceC1392k.n.k() { // from class: com.android.thememanager.module.detail.view.d8wk
                    @Override // c8jq.InterfaceC1392k.n.k
                    /* JADX INFO: renamed from: k */
                    public final void mo5850k() {
                        this.f13234k.o1t(ikckVar);
                    }
                });
            }
            return ikckVar;
        }
    }

    class toq extends GestureDetector.SimpleOnGestureListener {
        toq() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e2) {
            if (ThemeDetailActivity.this.f13204w == null) {
                return true;
            }
            ThemeDetailActivity.this.f13204w.g1();
            return true;
        }
    }

    public interface zy {
        void g1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b9ub(int mCurrentPosition, int newPosition) {
        if (mCurrentPosition == newPosition) {
            return;
        }
        String str = mCurrentPosition < newPosition ? "left" : "right";
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("resourceType", p001b.toq.m5744q(this.f60544ab.category));
        arrayMapM6679k.put("content", str);
        com.android.thememanager.basemodule.analysis.kja0.m6641s("SWIPE", "online_theme_detail_page", null, new C4871g().o1t(arrayMapM6679k));
        C1708s.f7l8().ld6().d3(C1706p.n7h("online_theme_detail_page", null, arrayMapM6679k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bap7(OnlineResourceDetail onlineResourceDetail) {
        if (onlineResourceDetail != null) {
            uc(onlineResourceDetail);
        } else {
            gcp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cnbm(@zy.dd String resourceId, String componentCode) {
        if (TextUtils.isEmpty(resourceId)) {
            return;
        }
        String strNi7 = C1688q.cdj().ni7();
        ArrayMap arrayMap = new ArrayMap(4);
        arrayMap.put("resourceType", componentCode);
        arrayMap.put(com.android.thememanager.basemodule.analysis.toq.tvn8, Boolean.valueOf(!nsb()));
        com.android.thememanager.basemodule.analysis.zy.m6681q(arrayMap);
        com.android.thememanager.basemodule.analysis.kja0.m6640p("T_EXPOSE", "online_theme_detail_page", resourceId, strNi7, new C4871g().o1t(arrayMap));
        C1708s.f7l8().ld6().cdj(C1706p.n7h("online_theme_detail_page", resourceId, arrayMap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ebn(UICard uiCard) {
        if (C1819o.eqxt(this) && !com.android.thememanager.basemodule.utils.kja0.qrj(uiCard.recommends)) {
            this.f13205x++;
            for (int i2 = 0; i2 < uiCard.recommends.size(); i2++) {
                UIImageWithLink uIImageWithLink = uiCard.recommends.get(i2);
                UILink uILink = uIImageWithLink.link;
                if (uILink != null) {
                    ukdy(new C0005q<>(uILink.link, uILink.trackId), false);
                    ArrayList<C0005q<String, String>> arrayList = this.bp;
                    UILink uILink2 = uIImageWithLink.link;
                    arrayList.add(new C0005q<>(uILink2.link, uILink2.trackId));
                }
            }
            this.f13196f.x2();
            o05(true, false);
        }
    }

    private void ga() {
        int i2 = this.f13194d;
        if (i2 == 0) {
            C7776k.m28157y().qrj(this);
            return;
        }
        if (i2 == 1) {
            C7776k.m28157y().m28160p(this);
        } else if (i2 == 2) {
            C7776k.m28157y().ld6(this);
        } else if (i2 == 5) {
            C7776k.m28157y().x2(this);
        }
    }

    private void gcp() {
        this.f13200o.setVisibility(0);
        this.f13199m.setVisibility(8);
        this.f13201r.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h4b(boolean z2, boolean z3) {
        if (!z2) {
            if (this.f13197j.isShown()) {
                this.f13197j.m7776k(z3);
            }
        } else {
            if (this.f13197j.isShown() || this.f13195e || this.f13203v >= this.bp.size() - 1) {
                return;
            }
            this.f13197j.zy(z3);
        }
    }

    private void h7am() {
        int i2 = this.f13194d;
        if (i2 == 0) {
            C7776k.m28157y().m28159n(this);
            return;
        }
        if (i2 == 1) {
            C7776k.m28157y().toq(this);
        } else if (i2 == 2) {
            C7776k.m28157y().zy(this);
        } else if (i2 == 5) {
            C7776k.m28157y().m28161q(this);
        }
    }

    private void ixz(Resource resource, String componentCode, boolean isLocal) {
        boolean booleanExtra = getIntent().getBooleanExtra(InterfaceC1357q.f53906lvui, false);
        boolean booleanExtra2 = getIntent().getBooleanExtra(InterfaceC1357q.f53963x9kr, false);
        getIntent().removeExtra(InterfaceC1357q.f53906lvui);
        getIntent().removeExtra(InterfaceC1357q.f53963x9kr);
        Bundle bundle = new Bundle();
        int i2 = this.f13194d;
        if (i2 == 0) {
            bundle.putSerializable("resource", resource);
            bundle.putBoolean(y9n.f13386d, isLocal);
            bundle.putBoolean("auto_restore", booleanExtra2);
            bundle.putBoolean("auto_buy", booleanExtra);
        } else if (i2 == 1) {
            bundle.putSerializable("resource", resource);
            bundle.putBoolean(y9n.f13386d, isLocal);
        } else if (i2 == 2) {
            bundle.putSerializable("resource", resource);
            bundle.putString("resource_code", componentCode);
            bundle.putBoolean(y9n.f13386d, isLocal);
        } else if (i2 == 3) {
            bundle.putSerializable("resource", resource);
            bundle.putString("resource_code", componentCode);
            bundle.putBoolean(y9n.f13386d, isLocal);
            bundle.putBoolean("auto_restore", booleanExtra2);
            bundle.putBoolean("auto_buy", booleanExtra);
            bundle.putBoolean("auto_buy", booleanExtra);
        } else if (i2 == 5) {
            bundle.putSerializable("resource", resource);
            bundle.putString("resource_code", componentCode);
            bundle.putBoolean(y9n.f13386d, isLocal);
        } else {
            bundle.putSerializable("resource", resource);
            bundle.putString("resource_code", componentCode);
            bundle.putBoolean(y9n.f13386d, isLocal);
        }
        this.f13193c.add(bundle);
        if (this.f13203v == 0) {
            cnbm(resource.getOnlineId(), componentCode);
        }
    }

    private String jbh(Intent intent) {
        String stringExtra = intent.getStringExtra(InterfaceC1357q.f53892jk);
        if (!TextUtils.isEmpty(stringExtra)) {
            return stringExtra;
        }
        Uri data = intent.getData();
        if (data != null) {
            Matcher matcher = Pattern.compile(InterfaceC1925p.q3).matcher(data.getPath());
            matcher.find();
            try {
                return matcher.group();
            } catch (IllegalStateException unused) {
            }
        }
        if (nsb()) {
            return stringExtra;
        }
        Resource resource = (Resource) com.android.thememanager.basemodule.utils.kja0.m7108g((C0004k) com.android.thememanager.basemodule.utils.kja0.m7108g(C2082k.zy().ld6(), intent.getIntExtra(InterfaceC1357q.f53893jp0y, 0)), intent.getIntExtra(InterfaceC1357q.f53879gvn7, 0));
        return resource != null ? resource.getOnlineId() : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lh(View view) {
        oki();
        this.id.uv6(this.bp.get(this.f13203v).first);
    }

    private void lw() {
        this.f13201r.setVisibility(0);
        this.f13199m.setVisibility(8);
        this.f13200o.setVisibility(8);
    }

    private static String mbx(int detailType) {
        return detailType != 1 ? detailType != 2 ? detailType != 3 ? detailType != 5 ? "theme" : "largeicons" : "fonts" : "icons" : "aod";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n2t(View view) {
        onBackPressed();
    }

    private boolean nsb() {
        return (getIntent().getData() != null && InterfaceC1357q.f53939se.equals(getIntent().getScheme())) || getIntent().getIntExtra(InterfaceC1357q.f53965y2, 2) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o05(final boolean show, final boolean noAnimation) {
        MoreResourceBar moreResourceBar = this.f13197j;
        if (moreResourceBar == null) {
            return;
        }
        moreResourceBar.postDelayed(new Runnable() { // from class: com.android.thememanager.module.detail.view.qo
            @Override // java.lang.Runnable
            public final void run() {
                this.f13336k.h4b(show, noAnimation);
            }
        }, 200L);
    }

    private void oki() {
        this.f13199m.setVisibility(0);
        this.f13200o.setVisibility(8);
        this.f13201r.setVisibility(8);
    }

    private void pc() {
        vep5();
        this.f13201r = (SpringBackLayout) findViewById(R.id.springBackLayout);
        NestViewPager nestViewPager = (NestViewPager) findViewById(R.id.view_pager);
        this.f13198l = nestViewPager;
        nestViewPager.setOffscreenPageLimit(1);
        C2253q c2253q = new C2253q(getSupportFragmentManager());
        this.f13196f = c2253q;
        this.f13198l.setAdapter(c2253q);
        this.f13198l.setOnPageChangeListener(new C2252k());
        boolean z2 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean(in, false);
        this.f13195e = z2;
        if (!z2 && !C1807g.a9()) {
            this.f13197j = new MoreResourceBar(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388693);
            ((FrameLayout) findViewById(R.id.root)).addView(this.f13197j, layoutParams);
            this.f13197j.measure(0, 0);
            layoutParams.setMarginEnd(-this.f13197j.getMeasuredWidth());
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.empty_view);
        this.f13200o = viewGroup;
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.tfm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13349k.lh(view);
            }
        });
        this.f13199m = findViewById(R.id.loading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean pjz9(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    private void uc(OnlineResourceDetail onlineResourceDetail) {
        if (C1819o.eqxt(this)) {
            lw();
            wx16(p001b.toq.m5744q(onlineResourceDetail.category));
            this.f60544ab = onlineResourceDetail;
            if (TextUtils.isEmpty(onlineResourceDetail.trackId) && !TextUtils.isEmpty(this.bp.get(this.f13203v).second)) {
                this.f60544ab.trackId = this.bp.get(this.f13203v).second;
            }
            int i2 = 0;
            while (i2 < this.bp.size()) {
                if (!C1807g.a9() || i2 == this.f13203v) {
                    ukdy(this.bp.get(i2), i2 == this.f13203v);
                }
                i2++;
            }
            this.f13196f.x2();
            this.f13198l.setCurrentItem(this.f13203v, false);
        }
    }

    private void ukdy(C0005q<String, String> ids, boolean isFirst) {
        if (!isFirst) {
            Bundle bundle = new Bundle();
            bundle.putString("online_id", ids.first);
            bundle.putString(y9n.f13388v, ids.second);
            bundle.putString("resource_code", mbx(this.f13194d));
            this.f13193c.add(bundle);
            return;
        }
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra(InterfaceC1357q.f53860dd, false);
        String stringExtra = intent.getStringExtra("commentId");
        String stringExtra2 = intent.getStringExtra("redeem_code");
        String stringExtra3 = intent.getStringExtra(InterfaceC1357q.f53862dxef);
        intent.removeExtra(InterfaceC1357q.f53860dd);
        intent.removeExtra("commentId");
        intent.removeExtra(InterfaceC1357q.f53862dxef);
        Bundle bundle2 = new Bundle();
        if (this.f13194d == 0) {
            OnlineResourceDetail onlineResourceDetail = this.f60544ab;
            if (onlineResourceDetail != null) {
                bundle2.putSerializable(y9n.f60577bo, onlineResourceDetail);
                bundle2.putString(y9n.f13388v, this.f60544ab.trackId);
            } else {
                bundle2.putString("online_id", ids.first);
                bundle2.putString(y9n.f13388v, ids.second);
            }
            bundle2.putBoolean(uj2j.th6, booleanExtra);
            bundle2.putString("comment_id", stringExtra);
            bundle2.putString("redeem_code", stringExtra2);
            bundle2.putString(uj2j.ndjo, stringExtra3);
        } else {
            OnlineResourceDetail onlineResourceDetail2 = this.f60544ab;
            if (onlineResourceDetail2 != null) {
                bundle2.putSerializable(y9n.f60577bo, onlineResourceDetail2);
            } else {
                bundle2.putString("online_id", ids.first);
                bundle2.putString(y9n.f13388v, ids.second);
            }
            bundle2.putString("resource_code", mbx(this.f13194d));
            bundle2.putString("redeem_code", stringExtra2);
        }
        this.f13193c.add(bundle2);
        this.f13196f.wvg();
        if (this.f13203v == 0) {
            cnbm(this.bp.get(0).first, p001b.toq.m5744q(this.f60544ab.category));
        }
    }

    private void vep5() {
        View viewFindViewById = findViewById(R.id.custom_action_bar_container);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
        if ("largeicons".equals(getIntent().getStringExtra("REQUEST_RESOURCE_CODE"))) {
            layoutParams.topMargin += getResources().getDimensionPixelOffset(R.dimen.large_icon_detail_page_action_bar_margin_top);
        } else {
            layoutParams.topMargin += C1819o.gvn7(getResources());
        }
        viewFindViewById.setLayoutParams(layoutParams);
        ImageView imageView = (ImageView) findViewById(R.id.back_icon);
        if (com.android.thememanager.basemodule.utils.o1t.kja0()) {
            imageView.setImageResource(R.drawable.regular_back_gte_v12);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.de_detail_action_bar_back_gte_v12_horizontal_padding);
            if (C1807g.m7081r()) {
                imageView.setPaddingRelative(dimensionPixelOffset, getResources().getDimensionPixelOffset(R.dimen.aod_detail_back_icon_top_padding), 0, getResources().getDimensionPixelOffset(R.dimen.aod_detail_back_icon_bottom_padding));
            } else {
                imageView.setPaddingRelative(dimensionPixelOffset, 0, 0, 0);
            }
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.qkj8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13335k.n2t(view);
            }
        });
        C1812k.m7106k(imageView, R.string.accessibiliy_description_content_back);
        imageView.measure(0, 0);
        if (imageView.getMeasuredHeight() > 0) {
            findViewById(R.id.more_icon_container).getLayoutParams().height = imageView.getMeasuredHeight();
        }
        final GestureDetector gestureDetector = new GestureDetector(this, new toq());
        findViewById(R.id.action_bar).setOnTouchListener(new View.OnTouchListener() { // from class: com.android.thememanager.module.detail.view.fnq8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ThemeDetailActivity.pjz9(gestureDetector, view, motionEvent);
            }
        });
        this.f13192b = (TextView) viewFindViewById.findViewById(R.id.custom_action_bar_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wlev(Fragment fragment) {
        if (C1807g.a9() || com.android.thememanager.basemodule.utils.qrj.zy(qrj.toq.THEME_DETAIL) || !zwy()) {
            return;
        }
        retrofit2.toq<CommonResponse<UIPage>> toqVar = this.f60545bo;
        if (toqVar != null) {
            toqVar.cancel();
        }
        int i2 = this.f13194d;
        if (i2 == 0) {
            this.f60545bo = ((uj2j) fragment).bap7(this.f13205x);
        } else if (i2 == 1) {
            this.f60545bo = ((ki) fragment).mo5846g(this.f13202u, this.f13205x);
        } else if (i2 == 2) {
            this.f60545bo = ((C2290t) fragment).mo5859g(this.f13202u, this.f13205x);
        } else if (i2 == 3) {
            this.f60545bo = ((C2303z) fragment).mo5859g(this.f13202u, this.f13205x);
        } else if (i2 == 5) {
            this.f60545bo = ((C1627v) fragment).mo5859g(this.f13202u, this.f13205x);
        } else {
            this.f60545bo = ((ikck) fragment).mo5859g(this.f13202u, this.f13205x);
        }
        this.id.vyq(this.f60545bo);
    }

    private void wx16(String componentCode) {
        if (TextUtils.isEmpty(componentCode)) {
            componentCode = "theme";
        }
        componentCode.hashCode();
        switch (componentCode) {
            case "aod":
                this.f13194d = 1;
                break;
            case "fonts":
                this.f13194d = 3;
                break;
            case "icons":
                this.f13194d = 2;
                break;
            case "theme":
                this.f13194d = 0;
                break;
            case "largeicons":
                this.f13194d = 5;
                break;
            default:
                this.f13194d = 4;
                break;
        }
        h7am();
    }

    private void yl(Bundle savedInstanceState) {
        Uri data;
        if (savedInstanceState != null && savedInstanceState.containsKey(as)) {
            this.bp = (ArrayList) savedInstanceState.getSerializable(as);
            this.f13203v = savedInstanceState.getInt(bl);
            savedInstanceState.remove(as);
            savedInstanceState.remove(bl);
        }
        if (savedInstanceState != null && savedInstanceState.getBoolean(az) && !com.android.thememanager.basemodule.utils.y9n.vyq()) {
            new RestoreHomeIconHelper(this).x2();
        }
        Intent intent = getIntent();
        if (com.android.thememanager.basemodule.utils.kja0.qrj(this.bp) && intent.hasExtra(InterfaceC1357q.f53841a9)) {
            this.bp = (ArrayList) intent.getSerializableExtra(InterfaceC1357q.f53841a9);
            this.f13203v = intent.getIntExtra(InterfaceC1357q.f53872fti, 0);
        }
        if (com.android.thememanager.basemodule.utils.kja0.qrj(this.bp)) {
            this.bp = new ArrayList<>();
            String strJbh = jbh(intent);
            if (!TextUtils.isEmpty(strJbh)) {
                this.bp.add(new C0005q<>(strJbh, intent.getStringExtra(InterfaceC1357q.f53863e5)));
            }
        }
        this.f13191a = intent.getStringExtra("packageName");
        if (com.android.thememanager.basemodule.utils.kja0.qrj(this.bp)) {
            if (savedInstanceState != null && savedInstanceState.containsKey("resource")) {
                this.bb = (Resource) savedInstanceState.getSerializable("resource");
            }
            if (this.bb == null && (data = intent.getData()) != null && InterfaceC1357q.f53939se.equals(intent.getScheme())) {
                this.bb = new com.android.thememanager.controller.x2(C2082k.zy().m8001n().m10537n(C1791k.getInstance(getIntent().getStringExtra("REQUEST_RESOURCE_CODE")))).m7690k().qrj(data.getFragment());
            }
            if (this.bb == null) {
                this.bb = (Resource) com.android.thememanager.basemodule.utils.kja0.m7108g((C0004k) com.android.thememanager.basemodule.utils.kja0.m7108g(C2082k.zy().ld6(), intent.getIntExtra(InterfaceC1357q.f53893jp0y, 0)), intent.getIntExtra(InterfaceC1357q.f53879gvn7, 0));
            }
            if (this.bb == null && "largeicons".equals(getIntent().getStringExtra("REQUEST_RESOURCE_CODE"))) {
                LargeIconElement largeIconElement = new LargeIconElement();
                largeIconElement.packageName = this.f13191a;
                largeIconElement.isOfficialIcons = true;
                largeIconElement.author = "MIUI";
                largeIconElement.name = C1819o.m7168z();
                largeIconElement.id = LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID;
                this.bb = LargeIconElement.create(largeIconElement).toResource();
            }
            if (this.bb == null) {
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.loading_resource_detail_fail, 0);
                finish();
                return;
            } else {
                wx16(getIntent().getStringExtra("REQUEST_RESOURCE_CODE"));
                ixz(this.bb, getIntent().getStringExtra("REQUEST_RESOURCE_CODE"), nsb());
                this.f13196f.x2();
            }
        } else {
            oki();
            this.id.uv6(this.bp.get(this.f13203v).first);
        }
        this.f9864s = com.android.thememanager.basemodule.analysis.toq.d7f;
    }

    private boolean zwy() {
        return this.f13194d != 5;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        return com.android.thememanager.basemodule.analysis.toq.d7f;
    }

    @Override // com.android.thememanager.module.detail.util.InterfaceC2245k
    @zy.lvui
    /* JADX INFO: renamed from: h */
    public androidx.lifecycle.fti<C1723y<Integer>> mo6346h() {
        return this.id.n5r1();
    }

    @Override // com.android.thememanager.recommend.player.AdAutoPlayer.InterfaceC2345k
    @zy.oc
    /* JADX INFO: renamed from: i */
    public AdAutoPlayer mo6321i() {
        if (this.an == null) {
            this.an = new AdAutoPlayer(this);
        }
        return this.an;
    }

    @Override // com.android.thememanager.module.detail.util.InterfaceC2245k
    public void ki(@zy.lvui String title) {
        this.id.hyr().cdj(title);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected boolean mu() {
        return false;
    }

    @Override // com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper.toq
    public void ni7() {
        this.bv = true;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 111 || this.f13196f.f13207h == null || this.f13196f.f13207h.second == null || !(this.f13196f.f13207h.second instanceof y9n)) {
            return;
        }
        ((y9n) this.f13196f.f13207h.second).onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (com.android.thememanager.basemodule.utils.kja0.qrj(this.f13193c)) {
            super.onBackPressed();
            return;
        }
        C2253q c2253q = this.f13196f;
        if (c2253q == null || !((com.android.thememanager.basemodule.base.toq) c2253q.getItem(this.f13198l.getCurrentItem())).gyi()) {
            super.onBackPressed();
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        C1819o.n7h(this);
        m6711e(savedInstanceState);
        C1802c.m7008k(getIntent());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.de_activity_theme_detail);
        C2241y c2241y = (C2241y) new C0924e(this).m4420k(C2241y.class);
        this.id = c2241y;
        C2821y.bqie(this, c2241y.n5r1(), this.id.hyr(), this.id.m8361f());
        this.id.lrht().m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.mu
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13309k.bap7((OnlineResourceDetail) obj);
            }
        });
        this.id.m8362c().m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.vq
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13373k.ebn((UICard) obj);
            }
        });
        pc();
        yl(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("REQUEST_RESOURCE_CODE");
        androidx.lifecycle.kja0 lifecycle = getLifecycle();
        String str = this.f9864s;
        if (stringExtra == null) {
            stringExtra = "theme";
        }
        lifecycle.mo4451k(new ScreenShotReportManager(this, str, stringExtra));
        com.android.thememanager.util.gbni.kja0(getIntent());
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        ga();
        com.bumptech.glide.zy.m11283n(this).zy();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0891q, android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
        if (C1807g.lvui()) {
            NestViewPager nestViewPager = this.f13198l;
            if (nestViewPager != null) {
                nestViewPager.setVisibility(4);
            }
            recreate();
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        MoreResourceBar moreResourceBar;
        super.onResume();
        boolean z2 = PreferenceManager.getDefaultSharedPreferences(this).getBoolean(in, false);
        this.f13195e = z2;
        if (z2 && (moreResourceBar = this.f13197j) != null && moreResourceBar.isShown()) {
            o05(false, true);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (com.android.thememanager.basemodule.utils.kja0.qrj(this.bp)) {
            Resource resource = this.bb;
            if (resource != null) {
                outState.putSerializable("resource", resource);
            }
        } else {
            outState.putInt(bl, this.f13203v);
            outState.putSerializable(as, this.bp);
        }
        if (this.bv) {
            outState.putBoolean(az, true);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    public void setActionBarRightMenu(View view) {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.more_icon_container);
        frameLayout.removeAllViews();
        if (view != null) {
            frameLayout.addView(view);
        }
    }

    public void vy(String title) {
        TextView textView = this.f13192b;
        if (textView != null) {
            textView.setVisibility(0);
            this.f13192b.setText(title);
        }
    }

    @Override // com.android.thememanager.module.detail.util.InterfaceC2245k
    /* JADX INFO: renamed from: y */
    public void mo6348y() {
        this.id.m8361f().cdj(new C1723y<>(Boolean.TRUE));
    }
}

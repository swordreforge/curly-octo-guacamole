package com.android.thememanager.settings.superwallpaper.activity;

import android.animation.ObjectAnimator;
import android.app.ActivityManager;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.graphics.Outline;
import android.os.Bundle;
import android.os.IBinder;
import android.service.wallpaper.IWallpaperService;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b3e.C1358k;
import bek6.C1367k;
import com.android.thememanager.R;
import com.android.thememanager.activity.SuperWallpaperListActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.C1802c;
import com.android.thememanager.clockmessage.model.C1873k;
import com.android.thememanager.settings.subsettings.WallpaperSubVAdapter;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.activity.presenter.WallpaperSettingPresenter;
import com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import com.android.thememanager.settings.superwallpaper.widget.AodWallpaperBannerContainer;
import com.android.thememanager.settings.superwallpaper.widget.ApkSuperWallpaperItemView;
import com.android.thememanager.settings.superwallpaper.widget.CustomNestedScrollView;
import com.android.thememanager.settings.superwallpaper.widget.FindMoreButton;
import com.android.thememanager.settings.superwallpaper.widget.HomeWallpaperBannerContainer;
import com.android.thememanager.settings.superwallpaper.widget.LockScreenWallpaperBannerContainer;
import com.android.thememanager.superwallpaper.activity.UnitySuperWallpaperDetailActivity;
import com.android.thememanager.util.g1;
import com.market.sdk.a9;
import com.market.sdk.fti;
import com.market.sdk.mcp;
import i1.C6077k;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import miuix.appcompat.app.AbstractC6946k;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperSettingSupportSuperWallpaperActivity extends AbstractActivityC1717k implements View.OnClickListener, fti, C2640k.toq {
    private static final int cw14 = 3;
    private static final float d1cy = 360.0f;
    private static final int hp = 1;
    private static final String k6e = "preference_system_wallpaper_tab";
    private static final int mjvl = 2;
    private static final float ndjo = 0.0f;
    private static final String q7k9 = "rotation";
    private static final int s8y = 419430400;
    public static final int th6 = 1;
    private static final String vb6 = WallpaperSettingSupportSuperWallpaperActivity.class.getSimpleName();
    private static final int xk5 = 209715200;
    private static final long xqx = 500;
    public static final int xy8 = 0;

    /* JADX INFO: renamed from: a */
    private LinearLayout f15560a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private View f60882ab;
    private int ac;
    private List<ResolveInfo> ad;
    private WallpaperSubVAdapter an;
    private FilterSortView.TabView as;
    private FilterSortView.TabView az;

    /* JADX INFO: renamed from: b */
    private Button f15561b;
    private FilterSortView.TabView ba;
    private RecyclerView bb;
    private WallpaperSettingPresenter bc;
    private com.android.thememanager.settings.superwallpaper.utils.ld6 bd;
    private ViewTreeObserver.OnGlobalLayoutListener be;
    private FilterSortView bg;
    private FilterSortView.TabView bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private RelativeLayout f60883bo;
    private RecyclerView bp;
    private Calendar bq;
    private WallpaperManager bs;
    private ObjectAnimator bu;
    private WallpaperSubVAdapter bv;

    /* JADX INFO: renamed from: c */
    private AodWallpaperBannerContainer f15562c;

    /* JADX INFO: renamed from: d */
    private RelativeLayout f15563d;
    private BroadcastReceiver dy;

    /* JADX INFO: renamed from: e */
    private LockScreenWallpaperBannerContainer f15564e;

    /* JADX INFO: renamed from: f */
    private CustomNestedScrollView f15565f;
    private FindMoreButton id;
    private FilterSortView in;

    /* JADX INFO: renamed from: j */
    private HomeWallpaperBannerContainer f15566j;

    /* JADX INFO: renamed from: l */
    private Button f15567l;

    /* JADX INFO: renamed from: m */
    private Button f15568m;

    /* JADX INFO: renamed from: o */
    private Button f15569o;

    /* JADX INFO: renamed from: r */
    private AbstractC6946k f15570r;
    private int tlhn;

    /* JADX INFO: renamed from: u */
    private LinearLayout f15571u;

    /* JADX INFO: renamed from: v */
    private RelativeLayout f15572v;

    /* JADX INFO: renamed from: w */
    private FrameLayout f15573w;
    private int w97r;

    /* JADX INFO: renamed from: x */
    private LinearLayout f15574x;
    private int ax = 0;
    private int am = 0;
    private int ay = 0;
    private AtomicBoolean aj = new AtomicBoolean(false);
    private LinkedHashMap<ComponentName, IWallpaperService> k0 = new LinkedHashMap<>();
    private ArrayMap<ComponentName, ServiceConnection> ar = new ArrayMap<>();
    private ViewOutlineProvider tgs = new C2636y();
    private ViewOutlineProvider yl25 = new C2635s();
    private Runnable zmmu = new RunnableC2633p();
    private toq.InterfaceC2654n sk1t = new ld6();

    class f7l8 implements ApkSuperWallpaperItemView.InterfaceC2675g {
        f7l8() {
        }

        @Override // com.android.thememanager.settings.superwallpaper.widget.ApkSuperWallpaperItemView.InterfaceC2675g
        /* JADX INFO: renamed from: k */
        public void mo9210k() {
            WallpaperSettingSupportSuperWallpaperActivity wallpaperSettingSupportSuperWallpaperActivity = WallpaperSettingSupportSuperWallpaperActivity.this;
            wallpaperSettingSupportSuperWallpaperActivity.ad = wallpaperSettingSupportSuperWallpaperActivity.getPackageManager().queryIntentServices(new Intent("miui.service.wallpaper.SuperWallpaperService"), 128);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.WallpaperSettingSupportSuperWallpaperActivity$g */
    class ViewOnClickListenerC2629g implements View.OnClickListener {
        ViewOnClickListenerC2629g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            WallpaperSettingSupportSuperWallpaperActivity.this.b8(1);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.WallpaperSettingSupportSuperWallpaperActivity$h */
    class ViewOnClickListenerC2630h implements View.OnClickListener {
        ViewOnClickListenerC2630h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (C1781k.toq(bf2.toq.toq())) {
                WallpaperSettingSupportSuperWallpaperActivity.this.bc.toq(4, true);
            } else {
                WallpaperSettingSupportSuperWallpaperActivity.this.nn86(null, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.WallpaperSettingSupportSuperWallpaperActivity$k */
    class ViewTreeObserverOnGlobalLayoutListenerC2631k implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC2631k() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (WallpaperSettingSupportSuperWallpaperActivity.this.f60883bo == null || WallpaperSettingSupportSuperWallpaperActivity.this.f60883bo.getHeight() == 0 || WallpaperSettingSupportSuperWallpaperActivity.this.f15574x == null || WallpaperSettingSupportSuperWallpaperActivity.this.f15574x.getHeight() == 0 || WallpaperSettingSupportSuperWallpaperActivity.this.f15574x.getChildCount() <= 0) {
                return;
            }
            WallpaperSettingSupportSuperWallpaperActivity.this.f60883bo.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            WallpaperSettingSupportSuperWallpaperActivity wallpaperSettingSupportSuperWallpaperActivity = WallpaperSettingSupportSuperWallpaperActivity.this;
            wallpaperSettingSupportSuperWallpaperActivity.ay = wallpaperSettingSupportSuperWallpaperActivity.f60882ab.getBottom();
            WallpaperSettingSupportSuperWallpaperActivity wallpaperSettingSupportSuperWallpaperActivity2 = WallpaperSettingSupportSuperWallpaperActivity.this;
            wallpaperSettingSupportSuperWallpaperActivity2.w97r = wallpaperSettingSupportSuperWallpaperActivity2.ay;
            WallpaperSettingSupportSuperWallpaperActivity wallpaperSettingSupportSuperWallpaperActivity3 = WallpaperSettingSupportSuperWallpaperActivity.this;
            wallpaperSettingSupportSuperWallpaperActivity3.tlhn = wallpaperSettingSupportSuperWallpaperActivity3.ay;
            Log.d(WallpaperSettingSupportSuperWallpaperActivity.vb6, "divider view y:" + WallpaperSettingSupportSuperWallpaperActivity.this.ay);
        }
    }

    class kja0 implements View.OnClickListener {
        kja0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WallpaperSettingSupportSuperWallpaperActivity.this.startActivity(new Intent(WallpaperSettingSupportSuperWallpaperActivity.this, (Class<?>) SuperWallpaperListActivity.class));
        }
    }

    class ld6 implements toq.InterfaceC2654n {
        ld6() {
        }

        @Override // com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.InterfaceC2654n
        /* JADX INFO: renamed from: k */
        public void mo9211k(boolean isSuperWallpaperDark) {
            WallpaperSettingSupportSuperWallpaperActivity.this.wlev();
        }

        @Override // com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.InterfaceC2654n
        public void toq(boolean isDarkMode) {
            WallpaperSettingSupportSuperWallpaperActivity.this.wlev();
            View decorView = WallpaperSettingSupportSuperWallpaperActivity.this.getWindow().getDecorView();
            if (decorView != null) {
                int systemUiVisibility = decorView.getSystemUiVisibility();
                decorView.setSystemUiVisibility(isDarkMode ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.WallpaperSettingSupportSuperWallpaperActivity$n */
    class ViewOnClickListenerC2632n implements View.OnClickListener {
        ViewOnClickListenerC2632n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            WallpaperSettingSupportSuperWallpaperActivity.this.b8(0);
        }
    }

    class n7h implements ViewTreeObserver.OnScrollChangedListener {
        n7h() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            int scrollY = WallpaperSettingSupportSuperWallpaperActivity.this.f15565f.getScrollY();
            WallpaperSettingSupportSuperWallpaperActivity.this.f15565f.getScrollX();
            WallpaperSettingSupportSuperWallpaperActivity.this.am = scrollY;
            Log.d(WallpaperSettingSupportSuperWallpaperActivity.vb6, "onScrollChanged mYScrollOffset = " + scrollY);
            WallpaperSettingSupportSuperWallpaperActivity.this.bd.x2(WallpaperSettingSupportSuperWallpaperActivity.this.ax);
            if (WallpaperSettingSupportSuperWallpaperActivity.this.am >= WallpaperSettingSupportSuperWallpaperActivity.this.ay) {
                if (WallpaperSettingSupportSuperWallpaperActivity.this.ax == 1) {
                    WallpaperSettingSupportSuperWallpaperActivity wallpaperSettingSupportSuperWallpaperActivity = WallpaperSettingSupportSuperWallpaperActivity.this;
                    wallpaperSettingSupportSuperWallpaperActivity.w97r = wallpaperSettingSupportSuperWallpaperActivity.am;
                } else {
                    WallpaperSettingSupportSuperWallpaperActivity wallpaperSettingSupportSuperWallpaperActivity2 = WallpaperSettingSupportSuperWallpaperActivity.this;
                    wallpaperSettingSupportSuperWallpaperActivity2.tlhn = wallpaperSettingSupportSuperWallpaperActivity2.am;
                }
            }
            WallpaperSettingSupportSuperWallpaperActivity.this.b9ub();
            WallpaperSettingSupportSuperWallpaperActivity.this.ixz();
            View childAt = WallpaperSettingSupportSuperWallpaperActivity.this.f15565f.getChildAt(0);
            if (scrollY == 0 || childAt.getMeasuredHeight() > scrollY + WallpaperSettingSupportSuperWallpaperActivity.this.f15565f.getHeight()) {
                return;
            }
            Log.d(WallpaperSettingSupportSuperWallpaperActivity.vb6, "scroll to end!");
            if (WallpaperSettingSupportSuperWallpaperActivity.this.ax == 1) {
                WallpaperSettingSupportSuperWallpaperActivity.this.bc.toq(4, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.WallpaperSettingSupportSuperWallpaperActivity$p */
    class RunnableC2633p implements Runnable {
        RunnableC2633p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WallpaperSettingSupportSuperWallpaperActivity.this.bq.setTimeInMillis(System.currentTimeMillis());
            int i2 = WallpaperSettingSupportSuperWallpaperActivity.this.bq.get(12);
            Log.d(WallpaperSettingSupportSuperWallpaperActivity.vb6, "mTimeTickRunnable " + i2 + " " + WallpaperSettingSupportSuperWallpaperActivity.this.ac);
            if (i2 != WallpaperSettingSupportSuperWallpaperActivity.this.ac) {
                WallpaperSettingSupportSuperWallpaperActivity.this.ac = i2;
                WallpaperSettingSupportSuperWallpaperActivity.this.vy();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.WallpaperSettingSupportSuperWallpaperActivity$q */
    class ViewOnClickListenerC2634q implements View.OnClickListener {
        ViewOnClickListenerC2634q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            WallpaperSettingSupportSuperWallpaperActivity.this.b8(1);
        }
    }

    class qrj implements View.OnClickListener {
        qrj() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (!C1781k.toq(bf2.toq.toq())) {
                WallpaperSettingSupportSuperWallpaperActivity.this.nn86(null, true);
                return;
            }
            WallpaperSettingSupportSuperWallpaperActivity.this.bu.start();
            WallpaperSettingSupportSuperWallpaperActivity.this.bc.toq(4, true);
            if (WallpaperSettingSupportSuperWallpaperActivity.this.f15565f != null) {
                WallpaperSettingSupportSuperWallpaperActivity.this.f15565f.scrollTo(0, WallpaperSettingSupportSuperWallpaperActivity.this.ay);
            }
            com.android.thememanager.basemodule.analysis.kja0.m6641s("T_CLICK", com.android.thememanager.basemodule.analysis.toq.nr0, C1358k.f53986n7h, null);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.WallpaperSettingSupportSuperWallpaperActivity$s */
    class C2635s extends ViewOutlineProvider {
        C2635s() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), WallpaperSettingSupportSuperWallpaperActivity.this.getResources().getDimensionPixelSize(R.dimen.banner_corner_radius));
        }
    }

    class toq implements ServiceConnection {
        toq() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            WallpaperSettingSupportSuperWallpaperActivity.this.k0.put(name, IWallpaperService.Stub.asInterface(service));
            if (WallpaperSettingSupportSuperWallpaperActivity.this.k0.size() > 2) {
                int size = WallpaperSettingSupportSuperWallpaperActivity.this.k0.size() - 2;
                Iterator it = WallpaperSettingSupportSuperWallpaperActivity.this.ar.entrySet().iterator();
                while (it.hasNext() && size > 0) {
                    ComponentName componentName = (ComponentName) ((Map.Entry) it.next()).getKey();
                    if (!componentName.equals(name)) {
                        try {
                            WallpaperSettingSupportSuperWallpaperActivity wallpaperSettingSupportSuperWallpaperActivity = WallpaperSettingSupportSuperWallpaperActivity.this;
                            wallpaperSettingSupportSuperWallpaperActivity.unbindService((ServiceConnection) wallpaperSettingSupportSuperWallpaperActivity.ar.get(componentName));
                        } catch (Exception e2) {
                            Log.e(WallpaperSettingSupportSuperWallpaperActivity.vb6, e2.getLocalizedMessage());
                        }
                        size--;
                    }
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            WallpaperSettingSupportSuperWallpaperActivity.this.k0.remove(name);
        }
    }

    class x2 extends BroadcastReceiver {
        x2() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.TIME_TICK")) {
                WallpaperSettingSupportSuperWallpaperActivity.this.f15565f.post(WallpaperSettingSupportSuperWallpaperActivity.this.zmmu);
            } else if (intent.getAction().equals(C1367k.f7257k)) {
                WallpaperSettingSupportSuperWallpaperActivity.this.ukdy((ComponentName) intent.getParcelableExtra(C1367k.f54006zy));
            } else {
                intent.getAction().equals(C1367k.f54004toq);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.WallpaperSettingSupportSuperWallpaperActivity$y */
    class C2636y extends ViewOutlineProvider {
        C2636y() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), WallpaperSettingSupportSuperWallpaperActivity.this.getResources().getDimensionPixelSize(R.dimen.banner_background_radius));
        }
    }

    class zy implements View.OnClickListener {
        zy() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            WallpaperSettingSupportSuperWallpaperActivity.this.b8(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b8(int tabType) {
        if (this.in == null) {
            FilterSortView filterSortView = (FilterSortView) this.f60883bo.findViewById(R.id.filter_sort_view);
            this.in = filterSortView;
            filterSortView.setTabIncatorVisibility(8);
            this.bl = (FilterSortView.TabView) this.in.findViewById(R.id.tab_view_system_wallpaper);
            this.as = (FilterSortView.TabView) this.in.findViewById(R.id.tab_view_online_wallpaper);
            this.bl.setOnClickListener(new zy());
            this.as.setOnClickListener(new ViewOnClickListenerC2634q());
        }
        if (this.bg == null) {
            FilterSortView filterSortView2 = (FilterSortView) this.f15572v.findViewById(R.id.filter_sort_view);
            this.bg = filterSortView2;
            filterSortView2.setTabIncatorVisibility(8);
            this.az = (FilterSortView.TabView) this.bg.findViewById(R.id.tab_view_system_wallpaper);
            this.ba = (FilterSortView.TabView) this.bg.findViewById(R.id.tab_view_online_wallpaper);
            this.az.setOnClickListener(new ViewOnClickListenerC2632n());
            this.ba.setOnClickListener(new ViewOnClickListenerC2629g());
        }
        this.ax = tabType;
        b9ub();
        ixz();
        cnbm();
        int i2 = this.ax;
        if (i2 == 0) {
            if (this.am >= this.ay) {
                this.f15565f.scrollTo(0, this.tlhn);
            }
            this.in.setFilteredTab(this.bl);
            this.bg.setFilteredTab(this.az);
            this.bp.setVisibility(0);
            this.bb.setVisibility(8);
            g1.gyi(k6e, true);
            com.android.thememanager.basemodule.analysis.kja0.m6641s("T_CLICK", com.android.thememanager.basemodule.analysis.toq.nr0, com.android.thememanager.basemodule.analysis.toq.kro, "0");
            return;
        }
        if (i2 != 1) {
            return;
        }
        if (this.am >= this.ay) {
            this.f15565f.scrollTo(0, this.w97r);
        }
        this.in.setFilteredTab(this.as);
        this.bg.setFilteredTab(this.ba);
        this.bp.setVisibility(8);
        this.bb.setVisibility(0);
        g1.gyi(k6e, false);
        com.android.thememanager.basemodule.analysis.kja0.m6641s("T_CLICK", com.android.thememanager.basemodule.analysis.toq.nr0, com.android.thememanager.basemodule.analysis.toq.kro, "1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b9ub() {
        if (this.am < this.ay || this.ax != 1) {
            this.f15567l.setVisibility(8);
        } else {
            this.f15567l.setVisibility(0);
        }
    }

    private void bap7() {
        C2640k.m9216n().m9220k(this);
    }

    private void cnbm() {
        if (this.ax == 0) {
            this.f15573w.setVisibility(8);
        } else if (this.an.getItemCount() == 0) {
            this.f15573w.setVisibility(0);
        } else {
            this.f15573w.setVisibility(8);
        }
    }

    private void ebn() {
        Intent intent = getIntent();
        if (intent == null || !C2656k.f15718s.equals(intent.getStringExtra("from"))) {
            return;
        }
        String stringExtra = intent.getStringExtra("package_name");
        String stringExtra2 = intent.getStringExtra(C2656k.f60937x2);
        if ((TextUtils.isEmpty(stringExtra) ? false : oki(stringExtra)) || TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        oki(stringExtra2);
    }

    private void ga() {
        this.f15562c = (AodWallpaperBannerContainer) findViewById(R.id.aod_wallpaper_banner_container);
        this.f15564e = (LockScreenWallpaperBannerContainer) findViewById(R.id.lock_screen_wallpaper_banner_container);
        this.f15566j = (HomeWallpaperBannerContainer) findViewById(R.id.home_wallpaper_banner_container);
        this.f15562c.setOutlineProvider(this.tgs);
        this.f15562c.setClipToOutline(true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.aod_wallpaper_banner_container_border);
        frameLayout.setOutlineProvider(this.yl25);
        frameLayout.setClipToOutline(true);
        this.f15564e.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.superwallpaper.activity.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15652k.onClick(view);
            }
        });
        this.f15564e.setOutlineProvider(this.tgs);
        this.f15564e.setClipToOutline(true);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.lock_screen_wallpaper_banner_container_border);
        frameLayout2.setOutlineProvider(this.yl25);
        frameLayout2.setClipToOutline(true);
        this.f15566j.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.superwallpaper.activity.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15652k.onClick(view);
            }
        });
        this.f15566j.setOutlineProvider(this.tgs);
        this.f15566j.setClipToOutline(true);
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.home_wallpaper_banner_container_border);
        frameLayout3.setOutlineProvider(this.yl25);
        frameLayout3.setClipToOutline(true);
        this.f15569o = (Button) findViewById(R.id.aod_wallpaper_banner_button);
        this.f15568m = (Button) findViewById(R.id.lock_screen_wallpaper_banner_button);
        this.f15561b = (Button) findViewById(R.id.home_wallpaper_banner_button);
        this.f15569o.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.superwallpaper.activity.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15652k.onClick(view);
            }
        });
        this.f15568m.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.superwallpaper.activity.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15652k.onClick(view);
            }
        });
        this.f15561b.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.superwallpaper.activity.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15652k.onClick(view);
            }
        });
        C6077k.m22369i(this.f15569o);
        C6077k.m22369i(this.f15568m);
        C6077k.m22369i(this.f15561b);
    }

    private void h4b() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.super_wallpaper_container);
        this.f15560a = linearLayout;
        linearLayout.setVisibility(8);
        this.f15574x = (LinearLayout) findViewById(R.id.super_wallpaper_banner_list);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.super_wallpaper_more_button);
        this.f15571u = linearLayout2;
        linearLayout2.setOnClickListener(new kja0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ixz() {
        int i2 = this.ay;
        if (i2 == 0) {
            return;
        }
        if (this.am < i2) {
            if (this.aj.getAndSet(false)) {
                this.id.n7h();
            }
            this.f15563d.setVisibility(8);
            return;
        }
        Log.d(vb6, "show fixed top, mYScrollOffset:" + this.am + " mDividerViewInitBottom:" + this.ay);
        this.f15563d.setVisibility(0);
        if (this.aj.getAndSet(true)) {
            return;
        }
        this.id.ki();
    }

    private void lh() {
        CustomNestedScrollView customNestedScrollView = (CustomNestedScrollView) findViewById(R.id.scroll_view);
        this.f15565f = customNestedScrollView;
        customNestedScrollView.getViewTreeObserver().addOnScrollChangedListener(new n7h());
    }

    private void n2t() {
        if (this.be == null) {
            this.be = new ViewTreeObserverOnGlobalLayoutListenerC2631k();
            this.f60883bo.getViewTreeObserver().addOnGlobalLayoutListener(this.be);
        }
    }

    private ServiceConnection nsb(ComponentName componentName) {
        ServiceConnection serviceConnection = this.ar.get(componentName);
        if (serviceConnection != null) {
            return serviceConnection;
        }
        toq toqVar = new toq();
        this.ar.put(componentName, toqVar);
        return toqVar;
    }

    private void o05() {
        this.dy = new x2();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction(C1367k.f7257k);
        intentFilter.addAction(C1367k.f54004toq);
        registerReceiver(this.dy, intentFilter);
    }

    private boolean oki(String packageName) {
        Bundle bundle;
        Intent intent = new Intent("miui.service.wallpaper.SuperWallpaperService");
        intent.setPackage(packageName);
        List<ResolveInfo> listQueryIntentServices = getPackageManager().queryIntentServices(intent, 128);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0 || (bundle = listQueryIntentServices.get(0).serviceInfo.metaData) == null) {
            return false;
        }
        UnitySuperWallpaperDetailActivity.r25n(this, bundle, packageName, 1);
        return true;
    }

    private int pc(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C1873k.f10652g);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return (memoryInfo.lowMemory || memoryInfo.availMem - memoryInfo.threshold <= 419430400) ? 1 : 2;
    }

    private void pjz9() {
        this.f60882ab = findViewById(R.id.online_wallpaper_container_line);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.offline_ui_container);
        this.f15573w = frameLayout;
        View viewFindViewById = frameLayout.findViewById(R.id.offline_divider);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(4);
        }
        View viewFindViewById2 = this.f15573w.findViewById(R.id.offline);
        if (viewFindViewById2 != null) {
            C6077k.f7l8(viewFindViewById2);
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC2630h());
        }
        this.f60883bo = (RelativeLayout) findViewById(R.id.online_wallpaper_title_container);
        this.f15572v = (RelativeLayout) findViewById(R.id.online_wallpaper_title_container_fixed_top);
        this.bb = (RecyclerView) findViewById(R.id.online_wallpaper_recyclerview);
        this.an = new WallpaperSubVAdapter(this, false);
        this.bb.setLayoutManager(new LinearLayoutManager(this));
        this.bb.setAdapter(this.an);
        this.bp = (RecyclerView) findViewById(R.id.system_wallpaper_recyclerview);
        this.bv = new WallpaperSubVAdapter(this, false);
        this.bp.setLayoutManager(new LinearLayoutManager(this));
        this.bp.setAdapter(this.bv);
        this.bd = new com.android.thememanager.settings.superwallpaper.utils.ld6(this.bp, this.bb);
        this.bc = new WallpaperSettingPresenter(this);
        getLifecycle().mo4451k(this.bc);
        this.f15563d = (RelativeLayout) findViewById(R.id.online_wallpaper_title_container_fixed_top);
        FindMoreButton findMoreButton = (FindMoreButton) findViewById(R.id.find_more);
        this.id = findMoreButton;
        findMoreButton.setOnClickListener(this);
        C6077k.fu4(this.id);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.id.getLayoutParams();
        layoutParams.bottomMargin = -this.id.getHeightWithShadow();
        this.id.setLayoutParams(layoutParams);
        b8(!g1.x2(k6e, true) ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ukdy(ComponentName componentName) {
        Intent className = new Intent("android.service.wallpaper.WallpaperService").setClassName(componentName.getPackageName(), componentName.getClassName());
        this.k0.get(componentName);
        bindService(className, nsb(className.getComponent()), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vy() {
        this.f15562c.m9328p();
        this.f15566j.m9361g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wlev() {
        WallpaperInfo wallpaperInfo = this.bs.getWallpaperInfo();
        if (wallpaperInfo == null) {
            this.f15562c.m9329s(false, null);
            this.f15564e.m9367g(false, null, null);
            this.f15566j.m9362n(false, null);
            return;
        }
        List<ResolveInfo> list = this.ad;
        if (list == null || list.size() == 0) {
            Log.w(vb6, "initWallpaperBanner list is null or empty");
            return;
        }
        Log.d(vb6, "initWallpaperBanner " + this.ad.size());
        int i2 = 0;
        while (true) {
            if (i2 >= this.ad.size()) {
                break;
            }
            if (this.ad.get(i2) != null && this.ad.get(i2).serviceInfo != null) {
                String str = this.ad.get(i2).serviceInfo.packageName;
                if (str.equals(wallpaperInfo.getPackageName())) {
                    String str2 = vb6;
                    Log.d(str2, "initWallpaperBanner packageName " + str);
                    if (this.ad.get(i2).serviceInfo.metaData != null) {
                        Bundle bundle = this.ad.get(i2).serviceInfo.metaData;
                        String str3 = this.ad.get(i2).serviceInfo.name;
                        String string = bundle.getString("id");
                        Log.d(str2, "initWallpaperBanner super wallpaper name " + str3);
                        this.f15562c.m9329s(C2663k.m9269q(this) == 1, bundle);
                        this.f15564e.m9367g(com.android.thememanager.settings.superwallpaper.utils.n7h.m9287s(this), str3, string);
                        this.f15566j.m9362n(true, str3);
                        return;
                    }
                    Log.w(str2, "initWallpaperBanner serviceInfo metaData is null");
                }
            }
            i2++;
        }
        this.f15562c.m9329s(false, null);
        this.f15564e.m9367g(false, null, null);
        this.f15566j.m9362n(false, null);
    }

    private void zwy() {
        AbstractC6946k appCompatActionBar = getAppCompatActionBar();
        this.f15570r = appCompatActionBar;
        appCompatActionBar.mo173v(getString(R.string.wallpaper_setting_title));
        Button button = new Button(this);
        this.f15567l = button;
        button.setBackgroundResource(R.drawable.ic_refresh);
        this.f15567l.setOnClickListener(new qrj());
        this.f15567l.setVisibility(8);
        this.f15570r.ij(this.f15567l);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f15567l, "rotation", 0.0f, d1cy);
        this.bu = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(500L);
        this.bu.setRepeatCount(1);
        this.bu.setInterpolator(new LinearInterpolator());
    }

    @Override // com.android.thememanager.settings.superwallpaper.activity.data.C2640k.toq
    public void c8jq(SuperWallpaperSummaryData[] datas) {
        if (datas != null) {
            this.f15560a.setVisibility(0);
            this.f15574x.removeAllViews();
            for (int i2 = 0; i2 < datas.length && i2 < 3; i2++) {
                if (!datas[i2].f15593e) {
                    ApkSuperWallpaperItemView apkSuperWallpaperItemView = (ApkSuperWallpaperItemView) LayoutInflater.from(this).inflate(R.layout.super_wallpaper_item_apk, (ViewGroup) this.f15574x, false);
                    this.f15574x.addView(apkSuperWallpaperItemView);
                    apkSuperWallpaperItemView.setSuperWallpaperStatusChangeCallback(new f7l8());
                    apkSuperWallpaperItemView.setBaseContents(datas[i2], i2);
                }
            }
            n2t();
        }
    }

    public void gcp() {
    }

    @Override // com.market.sdk.fti
    public void lrht(int i2, mcp updateResponse) {
    }

    public void lw(int type, List<com.android.thememanager.settings.subsettings.f7l8> list, boolean isAppend) {
        if (list != null) {
            if (type == 2) {
                this.bv.m9166l(type, list, true);
            } else {
                if (!isAppend) {
                    this.an.d2ok();
                    WallpaperSubVAdapter wallpaperSubVAdapter = new WallpaperSubVAdapter(this, false);
                    this.an = wallpaperSubVAdapter;
                    this.bb.setAdapter(wallpaperSubVAdapter);
                }
                this.an.m9166l(type, list, true);
            }
        }
        cnbm();
        n2t();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: m */
    protected int mo6344m() {
        return 1;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            finish();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-1025) & (-257));
        com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().ld6(this.sk1t, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r6) {
        /*
            r5 = this;
            int r6 = r6.getId()
            r0 = 0
            r1 = 0
            java.lang.String r2 = "wallpaper_settings_new_page"
            r3 = 2131428238(0x7f0b038e, float:1.8478115E38)
            if (r6 != r3) goto L1e
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r3 = "com.android.systemui"
            java.lang.String r4 = "com.android.keyguard.settings.ChooseKeyguardClockActivity"
            r6.setClassName(r3, r4)
            java.lang.String r3 = "event_lock_screen_banner_click"
        L1b:
            r4 = r3
            r3 = r0
            goto L6e
        L1e:
            r3 = 2131428038(0x7f0b02c6, float:1.847771E38)
            if (r6 != r3) goto L31
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.Class<com.android.thememanager.settings.superwallpaper.activity.HomeWallpaperPreviewActivity> r3 = com.android.thememanager.settings.superwallpaper.activity.HomeWallpaperPreviewActivity.class
            r6.setClass(r5, r3)
            r3 = 1
            java.lang.String r4 = "event_home_banner_click"
            goto L6e
        L31:
            r3 = 2131427475(0x7f0b0093, float:1.8476567E38)
            if (r6 != r3) goto L3d
            android.content.Intent r6 = com.android.thememanager.settings.superwallpaper.utils.C2663k.m9266k()
            java.lang.String r3 = "event_aod_picker_click"
            goto L1b
        L3d:
            r3 = 2131428237(0x7f0b038d, float:1.8478113E38)
            if (r6 != r3) goto L52
            android.content.Intent r6 = com.android.thememanager.settings.superwallpaper.utils.x2.m9303n()
            int r3 = miui.os.UserHandle.myUserId()
            java.lang.String r4 = "extra_user_id"
            r6.putExtra(r4, r3)
            java.lang.String r3 = "event_lock_screen_picker_click"
            goto L1b
        L52:
            r3 = 2131428037(0x7f0b02c5, float:1.8477707E38)
            if (r6 != r3) goto L5e
            android.content.Intent r6 = com.android.thememanager.settings.superwallpaper.utils.x2.m9303n()
            java.lang.String r3 = "event_home_picker_click"
            goto L1b
        L5e:
            r3 = 2131427949(0x7f0b026d, float:1.8477529E38)
            if (r6 != r3) goto L6a
            android.content.Intent r6 = com.android.thememanager.settings.superwallpaper.utils.x2.zy()
            java.lang.String r3 = "wallpaper_setting_find_more"
            goto L1b
        L6a:
            r3 = r0
            r6 = r1
            r2 = r6
            r4 = r2
        L6e:
            r5.startActivity(r6)
            if (r3 == 0) goto L79
            r6 = 2130771988(0x7f010014, float:1.7147082E38)
            r5.overridePendingTransition(r0, r6)
        L79:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L82
            com.android.thememanager.basemodule.analysis.kja0.f7l8(r2, r4, r1)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.superwallpaper.activity.WallpaperSettingSupportSuperWallpaperActivity.onClick(android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        m6711e(savedInstanceState);
        C1802c.m7008k(getIntent());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper_setting);
        zwy();
        lh();
        ga();
        h4b();
        pjz9();
        o05();
        bap7();
        this.bq = Calendar.getInstance();
        this.bs = WallpaperManager.getInstance(this);
        wlev();
        this.ad = getPackageManager().queryIntentServices(new Intent("miui.service.wallpaper.SuperWallpaperService"), 128);
        ebn();
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.cjaj, C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.nr0, null, ""));
        this.f9864s = com.android.thememanager.basemodule.analysis.toq.nr0;
        com.android.thememanager.basemodule.analysis.kja0.m6641s(com.android.thememanager.basemodule.analysis.toq.cjaj, com.android.thememanager.basemodule.analysis.toq.nr0, null, null);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.dy;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        Log.i(vb6, "onDestroy");
        a9.m17293z(null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().m9239i(this.sk1t);
        LinkedHashMap<ComponentName, IWallpaperService> linkedHashMap = this.k0;
        if (linkedHashMap == null || linkedHashMap.size() <= 0) {
            return;
        }
        try {
            Iterator<ServiceConnection> it = this.ar.values().iterator();
            while (it.hasNext()) {
                unbindService(it.next());
            }
        } catch (Exception e2) {
            Log.e(vb6, e2.getLocalizedMessage());
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.bd.n7h();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        wlev();
        if (this.ax == 0) {
            this.bv.m9165f();
        }
    }
}

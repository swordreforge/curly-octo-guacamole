package com.android.thememanager.v9;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.jp0y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.WallpaperViewPager;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.activity.ThemeLabActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.ScreenShotReportManager;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.basemodule.views.x2;
import com.android.thememanager.controller.online.EnumC1933t;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.mcp;
import com.android.thememanager.controller.online.wvg;
import com.android.thememanager.controller.zy;
import com.android.thememanager.detail.widget.VerticalFlipView;
import com.android.thememanager.model.WallpaperApplyInfos;
import com.android.thememanager.recommend.player.AdAutoPlayer;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.C2367n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.router.recommend.entity.UIResult;
import com.android.thememanager.router.recommend.entity.UISubject;
import com.android.thememanager.router.recommend.entity.WallpaperRecommendItem;
import com.android.thememanager.share.C2708s;
import com.android.thememanager.util.mbx;
import com.android.thememanager.util.oc;
import com.android.thememanager.util.py;
import com.android.thememanager.util.uc;
import com.android.thememanager.v9.adapter.zy;
import com.android.thememanager.v9.data.C2853p;
import com.android.thememanager.v9.view.WallpaperViewPagerLayout;
import com.android.thememanager.view.ncyb;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.C4871g;
import com.xiaomi.mipush.sdk.C5658n;
import ek5k.C6002g;
import i1.C6077k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import miuix.appcompat.app.ki;
import miuix.springback.view.SpringBackLayout;
import p001b.InterfaceC1357q;
import y2.C7776k;
import yz.C7794k;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperSubjectActivity extends com.android.thememanager.activity.kja0 implements View.OnClickListener, InterfaceC1925p, mcp.zy, com.android.thememanager.basemodule.analysis.toq, AdAutoPlayer.InterfaceC2345k {
    private static final String afw = "CurrentIndex";
    private static final int oyp = 38;
    private static final String qns = "WallpaperSubjectActivity";

    /* JADX INFO: renamed from: a */
    private LinearLayout f17002a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private VerticalFlipView f61457ab;
    private com.android.thememanager.basemodule.views.ld6 ac;
    private ViewGroup ad;
    private com.android.thememanager.basemodule.views.ld6 aj;
    private View am;
    private WallpaperViewPager an;
    private String ar;
    private RecommendListViewAdapter ax;
    private StaggeredGridLayoutManager ay;
    private com.android.thememanager.basemodule.views.x2 az;

    /* JADX INFO: renamed from: b */
    private TextView f17003b;
    private SpringBackLayout ba;
    private TextView bb;
    private String bc;
    public boolean bd;
    private ViewGroup be;
    private com.android.thememanager.fu4 bg;
    private C2853p bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private TextView f61458bo;
    private ncyb bp;
    private RecyclerView bq;
    private String bs;
    private AppBarLayout bv;

    /* JADX INFO: renamed from: c */
    private int f17004c;
    private String cw14;

    /* JADX INFO: renamed from: d */
    private TextView f17005d;
    private float dy;

    /* JADX INFO: renamed from: e */
    private int f17006e;
    private WallpaperApplyInfos ei;
    private float hp;
    private com.android.thememanager.v9.adapter.zy id;
    private WallpaperViewPagerLayout in;
    private boolean k0;
    private float k6e;

    @dd
    private AdAutoPlayer ls9;

    /* JADX INFO: renamed from: m */
    private LinearLayout f17008m;
    private float mjvl;
    private com.android.thememanager.basemodule.utils.dd ndjo;
    private float s8y;
    private float sk1t;
    private float tgs;
    private String th6;
    private mcp tlhn;

    /* JADX INFO: renamed from: u */
    private TextView f17010u;
    private miuix.appcompat.app.ki ut;

    /* JADX INFO: renamed from: v */
    private TextView f17011v;
    private float vb6;

    /* JADX INFO: renamed from: w */
    private Button f17012w;

    /* JADX INFO: renamed from: x */
    private ImageView f17013x;
    private float xk5;
    private fu4 xqx;
    private String xy8;
    private float yl25;
    private float zmmu;
    private com.android.thememanager.util.kja0 zr5t;

    /* JADX INFO: renamed from: j */
    private int f17007j = 0;

    /* JADX INFO: renamed from: o */
    private int f17009o = 0;
    private ArrayList<WallpaperRecommendItem> as = null;
    private int bu = 0;
    private ArrayList<Integer> w97r = new ArrayList<>();
    private int q7k9 = 0;
    private Handler d1cy = new Handler();
    private final HashSet<String> wra = new HashSet<>();
    private p000a.zy zsl = new C2842s();
    private final C2853p.k xhv = new C2840p();
    private final ncyb.zy zm = new ld6();
    private final zy.InterfaceC1958k wh6 = new toq();

    class f7l8 implements ViewPager.InterfaceC1284p {
        f7l8() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        /* JADX INFO: renamed from: k */
        public void mo5550k(int state) {
            if (state != 0) {
                if (state == 1) {
                    C6077k.m22370k(WallpaperSubjectActivity.this.f17003b);
                }
            } else {
                int size = WallpaperSubjectActivity.this.bl.n7h().size();
                if (size > 0 && WallpaperSubjectActivity.this.bl.n7h().get(size - 1).startProductPos - WallpaperSubjectActivity.this.f17009o < 3) {
                    WallpaperSubjectActivity.this.bl.ki();
                }
                C6077k.zy(WallpaperSubjectActivity.this.f17003b);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void toq(int position) {
            if (WallpaperSubjectActivity.this.f17009o > position) {
                if (WallpaperSubjectActivity.this.f17009o < WallpaperSubjectActivity.this.bl.qrj()) {
                    WallpaperSubjectActivity.this.bl.fn3e();
                    if (WallpaperSubjectActivity.this.f17009o - position > 1) {
                        WallpaperSubjectActivity.this.bl.fn3e();
                    }
                }
            } else if (WallpaperSubjectActivity.this.f17009o < position) {
                WallpaperSubjectActivity.this.bl.m10155i();
                if (position - WallpaperSubjectActivity.this.f17009o > 1) {
                    WallpaperSubjectActivity.this.bl.m10155i();
                }
            }
            if (position == 0) {
                WallpaperSubjectActivity.this.r25n(true);
            } else if (WallpaperSubjectActivity.this.f17009o == 0) {
                WallpaperSubjectActivity.this.r25n(false);
            }
            WallpaperSubjectActivity wallpaperSubjectActivity = WallpaperSubjectActivity.this;
            wallpaperSubjectActivity.ncyb(wallpaperSubjectActivity.bl.kja0(WallpaperSubjectActivity.this.f17009o).trackId);
            String str = WallpaperSubjectActivity.this.f17009o < position ? "right" : "left";
            WallpaperSubjectActivity.this.f17009o = position;
            UIProduct uIProductF7l8 = WallpaperSubjectActivity.this.bl.f7l8();
            if (uIProductF7l8 != null) {
                WallpaperSubjectActivity.this.rp(uIProductF7l8);
                WallpaperSubjectActivity.this.n5r1(uIProductF7l8.trackId);
                com.android.thememanager.basemodule.analysis.kja0.m6641s("SWIPE", WallpaperSubjectActivity.this.mo6345a(), uIProductF7l8.trackId, str);
                C1708s.f7l8().ld6().d3(C1706p.kja0(WallpaperSubjectActivity.this.mo6345a(), uIProductF7l8.trackId, str));
            }
            WallpaperSubjectActivity.this.f17007j = position;
            WallpaperSubjectActivity wallpaperSubjectActivity2 = WallpaperSubjectActivity.this;
            wallpaperSubjectActivity2.lh(wallpaperSubjectActivity2.f17007j);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void zy(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.WallpaperSubjectActivity$g */
    class ViewOnClickListenerC2837g implements View.OnClickListener {
        ViewOnClickListenerC2837g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            WallpaperSubjectActivity.this.be.setVisibility(8);
            WallpaperSubjectActivity.this.bu = 0;
            WallpaperSubjectActivity wallpaperSubjectActivity = WallpaperSubjectActivity.this;
            wallpaperSubjectActivity.l05(wallpaperSubjectActivity.bu, false);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.WallpaperSubjectActivity$k */
    class DialogInterfaceOnClickListenerC2838k implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC2838k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
        }
    }

    class ld6 implements ncyb.zy {
        ld6() {
        }

        @Override // com.android.thememanager.view.ncyb.zy
        /* JADX INFO: renamed from: k */
        public void mo6447k(int applyType, WallpaperApplyInfos infos) {
            UIProduct uIProductF7l8 = WallpaperSubjectActivity.this.bl.f7l8();
            if (uIProductF7l8 == null) {
                return;
            }
            WallpaperSubjectActivity.this.z4t(uIProductF7l8.originalImageUrl, applyType, infos, WallpaperSubjectActivity.this.getResources().getDisplayMetrics().densityDpi);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.WallpaperSubjectActivity$n */
    class ViewOnClickListenerC2839n implements View.OnClickListener {
        ViewOnClickListenerC2839n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            WallpaperSubjectActivity.this.ad.setVisibility(8);
            WallpaperSubjectActivity.this.bl.ki();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.WallpaperSubjectActivity$p */
    class C2840p implements C2853p.k {
        C2840p() {
        }

        @Override // com.android.thememanager.v9.data.C2853p.k
        /* JADX INFO: renamed from: k */
        public void mo10136k() {
            WallpaperSubjectActivity.this.kx3();
        }

        @Override // com.android.thememanager.v9.data.C2853p.k
        /* JADX INFO: renamed from: n */
        public void mo10137n(String uuid, boolean isSubject) {
            WallpaperSubjectActivity.this.m2t(uuid, isSubject);
        }

        @Override // com.android.thememanager.v9.data.C2853p.k
        /* JADX INFO: renamed from: q */
        public void mo10138q() {
            WallpaperSubjectActivity.this.o5();
        }

        @Override // com.android.thememanager.v9.data.C2853p.k
        public void toq(boolean isFirstLoad, String pageUuid) {
            WallpaperSubjectActivity.this.u38j(isFirstLoad, pageUuid);
        }

        @Override // com.android.thememanager.v9.data.C2853p.k
        public void zy() {
            WallpaperSubjectActivity.this.m10135w();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.WallpaperSubjectActivity$q */
    class C2841q implements x2.InterfaceC1868n {
        C2841q() {
        }

        @Override // com.android.thememanager.basemodule.views.x2.InterfaceC1868n
        public void toq() {
            WallpaperSubjectActivity wallpaperSubjectActivity = WallpaperSubjectActivity.this;
            wallpaperSubjectActivity.l05(wallpaperSubjectActivity.bu, true);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.WallpaperSubjectActivity$s */
    class C2842s implements p000a.zy {
        C2842s() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            WallpaperSubjectActivity.this.ix();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                lvui.ki(WallpaperSubjectActivity.this, false);
            }
        }
    }

    class toq implements zy.InterfaceC1958k {

        /* JADX INFO: renamed from: k */
        miuix.appcompat.app.dd f17022k;

        toq() {
        }

        @Override // com.android.thememanager.controller.zy.InterfaceC1958k
        /* JADX INFO: renamed from: k */
        public void mo7697k(int max) {
            if (C1819o.eqxt(WallpaperSubjectActivity.this)) {
                this.f17022k.nmn5(max);
            }
        }

        @Override // com.android.thememanager.controller.zy.InterfaceC1958k
        public void n7h() {
            miuix.appcompat.app.dd ddVar = new miuix.appcompat.app.dd(WallpaperSubjectActivity.this);
            this.f17022k = ddVar;
            ddVar.y2(1);
            this.f17022k.setCancelable(false);
            this.f17022k.n5r1(WallpaperSubjectActivity.this.getString(R.string.common_applying));
            this.f17022k.show();
        }

        @Override // com.android.thememanager.controller.zy.InterfaceC1958k
        /* JADX INFO: renamed from: q */
        public void mo6453q(Pair<Boolean, Boolean> success, int applyType, Bundle data) {
            if (!y9n.vyq() && success != null && (((Boolean) success.first).booleanValue() || ((Boolean) success.second).booleanValue())) {
                new RestoreHomeIconHelper(WallpaperSubjectActivity.this).x2();
            }
            if (C1819o.eqxt(WallpaperSubjectActivity.this)) {
                this.f17022k.dismiss();
                if (applyType == 32) {
                    int i2 = data != null ? data.getInt(mbx.f61352ni7, -1) : -1;
                    if (i2 == 3) {
                        com.android.thememanager.controller.cdj.zy(WallpaperSubjectActivity.this, data);
                    } else if (i2 == 2) {
                        try {
                            Intent intentM9873y = mbx.m9873y(WallpaperSubjectActivity.this);
                            data.putString("from", mbx.f61350ld6);
                            intentM9873y.putExtras(data);
                            WallpaperSubjectActivity.this.startActivity(intentM9873y);
                            C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.hf7, C1706p.kja0(((AbstractActivityC1717k) WallpaperSubjectActivity.this).f9864s, null, ""));
                            C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.cjaj, C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.nr0, null, ""));
                        } catch (Exception e2) {
                            Log.e("theme:WallpaperSubject", "error occur while goto mazagine CTA", e2);
                        }
                    }
                }
                if (y9n.m7251n(32) && data != null && data.getBoolean(com.android.thememanager.basemodule.analysis.toq.f1, false)) {
                    WallpaperSubjectActivity.this.bih();
                } else {
                    if (success == null || applyType == 32) {
                        return;
                    }
                    uc.a98o(applyType, ((Boolean) success.first).booleanValue(), ((Boolean) success.second).booleanValue(), WallpaperSubjectActivity.this.ei);
                }
            }
        }

        @Override // com.android.thememanager.controller.zy.InterfaceC1958k
        public void toq(int progress) {
            if (C1819o.eqxt(WallpaperSubjectActivity.this)) {
                this.f17022k.lv5(progress);
            }
        }

        @Override // com.android.thememanager.controller.zy.InterfaceC1958k
        public void zy() {
            miuix.appcompat.app.dd ddVar = this.f17022k;
            if (ddVar != null && ddVar.isShowing()) {
                this.f17022k.dismiss();
            }
            if (WallpaperSubjectActivity.this.ut == null || !WallpaperSubjectActivity.this.ut.isShowing()) {
                return;
            }
            WallpaperSubjectActivity.this.ut.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v9.WallpaperSubjectActivity$y */
    class C2843y implements zy.toq {
        C2843y() {
        }

        @Override // com.android.thememanager.v9.adapter.zy.toq
        /* JADX INFO: renamed from: k */
        public void mo10139k(int position, UIProduct data) {
            UIProduct uIProductF7l8 = WallpaperSubjectActivity.this.bl.f7l8();
            if (uIProductF7l8 != null && uIProductF7l8.equals(data) && position == WallpaperSubjectActivity.this.an.getCurrentItem()) {
                WallpaperSubjectActivity.this.rp(uIProductF7l8);
            }
        }

        @Override // com.android.thememanager.v9.adapter.zy.toq
        public void toq(int position, UIProduct data) {
            WallpaperSubjectActivity.this.w97r.add(Integer.valueOf(position));
            UIProduct uIProductF7l8 = WallpaperSubjectActivity.this.bl.f7l8();
            if (uIProductF7l8 != null && uIProductF7l8.equals(data) && position == WallpaperSubjectActivity.this.an.getCurrentItem()) {
                WallpaperSubjectActivity.this.rp(uIProductF7l8);
                if (WallpaperSubjectActivity.this.in != null) {
                    WallpaperSubjectActivity.this.in.m10213g();
                }
            }
            if (position == WallpaperSubjectActivity.this.bl.m10153g()) {
                WallpaperSubjectActivity.this.f17012w.setVisibility(0);
            }
        }
    }

    class zy extends RecyclerView.fn3e {
        zy() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrollStateChanged(@zy.lvui RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                WallpaperSubjectActivity.this.ndjo.m7034p(recyclerView);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrolled(@zy.lvui RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            WallpaperSubjectActivity.this.ndjo.x2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b8(int i2, int i3, String str, WallpaperApplyInfos wallpaperApplyInfos, int i4, DialogInterface dialogInterface, int i5) {
        if (i2 == 0 && i3 != 32) {
            i3 = ncyb.m10408q();
        }
        bap7(str, i3, wallpaperApplyInfos, i4);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b9ub() {
        if (C1819o.eqxt(this)) {
            onBackPressed();
        }
    }

    private void bap7(String onlineUrl, int applyType, WallpaperApplyInfos infos, int dpi) {
        this.ei = infos;
        new com.android.thememanager.controller.n7h(this.bl.m10159y(), onlineUrl, this.bg, this.wh6, applyType, com.android.thememanager.basemodule.analysis.f7l8.m6607g(), this.f9864s, null, null, null, infos, dpi).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bih() {
        miuix.appcompat.app.ki kiVarM25037g = new ki.C6947k(this).fu4(R.string.dialog_apply_lock_screen_wallpaper_content).lrht(R.string.dialog_apply_lock_screen_wallpaper_warning).m25047s(true).dd(R.string.i_know, new DialogInterfaceOnClickListenerC2838k()).m25037g();
        this.ut = kiVarM25037g;
        kiVarM25037g.show();
    }

    private void cnbm() {
        int dimension = (int) (getResources().getDimension(R.dimen.wallpaper_subject_operation_bar_padding_start) - this.vb6);
        int i2 = this.f17006e;
        this.q7k9 = i2 - dimension;
        if (this.f17007j != 0) {
            this.in.setViewPagerPadding(i2, i2, this.yl25, dimension);
        } else {
            this.in.setViewPagerPadding(dimension, (i2 * 2) - dimension, this.yl25, dimension);
            r25n(true);
        }
    }

    private void cyoe(String labelType, String color) {
        if (TextUtils.isEmpty(labelType) || o1t.fn3e()) {
            this.f61458bo.setVisibility(8);
            return;
        }
        this.f61458bo.setText(labelType);
        int color2 = getResources().getColor(R.color.default_wallpaper_gallery_label_color);
        if (!TextUtils.isEmpty(color)) {
            try {
                color2 = Color.parseColor(color);
            } catch (Exception unused) {
                color2 = getResources().getColor(R.color.default_wallpaper_gallery_label_color);
            }
        }
        GradientDrawable gradientDrawable = (GradientDrawable) getDrawable(R.drawable.mazagine_lockscreen_label_background);
        gradientDrawable.setColor(color2);
        this.f61458bo.setTextColor(color2);
        gradientDrawable.setAlpha(C1819o.d2ok(bf2.toq.toq()) ? 76 : 38);
        this.f61458bo.setBackground(gradientDrawable);
        this.f61458bo.setVisibility(0);
    }

    private void ec() {
        this.bq.setVisibility(8);
        lw();
        this.be.setVisibility(0);
        this.aj.toq(true);
    }

    private void ga() {
        this.bq.setVisibility(0);
        ViewGroup viewGroup = this.be;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    private void gcp() {
        if (this.ad == null) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.reload_stub);
            com.android.thememanager.basemodule.views.ld6 ld6Var = new com.android.thememanager.basemodule.views.ld6();
            this.ac = ld6Var;
            ViewGroup viewGroupM7337k = ld6Var.m7337k(viewStub, 2);
            this.ad = viewGroupM7337k;
            viewGroupM7337k.findViewById(R.id.local_entry).setVisibility(8);
            this.ad.setOnClickListener(new ViewOnClickListenerC2839n());
        }
    }

    private void h4b() {
        if (this.bp == null) {
            this.bp = new ncyb(this);
        }
        UIProduct uIProductF7l8 = this.bl.f7l8();
        if (uIProductF7l8 != null) {
            this.bp.n7h(uIProductF7l8.wallpaperGalleryType, uIProductF7l8.wallpaperGalleryTypeId);
        }
        this.bp.ld6(this.zm);
        if (this.bp.m10411y()) {
            return;
        }
        this.bp.x2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ix() {
        if (!this.w97r.contains(Integer.valueOf(this.bl.m10153g())) || oc.ncyb(this)) {
            return;
        }
        h4b();
    }

    private void kiv() {
        this.in = (WallpaperViewPagerLayout) findViewById(R.id.viewpager_layout);
        com.android.thememanager.v9.adapter.zy zyVar = new com.android.thememanager.v9.adapter.zy(this, this.bl, this.f17004c, (int) this.yl25);
        this.id = zyVar;
        this.in.m10214q(this, zyVar);
        cnbm();
        WallpaperViewPager viewPager = this.in.getViewPager();
        this.an = viewPager;
        viewPager.setPageMargin(getResources().getDimensionPixelOffset(R.dimen.wallpaper_subject_img_margin) * 2);
        this.an.zy(new f7l8());
        this.id.m10144z(new C2843y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l05(int index, boolean forceRefresh) {
        ga();
        if (this.ax.getItemCount() == 0) {
            this.am.setVisibility(0);
        } else {
            this.am.setVisibility(8);
        }
        this.xqx.vyq(this.bs, index, this.k0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lh(int position) {
        UISubject uISubjectM10156n = this.bl.m10156n(position);
        if (uISubjectM10156n == null || com.android.thememanager.basemodule.utils.kja0.qrj(uISubjectM10156n.products) || this.f17003b == null) {
            return;
        }
        int iLd6 = this.bl.ld6(position);
        StringBuilder sb = new StringBuilder();
        if (iLd6 != -1) {
            position = iLd6;
        }
        sb.append(position);
        sb.append("/");
        sb.append(uISubjectM10156n.products.size());
        this.f17003b.setText(sb.toString());
    }

    private void lw() {
        if (this.be == null) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.reload_stub_recyclerview);
            com.android.thememanager.basemodule.views.ld6 ld6Var = new com.android.thememanager.basemodule.views.ld6();
            this.aj = ld6Var;
            ViewGroup viewGroupM7337k = ld6Var.m7337k(viewStub, 2);
            this.be = viewGroupM7337k;
            viewGroupM7337k.findViewById(R.id.local_entry).setVisibility(8);
            this.be.setOnClickListener(new ViewOnClickListenerC2837g());
        }
    }

    private void nnh() {
        this.f17007j = 0;
        this.f17009o = 0;
    }

    private void o05() {
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.top_layout);
        this.bv = appBarLayout;
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        layoutParams.height = (int) (this.yl25 + this.zmmu);
        this.bv.setLayoutParams(layoutParams);
        ImageView imageView = (ImageView) findViewById(R.id.img_back);
        this.f17013x = imageView;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        LinearLayout linearLayout = (LinearLayout) findViewById(com.android.thememanager.basemodule.utils.zurt.m7261k(R.id.wallpaper_subject_title_operation_container, R.id.wallpaper_subject_title_operation_container_elder));
        this.f17008m = linearLayout;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams3.topMargin = (int) this.yl25;
        layoutParams3.height = (int) this.zmmu;
        this.f17008m.setLayoutParams(layoutParams3);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.wallpaper_subject_operation_container);
        this.f17002a = linearLayout2;
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
        layoutParams4.topMargin = (int) this.sk1t;
        this.f17002a.setLayoutParams(layoutParams4);
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).topMargin = C1819o.gvn7(getResources()) - (y9n.jp0y() ? 0 : C1819o.qrj(5.0f));
        }
        this.f17013x.setOnClickListener(this);
        C6077k.f7l8(this.f17013x);
        this.f17010u = (TextView) findViewById(R.id.item_title);
        this.f17010u.setTypeface(Typeface.create(com.android.thememanager.util.dd.f16402k, 1));
        this.f17010u.setOnClickListener(this);
        this.f61458bo = (TextView) findViewById(R.id.item_wallpaper_gallery_lable);
        TextView textView = (TextView) findViewById(R.id.item_sub_title);
        this.f17011v = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(R.id.favorite);
        this.f17005d = textView2;
        textView2.setOnClickListener(this);
        C6077k.f7l8(this.f17005d);
        Button button = (Button) findViewById(R.id.apply);
        this.f17012w = button;
        button.setOnClickListener(this);
        this.f17012w.setVisibility(8);
        C6077k.m22369i(this.f17012w);
        VerticalFlipView verticalFlipView = (VerticalFlipView) findViewById(R.id.share);
        this.f61457ab = verticalFlipView;
        verticalFlipView.toq(com.android.thememanager.detail.theme.util.toq.m7748q());
        this.f61457ab.setVisibility(0);
        this.f61457ab.setOnClickListener(this);
        C6077k.f7l8(this.f61457ab);
        TextView textView3 = (TextView) findViewById(R.id.like);
        this.bb = textView3;
        textView3.setOnClickListener(this);
        C6077k.f7l8(this.bb);
        mcp mcpVar = new mcp(com.android.thememanager.basemodule.analysis.toq.x0c);
        this.tlhn = mcpVar;
        mcpVar.m7591p(this);
        TextView textView4 = (TextView) findViewById(R.id.pager_index_text);
        this.f17003b = textView4;
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
        layoutParams5.topMargin = (int) ((this.yl25 - this.xk5) - this.mjvl);
        layoutParams5.leftMargin = (int) ((((this.f17006e + this.f17004c) + this.vb6) - this.k6e) - this.s8y);
        this.f17003b.setLayoutParams(layoutParams5);
        this.bp = new ncyb(this);
        uf();
        kiv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o5() {
        this.bv.setVisibility(8);
        this.bq.setVisibility(8);
        gcp();
        this.ad.setVisibility(0);
        this.ac.toq(true);
    }

    private void oki() {
        Resources resources = getResources();
        this.cw14 = resources.getString(R.string.de_icon_text_like);
        this.xy8 = getResources().getString(R.string.refresh_footer_failed);
        this.th6 = getResources().getString(R.string.wallpaper_subject_version) + getResources().getString(R.string.component_title_wallpaper);
        int i2 = C1724k.m6723p().ld6().wallpaper_detail_page_style;
        if (i2 == 1 || i2 == 2) {
            this.tgs = getResources().getDimension(R.dimen.element_ad_banner_test_one_ad_container_view_height);
        } else if (i2 == 3 || i2 == 4) {
            this.tgs = getResources().getDimension(R.dimen.element_wallpaper_test_three_ad_view_height);
        } else {
            this.tgs = getResources().getDimension(R.dimen.wallpaper_pure_ad_view_height);
        }
        this.hp = resources.getDimension(R.dimen.wallpaper_subject_ad_margin_bottom);
        float f2 = (getResources() == null || getResources().getConfiguration() == null) ? 1.0f : getResources().getConfiguration().fontScale;
        if (y9n.m7258z()) {
            this.zmmu = resources.getDimension(R.dimen.wallpaper_subject_title_operation_bar_full_screen_height);
            this.sk1t = resources.getDimension(R.dimen.wallpaper_subject_operation_bar_content_full_screen_maring_top);
            if (f2 > 1.0f) {
                this.zmmu += resources.getDimension(R.dimen.wallpaper_subject_operation_bar_content_full_screen_maring_top);
            }
        } else {
            this.zmmu = resources.getDimension(R.dimen.wallpaper_subject_title_operation_bar_non_full_screen_height);
            this.sk1t = resources.getDimension(R.dimen.f8658x2195a169);
            if (f2 > 1.0f) {
                this.zmmu += resources.getDimension(R.dimen.f8658x2195a169);
            }
        }
        Rect rectM5736k = androidx.window.layout.o1t.toq().zy(this).m5736k();
        this.vb6 = resources.getDimension(R.dimen.wallpaper_subject_img_margin);
        this.dy = C1819o.gvn7(getResources());
        if (i2 == 0) {
            this.yl25 = (((rectM5736k.height() - ((((((rectM5736k.width() - (getResources().getDimension(R.dimen.wallpaper_staggered_divider_double) * 2.0f)) * 9.0f) / 16.0f) + (getResources().getDimensionPixelSize(R.dimen.element_ad_banner_test_four_download_button_height) * 1.5f)) + getResources().getDimensionPixelSize(R.dimen.icon_stagger_bottom_view_padding_top)) + getResources().getDimensionPixelSize(R.dimen.element_ad_banner_test_four_download_button_margin_top))) - this.zmmu) - this.dy) - this.hp;
        } else {
            this.yl25 = ((((1.0f - (this.tgs / rectM5736k.height())) * rectM5736k.height()) - this.zmmu) - this.dy) - this.hp;
        }
        if (y9n.m7258z() && !C1819o.d3()) {
            this.yl25 -= C1819o.zurt(this);
        }
        float f3 = this.yl25;
        this.f17004c = (int) resources.getFraction(R.fraction.v11_ratio_wallpaper_subject_image_width_ratio, (int) f3, (int) f3);
        this.f17006e = ((rectM5736k.width() - this.f17004c) / 2) - ((int) this.vb6);
        this.k6e = resources.getDimension(R.dimen.wallpaper_subject_count_width);
        this.xk5 = resources.getDimension(R.dimen.wallpaper_subject_count_height);
        this.s8y = resources.getDimension(R.dimen.wallpaper_subject_count_margin_end);
        this.mjvl = resources.getDimension(R.dimen.wallpaper_subject_count_margin_Bottom);
    }

    private void ps(Intent intent, Bundle savedState) {
        int i2;
        this.bg = C2082k.zy().m8001n().m10535g("wallpaper");
        this.ar = intent.getStringExtra("uuid");
        this.bc = intent.getStringExtra(InterfaceC1357q.f53863e5);
        this.bd = intent.getBooleanExtra(InterfaceC1925p.a95z, true);
        int intExtra = intent.getIntExtra(InterfaceC1925p.byb3, 0);
        this.f17007j = intExtra;
        this.f17009o = intExtra;
        this.bl = new C2853p(this, this.ar, this.bd, this.xqx, this.bg, this.xhv, this.bc);
        if (savedState != null && (i2 = savedState.getInt(afw, -1)) > -1) {
            this.bl.zurt(savedState);
            this.f17007j = i2;
            this.f17009o = i2;
        }
        this.bl.ki();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r25n(boolean moveLeft) {
        if (moveLeft) {
            this.f17003b.setTranslationX(-this.q7k9);
        } else {
            this.f17003b.setTranslationX(0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rp(UIProduct product) {
        C2853p c2853p;
        if (product == null || (c2853p = this.bl) == null) {
            return;
        }
        UISubject uISubjectM10156n = c2853p.m10156n(c2853p.m10153g());
        String str = uISubjectM10156n.subjectTitle;
        if (str == null || !str.contains(C5658n.f73185t8r)) {
            this.f17010u.setText(uISubjectM10156n.subjectTitle);
            this.f17011v.setText(this.th6);
        } else {
            String str2 = uISubjectM10156n.subjectTitle;
            String strSubstring = str2.substring(0, str2.indexOf(C5658n.f73185t8r));
            String strSubstring2 = uISubjectM10156n.subjectTitle.substring(strSubstring.length() + 1, uISubjectM10156n.subjectTitle.length());
            this.f17010u.setText(strSubstring);
            this.f17011v.setText(strSubstring2);
        }
        UILink uILink = uISubjectM10156n.link;
        if (uILink == null || TextUtils.isEmpty(uILink.link)) {
            this.f17010u.getPaint().setFlags(1);
        } else {
            this.f17010u.getPaint().setFlags(9);
        }
        String str3 = !TextUtils.isEmpty(product.uuid) ? product.uuid : product.productUuid;
        this.f17005d.setSelected(EnumC1933t.FAVORITE.contains(str3));
        this.bb.setSelected(EnumC1933t.LIKE.contains(str3));
        Integer num = product.likeCount;
        if (num == null || num.intValue() == 0) {
            this.bb.setText(this.cw14);
        } else {
            this.bb.setText(product.likeCount + "");
        }
        cyoe(product.wallpaperGalleryType, product.wallpaperGalleryTypeColor);
    }

    private void uf() {
        this.bq = (RecyclerView) findViewById(R.id.recyclerView);
        this.ba = (SpringBackLayout) findViewById(R.id.refreshLayout);
        this.am = findViewById(R.id.loading);
        C2367n c2367n = new C2367n();
        c2367n.setContext(this).setRefresh(false).setLoadMore(true).setStaggerHolderWidth((C1819o.jk(this) - (getResources().getDimensionPixelSize(R.dimen.stagger_divider) * 6)) / 2).setLayoutManagerType(0).setCardDivider(false).setResCode("wallpaper").setPicker(false);
        this.ax = new RecommendListViewAdapter(this, c2367n, null);
        this.ay = new StaggeredGridLayoutManager(2, 1);
        this.ndjo = new com.android.thememanager.basemodule.utils.dd();
        this.bq.setLayoutManager(this.ay);
        this.bq.addItemDecoration(new C2870n(getResources().getDimensionPixelSize(R.dimen.stagger_divider)));
        this.bq.setAdapter(this.ax);
        this.bq.addOnScrollListener(new zy());
        this.az = new com.android.thememanager.basemodule.views.x2(this.ba, new C2841q(), false, true);
    }

    private void v5yj() {
        this.wra.clear();
    }

    private void vy() {
        this.bv.setVisibility(0);
        this.bq.setVisibility(0);
        ViewGroup viewGroup = this.ad;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    private void yw(String event) {
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("entryType", com.android.thememanager.basemodule.analysis.f7l8.m6607g());
        arrayMapM6679k.put("name", this.bl.m10159y().getTitle());
        arrayMapM6679k.put("productId", this.bl.m10159y().getOnlineId());
        arrayMapM6679k.put("resourceType", this.bg.getResourceCode());
        arrayMapM6679k.put("source", com.android.thememanager.basemodule.analysis.toq.x0c);
        C1708s.f7l8().ld6().n5r1(event, C1706p.ki(arrayMapM6679k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z4t(final String onlineUrl, final int applyType, final WallpaperApplyInfos infos, final int dpi) {
        if (!com.android.thememanager.util.kja0.m9846g("image", Integer.valueOf(applyType)) && !com.android.thememanager.util.kja0.f7l8("image", Integer.valueOf(applyType))) {
            bap7(onlineUrl, applyType, infos, dpi);
        } else {
            final int qVar = com.android.thememanager.util.kja0.toq();
            this.zr5t = new com.android.thememanager.util.kja0().m9849q(this, qVar, true, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.v9.zurt
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f17207k.b8(qVar, applyType, onlineUrl, infos, dpi, dialogInterface, i2);
                }
            }).m9850y();
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    /* JADX INFO: renamed from: a */
    public String mo6345a() {
        String str = this.f9864s;
        return str != null ? String.format(com.android.thememanager.basemodule.analysis.toq.dkhc, str) : super.mo6345a();
    }

    @Override // com.android.thememanager.controller.online.mcp.zy
    /* JADX INFO: renamed from: c */
    public void mo7596c(wvg.toq result) {
        boolean zContains = EnumC1933t.LIKE.contains(this.bl.m10159y());
        UIProduct uIProductF7l8 = this.bl.f7l8();
        if (uIProductF7l8 == null || !TextUtils.equals(uIProductF7l8.uuid, result.f11028k)) {
            C7794k.m28196p("WSA", "WallpaperSubjectActivity. product null OR id not same., return");
            return;
        }
        if (uIProductF7l8.likeCount == null) {
            uIProductF7l8.likeCount = 0;
        }
        if (zContains) {
            uIProductF7l8.likeCount = Integer.valueOf(uIProductF7l8.likeCount.intValue() + 1);
        } else {
            uIProductF7l8.likeCount = Integer.valueOf(uIProductF7l8.likeCount.intValue() - 1);
        }
        this.bb.setSelected(zContains);
        if (uIProductF7l8.likeCount.intValue() != 0) {
            this.bb.setText(String.valueOf(uIProductF7l8.likeCount));
        } else {
            this.bb.setText(this.cw14);
        }
        this.bl.m10159y().setLike(Boolean.valueOf(zContains));
        this.bl.m10159y().setLikeCount(uIProductF7l8.likeCount);
        String str = zContains ? "LIKE" : "DIS_LIKE";
        com.android.thememanager.basemodule.analysis.kja0.m6641s(str, this.f9864s, this.bl.m10159y().getOnlineInfo().getTrackId(), null);
        C1708s.f7l8().ld6().n5r1(str, C1706p.kja0(this.f9864s, this.bl.m10159y().getOnlineInfo().getTrackId(), ""));
    }

    @Override // com.android.thememanager.controller.online.mcp.zy
    public void cdj(boolean result) {
        this.f17005d.setSelected(result);
        String str = result ? "FAVOURITE" : "DIS_FAVOURITE";
        com.android.thememanager.basemodule.analysis.kja0.m6641s(str, this.f9864s, this.bl.m10159y().getOnlineInfo().getTrackId(), null);
        C1708s.f7l8().ld6().n5r1(str, C1706p.kja0(this.f9864s, this.bl.m10159y().getOnlineInfo().getTrackId(), ""));
    }

    public void ew(@dd UIResult data) {
        List<UIElement> list;
        boolean z2 = this.bu == 0;
        if (data == null || (list = data.elementList) == null) {
            ra(z2, false, true);
            return;
        }
        this.f9864s = data.pageId;
        ArrayList arrayList = new ArrayList();
        List<String> list2 = data.adTagIds;
        if (list2 != null) {
            for (String str : list2) {
                if (!this.wra.contains(str)) {
                    arrayList.add(str);
                }
            }
            this.wra.addAll(arrayList);
        }
        this.ax.mo8550n(list, !z2, data.hasMore);
        ra(z2, true, data.hasMore);
        this.bu++;
    }

    @Override // com.android.thememanager.recommend.player.AdAutoPlayer.InterfaceC2345k
    @zy.oc
    /* JADX INFO: renamed from: i */
    public AdAutoPlayer mo6321i() {
        if (this.ls9 == null) {
            this.ls9 = new AdAutoPlayer(this);
        }
        return this.ls9;
    }

    public void kx3() {
        if (this.in.getCanSlideLeft()) {
            return;
        }
        this.in.setCanSlideLeft(true);
        nn86.toq(this.xy8, 0);
    }

    public void m2t(String uuid, boolean isSubject) {
        this.bs = uuid;
        v5yj();
        this.k0 = isSubject;
        this.bu = 0;
        l05(0, false);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null) {
            this.f17007j = data.getIntExtra(InterfaceC1357q.f53902lh, 0);
            this.as = (ArrayList) data.getSerializableExtra(InterfaceC1357q.f53881h4b);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        int id = v2.getId();
        if (id == R.id.img_back) {
            finish();
            return;
        }
        C2853p c2853p = this.bl;
        if (c2853p != null) {
            UIProduct uIProductF7l8 = c2853p.f7l8();
            ArrayList<WallpaperRecommendItem> arrayListN7h = this.bl.n7h();
            ArrayList arrayList = new ArrayList();
            Iterator<WallpaperRecommendItem> it = arrayListN7h.iterator();
            String str = null;
            while (it.hasNext()) {
                for (UISubject uISubject : it.next().subjects) {
                    if (uISubject != null) {
                        List<UIProduct> list = uISubject.products;
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        if (str == null && !TextUtils.isEmpty(uISubject.subjectTitle)) {
                            str = uISubject.subjectTitle;
                        }
                    }
                }
            }
            if (uIProductF7l8 != null) {
                if (id == R.id.pager_wallpaper) {
                    int currentItem = this.an.getCurrentItem();
                    d8wk(uIProductF7l8.trackId, null);
                    com.android.thememanager.toq.a9(this, currentItem, arrayList, 3, true, arrayListN7h.size() - 2, arrayListN7h.get(0).updateBelowUuid, str);
                    return;
                }
                if (id == R.id.item_sub_title || id == R.id.item_title) {
                    UISubject uISubjectM10158s = this.bl.m10158s();
                    C2451n.f7l8(this, null, uISubjectM10158s.link);
                    UILink uILink = uISubjectM10158s.link;
                    if (uILink != null) {
                        d8wk(uILink.trackId, null);
                        return;
                    }
                    return;
                }
                if (id == R.id.favorite) {
                    Resource resourceM10159y = this.bl.m10159y();
                    if (resourceM10159y != null) {
                        this.tlhn.m7593y(this, v2, this.bg, resourceM10159y, this.f9864s);
                        return;
                    } else {
                        Log.w(qns, "onClick: Resource is null in favorite");
                        return;
                    }
                }
                if (id == R.id.lab) {
                    C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.ahy0));
                    Intent intent = new Intent(this, (Class<?>) ThemeLabActivity.class);
                    intent.putExtra(p001b.f7l8.nod, "wallpaper_subject");
                    startActivity(intent);
                    return;
                }
                if (id == R.id.apply) {
                    if (!com.android.thememanager.basemodule.privacy.x2.zy()) {
                        m6715x().m6909i(this, null);
                        return;
                    } else {
                        if (lvui.qrj(this, this.zsl)) {
                            return;
                        }
                        ix();
                        return;
                    }
                }
                if (id != R.id.share) {
                    if (id == R.id.like) {
                        Resource resourceM10159y2 = this.bl.m10159y();
                        if (resourceM10159y2 != null) {
                            this.tlhn.m7592s(this, v2, null, resourceM10159y2, this.f9864s);
                            return;
                        } else {
                            Log.w(qns, "onClick: Resource is null in like");
                            return;
                        }
                    }
                    return;
                }
                if (!com.android.thememanager.basemodule.privacy.x2.zy()) {
                    m6715x().m6909i(this, null);
                    return;
                }
                UISubject uISubjectM10158s2 = this.bl.m10158s();
                String trackId = this.bl.m10159y().getOnlineInfo().getTrackId();
                new C2708s(this.f9864s, trackId).m9461k(C2708s.f16056n);
                com.android.thememanager.share.f7l8.m9440y(this, uIProductF7l8.shareUrl, uISubjectM10158s2.subjectTitle, uISubjectM10158s2.subjectUuid, uIProductF7l8.uuid, trackId, this.f9864s, this.bl.ld6(this.f17007j), this.k0);
            }
        }
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        m6711e(savedInstanceState);
        C1819o.n7h(this);
        Intent intent = getIntent();
        py.m9954q(intent);
        super.onCreate(savedInstanceState);
        C1819o.zy(this, findViewById(R.id.rootLayout));
        oki();
        fu4 fu4Var = (fu4) new C0924e(this).m4420k(fu4.class);
        this.xqx = fu4Var;
        fu4Var.lrht().m4391p(this, new jp0y() { // from class: com.android.thememanager.v9.ni7
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f17177k.ew((UIResult) obj);
            }
        });
        ps(intent, savedInstanceState);
        if (!TextUtils.isEmpty(this.ar)) {
            ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
            com.android.thememanager.basemodule.analysis.zy.m6681q(arrayMapM6679k);
            com.android.thememanager.basemodule.analysis.kja0.m6641s("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.x0c, this.ar, new C4871g().o1t(arrayMapM6679k));
            C1708s.f7l8().ld6().cdj(C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.x0c, this.ar, arrayMapM6679k));
        }
        o05();
        C7776k.m28157y().m28158g(this);
        getLifecycle().mo4451k(new ScreenShotReportManager(this, com.android.thememanager.basemodule.analysis.toq.x0c, this.bg.getResourceCode()));
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        this.tlhn.ld6();
        Handler handler = this.d1cy;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.d1cy = null;
        }
        zy.InterfaceC1958k interfaceC1958k = this.wh6;
        if (interfaceC1958k != null) {
            interfaceC1958k.zy();
        }
        super.onDestroy();
        com.android.thememanager.util.kja0 kja0Var = this.zr5t;
        if (kja0Var != null) {
            kja0Var.m9847k();
        }
        ncyb ncybVar = this.bp;
        if (ncybVar != null && ncybVar.m10411y()) {
            this.bp.zy();
            this.bp = null;
        }
        C7776k.m28157y().n7h(this);
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        ArrayList<WallpaperRecommendItem> arrayList = this.as;
        if (arrayList != null && arrayList.size() > this.bl.n7h().size()) {
            this.bl.m10160z(this.as);
            this.id.x2();
        }
        int currentItem = this.an.getCurrentItem();
        this.an.setCurrentItem(this.f17007j);
        this.bl.fu4(this.f17007j);
        if (currentItem == 0 && this.f17007j != 0) {
            cnbm();
        }
        UISubject uISubjectM10156n = this.bl.m10156n(this.f17007j);
        if (uISubjectM10156n != null) {
            this.bs = uISubjectM10156n.subjectUuid;
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        WallpaperViewPager wallpaperViewPager;
        super.onSaveInstanceState(outState);
        if (this.bl == null || (wallpaperViewPager = this.an) == null) {
            return;
        }
        int currentItem = wallpaperViewPager.getCurrentItem();
        this.bl.ni7(outState, currentItem);
        outState.putInt(afw, currentItem);
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return com.android.thememanager.basemodule.utils.zurt.m7261k(R.layout.wallpaper_subject_detail, R.layout.wallpaper_subject_detail_elder);
    }

    public void ra(boolean firstPage, boolean loadSuccess, boolean hasMore) {
        if (firstPage) {
            this.am.setVisibility(8);
            if (loadSuccess) {
                ga();
            } else {
                ec();
            }
        } else {
            this.az.m7374q(loadSuccess, hasMore);
        }
        this.az.m7373p(hasMore);
    }

    public void u38j(boolean isFirstLoad, String pageUuid) {
        this.id.x2();
        if (isFirstLoad) {
            if (!this.bd) {
                WallpaperRecommendItem wallpaperRecommendItem = this.bl.n7h().get(0);
                if (wallpaperRecommendItem.isSubjectUuid) {
                    int size = wallpaperRecommendItem.subjects.get(0).products.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.ar.equals(wallpaperRecommendItem.subjects.get(0).products.get(i2).uuid)) {
                            this.f17007j = i2;
                        }
                    }
                }
                cnbm();
            }
            if (this.f17007j >= this.an.getCount()) {
                nnh();
            }
            this.f9864s = pageUuid;
            this.an.setCurrentItem(this.f17007j);
            this.bl.fu4(this.f17007j);
            vy();
        }
        lh(this.f17007j);
    }

    /* JADX INFO: renamed from: w */
    public void m10135w() {
        nn86.toq(getResources().getString(R.string.resource_status_error), 0);
        Handler handler = this.d1cy;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.android.thememanager.v9.fn3e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17101k.b9ub();
                }
            }, 500L);
        }
    }

    public ArrayList<WallpaperRecommendItem> wlev() {
        return this.bl.n7h();
    }
}

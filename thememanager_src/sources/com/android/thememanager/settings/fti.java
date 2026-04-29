package com.android.thememanager.settings;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.basemodule.views.x2;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.settings.WallpaperMiuiTabActivity;
import com.android.thememanager.settings.personalize.view.C2596y;
import com.android.thememanager.util.gc3c;
import com.google.gson.C4871g;
import miuix.appcompat.app.AbstractC6946k;
import miuix.appcompat.app.ki;
import miuix.springback.view.SpringBackLayout;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: WallpaperListFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class fti extends C1582h implements InterfaceC1357q, InterfaceC1925p, com.android.thememanager.basemodule.analysis.toq, WallpaperMiuiTabActivity.zy {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f60781ab = 0;
    public static final int an = 12;
    public static final int bb = 2;
    public static final int bp = 4;
    public static final int bv = 8;

    /* JADX INFO: renamed from: d */
    public static final int f15005d = 0;
    public static final int id = 16;
    public static final int in = 20;

    /* JADX INFO: renamed from: w */
    public static final int f15006w = 1;

    /* JADX INFO: renamed from: a */
    private int f15007a;

    /* JADX INFO: renamed from: b */
    private Page f15008b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f60782bo;

    /* JADX INFO: renamed from: c */
    private SpringBackLayout f15009c;

    /* JADX INFO: renamed from: e */
    private RecyclerView f15010e;

    /* JADX INFO: renamed from: f */
    private com.android.thememanager.basemodule.views.x2 f15011f;

    /* JADX INFO: renamed from: j */
    private o1t f15012j;

    /* JADX INFO: renamed from: m */
    private View f15013m;

    /* JADX INFO: renamed from: o */
    private View f15014o;

    /* JADX INFO: renamed from: u */
    private boolean f15015u;

    /* JADX INFO: renamed from: v */
    private miuix.appcompat.app.ki f15016v;

    /* JADX INFO: renamed from: x */
    private boolean f15017x;

    /* JADX INFO: renamed from: com.android.thememanager.settings.fti$k */
    /* JADX INFO: compiled from: WallpaperListFragment.java */
    class C2512k implements C1688q.n {
        C2512k() {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            if (fti.this.isAdded()) {
                fti.this.btvn();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.fti$q */
    /* JADX INFO: compiled from: WallpaperListFragment.java */
    class C2513q implements x2.InterfaceC1868n {
        C2513q() {
        }

        @Override // com.android.thememanager.basemodule.views.x2.InterfaceC1868n
        public void toq() {
            fti.this.f15012j.d2ok(false);
        }
    }

    /* JADX INFO: compiled from: WallpaperListFragment.java */
    class toq implements ViewTreeObserver.OnGlobalLayoutListener {
        toq() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            fti.this.f15014o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            fti.this.f15014o.measure(0, 0);
            fti ftiVar = fti.this;
            ftiVar.tww7(ftiVar.f15014o);
        }
    }

    /* JADX INFO: compiled from: WallpaperListFragment.java */
    class zy implements ViewTreeObserver.OnGlobalLayoutListener {
        zy() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            fti.this.f15013m.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            fti.this.f15013m.measure(0, 0);
            fti ftiVar = fti.this;
            ftiVar.tww7(ftiVar.f15013m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btvn() {
        if (this.f15008b != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(this.f15017x ? R.dimen.wallpaper_setting_square_horizontal_margin : R.dimen.wallpaper_setting_three_horizontal_margin);
            int dimensionPixelSize2 = this.f15017x ? getResources().getDimensionPixelSize(R.dimen.wallpaper_detail_apply_round_raidus) : getResources().getDimensionPixelOffset(R.dimen.wallpaper_setting_three_edge);
            int iX2 = gc3c.x2();
            int i2 = this.f60782bo;
            o1t o1tVar = new o1t(this, this.f9059l, this.f15007a, this.f15017x, this.f15015u, this.f15008b.getKey(), ((iX2 - (dimensionPixelSize * (i2 - 1))) - (dimensionPixelSize2 * 2)) / i2);
            this.f15012j = o1tVar;
            this.f15010e.setAdapter(o1tVar);
            if ((xm() && (!xm() || !C1688q.cdj().wvg())) || (this.f15007a != 4 && !com.android.thememanager.basemodule.utils.lvui.wvg())) {
                kbj(false, false);
            } else {
                this.f15012j.d2ok(false);
                qh4d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cn02(View view) {
        if (!xm() || C1688q.cdj().wvg()) {
            if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
                com.android.thememanager.basemodule.privacy.x2.m6916q(getContext(), new p000a.toq() { // from class: com.android.thememanager.settings.a9
                    @Override // p000a.toq
                    public final void onSuccess() {
                        this.f14956k.mj();
                    }
                });
            } else {
                this.f15012j.d2ok(false);
                qh4d();
            }
        }
    }

    private void gb() {
        int i2 = this.f15007a;
        boolean z2 = i2 == 8 || i2 == 12;
        AbstractC6946k abstractC6946kZ4t = z4t();
        if (abstractC6946kZ4t == null || z2) {
            return;
        }
        abstractC6946kZ4t.ij(null);
    }

    private void hyow() {
        if (this.f15016v == null) {
            this.f15016v = new ki.C6947k(getActivity()).lrht(R.string.resource_account_login).m25047s(false).fu4(R.string.resource_account_login_before_action).dd(R.string.resource_account_login, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.settings.mcp
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f15115k.ovdh(dialogInterface, i2);
                }
            }).mcp(R.string.exit_extreme_mode_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.settings.jk
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.dismiss();
                }
            }).m25037g();
        }
        if (this.f15016v.isShowing()) {
            return;
        }
        this.f15016v.show();
    }

    private void kq2f(View root) {
        gb();
        View viewFindViewById = root.findViewById(R.id.loading);
        this.f15014o = viewFindViewById;
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new toq());
        this.f15013m = root.findViewById(R.id.empty_view);
        int i2 = this.f15007a;
        int i3 = R.string.unable_connect_network;
        int i4 = R.drawable.icon_no_record;
        if (i2 == 12) {
            i4 = R.drawable.icon_no_favorite;
            if (C1915g.m7550n()) {
                i3 = R.string.wallpaper_no_favorite;
            }
        } else if (i2 != 16) {
            i3 = R.string.wallpaper_no_record;
        }
        ((ImageView) this.f15013m.findViewById(android.R.id.icon)).setImageResource(i4);
        ((TextView) this.f15013m.findViewById(android.R.id.hint)).setText(i3);
        this.f15013m.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15915k.cn02(view);
            }
        });
        this.f15013m.getViewTreeObserver().addOnGlobalLayoutListener(new zy());
        SpringBackLayout springBackLayout = (SpringBackLayout) root.findViewById(R.id.refresh_layout);
        this.f15009c = springBackLayout;
        this.f15011f = new com.android.thememanager.basemodule.views.x2(springBackLayout, new C2513q(), false, true);
        RecyclerView recyclerView = (RecyclerView) root.findViewById(android.R.id.list);
        this.f15010e = recyclerView;
        recyclerView.addItemDecoration(new C2596y(getResources().getDimensionPixelSize(R.dimen.wallper_list_margin_top)));
        int dimensionPixelSize = getResources().getDimensionPixelSize(this.f15017x ? R.dimen.wallpaper_setting_square_horizontal_margin : R.dimen.wallpaper_setting_three_horizontal_margin);
        int dimensionPixelSize2 = this.f15017x ? getResources().getDimensionPixelSize(R.dimen.wallpaper_detail_apply_round_raidus) : 0;
        this.f60782bo = this.f15017x ? 2 : 3;
        this.f15010e.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        com.android.thememanager.view.n7h n7hVar = new com.android.thememanager.view.n7h(this.f60782bo, dimensionPixelSize, getResources().getDimensionPixelOffset(R.dimen.wallpaper_setting_three_edge), !this.f15017x);
        this.f15010e.setLayoutManager(new GridLayoutManager(getActivity(), this.f60782bo));
        this.f15010e.addItemDecoration(n7hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mj() {
        this.f15012j.d2ok(false);
        qh4d();
    }

    private void ob(int flag) {
        this.f15007a = (flag >> 2) << 2;
        this.f15017x = (flag & 2) != 0;
        this.f15015u = (flag & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ovdh(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        if (C1781k.toq(bf2.toq.toq())) {
            C1688q.cdj().fti(getActivity(), new C2512k());
        } else {
            ew(true);
        }
    }

    private void qh4d() {
        this.f15014o.setVisibility(0);
        this.f15013m.setVisibility(8);
        this.f15010e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tww7(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = (getActivity().getWindow().getDecorView().getHeight() - view.getMeasuredHeight()) / 2;
        if (y9n.m7258z() && !gc3c.m9777h()) {
            layoutParams.bottomMargin -= gc3c.m9781p();
        }
        view.setLayoutParams(layoutParams);
    }

    private void xblq() {
        int i2 = this.f15007a;
        String string = null;
        String str = i2 != 4 ? i2 != 8 ? i2 != 12 ? i2 != 16 ? null : this.f15015u ? com.android.thememanager.basemodule.analysis.toq.lflh : com.android.thememanager.basemodule.analysis.toq.se2c : this.f15015u ? com.android.thememanager.basemodule.analysis.toq.nd : com.android.thememanager.basemodule.analysis.toq.qm8 : this.f15015u ? com.android.thememanager.basemodule.analysis.toq.rh : com.android.thememanager.basemodule.analysis.toq.gz : this.f15015u ? com.android.thememanager.basemodule.analysis.toq.ar4 : com.android.thememanager.basemodule.analysis.toq.d7y;
        AbstractC6946k abstractC6946kZ4t = z4t();
        if (abstractC6946kZ4t != null && abstractC6946kZ4t.mo171t() != null) {
            string = abstractC6946kZ4t.mo171t().toString();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.android.thememanager.basemodule.analysis.kja0.m6641s("T_EXPOSE", kx3(), str, string);
        C1708s.f7l8().ld6().cdj(C1706p.kja0(kx3(), str, string));
    }

    private boolean xm() {
        return this.f15007a == 12;
    }

    public void kbj(boolean success, boolean hasMore) {
        this.f15014o.setVisibility(8);
        this.f15011f.m7374q(success, hasMore);
        this.f15011f.m7373p(hasMore);
        if (success) {
            if (this.f15012j.getItemCount() == 0) {
                this.f15013m.setClickable(false);
                this.f15013m.setVisibility(0);
            }
            this.f15010e.setVisibility(0);
        } else {
            if (!C1915g.m7550n()) {
                nn86.m7150k(R.string.unable_connect_network, 0);
            }
            if (this.f15012j.getItemCount() > 0) {
                this.f15010e.setVisibility(0);
            } else {
                this.f15013m.setClickable(true);
                this.f15013m.setVisibility(0);
            }
        }
        this.f15011f.m7376y(this.f15013m.getVisibility() != 0);
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String kx3() {
        int i2 = this.f15007a;
        if (i2 == 4) {
            return com.android.thememanager.basemodule.analysis.toq.oj;
        }
        if (i2 == 8) {
            return com.android.thememanager.basemodule.analysis.toq.rlpj;
        }
        if (i2 == 12) {
            return com.android.thememanager.basemodule.analysis.toq.nz77;
        }
        if (i2 == 16) {
            return com.android.thememanager.basemodule.analysis.toq.i49;
        }
        throw new IllegalArgumentException("unknown category. " + this.f15007a);
    }

    @Override // com.android.thememanager.settings.WallpaperMiuiTabActivity.zy
    public void nn86() {
        btvn();
    }

    @Override // com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btvn();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageGroup pageGroup = kiv() != null ? (PageGroup) kiv().getSerializable(InterfaceC1357q.f53848bf2) : null;
        if (pageGroup != null && pageGroup.getPages() != null && pageGroup.getPages().size() > 0) {
            this.f15008b = pageGroup.getPages().get(0);
        }
        Page page = this.f15008b;
        if (page != null) {
            ob(page.getFlag());
        } else if (getActivity() != null) {
            getActivity().getSupportFragmentManager().ki().fu4(this).n7h();
        }
        if ((getActivity() instanceof WallpaperMiuiTabActivity) && this.f15007a == 8) {
            ((WallpaperMiuiTabActivity) getActivity()).ga(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.wallpaper_list, container, false);
        kq2f(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        miuix.appcompat.app.ki kiVar = this.f15016v;
        if (kiVar == null || !kiVar.isShowing()) {
            return;
        }
        this.f15016v.dismiss();
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public void ra(boolean visibleForUser) {
        if (visibleForUser) {
            xblq();
            if (xm()) {
                if (!C1781k.toq(bf2.toq.toq())) {
                    ew(true);
                } else if (!C1688q.cdj().wvg()) {
                    hyow();
                }
            }
        }
        if (this.f15012j == null) {
            return;
        }
        if (getActivity() instanceof WallpaperTabActivity) {
            if (((WallpaperTabActivity) getActivity()).bc) {
                this.f15012j.ncyb();
            } else {
                this.f15012j.mcp();
            }
        }
        if (getActivity() instanceof WallpaperMiuiTabActivity) {
            this.f15012j.mcp();
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq
    /* JADX INFO: renamed from: w */
    public String mo6436w() {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(com.android.thememanager.basemodule.analysis.toq.pm, String.valueOf(this.f15015u));
        arrayMap.put(com.android.thememanager.basemodule.analysis.toq.fz, String.valueOf(this.f15017x));
        arrayMap.put("category", String.valueOf(this.f15007a));
        return new C4871g().o1t(arrayMap);
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.basemodule.privacy.C1781k.f7l8
    public void y9n(boolean agree) {
        if (C1688q.cdj().wvg()) {
            btvn();
        } else {
            hyow();
        }
    }
}

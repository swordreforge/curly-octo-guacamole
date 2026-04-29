package com.android.thememanager.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.C1116y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.activity.SuperWallpaperListActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.settings.presenter.C2599g;
import com.android.thememanager.settings.subsettings.C2619q;
import com.android.thememanager.settings.subsettings.C2622y;
import com.android.thememanager.settings.subsettings.WallpaperSubVAdapter;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.widget.FindMoreButton;
import i1.C6077k;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThemeAndWallpaperSettingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class kja0 extends com.android.thememanager.basemodule.base.toq implements View.OnClickListener {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @InterfaceC7396q
    public static final C2520k f60787bo = new C2520k(null);

    /* JADX INFO: renamed from: v */
    @InterfaceC7396q
    private static final String f15089v = "ThemeAndWallpaperSettingFragment";

    /* JADX INFO: renamed from: b */
    private int f15091b;

    /* JADX INFO: renamed from: c */
    private C1116y f15092c;

    /* JADX INFO: renamed from: e */
    private WallpaperSubVAdapter f15093e;

    /* JADX INFO: renamed from: f */
    private C2599g f15094f;

    /* JADX INFO: renamed from: j */
    @InterfaceC7395n
    private ThemeAndWallpaperSettingActivity f15095j;

    /* JADX INFO: renamed from: l */
    @InterfaceC7395n
    private FindMoreButton f15096l;

    /* JADX INFO: renamed from: r */
    private ViewStub f15099r;

    /* JADX INFO: renamed from: t */
    private RecyclerView f15100t;

    /* JADX INFO: renamed from: x */
    private boolean f15102x;

    /* JADX INFO: renamed from: o */
    @InterfaceC7396q
    private final String f15098o = "scrollOffset";

    /* JADX INFO: renamed from: m */
    @InterfaceC7396q
    private final AtomicBoolean f15097m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    private int f15090a = 2000;

    /* JADX INFO: renamed from: u */
    @InterfaceC7396q
    private final BroadcastReceiver f15101u = new C2519g();

    /* JADX INFO: renamed from: com.android.thememanager.settings.kja0$g */
    /* JADX INFO: compiled from: ThemeAndWallpaperSettingFragment.kt */
    public static final class C2519g extends BroadcastReceiver {
        C2519g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@InterfaceC7396q Context context, @InterfaceC7396q Intent intent) {
            kotlin.jvm.internal.d2ok.m23075h(context, "context");
            kotlin.jvm.internal.d2ok.m23075h(intent, "intent");
            int intExtra = intent.getIntExtra("errorCode", 0);
            String stringExtra = intent.getStringExtra("packageName");
            if (intExtra == 4) {
                C2599g c2599g = kja0.this.f15094f;
                C2599g c2599g2 = null;
                if (c2599g == null) {
                    kotlin.jvm.internal.d2ok.n5r1("mViewModel");
                    c2599g = null;
                }
                C2599g c2599g3 = kja0.this.f15094f;
                if (c2599g3 == null) {
                    kotlin.jvm.internal.d2ok.n5r1("mViewModel");
                } else {
                    c2599g2 = c2599g3;
                }
                c2599g.xwq3(c2599g2.ek5k().m4388g(), stringExtra);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.kja0$k */
    /* JADX INFO: compiled from: ThemeAndWallpaperSettingFragment.kt */
    public static final class C2520k {
        private C2520k() {
        }

        public /* synthetic */ C2520k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.kja0$n */
    /* JADX INFO: compiled from: ThemeAndWallpaperSettingFragment.kt */
    static final class C2521n extends AbstractC6308r implements cyoe.x2<SuperWallpaperSummaryData[], was> {
        final /* synthetic */ com.android.thememanager.settings.subsettings.n7h $superAdapter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2521n(com.android.thememanager.settings.subsettings.n7h n7hVar) {
            super(1);
            this.$superAdapter = n7hVar;
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(SuperWallpaperSummaryData[] superWallpaperSummaryDataArr) {
            invoke2(superWallpaperSummaryDataArr);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SuperWallpaperSummaryData[] superWallpaperSummaryDataArr) {
            this.$superAdapter.fu4(superWallpaperSummaryDataArr);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.kja0$q */
    /* JADX INFO: compiled from: ThemeAndWallpaperSettingFragment.kt */
    static final class C2522q extends AbstractC6308r implements cyoe.x2<C2599g.zy, was> {
        C2522q() {
            super(1);
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ was invoke(C2599g.zy zyVar) {
            invoke2(zyVar);
            return was.f36763k;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2599g.zy zyVar) {
            kja0.this.wt(zyVar.f15389k, zyVar.f60847toq, zyVar.f60848zy);
        }
    }

    /* JADX INFO: compiled from: ThemeAndWallpaperSettingFragment.kt */
    public static final class toq extends RecyclerView.fn3e {
        toq() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrolled(@InterfaceC7396q RecyclerView recyclerView, int i2, int i3) {
            kotlin.jvm.internal.d2ok.m23075h(recyclerView, "recyclerView");
            kja0.this.f15091b += i3;
            kja0.this.yp31();
        }
    }

    /* JADX INFO: compiled from: ThemeAndWallpaperSettingFragment.kt */
    public static final class zy extends RecyclerView.kja0 {
        zy() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@InterfaceC7396q Rect outRect, @InterfaceC7396q View view, @InterfaceC7396q RecyclerView parent, @InterfaceC7396q RecyclerView.mcp state) {
            kotlin.jvm.internal.d2ok.m23075h(outRect, "outRect");
            kotlin.jvm.internal.d2ok.m23075h(view, "view");
            kotlin.jvm.internal.d2ok.m23075h(parent, "parent");
            kotlin.jvm.internal.d2ok.m23075h(state, "state");
            RecyclerView.AbstractC1060y adapter = parent.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : -10;
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition != itemCount - 1 || childAdapterPosition <= 7) {
                return;
            }
            FindMoreButton findMoreButton = kja0.this.f15096l;
            int heightWithShadow = findMoreButton != null ? findMoreButton.getHeightWithShadow() : -1;
            if (heightWithShadow <= 0) {
                heightWithShadow = kja0.this.getResources().getDimensionPixelSize(R.dimen.wallpaper_setting_find_more_button_height);
            }
            outRect.bottom = heightWithShadow;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bqie(cyoe.x2 tmp0, Object obj) {
        kotlin.jvm.internal.d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void el() {
        if (this.f15096l != null) {
            return;
        }
        ViewStub viewStub = this.f15099r;
        if (viewStub == null) {
            kotlin.jvm.internal.d2ok.n5r1("mFindMoreStub");
            viewStub = null;
        }
        View viewInflate = viewStub.inflate();
        kotlin.jvm.internal.d2ok.n7h(viewInflate, "null cannot be cast to non-null type com.android.thememanager.settings.superwallpaper.widget.FindMoreButton");
        FindMoreButton findMoreButton = (FindMoreButton) viewInflate;
        findMoreButton.setOnClickListener(this);
        C6077k.fu4(findMoreButton);
        ViewGroup.LayoutParams layoutParams = findMoreButton.getLayoutParams();
        kotlin.jvm.internal.d2ok.n7h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = -marginLayoutParams.height;
        findMoreButton.setLayoutParams(marginLayoutParams);
        this.f15096l = findMoreButton;
    }

    private final CopyOnWriteArrayList<com.android.thememanager.settings.subsettings.f7l8> f1bi(List<? extends com.android.thememanager.settings.subsettings.f7l8> list) {
        CopyOnWriteArrayList<com.android.thememanager.settings.subsettings.f7l8> copyOnWriteArrayList = new CopyOnWriteArrayList<>(list);
        Iterator<com.android.thememanager.settings.subsettings.f7l8> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.android.thememanager.settings.subsettings.f7l8 next = it.next();
            List<Resource> list2 = next != null ? next.f60866zy : null;
            kotlin.jvm.internal.d2ok.qrj(list2);
            Iterator<Resource> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (C2619q.wvg(it2.next())) {
                    copyOnWriteArrayList.remove(next);
                    break;
                }
            }
        }
        return copyOnWriteArrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0ad(kja0 this$0, View view) {
        Intent intent;
        Intent intent2;
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        Intent intent3 = new Intent(view.getContext(), (Class<?>) SuperWallpaperListActivity.class);
        ActivityC0891q activity = this$0.getActivity();
        Integer numValueOf = null;
        intent3.putExtra(com.android.thememanager.f7l8.f58072zy, (activity == null || (intent2 = activity.getIntent()) == null) ? null : Boolean.valueOf(intent2.getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false)));
        ActivityC0891q activity2 = this$0.getActivity();
        if (activity2 != null && (intent = activity2.getIntent()) != null) {
            numValueOf = Integer.valueOf(intent.getIntExtra(com.android.thememanager.f7l8.f11607n, -1));
        }
        intent3.putExtra(com.android.thememanager.f7l8.f11607n, numValueOf);
        this$0.startActivityForResult(intent3, 80);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void imd(cyoe.x2 tmp0, Object obj) {
        kotlin.jvm.internal.d2ok.m23075h(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void wt(int i2, List<? extends com.android.thememanager.settings.subsettings.f7l8> list, boolean z2) {
        Intent intent;
        if (list != null) {
            ActivityC0891q activity = getActivity();
            WallpaperSubVAdapter wallpaperSubVAdapter = 0;
            Boolean boolValueOf = (activity == null || (intent = activity.getIntent()) == null) ? null : Boolean.valueOf(intent.getBooleanExtra(com.android.thememanager.f7l8.f11609q, false));
            if (boolValueOf != null && boolValueOf.booleanValue() && 2 == i2) {
                list = f1bi(list);
            }
            Log.d(f15089v, "onLoadWallpaper: begin to setData, type = {" + i2 + "}, size of retList = {" + list.size() + '}');
            WallpaperSubVAdapter wallpaperSubVAdapter2 = this.f15093e;
            if (wallpaperSubVAdapter2 == null) {
                kotlin.jvm.internal.d2ok.n5r1("mWallpaperGroupAdapter");
            } else {
                wallpaperSubVAdapter = wallpaperSubVAdapter2;
            }
            wallpaperSubVAdapter.m9166l(i2, list, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yp31() {
        FindMoreButton findMoreButton;
        if (this.f15102x) {
            return;
        }
        if (this.f15091b < this.f15090a) {
            if (!this.f15097m.getAndSet(false) || (findMoreButton = this.f15096l) == null) {
                return;
            }
            findMoreButton.n7h();
            return;
        }
        if (this.f15097m.getAndSet(true)) {
            return;
        }
        FindMoreButton findMoreButton2 = this.f15096l;
        if (findMoreButton2 != null) {
            if (findMoreButton2 != null) {
                findMoreButton2.ki();
            }
        } else {
            el();
            FindMoreButton findMoreButton3 = this.f15096l;
            if (findMoreButton3 != null) {
                findMoreButton3.post(new Runnable() { // from class: com.android.thememanager.settings.n7h
                    @Override // java.lang.Runnable
                    public final void run() {
                        kja0.zff0(this.f15118k);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zff0(kja0 this$0) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        FindMoreButton findMoreButton = this$0.f15096l;
        if (findMoreButton != null) {
            findMoreButton.ki();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@InterfaceC7396q View v2) {
        String str;
        String str2;
        kotlin.jvm.internal.d2ok.m23075h(v2, "v");
        Intent intentZy = null;
        if (v2.getId() == R.id.find_more) {
            intentZy = com.android.thememanager.settings.superwallpaper.utils.x2.zy();
            str = com.android.thememanager.basemodule.analysis.toq.nr0;
            str2 = com.android.thememanager.basemodule.analysis.toq.zkf2;
        } else {
            str = null;
            str2 = null;
        }
        startActivity(intentZy);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1708s.f7l8().ld6().ni7(C1706p.m6654q(str, str2, ""));
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@InterfaceC7395n Bundle bundle) {
        super.onCreate(bundle);
        this.f15094f = (C2599g) new C0924e(this).m4420k(C2599g.class);
        ActivityC0891q activity = getActivity();
        kotlin.jvm.internal.d2ok.n7h(activity, "null cannot be cast to non-null type com.android.thememanager.settings.ThemeAndWallpaperSettingActivity");
        this.f15095j = (ThemeAndWallpaperSettingActivity) activity;
        IntentFilter intentFilter = new IntentFilter("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
        ThemeAndWallpaperSettingActivity themeAndWallpaperSettingActivity = this.f15095j;
        if (themeAndWallpaperSettingActivity != null) {
            themeAndWallpaperSettingActivity.registerReceiver(this.f15101u, intentFilter);
        }
        this.f15091b = bundle != null ? bundle.getInt(this.f15098o) : 0;
        this.f15102x = requireActivity().getIntent().getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false);
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC7396q
    public View onCreateView(@InterfaceC7396q LayoutInflater inflater, @InterfaceC7395n ViewGroup viewGroup, @InterfaceC7395n Bundle bundle) {
        kotlin.jvm.internal.d2ok.m23075h(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_theme_and_wallpaper_setting, viewGroup, false);
        kotlin.jvm.internal.d2ok.kja0(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ThemeAndWallpaperSettingActivity themeAndWallpaperSettingActivity = this.f15095j;
        if (themeAndWallpaperSettingActivity != null) {
            themeAndWallpaperSettingActivity.unregisterReceiver(this.f15101u);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C2599g c2599g = this.f15094f;
        WallpaperSubVAdapter wallpaperSubVAdapter = null;
        if (c2599g == null) {
            kotlin.jvm.internal.d2ok.n5r1("mViewModel");
            c2599g = null;
        }
        C2599g c2599g2 = this.f15094f;
        if (c2599g2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mViewModel");
            c2599g2 = null;
        }
        c2599g.gyi(c2599g2.ek5k().m4388g());
        WallpaperSubVAdapter wallpaperSubVAdapter2 = this.f15093e;
        if (wallpaperSubVAdapter2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mWallpaperGroupAdapter");
        } else {
            wallpaperSubVAdapter = wallpaperSubVAdapter2;
        }
        wallpaperSubVAdapter.m9165f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@InterfaceC7396q Bundle outState) {
        kotlin.jvm.internal.d2ok.m23075h(outState, "outState");
        outState.putInt(this.f15098o, this.f15091b);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@InterfaceC7396q View view, @InterfaceC7395n Bundle bundle) {
        kotlin.jvm.internal.d2ok.m23075h(view, "view");
        this.f15090a = zurt.zy.f47496ki;
        View viewFindViewById = view.findViewById(R.id.recyclerView);
        kotlin.jvm.internal.d2ok.kja0(viewFindViewById, "findViewById(...)");
        this.f15100t = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.viewStub);
        kotlin.jvm.internal.d2ok.kja0(viewFindViewById2, "findViewById(...)");
        this.f15099r = (ViewStub) viewFindViewById2;
        boolean zD2ok = C1819o.d2ok(view.getContext());
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
        kotlin.jvm.internal.d2ok.kja0(layoutInflaterFrom, "from(...)");
        C2622y c2622y = new C2622y(layoutInflaterFrom);
        LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(view.getContext());
        kotlin.jvm.internal.d2ok.kja0(layoutInflaterFrom2, "from(...)");
        com.android.thememanager.settings.subsettings.n7h n7hVar = new com.android.thememanager.settings.subsettings.n7h(layoutInflaterFrom2, new View.OnClickListener() { // from class: com.android.thememanager.settings.ld6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                kja0.g0ad(this.f15107k, view2);
            }
        });
        WallpaperSubVAdapter wallpaperSubVAdapter = new WallpaperSubVAdapter(this, false, zD2ok, 1.0f);
        this.f15093e = wallpaperSubVAdapter;
        this.f15092c = new C1116y((RecyclerView.AbstractC1060y<? extends RecyclerView.fti>[]) new RecyclerView.AbstractC1060y[]{c2622y, n7hVar, wallpaperSubVAdapter});
        RecyclerView recyclerView = this.f15100t;
        C2599g c2599g = null;
        if (recyclerView == null) {
            kotlin.jvm.internal.d2ok.n5r1("mRecyclerView");
            recyclerView = null;
        }
        C1116y c1116y = this.f15092c;
        if (c1116y == null) {
            kotlin.jvm.internal.d2ok.n5r1("mAdapter");
            c1116y = null;
        }
        recyclerView.setAdapter(c1116y);
        RecyclerView recyclerView2 = this.f15100t;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext()));
        RecyclerView recyclerView3 = this.f15100t;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mRecyclerView");
            recyclerView3 = null;
        }
        recyclerView3.addOnScrollListener(new toq());
        RecyclerView recyclerView4 = this.f15100t;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.addItemDecoration(new zy());
        C2599g c2599g2 = this.f15094f;
        if (c2599g2 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mViewModel");
            c2599g2 = null;
        }
        LiveData<C2599g.zy> liveDataYz = c2599g2.yz();
        InterfaceC0954z viewLifecycleOwner = getViewLifecycleOwner();
        final C2522q c2522q = new C2522q();
        liveDataYz.m4391p(viewLifecycleOwner, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.settings.x2
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                kja0.imd(c2522q, obj);
            }
        });
        C2599g c2599g3 = this.f15094f;
        if (c2599g3 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mViewModel");
            c2599g3 = null;
        }
        LiveData<SuperWallpaperSummaryData[]> liveDataEk5k = c2599g3.ek5k();
        InterfaceC0954z viewLifecycleOwner2 = getViewLifecycleOwner();
        final C2521n c2521n = new C2521n(n7hVar);
        liveDataEk5k.m4391p(viewLifecycleOwner2, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.settings.qrj
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                kja0.bqie(c2521n, obj);
            }
        });
        C2599g c2599g4 = this.f15094f;
        if (c2599g4 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mViewModel");
            c2599g4 = null;
        }
        c2599g4.zp(false);
        if (this.f15102x) {
            return;
        }
        C2599g c2599g5 = this.f15094f;
        if (c2599g5 == null) {
            kotlin.jvm.internal.d2ok.n5r1("mViewModel");
        } else {
            c2599g = c2599g5;
        }
        c2599g.nmn5();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@InterfaceC7395n Bundle bundle) {
        super.onViewStateRestored(bundle);
        yp31();
    }
}

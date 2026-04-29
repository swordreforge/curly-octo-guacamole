package com.android.thememanager.settings.superwallpaper.activity;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b3e.C1358k;
import bek6.C1367k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.kja0;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.activity.presenter.InterfaceC2644k;
import com.android.thememanager.settings.superwallpaper.adapter.zy;
import com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.k */
/* JADX INFO: compiled from: ChoosePositionFrament.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2641k extends Fragment implements C2640k.toq {

    /* JADX INFO: renamed from: b */
    public static final String f15628b = "need_apply";

    /* JADX INFO: renamed from: m */
    public static final String f15629m = "ChoosePositionFrament";

    /* JADX INFO: renamed from: c */
    private SuperWallpaperSummaryData f15630c;

    /* JADX INFO: renamed from: e */
    private boolean f15631e;

    /* JADX INFO: renamed from: g */
    private TextView f15633g;

    /* JADX INFO: renamed from: h */
    private RecyclerView f15634h;

    /* JADX INFO: renamed from: i */
    private com.android.thememanager.settings.superwallpaper.adapter.zy f15635i;

    /* JADX INFO: renamed from: j */
    private String f15636j;

    /* JADX INFO: renamed from: k */
    private Button f15637k;

    /* JADX INFO: renamed from: l */
    private Button f15638l;

    /* JADX INFO: renamed from: n */
    private TextView f15639n;

    /* JADX INFO: renamed from: p */
    private TextView f15641p;

    /* JADX INFO: renamed from: q */
    private TextView f15642q;

    /* JADX INFO: renamed from: r */
    private Context f15643r;

    /* JADX INFO: renamed from: s */
    private TextView f15644s;

    /* JADX INFO: renamed from: t */
    private InterfaceC2644k f15645t;

    /* JADX INFO: renamed from: y */
    private TextView f15646y;

    /* JADX INFO: renamed from: z */
    private ComponentName f15647z;

    /* JADX INFO: renamed from: f */
    private boolean f15632f = true;

    /* JADX INFO: renamed from: o */
    toq.InterfaceC2654n f15640o = new k();

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.k$k */
    /* JADX INFO: compiled from: ChoosePositionFrament.java */
    class k implements toq.InterfaceC2654n {
        k() {
        }

        @Override // com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.InterfaceC2654n
        /* JADX INFO: renamed from: k */
        public void mo9211k(boolean isSuperWallpaperDark) {
            Log.d(C2641k.f15629m, "super wallpaper dark changed." + isSuperWallpaperDark);
            C2641k.this.ps();
        }

        @Override // com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.InterfaceC2654n
        public void toq(boolean isDarkMode) {
            Log.d(C2641k.f15629m, "dark mode changed." + isDarkMode);
            C2641k.this.ps();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.k$q */
    /* JADX INFO: compiled from: ChoosePositionFrament.java */
    class q implements zy.InterfaceC2649k {
        q() {
        }

        @Override // com.android.thememanager.settings.superwallpaper.adapter.zy.InterfaceC2649k
        /* JADX INFO: renamed from: k */
        public void mo9225k(int position) {
            C2641k.this.f15645t.zy(position);
            C2641k.this.m2t(position);
            C2641k.this.f15645t.mcp(position);
            kja0.m6641s("T_CLICK", com.android.thememanager.basemodule.analysis.toq.huy, C1358k.f7237s, String.valueOf(position));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.k$toq */
    /* JADX INFO: compiled from: ChoosePositionFrament.java */
    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (C2641k.this.getActivity() != null) {
                C2641k.this.getActivity().onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.activity.k$zy */
    /* JADX INFO: compiled from: ChoosePositionFrament.java */
    class zy implements View.OnClickListener {
        zy() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (C2641k.this.f15645t != null) {
                C2641k.this.f15645t.mo9205n(C2656k.m9240g(C2641k.this.f15643r, C2641k.this.f15647z.getClassName()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m2t(int position) {
        SuperWallpaperSummaryData.SuperWallpaperLandData.LandPositionData landPositionData = this.f15630c.f15594f.f15615n[position];
        if (landPositionData == null) {
            this.f15639n.setVisibility(8);
            this.f15642q.setVisibility(8);
            this.f15633g.setVisibility(8);
            this.f15646y.setVisibility(8);
            this.f15644s.setVisibility(8);
            this.f15641p.setVisibility(8);
            return;
        }
        String str = landPositionData.f15621k;
        if (TextUtils.isEmpty(str)) {
            this.f15639n.setVisibility(8);
            this.f15642q.setVisibility(8);
        } else {
            this.f15642q.setText(str);
        }
        ra(this.f15633g, landPositionData.f15623q);
        ra(this.f15646y, landPositionData.f15622n);
        ra(this.f15644s, landPositionData.f15620g);
        ra(this.f15641p, landPositionData.f15624y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ps() {
        ComponentName componentName;
        SuperWallpaperSummaryData superWallpaperSummaryData;
        if (!this.f15631e || this.f15645t == null || (componentName = this.f15647z) == null || (superWallpaperSummaryData = this.f15630c) == null || superWallpaperSummaryData.f15594f == null) {
            return;
        }
        boolean z2 = true;
        int iMax = Math.max(0, Math.min(C2656k.m9242n(this.f15643r, componentName.getClassName()), this.f15630c.f15599k - 1));
        this.f15645t.zy(iMax);
        m2t(iMax);
        if (!com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().qrj() && !com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().kja0()) {
            z2 = false;
        }
        SuperWallpaperSummaryData.SuperWallpaperLandData superWallpaperLandData = this.f15630c.f15594f;
        Icon[] iconArr = z2 ? superWallpaperLandData.f15617q : superWallpaperLandData.f15614k;
        com.android.thememanager.settings.superwallpaper.adapter.zy zyVar = this.f15635i;
        if (zyVar != null) {
            zyVar.o1t(iconArr);
            return;
        }
        com.android.thememanager.settings.superwallpaper.adapter.zy zyVar2 = new com.android.thememanager.settings.superwallpaper.adapter.zy(this.f15643r, iconArr, this.f15647z.getClassName(), new q());
        this.f15635i = zyVar2;
        this.f15634h.setAdapter(zyVar2);
    }

    private void ra(TextView textView, String info) {
        if (TextUtils.isEmpty(info)) {
            textView.setVisibility(8);
        } else {
            textView.setText(info);
            textView.setVisibility(0);
        }
    }

    private void u38j(View view) {
        this.f15637k = (Button) view.findViewById(R.id.choose_position_back_btn);
        this.f15639n = (TextView) view.findViewById(R.id.view_height_title);
        this.f15642q = (TextView) view.findViewById(R.id.view_height_value);
        this.f15633g = (TextView) view.findViewById(R.id.coordinate_longitude);
        this.f15646y = (TextView) view.findViewById(R.id.coordinate_latitude);
        this.f15644s = (TextView) view.findViewById(R.id.position_title);
        this.f15641p = (TextView) view.findViewById(R.id.position_content);
        this.f15634h = (RecyclerView) view.findViewById(R.id.position_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f15634h.setLayoutManager(linearLayoutManager);
        this.f15637k.setOnClickListener(new toq());
        Button button = (Button) view.findViewById(R.id.apply_super_wallpaper_position_button);
        this.f15638l = button;
        if (!this.f15632f) {
            button.setVisibility(8);
        }
        this.f15638l.setOnClickListener(new zy());
    }

    @Override // com.android.thememanager.settings.superwallpaper.activity.data.C2640k.toq
    public void c8jq(SuperWallpaperSummaryData[] data) {
        this.f15630c = C2640k.m9216n().m9221s(this.f15636j);
        ps();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@lvui Context context) {
        super.onAttach(context);
        this.f15643r = getContext();
        Bundle arguments = getArguments();
        this.f15647z = (ComponentName) arguments.getParcelable(C1367k.f54006zy);
        this.f15636j = arguments.getString("super_wallpaper_id");
        this.f15632f = arguments.getBoolean(f15628b, true);
        SuperWallpaperSummaryData superWallpaperSummaryDataM9221s = C2640k.m9216n().m9221s(this.f15636j);
        this.f15630c = superWallpaperSummaryDataM9221s;
        if (superWallpaperSummaryDataM9221s == null) {
            C2640k.m9216n().m9220k(this);
        }
        com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().ld6(this.f15640o, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    @dd
    public View onCreateView(@lvui LayoutInflater inflater, @dd ViewGroup container, @dd Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.view_chooseposition, container, false);
        u38j(viewInflate);
        this.f15631e = true;
        ps();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().m9239i(this.f15640o);
    }

    public void v5yj(InterfaceC2644k changeLandPositionPresenter) {
        this.f15645t = changeLandPositionPresenter;
    }
}

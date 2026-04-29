package com.android.thememanager.recommend.view.fragment;

import android.os.Bundle;
import android.util.ArrayMap;
import androidx.recyclerview.widget.RecyclerView;
import bwp.C1381k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.recommend.view.listview.decoration.C2363n;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIPage;
import w831.InterfaceC7729k;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: RecommendSubTabFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 extends AbstractC2352n {
    private static final String as = "decoration";
    private static final String bl = "sub_tab_type";
    private static final String in = "tab_type";
    private String an;
    private String id;

    public static ld6 exv8(String tabType, String subTabTye, boolean needRefresh, int layoutManagerType, int decoration) {
        ld6 ld6Var = new ld6();
        Bundle bundle = new Bundle();
        bundle.putString("tab_type", tabType);
        bundle.putString(bl, subTabTye);
        bundle.putBoolean("need_refresh", needRefresh);
        bundle.putInt("layout_manager_type", layoutManagerType);
        bundle.putInt(as, decoration);
        ld6Var.setArguments(bundle);
        return ld6Var;
    }

    public static ld6 ovdh(String tabType, String subTabTye, boolean needRefresh, int layoutManagerType) {
        return exv8(tabType, subTabTye, needRefresh, layoutManagerType, 0);
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2352n
    protected UIPage btvn(UIPage apiData, boolean refresh) {
        if ("homepage".equals(this.an) && ("wallpaper".equals(this.id) || ("videowallpaper".equals(this.id) && refresh))) {
            apiData.hasMore = true;
        }
        return super.btvn(apiData, refresh);
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2352n
    protected boolean f1bi() {
        return this.f13661j == 1 && "homepage".equals(this.an) && !"largeicons".equals(this.id);
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2352n
    public void gb(IRecommendListView listView, RecyclerView recyclerView, int dx, int dy) {
        if (getParentFragment() instanceof f7l8) {
            ((f7l8) getParentFragment()).ob(dy);
        }
    }

    @Override // com.android.thememanager.basemodule.base.f7l8, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@dd Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if ("homepage".equals(this.an)) {
            if ("widget_suit".equals(this.id)) {
                ArrayMap<String, Object> arrayMapKja0 = C1706p.kja0(kx3(), m2t(), mo6436w());
                arrayMapKja0.put(com.android.thememanager.basemodule.analysis.toq.pku, Boolean.TRUE);
                C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.ta, arrayMapKja0);
            } else if ("largeicons".equals(this.id)) {
                ArrayMap<String, Object> arrayMapKja02 = C1706p.kja0(kx3(), m2t(), mo6436w());
                arrayMapKja02.put(com.android.thememanager.basemodule.analysis.toq.gue, Boolean.TRUE);
                C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.ta, arrayMapKja02);
            }
        }
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: qh4d, reason: merged with bridge method [inline-methods] */
    public InterfaceC7729k.k uv6() {
        return C1381k.m5838k(this.an, this.id);
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2352n
    protected boolean tww7() {
        return true;
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2352n, com.android.thememanager.basemodule.base.f7l8
    public void z4t() {
        super.z4t();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.an = arguments.getString("tab_type");
            String string = arguments.getString(bl);
            this.id = string;
            if ("hybrid".equals(string)) {
                this.f13655a = "theme";
            } else {
                this.f13655a = this.id;
            }
            int i2 = arguments.getInt(as);
            if (i2 == 1) {
                this.f13656b = new com.android.thememanager.recommend.view.listview.decoration.zy(getActivity());
            } else if (i2 == 2) {
                this.f13656b = new com.android.thememanager.recommend.view.listview.decoration.toq(getActivity());
            } else if (i2 == 3) {
                this.f13656b = new C2363n(getActivity(), R.dimen.me_widget_top_offset, R.dimen.me_widget_bottom_offset);
            }
        }
    }
}

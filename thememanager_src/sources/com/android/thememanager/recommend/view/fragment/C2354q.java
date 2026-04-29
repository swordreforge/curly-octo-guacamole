package com.android.thememanager.recommend.view.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.recommend.presenter.RecommendDynamicPresenter;
import com.android.thememanager.recommend.view.activity.RecommendActivity;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import java.util.List;
import w831.InterfaceC7729k;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.fragment.q */
/* JADX INFO: compiled from: RecommendDynamicFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2354q extends AbstractC2352n {
    protected static final String as = "click_from_tag";
    protected static final String bl = "list_url";
    protected String an;
    private boolean id;
    protected boolean in = false;

    public static C2354q exv8(String listUrl, boolean needRefresh, int layoutManagerType, boolean clickFromTag, String resCode, boolean isPicker, int ringtoneFlag) {
        C2354q c2354q = new C2354q();
        Bundle bundle = new Bundle();
        bundle.putString(bl, listUrl);
        bundle.putBoolean(as, clickFromTag);
        bundle.putBoolean("need_refresh", needRefresh);
        bundle.putInt("layout_manager_type", layoutManagerType);
        bundle.putString("res_code", resCode);
        bundle.putBoolean("is_picker", isPicker);
        bundle.putInt("ringtone_flag", ringtoneFlag);
        c2354q.setArguments(bundle);
        return c2354q;
    }

    private boolean hyow(int cardTypeOrdinal) {
        return cardTypeOrdinal == 100 || cardTypeOrdinal == 103 || cardTypeOrdinal == 132 || cardTypeOrdinal == 144;
    }

    private void pnt2() {
        if (C1819o.eqxt(getActivity()) && this.f13661j != 0) {
            this.f13661j = 0;
            this.f13656b = new com.android.thememanager.recommend.view.listview.decoration.zy(getActivity());
            this.f13662l.setCardDivider(false);
            getActivity().runOnUiThread(new Runnable() { // from class: com.android.thememanager.recommend.view.fragment.zy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13701k.xblq();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void xblq() {
        this.f13662l.setLayoutManagerType(this.f13661j);
        this.f13662l.setItemDecoration(this.f13656b);
        this.f13665r.setPadding(getResources().getDimensionPixelOffset(R.dimen.stagger_divider), "largeicons".equals(this.f13655a) ? getResources().getDimensionPixelSize(R.dimen.large_icon_recommend_activity_item_margin_top) : this.f13665r.getPaddingTop(), getResources().getDimensionPixelOffset(R.dimen.stagger_divider), this.f13665r.getPaddingBottom());
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2352n
    protected UIPage btvn(UIPage apiData, boolean refresh) {
        if (refresh && !kja0.qrj(apiData.cards) && hyow(apiData.cards.get(0).cardTypeOrdinal) && !C1807g.m7081r()) {
            pnt2();
        }
        return super.btvn(apiData, refresh);
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2352n
    public void gb(IRecommendListView listView, RecyclerView recyclerView, int dx, int dy) {
        if (recyclerView.getAdapter() == null || recyclerView.getAdapter().getItemCount() < 1 || !UIElement.isRankDetail(listView.getElementType(0))) {
            return;
        }
        ((RecommendActivity) getActivity()).se(recyclerView);
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2352n
    public void kbj(List<UIElement> uiElements, boolean refresh) {
        if (!refresh || uiElements == null || uiElements.size() <= 0 || UIElement.isRankDetail(uiElements.get(0).getCardTypeOrdinal()) || this.in || !C1819o.eqxt(getActivity())) {
            return;
        }
        this.in = true;
        View view = new View(getActivity());
        view.setBackgroundColor(getResources().getColor(R.color.item_color));
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, C1819o.m7155h(getResources())));
        this.f13662l.addHeaderView(view);
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2352n, com.android.thememanager.basemodule.base.toq
    public String m2t() {
        String str = this.f9877s;
        return (str == null || !this.id) ? super.m2t() : String.format(com.android.thememanager.basemodule.analysis.toq.gy40, str);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        nnh(true);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        nnh(false);
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: qh4d, reason: merged with bridge method [inline-methods] */
    public InterfaceC7729k.k uv6() {
        return new RecommendDynamicPresenter(this.an);
    }

    @Override // com.android.thememanager.recommend.view.fragment.AbstractC2352n, com.android.thememanager.basemodule.base.f7l8
    public void z4t() {
        super.z4t();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.an = arguments.getString(bl);
            this.id = arguments.getBoolean(as);
            this.f13655a = arguments.getString("res_code");
        }
        if (this.f13661j == 0) {
            this.f13656b = new com.android.thememanager.recommend.view.listview.decoration.zy(getActivity());
        }
    }
}

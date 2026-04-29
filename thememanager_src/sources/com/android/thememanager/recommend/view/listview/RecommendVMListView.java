package com.android.thememanager.recommend.view.listview;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.views.FastScrollStaggeredGridLayoutManager;
import com.android.thememanager.basemodule.views.ThemeLinearLayoutManager;
import com.android.thememanager.recommend.view.listview.viewmodel.C2449k;
import com.android.thememanager.recommend.view.listview.viewmodel.RecommendVMListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIPage;
import java.util.List;
import zy.InterfaceC7829h;
import zy.oc;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class RecommendVMListView extends RecommendListView {
    public RecommendVMListView(C2365g builder) {
        super(builder);
        if (builder.wvg()) {
            return;
        }
        this.f13717q.m7375s(false, 1);
        this.f13717q.m7375s(false, 2);
    }

    public static int n7h(int spanCount, int borderedPx, int centerPx) {
        return ((C1819o.jk(bf2.toq.toq()) - (borderedPx * 2)) - (centerPx * (spanCount - 1))) / spanCount;
    }

    public static int qrj(int spanCount, @InterfaceC7829h int bordered, @InterfaceC7829h int center) {
        return n7h(spanCount, bordered == 0 ? 0 : bf2.toq.toq().getResources().getDimensionPixelSize(bordered), center != 0 ? bf2.toq.toq().getResources().getDimensionPixelSize(center) : 0);
    }

    @Override // com.android.thememanager.recommend.view.listview.RecommendListView
    /* JADX INFO: renamed from: g */
    protected InterfaceC2366k mo8540g() {
        return new RecommendVMListViewAdapter(this.f13718s.m8558h(), this.f13718s, this.f13714k);
    }

    @oc
    public void kja0(C2449k viewModel) {
        this.f13719y.toq(viewModel.toq(), viewModel.n5r1());
        this.f13717q.m7373p(viewModel.n5r1());
        this.f13716p = viewModel.m8794f();
        f7l8(false, true);
    }

    @Override // com.android.thememanager.recommend.view.listview.RecommendListView
    /* JADX INFO: renamed from: p */
    protected void mo8396p(UIPage uiPage, List<UIElement> uiElements, boolean refresh) {
        super.mo8396p(uiPage, uiElements, refresh);
        if (uiPage == null || uiElements == null || uiElements.size() <= 0) {
            return;
        }
        C2449k c2449kO1t = ((C2365g) this.f13718s).o1t();
        c2449kO1t.m8793c(uiPage.hasMore);
        c2449kO1t.uv6(this.f13716p);
    }

    @Override // com.android.thememanager.recommend.view.listview.RecommendListView
    protected void x2() {
        if (this.f13715n == null) {
            return;
        }
        int iM8564s = this.f13718s.m8564s();
        RecyclerView.AbstractC1048h fastScrollStaggeredGridLayoutManager = iM8564s == 0 ? new FastScrollStaggeredGridLayoutManager(this.f13718s.m8565y(), 1) : iM8564s == 2 ? new GridLayoutManager(getContext(), this.f13718s.m8565y()) : new ThemeLinearLayoutManager(this.f13718s.toq());
        this.f13715n.setLayoutManager(fastScrollStaggeredGridLayoutManager);
        this.f13711g.lvui(fastScrollStaggeredGridLayoutManager);
    }
}

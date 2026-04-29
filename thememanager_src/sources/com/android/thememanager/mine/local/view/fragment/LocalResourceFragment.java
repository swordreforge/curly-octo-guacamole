package com.android.thememanager.mine.local.view.fragment;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.basemodule.views.C1858p;
import com.android.thememanager.mine.local.presenter.BaseLocalPresenter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.LocalResourceAdapter;
import gbni.InterfaceC6058k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalResourceFragment extends BaseLocalResourceFragment<InterfaceC6058k.k> implements InterfaceC6058k.toq<InterfaceC6058k.k>, BatchOperationAdapter.zy {

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.view.fragment.LocalResourceFragment$k */
    class C2171k extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f12762k;

        C2171k(final int val$girdSpace) {
            this.f12762k = val$girdSpace;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@lvui Rect outRect, @lvui View view, @lvui RecyclerView parent, @lvui RecyclerView.mcp state) {
            int iZy = ((GridLayoutManager.toq) view.getLayoutParams()).zy();
            int itemCount = LocalResourceFragment.this.f12748o.getItemCount();
            int i2 = this.f12762k;
            C1858p.m7344k(outRect, parent, itemCount, 3, i2, 0, i2, 0, iZy, 0);
        }
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: bqie */
    public InterfaceC6058k.k uv6() {
        return new BaseLocalPresenter(true, C2320q.ncyb(getActivity().getIntent()), this.f12750u);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected int l05() {
        return R.layout.me_fragment_local_resource;
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected BaseLocalResourceAdapter o5() {
        return new LocalResourceAdapter(this, this.f12750u, (InterfaceC6058k.k) kiv());
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void qrj() {
        super.qrj();
        RecyclerView recyclerView = this.f12743e;
        if (recyclerView != null) {
            recyclerView.setPadding(recyclerView.getPaddingLeft(), this.f12743e.getPaddingTop(), this.f12743e.getPaddingRight(), 0);
        }
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected RecyclerView.kja0 r6ty() {
        return new C2171k(getResources().getDimensionPixelOffset(R.dimen.me_recycler_divider_width));
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected RecyclerView.AbstractC1048h yw() {
        return new GridLayoutManager(getActivity(), 3);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void zy() {
        super.zy();
        if (this.f12743e != null) {
            int dimension = (int) getResources().getDimension(R.dimen.me_local_rv_padding_bottom);
            RecyclerView recyclerView = this.f12743e;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), this.f12743e.getPaddingTop(), this.f12743e.getPaddingRight(), dimension);
        }
    }
}

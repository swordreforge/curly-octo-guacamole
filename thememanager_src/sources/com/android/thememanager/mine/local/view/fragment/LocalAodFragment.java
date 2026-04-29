package com.android.thememanager.mine.local.view.fragment;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.views.f7l8;
import com.android.thememanager.mine.local.presenter.LocalAodPresenter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.LocalAodAdapter;
import gbni.InterfaceC6058k;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalAodFragment extends BaseLocalResourceFragment<InterfaceC6058k.k> implements InterfaceC6058k.toq<InterfaceC6058k.k> {

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.view.fragment.LocalAodFragment$k */
    class C2167k extends GridLayoutManager.zy {
        C2167k() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.zy
        /* JADX INFO: renamed from: g */
        public int mo4760g(int position) {
            if (!(LocalAodFragment.this.f12743e.getAdapter() instanceof f7l8)) {
                return ((GridLayoutManager) LocalAodFragment.this.f12747m).ld6();
            }
            f7l8 f7l8Var = (f7l8) LocalAodFragment.this.f12743e.getAdapter();
            if (position < f7l8Var.o1t()) {
                return ((GridLayoutManager) LocalAodFragment.this.f12747m).ld6();
            }
            if (LocalAodFragment.this.tww7(position - f7l8Var.o1t())) {
                return ((GridLayoutManager) LocalAodFragment.this.f12747m).ld6();
            }
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tww7(int position) {
        BaseLocalResourceAdapter baseLocalResourceAdapter = this.f12748o;
        return (baseLocalResourceAdapter == null || baseLocalResourceAdapter.ni7() == null || this.f12748o.ni7().size() <= position || this.f12748o.ni7().get(position) == null || !"message_header_id".equals(((BaseLocalResourceAdapter.toq) this.f12748o.ni7().get(position)).getId())) ? false : true;
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, gbni.InterfaceC6058k.toq
    /* JADX INFO: renamed from: do */
    public void mo28253do() {
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, gbni.InterfaceC6058k.toq
    public void dxef() {
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: f1bi, reason: merged with bridge method [inline-methods] */
    public InterfaceC6058k.k uv6() {
        return new LocalAodPresenter(true, C2320q.ncyb(getActivity().getIntent()));
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, gbni.InterfaceC6058k.toq
    public void gc3c(List<Resource> resources) {
        super.gc3c(resources);
        if (resources == null || resources.size() <= 0) {
            return;
        }
        ((GridLayoutManager) this.f12747m).fn3e(new C2167k());
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected int l05() {
        return R.layout.me_fragment_local_theme;
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected BaseLocalResourceAdapter o5() {
        LocalAodAdapter localAodAdapter = new LocalAodAdapter(this, "aod", (InterfaceC6058k.k) kiv());
        localAodAdapter.ch(((C1819o.jk(getActivity()) - (getActivity().getResources().getDimensionPixelSize(R.dimen.me_card_aod_thunmnail_padding_horizontal) * 6)) - (getActivity().getResources().getDimensionPixelSize(R.dimen.me_local_margin_left) * 2)) / 2);
        return localAodAdapter;
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected RecyclerView.AbstractC1048h yw() {
        return new GridLayoutManager(getActivity(), 2);
    }
}

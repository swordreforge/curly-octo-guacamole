package com.android.thememanager.mine.local.view.fragment;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.mine.local.presenter.BaseLocalPresenter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.LocalLargeIconAdapter;
import gbni.InterfaceC6058k;
import zsr0.C7810k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalLargeIconFragment extends BaseLocalResourceFragment<InterfaceC6058k.k> implements InterfaceC6058k.toq<InterfaceC6058k.k> {

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.view.fragment.LocalLargeIconFragment$k */
    class C2169k extends GridLayoutManager.zy {
        C2169k() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.zy
        /* JADX INFO: renamed from: g */
        public int mo4760g(int position) {
            int iO1t = LocalLargeIconFragment.this.f12745j.o1t();
            return (iO1t > position || position >= iO1t + LocalLargeIconFragment.this.f12748o.getItemCount() || LocalLargeIconFragment.this.f12745j.getItemViewType(position) != 1073741823) ? 3 : 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    /* JADX INFO: renamed from: bqie, reason: merged with bridge method [inline-methods] */
    public LocalLargeIconAdapter o5() {
        return new LocalLargeIconAdapter(this, this.f12750u, (InterfaceC6058k.k) kiv());
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: f1bi, reason: merged with bridge method [inline-methods] */
    public InterfaceC6058k.k uv6() {
        return new BaseLocalPresenter(true, false, "largeicons");
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected void g0ad(int updatingNum, int oldNum) {
        if (updatingNum > oldNum / 2) {
            this.f12746l.setMessage(getResources().getQuantityString(R.plurals.large_icon_batch_updating_text, oldNum, Integer.valueOf(oldNum)));
        } else {
            this.f12746l.setMessage(getResources().getQuantityString(R.plurals.large_icon_batch_has_update_text, oldNum, Integer.valueOf(oldNum)));
        }
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected int l05() {
        return R.layout.me_fragment_local_largeicon;
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected RecyclerView.kja0 r6ty() {
        return new C7810k(this.f12745j, getContext());
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected RecyclerView.AbstractC1048h yw() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        this.f12747m = gridLayoutManager;
        gridLayoutManager.fn3e(new C2169k());
        return this.f12747m;
    }
}

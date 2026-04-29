package com.android.thememanager.mine.local.view.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.local.presenter.BaseLocalPresenter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.LocalIconAdapter;
import gbni.InterfaceC6058k;
import i1.C6077k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalIconFragment extends BaseLocalResourceFragment<InterfaceC6058k.k> implements InterfaceC6058k.toq<InterfaceC6058k.k>, BatchOperationAdapter.zy {
    public static final String an = "showButton";
    private static final String bv = "LocalIconFragment";
    private Button bb;
    private boolean bp;

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.view.fragment.LocalIconFragment$k */
    public static class C2168k extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        private int f12759k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f60453toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f60454zy;

        public C2168k(@lvui Context context) {
            this.f12759k = context.getResources().getDimensionPixelSize(R.dimen.rc_icon_mine_item_padding_lr);
            this.f60454zy = context.getResources().getDimensionPixelSize(R.dimen.rc_icon_mine_item_padding_top);
            this.f60453toq = context.getResources().getDimensionPixelSize(R.dimen.rc_icon_mine_item_padding_bottom);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@lvui Rect outRect, @lvui View view, @lvui RecyclerView parent, @lvui RecyclerView.mcp state) {
            if (((GridLayoutManager.toq) view.getLayoutParams()).zy() != 0 || parent.getAdapter() == null || parent.getAdapter().getItemCount() <= 0 || parent.getAdapter().getItemViewType(0) != 5) {
                int i2 = this.f12759k;
                outRect.set(i2, this.f60454zy, i2, this.f60453toq);
            } else {
                int i3 = this.f12759k;
                outRect.set(i3, 0, i3, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ob(View view) {
        if (C1819o.dd(getActivity())) {
            nn86.m7150k(R.string.multiwindow_no_support_icon, 0);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("theme://zhuti.xiaomi.com/mainpage?S.EXTRA_NAV_ID=homepage&S.EXTRA_TAB_ID=icons"));
        startActivity(intent);
    }

    private void tww7(View view) {
        this.bb = (Button) view.findViewById(R.id.more_icons_button);
        this.bp = false;
        try {
            Intent intent = getActivity().getIntent();
            if (intent != null) {
                this.bp = intent.getBooleanExtra(an, false);
            }
        } catch (Exception e2) {
            Log.e(bv, e2.getMessage());
        }
        if (!this.bp) {
            this.bb.setVisibility(8);
            return;
        }
        this.bb.setVisibility(0);
        C6077k.m22369i(this.bb);
        this.bb.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.mine.local.view.fragment.toq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12769k.ob(view2);
            }
        });
        RecyclerView recyclerView = this.f12743e;
        if (recyclerView != null) {
            recyclerView.setPadding(0, 0, 0, (int) getResources().getDimension(R.dimen.component_list_padding_bottom));
        }
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
        return new BaseLocalPresenter(true, C2320q.ncyb(getActivity().getIntent()), this.f12750u);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected void g0ad(int updatingNum, int oldNum) {
        if (updatingNum > oldNum / 2) {
            this.f12746l.setMessage(getResources().getQuantityString(R.plurals.icon_batch_updating_text, oldNum, Integer.valueOf(oldNum)));
        } else {
            this.f12746l.setMessage(getResources().getQuantityString(R.plurals.icon_batch_has_update_text, oldNum, Integer.valueOf(oldNum)));
        }
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected int l05() {
        return R.layout.me_fragment_local_icon;
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected BaseLocalResourceAdapter o5() {
        return new LocalIconAdapter(this, this.f12750u, (InterfaceC6058k.k) kiv());
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void qrj() {
        super.qrj();
        RecyclerView recyclerView = this.f12743e;
        if (recyclerView != null) {
            recyclerView.setPadding(recyclerView.getPaddingLeft(), this.f12743e.getPaddingTop(), this.f12743e.getPaddingRight(), 0);
        }
        Button button = this.bb;
        if (button == null || !this.bp) {
            return;
        }
        C6077k.zy(button);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected RecyclerView.kja0 r6ty() {
        return new C2168k(getActivity());
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected void yp31(View view) {
        super.yp31(view);
        tww7(view);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected RecyclerView.AbstractC1048h yw() {
        return new GridLayoutManager(getActivity(), 2);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void zy() {
        super.zy();
        if (this.f12743e != null) {
            int dimension = (int) getResources().getDimension(R.dimen.me_local_rv_padding_bottom);
            RecyclerView recyclerView = this.f12743e;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), this.f12743e.getPaddingTop(), this.f12743e.getPaddingRight(), dimension);
        }
        Button button = this.bb;
        if (button == null || !this.bp) {
            return;
        }
        C6077k.m22370k(button);
    }
}

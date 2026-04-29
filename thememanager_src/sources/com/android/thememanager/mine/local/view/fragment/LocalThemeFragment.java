package com.android.thememanager.mine.local.view.fragment;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.AbstractC0067g;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1803e;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.basemodule.views.C1858p;
import com.android.thememanager.basemodule.views.f7l8;
import com.android.thememanager.mine.local.presenter.LocalThemePresenter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.LocalThemeAdapter;
import gbni.InterfaceC6058k;
import i1.C6077k;
import java.util.List;
import p000a.zy;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalThemeFragment extends BaseLocalResourceFragment<InterfaceC6058k.k> implements InterfaceC6058k.toq<InterfaceC6058k.k>, BatchOperationAdapter.zy {
    private static final String id = "LocalThemeFragment";
    private zy an = new toq();
    private LocalThemePresenter bb;
    private View bp;
    private AbstractC0067g bv;

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.view.fragment.LocalThemeFragment$k */
    class C2172k extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f12763k;

        C2172k(final int val$girdSpace) {
            this.f12763k = val$girdSpace;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@lvui Rect outRect, @lvui View view, @lvui RecyclerView parent, @lvui RecyclerView.mcp state) {
            int iZy = ((GridLayoutManager.toq) view.getLayoutParams()).zy();
            int itemCount = LocalThemeFragment.this.f12748o.getItemCount();
            int i2 = this.f12763k;
            C1858p.m7344k(outRect, parent, itemCount, 3, i2, 0, i2, 0, iZy, LocalThemeFragment.this.f12746l != null ? 1 : 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: s */
        public void mo4713s(Canvas c2, RecyclerView parent, RecyclerView.mcp state) {
            View childAt;
            super.mo4713s(c2, parent, state);
            int itemCount = parent.getAdapter().getItemCount();
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) parent.getLayoutManager()).findLastVisibleItemPosition();
            int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) parent.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
            int i2 = itemCount - 1;
            if (iFindLastVisibleItemPosition != i2 || (childAt = parent.getLayoutManager().getChildAt(i2)) == null) {
                return;
            }
            if (iFindFirstCompletelyVisibleItemPosition != 0 || iFindLastVisibleItemPosition <= 0) {
                childAt.setTranslationY(0.0f);
                return;
            }
            int height = parent.getHeight() - childAt.getBottom();
            if (height > 0) {
                childAt.setTranslationY(height);
            }
        }
    }

    class toq implements zy {
        toq() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            if (LocalThemeFragment.this.f12748o.m7312m()) {
                return;
            }
            LocalThemeFragment.this.tww7();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(LocalThemeFragment.this.getContext(), false);
            }
        }
    }

    private void bqie() {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.me_theme_import_btn_layout, (ViewGroup) null, false);
        this.bp = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.import_btn);
        viewFindViewById.setOnClickListener(this);
        this.f12745j.cdj(this.bp);
        C6077k.m22369i(viewFindViewById);
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: f1bi, reason: merged with bridge method [inline-methods] */
    public InterfaceC6058k.k uv6() {
        LocalThemePresenter localThemePresenter = new LocalThemePresenter(true);
        this.bb = localThemePresenter;
        return localThemePresenter;
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, gbni.InterfaceC6058k.toq
    public void gc3c(List<Resource> resources) {
        super.gc3c(resources);
        f7l8 f7l8Var = this.f12745j;
        if (f7l8Var == null || f7l8Var.fu4() != 0 || this.f12748o.m7312m()) {
            return;
        }
        bqie();
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected int l05() {
        return R.layout.me_fragment_local_theme;
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected BaseLocalResourceAdapter o5() {
        if (TextUtils.isEmpty(this.f12750u)) {
            this.f12750u = "theme";
            Log.w(id, "createAdapter but resourceCode is null， xRef = " + com.android.thememanager.basemodule.analysis.f7l8.m6613s() + ", xPreRef = " + com.android.thememanager.basemodule.analysis.f7l8.m6614y() + ", entryType = " + com.android.thememanager.basemodule.analysis.f7l8.m6607g());
        }
        return new LocalThemeAdapter(this, this.f12750u, (InterfaceC6058k.k) kiv());
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            getActivity();
            if (resultCode != -1 || data == null) {
                return;
            }
            this.bb.mo8224t(data.getData(), this.f12752x, requestCode, null);
        }
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, android.view.View.OnClickListener
    public void onClick(View v2) {
        if (v2.getId() != R.id.import_btn) {
            super.onClick(v2);
        } else {
            if (com.android.thememanager.basemodule.utils.lvui.m7131s((AbstractActivityC1717k) getActivity(), this.an)) {
                return;
            }
            this.an.mo0k();
        }
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void qrj() {
        super.qrj();
        View view = this.bp;
        if (view != null) {
            C6077k.zy(view);
        }
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected RecyclerView.kja0 r6ty() {
        return new C2172k(getResources().getDimensionPixelOffset(R.dimen.me_recycler_divider_width));
    }

    public void tww7() {
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.dw));
        C1803e.kja0(this, 100);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected void yp31(View view) {
        super.yp31(view);
        RecyclerView recyclerView = this.f12743e;
        if (recyclerView instanceof miuix.recyclerview.widget.RecyclerView) {
            ((miuix.recyclerview.widget.RecyclerView) recyclerView).setSpringEnabled(false);
        }
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected RecyclerView.AbstractC1048h yw() {
        return new GridLayoutManager(getActivity(), 3);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void zy() {
        super.zy();
        View view = this.bp;
        if (view != null) {
            C6077k.m22370k(view);
        }
    }
}

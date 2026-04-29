package com.android.thememanager.mine.local.view.fragment;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.local.n7h;
import com.android.thememanager.basemodule.utils.C1803e;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.local.presenter.BaseLocalPresenter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.LocalWallpaperAdapter;
import gbni.InterfaceC6058k;
import i1.C6077k;
import java.util.ArrayList;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalWallpaperFragment extends BaseLocalResourceFragment<InterfaceC6058k.k> implements InterfaceC6058k.toq<InterfaceC6058k.k>, View.OnClickListener, BatchOperationAdapter.zy {
    private ArrayList<ResolveInfo> bb;
    private ImageView bp;
    private boolean bv = false;
    private p000a.zy an = new C2174q();

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.view.fragment.LocalWallpaperFragment$k */
    class C2173k extends RecyclerView.kja0 {
        C2173k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@lvui Rect outRect, @lvui View view, @lvui RecyclerView parent, @lvui RecyclerView.mcp state) {
            outRect.left = Math.round(LocalWallpaperFragment.this.getResources().getDimension(R.dimen.me_local_margin_inner_left));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.view.fragment.LocalWallpaperFragment$q */
    class C2174q implements p000a.zy {
        C2174q() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            LocalWallpaperFragment.this.kbj();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(LocalWallpaperFragment.this.getContext(), false);
            }
        }
    }

    class toq extends GridLayoutManager.zy {
        toq() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.zy
        /* JADX INFO: renamed from: g */
        public int mo4760g(int position) {
            if (position >= LocalWallpaperFragment.this.f12748o.getItemCount() || LocalWallpaperFragment.this.f12748o.getItemViewType(position) != 0) {
                return ((GridLayoutManager) LocalWallpaperFragment.this.f12747m).ld6();
            }
            return 1;
        }
    }

    class zy implements n7h {
        zy() {
        }

        @Override // com.android.thememanager.basemodule.local.n7h
        /* JADX INFO: renamed from: k */
        public void mo6854k(boolean success) {
            if (LocalWallpaperFragment.this.kiv() != null) {
                ((InterfaceC6058k.k) LocalWallpaperFragment.this.kiv()).kja0(LocalWallpaperFragment.this.f12750u);
            }
        }
    }

    private void gb() {
        if (this.bb == null && "wallpaper".equals(this.f12750u)) {
            this.bb = C1803e.x2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kbj() {
        gb();
        com.android.thememanager.toq.wvg(this, C1803e.m7037k(), 102, this.f12750u, this.bb);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected int l05() {
        return R.layout.me_fragment_local_wallpaper;
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected BaseLocalResourceAdapter o5() {
        this.bv = C1819o.d2ok(getActivity());
        return new LocalWallpaperAdapter(this, this.f12750u, (InterfaceC6058k.k) kiv(), this.bv);
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: ob, reason: merged with bridge method [inline-methods] */
    public InterfaceC6058k.k uv6() {
        return new BaseLocalPresenter(false, C2320q.ncyb(getActivity().getIntent()), this.f12750u);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null || kiv() == 0) {
            return;
        }
        ((InterfaceC6058k.k) kiv()).mo8224t(data.getData(), this.f12752x, 102, new zy());
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, android.view.View.OnClickListener
    public void onClick(View v2) {
        if (v2.getId() != R.id.select_others_fab || com.android.thememanager.basemodule.utils.lvui.kja0(this, this.an)) {
            return;
        }
        this.an.mo0k();
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void qrj() {
        super.qrj();
        ImageView imageView = this.bp;
        if (imageView != null) {
            C6077k.zy(imageView);
        }
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected void yp31(View view) {
        super.yp31(view);
        ImageView imageView = (ImageView) view.findViewById(R.id.select_others_fab);
        this.bp = imageView;
        imageView.setOnClickListener(this);
        this.f12743e.addItemDecoration(new C2173k());
        C6077k.a9(this.bp);
        RecyclerView.AbstractC1048h abstractC1048h = this.f12747m;
        if (abstractC1048h instanceof GridLayoutManager) {
            ((GridLayoutManager) abstractC1048h).fn3e(new toq());
        }
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected RecyclerView.AbstractC1048h yw() {
        return new GridLayoutManager(getActivity(), 3);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void zy() {
        super.zy();
        ImageView imageView = this.bp;
        if (imageView != null) {
            C6077k.m22370k(imageView);
        }
    }
}

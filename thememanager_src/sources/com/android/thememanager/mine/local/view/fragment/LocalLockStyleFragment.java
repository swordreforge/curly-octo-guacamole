package com.android.thememanager.mine.local.view.fragment;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.f7l8;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.basemodule.views.C1858p;
import com.android.thememanager.mine.local.presenter.LocalLockStylePresenter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.LocalLockStyleAdapter;
import com.android.thememanager.module.DependencyUtils;
import gbni.InterfaceC6058k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalLockStyleFragment extends BaseLocalResourceFragment<InterfaceC6058k.k> implements InterfaceC6058k.toq<InterfaceC6058k.k>, BatchOperationAdapter.zy {
    private static final String bp = "LocalLockStyleFragment";
    private MenuItem bb;

    /* JADX INFO: renamed from: com.android.thememanager.mine.local.view.fragment.LocalLockStyleFragment$k */
    class C2170k extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f12761k;

        C2170k(final int val$girdSpace) {
            this.f12761k = val$girdSpace;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@lvui Rect outRect, @lvui View view, @lvui RecyclerView parent, @lvui RecyclerView.mcp state) {
            int iZy = ((GridLayoutManager.toq) view.getLayoutParams()).zy();
            int itemCount = LocalLockStyleFragment.this.f12748o.getItemCount();
            int i2 = this.f12761k;
            C1858p.m7344k(outRect, parent, itemCount, 3, i2, 0, i2, 0, iZy, 0);
        }
    }

    private void f1bi() {
        if (this.bb != null) {
            this.bb.setEnabled(DependencyUtils.MamlWrapper.mamlContainsLockStyleConfig());
        }
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: bqie, reason: merged with bridge method [inline-methods] */
    public InterfaceC6058k.k uv6() {
        return new LocalLockStylePresenter(true, C2320q.ncyb(getActivity().getIntent()));
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected int l05() {
        return R.layout.me_fragment_local_resource;
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected BaseLocalResourceAdapter o5() {
        if (TextUtils.isEmpty(this.f12750u)) {
            this.f12750u = InterfaceC1789q.gx2z;
            Log.w(bp, "createAdapter but resourceCode is null， xRef = " + f7l8.m6613s() + ", xPreRef = " + f7l8.m6614y() + ", entryType = " + f7l8.m6607g());
        }
        LocalLockStyleAdapter localLockStyleAdapter = new LocalLockStyleAdapter(this, this.f12750u, (InterfaceC6058k.k) kiv());
        this.f12748o = localLockStyleAdapter;
        return localLockStyleAdapter;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        MenuItem menuItemAdd = menu.add(0, R.string.lockstyle_personal_settings, 0, R.string.lockstyle_personal_settings);
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(R.drawable.action_setting);
        this.bb = menuItemAdd;
        f1bi();
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, androidx.fragment.app.Fragment
    @dd
    public View onCreateView(LayoutInflater inflater, @dd ViewGroup container, Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(@lvui MenuItem item) {
        if (item.getItemId() != R.string.lockstyle_personal_settings) {
            return super.onOptionsItemSelected(item);
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(getActivity(), DependencyUtils.MamlWrapper.MamlSettingClass));
        intent.putExtra(DependencyUtils.MamlWrapper.EXTRA_MAML_CODE, InterfaceC1789q.gx2z);
        intent.putExtra(DependencyUtils.MamlWrapper.EXTRA_MAML_ID, C2320q.fu4(InterfaceC1789q.gx2z));
        startActivity(intent);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@lvui View view, @dd Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        o1t.fti(getActivity(), false);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void qrj() {
        MenuItem menuItem = this.bb;
        if (menuItem != null) {
            menuItem.setVisible(true);
        }
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected RecyclerView.kja0 r6ty() {
        return new C2170k(getResources().getDimensionPixelOffset(R.dimen.me_recycler_divider_width));
    }

    @Override // com.android.thememanager.basemodule.base.toq
    protected void ra(boolean visibleForUser) {
        super.ra(visibleForUser);
        if (visibleForUser) {
            f1bi();
        }
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected void yp31(View view) {
        super.yp31(view);
        if (this.f12743e != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.me_local_rv_bottom_padding_for_fab);
            RecyclerView recyclerView = this.f12743e;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), this.f12743e.getPaddingTop(), this.f12743e.getPaddingRight(), dimensionPixelSize);
            this.f12743e.setClipToPadding(false);
        }
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment
    protected RecyclerView.AbstractC1048h yw() {
        return new GridLayoutManager(getActivity(), 3);
    }

    @Override // com.android.thememanager.mine.local.view.fragment.BaseLocalResourceFragment, com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void zy() {
        MenuItem menuItem = this.bb;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
    }
}

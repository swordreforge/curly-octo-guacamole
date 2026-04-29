package com.android.thememanager.mine.remote.view.listview.adapter;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.utils.C1833z;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.remote.model.entity.LargeIconBatchPurchasedResourceItem;
import com.android.thememanager.mine.remote.model.entity.LargeIconRemoteBatchItem;
import com.android.thememanager.mine.remote.presenter.RemoteResourcePurchasedPresenter;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.mine.remote.view.listview.viewholder.FontViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.HeaderTipsViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.RemoteAodMineViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.RemoteIconMineViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.RemoteLargeIconTitleViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.RemoteLargeIconViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.ThemeViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.WidgetSuitViewHolder;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i9jn.InterfaceC6094k;
import java.util.Set;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteResourcePurchasedAdapter extends BaseRemoteResourceAdapter implements HeaderTipsViewHolder.zy {

    /* JADX INFO: renamed from: a */
    public static final int f12897a = 2;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f60469ab = 9;

    /* JADX INFO: renamed from: b */
    public static final int f12898b = 1;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f60470bo = 5;

    /* JADX INFO: renamed from: d */
    public static final int f12899d = 122;

    /* JADX INFO: renamed from: m */
    public static final String f12900m = "message_header_id";

    /* JADX INFO: renamed from: o */
    private static final String f12901o = "RemoteResourcePurchasedAdapter";

    /* JADX INFO: renamed from: u */
    public static final int f12902u = 4;

    /* JADX INFO: renamed from: v */
    public static final int f12903v = 6;

    /* JADX INFO: renamed from: w */
    public static final int f12904w = 8;

    /* JADX INFO: renamed from: x */
    public static final int f12905x = 3;

    /* JADX INFO: renamed from: j */
    private boolean f12906j;

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourcePurchasedAdapter$k */
    class C2195k implements C1688q.n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f12907k;

        C2195k(final Set val$checkedItemIds) {
            this.f12907k = val$checkedItemIds;
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            ((InterfaceC6094k.n) RemoteResourcePurchasedAdapter.this.m8275v()).ld6(this.f12907k);
        }
    }

    class toq implements C1688q.n {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f12908k;

        toq(final Set val$checkedItemIds) {
            this.f12908k = val$checkedItemIds;
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            ((InterfaceC6094k.n) RemoteResourcePurchasedAdapter.this.m8275v()).mo8271g(this.f12908k);
        }
    }

    public static class zy extends BaseRemoteResourceAdapter.toq {
        zy(UIProduct product) {
            super(product);
        }

        @Override // com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter.toq, com.android.thememanager.basemodule.views.BatchOperationAdapter.toq
        public boolean canChecked(Menu menu) {
            MenuItem item;
            if (menu == null || (item = menu.getItem(0)) == null || "message_header_id".equals(getProduct().uuid)) {
                return false;
            }
            return item.getItemId() == R.string.resource_restore ? getProduct().manualHide : !getProduct().manualHide;
        }
    }

    public RemoteResourcePurchasedAdapter(@lvui InterfaceC1719p viewContainer, String tabType, InterfaceC6094k.q presenter) {
        super(viewContainer, tabType, presenter);
        this.f12906j = false;
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter
    /* JADX INFO: renamed from: c */
    protected boolean mo7309c() {
        return !"widget_suit".equals(m8274d());
    }

    @Override // com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter
    protected LargeIconRemoteBatchItem dr(int type, String packageName, UIProduct resource) {
        return new LargeIconBatchPurchasedResourceItem(type, packageName, resource);
    }

    @Override // com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter, com.android.thememanager.basemodule.views.BatchOperationAdapter
    /* JADX INFO: renamed from: e */
    public boolean mo7310e(BatchOperationAdapter.toq batchItem) {
        BaseRemoteResourceAdapter.toq toqVar = (BaseRemoteResourceAdapter.toq) batchItem;
        if (toqVar.getProduct() == null) {
            return false;
        }
        this.f12906j = toqVar.getProduct().manualHide;
        return super.mo7310e(batchItem);
    }

    public void fnq8() {
        if ("message_header_id".equals(((BaseRemoteResourceAdapter.toq) this.f9846q.get(0)).getId())) {
            this.f9846q.remove(0);
            notifyDataSetChanged();
            RemoteResourcePurchasedPresenter.ncyb();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        if ("message_header_id".equals(((BaseRemoteResourceAdapter.toq) this.f9846q.get(position)).getId())) {
            return 5;
        }
        if ("theme".equals(m8274d())) {
            return 1;
        }
        if ("wallpaper".equals(m8274d())) {
            return 2;
        }
        if ("fonts".equals(m8274d())) {
            return 3;
        }
        if ("aod".equals(m8274d())) {
            return 4;
        }
        if ("icons".equals(m8274d())) {
            return 6;
        }
        if ("widget_suit".equals(m8274d())) {
            return 122;
        }
        if ("largeicons".equals(m8274d())) {
            return ((LargeIconRemoteBatchItem) this.f9846q.get(position)).type == 1 ? 8 : 9;
        }
        return 1;
    }

    @Override // com.android.thememanager.mine.remote.view.listview.viewholder.HeaderTipsViewHolder.zy
    public void kja0() {
        fnq8();
    }

    @Override // com.android.thememanager.mine.remote.view.listview.viewholder.HeaderTipsViewHolder.zy
    public String n7h() {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: qkj8, reason: merged with bridge method [inline-methods] */
    public BatchOperationAdapter.BatchViewHolder<BaseRemoteResourceAdapter.toq> onCreateViewHolder(@lvui ViewGroup viewGroup, int viewType) {
        return viewType != 3 ? viewType != 4 ? viewType != 5 ? viewType != 6 ? viewType != 8 ? viewType != 9 ? viewType != 122 ? ThemeViewHolder.m8285l(viewGroup, this) : WidgetSuitViewHolder.m8287l(viewGroup, this) : RemoteLargeIconViewHolder.m8284l(viewGroup, this) : RemoteLargeIconTitleViewHolder.m8283l(viewGroup, this) : RemoteIconMineViewHolder.n5r1(viewGroup, this) : HeaderTipsViewHolder.n5r1(viewGroup, this, this) : RemoteAodMineViewHolder.n5r1(viewGroup, this) : FontViewHolder.m8277l(viewGroup, this);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter
    protected void uv6(Menu menu) {
        if (this.f12906j) {
            menu.add(0, R.string.resource_restore, 0, R.string.resource_restore).setIcon(C1833z.toq());
        } else {
            menu.add(0, R.string.resource_hide, 0, R.string.resource_hide).setIcon(C1833z.m7260k());
        }
    }

    @Override // com.android.thememanager.mine.remote.view.listview.viewholder.HeaderTipsViewHolder.zy
    public void x2() {
    }

    @Override // com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter
    protected BaseRemoteResourceAdapter.toq xwq3(UIProduct product) {
        return new zy(product);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter
    protected void y9n(MenuItem item, Set<String> checkedItemIds) {
        if (item.getItemId() == R.string.resource_restore) {
            if (checkedItemIds.size() == 0) {
                nn86.m7150k(R.string.resource_tip_select_none, 0);
                return;
            } else {
                C1688q.cdj().fti(ki(), new C2195k(checkedItemIds));
                return;
            }
        }
        if (item.getItemId() == R.string.resource_hide) {
            if (checkedItemIds.size() == 0) {
                nn86.m7150k(R.string.resource_tip_select_none, 0);
            } else {
                C1688q.cdj().fti(ki(), new toq(checkedItemIds));
            }
        }
    }
}

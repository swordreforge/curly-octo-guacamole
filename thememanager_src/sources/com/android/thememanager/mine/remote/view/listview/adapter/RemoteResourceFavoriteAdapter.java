package com.android.thememanager.mine.remote.view.listview.adapter;

import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.remote.model.entity.LargeIconRemoteBatchItem;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.mine.remote.view.listview.viewholder.FontViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.RemoteAodMineViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.RemoteIconMineViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.RemoteLargeIconTitleViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.RemoteLargeIconViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.ThemeViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.WallpaperViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.WidgetSuitViewHolder;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i9jn.InterfaceC6094k;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import miuix.appcompat.app.ki;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteResourceFavoriteAdapter extends BaseRemoteResourceAdapter {

    /* JADX INFO: renamed from: a */
    private static final int f12884a = 3;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f60467ab = 9;

    /* JADX INFO: renamed from: b */
    private static final int f12885b = 2;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    protected static final int f60468bo = 6;

    /* JADX INFO: renamed from: d */
    private static final int f12886d = 122;

    /* JADX INFO: renamed from: m */
    private static final int f12887m = 1;

    /* JADX INFO: renamed from: o */
    private static final String f12888o = "RemoteResourceFavoriteAdapter";

    /* JADX INFO: renamed from: u */
    private static final int f12889u = 5;

    /* JADX INFO: renamed from: v */
    protected static final int f12890v = 7;

    /* JADX INFO: renamed from: w */
    public static final int f12891w = 8;

    /* JADX INFO: renamed from: x */
    private static final int f12892x = 4;

    /* JADX INFO: renamed from: j */
    private int f12893j;

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourceFavoriteAdapter$k */
    class DialogInterfaceOnClickListenerC2194k implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f12894k;

        /* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourceFavoriteAdapter$k$k */
        class k implements C1688q.n {
            k() {
            }

            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginFail(C1688q.g loginError) {
            }

            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginSuccess() {
                ((InterfaceC6094k.k) RemoteResourceFavoriteAdapter.this.m8275v()).mo8268k(DialogInterfaceOnClickListenerC2194k.this.f12894k);
            }
        }

        DialogInterfaceOnClickListenerC2194k(final Set val$checkedItemIds) {
            this.f12894k = val$checkedItemIds;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            C1688q.cdj().fti(RemoteResourceFavoriteAdapter.this.ki(), new k());
        }
    }

    public RemoteResourceFavoriteAdapter(@lvui InterfaceC1719p viewContainer, String tabType, InterfaceC6094k.q presenter) {
        super(viewContainer, tabType, presenter);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter
    /* JADX INFO: renamed from: a */
    public void mo7308a(Set<String> deletedItemIds) {
        super.mo7308a(deletedItemIds);
        if ("largeicons".equals(m8274d())) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < this.f9846q.size() - 1) {
                int i3 = i2 + 1;
                if (!((LargeIconRemoteBatchItem) this.f9846q.get(i2)).packageName.equals(((LargeIconRemoteBatchItem) this.f9846q.get(i3)).packageName) && ((LargeIconRemoteBatchItem) this.f9846q.get(i2)).type == 1) {
                    arrayList.add(Integer.valueOf(i2));
                }
                i2 = i3;
            }
            List<T> list = this.f9846q;
            if (list != 0 && list.size() > 0) {
                List<T> list2 = this.f9846q;
                if (((LargeIconRemoteBatchItem) list2.get(list2.size() - 1)).type == 1) {
                    arrayList.add(Integer.valueOf(this.f9846q.size() - 1));
                }
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                int iIntValue = ((Integer) arrayList.get(size)).intValue();
                this.f9846q.remove(iIntValue);
                notifyItemRemoved(iIntValue);
            }
        }
    }

    public int fnq8() {
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        if ("theme".equals(m8274d())) {
            return 1;
        }
        if ("wallpaper".equals(m8274d())) {
            return 2;
        }
        if ("fonts".equals(m8274d())) {
            return 3;
        }
        if ("miwallpaper".equals(m8274d())) {
            return 4;
        }
        if ("aod".equals(m8274d())) {
            return 5;
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

    @Override // com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter
    public void mu(@dd List<UIProduct> elements, boolean append) {
        super.mu(elements, append);
        if (append) {
            this.f12893j++;
        } else {
            this.f12893j = 0;
        }
    }

    public int qkj8() {
        return this.f12893j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: qo */
    public BatchOperationAdapter.BatchViewHolder<BaseRemoteResourceAdapter.toq> onCreateViewHolder(@lvui ViewGroup viewGroup, int viewType) {
        return viewType != 2 ? viewType != 3 ? viewType != 5 ? viewType != 6 ? viewType != 8 ? viewType != 9 ? viewType != 122 ? ThemeViewHolder.m8285l(viewGroup, this) : WidgetSuitViewHolder.m8287l(viewGroup, this) : RemoteLargeIconViewHolder.m8284l(viewGroup, this) : RemoteLargeIconTitleViewHolder.m8283l(viewGroup, this) : RemoteIconMineViewHolder.n5r1(viewGroup, this) : RemoteAodMineViewHolder.n5r1(viewGroup, this) : FontViewHolder.m8277l(viewGroup, this) : WallpaperViewHolder.m8286l(viewGroup, this);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter
    protected void uv6(Menu menu) {
        menu.add(0, R.string.resource_delete, 0, R.string.resource_delete).setIcon(R.drawable.action_icon_delete);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter
    protected void y9n(MenuItem item, Set<String> checkedItemIds) {
        if (item.getItemId() == R.string.resource_delete) {
            if (checkedItemIds.size() == 0) {
                nn86.m7150k(R.string.resource_tip_select_none, 0);
            } else {
                new ki.C6947k(ki()).m25039i(android.R.attr.alertDialogIcon).m25050z(fn3e().getString(R.string.resource_delete_all, Integer.valueOf(checkedItemIds.size()))).mcp(android.R.string.cancel, null).dd(android.R.string.ok, new DialogInterfaceOnClickListenerC2194k(checkedItemIds)).hb();
            }
        }
    }
}

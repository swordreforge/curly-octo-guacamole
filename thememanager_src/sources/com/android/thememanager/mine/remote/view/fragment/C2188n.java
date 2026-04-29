package com.android.thememanager.mine.remote.view.fragment;

import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.mine.remote.presenter.RemoteResourceFavoritePresenter;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourceFavoriteAdapter;
import i9jn.InterfaceC6094k;
import java.util.Set;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.fragment.n */
/* JADX INFO: compiled from: RemoteResourceFavoriteTabFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2188n extends zy implements InterfaceC6094k.toq {
    @Override // i9jn.InterfaceC6094k.toq
    public void kja0() {
        vwb(false);
        this.f12868m.i1();
    }

    @Override // i9jn.InterfaceC6094k.toq
    public void ld6(Set<String> deletedItemIds) {
        vwb(true);
        this.f12868m.mo7308a(deletedItemIds);
        this.f12868m.bf2();
        if (this.f12868m.getItemCount() == 0) {
            pnt2();
        }
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: mi1u, reason: merged with bridge method [inline-methods] */
    public InterfaceC6094k.q uv6() {
        return new RemoteResourceFavoritePresenter(wt());
    }

    @Override // com.android.thememanager.mine.remote.view.fragment.zy
    protected BaseRemoteResourceAdapter r6ty() {
        return new RemoteResourceFavoriteAdapter(this, wt(), kiv());
    }

    protected void vwb(boolean success) {
        if (success) {
            nn86.m7150k(R.string.theme_favorite_delete_success, 0);
        } else {
            nn86.m7150k(R.string.theme_favorite_delete_fail, 0);
        }
    }
}

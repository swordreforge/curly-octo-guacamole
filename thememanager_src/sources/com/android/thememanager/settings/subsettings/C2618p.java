package com.android.thememanager.settings.subsettings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d3;
import androidx.recyclerview.widget.oc;
import com.android.thememanager.R;
import com.android.thememanager.recommend.view.listview.viewholder.mcp;
import com.android.thememanager.util.gc3c;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.settings.subsettings.p */
/* JADX INFO: compiled from: WallpaperOfflineAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2618p extends RecyclerView.AbstractC1060y<RecyclerView.fti> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final LayoutInflater f15474k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final d3<String> f15475n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final View.OnClickListener f15476q;

    /* JADX INFO: renamed from: com.android.thememanager.settings.subsettings.p$k */
    /* JADX INFO: compiled from: WallpaperOfflineAdapter.kt */
    public static final class k extends oc<String> {
        k(C2618p c2618p) {
            super(c2618p);
        }

        @Override // androidx.recyclerview.widget.d3.toq, java.util.Comparator
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public int compare(@InterfaceC7396q String o1, @InterfaceC7396q String o2) {
            d2ok.m23075h(o1, "o1");
            d2ok.m23075h(o2, "o2");
            return o1.compareTo(o2);
        }

        @Override // androidx.recyclerview.widget.d3.toq
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean mo4952g(@InterfaceC7396q String item1, @InterfaceC7396q String item2) {
            d2ok.m23075h(item1, "item1");
            d2ok.m23075h(item2, "item2");
            return d2ok.f7l8(item1, item2);
        }

        @Override // androidx.recyclerview.widget.d3.toq
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public boolean mo4954n(@InterfaceC7396q String oldItem, @InterfaceC7396q String newItem) {
            d2ok.m23075h(oldItem, "oldItem");
            d2ok.m23075h(newItem, "newItem");
            return d2ok.f7l8(newItem, oldItem);
        }
    }

    public C2618p(@InterfaceC7396q LayoutInflater inflater, @InterfaceC7396q View.OnClickListener click) {
        d2ok.m23075h(inflater, "inflater");
        d2ok.m23075h(click, "click");
        this.f15474k = inflater;
        this.f15476q = click;
        this.f15475n = new d3<>(String.class, new k(this));
    }

    public final void cdj() {
        this.f15475n.m4949s();
    }

    @InterfaceC7396q
    public final LayoutInflater fn3e() {
        return this.f15474k;
    }

    public final void fu4() {
        this.f15475n.m4949s();
        this.f15475n.m4946k("11");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f15475n.mcp();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int i2) {
        String strN7h = this.f15475n.n7h(i2);
        d2ok.kja0(strN7h, "get(...)");
        return Integer.parseInt(strN7h);
    }

    @InterfaceC7396q
    public final View.OnClickListener ki() {
        return this.f15476q;
    }

    public final void ni7() {
        this.f15475n.m4949s();
        this.f15475n.m4946k("12");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onBindViewHolder(@InterfaceC7396q RecyclerView.fti holder, int i2) {
        d2ok.m23075h(holder, "holder");
        if (holder instanceof toq) {
            ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            d2ok.n7h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = gc3c.m9779k(50.0f);
            marginLayoutParams.bottomMargin = gc3c.m9779k(16.0f);
            ((toq) holder).fn3e().setText(com.android.thememanager.basemodule.privacy.x2.f7l8() ? R.string.local_mode_hint : R.string.wallpaper_online_tip);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @InterfaceC7396q
    public RecyclerView.fti onCreateViewHolder(@InterfaceC7396q ViewGroup parent, int i2) {
        d2ok.m23075h(parent, "parent");
        if (i2 == 12) {
            View viewInflate = this.f15474k.inflate(R.layout.wallpaper_settings_item_loading, parent, false);
            d2ok.kja0(viewInflate, "inflate(...)");
            return new mcp(viewInflate);
        }
        View viewInflate2 = this.f15474k.inflate(R.layout.wallpaper_settings_offline_item, parent, false);
        viewInflate2.setOnClickListener(this.f15476q);
        d2ok.qrj(viewInflate2);
        return new toq(viewInflate2);
    }
}

package com.android.thememanager.settings.subsettings;

import android.content.res.Resources;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.view.listview.viewholder.d3;
import com.android.thememanager.recommend.view.listview.viewholder.mcp;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.view.ThemePreferenceView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: WallpaperSuperAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n7h extends RecyclerView.AbstractC1060y<RecyclerView.fti> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final LayoutInflater f15471k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final List<SuperWallpaperSummaryData> f15472n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final View.OnClickListener f15473q;

    public n7h(@InterfaceC7396q LayoutInflater inflater, @InterfaceC7396q View.OnClickListener moreSuper) {
        d2ok.m23075h(inflater, "inflater");
        d2ok.m23075h(moreSuper, "moreSuper");
        this.f15471k = inflater;
        this.f15473q = moreSuper;
        this.f15472n = new ArrayList();
    }

    public final void cdj(int i2) {
        this.f15472n.get(i2).f15592c = null;
    }

    @InterfaceC7396q
    public final View.OnClickListener fn3e() {
        return this.f15473q;
    }

    public final void fu4(@InterfaceC7395n SuperWallpaperSummaryData[] superWallpaperSummaryDataArr) {
        boolean z2;
        if (superWallpaperSummaryDataArr != null) {
            if (!(superWallpaperSummaryDataArr.length == 0)) {
                if (this.f15472n.size() > 0) {
                    this.f15472n.clear();
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (superWallpaperSummaryDataArr.length > 3) {
                    this.f15472n.addAll(kotlin.collections.kja0.m22514i(superWallpaperSummaryDataArr).subList(0, 3));
                } else {
                    this.f15472n.addAll(kotlin.collections.kja0.m22514i(superWallpaperSummaryDataArr));
                }
                if (z2) {
                    notifyItemRangeChanged(1, this.f15472n.size());
                } else {
                    notifyDataSetChanged();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        if (this.f15472n.size() > 0) {
            return Math.min(3, this.f15472n.size()) + 2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int i2) {
        if (i2 == 0) {
            return 110;
        }
        return i2 == this.f15472n.size() + 1 ? 19 : 111;
    }

    @InterfaceC7396q
    public final LayoutInflater ki() {
        return this.f15471k;
    }

    public final void ni7(int i2, @InterfaceC7396q Pair<Integer, Integer> pair) {
        d2ok.m23075h(pair, "pair");
        if (this.f15472n.get(i2).f15592c == null) {
            this.f15472n.get(i2).f15592c = pair;
            return;
        }
        Object second = pair.second;
        d2ok.kja0(second, "second");
        int iIntValue = ((Number) second).intValue();
        Object second2 = this.f15472n.get(i2).f15592c.second;
        d2ok.kja0(second2, "second");
        if (iIntValue > ((Number) second2).intValue()) {
            this.f15472n.get(i2).f15592c = pair;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onBindViewHolder(@InterfaceC7396q RecyclerView.fti holder, int i2) {
        d2ok.m23075h(holder, "holder");
        if (holder instanceof C2617n) {
            C2617n c2617n = (C2617n) holder;
            c2617n.ki().setAdapter(this);
            int i3 = i2 - 1;
            c2617n.ki().setBaseContents(this.f15472n.get(i3), i3);
            ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            d2ok.n7h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @InterfaceC7396q
    public RecyclerView.fti onCreateViewHolder(@InterfaceC7396q ViewGroup parent, int i2) {
        d2ok.m23075h(parent, "parent");
        if (i2 != 19) {
            if (i2 == 111) {
                View viewInflate = this.f15471k.inflate(R.layout.super_wallpaper_item_apk, parent, false);
                d2ok.kja0(viewInflate, "inflate(...)");
                return new C2617n(viewInflate);
            }
            View viewInflate2 = this.f15471k.inflate(R.layout.wallpaper_title_item, parent, false);
            d2ok.n7h(viewInflate2, "null cannot be cast to non-null type com.android.thememanager.view.ThemePreferenceView");
            ThemePreferenceView themePreferenceView = (ThemePreferenceView) viewInflate2;
            themePreferenceView.setOnClickListener(this.f15473q);
            return new d3(themePreferenceView);
        }
        Resources resources = this.f15471k.getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.super_wallpaper_bottom_divider_height);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.super_wallpaper_bottom_divider_margin_bottom);
        View viewInflate3 = this.f15471k.inflate(R.layout.normal_divider, parent, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, dimensionPixelSize);
        marginLayoutParams.bottomMargin = dimensionPixelSize2;
        viewInflate3.setLayoutParams(marginLayoutParams);
        d2ok.qrj(viewInflate3);
        return new mcp(viewInflate3);
    }
}

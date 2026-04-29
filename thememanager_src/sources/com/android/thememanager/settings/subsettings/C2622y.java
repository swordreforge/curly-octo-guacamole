package com.android.thememanager.settings.subsettings;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.recommend.view.listview.viewholder.mcp;
import com.android.thememanager.view.ThemePreferenceView;
import java.util.List;
import kotlin.collections.ni7;
import kotlin.jvm.internal.d2ok;
import mbx.C6812k;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.settings.subsettings.y */
/* JADX INFO: compiled from: WallpaperHeaderAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2622y extends RecyclerView.AbstractC1060y<RecyclerView.fti> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final List<Integer> f15499g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final LayoutInflater f15500k;

    /* JADX INFO: renamed from: n */
    private int f15501n;

    /* JADX INFO: renamed from: q */
    private int f15502q;

    public C2622y(@InterfaceC7396q LayoutInflater inflater) {
        d2ok.m23075h(inflater, "inflater");
        this.f15500k = inflater;
        Context context = inflater.getContext();
        this.f15502q = context.getResources().getDimensionPixelSize(R.dimen.wallpaper_title_layout_margin_start);
        this.f15501n = context.getResources().getDimensionPixelSize(R.dimen.wallpaper_setting_group_title_padding_end);
        if (C1807g.m7081r()) {
            boolean zNcyb = C1819o.ncyb(context);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (C6812k.m24741g(activity) && zNcyb) {
                    this.f15502q = activity.getResources().getDimensionPixelSize(R.dimen.wallpaper_title_layout_margin_dialog_land);
                }
            }
        }
        this.f15499g = ni7.d2ok(Integer.valueOf(R.string.historical_wallpaper), Integer.valueOf(R.string.load_from_local_photos), 0);
    }

    public final int cdj() {
        return this.f15501n;
    }

    public final int fn3e() {
        return this.f15502q;
    }

    public final void fu4(int i2) {
        this.f15502q = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f15499g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int i2) {
        return i2 == this.f15499g.size() + (-1) ? 19 : 0;
    }

    @InterfaceC7396q
    public final LayoutInflater ki() {
        return this.f15500k;
    }

    public final void ni7(int i2) {
        this.f15501n = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onBindViewHolder(@InterfaceC7396q RecyclerView.fti holder, int i2) {
        d2ok.m23075h(holder, "holder");
        if (holder instanceof ViewOnClickListenerC2614g) {
            ((ViewOnClickListenerC2614g) holder).ki(i2, this.f15499g.get(i2).intValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @InterfaceC7396q
    public RecyclerView.fti onCreateViewHolder(@InterfaceC7396q ViewGroup parent, int i2) {
        d2ok.m23075h(parent, "parent");
        if (i2 != 19) {
            View viewInflate = this.f15500k.inflate(R.layout.wallpaper_title_item, parent, false);
            d2ok.n7h(viewInflate, "null cannot be cast to non-null type com.android.thememanager.view.ThemePreferenceView");
            ThemePreferenceView themePreferenceView = (ThemePreferenceView) viewInflate;
            if (C1819o.ncyb(this.f15500k.getContext())) {
                themePreferenceView.setPaddingHorzintal(this.f15502q, themePreferenceView.getPaddingEnd());
            }
            return new ViewOnClickListenerC2614g(themePreferenceView);
        }
        View viewInflate2 = this.f15500k.inflate(R.layout.normal_divider, parent, false);
        int i3 = this.f15502q;
        if (i3 != 0 || this.f15501n != 0) {
            viewInflate2.setPadding(i3, 0, this.f15501n, 0);
        }
        d2ok.qrj(viewInflate2);
        return new mcp(viewInflate2);
    }
}

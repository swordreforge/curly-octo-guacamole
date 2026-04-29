package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.view.ThemePreferenceView;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PlaceHolderVH.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d3 extends RecyclerView.fti {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final ThemePreferenceView f14360k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(@InterfaceC7396q ThemePreferenceView view) {
        super(view);
        d2ok.m23075h(view, "view");
        this.f14360k = view;
        view.setSupportAnimation(false);
        TextView titleView = view.getTitleView();
        if (titleView != null) {
            titleView.setText(R.string.wallpaper_setting_super_wallpaper_banner_title);
        }
        TextView moreInfoView = view.getMoreInfoView();
        if (moreInfoView != null) {
            moreInfoView.setText(R.string.wallpaper_setting_super_wallpaper_more_button_text);
        }
        View moreArrow = view.getMoreArrow();
        if (moreArrow == null) {
            return;
        }
        moreArrow.setVisibility(0);
    }

    @InterfaceC7396q
    public final ThemePreferenceView ki() {
        return this.f14360k;
    }
}

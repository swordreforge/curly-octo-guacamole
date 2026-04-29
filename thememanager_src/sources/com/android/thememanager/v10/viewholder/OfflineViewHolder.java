package com.android.thememanager.v10.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.settings.WallpaperSettingsActivity;
import i1.C6077k;

/* JADX INFO: loaded from: classes2.dex */
public class OfflineViewHolder extends BaseViewHolder<UIElement> {

    /* JADX INFO: renamed from: com.android.thememanager.v10.viewholder.OfflineViewHolder$k */
    class C2834k implements C1781k.f7l8 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f16980k;

        C2834k(final Context val$activity) {
            this.f16980k = val$activity;
        }

        @Override // com.android.thememanager.basemodule.privacy.C1781k.f7l8
        public void y9n(boolean agree) {
            if (agree) {
                ((WallpaperSettingsActivity) this.f16980k).vep5();
            }
        }
    }

    OfflineViewHolder(View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        x9kr();
        View viewFindViewById = itemView.findViewById(R.id.offline);
        if (viewFindViewById != null) {
            C6077k.f7l8(viewFindViewById);
            final Context context = itemView.getContext();
            if (context instanceof WallpaperSettingsActivity) {
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.v10.viewholder.toq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f16985k.m10121l(context, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m10121l(Context context, View view) {
        if (C1781k.toq(bf2.toq.toq())) {
            ((WallpaperSettingsActivity) context).vep5();
        } else if (ki() instanceof AbstractActivityC1717k) {
            ((AbstractActivityC1717k) ki()).m6712j(null, true, new C2834k(context));
        }
    }

    public static OfflineViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new OfflineViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.wallpaper_settings_offline_item, parent, false), adapter);
    }
}

package com.android.thememanager.settings.personalize.holder;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.settings.ThemeAndWallpaperSettingActivity;
import i1.C6077k;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperCardHolder extends BottomViewHolder {

    /* JADX INFO: renamed from: p */
    private static final String f15245p = "WallpaperCardHolder";

    public WallpaperCardHolder(final Activity activity, View itemView) {
        super(activity, itemView);
        View viewFindViewById = itemView.findViewById(R.id.image_container);
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.img_background);
        int i2 = C1807g.zurt() ? R.drawable.personalize_wallpaper_bg_fold : R.drawable.personalize_wallpaper_bg;
        x2.m6782y(activity, Integer.valueOf(i2), imageView, x2.fn3e().dd("" + C1819o.d2ok(activity)).jp0y(com.bumptech.glide.load.toq.PREFER_ARGB_8888).ncyb(0.8f));
        C6077k.o1t(viewFindViewById);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.personalize.holder.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WallpaperCardHolder.m9065t(activity, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m9065t(Activity activity, View view) {
        if (C1819o.dd(activity) && !C1819o.m7164r(activity)) {
            nn86.m7150k(R.string.multiwindow_no_support, 0);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(activity, ThemeAndWallpaperSettingActivity.class);
        try {
            activity.startActivity(intent);
        } catch (Exception e2) {
            Log.e(f15245p, e2.getMessage());
        }
        C1708s.f7l8().ld6().ni7(C1706p.kja0("personalize", "personalize_wallpaper_card", ""));
    }

    @Override // com.android.thememanager.settings.personalize.holder.BottomViewHolder
    public String o1t() {
        return "personalize_wallpaper_card";
    }
}

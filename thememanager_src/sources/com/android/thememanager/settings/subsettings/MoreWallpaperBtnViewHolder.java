package com.android.thememanager.settings.subsettings;

import android.view.View;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.settings.WallpaperSubSettingActivity;
import com.android.thememanager.util.gc3c;
import i1.C6077k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class MoreWallpaperBtnViewHolder extends BaseThemeAdapter.ViewHolder implements View.OnClickListener, InterfaceC2616k {
    MoreWallpaperBtnViewHolder(@lvui View itemView, WallpaperSubVAdapter adapter) {
        super(itemView, adapter);
        View viewFindViewById = itemView.findViewById(R.id.button);
        C6077k.m22369i(viewFindViewById);
        viewFindViewById.setOnClickListener(this);
    }

    @Override // com.android.thememanager.settings.subsettings.InterfaceC2616k
    /* JADX INFO: renamed from: n */
    public void mo9024n() {
        m6706z().n5r1(com.android.thememanager.basemodule.analysis.toq.zkf2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        ActivityC0891q activityC0891qKi = ki();
        if (gc3c.cdj(activityC0891qKi)) {
            activityC0891qKi.startActivity(com.android.thememanager.toq.toq(activityC0891qKi, "wallpaper"));
            if (activityC0891qKi instanceof WallpaperSubSettingActivity) {
                String strYz = ((WallpaperSubSettingActivity) activityC0891qKi).yz();
                com.android.thememanager.basemodule.analysis.kja0.f7l8(strYz, com.android.thememanager.basemodule.analysis.toq.zkf2, com.android.thememanager.basemodule.analysis.toq.jek);
                C1708s.f7l8().ld6().ni7(C1706p.kja0(strYz, com.android.thememanager.basemodule.analysis.toq.zkf2, com.android.thememanager.basemodule.analysis.toq.jek));
            }
        }
    }

    @Override // com.android.thememanager.settings.subsettings.InterfaceC2616k
    public void zy() {
        m6706z().ncyb(com.android.thememanager.basemodule.analysis.toq.zkf2);
    }
}

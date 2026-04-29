package com.android.thememanager.settings.subsettings;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.settings.superwallpaper.widget.ApkSuperWallpaperItemView;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.settings.subsettings.n */
/* JADX INFO: compiled from: WallpaperSuperAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2617n extends RecyclerView.fti {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final ApkSuperWallpaperItemView f15470k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2617n(@InterfaceC7396q View view) {
        super(view);
        d2ok.m23075h(view, "view");
        this.f15470k = (ApkSuperWallpaperItemView) view;
    }

    @InterfaceC7396q
    public final ApkSuperWallpaperItemView ki() {
        return this.f15470k;
    }
}

package com.android.thememanager.settings.subsettings;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: WallpaperOfflineAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class toq extends RecyclerView.fti {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final View f15497k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final TextView f15498q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toq(@InterfaceC7396q View view) {
        super(view);
        d2ok.m23075h(view, "view");
        View viewFindViewById = view.findViewById(R.id.offline_divider);
        d2ok.qrj(viewFindViewById);
        this.f15497k = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.offline_subtitle);
        d2ok.kja0(viewFindViewById2, "findViewById(...)");
        this.f15498q = (TextView) viewFindViewById2;
        viewFindViewById.setVisibility(4);
    }

    @InterfaceC7396q
    public final TextView fn3e() {
        return this.f15498q;
    }

    @InterfaceC7396q
    public final View ki() {
        return this.f15497k;
    }
}

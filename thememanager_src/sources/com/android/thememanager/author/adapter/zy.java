package com.android.thememanager.author.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.activity.cv06;
import com.android.thememanager.fu4;
import com.android.thememanager.util.ch;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;

/* JADX INFO: compiled from: AuthorThemeAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class zy extends cv06 {
    public zy(@InterfaceC7395n Context context, @InterfaceC7395n fu4 fu4Var) {
        super(context, fu4Var);
    }

    @Override // com.android.thememanager.activity.pc
    protected void y9n() {
        Activity activity = this.f9313o.get();
        d2ok.qrj(activity);
        this.f57347bo = (int) activity.getResources().getDimension(R.dimen.default_horizontal_offset_from_screen_new);
        this.f9314u = (int) activity.getResources().getDimension(R.dimen.author_detail_item_gap);
        this.f9315v = 0;
        this.f9309d = 0;
        Pair<Integer, Integer> pairD3 = ch.d3(activity, this.f9310e.getDisplayType(), this.f57347bo, this.f9314u);
        Object first = pairD3.first;
        d2ok.kja0(first, "first");
        this.f9307a = ((Number) first).intValue();
        Object second = pairD3.second;
        d2ok.kja0(second, "second");
        this.f9317x = ((Number) second).intValue();
    }

    public zy(@InterfaceC7395n C1582h c1582h, @InterfaceC7395n fu4 fu4Var) {
        super(c1582h, fu4Var);
    }
}

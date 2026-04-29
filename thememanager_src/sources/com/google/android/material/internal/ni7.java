package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: ViewOverlayApi18.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(18)
class ni7 implements fu4 {

    /* JADX INFO: renamed from: k */
    private final ViewOverlay f24559k;

    ni7(@lvui View view) {
        this.f24559k = view.getOverlay();
    }

    @Override // com.google.android.material.internal.fu4
    /* JADX INFO: renamed from: k */
    public void mo14541k(@lvui Drawable drawable) {
        this.f24559k.add(drawable);
    }

    @Override // com.google.android.material.internal.fu4
    public void toq(@lvui Drawable drawable) {
        this.f24559k.remove(drawable);
    }
}

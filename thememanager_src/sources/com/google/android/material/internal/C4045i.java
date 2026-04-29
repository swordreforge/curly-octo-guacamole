package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.internal.i */
/* JADX INFO: compiled from: ViewGroupOverlayApi18.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(18)
class C4045i implements fn3e {

    /* JADX INFO: renamed from: k */
    private final ViewGroupOverlay f24545k;

    C4045i(@lvui ViewGroup viewGroup) {
        this.f24545k = viewGroup.getOverlay();
    }

    @Override // com.google.android.material.internal.fu4
    /* JADX INFO: renamed from: k */
    public void mo14541k(@lvui Drawable drawable) {
        this.f24545k.add(drawable);
    }

    @Override // com.google.android.material.internal.fn3e
    /* JADX INFO: renamed from: q */
    public void mo14540q(@lvui View view) {
        this.f24545k.remove(view);
    }

    @Override // com.google.android.material.internal.fu4
    public void toq(@lvui Drawable drawable) {
        this.f24545k.remove(drawable);
    }

    @Override // com.google.android.material.internal.fn3e
    public void zy(@lvui View view) {
        this.f24545k.add(view);
    }
}

package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1225l;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: MaterialFadeThrough.java */
/* JADX INFO: loaded from: classes2.dex */
public final class kja0 extends cdj<C4197n> {
    private static final float zmmu = 0.92f;

    @InterfaceC7828g
    private static final int sk1t = C6095k.zy.e10;

    @InterfaceC7828g
    private static final int dy = C6095k.zy.ia;

    public kja0() {
        super(kcsr(), bwp());
    }

    private static zurt bwp() {
        ki kiVar = new ki();
        kiVar.kja0(false);
        kiVar.x2(zmmu);
        return kiVar;
    }

    private static C4197n kcsr() {
        return new C4197n();
    }

    @Override // com.google.android.material.transition.cdj
    @dd
    public /* bridge */ /* synthetic */ zurt cfr() {
        return super.cfr();
    }

    @Override // com.google.android.material.transition.cdj, androidx.transition.t8iq
    public /* bridge */ /* synthetic */ Animator d8wk(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        return super.d8wk(viewGroup, view, c1225l, c1225l2);
    }

    @Override // com.google.android.material.transition.cdj
    @InterfaceC7828g
    int etdu(boolean z2) {
        return dy;
    }

    @Override // com.google.android.material.transition.cdj
    public /* bridge */ /* synthetic */ void ltg8() {
        super.ltg8();
    }

    @Override // com.google.android.material.transition.cdj
    public /* bridge */ /* synthetic */ void py(@lvui zurt zurtVar) {
        super.py(zurtVar);
    }

    @Override // com.google.android.material.transition.cdj
    @lvui
    public /* bridge */ /* synthetic */ zurt sok() {
        return super.sok();
    }

    @Override // com.google.android.material.transition.cdj
    @InterfaceC7828g
    int v0af(boolean z2) {
        return sk1t;
    }

    @Override // com.google.android.material.transition.cdj, androidx.transition.t8iq
    public /* bridge */ /* synthetic */ Animator was(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        return super.was(viewGroup, view, c1225l, c1225l2);
    }

    @Override // com.google.android.material.transition.cdj
    public /* bridge */ /* synthetic */ void yqrt(@dd zurt zurtVar) {
        super.yqrt(zurtVar);
    }

    @Override // com.google.android.material.transition.cdj
    public /* bridge */ /* synthetic */ boolean z4(@lvui zurt zurtVar) {
        return super.z4(zurtVar);
    }
}

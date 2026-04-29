package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1225l;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: MaterialElevationScale.java */
/* JADX INFO: loaded from: classes2.dex */
public final class qrj extends cdj<ki> {
    private static final float sk1t = 0.85f;
    private final boolean zmmu;

    public qrj(boolean z2) {
        super(kcsr(z2), bwp());
        this.zmmu = z2;
    }

    private static zurt bwp() {
        return new C4223q();
    }

    private static ki kcsr(boolean z2) {
        ki kiVar = new ki(z2);
        kiVar.qrj(sk1t);
        kiVar.x2(sk1t);
        return kiVar;
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
    public /* bridge */ /* synthetic */ void ltg8() {
        super.ltg8();
    }

    @Override // com.google.android.material.transition.cdj
    public /* bridge */ /* synthetic */ void py(@lvui zurt zurtVar) {
        super.py(zurtVar);
    }

    public boolean se() {
        return this.zmmu;
    }

    @Override // com.google.android.material.transition.cdj
    @lvui
    public /* bridge */ /* synthetic */ zurt sok() {
        return super.sok();
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

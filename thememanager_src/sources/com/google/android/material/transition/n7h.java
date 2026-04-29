package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1225l;
import com.google.android.material.animation.C3910k;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: MaterialFade.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n7h extends cdj<C4223q> {
    private static final float sk1t = 0.3f;
    private static final float zmmu = 0.8f;

    @InterfaceC7828g
    private static final int dy = C6095k.zy.vu6;

    @InterfaceC7828g
    private static final int vb6 = C6095k.zy.qkbk;

    @InterfaceC7828g
    private static final int k6e = C6095k.zy.t5;

    public n7h() {
        super(kcsr(), bwp());
    }

    private static zurt bwp() {
        ki kiVar = new ki();
        kiVar.kja0(false);
        kiVar.x2(zmmu);
        return kiVar;
    }

    private static C4223q kcsr() {
        C4223q c4223q = new C4223q();
        c4223q.m15272n(sk1t);
        return c4223q;
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
        return k6e;
    }

    @Override // com.google.android.material.transition.cdj
    public /* bridge */ /* synthetic */ void ltg8() {
        super.ltg8();
    }

    @Override // com.google.android.material.transition.cdj
    @lvui
    TimeInterpolator m4(boolean z2) {
        return C3910k.f23771k;
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
        return z2 ? dy : vb6;
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

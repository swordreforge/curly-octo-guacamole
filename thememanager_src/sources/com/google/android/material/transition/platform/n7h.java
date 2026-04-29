package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: MaterialElevationScale.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
public final class n7h extends ki<t8r> {

    /* JADX INFO: renamed from: y */
    private static final float f25493y = 0.85f;

    /* JADX INFO: renamed from: g */
    private final boolean f25494g;

    public n7h(boolean z2) {
        super(m15208i(z2), fn3e());
        this.f25494g = z2;
    }

    private static ni7 fn3e() {
        return new C4207q();
    }

    /* JADX INFO: renamed from: i */
    private static t8r m15208i(boolean z2) {
        t8r t8rVar = new t8r(z2);
        t8rVar.qrj(f25493y);
        t8rVar.x2(f25493y);
        return t8rVar;
    }

    @Override // com.google.android.material.transition.platform.ki
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ void mo15187k(@lvui ni7 ni7Var) {
        super.mo15187k(ni7Var);
    }

    @Override // com.google.android.material.transition.platform.ki
    public /* bridge */ /* synthetic */ boolean ki(@lvui ni7 ni7Var) {
        return super.ki(ni7Var);
    }

    @Override // com.google.android.material.transition.platform.ki
    @dd
    public /* bridge */ /* synthetic */ ni7 kja0() {
        return super.kja0();
    }

    @Override // com.google.android.material.transition.platform.ki
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void mo15188n() {
        super.mo15188n();
    }

    @Override // com.google.android.material.transition.platform.ki
    @lvui
    public /* bridge */ /* synthetic */ ni7 n7h() {
        return super.n7h();
    }

    @Override // com.google.android.material.transition.platform.ki, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.ki, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.ki
    public /* bridge */ /* synthetic */ void t8r(@dd ni7 ni7Var) {
        super.t8r(ni7Var);
    }

    public boolean zurt() {
        return this.f25494g;
    }
}

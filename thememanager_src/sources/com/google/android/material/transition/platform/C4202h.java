package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.transition.platform.h */
/* JADX INFO: compiled from: MaterialFadeThrough.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
public final class C4202h extends ki<C4205n> {

    /* JADX INFO: renamed from: g */
    private static final float f25469g = 0.92f;

    /* JADX INFO: renamed from: y */
    @InterfaceC7828g
    private static final int f25471y = C6095k.zy.e10;

    /* JADX INFO: renamed from: s */
    @InterfaceC7828g
    private static final int f25470s = C6095k.zy.ia;

    public C4202h() {
        super(m15192i(), fn3e());
    }

    private static ni7 fn3e() {
        t8r t8rVar = new t8r();
        t8rVar.kja0(false);
        t8rVar.x2(f25469g);
        return t8rVar;
    }

    /* JADX INFO: renamed from: i */
    private static C4205n m15192i() {
        return new C4205n();
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
    @InterfaceC7828g
    int qrj(boolean z2) {
        return f25470s;
    }

    @Override // com.google.android.material.transition.platform.ki
    @InterfaceC7828g
    /* JADX INFO: renamed from: s */
    int mo15189s(boolean z2) {
        return f25471y;
    }

    @Override // com.google.android.material.transition.platform.ki
    public /* bridge */ /* synthetic */ void t8r(@dd ni7 ni7Var) {
        super.t8r(ni7Var);
    }
}

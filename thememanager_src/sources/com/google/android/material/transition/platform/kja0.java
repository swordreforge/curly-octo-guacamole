package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.C3910k;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: MaterialFade.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
public final class kja0 extends ki<C4207q> {

    /* JADX INFO: renamed from: g */
    private static final float f25480g = 0.8f;

    /* JADX INFO: renamed from: y */
    private static final float f25484y = 0.3f;

    /* JADX INFO: renamed from: s */
    @InterfaceC7828g
    private static final int f25483s = C6095k.zy.vu6;

    /* JADX INFO: renamed from: p */
    @InterfaceC7828g
    private static final int f25482p = C6095k.zy.qkbk;

    /* JADX INFO: renamed from: h */
    @InterfaceC7828g
    private static final int f25481h = C6095k.zy.t5;

    public kja0() {
        super(m15204i(), fn3e());
    }

    private static ni7 fn3e() {
        t8r t8rVar = new t8r();
        t8rVar.kja0(false);
        t8rVar.x2(f25480g);
        return t8rVar;
    }

    /* JADX INFO: renamed from: i */
    private static C4207q m15204i() {
        C4207q c4207q = new C4207q();
        c4207q.m15211n(f25484y);
        return c4207q;
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
        return f25481h;
    }

    @Override // com.google.android.material.transition.platform.ki
    @InterfaceC7828g
    /* JADX INFO: renamed from: s */
    int mo15189s(boolean z2) {
        return z2 ? f25483s : f25482p;
    }

    @Override // com.google.android.material.transition.platform.ki
    public /* bridge */ /* synthetic */ void t8r(@dd ni7 ni7Var) {
        super.t8r(ni7Var);
    }

    @Override // com.google.android.material.transition.platform.ki
    @lvui
    /* JADX INFO: renamed from: y */
    TimeInterpolator mo15203y(boolean z2) {
        return C3910k.f23771k;
    }
}

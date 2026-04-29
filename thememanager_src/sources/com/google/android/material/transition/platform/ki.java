package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.C3910k;
import com.google.android.material.transition.platform.ni7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.InterfaceC7828g;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: MaterialVisibility.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
abstract class ki<P extends ni7> extends Visibility {

    /* JADX INFO: renamed from: k */
    private final P f25477k;

    /* JADX INFO: renamed from: n */
    private final List<ni7> f25478n = new ArrayList();

    /* JADX INFO: renamed from: q */
    @dd
    private ni7 f25479q;

    protected ki(P p2, @dd ni7 ni7Var) {
        this.f25477k = p2;
        this.f25479q = ni7Var;
    }

    private void cdj(@lvui Context context, boolean z2) {
        zurt.cdj(this, context, mo15189s(z2));
        zurt.ki(this, context, qrj(z2), mo15203y(z2));
    }

    /* JADX INFO: renamed from: g */
    private Animator m15201g(@lvui ViewGroup viewGroup, @lvui View view, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m15202q(arrayList, this.f25477k, viewGroup, view, z2);
        m15202q(arrayList, this.f25479q, viewGroup, view, z2);
        Iterator<ni7> it = this.f25478n.iterator();
        while (it.hasNext()) {
            m15202q(arrayList, it.next(), viewGroup, view, z2);
        }
        cdj(viewGroup.getContext(), z2);
        com.google.android.material.animation.toq.m13989k(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: q */
    private static void m15202q(List<Animator> list, @dd ni7 ni7Var, ViewGroup viewGroup, View view, boolean z2) {
        if (ni7Var == null) {
            return;
        }
        Animator qVar = z2 ? ni7Var.toq(viewGroup, view) : ni7Var.mo15198k(viewGroup, view);
        if (qVar != null) {
            list.add(qVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo15187k(@lvui ni7 ni7Var) {
        this.f25478n.add(ni7Var);
    }

    public boolean ki(@lvui ni7 ni7Var) {
        return this.f25478n.remove(ni7Var);
    }

    @dd
    public ni7 kja0() {
        return this.f25479q;
    }

    /* JADX INFO: renamed from: n */
    public void mo15188n() {
        this.f25478n.clear();
    }

    @lvui
    public P n7h() {
        return this.f25477k;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m15201g(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return m15201g(viewGroup, view, false);
    }

    @InterfaceC7828g
    int qrj(boolean z2) {
        return 0;
    }

    @InterfaceC7828g
    /* JADX INFO: renamed from: s */
    int mo15189s(boolean z2) {
        return 0;
    }

    public void t8r(@dd ni7 ni7Var) {
        this.f25479q = ni7Var;
    }

    @lvui
    /* JADX INFO: renamed from: y */
    TimeInterpolator mo15203y(boolean z2) {
        return C3910k.f67312toq;
    }
}

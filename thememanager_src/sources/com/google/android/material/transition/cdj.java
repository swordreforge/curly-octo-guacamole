package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1225l;
import androidx.transition.t8iq;
import com.google.android.material.animation.C3910k;
import com.google.android.material.transition.zurt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.InterfaceC7828g;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: MaterialVisibility.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class cdj<P extends zurt> extends t8iq {

    @dd
    private zurt tgs;
    private final P w97r;
    private final List<zurt> yl25 = new ArrayList();

    protected cdj(P p2, @dd zurt zurtVar) {
        this.w97r = p2;
        this.tgs = zurtVar;
    }

    private static void i9jn(List<Animator> list, @dd zurt zurtVar, ViewGroup viewGroup, View view, boolean z2) {
        if (zurtVar == null) {
            return;
        }
        Animator qVar = z2 ? zurtVar.toq(viewGroup, view) : zurtVar.mo15176k(viewGroup, view);
        if (qVar != null) {
            list.add(qVar);
        }
    }

    private Animator r8s8(@lvui ViewGroup viewGroup, @lvui View view, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        i9jn(arrayList, this.w97r, viewGroup, view, z2);
        i9jn(arrayList, this.tgs, viewGroup, view, z2);
        Iterator<zurt> it = this.yl25.iterator();
        while (it.hasNext()) {
            i9jn(arrayList, it.next(), viewGroup, view, z2);
        }
        w831(viewGroup.getContext(), z2);
        com.google.android.material.animation.toq.m13989k(animatorSet, arrayList);
        return animatorSet;
    }

    private void w831(@lvui Context context, boolean z2) {
        fn3e.cdj(this, context, v0af(z2));
        fn3e.ki(this, context, etdu(z2), m4(z2));
    }

    @dd
    public zurt cfr() {
        return this.tgs;
    }

    @Override // androidx.transition.t8iq
    public Animator d8wk(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        return r8s8(viewGroup, view, true);
    }

    @InterfaceC7828g
    int etdu(boolean z2) {
        return 0;
    }

    public void ltg8() {
        this.yl25.clear();
    }

    @lvui
    TimeInterpolator m4(boolean z2) {
        return C3910k.f67312toq;
    }

    public void py(@lvui zurt zurtVar) {
        this.yl25.add(zurtVar);
    }

    @lvui
    public P sok() {
        return this.w97r;
    }

    @InterfaceC7828g
    int v0af(boolean z2) {
        return 0;
    }

    @Override // androidx.transition.t8iq
    public Animator was(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        return r8s8(viewGroup, view, false);
    }

    public void yqrt(@dd zurt zurtVar) {
        this.tgs = zurtVar;
    }

    public boolean z4(@lvui zurt zurtVar) {
        return this.yl25.remove(zurtVar);
    }
}

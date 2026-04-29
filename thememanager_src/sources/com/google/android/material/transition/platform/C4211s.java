package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.transition.platform.s */
/* JADX INFO: compiled from: Hold.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
public final class C4211s extends Visibility {
    @Override // android.transition.Visibility
    @lvui
    public Animator onAppear(@lvui ViewGroup viewGroup, @lvui View view, @dd TransitionValues transitionValues, @dd TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // android.transition.Visibility
    @lvui
    public Animator onDisappear(@lvui ViewGroup viewGroup, @lvui View view, @dd TransitionValues transitionValues, @dd TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}

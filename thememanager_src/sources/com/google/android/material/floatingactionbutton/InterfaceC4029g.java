package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.animation.C3915y;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.g */
/* JADX INFO: compiled from: MotionStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
interface InterfaceC4029g {
    @zy.toq
    int f7l8();

    /* JADX INFO: renamed from: g */
    void mo14472g();

    /* JADX INFO: renamed from: k */
    C3915y mo14488k();

    AnimatorSet ld6();

    /* JADX INFO: renamed from: n */
    void mo14489n(@lvui Animator.AnimatorListener animatorListener);

    void onAnimationStart(Animator animator);

    /* JADX INFO: renamed from: p */
    void mo14490p(@dd C3915y c3915y);

    /* JADX INFO: renamed from: q */
    boolean mo14466q();

    void qrj(@dd ExtendedFloatingActionButton.AbstractC4022p abstractC4022p);

    /* JADX INFO: renamed from: s */
    void mo14467s();

    void toq();

    List<Animator.AnimatorListener> x2();

    /* JADX INFO: renamed from: y */
    void mo14491y(@lvui Animator.AnimatorListener animatorListener);

    @dd
    C3915y zy();
}

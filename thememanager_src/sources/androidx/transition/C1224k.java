package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: androidx.transition.k */
/* JADX INFO: compiled from: AnimatorUtils.java */
/* JADX INFO: loaded from: classes.dex */
class C1224k {

    /* JADX INFO: renamed from: androidx.transition.k$k */
    /* JADX INFO: compiled from: AnimatorUtils.java */
    interface k {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    private C1224k() {
    }

    /* JADX INFO: renamed from: k */
    static void m5365k(@zy.lvui Animator animator, @zy.lvui AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    static void toq(@zy.lvui Animator animator) {
        animator.pause();
    }

    static void zy(@zy.lvui Animator animator) {
        animator.resume();
    }
}

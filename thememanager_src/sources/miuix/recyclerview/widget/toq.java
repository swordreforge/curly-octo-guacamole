package miuix.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: MiuiScaleItemAnimator.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends C7318k {

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final float f90049fti = 0.8f;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f90050jp0y = 20;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private float f90051a9 = Float.NaN;

    /* JADX INFO: renamed from: miuix.recyclerview.widget.toq$k */
    /* JADX INFO: compiled from: MiuiScaleItemAnimator.java */
    class C7319k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RecyclerView.fti f41579k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ ViewPropertyAnimator f41580n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f41581q;

        C7319k(RecyclerView.fti ftiVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f41579k = ftiVar;
            this.f41581q = view;
            this.f41580n = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f41581q.setAlpha(1.0f);
            this.f41581q.setScaleX(1.0f);
            this.f41581q.setScaleY(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f41580n.setListener(null);
            toq.this.gvn7(this.f41579k);
            toq.this.f90044zurt.remove(this.f41579k);
            toq.this.m26523m();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            toq.this.d3(this.f41579k);
        }
    }

    /* JADX INFO: renamed from: miuix.recyclerview.widget.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MiuiScaleItemAnimator.java */
    class C8110toq extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RecyclerView.fti f41583k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f41584n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ViewPropertyAnimator f41585q;

        C8110toq(RecyclerView.fti ftiVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f41583k = ftiVar;
            this.f41585q = viewPropertyAnimator;
            this.f41584n = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f41585q.setListener(null);
            this.f41584n.setAlpha(1.0f);
            this.f41584n.setScaleX(1.0f);
            this.f41584n.setScaleY(1.0f);
            toq.this.m4992r(this.f41583k);
            toq.this.f90039fu4.remove(this.f41583k);
            toq.this.m26523m();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            toq.this.dd(this.f41583k);
        }
    }

    private float bf2(RecyclerView.fti ftiVar) {
        if (Float.isNaN(this.f90051a9)) {
            this.f90051a9 = TypedValue.applyDimension(1, 20.0f, ftiVar.itemView.getResources().getDisplayMetrics());
        }
        float fMax = Math.max(ftiVar.itemView.getWidth(), ftiVar.itemView.getHeight());
        return Math.max((fMax - this.f90051a9) / fMax, f90049fti);
    }

    @Override // miuix.recyclerview.widget.C7318k
    /* JADX INFO: renamed from: e */
    void mo26521e(RecyclerView.fti ftiVar) {
        View view = ftiVar.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f90044zurt.add(ftiVar);
        viewPropertyAnimatorAnimate.setInterpolator(C7318k.f90033jk);
        viewPropertyAnimatorAnimate.scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(qrj()).setListener(new C7319k(ftiVar, view, viewPropertyAnimatorAnimate)).start();
    }

    @Override // miuix.recyclerview.widget.C7318k
    /* JADX INFO: renamed from: j */
    void mo26522j(RecyclerView.fti ftiVar) {
        View view = ftiVar.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        float fBf2 = bf2(ftiVar);
        this.f90039fu4.add(ftiVar);
        viewPropertyAnimatorAnimate.setInterpolator(C7318k.f90033jk);
        viewPropertyAnimatorAnimate.setDuration(m4845h()).scaleX(fBf2).scaleY(fBf2).alpha(0.0f).setListener(new C8110toq(ftiVar, viewPropertyAnimatorAnimate, view)).start();
    }

    @Override // miuix.recyclerview.widget.C7318k, androidx.recyclerview.widget.jp0y
    public boolean jk(RecyclerView.fti ftiVar) {
        float fBf2 = bf2(ftiVar);
        m26520b(ftiVar);
        ftiVar.itemView.setAlpha(0.0f);
        ftiVar.itemView.setScaleX(fBf2);
        ftiVar.itemView.setScaleY(fBf2);
        this.f41540h.add(ftiVar);
        return true;
    }
}

package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.kja0;
import miuix.animation.Folme;
import miuix.animation.utils.EaseManager;
import miuix.device.C7106k;

/* JADX INFO: compiled from: SpringItemTouchHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class eqxt extends kja0 {

    /* JADX INFO: renamed from: e */
    private static final TimeInterpolator f5852e = new EaseManager.SpringInterpolator().setDamping(0.95f).setResponse(0.3f);

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private final boolean f52123lrht;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    boolean f52124uv6;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private final float[] f52125vyq;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.eqxt$k */
    /* JADX INFO: compiled from: SpringItemTouchHelper.java */
    class C1076k extends kja0.C1091y {

        /* JADX INFO: renamed from: c */
        final /* synthetic */ RecyclerView.fti f5853c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1076k(RecyclerView.fti ftiVar, int i2, int i3, float f2, float f3, float f4, float f5, RecyclerView.fti ftiVar2) {
            super(ftiVar, i2, i3, f2, f3, f4, f5);
            this.f5853c = ftiVar2;
        }

        @Override // androidx.recyclerview.widget.kja0.C1091y, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f5938r) {
                return;
            }
            eqxt eqxtVar = eqxt.this;
            eqxtVar.f52180qrj.zy(eqxtVar.f52170cdj, this.f5853c);
            eqxt eqxtVar2 = eqxt.this;
            View view = eqxtVar2.f52178ni7;
            View view2 = this.f5853c.itemView;
            if (view == view2) {
                eqxtVar2.wvg(view2);
            }
        }
    }

    public eqxt(@zy.lvui kja0.AbstractC1085g abstractC1085g) {
        super(abstractC1085g);
        this.f52125vyq = new float[2];
        this.f52123lrht = (C7106k.d2ok() || C7106k.d3()) ? false : true;
    }

    @SuppressLint({"VisibleForTests"})
    private void lvui() {
        boolean z2;
        miuix.reflect.toq.x2(this, miuix.reflect.toq.zy(kja0.class, "mDragScrollStartTimeInMs"), Long.MIN_VALUE);
        m5007h(null, true);
        miuix.reflect.toq.x2(this, miuix.reflect.toq.zy(kja0.class, "mActionState"), 0);
        RecyclerView.fti ftiVar = this.f52186zy;
        if (ftiVar.itemView.getParent() != null) {
            o1t();
            miuix.reflect.toq.ld6(this, miuix.reflect.toq.m26537n(kja0.class, "getSelectedDxDy", float[].class), this.f52125vyq);
            float[] fArr = this.f52125vyq;
            C1076k c1076k = new C1076k(ftiVar, 8, 2, fArr[0], fArr[1], 0.0f, 0.0f, ftiVar);
            c1076k.f5936p.setInterpolator(f5852e);
            this.f52175kja0.add(c1076k);
            c1076k.m5024q();
            z2 = true;
        } else {
            wvg(ftiVar.itemView);
            this.f52180qrj.zy(this.f52170cdj, ftiVar);
            z2 = false;
        }
        this.f52186zy = null;
        ViewParent parent = this.f52170cdj.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.f52186zy != null);
        }
        if (!z2) {
            this.f52170cdj.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.f52180qrj.mcp(this.f52186zy, 0);
        this.f52170cdj.invalidate();
    }

    private void o1t() {
        VelocityTracker velocityTracker = this.f52181t8r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f52181t8r = null;
        }
    }

    private static boolean zurt(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    public void d2ok(RecyclerView.fti ftiVar) {
        RecyclerView recyclerView = this.f52170cdj;
        if (recyclerView instanceof miuix.recyclerview.widget.RecyclerView) {
            ((miuix.recyclerview.widget.RecyclerView) recyclerView).setSpringEnabled(this.f52124uv6);
        }
    }

    public void eqxt(RecyclerView.fti ftiVar) {
        RecyclerView recyclerView = this.f52170cdj;
        if (recyclerView instanceof miuix.recyclerview.widget.RecyclerView) {
            this.f52124uv6 = ((miuix.recyclerview.widget.RecyclerView) recyclerView).getSpringEnabled();
            ((miuix.recyclerview.widget.RecyclerView) this.f52170cdj).setSpringEnabled(false);
        }
    }

    @Override // androidx.recyclerview.widget.kja0
    @SuppressLint({"VisibleForTests"})
    View ki(MotionEvent motionEvent) {
        if (this.f52186zy != null) {
            return super.ki(motionEvent);
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        for (int size = this.f52175kja0.size() - 1; size >= 0; size--) {
            kja0.C1091y c1091y = this.f52175kja0.get(size);
            View view = c1091y.f5941y.itemView;
            if (zurt(view, x3, y3, view.getX() + c1091y.f5942z, view.getY() + c1091y.f5940t)) {
                return view;
            }
        }
        return this.f52170cdj.findChildViewUnder(x3, y3);
    }

    @Override // androidx.recyclerview.widget.kja0
    void mcp(@zy.dd RecyclerView.fti ftiVar, int i2) {
        boolean z2 = false;
        if (i2 == 2) {
            if (ftiVar != null && !Folme.isInDraggingState(this.f52170cdj)) {
                Folme.setDraggingState(this.f52170cdj, true);
                eqxt(ftiVar);
            }
        } else if (i2 == 0 && Folme.isInDraggingState(this.f52170cdj)) {
            Folme.setDraggingState(this.f52170cdj, false);
            RecyclerView.fti ftiVar2 = this.f52186zy;
            if (ftiVar2 != null) {
                d2ok(ftiVar2);
                z2 = this.f52123lrht;
            }
        }
        if (z2) {
            lvui();
        } else {
            super.mcp(ftiVar, i2);
        }
    }
}

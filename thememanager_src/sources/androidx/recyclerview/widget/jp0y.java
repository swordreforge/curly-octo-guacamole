package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: SimpleItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class jp0y extends RecyclerView.qrj {

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f52136n7h = "SimpleItemAnimator";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final boolean f52137qrj = false;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    boolean f52138x2 = true;

    public abstract boolean a9(RecyclerView.fti ftiVar, RecyclerView.fti ftiVar2, int i2, int i3, int i4, int i5);

    /* JADX INFO: renamed from: c */
    public void m4989c(RecyclerView.fti ftiVar) {
    }

    public final void d2ok(RecyclerView.fti ftiVar) {
        m4990f(ftiVar);
        m4852y(ftiVar);
    }

    public final void d3(RecyclerView.fti ftiVar) {
        m4991l(ftiVar);
    }

    public final void dd(RecyclerView.fti ftiVar) {
        uv6(ftiVar);
    }

    public final void eqxt(RecyclerView.fti ftiVar, boolean z2) {
        hyr(ftiVar, z2);
    }

    /* JADX INFO: renamed from: f */
    public void m4990f(RecyclerView.fti ftiVar) {
    }

    public abstract boolean fti(RecyclerView.fti ftiVar, int i2, int i3, int i4, int i5);

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    /* JADX INFO: renamed from: g */
    public boolean mo4844g(@zy.lvui RecyclerView.fti ftiVar) {
        return !this.f52138x2 || ftiVar.isInvalid();
    }

    public final void gvn7(RecyclerView.fti ftiVar) {
        ncyb(ftiVar);
        m4852y(ftiVar);
    }

    public void hyr(RecyclerView.fti ftiVar, boolean z2) {
    }

    public abstract boolean jk(RecyclerView.fti ftiVar);

    public abstract boolean jp0y(RecyclerView.fti ftiVar);

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    /* JADX INFO: renamed from: k */
    public boolean mo4847k(@zy.lvui RecyclerView.fti ftiVar, @zy.dd RecyclerView.qrj.C1056q c1056q, @zy.lvui RecyclerView.qrj.C1056q c1056q2) {
        int i2;
        int i3;
        return (c1056q == null || ((i2 = c1056q.f5738k) == (i3 = c1056q2.f5738k) && c1056q.f52057toq == c1056q2.f52057toq)) ? jk(ftiVar) : fti(ftiVar, i2, c1056q.f52057toq, i3, c1056q2.f52057toq);
    }

    /* JADX INFO: renamed from: l */
    public void m4991l(RecyclerView.fti ftiVar) {
    }

    public void lrht(RecyclerView.fti ftiVar) {
    }

    public final void lvui(RecyclerView.fti ftiVar) {
        m4989c(ftiVar);
    }

    public void n5r1(RecyclerView.fti ftiVar, boolean z2) {
    }

    public void ncyb(RecyclerView.fti ftiVar) {
    }

    public final void oc(RecyclerView.fti ftiVar, boolean z2) {
        n5r1(ftiVar, z2);
        m4852y(ftiVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    /* JADX INFO: renamed from: q */
    public boolean mo4849q(@zy.lvui RecyclerView.fti ftiVar, @zy.lvui RecyclerView.qrj.C1056q c1056q, @zy.lvui RecyclerView.qrj.C1056q c1056q2) {
        int i2 = c1056q.f5738k;
        int i3 = c1056q2.f5738k;
        if (i2 != i3 || c1056q.f52057toq != c1056q2.f52057toq) {
            return fti(ftiVar, i2, c1056q.f52057toq, i3, c1056q2.f52057toq);
        }
        d2ok(ftiVar);
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m4992r(RecyclerView.fti ftiVar) {
        lrht(ftiVar);
        m4852y(ftiVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    public boolean toq(@zy.lvui RecyclerView.fti ftiVar, @zy.lvui RecyclerView.fti ftiVar2, @zy.lvui RecyclerView.qrj.C1056q c1056q, @zy.lvui RecyclerView.qrj.C1056q c1056q2) {
        int i2;
        int i3;
        int i4 = c1056q.f5738k;
        int i5 = c1056q.f52057toq;
        if (ftiVar2.shouldIgnore()) {
            int i6 = c1056q.f5738k;
            i3 = c1056q.f52057toq;
            i2 = i6;
        } else {
            i2 = c1056q2.f5738k;
            i3 = c1056q2.f52057toq;
        }
        return a9(ftiVar, ftiVar2, i4, i5, i2, i3);
    }

    public void uv6(RecyclerView.fti ftiVar) {
    }

    public void vyq(boolean z2) {
        this.f52138x2 = z2;
    }

    public boolean x9kr() {
        return this.f52138x2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.qrj
    public boolean zy(@zy.lvui RecyclerView.fti ftiVar, @zy.lvui RecyclerView.qrj.C1056q c1056q, @zy.dd RecyclerView.qrj.C1056q c1056q2) {
        int i2 = c1056q.f5738k;
        int i3 = c1056q.f52057toq;
        View view = ftiVar.itemView;
        int left = c1056q2 == null ? view.getLeft() : c1056q2.f5738k;
        int top = c1056q2 == null ? view.getTop() : c1056q2.f52057toq;
        if (ftiVar.isRemoved() || (i2 == left && i3 == top)) {
            return jp0y(ftiVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return fti(ftiVar, i2, i3, left, top);
    }
}

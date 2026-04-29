package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.C0683f;
import androidx.transition.jk;

/* JADX INFO: renamed from: androidx.transition.i */
/* JADX INFO: compiled from: GhostViewPort.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
class C1215i extends ViewGroup implements cdj {

    /* JADX INFO: renamed from: g */
    int f6462g;

    /* JADX INFO: renamed from: k */
    ViewGroup f6463k;

    /* JADX INFO: renamed from: n */
    final View f6464n;

    /* JADX INFO: renamed from: q */
    View f6465q;

    /* JADX INFO: renamed from: s */
    private final ViewTreeObserver.OnPreDrawListener f6466s;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private Matrix f6467y;

    /* JADX INFO: renamed from: androidx.transition.i$k */
    /* JADX INFO: compiled from: GhostViewPort.java */
    class k implements ViewTreeObserver.OnPreDrawListener {
        k() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            C0683f.h7am(C1215i.this);
            C1215i c1215i = C1215i.this;
            ViewGroup viewGroup = c1215i.f6463k;
            if (viewGroup == null || (view = c1215i.f6465q) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            C0683f.h7am(C1215i.this.f6463k);
            C1215i c1215i2 = C1215i.this;
            c1215i2.f6463k = null;
            c1215i2.f6465q = null;
            return true;
        }
    }

    C1215i(View view) {
        super(view.getContext());
        this.f6466s = new k();
        this.f6464n = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    static void f7l8(@zy.lvui View view, @zy.dd C1215i c1215i) {
        view.setTag(jk.f7l8.f52618y2, c1215i);
    }

    /* JADX INFO: renamed from: g */
    static void m5357g(View view) {
        C1215i c1215iM5358n = m5358n(view);
        if (c1215iM5358n != null) {
            int i2 = c1215iM5358n.f6462g - 1;
            c1215iM5358n.f6462g = i2;
            if (i2 <= 0) {
                ((ki) c1215iM5358n.getParent()).removeView(c1215iM5358n);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    static C1215i m5358n(View view) {
        return (C1215i) view.getTag(jk.f7l8.f52618y2);
    }

    /* JADX INFO: renamed from: q */
    static void m5359q(View view, View view2) {
        C1231m.f7l8(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    static C1215i toq(View view, ViewGroup viewGroup, Matrix matrix) {
        ki kiVar;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        ki qVar = ki.toq(viewGroup);
        C1215i c1215iM5358n = m5358n(view);
        int i2 = 0;
        if (c1215iM5358n != null && (kiVar = (ki) c1215iM5358n.getParent()) != qVar) {
            i2 = c1215iM5358n.f6462g;
            kiVar.removeView(c1215iM5358n);
            c1215iM5358n = null;
        }
        if (c1215iM5358n == null) {
            if (matrix == null) {
                matrix = new Matrix();
                zy(view, viewGroup, matrix);
            }
            c1215iM5358n = new C1215i(view);
            c1215iM5358n.m5360y(matrix);
            if (qVar == null) {
                qVar = new ki(viewGroup);
            } else {
                qVar.f7l8();
            }
            m5359q(viewGroup, qVar);
            m5359q(viewGroup, c1215iM5358n);
            qVar.m5369k(c1215iM5358n);
            c1215iM5358n.f6462g = i2;
        } else if (matrix != null) {
            c1215iM5358n.m5360y(matrix);
        }
        c1215iM5358n.f6462g++;
        return c1215iM5358n;
    }

    static void zy(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        C1231m.m5391p(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        C1231m.ld6(viewGroup, matrix);
    }

    @Override // androidx.transition.cdj
    /* JADX INFO: renamed from: k */
    public void mo5307k(ViewGroup viewGroup, View view) {
        this.f6463k = viewGroup;
        this.f6465q = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        f7l8(this.f6464n, this);
        this.f6464n.getViewTreeObserver().addOnPreDrawListener(this.f6466s);
        C1231m.m5393s(this.f6464n, 4);
        if (this.f6464n.getParent() != null) {
            ((View) this.f6464n.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f6464n.getViewTreeObserver().removeOnPreDrawListener(this.f6466s);
        C1231m.m5393s(this.f6464n, 0);
        f7l8(this.f6464n, null);
        if (this.f6464n.getParent() != null) {
            ((View) this.f6464n.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        C1204g.m5346k(canvas, true);
        canvas.setMatrix(this.f6467y);
        C1231m.m5393s(this.f6464n, 0);
        this.f6464n.invalidate();
        C1231m.m5393s(this.f6464n, 4);
        drawChild(canvas, this.f6464n, getDrawingTime());
        C1204g.m5346k(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View, androidx.transition.cdj
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (m5358n(this.f6464n) == this) {
            C1231m.m5393s(this.f6464n, i2 == 0 ? 4 : 0);
        }
    }

    /* JADX INFO: renamed from: y */
    void m5360y(@zy.lvui Matrix matrix) {
        this.f6467y = matrix;
    }
}

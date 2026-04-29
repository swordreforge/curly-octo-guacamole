package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.C0339g;
import androidx.constraintlayout.core.widgets.C0340k;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0342p;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* JADX INFO: renamed from: c */
    public static final int f2589c = 1;

    /* JADX INFO: renamed from: e */
    public static final int f2590e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f2591f = 2;

    /* JADX INFO: renamed from: j */
    public static final int f2592j = 5;

    /* JADX INFO: renamed from: l */
    public static final int f2593l = 0;

    /* JADX INFO: renamed from: o */
    public static final int f2594o = 6;

    /* JADX INFO: renamed from: r */
    private C0340k f2595r;

    /* JADX INFO: renamed from: t */
    private int f2596t;

    /* JADX INFO: renamed from: z */
    private int f2597z;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void eqxt(C0341n widget, int type, boolean isRtl) {
        this.f2596t = type;
        if (isRtl) {
            int i2 = this.f2597z;
            if (i2 == 5) {
                this.f2596t = 1;
            } else if (i2 == 6) {
                this.f2596t = 0;
            }
        } else {
            int i3 = this.f2597z;
            if (i3 == 5) {
                this.f2596t = 0;
            } else if (i3 == 6) {
                this.f2596t = 1;
            }
        }
        if (widget instanceof C0340k) {
            ((C0340k) widget).zff0(this.f2596t);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f2595r.yw();
    }

    public int getMargin() {
        return this.f2595r.l05();
    }

    public int getType() {
        return this.f2597z;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void o1t(C0397q.k constraint, C0342p child, ConstraintLayout.toq layoutParams, SparseArray<C0341n> mapIdToWidget) {
        super.o1t(constraint, child, layoutParams, mapIdToWidget);
        if (child instanceof C0340k) {
            C0340k c0340k = (C0340k) child;
            eqxt(c0340k, constraint.f2964n.f49971y9n, ((C0339g) child.m1318f()).xblq());
            c0340k.yp31(constraint.f2964n.f49933ch);
            c0340k.el(constraint.f2964n.f2992b);
        }
    }

    @Deprecated
    public boolean oc() {
        return this.f2595r.yw();
    }

    public void setAllowsGoneWidget(boolean supportGone) {
        this.f2595r.yp31(supportGone);
    }

    public void setDpMargin(int margin) {
        this.f2595r.el((int) ((margin * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int margin) {
        this.f2595r.el(margin);
    }

    public void setType(int type) {
        this.f2597z = type;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: t */
    public void mo1375t(C0341n widget, boolean isRtl) {
        eqxt(widget, this.f2597z, isRtl);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: z */
    protected void mo1374z(AttributeSet attrs) {
        super.mo1374z(attrs);
        this.f2595r = new C0340k();
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.c4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.u3gu) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0394g.qrj.eh) {
                    this.f2595r.yp31(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0394g.qrj.qspg) {
                    this.f2595r.el(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2598g = this.f2595r;
        d3();
    }

    public Barrier(Context context, AttributeSet attrs) {
        super(context, attrs);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        super.setVisibility(8);
    }
}

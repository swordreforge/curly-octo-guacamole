package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: q */
    public static final String f2684q = "Constraints";

    /* JADX INFO: renamed from: k */
    C0397q f2685k;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void zy(AttributeSet attrs) {
        Log.v(f2684q, " ################# init");
    }

    public C0397q getConstraintSet() {
        if (this.f2685k == null) {
            this.f2685k = new C0397q();
        }
        this.f2685k.oc(this);
        return this.f2685k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0392k generateDefaultLayoutParams() {
        return new C0392k(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public C0392k generateLayoutParams(AttributeSet attrs) {
        return new C0392k(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        return new ConstraintLayout.toq(p2);
    }

    public Constraints(Context context, AttributeSet attrs) {
        super(context, attrs);
        zy(attrs);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        zy(attrs);
        super.setVisibility(8);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.Constraints$k */
    public static class C0392k extends ConstraintLayout.toq {

        /* JADX INFO: renamed from: bwp, reason: collision with root package name */
        public float f48568bwp;

        /* JADX INFO: renamed from: bz2, reason: collision with root package name */
        public float f48569bz2;

        /* JADX INFO: renamed from: cfr, reason: collision with root package name */
        public float f48570cfr;

        /* JADX INFO: renamed from: etdu, reason: collision with root package name */
        public float f48571etdu;

        /* JADX INFO: renamed from: gc3c, reason: collision with root package name */
        public float f48572gc3c;

        /* JADX INFO: renamed from: kcsr, reason: collision with root package name */
        public float f48573kcsr;

        /* JADX INFO: renamed from: se, reason: collision with root package name */
        public float f48574se;

        /* JADX INFO: renamed from: sok, reason: collision with root package name */
        public boolean f48575sok;

        /* JADX INFO: renamed from: uj2j, reason: collision with root package name */
        public float f48576uj2j;

        /* JADX INFO: renamed from: w831, reason: collision with root package name */
        public float f48577w831;

        /* JADX INFO: renamed from: yqrt, reason: collision with root package name */
        public float f48578yqrt;

        /* JADX INFO: renamed from: z4, reason: collision with root package name */
        public float f48579z4;

        /* JADX INFO: renamed from: zkd, reason: collision with root package name */
        public float f48580zkd;

        public C0392k(int width, int height) {
            super(width, height);
            this.f48571etdu = 1.0f;
            this.f48575sok = false;
            this.f48570cfr = 0.0f;
            this.f48577w831 = 0.0f;
            this.f48579z4 = 0.0f;
            this.f48578yqrt = 0.0f;
            this.f48573kcsr = 1.0f;
            this.f48568bwp = 1.0f;
            this.f48574se = 0.0f;
            this.f48572gc3c = 0.0f;
            this.f48580zkd = 0.0f;
            this.f48569bz2 = 0.0f;
            this.f48576uj2j = 0.0f;
        }

        public C0392k(C0392k source) {
            super((ConstraintLayout.toq) source);
            this.f48571etdu = 1.0f;
            this.f48575sok = false;
            this.f48570cfr = 0.0f;
            this.f48577w831 = 0.0f;
            this.f48579z4 = 0.0f;
            this.f48578yqrt = 0.0f;
            this.f48573kcsr = 1.0f;
            this.f48568bwp = 1.0f;
            this.f48574se = 0.0f;
            this.f48572gc3c = 0.0f;
            this.f48580zkd = 0.0f;
            this.f48569bz2 = 0.0f;
            this.f48576uj2j = 0.0f;
        }

        public C0392k(Context c2, AttributeSet attrs) {
            super(c2, attrs);
            this.f48571etdu = 1.0f;
            this.f48575sok = false;
            this.f48570cfr = 0.0f;
            this.f48577w831 = 0.0f;
            this.f48579z4 = 0.0f;
            this.f48578yqrt = 0.0f;
            this.f48573kcsr = 1.0f;
            this.f48568bwp = 1.0f;
            this.f48574se = 0.0f;
            this.f48572gc3c = 0.0f;
            this.f48580zkd = 0.0f;
            this.f48569bz2 = 0.0f;
            this.f48576uj2j = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = c2.obtainStyledAttributes(attrs, C0394g.qrj.q4lv);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.hi) {
                    this.f48571etdu = typedArrayObtainStyledAttributes.getFloat(index, this.f48571etdu);
                } else if (index == C0394g.qrj.gjbz) {
                    this.f48570cfr = typedArrayObtainStyledAttributes.getFloat(index, this.f48570cfr);
                    this.f48575sok = true;
                } else if (index == C0394g.qrj.kaf) {
                    this.f48579z4 = typedArrayObtainStyledAttributes.getFloat(index, this.f48579z4);
                } else if (index == C0394g.qrj.mgf) {
                    this.f48578yqrt = typedArrayObtainStyledAttributes.getFloat(index, this.f48578yqrt);
                } else if (index == C0394g.qrj.z75m) {
                    this.f48577w831 = typedArrayObtainStyledAttributes.getFloat(index, this.f48577w831);
                } else if (index == C0394g.qrj.cin) {
                    this.f48573kcsr = typedArrayObtainStyledAttributes.getFloat(index, this.f48573kcsr);
                } else if (index == C0394g.qrj.as) {
                    this.f48568bwp = typedArrayObtainStyledAttributes.getFloat(index, this.f48568bwp);
                } else if (index == C0394g.qrj.wu7) {
                    this.f48574se = typedArrayObtainStyledAttributes.getFloat(index, this.f48574se);
                } else if (index == C0394g.qrj.pd) {
                    this.f48572gc3c = typedArrayObtainStyledAttributes.getFloat(index, this.f48572gc3c);
                } else if (index == C0394g.qrj.z3jl) {
                    this.f48580zkd = typedArrayObtainStyledAttributes.getFloat(index, this.f48580zkd);
                } else if (index == C0394g.qrj.p2) {
                    this.f48569bz2 = typedArrayObtainStyledAttributes.getFloat(index, this.f48569bz2);
                } else if (index == C0394g.qrj.cw) {
                    this.f48576uj2j = typedArrayObtainStyledAttributes.getFloat(index, this.f48576uj2j);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}

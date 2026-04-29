package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0342p;
import androidx.constraintlayout.core.widgets.f7l8;
import androidx.constraintlayout.core.widgets.n7h;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* JADX INFO: renamed from: a */
    public static final int f2124a = 2;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f47999ab = 3;

    /* JADX INFO: renamed from: b */
    public static final int f2125b = 1;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f48000bo = 2;

    /* JADX INFO: renamed from: c */
    public static final int f2126c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f2127d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f2128e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f2129f = 0;

    /* JADX INFO: renamed from: j */
    public static final int f2130j = 1;

    /* JADX INFO: renamed from: l */
    private static final String f2131l = "Flow";

    /* JADX INFO: renamed from: m */
    public static final int f2132m = 0;

    /* JADX INFO: renamed from: o */
    public static final int f2133o = 2;

    /* JADX INFO: renamed from: u */
    public static final int f2134u = 1;

    /* JADX INFO: renamed from: v */
    public static final int f2135v = 0;

    /* JADX INFO: renamed from: w */
    public static final int f2136w = 2;

    /* JADX INFO: renamed from: x */
    public static final int f2137x = 0;

    /* JADX INFO: renamed from: r */
    private f7l8 f2138r;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void o1t(C0397q.k constraint, C0342p child, ConstraintLayout.toq layoutParams, SparseArray<C0341n> mapIdToWidget) {
        super.o1t(constraint, child, layoutParams, mapIdToWidget);
        if (child instanceof f7l8) {
            f7l8 f7l8Var = (f7l8) child;
            int i2 = layoutParams.f2639e;
            if (i2 != -1) {
                f7l8Var.anhx(i2);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void oc(n7h layout, int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (layout == null) {
            setMeasuredDimension(0, 0);
        } else {
            layout.el(mode, size, mode2, size2);
            setMeasuredDimension(layout.l05(), layout.rp());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        oc(this.f2138r, widthMeasureSpec, heightMeasureSpec);
    }

    public void setFirstHorizontalBias(float bias) {
        this.f2138r.m8(bias);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int style) {
        this.f2138r.ula6(style);
        requestLayout();
    }

    public void setFirstVerticalBias(float bias) {
        this.f2138r.wwp(bias);
        requestLayout();
    }

    public void setFirstVerticalStyle(int style) {
        this.f2138r.zuf(style);
        requestLayout();
    }

    public void setHorizontalAlign(int align) {
        this.f2138r.sc(align);
        requestLayout();
    }

    public void setHorizontalBias(float bias) {
        this.f2138r.b7(bias);
        requestLayout();
    }

    public void setHorizontalGap(int gap) {
        this.f2138r.kl7m(gap);
        requestLayout();
    }

    public void setHorizontalStyle(int style) {
        this.f2138r.oph(style);
        requestLayout();
    }

    public void setLastHorizontalBias(float bias) {
        this.f2138r.le7(bias);
        requestLayout();
    }

    public void setLastHorizontalStyle(int style) {
        this.f2138r.mub(style);
        requestLayout();
    }

    public void setLastVerticalBias(float bias) {
        this.f2138r.f7z0(bias);
        requestLayout();
    }

    public void setLastVerticalStyle(int style) {
        this.f2138r.fh(style);
        requestLayout();
    }

    public void setMaxElementsWrap(int max) {
        this.f2138r.kq(max);
        requestLayout();
    }

    public void setOrientation(int orientation) {
        this.f2138r.anhx(orientation);
        requestLayout();
    }

    public void setPadding(int padding) {
        this.f2138r.tww7(padding);
        requestLayout();
    }

    public void setPaddingBottom(int paddingBottom) {
        this.f2138r.ob(paddingBottom);
        requestLayout();
    }

    public void setPaddingLeft(int paddingLeft) {
        this.f2138r.gb(paddingLeft);
        requestLayout();
    }

    public void setPaddingRight(int paddingRight) {
        this.f2138r.btvn(paddingRight);
        requestLayout();
    }

    public void setPaddingTop(int paddingTop) {
        this.f2138r.xm(paddingTop);
        requestLayout();
    }

    public void setVerticalAlign(int align) {
        this.f2138r.j3y2(align);
        requestLayout();
    }

    public void setVerticalBias(float bias) {
        this.f2138r.ge(bias);
        requestLayout();
    }

    public void setVerticalGap(int gap) {
        this.f2138r.z5(gap);
        requestLayout();
    }

    public void setVerticalStyle(int style) {
        this.f2138r.b2(style);
        requestLayout();
    }

    public void setWrapMode(int mode) {
        this.f2138r.x7o(mode);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: t */
    public void mo1375t(C0341n widget, boolean isRtl) {
        this.f2138r.ec(isRtl);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: z */
    protected void mo1374z(AttributeSet attrs) {
        super.mo1374z(attrs);
        this.f2138r = new f7l8();
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.c4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.mn) {
                    this.f2138r.anhx(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0394g.qrj.p1t5) {
                    this.f2138r.tww7(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0394g.qrj.mv) {
                    this.f2138r.kq2f(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0394g.qrj.zc) {
                    this.f2138r.kbj(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0394g.qrj.t57j) {
                    this.f2138r.gb(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0394g.qrj.cun) {
                    this.f2138r.xm(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0394g.qrj.lz) {
                    this.f2138r.btvn(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0394g.qrj.wutb) {
                    this.f2138r.ob(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0394g.qrj.ph5d) {
                    this.f2138r.x7o(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0394g.qrj.iqz) {
                    this.f2138r.oph(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0394g.qrj.p2sg) {
                    this.f2138r.b2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0394g.qrj.unv) {
                    this.f2138r.ula6(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0394g.qrj.nr0) {
                    this.f2138r.mub(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0394g.qrj.z0) {
                    this.f2138r.zuf(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0394g.qrj.ih) {
                    this.f2138r.fh(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C0394g.qrj.bru) {
                    this.f2138r.b7(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0394g.qrj.nrys) {
                    this.f2138r.m8(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0394g.qrj.mho) {
                    this.f2138r.le7(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0394g.qrj.da) {
                    this.f2138r.wwp(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0394g.qrj.huy) {
                    this.f2138r.f7z0(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0394g.qrj.pgi) {
                    this.f2138r.ge(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C0394g.qrj.qu9) {
                    this.f2138r.sc(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == C0394g.qrj.y76) {
                    this.f2138r.j3y2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == C0394g.qrj.h39) {
                    this.f2138r.kl7m(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0394g.qrj.i03a) {
                    this.f2138r.z5(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C0394g.qrj.fl) {
                    this.f2138r.kq(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2598g = this.f2138r;
        d3();
    }

    public Flow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Flow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}

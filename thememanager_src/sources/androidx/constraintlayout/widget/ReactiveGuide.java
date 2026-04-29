package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f7l8;

/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements f7l8.InterfaceC0393k {

    /* JADX INFO: renamed from: g */
    private boolean f2690g;

    /* JADX INFO: renamed from: k */
    private int f2691k;

    /* JADX INFO: renamed from: n */
    private int f2692n;

    /* JADX INFO: renamed from: q */
    private boolean f2693q;

    public ReactiveGuide(Context context) {
        super(context);
        this.f2691k = -1;
        this.f2693q = false;
        this.f2692n = 0;
        this.f2690g = true;
        super.setVisibility(8);
        zy(null);
    }

    private void toq(int newValue, int id, MotionLayout motionLayout, int currentState) {
        C0397q c0397qV0af = motionLayout.v0af(currentState);
        c0397qV0af.se(id, newValue);
        motionLayout.n2t(currentState, c0397qV0af);
    }

    private void zy(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.hk2l);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.kcdz) {
                    this.f2691k = typedArrayObtainStyledAttributes.getResourceId(index, this.f2691k);
                } else if (index == C0394g.qrj.qg) {
                    this.f2693q = typedArrayObtainStyledAttributes.getBoolean(index, this.f2693q);
                } else if (index == C0394g.qrj.cud) {
                    this.f2692n = typedArrayObtainStyledAttributes.getResourceId(index, this.f2692n);
                } else if (index == C0394g.qrj.bogl) {
                    this.f2690g = typedArrayObtainStyledAttributes.getBoolean(index, this.f2690g);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f2691k != -1) {
            ConstraintLayout.getSharedValues().m1632k(this.f2691k, this);
        }
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f2692n;
    }

    public int getAttributeId() {
        return this.f2691k;
    }

    @Override // androidx.constraintlayout.widget.f7l8.InterfaceC0393k
    /* JADX INFO: renamed from: k */
    public void mo1565k(int key, int newValue, int oldValue) {
        setGuidelineBegin(newValue);
        int id = getId();
        if (id > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i2 = this.f2692n;
            if (i2 != 0) {
                currentState = i2;
            }
            int i3 = 0;
            if (!this.f2693q) {
                if (!this.f2690g) {
                    toq(newValue, id, motionLayout, currentState);
                    return;
                }
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                while (i3 < constraintSetIds.length) {
                    toq(newValue, id, motionLayout, constraintSetIds[i3]);
                    i3++;
                }
                return;
            }
            if (this.f2690g) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i3 < constraintSetIds2.length) {
                    int i4 = constraintSetIds2[i3];
                    if (i4 != currentState) {
                        toq(newValue, id, motionLayout, i4);
                    }
                    i3++;
                }
            }
            C0397q c0397qFnq8 = motionLayout.fnq8(currentState);
            c0397qFnq8.se(id, newValue);
            motionLayout.pjz9(currentState, c0397qFnq8, 1000);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    /* JADX INFO: renamed from: q */
    public boolean m1630q() {
        return this.f2693q;
    }

    public void setAnimateChange(boolean animate) {
        this.f2693q = animate;
    }

    public void setApplyToConstraintSetId(int id) {
        this.f2692n = id;
    }

    public void setAttributeId(int id) {
        f7l8 sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f2691k;
        if (i2 != -1) {
            sharedValues.m1633n(i2, this);
        }
        this.f2691k = id;
        if (id != -1) {
            sharedValues.m1632k(id, this);
        }
    }

    public void setGuidelineBegin(int margin) {
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) getLayoutParams();
        toqVar.f2645k = margin;
        setLayoutParams(toqVar);
    }

    public void setGuidelineEnd(int margin) {
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) getLayoutParams();
        toqVar.f48512toq = margin;
        setLayoutParams(toqVar);
    }

    public void setGuidelinePercent(float ratio) {
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) getLayoutParams();
        toqVar.f48523zy = ratio;
        setLayoutParams(toqVar);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public ReactiveGuide(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2691k = -1;
        this.f2693q = false;
        this.f2692n = 0;
        this.f2690g = true;
        super.setVisibility(8);
        zy(attrs);
    }

    public ReactiveGuide(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2691k = -1;
        this.f2693q = false;
        this.f2692n = 0;
        this.f2690g = true;
        super.setVisibility(8);
        zy(attrs);
    }

    public ReactiveGuide(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.f2691k = -1;
        this.f2693q = false;
        this.f2692n = 0;
        this.f2690g = true;
        super.setVisibility(8);
        zy(attrs);
    }
}

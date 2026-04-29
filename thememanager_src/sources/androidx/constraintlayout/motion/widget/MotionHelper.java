package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements InterfaceC0369h {

    /* JADX INFO: renamed from: l */
    protected View[] f2187l;

    /* JADX INFO: renamed from: r */
    private float f2188r;

    /* JADX INFO: renamed from: t */
    private boolean f2189t;

    /* JADX INFO: renamed from: z */
    private boolean f2190z;

    public MotionHelper(Context context) {
        super(context);
        this.f2190z = false;
        this.f2189t = false;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.x2
    public void f7l8(MotionLayout motionLayout, int startId, int endId) {
    }

    /* JADX INFO: renamed from: g */
    public void mo1367g(MotionLayout motionLayout, int currentId) {
    }

    @Override // androidx.constraintlayout.motion.widget.InterfaceC0371k
    public float getProgress() {
        return this.f2188r;
    }

    /* JADX INFO: renamed from: k */
    public void mo1368k(MotionLayout motionLayout, int startId, int endId, float progress) {
    }

    public boolean ld6() {
        return false;
    }

    @Override // androidx.constraintlayout.motion.widget.InterfaceC0369h
    /* JADX INFO: renamed from: n */
    public void mo1385n(Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.InterfaceC0369h
    /* JADX INFO: renamed from: p */
    public boolean mo1386p() {
        return this.f2189t;
    }

    @Override // androidx.constraintlayout.motion.widget.InterfaceC0369h
    /* JADX INFO: renamed from: q */
    public void mo1387q(Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.InterfaceC0369h
    /* JADX INFO: renamed from: s */
    public boolean mo1388s() {
        return this.f2190z;
    }

    @Override // androidx.constraintlayout.motion.widget.InterfaceC0371k
    public void setProgress(float progress) {
        this.f2188r = progress;
        int i2 = 0;
        if (this.f2604q > 0) {
            this.f2187l = ni7((ConstraintLayout) getParent());
            while (i2 < this.f2604q) {
                setProgress(this.f2187l[i2], progress);
                i2++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i2 < childCount) {
            View childAt = viewGroup.getChildAt(i2);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, progress);
            }
            i2++;
        }
    }

    public void setProgress(View view, float progress) {
    }

    @Override // androidx.constraintlayout.motion.widget.InterfaceC0369h
    public void toq(MotionLayout motionLayout) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.x2
    /* JADX INFO: renamed from: y */
    public void mo1389y(MotionLayout motionLayout, int triggerId, boolean positive, float progress) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: z */
    protected void mo1374z(AttributeSet attrs) {
        super.mo1374z(attrs);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.q5x);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.y6) {
                    this.f2190z = typedArrayObtainStyledAttributes.getBoolean(index, this.f2190z);
                } else if (index == C0394g.qrj.ta3f) {
                    this.f2189t = typedArrayObtainStyledAttributes.getBoolean(index, this.f2189t);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void zy(MotionLayout motionLayout, HashMap<View, kja0> controllerMap) {
    }

    public MotionHelper(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2190z = false;
        this.f2189t = false;
        mo1374z(attrs);
    }

    public MotionHelper(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2190z = false;
        this.f2189t = false;
        mo1374z(attrs);
    }
}

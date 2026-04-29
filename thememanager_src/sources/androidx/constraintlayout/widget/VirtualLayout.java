package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.n7h;
import androidx.constraintlayout.widget.C0394g;

/* JADX INFO: loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* JADX INFO: renamed from: t */
    private boolean f2694t;

    /* JADX INFO: renamed from: z */
    private boolean f2695z;

    public VirtualLayout(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void ki(ConstraintLayout container) {
        cdj(container);
    }

    public void oc(n7h layout, int widthMeasureSpec, int heightMeasureSpec) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2695z || this.f2694t) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i2 = 0; i2 < this.f2604q; i2++) {
                    View viewDd = constraintLayout.dd(this.f2601k[i2]);
                    if (viewDd != null) {
                        if (this.f2695z) {
                            viewDd.setVisibility(visibility);
                        }
                        if (this.f2694t && elevation > 0.0f) {
                            viewDd.setTranslationZ(viewDd.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        m1619h();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        m1619h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: z */
    protected void mo1374z(AttributeSet attrs) {
        super.mo1374z(attrs);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.c4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.bbg) {
                    this.f2695z = true;
                } else if (index == C0394g.qrj.ngvg) {
                    this.f2694t = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public VirtualLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VirtualLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}

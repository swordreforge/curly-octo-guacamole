package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: k */
    private boolean f2686k;

    public Guideline(Context context) {
        super(context);
        this.f2686k = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean filter) {
        this.f2686k = filter;
    }

    public void setGuidelineBegin(int margin) {
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) getLayoutParams();
        if (this.f2686k && toqVar.f2645k == margin) {
            return;
        }
        toqVar.f2645k = margin;
        setLayoutParams(toqVar);
    }

    public void setGuidelineEnd(int margin) {
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) getLayoutParams();
        if (this.f2686k && toqVar.f48512toq == margin) {
            return;
        }
        toqVar.f48512toq = margin;
        setLayoutParams(toqVar);
    }

    public void setGuidelinePercent(float ratio) {
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) getLayoutParams();
        if (this.f2686k && toqVar.f48523zy == ratio) {
            return;
        }
        toqVar.f48523zy = ratio;
        setLayoutParams(toqVar);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public Guideline(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2686k = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2686k = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.f2686k = true;
        super.setVisibility(8);
    }
}

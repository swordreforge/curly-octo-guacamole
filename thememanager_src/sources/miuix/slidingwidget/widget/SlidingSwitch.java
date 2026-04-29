package miuix.slidingwidget.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.CompoundButton;
import android.widget.Switch;
import i1an.toq;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class SlidingSwitch extends Switch {

    /* JADX INFO: renamed from: k */
    private toq f41619k;

    public SlidingSwitch(Context context) {
        this(context, null);
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        toq toqVar = this.f41619k;
        if (toqVar != null) {
            toqVar.n5r1();
        }
    }

    @Override // android.view.View
    public float getAlpha() {
        toq toqVar = this.f41619k;
        return toqVar != null ? toqVar.kja0() : super.getAlpha();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        toq toqVar = this.f41619k;
        if (toqVar != null) {
            toqVar.m26574z();
        }
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        toq toqVar = this.f41619k;
        if (toqVar == null) {
            super.onDraw(canvas);
        } else {
            toqVar.mcp(canvas);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        toq toqVar = this.f41619k;
        if (toqVar != null) {
            toqVar.a9(motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.Switch, android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(this.f41619k.cdj(), this.f41619k.m26569h());
        this.f41619k.m26571l();
    }

    @Override // android.view.View
    protected boolean onSetAlpha(int i2) {
        return true;
    }

    @Override // android.widget.Switch, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        toq toqVar = this.f41619k;
        if (toqVar == null) {
            return true;
        }
        toqVar.jp0y(motionEvent);
        return true;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        super.performClick();
        toq toqVar = this.f41619k;
        if (toqVar == null) {
            return true;
        }
        toqVar.m26573t();
        return true;
    }

    @Override // android.view.View
    public void setAlpha(float f2) {
        super.setAlpha(f2);
        toq toqVar = this.f41619k;
        if (toqVar != null) {
            toqVar.lvui(f2);
        }
        invalidate();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        if (isChecked() != z2) {
            super.setChecked(z2);
            boolean zIsChecked = isChecked();
            toq toqVar = this.f41619k;
            if (toqVar != null) {
                toqVar.m26572r(zIsChecked);
            }
        }
    }

    @Override // android.view.View
    public void setLayerType(int i2, @dd Paint paint) {
        super.setLayerType(i2, paint);
        toq toqVar = this.f41619k;
        if (toqVar != null) {
            toqVar.x9kr(i2);
        }
    }

    public void setOnPerformCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        toq toqVar = this.f41619k;
        if (toqVar != null) {
            toqVar.ncyb(onCheckedChangeListener);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        super.setPressed(z2);
        invalidate();
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        toq toqVar;
        return super.verifyDrawable(drawable) || ((toqVar = this.f41619k) != null && toqVar.lrht(drawable));
    }

    public SlidingSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, toq.zy.erbd);
    }

    public SlidingSwitch(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        toq toqVar = new toq(this);
        this.f41619k = toqVar;
        toqVar.zurt();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.n7h.xdxk, i2, toq.qrj.k2b8);
        this.f41619k.fu4(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}

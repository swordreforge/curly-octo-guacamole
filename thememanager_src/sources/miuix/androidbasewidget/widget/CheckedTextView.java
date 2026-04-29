package miuix.androidbasewidget.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import kbj.toq;

/* JADX INFO: loaded from: classes3.dex */
public class CheckedTextView extends AppCompatCheckedTextView {

    /* JADX INFO: renamed from: t */
    private static final int f38617t = 0;

    /* JADX INFO: renamed from: z */
    private static final int[] f38618z = {R.attr.state_checked};

    /* JADX INFO: renamed from: h */
    private boolean f38619h;

    /* JADX INFO: renamed from: i */
    private int f38620i;

    /* JADX INFO: renamed from: p */
    private boolean f38621p;

    /* JADX INFO: renamed from: s */
    private Drawable f38622s;

    public CheckedTextView(Context context) {
        this(context, null);
    }

    private int getCheckWidth() {
        Drawable checkMarkDrawable = getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return 0;
        }
        return checkMarkDrawable.getCurrent().getIntrinsicWidth();
    }

    /* JADX INFO: renamed from: q */
    public static int m24774q(int i2, int i3, int i4, int i5) {
        return ((((i2 - i4) - i5) - i3) / 2) + i4;
    }

    private void zy(Canvas canvas, boolean z2) {
        int width;
        int scrollX;
        Drawable checkMarkDrawable = getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            int intrinsicWidth = checkMarkDrawable.getCurrent().getIntrinsicWidth();
            if (z2) {
                width = getPaddingLeft();
                scrollX = getScrollX();
            } else {
                width = (getWidth() - getPaddingRight()) - intrinsicWidth;
                scrollX = getScrollX();
            }
            int i2 = width + scrollX;
            int paddingTop = getPaddingTop();
            int paddingTop2 = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int intrinsicHeight = checkMarkDrawable.getIntrinsicHeight();
            if (checkMarkDrawable.getCurrent() instanceof NinePatchDrawable) {
                intrinsicHeight = (getHeight() - paddingTop) - getPaddingBottom();
            } else {
                int gravity = getGravity() & 112;
                if (gravity == 16) {
                    paddingTop = m24774q(getHeight(), intrinsicHeight, paddingTop2, paddingBottom);
                } else if (gravity == 80) {
                    paddingTop = getHeight() - intrinsicHeight;
                }
            }
            checkMarkDrawable.setBounds(i2, paddingTop, intrinsicWidth + i2, intrinsicHeight + paddingTop);
            checkMarkDrawable.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckedTextView, android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f38622s != null) {
            this.f38622s.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.widget.CheckedTextView
    public Drawable getCheckMarkDrawable() {
        return this.f38622s;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f38622s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f38620i = (int) getContext().getResources().getDimension(toq.C6108g.f80722v0af);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f38618z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        boolean z2 = getLayoutDirection() == 1;
        if (this.f38621p) {
            zy(canvas, z2);
        }
        if (getCheckMarkDrawable() != null) {
            this.f38619h = getCheckMarkDrawable().getClass().isAssignableFrom(StateListDrawable.class);
        } else {
            this.f38619h = false;
        }
        if (z2 && this.f38621p && this.f38619h) {
            canvas.save();
            canvas.translate(getCheckWidth(), 0.0f);
        }
        super.onDraw(canvas);
        if (z2 && this.f38621p && this.f38619h) {
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int checkWidth = getCheckWidth();
        if (checkWidth > 0) {
            if (TextUtils.isEmpty(getText())) {
                this.f38621p = true;
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(checkWidth, View.MeasureSpec.getMode(i2)), i3);
                setMeasuredDimension(checkWidth, getMeasuredHeight());
                return;
            } else if (size - getPaddingEnd() < checkWidth * 2) {
                this.f38621p = false;
                checkWidth = 0;
            } else {
                this.f38621p = true;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size - checkWidth, View.MeasureSpec.getMode(i2)), i3);
        if (checkWidth == 0) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + checkWidth, getMeasuredHeight());
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        requestLayout();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckedTextView, android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        Drawable drawable2 = this.f38622s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f38622s);
        }
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setVisible(getVisibility() == 0, false);
            drawable.setState(f38618z);
            setMinHeight(drawable.getIntrinsicHeight());
            drawable.setState(getDrawableState());
        }
        this.f38622s = drawable;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f38622s;
    }

    public CheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public CheckedTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f38621p = true;
        this.f38619h = false;
        this.f38620i = (int) getContext().getResources().getDimension(toq.C6108g.f80722v0af);
    }
}

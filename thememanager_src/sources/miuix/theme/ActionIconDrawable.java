package miuix.theme;

import android.R;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import miuix.theme.toq;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class ActionIconDrawable extends VectorDrawable {
    private static final int[] STATE_DISABLED = {-16842910};
    private static final int[] STATE_PRESSED = {R.attr.state_enabled, R.attr.state_pressed};
    private int mActionIconHeight;
    private int mActionIconWidth;
    private float mNormalAlpha = 0.8f;
    private float mPressedAlpha = 0.5f;
    private float mDisabledAlpha = 0.3f;

    private void init(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, toq.C7374n.f42192k, 0, 0) : resources.obtainAttributes(attributeSet, toq.C7374n.f42192k);
        this.mNormalAlpha = typedArrayObtainStyledAttributes.getFloat(toq.C7374n.f42194q, 0.0f);
        this.mPressedAlpha = typedArrayObtainStyledAttributes.getFloat(toq.C7374n.f42193n, 0.0f);
        this.mDisabledAlpha = typedArrayObtainStyledAttributes.getFloat(toq.C7374n.f92018toq, 0.0f);
        this.mActionIconWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.C7374n.f42191g, 0);
        this.mActionIconHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.C7374n.f92019zy, 0);
        typedArrayObtainStyledAttributes.recycle();
        setAlphaF(this.mNormalAlpha);
    }

    private void setAlphaF(float f2) {
        setAlpha((int) (f2 * 255.0f));
    }

    private boolean toDisabledState() {
        setAlphaF(this.mDisabledAlpha);
        return true;
    }

    private boolean toNormalState() {
        setAlphaF(this.mNormalAlpha);
        return true;
    }

    private boolean toPressedState() {
        setAlphaF(this.mPressedAlpha);
        return true;
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.mActionIconWidth != 0 && this.mActionIconHeight != 0) {
            canvas.translate((r0 - super.getIntrinsicWidth()) >> 1, (this.mActionIconHeight - super.getIntrinsicHeight()) >> 1);
            canvas.scale(super.getIntrinsicWidth() / this.mActionIconWidth, super.getIntrinsicHeight() / this.mActionIconHeight, 0.5f, 0.5f);
        }
        super.draw(canvas);
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return null;
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i2 = this.mActionIconHeight;
        return i2 == 0 ? super.getIntrinsicHeight() : i2;
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i2 = this.mActionIconWidth;
        return i2 == 0 ? super.getIntrinsicWidth() : i2;
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        init(resources, attributeSet, theme);
        super.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.VectorDrawable, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        super.onStateChange(iArr);
        return StateSet.stateSetMatches(STATE_DISABLED, iArr) ? toDisabledState() : StateSet.stateSetMatches(STATE_PRESSED, iArr) ? toPressedState() : toNormalState();
    }
}

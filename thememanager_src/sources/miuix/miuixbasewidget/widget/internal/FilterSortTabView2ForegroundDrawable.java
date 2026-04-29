package miuix.miuixbasewidget.widget.internal;

import android.R;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.view.View;
import java.io.IOException;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.utils.EaseManager;
import miuix.device.C7106k;
import miuix.reflect.C7320k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vwb.toq;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class FilterSortTabView2ForegroundDrawable extends Drawable {
    private static final AnimConfig ACTIVATE_ENTER_CONFIG;
    private static final AnimConfig ACTIVATE_EXIT_CONFIG;
    private static final String ALPHA_F = "alphaF";
    private static final AnimConfig HOVER_ENTER_CONFIG;
    private static final AnimConfig HOVER_EXIT_CONFIG;
    private static final AnimConfig PRESS_ENTER_CONFIG;
    private static final AnimConfig PRESS_EXIT_CONFIG;
    private static final String TAG = "StateTransitionDrawable";
    private static final boolean USE_FOLME;
    private static final boolean USE_SMOOTH_ROUND_RECT;
    private static Boolean mIsCommonLiteStrategy;
    private boolean mActivated;
    private float mActivatedAlpha;
    private AnimState mActivatedState;
    private boolean mHovered;
    private float mHoveredActivatedAlpha;
    private AnimState mHoveredActivatedState;
    private float mHoveredAlpha;
    private AnimState mHoveredState;
    private float mNormalAlpha;
    private AnimState mNormalState;
    private boolean mPressed;
    private float mPressedAlpha;
    private AnimState mPressedState;
    private int mRadius;
    private IStateStyle mStyle;
    private static final int[] STATE_PRESSED = {R.attr.state_pressed};
    private static final int[] STATE_DRAG_HOVERED = {R.attr.state_drag_hovered};
    private static final int[] STATE_HOVERED_ACTIVATED = {R.attr.state_hovered, R.attr.state_activated};
    private static final int[] STATE_HOVERED = {R.attr.state_hovered};
    private static final int[] STATE_ACTIVATED = {R.attr.state_activated};
    private final RectF mRect = new RectF();
    private final Path mPath = new Path();
    private final Paint mPaint = new Paint();

    static {
        boolean z2 = !isCommonLiteStrategy();
        USE_FOLME = z2;
        USE_SMOOTH_ROUND_RECT = true ^ isCommonLiteStrategy();
        if (!z2) {
            HOVER_ENTER_CONFIG = null;
            HOVER_EXIT_CONFIG = null;
            PRESS_ENTER_CONFIG = null;
            PRESS_EXIT_CONFIG = null;
            ACTIVATE_ENTER_CONFIG = null;
            ACTIVATE_EXIT_CONFIG = null;
            return;
        }
        HOVER_ENTER_CONFIG = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.6f));
        HOVER_EXIT_CONFIG = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.9f, 0.2f));
        AnimConfig ease = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.25f));
        PRESS_ENTER_CONFIG = ease;
        AnimConfig ease2 = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.35f));
        PRESS_EXIT_CONFIG = ease2;
        ACTIVATE_ENTER_CONFIG = ease;
        ACTIVATE_EXIT_CONFIG = ease2;
    }

    public FilterSortTabView2ForegroundDrawable() {
    }

    private void calculatePath() {
        this.mPath.reset();
        Path path = this.mPath;
        RectF rectF = this.mRect;
        int i2 = this.mRadius;
        path.addRoundRect(rectF, i2, i2, Path.Direction.CW);
    }

    private void init(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, toq.kja0.egc1, 0, 0) : resources.obtainAttributes(attributeSet, toq.kja0.egc1);
        int color = typedArrayObtainStyledAttributes.getColor(toq.kja0.j0, -16777216);
        this.mRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.kja0.x76, 0);
        this.mNormalAlpha = typedArrayObtainStyledAttributes.getFloat(toq.kja0.ooq6, 0.0f);
        this.mPressedAlpha = typedArrayObtainStyledAttributes.getFloat(toq.kja0.ul9p, 0.0f);
        this.mHoveredAlpha = typedArrayObtainStyledAttributes.getFloat(toq.kja0.srp, 0.0f);
        this.mActivatedAlpha = typedArrayObtainStyledAttributes.getFloat(toq.kja0.vog, 0.0f);
        this.mHoveredActivatedAlpha = typedArrayObtainStyledAttributes.getFloat(toq.kja0.hn4z, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.mPaint.setColor(color);
        if (USE_FOLME) {
            this.mNormalState = new AnimState().add(ALPHA_F, this.mNormalAlpha);
            this.mPressedState = new AnimState().add(ALPHA_F, this.mPressedAlpha);
            this.mHoveredState = new AnimState().add(ALPHA_F, this.mHoveredAlpha);
            this.mActivatedState = new AnimState().add(ALPHA_F, this.mActivatedAlpha);
            this.mHoveredActivatedState = new AnimState().add(ALPHA_F, this.mHoveredActivatedAlpha);
            IStateStyle iStateStyleUseValue = Folme.useValue(this);
            this.mStyle = iStateStyleUseValue;
            iStateStyleUseValue.setTo(this.mNormalState);
        } else {
            setAlphaF(this.mNormalAlpha);
        }
        if (USE_SMOOTH_ROUND_RECT) {
            setSmoothCornerEnable(true);
        }
    }

    private static boolean isCommonLiteStrategy() {
        if (mIsCommonLiteStrategy == null) {
            mIsCommonLiteStrategy = Boolean.valueOf(C7106k.d2ok() || C7106k.d3() || C7106k.lvui());
        }
        return mIsCommonLiteStrategy.booleanValue();
    }

    @SuppressLint({"LongLogTag"})
    private void setSmoothCornerEnable(boolean z2) {
        try {
            C7320k.m26526h(Drawable.class, this, "setSmoothCornerEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z2));
        } catch (Exception e2) {
            Log.e(TAG, "setSmoothCornerEnabled failed:" + e2.getMessage());
        }
    }

    private boolean toActivatedState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = false;
            this.mActivated = true;
            if (USE_FOLME) {
                this.mStyle.to(this.mActivatedState, PRESS_EXIT_CONFIG);
            } else {
                setAlphaF(this.mActivatedAlpha);
            }
            return true;
        }
        if (this.mHovered) {
            this.mHovered = false;
            this.mActivated = true;
            if (USE_FOLME) {
                this.mStyle.to(this.mActivatedState, HOVER_EXIT_CONFIG);
            } else {
                setAlphaF(this.mActivatedAlpha);
            }
            return true;
        }
        if (this.mActivated) {
            return false;
        }
        this.mActivated = true;
        if (USE_FOLME) {
            this.mStyle.to(this.mActivatedState, ACTIVATE_ENTER_CONFIG);
        } else {
            setAlphaF(this.mActivatedAlpha);
        }
        return true;
    }

    private boolean toHoveredActivatedState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = true;
            this.mActivated = true;
            if (USE_FOLME) {
                this.mStyle.to(this.mHoveredActivatedState, PRESS_EXIT_CONFIG);
            } else {
                setAlphaF(this.mHoveredActivatedAlpha);
            }
            return true;
        }
        boolean z2 = this.mHovered;
        if (z2 && this.mActivated) {
            return false;
        }
        if (z2) {
            this.mActivated = true;
            if (USE_FOLME) {
                this.mStyle.to(this.mHoveredActivatedState, ACTIVATE_ENTER_CONFIG);
            } else {
                setAlphaF(this.mHoveredActivatedAlpha);
            }
            return true;
        }
        if (this.mActivated) {
            this.mHovered = true;
            if (USE_FOLME) {
                this.mStyle.to(this.mHoveredActivatedState, HOVER_ENTER_CONFIG);
            } else {
                setAlphaF(this.mHoveredActivatedAlpha);
            }
            return true;
        }
        this.mActivated = true;
        this.mHovered = true;
        if (USE_FOLME) {
            this.mStyle.to(this.mHoveredActivatedState, HOVER_ENTER_CONFIG);
        } else {
            setAlphaF(this.mHoveredActivatedAlpha);
        }
        return true;
    }

    private boolean toHoveredState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = true;
            this.mActivated = false;
            if (USE_FOLME) {
                this.mStyle.to(this.mHoveredState, PRESS_EXIT_CONFIG);
            } else {
                setAlphaF(this.mHoveredAlpha);
            }
            return true;
        }
        if (this.mHovered) {
            if (!this.mActivated) {
                return false;
            }
            if (USE_FOLME) {
                this.mStyle.to(this.mHoveredState, HOVER_EXIT_CONFIG);
            } else {
                setAlphaF(this.mHoveredAlpha);
            }
            return true;
        }
        this.mHovered = true;
        this.mActivated = false;
        if (USE_FOLME) {
            this.mStyle.to(this.mHoveredState, HOVER_ENTER_CONFIG);
        } else {
            setAlphaF(this.mHoveredAlpha);
        }
        return true;
    }

    private boolean toNormalState() {
        if (this.mPressed) {
            this.mPressed = false;
            this.mHovered = false;
            this.mActivated = false;
            if (USE_FOLME) {
                this.mStyle.to(this.mNormalState, PRESS_EXIT_CONFIG);
            } else {
                setAlphaF(this.mNormalAlpha);
            }
            return true;
        }
        if (this.mHovered) {
            this.mHovered = false;
            this.mActivated = false;
            if (USE_FOLME) {
                this.mStyle.to(this.mNormalState, HOVER_EXIT_CONFIG);
            } else {
                setAlphaF(this.mNormalAlpha);
            }
            return true;
        }
        if (!this.mActivated) {
            return false;
        }
        this.mActivated = false;
        if (USE_FOLME) {
            this.mStyle.to(this.mNormalState, ACTIVATE_EXIT_CONFIG);
        } else {
            setAlphaF(this.mNormalAlpha);
        }
        return true;
    }

    private boolean toPressedState() {
        if (this.mPressed) {
            return false;
        }
        if (USE_FOLME) {
            this.mStyle.to(this.mPressedState, PRESS_ENTER_CONFIG);
        } else {
            setAlphaF(this.mPressedAlpha);
        }
        this.mPressed = true;
        this.mHovered = false;
        this.mActivated = false;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        if (USE_SMOOTH_ROUND_RECT) {
            canvas.drawPath(this.mPath, this.mPaint);
            return;
        }
        RectF rectF = this.mRect;
        int i2 = this.mRadius;
        canvas.drawRoundRect(rectF, i2, i2, this.mPaint);
    }

    public float getAlphaF() {
        return this.mPaint.getAlpha() / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        init(resources, attributeSet, theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        if (USE_FOLME) {
            IStateStyle iStateStyle = this.mStyle;
            iStateStyle.setTo(iStateStyle.getCurrentState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@lvui Rect rect) {
        this.mRect.set(rect);
        calculatePath();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@lvui int[] iArr) {
        return (StateSet.stateSetMatches(STATE_PRESSED, iArr) || StateSet.stateSetMatches(STATE_DRAG_HOVERED, iArr)) ? toPressedState() : StateSet.stateSetMatches(STATE_HOVERED_ACTIVATED, iArr) ? toHoveredActivatedState() : StateSet.stateSetMatches(STATE_HOVERED, iArr) ? toHoveredState() : StateSet.stateSetMatches(STATE_ACTIVATED, iArr) ? toActivatedState() : toNormalState();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    public void setAlphaF(float f2) {
        this.mPaint.setAlpha((int) (f2 * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@dd ColorFilter colorFilter) {
    }

    public void setRadius(int i2) {
        if (this.mRadius == i2) {
            return;
        }
        this.mRadius = i2;
        invalidateSelf();
    }

    public FilterSortTabView2ForegroundDrawable(View view) {
        init(view.getResources(), null, null);
    }
}

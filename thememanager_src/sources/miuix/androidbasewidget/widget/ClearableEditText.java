package miuix.androidbasewidget.widget;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import androidx.appcompat.widget.nmn5;
import androidx.core.view.C0683f;
import androidx.core.view.accessibility.ki;
import androidx.customview.widget.AbstractC0778k;
import java.lang.ref.WeakReference;
import java.util.List;
import kbj.toq;
import miuix.view.C7385p;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class ClearableEditText extends EditText {

    /* JADX INFO: renamed from: a */
    private static final int[] f38642a = {R.attr.state_empty};

    /* JADX INFO: renamed from: b */
    private C6830k f38643b;

    /* JADX INFO: renamed from: e */
    private Drawable f38644e;

    /* JADX INFO: renamed from: j */
    private boolean f38645j;

    /* JADX INFO: renamed from: m */
    private toq f38646m;

    /* JADX INFO: renamed from: o */
    private boolean f38647o;

    /* JADX INFO: renamed from: miuix.androidbasewidget.widget.ClearableEditText$k */
    private class C6830k extends AbstractC0778k {

        /* JADX INFO: renamed from: q */
        private static final int f38648q = 0;

        /* JADX INFO: renamed from: k */
        private final Rect f38649k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final View f86715toq;

        public C6830k(View view) {
            super(view);
            this.f38649k = new Rect();
            this.f86715toq = view;
        }

        /* JADX INFO: renamed from: k */
        private void m24783k(Rect rect) {
            this.f86715toq.getLocalVisibleRect(this.f38649k);
            int intrinsicWidth = ClearableEditText.this.f38644e == null ? 0 : ClearableEditText.this.f38644e.getIntrinsicWidth();
            if (nmn5.toq(ClearableEditText.this)) {
                rect.right -= (ClearableEditText.this.getWidth() - intrinsicWidth) - (ClearableEditText.this.getPaddingLeft() * 2);
            } else {
                rect.left += (ClearableEditText.this.getWidth() - (ClearableEditText.this.getPaddingRight() * 2)) - intrinsicWidth;
            }
        }

        private CharSequence toq() {
            return ClearableEditText.this.getResources().getString(toq.x2.f36026t);
        }

        private boolean zy(float f2, float f3) {
            int intrinsicWidth = ClearableEditText.this.f38644e == null ? 0 : ClearableEditText.this.f38644e.getIntrinsicWidth();
            return nmn5.toq(ClearableEditText.this) ? f2 < ((float) (intrinsicWidth + (ClearableEditText.this.getPaddingLeft() * 2))) : f2 > ((float) ((ClearableEditText.this.getWidth() - (ClearableEditText.this.getPaddingRight() * 2)) - intrinsicWidth));
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected int getVirtualViewAt(float f2, float f3) {
            return (ClearableEditText.this.f38647o && zy(f2, f3)) ? 0 : Integer.MIN_VALUE;
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected void getVisibleVirtualViews(List list) {
            if (ClearableEditText.this.f38647o) {
                list.add(0);
            }
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected boolean onPerformActionForVirtualView(int i2, int i3, Bundle bundle) {
            if (i2 == Integer.MIN_VALUE || i3 != 16) {
                return false;
            }
            ClearableEditText.this.m24780h();
            return true;
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
            super.onPopulateEventForHost(accessibilityEvent);
            if (accessibilityEvent.getEventType() == 2048 && !ClearableEditText.this.f38647o && this.f86715toq.isFocused()) {
                this.f86715toq.sendAccessibilityEvent(32768);
            }
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected void onPopulateEventForVirtualView(int i2, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setContentDescription(toq());
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected void onPopulateNodeForHost(ki kiVar) {
            super.onPopulateNodeForHost(kiVar);
            if (ClearableEditText.this.f38647o) {
                kiVar.sok(ClearableEditText.class.getName());
            }
        }

        @Override // androidx.customview.widget.AbstractC0778k
        protected void onPopulateNodeForVirtualView(int i2, ki kiVar) {
            kiVar.yqrt(toq());
            kiVar.m3052k(16);
            kiVar.sok(Button.class.getName());
            m24783k(this.f38649k);
            kiVar.ltg8(this.f38649k);
            kiVar.cfr(true);
        }
    }

    static class toq implements TextWatcher {

        /* JADX INFO: renamed from: k */
        WeakReference<ClearableEditText> f38650k;

        toq(ClearableEditText clearableEditText) {
            this.f38650k = new WeakReference<>(clearableEditText);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ClearableEditText clearableEditText = this.f38650k.get();
            if (clearableEditText == null) {
                return;
            }
            if (clearableEditText.f38647o != (editable.length() > 0)) {
                clearableEditText.f38647o = !clearableEditText.f38647o;
                clearableEditText.refreshDrawableState();
                if (clearableEditText.f38643b != null) {
                    clearableEditText.f38643b.invalidateRoot();
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public ClearableEditText(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m24780h() {
        setText("");
        HapticCompat.m26766g(this, C7385p.f92242jp0y, C7385p.f42278s);
    }

    private boolean kja0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && this.f38645j) {
                    this.f38645j = false;
                }
            } else if (isEnabled() && this.f38645j) {
                m24780h();
                this.f38645j = false;
                return true;
            }
        } else if (isEnabled() && this.f38647o) {
            this.f38645j = true;
        }
        return this.f38645j;
    }

    private boolean n7h(MotionEvent motionEvent) {
        if (this.f38647o) {
            Drawable drawable = this.f38644e;
            int intrinsicWidth = drawable == null ? 0 : drawable.getIntrinsicWidth();
            if (nmn5.toq(this)) {
                if (motionEvent.getX() < intrinsicWidth + getPaddingLeft()) {
                    return kja0(motionEvent);
                }
            } else if (motionEvent.getX() > (getWidth() - getPaddingRight()) - intrinsicWidth) {
                return kja0(motionEvent);
            }
        }
        this.f38645j = false;
        return false;
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C6830k c6830k = this.f38643b;
        if (c6830k != null && this.f38647o && c6830k.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // miuix.androidbasewidget.widget.EditText, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return n7h(motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f38644e != null) {
            this.f38644e.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f38644e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        addTextChangedListener(this.f38646m);
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (!this.f38647o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f38642a);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeTextChangedListener(this.f38646m);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        Editable text = getText();
        if (text != null) {
            if (this.f38647o != (text.length() > 0)) {
                this.f38647o = !this.f38647o;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            throw new IllegalStateException("ClearableEditText can only set drawables by setCompoundDrawablesRelative()");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.f38644e = drawable3;
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f38644e;
    }

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, toq.zy.f81679mu);
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f38646m = new toq(this);
        this.f38644e = getCompoundDrawablesRelative()[2];
        int i3 = Build.VERSION.SDK_INT;
        C6830k c6830k = new C6830k(this);
        this.f38643b = c6830k;
        C0683f.zwy(this, c6830k);
        if (i3 >= 29) {
            setForceDarkAllowed(false);
        }
        Editable text = getText();
        if (text != null) {
            if (this.f38647o != (text.length() > 0)) {
                this.f38647o = !this.f38647o;
                refreshDrawableState();
            }
        }
    }
}

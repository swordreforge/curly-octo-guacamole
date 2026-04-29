package miuix.androidbasewidget.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatEditText;
import kbj.toq;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;

/* JADX INFO: loaded from: classes3.dex */
public class EditText extends AppCompatEditText {

    /* JADX INFO: renamed from: c */
    private static final int f38651c = 404;

    /* JADX INFO: renamed from: f */
    private static final int f38652f = 0;

    /* JADX INFO: renamed from: l */
    private static final String f38653l = "EditText";

    /* JADX INFO: renamed from: h */
    private boolean f38654h;

    /* JADX INFO: renamed from: i */
    private TextWatcher f38655i;

    /* JADX INFO: renamed from: p */
    private boolean f38656p;

    /* JADX INFO: renamed from: r */
    private int f38657r;

    /* JADX INFO: renamed from: s */
    private int f38658s;

    /* JADX INFO: renamed from: t */
    private int f38659t;

    /* JADX INFO: renamed from: z */
    private boolean f38660z;

    private class toq implements TextWatcher {
        private toq() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EditText.this.setMiuiStyleError(null);
            if (EditText.this.f38660z) {
                EditText.this.f38660z = false;
                EditText editText = EditText.this;
                editText.removeTextChangedListener(editText.f38655i);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public EditText(Context context) {
        this(context, null);
    }

    private boolean f7l8() {
        int scrollY = getScrollY();
        int height = getLayout().getHeight() - ((getMeasuredHeight() - getCompoundPaddingTop()) - getCompoundPaddingBottom());
        this.f38658s = height;
        if (height == 0) {
            return false;
        }
        return scrollY > 0 || scrollY < height - 1;
    }

    /* JADX INFO: renamed from: y */
    private int m24786y() {
        return Color.argb(51, Color.red(this.f38659t), Color.green(this.f38659t), Color.blue(this.f38659t));
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f38656p = false;
        }
        if (this.f38656p) {
            motionEvent.setAction(3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f38654h = f7l8();
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean zOnPreDraw = super.onPreDraw();
        if (Build.VERSION.SDK_INT >= 29) {
            if (getHighlightColor() != m24786y()) {
                setHighlightColor(m24786y());
            }
            int i2 = this.f38657r;
            if (i2 == -1 || i2 != this.f38659t) {
                Drawable textSelectHandleLeft = getTextSelectHandleLeft();
                Drawable textSelectHandleRight = getTextSelectHandleRight();
                Drawable textSelectHandle = getTextSelectHandle();
                Drawable textCursorDrawable = getTextCursorDrawable();
                Drawable[] drawableArr = {textSelectHandleLeft, textSelectHandleRight, textSelectHandle, textCursorDrawable};
                for (int i3 = 0; i3 < 4; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null) {
                        drawable.setColorFilter(this.f38659t, PorterDuff.Mode.SRC_IN);
                        this.f38657r = this.f38659t;
                    }
                }
                setTextSelectHandleLeft(textSelectHandleLeft);
                setTextSelectHandleRight(textSelectHandleRight);
                setTextSelectHandle(textSelectHandle);
                setTextCursorDrawable(textCursorDrawable);
            }
        }
        return zOnPreDraw;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        this.f38654h = f7l8();
        if (i3 == this.f38658s || i3 == 0) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            this.f38656p = true;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        ViewParent parent = getParent();
        if (this.f38654h) {
            if (!this.f38656p && parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return zOnTouchEvent;
    }

    public void setMiuiStyleError(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            getBackground().setLevel(0);
            return;
        }
        getBackground().setLevel(404);
        if (this.f38660z) {
            return;
        }
        this.f38660z = true;
        addTextChangedListener(this.f38655i);
    }

    public EditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public EditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f38656p = false;
        this.f38657r = -1;
        this.f38655i = new toq();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.n7h.wqp, i2, toq.qrj.t8fp);
        this.f38659t = typedArrayObtainStyledAttributes.getColor(toq.n7h.c2, getResources().getColor(toq.C6110n.f80850gyi));
        typedArrayObtainStyledAttributes.recycle();
        Drawable background = getBackground();
        if (background == null || background.getOpacity() == -2) {
            return;
        }
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.NORMAL).handleHoverOf(this, new AnimConfig[0]);
    }
}

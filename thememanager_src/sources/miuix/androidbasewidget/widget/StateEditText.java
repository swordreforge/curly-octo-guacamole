package miuix.androidbasewidget.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kbj.toq;
import miuix.internal.util.n7h;

/* JADX INFO: loaded from: classes3.dex */
public class StateEditText extends EditText {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final Class<?>[] f86719bo = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: a */
    private boolean f38692a;

    /* JADX INFO: renamed from: b */
    private Drawable[] f38693b;

    /* JADX INFO: renamed from: e */
    private AbstractC6833k f38694e;

    /* JADX INFO: renamed from: j */
    private String f38695j;

    /* JADX INFO: renamed from: m */
    private int f38696m;

    /* JADX INFO: renamed from: o */
    private int f38697o;

    /* JADX INFO: renamed from: u */
    private StaticLayout f38698u;

    /* JADX INFO: renamed from: x */
    private int f38699x;

    /* JADX INFO: renamed from: miuix.androidbasewidget.widget.StateEditText$k */
    public static abstract class AbstractC6833k {
        public AbstractC6833k(Context context, AttributeSet attributeSet) {
        }

        protected abstract Drawable[] getWidgetDrawables();

        protected void onAttached(StateEditText stateEditText) {
        }

        protected void onDetached() {
        }

        protected abstract void onWidgetClick(int i2);
    }

    public StateEditText(Context context) {
        this(context, null);
    }

    private int getLabelLength() {
        int i2 = this.f38696m;
        return i2 + (i2 == 0 ? 0 : this.f38699x);
    }

    private int getWidgetLength() {
        Drawable[] drawableArr = this.f38693b;
        if (drawableArr == null) {
            return 0;
        }
        int intrinsicWidth = 0;
        for (Drawable drawable : drawableArr) {
            intrinsicWidth = intrinsicWidth + drawable.getIntrinsicWidth() + this.f38699x;
        }
        return intrinsicWidth;
    }

    /* JADX INFO: renamed from: h */
    private boolean m24797h(MotionEvent motionEvent, int i2) {
        AbstractC6833k abstractC6833k;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f38692a = true;
        } else if (action != 1) {
            if (action == 3 && this.f38692a) {
                this.f38692a = false;
            }
        } else if (this.f38692a && (abstractC6833k = this.f38694e) != null) {
            abstractC6833k.onWidgetClick(i2);
            this.f38692a = false;
            return true;
        }
        return this.f38692a;
    }

    private boolean kja0(MotionEvent motionEvent) {
        if (this.f38693b != null) {
            int scrollX = getScrollX();
            int i2 = 0;
            while (true) {
                Drawable[] drawableArr = this.f38693b;
                if (i2 >= drawableArr.length) {
                    break;
                }
                Rect bounds = drawableArr[i2].getBounds();
                if (motionEvent.getX() < bounds.right - scrollX && motionEvent.getX() > bounds.left - scrollX) {
                    return m24797h(motionEvent, i2);
                }
                i2++;
            }
        }
        this.f38692a = false;
        return false;
    }

    private boolean ld6(MotionEvent motionEvent) {
        if (this.f38694e != null) {
            return kja0(motionEvent);
        }
        return false;
    }

    private void n7h(Context context, AttributeSet attributeSet, int i2) {
        String string;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.n7h.t4, i2, toq.qrj.ff8y);
            string = typedArrayObtainStyledAttributes.getString(toq.n7h.e1c);
            this.f38695j = typedArrayObtainStyledAttributes.getString(toq.n7h.in);
            this.f38697o = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.n7h.gai, 0);
            this.f38699x = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.n7h.dw, 0);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            string = null;
        }
        setWidgetManager(m24798p(context, string, attributeSet));
        this.f38693b = null;
        AbstractC6833k abstractC6833k = this.f38694e;
        if (abstractC6833k != null) {
            this.f38693b = abstractC6833k.getWidgetDrawables();
        }
        setLabel(this.f38695j);
    }

    /* JADX INFO: renamed from: p */
    private AbstractC6833k m24798p(Context context, String str, AttributeSet attributeSet) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(AbstractC6833k.class).getConstructor(f86719bo);
            Object[] objArr = {context, attributeSet};
            constructor.setAccessible(true);
            return (AbstractC6833k) constructor.newInstance(objArr);
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException("Can't find WidgetManager: " + str, e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Can't access non-public constructor " + str, e3);
        } catch (InstantiationException e4) {
            throw new IllegalStateException("Could not instantiate the WidgetManager: " + str, e4);
        } catch (NoSuchMethodException e6) {
            throw new IllegalStateException("Error creating WidgetManager " + str, e6);
        } catch (InvocationTargetException e7) {
            throw new IllegalStateException("Could not instantiate the WidgetManager: " + str, e7);
        }
    }

    private void qrj(Canvas canvas) {
        if (TextUtils.isEmpty(this.f38695j) || this.f38698u == null) {
            return;
        }
        int color = getPaint().getColor();
        getPaint().setColor(getCurrentTextColor());
        int paddingStart = getPaddingStart();
        int intrinsicWidth = 0;
        Drawable drawable = getCompoundDrawablesRelative()[0];
        if (drawable != null) {
            intrinsicWidth = this.f38699x + drawable.getIntrinsicWidth();
        }
        float fMax = Math.max(0.0f, (getMeasuredHeight() - this.f38698u.getHeight()) / 2.0f);
        canvas.save();
        if (n7h.x2(this)) {
            canvas.translate((((getScrollX() + getWidth()) - intrinsicWidth) - this.f38696m) - paddingStart, fMax);
        } else {
            canvas.translate(paddingStart + getScrollX() + intrinsicWidth, fMax);
        }
        this.f38698u.draw(canvas);
        canvas.restore();
        getPaint().setColor(color);
    }

    /* JADX INFO: renamed from: s */
    private void m24799s() {
        String str = this.f38695j;
        this.f38698u = StaticLayout.Builder.obtain(str, 0, str.length(), getPaint(), this.f38696m).build();
    }

    private void x2(Canvas canvas) {
        if (this.f38693b == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollX = getScrollX();
        int paddingEnd = getPaddingEnd();
        Drawable drawable = getCompoundDrawablesRelative()[2];
        int i2 = 0;
        int intrinsicWidth = drawable == null ? 0 : drawable.getIntrinsicWidth() + this.f38699x;
        int i3 = height / 2;
        int i4 = 0;
        while (true) {
            Drawable[] drawableArr = this.f38693b;
            if (i2 >= drawableArr.length) {
                return;
            }
            int intrinsicWidth2 = drawableArr[i2].getIntrinsicWidth();
            int intrinsicHeight = this.f38693b[i2].getIntrinsicHeight();
            if (n7h.x2(this)) {
                int i5 = scrollX + paddingEnd + intrinsicWidth;
                int i6 = intrinsicHeight / 2;
                this.f38693b[i2].setBounds(i5 + i4, i3 - i6, i5 + intrinsicWidth2 + i4, i6 + i3);
            } else {
                int i7 = ((scrollX + width) - paddingEnd) - intrinsicWidth;
                int i8 = intrinsicHeight / 2;
                this.f38693b[i2].setBounds((i7 - intrinsicWidth2) - i4, i3 - i8, i7 - i4, i8 + i3);
            }
            i4 = this.f38699x + intrinsicWidth2;
            this.f38693b[i2].draw(canvas);
            i2++;
        }
    }

    @Override // miuix.androidbasewidget.widget.EditText, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return ld6(motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft() + (n7h.x2(this) ? getWidgetLength() : getLabelLength());
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        return super.getCompoundPaddingRight() + (n7h.x2(this) ? getLabelLength() : getWidgetLength());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        x2(canvas);
        qrj(canvas);
    }

    @Override // miuix.androidbasewidget.widget.EditText, android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (TextUtils.isEmpty(this.f38695j) || this.f38698u == null) {
            return;
        }
        if (this.f38697o == 0 && this.f38696m > getMeasuredWidth() / 2) {
            this.f38696m = getMeasuredWidth() / 2;
            m24799s();
        }
        int height = this.f38698u.getHeight() + getPaddingTop() + getPaddingBottom();
        if (height > getMeasuredHeight()) {
            setMeasuredDimension(getMeasuredWidth(), height);
        }
    }

    @Override // android.widget.TextView
    public void setInputType(int i2) {
        Typeface typeface = getTypeface();
        super.setInputType(i2);
        setTypeface(typeface);
    }

    public void setLabel(String str) {
        this.f38695j = str;
        if (this.f38697o > 0) {
            this.f38696m = TextUtils.isEmpty(str) ? 0 : Math.min((int) getPaint().measureText(this.f38695j), this.f38697o);
        } else {
            this.f38696m = TextUtils.isEmpty(str) ? 0 : (int) getPaint().measureText(this.f38695j);
        }
        if (!TextUtils.isEmpty(this.f38695j)) {
            m24799s();
        }
        invalidate();
    }

    public void setWidgetManager(AbstractC6833k abstractC6833k) {
        AbstractC6833k abstractC6833k2 = this.f38694e;
        if (abstractC6833k2 != null) {
            abstractC6833k2.onDetached();
            this.f38693b = null;
        }
        this.f38694e = abstractC6833k;
        if (abstractC6833k != null) {
            this.f38693b = abstractC6833k.getWidgetDrawables();
            this.f38694e.onAttached(this);
        }
    }

    public StateEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, toq.zy.f81589c25);
    }

    public StateEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f38698u = null;
        n7h(context, attributeSet, i2);
    }
}

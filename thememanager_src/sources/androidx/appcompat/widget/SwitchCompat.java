package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.C0683f;
import androidx.emoji2.text.C0830n;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p023g.C6045k;
import p030n.C7397k;
import p041y.C7774k;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements lvui {
    private static final int aj = 2;
    private static final int am = 250;
    private static final int ar = 2;
    private static final int ay = 0;
    private static final int bc = 3;
    private static final int be = 1;
    private static final String bs = "android.widget.Switch";
    private static final int k0 = 1;

    /* JADX INFO: renamed from: a */
    private int f884a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f46825ab;

    @zy.dd
    private toq ac;
    private final Rect ad;
    private int an;
    private Layout as;
    private final C0220t ax;

    @zy.dd
    private TransformationMethod az;

    /* JADX INFO: renamed from: b */
    private int f885b;
    ObjectAnimator ba;
    private int bb;
    private Layout bg;
    private ColorStateList bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private VelocityTracker f46826bo;
    private int bp;

    @zy.lvui
    private n7h bq;
    private int bv;

    /* JADX INFO: renamed from: c */
    private CharSequence f886c;

    /* JADX INFO: renamed from: d */
    float f887d;

    /* JADX INFO: renamed from: e */
    private CharSequence f888e;

    /* JADX INFO: renamed from: f */
    private boolean f889f;

    /* JADX INFO: renamed from: g */
    private boolean f890g;

    /* JADX INFO: renamed from: h */
    private PorterDuff.Mode f891h;

    /* JADX INFO: renamed from: i */
    private boolean f892i;
    private int id;
    private final TextPaint in;

    /* JADX INFO: renamed from: j */
    private CharSequence f893j;

    /* JADX INFO: renamed from: k */
    private Drawable f894k;

    /* JADX INFO: renamed from: l */
    private int f895l;

    /* JADX INFO: renamed from: m */
    private boolean f896m;

    /* JADX INFO: renamed from: n */
    private PorterDuff.Mode f897n;

    /* JADX INFO: renamed from: o */
    private CharSequence f898o;

    /* JADX INFO: renamed from: p */
    private ColorStateList f899p;

    /* JADX INFO: renamed from: q */
    private ColorStateList f900q;

    /* JADX INFO: renamed from: r */
    private int f901r;

    /* JADX INFO: renamed from: s */
    private Drawable f902s;

    /* JADX INFO: renamed from: t */
    private int f903t;

    /* JADX INFO: renamed from: u */
    private float f904u;

    /* JADX INFO: renamed from: v */
    private int f905v;

    /* JADX INFO: renamed from: w */
    private int f906w;

    /* JADX INFO: renamed from: x */
    private float f907x;

    /* JADX INFO: renamed from: y */
    private boolean f908y;

    /* JADX INFO: renamed from: z */
    private boolean f909z;
    private static final Property<SwitchCompat, Float> bu = new C0175k(Float.class, "thumbPos");
    private static final int[] bd = {R.attr.state_checked};

    /* JADX INFO: renamed from: androidx.appcompat.widget.SwitchCompat$k */
    class C0175k extends Property<SwitchCompat, Float> {
        C0175k(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f887d);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f2) {
            switchCompat.setThumbPosition(f2.floatValue());
        }
    }

    static class toq extends C0830n.n {

        /* JADX INFO: renamed from: k */
        private final Reference<SwitchCompat> f910k;

        toq(SwitchCompat switchCompat) {
            this.f910k = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.C0830n.n
        /* JADX INFO: renamed from: k */
        public void mo511k(@zy.dd Throwable th) {
            SwitchCompat switchCompat = this.f910k.get();
            if (switchCompat != null) {
                switchCompat.ld6();
            }
        }

        @Override // androidx.emoji2.text.C0830n.n
        public void toq() {
            SwitchCompat switchCompat = this.f910k.get();
            if (switchCompat != null) {
                switchCompat.ld6();
            }
        }
    }

    public SwitchCompat(@zy.lvui Context context) {
        this(context, null);
    }

    private static float f7l8(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    /* JADX INFO: renamed from: g */
    private void m503g(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    @zy.lvui
    private n7h getEmojiTextViewHelper() {
        if (this.bq == null) {
            this.bq = new n7h(this);
        }
        return this.bq;
    }

    private boolean getTargetCheckedState() {
        return this.f887d > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((nmn5.toq(this) ? 1.0f - this.f887d : this.f887d) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f902s;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.ad;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f894k;
        Rect rectM698q = drawable2 != null ? oc.m698q(drawable2) : oc.f46940zy;
        return ((((this.f906w - this.bb) - rect.left) - rect.right) - rectM698q.left) - rectM698q.right;
    }

    /* JADX INFO: renamed from: h */
    private void m504h(MotionEvent motionEvent) {
        this.f885b = 0;
        boolean targetCheckedState = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z2) {
            this.f46826bo.computeCurrentVelocity(1000);
            float xVelocity = this.f46826bo.getXVelocity();
            if (Math.abs(xVelocity) <= this.f905v) {
                targetCheckedState = getTargetCheckedState();
            } else if (!nmn5.toq(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        m503g(motionEvent);
    }

    /* JADX INFO: renamed from: k */
    private void m505k(boolean z2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, bu, z2 ? 1.0f : 0.0f);
        this.ba = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.ba.setAutoCancel(true);
        this.ba.start();
    }

    private void kja0() {
        if (this.ac == null && this.bq.toq() && C0830n.qrj()) {
            C0830n qVar = C0830n.toq();
            int iM4035n = qVar.m4035n();
            if (iM4035n == 3 || iM4035n == 0) {
                toq toqVar = new toq(this);
                this.ac = toqVar;
                qVar.fu4(toqVar);
            }
        }
    }

    private void n7h(int i2, int i3) {
        setSwitchTypeface(i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i3);
    }

    /* JADX INFO: renamed from: p */
    private Layout m506p(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.in, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* JADX INFO: renamed from: q */
    private void m507q() {
        ObjectAnimator objectAnimator = this.ba;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void qrj() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f886c;
            if (string == null) {
                string = getResources().getString(C7397k.ld6.f42384y);
            }
            C0683f.l05(this, string);
        }
    }

    /* JADX INFO: renamed from: s */
    private boolean m508s(float f2, float f3) {
        if (this.f894k == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f894k.getPadding(this.ad);
        int i2 = this.bv;
        int i3 = this.f884a;
        int i4 = i2 - i3;
        int i5 = (this.bp + thumbOffset) - i3;
        int i6 = this.bb + i5;
        Rect rect = this.ad;
        return f2 > ((float) i5) && f2 < ((float) (((i6 + rect.left) + rect.right) + i3)) && f3 > ((float) i4) && f3 < ((float) (this.id + i3));
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f893j = charSequence;
        this.f898o = m509y(charSequence);
        this.bg = null;
        if (this.f896m) {
            kja0();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f886c = charSequence;
        this.f888e = m509y(charSequence);
        this.as = null;
        if (this.f896m) {
            kja0();
        }
    }

    private void toq() {
        Drawable drawable = this.f894k;
        if (drawable != null) {
            if (this.f890g || this.f908y) {
                Drawable drawableMutate = androidx.core.graphics.drawable.zy.ki(drawable).mutate();
                this.f894k = drawableMutate;
                if (this.f890g) {
                    androidx.core.graphics.drawable.zy.kja0(drawableMutate, this.f900q);
                }
                if (this.f908y) {
                    androidx.core.graphics.drawable.zy.m2442h(this.f894k, this.f897n);
                }
                if (this.f894k.isStateful()) {
                    this.f894k.setState(getDrawableState());
                }
            }
        }
    }

    private void x2() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f893j;
            if (string == null) {
                string = getResources().getString(C7397k.ld6.f92437f7l8);
            }
            C0683f.l05(this, string);
        }
    }

    @zy.dd
    /* JADX INFO: renamed from: y */
    private CharSequence m509y(@zy.dd CharSequence charSequence) {
        TransformationMethod transformationMethodM680g = getEmojiTextViewHelper().m680g(this.az);
        return transformationMethodM680g != null ? transformationMethodM680g.getTransformation(charSequence, this) : charSequence;
    }

    private void zy() {
        Drawable drawable = this.f902s;
        if (drawable != null) {
            if (this.f892i || this.f909z) {
                Drawable drawableMutate = androidx.core.graphics.drawable.zy.ki(drawable).mutate();
                this.f902s = drawableMutate;
                if (this.f892i) {
                    androidx.core.graphics.drawable.zy.kja0(drawableMutate, this.f899p);
                }
                if (this.f909z) {
                    androidx.core.graphics.drawable.zy.m2442h(this.f902s, this.f891h);
                }
                if (this.f902s.isStateful()) {
                    this.f902s.setState(getDrawableState());
                }
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        int i3;
        Rect rect = this.ad;
        int i4 = this.bp;
        int i5 = this.bv;
        int i6 = this.an;
        int i7 = this.id;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f894k;
        Rect rectM698q = drawable != null ? oc.m698q(drawable) : oc.f46940zy;
        Drawable drawable2 = this.f902s;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (rectM698q != null) {
                int i9 = rectM698q.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = rectM698q.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = rectM698q.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = rectM698q.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                }
                this.f902s.setBounds(i4, i2, i6, i3);
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f902s.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f894k;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.bb + rect.right;
            this.f894k.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.zy.x2(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f894k;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.ld6(drawable, f2, f3);
        }
        Drawable drawable2 = this.f902s;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.zy.ld6(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f894k;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f902s;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!nmn5.toq(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f906w;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f895l : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (nmn5.toq(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f906w;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f895l : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @zy.dd
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.t8r.jp0y(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f896m;
    }

    public boolean getSplitTrack() {
        return this.f889f;
    }

    public int getSwitchMinWidth() {
        return this.f901r;
    }

    public int getSwitchPadding() {
        return this.f895l;
    }

    public CharSequence getTextOff() {
        return this.f893j;
    }

    public CharSequence getTextOn() {
        return this.f886c;
    }

    public Drawable getThumbDrawable() {
        return this.f894k;
    }

    public int getThumbTextPadding() {
        return this.f903t;
    }

    @zy.dd
    public ColorStateList getThumbTintList() {
        return this.f900q;
    }

    @zy.dd
    public PorterDuff.Mode getThumbTintMode() {
        return this.f897n;
    }

    public Drawable getTrackDrawable() {
        return this.f902s;
    }

    @zy.dd
    public ColorStateList getTrackTintList() {
        return this.f899p;
    }

    @zy.dd
    public PorterDuff.Mode getTrackTintMode() {
        return this.f891h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f894k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f902s;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.ba;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.ba.end();
        this.ba = null;
    }

    void ld6() {
        setTextOnInternal(this.f886c);
        setTextOffInternal(this.f893j);
        requestLayout();
    }

    @Override // androidx.appcompat.widget.lvui
    /* JADX INFO: renamed from: n */
    public boolean mo447n() {
        return getEmojiTextViewHelper().toq();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, bd);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.ad;
        Drawable drawable = this.f902s;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.bv;
        int i3 = this.id;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f894k;
        if (drawable != null) {
            if (!this.f889f || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM698q = oc.m698q(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM698q.left;
                rect.right -= rectM698q.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.as : this.bg;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.bl;
            if (colorStateList != null) {
                this.in.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.in.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i4 + i5) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(bs);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(bs);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f886c : this.f893j;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int iMax;
        int width;
        int paddingLeft;
        int i6;
        int paddingTop;
        int height;
        super.onLayout(z2, i2, i3, i4, i5);
        int iMax2 = 0;
        if (this.f894k != null) {
            Rect rect = this.ad;
            Drawable drawable = this.f902s;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM698q = oc.m698q(this.f894k);
            iMax = Math.max(0, rectM698q.left - rect.left);
            iMax2 = Math.max(0, rectM698q.right - rect.right);
        } else {
            iMax = 0;
        }
        if (nmn5.toq(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f906w + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f906w) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i6 = this.f46825ab;
            paddingTop = paddingTop2 - (i6 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f46825ab;
                this.bp = paddingLeft;
                this.bv = paddingTop;
                this.id = height;
                this.an = width;
            }
            paddingTop = getPaddingTop();
            i6 = this.f46825ab;
        }
        height = i6 + paddingTop;
        this.bp = paddingLeft;
        this.bv = paddingTop;
        this.id = height;
        this.an = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f896m) {
            if (this.as == null) {
                this.as = m506p(this.f888e);
            }
            if (this.bg == null) {
                this.bg = m506p(this.f898o);
            }
        }
        Rect rect = this.ad;
        Drawable drawable = this.f894k;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f894k.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f894k.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.bb = Math.max(this.f896m ? Math.max(this.as.getWidth(), this.bg.getWidth()) + (this.f903t * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f902s;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f902s.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f894k;
        if (drawable3 != null) {
            Rect rectM698q = oc.m698q(drawable3);
            iMax = Math.max(iMax, rectM698q.left);
            iMax2 = Math.max(iMax2, rectM698q.right);
        }
        int iMax3 = Math.max(this.f901r, (this.bb * 2) + iMax + iMax2);
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f906w = iMax3;
        this.f46825ab = iMax4;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f886c : this.f893j;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f46826bo
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f885b
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f907x
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.nmn5.toq(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f887d
            float r0 = r0 + r2
            float r0 = f7l8(r0, r4, r3)
            float r2 = r6.f887d
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f907x = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f907x
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f884a
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f904u
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f884a
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f885b = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f907x = r0
            r6.f904u = r3
            return r1
        L89:
            int r0 = r6.f885b
            if (r0 != r2) goto L94
            r6.m504h(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f885b = r0
            android.view.VelocityTracker r0 = r6.f46826bo
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.m508s(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f885b = r1
            r6.f907x = r0
            r6.f904u = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m683q(z2);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            qrj();
        } else {
            x2();
        }
        if (getWindowToken() != null && C0683f.v0af(this)) {
            m505k(zIsChecked);
        } else {
            m507q();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@zy.dd ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.t8r.gvn7(this, callback));
    }

    @Override // androidx.appcompat.widget.lvui
    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m682n(z2);
        setTextOnInternal(this.f886c);
        setTextOffInternal(this.f893j);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(@zy.lvui InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m681k(inputFilterArr));
    }

    public void setShowText(boolean z2) {
        if (this.f896m != z2) {
            this.f896m = z2;
            requestLayout();
            if (z2) {
                kja0();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f889f = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f901r = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f895l = i2;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i2) {
        C0184b c0184bA9 = C0184b.a9(context, i2, C7397k.qrj.yh8z);
        ColorStateList colorStateListM550q = c0184bA9.m550q(C7397k.qrj.bv);
        if (colorStateListM550q != null) {
            this.bl = colorStateListM550q;
        } else {
            this.bl = getTextColors();
        }
        int iF7l8 = c0184bA9.f7l8(C7397k.qrj.lm5, 0);
        if (iF7l8 != 0) {
            float f2 = iF7l8;
            if (f2 != this.in.getTextSize()) {
                this.in.setTextSize(f2);
                requestLayout();
            }
        }
        n7h(c0184bA9.kja0(C7397k.qrj.g8, -1), c0184bA9.kja0(C7397k.qrj.wqg, -1));
        if (c0184bA9.m547k(C7397k.qrj.w6w4, false)) {
            this.az = new C7774k(getContext());
        } else {
            this.az = null;
        }
        setTextOnInternal(this.f886c);
        setTextOffInternal(this.f893j);
        c0184bA9.d3();
    }

    public void setSwitchTypeface(Typeface typeface, int i2) {
        if (i2 <= 0) {
            this.in.setFakeBoldText(false);
            this.in.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
            this.in.setFakeBoldText((i3 & 1) != 0);
            this.in.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        x2();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            qrj();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f894k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f894k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f2) {
        this.f887d = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(C6045k.toq(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f903t = i2;
        requestLayout();
    }

    public void setThumbTintList(@zy.dd ColorStateList colorStateList) {
        this.f900q = colorStateList;
        this.f890g = true;
        toq();
    }

    public void setThumbTintMode(@zy.dd PorterDuff.Mode mode) {
        this.f897n = mode;
        this.f908y = true;
        toq();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f902s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f902s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(C6045k.toq(getContext(), i2));
    }

    public void setTrackTintList(@zy.dd ColorStateList colorStateList) {
        this.f899p = colorStateList;
        this.f892i = true;
        zy();
    }

    public void setTrackTintMode(@zy.dd PorterDuff.Mode mode) {
        this.f891h = mode;
        this.f909z = true;
        zy();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f894k || drawable == this.f902s;
    }

    public SwitchCompat(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f92968ula6);
    }

    public SwitchCompat(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f900q = null;
        this.f897n = null;
        this.f890g = false;
        this.f908y = false;
        this.f899p = null;
        this.f891h = null;
        this.f892i = false;
        this.f909z = false;
        this.f46826bo = VelocityTracker.obtain();
        this.ad = new Rect();
        C0214o.m692k(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.in = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C7397k.qrj.b972;
        C0184b c0184bJp0y = C0184b.jp0y(context, attributeSet, iArr, i2, 0);
        C0683f.ij(this, context, iArr, attributeSet, c0184bJp0y.m552t(), i2, 0);
        Drawable drawableM553y = c0184bJp0y.m553y(C7397k.qrj.c7g);
        this.f894k = drawableM553y;
        if (drawableM553y != null) {
            drawableM553y.setCallback(this);
        }
        Drawable drawableM553y2 = c0184bJp0y.m553y(C7397k.qrj.twzk);
        this.f902s = drawableM553y2;
        if (drawableM553y2 != null) {
            drawableM553y2.setCallback(this);
        }
        setTextOnInternal(c0184bJp0y.fu4(C7397k.qrj.x8));
        setTextOffInternal(c0184bJp0y.fu4(C7397k.qrj.kho));
        this.f896m = c0184bJp0y.m547k(C7397k.qrj.fpn, true);
        this.f903t = c0184bJp0y.f7l8(C7397k.qrj.wtm, 0);
        this.f901r = c0184bJp0y.f7l8(C7397k.qrj.i0, 0);
        this.f895l = c0184bJp0y.f7l8(C7397k.qrj.rq, 0);
        this.f889f = c0184bJp0y.m547k(C7397k.qrj.olj, false);
        ColorStateList colorStateListM550q = c0184bJp0y.m550q(C7397k.qrj.ex76);
        if (colorStateListM550q != null) {
            this.f900q = colorStateListM550q;
            this.f890g = true;
        }
        PorterDuff.Mode modeM697n = oc.m697n(c0184bJp0y.kja0(C7397k.qrj.hczd, -1), null);
        if (this.f897n != modeM697n) {
            this.f897n = modeM697n;
            this.f908y = true;
        }
        if (this.f890g || this.f908y) {
            toq();
        }
        ColorStateList colorStateListM550q2 = c0184bJp0y.m550q(C7397k.qrj.y84);
        if (colorStateListM550q2 != null) {
            this.f899p = colorStateListM550q2;
            this.f892i = true;
        }
        PorterDuff.Mode modeM697n2 = oc.m697n(c0184bJp0y.kja0(C7397k.qrj.fq, -1), null);
        if (this.f891h != modeM697n2) {
            this.f891h = modeM697n2;
            this.f909z = true;
        }
        if (this.f892i || this.f909z) {
            zy();
        }
        int iFn3e = c0184bJp0y.fn3e(C7397k.qrj.cc1, 0);
        if (iFn3e != 0) {
            setSwitchTextAppearance(context, iFn3e);
        }
        C0220t c0220t = new C0220t(this);
        this.ax = c0220t;
        c0220t.qrj(attributeSet, i2);
        c0184bJp0y.d3();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f884a = viewConfiguration.getScaledTouchSlop();
        this.f905v = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().zy(attributeSet, i2);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.in.getTypeface() == null || this.in.getTypeface().equals(typeface)) && (this.in.getTypeface() != null || typeface == null)) {
            return;
        }
        this.in.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}

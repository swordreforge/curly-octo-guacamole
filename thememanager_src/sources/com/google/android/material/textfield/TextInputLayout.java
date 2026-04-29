package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0184b;
import androidx.appcompat.widget.ld6;
import androidx.appcompat.widget.oc;
import androidx.core.content.C0498q;
import androidx.core.text.C0616k;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.core.view.accessibility.ki;
import androidx.core.view.qrj;
import androidx.core.widget.t8r;
import androidx.customview.view.AbsSavedState;
import androidx.transition.n7h;
import com.google.android.material.animation.C3910k;
import com.google.android.material.internal.C4052q;
import com.google.android.material.internal.C4058z;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.cdj;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import h4b.C6070k;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p023g.C6045k;
import zy.InterfaceC7829h;
import zy.InterfaceC7833l;
import zy.dd;
import zy.fn3e;
import zy.hb;
import zy.lvui;
import zy.nn86;
import zy.uv6;
import zy.x2;
import zy.yz;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {
    public static final int a7kc = 1;
    private static final int afw = C6095k.n7h.vtz9;
    public static final int cecm = -1;
    private static final long eht = 87;
    private static final int fn2 = -1;
    public static final int gjxq = 2;
    public static final int h06 = 1;
    public static final int k84 = 2;
    public static final int kdv1 = 0;
    private static final int lw58 = -1;
    private static final long n5ij = 67;
    public static final int nq0z = 0;
    private static final int oyp = 167;
    public static final int r7v2 = 3;
    private static final String us2t = "TextInputLayout";

    /* JADX INFO: renamed from: a */
    @dd
    private ColorStateList f25212a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    @lvui
    private final TextView f67920ab;
    private int ac;

    @x2
    private int ad;
    private final RectF aj;

    @x2
    private int am;

    @dd
    private C4108p an;
    private int ar;
    private boolean as;
    private int ax;
    private final Rect ay;
    private int az;

    /* JADX INFO: renamed from: b */
    private TextView f25213b;
    private int ba;
    private boolean bb;
    private final LinkedHashSet<InterfaceC4154y> bc;
    private final SparseArray<AbstractC4158n> bd;
    private final Rect be;
    private final int bg;

    @lvui
    private kja0 bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @dd
    private n7h f67921bo;
    private CharSequence bp;
    private int bq;
    private Typeface bs;
    private int bu;
    private boolean bv;

    /* JADX INFO: renamed from: c */
    @dd
    private TextView f25214c;
    private ColorStateList cw14;

    /* JADX INFO: renamed from: d */
    @dd
    private ColorStateList f25215d;

    @x2
    private int d1cy;
    private Drawable dy;

    /* JADX INFO: renamed from: e */
    private int f25216e;

    @x2
    private int ei;

    /* JADX INFO: renamed from: f */
    private boolean f25217f;

    /* JADX INFO: renamed from: g */
    @lvui
    private final FrameLayout f25218g;

    /* JADX INFO: renamed from: h */
    private int f25219h;
    private ColorStateList hp;

    /* JADX INFO: renamed from: i */
    private int f25220i;

    @dd
    private C4108p id;

    @dd
    private C4108p in;

    /* JADX INFO: renamed from: j */
    private int f25221j;

    /* JADX INFO: renamed from: k */
    @lvui
    private final FrameLayout f25222k;

    @dd
    private Drawable k0;
    private View.OnLongClickListener k6e;

    /* JADX INFO: renamed from: l */
    private int f25223l;
    private boolean ls9;

    /* JADX INFO: renamed from: m */
    private boolean f25224m;
    private PorterDuff.Mode mjvl;

    /* JADX INFO: renamed from: n */
    @lvui
    private final LinearLayout f25225n;
    private ColorStateList ndjo;

    /* JADX INFO: renamed from: o */
    private CharSequence f25226o;

    /* JADX INFO: renamed from: p */
    private int f25227p;

    /* JADX INFO: renamed from: q */
    @lvui
    private final C4159p f25228q;

    @x2
    private int q7k9;
    private boolean qns;

    /* JADX INFO: renamed from: r */
    boolean f25229r;

    /* JADX INFO: renamed from: s */
    private CharSequence f25230s;
    private ColorStateList s8y;
    private int sk1t;

    /* JADX INFO: renamed from: t */
    private final com.google.android.material.textfield.f7l8 f25231t;
    private ColorStateList tgs;

    @x2
    private int th6;

    @lvui
    private final CheckableImageButton tlhn;

    /* JADX INFO: renamed from: u */
    @dd
    private n7h f25232u;
    private boolean ut;

    /* JADX INFO: renamed from: v */
    @dd
    private ColorStateList f25233v;
    private View.OnLongClickListener vb6;

    /* JADX INFO: renamed from: w */
    @dd
    private CharSequence f25234w;
    private final LinkedHashSet<InterfaceC4153s> w97r;
    private ValueAnimator wh6;

    @x2
    private int wra;

    /* JADX INFO: renamed from: x */
    private int f25235x;
    final com.google.android.material.internal.toq xhv;

    @lvui
    private final CheckableImageButton xk5;

    @x2
    private int xqx;

    @x2
    private int xy8;

    /* JADX INFO: renamed from: y */
    EditText f25236y;
    private PorterDuff.Mode yl25;

    /* JADX INFO: renamed from: z */
    private int f25237z;
    private boolean zm;

    @dd
    private Drawable zmmu;

    @x2
    private int zr5t;
    private boolean zsl;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            @dd
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@lvui Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @lvui
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@lvui Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: g */
        @dd
        CharSequence f25238g;

        /* JADX INFO: renamed from: n */
        boolean f25239n;

        /* JADX INFO: renamed from: q */
        @dd
        CharSequence f25240q;

        /* JADX INFO: renamed from: s */
        @dd
        CharSequence f25241s;

        /* JADX INFO: renamed from: y */
        @dd
        CharSequence f25242y;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @lvui
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f25240q) + " hint=" + ((Object) this.f25238g) + " helperText=" + ((Object) this.f25242y) + " placeholderText=" + ((Object) this.f25241s) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            TextUtils.writeToParcel(this.f25240q, parcel, i2);
            parcel.writeInt(this.f25239n ? 1 : 0);
            TextUtils.writeToParcel(this.f25238g, parcel, i2);
            TextUtils.writeToParcel(this.f25242y, parcel, i2);
            TextUtils.writeToParcel(this.f25241s, parcel, i2);
        }

        SavedState(@lvui Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f25240q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f25239n = parcel.readInt() == 1;
            this.f25238g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f25242y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f25241s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface f7l8 {
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$g */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC4149g {
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$k */
    class C4150k implements TextWatcher {
        C4150k() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@lvui Editable editable) {
            TextInputLayout.this.g1(!r0.qns);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f25229r) {
                textInputLayout.ikck(editable.length());
            }
            if (TextInputLayout.this.f25224m) {
                TextInputLayout.this.py(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$n */
    public static class C4151n extends C0701k {

        /* JADX INFO: renamed from: k */
        private final TextInputLayout f25244k;

        public C4151n(@lvui TextInputLayout textInputLayout) {
            this.f25244k = textInputLayout;
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(@lvui View view, @lvui ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            EditText editText = this.f25244k.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f25244k.getHint();
            CharSequence error = this.f25244k.getError();
            CharSequence placeholderText = this.f25244k.getPlaceholderText();
            int counterMaxLength = this.f25244k.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f25244k.getCounterOverflowDescription();
            boolean z2 = !TextUtils.isEmpty(text);
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z5 = !this.f25244k.uv6();
            boolean z6 = !TextUtils.isEmpty(error);
            boolean z7 = z6 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z3 ? hint.toString() : "";
            this.f25244k.f25228q.ni7(kiVar);
            if (z2) {
                kiVar.dxef(text);
            } else if (!TextUtils.isEmpty(string)) {
                kiVar.dxef(string);
                if (z5 && placeholderText != null) {
                    kiVar.dxef(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                kiVar.dxef(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                kiVar.bek6(string);
                kiVar.h4b(!z2);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            kiVar.ixz(counterMaxLength);
            if (z7) {
                if (!z6) {
                    error = counterOverflowDescription;
                }
                kiVar.uj2j(error);
            }
            View viewM15054i = this.f25244k.f25231t.m15054i();
            if (viewM15054i != null) {
                kiVar.vep5(viewM15054i);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$q */
    class C4152q implements ValueAnimator.AnimatorUpdateListener {
        C4152q() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            TextInputLayout.this.xhv.xwq3(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$s */
    public interface InterfaceC4153s {
        /* JADX INFO: renamed from: k */
        void mo15042k(@lvui TextInputLayout textInputLayout, int i2);
    }

    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.tlhn.performClick();
            TextInputLayout.this.tlhn.jumpDrawablesToCurrentState();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$y */
    public interface InterfaceC4154y {
        /* JADX INFO: renamed from: k */
        void mo15043k(@lvui TextInputLayout textInputLayout);
    }

    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f25236y.requestLayout();
        }
    }

    public TextInputLayout(@lvui Context context) {
        this(context, null);
    }

    private void a9() {
        Iterator<InterfaceC4154y> it = this.bc.iterator();
        while (it.hasNext()) {
            it.next().mo15043k(this);
        }
    }

    private boolean bo() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f25228q.getMeasuredWidth() > 0;
    }

    private void c8jq() {
        if (this.f25213b == null || !this.f25224m || TextUtils.isEmpty(this.f25226o)) {
            return;
        }
        this.f25213b.setText(this.f25226o);
        androidx.transition.lvui.toq(this.f25222k, this.f25232u);
        this.f25213b.setVisibility(0);
        this.f25213b.bringToFront();
        announceForAccessibility(this.f25226o);
    }

    @lvui
    private Rect cdj(@lvui Rect rect) {
        if (this.f25236y == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.be;
        boolean zLd6 = C4058z.ld6(this);
        rect2.bottom = rect.bottom;
        int i2 = this.az;
        if (i2 == 1) {
            rect2.left = oc(rect.left, zLd6);
            rect2.top = rect.top + this.ba;
            rect2.right = eqxt(rect.right, zLd6);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = oc(rect.left, zLd6);
            rect2.top = getPaddingTop();
            rect2.right = eqxt(rect.right, zLd6);
            return rect2;
        }
        rect2.left = rect.left + this.f25236y.getPaddingLeft();
        rect2.top = rect.top - fn3e();
        rect2.right = rect.right - this.f25236y.getPaddingRight();
        return rect2;
    }

    private static void ch(@lvui CheckableImageButton checkableImageButton, @dd View.OnLongClickListener onLongClickListener) {
        boolean zD8wk = C0683f.d8wk(checkableImageButton);
        boolean z2 = onLongClickListener != null;
        boolean z3 = zD8wk || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(zD8wk);
        checkableImageButton.setPressable(zD8wk);
        checkableImageButton.setLongClickable(z2);
        C0683f.o05(checkableImageButton, z3 ? 1 : 2);
    }

    /* JADX INFO: renamed from: d */
    private static void m15016d(@lvui Context context, @lvui TextView textView, int i2, int i3, boolean z2) {
        textView.setContentDescription(context.getString(z2 ? C6095k.qrj.f79803fti : C6095k.qrj.f79779a9, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    private boolean d2ok() {
        return this.bu != 0;
    }

    private void d3(boolean z2) {
        ValueAnimator valueAnimator = this.wh6;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.wh6.cancel();
        }
        if (z2 && this.ut) {
            ld6(0.0f);
        } else {
            this.xhv.xwq3(0.0f);
        }
        if (mcp() && ((com.google.android.material.textfield.zy) this.an).py()) {
            o1t();
        }
        this.zsl = true;
        lvui();
        this.f25228q.m15076p(true);
        r8s8();
    }

    private void d8wk() {
        if (this.az != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f25222k.getLayoutParams();
            int iFn3e = fn3e();
            if (iFn3e != layoutParams.topMargin) {
                layoutParams.topMargin = iFn3e;
                this.f25222k.requestLayout();
            }
        }
    }

    private void dr() {
        if (this.az == 1) {
            if (com.google.android.material.resources.zy.m14755p(getContext())) {
                this.ba = getResources().getDimensionPixelSize(C6095k.g.l92);
            } else if (com.google.android.material.resources.zy.m14757s(getContext())) {
                this.ba = getResources().getDimensionPixelSize(C6095k.g.bb);
            }
        }
    }

    private int eqxt(int i2, boolean z2) {
        int compoundPaddingRight = i2 - this.f25236y.getCompoundPaddingRight();
        return (getPrefixText() == null || !z2) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    private int fn3e() {
        float fKi;
        if (!this.bb) {
            return 0;
        }
        int i2 = this.az;
        if (i2 == 0) {
            fKi = this.xhv.ki();
        } else {
            if (i2 != 2) {
                return 0;
            }
            fKi = this.xhv.ki() / 2.0f;
        }
        return (int) fKi;
    }

    private void fti(int i2) {
        Iterator<InterfaceC4153s> it = this.w97r.iterator();
        while (it.hasNext()) {
            it.next().mo15042k(this, i2);
        }
    }

    private void gbni() {
        EditText editText;
        if (this.f25213b == null || (editText = this.f25236y) == null) {
            return;
        }
        this.f25213b.setGravity(editText.getGravity());
        this.f25213b.setPadding(this.f25236y.getCompoundPaddingLeft(), this.f25236y.getCompoundPaddingTop(), this.f25236y.getCompoundPaddingRight(), this.f25236y.getCompoundPaddingBottom());
    }

    private AbstractC4158n getEndIconDelegate() {
        AbstractC4158n abstractC4158n = this.bd.get(this.bu);
        return abstractC4158n != null ? abstractC4158n : this.bd.get(0);
    }

    @dd
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.xk5.getVisibility() == 0) {
            return this.xk5;
        }
        if (d2ok() && x9kr()) {
            return this.tlhn;
        }
        return null;
    }

    private void gvn7(@lvui Canvas canvas) {
        if (this.bb) {
            this.xhv.x2(canvas);
        }
    }

    private void gyi(boolean z2) {
        if (!z2 || getEndIconDrawable() == null) {
            C4156g.m15060k(this, this.tlhn, this.tgs, this.yl25);
            return;
        }
        Drawable drawableMutate = androidx.core.graphics.drawable.zy.ki(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.zy.n7h(drawableMutate, this.f25231t.cdj());
        this.tlhn.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: h */
    private int m15018h() {
        return this.az == 1 ? com.google.android.material.color.kja0.x2(com.google.android.material.color.kja0.m14283n(this, C6095k.zy.f80274sc, 0), this.am) : this.am;
    }

    @lvui
    /* JADX INFO: renamed from: i */
    private Rect m15019i(@lvui Rect rect) {
        if (this.f25236y == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.be;
        float fJk = this.xhv.jk();
        rect2.left = rect.left + this.f25236y.getCompoundPaddingLeft();
        rect2.top = t8r(rect, fJk);
        rect2.right = rect.right - this.f25236y.getCompoundPaddingRight();
        rect2.bottom = ki(rect, rect2, fJk);
        return rect2;
    }

    private void i9jn(boolean z2, boolean z3) {
        int defaultColor = this.ndjo.getDefaultColor();
        int colorForState = this.ndjo.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.ndjo.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.ad = colorForState2;
        } else if (z3) {
            this.ad = colorForState;
        } else {
            this.ad = defaultColor;
        }
    }

    private void jp0y(Canvas canvas) {
        C4108p c4108p;
        if (this.in == null || (c4108p = this.id) == null) {
            return;
        }
        c4108p.draw(canvas);
        if (this.f25236y.isFocused()) {
            Rect bounds = this.in.getBounds();
            Rect bounds2 = this.id.getBounds();
            float fJp0y = this.xhv.jp0y();
            int iCenterX = bounds2.centerX();
            bounds.left = C3910k.zy(iCenterX, bounds2.left, fJp0y);
            bounds.right = C3910k.zy(iCenterX, bounds2.right, fJp0y);
            this.in.draw(canvas);
        }
    }

    private int ki(@lvui Rect rect, @lvui Rect rect2, float f2) {
        return nn86() ? (int) (rect2.top + f2) : rect.bottom - this.f25236y.getCompoundPaddingBottom();
    }

    private void kja0() {
        int i2 = this.az;
        if (i2 == 0) {
            this.an = null;
            this.id = null;
            this.in = null;
            return;
        }
        if (i2 == 1) {
            this.an = new C4108p(this.bl);
            this.id = new C4108p();
            this.in = new C4108p();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(this.az + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.bb || (this.an instanceof com.google.android.material.textfield.zy)) {
                this.an = new C4108p(this.bl);
            } else {
                this.an = new com.google.android.material.textfield.zy(this.bl);
            }
            this.id = null;
            this.in = null;
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m15021l() {
        return this.xk5.getVisibility() == 0;
    }

    private void ltg8() {
        if (this.f25236y == null) {
            return;
        }
        C0683f.u38j(this.f67920ab, getContext().getResources().getDimensionPixelSize(C6095k.g.p996), this.f25236y.getPaddingTop(), (x9kr() || m15021l()) ? 0 : C0683f.bf2(this.f25236y), this.f25236y.getPaddingBottom());
    }

    private static void lv5(@lvui CheckableImageButton checkableImageButton, @dd View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ch(checkableImageButton, onLongClickListener);
    }

    private void lvui() {
        TextView textView = this.f25213b;
        if (textView == null || !this.f25224m) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.lvui.toq(this.f25222k, this.f67921bo);
        this.f25213b.setVisibility(4);
    }

    /* JADX INFO: renamed from: m */
    private void m15022m() {
        if (mcp()) {
            RectF rectF = this.aj;
            this.xhv.kja0(rectF, this.f25236y.getWidth(), this.f25236y.getGravity());
            n7h(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.ax);
            ((com.google.android.material.textfield.zy) this.an).r8s8(rectF);
        }
    }

    private boolean mcp() {
        return this.bb && !TextUtils.isEmpty(this.bp) && (this.an instanceof com.google.android.material.textfield.zy);
    }

    private void mu() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f25214c;
        if (textView != null) {
            t8iq(textView, this.f25217f ? this.f25216e : this.f25221j);
            if (!this.f25217f && (colorStateList2 = this.f25233v) != null) {
                this.f25214c.setTextColor(colorStateList2);
            }
            if (!this.f25217f || (colorStateList = this.f25215d) == null) {
                return;
            }
            this.f25214c.setTextColor(colorStateList);
        }
    }

    private void n7h(@lvui RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.bg;
        rectF.left = f2 - i2;
        rectF.right += i2;
    }

    private boolean ni7() {
        return this.ax > -1 && this.ad != 0;
    }

    private static void nmn5(@lvui CheckableImageButton checkableImageButton, @dd View.OnClickListener onClickListener, @dd View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        ch(checkableImageButton, onLongClickListener);
    }

    private boolean nn86() {
        return this.az == 1 && this.f25236y.getMinLines() <= 1;
    }

    /* JADX INFO: renamed from: o */
    private void m15024o() {
        kja0();
        m15031x();
        m4();
        dr();
        m15025p();
        if (this.az != 0) {
            d8wk();
        }
    }

    private void o1t() {
        if (mcp()) {
            ((com.google.android.material.textfield.zy) this.an).i9jn();
        }
    }

    private int oc(int i2, boolean z2) {
        int compoundPaddingLeft = i2 + this.f25236y.getCompoundPaddingLeft();
        return (getPrefixText() == null || z2) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    /* JADX INFO: renamed from: p */
    private void m15025p() {
        if (this.f25236y == null || this.az != 1) {
            return;
        }
        if (com.google.android.material.resources.zy.m14755p(getContext())) {
            EditText editText = this.f25236y;
            C0683f.u38j(editText, C0683f.i1(editText), getResources().getDimensionPixelSize(C6095k.g.ahb), C0683f.bf2(this.f25236y), getResources().getDimensionPixelSize(C6095k.g.fupf));
        } else if (com.google.android.material.resources.zy.m14757s(getContext())) {
            EditText editText2 = this.f25236y;
            C0683f.u38j(editText2, C0683f.i1(editText2), getResources().getDimensionPixelSize(C6095k.g.cyg), C0683f.bf2(this.f25236y), getResources().getDimensionPixelSize(C6095k.g.wkrb));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void py(int i2) {
        if (i2 != 0 || this.zsl) {
            lvui();
        } else {
            c8jq();
        }
    }

    private boolean qo() {
        int iMax;
        if (this.f25236y == null || this.f25236y.getMeasuredHeight() >= (iMax = Math.max(this.f25225n.getMeasuredHeight(), this.f25228q.getMeasuredHeight()))) {
            return false;
        }
        this.f25236y.setMinimumHeight(iMax);
        return true;
    }

    private void qrj() {
        if (this.id == null || this.in == null) {
            return;
        }
        if (ni7()) {
            this.id.m14867x(this.f25236y.isFocused() ? ColorStateList.valueOf(this.xy8) : ColorStateList.valueOf(this.ad));
            this.in.m14867x(ColorStateList.valueOf(this.ad));
        }
        invalidate();
    }

    private void r8s8() {
        int visibility = this.f67920ab.getVisibility();
        int i2 = (this.f25234w == null || uv6()) ? 8 : 0;
        if (visibility != i2) {
            getEndIconDelegate().zy(i2 == 0);
        }
        tfm();
        this.f67920ab.setVisibility(i2);
        qkj8();
    }

    /* JADX INFO: renamed from: s */
    private void m15027s() {
        TextView textView = this.f25213b;
        if (textView != null) {
            this.f25222k.addView(textView);
            this.f25213b.setVisibility(0);
        }
    }

    private void setEditText(EditText editText) {
        if (this.f25236y != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.bu != 3 && !(editText instanceof TextInputEditText)) {
            Log.i(us2t, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f25236y = editText;
        int i2 = this.f25227p;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.f25220i);
        }
        int i3 = this.f25219h;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.f25237z);
        }
        m15024o();
        setTextInputAccessibilityDelegate(new C4151n(this));
        this.xhv.was(this.f25236y.getTypeface());
        this.xhv.c8jq(this.f25236y.getTextSize());
        this.xhv.lv5(this.f25236y.getLetterSpacing());
        int gravity = this.f25236y.getGravity();
        this.xhv.i1((gravity & (-113)) | 48);
        this.xhv.y2(gravity);
        this.f25236y.addTextChangedListener(new C4150k());
        if (this.hp == null) {
            this.hp = this.f25236y.getHintTextColors();
        }
        if (this.bb) {
            if (TextUtils.isEmpty(this.bp)) {
                CharSequence hint = this.f25236y.getHint();
                this.f25230s = hint;
                setHint(hint);
                this.f25236y.setHint((CharSequence) null);
            }
            this.bv = true;
        }
        if (this.f25214c != null) {
            ikck(this.f25236y.getText().length());
        }
        fnq8();
        this.f25231t.m15052g();
        this.f25228q.bringToFront();
        this.f25225n.bringToFront();
        this.f25218g.bringToFront();
        this.xk5.bringToFront();
        a9();
        ltg8();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        was(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.bp)) {
            return;
        }
        this.bp = charSequence;
        this.xhv.d8wk(charSequence);
        if (this.zsl) {
            return;
        }
        m15022m();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f25224m == z2) {
            return;
        }
        if (z2) {
            m15027s();
        } else {
            zp();
            this.f25213b = null;
        }
        this.f25224m = z2;
    }

    /* JADX INFO: renamed from: t */
    private n7h m15028t() {
        n7h n7hVar = new n7h();
        n7hVar.gyi(eht);
        n7hVar.xwq3(C3910k.f23771k);
        return n7hVar;
    }

    private int t8r(@lvui Rect rect, float f2) {
        return nn86() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.f25236y.getCompoundPaddingTop();
    }

    private void tfm() {
        this.f25218g.setVisibility((this.tlhn.getVisibility() != 0 || m15021l()) ? 8 : 0);
        this.f25225n.setVisibility(x9kr() || m15021l() || ((this.f25234w == null || uv6()) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    /* JADX INFO: renamed from: u */
    private boolean m15029u() {
        return (this.xk5.getVisibility() == 0 || ((d2ok() && x9kr()) || this.f25234w != null)) && this.f25225n.getMeasuredWidth() > 0;
    }

    /* JADX INFO: renamed from: v */
    private void m15030v() {
        if (this.f25214c != null) {
            EditText editText = this.f25236y;
            ikck(editText == null ? 0 : editText.getText().length());
        }
    }

    private void vq() {
        if (this.bu == 3 && this.az == 2) {
            ((C4160q) this.bd.get(3)).dd((AutoCompleteTextView) this.f25236y);
        }
    }

    private void was(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f25236y;
        boolean z5 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f25236y;
        boolean z6 = editText2 != null && editText2.hasFocus();
        boolean zQrj = this.f25231t.qrj();
        ColorStateList colorStateList2 = this.hp;
        if (colorStateList2 != null) {
            this.xhv.bf2(colorStateList2);
            this.xhv.bo(this.hp);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.hp;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.wra) : this.wra;
            this.xhv.bf2(ColorStateList.valueOf(colorForState));
            this.xhv.bo(ColorStateList.valueOf(colorForState));
        } else if (zQrj) {
            this.xhv.bf2(this.f25231t.ki());
        } else if (this.f25217f && (textView = this.f25214c) != null) {
            this.xhv.bf2(textView.getTextColors());
        } else if (z6 && (colorStateList = this.cw14) != null) {
            this.xhv.bf2(colorStateList);
        }
        if (z5 || !this.zm || (isEnabled() && z6)) {
            if (z3 || this.zsl) {
                wvg(z2);
                return;
            }
            return;
        }
        if (z3 || !this.zsl) {
            d3(z2);
        }
    }

    private void wo() {
        this.xk5.setVisibility(getErrorIconDrawable() != null && this.f25231t.a9() && this.f25231t.qrj() ? 0 : 8);
        tfm();
        ltg8();
        if (d2ok()) {
            return;
        }
        qkj8();
    }

    private void wvg(boolean z2) {
        ValueAnimator valueAnimator = this.wh6;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.wh6.cancel();
        }
        if (z2 && this.ut) {
            ld6(1.0f);
        } else {
            this.xhv.xwq3(1.0f);
        }
        this.zsl = false;
        if (mcp()) {
            m15022m();
        }
        zsr0();
        this.f25228q.m15076p(false);
        r8s8();
    }

    /* JADX INFO: renamed from: x */
    private void m15031x() {
        if (y2()) {
            C0683f.wlev(this.f25236y, this.an);
        }
    }

    private void x2() {
        C4108p c4108p = this.an;
        if (c4108p == null) {
            return;
        }
        kja0 shapeAppearanceModel = c4108p.getShapeAppearanceModel();
        kja0 kja0Var = this.bl;
        if (shapeAppearanceModel != kja0Var) {
            this.an.setShapeAppearanceModel(kja0Var);
            vq();
        }
        if (zurt()) {
            this.an.mu(this.ax, this.ad);
        }
        int iM15018h = m15018h();
        this.am = iM15018h;
        this.an.m14867x(ColorStateList.valueOf(iM15018h));
        if (this.bu == 3) {
            this.f25236y.getBackground().invalidateSelf();
        }
        qrj();
        invalidate();
    }

    private void xwq3(@lvui Rect rect) {
        C4108p c4108p = this.id;
        if (c4108p != null) {
            int i2 = rect.bottom;
            c4108p.setBounds(rect.left, i2 - this.bq, rect.right, i2);
        }
        C4108p c4108p2 = this.in;
        if (c4108p2 != null) {
            int i3 = rect.bottom;
            c4108p2.setBounds(rect.left, i3 - this.ac, rect.right, i3);
        }
    }

    private boolean y2() {
        EditText editText = this.f25236y;
        return (editText == null || this.an == null || editText.getBackground() != null || this.az == 0) ? false : true;
    }

    private static void y9n(@lvui ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                y9n((ViewGroup) childAt, z2);
            }
        }
    }

    private void yz() {
        if (!mcp() || this.zsl) {
            return;
        }
        o1t();
        m15022m();
    }

    private void zp() {
        TextView textView = this.f25213b;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void zsr0() {
        EditText editText = this.f25236y;
        py(editText == null ? 0 : editText.getText().length());
    }

    private boolean zurt() {
        return this.az == 2 && ni7();
    }

    /* JADX INFO: renamed from: a */
    public void m15032a(@lvui InterfaceC4153s interfaceC4153s) {
        this.w97r.remove(interfaceC4153s);
    }

    public void a98o(@lvui InterfaceC4154y interfaceC4154y) {
        this.bc.remove(interfaceC4154y);
    }

    @Override // android.view.ViewGroup
    public void addView(@lvui View view, int i2, @lvui ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f25222k.addView(view, layoutParams2);
        this.f25222k.setLayoutParams(layoutParams);
        d8wk();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: b */
    public void m15033b() {
        C4156g.zy(this, this.tlhn, this.tgs);
    }

    public void bf2() {
        C4156g.zy(this, this.xk5, this.s8y);
    }

    /* JADX INFO: renamed from: c */
    public boolean m15034c() {
        return this.ut;
    }

    public boolean dd() {
        return this.tlhn.m14522k();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@lvui ViewStructure viewStructure, int i2) {
        EditText editText = this.f25236y;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f25230s != null) {
            boolean z2 = this.bv;
            this.bv = false;
            CharSequence hint = editText.getHint();
            this.f25236y.setHint(this.f25230s);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f25236y.setHint(hint);
                this.bv = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        viewStructure.setChildCount(this.f25222k.getChildCount());
        for (int i3 = 0; i3 < this.f25222k.getChildCount(); i3++) {
            View childAt = this.f25222k.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i2);
            if (childAt == this.f25236y) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(@lvui SparseArray<Parcelable> sparseArray) {
        this.qns = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.qns = false;
    }

    @Override // android.view.View
    public void draw(@lvui Canvas canvas) {
        super.draw(canvas);
        gvn7(canvas);
        jp0y(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.ls9) {
            return;
        }
        this.ls9 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.toq toqVar = this.xhv;
        boolean zWo = toqVar != null ? toqVar.wo(drawableState) | false : false;
        if (this.f25236y != null) {
            g1(C0683f.v0af(this) && isEnabled());
        }
        fnq8();
        m4();
        if (zWo) {
            invalidate();
        }
        this.ls9 = false;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: e */
    public boolean m15035e() {
        return this.bv;
    }

    @Deprecated
    public void ek5k(boolean z2) {
        if (this.bu == 1) {
            this.tlhn.performClick();
            if (z2) {
                this.tlhn.jumpDrawablesToCurrentState();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m15036f() {
        return this.f25231t.fti();
    }

    public void f7l8(@lvui InterfaceC4154y interfaceC4154y) {
        this.bc.add(interfaceC4154y);
        if (this.f25236y != null) {
            interfaceC4154y.mo15043k(this);
        }
    }

    void fnq8() {
        Drawable background;
        TextView textView;
        EditText editText = this.f25236y;
        if (editText == null || this.az != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (oc.m696k(background)) {
            background = background.mutate();
        }
        if (this.f25231t.qrj()) {
            background.setColorFilter(ld6.m629n(this.f25231t.cdj(), PorterDuff.Mode.SRC_IN));
        } else if (this.f25217f && (textView = this.f25214c) != null) {
            background.setColorFilter(ld6.m629n(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            androidx.core.graphics.drawable.zy.zy(background);
            this.f25236y.refreshDrawableState();
        }
    }

    public void fu4() {
        this.bc.clear();
    }

    void g1(boolean z2) {
        was(z2, false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f25236y;
        return editText != null ? editText.getBaseline() + getPaddingTop() + fn3e() : super.getBaseline();
    }

    @lvui
    C4108p getBoxBackground() {
        int i2 = this.az;
        if (i2 == 1 || i2 == 2) {
            return this.an;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.am;
    }

    public int getBoxBackgroundMode() {
        return this.az;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.ba;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return C4058z.ld6(this) ? this.bl.m14824p().mo14816k(this.aj) : this.bl.x2().mo14816k(this.aj);
    }

    public float getBoxCornerRadiusBottomStart() {
        return C4058z.ld6(this) ? this.bl.x2().mo14816k(this.aj) : this.bl.m14824p().mo14816k(this.aj);
    }

    public float getBoxCornerRadiusTopEnd() {
        return C4058z.ld6(this) ? this.bl.ki().mo14816k(this.aj) : this.bl.m14823i().mo14816k(this.aj);
    }

    public float getBoxCornerRadiusTopStart() {
        return C4058z.ld6(this) ? this.bl.m14823i().mo14816k(this.aj) : this.bl.ki().mo14816k(this.aj);
    }

    public int getBoxStrokeColor() {
        return this.q7k9;
    }

    @dd
    public ColorStateList getBoxStrokeErrorColor() {
        return this.ndjo;
    }

    public int getBoxStrokeWidth() {
        return this.bq;
    }

    public int getBoxStrokeWidthFocused() {
        return this.ac;
    }

    public int getCounterMaxLength() {
        return this.f25223l;
    }

    @dd
    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f25229r && this.f25217f && (textView = this.f25214c) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @dd
    public ColorStateList getCounterOverflowTextColor() {
        return this.f25233v;
    }

    @dd
    public ColorStateList getCounterTextColor() {
        return this.f25233v;
    }

    @dd
    public ColorStateList getDefaultHintTextColor() {
        return this.hp;
    }

    @dd
    public EditText getEditText() {
        return this.f25236y;
    }

    @dd
    public CharSequence getEndIconContentDescription() {
        return this.tlhn.getContentDescription();
    }

    @dd
    public Drawable getEndIconDrawable() {
        return this.tlhn.getDrawable();
    }

    public int getEndIconMode() {
        return this.bu;
    }

    @lvui
    CheckableImageButton getEndIconView() {
        return this.tlhn;
    }

    @dd
    public CharSequence getError() {
        if (this.f25231t.a9()) {
            return this.f25231t.m15053h();
        }
        return null;
    }

    @dd
    public CharSequence getErrorContentDescription() {
        return this.f25231t.kja0();
    }

    @x2
    public int getErrorCurrentTextColors() {
        return this.f25231t.cdj();
    }

    @dd
    public Drawable getErrorIconDrawable() {
        return this.xk5.getDrawable();
    }

    @yz
    final int getErrorTextCurrentColor() {
        return this.f25231t.cdj();
    }

    @dd
    public CharSequence getHelperText() {
        if (this.f25231t.fti()) {
            return this.f25231t.t8r();
        }
        return null;
    }

    @x2
    public int getHelperTextCurrentTextColor() {
        return this.f25231t.zurt();
    }

    @dd
    public CharSequence getHint() {
        if (this.bb) {
            return this.bp;
        }
        return null;
    }

    @yz
    final float getHintCollapsedTextHeight() {
        return this.xhv.ki();
    }

    @yz
    final int getHintCurrentCollapsedTextColor() {
        return this.xhv.ni7();
    }

    @dd
    public ColorStateList getHintTextColor() {
        return this.cw14;
    }

    public int getMaxEms() {
        return this.f25219h;
    }

    @InterfaceC7833l
    public int getMaxWidth() {
        return this.f25237z;
    }

    public int getMinEms() {
        return this.f25227p;
    }

    @InterfaceC7833l
    public int getMinWidth() {
        return this.f25220i;
    }

    @Deprecated
    @dd
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.tlhn.getContentDescription();
    }

    @Deprecated
    @dd
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.tlhn.getDrawable();
    }

    @dd
    public CharSequence getPlaceholderText() {
        if (this.f25224m) {
            return this.f25226o;
        }
        return null;
    }

    @hb
    public int getPlaceholderTextAppearance() {
        return this.f25235x;
    }

    @dd
    public ColorStateList getPlaceholderTextColor() {
        return this.f25212a;
    }

    @dd
    public CharSequence getPrefixText() {
        return this.f25228q.m15074k();
    }

    @dd
    public ColorStateList getPrefixTextColor() {
        return this.f25228q.toq();
    }

    @lvui
    public TextView getPrefixTextView() {
        return this.f25228q.zy();
    }

    @dd
    public CharSequence getStartIconContentDescription() {
        return this.f25228q.m15077q();
    }

    @dd
    public Drawable getStartIconDrawable() {
        return this.f25228q.m15075n();
    }

    @dd
    public CharSequence getSuffixText() {
        return this.f25234w;
    }

    @dd
    public ColorStateList getSuffixTextColor() {
        return this.f67920ab.getTextColors();
    }

    @lvui
    public TextView getSuffixTextView() {
        return this.f67920ab;
    }

    @dd
    public Typeface getTypeface() {
        return this.bs;
    }

    public boolean hb() {
        return this.f25228q.m15079y();
    }

    @yz
    final boolean hyr() {
        return this.f25231t.fu4();
    }

    public void i1() {
        this.f25228q.ld6();
    }

    void ikck(int i2) {
        boolean z2 = this.f25217f;
        int i3 = this.f25223l;
        if (i3 == -1) {
            this.f25214c.setText(String.valueOf(i2));
            this.f25214c.setContentDescription(null);
            this.f25217f = false;
        } else {
            this.f25217f = i2 > i3;
            m15016d(getContext(), this.f25214c, i2, this.f25223l, this.f25217f);
            if (z2 != this.f25217f) {
                mu();
            }
            this.f25214c.setText(C0616k.zy().cdj(getContext().getString(C6095k.qrj.f79818jp0y, Integer.valueOf(i2), Integer.valueOf(this.f25223l))));
        }
        if (this.f25236y == null || z2 == this.f25217f) {
            return;
        }
        g1(false);
        m4();
        fnq8();
    }

    /* JADX INFO: renamed from: j */
    public boolean m15037j() {
        return this.f25228q.m15078s();
    }

    @yz
    boolean jk() {
        return mcp() && ((com.google.android.material.textfield.zy) this.an).py();
    }

    @yz
    void ld6(float f2) {
        if (this.xhv.jp0y() == f2) {
            return;
        }
        if (this.wh6 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.wh6 = valueAnimator;
            valueAnimator.setInterpolator(C3910k.f67312toq);
            this.wh6.setDuration(167L);
            this.wh6.addUpdateListener(new C4152q());
        }
        this.wh6.setFloatValues(this.xhv.jp0y(), f2);
        this.wh6.start();
    }

    public boolean lrht() {
        return this.bb;
    }

    void m4() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.an == null || this.az == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f25236y) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f25236y) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.ad = this.wra;
        } else if (this.f25231t.qrj()) {
            if (this.ndjo != null) {
                i9jn(z3, z2);
            } else {
                this.ad = this.f25231t.cdj();
            }
        } else if (!this.f25217f || (textView = this.f25214c) == null) {
            if (z3) {
                this.ad = this.q7k9;
            } else if (z2) {
                this.ad = this.th6;
            } else {
                this.ad = this.xy8;
            }
        } else if (this.ndjo != null) {
            i9jn(z3, z2);
        } else {
            this.ad = textView.getCurrentTextColor();
        }
        wo();
        bf2();
        i1();
        m15033b();
        if (getEndIconDelegate().mo15069q()) {
            gyi(this.f25231t.qrj());
        }
        if (this.az == 2) {
            int i2 = this.ax;
            if (z3 && isEnabled()) {
                this.ax = this.ac;
            } else {
                this.ax = this.bq;
            }
            if (this.ax != i2) {
                yz();
            }
        }
        if (this.az == 1) {
            if (!isEnabled()) {
                this.am = this.xqx;
            } else if (z2 && !z3) {
                this.am = this.ei;
            } else if (z3) {
                this.am = this.zr5t;
            } else {
                this.am = this.d1cy;
            }
        }
        x2();
    }

    public boolean n5r1() {
        return this.zm;
    }

    public boolean ncyb() {
        return this.f25231t.a9();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@lvui Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.xhv.m14610e(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.f25236y;
        if (editText != null) {
            Rect rect = this.ay;
            C4052q.m14583k(this, editText, rect);
            xwq3(rect);
            if (this.bb) {
                this.xhv.c8jq(this.f25236y.getTextSize());
                int gravity = this.f25236y.getGravity();
                this.xhv.i1((gravity & (-113)) | 48);
                this.xhv.y2(gravity);
                this.xhv.yz(cdj(rect));
                this.xhv.nmn5(m15019i(rect));
                this.xhv.m14612j();
                if (!mcp() || this.zsl) {
                    return;
                }
                m15022m();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        boolean zQo = qo();
        boolean zQkj8 = qkj8();
        if (zQo || zQkj8) {
            this.f25236y.post(new zy());
        }
        gbni();
        ltg8();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@dd Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.f25240q);
        if (savedState.f25239n) {
            this.tlhn.post(new toq());
        }
        setHint(savedState.f25238g);
        setHelperText(savedState.f25242y);
        setPlaceholderText(savedState.f25241s);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z2 = false;
        boolean z3 = i2 == 1;
        boolean z5 = this.as;
        if (z3 != z5) {
            if (z3 && !z5) {
                z2 = true;
            }
            float fMo14816k = this.bl.ki().mo14816k(this.aj);
            float fMo14816k2 = this.bl.m14823i().mo14816k(this.aj);
            float fMo14816k3 = this.bl.m14824p().mo14816k(this.aj);
            float fMo14816k4 = this.bl.x2().mo14816k(this.aj);
            float f2 = z2 ? fMo14816k : fMo14816k2;
            if (z2) {
                fMo14816k = fMo14816k2;
            }
            float f3 = z2 ? fMo14816k3 : fMo14816k4;
            if (z2) {
                fMo14816k3 = fMo14816k4;
            }
            setBoxCornerRadii(f2, fMo14816k, f3, fMo14816k3);
        }
    }

    @Override // android.view.View
    @dd
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f25231t.qrj()) {
            savedState.f25240q = getError();
        }
        savedState.f25239n = d2ok() && this.tlhn.isChecked();
        savedState.f25238g = getHint();
        savedState.f25242y = getHelperText();
        savedState.f25241s = getPlaceholderText();
        return savedState;
    }

    boolean qkj8() {
        boolean z2;
        if (this.f25236y == null) {
            return false;
        }
        boolean z3 = true;
        if (bo()) {
            int measuredWidth = this.f25228q.getMeasuredWidth() - this.f25236y.getPaddingLeft();
            if (this.k0 == null || this.ar != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.k0 = colorDrawable;
                this.ar = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrM3689y = t8r.m3689y(this.f25236y);
            Drawable drawable = drawableArrM3689y[0];
            Drawable drawable2 = this.k0;
            if (drawable != drawable2) {
                t8r.ni7(this.f25236y, drawable2, drawableArrM3689y[1], drawableArrM3689y[2], drawableArrM3689y[3]);
                z2 = true;
            }
            z2 = false;
        } else {
            if (this.k0 != null) {
                Drawable[] drawableArrM3689y2 = t8r.m3689y(this.f25236y);
                t8r.ni7(this.f25236y, null, drawableArrM3689y2[1], drawableArrM3689y2[2], drawableArrM3689y2[3]);
                this.k0 = null;
                z2 = true;
            }
            z2 = false;
        }
        if (m15029u()) {
            int measuredWidth2 = this.f67920ab.getMeasuredWidth() - this.f25236y.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + androidx.core.view.ki.zy((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] drawableArrM3689y3 = t8r.m3689y(this.f25236y);
            Drawable drawable3 = this.zmmu;
            if (drawable3 == null || this.sk1t == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.zmmu = colorDrawable2;
                    this.sk1t = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrM3689y3[2];
                Drawable drawable5 = this.zmmu;
                if (drawable4 != drawable5) {
                    this.dy = drawable4;
                    t8r.ni7(this.f25236y, drawableArrM3689y3[0], drawableArrM3689y3[1], drawable5, drawableArrM3689y3[3]);
                } else {
                    z3 = z2;
                }
            } else {
                this.sk1t = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                t8r.ni7(this.f25236y, drawableArrM3689y3[0], drawableArrM3689y3[1], this.zmmu, drawableArrM3689y3[3]);
            }
        } else {
            if (this.zmmu == null) {
                return z2;
            }
            Drawable[] drawableArrM3689y4 = t8r.m3689y(this.f25236y);
            if (drawableArrM3689y4[2] == this.zmmu) {
                t8r.ni7(this.f25236y, drawableArrM3689y4[0], drawableArrM3689y4[1], this.dy, drawableArrM3689y4[3]);
            } else {
                z3 = z2;
            }
            this.zmmu = null;
        }
        return z3;
    }

    /* JADX INFO: renamed from: r */
    public boolean m15038r() {
        return this.f25229r;
    }

    public void setBoxBackgroundColor(@x2 int i2) {
        if (this.am != i2) {
            this.am = i2;
            this.d1cy = i2;
            this.zr5t = i2;
            this.ei = i2;
            x2();
        }
    }

    public void setBoxBackgroundColorResource(@zy.n7h int i2) {
        setBoxBackgroundColor(C0498q.m2252g(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(@lvui ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.d1cy = defaultColor;
        this.am = defaultColor;
        this.xqx = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.zr5t = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.ei = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        x2();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.az) {
            return;
        }
        this.az = i2;
        if (this.f25236y != null) {
            m15024o();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.ba = i2;
    }

    public void setBoxCornerRadii(float f2, float f3, float f4, float f5) {
        boolean zLd6 = C4058z.ld6(this);
        this.as = zLd6;
        float f6 = zLd6 ? f3 : f2;
        if (!zLd6) {
            f2 = f3;
        }
        float f7 = zLd6 ? f5 : f4;
        if (!zLd6) {
            f4 = f5;
        }
        C4108p c4108p = this.an;
        if (c4108p != null && c4108p.n5r1() == f6 && this.an.hyr() == f2 && this.an.m14858i() == f7 && this.an.fn3e() == f4) {
            return;
        }
        this.bl = this.bl.zurt().eqxt(f6).x9kr(f2).fu4(f7).mcp(f4).qrj();
        x2();
    }

    public void setBoxCornerRadiiResources(@InterfaceC7829h int i2, @InterfaceC7829h int i3, @InterfaceC7829h int i4, @InterfaceC7829h int i5) {
        setBoxCornerRadii(getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i3), getContext().getResources().getDimension(i5), getContext().getResources().getDimension(i4));
    }

    public void setBoxStrokeColor(@x2 int i2) {
        if (this.q7k9 != i2) {
            this.q7k9 = i2;
            m4();
        }
    }

    public void setBoxStrokeColorStateList(@lvui ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.xy8 = colorStateList.getDefaultColor();
            this.wra = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.th6 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.q7k9 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.q7k9 != colorStateList.getDefaultColor()) {
            this.q7k9 = colorStateList.getDefaultColor();
        }
        m4();
    }

    public void setBoxStrokeErrorColor(@dd ColorStateList colorStateList) {
        if (this.ndjo != colorStateList) {
            this.ndjo = colorStateList;
            m4();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.bq = i2;
        m4();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.ac = i2;
        m4();
    }

    public void setBoxStrokeWidthFocusedResource(@InterfaceC7829h int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(@InterfaceC7829h int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f25229r != z2) {
            if (z2) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f25214c = appCompatTextView;
                appCompatTextView.setId(C6095k.y.fbr);
                Typeface typeface = this.bs;
                if (typeface != null) {
                    this.f25214c.setTypeface(typeface);
                }
                this.f25214c.setMaxLines(1);
                this.f25231t.m15055n(this.f25214c, 2);
                androidx.core.view.ki.m3352y((ViewGroup.MarginLayoutParams) this.f25214c.getLayoutParams(), getResources().getDimensionPixelOffset(C6095k.g.hw));
                mu();
                m15030v();
            } else {
                this.f25231t.jp0y(this.f25214c, 2);
                this.f25214c = null;
            }
            this.f25229r = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f25223l != i2) {
            if (i2 > 0) {
                this.f25223l = i2;
            } else {
                this.f25223l = -1;
            }
            if (this.f25229r) {
                m15030v();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f25216e != i2) {
            this.f25216e = i2;
            mu();
        }
    }

    public void setCounterOverflowTextColor(@dd ColorStateList colorStateList) {
        if (this.f25215d != colorStateList) {
            this.f25215d = colorStateList;
            mu();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f25221j != i2) {
            this.f25221j = i2;
            mu();
        }
    }

    public void setCounterTextColor(@dd ColorStateList colorStateList) {
        if (this.f25233v != colorStateList) {
            this.f25233v = colorStateList;
            mu();
        }
    }

    public void setDefaultHintTextColor(@dd ColorStateList colorStateList) {
        this.hp = colorStateList;
        this.cw14 = colorStateList;
        if (this.f25236y != null) {
            g1(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        y9n(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.tlhn.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.tlhn.setCheckable(z2);
    }

    public void setEndIconContentDescription(@nn86 int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconDrawable(@fn3e int i2) {
        setEndIconDrawable(i2 != 0 ? C6045k.toq(getContext(), i2) : null);
    }

    public void setEndIconMode(int i2) {
        int i3 = this.bu;
        if (i3 == i2) {
            return;
        }
        this.bu = i2;
        fti(i3);
        setEndIconVisible(i2 != 0);
        if (getEndIconDelegate().toq(this.az)) {
            getEndIconDelegate().mo15068k();
            C4156g.m15060k(this, this.tlhn, this.tgs, this.yl25);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.az + " is not supported by the end icon mode " + i2);
    }

    public void setEndIconOnClickListener(@dd View.OnClickListener onClickListener) {
        nmn5(this.tlhn, onClickListener, this.vb6);
    }

    public void setEndIconOnLongClickListener(@dd View.OnLongClickListener onLongClickListener) {
        this.vb6 = onLongClickListener;
        lv5(this.tlhn, onLongClickListener);
    }

    public void setEndIconTintList(@dd ColorStateList colorStateList) {
        if (this.tgs != colorStateList) {
            this.tgs = colorStateList;
            C4156g.m15060k(this, this.tlhn, colorStateList, this.yl25);
        }
    }

    public void setEndIconTintMode(@dd PorterDuff.Mode mode) {
        if (this.yl25 != mode) {
            this.yl25 = mode;
            C4156g.m15060k(this, this.tlhn, this.tgs, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        if (x9kr() != z2) {
            this.tlhn.setVisibility(z2 ? 0 : 8);
            tfm();
            ltg8();
            qkj8();
        }
    }

    public void setError(@dd CharSequence charSequence) {
        if (!this.f25231t.a9()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f25231t.o1t();
        } else {
            this.f25231t.hyr(charSequence);
        }
    }

    public void setErrorContentDescription(@dd CharSequence charSequence) {
        this.f25231t.d3(charSequence);
    }

    public void setErrorEnabled(boolean z2) {
        this.f25231t.oc(z2);
    }

    public void setErrorIconDrawable(@fn3e int i2) {
        setErrorIconDrawable(i2 != 0 ? C6045k.toq(getContext(), i2) : null);
        bf2();
    }

    public void setErrorIconOnClickListener(@dd View.OnClickListener onClickListener) {
        nmn5(this.xk5, onClickListener, this.k6e);
    }

    public void setErrorIconOnLongClickListener(@dd View.OnLongClickListener onLongClickListener) {
        this.k6e = onLongClickListener;
        lv5(this.xk5, onLongClickListener);
    }

    public void setErrorIconTintList(@dd ColorStateList colorStateList) {
        if (this.s8y != colorStateList) {
            this.s8y = colorStateList;
            C4156g.m15060k(this, this.xk5, colorStateList, this.mjvl);
        }
    }

    public void setErrorIconTintMode(@dd PorterDuff.Mode mode) {
        if (this.mjvl != mode) {
            this.mjvl = mode;
            C4156g.m15060k(this, this.xk5, this.s8y, mode);
        }
    }

    public void setErrorTextAppearance(@hb int i2) {
        this.f25231t.eqxt(i2);
    }

    public void setErrorTextColor(@dd ColorStateList colorStateList) {
        this.f25231t.d2ok(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.zm != z2) {
            this.zm = z2;
            g1(false);
        }
    }

    public void setHelperText(@dd CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m15036f()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!m15036f()) {
                setHelperTextEnabled(true);
            }
            this.f25231t.m15051f(charSequence);
        }
    }

    public void setHelperTextColor(@dd ColorStateList colorStateList) {
        this.f25231t.dd(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        this.f25231t.m15056r(z2);
    }

    public void setHelperTextTextAppearance(@hb int i2) {
        this.f25231t.lvui(i2);
    }

    public void setHint(@dd CharSequence charSequence) {
        if (this.bb) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.ut = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.bb) {
            this.bb = z2;
            if (z2) {
                CharSequence hint = this.f25236y.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.bp)) {
                        setHint(hint);
                    }
                    this.f25236y.setHint((CharSequence) null);
                }
                this.bv = true;
            } else {
                this.bv = false;
                if (!TextUtils.isEmpty(this.bp) && TextUtils.isEmpty(this.f25236y.getHint())) {
                    this.f25236y.setHint(this.bp);
                }
                setHintInternal(null);
            }
            if (this.f25236y != null) {
                d8wk();
            }
        }
    }

    public void setHintTextAppearance(@hb int i2) {
        this.xhv.y9n(i2);
        this.cw14 = this.xhv.m14611h();
        if (this.f25236y != null) {
            g1(false);
            d8wk();
        }
    }

    public void setHintTextColor(@dd ColorStateList colorStateList) {
        if (this.cw14 != colorStateList) {
            if (this.hp == null) {
                this.xhv.bf2(colorStateList);
            }
            this.cw14 = colorStateList;
            if (this.f25236y != null) {
                g1(false);
            }
        }
    }

    public void setMaxEms(int i2) {
        this.f25219h = i2;
        EditText editText = this.f25236y;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(@InterfaceC7833l int i2) {
        this.f25237z = i2;
        EditText editText = this.f25236y;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(@InterfaceC7829h int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f25227p = i2;
        EditText editText = this.f25236y;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(@InterfaceC7833l int i2) {
        this.f25220i = i2;
        EditText editText = this.f25236y;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(@InterfaceC7829h int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@nn86 int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@fn3e int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? C6045k.toq(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (z2 && this.bu != 1) {
            setEndIconMode(1);
        } else {
            if (z2) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@dd ColorStateList colorStateList) {
        this.tgs = colorStateList;
        C4156g.m15060k(this, this.tlhn, colorStateList, this.yl25);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@dd PorterDuff.Mode mode) {
        this.yl25 = mode;
        C4156g.m15060k(this, this.tlhn, this.tgs, mode);
    }

    public void setPlaceholderText(@dd CharSequence charSequence) {
        if (this.f25213b == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f25213b = appCompatTextView;
            appCompatTextView.setId(C6095k.y.k2b8);
            C0683f.o05(this.f25213b, 2);
            n7h n7hVarM15028t = m15028t();
            this.f25232u = n7hVarM15028t;
            n7hVarM15028t.mu(n5ij);
            this.f67921bo = m15028t();
            setPlaceholderTextAppearance(this.f25235x);
            setPlaceholderTextColor(this.f25212a);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f25224m) {
                setPlaceholderTextEnabled(true);
            }
            this.f25226o = charSequence;
        }
        zsr0();
    }

    public void setPlaceholderTextAppearance(@hb int i2) {
        this.f25235x = i2;
        TextView textView = this.f25213b;
        if (textView != null) {
            t8r.a9(textView, i2);
        }
    }

    public void setPlaceholderTextColor(@dd ColorStateList colorStateList) {
        if (this.f25212a != colorStateList) {
            this.f25212a = colorStateList;
            TextView textView = this.f25213b;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@dd CharSequence charSequence) {
        this.f25228q.x2(charSequence);
    }

    public void setPrefixTextAppearance(@hb int i2) {
        this.f25228q.qrj(i2);
    }

    public void setPrefixTextColor(@lvui ColorStateList colorStateList) {
        this.f25228q.n7h(colorStateList);
    }

    public void setStartIconCheckable(boolean z2) {
        this.f25228q.kja0(z2);
    }

    public void setStartIconContentDescription(@nn86 int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(@fn3e int i2) {
        setStartIconDrawable(i2 != 0 ? C6045k.toq(getContext(), i2) : null);
    }

    public void setStartIconOnClickListener(@dd View.OnClickListener onClickListener) {
        this.f25228q.ki(onClickListener);
    }

    public void setStartIconOnLongClickListener(@dd View.OnLongClickListener onLongClickListener) {
        this.f25228q.t8r(onLongClickListener);
    }

    public void setStartIconTintList(@dd ColorStateList colorStateList) {
        this.f25228q.m15073i(colorStateList);
    }

    public void setStartIconTintMode(@dd PorterDuff.Mode mode) {
        this.f25228q.fn3e(mode);
    }

    public void setStartIconVisible(boolean z2) {
        this.f25228q.zurt(z2);
    }

    public void setSuffixText(@dd CharSequence charSequence) {
        this.f25234w = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f67920ab.setText(charSequence);
        r8s8();
    }

    public void setSuffixTextAppearance(@hb int i2) {
        t8r.a9(this.f67920ab, i2);
    }

    public void setSuffixTextColor(@lvui ColorStateList colorStateList) {
        this.f67920ab.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@dd C4151n c4151n) {
        EditText editText = this.f25236y;
        if (editText != null) {
            C0683f.zwy(editText, c4151n);
        }
    }

    public void setTypeface(@dd Typeface typeface) {
        if (typeface != this.bs) {
            this.bs = typeface;
            this.xhv.was(typeface);
            this.f25231t.ncyb(typeface);
            TextView textView = this.f25214c;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void t8iq(@lvui TextView textView, @hb int i2) {
        boolean z2 = true;
        try {
            t8r.a9(textView, i2);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z2 = false;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            t8r.a9(textView, C6095k.n7h.fpn);
            textView.setTextColor(C0498q.m2252g(getContext(), C6095k.n.f79385c8jq));
        }
    }

    final boolean uv6() {
        return this.zsl;
    }

    @Deprecated
    public boolean vyq() {
        return this.bu == 1;
    }

    public boolean x9kr() {
        return this.f25218g.getVisibility() == 0 && this.tlhn.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: y */
    public void m15039y(@lvui InterfaceC4153s interfaceC4153s) {
        this.w97r.add(interfaceC4153s);
    }

    /* JADX INFO: renamed from: z */
    public void m15040z() {
        this.w97r.clear();
    }

    public TextInputLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.v6we);
    }

    public void setEndIconContentDescription(@dd CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.tlhn.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@dd Drawable drawable) {
        this.tlhn.setImageDrawable(drawable);
        if (drawable != null) {
            C4156g.m15060k(this, this.tlhn, this.tgs, this.yl25);
            m15033b();
        }
    }

    public void setStartIconContentDescription(@dd CharSequence charSequence) {
        this.f25228q.m15072h(charSequence);
    }

    public void setStartIconDrawable(@dd Drawable drawable) {
        this.f25228q.cdj(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v108 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50, types: [boolean, int] */
    public TextInputLayout(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int i3;
        ?? r3;
        boolean z2;
        int iFn3e;
        int i4 = afw;
        super(C6070k.zy(context, attributeSet, i2, i4), attributeSet, i2);
        this.f25227p = -1;
        this.f25219h = -1;
        this.f25220i = -1;
        this.f25237z = -1;
        this.f25231t = new com.google.android.material.textfield.f7l8(this);
        this.ay = new Rect();
        this.be = new Rect();
        this.aj = new RectF();
        this.bc = new LinkedHashSet<>();
        this.bu = 0;
        SparseArray<AbstractC4158n> sparseArray = new SparseArray<>();
        this.bd = sparseArray;
        this.w97r = new LinkedHashSet<>();
        com.google.android.material.internal.toq toqVar = new com.google.android.material.internal.toq(this);
        this.xhv = toqVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f25222k = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f25218g = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f25225n = linearLayout;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.f67920ab = appCompatTextView;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        appCompatTextView.setVisibility(8);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        int i5 = C6095k.ld6.f79328ncyb;
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(i5, (ViewGroup) linearLayout, false);
        this.xk5 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(i5, (ViewGroup) frameLayout2, false);
        this.tlhn = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, qrj.f50866zy));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = C3910k.f23771k;
        toqVar.g1(timeInterpolator);
        toqVar.qo(timeInterpolator);
        toqVar.i1(8388659);
        int[] iArr = C6095k.kja0.l5;
        int i6 = C6095k.kja0.f7sp;
        int i7 = C6095k.kja0.st;
        int i8 = C6095k.kja0.dtf;
        int i9 = C6095k.kja0.kn;
        int i10 = C6095k.kja0.h9w7;
        C0184b c0184bLd6 = cdj.ld6(context2, attributeSet, iArr, i2, i4, i6, i7, i8, i9, i10);
        C4159p c4159p = new C4159p(this, c0184bLd6);
        this.f25228q = c4159p;
        this.bb = c0184bLd6.m547k(C6095k.kja0.fzr, true);
        setHint(c0184bLd6.fu4(C6095k.kja0.u2));
        this.ut = c0184bLd6.m547k(C6095k.kja0.oy, true);
        this.zm = c0184bLd6.m547k(C6095k.kja0.dpl2, true);
        int i11 = C6095k.kja0.w4j4;
        if (c0184bLd6.mcp(i11)) {
            i3 = -1;
            setMinEms(c0184bLd6.kja0(i11, -1));
        } else {
            i3 = -1;
            int i12 = C6095k.kja0.hm6;
            if (c0184bLd6.mcp(i12)) {
                setMinWidth(c0184bLd6.f7l8(i12, -1));
            }
        }
        int i13 = C6095k.kja0.s0i;
        if (c0184bLd6.mcp(i13)) {
            setMaxEms(c0184bLd6.kja0(i13, i3));
        } else {
            int i14 = C6095k.kja0.e63j;
            if (c0184bLd6.mcp(i14)) {
                setMaxWidth(c0184bLd6.f7l8(i14, i3));
            }
        }
        this.bl = kja0.m14820n(context2, attributeSet, i2, i4).qrj();
        this.bg = context2.getResources().getDimensionPixelOffset(C6095k.g.n2mu);
        this.ba = c0184bLd6.m544g(C6095k.kja0.fpd, 0);
        this.bq = c0184bLd6.f7l8(C6095k.kja0.nmft, context2.getResources().getDimensionPixelSize(C6095k.g.hk));
        this.ac = c0184bLd6.f7l8(C6095k.kja0.n551, context2.getResources().getDimensionPixelSize(C6095k.g.gk));
        this.ax = this.bq;
        float fM548n = c0184bLd6.m548n(C6095k.kja0.nt6s, -1.0f);
        float fM548n2 = c0184bLd6.m548n(C6095k.kja0.wc, -1.0f);
        float fM548n3 = c0184bLd6.m548n(C6095k.kja0.y0, -1.0f);
        float fM548n4 = c0184bLd6.m548n(C6095k.kja0.ioq, -1.0f);
        kja0.toq toqVarZurt = this.bl.zurt();
        if (fM548n >= 0.0f) {
            toqVarZurt.eqxt(fM548n);
        }
        if (fM548n2 >= 0.0f) {
            toqVarZurt.x9kr(fM548n2);
        }
        if (fM548n3 >= 0.0f) {
            toqVarZurt.mcp(fM548n3);
        }
        if (fM548n4 >= 0.0f) {
            toqVarZurt.fu4(fM548n4);
        }
        this.bl = toqVarZurt.qrj();
        ColorStateList qVar = com.google.android.material.resources.zy.toq(context2, c0184bLd6, C6095k.kja0.ml5);
        if (qVar != null) {
            int defaultColor = qVar.getDefaultColor();
            this.d1cy = defaultColor;
            this.am = defaultColor;
            if (qVar.isStateful()) {
                this.xqx = qVar.getColorForState(new int[]{-16842910}, -1);
                this.zr5t = qVar.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.ei = qVar.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.zr5t = this.d1cy;
                ColorStateList colorStateListM22274k = C6045k.m22274k(context2, C6095k.n.gir);
                this.xqx = colorStateListM22274k.getColorForState(new int[]{-16842910}, -1);
                this.ei = colorStateListM22274k.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.am = 0;
            this.d1cy = 0;
            this.xqx = 0;
            this.zr5t = 0;
            this.ei = 0;
        }
        int i15 = C6095k.kja0.d7ek;
        if (c0184bLd6.mcp(i15)) {
            ColorStateList colorStateListM550q = c0184bLd6.m550q(i15);
            this.cw14 = colorStateListM550q;
            this.hp = colorStateListM550q;
        }
        int i16 = C6095k.kja0.dg;
        ColorStateList qVar2 = com.google.android.material.resources.zy.toq(context2, c0184bLd6, i16);
        this.q7k9 = c0184bLd6.zy(i16, 0);
        this.xy8 = C0498q.m2252g(context2, C6095k.n.c3);
        this.wra = C0498q.m2252g(context2, C6095k.n.so);
        this.th6 = C0498q.m2252g(context2, C6095k.n.em);
        if (qVar2 != null) {
            setBoxStrokeColorStateList(qVar2);
        }
        int i17 = C6095k.kja0.v4;
        if (c0184bLd6.mcp(i17)) {
            setBoxStrokeErrorColor(com.google.android.material.resources.zy.toq(context2, c0184bLd6, i17));
        }
        if (c0184bLd6.fn3e(i10, -1) != -1) {
            r3 = 0;
            setHintTextAppearance(c0184bLd6.fn3e(i10, 0));
        } else {
            r3 = 0;
        }
        int iFn3e2 = c0184bLd6.fn3e(i8, r3);
        CharSequence charSequenceFu4 = c0184bLd6.fu4(C6095k.kja0.nsr);
        boolean zM547k = c0184bLd6.m547k(C6095k.kja0.x8sl, r3);
        checkableImageButton.setId(C6095k.y.xh);
        if (com.google.android.material.resources.zy.m14757s(context2)) {
            androidx.core.view.ki.m3352y((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r3);
        }
        int i18 = C6095k.kja0.ux0;
        if (c0184bLd6.mcp(i18)) {
            this.s8y = com.google.android.material.resources.zy.toq(context2, c0184bLd6, i18);
        }
        int i19 = C6095k.kja0.cbcd;
        if (c0184bLd6.mcp(i19)) {
            this.mjvl = C4058z.x2(c0184bLd6.kja0(i19, -1), null);
        }
        int i20 = C6095k.kja0.w2q;
        if (c0184bLd6.mcp(i20)) {
            setErrorIconDrawable(c0184bLd6.m553y(i20));
        }
        checkableImageButton.setContentDescription(getResources().getText(C6095k.qrj.f79840oc));
        C0683f.o05(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iFn3e3 = c0184bLd6.fn3e(i9, 0);
        boolean zM547k2 = c0184bLd6.m547k(C6095k.kja0.xleu, false);
        CharSequence charSequenceFu42 = c0184bLd6.fu4(C6095k.kja0.r07n);
        int iFn3e4 = c0184bLd6.fn3e(C6095k.kja0.glf, 0);
        CharSequence charSequenceFu43 = c0184bLd6.fu4(C6095k.kja0.imy);
        int iFn3e5 = c0184bLd6.fn3e(C6095k.kja0.dqjj, 0);
        CharSequence charSequenceFu44 = c0184bLd6.fu4(C6095k.kja0.krlr);
        boolean zM547k3 = c0184bLd6.m547k(C6095k.kja0.l24, false);
        setCounterMaxLength(c0184bLd6.kja0(C6095k.kja0.uhu, -1));
        this.f25221j = c0184bLd6.fn3e(i6, 0);
        this.f25216e = c0184bLd6.fn3e(i7, 0);
        setBoxBackgroundMode(c0184bLd6.kja0(C6095k.kja0.idln, 0));
        if (com.google.android.material.resources.zy.m14757s(context2)) {
            androidx.core.view.ki.m3352y((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        int iFn3e6 = c0184bLd6.fn3e(C6095k.kja0.zogz, 0);
        sparseArray.append(-1, new com.google.android.material.textfield.toq(this, iFn3e6));
        sparseArray.append(0, new C4162y(this));
        if (iFn3e6 == 0) {
            z2 = zM547k2;
            iFn3e = c0184bLd6.fn3e(C6095k.kja0.t7j, 0);
        } else {
            z2 = zM547k2;
            iFn3e = iFn3e6;
        }
        sparseArray.append(1, new C4161s(this, iFn3e));
        sparseArray.append(2, new C4157k(this, iFn3e6));
        sparseArray.append(3, new C4160q(this, iFn3e6));
        int i21 = C6095k.kja0.ttpr;
        if (!c0184bLd6.mcp(i21)) {
            int i22 = C6095k.kja0.aojq;
            if (c0184bLd6.mcp(i22)) {
                this.tgs = com.google.android.material.resources.zy.toq(context2, c0184bLd6, i22);
            }
            int i23 = C6095k.kja0.agdp;
            if (c0184bLd6.mcp(i23)) {
                this.yl25 = C4058z.x2(c0184bLd6.kja0(i23, -1), null);
            }
        }
        int i24 = C6095k.kja0.qhx;
        if (c0184bLd6.mcp(i24)) {
            setEndIconMode(c0184bLd6.kja0(i24, 0));
            int i25 = C6095k.kja0.kpsf;
            if (c0184bLd6.mcp(i25)) {
                setEndIconContentDescription(c0184bLd6.fu4(i25));
            }
            setEndIconCheckable(c0184bLd6.m547k(C6095k.kja0.l044, true));
        } else if (c0184bLd6.mcp(i21)) {
            int i26 = C6095k.kja0.tx8q;
            if (c0184bLd6.mcp(i26)) {
                this.tgs = com.google.android.material.resources.zy.toq(context2, c0184bLd6, i26);
            }
            int i27 = C6095k.kja0.cxw;
            if (c0184bLd6.mcp(i27)) {
                this.yl25 = C4058z.x2(c0184bLd6.kja0(i27, -1), null);
            }
            setEndIconMode(c0184bLd6.m547k(i21, false) ? 1 : 0);
            setEndIconContentDescription(c0184bLd6.fu4(C6095k.kja0.q6c));
        }
        appCompatTextView.setId(C6095k.y.u0z);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        C0683f.pjz9(appCompatTextView, 1);
        setErrorContentDescription(charSequenceFu4);
        setCounterOverflowTextAppearance(this.f25216e);
        setHelperTextTextAppearance(iFn3e3);
        setErrorTextAppearance(iFn3e2);
        setCounterTextAppearance(this.f25221j);
        setPlaceholderText(charSequenceFu43);
        setPlaceholderTextAppearance(iFn3e4);
        setSuffixTextAppearance(iFn3e5);
        int i28 = C6095k.kja0.iw2p;
        if (c0184bLd6.mcp(i28)) {
            setErrorTextColor(c0184bLd6.m550q(i28));
        }
        int i29 = C6095k.kja0.qhv;
        if (c0184bLd6.mcp(i29)) {
            setHelperTextColor(c0184bLd6.m550q(i29));
        }
        int i30 = C6095k.kja0.onc0;
        if (c0184bLd6.mcp(i30)) {
            setHintTextColor(c0184bLd6.m550q(i30));
        }
        int i31 = C6095k.kja0.pe6o;
        if (c0184bLd6.mcp(i31)) {
            setCounterTextColor(c0184bLd6.m550q(i31));
        }
        int i32 = C6095k.kja0.vu;
        if (c0184bLd6.mcp(i32)) {
            setCounterOverflowTextColor(c0184bLd6.m550q(i32));
        }
        int i33 = C6095k.kja0.blsz;
        if (c0184bLd6.mcp(i33)) {
            setPlaceholderTextColor(c0184bLd6.m550q(i33));
        }
        int i34 = C6095k.kja0.du;
        if (c0184bLd6.mcp(i34)) {
            setSuffixTextColor(c0184bLd6.m550q(i34));
        }
        setEnabled(c0184bLd6.m547k(C6095k.kja0.xq3b, true));
        c0184bLd6.d3();
        C0683f.o05(this, 2);
        C0683f.m58i(this, 1);
        frameLayout2.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(c4159p);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(z2);
        setErrorEnabled(zM547k);
        setCounterEnabled(zM547k3);
        setHelperText(charSequenceFu42);
        setSuffixText(charSequenceFu44);
    }

    public void setErrorIconDrawable(@dd Drawable drawable) {
        this.xk5.setImageDrawable(drawable);
        wo();
        C4156g.m15060k(this, this.xk5, this.s8y, this.mjvl);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@dd CharSequence charSequence) {
        this.tlhn.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@dd Drawable drawable) {
        this.tlhn.setImageDrawable(drawable);
    }

    public void setHint(@nn86 int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }
}

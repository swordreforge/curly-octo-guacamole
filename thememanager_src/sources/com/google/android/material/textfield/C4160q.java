package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.C0683f;
import androidx.core.view.accessibility.ki;
import androidx.core.view.accessibility.zy;
import com.google.android.material.animation.C3910k;
import com.google.android.material.internal.C4044h;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import com.google.android.material.textfield.TextInputLayout;
import ij.C6095k;
import zy.dd;
import zy.fn3e;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.textfield.q */
/* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
class C4160q extends AbstractC4158n {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f67946fn3e = 50;

    /* JADX INFO: renamed from: i */
    private static final boolean f25291i = true;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f67947zurt = 67;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @dd
    private AccessibilityManager f67948cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final TextInputLayout.C4151n f67949f7l8;

    /* JADX INFO: renamed from: g */
    private final View.OnFocusChangeListener f25292g;

    /* JADX INFO: renamed from: h */
    private C4108p f25293h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private ValueAnimator f67950ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private StateListDrawable f67951kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final zy.InterfaceC0669n f67952ld6;

    /* JADX INFO: renamed from: n */
    private final TextWatcher f25294n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private long f67953n7h;

    /* JADX INFO: renamed from: p */
    private final View.OnAttachStateChangeListener f25295p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f67954qrj;

    /* JADX INFO: renamed from: s */
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.InterfaceC4153s f25296s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private ValueAnimator f67955t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f67956x2;

    /* JADX INFO: renamed from: y */
    private final TextInputLayout.InterfaceC4154y f25297y;

    /* JADX INFO: renamed from: com.google.android.material.textfield.q$f7l8 */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    class f7l8 implements TextInputLayout.InterfaceC4154y {
        f7l8() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4154y
        /* JADX INFO: renamed from: k */
        public void mo15043k(@lvui TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewMcp = C4160q.mcp(textInputLayout.getEditText());
            C4160q.this.eqxt(autoCompleteTextViewMcp);
            C4160q.this.m15089z(autoCompleteTextViewMcp);
            C4160q.this.d2ok(autoCompleteTextViewMcp);
            autoCompleteTextViewMcp.setThreshold(0);
            autoCompleteTextViewMcp.removeTextChangedListener(C4160q.this.f25294n);
            autoCompleteTextViewMcp.addTextChangedListener(C4160q.this.f25294n);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!C4160q.gvn7(autoCompleteTextViewMcp) && C4160q.this.f67948cdj.isTouchExplorationEnabled()) {
                C0683f.o05(C4160q.this.f67945zy, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(C4160q.this.f67949f7l8);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.q$g */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    class g extends TextInputLayout.C4151n {
        g(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C4151n, androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, @lvui ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            if (!C4160q.gvn7(C4160q.this.f25281k.getEditText())) {
                kiVar.sok(Spinner.class.getName());
            }
            if (kiVar.xwq3()) {
                kiVar.bek6(null);
            }
        }

        @Override // androidx.core.view.C0701k
        public void onPopulateAccessibilityEvent(View view, @lvui AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewMcp = C4160q.mcp(C4160q.this.f25281k.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C4160q.this.f67948cdj.isEnabled() && !C4160q.gvn7(C4160q.this.f25281k.getEditText())) {
                C4160q.this.lvui(autoCompleteTextViewMcp);
                C4160q.this.m15085r();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.q$k */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    class k extends C4044h {

        /* JADX INFO: renamed from: com.google.android.material.textfield.q$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
        class RunnableC7978k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AutoCompleteTextView f25300k;

            RunnableC7978k(AutoCompleteTextView autoCompleteTextView) {
                this.f25300k = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f25300k.isPopupShowing();
                C4160q.this.oc(zIsPopupShowing);
                C4160q.this.f67956x2 = zIsPopupShowing;
            }
        }

        k() {
        }

        @Override // com.google.android.material.internal.C4044h, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewMcp = C4160q.mcp(C4160q.this.f25281k.getEditText());
            if (C4160q.this.f67948cdj.isTouchExplorationEnabled() && C4160q.gvn7(autoCompleteTextViewMcp) && !C4160q.this.f67945zy.hasFocus()) {
                autoCompleteTextViewMcp.dismissDropDown();
            }
            autoCompleteTextViewMcp.post(new RunnableC7978k(autoCompleteTextViewMcp));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.q$ld6 */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    class ld6 implements View.OnClickListener {
        ld6() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4160q.this.lvui((AutoCompleteTextView) C4160q.this.f25281k.getEditText());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.q$n */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    class n implements View.OnFocusChangeListener {
        n() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z2) {
            C4160q.this.f25281k.setEndIconActivated(z2);
            if (z2) {
                return;
            }
            C4160q.this.oc(false);
            C4160q.this.f67956x2 = false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.q$p */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    class p implements zy.InterfaceC0669n {
        p() {
        }

        @Override // androidx.core.view.accessibility.zy.InterfaceC0669n
        public void onTouchExplorationStateChanged(boolean z2) {
            AutoCompleteTextView autoCompleteTextView;
            TextInputLayout textInputLayout = C4160q.this.f25281k;
            if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null || C4160q.gvn7(autoCompleteTextView)) {
                return;
            }
            C0683f.o05(C4160q.this.f67945zy, z2 ? 2 : 1);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.q$q */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    class q implements ValueAnimator.AnimatorUpdateListener {
        q() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            C4160q.this.f67945zy.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.q$s */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    class s implements View.OnAttachStateChangeListener {
        s() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C4160q.this.m15087t();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C4160q.this.d3();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.q$toq */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    class toq implements AutoCompleteTextView.OnDismissListener {
        toq() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            C4160q.this.m15085r();
            C4160q.this.oc(false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.q$x2 */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    class x2 implements View.OnTouchListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AutoCompleteTextView f25308k;

        x2(AutoCompleteTextView autoCompleteTextView) {
            this.f25308k = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@lvui View view, @lvui MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C4160q.this.jp0y()) {
                    C4160q.this.f67956x2 = false;
                }
                C4160q.this.lvui(this.f25308k);
                C4160q.this.m15085r();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.q$y */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    class y implements TextInputLayout.InterfaceC4153s {

        /* JADX INFO: renamed from: com.google.android.material.textfield.q$y$k */
        /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AutoCompleteTextView f25311k;

            k(AutoCompleteTextView autoCompleteTextView) {
                this.f25311k = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25311k.removeTextChangedListener(C4160q.this.f25294n);
            }
        }

        y() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4153s
        /* JADX INFO: renamed from: k */
        public void mo15042k(@lvui TextInputLayout textInputLayout, int i2) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i2 == 3) {
                autoCompleteTextView.post(new k(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == C4160q.this.f25292g) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (C4160q.f25291i) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
            if (i2 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(C4160q.this.f25295p);
                C4160q.this.d3();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.q$zy */
    /* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
    class zy extends AnimatorListenerAdapter {
        zy() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4160q c4160q = C4160q.this;
            c4160q.f67945zy.setChecked(c4160q.f67954qrj);
            C4160q.this.f67955t8r.start();
        }
    }

    C4160q(@lvui TextInputLayout textInputLayout, @fn3e int i2) {
        super(textInputLayout, i2);
        this.f25294n = new k();
        this.f25292g = new n();
        this.f67949f7l8 = new g(this.f25281k);
        this.f25297y = new f7l8();
        this.f25296s = new y();
        this.f25295p = new s();
        this.f67952ld6 = new p();
        this.f67956x2 = false;
        this.f67954qrj = false;
        this.f67953n7h = Long.MAX_VALUE;
    }

    private C4108p a9(float f2, float f3, float f4, int i2) {
        kja0 kja0VarQrj = kja0.m14819k().eqxt(f2).x9kr(f2).fu4(f3).mcp(f3).qrj();
        C4108p c4108pN7h = C4108p.n7h(this.f67944toq, f4);
        c4108pN7h.setShapeAppearanceModel(kja0VarQrj);
        c4108pN7h.nmn5(0, i2, 0, i2);
        return c4108pN7h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void d2ok(@lvui AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new x2(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f25292g);
        if (f25291i) {
            autoCompleteTextView.setOnDismissListener(new toq());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d3() {
        AccessibilityManager accessibilityManager = this.f67948cdj;
        if (accessibilityManager != null) {
            androidx.core.view.accessibility.zy.f7l8(accessibilityManager, this.f67952ld6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqxt(@lvui AutoCompleteTextView autoCompleteTextView) {
        if (f25291i) {
            int boxBackgroundMode = this.f25281k.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f25293h);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f67951kja0);
            }
        }
    }

    private void fti() {
        this.f67955t8r = jk(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorJk = jk(50, 1.0f, 0.0f);
        this.f67950ki = valueAnimatorJk;
        valueAnimatorJk.addListener(new zy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean gvn7(@lvui EditText editText) {
        return editText.getKeyListener() != null;
    }

    private ValueAnimator jk(int i2, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(C3910k.f23771k);
        valueAnimatorOfFloat.setDuration(i2);
        valueAnimatorOfFloat.addUpdateListener(new q());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jp0y() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f67953n7h;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lvui(@dd AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (jp0y()) {
            this.f67956x2 = false;
        }
        if (this.f67956x2) {
            this.f67956x2 = false;
            return;
        }
        if (f25291i) {
            oc(!this.f67954qrj);
        } else {
            this.f67954qrj = !this.f67954qrj;
            this.f67945zy.toggle();
        }
        if (!this.f67954qrj) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @lvui
    public static AutoCompleteTextView mcp(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void o1t(@lvui AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, @lvui C4108p c4108p) {
        int boxBackgroundColor = this.f25281k.getBoxBackgroundColor();
        int[] iArr2 = {com.google.android.material.color.kja0.qrj(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f25291i) {
            C0683f.wlev(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), c4108p, c4108p));
            return;
        }
        C4108p c4108p2 = new C4108p(c4108p.getShapeAppearanceModel());
        c4108p2.m14867x(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c4108p, c4108p2});
        int iI1 = C0683f.i1(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int iBf2 = C0683f.bf2(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C0683f.wlev(autoCompleteTextView, layerDrawable);
        C0683f.u38j(autoCompleteTextView, iI1, paddingTop, iBf2, paddingBottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oc(boolean z2) {
        if (this.f67954qrj != z2) {
            this.f67954qrj = z2;
            this.f67955t8r.cancel();
            this.f67950ki.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m15085r() {
        this.f67956x2 = true;
        this.f67953n7h = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m15087t() {
        TextInputLayout textInputLayout;
        if (this.f67948cdj == null || (textInputLayout = this.f25281k) == null || !C0683f.zsr0(textInputLayout)) {
            return;
        }
        androidx.core.view.accessibility.zy.toq(this.f67948cdj, this.f67952ld6);
    }

    private void wvg(@lvui AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, @lvui C4108p c4108p) {
        LayerDrawable layerDrawable;
        int iM14285q = com.google.android.material.color.kja0.m14285q(autoCompleteTextView, C6095k.zy.f80274sc);
        C4108p c4108p2 = new C4108p(c4108p.getShapeAppearanceModel());
        int iQrj = com.google.android.material.color.kja0.qrj(i2, iM14285q, 0.1f);
        c4108p2.m14867x(new ColorStateList(iArr, new int[]{iQrj, 0}));
        if (f25291i) {
            c4108p2.setTint(iM14285q);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iQrj, iM14285q});
            C4108p c4108p3 = new C4108p(c4108p.getShapeAppearanceModel());
            c4108p3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c4108p2, c4108p3), c4108p});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{c4108p2, c4108p});
        }
        C0683f.wlev(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public void m15089z(@lvui AutoCompleteTextView autoCompleteTextView) {
        if (gvn7(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f25281k.getBoxBackgroundMode();
        C4108p boxBackground = this.f25281k.getBoxBackground();
        int iM14285q = com.google.android.material.color.kja0.m14285q(autoCompleteTextView, C6095k.zy.f80265qh4d);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            wvg(autoCompleteTextView, iM14285q, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            o1t(autoCompleteTextView, iM14285q, iArr, boxBackground);
        }
    }

    void dd(@lvui AutoCompleteTextView autoCompleteTextView) {
        if (!gvn7(autoCompleteTextView) && this.f25281k.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            m15089z(autoCompleteTextView);
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4158n
    /* JADX INFO: renamed from: k */
    void mo15068k() {
        float dimensionPixelOffset = this.f67944toq.getResources().getDimensionPixelOffset(C6095k.g.fjxh);
        float dimensionPixelOffset2 = this.f67944toq.getResources().getDimensionPixelOffset(C6095k.g.hfwa);
        int dimensionPixelOffset3 = this.f67944toq.getResources().getDimensionPixelOffset(C6095k.g.mv);
        C4108p c4108pA9 = a9(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C4108p c4108pA92 = a9(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f25293h = c4108pA9;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f67951kja0 = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, c4108pA9);
        this.f67951kja0.addState(new int[0], c4108pA92);
        int i2 = this.f25282q;
        if (i2 == 0) {
            i2 = f25291i ? C6095k.f7l8.f78766h7am : C6095k.f7l8.f78821vep5;
        }
        this.f25281k.setEndIconDrawable(i2);
        TextInputLayout textInputLayout = this.f25281k;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C6095k.qrj.f79798eqxt));
        this.f25281k.setEndIconOnClickListener(new ld6());
        this.f25281k.f7l8(this.f25297y);
        this.f25281k.m15039y(this.f25296s);
        fti();
        this.f67948cdj = (AccessibilityManager) this.f67944toq.getSystemService("accessibility");
        this.f25281k.addOnAttachStateChangeListener(this.f25295p);
        m15087t();
    }

    @Override // com.google.android.material.textfield.AbstractC4158n
    /* JADX INFO: renamed from: q */
    boolean mo15069q() {
        return true;
    }

    @Override // com.google.android.material.textfield.AbstractC4158n
    boolean toq(int i2) {
        return i2 != 0;
    }
}

package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.animation.C3910k;
import com.google.android.material.textfield.TextInputLayout;
import ij.C6095k;
import zy.fn3e;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.textfield.k */
/* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
class C4157k extends AbstractC4158n {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f67940ld6 = 100;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final float f67941qrj = 0.8f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f67942x2 = 150;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final TextInputLayout.InterfaceC4154y f67943f7l8;

    /* JADX INFO: renamed from: g */
    private final View.OnFocusChangeListener f25265g;

    /* JADX INFO: renamed from: n */
    private final TextWatcher f25266n;

    /* JADX INFO: renamed from: p */
    private ValueAnimator f25267p;

    /* JADX INFO: renamed from: s */
    private AnimatorSet f25268s;

    /* JADX INFO: renamed from: y */
    private final TextInputLayout.InterfaceC4153s f25269y;

    /* JADX INFO: renamed from: com.google.android.material.textfield.k$f7l8 */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    class f7l8 extends AnimatorListenerAdapter {
        f7l8() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4157k.this.f25281k.setEndIconVisible(false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.k$g */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4157k.this.f25281k.setEndIconVisible(true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.k$k */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    class k implements TextWatcher {
        k() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@lvui Editable editable) {
            if (C4157k.this.f25281k.getSuffixText() != null) {
                return;
            }
            C4157k c4157k = C4157k.this;
            c4157k.m15066s(c4157k.qrj());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.k$n */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = C4157k.this.f25281k.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C4157k.this.f25281k.m15033b();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.k$q */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    class q implements TextInputLayout.InterfaceC4153s {

        /* JADX INFO: renamed from: com.google.android.material.textfield.k$q$k */
        /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ EditText f25275k;

            k(EditText editText) {
                this.f25275k = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25275k.removeTextChangedListener(C4157k.this.f25266n);
                C4157k.this.m15066s(true);
            }
        }

        q() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4153s
        /* JADX INFO: renamed from: k */
        public void mo15042k(@lvui TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i2 != 2) {
                return;
            }
            editText.post(new k(editText));
            if (editText.getOnFocusChangeListener() == C4157k.this.f25265g) {
                editText.setOnFocusChangeListener(null);
            }
            if (C4157k.this.f67945zy.getOnFocusChangeListener() == C4157k.this.f25265g) {
                C4157k.this.f67945zy.setOnFocusChangeListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.k$s */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    class s implements ValueAnimator.AnimatorUpdateListener {
        s() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C4157k.this.f67945zy.setScaleX(fFloatValue);
            C4157k.this.f67945zy.setScaleY(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.k$toq */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    class toq implements View.OnFocusChangeListener {
        toq() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z2) {
            C4157k c4157k = C4157k.this;
            c4157k.m15066s(c4157k.qrj());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.k$y */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    class y implements ValueAnimator.AnimatorUpdateListener {
        y() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            C4157k.this.f67945zy.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.k$zy */
    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    class zy implements TextInputLayout.InterfaceC4154y {
        zy() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4154y
        /* JADX INFO: renamed from: k */
        public void mo15043k(@lvui TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C4157k.this.qrj());
            editText.setOnFocusChangeListener(C4157k.this.f25265g);
            C4157k c4157k = C4157k.this;
            c4157k.f67945zy.setOnFocusChangeListener(c4157k.f25265g);
            editText.removeTextChangedListener(C4157k.this.f25266n);
            editText.addTextChangedListener(C4157k.this.f25266n);
        }
    }

    C4157k(@lvui TextInputLayout textInputLayout, @fn3e int i2) {
        super(textInputLayout, i2);
        this.f25266n = new k();
        this.f25265g = new toq();
        this.f67943f7l8 = new zy();
        this.f25269y = new q();
    }

    private ValueAnimator ld6() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f67941qrj, 1.0f);
        valueAnimatorOfFloat.setInterpolator(C3910k.f23773q);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new s());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: p */
    private ValueAnimator m15065p(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(C3910k.f23771k);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new y());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qrj() {
        EditText editText = this.f25281k.getEditText();
        return editText != null && (editText.hasFocus() || this.f67945zy.hasFocus()) && editText.getText().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m15066s(boolean z2) {
        boolean z3 = this.f25281k.x9kr() == z2;
        if (z2 && !this.f25268s.isRunning()) {
            this.f25267p.cancel();
            this.f25268s.start();
            if (z3) {
                this.f25268s.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f25268s.cancel();
        this.f25267p.start();
        if (z3) {
            this.f25267p.end();
        }
    }

    private void x2() {
        ValueAnimator valueAnimatorLd6 = ld6();
        ValueAnimator valueAnimatorM15065p = m15065p(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f25268s = animatorSet;
        animatorSet.playTogether(valueAnimatorLd6, valueAnimatorM15065p);
        this.f25268s.addListener(new g());
        ValueAnimator valueAnimatorM15065p2 = m15065p(1.0f, 0.0f);
        this.f25267p = valueAnimatorM15065p2;
        valueAnimatorM15065p2.addListener(new f7l8());
    }

    @Override // com.google.android.material.textfield.AbstractC4158n
    /* JADX INFO: renamed from: k */
    void mo15068k() {
        TextInputLayout textInputLayout = this.f25281k;
        int i2 = this.f25282q;
        if (i2 == 0) {
            i2 = C6095k.f7l8.f78774jbh;
        }
        textInputLayout.setEndIconDrawable(i2);
        TextInputLayout textInputLayout2 = this.f25281k;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C6095k.qrj.f79793d3));
        this.f25281k.setEndIconCheckable(false);
        this.f25281k.setEndIconOnClickListener(new n());
        this.f25281k.f7l8(this.f67943f7l8);
        this.f25281k.m15039y(this.f25269y);
        x2();
    }

    @Override // com.google.android.material.textfield.AbstractC4158n
    void zy(boolean z2) {
        if (this.f25281k.getSuffixText() == null) {
            return;
        }
        m15066s(z2);
    }
}

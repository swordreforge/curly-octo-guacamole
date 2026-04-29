package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.C4044h;
import com.google.android.material.textfield.TextInputLayout;
import ij.C6095k;
import zy.fn3e;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.textfield.s */
/* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
class C4161s extends AbstractC4158n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final TextInputLayout.InterfaceC4153s f67958f7l8;

    /* JADX INFO: renamed from: g */
    private final TextInputLayout.InterfaceC4154y f25314g;

    /* JADX INFO: renamed from: n */
    private final TextWatcher f25315n;

    /* JADX INFO: renamed from: com.google.android.material.textfield.s$k */
    /* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
    class k extends C4044h {
        k() {
        }

        @Override // com.google.android.material.internal.C4044h, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            C4161s.this.f67945zy.setChecked(!r1.f7l8());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.s$q */
    /* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C4161s.this.f25281k.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (C4161s.this.f7l8()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            C4161s.this.f25281k.m15033b();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.s$toq */
    /* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
    class toq implements TextInputLayout.InterfaceC4154y {
        toq() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4154y
        /* JADX INFO: renamed from: k */
        public void mo15043k(@lvui TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            C4161s.this.f67945zy.setChecked(!r0.f7l8());
            editText.removeTextChangedListener(C4161s.this.f25315n);
            editText.addTextChangedListener(C4161s.this.f25315n);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.s$zy */
    /* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
    class zy implements TextInputLayout.InterfaceC4153s {

        /* JADX INFO: renamed from: com.google.android.material.textfield.s$zy$k */
        /* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ EditText f25320k;

            k(EditText editText) {
                this.f25320k = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25320k.removeTextChangedListener(C4161s.this.f25315n);
            }
        }

        zy() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4153s
        /* JADX INFO: renamed from: k */
        public void mo15042k(@lvui TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i2 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new k(editText));
        }
    }

    C4161s(@lvui TextInputLayout textInputLayout, @fn3e int i2) {
        super(textInputLayout, i2);
        this.f25315n = new k();
        this.f25314g = new toq();
        this.f67958f7l8 = new zy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f7l8() {
        EditText editText = this.f25281k.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* JADX INFO: renamed from: y */
    private static boolean m15092y(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // com.google.android.material.textfield.AbstractC4158n
    /* JADX INFO: renamed from: k */
    void mo15068k() {
        TextInputLayout textInputLayout = this.f25281k;
        int i2 = this.f25282q;
        if (i2 == 0) {
            i2 = C6095k.f7l8.f78827wo;
        }
        textInputLayout.setEndIconDrawable(i2);
        TextInputLayout textInputLayout2 = this.f25281k;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C6095k.qrj.f79781b3e));
        this.f25281k.setEndIconVisible(true);
        this.f25281k.setEndIconCheckable(true);
        this.f25281k.setEndIconOnClickListener(new q());
        this.f25281k.f7l8(this.f25314g);
        this.f25281k.m15039y(this.f67958f7l8);
        EditText editText = this.f25281k.getEditText();
        if (m15092y(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

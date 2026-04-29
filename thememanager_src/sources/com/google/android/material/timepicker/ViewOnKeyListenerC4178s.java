package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: com.google.android.material.timepicker.s */
/* JADX INFO: compiled from: TimePickerTextInputKeyController.java */
/* JADX INFO: loaded from: classes2.dex */
class ViewOnKeyListenerC4178s implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* JADX INFO: renamed from: g */
    private boolean f25389g = false;

    /* JADX INFO: renamed from: k */
    private final ChipTextInputComboView f25390k;

    /* JADX INFO: renamed from: n */
    private final TimeModel f25391n;

    /* JADX INFO: renamed from: q */
    private final ChipTextInputComboView f25392q;

    ViewOnKeyListenerC4178s(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f25390k = chipTextInputComboView;
        this.f25392q = chipTextInputComboView2;
        this.f25391n = timeModel;
    }

    /* JADX INFO: renamed from: q */
    private boolean m15139q(int i2, KeyEvent keyEvent, EditText editText) {
        if (!(i2 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText()))) {
            return false;
        }
        toq(10);
        return true;
    }

    private void toq(int i2) {
        this.f25392q.setChecked(i2 == 12);
        this.f25390k.setChecked(i2 == 10);
        this.f25391n.f25353g = i2;
    }

    private boolean zy(int i2, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (!(i2 >= 7 && i2 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2)) {
            return false;
        }
        toq(12);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void m15140k() {
        TextInputLayout textInputLayoutM15100n = this.f25390k.m15100n();
        TextInputLayout textInputLayoutM15100n2 = this.f25392q.m15100n();
        EditText editText = textInputLayoutM15100n.getEditText();
        EditText editText2 = textInputLayoutM15100n2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        boolean z2 = i2 == 5;
        if (z2) {
            toq(12);
        }
        return z2;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (this.f25389g) {
            return false;
        }
        this.f25389g = true;
        EditText editText = (EditText) view;
        boolean zM15139q = this.f25391n.f25353g == 12 ? m15139q(i2, keyEvent, editText) : zy(i2, keyEvent, editText);
        this.f25389g = false;
        return zM15139q;
    }
}

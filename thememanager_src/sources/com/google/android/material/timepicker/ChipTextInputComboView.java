package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C4044h;
import com.google.android.material.internal.C4058z;
import com.google.android.material.textfield.TextInputLayout;
import ij.C6095k;
import java.util.Arrays;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: g */
    private TextWatcher f25322g;

    /* JADX INFO: renamed from: k */
    private final Chip f25323k;

    /* JADX INFO: renamed from: n */
    private final EditText f25324n;

    /* JADX INFO: renamed from: q */
    private final TextInputLayout f25325q;

    /* JADX INFO: renamed from: y */
    private TextView f25326y;

    private class toq extends C4044h {

        /* JADX INFO: renamed from: q */
        private static final String f25327q = "00";

        private toq() {
        }

        @Override // com.google.android.material.internal.C4044h, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f25323k.setText(ChipTextInputComboView.this.m15098q(f25327q));
            } else {
                ChipTextInputComboView.this.f25323k.setText(ChipTextInputComboView.this.m15098q(editable));
            }
        }
    }

    public ChipTextInputComboView(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: p */
    private void m15097p() {
        this.f25324n.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public String m15098q(CharSequence charSequence) {
        return TimeModel.m15115k(getResources(), charSequence);
    }

    public void f7l8(boolean z2) {
        this.f25324n.setCursorVisible(z2);
    }

    /* JADX INFO: renamed from: g */
    public void m15099g(C0701k c0701k) {
        C0683f.zwy(this.f25323k, c0701k);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f25323k.isChecked();
    }

    /* JADX INFO: renamed from: n */
    public TextInputLayout m15100n() {
        return this.f25325q;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m15097p();
    }

    /* JADX INFO: renamed from: s */
    public void m15101s(CharSequence charSequence) {
        this.f25323k.setText(m15098q(charSequence));
        if (TextUtils.isEmpty(this.f25324n.getText())) {
            return;
        }
        this.f25324n.removeTextChangedListener(this.f25322g);
        this.f25324n.setText((CharSequence) null);
        this.f25324n.addTextChangedListener(this.f25322g);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        this.f25323k.setChecked(z2);
        this.f25324n.setVisibility(z2 ? 0 : 4);
        this.f25323k.setVisibility(z2 ? 8 : 0);
        if (isChecked()) {
            C4058z.m14622h(this.f25324n);
            if (TextUtils.isEmpty(this.f25324n.getText())) {
                return;
            }
            EditText editText = this.f25324n;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@dd View.OnClickListener onClickListener) {
        this.f25323k.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        this.f25323k.setTag(i2, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f25323k.toggle();
    }

    /* JADX INFO: renamed from: y */
    public void m15102y(CharSequence charSequence) {
        this.f25326y.setText(charSequence);
    }

    public void zy(InputFilter inputFilter) {
        InputFilter[] filters = this.f25324n.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f25324n.setFilters(inputFilterArr);
    }

    public ChipTextInputComboView(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(C6095k.ld6.f79292ek5k, (ViewGroup) this, false);
        this.f25323k = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(C6095k.ld6.f79360yz, (ViewGroup) this, false);
        this.f25325q = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f25324n = editText;
        editText.setVisibility(4);
        toq toqVar = new toq();
        this.f25322g = toqVar;
        editText.addTextChangedListener(toqVar);
        m15097p();
        addView(chip);
        addView(textInputLayout);
        this.f25326y = (TextView) findViewById(C6095k.y.f79950cn02);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}

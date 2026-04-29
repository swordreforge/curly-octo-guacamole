package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: compiled from: MaxInputValidator.java */
/* JADX INFO: loaded from: classes2.dex */
class zy implements InputFilter {

    /* JADX INFO: renamed from: k */
    private int f25402k;

    public zy(int i2) {
        this.f25402k = i2;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i4, i5, charSequence.subSequence(i2, i3).toString());
            if (Integer.parseInt(sb.toString()) <= this.f25402k) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public int m15150k() {
        return this.f25402k;
    }

    public void toq(int i2) {
        this.f25402k = i2;
    }
}

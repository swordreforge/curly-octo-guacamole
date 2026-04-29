package com.google.android.material.textfield;

import android.graphics.drawable.Drawable;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.textfield.y */
/* JADX INFO: compiled from: NoEndIconDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
class C4162y extends AbstractC4158n {
    C4162y(@lvui TextInputLayout textInputLayout) {
        super(textInputLayout, 0);
    }

    @Override // com.google.android.material.textfield.AbstractC4158n
    /* JADX INFO: renamed from: k */
    void mo15068k() {
        this.f25281k.setEndIconOnClickListener(null);
        this.f25281k.setEndIconDrawable((Drawable) null);
        this.f25281k.setEndIconContentDescription((CharSequence) null);
    }
}

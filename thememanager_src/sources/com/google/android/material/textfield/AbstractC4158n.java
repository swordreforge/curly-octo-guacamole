package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import zy.fn3e;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.textfield.n */
/* JADX INFO: compiled from: EndIconDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4158n {

    /* JADX INFO: renamed from: k */
    TextInputLayout f25281k;

    /* JADX INFO: renamed from: q */
    @fn3e
    final int f25282q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    Context f67944toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    CheckableImageButton f67945zy;

    AbstractC4158n(@lvui TextInputLayout textInputLayout, @fn3e int i2) {
        this.f25281k = textInputLayout;
        this.f67944toq = textInputLayout.getContext();
        this.f67945zy = textInputLayout.getEndIconView();
        this.f25282q = i2;
    }

    /* JADX INFO: renamed from: k */
    abstract void mo15068k();

    /* JADX INFO: renamed from: q */
    boolean mo15069q() {
        return false;
    }

    boolean toq(int i2) {
        return true;
    }

    void zy(boolean z2) {
    }
}

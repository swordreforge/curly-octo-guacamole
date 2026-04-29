package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.C0701k;
import androidx.core.view.accessibility.ki;

/* JADX INFO: renamed from: com.google.android.material.timepicker.k */
/* JADX INFO: compiled from: ClickActionDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
class C4174k extends C0701k {

    /* JADX INFO: renamed from: k */
    private final ki.C0656k f25373k;

    public C4174k(Context context, int i2) {
        this.f25373k = new ki.C0656k(16, context.getString(i2));
    }

    @Override // androidx.core.view.C0701k
    public void onInitializeAccessibilityNodeInfo(View view, ki kiVar) {
        super.onInitializeAccessibilityNodeInfo(view, kiVar);
        kiVar.toq(this.f25373k);
    }
}

package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.C0498q;
import androidx.core.view.accessibility.ki;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import ij.C6095k;

/* JADX INFO: renamed from: com.google.android.material.timepicker.g */
/* JADX INFO: compiled from: TimePickerClockPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
class C4173g implements ClockHandView.InterfaceC4166q, TimePickerView.f7l8, TimePickerView.InterfaceC4168g, ClockHandView.zy, InterfaceC4181y {

    /* JADX INFO: renamed from: i */
    private static final int f25364i = 30;

    /* JADX INFO: renamed from: z */
    private static final int f25367z = 6;

    /* JADX INFO: renamed from: g */
    private float f25368g;

    /* JADX INFO: renamed from: k */
    private final TimePickerView f25369k;

    /* JADX INFO: renamed from: n */
    private float f25370n;

    /* JADX INFO: renamed from: q */
    private final TimeModel f25371q;

    /* JADX INFO: renamed from: y */
    private boolean f25372y = false;

    /* JADX INFO: renamed from: s */
    private static final String[] f25366s = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", InterfaceC1925p.jvci, "11"};

    /* JADX INFO: renamed from: p */
    private static final String[] f25365p = {"00", "2", "4", "6", "8", InterfaceC1925p.jvci, "12", "14", "16", "18", "20", "22"};

    /* JADX INFO: renamed from: h */
    private static final String[] f25363h = {"00", "5", InterfaceC1925p.jvci, "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* JADX INFO: renamed from: com.google.android.material.timepicker.g$k */
    /* JADX INFO: compiled from: TimePickerClockPresenter.java */
    class k extends C4174k {
        k(Context context, int i2) {
            super(context, i2);
        }

        @Override // com.google.android.material.timepicker.C4174k, androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.yqrt(view.getResources().getString(C6095k.qrj.f79783bf2, String.valueOf(C4173g.this.f25371q.zy())));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.g$toq */
    /* JADX INFO: compiled from: TimePickerClockPresenter.java */
    class toq extends C4174k {
        toq(Context context, int i2) {
            super(context, i2);
        }

        @Override // com.google.android.material.timepicker.C4174k, androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.yqrt(view.getResources().getString(C6095k.qrj.f79780a98o, String.valueOf(C4173g.this.f25371q.f25355n)));
        }
    }

    public C4173g(TimePickerView timePickerView, TimeModel timeModel) {
        this.f25369k = timePickerView;
        this.f25371q = timeModel;
        mo15132k();
    }

    private void n7h(String[] strArr, String str) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = TimeModel.toq(this.f25369k.getResources(), strArr[i2], str);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m15128p(int i2, int i3) {
        TimeModel timeModel = this.f25371q;
        if (timeModel.f25355n == i3 && timeModel.f25356q == i2) {
            return;
        }
        this.f25369k.performHapticFeedback(4);
    }

    private void qrj() {
        n7h(f25366s, TimeModel.f25351p);
        n7h(f25365p, TimeModel.f25351p);
        n7h(f25363h, TimeModel.f25352s);
    }

    /* JADX INFO: renamed from: s */
    private String[] m15129s() {
        return this.f25371q.f25354k == 1 ? f25365p : f25366s;
    }

    private void x2() {
        TimePickerView timePickerView = this.f25369k;
        TimeModel timeModel = this.f25371q;
        timePickerView.toq(timeModel.f25357y, timeModel.zy(), this.f25371q.f25355n);
    }

    /* JADX INFO: renamed from: y */
    private int m15130y() {
        return this.f25371q.f25354k == 1 ? 15 : 30;
    }

    @Override // com.google.android.material.timepicker.InterfaceC4181y
    /* JADX INFO: renamed from: g */
    public void mo15131g() {
        this.f25369k.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.InterfaceC4181y
    public void invalidate() {
        this.f25368g = this.f25371q.zy() * m15130y();
        TimeModel timeModel = this.f25371q;
        this.f25370n = timeModel.f25355n * 6;
        ld6(timeModel.f25353g, false);
        x2();
    }

    @Override // com.google.android.material.timepicker.InterfaceC4181y
    /* JADX INFO: renamed from: k */
    public void mo15132k() {
        if (this.f25371q.f25354k == 0) {
            this.f25369k.ch();
        }
        this.f25369k.m15126m(this);
        this.f25369k.m15122a(this);
        this.f25369k.a98o(this);
        this.f25369k.bf2(this);
        qrj();
        invalidate();
    }

    void ld6(int i2, boolean z2) {
        boolean z3 = i2 == 12;
        this.f25369k.ek5k(z3);
        this.f25371q.f25353g = i2;
        this.f25369k.mo15124g(z3 ? f25363h : m15129s(), z3 ? C6095k.qrj.f79780a98o : C6095k.qrj.f79783bf2);
        this.f25369k.yz(z3 ? this.f25370n : this.f25368g, z2);
        this.f25369k.mo15125k(i2);
        this.f25369k.m15123b(new k(this.f25369k.getContext(), C6095k.qrj.f35681b));
        this.f25369k.y9n(new toq(this.f25369k.getContext(), C6095k.qrj.f79813i1));
    }

    @Override // com.google.android.material.timepicker.InterfaceC4181y
    /* JADX INFO: renamed from: n */
    public void mo15133n() {
        this.f25369k.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f7l8
    /* JADX INFO: renamed from: q */
    public void mo15127q(int i2) {
        ld6(i2, true);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.zy
    public void toq(float f2, boolean z2) {
        this.f25372y = true;
        TimeModel timeModel = this.f25371q;
        int i2 = timeModel.f25355n;
        int i3 = timeModel.f25356q;
        if (timeModel.f25353g == 10) {
            this.f25369k.yz(this.f25368g, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) C0498q.kja0(this.f25369k.getContext(), AccessibilityManager.class);
            if (!(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled())) {
                ld6(12, true);
            }
        } else {
            int iRound = Math.round(f2);
            if (!z2) {
                this.f25371q.m15116p(((iRound + 15) / 30) * 5);
                this.f25370n = this.f25371q.f25355n * 6;
            }
            this.f25369k.yz(this.f25370n, z2);
        }
        this.f25372y = false;
        x2();
        m15128p(i3, i2);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC4166q
    public void zurt(float f2, boolean z2) {
        if (this.f25372y) {
            return;
        }
        TimeModel timeModel = this.f25371q;
        int i2 = timeModel.f25356q;
        int i3 = timeModel.f25355n;
        int iRound = Math.round(f2);
        TimeModel timeModel2 = this.f25371q;
        if (timeModel2.f25353g == 12) {
            timeModel2.m15116p((iRound + 3) / 6);
            this.f25370n = (float) Math.floor(this.f25371q.f25355n * 6);
        } else {
            this.f25371q.f7l8((iRound + (m15130y() / 2)) / m15130y());
            this.f25368g = this.f25371q.zy() * m15130y();
        }
        if (z2) {
            return;
        }
        x2();
        m15128p(i2, i3);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.InterfaceC4168g
    public void zy(int i2) {
        this.f25371q.ld6(i2);
    }
}

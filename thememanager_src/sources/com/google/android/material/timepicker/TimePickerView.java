package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import ij.C6095k;
import java.util.Locale;
import zy.dd;
import zy.lvui;
import zy.nn86;

/* JADX INFO: loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout implements com.google.android.material.timepicker.f7l8 {
    static final String am = "android.view.View";
    private f7l8 ac;
    private InterfaceC4170n ad;
    private final Chip as;
    private final View.OnClickListener ax;
    private final ClockFaceView az;
    private final MaterialButtonToggleGroup ba;
    private final ClockHandView bg;
    private final Chip bl;
    private InterfaceC4168g bq;

    interface f7l8 {
        /* JADX INFO: renamed from: q */
        void mo15127q(int i2);
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$g */
    interface InterfaceC4168g {
        void zy(int i2);
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$k */
    class ViewOnClickListenerC4169k implements View.OnClickListener {
        ViewOnClickListenerC4169k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.ac != null) {
                TimePickerView.this.ac.mo15127q(((Integer) view.getTag(C6095k.y.x3b)).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$n */
    interface InterfaceC4170n {
        void vyq();
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$q */
    class ViewOnTouchListenerC4171q implements View.OnTouchListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ GestureDetector f25359k;

        ViewOnTouchListenerC4171q(GestureDetector gestureDetector) {
            this.f25359k = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f25359k.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    class toq implements MaterialButtonToggleGroup.InterfaceC3965q {
        toq() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC3965q
        /* JADX INFO: renamed from: k */
        public void mo14182k(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z2) {
            int i3 = i2 == C6095k.y.f79942btvn ? 1 : 0;
            if (TimePickerView.this.bq == null || !z2) {
                return;
            }
            TimePickerView.this.bq.zy(i3);
        }
    }

    class zy extends GestureDetector.SimpleOnGestureListener {
        zy() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            InterfaceC4170n interfaceC4170n = TimePickerView.this.ad;
            if (interfaceC4170n == null) {
                return false;
            }
            interfaceC4170n.vyq();
            return true;
        }
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    private void lv5() {
        if (this.ba.getVisibility() == 0) {
            C0397q c0397q = new C0397q();
            c0397q.gvn7(this);
            c0397q.fti(C6095k.y.f80079tww7, C0683f.m3159e(this) == 0 ? 2 : 1);
            c0397q.ki(this);
        }
    }

    private void nmn5(Chip chip, boolean z2) {
        chip.setChecked(z2);
        C0683f.pjz9(chip, z2 ? 2 : 0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: x */
    private void m15121x() {
        ViewOnTouchListenerC4171q viewOnTouchListenerC4171q = new ViewOnTouchListenerC4171q(new GestureDetector(getContext(), new zy()));
        this.bl.setOnTouchListener(viewOnTouchListenerC4171q);
        this.as.setOnTouchListener(viewOnTouchListenerC4171q);
    }

    private void zp() {
        Chip chip = this.bl;
        int i2 = C6095k.y.x3b;
        chip.setTag(i2, 12);
        this.as.setTag(i2, 10);
        this.bl.setOnClickListener(this.ax);
        this.as.setOnClickListener(this.ax);
        this.bl.setAccessibilityClassName(am);
        this.as.setAccessibilityClassName(am);
    }

    /* JADX INFO: renamed from: a */
    void m15122a(f7l8 f7l8Var) {
        this.ac = f7l8Var;
    }

    void a98o(InterfaceC4168g interfaceC4168g) {
        this.bq = interfaceC4168g;
    }

    /* JADX INFO: renamed from: b */
    public void m15123b(C0701k c0701k) {
        C0683f.zwy(this.as, c0701k);
    }

    public void bf2(ClockHandView.zy zyVar) {
        this.bg.kja0(zyVar);
    }

    public void ch() {
        this.ba.setVisibility(0);
    }

    public void ek5k(boolean z2) {
        this.bg.m15112p(z2);
    }

    @Override // com.google.android.material.timepicker.f7l8
    /* JADX INFO: renamed from: g */
    public void mo15124g(String[] strArr, @nn86 int i2) {
        this.az.m15105g(strArr, i2);
    }

    void i1(@dd InterfaceC4170n interfaceC4170n) {
        this.ad = interfaceC4170n;
    }

    @Override // com.google.android.material.timepicker.f7l8
    /* JADX INFO: renamed from: k */
    public void mo15125k(int i2) {
        nmn5(this.bl, i2 == 12);
        nmn5(this.as, i2 == 10);
    }

    /* JADX INFO: renamed from: m */
    public void m15126m(ClockHandView.InterfaceC4166q interfaceC4166q) {
        this.bg.toq(interfaceC4166q);
    }

    @Override // com.google.android.material.timepicker.f7l8
    public void o1t(float f2) {
        this.bg.x2(f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        lv5();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@lvui View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            lv5();
        }
    }

    @Override // com.google.android.material.timepicker.f7l8
    @SuppressLint({"DefaultLocale"})
    public void toq(int i2, int i3, int i4) {
        this.ba.m14179n(i2 == 1 ? C6095k.y.f79942btvn : C6095k.y.f79982gb);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.f25352s, Integer.valueOf(i4));
        String str2 = String.format(locale, TimeModel.f25352s, Integer.valueOf(i3));
        if (!TextUtils.equals(this.bl.getText(), str)) {
            this.bl.setText(str);
        }
        if (TextUtils.equals(this.as.getText(), str2)) {
            return;
        }
        this.as.setText(str2);
    }

    public void y9n(C0701k c0701k) {
        C0683f.zwy(this.bl, c0701k);
    }

    public void yz(float f2, boolean z2) {
        this.bg.qrj(f2, z2);
    }

    public TimePickerView(Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.ax = new ViewOnClickListenerC4169k();
        LayoutInflater.from(context).inflate(C6095k.ld6.f79358y9n, this);
        this.az = (ClockFaceView) findViewById(C6095k.y.f80052ob);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C6095k.y.f80012kq2f);
        this.ba = materialButtonToggleGroup;
        materialButtonToggleGroup.toq(new toq());
        this.bl = (Chip) findViewById(C6095k.y.f79969exv8);
        this.as = (Chip) findViewById(C6095k.y.f80034mj);
        this.bg = (ClockHandView) findViewById(C6095k.y.f80006kbj);
        m15121x();
        zp();
    }
}

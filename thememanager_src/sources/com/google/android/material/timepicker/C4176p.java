package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0498q;
import androidx.core.view.accessibility.ki;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.C4044h;
import com.google.android.material.timepicker.TimePickerView;
import ij.C6095k;
import java.lang.reflect.Field;
import java.util.Locale;
import p023g.C6045k;
import zy.x2;

/* JADX INFO: renamed from: com.google.android.material.timepicker.p */
/* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
class C4176p implements TimePickerView.f7l8, InterfaceC4181y {

    /* JADX INFO: renamed from: h */
    private final EditText f25375h;

    /* JADX INFO: renamed from: i */
    private final EditText f25376i;

    /* JADX INFO: renamed from: k */
    private final LinearLayout f25377k;

    /* JADX INFO: renamed from: p */
    private final ViewOnKeyListenerC4178s f25379p;

    /* JADX INFO: renamed from: q */
    private final TimeModel f25380q;

    /* JADX INFO: renamed from: s */
    private final ChipTextInputComboView f25381s;

    /* JADX INFO: renamed from: y */
    private final ChipTextInputComboView f25382y;

    /* JADX INFO: renamed from: z */
    private MaterialButtonToggleGroup f25383z;

    /* JADX INFO: renamed from: n */
    private final TextWatcher f25378n = new k();

    /* JADX INFO: renamed from: g */
    private final TextWatcher f25374g = new toq();

    /* JADX INFO: renamed from: com.google.android.material.timepicker.p$g */
    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    class g implements MaterialButtonToggleGroup.InterfaceC3965q {
        g() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC3965q
        /* JADX INFO: renamed from: k */
        public void mo14182k(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z2) {
            C4176p.this.f25380q.ld6(i2 == C6095k.y.f79942btvn ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.p$k */
    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    class k extends C4044h {
        k() {
        }

        @Override // com.google.android.material.internal.C4044h, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    C4176p.this.f25380q.m15116p(0);
                } else {
                    C4176p.this.f25380q.m15116p(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.p$n */
    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    class n extends C4174k {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ TimeModel f67963toq;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Context context, int i2, TimeModel timeModel) {
            super(context, i2);
            this.f67963toq = timeModel;
        }

        @Override // com.google.android.material.timepicker.C4174k, androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.yqrt(view.getResources().getString(C6095k.qrj.f79780a98o, String.valueOf(this.f67963toq.f25355n)));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.p$q */
    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    class q extends C4174k {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ TimeModel f67965toq;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Context context, int i2, TimeModel timeModel) {
            super(context, i2);
            this.f67965toq = timeModel;
        }

        @Override // com.google.android.material.timepicker.C4174k, androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            kiVar.yqrt(view.getResources().getString(C6095k.qrj.f79783bf2, String.valueOf(this.f67965toq.zy())));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.p$toq */
    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    class toq extends C4044h {
        toq() {
        }

        @Override // com.google.android.material.internal.C4044h, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    C4176p.this.f25380q.f7l8(0);
                } else {
                    C4176p.this.f25380q.f7l8(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.p$zy */
    /* JADX INFO: compiled from: TimePickerTextInputPresenter.java */
    class zy implements View.OnClickListener {
        zy() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4176p.this.mo15127q(((Integer) view.getTag(C6095k.y.x3b)).intValue());
        }
    }

    public C4176p(LinearLayout linearLayout, TimeModel timeModel) {
        this.f25377k = linearLayout;
        this.f25380q = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(C6095k.y.f80056ovdh);
        this.f25382y = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(C6095k.y.f80108xm);
        this.f25381s = chipTextInputComboView2;
        int i2 = C6095k.y.f79950cn02;
        TextView textView = (TextView) chipTextInputComboView.findViewById(i2);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(i2);
        textView.setText(resources.getString(C6095k.qrj.f79787c8jq));
        textView2.setText(resources.getString(C6095k.qrj.f79865y2));
        int i3 = C6095k.y.x3b;
        chipTextInputComboView.setTag(i3, 12);
        chipTextInputComboView2.setTag(i3, 10);
        if (timeModel.f25354k == 0) {
            x2();
        }
        zy zyVar = new zy();
        chipTextInputComboView2.setOnClickListener(zyVar);
        chipTextInputComboView.setOnClickListener(zyVar);
        chipTextInputComboView2.zy(timeModel.getHourInputValidator());
        chipTextInputComboView.zy(timeModel.getMinuteInputValidator());
        this.f25375h = chipTextInputComboView2.m15100n().getEditText();
        this.f25376i = chipTextInputComboView.m15100n().getEditText();
        this.f25379p = new ViewOnKeyListenerC4178s(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.m15099g(new q(linearLayout.getContext(), C6095k.qrj.f35681b, timeModel));
        chipTextInputComboView.m15099g(new n(linearLayout.getContext(), C6095k.qrj.f79813i1, timeModel));
        mo15132k();
    }

    private void ld6(TimeModel timeModel) {
        m15135y();
        Locale locale = this.f25377k.getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.f25352s, Integer.valueOf(timeModel.f25355n));
        String str2 = String.format(locale, TimeModel.f25352s, Integer.valueOf(timeModel.zy()));
        this.f25382y.m15101s(str);
        this.f25381s.m15101s(str2);
        zy();
        qrj();
    }

    /* JADX INFO: renamed from: p */
    private static void m15134p(EditText editText, @x2 int i2) {
        try {
            Context context = editText.getContext();
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i3 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable qVar = C6045k.toq(context, i3);
            qVar.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{qVar, qVar});
        } catch (Throwable unused) {
        }
    }

    private void qrj() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f25383z;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.m14179n(this.f25380q.f25357y == 0 ? C6095k.y.f79982gb : C6095k.y.f79942btvn);
    }

    private void x2() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f25377k.findViewById(C6095k.y.f80012kq2f);
        this.f25383z = materialButtonToggleGroup;
        materialButtonToggleGroup.toq(new g());
        this.f25383z.setVisibility(0);
        qrj();
    }

    /* JADX INFO: renamed from: y */
    private void m15135y() {
        this.f25375h.removeTextChangedListener(this.f25374g);
        this.f25376i.removeTextChangedListener(this.f25378n);
    }

    private void zy() {
        this.f25375h.addTextChangedListener(this.f25374g);
        this.f25376i.addTextChangedListener(this.f25378n);
    }

    public void f7l8() {
        this.f25382y.setChecked(false);
        this.f25381s.setChecked(false);
    }

    @Override // com.google.android.material.timepicker.InterfaceC4181y
    /* JADX INFO: renamed from: g */
    public void mo15131g() {
        this.f25377k.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.InterfaceC4181y
    public void invalidate() {
        ld6(this.f25380q);
    }

    @Override // com.google.android.material.timepicker.InterfaceC4181y
    /* JADX INFO: renamed from: k */
    public void mo15132k() {
        zy();
        ld6(this.f25380q);
        this.f25379p.m15140k();
    }

    @Override // com.google.android.material.timepicker.InterfaceC4181y
    /* JADX INFO: renamed from: n */
    public void mo15133n() {
        View focusedChild = this.f25377k.getFocusedChild();
        if (focusedChild == null) {
            this.f25377k.setVisibility(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) C0498q.kja0(this.f25377k.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.f25377k.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f7l8
    /* JADX INFO: renamed from: q */
    public void mo15127q(int i2) {
        this.f25380q.f25353g = i2;
        this.f25382y.setChecked(i2 == 12);
        this.f25381s.setChecked(i2 == 10);
        qrj();
    }

    /* JADX INFO: renamed from: s */
    public void m15136s() {
        this.f25382y.setChecked(this.f25380q.f25353g == 12);
        this.f25381s.setChecked(this.f25380q.f25353g == 10);
    }
}

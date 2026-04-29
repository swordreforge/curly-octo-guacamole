package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.preference.fn3e;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final C0986k bc;

    /* JADX INFO: renamed from: androidx.preference.CheckBoxPreference$k */
    private class C0986k implements CompoundButton.OnCheckedChangeListener {
        C0986k() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            if (CheckBoxPreference.this.zy(Boolean.valueOf(z2))) {
                CheckBoxPreference.this.setChecked(z2);
            } else {
                compoundButton.setChecked(!z2);
            }
        }
    }

    public CheckBoxPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    private void ebn(@lvui View view) {
        if (((AccessibilityManager) x2().getSystemService("accessibility")).isEnabled()) {
            ukdy(view.findViewById(R.id.checkbox));
            ixz(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ukdy(View view) {
        boolean z2 = view instanceof CompoundButton;
        if (z2) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.be);
        }
        if (z2) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.bc);
        }
    }

    @Override // androidx.preference.Preference
    @uv6({uv6.EnumC7844k.LIBRARY})
    protected void lv5(@lvui View view) {
        super.lv5(view);
        ebn(view);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: o */
    public void mo4638o(@lvui C1016i c1016i) {
        super.mo4638o(c1016i);
        ukdy(c1016i.fn3e(R.id.checkbox));
        m28248do(c1016i);
    }

    public CheckBoxPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.bc = new C0986k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fn3e.ld6.f5503q, i2, i3);
        wx16(androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f5502p, fn3e.ld6.f5500n));
        yl(androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f5505s, fn3e.ld6.f5493g));
        mbx(androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, fn3e.ld6.f5510y, fn3e.ld6.f51835f7l8, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.kja0.m2303k(context, fn3e.C1008k.f5478n, R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(@lvui Context context) {
        this(context, null);
    }
}

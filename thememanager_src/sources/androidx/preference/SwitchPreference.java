package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.preference.fn3e;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final C1003k bc;
    private CharSequence bd;
    private CharSequence bu;

    /* JADX INFO: renamed from: androidx.preference.SwitchPreference$k */
    private class C1003k implements CompoundButton.OnCheckedChangeListener {
        C1003k() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            if (SwitchPreference.this.zy(Boolean.valueOf(z2))) {
                SwitchPreference.this.setChecked(z2);
            } else {
                compoundButton.setChecked(!z2);
            }
        }
    }

    public SwitchPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.bc = new C1003k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fn3e.ld6.f51902vep5, i2, i3);
        wx16(androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f51899ukdy, fn3e.ld6.f51870mbx));
        yl(androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f46169do, fn3e.ld6.f51855jbh));
        zwy(androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f51884pc, fn3e.ld6.f51897uc));
        ij(androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f51831ebn, fn3e.ld6.f51910wx16));
        mbx(androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, fn3e.ld6.f51854ixz, fn3e.ld6.f51916yl, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void n2t(View view) {
        boolean z2 = view instanceof Switch;
        if (z2) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.be);
        }
        if (z2) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.bu);
            r4.setTextOff(this.bd);
            r4.setOnCheckedChangeListener(this.bc);
        }
    }

    private void pjz9(View view) {
        if (((AccessibilityManager) x2().getSystemService("accessibility")).isEnabled()) {
            n2t(view.findViewById(R.id.switch_widget));
            ixz(view.findViewById(R.id.summary));
        }
    }

    @dd
    public CharSequence ebn() {
        return this.bu;
    }

    public void ij(@dd CharSequence charSequence) {
        this.bd = charSequence;
        uv6();
    }

    @Override // androidx.preference.Preference
    @uv6({uv6.EnumC7844k.LIBRARY})
    protected void lv5(@lvui View view) {
        super.lv5(view);
        pjz9(view);
    }

    public void nsb(int i2) {
        zwy(x2().getString(i2));
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: o */
    public void mo4638o(@lvui C1016i c1016i) {
        super.mo4638o(c1016i);
        n2t(c1016i.fn3e(R.id.switch_widget));
        m28248do(c1016i);
    }

    public void pc(int i2) {
        ij(x2().getString(i2));
    }

    @dd
    public CharSequence ukdy() {
        return this.bd;
    }

    public void zwy(@dd CharSequence charSequence) {
        this.bu = charSequence;
        uv6();
    }

    public SwitchPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SwitchPreference(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.kja0.m2303k(context, fn3e.C1008k.f5479o, R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(@lvui Context context) {
        this(context, null);
    }
}

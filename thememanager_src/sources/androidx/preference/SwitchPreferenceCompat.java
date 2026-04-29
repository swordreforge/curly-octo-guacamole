package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.fn3e;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final C1004k bc;
    private CharSequence bd;
    private CharSequence bu;

    /* JADX INFO: renamed from: androidx.preference.SwitchPreferenceCompat$k */
    private class C1004k implements CompoundButton.OnCheckedChangeListener {
        C1004k() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            if (SwitchPreferenceCompat.this.zy(Boolean.valueOf(z2))) {
                SwitchPreferenceCompat.this.setChecked(z2);
            } else {
                compoundButton.setChecked(!z2);
            }
        }
    }

    public SwitchPreferenceCompat(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.bc = new C1004k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fn3e.ld6.f51852ij, i2, i3);
        wx16(androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f51846h4b, fn3e.ld6.f51881nsb));
        yl(androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f51815bap7, fn3e.ld6.f51924zwy));
        zwy(androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f51841ga, fn3e.ld6.f51885pjz9));
        ij(androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f51907wlev, fn3e.ld6.f51877ngy));
        mbx(androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, fn3e.ld6.f51864lh, fn3e.ld6.f51873n2t, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void n2t(View view) {
        boolean z2 = view instanceof SwitchCompat;
        if (z2) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.be);
        }
        if (z2) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.bu);
            switchCompat.setTextOff(this.bd);
            switchCompat.setOnCheckedChangeListener(this.bc);
        }
    }

    private void pjz9(View view) {
        if (((AccessibilityManager) x2().getSystemService("accessibility")).isEnabled()) {
            n2t(view.findViewById(fn3e.C1007g.f5465s));
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
        n2t(c1016i.fn3e(fn3e.C1007g.f5465s));
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

    public SwitchPreferenceCompat(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SwitchPreferenceCompat(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, fn3e.C1008k.f5474j);
    }

    public SwitchPreferenceCompat(@lvui Context context) {
        this(context, null);
    }
}

package miuix.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.C1016i;
import miuix.view.C7385p;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes2.dex */
public class CheckBoxPreference extends androidx.preference.CheckBoxPreference {
    private View bu;

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    /* JADX INFO: renamed from: m */
    protected void mo4639m() {
        super.mo4639m();
        View view = this.bu;
        if (view != null) {
            HapticCompat.m26766g(view, C7385p.f92242jp0y, C7385p.f42280y);
        }
    }

    @Override // androidx.preference.CheckBoxPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: o */
    public void mo4638o(C1016i c1016i) {
        super.mo4638o(c1016i);
        this.bu = c1016i.itemView;
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CheckBoxPreference(Context context) {
        super(context);
    }
}

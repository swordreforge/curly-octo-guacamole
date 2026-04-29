package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.preference.Preference;
import miuix.preference.kja0;

/* JADX INFO: loaded from: classes2.dex */
public class RadioSetPreferenceCategory extends androidx.preference.PreferenceCategory implements Checkable {
    private String dy;
    private boolean sk1t;
    private InterfaceC7310s tgs;
    private RadioButtonPreference vb6;
    private InterfaceC7310s yl25;
    private boolean zmmu;

    /* JADX INFO: renamed from: miuix.preference.RadioSetPreferenceCategory$k */
    class C7284k implements InterfaceC7310s {
        C7284k() {
        }

        @Override // miuix.preference.InterfaceC7310s
        /* JADX INFO: renamed from: k */
        public boolean mo26471k(Preference preference, Object obj) {
            if (RadioSetPreferenceCategory.this.tgs != null) {
                return RadioSetPreferenceCategory.this.tgs.mo26471k(preference, obj);
            }
            return true;
        }

        @Override // miuix.preference.InterfaceC7310s
        public void toq(Preference preference) {
            if (preference instanceof RadioButtonPreference) {
                RadioSetPreferenceCategory.this.setChecked(((RadioButtonPreference) preference).isChecked());
            }
            if (RadioSetPreferenceCategory.this.tgs != null) {
                RadioSetPreferenceCategory.this.tgs.toq(preference);
            }
        }
    }

    public RadioSetPreferenceCategory(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.yl25 = new C7284k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kja0.ki.eb, i2, i3);
        this.dy = typedArrayObtainStyledAttributes.getString(kja0.ki.mwew);
        typedArrayObtainStyledAttributes.recycle();
    }

    public RadioButtonPreference bap7() {
        return this.vb6;
    }

    void h4b(InterfaceC7310s interfaceC7310s) {
        this.tgs = interfaceC7310s;
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean h7am(Preference preference) {
        String str = this.dy;
        if (str == null) {
            if (uc() == 0) {
                if (!(preference instanceof RadioButtonPreference)) {
                    throw new IllegalArgumentException("The first preference must be RadioButtonPreference, if primary key is empty");
                }
                RadioButtonPreference radioButtonPreference = (RadioButtonPreference) preference;
                this.vb6 = radioButtonPreference;
                radioButtonPreference.ij(this.yl25);
            }
        } else if (str.equals(preference.fn3e())) {
            RadioButtonPreference radioButtonPreference2 = this.vb6;
            if (radioButtonPreference2 != null && radioButtonPreference2 != preference) {
                throw new IllegalArgumentException("must not have two primary preference");
            }
            if (!(preference instanceof RadioButtonPreference)) {
                throw new IllegalArgumentException("Primary preference must be RadioButtonPreference");
            }
            RadioButtonPreference radioButtonPreference3 = (RadioButtonPreference) preference;
            this.vb6 = radioButtonPreference3;
            radioButtonPreference3.ij(this.yl25);
        }
        return super.h7am(preference);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.zmmu;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if ((this.zmmu != z2) || !this.sk1t) {
            this.zmmu = z2;
            this.sk1t = true;
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public RadioSetPreferenceCategory(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public RadioSetPreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kja0.C7297q.oa);
    }

    public RadioSetPreferenceCategory(Context context) {
        this(context, null);
    }
}

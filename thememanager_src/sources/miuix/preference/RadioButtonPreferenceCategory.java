package miuix.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.preference.Preference;
import miuix.preference.kja0;

/* JADX INFO: loaded from: classes2.dex */
public class RadioButtonPreferenceCategory extends androidx.preference.PreferenceCategory {
    private static final String sk1t = "RadioButtonPreferenceCategory";
    private AbstractC7283q tgs;
    private int yl25;
    private InterfaceC7310s zmmu;

    /* JADX INFO: renamed from: miuix.preference.RadioButtonPreferenceCategory$k */
    class C7282k implements InterfaceC7310s {
        C7282k() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // miuix.preference.InterfaceC7310s
        /* JADX INFO: renamed from: k */
        public boolean mo26471k(Preference preference, Object obj) {
            boolean zIsChecked = ((Checkable) preference).isChecked();
            Preference.InterfaceC0998q interfaceC0998qFu4 = RadioButtonPreferenceCategory.this.fu4();
            if (interfaceC0998qFu4 != null) {
                RadioButtonPreferenceCategory.this.e5(preference, obj);
                interfaceC0998qFu4.onPreferenceClick(RadioButtonPreferenceCategory.this);
            }
            return !zIsChecked;
        }

        @Override // miuix.preference.InterfaceC7310s
        public void toq(Preference preference) {
            AbstractC7283q abstractC7283qLw = RadioButtonPreferenceCategory.this.lw(preference);
            RadioButtonPreferenceCategory.this.cnbm(abstractC7283qLw);
            RadioButtonPreferenceCategory.this.m58i(abstractC7283qLw);
        }
    }

    /* JADX INFO: renamed from: miuix.preference.RadioButtonPreferenceCategory$q */
    abstract class AbstractC7283q implements Checkable {

        /* JADX INFO: renamed from: k */
        Checkable f41141k;

        AbstractC7283q(Checkable checkable) {
            this.f41141k = checkable;
        }

        @Override // android.widget.Checkable
        public boolean isChecked() {
            return this.f41141k.isChecked();
        }

        /* JADX INFO: renamed from: k */
        abstract Preference mo26472k();

        @Override // android.widget.Checkable
        public void setChecked(boolean z2) {
            this.f41141k.setChecked(z2);
        }

        @Override // android.widget.Checkable
        public void toggle() {
            setChecked(!isChecked());
        }

        abstract void toq(InterfaceC7310s interfaceC7310s);
    }

    class toq extends AbstractC7283q {

        /* JADX INFO: renamed from: n */
        private RadioSetPreferenceCategory f41144n;

        toq(RadioSetPreferenceCategory radioSetPreferenceCategory) {
            super(radioSetPreferenceCategory);
            this.f41144n = radioSetPreferenceCategory;
        }

        @Override // miuix.preference.RadioButtonPreferenceCategory.AbstractC7283q
        /* JADX INFO: renamed from: k */
        public Preference mo26472k() {
            return this.f41144n;
        }

        @Override // miuix.preference.RadioButtonPreferenceCategory.AbstractC7283q, android.widget.Checkable
        public void setChecked(boolean z2) {
            super.setChecked(z2);
            if (this.f41144n.bap7() != null) {
                this.f41144n.bap7().setChecked(z2);
            }
        }

        @Override // miuix.preference.RadioButtonPreferenceCategory.AbstractC7283q
        public void toq(InterfaceC7310s interfaceC7310s) {
            this.f41144n.h4b(interfaceC7310s);
        }
    }

    class zy extends AbstractC7283q {

        /* JADX INFO: renamed from: n */
        RadioButtonPreference f41146n;

        zy(RadioButtonPreference radioButtonPreference) {
            super(radioButtonPreference);
            this.f41146n = radioButtonPreference;
        }

        @Override // miuix.preference.RadioButtonPreferenceCategory.AbstractC7283q
        /* JADX INFO: renamed from: k */
        public Preference mo26472k() {
            return this.f41146n;
        }

        @Override // miuix.preference.RadioButtonPreferenceCategory.AbstractC7283q
        public void toq(InterfaceC7310s interfaceC7310s) {
            this.f41146n.ij(interfaceC7310s);
        }
    }

    public RadioButtonPreferenceCategory(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.tgs = null;
        this.yl25 = -1;
        this.zmmu = new C7282k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cnbm(AbstractC7283q abstractC7283q) {
        if (abstractC7283q.isChecked()) {
            AbstractC7283q abstractC7283q2 = this.tgs;
            if (abstractC7283q2 != null && abstractC7283q2.mo26472k() != abstractC7283q.mo26472k()) {
                this.tgs.setChecked(false);
            }
            this.tgs = abstractC7283q;
        }
    }

    private void dxef() {
        AbstractC7283q abstractC7283q = this.tgs;
        if (abstractC7283q != null) {
            abstractC7283q.setChecked(false);
        }
        this.tgs = null;
        this.yl25 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e5(Preference preference, Object obj) {
        Preference preferenceO1t = preference.o1t() instanceof RadioSetPreferenceCategory ? preference.o1t() : preference;
        AbstractC7283q abstractC7283q = this.tgs;
        if ((abstractC7283q == null || preferenceO1t != abstractC7283q.mo26472k()) && ga(obj, preferenceO1t)) {
            oki(preference);
        }
    }

    private boolean ga(Object obj, Preference preference) {
        return preference.ni7() == null || preference.ni7().onPreferenceChange(preference, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC7283q lw(Preference preference) {
        if (preference instanceof RadioButtonPreference) {
            return preference.o1t() instanceof RadioSetPreferenceCategory ? new toq((RadioSetPreferenceCategory) preference.o1t()) : new zy((RadioButtonPreference) preference);
        }
        if (preference instanceof RadioSetPreferenceCategory) {
            return new toq((RadioSetPreferenceCategory) preference);
        }
        throw new IllegalArgumentException("Only RadioButtonPreference or RadioSetPreferenceCategory can be added to RadioButtonPreferenceCategory");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m58i(AbstractC7283q abstractC7283q) {
        if (abstractC7283q.isChecked()) {
            int iUc = uc();
            for (int i2 = 0; i2 < iUc; i2++) {
                if (yl(i2) == abstractC7283q.mo26472k()) {
                    this.yl25 = i2;
                    return;
                }
            }
        }
    }

    private void o05(AbstractC7283q abstractC7283q) {
        abstractC7283q.setChecked(true);
    }

    public Preference a5id() {
        AbstractC7283q abstractC7283q = this.tgs;
        if (abstractC7283q == null) {
            return null;
        }
        return abstractC7283q.mo26472k();
    }

    @Override // androidx.preference.PreferenceGroup
    public void ebn() {
        super.ebn();
        this.yl25 = -1;
        this.tgs = null;
    }

    public void gcp(int i2) {
        AbstractC7283q abstractC7283qLw = lw(yl(i2));
        if (abstractC7283qLw.isChecked()) {
            return;
        }
        o05(abstractC7283qLw);
        cnbm(abstractC7283qLw);
        this.yl25 = i2;
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean h7am(Preference preference) {
        AbstractC7283q abstractC7283qLw = lw(preference);
        boolean zH7am = super.h7am(preference);
        if (zH7am) {
            abstractC7283qLw.toq(this.zmmu);
        }
        if (abstractC7283qLw.isChecked()) {
            if (this.tgs != null) {
                throw new IllegalStateException("Already has a checked item, please check state of new add preference");
            }
            this.tgs = abstractC7283qLw;
        }
        return zH7am;
    }

    public void oki(Preference preference) {
        if (preference == null) {
            dxef();
            return;
        }
        AbstractC7283q abstractC7283qLw = lw(preference);
        if (abstractC7283qLw.isChecked()) {
            return;
        }
        o05(abstractC7283qLw);
        cnbm(abstractC7283qLw);
        m58i(abstractC7283qLw);
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean pc(Preference preference) {
        AbstractC7283q abstractC7283qLw = lw(preference);
        boolean zPc = super.pc(preference);
        if (zPc) {
            abstractC7283qLw.toq(null);
            if (abstractC7283qLw.isChecked()) {
                abstractC7283qLw.setChecked(false);
                this.yl25 = -1;
                this.tgs = null;
            }
        }
        return zPc;
    }

    public int vy() {
        AbstractC7283q abstractC7283q;
        if (this.yl25 == -1 && (abstractC7283q = this.tgs) != null) {
            m58i(abstractC7283q);
        }
        return this.yl25;
    }

    public RadioButtonPreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kja0.C7297q.bic);
    }

    public RadioButtonPreferenceCategory(Context context) {
        this(context, null);
    }
}

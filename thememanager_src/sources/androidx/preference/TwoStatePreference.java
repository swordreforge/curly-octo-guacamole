package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    private CharSequence aj;
    private boolean ar;
    protected boolean be;
    private CharSequence bs;
    private boolean k0;

    public TwoStatePreference(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.preference.Preference
    @dd
    /* JADX INFO: renamed from: a */
    protected Parcelable mo4640a() {
        Parcelable parcelableMo4640a = super.mo4640a();
        if (n5r1()) {
            return parcelableMo4640a;
        }
        SavedState savedState = new SavedState(parcelableMo4640a);
        savedState.f5445k = isChecked();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void a98o(@dd Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a98o(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a98o(savedState.getSuperState());
        setChecked(savedState.f5445k);
    }

    @Override // androidx.preference.Preference
    public boolean bz2() {
        return (this.ar ? this.be : !this.be) || super.bz2();
    }

    public boolean cv06() {
        return this.ar;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    protected void m28248do(@lvui C1016i c1016i) {
        ixz(c1016i.fn3e(R.id.summary));
    }

    @dd
    public CharSequence h7am() {
        return this.bs;
    }

    public boolean isChecked() {
        return this.be;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @zy.uv6({zy.uv6.EnumC7844k.LIBRARY})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void ixz(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.be
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.CharSequence r1 = r4.aj
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            java.lang.CharSequence r0 = r4.aj
            r5.setText(r0)
        L1a:
            r0 = r2
            goto L2e
        L1c:
            boolean r1 = r4.be
            if (r1 != 0) goto L2e
            java.lang.CharSequence r1 = r4.bs
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2e
            java.lang.CharSequence r0 = r4.bs
            r5.setText(r0)
            goto L1a
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r1 = r4.eqxt()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L3e
            r5.setText(r1)
            r0 = r2
        L3e:
            r1 = 8
            if (r0 != 0) goto L43
            goto L44
        L43:
            r2 = r1
        L44:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L4d
            r5.setVisibility(r2)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.ixz(android.view.View):void");
    }

    public void jbh(int i2) {
        yl(x2().getString(i2));
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: m */
    protected void mo4639m() {
        super.mo4639m();
        boolean z2 = !isChecked();
        if (zy(Boolean.valueOf(z2))) {
            setChecked(z2);
        }
    }

    public void mbx(boolean z2) {
        this.ar = z2;
    }

    public void setChecked(boolean z2) {
        boolean z3 = this.be != z2;
        if (z3 || !this.k0) {
            this.be = z2;
            this.k0 = true;
            t8iq(z2);
            if (z3) {
                vyq(bz2());
                uv6();
            }
        }
    }

    public void uc(int i2) {
        wx16(x2().getString(i2));
    }

    @dd
    public CharSequence vep5() {
        return this.aj;
    }

    public void wx16(@dd CharSequence charSequence) {
        this.aj = charSequence;
        if (isChecked()) {
            uv6();
        }
    }

    @Override // androidx.preference.Preference
    @dd
    protected Object y9n(@lvui TypedArray typedArray, int i2) {
        return Boolean.valueOf(typedArray.getBoolean(i2, false));
    }

    public void yl(@dd CharSequence charSequence) {
        this.bs = charSequence;
        if (isChecked()) {
            return;
        }
        uv6();
    }

    @Override // androidx.preference.Preference
    protected void zp(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        setChecked(wvg(((Boolean) obj).booleanValue()));
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.TwoStatePreference.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: k */
        boolean f5445k;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f5445k = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f5445k ? 1 : 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public TwoStatePreference(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(@lvui Context context) {
        this(context, null);
    }
}

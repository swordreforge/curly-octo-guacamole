package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.preference.Preference;
import androidx.preference.fn3e;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    @dd
    private InterfaceC0990k bd;
    private String bu;

    /* JADX INFO: renamed from: androidx.preference.EditTextPreference$k */
    public interface InterfaceC0990k {
        /* JADX INFO: renamed from: k */
        void m4642k(@lvui EditText editText);
    }

    public static final class toq implements Preference.InterfaceC0995g<EditTextPreference> {

        /* JADX INFO: renamed from: k */
        private static toq f5404k;

        private toq() {
        }

        @lvui
        public static toq toq() {
            if (f5404k == null) {
                f5404k = new toq();
            }
            return f5404k;
        }

        @Override // androidx.preference.Preference.InterfaceC0995g
        @dd
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public CharSequence mo4643k(@lvui EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.ngy()) ? editTextPreference.x2().getString(fn3e.C1012s.f51953zy) : editTextPreference.ngy();
        }
    }

    public EditTextPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fn3e.ld6.f51839fu4, i2, i3);
        int i4 = fn3e.ld6.f5511z;
        if (androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, i4, i4, false)) {
            yqrt(toq.toq());
        }
        typedArrayObtainStyledAttributes.recycle();
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
        savedState.f5403k = ngy();
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
        bap7(savedState.f5403k);
    }

    public void bap7(@dd String str) {
        boolean zBz2 = bz2();
        this.bu = str;
        c8jq(str);
        boolean zBz22 = bz2();
        if (zBz22 != zBz2) {
            vyq(zBz22);
        }
        uv6();
    }

    @Override // androidx.preference.Preference
    public boolean bz2() {
        return TextUtils.isEmpty(this.bu) || super.bz2();
    }

    public void lh(@dd InterfaceC0990k interfaceC0990k) {
        this.bd = interfaceC0990k;
    }

    @dd
    public String ngy() {
        return this.bu;
    }

    @dd
    InterfaceC0990k pjz9() {
        return this.bd;
    }

    @Override // androidx.preference.Preference
    protected Object y9n(@lvui TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    @Override // androidx.preference.Preference
    protected void zp(Object obj) {
        bap7(a9((String) obj));
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.EditTextPreference.SavedState.1
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
        String f5403k;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f5403k = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f5403k);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public EditTextPreference(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.kja0.m2303k(context, fn3e.C1008k.f51788kja0, R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(@lvui Context context) {
        this(context, null);
    }
}

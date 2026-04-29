package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.fn3e;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import zy.InterfaceC7837n;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    private CharSequence[] bd;
    private CharSequence[] bu;
    private Set<String> tlhn;

    public MultiSelectListPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.tlhn = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fn3e.ld6.f51838fti, i2, i3);
        this.bu = androidx.core.content.res.kja0.cdj(typedArrayObtainStyledAttributes, fn3e.ld6.f51827d3, fn3e.ld6.f51857jp0y);
        this.bd = androidx.core.content.res.kja0.cdj(typedArrayObtainStyledAttributes, fn3e.ld6.f51883oc, fn3e.ld6.f51844gvn7);
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
        savedState.f5407k = h4b();
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
        vy(savedState.f5407k);
    }

    protected boolean[] bap7() {
        CharSequence[] charSequenceArr = this.bd;
        int length = charSequenceArr.length;
        Set<String> set = this.tlhn;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = set.contains(charSequenceArr[i2].toString());
        }
        return zArr;
    }

    public void dxef(CharSequence[] charSequenceArr) {
        this.bd = charSequenceArr;
    }

    public void e5(@InterfaceC7837n int i2) {
        dxef(x2().getResources().getTextArray(i2));
    }

    public void ga(CharSequence[] charSequenceArr) {
        this.bu = charSequenceArr;
    }

    public Set<String> h4b() {
        return this.tlhn;
    }

    public CharSequence[] lh() {
        return this.bd;
    }

    public CharSequence[] ngy() {
        return this.bu;
    }

    public int pjz9(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.bd) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.bd[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public void vy(Set<String> set) {
        this.tlhn.clear();
        this.tlhn.addAll(set);
        gyi(set);
        uv6();
    }

    public void wlev(@InterfaceC7837n int i2) {
        ga(x2().getResources().getTextArray(i2));
    }

    @Override // androidx.preference.Preference
    @dd
    protected Object y9n(@lvui TypedArray typedArray, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected void zp(Object obj) {
        vy(fti((Set) obj));
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.MultiSelectListPreference.SavedState.1
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
        Set<String> f5407k;

        SavedState(Parcel parcel) {
            super(parcel);
            int i2 = parcel.readInt();
            this.f5407k = new HashSet();
            String[] strArr = new String[i2];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f5407k, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f5407k.size());
            Set<String> set = this.f5407k;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MultiSelectListPreference(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.kja0.m2303k(context, fn3e.C1008k.f51789ld6, R.attr.dialogPreferenceStyle));
    }

    public MultiSelectListPreference(@lvui Context context) {
        this(context, null);
    }
}

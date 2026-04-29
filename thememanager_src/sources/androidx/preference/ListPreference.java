package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import androidx.preference.fn3e;
import zy.InterfaceC7837n;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private static final String yl25 = "ListPreference";
    private CharSequence[] bd;
    private CharSequence[] bu;
    private boolean tgs;
    private String tlhn;
    private String w97r;

    /* JADX INFO: renamed from: androidx.preference.ListPreference$k */
    public static final class C0992k implements Preference.InterfaceC0995g<ListPreference> {

        /* JADX INFO: renamed from: k */
        private static C0992k f5406k;

        private C0992k() {
        }

        @lvui
        public static C0992k toq() {
            if (f5406k == null) {
                f5406k = new C0992k();
            }
            return f5406k;
        }

        @Override // androidx.preference.Preference.InterfaceC0995g
        @dd
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public CharSequence mo4643k(@lvui ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.lh()) ? listPreference.x2().getString(fn3e.C1012s.f51953zy) : listPreference.lh();
        }
    }

    public ListPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fn3e.ld6.f51882o1t, i2, i3);
        this.bu = androidx.core.content.res.kja0.cdj(typedArrayObtainStyledAttributes, fn3e.ld6.f51871mcp, fn3e.ld6.f51909wvg);
        this.bd = androidx.core.content.res.kja0.cdj(typedArrayObtainStyledAttributes, fn3e.ld6.f51856jk, fn3e.ld6.f5506t);
        int i4 = fn3e.ld6.f51812a9;
        if (androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, i4, i4, false)) {
            yqrt(C0992k.toq());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, fn3e.ld6.f51833eqxt, i2, i3);
        this.w97r = androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes2, fn3e.ld6.f51893t8iq, fn3e.ld6.f51874n5r1);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private int wlev() {
        return pjz9(this.tlhn);
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
        savedState.f5405k = h4b();
        return savedState;
    }

    public void a5id(String str) {
        boolean z2 = !TextUtils.equals(this.tlhn, str);
        if (z2 || !this.tgs) {
            this.tlhn = str;
            this.tgs = true;
            c8jq(str);
            if (z2) {
                uv6();
            }
        }
    }

    @Override // androidx.preference.Preference
    protected void a98o(@dd Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a98o(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.a98o(savedState.getSuperState());
        a5id(savedState.f5405k);
    }

    public CharSequence[] bap7() {
        return this.bd;
    }

    public void dxef(@InterfaceC7837n int i2) {
        vy(x2().getResources().getTextArray(i2));
    }

    public void e5(CharSequence[] charSequenceArr) {
        this.bu = charSequenceArr;
    }

    @Override // androidx.preference.Preference
    @dd
    public CharSequence eqxt() {
        if (d2ok() != null) {
            return d2ok().mo4643k(this);
        }
        CharSequence charSequenceLh = lh();
        CharSequence charSequenceEqxt = super.eqxt();
        String str = this.w97r;
        if (str == null) {
            return charSequenceEqxt;
        }
        Object[] objArr = new Object[1];
        if (charSequenceLh == null) {
            charSequenceLh = "";
        }
        objArr[0] = charSequenceLh;
        String str2 = String.format(str, objArr);
        if (TextUtils.equals(str2, charSequenceEqxt)) {
            return charSequenceEqxt;
        }
        Log.w(yl25, "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    public void ga(@InterfaceC7837n int i2) {
        e5(x2().getResources().getTextArray(i2));
    }

    public String h4b() {
        return this.tlhn;
    }

    @dd
    public CharSequence lh() {
        CharSequence[] charSequenceArr;
        int iWlev = wlev();
        if (iWlev < 0 || (charSequenceArr = this.bu) == null) {
            return null;
        }
        return charSequenceArr[iWlev];
    }

    public void lw(int i2) {
        CharSequence[] charSequenceArr = this.bd;
        if (charSequenceArr != null) {
            a5id(charSequenceArr[i2].toString());
        }
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

    public void vy(CharSequence[] charSequenceArr) {
        this.bd = charSequenceArr;
    }

    @Override // androidx.preference.Preference
    protected Object y9n(@lvui TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    @Override // androidx.preference.Preference
    public void z4(@dd CharSequence charSequence) {
        super.z4(charSequence);
        if (charSequence == null) {
            this.w97r = null;
        } else {
            this.w97r = charSequence.toString();
        }
    }

    @Override // androidx.preference.Preference
    protected void zp(Object obj) {
        a5id(a9((String) obj));
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.ListPreference.SavedState.1
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
        String f5405k;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f5405k = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f5405k);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ListPreference(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.kja0.m2303k(context, fn3e.C1008k.f51789ld6, R.attr.dialogPreferenceStyle));
    }

    public ListPreference(@lvui Context context) {
        this(context, null);
    }
}

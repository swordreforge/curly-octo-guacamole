package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import androidx.preference.fn3e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    private static final String w97r = "PreferenceGroup";
    private final Handler aj;
    private int ar;
    private boolean bc;
    private toq bd;
    final androidx.collection.qrj<String, Long> be;
    private final List<Preference> bs;
    private int bu;
    private boolean k0;
    private final Runnable tlhn;

    /* JADX INFO: renamed from: androidx.preference.PreferenceGroup$k */
    class RunnableC1000k implements Runnable {
        RunnableC1000k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.be.clear();
            }
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public interface toq {
        /* JADX INFO: renamed from: k */
        void m4669k();
    }

    public interface zy {
        /* JADX INFO: renamed from: q */
        int mo4670q(@lvui Preference preference);

        int qrj(@lvui String str);
    }

    public PreferenceGroup(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.be = new androidx.collection.qrj<>();
        this.aj = new Handler(Looper.getMainLooper());
        this.k0 = true;
        this.ar = 0;
        this.bc = false;
        this.bu = Integer.MAX_VALUE;
        this.bd = null;
        this.tlhn = new RunnableC1000k();
        this.bs = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fn3e.ld6.f51887qkj8, i2, i3);
        int i4 = fn3e.ld6.f51895tfm;
        this.k0 = androidx.core.content.res.kja0.toq(typedArrayObtainStyledAttributes, i4, i4, true);
        int i5 = fn3e.ld6.f51888qo;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            zwy(androidx.core.content.res.kja0.m2306q(typedArrayObtainStyledAttributes, i5, i5, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean ij(@lvui Preference preference) {
        boolean zRemove;
        synchronized (this) {
            preference.i1();
            if (preference.o1t() == this) {
                preference.toq(null);
            }
            zRemove = this.bs.remove(preference);
            if (zRemove) {
                String strFn3e = preference.fn3e();
                if (strFn3e != null) {
                    this.be.put(strFn3e, Long.valueOf(preference.ki()));
                    this.aj.removeCallbacks(this.tlhn);
                    this.aj.post(this.tlhn);
                }
                if (this.bc) {
                    preference.yz();
                }
            }
        }
        return zRemove;
    }

    @Override // androidx.preference.Preference
    @lvui
    /* JADX INFO: renamed from: a */
    protected Parcelable mo4640a() {
        return new SavedState(super.mo4640a(), this.bu);
    }

    @Override // androidx.preference.Preference
    protected void a98o(@dd Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.a98o(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.bu = savedState.f5436k;
        super.a98o(savedState.getSuperState());
    }

    public void cv06(@lvui Preference preference) {
        h7am(preference);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public boolean m28246do() {
        return this.k0;
    }

    public void ebn() {
        synchronized (this) {
            List<Preference> list = this.bs;
            for (int size = list.size() - 1; size >= 0; size--) {
                ij(list.get(0));
            }
        }
        m4650e();
    }

    @Override // androidx.preference.Preference
    protected void f7l8(@lvui Bundle bundle) {
        super.f7l8(bundle);
        int iUc = uc();
        for (int i2 = 0; i2 < iUc; i2++) {
            yl(i2).f7l8(bundle);
        }
    }

    public boolean h7am(@lvui Preference preference) {
        long jM4696y;
        if (this.bs.contains(preference)) {
            return true;
        }
        if (preference.fn3e() != null) {
            PreferenceGroup preferenceGroupO1t = this;
            while (preferenceGroupO1t.o1t() != null) {
                preferenceGroupO1t = preferenceGroupO1t.o1t();
            }
            String strFn3e = preference.fn3e();
            if (preferenceGroupO1t.vep5(strFn3e) != null) {
                Log.e(w97r, "Found duplicated key: \"" + strFn3e + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.m4664z() == Integer.MAX_VALUE) {
            if (this.k0) {
                int i2 = this.ar;
                this.ar = i2 + 1;
                preference.r8s8(i2);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).pjz9(this.k0);
            }
        }
        int iBinarySearch = Collections.binarySearch(this.bs, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        if (!ukdy(preference)) {
            return false;
        }
        synchronized (this) {
            this.bs.add(iBinarySearch, preference);
        }
        ki kiVarGvn7 = gvn7();
        String strFn3e2 = preference.fn3e();
        if (strFn3e2 == null || !this.be.containsKey(strFn3e2)) {
            jM4696y = kiVarGvn7.m4696y();
        } else {
            jM4696y = this.be.get(strFn3e2).longValue();
            this.be.remove(strFn3e2);
        }
        preference.m4654j(kiVarGvn7, jM4696y);
        preference.toq(this);
        if (this.bc) {
            preference.nn86();
        }
        m4650e();
        return true;
    }

    protected boolean ixz() {
        return true;
    }

    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public toq jbh() {
        return this.bd;
    }

    public int mbx() {
        return this.bu;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void n2t(@dd toq toqVar) {
        this.bd = toqVar;
    }

    void ngy() {
        synchronized (this) {
            Collections.sort(this.bs);
        }
    }

    @Override // androidx.preference.Preference
    public void nn86() {
        super.nn86();
        this.bc = true;
        int iUc = uc();
        for (int i2 = 0; i2 < iUc; i2++) {
            yl(i2).nn86();
        }
    }

    public boolean nsb(@lvui CharSequence charSequence) {
        Preference preferenceVep5 = vep5(charSequence);
        if (preferenceVep5 == null) {
            return false;
        }
        return preferenceVep5.o1t().pc(preferenceVep5);
    }

    public boolean pc(@lvui Preference preference) {
        boolean zIj = ij(preference);
        m4650e();
        return zIj;
    }

    public void pjz9(boolean z2) {
        this.k0 = z2;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: s */
    protected void mo4659s(@lvui Bundle bundle) {
        super.mo4659s(bundle);
        int iUc = uc();
        for (int i2 = 0; i2 < iUc; i2++) {
            yl(i2).mo4659s(bundle);
        }
    }

    public int uc() {
        return this.bs.size();
    }

    protected boolean ukdy(@lvui Preference preference) {
        preference.bf2(this, bz2());
        return true;
    }

    @dd
    public <T extends Preference> T vep5(@lvui CharSequence charSequence) {
        T t2;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(fn3e(), charSequence)) {
            return this;
        }
        int iUc = uc();
        for (int i2 = 0; i2 < iUc; i2++) {
            PreferenceGroup preferenceGroup = (T) yl(i2);
            if (TextUtils.equals(preferenceGroup.fn3e(), charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t2 = (T) preferenceGroup.vep5(charSequence)) != null) {
                return t2;
            }
        }
        return null;
    }

    @Override // androidx.preference.Preference
    public void vyq(boolean z2) {
        super.vyq(z2);
        int iUc = uc();
        for (int i2 = 0; i2 < iUc; i2++) {
            yl(i2).bf2(this, z2);
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    public boolean wx16() {
        return this.bc;
    }

    @lvui
    public Preference yl(int i2) {
        return this.bs.get(i2);
    }

    @Override // androidx.preference.Preference
    public void yz() {
        super.yz();
        this.bc = false;
        int iUc = uc();
        for (int i2 = 0; i2 < iUc; i2++) {
            yl(i2).yz();
        }
    }

    public void zwy(int i2) {
        if (i2 != Integer.MAX_VALUE && !dd()) {
            Log.e(w97r, getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.bu = i2;
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.PreferenceGroup.SavedState.1
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
        int f5436k;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f5436k = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f5436k);
        }

        SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f5436k = i2;
        }
    }

    public PreferenceGroup(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PreferenceGroup(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

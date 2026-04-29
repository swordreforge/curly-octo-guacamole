package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.qrj;
import androidx.customview.view.AbsSavedState;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new Parcelable.ClassLoaderCreator<ExtendableSavedState>() { // from class: com.google.android.material.stateful.ExtendableSavedState.1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        @dd
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ExtendableSavedState createFromParcel(@lvui Parcel parcel) {
            return new ExtendableSavedState(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @lvui
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public ExtendableSavedState createFromParcel(@lvui Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public ExtendableSavedState[] newArray(int i2) {
            return new ExtendableSavedState[i2];
        }
    };

    /* JADX INFO: renamed from: q */
    @lvui
    public final qrj<String, Bundle> f25125q;

    @lvui
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f25125q + "}";
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@lvui Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        int size = this.f25125q.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = this.f25125q.ld6(i3);
            bundleArr[i3] = this.f25125q.m873h(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f25125q = new qrj<>();
    }

    private ExtendableSavedState(@lvui Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i2 = parcel.readInt();
        String[] strArr = new String[i2];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i2];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f25125q = new qrj<>(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f25125q.put(strArr[i3], bundleArr[i3]);
        }
    }
}

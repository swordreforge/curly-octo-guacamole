package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseIntArray> CREATOR = new Parcelable.Creator<ParcelableSparseIntArray>() { // from class: com.google.android.material.internal.ParcelableSparseIntArray.1
        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseIntArray createFromParcel(@lvui Parcel parcel) {
            int i2 = parcel.readInt();
            ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(i2);
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i3 = 0; i3 < i2; i3++) {
                parcelableSparseIntArray.put(iArr[i3], iArr2[i3]);
            }
            return parcelableSparseIntArray;
        }

        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseIntArray[] newArray(int i2) {
            return new ParcelableSparseIntArray[i2];
        }
    };

    public ParcelableSparseIntArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@lvui Parcel parcel, int i2) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i3 = 0; i3 < size(); i3++) {
            iArr[i3] = keyAt(i3);
            iArr2[i3] = valueAt(i3);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }

    public ParcelableSparseIntArray(int i2) {
        super(i2);
    }

    public ParcelableSparseIntArray(@lvui SparseIntArray sparseIntArray) {
        for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
            put(sparseIntArray.keyAt(i2), sparseIntArray.valueAt(i2));
        }
    }
}

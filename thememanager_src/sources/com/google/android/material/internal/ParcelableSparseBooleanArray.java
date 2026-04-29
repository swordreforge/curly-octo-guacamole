package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseBooleanArray> CREATOR = new Parcelable.Creator<ParcelableSparseBooleanArray>() { // from class: com.google.android.material.internal.ParcelableSparseBooleanArray.1
        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseBooleanArray createFromParcel(@lvui Parcel parcel) {
            int i2 = parcel.readInt();
            ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(i2);
            int[] iArr = new int[i2];
            boolean[] zArr = new boolean[i2];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i3 = 0; i3 < i2; i3++) {
                parcelableSparseBooleanArray.put(iArr[i3], zArr[i3]);
            }
            return parcelableSparseBooleanArray;
        }

        @Override // android.os.Parcelable.Creator
        @lvui
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public ParcelableSparseBooleanArray[] newArray(int i2) {
            return new ParcelableSparseBooleanArray[i2];
        }
    };

    public ParcelableSparseBooleanArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@lvui Parcel parcel, int i2) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i3 = 0; i3 < size(); i3++) {
            iArr[i3] = keyAt(i3);
            zArr[i3] = valueAt(i3);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }

    public ParcelableSparseBooleanArray(int i2) {
        super(i2);
    }

    public ParcelableSparseBooleanArray(@lvui SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            put(sparseBooleanArray.keyAt(i2), sparseBooleanArray.valueAt(i2));
        }
    }
}

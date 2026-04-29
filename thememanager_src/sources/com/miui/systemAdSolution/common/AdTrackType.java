package com.miui.systemAdSolution.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class AdTrackType implements Parcelable {
    public static final Parcelable.Creator<AdTrackType> CREATOR = new Parcelable.Creator<AdTrackType>() { // from class: com.miui.systemAdSolution.common.AdTrackType.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AdTrackType createFromParcel(Parcel parcel) {
            return new AdTrackType(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public AdTrackType[] newArray(int i2) {
            return new AdTrackType[i2];
        }
    };
    private static final String TAG = "AdTrackType";
    private EnumC5325k mValue;

    /* JADX INFO: renamed from: com.miui.systemAdSolution.common.AdTrackType$k */
    public enum EnumC5325k {
        TRACK_UNKOWN,
        TRACK_VIEW,
        TRACK_CLICK,
        TRACK_FAIL,
        TRACK_COMPATIBLE,
        TRACK_DISLIKE_AD
    }

    protected AdTrackType(Parcel parcel) {
        int i2 = parcel != null ? parcel.readInt() : -1;
        if (i2 >= 0 && i2 < EnumC5325k.values().length) {
            this.mValue = EnumC5325k.values()[i2];
            return;
        }
        this.mValue = EnumC5325k.TRACK_UNKOWN;
        Log.e(TAG, "the type[" + i2 + "] is not support.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EnumC5325k getValue() {
        return this.mValue;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.mValue.ordinal());
    }

    public AdTrackType(EnumC5325k enumC5325k) {
        if (enumC5325k != null) {
            this.mValue = enumC5325k;
            return;
        }
        throw new IllegalArgumentException("type must not be null.");
    }
}

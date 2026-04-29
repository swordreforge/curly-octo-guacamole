package com.xiaomi.accountsdk.account.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class MetaLoginData implements Parcelable {
    public static final Parcelable.Creator<MetaLoginData> CREATOR = new Parcelable.Creator<MetaLoginData>() { // from class: com.xiaomi.accountsdk.account.data.MetaLoginData.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public MetaLoginData createFromParcel(Parcel parcel) {
            return new MetaLoginData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public MetaLoginData[] newArray(int i2) {
            return new MetaLoginData[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    public final String f30443k;

    /* JADX INFO: renamed from: n */
    public final String f30444n;

    /* JADX INFO: renamed from: q */
    public final String f30445q;

    public MetaLoginData(String str, String str2, String str3) {
        this.f30443k = str;
        this.f30445q = str2;
        this.f30444n = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f30443k);
        parcel.writeString(this.f30445q);
        parcel.writeString(this.f30444n);
    }

    public MetaLoginData(Parcel parcel) {
        this.f30443k = parcel.readString();
        this.f30445q = parcel.readString();
        this.f30444n = parcel.readString();
    }
}

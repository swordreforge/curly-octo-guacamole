package com.market.sdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class AdsBannerInfo implements Parcelable {
    public static final Parcelable.Creator<AdsBannerInfo> CREATOR = new Parcelable.Creator<AdsBannerInfo>() { // from class: com.market.sdk.AdsBannerInfo.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AdsBannerInfo createFromParcel(Parcel parcel) {
            return new AdsBannerInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public AdsBannerInfo[] newArray(int i2) {
            return new AdsBannerInfo[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    @e5.zy("iconUrl")
    public String f27889k;

    /* JADX INFO: renamed from: n */
    @e5.zy("uri")
    public Uri f27890n;

    /* JADX INFO: renamed from: q */
    @e5.zy("iconUri")
    public Uri f27891q;

    public AdsBannerInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f27889k);
        Uri.writeToParcel(parcel, this.f27890n);
    }

    public AdsBannerInfo(Parcel parcel) {
        this.f27889k = parcel.readString();
        this.f27890n = (Uri) Uri.CREATOR.createFromParcel(parcel);
    }
}

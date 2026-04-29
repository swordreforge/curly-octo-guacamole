package com.market.sdk.homeguide;

import android.os.Parcel;
import android.os.Parcelable;
import com.market.sdk.AbsParcelable;

/* JADX INFO: loaded from: classes3.dex */
public class HomeUserGuideResult extends AbsParcelable {
    public static final Parcelable.Creator<HomeUserGuideResult> CREATOR = new Parcelable.Creator<HomeUserGuideResult>() { // from class: com.market.sdk.homeguide.HomeUserGuideResult.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public HomeUserGuideResult createFromParcel(Parcel parcel) {
            return new HomeUserGuideResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public HomeUserGuideResult[] newArray(int i2) {
            return new HomeUserGuideResult[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    public static final int f28049g = 1;

    /* JADX INFO: renamed from: n */
    public static final int f28050n = 0;

    /* JADX INFO: renamed from: y */
    public static final int f28051y = 2;

    /* JADX INFO: renamed from: q */
    private int f28052q;

    public HomeUserGuideResult(int i2) {
        this.f28052q = i2;
    }

    public static HomeUserGuideResult toq(int i2) {
        return new HomeUserGuideResult(i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public int m17312k() {
        return this.f28052q;
    }

    @Override // com.market.sdk.AbsParcelable, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f28052q);
    }

    public HomeUserGuideResult(Parcel parcel) {
        super(parcel);
        this.f28052q = 0;
        this.f28052q = parcel.readInt();
    }
}

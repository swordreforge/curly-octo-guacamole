package com.market.sdk.homeguide;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.market.sdk.AbsParcelable;

/* JADX INFO: loaded from: classes3.dex */
public class HomeUserGuideData extends AbsParcelable {
    public static final Parcelable.Creator<HomeUserGuideData> CREATOR = new Parcelable.Creator<HomeUserGuideData>() { // from class: com.market.sdk.homeguide.HomeUserGuideData.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public HomeUserGuideData createFromParcel(Parcel parcel) {
            return new HomeUserGuideData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public HomeUserGuideData[] newArray(int i2) {
            return new HomeUserGuideData[i2];
        }
    };
    private Uri homeScreen;
    private String localFilePath;
    private C4975q viewConfig;

    public HomeUserGuideData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public void m17309g(C4975q c4975q) {
        this.viewConfig = c4975q;
    }

    public Uri getHomeScreenUri() {
        return this.homeScreen;
    }

    public String getLocalFilePath() {
        return this.localFilePath;
    }

    public C4975q getViewConfig() {
        return this.viewConfig;
    }

    /* JADX INFO: renamed from: k */
    public boolean m17310k() {
        C4975q c4975q = this.viewConfig;
        return (c4975q == null || !c4975q.isValid() || this.homeScreen == null) ? false : true;
    }

    public void toq(Uri uri) {
        this.homeScreen = uri;
    }

    @Override // com.market.sdk.AbsParcelable, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeSerializable(this.viewConfig);
        parcel.writeParcelable(this.homeScreen, 0);
    }

    public void zy(String str) {
        this.localFilePath = str;
    }

    protected HomeUserGuideData(Parcel parcel) {
        super(parcel);
        this.viewConfig = (C4975q) parcel.readSerializable();
        this.homeScreen = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}

package miui.settings.splitlib;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class SplitPageIntent implements Parcelable {
    public static final Parcelable.Creator<SplitPageIntent> CREATOR = new Parcelable.Creator<SplitPageIntent>() { // from class: miui.settings.splitlib.SplitPageIntent.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public SplitPageIntent createFromParcel(Parcel parcel) {
            return new SplitPageIntent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public SplitPageIntent[] newArray(int i2) {
            return new SplitPageIntent[i2];
        }
    };
    private Intent mIntent;
    private String mSplitPagePath;

    public SplitPageIntent(Intent intent, String str) {
        this.mIntent = intent;
        this.mSplitPagePath = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public String getSplitPagePath() {
        return this.mSplitPagePath;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.mIntent, i2);
        parcel.writeString(this.mSplitPagePath);
    }

    protected SplitPageIntent(Parcel parcel) {
        this.mIntent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.mSplitPagePath = parcel.readString();
    }
}

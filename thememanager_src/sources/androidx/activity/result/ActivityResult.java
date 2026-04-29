package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {

    @lvui
    public static final Parcelable.Creator<ActivityResult> CREATOR = new Parcelable.Creator<ActivityResult>() { // from class: androidx.activity.result.ActivityResult.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(@lvui Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i2) {
            return new ActivityResult[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    private final int f105k;

    @dd
    private final Intent mData;

    public ActivityResult(int i2, @dd Intent intent) {
        this.f105k = i2;
        this.mData = intent;
    }

    @lvui
    public static String toq(int i2) {
        return i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @dd
    public Intent getData() {
        return this.mData;
    }

    /* JADX INFO: renamed from: k */
    public int m22k() {
        return this.f105k;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + toq(this.f105k) + ", data=" + this.mData + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@lvui Parcel parcel, int i2) {
        parcel.writeInt(this.f105k);
        parcel.writeInt(this.mData == null ? 0 : 1);
        Intent intent = this.mData;
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }

    ActivityResult(Parcel parcel) {
        this.f105k = parcel.readInt();
        this.mData = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}

package com.xiaomi.accountsdk.account.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class NotificationLoginEndParams implements Parcelable {
    public static final Parcelable.Creator<NotificationLoginEndParams> CREATOR = new Parcelable.Creator<NotificationLoginEndParams>() { // from class: com.xiaomi.accountsdk.account.data.NotificationLoginEndParams.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NotificationLoginEndParams createFromParcel(Parcel parcel) {
            return new NotificationLoginEndParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public NotificationLoginEndParams[] newArray(int i2) {
            return new NotificationLoginEndParams[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    public final String f30483k;

    /* JADX INFO: renamed from: n */
    public final String f30484n;

    /* JADX INFO: renamed from: q */
    public final String f30485q;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.NotificationLoginEndParams$k */
    public static class C5461k {

        /* JADX INFO: renamed from: k */
        private String f30486k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72591toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72592zy;

        /* JADX INFO: renamed from: k */
        public NotificationLoginEndParams m18601k() {
            return new NotificationLoginEndParams(this.f30486k, this.f72591toq, this.f72592zy);
        }

        /* JADX INFO: renamed from: q */
        public C5461k m18602q(String str) {
            this.f30486k = str;
            return this;
        }

        public C5461k toq(String str) {
            this.f72591toq = str;
            return this;
        }

        public C5461k zy(String str) {
            this.f72592zy = str;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f30483k);
        parcel.writeString(this.f30485q);
        parcel.writeString(this.f30484n);
    }

    private NotificationLoginEndParams(String str, String str2, String str3) {
        this.f30483k = str;
        this.f30485q = str2;
        this.f30484n = str3;
    }

    public NotificationLoginEndParams(Parcel parcel) {
        this.f30483k = parcel.readString();
        this.f30485q = parcel.readString();
        this.f30484n = parcel.readString();
    }
}

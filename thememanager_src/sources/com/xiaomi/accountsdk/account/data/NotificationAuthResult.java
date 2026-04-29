package com.xiaomi.accountsdk.account.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class NotificationAuthResult implements Parcelable {
    public static final Parcelable.Creator<NotificationAuthResult> CREATOR = new Parcelable.Creator<NotificationAuthResult>() { // from class: com.xiaomi.accountsdk.account.data.NotificationAuthResult.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NotificationAuthResult createFromParcel(Parcel parcel) {
            return new NotificationAuthResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public NotificationAuthResult[] newArray(int i2) {
            return new NotificationAuthResult[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    public String f30477g;

    /* JADX INFO: renamed from: k */
    public String f30478k;

    /* JADX INFO: renamed from: n */
    public String f30479n;

    /* JADX INFO: renamed from: q */
    public String f30480q;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.NotificationAuthResult$k */
    public static class C5459k {

        /* JADX INFO: renamed from: k */
        private String f30481k;

        /* JADX INFO: renamed from: q */
        private String f30482q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72589toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72590zy;

        /* JADX INFO: renamed from: k */
        public NotificationAuthResult m18597k() {
            return new NotificationAuthResult(this.f30481k, this.f72589toq, this.f72590zy, this.f30482q);
        }

        /* JADX INFO: renamed from: n */
        public C5459k m18598n(String str) {
            this.f30481k = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C5459k m18599q(String str) {
            this.f72589toq = str;
            return this;
        }

        public C5459k toq(String str) {
            this.f72590zy = str;
            return this;
        }

        public C5459k zy(String str) {
            this.f30482q = str;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f30478k);
        parcel.writeString(this.f30480q);
        parcel.writeString(this.f30479n);
        parcel.writeString(this.f30477g);
    }

    private NotificationAuthResult(String str, String str2, String str3, String str4) {
        this.f30478k = str;
        this.f30480q = str2;
        this.f30479n = str3;
        this.f30477g = str4;
    }

    public NotificationAuthResult(Parcel parcel) {
        this.f30478k = parcel.readString();
        this.f30480q = parcel.readString();
        this.f30479n = parcel.readString();
        this.f30477g = parcel.readString();
    }
}

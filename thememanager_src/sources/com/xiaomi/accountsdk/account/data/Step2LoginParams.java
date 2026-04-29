package com.xiaomi.accountsdk.account.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class Step2LoginParams implements Parcelable {
    public static final Parcelable.Creator<Step2LoginParams> CREATOR = new Parcelable.Creator<Step2LoginParams>() { // from class: com.xiaomi.accountsdk.account.data.Step2LoginParams.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Step2LoginParams createFromParcel(Parcel parcel) {
            return new Step2LoginParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Step2LoginParams[] newArray(int i2) {
            return new Step2LoginParams[i2];
        }
    };
    private static final String DEVICE_ID = "deviceId";
    private static final String RETURN_STS_URL = "returnStsUrl";

    /* JADX INFO: renamed from: g */
    public final String f30567g;

    /* JADX INFO: renamed from: h */
    public boolean f30568h;

    /* JADX INFO: renamed from: k */
    public final MetaLoginData f30569k;

    /* JADX INFO: renamed from: n */
    public final String f30570n;

    /* JADX INFO: renamed from: p */
    public String f30571p;

    /* JADX INFO: renamed from: q */
    public final String f30572q;

    /* JADX INFO: renamed from: s */
    public final boolean f30573s;

    /* JADX INFO: renamed from: y */
    public final String f30574y;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.Step2LoginParams$k */
    public static class C5475k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f72613f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f30575g;

        /* JADX INFO: renamed from: k */
        private MetaLoginData f30576k;

        /* JADX INFO: renamed from: n */
        private String f30577n;

        /* JADX INFO: renamed from: q */
        private String f30578q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72614toq;

        /* JADX INFO: renamed from: y */
        private boolean f30579y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72615zy;

        public C5475k cdj(String str) {
            this.f72614toq = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C5475k m18654h(boolean z2) {
            this.f30575g = z2;
            return this;
        }

        public C5475k kja0(String str) {
            this.f30577n = str;
            return this;
        }

        public C5475k ld6(MetaLoginData metaLoginData) {
            this.f30576k = metaLoginData;
            return this;
        }

        public C5475k n7h(String str) {
            this.f72615zy = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C5475k m18655p(String str) {
            this.f72613f7l8 = str;
            return this;
        }

        public C5475k qrj(String str) {
            this.f30578q = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public Step2LoginParams m18656s() {
            return new Step2LoginParams(this);
        }

        public C5475k x2(boolean z2) {
            this.f30579y = z2;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f30572q);
        parcel.writeString(this.f30567g);
        parcel.writeString(this.f30570n);
        parcel.writeString(this.f30574y);
        parcel.writeInt(this.f30573s ? 1 : 0);
        parcel.writeParcelable(this.f30569k, i2);
        Bundle bundle = new Bundle();
        bundle.putBoolean(RETURN_STS_URL, this.f30568h);
        bundle.putString("deviceId", this.f30571p);
        parcel.writeBundle(bundle);
    }

    private Step2LoginParams(C5475k c5475k) {
        this.f30572q = c5475k.f72614toq;
        this.f30567g = c5475k.f30578q;
        this.f30570n = c5475k.f72615zy;
        this.f30574y = c5475k.f30577n;
        this.f30569k = c5475k.f30576k;
        this.f30573s = c5475k.f30575g;
        this.f30568h = c5475k.f30579y;
        this.f30571p = c5475k.f72613f7l8;
    }

    public Step2LoginParams(Parcel parcel) {
        this.f30572q = parcel.readString();
        this.f30567g = parcel.readString();
        this.f30570n = parcel.readString();
        this.f30574y = parcel.readString();
        this.f30573s = parcel.readInt() != 0;
        this.f30569k = (MetaLoginData) parcel.readParcelable(MetaLoginData.class.getClassLoader());
        Bundle bundle = parcel.readBundle();
        if (bundle != null) {
            this.f30568h = bundle.getBoolean(RETURN_STS_URL, false);
            this.f30571p = bundle.getString("deviceId");
        }
    }
}

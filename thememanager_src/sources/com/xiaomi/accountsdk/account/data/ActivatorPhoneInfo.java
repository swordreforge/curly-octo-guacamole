package com.xiaomi.accountsdk.account.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class ActivatorPhoneInfo implements Parcelable {
    public static final Parcelable.Creator<ActivatorPhoneInfo> CREATOR = new Parcelable.Creator<ActivatorPhoneInfo>() { // from class: com.xiaomi.accountsdk.account.data.ActivatorPhoneInfo.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ActivatorPhoneInfo createFromParcel(Parcel parcel) {
            Bundle bundle = parcel.readBundle();
            if (bundle == null) {
                return null;
            }
            return new C5454k().ld6(bundle.getString("phone")).x2(bundle.getString(ActivatorPhoneInfo.KEY_PHONE_HASH)).f7l8(bundle.getString(ActivatorPhoneInfo.KEY_ACTIVATOR_TOKEN)).qrj(bundle.getInt(ActivatorPhoneInfo.KEY_SLOT_ID)).m18584s(bundle.getString(ActivatorPhoneInfo.KEY_COPY_WRITER)).m18583p(bundle.getString(ActivatorPhoneInfo.KEY_OPERATOR_LINK)).m18585y();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public ActivatorPhoneInfo[] newArray(int i2) {
            return new ActivatorPhoneInfo[i2];
        }
    };
    private static final String KEY_ACTIVATOR_TOKEN = "activator_token";
    private static final String KEY_COPY_WRITER = "copy_writer";
    private static final String KEY_OPERATOR_LINK = "operator_link";
    private static final String KEY_PHONE = "phone";
    private static final String KEY_PHONE_HASH = "phone_hash";
    private static final String KEY_SLOT_ID = "slot_id";

    /* JADX INFO: renamed from: g */
    public final int f30433g;

    /* JADX INFO: renamed from: k */
    public final String f30434k;

    /* JADX INFO: renamed from: n */
    public final String f30435n;

    /* JADX INFO: renamed from: q */
    public final String f30436q;

    /* JADX INFO: renamed from: s */
    public final String f30437s;

    /* JADX INFO: renamed from: y */
    public final String f30438y;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.ActivatorPhoneInfo$k */
    public static final class C5454k {

        /* JADX INFO: renamed from: g */
        private String f30439g;

        /* JADX INFO: renamed from: k */
        private String f30440k;

        /* JADX INFO: renamed from: n */
        private String f30441n;

        /* JADX INFO: renamed from: q */
        private int f30442q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72583toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72584zy;

        public C5454k f7l8(String str) {
            this.f72584zy = str;
            return this;
        }

        public C5454k ld6(String str) {
            this.f30440k = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C5454k m18583p(String str) {
            this.f30439g = str;
            return this;
        }

        public C5454k qrj(int i2) {
            this.f30442q = i2;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C5454k m18584s(String str) {
            this.f30441n = str;
            return this;
        }

        public C5454k x2(String str) {
            this.f72583toq = str;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public ActivatorPhoneInfo m18585y() {
            return new ActivatorPhoneInfo(this);
        }
    }

    public ActivatorPhoneInfo(C5454k c5454k) {
        this.f30434k = c5454k.f30440k;
        this.f30436q = c5454k.f72583toq;
        this.f30435n = c5454k.f72584zy;
        this.f30433g = c5454k.f30442q;
        this.f30438y = c5454k.f30441n;
        this.f30437s = c5454k.f30439g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f30434k);
        bundle.putString(KEY_PHONE_HASH, this.f30436q);
        bundle.putString(KEY_ACTIVATOR_TOKEN, this.f30435n);
        bundle.putInt(KEY_SLOT_ID, this.f30433g);
        bundle.putString(KEY_COPY_WRITER, this.f30438y);
        bundle.putString(KEY_OPERATOR_LINK, this.f30437s);
        parcel.writeBundle(bundle);
    }
}

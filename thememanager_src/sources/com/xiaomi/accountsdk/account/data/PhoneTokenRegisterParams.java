package com.xiaomi.accountsdk.account.data;

import android.app.Application;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.accountsdk.account.C5500p;

/* JADX INFO: loaded from: classes3.dex */
public class PhoneTokenRegisterParams implements Parcelable {
    public static final Parcelable.Creator<PhoneTokenRegisterParams> CREATOR = new Parcelable.Creator<PhoneTokenRegisterParams>() { // from class: com.xiaomi.accountsdk.account.data.PhoneTokenRegisterParams.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PhoneTokenRegisterParams createFromParcel(Parcel parcel) {
            Bundle bundle = parcel.readBundle();
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("phone");
            String string2 = bundle.getString(PhoneTokenRegisterParams.KEY_PASSWORD);
            String string3 = bundle.getString(PhoneTokenRegisterParams.KEY_TICKET_TOKEN);
            ActivatorPhoneInfo activatorPhoneInfo = (ActivatorPhoneInfo) bundle.getParcelable(PhoneTokenRegisterParams.KEY_ACTIVATOR_PHONE_INFO);
            String string4 = bundle.getString("region");
            return new C5467k().x2(string, string3).ld6(activatorPhoneInfo).m18631p(string2).qrj(string4).n7h(bundle.getString("service_id")).m18632s();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public PhoneTokenRegisterParams[] newArray(int i2) {
            return new PhoneTokenRegisterParams[0];
        }
    };
    private static final String KEY_ACTIVATOR_PHONE_INFO = "activator_phone_info";
    private static final String KEY_IS_NO_PASSWORD = "is_no_password";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_PHONE = "phone";
    private static final String KEY_REGION = "region";
    private static final String KEY_SERVICE_ID = "service_id";
    private static final String KEY_TICKET_TOKEN = "ticket_token";

    /* JADX INFO: renamed from: g */
    public final String f30527g;

    /* JADX INFO: renamed from: h */
    public final String f30528h;

    /* JADX INFO: renamed from: i */
    public final String f30529i;

    /* JADX INFO: renamed from: k */
    public final String f30530k;

    /* JADX INFO: renamed from: n */
    public final ActivatorPhoneInfo f30531n;

    /* JADX INFO: renamed from: p */
    public final boolean f30532p;

    /* JADX INFO: renamed from: q */
    public final String f30533q;

    /* JADX INFO: renamed from: s */
    public final String f30534s;

    /* JADX INFO: renamed from: y */
    public final String f30535y;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.PhoneTokenRegisterParams$k */
    public static class C5467k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f72601f7l8;

        /* JADX INFO: renamed from: g */
        private String f30536g;

        /* JADX INFO: renamed from: k */
        private String f30537k;

        /* JADX INFO: renamed from: n */
        private boolean f30538n;

        /* JADX INFO: renamed from: q */
        private String f30539q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72602toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private ActivatorPhoneInfo f72603zy;

        public C5467k ld6(ActivatorPhoneInfo activatorPhoneInfo) {
            this.f72603zy = activatorPhoneInfo;
            return this;
        }

        public C5467k n7h(String str) {
            this.f72601f7l8 = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C5467k m18631p(String str) {
            this.f30539q = str;
            return this;
        }

        public C5467k qrj(String str) {
            this.f30536g = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public PhoneTokenRegisterParams m18632s() {
            this.f30538n = TextUtils.isEmpty(this.f30539q);
            return new PhoneTokenRegisterParams(this);
        }

        public C5467k x2(String str, String str2) {
            this.f30537k = str;
            this.f72602toq = str2;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C5467k m18633y(Application application) {
            C5500p.m18784p(application);
            return this;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C5467k m18625k(PhoneTokenRegisterParams phoneTokenRegisterParams) {
        if (phoneTokenRegisterParams == null) {
            return null;
        }
        return new C5467k().x2(phoneTokenRegisterParams.f30530k, phoneTokenRegisterParams.f30533q).ld6(phoneTokenRegisterParams.f30531n).m18631p(phoneTokenRegisterParams.f30534s).qrj(phoneTokenRegisterParams.f30528h).n7h(phoneTokenRegisterParams.f30529i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f30530k);
        bundle.putString(KEY_TICKET_TOKEN, this.f30533q);
        bundle.putParcelable(KEY_ACTIVATOR_PHONE_INFO, this.f30531n);
        bundle.putString(KEY_PASSWORD, this.f30534s);
        bundle.putString("region", this.f30528h);
        bundle.putBoolean(KEY_IS_NO_PASSWORD, this.f30532p);
        bundle.putString(KEY_PASSWORD, this.f30534s);
        bundle.putString("region", this.f30528h);
        bundle.putString("service_id", this.f30529i);
        parcel.writeBundle(bundle);
    }

    private PhoneTokenRegisterParams(C5467k c5467k) {
        this.f30530k = c5467k.f30537k;
        this.f30533q = c5467k.f72602toq;
        ActivatorPhoneInfo activatorPhoneInfo = c5467k.f72603zy;
        this.f30531n = activatorPhoneInfo;
        this.f30527g = activatorPhoneInfo != null ? activatorPhoneInfo.f30436q : null;
        this.f30535y = activatorPhoneInfo != null ? activatorPhoneInfo.f30435n : null;
        this.f30534s = c5467k.f30539q;
        this.f30532p = c5467k.f30538n;
        this.f30528h = c5467k.f30536g;
        this.f30529i = c5467k.f72601f7l8;
    }
}

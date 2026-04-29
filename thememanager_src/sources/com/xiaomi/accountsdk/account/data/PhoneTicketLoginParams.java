package com.xiaomi.accountsdk.account.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class PhoneTicketLoginParams implements Parcelable {
    public static final Parcelable.Creator<PhoneTicketLoginParams> CREATOR = new Parcelable.Creator<PhoneTicketLoginParams>() { // from class: com.xiaomi.accountsdk.account.data.PhoneTicketLoginParams.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PhoneTicketLoginParams createFromParcel(Parcel parcel) {
            Bundle bundle = parcel.readBundle();
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("phone");
            String string2 = bundle.getString(PhoneTicketLoginParams.KEY_TICKET_TOKEN);
            ActivatorPhoneInfo activatorPhoneInfo = (ActivatorPhoneInfo) bundle.getParcelable(PhoneTicketLoginParams.KEY_ACTIVATOR_PHONE_INFO);
            return new C5465k().qrj(string, string2).m18622h(activatorPhoneInfo).m18624s(activatorPhoneInfo, bundle.getString(PhoneTicketLoginParams.KEY_TICKET)).ld6(bundle.getString("device_id")).kja0(bundle.getString("service_id")).x2(bundle.getStringArray(PhoneTicketLoginParams.KEY_HASH_ENV)).n7h(bundle.getBoolean("return_sts_url", false)).m18623p();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public PhoneTicketLoginParams[] newArray(int i2) {
            return new PhoneTicketLoginParams[0];
        }
    };
    private static final String KEY_ACTIVATOR_PHONE_INFO = "activator_phone_info";
    private static final String KEY_DEVICE_ID = "device_id";
    private static final String KEY_HASH_ENV = "hash_env";
    private static final String KEY_PHONE = "phone";
    private static final String KEY_RETURN_STS_URL = "return_sts_url";
    private static final String KEY_SERVICE_ID = "service_id";
    private static final String KEY_TICKET = "ticket";
    private static final String KEY_TICKET_TOKEN = "ticket_token";

    /* JADX INFO: renamed from: g */
    public final String f30512g;

    /* JADX INFO: renamed from: h */
    public final String f30513h;

    /* JADX INFO: renamed from: i */
    public final String[] f30514i;

    /* JADX INFO: renamed from: k */
    public final String f30515k;

    /* JADX INFO: renamed from: n */
    public final ActivatorPhoneInfo f30516n;

    /* JADX INFO: renamed from: p */
    public final String f30517p;

    /* JADX INFO: renamed from: q */
    public final String f30518q;

    /* JADX INFO: renamed from: s */
    public final String f30519s;

    /* JADX INFO: renamed from: y */
    public final String f30520y;

    /* JADX INFO: renamed from: z */
    public final boolean f30521z;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.PhoneTicketLoginParams$k */
    public static class C5465k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String[] f72598f7l8;

        /* JADX INFO: renamed from: g */
        private String f30522g;

        /* JADX INFO: renamed from: k */
        private String f30523k;

        /* JADX INFO: renamed from: n */
        private String f30524n;

        /* JADX INFO: renamed from: q */
        private String f30525q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72599toq;

        /* JADX INFO: renamed from: y */
        private boolean f30526y = false;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private ActivatorPhoneInfo f72600zy;

        /* JADX INFO: renamed from: h */
        public C5465k m18622h(ActivatorPhoneInfo activatorPhoneInfo) {
            this.f72600zy = activatorPhoneInfo;
            return this;
        }

        public C5465k kja0(String str) {
            this.f30522g = str;
            return this;
        }

        public C5465k ld6(String str) {
            this.f30524n = str;
            return this;
        }

        public C5465k n7h(boolean z2) {
            this.f30526y = z2;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public PhoneTicketLoginParams m18623p() {
            return new PhoneTicketLoginParams(this);
        }

        public C5465k qrj(String str, String str2) {
            this.f30523k = str;
            this.f72599toq = str2;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C5465k m18624s(ActivatorPhoneInfo activatorPhoneInfo, String str) {
            this.f72600zy = activatorPhoneInfo;
            this.f30525q = str;
            return this;
        }

        public C5465k x2(String[] strArr) {
            this.f72598f7l8 = strArr;
            return this;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C5465k m18615k(PhoneTicketLoginParams phoneTicketLoginParams) {
        if (phoneTicketLoginParams == null) {
            return null;
        }
        return new C5465k().qrj(phoneTicketLoginParams.f30515k, phoneTicketLoginParams.f30518q).m18622h(phoneTicketLoginParams.f30516n).m18624s(phoneTicketLoginParams.f30516n, phoneTicketLoginParams.f30519s).ld6(phoneTicketLoginParams.f30517p).kja0(phoneTicketLoginParams.f30513h).x2(phoneTicketLoginParams.f30514i).n7h(phoneTicketLoginParams.f30521z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f30515k);
        bundle.putString(KEY_TICKET_TOKEN, this.f30518q);
        bundle.putParcelable(KEY_ACTIVATOR_PHONE_INFO, this.f30516n);
        bundle.putString(KEY_TICKET, this.f30519s);
        bundle.putString("device_id", this.f30517p);
        bundle.putString("service_id", this.f30513h);
        bundle.putStringArray(KEY_HASH_ENV, this.f30514i);
        bundle.putBoolean("return_sts_url", this.f30521z);
        parcel.writeBundle(bundle);
    }

    private PhoneTicketLoginParams(C5465k c5465k) {
        this.f30515k = c5465k.f30523k;
        this.f30518q = c5465k.f72599toq;
        ActivatorPhoneInfo activatorPhoneInfo = c5465k.f72600zy;
        this.f30516n = activatorPhoneInfo;
        this.f30512g = activatorPhoneInfo != null ? activatorPhoneInfo.f30436q : null;
        this.f30520y = activatorPhoneInfo != null ? activatorPhoneInfo.f30435n : null;
        this.f30519s = c5465k.f30525q;
        this.f30517p = c5465k.f30524n;
        this.f30513h = c5465k.f30522g;
        this.f30514i = c5465k.f72598f7l8;
        this.f30521z = c5465k.f30526y;
    }
}

package com.xiaomi.accountsdk.account.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class PasswordLoginParams implements Parcelable {
    private static final String ACTIVATOR_PHONE_INFO = "activatorPhoneInfo";
    public static final Parcelable.Creator<PasswordLoginParams> CREATOR = new Parcelable.Creator<PasswordLoginParams>() { // from class: com.xiaomi.accountsdk.account.data.PasswordLoginParams.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PasswordLoginParams createFromParcel(Parcel parcel) {
            return new PasswordLoginParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public PasswordLoginParams[] newArray(int i2) {
            return new PasswordLoginParams[i2];
        }
    };

    /* JADX INFO: renamed from: c */
    protected static final String f30487c = "metaLoginData";

    /* JADX INFO: renamed from: e */
    protected static final String f30488e = "returnStsUrl";

    /* JADX INFO: renamed from: f */
    protected static final String f30489f = "ticketToken";

    /* JADX INFO: renamed from: j */
    protected static final String f30490j = "needProcessNotification";

    /* JADX INFO: renamed from: l */
    protected static final String f30491l = "deviceId";

    /* JADX INFO: renamed from: o */
    protected static final String f30492o = "hashedEnvFactors";

    /* JADX INFO: renamed from: g */
    public final String f30493g;

    /* JADX INFO: renamed from: h */
    public MetaLoginData f30494h;

    /* JADX INFO: renamed from: i */
    public boolean f30495i;

    /* JADX INFO: renamed from: k */
    public final String f30496k;

    /* JADX INFO: renamed from: n */
    public final String f30497n;

    /* JADX INFO: renamed from: p */
    public String f30498p;

    /* JADX INFO: renamed from: q */
    public final String f30499q;

    /* JADX INFO: renamed from: r */
    public ActivatorPhoneInfo f30500r;

    /* JADX INFO: renamed from: s */
    public String f30501s;

    /* JADX INFO: renamed from: t */
    public String[] f30502t;

    /* JADX INFO: renamed from: y */
    public final String f30503y;

    /* JADX INFO: renamed from: z */
    public boolean f30504z;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.PasswordLoginParams$k */
    public static class C5463k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f72593f7l8;

        /* JADX INFO: renamed from: g */
        private String f30505g;

        /* JADX INFO: renamed from: k */
        private String f30506k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private String[] f72594ld6;

        /* JADX INFO: renamed from: n */
        private String f30507n;

        /* JADX INFO: renamed from: q */
        private String f30509q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72595toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private ActivatorPhoneInfo f72596x2;

        /* JADX INFO: renamed from: y */
        private MetaLoginData f30511y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72597zy;

        /* JADX INFO: renamed from: s */
        private boolean f30510s = false;

        /* JADX INFO: renamed from: p */
        private boolean f30508p = true;

        public C5463k cdj(String str) {
            this.f30505g = str;
            return this;
        }

        public C5463k fn3e(boolean z2) {
            this.f30508p = z2;
            return this;
        }

        public C5463k fu4(String str) {
            this.f72593f7l8 = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C5463k m18612h(String str) {
            this.f30507n = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C5463k m18613i(MetaLoginData metaLoginData) {
            this.f30511y = metaLoginData;
            return this;
        }

        public C5463k ki(String[] strArr) {
            this.f72594ld6 = strArr;
            return this;
        }

        public C5463k kja0(String str) {
            this.f30509q = str;
            return this;
        }

        public C5463k n7h(ActivatorPhoneInfo activatorPhoneInfo) {
            this.f72596x2 = activatorPhoneInfo;
            return this;
        }

        public C5463k ni7(String str) {
            this.f72597zy = str;
            return this;
        }

        public PasswordLoginParams qrj() {
            return new PasswordLoginParams(this);
        }

        public C5463k t8r(boolean z2) {
            this.f30510s = z2;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C5463k m18614z(String str) {
            this.f30506k = str;
            return this;
        }

        public C5463k zurt(String str) {
            this.f72595toq = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C5463k m18603k(PasswordLoginParams passwordLoginParams) {
        if (passwordLoginParams == null) {
            return null;
        }
        return new C5463k().m18614z(passwordLoginParams.f30496k).zurt(passwordLoginParams.f30499q).ni7(passwordLoginParams.f30497n).kja0(passwordLoginParams.f30493g).m18612h(passwordLoginParams.f30503y).cdj(passwordLoginParams.f30501s).fu4(passwordLoginParams.f30498p).m18613i(passwordLoginParams.f30494h).t8r(passwordLoginParams.f30495i).fn3e(passwordLoginParams.f30504z).ki(passwordLoginParams.f30502t).n7h(passwordLoginParams.f30500r);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f30496k);
        parcel.writeString(this.f30499q);
        parcel.writeString(this.f30497n);
        parcel.writeString(this.f30493g);
        parcel.writeString(this.f30503y);
        Bundle bundle = new Bundle();
        bundle.putString("deviceId", this.f30501s);
        bundle.putString(f30489f, this.f30498p);
        bundle.putParcelable(f30487c, this.f30494h);
        bundle.putBoolean(f30488e, this.f30495i);
        bundle.putBoolean(f30490j, this.f30504z);
        bundle.putStringArray(f30492o, this.f30502t);
        bundle.putParcelable(ACTIVATOR_PHONE_INFO, this.f30500r);
        parcel.writeBundle(bundle);
    }

    private PasswordLoginParams(C5463k c5463k) {
        this.f30496k = c5463k.f30506k;
        this.f30499q = c5463k.f72595toq;
        this.f30497n = c5463k.f72597zy;
        this.f30493g = c5463k.f30509q;
        this.f30503y = c5463k.f30507n;
        this.f30501s = c5463k.f30505g;
        this.f30498p = c5463k.f72593f7l8;
        this.f30494h = c5463k.f30511y;
        this.f30495i = c5463k.f30510s;
        this.f30504z = c5463k.f30508p;
        this.f30502t = c5463k.f72594ld6;
        this.f30500r = c5463k.f72596x2;
    }

    public PasswordLoginParams(Parcel parcel) {
        this.f30496k = parcel.readString();
        this.f30499q = parcel.readString();
        this.f30497n = parcel.readString();
        this.f30493g = parcel.readString();
        this.f30503y = parcel.readString();
        Bundle bundle = parcel.readBundle();
        if (bundle != null) {
            this.f30501s = bundle.getString("deviceId");
            this.f30498p = bundle.getString(f30489f);
            this.f30494h = (MetaLoginData) bundle.getParcelable(f30487c);
            this.f30495i = bundle.getBoolean(f30488e, false);
            this.f30504z = bundle.getBoolean(f30490j, true);
            this.f30502t = bundle.getStringArray(f30492o);
            this.f30500r = (ActivatorPhoneInfo) bundle.getParcelable(ACTIVATOR_PHONE_INFO);
        }
    }
}

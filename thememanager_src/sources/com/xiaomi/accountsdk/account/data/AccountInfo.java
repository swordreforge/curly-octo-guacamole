package com.xiaomi.accountsdk.account.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class AccountInfo implements Parcelable {
    public static final Parcelable.Creator<AccountInfo> CREATOR = new Parcelable.Creator<AccountInfo>() { // from class: com.xiaomi.accountsdk.account.data.AccountInfo.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AccountInfo createFromParcel(Parcel parcel) {
            return new AccountInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public AccountInfo[] newArray(int i2) {
            return new AccountInfo[i2];
        }
    };
    private static final String KEY_HAS_PWD = "has_pwd";
    private static final String KEY_USER_SYNCED_URL = "user_synced_url";

    /* JADX INFO: renamed from: g */
    public final String f30413g;

    /* JADX INFO: renamed from: h */
    public final String f30414h;

    /* JADX INFO: renamed from: i */
    public final String f30415i;

    /* JADX INFO: renamed from: k */
    public final String f30416k;

    /* JADX INFO: renamed from: l */
    public final boolean f30417l;

    /* JADX INFO: renamed from: n */
    public final String f30418n;

    /* JADX INFO: renamed from: p */
    public final String f30419p;

    /* JADX INFO: renamed from: q */
    public final String f30420q;

    /* JADX INFO: renamed from: r */
    public final String f30421r;

    /* JADX INFO: renamed from: s */
    public final String f30422s;

    /* JADX INFO: renamed from: t */
    public final String f30423t;

    /* JADX INFO: renamed from: y */
    public final String f30424y;

    /* JADX INFO: renamed from: z */
    public final String f30425z;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.AccountInfo$k */
    public static final class C5452k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f72577f7l8;

        /* JADX INFO: renamed from: g */
        private String f30426g;

        /* JADX INFO: renamed from: k */
        private String f30427k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private String f72578ld6;

        /* JADX INFO: renamed from: n */
        private String f30428n;

        /* JADX INFO: renamed from: p */
        private String f30429p;

        /* JADX INFO: renamed from: q */
        private String f30430q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private String f72579qrj;

        /* JADX INFO: renamed from: s */
        private String f30431s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72580toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private boolean f72581x2;

        /* JADX INFO: renamed from: y */
        private String f30432y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72582zy;

        public C5452k cdj(boolean z2) {
            this.f72581x2 = z2;
            return this;
        }

        public C5452k fn3e(String str) {
            this.f30431s = str;
            return this;
        }

        public C5452k fu4(String str) {
            this.f30428n = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C5452k m18575h(String str) {
            this.f30430q = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C5452k m18576i(String str) {
            this.f72577f7l8 = str;
            return this;
        }

        public C5452k ki(String str) {
            this.f72582zy = str;
            return this;
        }

        public AccountInfo kja0() {
            return new AccountInfo(this);
        }

        public C5452k n7h(String str) {
            this.f30432y = str;
            return this;
        }

        public C5452k ni7(String str) {
            this.f72580toq = str;
            return this;
        }

        public C5452k o1t(String str) {
            this.f30427k = str;
            return this;
        }

        public C5452k t8r(String str) {
            this.f72578ld6 = str;
            return this;
        }

        public C5452k wvg(String str) {
            this.f72579qrj = str;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C5452k m18577z(String str) {
            this.f30429p = str;
            return this;
        }

        public C5452k zurt(String str) {
            this.f30426g = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: k */
    public static AccountInfo m18566k(AccountInfo accountInfo) {
        if (accountInfo == null) {
            return null;
        }
        return new C5452k().o1t(accountInfo.f30416k).m18575h(accountInfo.f30413g).cdj(accountInfo.f30417l).ki(accountInfo.f30418n).fn3e(accountInfo.f30415i).m18576i(accountInfo.f30419p).ni7(accountInfo.f30420q).n7h(accountInfo.f30414h).fu4(accountInfo.f30424y).zurt(accountInfo.f30422s).m18577z(accountInfo.f30425z).t8r(accountInfo.f30423t).wvg(accountInfo.f30421r).kja0();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAutoLoginUrl() {
        return this.f30414h;
    }

    public String getEncryptedUserId() {
        return this.f30413g;
    }

    public String getPassToken() {
        return this.f30418n;
    }

    public String getPh() {
        return this.f30423t;
    }

    public String getPsecurity() {
        return this.f30419p;
    }

    public String getRePassToken() {
        return this.f30415i;
    }

    public String getSecurity() {
        return this.f30422s;
    }

    public String getServiceId() {
        return this.f30420q;
    }

    public String getServiceToken() {
        return this.f30424y;
    }

    public String getSlh() {
        return this.f30425z;
    }

    public String getUserId() {
        return this.f30416k;
    }

    public String toString() {
        return "AccountInfo{userId='" + this.f30416k + "', security='" + this.f30422s + "'}";
    }

    public boolean toq() {
        return this.f30417l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f30416k);
        parcel.writeString(this.f30420q);
        parcel.writeString(this.f30418n);
        parcel.writeString(this.f30413g);
        parcel.writeString(this.f30424y);
        parcel.writeString(this.f30422s);
        parcel.writeString(this.f30419p);
        parcel.writeString(this.f30414h);
        parcel.writeString(this.f30415i);
        parcel.writeString(this.f30425z);
        parcel.writeString(this.f30423t);
        Bundle bundle = new Bundle();
        bundle.putBoolean(KEY_HAS_PWD, this.f30417l);
        bundle.putString(KEY_USER_SYNCED_URL, this.f30421r);
        parcel.writeBundle(bundle);
    }

    @Deprecated
    public AccountInfo(String str, String str2, String str3, String str4, String str5) {
        this(new C5452k().o1t(str).ni7(str2).ki(str3).m18576i(str4).n7h(str5));
    }

    @Deprecated
    public AccountInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(new C5452k().o1t(str).ni7(str2).ki(str3).m18575h(str4).fu4(str5).zurt(str6).m18576i(str7));
    }

    @Deprecated
    public AccountInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(new C5452k().o1t(str).ni7(str2).ki(str3).m18575h(str4).fu4(str5).zurt(str6).m18576i(str7).n7h(str8));
    }

    private AccountInfo(C5452k c5452k) {
        this.f30416k = c5452k.f30427k;
        this.f30420q = c5452k.f72580toq;
        this.f30418n = c5452k.f72582zy;
        this.f30413g = c5452k.f30430q;
        this.f30424y = c5452k.f30428n;
        this.f30422s = c5452k.f30426g;
        this.f30419p = c5452k.f72577f7l8;
        this.f30414h = c5452k.f30432y;
        this.f30415i = c5452k.f30431s;
        this.f30425z = c5452k.f30429p;
        this.f30423t = c5452k.f72578ld6;
        this.f30417l = c5452k.f72581x2;
        this.f30421r = c5452k.f72579qrj;
    }

    private AccountInfo(Parcel parcel) {
        this.f30416k = parcel.readString();
        this.f30420q = parcel.readString();
        this.f30418n = parcel.readString();
        this.f30413g = parcel.readString();
        this.f30424y = parcel.readString();
        this.f30422s = parcel.readString();
        this.f30419p = parcel.readString();
        this.f30414h = parcel.readString();
        this.f30415i = parcel.readString();
        this.f30425z = parcel.readString();
        this.f30423t = parcel.readString();
        Bundle bundle = parcel.readBundle();
        this.f30417l = bundle != null ? bundle.getBoolean(KEY_HAS_PWD) : true;
        this.f30421r = bundle != null ? bundle.getString(KEY_USER_SYNCED_URL) : null;
    }
}

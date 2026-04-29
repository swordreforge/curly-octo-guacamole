package com.xiaomi.passport.servicetoken.data;

import android.accounts.Account;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class XmAccountVisibility implements Parcelable {
    public static final Parcelable.Creator<XmAccountVisibility> CREATOR = new Parcelable.Creator<XmAccountVisibility>() { // from class: com.xiaomi.passport.servicetoken.data.XmAccountVisibility.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public XmAccountVisibility createFromParcel(Parcel parcel) {
            return new XmAccountVisibility(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public XmAccountVisibility[] newArray(int i2) {
            return new XmAccountVisibility[0];
        }
    };
    private static final String KEY_ACCOUNT = "account";
    private static final String KEY_ACCOUNT_VISIBLE = "visible";
    private static final String KEY_BUILD_SDK_VERSION = "build_sdk_version";
    private static final String KEY_ERROR_CODE = "error_code";
    private static final String KEY_ERROR_MSG = "error_msg";
    private static final String KEY_NEW_CHOOSE_ACCOUNT_INTENT = "new_choose_account_intent";

    /* JADX INFO: renamed from: g */
    public final Account f32527g;

    /* JADX INFO: renamed from: k */
    public final toq f32528k;

    /* JADX INFO: renamed from: n */
    public final boolean f32529n;

    /* JADX INFO: renamed from: q */
    public final String f32530q;

    /* JADX INFO: renamed from: s */
    public final Intent f32531s;

    /* JADX INFO: renamed from: y */
    public final int f32532y;

    /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.data.XmAccountVisibility$k */
    public static class C5821k {

        /* JADX INFO: renamed from: g */
        private Intent f32533g;

        /* JADX INFO: renamed from: k */
        private final toq f32534k;

        /* JADX INFO: renamed from: n */
        private int f32535n = Build.VERSION.SDK_INT;

        /* JADX INFO: renamed from: q */
        private Account f32536q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f73217toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f73218zy;

        public C5821k(toq toqVar, String str) {
            this.f32534k = toqVar;
            this.f73217toq = TextUtils.isEmpty(str) ? toqVar.errorMsg : str;
        }

        public C5821k f7l8(boolean z2, Account account) {
            this.f73218zy = z2;
            this.f32536q = account;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C5821k m20454s(Intent intent) {
            this.f32533g = intent;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public XmAccountVisibility m20455y() {
            return new XmAccountVisibility(this);
        }
    }

    public enum toq {
        ERROR_NONE("successful"),
        ERROR_NOT_SUPPORT("no support account service"),
        ERROR_PRE_ANDROID_O("no support account service, and pre o version"),
        ERROR_NO_ACCOUNT("no account"),
        ERROR_NO_PERMISSION("no access account service permission"),
        ERROR_CANCELLED("task cancelled"),
        ERROR_EXECUTION("execution error"),
        ERROR_UNKNOWN("unknown");

        String errorMsg;

        toq(String str) {
            this.errorMsg = str;
        }
    }

    public XmAccountVisibility(C5821k c5821k) {
        this.f32528k = c5821k.f32534k;
        this.f32530q = c5821k.f73217toq;
        this.f32529n = c5821k.f73218zy;
        this.f32527g = c5821k.f32536q;
        this.f32532y = c5821k.f32535n;
        this.f32531s = c5821k.f32533g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("AccountVisibility{");
        stringBuffer.append(", errorCode=");
        stringBuffer.append(this.f32528k);
        stringBuffer.append(", errorMessage='");
        stringBuffer.append(this.f32530q);
        stringBuffer.append('\'');
        stringBuffer.append(", accountVisible='");
        stringBuffer.append(this.f32529n);
        stringBuffer.append('\'');
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_ERROR_CODE, this.f32528k.ordinal());
        bundle.putString(KEY_ERROR_MSG, this.f32530q);
        bundle.putBoolean(KEY_ACCOUNT_VISIBLE, this.f32529n);
        bundle.putParcelable("account", this.f32527g);
        bundle.putInt(KEY_BUILD_SDK_VERSION, this.f32532y);
        bundle.putParcelable(KEY_NEW_CHOOSE_ACCOUNT_INTENT, this.f32531s);
        parcel.writeBundle(bundle);
    }

    public XmAccountVisibility(Parcel parcel) {
        Bundle bundle = parcel.readBundle();
        this.f32528k = toq.values()[bundle.getInt(KEY_ERROR_CODE)];
        this.f32530q = bundle.getString(KEY_ERROR_MSG);
        this.f32529n = bundle.getBoolean(KEY_ACCOUNT_VISIBLE);
        this.f32527g = (Account) bundle.getParcelable("account");
        this.f32532y = bundle.getInt(KEY_BUILD_SDK_VERSION);
        this.f32531s = (Intent) bundle.getParcelable(KEY_NEW_CHOOSE_ACCOUNT_INTENT);
    }
}

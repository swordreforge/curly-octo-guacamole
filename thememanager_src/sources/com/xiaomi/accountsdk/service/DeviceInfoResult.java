package com.xiaomi.accountsdk.service;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceInfoResult implements Parcelable {
    public static final Parcelable.Creator<DeviceInfoResult> CREATOR = new Parcelable.Creator<DeviceInfoResult>() { // from class: com.xiaomi.accountsdk.service.DeviceInfoResult.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public DeviceInfoResult createFromParcel(Parcel parcel) {
            return new DeviceInfoResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public DeviceInfoResult[] newArray(int i2) {
            return new DeviceInfoResult[i2];
        }
    };
    private static final String PARCEL_BUNDLE_KEY_DEVICE_INFO = "device_info";
    private static final String PARCEL_BUNDLE_KEY_ERROR_CODE = "error_code";
    private static final String PARCEL_BUNDLE_KEY_ERROR_MESSAGE = "error_message";
    private static final String PARCEL_BUNDLE_KEY_ERROR_STACK_TRACE = "stacktrace";

    /* JADX INFO: renamed from: h */
    public static final String f31000h = "android_id";

    /* JADX INFO: renamed from: p */
    public static final String f31001p = "hashed_device_id";

    /* JADX INFO: renamed from: s */
    public static final int f31002s = 2;

    /* JADX INFO: renamed from: y */
    public static final int f31003y = 1;

    /* JADX INFO: renamed from: g */
    public final String f31004g;

    /* JADX INFO: renamed from: k */
    public final Bundle f31005k;

    /* JADX INFO: renamed from: n */
    public final String f31006n;

    /* JADX INFO: renamed from: q */
    public final toq f31007q;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.service.DeviceInfoResult$k */
    public static final class C5560k {

        /* JADX INFO: renamed from: k */
        private final Bundle f31008k;

        /* JADX INFO: renamed from: q */
        private toq f31009q = toq.ERROR_NONE;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72956toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72957zy;

        public C5560k(Bundle bundle) {
            this.f31008k = bundle;
        }

        /* JADX INFO: renamed from: g */
        public static C5560k m19045g(DeviceInfoResult deviceInfoResult) {
            return new C5560k(deviceInfoResult.f31005k).f7l8(deviceInfoResult.f31007q).m19050y(deviceInfoResult.f31006n).m19049s(deviceInfoResult.f31004g);
        }

        public C5560k f7l8(toq toqVar) {
            this.f31009q = toqVar;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public DeviceInfoResult m19048n() {
            return new DeviceInfoResult(this);
        }

        /* JADX INFO: renamed from: s */
        public C5560k m19049s(String str) {
            this.f72957zy = str;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C5560k m19050y(String str) {
            this.f72956toq = str;
            return this;
        }
    }

    public enum toq {
        ERROR_UNKNOWN,
        ERROR_NONE,
        ERROR_APP_PERMISSION_FORBIDDEN,
        ERROR_TIME_OUT,
        ERROR_NOT_SUPPORTED,
        ERROR_EXECUTION_EXCEPTION,
        ERROR_QUERY_TOO_FREQUENTLY
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfoResult)) {
            return false;
        }
        DeviceInfoResult deviceInfoResult = (DeviceInfoResult) obj;
        Bundle bundle = this.f31005k;
        if (bundle == null ? deviceInfoResult.f31005k != null : !bundle.equals(deviceInfoResult.f31005k)) {
            return false;
        }
        if (this.f31007q != deviceInfoResult.f31007q) {
            return false;
        }
        String str = this.f31006n;
        if (str == null ? deviceInfoResult.f31006n != null : !str.equals(deviceInfoResult.f31006n)) {
            return false;
        }
        String str2 = this.f31004g;
        String str3 = deviceInfoResult.f31004g;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public int hashCode() {
        Bundle bundle = this.f31005k;
        int iHashCode = (bundle != null ? bundle.hashCode() : 0) * 31;
        toq toqVar = this.f31007q;
        int iHashCode2 = (iHashCode + (toqVar != null ? toqVar.hashCode() : 0)) * 31;
        String str = this.f31006n;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f31004g;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putBundle(PARCEL_BUNDLE_KEY_DEVICE_INFO, this.f31005k);
        toq toqVar = this.f31007q;
        bundle.putInt(PARCEL_BUNDLE_KEY_ERROR_CODE, toqVar == null ? -1 : toqVar.ordinal());
        bundle.putString("error_message", this.f31006n);
        bundle.putString(PARCEL_BUNDLE_KEY_ERROR_STACK_TRACE, this.f31004g);
        parcel.writeBundle(bundle);
    }

    private DeviceInfoResult(C5560k c5560k) {
        this.f31005k = c5560k.f31008k;
        this.f31006n = c5560k.f72956toq;
        this.f31007q = c5560k.f31009q;
        this.f31004g = c5560k.f72957zy;
    }

    protected DeviceInfoResult(Parcel parcel) {
        Bundle bundle = parcel.readBundle(DeviceInfoResult.class.getClassLoader());
        this.f31005k = bundle.getBundle(PARCEL_BUNDLE_KEY_DEVICE_INFO);
        int i2 = bundle.getInt(PARCEL_BUNDLE_KEY_ERROR_CODE);
        this.f31007q = i2 == -1 ? null : toq.values()[i2];
        this.f31006n = bundle.getString("error_message");
        this.f31004g = bundle.getString(PARCEL_BUNDLE_KEY_ERROR_STACK_TRACE);
    }
}

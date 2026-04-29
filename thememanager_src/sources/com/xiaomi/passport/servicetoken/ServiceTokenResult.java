package com.xiaomi.passport.servicetoken;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ServiceTokenResult implements Parcelable {
    public static final Parcelable.Creator<ServiceTokenResult> CREATOR = new Parcelable.Creator<ServiceTokenResult>() { // from class: com.xiaomi.passport.servicetoken.ServiceTokenResult.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ServiceTokenResult createFromParcel(Parcel parcel) {
            return new ServiceTokenResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public ServiceTokenResult[] newArray(int i2) {
            return new ServiceTokenResult[i2];
        }
    };
    private static final String PARCEL_BUNDLE_KEY_C_USER_ID = "cUserId";
    private static final String PARCEL_BUNDLE_KEY_ERROR_CODE = "errorCode";
    private static final String PARCEL_BUNDLE_KEY_ERROR_MESSAGE = "errorMessage";
    private static final String PARCEL_BUNDLE_KEY_ERROR_STACK_TRACE = "stackTrace";
    private static final String PARCEL_BUNDLE_KEY_INTENT = "intent";
    private static final String PARCEL_BUNDLE_KEY_PEEKED = "peeked";
    private static final String PARCEL_BUNDLE_KEY_PH = "ph";
    private static final String PARCEL_BUNDLE_KEY_SECURITY = "security";
    private static final String PARCEL_BUNDLE_KEY_SERVICE_TOKEN = "serviceToken";
    private static final String PARCEL_BUNDLE_KEY_SID = "sid";
    private static final String PARCEL_BUNDLE_KEY_SLH = "slh";
    private static final String PARCEL_BUNDLE_KEY_USER_ID = "userId";
    private static final String PARCEL_V2_FLAG = "V2#";

    /* JADX INFO: renamed from: c */
    public static final int f32504c = 2;

    /* JADX INFO: renamed from: f */
    public static final int f32505f = 1;

    /* JADX INFO: renamed from: g */
    public final toq f32506g;

    /* JADX INFO: renamed from: h */
    public final String f32507h;

    /* JADX INFO: renamed from: i */
    public final String f32508i;

    /* JADX INFO: renamed from: k */
    public final String f32509k;

    /* JADX INFO: renamed from: l */
    public final String f32510l;

    /* JADX INFO: renamed from: n */
    public final String f32511n;

    /* JADX INFO: renamed from: p */
    public final Intent f32512p;

    /* JADX INFO: renamed from: q */
    public final String f32513q;

    /* JADX INFO: renamed from: r */
    private final boolean f32514r;

    /* JADX INFO: renamed from: s */
    public final String f32515s;

    /* JADX INFO: renamed from: t */
    public final boolean f32516t;

    /* JADX INFO: renamed from: y */
    public final String f32517y;

    /* JADX INFO: renamed from: z */
    public final String f32518z;

    /* JADX INFO: renamed from: com.xiaomi.passport.servicetoken.ServiceTokenResult$k */
    public static final class C5817k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private Intent f73211f7l8;

        /* JADX INFO: renamed from: g */
        private toq f32519g = toq.ERROR_NONE;

        /* JADX INFO: renamed from: k */
        private final String f32520k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f73212ld6;

        /* JADX INFO: renamed from: n */
        private String f32521n;

        /* JADX INFO: renamed from: p */
        private String f32522p;

        /* JADX INFO: renamed from: q */
        private String f32523q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private String f73213qrj;

        /* JADX INFO: renamed from: s */
        private String f32524s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f73214toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private boolean f73215x2;

        /* JADX INFO: renamed from: y */
        private String f32525y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f73216zy;

        public C5817k(String str) {
            this.f32520k = str;
        }

        /* JADX INFO: renamed from: h */
        public static C5817k m20437h(ServiceTokenResult serviceTokenResult) {
            return new C5817k(serviceTokenResult.f32509k).fu4(serviceTokenResult.f32513q).ni7(serviceTokenResult.f32511n).cdj(serviceTokenResult.f32506g).ki(serviceTokenResult.f32517y).t8r(serviceTokenResult.f32515s).m20444i(serviceTokenResult.f32512p).m20445z(serviceTokenResult.f32507h).zurt(serviceTokenResult.f32508i).kja0(serviceTokenResult.f32518z).fn3e(serviceTokenResult.f32516t).o1t(serviceTokenResult.f32514r).wvg(serviceTokenResult.f32510l);
        }

        public C5817k cdj(toq toqVar) {
            this.f32519g = toqVar;
            return this;
        }

        public C5817k fn3e(boolean z2) {
            this.f73212ld6 = z2;
            return this;
        }

        public C5817k fu4(String str) {
            this.f73214toq = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C5817k m20444i(Intent intent) {
            this.f73211f7l8 = intent;
            return this;
        }

        public C5817k ki(String str) {
            this.f32523q = str;
            return this;
        }

        public C5817k kja0(String str) {
            this.f32522p = str;
            return this;
        }

        public ServiceTokenResult n7h() {
            return new ServiceTokenResult(this);
        }

        public C5817k ni7(String str) {
            this.f73216zy = str;
            return this;
        }

        public C5817k o1t(boolean z2) {
            this.f73215x2 = z2;
            return this;
        }

        public C5817k t8r(String str) {
            this.f32521n = str;
            return this;
        }

        public C5817k wvg(String str) {
            this.f73213qrj = str;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C5817k m20445z(String str) {
            this.f32525y = str;
            return this;
        }

        public C5817k zurt(String str) {
            this.f32524s = str;
            return this;
        }
    }

    public enum toq {
        ERROR_UNKNOWN,
        ERROR_NONE,
        ERROR_NO_ACCOUNT,
        ERROR_APP_PERMISSION_FORBIDDEN,
        ERROR_IOERROR,
        ERROR_OLD_MIUI_ACCOUNT_MANAGER_PERMISSION_ISSUE,
        ERROR_CANCELLED,
        ERROR_AUTHENTICATOR_ERROR,
        ERROR_TIME_OUT,
        ERROR_REMOTE_EXCEPTION,
        ERROR_USER_INTERACTION_NEEDED
    }

    private void zy(Parcel parcel, int i2) {
        parcel.writeString(this.f32509k);
        parcel.writeString(this.f32513q);
        parcel.writeString(this.f32511n);
        toq toqVar = this.f32506g;
        parcel.writeInt(toqVar == null ? -1 : toqVar.ordinal());
        parcel.writeString(this.f32517y);
        parcel.writeString(this.f32515s);
        parcel.writeParcelable(this.f32512p, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceTokenResult)) {
            return false;
        }
        ServiceTokenResult serviceTokenResult = (ServiceTokenResult) obj;
        if (this.f32510l != serviceTokenResult.f32510l || this.f32516t != serviceTokenResult.f32516t || this.f32514r != serviceTokenResult.f32514r) {
            return false;
        }
        String str = this.f32509k;
        if (str == null ? serviceTokenResult.f32509k != null : !str.equals(serviceTokenResult.f32509k)) {
            return false;
        }
        String str2 = this.f32513q;
        if (str2 == null ? serviceTokenResult.f32513q != null : !str2.equals(serviceTokenResult.f32513q)) {
            return false;
        }
        String str3 = this.f32511n;
        if (str3 == null ? serviceTokenResult.f32511n != null : !str3.equals(serviceTokenResult.f32511n)) {
            return false;
        }
        if (this.f32506g != serviceTokenResult.f32506g) {
            return false;
        }
        String str4 = this.f32517y;
        if (str4 == null ? serviceTokenResult.f32517y != null : !str4.equals(serviceTokenResult.f32517y)) {
            return false;
        }
        String str5 = this.f32515s;
        if (str5 == null ? serviceTokenResult.f32515s != null : !str5.equals(serviceTokenResult.f32515s)) {
            return false;
        }
        Intent intent = this.f32512p;
        if (intent == null ? serviceTokenResult.f32512p != null : !intent.equals(serviceTokenResult.f32512p)) {
            return false;
        }
        String str6 = this.f32507h;
        if (str6 == null ? serviceTokenResult.f32507h != null : !str6.equals(serviceTokenResult.f32507h)) {
            return false;
        }
        String str7 = this.f32508i;
        if (str7 == null ? serviceTokenResult.f32508i != null : !str7.equals(serviceTokenResult.f32508i)) {
            return false;
        }
        String str8 = this.f32518z;
        String str9 = serviceTokenResult.f32518z;
        return str8 != null ? str8.equals(str9) : str9 == null;
    }

    public int hashCode() {
        String str = this.f32509k;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f32513q;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f32511n;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        toq toqVar = this.f32506g;
        int iHashCode4 = (iHashCode3 + (toqVar != null ? toqVar.hashCode() : 0)) * 31;
        String str4 = this.f32517y;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f32515s;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Intent intent = this.f32512p;
        int iHashCode7 = (iHashCode6 + (intent != null ? intent.hashCode() : 0)) * 31;
        String str6 = this.f32507h;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f32508i;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f32518z;
        int iHashCode10 = (((((iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31) + (this.f32516t ? 1 : 0)) * 31) + (this.f32514r ? 1 : 0)) * 31;
        String str9 = this.f32510l;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return toq(0);
    }

    public String toq(int i2) {
        String str;
        boolean z2 = (i2 & 1) == 1;
        boolean z3 = (i2 & 2) == 2;
        String str2 = z2 ? this.f32513q : "serviceTokenMasked";
        String str3 = z3 ? this.f32511n : "securityMasked";
        if (TextUtils.isEmpty(this.f32510l) || this.f32510l.length() <= 3) {
            str = this.f32518z;
        } else {
            str = TextUtils.substring(this.f32510l, 0, 2) + "****";
        }
        StringBuffer stringBuffer = new StringBuffer("ServiceTokenResult{");
        stringBuffer.append("userId=");
        stringBuffer.append(str);
        stringBuffer.append('\'');
        stringBuffer.append(", sid='");
        stringBuffer.append(this.f32509k);
        stringBuffer.append('\'');
        stringBuffer.append(", serviceToken='");
        stringBuffer.append(str2);
        stringBuffer.append('\'');
        stringBuffer.append(", security='");
        stringBuffer.append(str3);
        stringBuffer.append('\'');
        stringBuffer.append(", errorCode=");
        stringBuffer.append(this.f32506g);
        stringBuffer.append(", errorMessage='");
        stringBuffer.append(this.f32517y);
        stringBuffer.append('\'');
        stringBuffer.append(", errorStackTrace='");
        stringBuffer.append(this.f32515s);
        stringBuffer.append('\'');
        stringBuffer.append(", intent=");
        stringBuffer.append(this.f32512p);
        stringBuffer.append(", slh='");
        stringBuffer.append(this.f32507h);
        stringBuffer.append('\'');
        stringBuffer.append(", ph='");
        stringBuffer.append(this.f32508i);
        stringBuffer.append('\'');
        stringBuffer.append(", cUserId='");
        stringBuffer.append(this.f32518z);
        stringBuffer.append('\'');
        stringBuffer.append(", peeked=");
        stringBuffer.append(this.f32516t);
        stringBuffer.append('\'');
        stringBuffer.append(", useV1Parcel=");
        stringBuffer.append(this.f32514r);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        if (this.f32514r) {
            zy(parcel, i2);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(PARCEL_BUNDLE_KEY_SID, this.f32509k);
        bundle.putString("serviceToken", this.f32513q);
        bundle.putString(PARCEL_BUNDLE_KEY_SECURITY, this.f32511n);
        toq toqVar = this.f32506g;
        bundle.putInt(PARCEL_BUNDLE_KEY_ERROR_CODE, toqVar == null ? -1 : toqVar.ordinal());
        bundle.putString(PARCEL_BUNDLE_KEY_ERROR_MESSAGE, this.f32517y);
        bundle.putString(PARCEL_BUNDLE_KEY_ERROR_STACK_TRACE, this.f32515s);
        bundle.putParcelable("intent", this.f32512p);
        bundle.putString(PARCEL_BUNDLE_KEY_SLH, this.f32507h);
        bundle.putString(PARCEL_BUNDLE_KEY_PH, this.f32508i);
        bundle.putString("cUserId", this.f32518z);
        bundle.putBoolean(PARCEL_BUNDLE_KEY_PEEKED, this.f32516t);
        bundle.putString("userId", this.f32510l);
        parcel.writeString(PARCEL_V2_FLAG);
        parcel.writeBundle(bundle);
    }

    private ServiceTokenResult(C5817k c5817k) {
        this.f32509k = c5817k.f32520k;
        this.f32513q = c5817k.f73214toq;
        this.f32511n = c5817k.f73216zy;
        this.f32517y = c5817k.f32523q;
        this.f32506g = c5817k.f32519g;
        this.f32512p = c5817k.f73211f7l8;
        this.f32515s = c5817k.f32521n;
        this.f32507h = c5817k.f32525y;
        this.f32508i = c5817k.f32524s;
        this.f32518z = c5817k.f32522p;
        this.f32516t = c5817k.f73212ld6;
        this.f32514r = c5817k.f73215x2;
        this.f32510l = c5817k.f73213qrj;
    }

    protected ServiceTokenResult(Parcel parcel) {
        String string = parcel.readString();
        if (!TextUtils.equals(PARCEL_V2_FLAG, string)) {
            this.f32509k = string;
            this.f32513q = parcel.readString();
            this.f32511n = parcel.readString();
            int i2 = parcel.readInt();
            this.f32506g = i2 == -1 ? null : toq.values()[i2];
            this.f32517y = parcel.readString();
            this.f32515s = parcel.readString();
            this.f32512p = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
            this.f32507h = null;
            this.f32508i = null;
            this.f32518z = null;
            this.f32516t = false;
            this.f32514r = false;
            this.f32510l = null;
            return;
        }
        Bundle bundle = parcel.readBundle(Intent.class.getClassLoader());
        this.f32509k = bundle.getString(PARCEL_BUNDLE_KEY_SID);
        this.f32513q = bundle.getString("serviceToken");
        this.f32511n = bundle.getString(PARCEL_BUNDLE_KEY_SECURITY);
        int i3 = bundle.getInt(PARCEL_BUNDLE_KEY_ERROR_CODE);
        this.f32506g = i3 != -1 ? toq.values()[i3] : null;
        this.f32517y = bundle.getString(PARCEL_BUNDLE_KEY_ERROR_MESSAGE);
        this.f32515s = bundle.getString(PARCEL_BUNDLE_KEY_ERROR_STACK_TRACE);
        this.f32512p = (Intent) bundle.getParcelable("intent");
        this.f32507h = bundle.getString(PARCEL_BUNDLE_KEY_SLH);
        this.f32508i = bundle.getString(PARCEL_BUNDLE_KEY_PH);
        this.f32518z = bundle.getString("cUserId");
        this.f32516t = bundle.getBoolean(PARCEL_BUNDLE_KEY_PEEKED);
        this.f32514r = true;
        this.f32510l = bundle.getString("userId");
    }
}

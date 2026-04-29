package com.xiaomi.accountsdk.guestaccount.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class GuestAccount implements Parcelable {
    public static final Parcelable.Creator<GuestAccount> CREATOR = new Parcelable.Creator<GuestAccount>() { // from class: com.xiaomi.accountsdk.guestaccount.data.GuestAccount.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public GuestAccount createFromParcel(Parcel parcel) {
            return new GuestAccount(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public GuestAccount[] newArray(int i2) {
            return new GuestAccount[i2];
        }
    };
    private static final String KEY_CALL_BACK = "callback";
    private static final String KEY_CUSER_ID = "cuserid";
    private static final String KEY_PASS_TOKEN = "passtoken";
    private static final String KEY_PH = "ph";
    private static final String KEY_SECURITY = "security";
    private static final String KEY_SERVICE_TOKEN = "servicetoken";
    private static final String KEY_SID = "sid";
    private static final String KEY_SLH = "slh";
    private static final String KEY_TYPE = "type";
    private static final String KEY_USER_ID = "userid";

    /* JADX INFO: renamed from: g */
    public final String f30827g;

    /* JADX INFO: renamed from: h */
    public final String f30828h;

    /* JADX INFO: renamed from: i */
    public final String f30829i;

    /* JADX INFO: renamed from: k */
    public final String f30830k;

    /* JADX INFO: renamed from: n */
    public final String f30831n;

    /* JADX INFO: renamed from: p */
    public final String f30832p;

    /* JADX INFO: renamed from: q */
    public final String f30833q;

    /* JADX INFO: renamed from: s */
    public final String f30834s;

    /* JADX INFO: renamed from: y */
    public final String f30835y;

    /* JADX INFO: renamed from: z */
    public final EnumC5515n f30836z;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.data.GuestAccount$k */
    public static final class C5512k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f72863f7l8;

        /* JADX INFO: renamed from: g */
        private String f30837g;

        /* JADX INFO: renamed from: k */
        private String f30838k;

        /* JADX INFO: renamed from: n */
        private String f30839n;

        /* JADX INFO: renamed from: p */
        private EnumC5515n f30840p;

        /* JADX INFO: renamed from: q */
        private String f30841q;

        /* JADX INFO: renamed from: s */
        private String f30842s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72864toq;

        /* JADX INFO: renamed from: y */
        private String f30843y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72865zy;

        public C5512k cdj(String str) {
            this.f30841q = str;
            return this;
        }

        public C5512k fn3e(String str) {
            this.f30838k = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C5512k m18855h(String str) {
            this.f30839n = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C5512k m18856i(EnumC5515n enumC5515n) {
            this.f30840p = enumC5515n;
            return this;
        }

        public C5512k ki(String str) {
            this.f72865zy = str;
            return this;
        }

        public C5512k kja0(String str) {
            this.f30842s = str;
            return this;
        }

        public GuestAccount ld6() {
            return new GuestAccount(this);
        }

        public C5512k n7h(String str) {
            this.f30837g = str;
            return this;
        }

        public C5512k qrj(String str) {
            this.f72863f7l8 = str;
            return this;
        }

        public C5512k t8r(String str) {
            this.f30843y = str;
            return this;
        }

        public C5512k x2(String str) {
            this.f72864toq = str;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestAccount)) {
            return false;
        }
        GuestAccount guestAccount = (GuestAccount) obj;
        String str = this.f30830k;
        if (str == null ? guestAccount.f30830k != null : !str.equals(guestAccount.f30830k)) {
            return false;
        }
        String str2 = this.f30833q;
        if (str2 == null ? guestAccount.f30833q != null : !str2.equals(guestAccount.f30833q)) {
            return false;
        }
        String str3 = this.f30831n;
        if (str3 == null ? guestAccount.f30831n != null : !str3.equals(guestAccount.f30831n)) {
            return false;
        }
        String str4 = this.f30827g;
        if (str4 == null ? guestAccount.f30827g != null : !str4.equals(guestAccount.f30827g)) {
            return false;
        }
        String str5 = this.f30835y;
        if (str5 == null ? guestAccount.f30835y != null : !str5.equals(guestAccount.f30835y)) {
            return false;
        }
        String str6 = this.f30834s;
        if (str6 == null ? guestAccount.f30834s != null : !str6.equals(guestAccount.f30834s)) {
            return false;
        }
        String str7 = this.f30832p;
        if (str7 == null ? guestAccount.f30832p != null : !str7.equals(guestAccount.f30832p)) {
            return false;
        }
        String str8 = this.f30828h;
        if (str8 == null ? guestAccount.f30828h != null : !str8.equals(guestAccount.f30828h)) {
            return false;
        }
        String str9 = this.f30829i;
        if (str9 == null ? guestAccount.f30829i == null : str9.equals(guestAccount.f30829i)) {
            return this.f30836z == guestAccount.f30836z;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f30830k;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30833q;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30831n;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f30827g;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f30835y;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f30834s;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f30832p;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f30828h;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f30829i;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        EnumC5515n enumC5515n = this.f30836z;
        return iHashCode9 + (enumC5515n != null ? enumC5515n.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k */
    public GuestAccount m18846k(EnumC5515n enumC5515n) {
        return new C5512k().ki(this.f30831n).fn3e(this.f30830k).x2(this.f30833q).n7h(this.f30834s).cdj(this.f30827g).m18855h(this.f30835y).qrj(this.f30832p).t8r(this.f30828h).kja0(this.f30829i).m18856i(enumC5515n).ld6();
    }

    public GuestAccount maskPassToken() {
        return new C5512k().ki(this.f30831n).fn3e(this.f30830k).x2(this.f30833q).n7h(null).cdj(this.f30827g).m18855h(this.f30835y).qrj(this.f30832p).t8r(this.f30828h).kja0(this.f30829i).m18856i(this.f30836z).ld6();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("GuestAccount{");
        stringBuffer.append("userId='");
        stringBuffer.append(this.f30830k);
        stringBuffer.append('\'');
        stringBuffer.append("cUserId='");
        stringBuffer.append(this.f30833q);
        stringBuffer.append('\'');
        stringBuffer.append(", sid='");
        stringBuffer.append(this.f30831n);
        stringBuffer.append('\'');
        stringBuffer.append(", serviceToken='");
        stringBuffer.append(this.f30827g);
        stringBuffer.append('\'');
        stringBuffer.append(", security='");
        stringBuffer.append(this.f30835y);
        stringBuffer.append('\'');
        stringBuffer.append(", passToken='");
        stringBuffer.append(this.f30834s);
        stringBuffer.append('\'');
        stringBuffer.append(", callback='");
        stringBuffer.append(this.f30832p);
        stringBuffer.append('\'');
        stringBuffer.append(", slh='");
        stringBuffer.append(this.f30828h);
        stringBuffer.append('\'');
        stringBuffer.append(", ph='");
        stringBuffer.append(this.f30829i);
        stringBuffer.append('\'');
        stringBuffer.append(", type=");
        stringBuffer.append(this.f30836z);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_USER_ID, this.f30830k);
        bundle.putString(KEY_CUSER_ID, this.f30833q);
        bundle.putString(KEY_SID, this.f30831n);
        bundle.putString(KEY_SERVICE_TOKEN, this.f30827g);
        bundle.putString(KEY_SECURITY, this.f30835y);
        bundle.putString(KEY_PASS_TOKEN, this.f30834s);
        bundle.putString(KEY_CALL_BACK, this.f30832p);
        bundle.putString(KEY_SLH, this.f30828h);
        bundle.putString(KEY_PH, this.f30829i);
        EnumC5515n enumC5515n = this.f30836z;
        bundle.putInt("type", enumC5515n == null ? -1 : enumC5515n.serverValue);
        parcel.writeBundle(bundle);
    }

    private GuestAccount(C5512k c5512k) {
        this.f30830k = c5512k.f30838k;
        this.f30833q = c5512k.f72864toq;
        this.f30831n = c5512k.f72865zy;
        this.f30827g = c5512k.f30841q;
        this.f30835y = c5512k.f30839n;
        this.f30834s = c5512k.f30837g;
        this.f30832p = c5512k.f72863f7l8;
        this.f30828h = c5512k.f30843y;
        this.f30829i = c5512k.f30842s;
        this.f30836z = c5512k.f30840p;
    }

    protected GuestAccount(Parcel parcel) {
        Bundle bundle = parcel.readBundle();
        this.f30830k = bundle.getString(KEY_USER_ID);
        this.f30833q = bundle.getString(KEY_CUSER_ID);
        this.f30831n = bundle.getString(KEY_SID);
        this.f30827g = bundle.getString(KEY_SERVICE_TOKEN);
        this.f30835y = bundle.getString(KEY_SECURITY);
        this.f30834s = bundle.getString(KEY_PASS_TOKEN);
        this.f30832p = bundle.getString(KEY_CALL_BACK);
        this.f30828h = bundle.getString(KEY_SLH);
        this.f30829i = bundle.getString(KEY_PH);
        this.f30836z = EnumC5515n.getFromServerValue(bundle.getInt("type"));
    }
}

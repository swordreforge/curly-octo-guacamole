package com.xiaomi.accountsdk.account.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.accountsdk.utils.AbstractC5574n;

/* JADX INFO: loaded from: classes3.dex */
public class RegisterUserInfo implements Parcelable {
    public static final Parcelable.Creator<RegisterUserInfo> CREATOR = new Parcelable.Creator<RegisterUserInfo>() { // from class: com.xiaomi.accountsdk.account.data.RegisterUserInfo.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public RegisterUserInfo createFromParcel(Parcel parcel) {
            Bundle bundle = parcel.readBundle();
            if (bundle == null) {
                return null;
            }
            return new C5469k(bundle.getInt(RegisterUserInfo.KEY_REGISTER_STATUS)).fu4(bundle.getString(RegisterUserInfo.KEY_USER_ID)).m18645z(bundle.getString(RegisterUserInfo.KEY_USER_NAME)).qrj(bundle.getString(RegisterUserInfo.KEY_AVATAR_ADDRESS)).ni7(bundle.getString(RegisterUserInfo.KEY_TICKET_TOKEN)).m18644i(bundle.getString("phone")).cdj(bundle.getString(RegisterUserInfo.KEY_MASKED_USER_ID)).m18643h(bundle.getBoolean(RegisterUserInfo.KEY_HAS_PASSWORD)).n7h(bundle.getLong(RegisterUserInfo.KEY_BIND_TIME)).t8r(bundle.getBoolean(RegisterUserInfo.KEY_NEED_TOAST)).ki(bundle.getBoolean(RegisterUserInfo.KEY_NEED_GET_ACTIVE_TIME)).fn3e(bundle.getBoolean(RegisterUserInfo.KEY_REGISTER_PWD)).kja0();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public RegisterUserInfo[] newArray(int i2) {
            return new RegisterUserInfo[0];
        }
    };
    private static final String KEY_AVATAR_ADDRESS = "avatar_address";
    private static final String KEY_BIND_TIME = "bind_time";
    private static final String KEY_HAS_PASSWORD = "has_pwd";
    private static final String KEY_MASKED_USER_ID = "masked_user_id";
    private static final String KEY_NEED_GET_ACTIVE_TIME = "need_get_active_time";
    private static final String KEY_NEED_TOAST = "need_toast";
    private static final String KEY_PHONE = "phone";
    private static final String KEY_REGISTER_PWD = "register_pwd";
    private static final String KEY_REGISTER_STATUS = "register_status";
    private static final String KEY_TICKET_TOKEN = "ticket_token";
    private static final String KEY_USER_ID = "user_id";
    private static final String KEY_USER_NAME = "user_name";

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final int f30540c = 2;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public static final int f30541f = 1;

    /* JADX INFO: renamed from: l */
    @Deprecated
    public static final int f30542l = 0;

    /* JADX INFO: renamed from: g */
    public final String f30543g;

    /* JADX INFO: renamed from: h */
    public final boolean f30544h;

    /* JADX INFO: renamed from: i */
    public final long f30545i;

    /* JADX INFO: renamed from: k */
    public final toq f30546k;

    /* JADX INFO: renamed from: n */
    public final String f30547n;

    /* JADX INFO: renamed from: p */
    public final String f30548p;

    /* JADX INFO: renamed from: q */
    public final String f30549q;

    /* JADX INFO: renamed from: r */
    public final boolean f30550r;

    /* JADX INFO: renamed from: s */
    public final String f30551s;

    /* JADX INFO: renamed from: t */
    public final boolean f30552t;

    /* JADX INFO: renamed from: y */
    public final String f30553y;

    /* JADX INFO: renamed from: z */
    public final boolean f30554z;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.RegisterUserInfo$k */
    public static class C5469k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f72604f7l8;

        /* JADX INFO: renamed from: g */
        private String f30555g;

        /* JADX INFO: renamed from: k */
        private int f30556k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private boolean f72605ld6;

        /* JADX INFO: renamed from: n */
        private String f30557n;

        /* JADX INFO: renamed from: p */
        private boolean f30558p;

        /* JADX INFO: renamed from: q */
        private String f30559q;

        /* JADX INFO: renamed from: s */
        private long f30560s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f72606toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private boolean f72607x2;

        /* JADX INFO: renamed from: y */
        private boolean f30561y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f72608zy;

        public C5469k(int i2) {
            this.f30556k = i2;
        }

        public C5469k cdj(String str) {
            this.f72604f7l8 = str;
            return this;
        }

        public C5469k fn3e(boolean z2) {
            this.f72607x2 = z2;
            return this;
        }

        public C5469k fu4(String str) {
            this.f72606toq = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C5469k m18643h(boolean z2) {
            this.f30561y = z2;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C5469k m18644i(String str) {
            this.f30555g = str;
            return this;
        }

        public C5469k ki(boolean z2) {
            this.f30558p = z2;
            return this;
        }

        public RegisterUserInfo kja0() {
            return new RegisterUserInfo(this);
        }

        public C5469k n7h(long j2) {
            this.f30560s = j2;
            return this;
        }

        public C5469k ni7(String str) {
            this.f30557n = str;
            return this;
        }

        public C5469k qrj(String str) {
            this.f30559q = str;
            return this;
        }

        public C5469k t8r(boolean z2) {
            this.f72605ld6 = z2;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C5469k m18645z(String str) {
            this.f72608zy = str;
            return this;
        }

        public C5469k zurt(int i2) {
            this.f30556k = i2;
            return this;
        }
    }

    public enum toq {
        STATUS_NOT_REGISTERED(0),
        STATUS_USED_POSSIBLY_RECYCLED(1),
        STATUS_REGISTERED_NOT_RECYCLED(2);

        public final int value;

        toq(int i2) {
            this.value = i2;
        }

        public static toq getInstance(int i2) {
            for (toq toqVar : values()) {
                if (i2 == toqVar.value) {
                    return toqVar;
                }
            }
            AbstractC5574n.fu4("RegisterStatus", "has not this status value: " + i2);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static C5469k m18634k(RegisterUserInfo registerUserInfo) {
        if (registerUserInfo == null) {
            return null;
        }
        return new C5469k(registerUserInfo.f30546k.value).fu4(registerUserInfo.f30549q).m18645z(registerUserInfo.f30547n).qrj(registerUserInfo.f30543g).ni7(registerUserInfo.f30553y).m18644i(registerUserInfo.f30551s).cdj(registerUserInfo.f30548p).m18643h(registerUserInfo.f30544h).n7h(registerUserInfo.f30545i).ki(registerUserInfo.f30554z).t8r(registerUserInfo.f30552t);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public String getAvartarAddress() {
        return this.f30543g;
    }

    @Deprecated
    public String getTicketToken() {
        return this.f30553y;
    }

    @Deprecated
    public String getUserId() {
        return this.f30549q;
    }

    @Deprecated
    public String getUserName() {
        return this.f30547n;
    }

    @Deprecated
    public int toq() {
        return this.f30546k.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_REGISTER_STATUS, this.f30546k.value);
        bundle.putString(KEY_USER_ID, this.f30549q);
        bundle.putString(KEY_USER_NAME, this.f30547n);
        bundle.putString(KEY_AVATAR_ADDRESS, this.f30543g);
        bundle.putString(KEY_TICKET_TOKEN, this.f30553y);
        bundle.putString("phone", this.f30551s);
        bundle.putString(KEY_MASKED_USER_ID, this.f30548p);
        bundle.putBoolean(KEY_HAS_PASSWORD, this.f30544h);
        bundle.putLong(KEY_BIND_TIME, this.f30545i);
        bundle.putBoolean(KEY_NEED_TOAST, this.f30552t);
        bundle.putBoolean(KEY_NEED_GET_ACTIVE_TIME, this.f30554z);
        bundle.putBoolean(KEY_REGISTER_PWD, this.f30550r);
        parcel.writeBundle(bundle);
    }

    @Deprecated
    public RegisterUserInfo(int i2, String str, String str2, String str3, String str4) {
        this.f30546k = toq.getInstance(i2);
        this.f30549q = str;
        this.f30547n = str2;
        this.f30543g = str3;
        this.f30553y = str4;
        this.f30551s = null;
        this.f30548p = null;
        this.f30544h = false;
        this.f30545i = -1L;
        this.f30554z = false;
        this.f30552t = false;
        this.f30550r = true;
    }

    private RegisterUserInfo(C5469k c5469k) {
        this.f30546k = toq.getInstance(c5469k.f30556k);
        this.f30549q = c5469k.f72606toq;
        this.f30547n = c5469k.f72608zy;
        this.f30543g = c5469k.f30559q;
        this.f30553y = c5469k.f30557n;
        this.f30551s = c5469k.f30555g;
        this.f30548p = c5469k.f72604f7l8;
        this.f30544h = c5469k.f30561y;
        this.f30545i = c5469k.f30560s;
        this.f30554z = c5469k.f30558p;
        this.f30552t = c5469k.f72605ld6;
        this.f30550r = c5469k.f72607x2;
    }
}

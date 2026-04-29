package com.xiaomi.accountsdk.account.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class MiLoginResult implements Parcelable {
    public static final Parcelable.Creator<MiLoginResult> CREATOR = new Parcelable.Creator<MiLoginResult>() { // from class: com.xiaomi.accountsdk.account.data.MiLoginResult.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public MiLoginResult createFromParcel(Parcel parcel) {
            return new MiLoginResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public MiLoginResult[] newArray(int i2) {
            return new MiLoginResult[i2];
        }
    };
    private static final String KEY_HAS_PWD = "has_pwd";
    private static final String KEY_STS_ERROR = "sts_error";

    /* JADX INFO: renamed from: a */
    public static final int f30446a = 10;

    /* JADX INFO: renamed from: b */
    public static final int f30447b = 9;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f72585bo = 12;

    /* JADX INFO: renamed from: c */
    public static final int f30448c = 4;

    /* JADX INFO: renamed from: e */
    public static final int f30449e = 5;

    /* JADX INFO: renamed from: f */
    public static final int f30450f = 3;

    /* JADX INFO: renamed from: j */
    public static final int f30451j = 6;

    /* JADX INFO: renamed from: l */
    public static final int f30452l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f30453m = 8;

    /* JADX INFO: renamed from: o */
    public static final int f30454o = 7;

    /* JADX INFO: renamed from: r */
    public static final int f30455r = 1;

    /* JADX INFO: renamed from: t */
    public static final int f30456t = 0;

    /* JADX INFO: renamed from: u */
    public static final int f30457u = 11;

    /* JADX INFO: renamed from: v */
    public static final int f30458v = 13;

    /* JADX INFO: renamed from: x */
    @Deprecated
    public static final int f30459x = 10;

    /* JADX INFO: renamed from: g */
    public final String f30460g;

    /* JADX INFO: renamed from: h */
    public final int f30461h;

    /* JADX INFO: renamed from: i */
    public final boolean f30462i;

    /* JADX INFO: renamed from: k */
    public final String f30463k;

    /* JADX INFO: renamed from: n */
    public final AccountInfo f30464n;

    /* JADX INFO: renamed from: p */
    public final String f30465p;

    /* JADX INFO: renamed from: q */
    public final String f30466q;

    /* JADX INFO: renamed from: s */
    public final MetaLoginData f30467s;

    /* JADX INFO: renamed from: y */
    public final String f30468y;

    /* JADX INFO: renamed from: z */
    public boolean f30469z;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.account.data.MiLoginResult$k */
    public static class C5457k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f72586f7l8;

        /* JADX INFO: renamed from: g */
        private MetaLoginData f30470g;

        /* JADX INFO: renamed from: k */
        private final String f30471k;

        /* JADX INFO: renamed from: n */
        private String f30472n;

        /* JADX INFO: renamed from: p */
        private boolean f30473p;

        /* JADX INFO: renamed from: q */
        private String f30474q;

        /* JADX INFO: renamed from: s */
        private boolean f30475s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f72587toq;

        /* JADX INFO: renamed from: y */
        private int f30476y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private AccountInfo f72588zy;

        public C5457k(String str, String str2) {
            this.f30471k = str;
            this.f72587toq = str2;
        }

        public C5457k cdj(String str) {
            this.f30472n = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C5457k m18595h(MetaLoginData metaLoginData) {
            this.f30470g = metaLoginData;
            return this;
        }

        public C5457k ki(int i2) {
            this.f30476y = i2;
            return this;
        }

        public C5457k kja0(boolean z2) {
            this.f30473p = z2;
            return this;
        }

        public MiLoginResult ld6() {
            return new MiLoginResult(this);
        }

        public C5457k n7h(boolean z2) {
            this.f30475s = z2;
            return this;
        }

        public C5457k qrj(String str) {
            this.f30474q = str;
            return this;
        }

        public C5457k t8r(String str) {
            this.f72586f7l8 = str;
            return this;
        }

        public C5457k x2(AccountInfo accountInfo) {
            this.f72588zy = accountInfo;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f30463k);
        parcel.writeString(this.f30466q);
        parcel.writeParcelable(this.f30464n, i2);
        parcel.writeString(this.f30460g);
        parcel.writeString(this.f30468y);
        parcel.writeParcelable(this.f30467s, i2);
        parcel.writeString(this.f30465p);
        parcel.writeInt(this.f30461h);
        Bundle bundle = new Bundle();
        bundle.putBoolean(KEY_HAS_PWD, this.f30462i);
        bundle.putBoolean(KEY_STS_ERROR, this.f30469z);
        parcel.writeBundle(bundle);
    }

    public MiLoginResult(Parcel parcel) {
        this.f30463k = parcel.readString();
        this.f30466q = parcel.readString();
        this.f30464n = (AccountInfo) parcel.readParcelable(AccountInfo.class.getClassLoader());
        this.f30460g = parcel.readString();
        this.f30468y = parcel.readString();
        this.f30467s = (MetaLoginData) parcel.readParcelable(MetaLoginData.class.getClassLoader());
        this.f30465p = parcel.readString();
        this.f30461h = parcel.readInt();
        Bundle bundle = parcel.readBundle();
        this.f30462i = bundle != null ? bundle.getBoolean(KEY_HAS_PWD) : true;
        this.f30469z = bundle != null ? bundle.getBoolean(KEY_STS_ERROR) : false;
    }

    private MiLoginResult(C5457k c5457k) {
        this.f30463k = c5457k.f30471k;
        this.f30466q = c5457k.f72587toq;
        this.f30464n = c5457k.f72588zy;
        this.f30460g = c5457k.f30474q;
        this.f30468y = c5457k.f30472n;
        this.f30467s = c5457k.f30470g;
        this.f30465p = c5457k.f72586f7l8;
        this.f30461h = c5457k.f30476y;
        this.f30462i = c5457k.f30475s;
        this.f30469z = c5457k.f30473p;
    }
}

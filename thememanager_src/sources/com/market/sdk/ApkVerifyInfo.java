package com.market.sdk;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class ApkVerifyInfo implements Parcelable {
    public static final Parcelable.Creator<ApkVerifyInfo> CREATOR = new Parcelable.Creator<ApkVerifyInfo>() { // from class: com.market.sdk.ApkVerifyInfo.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ApkVerifyInfo createFromParcel(Parcel parcel) {
            return new ApkVerifyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public ApkVerifyInfo[] newArray(int i2) {
            return new ApkVerifyInfo[i2];
        }
    };

    /* JADX INFO: renamed from: a */
    public static final int f27892a = 5;

    /* JADX INFO: renamed from: b */
    public static final int f27893b = 4;

    /* JADX INFO: renamed from: c */
    public static final int f27894c = 6;

    /* JADX INFO: renamed from: e */
    public static final int f27895e = 0;

    /* JADX INFO: renamed from: j */
    public static final int f27896j = 1;

    /* JADX INFO: renamed from: m */
    public static final int f27897m = 3;

    /* JADX INFO: renamed from: o */
    public static final int f27898o = 2;

    /* JADX INFO: renamed from: f */
    public boolean f27899f;

    /* JADX INFO: renamed from: g */
    public long f27900g;

    /* JADX INFO: renamed from: h */
    public String f27901h;

    /* JADX INFO: renamed from: i */
    public String f27902i;

    /* JADX INFO: renamed from: k */
    public int f27903k;

    /* JADX INFO: renamed from: l */
    public Intent f27904l;

    /* JADX INFO: renamed from: n */
    public int f27905n;

    /* JADX INFO: renamed from: p */
    public long f27906p;

    /* JADX INFO: renamed from: q */
    public String f27907q;

    /* JADX INFO: renamed from: r */
    public String f27908r;

    /* JADX INFO: renamed from: s */
    public long f27909s;

    /* JADX INFO: renamed from: t */
    public String f27910t;

    /* JADX INFO: renamed from: y */
    public String f27911y;

    /* JADX INFO: renamed from: z */
    public String f27912z;

    public ApkVerifyInfo() {
        this.f27903k = 4;
        this.f27907q = "";
        this.f27905n = 0;
        this.f27900g = 0L;
        this.f27911y = "";
        this.f27909s = 0L;
        this.f27906p = 0L;
        this.f27901h = "";
        this.f27902i = "";
        this.f27912z = "";
        this.f27910t = "";
        this.f27908r = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public boolean m17254k() {
        int i2 = this.f27903k;
        return i2 == 0 || i2 == 1 || i2 == 2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f27903k);
        parcel.writeString(this.f27907q);
        parcel.writeInt(this.f27905n);
        parcel.writeLong(this.f27900g);
        parcel.writeString(this.f27911y);
        parcel.writeLong(this.f27909s);
        parcel.writeLong(this.f27906p);
        parcel.writeString(this.f27901h);
        parcel.writeString(this.f27902i);
        parcel.writeString(this.f27912z);
        parcel.writeString(this.f27910t);
        parcel.writeParcelable(this.f27904l, 0);
    }

    public ApkVerifyInfo(int i2) {
        this.f27907q = "";
        this.f27905n = 0;
        this.f27900g = 0L;
        this.f27911y = "";
        this.f27909s = 0L;
        this.f27906p = 0L;
        this.f27901h = "";
        this.f27902i = "";
        this.f27912z = "";
        this.f27910t = "";
        this.f27908r = "";
        this.f27903k = i2;
    }

    public ApkVerifyInfo(Parcel parcel) {
        this.f27903k = 4;
        this.f27907q = "";
        this.f27905n = 0;
        this.f27900g = 0L;
        this.f27911y = "";
        this.f27909s = 0L;
        this.f27906p = 0L;
        this.f27901h = "";
        this.f27902i = "";
        this.f27912z = "";
        this.f27910t = "";
        this.f27908r = "";
        this.f27903k = parcel.readInt();
        this.f27907q = parcel.readString();
        this.f27905n = parcel.readInt();
        this.f27900g = parcel.readLong();
        this.f27911y = parcel.readString();
        this.f27909s = parcel.readLong();
        this.f27906p = parcel.readLong();
        this.f27901h = parcel.readString();
        this.f27902i = parcel.readString();
        this.f27912z = parcel.readString();
        this.f27910t = parcel.readString();
        this.f27904l = (Intent) parcel.readParcelable(null);
    }
}

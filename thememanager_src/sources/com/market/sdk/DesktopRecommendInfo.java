package com.market.sdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.C4872h;
import com.google.gson.InterfaceC4873i;
import com.google.gson.InterfaceC4920p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DesktopRecommendInfo implements Parcelable {
    public static final Parcelable.Creator<DesktopRecommendInfo> CREATOR = new Parcelable.Creator<DesktopRecommendInfo>() { // from class: com.market.sdk.DesktopRecommendInfo.3
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public DesktopRecommendInfo createFromParcel(Parcel parcel) {
            return new DesktopRecommendInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public DesktopRecommendInfo[] newArray(int i2) {
            return new DesktopRecommendInfo[i2];
        }
    };

    /* JADX INFO: renamed from: h */
    public static final long f27937h = 300000;

    /* JADX INFO: renamed from: g */
    @e5.zy("backgroundImageUrl")
    public String f27938g;

    /* JADX INFO: renamed from: k */
    @e5.zy("folderId")
    public long f27939k;

    /* JADX INFO: renamed from: n */
    @e5.zy("bannerList")
    public List<AdsBannerInfo> f27940n;

    /* JADX INFO: renamed from: p */
    @e5.zy("cacheTime")
    public long f27941p;

    /* JADX INFO: renamed from: q */
    @e5.zy("appInfoList")
    public List<AppstoreAppInfo> f27942q;

    /* JADX INFO: renamed from: s */
    @e5.zy("sid")
    public String f27943s;

    /* JADX INFO: renamed from: y */
    @e5.zy("description")
    public String f27944y;

    /* JADX INFO: renamed from: com.market.sdk.DesktopRecommendInfo$k */
    class C4943k implements InterfaceC4873i<Uri> {
        C4943k() {
        }

        @Override // com.google.gson.InterfaceC4873i
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public com.google.gson.x2 toq(Uri uri, Type type, com.google.gson.t8r t8rVar) {
            return new com.google.gson.ki(uri.toString());
        }
    }

    class toq implements com.google.gson.ld6<Uri> {
        toq() {
        }

        @Override // com.google.gson.ld6
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Uri mo8034k(com.google.gson.x2 x2Var, Type type, InterfaceC4920p interfaceC4920p) throws C4872h {
            return Uri.parse(x2Var.n7h().ki());
        }
    }

    public DesktopRecommendInfo() {
        this.f27939k = -1L;
        this.f27942q = new ArrayList();
        this.f27940n = new ArrayList();
        this.f27938g = "";
        this.f27944y = "";
        this.f27943s = "";
    }

    /* JADX INFO: renamed from: k */
    public static DesktopRecommendInfo m17261k(String str) {
        com.google.gson.f7l8 f7l8Var = new com.google.gson.f7l8();
        f7l8Var.ld6(Uri.class, new toq());
        return (DesktopRecommendInfo) f7l8Var.m17082q().n7h(str, DesktopRecommendInfo.class);
    }

    public String convertToJson() {
        com.google.gson.f7l8 f7l8Var = new com.google.gson.f7l8();
        f7l8Var.ld6(Uri.class, new C4943k());
        return f7l8Var.m17082q().o1t(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f27939k);
        parcel.writeTypedList(this.f27942q);
        parcel.writeTypedList(this.f27940n);
        parcel.writeString(this.f27938g);
        parcel.writeString(this.f27944y);
        parcel.writeString(this.f27943s);
        parcel.writeLong(this.f27941p);
    }

    public DesktopRecommendInfo(Parcel parcel) {
        this.f27939k = -1L;
        this.f27942q = new ArrayList();
        this.f27940n = new ArrayList();
        this.f27938g = "";
        this.f27944y = "";
        this.f27943s = "";
        this.f27939k = parcel.readLong();
        parcel.readTypedList(this.f27942q, AppstoreAppInfo.CREATOR);
        parcel.readTypedList(this.f27940n, AdsBannerInfo.CREATOR);
        this.f27938g = parcel.readString();
        this.f27944y = parcel.readString();
        this.f27943s = parcel.readString();
        this.f27941p = parcel.readLong();
    }
}

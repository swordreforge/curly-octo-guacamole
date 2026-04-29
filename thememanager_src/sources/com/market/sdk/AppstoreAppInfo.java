package com.market.sdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.market.sdk.utils.C5009i;
import java.util.ArrayList;
import java.util.List;
import miui.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public class AppstoreAppInfo implements Parcelable {
    public static final Parcelable.Creator<AppstoreAppInfo> CREATOR;

    /* JADX INFO: renamed from: e */
    private static final long f27913e = 1;

    /* JADX INFO: renamed from: j */
    private static final int f27914j = 0;

    /* JADX INFO: renamed from: o */
    private static boolean f27915o;

    /* JADX INFO: renamed from: f */
    @e5.zy("adInfoPassback")
    public String f27917f;

    /* JADX INFO: renamed from: g */
    @e5.zy("ads")
    public int f27918g;

    /* JADX INFO: renamed from: h */
    @e5.zy("iconMask")
    public String f27919h;

    /* JADX INFO: renamed from: i */
    @e5.zy("appUri")
    public Uri f27920i;

    /* JADX INFO: renamed from: k */
    @e5.zy("appId")
    public String f27921k;

    @e5.zy("mApkBriefDescription")
    private String mApkBriefDescription;

    @e5.zy("mParameters")
    private String mParameters;

    /* JADX INFO: renamed from: n */
    @e5.zy("title")
    public String f27923n;

    /* JADX INFO: renamed from: p */
    @e5.zy("iconUri")
    public Uri f27924p;

    /* JADX INFO: renamed from: q */
    @e5.zy("pkgName")
    public String f27925q;

    /* JADX INFO: renamed from: s */
    @e5.zy("experimentalId")
    public String f27927s;

    /* JADX INFO: renamed from: y */
    @e5.zy("digest")
    public String f27929y;

    /* JADX INFO: renamed from: z */
    @e5.zy("mApkSize")
    private long f27930z = -1;

    /* JADX INFO: renamed from: t */
    @e5.zy("viewMonitorUrls")
    public List<String> f27928t = new ArrayList();

    /* JADX INFO: renamed from: r */
    @e5.zy("clickMonitorUrls")
    public List<String> f27926r = new ArrayList();

    /* JADX INFO: renamed from: l */
    @e5.zy("impressionMonitorUrls")
    public List<String> f27922l = new ArrayList();

    /* JADX INFO: renamed from: c */
    @e5.zy("mFlag")
    private volatile long f27916c = -1;

    static {
        try {
            if (Build.IS_DEVELOPMENT_VERSION) {
                f27915o = C5009i.m17433k("6.3.21");
            } else if (Build.IS_STABLE_VERSION) {
                f27915o = C5009i.toq("V7.3.0.0");
            }
        } catch (Throwable th) {
            Log.e(MarketManager.f27964n, th.toString());
        }
        CREATOR = new Parcelable.Creator<AppstoreAppInfo>() { // from class: com.market.sdk.AppstoreAppInfo.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public AppstoreAppInfo createFromParcel(Parcel parcel) {
                return new AppstoreAppInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public AppstoreAppInfo[] newArray(int i2) {
                return new AppstoreAppInfo[i2];
            }
        };
    }

    public AppstoreAppInfo() {
    }

    private long toq() {
        if (this.f27916c != -1) {
            return this.f27916c;
        }
        Uri uri = this.f27920i;
        long j2 = 0;
        if (uri != null) {
            try {
                j2 = Long.parseLong(uri.getQueryParameter("config"));
            } catch (Exception unused) {
            }
        }
        this.f27916c = j2;
        return this.f27916c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void f7l8(String str) {
        this.mParameters = str;
    }

    /* JADX INFO: renamed from: g */
    public void m17256g(String str) {
        this.mApkBriefDescription = str;
    }

    public String getBriefDescription() {
        return this.mApkBriefDescription;
    }

    public String getParameters() {
        return this.mParameters;
    }

    /* JADX INFO: renamed from: k */
    public long m17257k() {
        return this.f27930z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f27921k);
        parcel.writeString(this.f27925q);
        parcel.writeString(this.f27923n);
        parcel.writeInt(this.f27918g);
        parcel.writeString(this.f27929y);
        parcel.writeString(this.f27927s);
        parcel.writeString(this.f27919h);
        Uri.writeToParcel(parcel, this.f27924p);
        Uri.writeToParcel(parcel, this.f27920i);
        if (f27915o) {
            parcel.writeStringList(this.f27928t);
            parcel.writeStringList(this.f27926r);
            parcel.writeStringList(this.f27922l);
            parcel.writeString(this.f27917f);
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean m17258y() {
        return this.f27918g == 1 && (toq() & 1) == 0;
    }

    public void zy(long j2) {
        this.f27930z = j2;
    }

    public AppstoreAppInfo(Parcel parcel) {
        this.f27921k = parcel.readString();
        this.f27925q = parcel.readString();
        this.f27923n = parcel.readString();
        this.f27918g = parcel.readInt();
        this.f27929y = parcel.readString();
        this.f27927s = parcel.readString();
        this.f27919h = parcel.readString();
        this.f27924p = (Uri) Uri.CREATOR.createFromParcel(parcel);
        this.f27920i = (Uri) Uri.CREATOR.createFromParcel(parcel);
        if (f27915o) {
            parcel.readStringList(this.f27928t);
            parcel.readStringList(this.f27926r);
            parcel.readStringList(this.f27922l);
            this.f27917f = parcel.readString();
        }
    }
}

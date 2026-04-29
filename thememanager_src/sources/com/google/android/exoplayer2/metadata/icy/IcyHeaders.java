package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.google.android.exoplayer2.was;
import java.util.List;
import java.util.Map;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new Parcelable.Creator<IcyHeaders>() { // from class: com.google.android.exoplayer2.metadata.icy.IcyHeaders.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public IcyHeaders[] newArray(int i2) {
            return new IcyHeaders[i2];
        }
    };
    private static final String RESPONSE_HEADER_BITRATE = "icy-br";
    private static final String RESPONSE_HEADER_GENRE = "icy-genre";
    private static final String RESPONSE_HEADER_METADATA_INTERVAL = "icy-metaint";
    private static final String RESPONSE_HEADER_NAME = "icy-name";
    private static final String RESPONSE_HEADER_PUB = "icy-pub";
    private static final String RESPONSE_HEADER_URL = "icy-url";
    private static final String TAG = "IcyHeaders";

    /* JADX INFO: renamed from: h */
    public static final String f20762h = "1";

    /* JADX INFO: renamed from: p */
    public static final String f20763p = "Icy-MetaData";

    /* JADX INFO: renamed from: g */
    @dd
    public final String f20764g;

    /* JADX INFO: renamed from: k */
    public final int f20765k;

    /* JADX INFO: renamed from: n */
    @dd
    public final String f20766n;

    /* JADX INFO: renamed from: q */
    @dd
    public final String f20767q;

    /* JADX INFO: renamed from: s */
    public final int f20768s;

    /* JADX INFO: renamed from: y */
    public final boolean f20769y;

    public IcyHeaders(int i2, @dd String str, @dd String str2, @dd String str3, boolean z2, int i3) {
        C3844k.m13629k(i3 == -1 || i3 > 0);
        this.f20765k = i2;
        this.f20767q = str;
        this.f20766n = str2;
        this.f20764g = str3;
        this.f20769y = z2;
        this.f20768s = i3;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static IcyHeaders m12292k(Map<String, List<String>> map) {
        int i2;
        boolean z2;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i3;
        List<String> list = map.get(RESPONSE_HEADER_BITRATE);
        int i4 = -1;
        boolean z3 = true;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i3 = Integer.parseInt(str4) * 1000;
            } catch (NumberFormatException unused) {
                i3 = -1;
            }
            if (i3 > 0) {
                z2 = true;
                i2 = i3;
            } else {
                try {
                    String strValueOf = String.valueOf(str4);
                    ni7.qrj(TAG, strValueOf.length() != 0 ? "Invalid bitrate: ".concat(strValueOf) : new String("Invalid bitrate: "));
                    i3 = -1;
                } catch (NumberFormatException unused2) {
                    String strValueOf2 = String.valueOf(str4);
                    ni7.qrj(TAG, strValueOf2.length() != 0 ? "Invalid bitrate header: ".concat(strValueOf2) : new String("Invalid bitrate header: "));
                }
                z2 = false;
                i2 = i3;
            }
        } else {
            i2 = -1;
            z2 = false;
        }
        List<String> list2 = map.get(RESPONSE_HEADER_GENRE);
        if (list2 != null) {
            str = list2.get(0);
            z2 = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get(RESPONSE_HEADER_NAME);
        if (list3 != null) {
            str2 = list3.get(0);
            z2 = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get(RESPONSE_HEADER_URL);
        if (list4 != null) {
            str3 = list4.get(0);
            z2 = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get(RESPONSE_HEADER_PUB);
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z2 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get(RESPONSE_HEADER_METADATA_INTERVAL);
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i5 = Integer.parseInt(str5);
                if (i5 > 0) {
                    i4 = i5;
                } else {
                    try {
                        String strValueOf3 = String.valueOf(str5);
                        ni7.qrj(TAG, strValueOf3.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf3) : new String("Invalid metadata interval: "));
                        z3 = z2;
                    } catch (NumberFormatException unused3) {
                        i4 = i5;
                        String strValueOf4 = String.valueOf(str5);
                        ni7.qrj(TAG, strValueOf4.length() != 0 ? "Invalid metadata interval: ".concat(strValueOf4) : new String("Invalid metadata interval: "));
                    }
                }
                z2 = z3;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z2) {
            return new IcyHeaders(i2, str, str2, str3, zEquals, i4);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f20765k == icyHeaders.f20765k && lrht.zy(this.f20767q, icyHeaders.f20767q) && lrht.zy(this.f20766n, icyHeaders.f20766n) && lrht.zy(this.f20764g, icyHeaders.f20764g) && this.f20769y == icyHeaders.f20769y && this.f20768s == icyHeaders.f20768s;
    }

    public int hashCode() {
        int i2 = (527 + this.f20765k) * 31;
        String str = this.f20767q;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20766n;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20764g;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f20769y ? 1 : 0)) * 31) + this.f20768s;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void qrj(was.toq toqVar) {
        String str = this.f20766n;
        if (str != null) {
            toqVar.bf2(str);
        }
        String str2 = this.f20767q;
        if (str2 != null) {
            toqVar.m13897e(str2);
        }
    }

    public String toString() {
        String str = this.f20766n;
        String str2 = this.f20767q;
        int i2 = this.f20765k;
        int i3 = this.f20768s;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i2);
        sb.append(", metadataInterval=");
        sb.append(i3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f20765k);
        parcel.writeString(this.f20767q);
        parcel.writeString(this.f20766n);
        parcel.writeString(this.f20764g);
        lrht.n2t(parcel, this.f20769y);
        parcel.writeInt(this.f20768s);
    }

    IcyHeaders(Parcel parcel) {
        this.f20765k = parcel.readInt();
        this.f20767q = parcel.readString();
        this.f20766n = parcel.readString();
        this.f20764g = parcel.readString();
        this.f20769y = lrht.zkd(parcel);
        this.f20768s = parcel.readInt();
    }
}

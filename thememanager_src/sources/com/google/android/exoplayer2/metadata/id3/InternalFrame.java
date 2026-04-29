package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.lrht;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new Parcelable.Creator<InternalFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.InternalFrame.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public InternalFrame[] newArray(int i2) {
            return new InternalFrame[i2];
        }
    };

    /* JADX INFO: renamed from: y */
    public static final String f20805y = "----";

    /* JADX INFO: renamed from: g */
    public final String f20806g;

    /* JADX INFO: renamed from: n */
    public final String f20807n;

    /* JADX INFO: renamed from: q */
    public final String f20808q;

    public InternalFrame(String str, String str2, String str3) {
        super(f20805y);
        this.f20808q = str;
        this.f20807n = str2;
        this.f20806g = str3;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return lrht.zy(this.f20807n, internalFrame.f20807n) && lrht.zy(this.f20808q, internalFrame.f20808q) && lrht.zy(this.f20806g, internalFrame.f20806g);
    }

    public int hashCode() {
        String str = this.f20808q;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20807n;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20806g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f20804k;
        String str2 = this.f20808q;
        String str3 = this.f20807n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20804k);
        parcel.writeString(this.f20808q);
        parcel.writeString(this.f20806g);
    }

    InternalFrame(Parcel parcel) {
        super(f20805y);
        this.f20808q = (String) lrht.ld6(parcel.readString());
        this.f20807n = (String) lrht.ld6(parcel.readString());
        this.f20806g = (String) lrht.ld6(parcel.readString());
    }
}

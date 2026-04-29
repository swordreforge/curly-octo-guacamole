package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.lrht;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new Parcelable.Creator<UrlLinkFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame[] newArray(int i2) {
            return new UrlLinkFrame[i2];
        }
    };

    /* JADX INFO: renamed from: n */
    public final String f20820n;

    /* JADX INFO: renamed from: q */
    @dd
    public final String f20821q;

    public UrlLinkFrame(String str, @dd String str2, String str3) {
        super(str);
        this.f20821q = str2;
        this.f20820n = str3;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f20804k.equals(urlLinkFrame.f20804k) && lrht.zy(this.f20821q, urlLinkFrame.f20821q) && lrht.zy(this.f20820n, urlLinkFrame.f20820n);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f20804k.hashCode()) * 31;
        String str = this.f20821q;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20820n;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f20804k;
        String str2 = this.f20820n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20804k);
        parcel.writeString(this.f20821q);
        parcel.writeString(this.f20820n);
    }

    UrlLinkFrame(Parcel parcel) {
        super((String) lrht.ld6(parcel.readString()));
        this.f20821q = parcel.readString();
        this.f20820n = (String) lrht.ld6(parcel.readString());
    }
}

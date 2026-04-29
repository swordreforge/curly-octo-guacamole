package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.lrht;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new Parcelable.Creator<GeobFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.GeobFrame.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public GeobFrame[] newArray(int i2) {
            return new GeobFrame[i2];
        }
    };

    /* JADX INFO: renamed from: s */
    public static final String f20799s = "GEOB";

    /* JADX INFO: renamed from: g */
    public final String f20800g;

    /* JADX INFO: renamed from: n */
    public final String f20801n;

    /* JADX INFO: renamed from: q */
    public final String f20802q;

    /* JADX INFO: renamed from: y */
    public final byte[] f20803y;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(f20799s);
        this.f20802q = str;
        this.f20801n = str2;
        this.f20800g = str3;
        this.f20803y = bArr;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return lrht.zy(this.f20802q, geobFrame.f20802q) && lrht.zy(this.f20801n, geobFrame.f20801n) && lrht.zy(this.f20800g, geobFrame.f20800g) && Arrays.equals(this.f20803y, geobFrame.f20803y);
    }

    public int hashCode() {
        String str = this.f20802q;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20801n;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20800g;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f20803y);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f20804k;
        String str2 = this.f20802q;
        String str3 = this.f20801n;
        String str4 = this.f20800g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20802q);
        parcel.writeString(this.f20801n);
        parcel.writeString(this.f20800g);
        parcel.writeByteArray(this.f20803y);
    }

    GeobFrame(Parcel parcel) {
        super(f20799s);
        this.f20802q = (String) lrht.ld6(parcel.readString());
        this.f20801n = (String) lrht.ld6(parcel.readString());
        this.f20800g = (String) lrht.ld6(parcel.readString());
        this.f20803y = (byte[]) lrht.ld6(parcel.createByteArray());
    }
}

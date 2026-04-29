package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.was;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new Parcelable.Creator<ApicFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.ApicFrame.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public ApicFrame[] newArray(int i2) {
            return new ApicFrame[i2];
        }
    };

    /* JADX INFO: renamed from: s */
    public static final String f20776s = "APIC";

    /* JADX INFO: renamed from: g */
    public final int f20777g;

    /* JADX INFO: renamed from: n */
    @dd
    public final String f20778n;

    /* JADX INFO: renamed from: q */
    public final String f20779q;

    /* JADX INFO: renamed from: y */
    public final byte[] f20780y;

    public ApicFrame(String str, @dd String str2, int i2, byte[] bArr) {
        super(f20776s);
        this.f20779q = str;
        this.f20778n = str2;
        this.f20777g = i2;
        this.f20780y = bArr;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f20777g == apicFrame.f20777g && lrht.zy(this.f20779q, apicFrame.f20779q) && lrht.zy(this.f20778n, apicFrame.f20778n) && Arrays.equals(this.f20780y, apicFrame.f20780y);
    }

    public int hashCode() {
        int i2 = (527 + this.f20777g) * 31;
        String str = this.f20779q;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20778n;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f20780y);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void qrj(was.toq toqVar) {
        toqVar.gvn7(this.f20780y, this.f20777g);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f20804k;
        String str2 = this.f20779q;
        String str3 = this.f20778n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20779q);
        parcel.writeString(this.f20778n);
        parcel.writeInt(this.f20777g);
        parcel.writeByteArray(this.f20780y);
    }

    ApicFrame(Parcel parcel) {
        super(f20776s);
        this.f20779q = (String) lrht.ld6(parcel.readString());
        this.f20778n = parcel.readString();
        this.f20777g = parcel.readInt();
        this.f20780y = (byte[]) lrht.ld6(parcel.createByteArray());
    }
}

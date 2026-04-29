package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.lrht;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new Parcelable.Creator<PrivFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.PrivFrame.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public PrivFrame[] newArray(int i2) {
            return new PrivFrame[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    public static final String f20815g = "PRIV";

    /* JADX INFO: renamed from: n */
    public final byte[] f20816n;

    /* JADX INFO: renamed from: q */
    public final String f20817q;

    public PrivFrame(String str, byte[] bArr) {
        super(f20815g);
        this.f20817q = str;
        this.f20816n = bArr;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return lrht.zy(this.f20817q, privFrame.f20817q) && Arrays.equals(this.f20816n, privFrame.f20816n);
    }

    public int hashCode() {
        String str = this.f20817q;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f20816n);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f20804k;
        String str2 = this.f20817q;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20817q);
        parcel.writeByteArray(this.f20816n);
    }

    PrivFrame(Parcel parcel) {
        super(f20815g);
        this.f20817q = (String) lrht.ld6(parcel.readString());
        this.f20816n = (byte[]) lrht.ld6(parcel.createByteArray());
    }
}

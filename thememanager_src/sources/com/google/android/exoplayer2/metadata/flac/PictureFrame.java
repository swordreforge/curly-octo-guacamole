package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.was;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new Parcelable.Creator<PictureFrame>() { // from class: com.google.android.exoplayer2.metadata.flac.PictureFrame.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public PictureFrame[] newArray(int i2) {
            return new PictureFrame[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    public final int f20752g;

    /* JADX INFO: renamed from: h */
    public final byte[] f20753h;

    /* JADX INFO: renamed from: k */
    public final int f20754k;

    /* JADX INFO: renamed from: n */
    public final String f20755n;

    /* JADX INFO: renamed from: p */
    public final int f20756p;

    /* JADX INFO: renamed from: q */
    public final String f20757q;

    /* JADX INFO: renamed from: s */
    public final int f20758s;

    /* JADX INFO: renamed from: y */
    public final int f20759y;

    public PictureFrame(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.f20754k = i2;
        this.f20757q = str;
        this.f20755n = str2;
        this.f20752g = i3;
        this.f20759y = i4;
        this.f20758s = i5;
        this.f20756p = i6;
        this.f20753h = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f20754k == pictureFrame.f20754k && this.f20757q.equals(pictureFrame.f20757q) && this.f20755n.equals(pictureFrame.f20755n) && this.f20752g == pictureFrame.f20752g && this.f20759y == pictureFrame.f20759y && this.f20758s == pictureFrame.f20758s && this.f20756p == pictureFrame.f20756p && Arrays.equals(this.f20753h, pictureFrame.f20753h);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f20754k) * 31) + this.f20757q.hashCode()) * 31) + this.f20755n.hashCode()) * 31) + this.f20752g) * 31) + this.f20759y) * 31) + this.f20758s) * 31) + this.f20756p) * 31) + Arrays.hashCode(this.f20753h);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void qrj(was.toq toqVar) {
        toqVar.gvn7(this.f20753h, this.f20754k);
    }

    public String toString() {
        String str = this.f20757q;
        String str2 = this.f20755n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f20754k);
        parcel.writeString(this.f20757q);
        parcel.writeString(this.f20755n);
        parcel.writeInt(this.f20752g);
        parcel.writeInt(this.f20759y);
        parcel.writeInt(this.f20758s);
        parcel.writeInt(this.f20756p);
        parcel.writeByteArray(this.f20753h);
    }

    PictureFrame(Parcel parcel) {
        this.f20754k = parcel.readInt();
        this.f20757q = (String) lrht.ld6(parcel.readString());
        this.f20755n = (String) lrht.ld6(parcel.readString());
        this.f20752g = parcel.readInt();
        this.f20759y = parcel.readInt();
        this.f20758s = parcel.readInt();
        this.f20756p = parcel.readInt();
        this.f20753h = (byte[]) lrht.ld6(parcel.createByteArray());
    }
}

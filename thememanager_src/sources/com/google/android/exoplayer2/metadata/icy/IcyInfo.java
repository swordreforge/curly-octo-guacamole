package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.was;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new Parcelable.Creator<IcyInfo>() { // from class: com.google.android.exoplayer2.metadata.icy.IcyInfo.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public IcyInfo[] newArray(int i2) {
            return new IcyInfo[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    public final byte[] f20770k;

    /* JADX INFO: renamed from: n */
    @dd
    public final String f20771n;

    /* JADX INFO: renamed from: q */
    @dd
    public final String f20772q;

    public IcyInfo(byte[] bArr, @dd String str, @dd String str2) {
        this.f20770k = bArr;
        this.f20772q = str;
        this.f20771n = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f20770k, ((IcyInfo) obj).f20770k);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f20770k);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void qrj(was.toq toqVar) {
        String str = this.f20772q;
        if (str != null) {
            toqVar.a98o(str);
        }
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f20772q, this.f20771n, Integer.valueOf(this.f20770k.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.f20770k);
        parcel.writeString(this.f20772q);
        parcel.writeString(this.f20771n);
    }

    IcyInfo(Parcel parcel) {
        this.f20770k = (byte[]) C3844k.f7l8(parcel.createByteArray());
        this.f20772q = parcel.readString();
        this.f20771n = parcel.readString();
    }
}

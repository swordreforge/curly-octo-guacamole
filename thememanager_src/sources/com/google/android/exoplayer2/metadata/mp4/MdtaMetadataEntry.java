package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.lrht;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new Parcelable.Creator<MdtaMetadataEntry>() { // from class: com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry[] newArray(int i2) {
            return new MdtaMetadataEntry[i2];
        }
    };

    /* JADX INFO: renamed from: y */
    public static final String f20831y = "com.android.capture.fps";

    /* JADX INFO: renamed from: g */
    public final int f20832g;

    /* JADX INFO: renamed from: k */
    public final String f20833k;

    /* JADX INFO: renamed from: n */
    public final int f20834n;

    /* JADX INFO: renamed from: q */
    public final byte[] f20835q;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f20833k.equals(mdtaMetadataEntry.f20833k) && Arrays.equals(this.f20835q, mdtaMetadataEntry.f20835q) && this.f20834n == mdtaMetadataEntry.f20834n && this.f20832g == mdtaMetadataEntry.f20832g;
    }

    public int hashCode() {
        return ((((((527 + this.f20833k.hashCode()) * 31) + Arrays.hashCode(this.f20835q)) * 31) + this.f20834n) * 31) + this.f20832g;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f20833k);
        return strValueOf.length() != 0 ? "mdta: key=".concat(strValueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20833k);
        parcel.writeByteArray(this.f20835q);
        parcel.writeInt(this.f20834n);
        parcel.writeInt(this.f20832g);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i2, int i3) {
        this.f20833k = str;
        this.f20835q = bArr;
        this.f20834n = i2;
        this.f20832g = i3;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        this.f20833k = (String) lrht.ld6(parcel.readString());
        this.f20835q = (byte[]) lrht.ld6(parcel.createByteArray());
        this.f20834n = parcel.readInt();
        this.f20832g = parcel.readInt();
    }
}

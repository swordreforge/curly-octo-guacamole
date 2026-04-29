package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new Parcelable.Creator<StreamKey>() { // from class: com.google.android.exoplayer2.offline.StreamKey.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int i2) {
            return new StreamKey[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    @Deprecated
    public final int f20929g;

    /* JADX INFO: renamed from: k */
    public final int f20930k;

    /* JADX INFO: renamed from: n */
    public final int f20931n;

    /* JADX INFO: renamed from: q */
    public final int f20932q;

    public StreamKey(int i2, int i3) {
        this(0, i2, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f20930k == streamKey.f20930k && this.f20932q == streamKey.f20932q && this.f20931n == streamKey.f20931n;
    }

    public int hashCode() {
        return (((this.f20930k * 31) + this.f20932q) * 31) + this.f20931n;
    }

    public String toString() {
        int i2 = this.f20930k;
        int i3 = this.f20932q;
        int i4 = this.f20931n;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        sb.append(".");
        sb.append(i4);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i2 = this.f20930k - streamKey.f20930k;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f20932q - streamKey.f20932q;
        return i3 == 0 ? this.f20931n - streamKey.f20931n : i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f20930k);
        parcel.writeInt(this.f20932q);
        parcel.writeInt(this.f20931n);
    }

    public StreamKey(int i2, int i3, int i4) {
        this.f20930k = i2;
        this.f20932q = i3;
        this.f20931n = i4;
        this.f20929g = i4;
    }

    StreamKey(Parcel parcel) {
        this.f20930k = parcel.readInt();
        this.f20932q = parcel.readInt();
        int i2 = parcel.readInt();
        this.f20931n = i2;
        this.f20929g = i2;
    }
}

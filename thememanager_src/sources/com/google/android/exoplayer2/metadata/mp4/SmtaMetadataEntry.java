package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.C4741n;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new Parcelable.Creator<SmtaMetadataEntry>() { // from class: com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry[] newArray(int i2) {
            return new SmtaMetadataEntry[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    public final float f20846k;

    /* JADX INFO: renamed from: q */
    public final int f20847q;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f20846k == smtaMetadataEntry.f20846k && this.f20847q == smtaMetadataEntry.f20847q;
    }

    public int hashCode() {
        return ((527 + C4741n.m16670s(this.f20846k)) * 31) + this.f20847q;
    }

    public String toString() {
        float f2 = this.f20846k;
        int i2 = this.f20847q;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f2);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f20846k);
        parcel.writeInt(this.f20847q);
    }

    public SmtaMetadataEntry(float f2, int i2) {
        this.f20846k = f2;
        this.f20847q = i2;
    }

    private SmtaMetadataEntry(Parcel parcel) {
        this.f20846k = parcel.readFloat();
        this.f20847q = parcel.readInt();
    }
}

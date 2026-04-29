package com.google.android.exoplayer2.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C3844k;

/* JADX INFO: loaded from: classes2.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new Parcelable.Creator<AppInfoTable>() { // from class: com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AppInfoTable createFromParcel(Parcel parcel) {
            return new AppInfoTable(parcel.readInt(), (String) C3844k.f7l8(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public AppInfoTable[] newArray(int i2) {
            return new AppInfoTable[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    public static final int f20737g = 2;

    /* JADX INFO: renamed from: n */
    public static final int f20738n = 1;

    /* JADX INFO: renamed from: k */
    public final int f20739k;

    /* JADX INFO: renamed from: q */
    public final String f20740q;

    public AppInfoTable(int i2, String str) {
        this.f20739k = i2;
        this.f20740q = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        int i2 = this.f20739k;
        String str = this.f20740q;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append("Ait(controlCode=");
        sb.append(i2);
        sb.append(",url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20740q);
        parcel.writeInt(this.f20739k);
    }
}

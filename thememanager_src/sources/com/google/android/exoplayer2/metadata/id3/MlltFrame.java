package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.lrht;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new Parcelable.Creator<MlltFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.MlltFrame.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public MlltFrame[] newArray(int i2) {
            return new MlltFrame[i2];
        }
    };

    /* JADX INFO: renamed from: p */
    public static final String f20809p = "MLLT";

    /* JADX INFO: renamed from: g */
    public final int f20810g;

    /* JADX INFO: renamed from: n */
    public final int f20811n;

    /* JADX INFO: renamed from: q */
    public final int f20812q;

    /* JADX INFO: renamed from: s */
    public final int[] f20813s;

    /* JADX INFO: renamed from: y */
    public final int[] f20814y;

    public MlltFrame(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super(f20809p);
        this.f20812q = i2;
        this.f20811n = i3;
        this.f20810g = i4;
        this.f20814y = iArr;
        this.f20813s = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f20812q == mlltFrame.f20812q && this.f20811n == mlltFrame.f20811n && this.f20810g == mlltFrame.f20810g && Arrays.equals(this.f20814y, mlltFrame.f20814y) && Arrays.equals(this.f20813s, mlltFrame.f20813s);
    }

    public int hashCode() {
        return ((((((((527 + this.f20812q) * 31) + this.f20811n) * 31) + this.f20810g) * 31) + Arrays.hashCode(this.f20814y)) * 31) + Arrays.hashCode(this.f20813s);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f20812q);
        parcel.writeInt(this.f20811n);
        parcel.writeInt(this.f20810g);
        parcel.writeIntArray(this.f20814y);
        parcel.writeIntArray(this.f20813s);
    }

    MlltFrame(Parcel parcel) {
        super(f20809p);
        this.f20812q = parcel.readInt();
        this.f20811n = parcel.readInt();
        this.f20810g = parcel.readInt();
        this.f20814y = (int[]) lrht.ld6(parcel.createIntArray());
        this.f20813s = (int[]) lrht.ld6(parcel.createIntArray());
    }
}

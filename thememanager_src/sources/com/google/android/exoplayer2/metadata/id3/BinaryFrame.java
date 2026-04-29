package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.lrht;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new Parcelable.Creator<BinaryFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.BinaryFrame.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public BinaryFrame[] newArray(int i2) {
            return new BinaryFrame[i2];
        }
    };

    /* JADX INFO: renamed from: q */
    public final byte[] f20781q;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f20781q = bArr;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f20804k.equals(binaryFrame.f20804k) && Arrays.equals(this.f20781q, binaryFrame.f20781q);
    }

    public int hashCode() {
        return ((527 + this.f20804k.hashCode()) * 31) + Arrays.hashCode(this.f20781q);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20804k);
        parcel.writeByteArray(this.f20781q);
    }

    BinaryFrame(Parcel parcel) {
        super((String) lrht.ld6(parcel.readString()));
        this.f20781q = (byte[]) lrht.ld6(parcel.createByteArray());
    }
}

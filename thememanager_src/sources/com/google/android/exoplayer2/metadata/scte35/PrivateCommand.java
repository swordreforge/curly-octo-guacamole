package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new Parcelable.Creator<PrivateCommand>() { // from class: com.google.android.exoplayer2.metadata.scte35.PrivateCommand.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public PrivateCommand[] newArray(int i2) {
            return new PrivateCommand[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    public final long f20859k;

    /* JADX INFO: renamed from: n */
    public final byte[] f20860n;

    /* JADX INFO: renamed from: q */
    public final long f20861q;

    /* JADX INFO: renamed from: k */
    static PrivateCommand m12329k(gvn7 gvn7Var, int i2, long j2) {
        long jD3 = gvn7Var.d3();
        int i3 = i2 - 4;
        byte[] bArr = new byte[i3];
        gvn7Var.ld6(bArr, 0, i3);
        return new PrivateCommand(jD3, bArr, j2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f20859k);
        parcel.writeLong(this.f20861q);
        parcel.writeByteArray(this.f20860n);
    }

    private PrivateCommand(long j2, byte[] bArr, long j3) {
        this.f20859k = j3;
        this.f20861q = j2;
        this.f20860n = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.f20859k = parcel.readLong();
        this.f20861q = parcel.readLong();
        this.f20860n = (byte[]) lrht.ld6(parcel.createByteArray());
    }
}

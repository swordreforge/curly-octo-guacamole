package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.util.C3847l;
import com.google.android.exoplayer2.util.gvn7;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Parcelable.Creator<TimeSignalCommand>() { // from class: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand[] newArray(int i2) {
            return new TimeSignalCommand[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    public final long f20885k;

    /* JADX INFO: renamed from: q */
    public final long f20886q;

    /* JADX INFO: renamed from: k */
    static TimeSignalCommand m12343k(gvn7 gvn7Var, long j2, C3847l c3847l) {
        long qVar = toq(gvn7Var, j2);
        return new TimeSignalCommand(qVar, c3847l.toq(qVar));
    }

    static long toq(gvn7 gvn7Var, long j2) {
        long jJp0y = gvn7Var.jp0y();
        return (128 & jJp0y) != 0 ? 8589934591L & ((((jJp0y & 1) << 32) | gvn7Var.d3()) + j2) : C3548p.f65257toq;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f20885k);
        parcel.writeLong(this.f20886q);
    }

    private TimeSignalCommand(long j2, long j3) {
        this.f20885k = j2;
        this.f20886q = j3;
    }
}

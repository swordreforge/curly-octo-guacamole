package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.util.C3847l;
import com.google.android.exoplayer2.util.gvn7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new Parcelable.Creator<SpliceInsertCommand>() { // from class: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand[] newArray(int i2) {
            return new SpliceInsertCommand[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    public final boolean f20862g;

    /* JADX INFO: renamed from: h */
    public final List<C3511k> f20863h;

    /* JADX INFO: renamed from: i */
    public final boolean f20864i;

    /* JADX INFO: renamed from: k */
    public final long f20865k;

    /* JADX INFO: renamed from: l */
    public final int f20866l;

    /* JADX INFO: renamed from: n */
    public final boolean f20867n;

    /* JADX INFO: renamed from: p */
    public final long f20868p;

    /* JADX INFO: renamed from: q */
    public final boolean f20869q;

    /* JADX INFO: renamed from: r */
    public final int f20870r;

    /* JADX INFO: renamed from: s */
    public final long f20871s;

    /* JADX INFO: renamed from: t */
    public final int f20872t;

    /* JADX INFO: renamed from: y */
    public final boolean f20873y;

    /* JADX INFO: renamed from: z */
    public final long f20874z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$k */
    public static final class C3511k {

        /* JADX INFO: renamed from: k */
        public final int f20875k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final long f64992toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final long f64993zy;

        /* JADX INFO: renamed from: k */
        public static C3511k m12333k(Parcel parcel) {
            return new C3511k(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void toq(Parcel parcel) {
            parcel.writeInt(this.f20875k);
            parcel.writeLong(this.f64992toq);
            parcel.writeLong(this.f64993zy);
        }

        private C3511k(int i2, long j2, long j3) {
            this.f20875k = i2;
            this.f64992toq = j2;
            this.f64993zy = j3;
        }
    }

    /* JADX INFO: renamed from: k */
    static SpliceInsertCommand m12331k(gvn7 gvn7Var, long j2, C3847l c3847l) {
        List list;
        boolean z2;
        boolean z3;
        long j3;
        boolean z5;
        long j4;
        int iLvui;
        int iJp0y;
        int iJp0y2;
        boolean z6;
        boolean z7;
        long jD3;
        long jD32 = gvn7Var.d3();
        boolean z8 = (gvn7Var.jp0y() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z8) {
            list = listEmptyList;
            z2 = false;
            z3 = false;
            j3 = C3548p.f65257toq;
            z5 = false;
            j4 = C3548p.f65257toq;
            iLvui = 0;
            iJp0y = 0;
            iJp0y2 = 0;
            z6 = false;
        } else {
            int iJp0y3 = gvn7Var.jp0y();
            boolean z9 = (iJp0y3 & 128) != 0;
            boolean z10 = (iJp0y3 & 64) != 0;
            boolean z11 = (iJp0y3 & 32) != 0;
            boolean z12 = (iJp0y3 & 16) != 0;
            long qVar = (!z10 || z12) ? C3548p.f65257toq : TimeSignalCommand.toq(gvn7Var, j2);
            if (!z10) {
                int iJp0y4 = gvn7Var.jp0y();
                ArrayList arrayList = new ArrayList(iJp0y4);
                for (int i2 = 0; i2 < iJp0y4; i2++) {
                    int iJp0y5 = gvn7Var.jp0y();
                    long qVar2 = !z12 ? TimeSignalCommand.toq(gvn7Var, j2) : C3548p.f65257toq;
                    arrayList.add(new C3511k(iJp0y5, qVar2, c3847l.toq(qVar2)));
                }
                listEmptyList = arrayList;
            }
            if (z11) {
                long jJp0y = gvn7Var.jp0y();
                boolean z13 = (128 & jJp0y) != 0;
                jD3 = ((((jJp0y & 1) << 32) | gvn7Var.d3()) * 1000) / 90;
                z7 = z13;
            } else {
                z7 = false;
                jD3 = C3548p.f65257toq;
            }
            iLvui = gvn7Var.lvui();
            z6 = z10;
            iJp0y = gvn7Var.jp0y();
            iJp0y2 = gvn7Var.jp0y();
            list = listEmptyList;
            long j5 = qVar;
            z5 = z7;
            j4 = jD3;
            z3 = z12;
            z2 = z9;
            j3 = j5;
        }
        return new SpliceInsertCommand(jD32, z8, z2, z6, z3, j3, c3847l.toq(j3), list, z5, j4, iLvui, iJp0y, iJp0y2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f20865k);
        parcel.writeByte(this.f20869q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20867n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20862g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20873y ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f20871s);
        parcel.writeLong(this.f20868p);
        int size = this.f20863h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.f20863h.get(i3).toq(parcel);
        }
        parcel.writeByte(this.f20864i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f20874z);
        parcel.writeInt(this.f20872t);
        parcel.writeInt(this.f20870r);
        parcel.writeInt(this.f20866l);
    }

    private SpliceInsertCommand(long j2, boolean z2, boolean z3, boolean z5, boolean z6, long j3, long j4, List<C3511k> list, boolean z7, long j5, int i2, int i3, int i4) {
        this.f20865k = j2;
        this.f20869q = z2;
        this.f20867n = z3;
        this.f20862g = z5;
        this.f20873y = z6;
        this.f20871s = j3;
        this.f20868p = j4;
        this.f20863h = Collections.unmodifiableList(list);
        this.f20864i = z7;
        this.f20874z = j5;
        this.f20872t = i2;
        this.f20870r = i3;
        this.f20866l = i4;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.f20865k = parcel.readLong();
        this.f20869q = parcel.readByte() == 1;
        this.f20867n = parcel.readByte() == 1;
        this.f20862g = parcel.readByte() == 1;
        this.f20873y = parcel.readByte() == 1;
        this.f20871s = parcel.readLong();
        this.f20868p = parcel.readLong();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(C3511k.m12333k(parcel));
        }
        this.f20863h = Collections.unmodifiableList(arrayList);
        this.f20864i = parcel.readByte() == 1;
        this.f20874z = parcel.readLong();
        this.f20872t = parcel.readInt();
        this.f20870r = parcel.readInt();
        this.f20866l = parcel.readInt();
    }
}

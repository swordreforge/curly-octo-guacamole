package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.util.gvn7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new Parcelable.Creator<SpliceScheduleCommand>() { // from class: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand[] newArray(int i2) {
            return new SpliceScheduleCommand[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    public final List<toq> f20876k;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$k */
    public static final class C3514k {

        /* JADX INFO: renamed from: k */
        public final int f20877k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final long f64994toq;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public void m12338q(Parcel parcel) {
            parcel.writeInt(this.f20877k);
            parcel.writeLong(this.f64994toq);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C3514k zy(Parcel parcel) {
            return new C3514k(parcel.readInt(), parcel.readLong());
        }

        private C3514k(int i2, long j2) {
            this.f20877k = i2;
            this.f64994toq = j2;
        }
    }

    /* JADX INFO: renamed from: k */
    static SpliceScheduleCommand m12335k(gvn7 gvn7Var) {
        int iJp0y = gvn7Var.jp0y();
        ArrayList arrayList = new ArrayList(iJp0y);
        for (int i2 = 0; i2 < iJp0y; i2++) {
            arrayList.add(toq.m12341n(gvn7Var));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int size = this.f20876k.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.f20876k.get(i3).m12339g(parcel);
        }
    }

    private SpliceScheduleCommand(List<toq> list) {
        this.f20876k = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(toq.m12342q(parcel));
        }
        this.f20876k = Collections.unmodifiableList(arrayList);
    }

    public static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public final boolean f64995f7l8;

        /* JADX INFO: renamed from: g */
        public final List<C3514k> f20878g;

        /* JADX INFO: renamed from: k */
        public final long f20879k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public final int f64996ld6;

        /* JADX INFO: renamed from: n */
        public final long f20880n;

        /* JADX INFO: renamed from: p */
        public final int f20881p;

        /* JADX INFO: renamed from: q */
        public final boolean f20882q;

        /* JADX INFO: renamed from: s */
        public final int f20883s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final boolean f64997toq;

        /* JADX INFO: renamed from: y */
        public final long f20884y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final boolean f64998zy;

        private toq(long j2, boolean z2, boolean z3, boolean z5, List<C3514k> list, long j3, boolean z6, long j4, int i2, int i3, int i4) {
            this.f20879k = j2;
            this.f64997toq = z2;
            this.f64998zy = z3;
            this.f20882q = z5;
            this.f20878g = Collections.unmodifiableList(list);
            this.f20880n = j3;
            this.f64995f7l8 = z6;
            this.f20884y = j4;
            this.f20883s = i2;
            this.f20881p = i3;
            this.f64996ld6 = i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public void m12339g(Parcel parcel) {
            parcel.writeLong(this.f20879k);
            parcel.writeByte(this.f64997toq ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f64998zy ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f20882q ? (byte) 1 : (byte) 0);
            int size = this.f20878g.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f20878g.get(i2).m12338q(parcel);
            }
            parcel.writeLong(this.f20880n);
            parcel.writeByte(this.f64995f7l8 ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f20884y);
            parcel.writeInt(this.f20883s);
            parcel.writeInt(this.f20881p);
            parcel.writeInt(this.f64996ld6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static toq m12341n(gvn7 gvn7Var) {
            ArrayList arrayList;
            boolean z2;
            long j2;
            boolean z3;
            long j3;
            int i2;
            int i3;
            int iJp0y;
            boolean z5;
            boolean z6;
            long jD3;
            long jD32 = gvn7Var.d3();
            boolean z7 = (gvn7Var.jp0y() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z7) {
                arrayList = arrayList2;
                z2 = false;
                j2 = C3548p.f65257toq;
                z3 = false;
                j3 = C3548p.f65257toq;
                i2 = 0;
                i3 = 0;
                iJp0y = 0;
                z5 = false;
            } else {
                int iJp0y2 = gvn7Var.jp0y();
                boolean z8 = (iJp0y2 & 128) != 0;
                boolean z9 = (iJp0y2 & 64) != 0;
                boolean z10 = (iJp0y2 & 32) != 0;
                long jD33 = z9 ? gvn7Var.d3() : C3548p.f65257toq;
                if (!z9) {
                    int iJp0y3 = gvn7Var.jp0y();
                    ArrayList arrayList3 = new ArrayList(iJp0y3);
                    for (int i4 = 0; i4 < iJp0y3; i4++) {
                        arrayList3.add(new C3514k(gvn7Var.jp0y(), gvn7Var.d3()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z10) {
                    long jJp0y = gvn7Var.jp0y();
                    boolean z11 = (128 & jJp0y) != 0;
                    jD3 = ((((jJp0y & 1) << 32) | gvn7Var.d3()) * 1000) / 90;
                    z6 = z11;
                } else {
                    z6 = false;
                    jD3 = C3548p.f65257toq;
                }
                int iLvui = gvn7Var.lvui();
                int iJp0y4 = gvn7Var.jp0y();
                z5 = z9;
                iJp0y = gvn7Var.jp0y();
                j3 = jD3;
                arrayList = arrayList2;
                long j4 = jD33;
                i2 = iLvui;
                i3 = iJp0y4;
                j2 = j4;
                boolean z12 = z8;
                z3 = z6;
                z2 = z12;
            }
            return new toq(jD32, z7, z2, z5, arrayList, j2, z3, j3, i2, i3, iJp0y);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public static toq m12342q(Parcel parcel) {
            return new toq(parcel);
        }

        private toq(Parcel parcel) {
            this.f20879k = parcel.readLong();
            this.f64997toq = parcel.readByte() == 1;
            this.f64998zy = parcel.readByte() == 1;
            this.f20882q = parcel.readByte() == 1;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(C3514k.zy(parcel));
            }
            this.f20878g = Collections.unmodifiableList(arrayList);
            this.f20880n = parcel.readLong();
            this.f64995f7l8 = parcel.readByte() == 1;
            this.f20884y = parcel.readLong();
            this.f20883s = parcel.readInt();
            this.f20881p = parcel.readInt();
            this.f64996ld6 = parcel.readInt();
        }
    }
}

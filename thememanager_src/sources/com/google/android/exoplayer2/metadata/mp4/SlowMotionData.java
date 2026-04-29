package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.common.base.C4280z;
import com.google.common.collect.oc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new Parcelable.Creator<SlowMotionData>() { // from class: com.google.android.exoplayer2.metadata.mp4.SlowMotionData.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public SlowMotionData[] newArray(int i2) {
            return new SlowMotionData[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    public final List<Segment> f20841k;

    public static final class Segment implements Parcelable {

        /* JADX INFO: renamed from: k */
        public final long f20843k;

        /* JADX INFO: renamed from: n */
        public final int f20844n;

        /* JADX INFO: renamed from: q */
        public final long f20845q;

        /* JADX INFO: renamed from: g */
        public static final Comparator<Segment> f20842g = new Comparator() { // from class: com.google.android.exoplayer2.metadata.mp4.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SlowMotionData.Segment.toq((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
            }
        };
        public static final Parcelable.Creator<Segment> CREATOR = new Parcelable.Creator<Segment>() { // from class: com.google.android.exoplayer2.metadata.mp4.SlowMotionData.Segment.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public Segment[] newArray(int i2) {
                return new Segment[i2];
            }
        };

        public Segment(long j2, long j3, int i2) {
            C3844k.m13629k(j2 < j3);
            this.f20843k = j2;
            this.f20845q = j3;
            this.f20844n = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int toq(Segment segment, Segment segment2) {
            return oc.n7h().f7l8(segment.f20843k, segment2.f20843k).f7l8(segment.f20845q, segment2.f20845q).mo15923g(segment.f20844n, segment2.f20844n).qrj();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.f20843k == segment.f20843k && this.f20845q == segment.f20845q && this.f20844n == segment.f20844n;
        }

        public int hashCode() {
            return C4280z.toq(Long.valueOf(this.f20843k), Long.valueOf(this.f20845q), Integer.valueOf(this.f20844n));
        }

        public String toString() {
            return lrht.gvn7("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f20843k), Long.valueOf(this.f20845q), Integer.valueOf(this.f20844n));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f20843k);
            parcel.writeLong(this.f20845q);
            parcel.writeInt(this.f20844n);
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.f20841k = list;
        C3844k.m13629k(!m12322k(list));
    }

    /* JADX INFO: renamed from: k */
    private static boolean m12322k(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j2 = list.get(0).f20845q;
        for (int i2 = 1; i2 < list.size(); i2++) {
            if (list.get(i2).f20843k < j2) {
                return true;
            }
            j2 = list.get(i2).f20845q;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f20841k.equals(((SlowMotionData) obj).f20841k);
    }

    public int hashCode() {
        return this.f20841k.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f20841k);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 21);
        sb.append("SlowMotion: segments=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.f20841k);
    }
}

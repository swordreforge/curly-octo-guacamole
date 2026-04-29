package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.lrht;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new Parcelable.Creator<ChapterFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.ChapterFrame.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public ChapterFrame[] newArray(int i2) {
            return new ChapterFrame[i2];
        }
    };

    /* JADX INFO: renamed from: h */
    public static final String f20782h = "CHAP";

    /* JADX INFO: renamed from: g */
    public final int f20783g;

    /* JADX INFO: renamed from: n */
    public final int f20784n;

    /* JADX INFO: renamed from: p */
    private final Id3Frame[] f20785p;

    /* JADX INFO: renamed from: q */
    public final String f20786q;

    /* JADX INFO: renamed from: s */
    public final long f20787s;

    /* JADX INFO: renamed from: y */
    public final long f20788y;

    public ChapterFrame(String str, int i2, int i3, long j2, long j3, Id3Frame[] id3FrameArr) {
        super(f20782h);
        this.f20786q = str;
        this.f20784n = i2;
        this.f20783g = i3;
        this.f20788y = j2;
        this.f20787s = j3;
        this.f20785p = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f20784n == chapterFrame.f20784n && this.f20783g == chapterFrame.f20783g && this.f20788y == chapterFrame.f20788y && this.f20787s == chapterFrame.f20787s && lrht.zy(this.f20786q, chapterFrame.f20786q) && Arrays.equals(this.f20785p, chapterFrame.f20785p);
    }

    public int hashCode() {
        int i2 = (((((((527 + this.f20784n) * 31) + this.f20783g) * 31) + ((int) this.f20788y)) * 31) + ((int) this.f20787s)) * 31;
        String str = this.f20786q;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k */
    public Id3Frame m12297k(int i2) {
        return this.f20785p[i2];
    }

    public int toq() {
        return this.f20785p.length;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20786q);
        parcel.writeInt(this.f20784n);
        parcel.writeInt(this.f20783g);
        parcel.writeLong(this.f20788y);
        parcel.writeLong(this.f20787s);
        parcel.writeInt(this.f20785p.length);
        for (Id3Frame id3Frame : this.f20785p) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    ChapterFrame(Parcel parcel) {
        super(f20782h);
        this.f20786q = (String) lrht.ld6(parcel.readString());
        this.f20784n = parcel.readInt();
        this.f20783g = parcel.readInt();
        this.f20788y = parcel.readLong();
        this.f20787s = parcel.readLong();
        int i2 = parcel.readInt();
        this.f20785p = new Id3Frame[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f20785p[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}

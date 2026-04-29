package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.lrht;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new Parcelable.Creator<ChapterTocFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.ChapterTocFrame.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame[] newArray(int i2) {
            return new ChapterTocFrame[i2];
        }
    };

    /* JADX INFO: renamed from: p */
    public static final String f20789p = "CTOC";

    /* JADX INFO: renamed from: g */
    public final boolean f20790g;

    /* JADX INFO: renamed from: n */
    public final boolean f20791n;

    /* JADX INFO: renamed from: q */
    public final String f20792q;

    /* JADX INFO: renamed from: s */
    private final Id3Frame[] f20793s;

    /* JADX INFO: renamed from: y */
    public final String[] f20794y;

    public ChapterTocFrame(String str, boolean z2, boolean z3, String[] strArr, Id3Frame[] id3FrameArr) {
        super(f20789p);
        this.f20792q = str;
        this.f20791n = z2;
        this.f20790g = z3;
        this.f20794y = strArr;
        this.f20793s = id3FrameArr;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f20791n == chapterTocFrame.f20791n && this.f20790g == chapterTocFrame.f20790g && lrht.zy(this.f20792q, chapterTocFrame.f20792q) && Arrays.equals(this.f20794y, chapterTocFrame.f20794y) && Arrays.equals(this.f20793s, chapterTocFrame.f20793s);
    }

    public int hashCode() {
        int i2 = (((527 + (this.f20791n ? 1 : 0)) * 31) + (this.f20790g ? 1 : 0)) * 31;
        String str = this.f20792q;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k */
    public Id3Frame m12299k(int i2) {
        return this.f20793s[i2];
    }

    public int toq() {
        return this.f20793s.length;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20792q);
        parcel.writeByte(this.f20791n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20790g ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f20794y);
        parcel.writeInt(this.f20793s.length);
        for (Id3Frame id3Frame : this.f20793s) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    ChapterTocFrame(Parcel parcel) {
        super(f20789p);
        this.f20792q = (String) lrht.ld6(parcel.readString());
        this.f20791n = parcel.readByte() != 0;
        this.f20790g = parcel.readByte() != 0;
        this.f20794y = (String[]) lrht.ld6(parcel.createStringArray());
        int i2 = parcel.readInt();
        this.f20793s = new Id3Frame[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f20793s[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}

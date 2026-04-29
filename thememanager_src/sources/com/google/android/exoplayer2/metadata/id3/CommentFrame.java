package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.lrht;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new Parcelable.Creator<CommentFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.CommentFrame.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public CommentFrame[] newArray(int i2) {
            return new CommentFrame[i2];
        }
    };

    /* JADX INFO: renamed from: y */
    public static final String f20795y = "COMM";

    /* JADX INFO: renamed from: g */
    public final String f20796g;

    /* JADX INFO: renamed from: n */
    public final String f20797n;

    /* JADX INFO: renamed from: q */
    public final String f20798q;

    public CommentFrame(String str, String str2, String str3) {
        super(f20795y);
        this.f20798q = str;
        this.f20797n = str2;
        this.f20796g = str3;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return lrht.zy(this.f20797n, commentFrame.f20797n) && lrht.zy(this.f20798q, commentFrame.f20798q) && lrht.zy(this.f20796g, commentFrame.f20796g);
    }

    public int hashCode() {
        String str = this.f20798q;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20797n;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20796g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f20804k;
        String str2 = this.f20798q;
        String str3 = this.f20797n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20804k);
        parcel.writeString(this.f20798q);
        parcel.writeString(this.f20796g);
    }

    CommentFrame(Parcel parcel) {
        super(f20795y);
        this.f20798q = (String) lrht.ld6(parcel.readString());
        this.f20797n = (String) lrht.ld6(parcel.readString());
        this.f20796g = (String) lrht.ld6(parcel.readString());
    }
}

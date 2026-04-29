package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.was;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new Parcelable.Creator<VorbisComment>() { // from class: com.google.android.exoplayer2.metadata.flac.VorbisComment.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public VorbisComment[] newArray(int i2) {
            return new VorbisComment[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    public final String f20760k;

    /* JADX INFO: renamed from: q */
    public final String f20761q;

    public VorbisComment(String str, String str2) {
        this.f20760k = str;
        this.f20761q = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VorbisComment.class != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f20760k.equals(vorbisComment.f20760k) && this.f20761q.equals(vorbisComment.f20761q);
    }

    public int hashCode() {
        return ((527 + this.f20760k.hashCode()) * 31) + this.f20761q.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void qrj(was.toq toqVar) {
        String str = this.f20760k;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                toqVar.lvui(this.f20761q);
                break;
            case "TITLE":
                toqVar.a98o(this.f20761q);
                break;
            case "DESCRIPTION":
                toqVar.m13898f(this.f20761q);
                break;
            case "ALBUMARTIST":
                toqVar.d2ok(this.f20761q);
                break;
            case "ARTIST":
                toqVar.m13903r(this.f20761q);
                break;
        }
    }

    public String toString() {
        String str = this.f20760k;
        String str2 = this.f20761q;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20760k);
        parcel.writeString(this.f20761q);
    }

    VorbisComment(Parcel parcel) {
        this.f20760k = (String) lrht.ld6(parcel.readString());
        this.f20761q = (String) lrht.ld6(parcel.readString());
    }
}

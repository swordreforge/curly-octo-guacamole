package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.C4743p;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new Parcelable.Creator<MotionPhotoMetadata>() { // from class: com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata[] newArray(int i2) {
            return new MotionPhotoMetadata[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    public final long f20836g;

    /* JADX INFO: renamed from: k */
    public final long f20837k;

    /* JADX INFO: renamed from: n */
    public final long f20838n;

    /* JADX INFO: renamed from: q */
    public final long f20839q;

    /* JADX INFO: renamed from: y */
    public final long f20840y;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f20837k == motionPhotoMetadata.f20837k && this.f20839q == motionPhotoMetadata.f20839q && this.f20838n == motionPhotoMetadata.f20838n && this.f20836g == motionPhotoMetadata.f20836g && this.f20840y == motionPhotoMetadata.f20840y;
    }

    public int hashCode() {
        return ((((((((527 + C4743p.ld6(this.f20837k)) * 31) + C4743p.ld6(this.f20839q)) * 31) + C4743p.ld6(this.f20838n)) * 31) + C4743p.ld6(this.f20836g)) * 31) + C4743p.ld6(this.f20840y);
    }

    public String toString() {
        long j2 = this.f20837k;
        long j3 = this.f20839q;
        long j4 = this.f20838n;
        long j5 = this.f20836g;
        long j6 = this.f20840y;
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j2);
        sb.append(", photoSize=");
        sb.append(j3);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j4);
        sb.append(", videoStartPosition=");
        sb.append(j5);
        sb.append(", videoSize=");
        sb.append(j6);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f20837k);
        parcel.writeLong(this.f20839q);
        parcel.writeLong(this.f20838n);
        parcel.writeLong(this.f20836g);
        parcel.writeLong(this.f20840y);
    }

    public MotionPhotoMetadata(long j2, long j3, long j4, long j5, long j6) {
        this.f20837k = j2;
        this.f20839q = j3;
        this.f20838n = j4;
        this.f20836g = j5;
        this.f20840y = j6;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.f20837k = parcel.readLong();
        this.f20839q = parcel.readLong();
        this.f20838n = parcel.readLong();
        this.f20836g = parcel.readLong();
        this.f20840y = parcel.readLong();
    }
}

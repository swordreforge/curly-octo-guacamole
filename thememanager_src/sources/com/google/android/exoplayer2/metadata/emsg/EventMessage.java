package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import java.util.Arrays;
import zy.dd;
import zy.yz;

/* JADX INFO: loaded from: classes2.dex */
public final class EventMessage implements Metadata.Entry {
    private static final String ID3_SCHEME_ID_APPLE = "https://developer.apple.com/streaming/emsg-id3";

    /* JADX INFO: renamed from: h */
    @yz
    public static final String f20743h = "urn:scte:scte35:2014:bin";

    /* JADX INFO: renamed from: p */
    @yz
    public static final String f20744p = "https://aomedia.org/emsg/ID3";

    /* JADX INFO: renamed from: g */
    public final long f20745g;

    /* JADX INFO: renamed from: k */
    public final String f20746k;

    /* JADX INFO: renamed from: n */
    public final long f20747n;

    /* JADX INFO: renamed from: q */
    public final String f20748q;

    /* JADX INFO: renamed from: s */
    private int f20749s;

    /* JADX INFO: renamed from: y */
    public final byte[] f20750y;
    private static final xwq3 ID3_FORMAT = new xwq3.toq().m13945m(wvg.f67093ch).a9();
    private static final xwq3 SCTE35_FORMAT = new xwq3.toq().m13945m(wvg.f23316v).a9();
    public static final Parcelable.Creator<EventMessage> CREATOR = new Parcelable.Creator<EventMessage>() { // from class: com.google.android.exoplayer2.metadata.emsg.EventMessage.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public EventMessage[] newArray(int i2) {
            return new EventMessage[i2];
        }
    };

    public EventMessage(String str, String str2, long j2, long j3, byte[] bArr) {
        this.f20746k = str;
        this.f20748q = str2;
        this.f20747n = j2;
        this.f20745g = j3;
        this.f20750y = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f20747n == eventMessage.f20747n && this.f20745g == eventMessage.f20745g && lrht.zy(this.f20746k, eventMessage.f20746k) && lrht.zy(this.f20748q, eventMessage.f20748q) && Arrays.equals(this.f20750y, eventMessage.f20750y);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @dd
    public xwq3 getWrappedMetadataFormat() {
        String str = this.f20746k;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return SCTE35_FORMAT;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return ID3_FORMAT;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f20749s == 0) {
            String str = this.f20746k;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f20748q;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j2 = this.f20747n;
            int i2 = (((iHashCode + iHashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f20745g;
            this.f20749s = ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.f20750y);
        }
        return this.f20749s;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @dd
    /* JADX INFO: renamed from: i */
    public byte[] mo12285i() {
        if (getWrappedMetadataFormat() != null) {
            return this.f20750y;
        }
        return null;
    }

    public String toString() {
        String str = this.f20746k;
        long j2 = this.f20745g;
        long j3 = this.f20747n;
        String str2 = this.f20748q;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j2);
        sb.append(", durationMs=");
        sb.append(j3);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20746k);
        parcel.writeString(this.f20748q);
        parcel.writeLong(this.f20747n);
        parcel.writeLong(this.f20745g);
        parcel.writeByteArray(this.f20750y);
    }

    EventMessage(Parcel parcel) {
        this.f20746k = (String) lrht.ld6(parcel.readString());
        this.f20748q = (String) lrht.ld6(parcel.readString());
        this.f20747n = parcel.readLong();
        this.f20745g = parcel.readLong();
        this.f20750y = (byte[]) lrht.ld6(parcel.createByteArray());
    }
}

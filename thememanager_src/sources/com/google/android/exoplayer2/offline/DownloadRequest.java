package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.common.collect.se;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new Parcelable.Creator<DownloadRequest>() { // from class: com.google.android.exoplayer2.offline.DownloadRequest.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public DownloadRequest[] newArray(int i2) {
            return new DownloadRequest[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    public final List<StreamKey> f20918g;

    /* JADX INFO: renamed from: k */
    public final String f20919k;

    /* JADX INFO: renamed from: n */
    @dd
    public final String f20920n;

    /* JADX INFO: renamed from: p */
    public final byte[] f20921p;

    /* JADX INFO: renamed from: q */
    public final Uri f20922q;

    /* JADX INFO: renamed from: s */
    @dd
    public final String f20923s;

    /* JADX INFO: renamed from: y */
    @dd
    public final byte[] f20924y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.DownloadRequest$k */
    public static class C3522k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @dd
        private byte[] f65015f7l8;

        /* JADX INFO: renamed from: g */
        @dd
        private String f20925g;

        /* JADX INFO: renamed from: k */
        private final String f20926k;

        /* JADX INFO: renamed from: n */
        @dd
        private byte[] f20927n;

        /* JADX INFO: renamed from: q */
        @dd
        private List<StreamKey> f20928q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Uri f65016toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @dd
        private String f65017zy;

        public C3522k(String str, Uri uri) {
            this.f20926k = str;
            this.f65016toq = uri;
        }

        /* JADX INFO: renamed from: g */
        public C3522k m12361g(@dd List<StreamKey> list) {
            this.f20928q = list;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public DownloadRequest m12362k() {
            String str = this.f20926k;
            Uri uri = this.f65016toq;
            String str2 = this.f65017zy;
            List listOf = this.f20928q;
            if (listOf == null) {
                listOf = se.of();
            }
            return new DownloadRequest(str, uri, str2, listOf, this.f20927n, this.f20925g, this.f65015f7l8);
        }

        /* JADX INFO: renamed from: n */
        public C3522k m12363n(@dd String str) {
            this.f65017zy = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C3522k m12364q(@dd byte[] bArr) {
            this.f20927n = bArr;
            return this;
        }

        public C3522k toq(@dd String str) {
            this.f20925g = str;
            return this;
        }

        public C3522k zy(@dd byte[] bArr) {
            this.f65015f7l8 = bArr;
            return this;
        }
    }

    public static class toq extends IOException {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f20919k.equals(downloadRequest.f20919k) && this.f20922q.equals(downloadRequest.f20922q) && lrht.zy(this.f20920n, downloadRequest.f20920n) && this.f20918g.equals(downloadRequest.f20918g) && Arrays.equals(this.f20924y, downloadRequest.f20924y) && lrht.zy(this.f20923s, downloadRequest.f20923s) && Arrays.equals(this.f20921p, downloadRequest.f20921p);
    }

    public final int hashCode() {
        int iHashCode = ((this.f20919k.hashCode() * 31 * 31) + this.f20922q.hashCode()) * 31;
        String str = this.f20920n;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f20918g.hashCode()) * 31) + Arrays.hashCode(this.f20924y)) * 31;
        String str2 = this.f20923s;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f20921p);
    }

    /* JADX INFO: renamed from: k */
    public DownloadRequest m12359k(String str) {
        return new DownloadRequest(str, this.f20922q, this.f20920n, this.f20918g, this.f20924y, this.f20923s, this.f20921p);
    }

    public tfm toMediaItem() {
        return new tfm.zy().jk(this.f20919k).eqxt(this.f20922q).x2(this.f20923s).fti(this.f20920n).jp0y(this.f20918g).m13065k();
    }

    public String toString() {
        String str = this.f20920n;
        String str2 = this.f20919k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public DownloadRequest toq(@dd byte[] bArr) {
        return new DownloadRequest(this.f20919k, this.f20922q, this.f20920n, this.f20918g, bArr, this.f20923s, this.f20921p);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f20919k);
        parcel.writeString(this.f20922q.toString());
        parcel.writeString(this.f20920n);
        parcel.writeInt(this.f20918g.size());
        for (int i3 = 0; i3 < this.f20918g.size(); i3++) {
            parcel.writeParcelable(this.f20918g.get(i3), 0);
        }
        parcel.writeByteArray(this.f20924y);
        parcel.writeString(this.f20923s);
        parcel.writeByteArray(this.f20921p);
    }

    public DownloadRequest zy(DownloadRequest downloadRequest) {
        List listEmptyList;
        C3844k.m13629k(this.f20919k.equals(downloadRequest.f20919k));
        if (this.f20918g.isEmpty() || downloadRequest.f20918g.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = new ArrayList(this.f20918g);
            for (int i2 = 0; i2 < downloadRequest.f20918g.size(); i2++) {
                StreamKey streamKey = downloadRequest.f20918g.get(i2);
                if (!listEmptyList.contains(streamKey)) {
                    listEmptyList.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.f20919k, downloadRequest.f20922q, downloadRequest.f20920n, listEmptyList, downloadRequest.f20924y, downloadRequest.f20923s, downloadRequest.f20921p);
    }

    private DownloadRequest(String str, Uri uri, @dd String str2, List<StreamKey> list, @dd byte[] bArr, @dd String str3, @dd byte[] bArr2) {
        int iMu = lrht.mu(uri, str2);
        if (iMu == 0 || iMu == 2 || iMu == 1) {
            boolean z2 = str3 == null;
            StringBuilder sb = new StringBuilder(49);
            sb.append("customCacheKey must be null for type: ");
            sb.append(iMu);
            C3844k.toq(z2, sb.toString());
        }
        this.f20919k = str;
        this.f20922q = uri;
        this.f20920n = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f20918g = Collections.unmodifiableList(arrayList);
        this.f20924y = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f20923s = str3;
        this.f20921p = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : lrht.f23228g;
    }

    DownloadRequest(Parcel parcel) {
        this.f20919k = (String) lrht.ld6(parcel.readString());
        this.f20922q = Uri.parse((String) lrht.ld6(parcel.readString()));
        this.f20920n = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f20918g = Collections.unmodifiableList(arrayList);
        this.f20924y = parcel.createByteArray();
        this.f20923s = parcel.readString();
        this.f20921p = (byte[]) lrht.ld6(parcel.createByteArray());
    }
}

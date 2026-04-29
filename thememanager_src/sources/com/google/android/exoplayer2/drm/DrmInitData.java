package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new Parcelable.Creator<DrmInitData>() { // from class: com.google.android.exoplayer2.drm.DrmInitData.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i2) {
            return new DrmInitData[i2];
        }
    };

    /* JADX INFO: renamed from: g */
    public final int f19621g;

    /* JADX INFO: renamed from: k */
    private final SchemeData[] f19622k;

    /* JADX INFO: renamed from: n */
    @zy.dd
    public final String f19623n;

    /* JADX INFO: renamed from: q */
    private int f19624q;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new Parcelable.Creator<SchemeData>() { // from class: com.google.android.exoplayer2.drm.DrmInitData.SchemeData.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i2) {
                return new SchemeData[i2];
            }
        };

        /* JADX INFO: renamed from: g */
        public final String f19625g;

        /* JADX INFO: renamed from: k */
        private int f19626k;

        /* JADX INFO: renamed from: n */
        @zy.dd
        public final String f19627n;

        /* JADX INFO: renamed from: q */
        public final UUID f19628q;

        /* JADX INFO: renamed from: y */
        @zy.dd
        public final byte[] f19629y;

        public SchemeData(UUID uuid, String str, @zy.dd byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@zy.dd Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return lrht.zy(this.f19627n, schemeData.f19627n) && lrht.zy(this.f19625g, schemeData.f19625g) && lrht.zy(this.f19628q, schemeData.f19628q) && Arrays.equals(this.f19629y, schemeData.f19629y);
        }

        /* JADX INFO: renamed from: g */
        public boolean m11584g(UUID uuid) {
            return C3548p.f65130b9ub.equals(this.f19628q) || uuid.equals(this.f19628q);
        }

        public int hashCode() {
            if (this.f19626k == 0) {
                int iHashCode = this.f19628q.hashCode() * 31;
                String str = this.f19627n;
                this.f19626k = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f19625g.hashCode()) * 31) + Arrays.hashCode(this.f19629y);
            }
            return this.f19626k;
        }

        /* JADX INFO: renamed from: k */
        public boolean m11585k(SchemeData schemeData) {
            return zy() && !schemeData.zy() && m11584g(schemeData.f19628q);
        }

        public SchemeData toq(@zy.dd byte[] bArr) {
            return new SchemeData(this.f19628q, this.f19627n, this.f19625g, bArr);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f19628q.getMostSignificantBits());
            parcel.writeLong(this.f19628q.getLeastSignificantBits());
            parcel.writeString(this.f19627n);
            parcel.writeString(this.f19625g);
            parcel.writeByteArray(this.f19629y);
        }

        public boolean zy() {
            return this.f19629y != null;
        }

        public SchemeData(UUID uuid, @zy.dd String str, String str2, @zy.dd byte[] bArr) {
            this.f19628q = (UUID) C3844k.f7l8(uuid);
            this.f19627n = str;
            this.f19625g = (String) C3844k.f7l8(str2);
            this.f19629y = bArr;
        }

        SchemeData(Parcel parcel) {
            this.f19628q = new UUID(parcel.readLong(), parcel.readLong());
            this.f19627n = parcel.readString();
            this.f19625g = (String) lrht.ld6(parcel.readString());
            this.f19629y = parcel.createByteArray();
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    @zy.dd
    /* JADX INFO: renamed from: g */
    public static DrmInitData m11580g(@zy.dd DrmInitData drmInitData, @zy.dd DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f19623n;
            for (SchemeData schemeData : drmInitData.f19622k) {
                if (schemeData.zy()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f19623n;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f19622k) {
                if (schemeData2.zy() && !toq(arrayList, size, schemeData2.f19628q)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    private static boolean toq(ArrayList<SchemeData> arrayList, int i2, UUID uuid) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (arrayList.get(i3).f19628q.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return lrht.zy(this.f19623n, drmInitData.f19623n) && Arrays.equals(this.f19622k, drmInitData.f19622k);
    }

    public SchemeData f7l8(int i2) {
        return this.f19622k[i2];
    }

    public int hashCode() {
        if (this.f19624q == 0) {
            String str = this.f19623n;
            this.f19624q = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f19622k);
        }
        return this.f19624q;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = C3548p.f65130b9ub;
        return uuid.equals(schemeData.f19628q) ? uuid.equals(schemeData2.f19628q) ? 0 : 1 : schemeData.f19628q.compareTo(schemeData2.f19628q);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f19623n);
        parcel.writeTypedArray(this.f19622k, 0);
    }

    /* JADX INFO: renamed from: y */
    public DrmInitData m11582y(DrmInitData drmInitData) {
        String str;
        String str2 = this.f19623n;
        C3844k.m13633s(str2 == null || (str = drmInitData.f19623n) == null || TextUtils.equals(str2, str));
        String str3 = this.f19623n;
        if (str3 == null) {
            str3 = drmInitData.f19623n;
        }
        return new DrmInitData(str3, (SchemeData[]) lrht.w831(this.f19622k, drmInitData.f19622k));
    }

    public DrmInitData zy(@zy.dd String str) {
        return lrht.zy(this.f19623n, str) ? this : new DrmInitData(str, false, this.f19622k);
    }

    public DrmInitData(@zy.dd String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(@zy.dd String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(@zy.dd String str, boolean z2, SchemeData... schemeDataArr) {
        this.f19623n = str;
        schemeDataArr = z2 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f19622k = schemeDataArr;
        this.f19621g = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    DrmInitData(Parcel parcel) {
        this.f19623n = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) lrht.ld6((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f19622k = schemeDataArr;
        this.f19621g = schemeDataArr.length;
    }
}

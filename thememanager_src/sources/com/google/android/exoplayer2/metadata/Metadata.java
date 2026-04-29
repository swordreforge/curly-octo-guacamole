package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.was;
import com.google.android.exoplayer2.xwq3;
import java.util.Arrays;
import java.util.List;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new Parcelable.Creator<Metadata>() { // from class: com.google.android.exoplayer2.metadata.Metadata.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Metadata[] newArray(int i2) {
            return new Metadata[i2];
        }
    };

    /* JADX INFO: renamed from: k */
    private final Entry[] f20736k;

    public interface Entry extends Parcelable {
        @dd
        default xwq3 getWrappedMetadataFormat() {
            return null;
        }

        @dd
        /* JADX INFO: renamed from: i */
        default byte[] mo12285i() {
            return null;
        }

        default void qrj(was.toq toqVar) {
        }
    }

    public Metadata(Entry... entryArr) {
        this.f20736k = entryArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f20736k, ((Metadata) obj).f20736k);
    }

    /* JADX INFO: renamed from: g */
    public int m12282g() {
        return this.f20736k.length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f20736k);
    }

    /* JADX INFO: renamed from: k */
    public Metadata m12283k(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata((Entry[]) lrht.w831(this.f20736k, entryArr));
    }

    public String toString() {
        String strValueOf = String.valueOf(Arrays.toString(this.f20736k));
        return strValueOf.length() != 0 ? "entries=".concat(strValueOf) : new String("entries=");
    }

    public Metadata toq(@dd Metadata metadata) {
        return metadata == null ? this : m12283k(metadata.f20736k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f20736k.length);
        for (Entry entry : this.f20736k) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public Entry zy(int i2) {
        return this.f20736k[i2];
    }

    public Metadata(List<? extends Entry> list) {
        this.f20736k = (Entry[]) list.toArray(new Entry[0]);
    }

    Metadata(Parcel parcel) {
        this.f20736k = new Entry[parcel.readInt()];
        int i2 = 0;
        while (true) {
            Entry[] entryArr = this.f20736k;
            if (i2 >= entryArr.length) {
                return;
            }
            entryArr[i2] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i2++;
        }
    }
}

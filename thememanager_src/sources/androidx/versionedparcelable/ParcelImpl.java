package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@uv6({uv6.EnumC7844k.LIBRARY})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Parcelable.Creator<ParcelImpl>() { // from class: androidx.versionedparcelable.ParcelImpl.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i2) {
            return new ParcelImpl[i2];
        }
    };
    private final InterfaceC1269y mParcel;

    public ParcelImpl(InterfaceC1269y interfaceC1269y) {
        this.mParcel = interfaceC1269y;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public <T extends InterfaceC1269y> T getVersionedParcel() {
        return (T) this.mParcel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        new C1264g(parcel).bek6(this.mParcel);
    }

    protected ParcelImpl(Parcel parcel) {
        this.mParcel = new C1264g(parcel).yz();
    }
}

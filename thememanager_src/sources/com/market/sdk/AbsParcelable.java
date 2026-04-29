package com.market.sdk;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbsParcelable implements Parcelable {

    /* JADX INFO: renamed from: k */
    protected int f27888k;

    protected AbsParcelable() {
        this.f27888k = 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f27888k);
    }

    protected AbsParcelable(Parcel parcel) {
        this.f27888k = 1;
        this.f27888k = parcel.readInt();
    }
}

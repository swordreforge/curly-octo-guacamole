package com.market.sdk.utils;

import android.os.Parcel;

/* JADX INFO: compiled from: ParcelUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class ld6 {
    /* JADX INFO: renamed from: k */
    public static boolean m17447k(Parcel parcel, int i2) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == i2) {
            return true;
        }
        parcel.setDataPosition(iDataPosition);
        return false;
    }

    public static void toq(Parcel parcel, int i2) {
        parcel.writeInt(i2);
    }
}
